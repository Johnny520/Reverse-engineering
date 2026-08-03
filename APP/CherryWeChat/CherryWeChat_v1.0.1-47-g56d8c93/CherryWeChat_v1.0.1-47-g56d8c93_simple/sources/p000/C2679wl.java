package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: wl */
/* JADX INFO: loaded from: classes.dex */
public final class C2679wl extends AbstractC0047B3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9239c;

    public C2679wl(int r2, byte[] r3) {
        this.f9239c = r2;
        if (AbstractC2374ph.m4805b(1) == false) goto L7;
        this.f96a = mo85l(1, r3);
        this.f97b = mo85l(0, r3);
        return;
    L7:
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: l */
    public final AbstractC2140ka mo85l(int r3, byte[] r4) {
        switch(this.f9239c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C2636vl(r4, r3, 1);
    L7:
        return new C2636vl(r4, r3, 0);
    }
}
