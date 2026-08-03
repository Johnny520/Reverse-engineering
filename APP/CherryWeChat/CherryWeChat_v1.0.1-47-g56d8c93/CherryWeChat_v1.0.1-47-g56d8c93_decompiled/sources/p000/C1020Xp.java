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

    public C1020Xp(C2656w4 c2656w4) {
        C0668Pg c0668Pg = AbstractC0628Oj.f2013g;
        this.f3231a = c2656w4;
        if (((C1381es) c2656w4.f9198d).f4926a.isEmpty()) {
            this.f3232b = c0668Pg;
            this.f3233c = c0668Pg;
            return;
        }
        C2643vs c2643vs = (C2643vs) C2686ws.f9247b.f9249a.get();
        c2643vs = c2643vs == null ? C2686ws.f9248c : c2643vs;
        AbstractC0628Oj.m1248u(c2656w4);
        c2643vs.getClass();
        this.f3232b = c0668Pg;
        this.f3233c = c0668Pg;
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: a */
    public final void mo1742a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C0668Pg c0668Pg = this.f3233c;
        if (length <= 5) {
            c0668Pg.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        C2656w4 c2656w4 = this.f3231a;
        for (C2516su c2516su : c2656w4.m5215w(bArrCopyOf)) {
            try {
                ((InterfaceC0891Up) c2516su.f8808b).mo1742a(bArrCopyOfRange, c2516su.f8811e.equals(EnumC2773yt.LEGACY) ? AbstractC0295Gu.m612e(bArr2, C1063Yp.f3371b) : bArr2);
                c0668Pg.getClass();
                return;
            } catch (GeneralSecurityException e) {
                C1063Yp.f3370a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = c2656w4.m5215w(AbstractC1293cr.f4725a).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0891Up) ((C2516su) it.next()).f8808b).mo1742a(bArr, bArr2);
                c0668Pg.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0668Pg.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // p000.InterfaceC0891Up
    /* JADX INFO: renamed from: b */
    public final byte[] mo1743b(byte[] bArr) throws GeneralSecurityException {
        C0668Pg c0668Pg = this.f3232b;
        C2516su c2516su = (C2516su) this.f3231a.f9197c;
        if (c2516su.f8811e.equals(EnumC2773yt.LEGACY)) {
            bArr = AbstractC0295Gu.m612e(bArr, C1063Yp.f3371b);
        }
        try {
            byte[] bArr2 = c2516su.f8809c;
            byte[] bArrM612e = AbstractC0295Gu.m612e(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((InterfaceC0891Up) c2516su.f8808b).mo1743b(bArr));
            int i = c2516su.f8812f;
            c0668Pg.getClass();
            return bArrM612e;
        } catch (GeneralSecurityException e) {
            c0668Pg.getClass();
            throw e;
        }
    }
}
