package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2124k1 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: a */
    public final C2656w4 f7453a;

    /* JADX INFO: renamed from: b */
    public final C0668Pg f7454b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f7455c;

    public C2124k1(C2656w4 c2656w4) {
        C0668Pg c0668Pg = AbstractC0628Oj.f2013g;
        this.f7453a = c2656w4;
        if (((C1381es) c2656w4.f9198d).f4926a.isEmpty()) {
            this.f7454b = c0668Pg;
            this.f7455c = c0668Pg;
            return;
        }
        C2643vs c2643vs = (C2643vs) C2686ws.f9247b.f9249a.get();
        c2643vs = c2643vs == null ? C2686ws.f9248c : c2643vs;
        AbstractC0628Oj.m1248u(c2656w4);
        c2643vs.getClass();
        this.f7454b = c0668Pg;
        this.f7455c = c0668Pg;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C0668Pg c0668Pg = this.f7454b;
        C2516su c2516su = (C2516su) this.f7453a.f9197c;
        try {
            byte[] bArr3 = c2516su.f8809c;
            byte[] bArrM612e = AbstractC0295Gu.m612e(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC1435g1) c2516su.f8808b).mo1002a(bArr, bArr2));
            int i = c2516su.f8812f;
            int length = bArr.length;
            c0668Pg.getClass();
            return bArrM612e;
        } catch (GeneralSecurityException e) {
            c0668Pg.getClass();
            throw e;
        }
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C2656w4 c2656w4 = this.f7453a;
        C0668Pg c0668Pg = this.f7455c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = c2656w4.m5215w(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo1003b = ((InterfaceC1435g1) ((C2516su) it.next()).f8808b).mo1003b(bArrCopyOfRange, bArr2);
                    c0668Pg.getClass();
                    return bArrMo1003b;
                } catch (GeneralSecurityException e) {
                    C2172l1.f7565a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = c2656w4.m5215w(AbstractC1293cr.f4725a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrMo1003b2 = ((InterfaceC1435g1) ((C2516su) it2.next()).f8808b).mo1003b(bArr, bArr2);
                c0668Pg.getClass();
                return bArrMo1003b2;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0668Pg.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
