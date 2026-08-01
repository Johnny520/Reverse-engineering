package defpackage;

/* JADX INFO: renamed from: ᲈᲈᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2367 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f10245;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f10246;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f10247;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2367(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f10247 = r2
            r0.f10245 = r1
            r0.f10246 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m3876(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m3877(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r6) {
            r5 = this;
            int r0 = r5.f10247
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            r6.removeOnAttachStateChangeListener(r5)
            java.lang.Object r0 = r5.f10245
            ᛱᛶᛴ r0 = (defpackage.C0112) r0
            int r1 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            r1 = 0
            r2 = -1
            android.app.Application r3 = defpackage.C0855.m1804()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r3 != 0) goto L17
            goto L2a
        L17:
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            int r2 = r3.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            goto L2a
        L26:
            r3 = move-exception
            r3.printStackTrace()
        L2a:
            r3 = 30
            if (r2 >= r3) goto L4d
            android.view.ViewParent r2 = r6.getParent()
            android.view.View r2 = (android.view.View) r2
            ᛴᛱᛲᲇ r3 = r0.f975
            if (r3 == 0) goto L3b
            r2.removeOnLayoutChangeListener(r3)
        L3b:
            ᛴᛱᛲᲇ r3 = new ᛴᛱᛲᲇ
            r3.<init>(r1, r5)
            r0.f975 = r3
            r2.addOnLayoutChangeListener(r3)
            ᲈᲈᛴᛶ r0 = new ᲈᲈᛴᛶ
            r0.<init>(r5, r1, r2)
            r2.addOnAttachStateChangeListener(r0)
        L4d:
            java.util.WeakHashMap r5 = defpackage.AbstractC0858.f3911
            r6.requestApplyInsets()
        L52:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            int r1 = r0.f10247
            switch(r1) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r1 = r0.f10246
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.f10245
            ᲈᲈᛴᛶ r0 = (defpackage.ViewOnAttachStateChangeListenerC2367) r0
            java.lang.Object r0 = r0.f10245
            ᛱᛶᛴ r0 = (defpackage.C0112) r0
            ᛴᛱᛲᲇ r0 = r0.f975
            r1.removeOnLayoutChangeListener(r0)
            return
    }
}
