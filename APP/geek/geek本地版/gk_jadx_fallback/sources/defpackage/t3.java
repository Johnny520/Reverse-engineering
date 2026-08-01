package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public t3() {
            r4 = this;
            r4.<init>()
            r0 = 2131230835(0x7f080073, float:1.8077734E38)
            r1 = 2131230761(0x7f080029, float:1.8077584E38)
            r2 = 2131230837(0x7f080075, float:1.8077738E38)
            int[] r0 = new int[]{r2, r0, r1}
            r4.a = r0
            r0 = 7
            int[] r1 = new int[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [2131230785, 2131230820, 2131230792, 2131230787, 2131230788, 2131230791, 2131230790} // fill-array
            r4.b = r1
            int[] r0 = new int[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [2131230834, 2131230836, 2131230778, 2131230830, 2131230831, 2131230832, 2131230833} // fill-array
            r4.c = r0
            r0 = 2131230776(0x7f080038, float:1.8077614E38)
            r1 = 2131230809(0x7f080059, float:1.8077681E38)
            r2 = 2131230810(0x7f08005a, float:1.8077683E38)
            int[] r0 = new int[]{r2, r0, r1}
            r4.d = r0
            r0 = 2131230828(0x7f08006c, float:1.807772E38)
            r1 = 2131230838(0x7f080076, float:1.807774E38)
            int[] r0 = new int[]{r0, r1}
            r4.e = r0
            r0 = 2131230765(0x7f08002d, float:1.8077592E38)
            r1 = 2131230771(0x7f080033, float:1.8077604E38)
            r2 = 2131230764(0x7f08002c, float:1.807759E38)
            r3 = 2131230770(0x7f080032, float:1.8077602E38)
            int[] r0 = new int[]{r2, r3, r0, r1}
            r4.f = r0
            return
    }

    public static boolean a(int[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static android.content.res.ColorStateList b(android.content.Context r6, int r7) {
            r0 = 2130968801(0x7f0400e1, float:1.7546266E38)
            int r0 = defpackage.r60.c(r6, r0)
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            int r6 = defpackage.r60.b(r6, r1)
            int[] r1 = defpackage.r60.b
            int[] r2 = defpackage.r60.d
            int r3 = defpackage.ib.b(r0, r7)
            int[] r4 = defpackage.r60.c
            int r0 = defpackage.ib.b(r0, r7)
            int[] r5 = defpackage.r60.f
            int[][] r1 = new int[][]{r1, r2, r4, r5}
            int[] r6 = new int[]{r6, r3, r0, r7}
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r1, r6)
            return r7
    }

    public static android.graphics.drawable.LayerDrawable c(defpackage.w00 r4, android.content.Context r5, int r6) {
            android.content.res.Resources r0 = r5.getResources()
            int r6 = r0.getDimensionPixelSize(r6)
            r0 = 2131230824(0x7f080068, float:1.8077712E38)
            android.graphics.drawable.Drawable r0 = r4.c(r5, r0)
            r1 = 2131230825(0x7f080069, float:1.8077714E38)
            android.graphics.drawable.Drawable r4 = r4.c(r5, r1)
            boolean r5 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r5 == 0) goto L33
            int r5 = r0.getIntrinsicWidth()
            if (r5 != r6) goto L33
            int r5 = r0.getIntrinsicHeight()
            if (r5 != r6) goto L33
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            android.graphics.Bitmap r2 = r0.getBitmap()
            r5.<init>(r2)
            goto L4f
        L33:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r6, r6, r5)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r5)
            r0.setBounds(r1, r1, r6, r6)
            r0.draw(r2)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r5)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r5)
            r5 = r2
        L4f:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            r5.setTileModeX(r2)
            boolean r2 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L67
            int r2 = r4.getIntrinsicWidth()
            if (r2 != r6) goto L67
            int r2 = r4.getIntrinsicHeight()
            if (r2 != r6) goto L67
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            goto L7d
        L67:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r6, r6, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            r4.setBounds(r1, r1, r6, r6)
            r4.draw(r3)
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r2)
        L7d:
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            r4 = 2
            r2[r4] = r5
            r6.<init>(r2)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6.setId(r1, r5)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6.setId(r0, r5)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6.setId(r4, r5)
            return r6
    }

    public static void e(android.graphics.drawable.Drawable r1, int r2, android.graphics.PorterDuff.Mode r3) {
            int[] r0 = defpackage.eh.a
            android.graphics.drawable.Drawable r1 = r1.mutate()
            if (r3 != 0) goto La
            android.graphics.PorterDuff$Mode r3 = defpackage.u3.b
        La:
            android.graphics.PorterDuffColorFilter r2 = defpackage.u3.c(r2, r3)
            r1.setColorFilter(r2)
            return
    }

    public final android.content.res.ColorStateList d(android.content.Context r9, int r10) {
            r8 = this;
            r0 = 2131230781(0x7f08003d, float:1.8077624E38)
            if (r10 != r0) goto Ld
            r10 = 2131099669(0x7f060015, float:1.7811698E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
        Ld:
            r0 = 2131230827(0x7f08006b, float:1.8077718E38)
            if (r10 != r0) goto L1a
            r10 = 2131099672(0x7f060018, float:1.7811704E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
        L1a:
            r0 = 2131230826(0x7f08006a, float:1.8077716E38)
            r1 = 0
            if (r10 != r0) goto L7c
            r10 = 3
            int[][] r0 = new int[r10][]
            int[] r10 = new int[r10]
            r2 = 2130968851(0x7f040113, float:1.7546367E38)
            android.content.res.ColorStateList r3 = defpackage.r60.d(r9, r2)
            r4 = 2
            r5 = 2130968800(0x7f0400e0, float:1.7546264E38)
            r6 = 1
            if (r3 == 0) goto L58
            boolean r7 = r3.isStateful()
            if (r7 == 0) goto L58
            int[] r2 = defpackage.r60.b
            r0[r1] = r2
            int r2 = r3.getColorForState(r2, r1)
            r10[r1] = r2
            int[] r1 = defpackage.r60.e
            r0[r6] = r1
            int r9 = defpackage.r60.c(r9, r5)
            r10[r6] = r9
            int[] r9 = defpackage.r60.f
            r0[r4] = r9
            int r9 = r3.getDefaultColor()
            r10[r4] = r9
            goto L76
        L58:
            int[] r3 = defpackage.r60.b
            r0[r1] = r3
            int r3 = defpackage.r60.b(r9, r2)
            r10[r1] = r3
            int[] r1 = defpackage.r60.e
            r0[r6] = r1
            int r1 = defpackage.r60.c(r9, r5)
            r10[r6] = r1
            int[] r1 = defpackage.r60.f
            r0[r4] = r1
            int r9 = defpackage.r60.c(r9, r2)
            r10[r4] = r9
        L76:
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            r9.<init>(r0, r10)
            return r9
        L7c:
            r0 = 2131230769(0x7f080031, float:1.80776E38)
            if (r10 != r0) goto L8d
            r10 = 2130968798(0x7f0400de, float:1.754626E38)
            int r10 = defpackage.r60.c(r9, r10)
            android.content.res.ColorStateList r9 = b(r9, r10)
            return r9
        L8d:
            r0 = 2131230763(0x7f08002b, float:1.8077588E38)
            if (r10 != r0) goto L97
            android.content.res.ColorStateList r9 = b(r9, r1)
            return r9
        L97:
            r0 = 2131230768(0x7f080030, float:1.8077598E38)
            if (r10 != r0) goto La8
            r10 = 2130968796(0x7f0400dc, float:1.7546256E38)
            int r10 = defpackage.r60.c(r9, r10)
            android.content.res.ColorStateList r9 = b(r9, r10)
            return r9
        La8:
            r0 = 2131230822(0x7f080066, float:1.8077708E38)
            if (r10 == r0) goto Lf2
            r0 = 2131230823(0x7f080067, float:1.807771E38)
            if (r10 != r0) goto Lb3
            goto Lf2
        Lb3:
            int[] r0 = r8.b
            boolean r0 = a(r0, r10)
            if (r0 == 0) goto Lc3
            r10 = 2130968802(0x7f0400e2, float:1.7546268E38)
            android.content.res.ColorStateList r9 = defpackage.r60.d(r9, r10)
            return r9
        Lc3:
            int[] r0 = r8.e
            boolean r0 = a(r0, r10)
            if (r0 == 0) goto Ld3
            r10 = 2131099668(0x7f060014, float:1.7811696E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
        Ld3:
            int[] r0 = r8.f
            boolean r0 = a(r0, r10)
            if (r0 == 0) goto Le3
            r10 = 2131099667(0x7f060013, float:1.7811694E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
        Le3:
            r0 = 2131230819(0x7f080063, float:1.8077702E38)
            if (r10 != r0) goto Lf0
            r10 = 2131099670(0x7f060016, float:1.78117E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
        Lf0:
            r9 = 0
            return r9
        Lf2:
            r10 = 2131099671(0x7f060017, float:1.7811702E38)
            android.content.res.ColorStateList r9 = defpackage.ip.v(r9, r10)
            return r9
    }
}
