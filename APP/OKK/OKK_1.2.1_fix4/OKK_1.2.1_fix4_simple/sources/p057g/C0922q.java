package p057g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import p017J.AbstractC0214c;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0922q {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f3277a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3278b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f3279c;

    /* JADX INFO: renamed from: d */
    public boolean f3280d;

    /* JADX INFO: renamed from: e */
    public boolean f3281e;

    /* JADX INFO: renamed from: f */
    public boolean f3282f;

    public C0922q(CompoundButton r2) {
        this.f3278b = null;
        this.f3279c = null;
        this.f3280d = false;
        this.f3281e = false;
        this.f3277a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2250a() {
        CompoundButton r02 = this.f3277a;
        Drawable r1 = AbstractC0214c.m597a(r02);
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.f3280d == false) goto L7;
    L8:
        Drawable r12 = r1.mutate();
        if (this.f3280d == false) goto L12;
        AbstractC1111a.m2626h(r12, this.f3278b);
    L12:
        if (this.f3281e == false) goto L15;
        AbstractC1111a.m2627i(r12, this.f3279c);
    L15:
        if (r12.isStateful() == false) goto L17;
        r12.setState(r02.getDrawableState());
    L17:
        r02.setButtonDrawable(r12);
        return;
    L7:
        if (this.f3281e == true) goto L8;
    }
}
