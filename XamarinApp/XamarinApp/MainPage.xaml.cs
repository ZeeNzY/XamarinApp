using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace XamarinApp
{
  
    public partial class MainPage : ContentPage
    {
        private int count = 0;
        public MainPage()
        {
            InitializeComponent();
        }
        private void IncrementCounterClicked(object sender, EventArgs e)
        {
            count++;
            CounterLabel.Text = count.ToString();
        }
        private void DecrementCounter(object sender, EventArgs e)
        {
            count--;
            CounterLabel.Text = count.ToString();
        }

        private async void Proceed_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new Login());
        }
    }
}
