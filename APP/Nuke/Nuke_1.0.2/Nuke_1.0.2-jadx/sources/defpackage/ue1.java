package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends q43 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final q43 c;
    public final Object d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ue1(cu cuVar, ue1 ue1Var, ue1 ue1Var2, gs1 gs1Var) {
        this.b = ue1Var;
        this.c = ue1Var2;
        this.d = gs1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        switch (this.a) {
            case 0:
                int I = l41Var.I();
                if (I == 9) {
                    l41Var.E();
                    return null;
                }
                Map map = (Map) ((gs1) this.d).a();
                if (I == 1) {
                    l41Var.b();
                    while (l41Var.p()) {
                        l41Var.b();
                        Object objB = ((ue1) this.b).c.b(l41Var);
                        if (map.put(objB, ((ue1) this.c).c.b(l41Var)) != null) {
                            throw new t31("duplicate key: " + objB);
                        }
                        l41Var.h();
                    }
                    l41Var.h();
                } else {
                    l41Var.c();
                    while (l41Var.p()) {
                        eb.i.getClass();
                        int iG = l41Var.n;
                        if (iG == 0) {
                            iG = l41Var.g();
                        }
                        if (iG == 13) {
                            l41Var.n = 9;
                        } else if (iG == 12) {
                            l41Var.n = 8;
                        } else {
                            if (iG != 14) {
                                throw l41Var.R("a name");
                            }
                            l41Var.n = 10;
                        }
                        Object objB2 = ((ue1) this.b).c.b(l41Var);
                        if (map.put(objB2, ((ue1) this.c).c.b(l41Var)) != null) {
                            throw new t31("duplicate key: " + objB2);
                        }
                    }
                    l41Var.j();
                }
                return map;
            default:
                return this.c.b(l41Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // defpackage.q43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(o41 o41Var, Object obj) throws IOException {
        q43 q43VarD;
        int i = this.a;
        q43 q43Var = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ue1 ue1Var = (ue1) q43Var;
                if (map == null) {
                    o41Var.p();
                } else {
                    o41Var.e();
                    for (Map.Entry entry : map.entrySet()) {
                        o41Var.k(String.valueOf(entry.getKey()));
                        ue1Var.c(o41Var, entry.getValue());
                    }
                    o41Var.j();
                }
                break;
            default:
                Type type = (Type) this.d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    q43 q43VarC = ((ir0) this.b).c(new j63(type2));
                    if (q43VarC instanceof j72) {
                        q43 q43Var2 = q43Var;
                        while ((q43Var2 instanceof ep2) && (q43VarD = ((ep2) q43Var2).d()) != q43Var2) {
                            q43Var2 = q43VarD;
                        }
                        if (q43Var2 instanceof j72) {
                        }
                    } else {
                        q43Var = q43VarC;
                    }
                }
                q43Var.c(o41Var, obj);
                break;
        }
    }

    public ue1(ir0 ir0Var, q43 q43Var, Type type) {
        this.b = ir0Var;
        this.c = q43Var;
        this.d = type;
    }
}
