package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: Xp */
/* JADX INFO: loaded from: classes.dex */
public final class C1020Xp implements InterfaceC0891Up {

    /* JADX INFO: renamed from: a */
    public final C2656w4 f3231a;

    /* JADX INFO: renamed from: b */
    public final C0668Pg f3232b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f3233c;

    public C1020Xp(C2656w4 r3) {
        C0668Pg r0 = AbstractC0628Oj.f2013g;
        this.f3231a = r3;
        if (((C1381es) r3.f9198d).f4926a.isEmpty() == true) goto L9;
        C2643vs r1 = (C2643vs) C2686ws.f9247b.f9249a.get();
        if (r1 != null) goto L7;
        r1 = C2686ws.f9248c;
    L7:
        AbstractC0628Oj.m1248u(r3);
        r1.getClass();
        this.f3232b = r0;
        this.f3233c = r0;
        return;
    L9:
        this.f3232b = r0;
        this.f3233c = r0;
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: a */
    public final void mo1742a(byte[] r9, byte[] r10) {
        int r0 = r9.length;
        C0668Pg r1 = this.f3233c;
        if (r0 <= 5) goto L23;
        byte[] r02 = Arrays.copyOf(r9, 5);
        byte[] r2 = Arrays.copyOfRange(r9, 5, r9.length);
        C2656w4 r3 = this.f3231a;
        Iterator r03 = r3.m5215w(r02).iterator();
    L6:
        if (r03.hasNext() == false) goto L15;
        C2516su r4 = (C2516su) r03.next();
        if (r4.f8811e.equals(EnumC2773yt.f9419d) == false) goto L10;
        byte[] r5 = AbstractC0295Gu.m612e(new byte[][]{r10, C1063Yp.f3371b});
    L26:
        ((InterfaceC0891Up) r4.f8808b).mo1742a(r2, r5);     // Catch: GeneralSecurityException -> L13
        r1.getClass();     // Catch: GeneralSecurityException -> L13
        return;
    L13:
        e = move-exception;
        C1063Yp.f3370a.info("tag prefix matches a key, but cannot verify: " + e);
        goto L6
    L10:
        r5 = r10;
        goto L26
    L15:
        Iterator r04 = r3.m5215w(AbstractC1293cr.f4725a).iterator();
    L17:
        if (r04.hasNext() == false) goto L21;
        ((InterfaceC0891Up) ((C2516su) r04.next()).f8808b).mo1742a(r9, r10);     // Catch: GeneralSecurityException -> L25
        r1.getClass();     // Catch: GeneralSecurityException -> L25
        return;
    L21:
        r1.getClass();
        throw new GeneralSecurityException("invalid MAC");
    L23:
        r1.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: b */
    public final byte[] mo1743b(byte[] r5) {
        C0668Pg r0 = this.f3232b;
        C2516su r1 = (C2516su) this.f3231a.f9197c;
        if (r1.f8811e.equals(EnumC2773yt.f9419d) == false) goto L14;
        r5 = AbstractC0295Gu.m612e(new byte[][]{r5, C1063Yp.f3371b});
    L14:
        byte[] r2 = r1.f8809c;     // Catch: GeneralSecurityException -> L11
        if (r2 != null) goto L8;
        byte[] r22 = null;
    L9:
        byte[] r52 = AbstractC0295Gu.m612e(new byte[][]{r22, ((InterfaceC0891Up) r1.f8808b).mo1743b(r5)});     // Catch: GeneralSecurityException -> L11
        int r12 = r1.f8812f;     // Catch: GeneralSecurityException -> L11
        r0.getClass();     // Catch: GeneralSecurityException -> L11
        return r52;
    L8:
        r22 = Arrays.copyOf(r2, r2.length);     // Catch: GeneralSecurityException -> L11
    L11:
        e = move-exception;
        r0.getClass();
        throw e;
    }
}
