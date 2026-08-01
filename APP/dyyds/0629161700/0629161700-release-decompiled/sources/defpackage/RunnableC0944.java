package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0944 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0438 f4232;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4233;

    public /* synthetic */ RunnableC0944(defpackage.C0438 r1, int r2) {
            r0 = this;
            r0.f4233 = r2
            r0.f4232 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f4233
            r1 = 0
            ᛳᛳᛴᛸ r4 = r4.f4232
            switch(r0) {
                case 0: goto L51;
                case 1: goto L1b;
                default: goto L8;
            }
        L8:
            ᛱᛱᲈᛳ r0 = new ᛱᛱᲈᛳ
            ᛶᛵᛳᛸ r2 = r4.f2151
            ᛶᛵᛳᛸ r3 = r2.f4761
            ᛳᛳᛴᛸ r2 = r2.f4767
            r0.<init>()
            r0.f493 = r1
            r0.m337(r3, r2)
            r4.f2159 = r0
            return
        L1b:
            ᛶᛵᛳᛸ r0 = r4.f2151
            ᛲᛵᛲ r2 = r0.f4760
            if (r2 != 0) goto L28
            ᛲᛵᛲ r2 = new ᛲᛵᛲ
            r2.<init>(r1, r4)
            r0.f4760 = r2
        L28:
            r2.m952(r0)
            ᲈᛴᛵᲈ r1 = r0.f375
            r1.getClass()
            java.util.ArrayList r4 = r4.f2154
            if (r4 == 0) goto L50
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L3f
            goto L50
        L3f:
            java.lang.Object r4 = r4.next()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L4b
            defpackage.C2264.m3679()
            goto L50
        L4b:
            r0.getClass()
            r4 = 0
            throw r4
        L50:
            return
        L51:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r4.f2164
            if (r0 == 0) goto L5a
            r1 = 8
            r0.setVisibility(r1)
        L5a:
            ᛶᛵᛳᛸ r4 = r4.f2151
            android.view.View r4 = r4.m262()
            com.kongzue.dialogx.interfaces.AbstractC0008.m242(r4)
            return
    }
}
