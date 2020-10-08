package mono.com.inscripts.interfaces;


public class KeyboardVisibilityEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.inscripts.interfaces.KeyboardVisibilityEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVisibilityChanged:(Z)V:GetOnVisibilityChanged_ZHandler:Com.Inscripts.Interfaces.IKeyboardVisibilityEventListenerInvoker, cometchatbindingapp\n" +
			"";
		mono.android.Runtime.register ("Com.Inscripts.Interfaces.IKeyboardVisibilityEventListenerImplementor, cometchatbindingapp", KeyboardVisibilityEventListenerImplementor.class, __md_methods);
	}


	public KeyboardVisibilityEventListenerImplementor ()
	{
		super ();
		if (getClass () == KeyboardVisibilityEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Inscripts.Interfaces.IKeyboardVisibilityEventListenerImplementor, cometchatbindingapp", "", this, new java.lang.Object[] {  });
	}


	public void onVisibilityChanged (boolean p0)
	{
		n_onVisibilityChanged (p0);
	}

	private native void n_onVisibilityChanged (boolean p0);

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
