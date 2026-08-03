package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0201L0 {

    /* JADX INFO: renamed from: a */
    public final C0183K0 f675a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f676b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f677c = null;

    /* JADX INFO: renamed from: d */
    public boolean f678d = false;

    /* JADX INFO: renamed from: e */
    public boolean f679e = false;

    /* JADX INFO: renamed from: f */
    public boolean f680f;

    public C0201L0(C0183K0 c0183k0) {
        this.f675a = c0183k0;
    }

    /* JADX INFO: renamed from: a */
    public final void m571a() {
        C0183K0 c0183k0 = this.f675a;
        Drawable checkMarkDrawable = c0183k0.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f678d || this.f679e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f678d) {
                    C0893w5.a.m2176h(drawableMutate, this.f676b);
                }
                if (this.f679e) {
                    C0893w5.a.m2177i(drawableMutate, this.f677c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0183k0.getDrawableState());
                }
                c0183k0.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
