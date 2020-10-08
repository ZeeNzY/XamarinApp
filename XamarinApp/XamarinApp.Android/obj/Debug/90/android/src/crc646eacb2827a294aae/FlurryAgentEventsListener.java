package crc646eacb2827a294aae;


public class FlurryAgentEventsListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.flurry.android.FlurryAgentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSessionStarted:()V:GetOnSessionStartedHandler:Flurry.Analytics.IFlurryAgentListenerInvoker, Flurry.Analytics.Android\n" +
			"";
		mono.android.Runtime.register ("Flurry.Analytics.FlurryAgentEventsListener, Flurry.Analytics.Android", FlurryAgentEventsListener.class, __md_methods);
	}


	public FlurryAgentEventsListener ()
	{
		super ();
		if (getClass () == FlurryAgentEventsListener.class)
			mono.android.TypeManager.Activate ("Flurry.Analytics.FlurryAgentEventsListener, Flurry.Analytics.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSessionStarted ()
	{
		n_onSessionStarted ();
	}

	private native void n_onSessionStarted ();

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
