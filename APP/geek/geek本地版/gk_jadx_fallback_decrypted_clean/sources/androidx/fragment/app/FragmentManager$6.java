package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements defpackage.mq {
    @Override // defpackage.mq
    public final void b(defpackage.oq r2, defpackage.iq r3) {
            r1 = this;
            iq r2 = defpackage.iq.ON_START
            r0 = 0
            if (r3 == r2) goto Lb
            iq r2 = defpackage.iq.ON_DESTROY
            if (r3 == r2) goto La
            return
        La:
            throw r0
        Lb:
            throw r0
    }
}
