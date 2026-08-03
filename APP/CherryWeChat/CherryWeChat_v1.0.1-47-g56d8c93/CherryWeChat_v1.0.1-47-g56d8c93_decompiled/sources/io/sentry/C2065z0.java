package io.sentry;

import io.sentry.vendor.gson.stream.C2049a;
import java.util.ArrayList;
import java.util.List;
import p000.C0698Q9;
import p000.C2438r1;
import party.iroiro.luajava.luajit.LuaJitConsts;

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
        ArrayList arrayList = this.f7297a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC2026u0) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4228b() {
        if (this.f7297a.size() == 1) {
            return true;
        }
        InterfaceC2026u0 interfaceC2026u0M4227a = m4227a();
        m4231e();
        if (!(m4227a() instanceof C2057x0)) {
            if (!(m4227a() instanceof C2044v0)) {
                return false;
            }
            C2044v0 c2044v0 = (C2044v0) m4227a();
            if (interfaceC2026u0M4227a == null || c2044v0 == null) {
                return false;
            }
            c2044v0.f7239a.add(interfaceC2026u0M4227a.getValue());
            return false;
        }
        C2057x0 c2057x0 = (C2057x0) m4227a();
        m4231e();
        C2053w0 c2053w0 = (C2053w0) m4227a();
        if (c2057x0 == null || interfaceC2026u0M4227a == null || c2053w0 == null) {
            return false;
        }
        c2053w0.f7275a.put(c2057x0.f7277a, interfaceC2026u0M4227a.getValue());
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4229c(InterfaceC2003t0 interfaceC2003t0) {
        Object objMo1426d = interfaceC2003t0.mo1426d();
        if (m4227a() == null && objMo1426d != null) {
            this.f7297a.add(new C2061y0(objMo1426d));
            return true;
        }
        if (m4227a() instanceof C2057x0) {
            C2057x0 c2057x0 = (C2057x0) m4227a();
            m4231e();
            ((C2053w0) m4227a()).f7275a.put(c2057x0.f7277a, objMo1426d);
            return false;
        }
        if (!(m4227a() instanceof C2044v0)) {
            return false;
        }
        ((C2044v0) m4227a()).f7239a.add(objMo1426d);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public void m4230d(final C1559A0 c1559a0) {
        boolean zM4228b;
        int[] iArr = AbstractC1999s0.f7167a;
        C2049a c2049a = (C2049a) c1559a0.f5581b;
        int i = iArr[c2049a.m4194C().ordinal()];
        ArrayList arrayList = this.f7297a;
        switch (i) {
            case 1:
                c2049a.m4200d();
                arrayList.add(new C2044v0());
                zM4228b = false;
                break;
            case 2:
                c2049a.m4204m();
                zM4228b = m4228b();
                break;
            case 3:
                c1559a0.m3567f();
                arrayList.add(new C2053w0());
                zM4228b = false;
                break;
            case 4:
                c1559a0.m3568i();
                zM4228b = m4228b();
                break;
            case 5:
                arrayList.add(new C2057x0(c2049a.m4213w()));
                zM4228b = false;
                break;
            case 6:
                final int i2 = 0;
                zM4228b = m4229c(new InterfaceC2003t0() { // from class: io.sentry.r0
                    @Override // io.sentry.InterfaceC2003t0
                    /* JADX INFO: renamed from: d */
                    public final Object mo1426d() {
                        switch (i2) {
                            case 0:
                                return ((C2049a) c1559a0.f5581b).m4192A();
                            default:
                                return Boolean.valueOf(((C2049a) c1559a0.f5581b).m4209s());
                        }
                    }
                });
                break;
            case 7:
                zM4228b = m4229c(new C0698Q9(3, this, c1559a0));
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                final int i3 = 1;
                zM4228b = m4229c(new InterfaceC2003t0() { // from class: io.sentry.r0
                    @Override // io.sentry.InterfaceC2003t0
                    /* JADX INFO: renamed from: d */
                    public final Object mo1426d() {
                        switch (i3) {
                            case 0:
                                return ((C2049a) c1559a0.f5581b).m4192A();
                            default:
                                return Boolean.valueOf(((C2049a) c1559a0.f5581b).m4209s());
                        }
                    }
                });
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                c2049a.m4215y();
                zM4228b = m4229c(new C2438r1(18));
                break;
            case 10:
                zM4228b = true;
                break;
            default:
                zM4228b = false;
                break;
        }
        if (zM4228b) {
            return;
        }
        m4230d(c1559a0);
    }

    /* JADX INFO: renamed from: e */
    public void m4231e() {
        ArrayList arrayList = this.f7297a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public C2065z0(List list) {
        this.f7297a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}
