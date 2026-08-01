package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements y41, zd0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ k60 f2149d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ q60 f2150e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h60(q60 q60Var) {
        this.f2150e = q60Var;
        this.f2149d = q60Var.f5063k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: E */
    public final yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        return this.f2149d.mo1278E(i, i2, map, interfaceC0742sw, interfaceC0742sw2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: F */
    public final int mo641F(float f) {
        return this.f2149d.mo641F(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: M */
    public final long mo644M(long j) {
        return this.f2149d.mo644M(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: P */
    public final float mo645P(long j) {
        return this.f2149d.mo645P(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: Q */
    public final yd0 mo1279Q(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw) {
        return this.f2149d.mo1278E(i, i2, map, null, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: Z */
    public final long mo647Z(float f) {
        return this.f2149d.mo647Z(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f2149d.f3026e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: f0 */
    public final float mo652f0(int i) {
        return this.f2149d.mo652f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f2149d.f3025d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f2149d.f3027f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: i0 */
    public final float mo653i0(float f) {
        return f / this.f2149d.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    /* JADX INFO: renamed from: m */
    public final boolean mo53m() {
        return this.f2149d.mo53m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return this.f2149d.mo187o(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: p */
    public final float mo654p(float f) {
        return this.f2149d.mo48b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y41
    /* JADX INFO: renamed from: w */
    public final List mo1280w(InterfaceC0904ww interfaceC0904ww, Object obj) {
        q60 q60Var = this.f2150e;
        b60 b60Var = q60Var.f5056d;
        jh0 jh0Var = q60Var.f5062j;
        b60 b60Var2 = (b60) jh0Var.m1701g(obj);
        if (b60Var2 != null && ((ph0) b60Var.m308o()).f4858d.m4079i(b60Var2) < q60Var.f5059g) {
            return b60Var2.m306m();
        }
        jh0 jh0Var2 = q60Var.f5067o;
        jh0 jh0Var3 = q60Var.f5065m;
        sh0 sh0Var = q60Var.f5068p;
        if (sh0Var.f5770f < q60Var.f5060h) {
            w10.m4823a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        b60 b60Var3 = (b60) jh0Var.m1701g(obj);
        int i = sh0Var.f5770f;
        int i2 = q60Var.f5060h;
        if (i == i2) {
            sh0Var.m4072b(obj);
        } else {
            Object[] objArr = sh0Var.f5768d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        q60Var.f5060h++;
        boolean zM1696b = jh0Var3.m1696b(obj);
        if (zM1696b || b60Var3 != null) {
            if (!zM1696b && b60Var3 != null) {
                q60Var.m3202j(((ph0) b60Var.m308o()).f4858d.m4079i(b60Var3), ((ph0) b60Var.m308o()).f4858d.f5770f);
                q60Var.f5070r++;
                jh0Var.m1705k(obj);
                jh0Var3.m1707m(obj, b60Var3);
                jh0Var2.m1707m(obj, q60Var.m3198f(obj));
                if (b60Var.m272H()) {
                    q60Var.m3200h();
                }
            }
            b60 b60Var4 = (b60) jh0Var3.m1701g(obj);
            i60 i60Var = b60Var4 != null ? (i60) q60Var.f5061i.m1701g(b60Var4) : null;
            if (i60Var != null && i60Var.f2462d) {
                q60Var.m3205m(b60Var4, obj, false, interfaceC0904ww);
            }
            if ((i60Var != null ? i60Var.f2464f : null) != null) {
                q60Var.m3197d(i60Var, true);
            }
        } else {
            q60Var.m3203k(obj, interfaceC0904ww, false);
            jh0Var2.m1707m(obj, q60Var.m3198f(obj));
        }
        b60 b60Var5 = (b60) jh0Var3.m1701g(obj);
        if (b60Var5 == null) {
            return C0294hs.f2354d;
        }
        List listM5003b0 = b60Var5.f396J.f1607p.m5003b0();
        ph0 ph0Var = (ph0) listM5003b0;
        int i3 = ph0Var.f4858d.f5770f;
        for (int i4 = 0; i4 < i3; i4++) {
            ((wd0) ph0Var.get(i4)).f7095i.f1593b = true;
        }
        return listM5003b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        return this.f2149d.mo188y(j);
    }
}
