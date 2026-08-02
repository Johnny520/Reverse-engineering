package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lg extends q43 {
    public static final kg c = new kg();
    public final Class a;
    public final ue1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lg(ir0 ir0Var, q43 q43Var, Class cls) {
        this.b = new ue1(ir0Var, q43Var, cls);
        this.a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        l41Var.b();
        while (l41Var.p()) {
            arrayList.add(this.b.c.b(l41Var));
        }
        l41Var.h();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.p();
            return;
        }
        o41Var.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(o41Var, Array.get(obj, i));
        }
        o41Var.h();
    }
}
