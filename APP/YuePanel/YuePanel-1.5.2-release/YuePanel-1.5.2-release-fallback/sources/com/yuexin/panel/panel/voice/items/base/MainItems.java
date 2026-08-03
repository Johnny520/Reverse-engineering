package com.yuexin.panel.panel.voice.items.base;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC3482
public abstract class MainItems {
    static {
            r0 = 909(0x38d, float:1.274E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public MainItems() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract android.view.View buildView(android.content.Context r1, int r2, java.lang.String r3);

    public abstract java.util.HashMap<java.lang.String, java.util.List> getInitMap();

    public native void onActivityResult(android.content.Intent r1, java.util.List<android.net.Uri> r2, boolean r3);

    public abstract void onBuild(android.view.View r1, android.content.Context r2, android.widget.LinearLayout r3);

    public native void onLast(android.content.Context r1, android.widget.LinearLayout r2, java.lang.String r3);

    public native void onMore(android.content.Context r1, android.widget.LinearLayout r2, java.lang.String r3);

    public native void onNext(android.content.Context r1, android.widget.LinearLayout r2, java.lang.String r3);

    public abstract void onNextItem(android.content.Context r1, android.widget.LinearLayout r2);

    public native void onSearch(java.lang.String r1, android.content.Context r2, android.widget.LinearLayout r3);
}
