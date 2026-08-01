package p000;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dz0 extends AbstractC0731sm implements a50, vz0, qr0, q10, InterfaceC1005zi {

    /* JADX INFO: renamed from: A */
    public boolean f1215A;

    /* JADX INFO: renamed from: B */
    public C0860vp f1216B;

    /* JADX INFO: renamed from: C */
    public C0971yp f1217C;

    /* JADX INFO: renamed from: D */
    public C0934xp f1218D;

    /* JADX INFO: renamed from: E */
    public C0897wp f1219E;

    /* JADX INFO: renamed from: F */
    public AbstractC0307i4 f1220F;

    /* JADX INFO: renamed from: G */
    public qb1 f1221G;

    /* JADX INFO: renamed from: H */
    public long f1222H;

    /* JADX INFO: renamed from: I */
    public q81 f1223I;

    /* JADX INFO: renamed from: J */
    public o10 f1224J;

    /* JADX INFO: renamed from: K */
    public long f1225K;

    /* JADX INFO: renamed from: L */
    public C0343j5 f1226L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0975yt f1227M;

    /* JADX INFO: renamed from: N */
    public final C0948y2 f1228N;

    /* JADX INFO: renamed from: O */
    public final sy0 f1229O;

    /* JADX INFO: renamed from: P */
    public final C0856vl f1230P;

    /* JADX INFO: renamed from: Q */
    public final lz0 f1231Q;

    /* JADX INFO: renamed from: R */
    public final yy0 f1232R;

    /* JADX INFO: renamed from: S */
    public final C0149dv f1233S;

    /* JADX INFO: renamed from: T */
    public final C0095ck f1234T;

    /* JADX INFO: renamed from: U */
    public C0956ya f1235U;

    /* JADX INFO: renamed from: V */
    public bz0 f1236V;

    /* JADX INFO: renamed from: W */
    public C0215fn f1237W;

    /* JADX INFO: renamed from: t */
    public um0 f1238t;

    /* JADX INFO: renamed from: u */
    public sx0 f1239u;

    /* JADX INFO: renamed from: v */
    public boolean f1240v;

    /* JADX INFO: renamed from: w */
    public xg0 f1241w;

    /* JADX INFO: renamed from: x */
    public C0834vb f1242x;

    /* JADX INFO: renamed from: y */
    public C0440lq f1243y;

    /* JADX INFO: renamed from: z */
    public boolean f1244z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dz0(C0343j5 c0343j5, InterfaceC0386kb interfaceC0386kb, InterfaceC0975yt interfaceC0975yt, xg0 xg0Var, um0 um0Var, ez0 ez0Var, boolean z, boolean z2) {
        sx0 sx0Var = wy0.f7219a;
        this.f1238t = um0Var;
        this.f1239u = sx0Var;
        this.f1240v = z;
        this.f1241w = xg0Var;
        this.f1222H = 9205357640488583168L;
        this.f1225K = 0L;
        this.f1226L = c0343j5;
        this.f1227M = interfaceC0975yt;
        C0948y2 c0948y2 = new C0948y2();
        this.f1228N = c0948y2;
        sy0 sy0Var = new sy0();
        sy0Var.f5861r = z;
        m4086w0(sy0Var);
        this.f1229O = sy0Var;
        C0856vl c0856vl = new C0856vl(new C0478ml(new C0910x1(wy0.f7222d)));
        this.f1230P = c0856vl;
        C0343j5 c0343j52 = this.f1226L;
        InterfaceC0975yt interfaceC0975yt2 = this.f1227M;
        lz0 lz0Var = new lz0(ez0Var, c0343j52, interfaceC0975yt2 == null ? c0856vl : interfaceC0975yt2, um0Var, z2, c0948y2, this, new zy0(this, 0));
        this.f1231Q = lz0Var;
        yy0 yy0Var = new yy0(lz0Var, z);
        this.f1232R = yy0Var;
        C0149dv c0149dv = new C0149dv(2, null, 10);
        m4086w0(c0149dv);
        this.f1233S = c0149dv;
        C0095ck c0095ck = new C0095ck(um0Var, lz0Var, z2, interfaceC0386kb, new zy0(this, 1));
        m4086w0(c0095ck);
        this.f1234T = c0095ck;
        m4086w0(new gj0(yy0Var, c0948y2));
        C0277hb c0277hb = new C0277hb();
        c0277hb.f2186r = c0095ck;
        m4086w0(c0277hb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m742A0(dz0 dz0Var, C0064bq c0064bq, AbstractC0358jk abstractC0358jk) {
        C0292hq c0292hq;
        xg0 xg0Var;
        C0440lq c0440lq;
        C0064bq c0064bq2;
        C0440lq c0440lq2;
        if (abstractC0358jk instanceof C0292hq) {
            c0292hq = (C0292hq) abstractC0358jk;
            int i = c0292hq.f2349k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0292hq.f2349k = i - Integer.MIN_VALUE;
            } else {
                c0292hq = new C0292hq(dz0Var, abstractC0358jk);
            }
        }
        Object obj = c0292hq.f2347i;
        int i2 = c0292hq.f2349k;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(obj);
            C0440lq c0440lq3 = dz0Var.f1243y;
            if (c0440lq3 != null && (xg0Var = dz0Var.f1241w) != null) {
                C0403kq c0403kq = new C0403kq(c0440lq3);
                c0292hq.f2345g = c0064bq;
                c0292hq.f2349k = 1;
                if (xg0Var.m5135b(c0403kq, c0292hq) != enumC1007zk) {
                }
                return enumC1007zk;
            }
            dz0Var.f1243y = c0440lq;
            long j = c0064bq.f559a;
            return na1.f4229a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0440lq2 = c0292hq.f2346h;
            c0064bq2 = c0292hq.f2345g;
            w60.m4891M(obj);
            c0440lq = c0440lq2;
            c0064bq = c0064bq2;
            dz0Var.f1243y = c0440lq;
            long j2 = c0064bq.f559a;
            return na1.f4229a;
        }
        c0064bq = c0292hq.f2345g;
        w60.m4891M(obj);
        c0440lq = new C0440lq();
        xg0 xg0Var2 = dz0Var.f1241w;
        if (xg0Var2 != null) {
            c0292hq.f2345g = c0064bq;
            c0292hq.f2346h = c0440lq;
            c0292hq.f2349k = 2;
            if (xg0Var2.m5135b(c0440lq, c0292hq) != enumC1007zk) {
                c0064bq2 = c0064bq;
                c0440lq2 = c0440lq;
                c0440lq = c0440lq2;
                c0064bq = c0064bq2;
            }
            return enumC1007zk;
        }
        dz0Var.f1243y = c0440lq;
        long j22 = c0064bq.f559a;
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m743B0(dz0 dz0Var, C0101cq c0101cq, AbstractC0358jk abstractC0358jk) throws Throwable {
        C0328iq c0328iq;
        InterfaceC0966yk interfaceC0966yk;
        if (abstractC0358jk instanceof C0328iq) {
            c0328iq = (C0328iq) abstractC0358jk;
            int i = c0328iq.f2605j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0328iq.f2605j = i - Integer.MIN_VALUE;
            } else {
                c0328iq = new C0328iq(dz0Var, abstractC0358jk);
            }
        }
        Object obj = c0328iq.f2603h;
        int i2 = c0328iq.f2605j;
        InterfaceC0322ik interfaceC0322ik = null;
        if (i2 == 0) {
            w60.m4891M(obj);
            C0440lq c0440lq = dz0Var.f1243y;
            if (c0440lq != null) {
                xg0 xg0Var = dz0Var.f1241w;
                if (xg0Var != null) {
                    C0483mq c0483mq = new C0483mq(c0440lq);
                    c0328iq.f2602g = c0101cq;
                    c0328iq.f2605j = 1;
                    Object objM5135b = xg0Var.m5135b(c0483mq, c0328iq);
                    EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                    if (objM5135b == enumC1007zk) {
                        return enumC1007zk;
                    }
                }
            }
            interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
            if (interfaceC0966yk == null) {
                AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0154e(c0101cq, dz0Var, interfaceC0322ik, 10), 3);
                return na1.f4229a;
            }
            C0921xc.m5134o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            return null;
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c0101cq = c0328iq.f2602g;
        w60.m4891M(obj);
        dz0Var.f1243y = null;
        interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
        if (interfaceC0966yk == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static void m744F0(dz0 dz0Var, nr0 nr0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C0934xp c0934xp = dz0Var.f1218D;
        if (c0934xp == null) {
            c0934xp = new C0934xp();
            c0934xp.f7390v = null;
            c0934xp.f7391w = Long.MAX_VALUE;
            c0934xp.f7392x = false;
            dz0Var.f1218D = c0934xp;
        }
        c0934xp.f7390v = nr0Var;
        c0934xp.f7391w = j;
        q81 q81Var = dz0Var.f1223I;
        um0 um0Var = dz0Var.f1238t;
        if (q81Var == null) {
            dz0Var.f1223I = new q81(um0Var);
        } else {
            q81Var.f5087a = um0Var;
            q81Var.f5088b = j2;
        }
        c0934xp.f7392x = false;
        dz0Var.f1220F = c0934xp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m745z0(dz0 dz0Var, AbstractC0358jk abstractC0358jk) throws Throwable {
        C0255gq c0255gq;
        InterfaceC0966yk interfaceC0966yk;
        if (abstractC0358jk instanceof C0255gq) {
            c0255gq = (C0255gq) abstractC0358jk;
            int i = c0255gq.f2035i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0255gq.f2035i = i - Integer.MIN_VALUE;
            } else {
                c0255gq = new C0255gq(dz0Var, abstractC0358jk);
            }
        }
        Object obj = c0255gq.f2033g;
        int i2 = c0255gq.f2035i;
        InterfaceC0322ik interfaceC0322ik = null;
        if (i2 == 0) {
            w60.m4891M(obj);
            C0440lq c0440lq = dz0Var.f1243y;
            if (c0440lq != null) {
                xg0 xg0Var = dz0Var.f1241w;
                if (xg0Var != null) {
                    C0403kq c0403kq = new C0403kq(c0440lq);
                    c0255gq.f2035i = 1;
                    Object objM5135b = xg0Var.m5135b(c0403kq, c0255gq);
                    EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                    if (objM5135b == enumC1007zk) {
                        return enumC1007zk;
                    }
                }
            }
            C0101cq c0101cq = new C0101cq(0L, false);
            interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
            if (interfaceC0966yk == null) {
                AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0154e(c0101cq, dz0Var, interfaceC0322ik, 10), 3);
                return na1.f4229a;
            }
            C0921xc.m5134o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            return null;
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w60.m4891M(obj);
        dz0Var.f1243y = null;
        C0101cq c0101cq2 = new C0101cq(0L, false);
        interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
        if (interfaceC0966yk == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public final void m746C0() {
        C0440lq c0440lq = this.f1243y;
        if (c0440lq != null) {
            xg0 xg0Var = this.f1241w;
            if (xg0Var != null) {
                xg0Var.m5136c(new C0403kq(c0440lq));
            }
            this.f1243y = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public final void m747D0() {
        C0860vp c0860vp = this.f1216B;
        EnumC0811up enumC0811up = EnumC0811up.f6278f;
        if (c0860vp == null) {
            c0860vp = new C0860vp();
            c0860vp.f6803v = enumC0811up;
            c0860vp.f6804w = false;
            this.f1216B = c0860vp;
        }
        c0860vp.f6803v = enumC0811up;
        c0860vp.f6804w = false;
        this.f1220F = c0860vp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final void m748E0(nr0 nr0Var, long j, q81 q81Var) {
        C0897wp c0897wp = this.f1219E;
        if (c0897wp == null) {
            c0897wp = new C0897wp();
            c0897wp.f7166v = null;
            c0897wp.f7167w = Long.MAX_VALUE;
            this.f1219E = c0897wp;
        }
        c0897wp.f7166v = nr0Var;
        c0897wp.f7167w = j;
        q81Var.f5088b = 0L;
        this.f1220F = c0897wp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public final void m749G0(AbstractC0137dq abstractC0137dq) {
        if ((abstractC0137dq instanceof C0064bq) && !this.f1244z) {
            this.f1244z = true;
            m755M0();
        }
        m750H0().mo1710s(abstractC0137dq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC0470md m750H0() {
        C0834vb c0834vb = this.f1242x;
        if (c0834vb != null) {
            return c0834vb;
        }
        C0921xc.m5131l("Events channel not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.a50
    /* JADX INFO: renamed from: I */
    public final boolean mo22I(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f1240v || ((!y40.m5209a(p30.m2968D(keyEvent), y40.f7534n) && !y40.m5209a(rd0.m3472c(keyEvent.getKeyCode()), y40.f7533m)) || p30.m2971G(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f1231Q.f3624d == um0.f6264d;
        C0095ck c0095ck = this.f1234T;
        if (z) {
            int i = (int) (c0095ck.f838y & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(y40.m5209a(rd0.m3472c(keyEvent.getKeyCode()), y40.f7533m) ? i : -i)));
        } else {
            int i2 = (int) (c0095ck.f838y >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(y40.m5209a(rd0.m3472c(keyEvent.getKeyCode()), y40.f7533m) ? i2 : -i2)) << 32);
        }
        AbstractC0307i4.m1547w(m2879k0(), null, new bz0(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public final qb1 m751I0() {
        qb1 qb1Var = this.f1221G;
        if (qb1Var != null) {
            return qb1Var;
        }
        C0921xc.m5131l("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m752J0(nr0 nr0Var, long j) {
        long jMo344d = pf1.m3038P(this.f4529d).mo344d(0L);
        if (!ok0.m2931b(this.f1222H, 9205357640488583168L) && !ok0.m2931b(jMo344d, this.f1222H)) {
            this.f1225K = ok0.m2934e(this.f1225K, ok0.m2933d(jMo344d, this.f1222H));
        }
        this.f1222H = jMo344d;
        r60.m3404f(m751I0(), nr0Var, this.f1225K);
        m750H0().mo1710s(new C0027aq(j, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m753K0(nr0 nr0Var, nr0 nr0Var2, long j) {
        if (this.f1221G == null) {
            this.f1221G = new qb1();
        }
        r60.m3404f(m751I0(), nr0Var, 0L);
        long jM2933d = ok0.m2933d(nr0Var2.f4307c, j);
        this.f1225K = 0L;
        sx0 sx0Var = this.f1239u;
        int i = nr0Var.f4313i;
        sx0Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.f1244z) {
            if (this.f1242x == null) {
                this.f1242x = o30.m2765e(Integer.MAX_VALUE, 6, null);
            }
            m755M0();
        }
        this.f1222H = pf1.m3038P(this).mo344d(0L);
        m750H0().mo1710s(new C0064bq(jM2933d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final boolean m754L0() {
        lz0 lz0Var = this.f1231Q;
        if (lz0Var.f3621a.mo501b()) {
            return true;
        }
        C0343j5 c0343j5 = lz0Var.f3622b;
        if (c0343j5 == null) {
            return false;
        }
        C0182er c0182er = c0343j5.f2723c;
        EdgeEffect edgeEffect = c0182er.f1513d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2446c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c0182er.f1514e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2446c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c0182er.f1515f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2446c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c0182er.f1516g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2446c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m755M0() {
        this.f1244z = true;
        if (this.f1242x == null) {
            this.f1242x = o30.m2765e(Integer.MAX_VALUE, 6, null);
        }
        AbstractC0307i4.m1547w(m2879k0(), null, new C0364jq(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m756N0(C0343j5 c0343j5, InterfaceC0386kb interfaceC0386kb, InterfaceC0975yt interfaceC0975yt, xg0 xg0Var, um0 um0Var, ez0 ez0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f1240v != z) {
            this.f1232R.f7740e = z;
            this.f1229O.f5861r = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC0975yt interfaceC0975yt2 = interfaceC0975yt == null ? this.f1230P : interfaceC0975yt;
        lz0 lz0Var = this.f1231Q;
        if (p30.m3002l(lz0Var.f3621a, ez0Var)) {
            z4 = false;
        } else {
            lz0Var.f3621a = ez0Var;
            z4 = true;
        }
        lz0Var.f3622b = c0343j5;
        if (lz0Var.f3624d != um0Var) {
            lz0Var.f3624d = um0Var;
            z4 = true;
        }
        if (lz0Var.f3625e != z2) {
            lz0Var.f3625e = z2;
            z4 = true;
        }
        lz0Var.f3623c = interfaceC0975yt2;
        lz0Var.f3626f = this.f1228N;
        C0095ck c0095ck = this.f1234T;
        c0095ck.f831r = um0Var;
        c0095ck.f833t = z2;
        c0095ck.f834u = interfaceC0386kb;
        this.f1226L = c0343j5;
        this.f1227M = interfaceC0975yt;
        sx0 sx0Var = wy0.f7219a;
        um0 um0Var2 = lz0Var.f3624d;
        um0 um0Var3 = um0.f6264d;
        if (um0Var2 != um0Var3) {
            um0Var3 = um0.f6265e;
        }
        this.f1239u = sx0Var;
        if (this.f1240v != z) {
            this.f1240v = z;
            if (!z) {
                m746C0();
                this.f1224J = null;
            }
            z4 = true;
        }
        if (!p30.m3002l(this.f1241w, xg0Var)) {
            m746C0();
            this.f1241w = xg0Var;
        }
        if (this.f1238t != um0Var3) {
            this.f1238t = um0Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.f1215A;
            C1012zp c1012zp = C1012zp.f7977a;
            if (z6) {
                m747D0();
                if (this.f1244z) {
                    m750H0().mo1710s(c1012zp);
                }
                this.f1221G = null;
            }
            o10 o10Var = this.f1224J;
            if (o10Var != null) {
                o10Var.m2752a();
                dz0 dz0Var = o10Var.f4383a;
                if (dz0Var.f1244z) {
                    dz0Var.m749G0(c1012zp);
                }
                o10Var.f4389g = null;
                p10 p10Var = o10Var.f4393k;
                p10Var.f4693a = 0;
                p10Var.f4694b.clear();
            }
        }
        if (z3) {
            this.f1235U = null;
            this.f1236V = null;
            z60.m5417D(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        if (this.f1240v && (this.f1235U == null || this.f1236V == null)) {
            this.f1235U = new C0956ya(7, this);
            this.f1236V = new bz0(this, null);
        }
        C0956ya c0956ya = this.f1235U;
        if (c0956ya != null) {
            u40[] u40VarArr = d01.f923a;
            f01Var.mo17a(rz0.f5591d, new C0533o0(null, c0956ya));
        }
        bz0 bz0Var = this.f1236V;
        if (bz0Var != null) {
            u40[] u40VarArr2 = d01.f923a;
            f01Var.mo17a(rz0.f5592e, bz0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: U */
    public final void mo758U() {
        if (this.f1215A) {
            m747D0();
            if (this.f1244z) {
                m750H0().mo1710s(C1012zp.f7977a);
            }
            this.f1221G = null;
        }
        this.f1215A = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0694rm, p000.qr0
    /* JADX INFO: renamed from: a */
    public final void mo759a() {
        mo758U();
        if (this.f4542q) {
            InterfaceC0968ym interfaceC0968ym = pf1.m3039Q(this).f388B;
            C0856vl c0856vl = this.f1230P;
            c0856vl.getClass();
            c0856vl.f6741a = new C0478ml(new C0910x1(interfaceC0968ym));
        }
        C0215fn c0215fn = this.f1237W;
        if (c0215fn != null) {
            c0215fn.f1774e = pf1.m3039Q(this).f388B;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        if (this.f4542q) {
            InterfaceC0968ym interfaceC0968ym = pf1.m3039Q(this).f388B;
            C0856vl c0856vl = this.f1230P;
            c0856vl.getClass();
            c0856vl.f6741a = new C0478ml(new C0910x1(interfaceC0968ym));
        }
        C0215fn c0215fn = this.f1237W;
        if (c0215fn != null) {
            c0215fn.f1774e = pf1.m3039Q(this).f388B;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        this.f1244z = false;
        m746C0();
        this.f1225K = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.q10
    /* JADX INFO: renamed from: r */
    public final void mo760r() {
        o10 o10Var = this.f1224J;
        if (o10Var != null) {
            o10Var.m2752a();
            dz0 dz0Var = o10Var.f4383a;
            if (dz0Var.f1244z) {
                dz0Var.m749G0(C1012zp.f7977a);
            }
            o10Var.f4389g = null;
            p10 p10Var = o10Var.f4393k;
            p10Var.f4693a = 0;
            p10Var.f4694b.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.q10
    /* JADX INFO: renamed from: u */
    public final void mo761u(C0791u5 c0791u5, jr0 jr0Var) {
        Object obj;
        Object obj2;
        float f;
        Object obj3;
        char c;
        float fIntBitsToFloat;
        Object obj4;
        Object obj5;
        int i = c0791u5.f6134a;
        ArrayList arrayList = (ArrayList) c0791u5.f6135b;
        if (this.f1240v) {
            if (this.f1224J == null) {
                this.f1224J = new o10(this);
            }
            o10 o10Var = this.f1224J;
            if (o10Var != null) {
                dz0 dz0Var = o10Var.f4383a;
                if (o10Var.f4388f == null) {
                    j10 j10Var = o10Var.f4384b;
                    if (j10Var == null) {
                        j10Var = new j10();
                        j10Var.f2656t = i10.f2393f;
                        j10Var.f2657u = false;
                        o10Var.f4384b = j10Var;
                    }
                    o10Var.f4388f = j10Var;
                }
                rd0 rd0Var = o10Var.f4388f;
                if (rd0Var == null) {
                    C0921xc.m5131l("currentDragState should not be null");
                    return;
                }
                boolean z = rd0Var instanceof j10;
                jr0 jr0Var2 = jr0.f2933d;
                boolean z2 = true;
                jr0 jr0Var3 = jr0.f2934e;
                if (z) {
                    j10 j10Var2 = (j10) rd0Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        h10 h10Var = (h10) arrayList.get(i2);
                        if (h10Var.f2121h || !h10Var.f2117d) {
                            return;
                        }
                    }
                    h10 h10Var2 = (h10) AbstractC0960ye.m5240J(arrayList);
                    int i3 = n10.f4117a[j10Var2.f2656t.ordinal()];
                    i10 i10Var = i10.f2392e;
                    i10 i10Var2 = i10.f2391d;
                    i10 i10Var3 = i3 == 1 ? !dz0Var.m754L0() ? i10Var2 : i10Var : j10Var2.f2656t;
                    j10Var2.f2656t = i10Var3;
                    if (jr0Var == jr0Var2 && i10Var3 == i10Var) {
                        h10Var2.f2122i = true;
                        j10Var2.f2657u = true;
                    }
                    if (jr0Var == jr0Var3) {
                        if (i10Var3 == i10Var2) {
                            o10.m2751c(o10Var, h10Var2, h10Var2.f2114a, 0L, 12);
                            return;
                        }
                        if (j10Var2.f2657u) {
                            o10Var.m2756f(h10Var2, h10Var2, new g10(i), 0L);
                            o10Var.m2755e(h10Var2, new g10(i), 0L);
                            long j = h10Var2.f2114a;
                            m10 m10Var = o10Var.f4385c;
                            if (m10Var == null) {
                                m10Var = new m10();
                                m10Var.f3777t = Long.MAX_VALUE;
                                o10Var.f4385c = m10Var;
                            }
                            m10Var.f3777t = j;
                            o10Var.f4388f = m10Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = rd0Var instanceof l10;
                jr0 jr0Var4 = jr0.f2935f;
                if (!z3) {
                    if (rd0Var instanceof k10) {
                        k10 k10Var = (k10) rd0Var;
                        if (jr0Var != jr0Var4) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            }
                            if (((h10) arrayList.get(i4)).f2122i) {
                                z2 = false;
                                break;
                            }
                            i4++;
                        }
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                break;
                            }
                            if (!((h10) arrayList.get(i5)).f2117d) {
                                i5++;
                            } else if (!arrayList.isEmpty()) {
                                if (z2) {
                                    long jM4024K = s91.m4024K((h10) AbstractC0960ye.m5240J(arrayList), dz0Var.f1238t, new g10(i));
                                    h10 h10Var3 = k10Var.f2985t;
                                    h10Var3.getClass();
                                    long jM2933d = ok0.m2933d(jM4024K, s91.m4024K(h10Var3, dz0Var.f1238t, new g10(i)));
                                    h10 h10Var4 = k10Var.f2985t;
                                    if (h10Var4 != null) {
                                        o10.m2751c(o10Var, h10Var4, k10Var.f2986u, jM2933d, 8);
                                        return;
                                    } else {
                                        C0921xc.m5131l("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        o10Var.m2752a();
                        return;
                    }
                    if (!(rd0Var instanceof m10)) {
                        C0921xc.m5129j();
                        return;
                    }
                    m10 m10Var2 = (m10) rd0Var;
                    if (jr0Var != jr0Var3) {
                        return;
                    }
                    long j2 = m10Var2.f3777t;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (z60.m5449s(((h10) obj).f2114a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    h10 h10Var5 = (h10) obj;
                    if (h10Var5 == null) {
                        return;
                    }
                    boolean zM4042g = s91.m4042g(h10Var5);
                    C1012zp c1012zp = C1012zp.f7977a;
                    if (!zM4042g) {
                        if (h10Var5.f2122i) {
                            dz0Var.m749G0(c1012zp);
                            return;
                        }
                        um0 um0Var = dz0Var.f1238t;
                        g10 g10Var = new g10(i);
                        if (ok0.m2932c(ok0.m2933d(s91.m4024K(h10Var5, um0Var, g10Var), s91.m4025L(h10Var5, um0Var, g10Var))) == 0.0f) {
                            return;
                        }
                        um0 um0Var2 = dz0Var.f1238t;
                        g10 g10Var2 = new g10(i);
                        o10Var.m2755e(h10Var5, new g10(i), h10Var5.f2122i ? 0L : ok0.m2933d(s91.m4024K(h10Var5, um0Var2, g10Var2), s91.m4025L(h10Var5, um0Var2, g10Var2)));
                        h10Var5.f2122i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i7);
                        if (((h10) obj2).f2117d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    h10 h10Var6 = (h10) obj2;
                    if (h10Var6 != null) {
                        m10Var2.f3777t = h10Var6.f2114a;
                        return;
                    }
                    if (h10Var5.f2122i || !s91.m4042g(h10Var5)) {
                        dz0Var.m749G0(c1012zp);
                    } else {
                        s91.m4041f(o10Var.m2754d(), h10Var5, dz0Var.f1238t, new g10(i), o10Var.f4392j, o10Var.f4394l);
                        float fMo2688a = ((nc1) pf1.m3058r(dz0Var, AbstractC0131dj.f1132s)).mo2688a();
                        long jM3211d = o10Var.m2754d().m3211d(g60.m1203b(fMo2688a, fMo2688a));
                        C0620pm c0620pm = (C0620pm) o10Var.m2754d().f5106d;
                        tb1 tb1Var = c0620pm.f4925a;
                        C0323il[] c0323ilArr = tb1Var.f5976d;
                        Arrays.fill(c0323ilArr, 0, c0323ilArr.length, (Object) null);
                        tb1Var.f5977e = 0;
                        tb1 tb1Var2 = c0620pm.f4926b;
                        C0323il[] c0323ilArr2 = tb1Var2.f5976d;
                        Arrays.fill(c0323ilArr2, 0, c0323ilArr2.length, (Object) null);
                        tb1Var2.f5977e = 0;
                        c0620pm.f4927c = 0L;
                        dz0Var.m749G0(new C0101cq(AbstractC0560oq.m2939a(jM3211d), true));
                    }
                    o10Var.m2752a();
                    return;
                }
                l10 l10Var = (l10) rd0Var;
                if (jr0Var == jr0Var2) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        f = 0.0f;
                        obj3 = null;
                        break;
                    }
                    Object obj6 = arrayList.get(i8);
                    f = 0.0f;
                    if (z60.m5449s(((h10) obj6).f2114a, l10Var.f3307u)) {
                        obj3 = obj6;
                        break;
                    }
                    i8++;
                }
                h10 h10Var7 = (h10) obj3;
                if (h10Var7 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i9);
                        if (((h10) obj5).f2117d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    h10Var7 = (h10) obj5;
                    if (h10Var7 == null) {
                        o10Var.m2752a();
                        return;
                    }
                    l10Var.f3307u = h10Var7.f2114a;
                }
                h10 h10Var8 = h10Var7;
                if (jr0Var == jr0Var3) {
                    if (h10Var8.f2122i) {
                        h10 h10Var9 = l10Var.f3306t;
                        if (h10Var9 == null) {
                            C0921xc.m5131l("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = l10Var.f3307u;
                        q81 q81Var = o10Var.f4391i;
                        if (q81Var == null) {
                            C0921xc.m5131l("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        o10Var.m2753b(h10Var9, j3, q81Var);
                    } else if (s91.m4042g(h10Var8)) {
                        int size8 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                obj4 = null;
                                break;
                            }
                            Object obj7 = arrayList.get(i10);
                            if (((h10) obj7).f2117d) {
                                obj4 = obj7;
                                break;
                            }
                            i10++;
                        }
                        h10 h10Var10 = (h10) obj4;
                        if (h10Var10 == null) {
                            o10Var.m2752a();
                        } else {
                            l10Var.f3307u = h10Var10.f2114a;
                        }
                    } else {
                        nc1 nc1Var = (nc1) pf1.m3058r(dz0Var, AbstractC0131dj.f1132s);
                        float f2 = AbstractC0181eq.f1503a;
                        float fMo2691d = nc1Var.mo2691d();
                        q81 q81Var2 = o10Var.f4391i;
                        if (q81Var2 == null) {
                            C0921xc.m5131l("Touch slop detector not initialized.");
                            return;
                        }
                        long jM4024K2 = s91.m4024K(h10Var8, dz0Var.f1238t, new g10(i));
                        um0 um0Var3 = dz0Var.f1238t;
                        long jFloatToRawIntBits = h10Var8.f2120g;
                        if (um0Var3 != null) {
                            if (i == 1) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                c = ' ';
                            } else {
                                c = ' ';
                                if (i == 2) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                }
                            }
                            jFloatToRawIntBits = um0Var3 == um0.f6265e ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(f)) & 4294967295L) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << c);
                        }
                        long jM3208a = q81Var2.m3208a(jM4024K2, jFloatToRawIntBits, fMo2691d);
                        if ((9223372034707292159L & jM3208a) != 9205357640488583168L) {
                            h10Var8.f2122i = true;
                            h10 h10Var11 = l10Var.f3306t;
                            h10Var11.getClass();
                            o10Var.m2756f(h10Var11, h10Var8, new g10(i), jM3208a);
                            o10Var.m2755e(h10Var8, new g10(i), jM3208a);
                            long j4 = h10Var8.f2114a;
                            m10 m10Var3 = o10Var.f4385c;
                            if (m10Var3 == null) {
                                m10Var3 = new m10();
                                m10Var3.f3777t = Long.MAX_VALUE;
                                o10Var.f4385c = m10Var3;
                            }
                            m10Var3.f3777t = j4;
                            o10Var.f4388f = m10Var3;
                        } else {
                            l10Var.f3308v = true;
                        }
                    }
                }
                if (jr0Var == jr0Var4 && l10Var.f3308v) {
                    if (!h10Var8.f2122i) {
                        l10Var.f3308v = false;
                        return;
                    }
                    h10 h10Var12 = l10Var.f3306t;
                    if (h10Var12 == null) {
                        C0921xc.m5131l("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = l10Var.f3307u;
                    q81 q81Var3 = o10Var.f4391i;
                    if (q81Var3 != null) {
                        o10Var.m2753b(h10Var12, j5, q81Var3);
                    } else {
                        C0921xc.m5131l("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    @Override // p000.qr0
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo762x(ir0 ir0Var, jr0 jr0Var, long j) {
        jr0 jr0Var2;
        jr0 jr0Var3;
        jr0 jr0Var4;
        ir0 ir0Var2;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        dz0 dz0Var = this;
        ir0 ir0Var3 = ir0Var;
        jr0 jr0Var5 = jr0Var;
        List list = ir0Var3.f2610a;
        List list2 = ir0Var3.f2610a;
        int size = list.size();
        int i = 0;
        while (true) {
            jr0Var2 = jr0.f2934e;
            jr0Var3 = jr0.f2933d;
            if (i >= size) {
                break;
            }
            nr0 nr0Var = (nr0) list.get(i);
            sx0 sx0Var = dz0Var.f1239u;
            int i2 = nr0Var.f4313i;
            sx0Var.getClass();
            if (i2 == 2) {
                i++;
                ir0Var3 = ir0Var;
            } else {
                dz0Var.f1215A = true;
                if (!dz0Var.f1240v) {
                    break;
                }
                if (dz0Var.f1220F == null) {
                    C0860vp c0860vp = dz0Var.f1216B;
                    if (c0860vp == null) {
                        c0860vp = new C0860vp();
                        c0860vp.f6803v = EnumC0811up.f6278f;
                        c0860vp.f6804w = false;
                        dz0Var.f1216B = c0860vp;
                    }
                    dz0Var.f1220F = c0860vp;
                }
                AbstractC0307i4 abstractC0307i4 = dz0Var.f1220F;
                if (abstractC0307i4 == null) {
                    C0921xc.m5131l("currentDragState should not be null");
                    return;
                }
                if (abstractC0307i4 instanceof C0860vp) {
                    C0860vp c0860vp2 = (C0860vp) abstractC0307i4;
                    if (!list.isEmpty() && m61.m2440d(ir0Var3, false)) {
                        nr0 nr0Var2 = (nr0) AbstractC0960ye.m5240J(list);
                        int i3 = AbstractC0218fq.f1795a[c0860vp2.f6803v.ordinal()];
                        EnumC0811up enumC0811up = EnumC0811up.f6277e;
                        EnumC0811up enumC0811up2 = EnumC0811up.f6276d;
                        EnumC0811up enumC0811up3 = i3 == 1 ? !dz0Var.m754L0() ? enumC0811up2 : enumC0811up : c0860vp2.f6803v;
                        c0860vp2.f6803v = enumC0811up3;
                        if (jr0Var5 == jr0Var3 && enumC0811up3 == enumC0811up) {
                            nr0Var2.m2736a();
                            c0860vp2.f6804w = true;
                        }
                        if (jr0Var5 == jr0Var2) {
                            if (enumC0811up3 == enumC0811up2) {
                                m744F0(dz0Var, nr0Var2, nr0Var2.f4305a, 0L, 12);
                            } else if (c0860vp2.f6804w) {
                                dz0Var.m753K0(nr0Var2, nr0Var2, 0L);
                                dz0Var.m752J0(nr0Var2, 0L);
                                long j2 = nr0Var2.f4305a;
                                C0971yp c0971yp = dz0Var.f1217C;
                                if (c0971yp == null) {
                                    c0971yp = new C0971yp();
                                    c0971yp.f7673v = Long.MAX_VALUE;
                                    dz0Var.f1217C = c0971yp;
                                }
                                c0971yp.f7673v = j2;
                                dz0Var.f1220F = c0971yp;
                            }
                        }
                    }
                } else {
                    boolean z2 = abstractC0307i4 instanceof C0934xp;
                    jr0 jr0Var6 = jr0.f2935f;
                    if (z2) {
                        C0934xp c0934xp = (C0934xp) abstractC0307i4;
                        if (jr0Var5 != jr0Var3) {
                            int size2 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    jr0Var4 = jr0Var2;
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i4);
                                jr0Var4 = jr0Var2;
                                if (z60.m5449s(((nr0) obj3).f4305a, c0934xp.f7391w)) {
                                    break;
                                }
                                i4++;
                                jr0Var2 = jr0Var4;
                            }
                            nr0 nr0Var3 = (nr0) obj3;
                            if (nr0Var3 == null) {
                                int size3 = list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = list.get(i5);
                                    if (((nr0) obj5).f4308d) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                nr0Var3 = (nr0) obj5;
                                if (nr0Var3 == null) {
                                    dz0Var.m747D0();
                                } else {
                                    c0934xp.f7391w = nr0Var3.f4305a;
                                    if (jr0Var5 != jr0Var4) {
                                        jr0Var5 = jr0Var;
                                        if (jr0Var5 == jr0Var6 && c0934xp.f7392x) {
                                            if (nr0Var3.m2737b()) {
                                                nr0 nr0Var4 = c0934xp.f7390v;
                                                if (nr0Var4 == null) {
                                                    C0921xc.m5131l("AwaitTouchSlop.initialDown was not initialized");
                                                    return;
                                                }
                                                long j3 = c0934xp.f7391w;
                                                q81 q81Var = dz0Var.f1223I;
                                                if (q81Var == null) {
                                                    C0921xc.m5131l("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                    return;
                                                }
                                                dz0Var.m748E0(nr0Var4, j3, q81Var);
                                            } else {
                                                c0934xp.f7392x = false;
                                            }
                                        }
                                    } else {
                                        if (nr0Var3.m2737b()) {
                                            nr0 nr0Var5 = c0934xp.f7390v;
                                            if (nr0Var5 == null) {
                                                C0921xc.m5131l("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            long j4 = c0934xp.f7391w;
                                            q81 q81Var2 = dz0Var.f1223I;
                                            if (q81Var2 == null) {
                                                C0921xc.m5131l("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            dz0Var.m748E0(nr0Var5, j4, q81Var2);
                                        } else if (w60.m4904k(nr0Var3)) {
                                            int size4 = list.size();
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 >= size4) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = list.get(i6);
                                                if (((nr0) obj4).f4308d) {
                                                    break;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            nr0 nr0Var6 = (nr0) obj4;
                                            if (nr0Var6 == null) {
                                                dz0Var.m747D0();
                                            } else {
                                                c0934xp.f7391w = nr0Var6.f4305a;
                                            }
                                            if (jr0Var5 == jr0Var6) {
                                            }
                                        } else {
                                            float fM953a = AbstractC0181eq.m953a((nc1) pf1.m3058r(dz0Var, AbstractC0131dj.f1132s), nr0Var3.f4313i);
                                            q81 q81Var3 = dz0Var.f1223I;
                                            if (q81Var3 == null) {
                                                C0921xc.m5131l("Touch slop detector not initialized.");
                                                return;
                                            }
                                            long jM3208a = q81Var3.m3208a(nr0Var3.f4307c, nr0Var3.f4311g, fM953a);
                                            if ((9223372034707292159L & jM3208a) != 9205357640488583168L) {
                                                nr0Var3.m2736a();
                                                nr0 nr0Var7 = c0934xp.f7390v;
                                                nr0Var7.getClass();
                                                dz0Var.m753K0(nr0Var7, nr0Var3, jM3208a);
                                                dz0Var.m752J0(nr0Var3, jM3208a);
                                                long j5 = nr0Var3.f4305a;
                                                C0971yp c0971yp2 = dz0Var.f1217C;
                                                if (c0971yp2 == null) {
                                                    c0971yp2 = new C0971yp();
                                                    c0971yp2.f7673v = Long.MAX_VALUE;
                                                    dz0Var.f1217C = c0971yp2;
                                                }
                                                c0971yp2.f7673v = j5;
                                                dz0Var.f1220F = c0971yp2;
                                            } else {
                                                c0934xp.f7392x = true;
                                            }
                                        }
                                        jr0Var5 = jr0Var;
                                        if (jr0Var5 == jr0Var6) {
                                        }
                                    }
                                }
                            } else if (jr0Var5 != jr0Var4) {
                            }
                        }
                    } else {
                        jr0Var4 = jr0Var2;
                        if (abstractC0307i4 instanceof C0897wp) {
                            C0897wp c0897wp = (C0897wp) abstractC0307i4;
                            if (jr0Var5 == jr0Var6) {
                                int size5 = list.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size5) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((nr0) list.get(i7)).m2737b()) {
                                            z = false;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                int size6 = list.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size6) {
                                        break;
                                    }
                                    if (!((nr0) list.get(i8)).f4308d) {
                                        i8++;
                                    } else {
                                        if (list.isEmpty()) {
                                            break;
                                        }
                                        if (z) {
                                            long j6 = ((nr0) AbstractC0960ye.m5240J(list)).f4307c;
                                            nr0 nr0Var8 = c0897wp.f7166v;
                                            nr0Var8.getClass();
                                            long jM2933d = ok0.m2933d(j6, nr0Var8.f4307c);
                                            nr0 nr0Var9 = c0897wp.f7166v;
                                            if (nr0Var9 == null) {
                                                C0921xc.m5131l("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                            m744F0(dz0Var, nr0Var9, c0897wp.f7167w, jM2933d, 8);
                                        }
                                    }
                                }
                                dz0Var.m747D0();
                            }
                        } else {
                            if (!(abstractC0307i4 instanceof C0971yp)) {
                                C0921xc.m5129j();
                                return;
                            }
                            C0971yp c0971yp3 = (C0971yp) abstractC0307i4;
                            if (jr0Var5 == jr0Var4) {
                                long j7 = c0971yp3.f7673v;
                                int size7 = list.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size7) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list.get(i9);
                                    if (z60.m5449s(((nr0) obj).f4305a, j7)) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                nr0 nr0Var10 = (nr0) obj;
                                if (nr0Var10 != null) {
                                    boolean zM4904k = w60.m4904k(nr0Var10);
                                    C1012zp c1012zp = C1012zp.f7977a;
                                    if (zM4904k) {
                                        int size8 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size8) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = list.get(i10);
                                            if (((nr0) obj2).f4308d) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                        nr0 nr0Var11 = (nr0) obj2;
                                        if (nr0Var11 == null) {
                                            if (nr0Var10.m2737b() || !w60.m4904k(nr0Var10)) {
                                                dz0Var.m750H0().mo1710s(c1012zp);
                                            } else {
                                                r60.m3404f(dz0Var.m751I0(), nr0Var10, 0L);
                                                float fMo2688a = ((nc1) pf1.m3058r(dz0Var, AbstractC0131dj.f1132s)).mo2688a();
                                                long jM3211d = dz0Var.m751I0().m3211d(g60.m1203b(fMo2688a, fMo2688a));
                                                C0620pm c0620pm = (C0620pm) dz0Var.m751I0().f5106d;
                                                tb1 tb1Var = c0620pm.f4925a;
                                                C0323il[] c0323ilArr = tb1Var.f5976d;
                                                Arrays.fill(c0323ilArr, 0, c0323ilArr.length, (Object) null);
                                                tb1Var.f5977e = 0;
                                                tb1 tb1Var2 = c0620pm.f4926b;
                                                C0323il[] c0323ilArr2 = tb1Var2.f5976d;
                                                Arrays.fill(c0323ilArr2, 0, c0323ilArr2.length, (Object) null);
                                                tb1Var2.f5977e = 0;
                                                c0620pm.f4927c = 0L;
                                                dz0Var.m750H0().mo1710s(new C0101cq(AbstractC0560oq.m2939a(jM3211d), false));
                                                dz0Var.f1215A = false;
                                            }
                                            dz0Var.m747D0();
                                        } else {
                                            c0971yp3.f7673v = nr0Var11.f4305a;
                                        }
                                    } else if (nr0Var10.m2737b()) {
                                        dz0Var.m750H0().mo1710s(c1012zp);
                                    } else if (ok0.m2932c(w60.m4883E(nr0Var10, true)) != 0.0f) {
                                        dz0Var.m752J0(nr0Var10, w60.m4883E(nr0Var10, false));
                                        nr0Var10.m2736a();
                                    }
                                }
                            }
                        }
                    }
                }
                jr0Var4 = jr0Var2;
            }
        }
        jr0Var4 = jr0Var2;
        if (dz0Var.f1240v) {
            if (jr0Var5 == jr0Var3 && ir0Var.f2613d == 6) {
                if (dz0Var.f1237W == null) {
                    if (!dz0Var.f4529d.f4542q) {
                        w10.m4824b("Cannot get View because the Modifier node is not currently attached.");
                    }
                    C0910x1 c0910x1 = new C0910x1(1, ViewConfiguration.get(((View) e60.m789a(pf1.m3039Q(dz0Var))).getContext()));
                    ir0Var2 = ir0Var;
                    dz0Var = this;
                    dz0Var.f1237W = new C0215fn(dz0Var.f1231Q, c0910x1, new C0431lh(2, this, dz0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), pf1.m3039Q(dz0Var).f388B);
                } else {
                    ir0Var2 = ir0Var;
                }
                C0215fn c0215fn = dz0Var.f1237W;
                if (c0215fn != null) {
                    InterfaceC0966yk interfaceC0966ykM2879k0 = dz0Var.m2879k0();
                    if (((r31) c0215fn.f1776g) == null) {
                        c0215fn.f1776g = AbstractC0307i4.m1547w(interfaceC0966ykM2879k0, null, new C0154e(c0215fn, null, 7), 3);
                    }
                }
            } else {
                ir0Var2 = ir0Var;
            }
            C0215fn c0215fn2 = dz0Var.f1237W;
            if (c0215fn2 == null || ir0Var2.f2613d != 6) {
                return;
            }
            int size9 = list.size();
            for (int i11 = 0; i11 < size9; i11++) {
                if (((nr0) list.get(i11)).m2737b()) {
                    return;
                }
            }
            if (jr0Var5 == jr0Var3 && c0215fn2.f1770a) {
                c0215fn2.m1167d(ir0Var2);
                int size10 = list2.size();
                for (int i12 = 0; i12 < size10; i12++) {
                    ((nr0) list2.get(i12)).m2736a();
                }
            }
            if (jr0Var5 == jr0Var4 && !c0215fn2.f1770a && c0215fn2.m1167d(ir0Var2)) {
                int size11 = list2.size();
                for (int i13 = 0; i13 < size11; i13++) {
                    ((nr0) list2.get(i13)).m2736a();
                }
            }
        }
    }
}
