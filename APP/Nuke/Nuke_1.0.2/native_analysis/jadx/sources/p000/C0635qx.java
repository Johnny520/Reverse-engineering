package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: qx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635qx {

    /* JADX INFO: renamed from: a */
    public final go0 f9261a;

    /* JADX INFO: renamed from: b */
    public C0138dq f9262b;

    /* JADX INFO: renamed from: c */
    public boolean f9263c;

    /* JADX INFO: renamed from: f */
    public int f9266f;

    /* JADX INFO: renamed from: g */
    public int f9267g;

    /* JADX INFO: renamed from: l */
    public int f9272l;

    /* JADX INFO: renamed from: d */
    public final i11 f9264d = new i11();

    /* JADX INFO: renamed from: e */
    public boolean f9265e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f9268h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f9269i = -1;

    /* JADX INFO: renamed from: j */
    public int f9270j = -1;

    /* JADX INFO: renamed from: k */
    public int f9271k = -1;

    public C0635qx(go0 go0Var, C0138dq c0138dq) {
        this.f9261a = go0Var;
        this.f9262b = c0138dq;
    }

    /* JADX INFO: renamed from: a */
    public final void m4291a() {
        m4293c();
        ArrayList arrayList = this.f9268h;
        if (arrayList.isEmpty()) {
            this.f9267g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4292b() {
        int i = this.f9267g;
        if (i > 0) {
            kv1 kv1Var = this.f9262b.f2145t;
            kv1Var.m2743X(gv1.f3710c);
            kv1Var.f5827o[kv1Var.f5828p - kv1Var.f5825m[kv1Var.f5826n - 1].f4804a] = i;
            this.f9267g = 0;
        }
        ArrayList arrayList = this.f9268h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0138dq c0138dq = this.f9262b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c0138dq.getClass();
        if (size != 0) {
            kv1 kv1Var2 = c0138dq.f2145t;
            kv1Var2.m2743X(ju1.f5226c);
            rg3.m4459M(kv1Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m4293c() {
        int i = this.f9272l;
        if (i > 0) {
            int i2 = this.f9269i;
            if (i2 >= 0) {
                m4292b();
                kv1 kv1Var = this.f9262b.f2145t;
                kv1Var.m2743X(yu1.f13620c);
                int i3 = kv1Var.f5828p - kv1Var.f5825m[kv1Var.f5826n - 1].f4804a;
                int[] iArr = kv1Var.f5827o;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f9269i = -1;
            } else {
                int i4 = this.f9271k;
                int i5 = this.f9270j;
                m4292b();
                kv1 kv1Var2 = this.f9262b.f2145t;
                kv1Var2.m2743X(uu1.f11506c);
                int i6 = kv1Var2.f5828p - kv1Var2.f5825m[kv1Var2.f5826n - 1].f4804a;
                int[] iArr2 = kv1Var2.f5827o;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f9270j = -1;
                this.f9271k = -1;
            }
            this.f9272l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4294d(boolean z) {
        pr2 pr2Var = this.f9261a.f3601G;
        int i = z ? pr2Var.f8523i : pr2Var.f8521g;
        int i2 = i - this.f9266f;
        if (i2 < 0) {
            AbstractC0752tx.m5443a("Tried to seek backward");
        }
        if (i2 > 0) {
            kv1 kv1Var = this.f9262b.f2145t;
            kv1Var.m2743X(cu1.f1737c);
            kv1Var.f5827o[kv1Var.f5828p - kv1Var.f5825m[kv1Var.f5826n - 1].f4804a] = i2;
            this.f9266f = i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4295e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC0752tx.m5443a("Invalid remove index " + i);
            }
            if (this.f9269i == i) {
                this.f9272l += i2;
                return;
            }
            m4293c();
            this.f9269i = i;
            this.f9272l = i2;
        }
    }
}
