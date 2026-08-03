package p001A0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p089x0.C1122f;
import p089x0.C1127k;

/* JADX INFO: renamed from: A0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0032h extends C1122f {

    /* JADX INFO: renamed from: v */
    public final RectF f84v;

    public C0032h(C1127k r1, RectF r2) {
        super(r1);
        this.f84v = r2;
    }

    @Override // p089x0.C1122f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0033i r02 = new C0033i(this);
        r02.invalidateSelf();
        return r02;
    }

    public C0032h(C0032h r1) {
        super(r1);
        this.f84v = r1.f84v;
    }
}
