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
    public ColorStateList f3278b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f3279c = null;

    /* JADX INFO: renamed from: d */
    public boolean f3280d = false;

    /* JADX INFO: renamed from: e */
    public boolean f3281e = false;

    /* JADX INFO: renamed from: f */
    public boolean f3282f;

    public C0922q(CompoundButton compoundButton) {
        this.f3277a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public final void m2250a() {
        CompoundButton compoundButton = this.f3277a;
        Drawable drawableM597a = AbstractC0214c.m597a(compoundButton);
        if (drawableM597a != null) {
            if (this.f3280d || this.f3281e) {
                Drawable drawableMutate = drawableM597a.mutate();
                if (this.f3280d) {
                    AbstractC1111a.m2626h(drawableMutate, this.f3278b);
                }
                if (this.f3281e) {
                    AbstractC1111a.m2627i(drawableMutate, this.f3279c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
