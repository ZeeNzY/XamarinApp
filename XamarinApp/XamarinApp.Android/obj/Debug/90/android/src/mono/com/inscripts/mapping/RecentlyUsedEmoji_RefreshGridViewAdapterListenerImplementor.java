package mono.com.inscripts.mapping;


public class RecentlyUsedEmoji_RefreshGridViewAdapterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.inscripts.mapping.RecentlyUsedEmoji.RefreshGridViewAdapterListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNewEmojiUsed:()V:GetOnNewEmojiUsedHandler:Com.Inscripts.Mapping.RecentlyUsedEmoji/IRefreshGridViewAdapterListenerInvoker, cometchatbindingapp\n" +
			"";
		mono.android.Runtime.register ("Com.Inscripts.Mapping.RecentlyUsedEmoji+IRefreshGridViewAdapterListenerImplementor, cometchatbindingapp", RecentlyUsedEmoji_RefreshGridViewAdapterListenerImplementor.class, __md_methods);
	}


	public RecentlyUsedEmoji_RefreshGridViewAdapterListenerImplementor ()
	{
		super ();
		if (getClass () == RecentlyUsedEmoji_RefreshGridViewAdapterListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Inscripts.Mapping.RecentlyUsedEmoji+IRefreshGridViewAdapterListenerImplementor, cometchatbindingapp", "", this, new java.lang.Object[] {  });
	}


	public void onNewEmojiUsed ()
	{
		n_onNewEmojiUsed ();
	}

	private native void n_onNewEmojiUsed ();

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
