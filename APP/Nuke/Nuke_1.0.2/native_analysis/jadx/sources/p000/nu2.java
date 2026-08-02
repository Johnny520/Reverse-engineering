package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements Map.Entry, r41 {

    /* JADX INFO: renamed from: h */
    public final Object f7329h;

    /* JADX INFO: renamed from: i */
    public Object f7330i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ou2 f7331j;

    public nu2(ou2 ou2Var) {
        this.f7331j = ou2Var;
        Map.Entry entry = ou2Var.f7852k;
        entry.getClass();
        this.f7329h = entry.getKey();
        Map.Entry entry2 = ou2Var.f7852k;
        entry2.getClass();
        this.f7330i = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7329h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7330i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ou2 ou2Var = this.f7331j;
        rs2 rs2Var = ou2Var.f7849h;
        if (rs2Var.m4616e().f9157d != ou2Var.f7851j) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f7330i;
        rs2Var.put(this.f7329h, obj);
        this.f7330i = obj;
        return obj2;
    }
}
