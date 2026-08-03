package p002B;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: B.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0057g {

    /* JADX INFO: renamed from: a */
    public final boolean f197a;

    /* JADX INFO: renamed from: b */
    public final Object f198b;

    public C0057g(C0056f r1, boolean r2) {
        this.f198b = r1;
        this.f197a = r2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m195a() {
        return this.f197a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m196b(int r2, CharSequence r3) {
        if (r3 == null) goto L17;
        if (r2 < 0) goto L17;
        if ((r3.length() - r2) < 0) goto L17;
        C0056f r02 = (C0056f) this.f198b;
        if (r02 == null) goto L9;
        int r22 = r02.m194a(r2, r3);
        if (r22 == 0) goto L18;
        if (r22 != 1) goto L19;
        return false;
    L19:
        return m195a();
    L18:
        return true;
    L9:
        return m195a();
    L17:
        throw new IllegalArgumentException();
    }

    public C0057g(BottomSheetBehavior r1, boolean r2) {
        this.f198b = r1;
        this.f197a = r2;
    }
}
