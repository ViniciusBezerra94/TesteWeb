var temp = true;

function limpar()
{
  temp = false;
  document.getElementById("form1:codMerc").value = "";
  document.getElementById("form1:tipoMerc").value = "";
  document.getElementById("form1:nomeMerc").value = "";
  document.getElementById("form1:quantidade").value = 0;
  document.getElementById("form1:preco").value = "";

}
function criticar()
{
  if(temp){
    if (document.getElementById('form1:codMerc').value == "" ) {
      alert('Por Favor preencha o campo código mercadoria');
      document.getElementById('form1:codMerc').focus();
      return false;
    }
    if (document.getElementById('form1:tipoMerc').value == "") {
      alert('Por Favor preencha o campo tipo mercadoria');
      document.getElementById('form1:tipoMerc').focus();
      return false;
    }
    if (document.getElementById('form1:nomeMerc').value == "") {
      alert('Por Favor preencha o campo nome da mercadoria');
      document.getElementById('form1:nomeMerc').focus();
      return false;
    }
    if (document.getElementById('form1:quantidade').value <= 0) {
      alert('Por Favor insira um valor maior que zero');
      document.getElementById('form1:quantidade').focus();
      return false;
    }
    if (document.getElementById('form1:preco').value <= 0) {
      alert('Por Favor insira um valor maior que zero');
      document.getElementById('form1:preco').focus();
      return false;
    }
    return true;
  }
}
