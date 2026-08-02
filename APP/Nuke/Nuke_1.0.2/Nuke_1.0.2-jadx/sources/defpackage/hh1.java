package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hh1 implements qi2, x00, nu, yg0, we0, ga1, aa3, ya3 {
    public final /* synthetic */ int h;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hh1(int i) {
        this.h = i;
        switch (i) {
            case 4:
                this.i = Build.VERSION.SDK_INT >= 28 ? new j51(11) : new i51(12);
                break;
            case 5:
                this.i = new gd1();
                break;
            case 8:
                this.i = new LinkedHashSet();
                break;
            case 10:
                this.i = op0.u(Boolean.FALSE);
                break;
            case 11:
                this.i = new Region();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.i = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 28:
                this.i = new m60();
                break;
            default:
                this.i = new fh1(500L);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A() {
        View view = (View) this.i;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(View view, int i, boolean z) {
        ((AutofillManager) this.i).notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(int i, Object obj) {
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
        ((ProfileInstallReceiver) this.i).setResultCode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public er2 D(dq1 dq1Var, b7 b7Var) {
        Object obj;
        long j;
        boolean z;
        long jH;
        gd1 gd1Var = (gd1) this.i;
        List list = (List) dq1Var.i;
        gd1 gd1Var2 = new gd1(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            q12 q12Var = (q12) list.get(i);
            long j2 = q12Var.a;
            int iQ = rg3.q(gd1Var.i, gd1Var.k, j2);
            if (iQ < 0 || (obj = gd1Var.j[iQ]) == te.c) {
                obj = null;
            }
            p12 p12Var = (p12) obj;
            if (p12Var == null) {
                j = q12Var.b;
                jH = q12Var.d;
                z = false;
            } else {
                j = p12Var.a;
                z = p12Var.c;
                jH = b7Var.H(p12Var.b);
            }
            long j3 = q12Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            gd1Var2.d(j3, new o12(j3, q12Var.b, q12Var.d, q12Var.e, q12Var.f, j, jH, z, q12Var.g, q12Var.i, q12Var.j, q12Var.k, q12Var.l, q12Var.m));
            boolean z2 = q12Var.e;
            if (z2) {
                gd1Var.d(j2, new p12(q12Var.b, q12Var.c, z2));
            } else {
                gd1Var.f(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new er2(gd1Var2, dq1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(fq fqVar, xm0 xm0Var) {
        zq2 zq2Var;
        ho2 ho2Var;
        int i;
        if (((sj) this.i) == null) {
            j22.b("Called runAndWatch on a manager that has been disposed of");
        }
        sj sjVar = (sj) this.i;
        if ((sjVar instanceof zq2) && (ho2Var = (zq2Var = (zq2) sjVar).m) != null && !ho2Var.equals(fqVar)) {
            qj1 qj1Var = new qj1();
            ho2 ho2Var2 = zq2Var.m;
            if (ho2Var2 == null) {
                j22.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            sk1 sk1Var = zq2Var.k;
            ArrayList arrayList = qj1Var.j;
            if (sk1Var == null) {
                Object obj = zq2Var.i;
                obj.getClass();
                arrayList.add(new nj1(obj, ho2Var2));
            } else {
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
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
            qj1Var.d();
            zq2Var.e();
            this.i = qj1Var;
        }
        sj sjVar2 = (sj) this.i;
        sjVar2.getClass();
        vr2 vr2VarU = ds2.j().u(sjVar2.i(fqVar));
        sjVar2.c(fqVar);
        try {
            vr2 vr2VarJ = vr2VarU.j();
            try {
                Object objA = xm0Var.a();
                vr2VarU.c();
                sjVar2.d();
                return objA;
            } finally {
                vr2.q(vr2VarJ);
            }
        } catch (Throwable th) {
            vr2VarU.c();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(d11 d11Var) {
        ((Region) this.i).set(d11Var.a, d11Var.b, d11Var.c, d11Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void G() {
        View viewFindViewById;
        View view = (View) this.i;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aa3, defpackage.x93
    public boolean a() {
        ((kj1) this.i).getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public long b(nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.i).b(ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.we0
    public boolean c(Object obj, File file, ov1 ov1Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        td1 td1Var = (td1) this.i;
        byte[] bArr = (byte[]) td1Var.c(65536, byte[].class);
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
                        td1Var.g(bArr);
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
                        td1Var.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                td1Var.g(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nu
    public long d() {
        return ((ua2) this.i).b;
    }

    /* JADX DEBUG: Class process forced to load method for inline: c80.v(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yg0
    public t52 e() throws Throwable {
        jb2 jb2VarB;
        IOException iOException = null;
        while (!((x52) this.i).k.x) {
            try {
                jb2VarB = ((x52) this.i).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    fg1.m(iOException, e);
                }
                if (!((x52) this.i).a(null)) {
                    throw iOException;
                }
            }
            if (!jb2VarB.e()) {
                ib2 ib2VarG = jb2VarB.g();
                if (ib2VarG.b == null && ib2VarG.c == null) {
                    ib2VarG = jb2VarB.c();
                }
                jb2 jb2Var = ib2VarG.b;
                Throwable th = ib2VarG.c;
                if (th != null) {
                    throw th;
                }
                if (jb2Var != null) {
                    ((x52) this.i).p.addFirst(jb2Var);
                }
            }
            return jb2VarB.d();
        }
        c80.v("Canceled");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yg0
    public x52 i() {
        return (x52) this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x00
    public Object j(Object obj) {
        return Optional.ofNullable(((x00) this.i).j((u92) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qi2
    public pi2 l(th2 th2Var) {
        kh2 kh2Var;
        ri2 ri2Var = th2Var.k;
        ji2 ji2Var = ri2Var.a;
        boolean zC = ((kj1) this.i).C(th2Var);
        List list = ji2Var != null ? ji2Var.a : null;
        if (list == null) {
            list = be0.h;
        }
        Set setK0 = du.K0(list);
        boolean z = (ji2Var != null && ji2Var.b) || (ji2Var != null && ji2Var.c);
        boolean z2 = ji2Var != null && ji2Var.c;
        ch2 ch2Var = ri2Var.c;
        return new pi2(setK0, z, z2, zC && (kh2Var = ri2Var.b) != null && kh2Var.a, ch2Var != null && ch2Var.a, zC && ch2Var != null && ch2Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ya3
    public xm0 n(o2 o2Var) {
        ba1 ba1Var = (ba1) this.i;
        if (((la1) ba1Var).h.compareTo(aa1.h) > 0) {
            lg1 lg1Var = new lg1(2, o2Var);
            ba1Var.a(lg1Var);
            return new t6(10, ba1Var, lg1Var);
        }
        throw new IllegalStateException(("Cannot configure " + o2Var + " to disposeComposition at Lifecycle ON_DESTROY: " + ba1Var + "is already destroyed").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.i).q(j, ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.i).s(j, ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd t(nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.i).t(ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 19:
                return hk1.i(new StringBuilder("<"), (String) this.i, '>');
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ga1
    public void x() {
        Iterator it = b93.e((Set) this.i).iterator();
        while (it.hasNext()) {
            ((by2) it.next()).x();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long y(long j) {
        m60 m60Var = (m60) this.i;
        m60Var.getClass();
        if (da3.b(j) <= 0.0f || da3.c(j) <= 0.0f) {
            kz0.b("maximumVelocity should be a positive value. You specified=" + ((Object) da3.f(j)));
        }
        return ea3.a(m60Var.a.b(da3.b(j)), m60Var.b.b(da3.c(j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sj0 z(int i) {
        switch (this.h) {
            case 24:
                return ((wj0[]) this.i)[i];
            case 25:
                return (wj0) this.i;
            default:
                return (sj0) this.i;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [v0.r(java.lang.Object):java.lang.Object, zp2.a(float, long, q9):void] */
    public /* synthetic */ hh1(int i, boolean z) {
        this.h = i;
    }

    public hh1(kj1 kj1Var) {
        this.h = 1;
        kj1Var.getClass();
        this.i = kj1Var;
    }

    public hh1(e70 e70Var) {
        this.h = 17;
        this.i = new oj0(ot2.a, e70Var);
    }

    public /* synthetic */ hh1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public hh1(View view) {
        this.h = 16;
        if (Build.VERSION.SDK_INT >= 30) {
            et2 et2Var = new et2(15, view);
            et2Var.j = view;
            this.i = et2Var;
            return;
        }
        this.i = new hh1(15, view);
    }

    /* JADX DEBUG: Class process forced to load method for inline: s.d(java.lang.String):void */
    public hh1(long[] jArr) {
        ck1 ck1Var;
        this.h = 14;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            ck1Var = new ck1(jArrCopyOf.length);
            int i = ck1Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = ck1Var.a;
                    if (jArr2.length < length) {
                        ck1Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = ck1Var.a;
                    int i2 = ck1Var.b;
                    if (i != i2) {
                        mg.b0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    mg.b0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    ck1Var.b += jArrCopyOf.length;
                }
            } else {
                s.d("");
                throw null;
            }
        } else {
            ck1Var = new ck1();
        }
        this.i = ck1Var;
    }

    public hh1(vg3 vg3Var) {
        this.h = 21;
        this.i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), vg3Var);
    }

    public hh1(float f, float f2, nd ndVar) {
        hh1 hh1Var;
        this.h = 27;
        int[] iArr = y93.a;
        if (ndVar != null) {
            hh1Var = new hh1(ndVar, f, f2);
        } else {
            hh1Var = new hh1(f, f2);
        }
        this.i = new kj1(15, hh1Var);
    }

    public hh1(nd ndVar, float f, float f2) {
        this.h = 24;
        int iB = ndVar.b();
        wj0[] wj0VarArr = new wj0[iB];
        for (int i = 0; i < iB; i++) {
            wj0VarArr[i] = new wj0(f, f2, ndVar.a(i));
        }
        this.i = wj0VarArr;
    }

    public hh1(float f, float f2) {
        this.h = 25;
        this.i = new wj0(f, f2, 0.01f);
    }
}
