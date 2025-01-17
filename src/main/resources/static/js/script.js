document.addEventListener("DOMContentLoaded", function() {
    var menuItems = document.querySelectorAll('.nav-list > li > a');
    menuItems.forEach(function(item) {
        item.addEventListener('click', function(event) {
            var submenu = this.parentNode.querySelector('.submenu');
            if (submenu) {
                event.preventDefault(); 
                var isOpen = submenu.classList.contains('active');
                closeAllSubmenus(); 
                if (!isOpen) {
                    submenu.classList.add('active'); 
                }
            }
        });
    });

    
    document.addEventListener('click', function(event) {
        if (!event.target.closest('.nav-list')) {
            closeAllSubmenus();
        }
    });

   
    function closeAllSubmenus() {
        var submenus = document.querySelectorAll('.submenu');
        submenus.forEach(function(submenu) {
            submenu.classList.remove('active'); 
        });
    }
});

// async function buscarAmostras(event) {
//     event.preventDefault(); 
//     const formData = new FormData(event.target);
//     const params = new URLSearchParams(formData);

//     console.log(`Params enviados: ${params.toString()}`);
    
//     const response = await fetch(`/amostras/buscar?${params}`, {
//         method: 'GET',
//         headers: { 'Accept': 'application/json' }
//     });
    
//     if (response.ok) {
//         const data = await response.json();
//         console.log(data); 
//         exibirResultados(data);
//     } else {
//         console.error("Erro ao buscar amostras:", response.statusText);
//     }
// }
// function exibirResultados(amostras) {
//     const tabela = document.getElementById('tabela-resultados');
//     tabela.innerHTML = ''; 

//     amostras.forEach(amostra => {
//         const row = tabela.insertRow();
//         row.innerHTML = `
//             <td>${amostra.codigoBq || ''}</td>
//             <td>${amostra.cliente || ''}</td>
//             <td>${amostra.sample || ''}</td>
//             <td>${amostra.dataEntrada || ''}</td>
//         `;
//     });
// }