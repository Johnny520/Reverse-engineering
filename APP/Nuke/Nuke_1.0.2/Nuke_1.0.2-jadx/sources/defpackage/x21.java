package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x21 implements r43 {
    public static final w21 j;
    public final sz0 h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        j = new w21(i);
        new w21(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x21(sz0 sz0Var) {
        this.h = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        v21 v21Var = (v21) j63Var.a.getAnnotation(v21.class);
        if (v21Var == null) {
            return null;
        }
        return b(this.h, ir0Var, j63Var, v21Var, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q43 b(sz0 sz0Var, ir0 ir0Var, j63 j63Var, v21 v21Var, boolean z) {
        q43 q43VarA;
        Object objA = sz0Var.D(new j63(v21Var.value()), true).a();
        boolean zNullSafe = v21Var.nullSafe();
        if (objA instanceof q43) {
            q43VarA = (q43) objA;
        } else {
            if (!(objA instanceof r43)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + tl.d0(j63Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            r43 r43Var = (r43) objA;
            if (z) {
                r43 r43Var2 = (r43) this.i.putIfAbsent(j63Var.a, r43Var);
                if (r43Var2 != null) {
                    r43Var = r43Var2;
                }
            }
            q43VarA = r43Var.a(ir0Var, j63Var);
        }
        return (q43VarA == null || !zNullSafe) ? q43VarA : q43VarA.a();
    }
}
