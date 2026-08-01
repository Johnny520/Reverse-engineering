package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0180 extends xhss.AbstractC0912 implements xhss.InterfaceC0281 {
    public AbstractC0180() {
            r1 = this;
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f972
            r1.<init>(r0)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r2 = xhss.AbstractC0561.m1011(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public abstract void mo359(xhss.InterfaceC0362 r1, java.lang.Runnable r2);

    @Override // xhss.AbstractC0912, xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0362 mo440(xhss.InterfaceC1091 r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.AbstractC0753
            if (r0 == 0) goto Ld
            xhss.ᛸᛴᛶᛳ r2 = (xhss.AbstractC0753) r2
            xhss.ᲇᲁᛵᲈ r0 = r1.f2944
            if (r0 == r2) goto Lb
            return r1
        Lb:
            r1 = 0
            throw r1
        Ld:
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f972
            if (r0 != r2) goto L13
            xhss.ᲇᛷᲁᛷ r1 = xhss.C1059.f3421
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public boolean mo441(xhss.InterfaceC0362 r1) {
            r0 = this;
            boolean r0 = r0 instanceof xhss.AbstractC0793
            r0 = r0 ^ 1
            return r0
    }

    @Override // xhss.AbstractC0912, xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0281 mo442(xhss.InterfaceC1091 r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.AbstractC0753
            r1 = 0
            if (r0 == 0) goto Ld
            xhss.ᛸᛴᛶᛳ r3 = (xhss.AbstractC0753) r3
            xhss.ᲇᲁᛵᲈ r2 = r2.f2944
            if (r2 == r3) goto Lc
            return r1
        Lc:
            throw r1
        Ld:
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f972
            if (r0 != r3) goto L12
            return r2
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public xhss.AbstractC0180 mo443(int r2) {
            r1 = this;
            xhss.AbstractC0060.m183(r2)
            xhss.ᲇᛵᛳᛸ r0 = new xhss.ᲇᛵᛳᛸ
            r0.<init>(r1, r2)
            return r0
    }
}
