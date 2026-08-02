package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class s43 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        l41Var.m2824b();
        while (l41Var.m2832p()) {
            try {
                arrayList.add(Integer.valueOf(l41Var.m2837v()));
            } catch (NumberFormatException e) {
                throw new t31(e);
            }
        }
        l41Var.m2828h();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        o41Var.m3491c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            o41Var.m3485A(r5.get(i));
        }
        o41Var.m3494h();
    }
}
