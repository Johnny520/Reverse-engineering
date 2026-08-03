package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0177 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.appcompat.widget.ActionBarContainer f406;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C0178 {
        public C0178() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m982(android.graphics.drawable.Drawable r0, android.graphics.Outline r1) {
                r0.getOutline(r1)
                return
        }
    }

    public C0177(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f406 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f406
            boolean r1 = r0.f25528
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r0.f25527
            if (r0 == 0) goto L22
            r0.draw(r3)
            goto L22
        Le:
            android.graphics.drawable.Drawable r0 = r0.f25525
            if (r0 == 0) goto L15
            r0.draw(r3)
        L15:
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f406
            android.graphics.drawable.Drawable r1 = r0.f25526
            if (r1 == 0) goto L22
            boolean r0 = r0.f25529
            if (r0 == 0) goto L22
            r1.draw(r3)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(21)
    public void getOutline(@Yue.InterfaceC4410 android.graphics.Outline r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f406
            boolean r1 = r0.f25528
            if (r1 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r0.f25527
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r0.f25525
            Yue.C0177.C0178.m982(r0, r3)
            goto L17
        L10:
            android.graphics.drawable.Drawable r0 = r0.f25525
            if (r0 == 0) goto L17
            Yue.C0177.C0178.m982(r0, r3)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
