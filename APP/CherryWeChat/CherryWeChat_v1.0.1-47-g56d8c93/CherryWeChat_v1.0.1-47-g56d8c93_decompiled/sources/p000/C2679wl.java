package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: wl */
/* JADX INFO: loaded from: classes.dex */
public final class C2679wl extends AbstractC0047B3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9239c;

    public C2679wl(int i, byte[] bArr) throws GeneralSecurityException {
        this.f9239c = i;
        if (!AbstractC2374ph.m4805b(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f96a = mo85l(1, bArr);
        this.f97b = mo85l(0, bArr);
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: l */
    public final AbstractC2140ka mo85l(int i, byte[] bArr) {
        switch (this.f9239c) {
            case 0:
                return new C2636vl(bArr, i, 0);
            default:
                return new C2636vl(bArr, i, 1);
        }
    }
}
