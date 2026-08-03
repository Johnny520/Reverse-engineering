package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: zd */
/* JADX INFO: loaded from: classes.dex */
public final class C2800zd implements InterfaceC2714xd {

    /* JADX INFO: renamed from: a */
    public final C2656w4 f9472a;

    /* JADX INFO: renamed from: b */
    public final C0668Pg f9473b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f9474c;

    public C2800zd(C2656w4 c2656w4) {
        C0668Pg c0668Pg = AbstractC0628Oj.f2013g;
        this.f9472a = c2656w4;
        if (((C1381es) c2656w4.f9198d).f4926a.isEmpty()) {
            this.f9473b = c0668Pg;
            this.f9474c = c0668Pg;
            return;
        }
        C2643vs c2643vs = (C2643vs) C2686ws.f9247b.f9249a.get();
        c2643vs = c2643vs == null ? C2686ws.f9248c : c2643vs;
        AbstractC0628Oj.m1248u(c2656w4);
        c2643vs.getClass();
        this.f9473b = c0668Pg;
        this.f9474c = c0668Pg;
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: a */
    public final byte[] mo4458a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C0668Pg c0668Pg = this.f9473b;
        C2516su c2516su = (C2516su) this.f9472a.f9197c;
        try {
            byte[] bArr3 = c2516su.f8809c;
            byte[] bArrM612e = AbstractC0295Gu.m612e(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC2714xd) c2516su.f8808b).mo4458a(bArr, bArr2));
            int i = c2516su.f8812f;
            c0668Pg.getClass();
            return bArrM612e;
        } catch (GeneralSecurityException e) {
            c0668Pg.getClass();
            throw e;
        }
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: b */
    public final byte[] mo4459b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C2656w4 c2656w4 = this.f9472a;
        C0668Pg c0668Pg = this.f9474c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = c2656w4.m5215w(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo4459b = ((InterfaceC2714xd) ((C2516su) it.next()).f8808b).mo4459b(bArrCopyOfRange, bArr2);
                    c0668Pg.getClass();
                    return bArrMo4459b;
                } catch (GeneralSecurityException e) {
                    C0020Ad.f37a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = c2656w4.m5215w(AbstractC1293cr.f4725a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrMo4459b2 = ((InterfaceC2714xd) ((C2516su) it2.next()).f8808b).mo4459b(bArr, bArr2);
                c0668Pg.getClass();
                return bArrMo4459b2;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0668Pg.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
