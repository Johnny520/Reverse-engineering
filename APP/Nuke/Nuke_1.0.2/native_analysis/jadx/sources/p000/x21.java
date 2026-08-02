package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x21 implements r43 {

    /* JADX INFO: renamed from: j */
    public static final w21 f12773j;

    /* JADX INFO: renamed from: h */
    public final sz0 f12774h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f12775i = new ConcurrentHashMap();

    static {
        int i = 0;
        f12773j = new w21(i);
        new w21(i);
    }

    public x21(sz0 sz0Var) {
        this.f12774h = sz0Var;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        v21 v21Var = (v21) j63Var.f4904a.getAnnotation(v21.class);
        if (v21Var == null) {
            return null;
        }
        return m6024b(this.f12774h, ir0Var, j63Var, v21Var, true);
    }

    /* JADX INFO: renamed from: b */
    public final q43 m6024b(sz0 sz0Var, ir0 ir0Var, j63 j63Var, v21 v21Var, boolean z) {
        q43 q43VarMo162a;
        Object objMo2023a = sz0Var.m5031D(new j63(v21Var.value()), true).mo2023a();
        boolean zNullSafe = v21Var.nullSafe();
        if (objMo2023a instanceof q43) {
            q43VarMo162a = (q43) objMo2023a;
        } else {
            if (!(objMo2023a instanceof r43)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo2023a.getClass().getName() + " as a @JsonAdapter for " + AbstractC0738tl.m5305d0(j63Var.f4905b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            r43 r43Var = (r43) objMo2023a;
            if (z) {
                r43 r43Var2 = (r43) this.f12775i.putIfAbsent(j63Var.f4904a, r43Var);
                if (r43Var2 != null) {
                    r43Var = r43Var2;
                }
            }
            q43VarMo162a = r43Var.mo162a(ir0Var, j63Var);
        }
        return (q43VarMo162a == null || !zNullSafe) ? q43VarMo162a : q43VarMo162a.m4053a();
    }
}
