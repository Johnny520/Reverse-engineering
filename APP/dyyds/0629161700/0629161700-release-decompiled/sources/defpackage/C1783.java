package defpackage;

/* JADX INFO: renamed from: ᲀᲈᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f7858;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.InterfaceC2045 f7859;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.view.animation.Interpolator f7860;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f7861;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public long f7862;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1529 f7863;

    public C1783() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f7862 = r0
            ᛸᛷᛴᲈ r0 = new ᛸᛷᛴᲈ
            r0.<init>(r2)
            r2.f7863 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f7861 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3181() {
            r2 = this;
            boolean r0 = r2.f7858
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r2.f7861
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            ᲇᲇᛱᛳ r1 = (defpackage.C2136) r1
            r1.m3556()
            goto Lb
        L1b:
            r0 = 0
            r2.f7858 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3182() {
            r6 = this;
            boolean r0 = r6.f7858
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r6.f7861
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            ᲇᲇᛱᛳ r1 = (defpackage.C2136) r1
            long r2 = r6.f7862
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L22
            r1.m3554(r2)
        L22:
            android.view.animation.Interpolator r2 = r6.f7860
            if (r2 == 0) goto L37
            java.lang.ref.WeakReference r3 = r1.f9108
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L37
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setInterpolator(r2)
        L37:
            ᲇᛴᲇᛵ r2 = r6.f7859
            if (r2 == 0) goto L40
            ᛸᛷᛴᲈ r2 = r6.f7863
            r1.m3553(r2)
        L40:
            java.lang.ref.WeakReference r1 = r1.f9108
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lb
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.start()
            goto Lb
        L52:
            r0 = 1
            r6.f7858 = r0
            return
    }
}
