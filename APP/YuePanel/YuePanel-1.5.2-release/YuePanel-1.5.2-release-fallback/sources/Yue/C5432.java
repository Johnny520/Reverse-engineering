package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C5432 extends Yue.AbstractC5433 {
    public C5432(android.content.res.Resources r1, android.graphics.Bitmap r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@Yue.InterfaceC4410 android.graphics.Outline r3) {
            r2 = this;
            r2.m20505()
            android.graphics.Rect r0 = r2.f20153
            float r1 = r2.m20492()
            r3.setRoundRect(r0, r1)
            return
    }

    @Override // Yue.AbstractC5433
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo20486(int r7, int r8, int r9, android.graphics.Rect r10, android.graphics.Rect r11) {
            r6 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.view.Gravity.apply(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC5433
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo20487() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f20146
            if (r0 == 0) goto Lc
            boolean r0 = r0.hasMipMap()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // Yue.AbstractC5433
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo20488(boolean r2) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f20146
            if (r0 == 0) goto La
            r0.setHasMipMap(r2)
            r1.invalidateSelf()
        La:
            return
    }
}
