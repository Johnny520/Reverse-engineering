package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.g {
    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r2, androidx.lifecycle.e.a r3) {
            r1 = this;
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_START
            r0 = 0
            if (r3 == r2) goto Lb
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_DESTROY
            if (r3 == r2) goto La
            return
        La:
            throw r0
        Lb:
            throw r0
    }
}
