package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends q43 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q43 f3676b;

    public /* synthetic */ gr0(q43 q43Var, int i) {
        this.f3675a = i;
        this.f3676b = q43Var;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        int i = this.f3675a;
        q43 q43Var = this.f3676b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) q43Var.mo97b(l41Var)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                l41Var.m2824b();
                while (l41Var.m2832p()) {
                    arrayList.add(Long.valueOf(((Number) q43Var.mo97b(l41Var)).longValue()));
                }
                l41Var.m2828h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        int i = this.f3675a;
        q43 q43Var = this.f3676b;
        switch (i) {
            case 0:
                q43Var.mo98c(o41Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                o41Var.m3491c();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    q43Var.mo98c(o41Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                o41Var.m3494h();
                break;
        }
    }
}
