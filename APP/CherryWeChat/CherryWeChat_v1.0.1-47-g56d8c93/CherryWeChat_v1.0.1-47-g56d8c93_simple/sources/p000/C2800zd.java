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

    public C2800zd(C2656w4 r3) {
        C0668Pg r0 = AbstractC0628Oj.f2013g;
        this.f9472a = r3;
        if (((C1381es) r3.f9198d).f4926a.isEmpty() == true) goto L9;
        C2643vs r1 = (C2643vs) C2686ws.f9247b.f9249a.get();
        if (r1 != null) goto L7;
        r1 = C2686ws.f9248c;
    L7:
        AbstractC0628Oj.m1248u(r3);
        r1.getClass();
        this.f9473b = r0;
        this.f9474c = r0;
        return;
    L9:
        this.f9473b = r0;
        this.f9474c = r0;
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: a */
    public final byte[] mo4458a(byte[] r5, byte[] r6) {
        C0668Pg r0 = this.f9473b;
        C2516su r1 = (C2516su) this.f9472a.f9197c;
        byte[] r2 = r1.f8809c;     // Catch: GeneralSecurityException -> L9
        if (r2 != null) goto L6;
        byte[] r22 = null;
    L7:
        byte[] r52 = AbstractC0295Gu.m612e(new byte[][]{r22, ((InterfaceC2714xd) r1.f8808b).mo4458a(r5, r6)});     // Catch: GeneralSecurityException -> L9
        int r62 = r1.f8812f;     // Catch: GeneralSecurityException -> L9
        r0.getClass();     // Catch: GeneralSecurityException -> L9
        return r52;
    L6:
        r22 = Arrays.copyOf(r2, r2.length);     // Catch: GeneralSecurityException -> L9
    L9:
        e = move-exception;
        r0.getClass();
        throw e;
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: b */
    public final byte[] mo4459b(byte[] r9, byte[] r10) {
        int r0 = r9.length;
        C2656w4 r1 = this.f9472a;
        C0668Pg r2 = this.f9474c;
        if (r0 <= 5) goto L12;
        byte[] r02 = Arrays.copyOf(r9, 5);
        byte[] r3 = Arrays.copyOfRange(r9, 5, r9.length);
        Iterator r03 = r1.m5215w(r02).iterator();
    L6:
        if (r03.hasNext() == false) goto L12;
        byte[] r4 = ((InterfaceC2714xd) ((C2516su) r03.next()).f8808b).mo4459b(r3, r10);     // Catch: GeneralSecurityException -> L10
        r2.getClass();     // Catch: GeneralSecurityException -> L10
        return r4;
    L10:
        e = move-exception;
        C0020Ad.f37a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
    L12:
        Iterator r04 = r1.m5215w(AbstractC1293cr.f4725a).iterator();
    L14:
        if (r04.hasNext() == false) goto L18;
        byte[] r12 = ((InterfaceC2714xd) ((C2516su) r04.next()).f8808b).mo4459b(r9, r10);     // Catch: GeneralSecurityException -> L20
        r2.getClass();     // Catch: GeneralSecurityException -> L20
        return r12;
    L18:
        r2.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
