package p000;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0607p9 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4782d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4784f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f4785g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0607p9(C0616pi c0616pi, C0351jd c0351jd, v11 v11Var, mg0 mg0Var) {
        this.f4782d = 2;
        this.f4783e = c0616pi;
        this.f4784f = c0351jd;
        this.f4785g = v11Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r6.f837x == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r7 = (p000.st0) r6.f835v.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        if (p000.C0095ck.m546x0(r6, r7, 0, 0, 3) != true) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
    
        r6.f837x = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        r15.f6631e = p000.C0095ck.m545w0(r6, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015f, code lost:
    
        return r4;
     */
    @Override // p000.InterfaceC0298hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        List listM2782v;
        int i2 = this.f4782d;
        na1 na1Var = na1.f4229a;
        Object obj = this.f4785g;
        Object obj2 = this.f4784f;
        Object obj3 = this.f4783e;
        switch (i2) {
            case 0:
                ((AbstractC0644q9) obj3).mo1326a();
                C0238g9 c0238g9 = (C0238g9) ((C0681r9) obj2).f5329c;
                int i3 = ((xt0) obj).f7423d;
                do {
                    i = c0238g9.get();
                } while (!c0238g9.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return na1Var;
            case 1:
                C0277hb c0277hb = (C0277hb) obj3;
                st0 st0VarM1285w0 = C0277hb.m1285w0(c0277hb, (qj0) obj2, (C0458m3) obj);
                if (st0VarM1285w0 == null) {
                    return null;
                }
                C0095ck c0095ck = c0277hb.f2186r;
                if (d30.m628a(c0095ck.f838y, 0L)) {
                    z10.m5363c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return st0VarM1285w0.m4105e(c0095ck.m550z0(st0VarM1285w0, c0095ck.f838y, 0L) ^ (-9223372034707292160L));
            case 2:
                C0616pi c0616pi = (C0616pi) obj3;
                C0351jd c0351jd = (C0351jd) obj2;
                v11 v11Var = (v11) obj;
                C0395ki c0395ki = c0616pi.f4871M;
                C0351jd c0351jd2 = c0395ki.f3156b;
                try {
                    c0395ki.f3156b = c0351jd;
                    v11 v11Var2 = c0616pi.f4865G;
                    int[] iArr = c0616pi.f4894o;
                    ug0 ug0Var = c0616pi.f4901v;
                    c0616pi.f4894o = null;
                    c0616pi.f4901v = null;
                    try {
                        c0616pi.f4865G = v11Var;
                        boolean z = c0395ki.f3159e;
                        try {
                            c0395ki.f3159e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0395ki.f3159e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0616pi.f4865G = v11Var2;
                        c0616pi.f4894o = iArr;
                        c0616pi.f4901v = ug0Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0395ki.f3156b = c0351jd2;
                    throw th3;
                }
            case 3:
                C0095ck c0095ck2 = (C0095ck) obj3;
                va1 va1Var = (va1) obj2;
                InterfaceC0386kb interfaceC0386kb = (InterfaceC0386kb) obj;
                C0166eb c0166eb = c0095ck2.f836w;
                while (true) {
                    sh0 sh0Var = c0166eb.f1367a;
                    int i4 = sh0Var.f5770f;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        st0 st0Var = (st0) ((C0965yj) sh0Var.f5768d[i4 - 1]).f7650a.invoke();
                        if (st0Var == null ? true : C0095ck.m546x0(c0095ck2, st0Var, 0L, 0L, 3)) {
                            sh0 sh0Var2 = c0166eb.f1367a;
                            ((C0965yj) sh0Var2.m4081k(sh0Var2.f5770f - 1)).f7651b.mo541i(na1Var);
                        }
                    }
                    break;
                }
                break;
            case 4:
                return new wn0((InterfaceC0978yw) ((oh0) obj3).getValue(), (InterfaceC0742sw) ((oh0) obj2).getValue(), ((Number) ((InterfaceC0298hw) obj).invoke()).intValue());
            case 5:
                c90 c90Var = (c90) obj2;
                p80 p80Var = (p80) ((C0135dn) obj3).getValue();
                return new r80(c90Var, p80Var, (y60) obj, new C0791u5((z20) ((t70) c90Var.f743e.f1700e).getValue(), p80Var));
            case 6:
                return ck0.m559J((TextView) obj3, (Activity) obj2, (GradientDrawable) obj);
            default:
                C0788u2 c0788u2 = (C0788u2) obj3;
                z11 z11Var = (z11) obj2;
                qm0 qm0Var = (qm0) obj;
                if (c0788u2 != null) {
                    z11Var.m5388a(z11Var.m5390c(c0788u2) - z11Var.f7770t);
                }
                List listM3006p = p30.m3006p(z11Var, null, z11Var.f7770t, null);
                C0130di c0130di = (C0130di) AbstractC0960ye.m5247Q(listM3006p);
                Integer num = c0130di != null ? c0130di.f1111b : null;
                List listMo610e = qm0Var.mo610e(num);
                if (num != null && !listMo610e.isEmpty()) {
                    C0130di c0130di2 = (C0130di) AbstractC0960ye.m5240J(listMo610e);
                    int size = listMo610e.size() - 1;
                    if (size <= 0) {
                        listM2782v = C0294hs.f2354d;
                    } else if (size == 1) {
                        listM2782v = o30.m2782v(AbstractC0960ye.m5246P(listMo610e));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listMo610e instanceof RandomAccess) {
                            int size2 = listMo610e.size();
                            for (int i5 = 1; i5 < size2; i5++) {
                                arrayList.add(listMo610e.get(i5));
                            }
                        } else {
                            ListIterator listIterator = listMo610e.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        listM2782v = arrayList;
                    }
                    listMo610e = AbstractC0960ye.m5249S(o30.m2782v(new C0130di(c0130di2.f1110a, null, num)), listM2782v);
                }
                return new C0093ci(AbstractC0960ye.m5249S(listM3006p, listMo610e));
        }
    }

    public /* synthetic */ C0607p9(Object obj, Object obj2, Object obj3, int i) {
        this.f4782d = i;
        this.f4783e = obj;
        this.f4784f = obj2;
        this.f4785g = obj3;
    }
}
