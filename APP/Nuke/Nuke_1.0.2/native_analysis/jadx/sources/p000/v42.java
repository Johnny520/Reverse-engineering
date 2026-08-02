package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v42 extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ QuickJs f11679l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f11680m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f11681n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f11682o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(QuickJs quickJs, String str, String str2, boolean z, t00 t00Var) {
        super(1, t00Var);
        this.f11679l = quickJs;
        this.f11680m = str;
        this.f11681n = str2;
        this.f11682o = z;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        String str = this.f11681n;
        boolean z = this.f11682o;
        return new v42(this.f11679l, this.f11680m, str, z, (t00) obj).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        fg1.m1627T(obj);
        QuickJs quickJs = this.f11679l;
        return quickJs.evaluate(quickJs.context, quickJs.globals, this.f11680m, this.f11681n, this.f11682o);
    }
}
