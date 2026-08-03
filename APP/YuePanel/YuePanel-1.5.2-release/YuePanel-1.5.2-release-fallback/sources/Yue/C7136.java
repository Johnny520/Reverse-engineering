package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7136 extends android.graphics.drawable.Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f24671;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable.ConstantState f24672;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.res.ColorStateList f24673;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f24674;

    public C7136(@Yue.InterfaceC4544 Yue.C7136 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f24673 = r0
            android.graphics.PorterDuff$Mode r0 = Yue.C7134.f24662
            r1.f24674 = r0
            if (r2 == 0) goto L1c
            int r0 = r2.f24671
            r1.f24671 = r0
            android.graphics.drawable.Drawable$ConstantState r0 = r2.f24672
            r1.f24672 = r0
            android.content.res.ColorStateList r0 = r2.f24673
            r1.f24673 = r0
            android.graphics.PorterDuff$Mode r2 = r2.f24674
            r1.f24674 = r2
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = r2.f24671
            android.graphics.drawable.Drawable$ConstantState r1 = r2.f24672
            if (r1 == 0) goto Lb
            int r1 = r1.getChangingConfigurations()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable newDrawable(@Yue.InterfaceC4544 android.content.res.Resources r2) {
            r1 = this;
            Yue.ۥۢۦ۠ۡ r0 = new Yue.ۥۢۦ۠ۡ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m27468() {
            r1 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r1.f24672
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
