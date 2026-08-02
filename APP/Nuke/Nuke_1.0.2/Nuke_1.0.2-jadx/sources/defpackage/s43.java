package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class s43 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        l41Var.b();
        while (l41Var.p()) {
            try {
                arrayList.add(Integer.valueOf(l41Var.v()));
            } catch (NumberFormatException e) {
                throw new t31(e);
            }
        }
        l41Var.h();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        o41Var.c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            o41Var.A(r5.get(i));
        }
        o41Var.h();
    }
}
