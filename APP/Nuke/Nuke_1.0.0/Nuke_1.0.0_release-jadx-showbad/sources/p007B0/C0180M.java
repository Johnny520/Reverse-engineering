package p007B0;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0180M extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final Object f624a;

    /* JADX INFO: renamed from: b */
    public final Object f625b;

    /* JADX INFO: renamed from: c */
    public final Object[] f626c;

    /* JADX INFO: renamed from: d */
    public final PointerInputEventHandler f627d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0180M(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i5) {
        obj = (i5 & 1) != 0 ? null : obj;
        obj2 = (i5 & 2) != 0 ? null : obj2;
        objArr = (i5 & 4) != 0 ? null : objArr;
        this.f624a = obj;
        this.f625b = obj2;
        this.f626c = objArr;
        this.f627d = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0186T(this.f624a, this.f625b, this.f626c, this.f627d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180M)) {
            return false;
        }
        C0180M c0180m = (C0180M) obj;
        Object[] objArr = c0180m.f626c;
        if (!AbstractC1665j.m2981a(this.f624a, c0180m.f624a) || !AbstractC1665j.m2981a(this.f625b, c0180m.f625b)) {
            return false;
        }
        Object[] objArr2 = this.f626c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f627d == c0180m.f627d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0186T c0186t = (C0186T) abstractC2206o;
        Object obj = c0186t.f648r;
        Object obj2 = this.f624a;
        boolean z5 = !AbstractC1665j.m2981a(obj, obj2);
        c0186t.f648r = obj2;
        Object obj3 = c0186t.f649s;
        Object obj4 = this.f625b;
        if (!AbstractC1665j.m2981a(obj3, obj4)) {
            z5 = true;
        }
        c0186t.f649s = obj4;
        Object[] objArr = c0186t.f650t;
        Object[] objArr2 = this.f626c;
        if (objArr != null && objArr2 == null) {
            z5 = true;
        }
        if (objArr == null && objArr2 != null) {
            z5 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z5 = true;
        }
        c0186t.f650t = objArr2;
        Class<?> cls = c0186t.f651u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f627d;
        if (cls == pointerInputEventHandler.getClass() ? z5 : true) {
            c0186t.m288L0();
        }
        c0186t.f651u = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f624a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f625b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f626c;
        return this.f627d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
