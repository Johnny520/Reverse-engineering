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

    public C1515hu(InterfaceC1427fu interfaceC1427fu, int i) throws InvalidAlgorithmParameterException {
        this.f5364a = interfaceC1427fu;
        this.f5365b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC1427fu.mo1121b(i, new byte[0]);
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: a */
    public final void mo1742a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(mo1743b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: b */
    public final byte[] mo1743b(byte[] bArr) {
        return this.f5364a.mo1121b(this.f5365b, bArr);
    }
}
