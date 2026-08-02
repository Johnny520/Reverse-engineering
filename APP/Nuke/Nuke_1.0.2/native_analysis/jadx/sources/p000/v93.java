package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v93 {
    /* JADX INFO: renamed from: a */
    public static final void m5655a(ar0 ar0Var, r93 r93Var) {
        List list = r93Var.f9481q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t93 t93Var = (t93) list.get(i);
            if (t93Var instanceof w93) {
                wx1 wx1Var = new wx1();
                w93 w93Var = (w93) t93Var;
                wx1Var.f12707d = w93Var.f12425i;
                wx1Var.f12717n = true;
                wx1Var.m2307c();
                wx1Var.f12722s.f13365a.setFillType(w93Var.f12426j == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                wx1Var.m2307c();
                wx1Var.m2307c();
                wx1Var.f12705b = w93Var.f12427k;
                wx1Var.m2307c();
                wx1Var.f12706c = w93Var.f12428l;
                wx1Var.m2307c();
                wx1Var.f12710g = w93Var.f12429m;
                wx1Var.m2307c();
                wx1Var.f12708e = w93Var.f12430n;
                wx1Var.m2307c();
                wx1Var.f12709f = w93Var.f12431o;
                wx1Var.f12718o = true;
                wx1Var.m2307c();
                wx1Var.f12711h = w93Var.f12432p;
                wx1Var.f12718o = true;
                wx1Var.m2307c();
                wx1Var.f12712i = w93Var.f12433q;
                wx1Var.f12718o = true;
                wx1Var.m2307c();
                wx1Var.f12713j = w93Var.f12434r;
                wx1Var.f12718o = true;
                wx1Var.m2307c();
                wx1Var.f12714k = w93Var.f12435s;
                wx1Var.f12719p = true;
                wx1Var.m2307c();
                wx1Var.f12715l = w93Var.f12436t;
                wx1Var.f12719p = true;
                wx1Var.m2307c();
                wx1Var.f12716m = w93Var.f12437u;
                wx1Var.f12719p = true;
                wx1Var.m2307c();
                ar0Var.m263e(i, wx1Var);
            } else if (t93Var instanceof r93) {
                ar0 ar0Var2 = new ar0();
                r93 r93Var2 = (r93) t93Var;
                ar0Var2.f350k = r93Var2.f9472h;
                ar0Var2.m2307c();
                ar0Var2.f351l = r93Var2.f9473i;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f354o = r93Var2.f9476l;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f355p = r93Var2.f9477m;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f356q = r93Var2.f9478n;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f357r = r93Var2.f9479o;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f352m = r93Var2.f9474j;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f353n = r93Var2.f9475k;
                ar0Var2.f358s = true;
                ar0Var2.m2307c();
                ar0Var2.f345f = r93Var2.f9480p;
                ar0Var2.f346g = true;
                ar0Var2.m2307c();
                m5655a(ar0Var2, r93Var2);
                ar0Var.m263e(i, ar0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m5656b() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: c */
    public static final u93 m5657c(sx0 sx0Var, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        e70 e70Var = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
        boolean zM1978e = go0Var.m1978e((((long) Float.floatToRawIntBits(e70Var.mo693b())) & 4294967295L) | (((long) Float.floatToRawIntBits(sx0Var.f10407j)) << 32));
        Object objM1956L = go0Var.m1956L();
        if (zM1978e || objM1956L == C0520nx.f7360a) {
            ar0 ar0Var = new ar0();
            m5655a(ar0Var, sx0Var.f10403f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e70Var.mo689A(sx0Var.f10399b))) << 32) | (((long) Float.floatToRawIntBits(e70Var.mo689A(sx0Var.f10400c))) & 4294967295L);
            float fIntBitsToFloat = sx0Var.f10401d;
            float fIntBitsToFloat2 = sx0Var.f10402e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            u93 u93Var = new u93(ar0Var);
            String str = sx0Var.f10398a;
            long j = sx0Var.f10404g;
            C0095cl c0095cl = j != 16 ? new C0095cl(j, sx0Var.f10405h) : null;
            boolean z = sx0Var.f10406i;
            u93Var.f11172e.setValue(new gr2(jFloatToRawIntBits));
            u93Var.f11173f.setValue(Boolean.valueOf(z));
            q93 q93Var = u93Var.f11174g;
            q93Var.f8843g.setValue(c0095cl);
            q93Var.f8845i.setValue(new gr2(jFloatToRawIntBits2));
            q93Var.f8839c = str;
            go0Var.m1981f0(u93Var);
            objM1956L = u93Var;
        }
        return (u93) objM1956L;
    }
}
