package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: zj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1006zj implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7912d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f7914f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f7915g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1006zj(C0095ck c0095ck, va1 va1Var, c40 c40Var, jz0 jz0Var) {
        this.f7912d = 0;
        this.f7913e = c0095ck;
        this.f7914f = c40Var;
        this.f7915g = jz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f7912d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f7915g;
        Object obj3 = this.f7914f;
        Object obj4 = this.f7913e;
        switch (i) {
            case 0:
                C0095ck c0095ck = (C0095ck) obj4;
                c40 c40Var = (c40) obj3;
                jz0 jz0Var = (jz0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = c0095ck.f833t ? 1.0f : -1.0f;
                lz0 lz0Var = c0095ck.f832s;
                long jM2094e = lz0Var.m2094e(lz0Var.m2097h(f * fFloatValue));
                lz0 lz0Var2 = jz0Var.f2961a;
                float fM2096g = lz0Var.m2096g(lz0Var.m2094e(lz0Var2.m2092c(lz0Var2.f3631k, jM2094e, 1))) * f;
                if (Math.abs(fM2096g) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM2096g + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    c40Var.mo478a(cancellationException);
                }
                return na1Var;
            case 1:
                wt0 wt0Var = (wt0) obj4;
                C0793u7 c0793u7 = (C0793u7) obj;
                float fFloatValue2 = ((Number) c0793u7.f6150e.getValue()).floatValue() - wt0Var.f7189d;
                float fMo1511a = ((hz0) obj3).mo1511a(fFloatValue2);
                wt0Var.f7189d = ((Number) c0793u7.f6150e.getValue()).floatValue();
                ((wt0) obj2).f7189d = ((Number) c0793u7.f6146a.f5090b.invoke(c0793u7.f6151f)).floatValue();
                if (Math.abs(fFloatValue2 - fMo1511a) > 0.5f) {
                    c0793u7.m4285a();
                }
                return na1Var;
            case 2:
                return C0906wy.m5056v((Method) obj4, obj3, (List) obj2, ((Boolean) obj).booleanValue());
            case 3:
                oh0 oh0Var = (oh0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                wq0 wq0Var = (wq0) obj;
                wq0Var.f7170d = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((w80) arrayList.get(i2)).m4923b(wq0Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((w80) list.get(i3)).m4923b(wq0Var);
                }
                wq0Var.f7170d = false;
                oh0Var.getValue();
                return na1Var;
            default:
                yw0 yw0Var = (yw0) obj4;
                cx0 cx0Var = (cx0) obj2;
                jh0 jh0Var = yw0Var.f7699e;
                if (jh0Var.m1696b(obj3)) {
                    C0921xc.m5127h("Key ", obj3, " was used multiple times ");
                    return null;
                }
                yw0Var.f7698d.remove(obj3);
                jh0Var.m1707m(obj3, cx0Var);
                return new xw0(yw0Var, obj3, cx0Var);
        }
    }

    public /* synthetic */ C1006zj(oh0 oh0Var, ArrayList arrayList, List list, boolean z) {
        this.f7912d = 3;
        this.f7913e = oh0Var;
        this.f7914f = arrayList;
        this.f7915g = list;
    }

    public /* synthetic */ C1006zj(wt0 wt0Var, hz0 hz0Var, wt0 wt0Var2, C0856vl c0856vl) {
        this.f7912d = 1;
        this.f7913e = wt0Var;
        this.f7914f = hz0Var;
        this.f7915g = wt0Var2;
    }

    public /* synthetic */ C1006zj(Object obj, Object obj2, Object obj3, int i) {
        this.f7912d = i;
        this.f7913e = obj;
        this.f7914f = obj2;
        this.f7915g = obj3;
    }
}
