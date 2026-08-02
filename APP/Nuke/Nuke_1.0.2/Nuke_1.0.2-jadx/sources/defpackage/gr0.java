package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends q43 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q43 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gr0(q43 q43Var, int i) {
        this.a = i;
        this.b = q43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        int i = this.a;
        q43 q43Var = this.b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) q43Var.b(l41Var)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                l41Var.b();
                while (l41Var.p()) {
                    arrayList.add(Long.valueOf(((Number) q43Var.b(l41Var)).longValue()));
                }
                l41Var.h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        int i = this.a;
        q43 q43Var = this.b;
        switch (i) {
            case 0:
                q43Var.c(o41Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                o41Var.c();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    q43Var.c(o41Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                o41Var.h();
                break;
        }
    }
}
