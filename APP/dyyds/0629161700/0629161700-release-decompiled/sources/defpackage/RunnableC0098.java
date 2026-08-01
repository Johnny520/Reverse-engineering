package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0098 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ com.kongzue.dialogx.interfaces.AbstractC0008 f904;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f905;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f906;

    public /* synthetic */ RunnableC0098(android.view.View r1, com.kongzue.dialogx.interfaces.AbstractC0008 r2, int r3) {
            r0 = this;
            r0.f906 = r3
            r0.f905 = r1
            r0.f904 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f906
            android.view.View r1 = r4.f905
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r4 = r4.f904
            switch(r0) {
                case 0: goto L7b;
                default: goto L9;
            }
        L9:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L22
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 != 0) goto L18
            goto L22
        L18:
            android.view.ViewParent r4 = r1.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r1)
            goto L30
        L22:
            android.widget.FrameLayout r0 = r4.m261()
            if (r0 != 0) goto L29
            goto L7a
        L29:
            android.widget.FrameLayout r4 = r4.m261()
            r4.removeView(r1)
        L30:
            java.util.concurrent.CopyOnWriteArrayList r4 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            if (r4 == 0) goto L7a
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r4.<init>(r0)
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L41:
            if (r0 < 0) goto L7a
            java.lang.Object r1 = r4.get(r0)
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = (com.kongzue.dialogx.interfaces.AbstractC0008) r1
            android.app.Activity r2 = r1.m271()
            android.app.Activity r3 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            if (r2 != r3) goto L77
            boolean r2 = r1.f369
            if (r2 == 0) goto L77
            android.view.View r2 = r1.m262()
            if (r2 == 0) goto L77
            android.view.View r1 = r1.m262()
            r2 = 1711865999(0x6609008f, float:1.6174363E23)
            android.view.View r1 = r1.findViewById(r2)
            boolean r2 = r1 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r2 == 0) goto L77
            r2 = r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            boolean r2 = r2.f395
            if (r2 == 0) goto L77
            r1.requestFocus()
            goto L7a
        L77:
            int r0 = r0 + (-1)
            goto L41
        L7a:
            return
        L7b:
            android.view.ViewParent r0 = r1.getParent()
            android.widget.FrameLayout r2 = r4.m261()
            if (r0 != r2) goto L99
            java.lang.Object r4 = r1.getTag()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r4 = (com.kongzue.dialogx.interfaces.AbstractC0008) r4
            java.lang.String r4 = r4.mo274()
            java.lang.String r0 = "已处于显示状态，请勿重复执行 show() 指令。"
            java.lang.String r4 = r4.concat(r0)
            com.kongzue.dialogx.interfaces.AbstractC0008.m251(r4)
            goto Laf
        L99:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto La8
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
        La8:
            android.widget.FrameLayout r4 = r4.m261()
            r4.addView(r1)
        Laf:
            return
    }
}
