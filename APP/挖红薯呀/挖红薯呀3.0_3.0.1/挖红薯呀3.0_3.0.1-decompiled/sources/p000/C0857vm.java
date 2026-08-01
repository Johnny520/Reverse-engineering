package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: vm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0857vm implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public int f6744d = -1;

    /* JADX INFO: renamed from: e */
    public int f6745e;

    /* JADX INFO: renamed from: f */
    public int f6746f;

    /* JADX INFO: renamed from: g */
    public z20 f6747g;

    /* JADX INFO: renamed from: h */
    public int f6748h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0894wm f6749i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0857vm(C0894wm c0894wm) {
        this.f6749i = c0894wm;
        int iM4907n = w60.m4907n(0, 0, c0894wm.f7147a.length());
        this.f6745e = iM4907n;
        this.f6746f = iM4907n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4760a() {
        C0894wm c0894wm = this.f6749i;
        CharSequence charSequence = c0894wm.f7147a;
        int i = this.f6746f;
        if (i < 0) {
            this.f6744d = 0;
            this.f6747g = null;
            return;
        }
        int i2 = c0894wm.f7148b;
        if (i2 > 0) {
            int i3 = this.f6748h + 1;
            this.f6748h = i3;
            if (i3 < i2) {
                if (i > charSequence.length()) {
                    int i4 = this.f6745e;
                    charSequence.getClass();
                    this.f6747g = new z20(i4, charSequence.length() - 1, 1);
                    this.f6746f = -1;
                } else {
                    uo0 uo0Var = (uo0) c0894wm.f7149c.invoke(charSequence, Integer.valueOf(this.f6746f));
                    if (uo0Var == null) {
                        int i5 = this.f6745e;
                        charSequence.getClass();
                        this.f6747g = new z20(i5, charSequence.length() - 1, 1);
                        this.f6746f = -1;
                    } else {
                        int iIntValue = ((Number) uo0Var.f6274d).intValue();
                        int iIntValue2 = ((Number) uo0Var.f6275e).intValue();
                        this.f6747g = w60.m4893O(this.f6745e, iIntValue);
                        int i6 = iIntValue + iIntValue2;
                        this.f6745e = i6;
                        this.f6746f = i6 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        this.f6744d = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6744d == -1) {
            m4760a();
        }
        return this.f6744d == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6744d == -1) {
            m4760a();
        }
        if (this.f6744d == 0) {
            C0921xc.m5132m();
            return null;
        }
        z20 z20Var = this.f6747g;
        z20Var.getClass();
        this.f6747g = null;
        this.f6744d = -1;
        return z20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
