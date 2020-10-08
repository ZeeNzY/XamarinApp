package mono.com.inscripts.custom;


public class CCWebView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.inscripts.custom.CCWebView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDownloadRequested:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V:GetOnDownloadRequested_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_JLjava_lang_String_Ljava_lang_String_Handler:Com.Inscripts.Custom.CCWebView/IListenerInvoker, cometchatbindingapp\n" +
			"n_onExternalPageRequest:(Ljava/lang/String;)V:GetOnExternalPageRequest_Ljava_lang_String_Handler:Com.Inscripts.Custom.CCWebView/IListenerInvoker, cometchatbindingapp\n" +
			"n_onPageError:(ILjava/lang/String;Ljava/lang/String;)V:GetOnPageError_ILjava_lang_String_Ljava_lang_String_Handler:Com.Inscripts.Custom.CCWebView/IListenerInvoker, cometchatbindingapp\n" +
			"n_onPageFinished:(Ljava/lang/String;)V:GetOnPageFinished_Ljava_lang_String_Handler:Com.Inscripts.Custom.CCWebView/IListenerInvoker, cometchatbindingapp\n" +
			"n_onPageStarted:(Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Ljava_lang_String_Landroid_graphics_Bitmap_Handler:Com.Inscripts.Custom.CCWebView/IListenerInvoker, cometchatbindingapp\n" +
			"";
		mono.android.Runtime.register ("Com.Inscripts.Custom.CCWebView+IListenerImplementor, cometchatbindingapp", CCWebView_ListenerImplementor.class, __md_methods);
	}


	public CCWebView_ListenerImplementor ()
	{
		super ();
		if (getClass () == CCWebView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Inscripts.Custom.CCWebView+IListenerImplementor, cometchatbindingapp", "", this, new java.lang.Object[] {  });
	}


	public void onDownloadRequested (java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, java.lang.String p4, java.lang.String p5)
	{
		n_onDownloadRequested (p0, p1, p2, p3, p4, p5);
	}

	private native void n_onDownloadRequested (java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, java.lang.String p4, java.lang.String p5);


	public void onExternalPageRequest (java.lang.String p0)
	{
		n_onExternalPageRequest (p0);
	}

	private native void n_onExternalPageRequest (java.lang.String p0);


	public void onPageError (int p0, java.lang.String p1, java.lang.String p2)
	{
		n_onPageError (p0, p1, p2);
	}

	private native void n_onPageError (int p0, java.lang.String p1, java.lang.String p2);


	public void onPageFinished (java.lang.String p0)
	{
		n_onPageFinished (p0);
	}

	private native void n_onPageFinished (java.lang.String p0);


	public void onPageStarted (java.lang.String p0, android.graphics.Bitmap p1)
	{
		n_onPageStarted (p0, p1);
	}

	private native void n_onPageStarted (java.lang.String p0, android.graphics.Bitmap p1);

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
