package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uw2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final Object f11537a;

    /* JADX INFO: renamed from: b */
    public final Object f11538b;

    /* JADX INFO: renamed from: c */
    public final PointerInputEventHandler f11539c;

    public uw2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.f11537a = obj;
        this.f11538b = obj2;
        this.f11539c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw2)) {
            return false;
        }
        uw2 uw2Var = (uw2) obj;
        return t11.m5086l(this.f11537a, uw2Var.f11537a) && t11.m5086l(this.f11538b, uw2Var.f11538b) && this.f11539c == uw2Var.f11539c;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new zw2(this.f11537a, this.f11538b, this.f11539c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        zw2 zw2Var = (zw2) th1Var;
        Object obj = zw2Var.f14131v;
        Object obj2 = this.f11537a;
        boolean z = !t11.m5086l(obj, obj2);
        zw2Var.f14131v = obj2;
        Object obj3 = zw2Var.f14132w;
        Object obj4 = this.f11538b;
        if (!t11.m5086l(obj3, obj4)) {
            z = true;
        }
        zw2Var.f14132w = obj4;
        Class<?> cls = zw2Var.f14133x.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f11539c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            zw2Var.m6515O0();
        }
        zw2Var.f14133x = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.f11537a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f11538b;
        return this.f11539c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
