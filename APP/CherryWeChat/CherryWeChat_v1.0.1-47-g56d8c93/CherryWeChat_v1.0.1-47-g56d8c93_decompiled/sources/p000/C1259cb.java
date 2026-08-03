package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: cb */
/* JADX INFO: loaded from: classes.dex */
public final class C1259cb {

    /* JADX INFO: renamed from: b */
    public int f4266b;

    /* JADX INFO: renamed from: c */
    public boolean f4267c;

    /* JADX INFO: renamed from: d */
    public final C2454rb f4268d;

    /* JADX INFO: renamed from: e */
    public final int f4269e;

    /* JADX INFO: renamed from: f */
    public C1259cb f4270f;

    /* JADX INFO: renamed from: i */
    public C0256Fy f4273i;

    /* JADX INFO: renamed from: a */
    public HashSet f4265a = null;

    /* JADX INFO: renamed from: g */
    public int f4271g = 0;

    /* JADX INFO: renamed from: h */
    public int f4272h = Integer.MIN_VALUE;

    public C1259cb(C2454rb c2454rb, int i) {
        this.f4268d = c2454rb;
        this.f4269e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2380a(C1259cb c1259cb, int i) {
        m2381b(c1259cb, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2381b(C1259cb c1259cb, int i, int i2, boolean z) {
        if (c1259cb == null) {
            m2389j();
            return true;
        }
        if (!z && !m2388i(c1259cb)) {
            return false;
        }
        this.f4270f = c1259cb;
        if (c1259cb.f4265a == null) {
            c1259cb.f4265a = new HashSet();
        }
        HashSet hashSet = this.f4270f.f4265a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4271g = i;
        this.f4272h = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2382c(int i, C1405fF c1405fF, ArrayList arrayList) {
        HashSet hashSet = this.f4265a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0148Dc.m275i(((C1259cb) it.next()).f4268d, i, arrayList, c1405fF);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2383d() {
        if (this.f4267c) {
            return this.f4266b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m2384e() {
        C1259cb c1259cb;
        if (this.f4268d.f8619g0 == 8) {
            return 0;
        }
        int i = this.f4272h;
        return (i == Integer.MIN_VALUE || (c1259cb = this.f4270f) == null || c1259cb.f4268d.f8619g0 != 8) ? this.f4271g : i;
    }

    /* JADX INFO: renamed from: f */
    public final C1259cb m2385f() {
        int i = this.f4269e;
        int iM424v = AbstractC0213Ey.m424v(i);
        C2454rb c2454rb = this.f4268d;
        switch (iM424v) {
            case 0:
            case 5:
            case 6:
            case 7:
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return null;
            case 1:
                return c2454rb.f8590K;
            case 2:
                return c2454rb.f8591L;
            case 3:
                return c2454rb.f8588I;
            case 4:
                return c2454rb.f8589J;
            default:
                throw new AssertionError(AbstractC0213Ey.m423u(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2386g() {
        HashSet hashSet = this.f4265a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1259cb) it.next()).m2385f().m2387h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2387h() {
        return this.f4270f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2388i(C1259cb c1259cb) {
        if (c1259cb != null) {
            C2454rb c2454rb = c1259cb.f4268d;
            int i = c1259cb.f4269e;
            int i2 = this.f4269e;
            if (i != i2) {
                switch (AbstractC0213Ey.m424v(i2)) {
                    case 0:
                    case 7:
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(c2454rb instanceof C2150kk)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(c2454rb instanceof C2150kk)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC0213Ey.m423u(i2));
                }
            } else if (i2 != 6 || (c2454rb.f8584E && this.f4268d.f8584E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2389j() {
        HashSet hashSet;
        C1259cb c1259cb = this.f4270f;
        if (c1259cb != null && (hashSet = c1259cb.f4265a) != null) {
            hashSet.remove(this);
            if (this.f4270f.f4265a.size() == 0) {
                this.f4270f.f4265a = null;
            }
        }
        this.f4265a = null;
        this.f4270f = null;
        this.f4271g = 0;
        this.f4272h = Integer.MIN_VALUE;
        this.f4267c = false;
        this.f4266b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2390k() {
        C0256Fy c0256Fy = this.f4273i;
        if (c0256Fy == null) {
            this.f4273i = new C0256Fy(1);
        } else {
            c0256Fy.m535c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2391l(int i) {
        this.f4266b = i;
        this.f4267c = true;
    }

    public final String toString() {
        return this.f4268d.f8621h0 + ":" + AbstractC0213Ey.m423u(this.f4269e);
    }
}
