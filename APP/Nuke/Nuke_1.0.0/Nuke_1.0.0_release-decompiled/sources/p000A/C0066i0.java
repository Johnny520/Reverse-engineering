package p000A;

import android.content.Context;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import me.dartcv.nuke.BuildConfig;
import p002A1.AbstractC0142o;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p007B0.C0190d;
import p007B0.C0209w;
import p007B0.C0210x;
import p007B0.C0211y;
import p013C0.C0235b;
import p023E0.AbstractC0277a;
import p027E4.InterfaceC0327n;
import p041H0.AbstractC0601k;
import p041H0.C0550A0;
import p041H0.C0564I;
import p047I0.AbstractC0713b;
import p047I0.C0695S0;
import p047I0.InterfaceC0693R0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p049I2.C0793k;
import p076P.AbstractC1074U;
import p076P.AbstractC1107t;
import p076P.C1071Q;
import p076P.C1075V;
import p076P.C1111x;
import p078P1.C1147i;
import p078P1.InterfaceC1140b;
import p088R1.C1212m;
import p088R1.C1213n;
import p088R1.C1218s;
import p088R1.RunnableC1209j;
import p093S1.C1294f;
import p095T.AbstractC1385s;
import p095T.AbstractC1391v;
import p097T1.C1416e;
import p107V1.C1504c;
import p107V1.C1515n;
import p107V1.C1524w;
import p107V1.C1527z;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p110W0.C1577b;
import p111W1.C1595a;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1687I;
import p118X3.C1685G;
import p133a4.C1808d;
import p138b4.C1871p;
import p140c0.C1886c;
import p140c0.InterfaceC1887d;
import p146d0.AbstractC1950a;
import p153e1.C2021q;
import p154e2.C2029h;
import p179i4.AbstractC2352g;
import p186k.AbstractC2434p;
import p186k.C2433o;
import p192l.AbstractC2477a;
import p200m2.InterfaceC2600a;
import p211o0.C2762u;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p258w2.C3390a;

