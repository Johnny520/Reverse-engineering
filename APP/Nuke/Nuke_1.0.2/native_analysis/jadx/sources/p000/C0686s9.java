package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0686s9 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9992h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9993i;

    public /* synthetic */ C0686s9(int i, int i2, Object obj) {
        this.f9992h = i2;
        this.f9993i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12g(Object obj, Object obj2) {
        boolean zM3519g;
        long jM4932c;
        char c;
        char c2;
        File fileM5901g0;
        Object objM1168x0;
        char c3 = 7;
        InterfaceC0432lp interfaceC0432lpM2294y = null;
        ho2Var = null;
        ho2Var = null;
        ho2Var = null;
        ho2 ho2Var = null;
        k21 k21Var = null;
        switch (this.f9992h) {
            case 0:
                um2 um2Var = (um2) this.f9993i;
                o62 o62VarM4555p0 = rp0.m4555p0((RectF) obj);
                o62 o62VarM4555p02 = rp0.m4555p0((RectF) obj2);
                switch (um2Var.f11373h) {
                    case 3:
                        zM3519g = o62VarM4555p0.m3519g(o62VarM4555p02);
                        break;
                    default:
                        zM3519g = o62VarM4555p02.m3513a(o62VarM4555p0.m3514b());
                        break;
                }
                return Boolean.valueOf(zM3519g);
            case 1:
                C0363ju c0363ju = (C0363ju) this.f9993i;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gf1.m1890h(c0363ju, null, false, 34.0f, null, go0Var, 3072, 22);
                } else {
                    go0Var.m1961R();
                }
                return a83.f116a;
            case 2:
                ((Integer) obj2).getClass();
                s11.m4710o((s62) this.f9993i, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83.f116a;
            case 3:
                ((Integer) obj2).getClass();
                t11.m5079e((g33) this.f9993i, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83.f116a;
            case 4:
                z72 z72Var = (z72) this.f9993i;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC0788uw) {
                    InterfaceC0788uw interfaceC0788uw = (InterfaceC0788uw) obj2;
                    sk1 sk1Var = z72Var.f13775h;
                    if (sk1Var == null) {
                        sk1 sk1Var2 = fd2.f2911a;
                        sk1Var = new sk1();
                        z72Var.f13775h = sk1Var;
                    }
                    sk1Var.m4892k(interfaceC0788uw);
                    z72Var.f13773f.m6423b(interfaceC0788uw);
                }
                if (obj2 instanceof lo0) {
                    z72Var.m6394e((lo0) obj2);
                }
                if (obj2 instanceof b62) {
                    ((b62) obj2).m443c();
                }
                return a83.f116a;
            case 5:
                ((Integer) obj2).getClass();
                gf1.m1885d((b03) this.f9993i, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xy2 xy2Var = (xy2) this.f9993i;
                ((Integer) obj2).getClass();
                go0 go0Var2 = (go0) ((InterfaceC0596px) obj);
                go0Var2.m1966W(666084174);
                String str = xy2Var.f13237b;
                go0Var2.m1994p(false);
                return str;
            case 7:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px2;
                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                go0Var3.m1961R();
                return a83.f116a;
            case 8:
                return HomeActivity.onCreate$lambda$0((HomeActivity) this.f9993i, (InterfaceC0596px) obj, ((Integer) obj2).intValue());
            case 9:
                yp2 yp2Var = (yp2) this.f9993i;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) interfaceC0596px3;
                if (go0Var4.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sx0 sx0Var = yp2Var.f13556b;
                    if (yp2Var.f13559e) {
                        go0Var4.m1966W(-1996161725);
                        go0Var4.m1994p(false);
                        jM4932c = sp0.m4932c(4292617766L);
                    } else {
                        go0Var4.m1966W(-1996160456);
                        jM4932c = ((lp1) go0Var4.m1988j(ur1.f11452a)).f6239g;
                        go0Var4.m1994p(false);
                    }
                    ci0.m811l(sx0Var, null, jM4932c, go0Var4, 0, 2);
                } else {
                    go0Var4.m1961R();
                }
                return a83.f116a;
            case 10:
                ((Integer) obj2).getClass();
                ((cz0) this.f9993i).m924a(pp0.m3902N(1), (InterfaceC0596px) obj);
                return a83.f116a;
            case 11:
                ((kz2) this.f9993i).mo2780e(((rs1) obj2).f9744a);
                return a83.f116a;
            case 12:
                xk1 xk1Var = (xk1) this.f9993i;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) interfaceC0596px4;
                if (go0Var5.m1958O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                    boolean zM1980f = go0Var5.m1980f(xk1Var);
                    Object objM1956L = go0Var5.m1956L();
                    if (zM1980f || objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0590pr(xk1Var, 12);
                        go0Var5.m1981f0(objM1956L);
                    }
                    sp0.m4944i(zBooleanValue, (in0) objM1956L, null, false, 0, go0Var5, 0, 60);
                } else {
                    go0Var5.m1961R();
                }
                return a83.f116a;
            case 13:
                qj1 qj1Var = (qj1) this.f9993i;
                Set set = (Set) obj;
                synchronized (qj1Var.f10161h) {
                    try {
                        rk1 rk1Var = qj1Var.f8998i;
                        C0115d2 c0115d2 = new C0115d2(22, set, qj1Var);
                        xe1.m6119f(1, c0115d2);
                        Object[] objArr = rk1Var.f9619b;
                        long[] jArr = rk1Var.f9618a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((j & 255) < 128) {
                                            c0115d2.mo5j(objArr[(i << 3) + i3]);
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
                        sk1 sk1Var3 = qj1Var.f9000k;
                        Object[] objArr2 = sk1Var3.f10175b;
                        long[] jArr2 = sk1Var3.f10174a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr2[i4];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j2 & 255) < 128) {
                                            ((ho2) objArr2[(i4 << 3) + i6]).mo2225s(a83.f116a);
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
                        qj1Var.f9000k.m4883b();
                    } finally {
                    }
                }
                return a83.f116a;
            case 14:
                i62 i62Var = (i62) this.f9993i;
                Set set2 = (Set) obj;
                synchronized (i62Var.f4293c) {
                    try {
                        if (((f62) i62Var.f4311u.getValue()).compareTo(f62.f2820l) >= 0) {
                            sk1 sk1Var4 = i62Var.f4298h;
                            if (set2 instanceof gd2) {
                                sk1 sk1Var5 = ((gd2) set2).f3413h;
                                Object[] objArr3 = sk1Var5.f10175b;
                                long[] jArr3 = sk1Var5.f10174a;
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
                                                    if (!(obj3 instanceof qu2) || ((qu2) obj3).m4279e(1)) {
                                                        sk1Var4.m4882a(obj3);
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
                                    if (!(obj4 instanceof qu2) || ((qu2) obj4).m4279e(1)) {
                                        sk1Var4.m4882a(obj4);
                                    }
                                }
                            }
                            interfaceC0432lpM2294y = i62Var.m2294y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (interfaceC0432lpM2294y != null) {
                    ((C0469mp) interfaceC0432lpM2294y).mo2509h(a83.f116a);
                }
                return a83.f116a;
            case 15:
                ub2 ub2Var = (ub2) this.f9993i;
                int iIntValue5 = ((Integer) obj).intValue();
                y10 y10Var = (y10) obj2;
                z10 key = y10Var.getKey();
                y10 y10VarMo15o = ub2Var.f11210l.mo15o(key);
                if (key != C0700sn.f10207K) {
                    iIntValue5 = y10Var != y10VarMo15o ? Integer.MIN_VALUE : iIntValue5 + 1;
                } else {
                    k21 k21Var2 = (k21) y10VarMo15o;
                    k21 parent = (k21) y10Var;
                    while (parent != null) {
                        if (parent != k21Var2 && (parent instanceof hd2)) {
                            InterfaceC0472ms interfaceC0472ms = (InterfaceC0472ms) r21.f9331i.get((hd2) parent);
                            parent = interfaceC0472ms != null ? interfaceC0472ms.getParent() : null;
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
                Context context = (Context) this.f9993i;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) interfaceC0596px5;
                if (go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strM4462P = rg3.m4462P(R.string.script_settings_directory, go0Var6);
                    sq1 sq1Var = sq1.f10305a;
                    context.getClass();
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        fileM5901g0 = wi0.m5901g0(externalFilesDir, "nuke/scripts");
                    } else {
                        File filesDir = context.getFilesDir();
                        filesDir.getClass();
                        fileM5901g0 = wi0.m5901g0(filesDir, "nuke/scripts");
                    }
                    String absolutePath = fileM5901g0.getAbsolutePath();
                    absolutePath.getClass();
                    sp0.m4940g(strM4462P, null, absolutePath, null, null, null, false, null, null, go0Var6, 0, 506);
                } else {
                    go0Var6.m1961R();
                }
                return a83.f116a;
            case 17:
                am2 am2Var = (am2) this.f9993i;
                AbstractC0570p7.m3745A(am2Var.m5255A0(), null, new zl2(am2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 18:
                b72 b72Var = (b72) this.f9993i;
                ((o12) obj).m3463a();
                b72Var.f722h = ((rs1) obj2).f9744a;
                return a83.f116a;
            case 19:
                zq2 zq2Var = (zq2) this.f9993i;
                Set set3 = (Set) obj;
                synchronized (zq2Var.f10161h) {
                    try {
                        sk1 sk1Var6 = zq2Var.f14067k;
                        if (sk1Var6 != null) {
                            Object[] objArr4 = sk1Var6.f10175b;
                            long[] jArr4 = sk1Var6.f10174a;
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
                                                    ho2Var = zq2Var.f14069m;
                                                }
                                            } else if (i11 == 8) {
                                            }
                                        }
                                    } else if (i10 != length4) {
                                        i10++;
                                    }
                                }
                            }
                        } else if (AbstractC0142du.m1157m0(set3, zq2Var.f14065i)) {
                            ho2Var = zq2Var.f14069m;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ho2Var != null) {
                    ho2Var.mo2225s(a83.f116a);
                }
                return a83.f116a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ts2 ts2Var = (ts2) this.f9993i;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = ts2Var.f10948b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        objM1168x0 = set4;
                    } else if (obj5 instanceof Set) {
                        objM1168x0 = AbstractC0179eu.m1435P(obj5, set4);
                    } else {
                        if (!(obj5 instanceof List)) {
                            AbstractC0752tx.m5444b("Unexpected notification");
                            C0676s.m4644b();
                            return null;
                        }
                        objM1168x0 = AbstractC0142du.m1168x0((Collection) obj5, AbstractC0179eu.m1434O(set4));
                    }
                    while (!atomicReference.compareAndSet(obj5, objM1168x0)) {
                        if (atomicReference.get() != obj5) {
                        }
                        break;
                    }
                    if (ts2Var.m5435b()) {
                        ts2Var.f10947a.mo5j(new C0727ta(26, ts2Var));
                    }
                    return a83.f116a;
                }
                break;
            case 21:
                char[] cArr = (char[]) this.f9993i;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iM4005r0 = pv2.m4005r0(charSequence, cArr, iIntValue7, false);
                if (iM4005r0 < 0) {
                    return null;
                }
                return new ow1(Integer.valueOf(iM4005r0), 1);
            case 22:
                TextClassification textClassification = (TextClassification) this.f9993i;
                ((Integer) obj2).getClass();
                go0 go0Var7 = (go0) ((InterfaceC0596px) obj);
                go0Var7.m1966W(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                go0Var7.m1994p(false);
                return strValueOf;
            case 23:
                RemoteAction remoteAction = (RemoteAction) this.f9993i;
                ((Integer) obj2).intValue();
                go0 go0Var8 = (go0) ((InterfaceC0596px) obj);
                go0Var8.m1966W(-1376593684);
                String string = remoteAction.getTitle().toString();
                go0Var8.m1994p(false);
                return string;
            default:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4838i((jc3) this.f9993i, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83.f116a;
        }
    }

    public /* synthetic */ C0686s9(int i, Object obj) {
        this.f9992h = i;
        this.f9993i = obj;
    }
}
