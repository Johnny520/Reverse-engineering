package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛵᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1039 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3357;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3358;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3359;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1039(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.f3359 = r1
            r0.f3358 = r2
            r0.f3357 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    private final void m1699(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    private final void m1700(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r6) {
            r5 = this;
            int r0 = r5.f3359
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            r6.removeOnAttachStateChangeListener(r5)
            java.lang.Object r0 = r5.f3358
            xhss.ᛷᛴᛱᲀ r0 = (xhss.C0644) r0
            int r1 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            r1 = 0
            r2 = -1
            android.app.Application r3 = xhss.C0932.m1533()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
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
            xhss.ᲀᛴᛱᛷ r3 = r0.f2204
            if (r3 == 0) goto L3b
            r2.removeOnLayoutChangeListener(r3)
        L3b:
            xhss.ᲀᛴᛱᛷ r3 = new xhss.ᲀᛴᛱᛷ
            r3.<init>(r1, r5)
            r0.f2204 = r3
            r2.addOnLayoutChangeListener(r3)
            xhss.ᲇᛵᛴᛲ r0 = new xhss.ᲇᛵᛴᛲ
            r0.<init>(r1, r5, r2)
            r2.addOnAttachStateChangeListener(r0)
        L4d:
            int r5 = xhss.AbstractC0624.f2154
            r6.requestApplyInsets()
        L52:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            int r1 = r0.f3359
            switch(r1) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r1 = r0.f3357
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.f3358
            xhss.ᲇᛵᛴᛲ r0 = (xhss.ViewOnAttachStateChangeListenerC1039) r0
            java.lang.Object r0 = r0.f3358
            xhss.ᛷᛴᛱᲀ r0 = (xhss.C0644) r0
            xhss.ᲀᛴᛱᛷ r0 = r0.f2204
            r1.removeOnLayoutChangeListener(r0)
            return
    }
}