/* JADX INFO: renamed from: A.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0066i0 implements InterfaceC0327n, InterfaceC1887d, InterfaceC0693R0, InterfaceC2600a, InterfaceC1519r, InterfaceC1140b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f296d;

    /* JADX INFO: renamed from: e */
    public final Object f297e;

    public /* synthetic */ C0066i0(int i5, Object obj) {
        this.f296d = i5;
        this.f297e = obj;
    }

    @Override // p027E4.InterfaceC0327n
    /* JADX INFO: renamed from: a */
    public Object mo63a(Object obj) {
        switch (this.f296d) {
            case 3:
                return Optional.ofNullable(((InterfaceC0327n) this.f297e).mo63a((AbstractC1687I) obj));
            default:
                AbstractC1687I abstractC1687I = (AbstractC1687I) obj;
                C1685G c1685g = abstractC1687I.f5762d;
                if (c1685g == null) {
                    c1685g = new C1685G(abstractC1687I.mo507f(), abstractC1687I.m3006b());
                    abstractC1687I.f5762d = c1685g;
                }
                C3390a c3390a = new C3390a(c1685g);
                c3390a.f10598r = 2;
                try {
                    Object objMo4964b = ((AbstractC2770B) this.f297e).mo4964b(c3390a);
                    if (c3390a.m5630J() == 10) {
                        return objMo4964b;
                    }
                    throw new C2789r("JSON document was not fully consumed.");
                } finally {
                    abstractC1687I.close();
                }
        }
    }

    @Override // p047I0.InterfaceC0693R0
    /* JADX INFO: renamed from: b */
    public InterfaceC1599a mo64b(AbstractC0713b abstractC0713b) {
        AbstractC0142o abstractC0142o = (AbstractC0142o) this.f297e;
        if (((C0147t) abstractC0142o).f541c.compareTo(EnumC0141n.f531d) > 0) {
            C0695S0 c0695s0 = new C0695S0(0, abstractC0713b);
            abstractC0142o.mo184a(c0695s0);
            return new C0190d(6, abstractC0142o, c0695s0);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC0713b + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC0142o + "is already destroyed").toString());
    }

    @Override // p078P1.InterfaceC1140b
    /* JADX INFO: renamed from: c */
    public boolean mo34c(Object obj, File file, C1147i c1147i) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C1294f c1294f = (C1294f) this.f297e;
        byte[] bArr = (byte[]) c1294f.m2384c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i5 = inputStream.read(bArr);
                        if (i5 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i5);
                    } catch (IOException e5) {
                        e = e5;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c1294f.m2388g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c1294f.m2388g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c1294f.m2388g(bArr);
                return true;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m65d(C0564I c0564i) {
        if (!c0564i.m799G()) {
            AbstractC0277a.m483b("DepthSortedSet.add called on an unattached node");
        }
        ((C0550A0) this.f297e).add(c0564i);
    }

    /* JADX INFO: renamed from: e */
    public long m66e(long j5) {
        C0235b c0235b = (C0235b) this.f297e;
        c0235b.getClass();
        if (C2021q.m3714b(j5) <= 0.0f || C2021q.m3715c(j5) <= 0.0f) {
            AbstractC0277a.m483b("maximumVelocity should be a positive value. You specified=" + ((Object) C2021q.m3718f(j5)));
        }
        return AbstractC2352g.m4190c(c0235b.f789a.m423b(C2021q.m3714b(j5)), c0235b.f790b.m423b(C2021q.m3715c(j5)));
    }

    @Override // p200m2.InterfaceC2600a
    /* JADX INFO: renamed from: f */
    public Object mo67f() {
        switch (this.f296d) {
            case 16:
                C0793k c0793k = (C0793k) this.f297e;
                return new RunnableC1209j((C1213n) c0793k.f2538f, (C0072l0) c0793k.f2539g);
            default:
                C1212m c1212m = (C1212m) this.f297e;
                return new C1218s(c1212m.f4024a, c1212m.f4025b, c1212m.f4026c, c1212m.f4027d, c1212m.f4028e, c1212m.f4029f, c1212m.f4030g);
        }
    }

    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        switch (this.f296d) {
            case 22:
                return new C1504c(1, (C1527z) this.f297e);
            default:
                return new C1595a((C0066i0) this.f297e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m69i() {
        ((AbstractC1391v) this.f297e).getClass();
    }

    /* JADX INFO: renamed from: j */
    public long m70j() {
        switch (this.f296d) {
            case 13:
                C1111x c1111x = (C1111x) this.f297e;
                long jM70j = c1111x.f3624w.m70j();
                if (jM70j != 16) {
                    return jM70j;
                }
                C1071Q c1071q = (C1071Q) AbstractC0601k.m1032h(c1111x, AbstractC1074U.f3342a);
                if (c1071q != null) {
                    long j5 = c1071q.f3339a;
                    if (j5 != 16) {
                        return j5;
                    }
                }
                return ((C2762u) AbstractC0601k.m1032h(c1111x, AbstractC1107t.f3615a)).f8764a;
            default:
                return ((C1075V) this.f297e).f3345b;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m71k(int i5, Object obj) {
        String str;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
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
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f297e).setResultCode(i5);
    }

    /* JADX INFO: renamed from: l */
    public C2029h m72l(C0038T0 c0038t0, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        Object obj;
        int i5;
        long jM1300H;
        long j5;
        boolean z5;
        C2433o c2433o = (C2433o) this.f297e;
        List list = (List) c0038t0.f169e;
        C2433o c2433o2 = new C2433o(list.size());
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            C0211y c0211y = (C0211y) list.get(i6);
            long j6 = c0211y.f729a;
            int iM4421b = AbstractC2477a.m4421b(c2433o.f7855e, c2433o.f7857g, j6);
            if (iM4421b < 0 || (obj = c2433o.f7856f[iM4421b]) == AbstractC2434p.f7858a) {
                obj = null;
            }
            C0210x c0210x = (C0210x) obj;
            if (c0210x == null) {
                i5 = i6;
                j5 = c0211y.f730b;
                jM1300H = c0211y.f732d;
                z5 = false;
            } else {
                long j7 = c0210x.f726a;
                boolean z6 = c0210x.f728c;
                i5 = i6;
                jM1300H = viewTreeObserverOnGlobalLayoutListenerC0772y.m1300H(c0210x.f727b);
                j5 = j7;
                z5 = z6;
            }
            long j8 = c0211y.f729a;
            List list2 = list;
            int i7 = size;
            c2433o2.m4321e(j8, new C0209w(j8, c0211y.f730b, c0211y.f732d, c0211y.f733e, c0211y.f734f, j5, jM1300H, z5, c0211y.f735g, c0211y.f737i, c0211y.f738j, c0211y.f739k));
            boolean z7 = c0211y.f733e;
            if (z7) {
                c2433o.m4321e(j6, new C0210x(c0211y.f730b, c0211y.f731c, z7));
            } else {
                c2433o.m4322g(j6);
            }
            i6 = i5 + 1;
            list = list2;
            size = i7;
        }
        return new C2029h(c2433o2, c0038t0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m73m(C0564I c0564i) {
        if (!c0564i.m799G()) {
            AbstractC0277a.m483b("DepthSortedSet.remove called on an unattached node");
        }
        return ((C0550A0) this.f297e).remove(c0564i);
    }

    public String toString() {
        switch (this.f296d) {
            case 5:
                return ((C0550A0) this.f297e).toString();
            default:
                return super.toString();
        }
    }

    public C0066i0(Context context) {
        this.f296d = 20;
        this.f297e = new C1416e(context, 0);
    }

    public C0066i0(C2785n c2785n, AbstractC2770B abstractC2770B) {
        this.f296d = 4;
        this.f297e = abstractC2770B;
    }

    public C0066i0(int i5) {
        C1577b c1577b;
        this.f296d = i5;
        switch (i5) {
            case 2:
                this.f297e = new C0235b();
                break;
            case 5:
                this.f297e = new C0550A0(AbstractC0601k.f1947a);
                break;
            case 7:
                C1886c c1886c = new C1886c();
                this.f297e = c1886c;
                if (!c1886c.f6409e) {
                    if (c1886c.f6410f) {
                        AbstractC1950a.m3618a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c1886c.m3373a();
                    c1886c.f6410f = true;
                    break;
                }
                break;
            case 12:
                this.f297e = AbstractC1385s.m2629s(Boolean.FALSE);
                break;
            case 15:
                this.f297e = new Region();
                break;
            case 22:
                this.f297e = new C1527z(7);
                break;
            case 23:
                this.f297e = new C1515n(500L);
                break;
            case 25:
                if (Build.VERSION.SDK_INT >= 28) {
                    c1577b = new C1577b(2);
                } else {
                    c1577b = new C1577b(3);
                }
                this.f297e = c1577b;
                break;
            case 26:
                this.f297e = new C0066i0(23);
                break;
            case 28:
                AbstractC1665j.m2985e(TimeUnit.MINUTES, "timeUnit");
                C1808d c1808d = C1808d.f6161l;
                AbstractC1665j.m2985e(c1808d, "taskRunner");
                this.f297e = new C1871p(c1808d);
                break;
            default:
                this.f297e = new C2433o();
                break;
        }
    }
}
