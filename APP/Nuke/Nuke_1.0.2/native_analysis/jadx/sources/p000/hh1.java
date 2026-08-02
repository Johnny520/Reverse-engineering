package p000;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hh1 implements qi2, x00, InterfaceC0513nu, yg0, we0, ga1, aa3, ya3 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4018h;

    /* JADX INFO: renamed from: i */
    public Object f4019i;

    public hh1(int i) {
        this.f4018h = i;
        switch (i) {
            case 4:
                this.f4019i = Build.VERSION.SDK_INT >= 28 ? new j51(11) : new i51(12);
                break;
            case 5:
                this.f4019i = new gd1();
                break;
            case 8:
                this.f4019i = new LinkedHashSet();
                break;
            case 10:
                this.f4019i = op0.m3598u(Boolean.FALSE);
                break;
            case 11:
                this.f4019i = new Region();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.f4019i = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 28:
                this.f4019i = new m60();
                break;
            default:
                this.f4019i = new fh1(500L);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo1418A() {
        View view = (View) this.f4019i;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m2179B(View view, int i, boolean z) {
        ((AutofillManager) this.f4019i).notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX INFO: renamed from: C */
    public void m2180C(int i, Object obj) {
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
            case AIChatConfig.DefaultContextRounds /* 6 */:
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
        ((ProfileInstallReceiver) this.f4019i).setResultCode(i);
    }

    /* JADX INFO: renamed from: D */
    public er2 m2181D(dq1 dq1Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        Object obj;
        long j;
        boolean z;
        long jM461H;
        gd1 gd1Var = (gd1) this.f4019i;
        List list = (List) dq1Var.f2147i;
        gd1 gd1Var2 = new gd1(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            q12 q12Var = (q12) list.get(i);
            long j2 = q12Var.f8690a;
            int iM4481q = rg3.m4481q(gd1Var.f3410i, gd1Var.f3412k, j2);
            if (iM4481q < 0 || (obj = gd1Var.f3411j[iM4481q]) == AbstractC0731te.f10691c) {
                obj = null;
            }
            p12 p12Var = (p12) obj;
            if (p12Var == null) {
                j = q12Var.f8691b;
                jM461H = q12Var.f8693d;
                z = false;
            } else {
                j = p12Var.f7924a;
                z = p12Var.f7926c;
                jM461H = viewTreeObserverOnGlobalLayoutListenerC0045b7.m461H(p12Var.f7925b);
            }
            long j3 = q12Var.f8690a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            gd1Var2.m1831d(j3, new o12(j3, q12Var.f8691b, q12Var.f8693d, q12Var.f8694e, q12Var.f8695f, j, jM461H, z, q12Var.f8696g, q12Var.f8698i, q12Var.f8699j, q12Var.f8700k, q12Var.f8701l, q12Var.f8702m));
            boolean z2 = q12Var.f8694e;
            if (z2) {
                gd1Var.m1831d(j2, new p12(q12Var.f8691b, q12Var.f8692c, z2));
            } else {
                gd1Var.m1832f(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new er2(gd1Var2, dq1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2182E(InterfaceC0212fq interfaceC0212fq, xm0 xm0Var) {
        zq2 zq2Var;
        ho2 ho2Var;
        int i;
        if (((AbstractC0696sj) this.f4019i) == null) {
            j22.m2430b("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC0696sj abstractC0696sj = (AbstractC0696sj) this.f4019i;
        if ((abstractC0696sj instanceof zq2) && (ho2Var = (zq2Var = (zq2) abstractC0696sj).f14069m) != null && !ho2Var.equals(interfaceC0212fq)) {
            qj1 qj1Var = new qj1();
            ho2 ho2Var2 = zq2Var.f14069m;
            if (ho2Var2 == null) {
                j22.m2430b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            sk1 sk1Var = zq2Var.f14067k;
            ArrayList arrayList = qj1Var.f8999j;
            if (sk1Var == null) {
                Object obj = zq2Var.f14065i;
                obj.getClass();
                arrayList.add(new nj1(obj, ho2Var2));
            } else {
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new nj1(objArr[(i2 << 3) + i5], ho2Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            qj1Var.mo4189d();
            zq2Var.mo4190e();
            this.f4019i = qj1Var;
        }
        AbstractC0696sj abstractC0696sj2 = (AbstractC0696sj) this.f4019i;
        abstractC0696sj2.getClass();
        vr2 vr2VarMo89u = ds2.m1126j().mo89u(abstractC0696sj2.mo4191i(interfaceC0212fq));
        abstractC0696sj2.mo4188c(interfaceC0212fq);
        try {
            vr2 vr2VarM5787j = vr2VarMo89u.m5787j();
            try {
                Object objMo6a = xm0Var.mo6a();
                vr2VarMo89u.mo75c();
                abstractC0696sj2.mo4189d();
                return objMo6a;
            } finally {
                vr2.m5784q(vr2VarM5787j);
            }
        } catch (Throwable th) {
            vr2VarMo89u.mo75c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m2183F(d11 d11Var) {
        ((Region) this.f4019i).set(d11Var.f1807a, d11Var.f1808b, d11Var.f1809c, d11Var.f1810d);
    }

    /* JADX INFO: renamed from: G */
    public void mo1419G() {
        View viewFindViewById;
        View view = (View) this.f4019i;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new ct2(viewFindViewById, 0));
    }

    @Override // p000.aa3, p000.x93
    /* JADX INFO: renamed from: a */
    public boolean mo121a() {
        ((kj1) this.f4019i).getClass();
        return false;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: b */
    public long mo1171b(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f4019i).mo1171b(abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    @Override // p000.we0
    /* JADX INFO: renamed from: c */
    public boolean mo2184c(Object obj, File file, ov1 ov1Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        td1 td1Var = (td1) this.f4019i;
        byte[] bArr = (byte[]) td1Var.m5167c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
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
                        td1Var.m5171g(bArr);
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
                        td1Var.m5171g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                td1Var.m5171g(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.InterfaceC0513nu
    /* JADX INFO: renamed from: d */
    public long mo2185d() {
        return ((ua2) this.f4019i).f11197b;
    }

    @Override // p000.yg0
    /* JADX INFO: renamed from: e */
    public t52 mo2186e() throws Throwable {
        jb2 jb2VarM6037b;
        IOException iOException = null;
        while (!((x52) this.f4019i).f12829k.f9929x) {
            try {
                jb2VarM6037b = ((x52) this.f4019i).m6037b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    fg1.m1638m(iOException, e);
                }
                if (!((x52) this.f4019i).m6036a(null)) {
                    throw iOException;
                }
            }
            if (!jb2VarM6037b.mo982e()) {
                ib2 ib2VarMo983g = jb2VarM6037b.mo983g();
                if (ib2VarMo983g.f4523b == null && ib2VarMo983g.f4524c == null) {
                    ib2VarMo983g = jb2VarM6037b.mo980c();
                }
                jb2 jb2Var = ib2VarMo983g.f4523b;
                Throwable th = ib2VarMo983g.f4524c;
                if (th != null) {
                    throw th;
                }
                if (jb2Var != null) {
                    ((x52) this.f4019i).f12834p.addFirst(jb2Var);
                }
            }
            return jb2VarM6037b.mo981d();
        }
        c80.m678v("Canceled");
        return null;
    }

    @Override // p000.yg0
    /* JADX INFO: renamed from: i */
    public x52 mo2187i() {
        return (x52) this.f4019i;
    }

    @Override // p000.x00
    /* JADX INFO: renamed from: j */
    public Object mo1846j(Object obj) {
        return Optional.ofNullable(((x00) this.f4019i).mo1846j((u92) obj));
    }

    @Override // p000.qi2
    /* JADX INFO: renamed from: l */
    public pi2 mo688l(th2 th2Var) {
        kh2 kh2Var;
        ri2 ri2Var = th2Var.f10782k;
        ji2 ji2Var = ri2Var.f9601a;
        boolean zM2699C = ((kj1) this.f4019i).m2699C(th2Var);
        List list = ji2Var != null ? ji2Var.f5052a : null;
        if (list == null) {
            list = be0.f819h;
        }
        Set setM1153K0 = AbstractC0142du.m1153K0(list);
        boolean z = (ji2Var != null && ji2Var.f5053b) || (ji2Var != null && ji2Var.f5054c);
        boolean z2 = ji2Var != null && ji2Var.f5054c;
        ch2 ch2Var = ri2Var.f9603c;
        return new pi2(setM1153K0, z, z2, zM2699C && (kh2Var = ri2Var.f9602b) != null && kh2Var.f5576a, ch2Var != null && ch2Var.f1542a, zM2699C && ch2Var != null && ch2Var.f1543b);
    }

    @Override // p000.ya3
    /* JADX INFO: renamed from: n */
    public xm0 mo2188n(AbstractC0526o2 abstractC0526o2) {
        ba1 ba1Var = (ba1) this.f4019i;
        if (((la1) ba1Var).f6009h.compareTo(aa1.f119h) > 0) {
            lg1 lg1Var = new lg1(2, abstractC0526o2);
            ba1Var.mo505a(lg1Var);
            return new C0723t6(10, ba1Var, lg1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC0526o2 + " to disposeComposition at Lifecycle ON_DESTROY: " + ba1Var + "is already destroyed").toString());
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f4019i).mo737q(j, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f4019i).mo739s(j, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: t */
    public AbstractC0494nd mo2189t(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f4019i).mo2189t(abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    public String toString() {
        switch (this.f4018h) {
            case 19:
                return hk1.m2210i(new StringBuilder("<"), (String) this.f4019i, '>');
            default:
                return super.toString();
        }
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public void mo881x() {
        Iterator it = b93.m498e((Set) this.f4019i).iterator();
        while (it.hasNext()) {
            ((by2) it.next()).mo881x();
        }
    }

    /* JADX INFO: renamed from: y */
    public long m2190y(long j) {
        m60 m60Var = (m60) this.f4019i;
        m60Var.getClass();
        if (da3.m985b(j) <= 0.0f || da3.m986c(j) <= 0.0f) {
            kz0.m2764b("maximumVelocity should be a positive value. You specified=" + ((Object) da3.m989f(j)));
        }
        return ea3.m1314a(m60Var.f6485a.m510b(da3.m985b(j)), m60Var.f6486b.m510b(da3.m986c(j)));
    }

    /* JADX INFO: renamed from: z */
    public sj0 m2191z(int i) {
        switch (this.f4018h) {
            case 24:
                return ((wj0[]) this.f4019i)[i];
            case 25:
                return (wj0) this.f4019i;
            default:
                return (sj0) this.f4019i;
        }
    }

    public /* synthetic */ hh1(int i, boolean z) {
        this.f4018h = i;
    }

    public hh1(kj1 kj1Var) {
        this.f4018h = 1;
        kj1Var.getClass();
        this.f4019i = kj1Var;
    }

    public hh1(e70 e70Var) {
        this.f4018h = 17;
        this.f4019i = new oj0(ot2.f7844a, e70Var);
    }

    public /* synthetic */ hh1(int i, Object obj) {
        this.f4018h = i;
        this.f4019i = obj;
    }

    public hh1(View view) {
        this.f4018h = 16;
        if (Build.VERSION.SDK_INT >= 30) {
            et2 et2Var = new et2(15, view);
            et2Var.f2626j = view;
            this.f4019i = et2Var;
            return;
        }
        this.f4019i = new hh1(15, view);
    }

    public hh1(long[] jArr) {
        ck1 ck1Var;
        this.f4018h = 14;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            ck1Var = new ck1(jArrCopyOf.length);
            int i = ck1Var.f1599b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = ck1Var.f1598a;
                    if (jArr2.length < length) {
                        ck1Var.f1598a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = ck1Var.f1598a;
                    int i2 = ck1Var.f1599b;
                    if (i != i2) {
                        AbstractC0460mg.m3087b0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    AbstractC0460mg.m3087b0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    ck1Var.f1599b += jArrCopyOf.length;
                }
            } else {
                C0676s.m4646d("");
                throw null;
            }
        } else {
            ck1Var = new ck1();
        }
        this.f4019i = ck1Var;
    }

    public hh1(vg3 vg3Var) {
        this.f4018h = 21;
        this.f4019i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), vg3Var);
    }

    public hh1(float f, float f2, AbstractC0494nd abstractC0494nd) {
        hh1 hh1Var;
        this.f4018h = 27;
        int[] iArr = y93.f13370a;
        if (abstractC0494nd != null) {
            hh1Var = new hh1(abstractC0494nd, f, f2);
        } else {
            hh1Var = new hh1(f, f2);
        }
        this.f4019i = new kj1(15, hh1Var);
    }

    public hh1(AbstractC0494nd abstractC0494nd, float f, float f2) {
        this.f4018h = 24;
        int iMo2478b = abstractC0494nd.mo2478b();
        wj0[] wj0VarArr = new wj0[iMo2478b];
        for (int i = 0; i < iMo2478b; i++) {
            wj0VarArr[i] = new wj0(f, f2, abstractC0494nd.mo2477a(i));
        }
        this.f4019i = wj0VarArr;
    }

    public hh1(float f, float f2) {
        this.f4018h = 25;
        this.f4019i = new wj0(f, f2, 0.01f);
    }
}
