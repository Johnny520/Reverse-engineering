package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: lg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0423lg extends q43 {

    /* JADX INFO: renamed from: c */
    public static final C0386kg f6103c = new C0386kg();

    /* JADX INFO: renamed from: a */
    public final Class f6104a;

    /* JADX INFO: renamed from: b */
    public final ue1 f6105b;

    public C0423lg(ir0 ir0Var, q43 q43Var, Class cls) {
        this.f6105b = new ue1(ir0Var, q43Var, cls);
        this.f6104a = cls;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        l41Var.m2824b();
        while (l41Var.m2832p()) {
            arrayList.add(this.f6105b.f11258c.mo97b(l41Var));
        }
        l41Var.m2828h();
        int size = arrayList.size();
        Class cls = this.f6104a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.m3498p();
            return;
        }
        o41Var.m3491c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f6105b.mo98c(o41Var, Array.get(obj, i));
        }
        o41Var.m3494h();
    }
}
