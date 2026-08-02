package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends q43 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11256a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f11257b;

    /* JADX INFO: renamed from: c */
    public final q43 f11258c;

    /* JADX INFO: renamed from: d */
    public final Object f11259d;

    public ue1(C0106cu c0106cu, ue1 ue1Var, ue1 ue1Var2, gs1 gs1Var) {
        this.f11257b = ue1Var;
        this.f11258c = ue1Var2;
        this.f11259d = gs1Var;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        switch (this.f11256a) {
            case 0:
                int iM2814I = l41Var.m2814I();
                if (iM2814I == 9) {
                    l41Var.m2810E();
                    return null;
                }
                Map map = (Map) ((gs1) this.f11259d).mo2023a();
                if (iM2814I == 1) {
                    l41Var.m2824b();
                    while (l41Var.m2832p()) {
                        l41Var.m2824b();
                        Object objMo97b = ((ue1) this.f11257b).f11258c.mo97b(l41Var);
                        if (map.put(objMo97b, ((ue1) this.f11258c).f11258c.mo97b(l41Var)) != null) {
                            throw new t31("duplicate key: " + objMo97b);
                        }
                        l41Var.m2828h();
                    }
                    l41Var.m2828h();
                } else {
                    l41Var.m2825c();
                    while (l41Var.m2832p()) {
                        C0160eb.f2377i.getClass();
                        int iM2827g = l41Var.f5925n;
                        if (iM2827g == 0) {
                            iM2827g = l41Var.m2827g();
                        }
                        if (iM2827g == 13) {
                            l41Var.f5925n = 9;
                        } else if (iM2827g == 12) {
                            l41Var.f5925n = 8;
                        } else {
                            if (iM2827g != 14) {
                                throw l41Var.m2823R("a name");
                            }
                            l41Var.f5925n = 10;
                        }
                        Object objMo97b2 = ((ue1) this.f11257b).f11258c.mo97b(l41Var);
                        if (map.put(objMo97b2, ((ue1) this.f11258c).f11258c.mo97b(l41Var)) != null) {
                            throw new t31("duplicate key: " + objMo97b2);
                        }
                    }
                    l41Var.m2829j();
                }
                return map;
            default:
                return this.f11258c.mo97b(l41Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        q43 q43VarMo1410d;
        int i = this.f11256a;
        q43 q43Var = this.f11258c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ue1 ue1Var = (ue1) q43Var;
                if (map == null) {
                    o41Var.m3498p();
                } else {
                    o41Var.m3492e();
                    for (Map.Entry entry : map.entrySet()) {
                        o41Var.m3496k(String.valueOf(entry.getKey()));
                        ue1Var.mo98c(o41Var, entry.getValue());
                    }
                    o41Var.m3495j();
                }
                break;
            default:
                Type type = (Type) this.f11259d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    q43 q43VarM2386c = ((ir0) this.f11257b).m2386c(new j63(type2));
                    if (q43VarM2386c instanceof j72) {
                        q43 q43Var2 = q43Var;
                        while ((q43Var2 instanceof ep2) && (q43VarMo1410d = ((ep2) q43Var2).mo1410d()) != q43Var2) {
                            q43Var2 = q43VarMo1410d;
                        }
                        if (q43Var2 instanceof j72) {
                        }
                    } else {
                        q43Var = q43VarM2386c;
                    }
                }
                q43Var.mo98c(o41Var, obj);
                break;
        }
    }

    public ue1(ir0 ir0Var, q43 q43Var, Type type) {
        this.f11257b = ir0Var;
        this.f11258c = q43Var;
        this.f11259d = type;
    }
}
