package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: hu */
/* JADX INFO: loaded from: classes.dex */
public final class C1515hu implements InterfaceC0891Up {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1427fu f5364a;

    /* JADX INFO: renamed from: b */
    public final int f5365b;

    public C1515hu(InterfaceC1427fu r2, int r3) {
        this.f5364a = r2;
        this.f5365b = r3;
        if (r3 < 10) goto L7;
        r2.mo1121b(r3, new byte[0]);
        return;
    L7:
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: a */
    public final void mo1742a(byte[] r1, byte[] r2) {
        if (MessageDigest.isEqual(mo1743b(r2), r1) == false) goto L6;
        return;
    L6:
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: b */
    public final byte[] mo1743b(byte[] r3) {
        return this.f5364a.mo1121b(this.f5365b, r3);
    }
}
