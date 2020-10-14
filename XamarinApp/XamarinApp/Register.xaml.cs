using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace XamarinApp
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Register : ContentPage
    {
        public Register()
        {
            InitializeComponent();
        }

        void Submit_Clicked(object sender, EventArgs e)
        {
            RegisterClass reg = new RegisterClass()
            {
                Name = RegName.Text,
                Username = RegUsername.Text,
                Password = RegPassword.Text
            };

            using (SQLite.SQLiteConnection conn = new SQLite.SQLiteConnection(App.FilePath))
            {
                conn.CreateTable<RegisterClass>();
                int rowsAdded = conn.Insert(reg);
            }

            //await Navigation.PushAsync(new Login());

        }
    }
}