package p000;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0910x1 implements InterfaceC0662qr, fv0, ss0, InterfaceC0296hu, InterfaceC0082c8 {

    /* JADX INFO: renamed from: f */
    public static final C0910x1 f7230f = new C0910x1(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7231d;

    /* JADX INFO: renamed from: e */
    public Object f7232e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0910x1(int i) {
        this.f7231d = i;
        switch (i) {
            case 8:
                this.f7232e = new h31(rd0.f5366e);
                break;
            case 13:
                bd0 bd0Var = new bd0();
                this.f7232e = bd0Var;
                if (!bd0Var.f496e) {
                    if (bd0Var.f497f) {
                        xr0.m5148a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    bd0Var.m349a();
                    bd0Var.f497f = true;
                    break;
                }
                break;
            case 14:
                this.f7232e = new LinkedHashMap(0, 0.75f, true);
                break;
            case 16:
                this.f7232e = new ArrayList(32);
                break;
            case 18:
                this.f7232e = new jo0(4);
                break;
            case 19:
                this.f7232e = new ub0();
                break;
            case 24:
                this.f7232e = new Region();
                break;
            default:
                this.f7232e = new C0041b3();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static c80 m5065t(C0910x1 c0910x1, int i) {
        c90 c90Var = (c90) c0910x1.f7232e;
        l21 l21VarM4270k = u50.m4270k();
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
        try {
            v80 v80Var = (v80) c90Var.f744f.getValue();
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            return c90Var.f754p.m660a(i, v80Var.f6454j, c90Var.f742d, new C0621pn(i, v80Var));
        } catch (Throwable th) {
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0662qr
    /* JADX INFO: renamed from: a */
    public void mo3324a(final s91 s91Var) {
        ThreadFactoryC0248gj threadFactoryC0248gj = new ThreadFactoryC0248gj("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC0248gj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: tr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                C0910x1 c0910x1 = this.f6035d;
                s91 s91Var2 = s91Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    C0780tv c0780tvM3482k = rd0.m3482k((Context) c0910x1.f7232e);
                    if (c0780tvM3482k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0741sv c0741sv = (C0741sv) c0780tvM3482k.f6052a;
                    synchronized (c0741sv.f5841g) {
                        c0741sv.f5843i = threadPoolExecutor2;
                    }
                    c0780tvM3482k.f6052a.mo3324a(new C0813ur(s91Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    s91Var2.mo2734H(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        C0785u c0785u;
        mw0 mw0Var;
        if (interfaceC0322ik instanceof C0785u) {
            c0785u = (C0785u) interfaceC0322ik;
            int i = c0785u.f6081j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0785u.f6081j = i - Integer.MIN_VALUE;
            } else {
                c0785u = new C0785u(this, interfaceC0322ik);
            }
        }
        Object obj = c0785u.f6079h;
        int i2 = c0785u.f6081j;
        na1 na1Var = na1.f4229a;
        if (i2 != 0) {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mw0Var = c0785u.f6078g;
            try {
                w60.m4891M(obj);
                mw0Var.mo1718n();
                return na1Var;
            } catch (Throwable th) {
                th = th;
                mw0Var.mo1718n();
                throw th;
            }
        }
        w60.m4891M(obj);
        mw0 mw0Var2 = new mw0(interfaceC0331iu, c0785u.mo540e());
        try {
            c0785u.f6078g = mw0Var2;
            c0785u.f6081j = 1;
            try {
                Object objInvoke = ((InterfaceC0904ww) this.f7232e).invoke(mw0Var2, c0785u);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objInvoke != enumC1007zk) {
                    objInvoke = na1Var;
                }
                if (objInvoke == enumC1007zk) {
                    return enumC1007zk;
                }
                mw0Var = mw0Var2;
                mw0Var.mo1718n();
                return na1Var;
            } catch (Throwable th2) {
                th = th2;
                mw0Var = mw0Var2;
                mw0Var.mo1718n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ss0
    /* JADX INFO: renamed from: d */
    public void mo1736d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m5066e(b60 b60Var) {
        if (!b60Var.m272H()) {
            w10.m4824b("DepthSortedSet.add called on an unattached node");
        }
        ((h31) this.f7232e).add(b60Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ss0
    /* JADX INFO: renamed from: f */
    public void mo1737f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f7232e).setResultCode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m5067g() {
        ((ArrayList) this.f7232e).add(lp0.f3578b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0082c8
    public InterfaceC0185eu get(int i) {
        switch (this.f7231d) {
            case 28:
                return ((C0222fu[]) this.f7232e)[i];
            default:
                return (C0222fu) this.f7232e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m5068h() {
        ((AbstractC0727si) this.f7232e).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public w31 m5069i() {
        C0699rr c0699rrM3981a = C0699rr.m3981a();
        if (c0699rrM3981a.m3982b() == 1) {
            return new v00(true);
        }
        gp0 gp0VarM3419u = r60.m3419u(Boolean.FALSE);
        C1008zl c1008zl = new C1008zl(gp0VarM3419u, this);
        c0699rrM3981a.f5540a.writeLock().lock();
        try {
            if (c0699rrM3981a.f5542c == 1 || c0699rrM3981a.f5542c == 2) {
                c0699rrM3981a.f5543d.post(new RunnableC0625pr(Arrays.asList(c1008zl), c0699rrM3981a.f5542c, null));
            } else {
                c0699rrM3981a.f5541b.add(c1008zl);
            }
            c0699rrM3981a.f5540a.writeLock().unlock();
            return gp0VarM3419u;
        } catch (Throwable th) {
            c0699rrM3981a.f5540a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m5070j(float f) {
        ((ArrayList) this.f7232e).add(new sp0(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m5071k(float f, float f2, float f3, float f4) {
        C0541o8 c0541o8 = (C0541o8) this.f7232e;
        InterfaceC0051bd interfaceC0051bdM2802f = c0541o8.m2802f();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0541o8.m2803h() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0541o8.m2803h() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            v10.m4364a("Width and height must be greater than or equal to zero");
        }
        c0541o8.m2812q(jFloatToRawIntBits);
        interfaceC0051bdM2802f.mo239e(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public long m5072l() {
        switch (this.f7231d) {
            case 7:
                C0808um c0808um = (C0808um) this.f7232e;
                long jM5072l = c0808um.f6262w.m5072l();
                if (jM5072l != 16) {
                    return jM5072l;
                }
                rv0 rv0Var = (rv0) pf1.m3058r(c0808um, uv0.f6312a);
                if (rv0Var != null) {
                    long j = rv0Var.f5561a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((C0207ff) pf1.m3058r(c0808um, AbstractC0928xj.f7352a)).f1709a;
            default:
                return ((wv0) this.f7232e).f7197c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m5073m(float f, float f2) {
        ((ArrayList) this.f7232e).add(new op0(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m5074n(float f, float f2) {
        ((ArrayList) this.f7232e).add(new tp0(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m5075o(float f, float f2) {
        ((ArrayList) this.f7232e).add(new pp0(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m5076p(View view, int i, boolean z) {
        ((AutofillManager) this.f7232e).notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public C0111d m5077q(C0111d c0111d, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        Object obj;
        long j;
        boolean z;
        long jM4847D;
        ub0 ub0Var = (ub0) this.f7232e;
        List list = (List) c0111d.f919e;
        ub0 ub0Var2 = new ub0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            pr0 pr0Var = (pr0) list.get(i);
            long j2 = pr0Var.f4948a;
            int iM2771k = o30.m2771k(ub0Var.f6186e, ub0Var.f6188g, j2);
            if (iM2771k < 0 || (obj = ub0Var.f6187f[iM2771k]) == rd0.f5372k) {
                obj = null;
            }
            or0 or0Var = (or0) obj;
            if (or0Var == null) {
                j = pr0Var.f4949b;
                jM4847D = pr0Var.f4951d;
                z = false;
            } else {
                j = or0Var.f4612a;
                z = or0Var.f4614c;
                jM4847D = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4847D(or0Var.f4613b);
            }
            long j3 = pr0Var.f4948a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            ub0Var2.m4295b(j3, new nr0(j3, pr0Var.f4949b, pr0Var.f4951d, pr0Var.f4952e, pr0Var.f4953f, j, jM4847D, z, pr0Var.f4954g, pr0Var.f4956i, pr0Var.f4957j, pr0Var.f4958k));
            boolean z2 = pr0Var.f4952e;
            if (z2) {
                ub0Var.m4295b(j2, new or0(pr0Var.f4949b, pr0Var.f4950c, z2));
            } else {
                ub0Var.m4296c(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new C0111d(5, ub0Var2, c0111d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public boolean m5078r(b60 b60Var) {
        if (!b60Var.m272H()) {
            w10.m4824b("DepthSortedSet.remove called on an unattached node");
        }
        return ((h31) this.f7232e).remove(b60Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m5079s(float f, float f2, long j) {
        InterfaceC0051bd interfaceC0051bdM2802f = ((C0541o8) this.f7232e).m2802f();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC0051bdM2802f.mo239e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC0051bdM2802f.mo235a(f, f2);
        interfaceC0051bdM2802f.mo239e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f7231d) {
            case 0:
                return "Bradford";
            case 8:
                return ((h31) this.f7232e).toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m5080u(float f, float f2) {
        ((C0541o8) this.f7232e).m2802f().mo239e(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public void m5081v(float f) {
        ((ArrayList) this.f7232e).add(new vp0(f));
    }

    public C0910x1(InterfaceC0968ym interfaceC0968ym) {
        this.f7231d = 26;
        this.f7232e = new C0031au(m31.f3801a, interfaceC0968ym);
    }

    public /* synthetic */ C0910x1(int i, Object obj) {
        this.f7231d = i;
        this.f7232e = obj;
    }

    public C0910x1(long[] jArr) {
        yg0 yg0Var;
        this.f7231d = 25;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            yg0Var = new yg0(jArrCopyOf.length);
            int i = yg0Var.f7622b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = yg0Var.f7621a;
                    if (jArr2.length < length) {
                        yg0Var.f7621a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = yg0Var.f7621a;
                    int i2 = yg0Var.f7622b;
                    if (i != i2) {
                        AbstractC0201f9.m1056b0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    AbstractC0201f9.m1056b0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    yg0Var.f7622b += jArrCopyOf.length;
                }
            } else {
                C0921xc.m5125f("");
                throw null;
            }
        } else {
            yg0Var = new yg0(16);
        }
        this.f7232e = yg0Var;
    }

    public C0910x1(Context context) {
        this.f7231d = 11;
        this.f7232e = context.getApplicationContext();
    }

    public C0910x1(float f, float f2, AbstractC0046b8 abstractC0046b8) {
        this.f7231d = 28;
        int iMo27b = abstractC0046b8.mo27b();
        C0222fu[] c0222fuArr = new C0222fu[iMo27b];
        for (int i = 0; i < iMo27b; i++) {
            c0222fuArr[i] = new C0222fu(f, f2, abstractC0046b8.mo26a(i));
        }
        this.f7232e = c0222fuArr;
    }

    public C0910x1(float f, float f2) {
        this.f7231d = 29;
        this.f7232e = new C0222fu(f, f2, 0.01f);
    }
}
