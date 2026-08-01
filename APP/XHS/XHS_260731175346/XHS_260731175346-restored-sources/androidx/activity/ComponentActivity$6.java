package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
class ComponentActivity$6 implements xhss.InterfaceC0712 {
    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r1, xhss.EnumC1174 r2) {
            r0 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_CREATE
            if (r2 != r0) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto Lb
            goto Lf
        Lb:
            int r0 = xhss.AbstractActivityC0194.f753
            r0 = 0
            throw r0
        Lf:
            return
    }
}
