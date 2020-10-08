package mono.com.inscripts.interfaces;


public class ClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.inscripts.interfaces.ClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;I)V:GetOnClick_Landroid_view_View_IHandler:Com.Inscripts.Interfaces.IClickListenerInvoker, cometchatbindingapp\n" +
			"n_onLongClick:(Landroid/view/View;I)V:GetOnLongClick_Landroid_view_View_IHandler:Com.Inscripts.Interfaces.IClickListenerInvoker, cometchatbindingapp\n" +
			"";
		mono.android.Runtime.register ("Com.Inscripts.Interfaces.IClickListenerImplementor, cometchatbindingapp", ClickListenerImplementor.class, __md_methods);
	}


	public ClickListenerImplementor ()
	{
		super ();
		if (getClass () == ClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Inscripts.Interfaces.IClickListenerImplementor, cometchatbindingapp", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.view.View p0, int p1);


	public void onLongClick (android.view.View p0, int p1)
	{
		n_onLongClick (p0, p1);
	}

	private native void n_onLongClick (android.view.View p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
