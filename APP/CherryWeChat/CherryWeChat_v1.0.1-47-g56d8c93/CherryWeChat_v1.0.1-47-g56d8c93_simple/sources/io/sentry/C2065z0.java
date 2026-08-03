package io.sentry;

import io.sentry.vendor.gson.stream.C2049a;
import java.util.ArrayList;
import java.util.List;
import p000.C0698Q9;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7297a;

    public C2065z0() {
        this.f7297a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC2026u0 m4227a() {
        ArrayList r0 = this.f7297a;
        if (r0.isEmpty() == false) goto L7;
        return null;
    L7:
        return (InterfaceC2026u0) r0.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4228b() {
        if (this.f7297a.size() != 1) goto L5;
        return true;
    L5:
        InterfaceC2026u0 r0 = m4227a();
        m4231e();
        if ((m4227a() instanceof C2057x0) == false) goto L13;
        C2057x0 r1 = (C2057x0) m4227a();
        m4231e();
        C2053w0 r2 = (C2053w0) m4227a();
        if (r1 == null) goto L20;
        if (r0 == null) goto L21;
        if (r2 == null) goto L22;
        r2.f7275a.put(r1.f7277a, r0.getValue());
        return false;
    L22:
        return false;
    L21:
        return false;
    L20:
        return false;
    L13:
        if ((m4227a() instanceof C2044v0) == false) goto L24;
        C2044v0 r12 = (C2044v0) m4227a();
        if (r0 == null) goto L25;
        if (r12 == null) goto L26;
        r12.f7239a.add(r0.getValue());
        return false;
    L26:
        return false;
    L25:
        return false;
    L24:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4229c(InterfaceC2003t0 r3) {
        Object r32 = r3.mo1426d();
        if (m4227a() != null) goto L8;
        if (r32 == null) goto L8;
        C2061y0 r0 = new C2061y0(r32);
        this.f7297a.add(r0);
        return true;
    L8:
        if ((m4227a() instanceof C2057x0) == false) goto L11;
        C2057x0 r02 = (C2057x0) m4227a();
        m4231e();
        ((C2053w0) m4227a()).f7275a.put(r02.f7277a, r32);
        return false;
    L11:
        if ((m4227a() instanceof C2044v0) == false) goto L16;
        ((C2044v0) m4227a()).f7239a.add(r32);
        return false;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m4230d(final C1559A0 r4) {
        int[] r0 = AbstractC1999s0.f7167a;
        C2049a r1 = (C2049a) r4.f5581b;
        int r02 = r0[r1.m4194C().ordinal()];
        ArrayList r2 = this.f7297a;
        switch(r02) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L8;
            case 8: goto L7;
            case 9: goto L6;
            case 10: goto L5;
            default: goto L15;
        };
    L5:
        boolean r03 = true;
    L16:
        if (r03 == true) goto L19;
        m4230d(r4);
        return;
    L19:
        return;
    L6:
        r1.m4215y();
        r03 = m4229c(new C2438r1(18));
        goto L16
    L7:
        final int r12 = 1;
        r03 = m4229c(new C1982r0(r4, r12));
        goto L16
    L8:
        r03 = m4229c(new C0698Q9(3, this, r4));
        goto L16
    L9:
        final int r13 = 0;
        r03 = m4229c(new C1982r0(r4, r13));
        goto L16
    L10:
        r2.add(new C2057x0(r1.m4213w()));
        goto L15
    L11:
        r4.m3568i();
        r03 = m4228b();
        goto L16
    L12:
        r4.m3567f();
        r2.add(new C2053w0());
        goto L15
    L13:
        r1.m4204m();
        r03 = m4228b();
        goto L16
    L14:
        r1.m4200d();
        r2.add(new C2044v0());
    L15:
        r03 = false;
        goto L16
    }

    /* JADX INFO: renamed from: e */
    public void m4231e() {
        ArrayList r0 = this.f7297a;
        if (r0.isEmpty() == false) goto L5;
        return;
    L5:
        r0.remove(r0.size() - 1);
    }

    public C2065z0(List r2) {
        if (r2 != null) goto L5;
        r2 = new ArrayList(0);
    L5:
        this.f7297a = new ArrayList(r2);
    }
}
