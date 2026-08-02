package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 implements of1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f13319c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ in0 f13320d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ z61 f13321e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ f71 f13322f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ in0 f13323g;

    public y61(int i, int i2, Map map, in0 in0Var, z61 z61Var, f71 f71Var, in0 in0Var2) {
        this.f13317a = i;
        this.f13318b = i2;
        this.f13319c = map;
        this.f13320d = in0Var;
        this.f13321e = z61Var;
        this.f13322f = f71Var;
        this.f13323g = in0Var2;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: a */
    public final Map mo104a() {
        return this.f13319c;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: b */
    public final void mo105b() {
        pz0 pz0Var;
        r61 r61Var = this.f13322f.f2826h;
        boolean zMo699u = this.f13321e.mo699u();
        in0 in0Var = this.f13323g;
        if (!zMo699u || (pz0Var = ((qz0) r61Var.f9372M.f12033d).f9294Z) == null) {
            in0Var.mo5j(((qz0) r61Var.f9372M.f12033d).f5469s);
        } else {
            in0Var.mo5j(pz0Var.f5469s);
        }
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: c */
    public final int mo106c() {
        return this.f13318b;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: d */
    public final in0 mo107d() {
        return this.f13320d;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: e */
    public final int mo108e() {
        return this.f13317a;
    }
}
