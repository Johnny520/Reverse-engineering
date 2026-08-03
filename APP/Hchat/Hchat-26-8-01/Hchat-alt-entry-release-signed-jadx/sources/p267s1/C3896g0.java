package p267s1;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import gg.AbstractC1416l;
import java.util.Arrays;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s1.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3896g0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final Object f12768a;

    /* JADX INFO: renamed from: b */
    public final Object f12769b;

    /* JADX INFO: renamed from: c */
    public final Object[] f12770c;

    /* JADX INFO: renamed from: d */
    public final PointerInputEventHandler f12771d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3896g0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i9) {
        obj = (i9 & 1) != 0 ? null : obj;
        obj2 = (i9 & 2) != 0 ? null : obj2;
        objArr = (i9 & 4) != 0 ? null : objArr;
        this.f12768a = obj;
        this.f12769b = obj2;
        this.f12770c = objArr;
        this.f12771d = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3896g0)) {
            return false;
        }
        C3896g0 c3896g0 = (C3896g0) obj;
        if (!AbstractC1416l.m3825a(this.f12768a, c3896g0.f12768a) || !AbstractC1416l.m3825a(this.f12769b, c3896g0.f12769b)) {
            return false;
        }
        Object[] objArr = c3896g0.f12770c;
        Object[] objArr2 = this.f12770c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f12771d == c3896g0.f12771d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3906l0(this.f12768a, this.f12769b, this.f12770c, this.f12771d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3906l0 c3906l0 = (C3906l0) abstractC5852n;
        Object obj = c3906l0.f12821u;
        Object obj2 = this.f12768a;
        boolean z9 = !AbstractC1416l.m3825a(obj, obj2);
        c3906l0.f12821u = obj2;
        Object obj3 = c3906l0.f12822v;
        Object obj4 = this.f12769b;
        if (!AbstractC1416l.m3825a(obj3, obj4)) {
            z9 = true;
        }
        c3906l0.f12822v = obj4;
        Object[] objArr = c3906l0.f12823w;
        Object[] objArr2 = this.f12770c;
        if (objArr != null && objArr2 == null) {
            z9 = true;
        }
        if (objArr == null && objArr2 != null) {
            z9 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z9 = true;
        }
        c3906l0.f12823w = objArr2;
        Class<?> cls = c3906l0.f12824x.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f12771d;
        if (cls == pointerInputEventHandler.getClass() ? z9 : true) {
            c3906l0.m8107m1();
        }
        c3906l0.f12824x = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f12768a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f12769b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f12770c;
        return this.f12771d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
