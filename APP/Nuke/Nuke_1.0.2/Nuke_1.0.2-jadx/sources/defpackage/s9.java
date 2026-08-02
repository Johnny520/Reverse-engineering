package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s9 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s9(int i, int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: nuke.ui.HomeActivity.g(nuke.ui.HomeActivity, px, int):a83 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // defpackage.mn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        boolean zG;
        long jC;
        char c;
        char c2;
        File fileG0;
        Object objX0;
        char c3 = 7;
        lp lpVarY = null;
        ho2Var = null;
        ho2Var = null;
        ho2Var = null;
        ho2 ho2Var = null;
        k21 k21Var = null;
        switch (this.h) {
            case 0:
                um2 um2Var = (um2) this.i;
                o62 o62VarP0 = rp0.p0((RectF) obj);
                o62 o62VarP02 = rp0.p0((RectF) obj2);
                switch (um2Var.h) {
                    case 3:
                        zG = o62VarP0.g(o62VarP02);
                        break;
                    default:
                        zG = o62VarP02.a(o62VarP0.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 1:
                ju juVar = (ju) this.i;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gf1.h(juVar, null, false, 34.0f, null, go0Var, 3072, 22);
                } else {
                    go0Var.R();
                }
                return a83.a;
            case 2:
                ((Integer) obj2).getClass();
                s11.o((s62) this.i, (px) obj, pp0.N(1));
                return a83.a;
            case 3:
                ((Integer) obj2).getClass();
                t11.e((g33) this.i, (px) obj, pp0.N(1));
                return a83.a;
            case 4:
                z72 z72Var = (z72) this.i;
                ((Integer) obj).getClass();
                if (obj2 instanceof uw) {
                    uw uwVar = (uw) obj2;
                    sk1 sk1Var = z72Var.h;
                    if (sk1Var == null) {
                        sk1 sk1Var2 = fd2.a;
                        sk1Var = new sk1();
                        z72Var.h = sk1Var;
                    }
                    sk1Var.k(uwVar);
                    z72Var.f.b(uwVar);
                }
                if (obj2 instanceof lo0) {
                    z72Var.e((lo0) obj2);
                }
                if (obj2 instanceof b62) {
                    ((b62) obj2).c();
                }
                return a83.a;
            case 5:
                ((Integer) obj2).getClass();
                gf1.d((b03) this.i, (px) obj, pp0.N(1));
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xy2 xy2Var = (xy2) this.i;
                ((Integer) obj2).getClass();
                go0 go0Var2 = (go0) ((px) obj);
                go0Var2.W(666084174);
                String str = xy2Var.b;
                go0Var2.p(false);
                return str;
            case 7:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar2;
                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                go0Var3.R();
                return a83.a;
            case 8:
                return HomeActivity.onCreate$lambda$0((HomeActivity) this.i, (px) obj, ((Integer) obj2).intValue());
            case 9:
                yp2 yp2Var = (yp2) this.i;
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) pxVar3;
                if (go0Var4.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sx0 sx0Var = yp2Var.b;
                    if (yp2Var.e) {
                        go0Var4.W(-1996161725);
                        go0Var4.p(false);
                        jC = sp0.c(4292617766L);
                    } else {
                        go0Var4.W(-1996160456);
                        jC = ((lp1) go0Var4.j(ur1.a)).g;
                        go0Var4.p(false);
                    }
                    ci0.l(sx0Var, null, jC, go0Var4, 0, 2);
                } else {
                    go0Var4.R();
                }
                return a83.a;
            case 10:
                ((Integer) obj2).getClass();
                ((cz0) this.i).a(pp0.N(1), (px) obj);
                return a83.a;
            case 11:
                ((kz2) this.i).e(((rs1) obj2).a);
                return a83.a;
            case 12:
                xk1 xk1Var = (xk1) this.i;
                px pxVar4 = (px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) pxVar4;
                if (go0Var5.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                    boolean zF = go0Var5.f(xk1Var);
                    Object objL = go0Var5.L();
                    if (zF || objL == nx.a) {
                        objL = new pr(xk1Var, 12);
                        go0Var5.f0(objL);
                    }
                    sp0.i(zBooleanValue, (in0) objL, null, false, 0, go0Var5, 0, 60);
                } else {
                    go0Var5.R();
                }
                return a83.a;
            case 13:
                qj1 qj1Var = (qj1) this.i;
                Set set = (Set) obj;
                synchronized (qj1Var.h) {
                    try {
                        rk1 rk1Var = qj1Var.i;
                        d2 d2Var = new d2(22, set, qj1Var);
                        xe1.f(1, d2Var);
                        Object[] objArr = rk1Var.b;
                        long[] jArr = rk1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((j & 255) < 128) {
                                            d2Var.j(objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 == 8) {
                                        if (i != length) {
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                        sk1 sk1Var3 = qj1Var.k;
                        Object[] objArr2 = sk1Var3.b;
                        long[] jArr2 = sk1Var3.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr2[i4];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j2 & 255) < 128) {
                                            ((ho2) objArr2[(i4 << 3) + i6]).s(a83.a);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 != length2) {
                                            i4++;
                                        }
                                    }
                                }
                            }
                        }
                        qj1Var.k.b();
                    } finally {
                    }
                }
                return a83.a;
            case 14:
                i62 i62Var = (i62) this.i;
                Set set2 = (Set) obj;
                synchronized (i62Var.c) {
                    try {
                        if (((f62) i62Var.u.getValue()).compareTo(f62.l) >= 0) {
                            sk1 sk1Var4 = i62Var.h;
                            if (set2 instanceof gd2) {
                                sk1 sk1Var5 = ((gd2) set2).h;
                                Object[] objArr3 = sk1Var5.b;
                                long[] jArr3 = sk1Var5.a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr3[i7];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length3)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj3 = objArr3[(i7 << 3) + i9];
                                                    c2 = c3;
                                                    if (!(obj3 instanceof qu2) || ((qu2) obj3).e(1)) {
                                                        sk1Var4.a(obj3);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i9++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i8 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i7 != length3) {
                                            i7++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof qu2) || ((qu2) obj4).e(1)) {
                                        sk1Var4.a(obj4);
                                    }
                                }
                            }
                            lpVarY = i62Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (lpVarY != null) {
                    ((mp) lpVarY).h(a83.a);
                }
                return a83.a;
            case 15:
                ub2 ub2Var = (ub2) this.i;
                int iIntValue5 = ((Integer) obj).intValue();
                y10 y10Var = (y10) obj2;
                z10 key = y10Var.getKey();
                y10 y10VarO = ub2Var.l.o(key);
                if (key != sn.K) {
                    iIntValue5 = y10Var != y10VarO ? Integer.MIN_VALUE : iIntValue5 + 1;
                } else {
                    k21 k21Var2 = (k21) y10VarO;
                    k21 parent = (k21) y10Var;
                    while (parent != null) {
                        if (parent != k21Var2 && (parent instanceof hd2)) {
                            ms msVar = (ms) r21.i.get((hd2) parent);
                            parent = msVar != null ? msVar.getParent() : null;
                        } else {
                            k21Var = parent;
                            if (k21Var == k21Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + k21Var + ", expected child of " + k21Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (k21Var2 != null) {
                            }
                        }
                    }
                    if (k21Var == k21Var2) {
                    }
                }
                return Integer.valueOf(iIntValue5);
            case 16:
                Context context = (Context) this.i;
                px pxVar5 = (px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) pxVar5;
                if (go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strP = rg3.P(R.string.script_settings_directory, go0Var6);
                    sq1 sq1Var = sq1.a;
                    context.getClass();
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        fileG0 = wi0.g0(externalFilesDir, "nuke/scripts");
                    } else {
                        File filesDir = context.getFilesDir();
                        filesDir.getClass();
                        fileG0 = wi0.g0(filesDir, "nuke/scripts");
                    }
                    String absolutePath = fileG0.getAbsolutePath();
                    absolutePath.getClass();
                    sp0.g(strP, null, absolutePath, null, null, null, false, null, null, go0Var6, 0, 506);
                } else {
                    go0Var6.R();
                }
                return a83.a;
            case 17:
                am2 am2Var = (am2) this.i;
                p7.A(am2Var.A0(), null, new zl2(am2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 18:
                b72 b72Var = (b72) this.i;
                ((o12) obj).a();
                b72Var.h = ((rs1) obj2).a;
                return a83.a;
            case 19:
                zq2 zq2Var = (zq2) this.i;
                Set set3 = (Set) obj;
                synchronized (zq2Var.h) {
                    try {
                        sk1 sk1Var6 = zq2Var.k;
                        if (sk1Var6 != null) {
                            Object[] objArr4 = sk1Var6.b;
                            long[] jArr4 = sk1Var6.a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i10];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length4)) >>> 31);
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < i11) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i10 << 3) + i12])) {
                                                    j4 >>= 8;
                                                    i12++;
                                                } else {
                                                    ho2Var = zq2Var.m;
                                                }
                                            } else if (i11 == 8) {
                                            }
                                        }
                                    } else if (i10 != length4) {
                                        i10++;
                                    }
                                }
                            }
                        } else if (du.m0(set3, zq2Var.i)) {
                            ho2Var = zq2Var.m;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ho2Var != null) {
                    ho2Var.s(a83.a);
                }
                return a83.a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ts2 ts2Var = (ts2) this.i;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = ts2Var.b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        objX0 = set4;
                    } else if (obj5 instanceof Set) {
                        objX0 = eu.P(obj5, set4);
                    } else {
                        if (!(obj5 instanceof List)) {
                            tx.b("Unexpected notification");
                            s.b();
                            return null;
                        }
                        objX0 = du.x0((Collection) obj5, eu.O(set4));
                    }
                    while (!atomicReference.compareAndSet(obj5, objX0)) {
                        if (atomicReference.get() != obj5) {
                        }
                        break;
                    }
                    if (ts2Var.b()) {
                        ts2Var.a.j(new ta(26, ts2Var));
                    }
                    return a83.a;
                }
                break;
            case 21:
                char[] cArr = (char[]) this.i;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iR0 = pv2.r0(charSequence, cArr, iIntValue7, false);
                if (iR0 < 0) {
                    return null;
                }
                return new ow1(Integer.valueOf(iR0), 1);
            case 22:
                TextClassification textClassification = (TextClassification) this.i;
                ((Integer) obj2).getClass();
                go0 go0Var7 = (go0) ((px) obj);
                go0Var7.W(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                go0Var7.p(false);
                return strValueOf;
            case 23:
                RemoteAction remoteAction = (RemoteAction) this.i;
                ((Integer) obj2).intValue();
                go0 go0Var8 = (go0) ((px) obj);
                go0Var8.W(-1376593684);
                String string = remoteAction.getTitle().toString();
                go0Var8.p(false);
                return string;
            default:
                ((Integer) obj2).getClass();
                se.i((jc3) this.i, (px) obj, pp0.N(1));
                return a83.a;
        }
    }

    public /* synthetic */ s9(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }
}
