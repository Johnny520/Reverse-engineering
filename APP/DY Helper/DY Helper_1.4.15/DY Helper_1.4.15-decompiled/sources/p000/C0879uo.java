package p000;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0879uo implements p000.InterfaceC0771rr {
    @Override // p000.InterfaceC0771rr
    /* JADX INFO: renamed from: α */
    public final boolean mo2603(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = p000.C0954wo.f11772
            if (r0 == 0) goto Lc
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0771rr
    /* JADX INFO: renamed from: γ */
    public final p000.mx1 mo2604(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            wo r0 = new wo
            r0.<init>()
            return r0
    }
}
