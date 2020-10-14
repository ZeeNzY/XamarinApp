using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace XamarinApp
{
    public partial class App : Application
    {

        public static String FilePath;
        public App()
        {
            InitializeComponent();

           // MainPage = new MainPage();
            MainPage = new NavigationPage(new MainPage());
        }
        public App(string filePath)
        {
            InitializeComponent();

            // MainPage = new MainPage();
            MainPage = new NavigationPage(new MainPage());
            FilePath = filePath;
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
