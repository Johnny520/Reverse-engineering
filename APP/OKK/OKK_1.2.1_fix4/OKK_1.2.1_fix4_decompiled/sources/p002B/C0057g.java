package p002B;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: B.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0057g {

    /* JADX INFO: renamed from: a */
    public final boolean f197a;

    /* JADX INFO: renamed from: b */
    public final Object f198b;

    public C0057g(C0056f c0056f, boolean z2) {
        this.f198b = c0056f;
        this.f197a = z2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m195a() {
        return this.f197a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m196b(int i2, CharSequence charSequence) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        C0056f c0056f = (C0056f) this.f198b;
        if (c0056f == null) {
            return m195a();
        }
        int iM194a = c0056f.m194a(i2, charSequence);
        if (iM194a == 0) {
            return true;
        }
        if (iM194a != 1) {
            return m195a();
        }
        return false;
    }

    public C0057g(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f198b = bottomSheetBehavior;
        this.f197a = z2;
    }
}
