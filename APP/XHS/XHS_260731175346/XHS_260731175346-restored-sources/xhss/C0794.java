package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛸᲁᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0794 extends xhss.AbstractC0631 implements xhss.InterfaceC0517, xhss.InterfaceC0883 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Class f2582;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f2583;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f2584;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f2585;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f2586;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2587;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object[] f2588;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2589;

    static {
            r0 = 17
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public C0794(java.lang.Class r1, xhss.InterfaceC0038 r2) {
            r0 = this;
            r0.f2586 = r1
            r0.<init>(r2)
            if (r2 == 0) goto L17
            xhss.ᛴᛵᛳᛵ r0 = r2.mo153()
            xhss.ᲇᛷᲁᛷ r1 = xhss.C1059.f3421
            if (r0 != r1) goto L10
            goto L17
        L10:
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            xhss.C0532.m959(r0)
            r0 = 0
            throw r0
        L17:
            return
    }

    @Override // xhss.AbstractC0631
    public final native java.lang.String toString();

    @Override // xhss.InterfaceC0883
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final native int mo665();

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final native java.lang.Object mo115(java.lang.Object r1, java.lang.Object r2);

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final native java.lang.Object mo116(java.lang.Object r1);

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final native xhss.InterfaceC0038 mo117(java.lang.Object r1, xhss.InterfaceC0038 r2);

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final native xhss.InterfaceC0362 mo153();
}
