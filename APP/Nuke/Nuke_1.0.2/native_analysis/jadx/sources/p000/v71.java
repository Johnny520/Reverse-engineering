package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 extends th1 implements mc0 {

    /* JADX INFO: renamed from: v */
    public x71 f11804v;

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        this.f11804v.getClass();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        x71 x71Var = this.f11804v;
        x71Var.m6043c();
        x71Var.f12856b = null;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        ArrayList arrayList = this.f11804v.f12862h;
        if (arrayList.size() <= 0) {
            t61Var.m5125a();
        } else {
            vi0.m5701t(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v71) && t11.m5086l(this.f11804v, ((v71) obj).f11804v);
    }

    public final int hashCode() {
        return this.f11804v.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f11804v + ')';
    }
}
