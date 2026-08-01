package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n51 extends te0 {

    /* JADX INFO: renamed from: a */
    public final Object f4182a;

    /* JADX INFO: renamed from: b */
    public final Object f4183b;

    /* JADX INFO: renamed from: c */
    public final PointerInputEventHandler f4184c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n51(Object obj, r60 r60Var, PointerInputEventHandler pointerInputEventHandler, int i) {
        r60Var = (i & 2) != 0 ? null : r60Var;
        this.f4182a = obj;
        this.f4183b = r60Var;
        this.f4184c = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new s51(this.f4182a, this.f4183b, this.f4184c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n51)) {
            return false;
        }
        n51 n51Var = (n51) obj;
        return this.f4182a.equals(n51Var.f4182a) && p30.m3002l(this.f4183b, n51Var.f4183b) && this.f4184c == n51Var.f4184c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        s51 s51Var = (s51) oe0Var;
        Object obj = s51Var.f5646r;
        Object obj2 = this.f4182a;
        boolean z = !p30.m3002l(obj, obj2);
        s51Var.f5646r = obj2;
        Object obj3 = s51Var.f5647s;
        Object obj4 = this.f4183b;
        if (!p30.m3002l(obj3, obj4)) {
            z = true;
        }
        s51Var.f5647s = obj4;
        Class<?> cls = s51Var.f5648t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f4184c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            s51Var.m4007x0();
        }
        s51Var.f5648t = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f4182a.hashCode() * 31;
        Object obj = this.f4183b;
        return this.f4184c.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
