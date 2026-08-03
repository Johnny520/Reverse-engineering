package a;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {
    public static final android.graphics.PorterDuff.Mode b = null;
    public static a.Y0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0322pd f347a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f348a;
        public final int[] b;
        public final int[] c;
        public final int[] d;
        public final int[] e;
        public final int[] f;

        public a() {
                r8 = this;
                r8.<init>()
                int r0 = androidx.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha
                int r1 = androidx.appcompat.R.drawable.abc_textfield_default_mtrl_alpha
                int r2 = androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha
                int[] r0 = new int[]{r0, r1, r2}
                r8.f348a = r0
                int r1 = androidx.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha
                int r2 = androidx.appcompat.R.drawable.abc_seekbar_tick_mark_material
                int r3 = androidx.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha
                int r4 = androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha
                int r5 = androidx.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha
                int r6 = androidx.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha
                int r7 = androidx.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha
                int[] r0 = new int[]{r1, r2, r3, r4, r5, r6, r7}
                r8.b = r0
                int r1 = androidx.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha
                int r2 = androidx.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha
                int r3 = androidx.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha
                int r4 = androidx.appcompat.R.drawable.abc_text_cursor_material
                int r5 = androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl
                int r6 = androidx.appcompat.R.drawable.abc_text_select_handle_middle_mtrl
                int r7 = androidx.appcompat.R.drawable.abc_text_select_handle_right_mtrl
                int[] r0 = new int[]{r1, r2, r3, r4, r5, r6, r7}
                r8.c = r0
                int r0 = androidx.appcompat.R.drawable.abc_popup_background_mtrl_mult
                int r1 = androidx.appcompat.R.drawable.abc_cab_background_internal_bg
                int r2 = androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
                int[] r0 = new int[]{r0, r1, r2}
                r8.d = r0
                int r0 = androidx.appcompat.R.drawable.abc_tab_indicator_material
                int r1 = androidx.appcompat.R.drawable.abc_textfield_search_material
                int[] r0 = new int[]{r0, r1}
                r8.e = r0
                int r0 = androidx.appcompat.R.drawable.abc_btn_check_material
                int r1 = androidx.appcompat.R.drawable.abc_btn_radio_material
                int r2 = androidx.appcompat.R.drawable.abc_btn_check_material_anim
                int r3 = androidx.appcompat.R.drawable.abc_btn_radio_material_anim
                int[] r0 = new int[]{r0, r1, r2, r3}
                r8.f = r0
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
                int r0 = androidx.appcompat.R.attr.colorControlHighlight
                int r0 = a.C0109df.c(r6, r0)
                int r1 = androidx.appcompat.R.attr.colorButtonNormal
                int r6 = a.C0109df.b(r6, r1)
                int[] r1 = a.C0109df.b
                int[] r2 = a.C0109df.d
                int r3 = a.C0419v3.b(r0, r7)
                int[] r4 = a.C0109df.c
                int r0 = a.C0419v3.b(r0, r7)
                int[] r5 = a.C0109df.f
                int[][] r1 = new int[][]{r1, r2, r4, r5}
                int[] r6 = new int[]{r6, r3, r0, r7}
                android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
                r7.<init>(r1, r6)
                return r7
        }

        public static android.graphics.drawable.LayerDrawable c(a.C0322pd r6, android.content.Context r7, int r8) {
                r0 = 2
                r1 = 1
                android.content.res.Resources r2 = r7.getResources()
                int r8 = r2.getDimensionPixelSize(r8)
                int r2 = androidx.appcompat.R.drawable.abc_star_black_48dp
                android.graphics.drawable.Drawable r2 = r6.c(r7, r2)
                int r3 = androidx.appcompat.R.drawable.abc_star_half_black_48dp
                android.graphics.drawable.Drawable r6 = r6.c(r7, r3)
                boolean r7 = r2 instanceof android.graphics.drawable.BitmapDrawable
                r3 = 0
                if (r7 == 0) goto L33
                int r7 = r2.getIntrinsicWidth()
                if (r7 != r8) goto L33
                int r7 = r2.getIntrinsicHeight()
                if (r7 != r8) goto L33
                android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
                android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
                android.graphics.Bitmap r4 = r2.getBitmap()
                r7.<init>(r4)
                goto L4f
            L33:
                android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r8, r8, r7)
                android.graphics.Canvas r4 = new android.graphics.Canvas
                r4.<init>(r7)
                r2.setBounds(r3, r3, r8, r8)
                r2.draw(r4)
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                r2.<init>(r7)
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                r4.<init>(r7)
                r7 = r4
            L4f:
                android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
                r7.setTileModeX(r4)
                boolean r4 = r6 instanceof android.graphics.drawable.BitmapDrawable
                if (r4 == 0) goto L67
                int r4 = r6.getIntrinsicWidth()
                if (r4 != r8) goto L67
                int r4 = r6.getIntrinsicHeight()
                if (r4 != r8) goto L67
                android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
                goto L7d
            L67:
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r8, r8, r4)
                android.graphics.Canvas r5 = new android.graphics.Canvas
                r5.<init>(r4)
                r6.setBounds(r3, r3, r8, r8)
                r6.draw(r5)
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
                r6.<init>(r4)
            L7d:
                android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
                r4 = 3
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                r4[r3] = r2
                r4[r1] = r6
                r4[r0] = r7
                r8.<init>(r4)
                r6 = 16908288(0x1020000, float:2.387723E-38)
                r8.setId(r3, r6)
                r6 = 16908303(0x102000f, float:2.387727E-38)
                r8.setId(r1, r6)
                r6 = 16908301(0x102000d, float:2.3877265E-38)
                r8.setId(r0, r6)
                return r8
        }

        public static void e(android.graphics.drawable.Drawable r0, int r1, android.graphics.PorterDuff.Mode r2) {
                android.graphics.drawable.Drawable r0 = r0.mutate()
                if (r2 != 0) goto L8
                android.graphics.PorterDuff$Mode r2 = a.Y0.b
            L8:
                android.graphics.PorterDuffColorFilter r1 = a.Y0.c(r1, r2)
                r0.setColorFilter(r1)
                return
        }

        public final android.content.res.ColorStateList d(android.content.Context r7, int r8) {
                r6 = this;
                int r0 = androidx.appcompat.R.drawable.abc_edit_text_material
                if (r8 != r0) goto Lb
                int r8 = androidx.appcompat.R.color.abc_tint_edittext
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
            Lb:
                int r0 = androidx.appcompat.R.drawable.abc_switch_track_mtrl_alpha
                if (r8 != r0) goto L16
                int r8 = androidx.appcompat.R.color.abc_tint_switch_track
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
            L16:
                int r0 = androidx.appcompat.R.drawable.abc_switch_thumb_material
                r1 = 0
                if (r8 != r0) goto L7b
                r8 = 3
                int[][] r0 = new int[r8][]
                int[] r8 = new int[r8]
                int r2 = androidx.appcompat.R.attr.colorSwitchThumbNormal
                android.content.res.ColorStateList r2 = a.C0109df.d(r7, r2)
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L51
                boolean r5 = r2.isStateful()
                if (r5 == 0) goto L51
                int[] r5 = a.C0109df.b
                r0[r1] = r5
                int r5 = r2.getColorForState(r5, r1)
                r8[r1] = r5
                int[] r1 = a.C0109df.e
                r0[r4] = r1
                int r1 = androidx.appcompat.R.attr.colorControlActivated
                int r7 = a.C0109df.c(r7, r1)
                r8[r4] = r7
                int[] r7 = a.C0109df.f
                r0[r3] = r7
                int r7 = r2.getDefaultColor()
                r8[r3] = r7
                goto L75
            L51:
                int[] r2 = a.C0109df.b
                r0[r1] = r2
                int r2 = androidx.appcompat.R.attr.colorSwitchThumbNormal
                int r2 = a.C0109df.b(r7, r2)
                r8[r1] = r2
                int[] r1 = a.C0109df.e
                r0[r4] = r1
                int r1 = androidx.appcompat.R.attr.colorControlActivated
                int r1 = a.C0109df.c(r7, r1)
                r8[r4] = r1
                int[] r1 = a.C0109df.f
                r0[r3] = r1
                int r1 = androidx.appcompat.R.attr.colorSwitchThumbNormal
                int r7 = a.C0109df.c(r7, r1)
                r8[r3] = r7
            L75:
                android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
                r7.<init>(r0, r8)
                return r7
            L7b:
                int r0 = androidx.appcompat.R.drawable.abc_btn_default_mtrl_shape
                if (r8 != r0) goto L8a
                int r8 = androidx.appcompat.R.attr.colorButtonNormal
                int r8 = a.C0109df.c(r7, r8)
                android.content.res.ColorStateList r7 = b(r7, r8)
                return r7
            L8a:
                int r0 = androidx.appcompat.R.drawable.abc_btn_borderless_material
                if (r8 != r0) goto L93
                android.content.res.ColorStateList r7 = b(r7, r1)
                return r7
            L93:
                int r0 = androidx.appcompat.R.drawable.abc_btn_colored_material
                if (r8 != r0) goto La2
                int r8 = androidx.appcompat.R.attr.colorAccent
                int r8 = a.C0109df.c(r7, r8)
                android.content.res.ColorStateList r7 = b(r7, r8)
                return r7
            La2:
                int r0 = androidx.appcompat.R.drawable.abc_spinner_mtrl_am_alpha
                if (r8 == r0) goto Le5
                int r0 = androidx.appcompat.R.drawable.abc_spinner_textfield_background_material
                if (r8 != r0) goto Lab
                goto Le5
            Lab:
                int[] r0 = r6.b
                boolean r0 = a(r0, r8)
                if (r0 == 0) goto Lba
                int r8 = androidx.appcompat.R.attr.colorControlNormal
                android.content.res.ColorStateList r7 = a.C0109df.d(r7, r8)
                return r7
            Lba:
                int[] r0 = r6.e
                boolean r0 = a(r0, r8)
                if (r0 == 0) goto Lc9
                int r8 = androidx.appcompat.R.color.abc_tint_default
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
            Lc9:
                int[] r0 = r6.f
                boolean r0 = a(r0, r8)
                if (r0 == 0) goto Ld8
                int r8 = androidx.appcompat.R.color.abc_tint_btn_checkable
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
            Ld8:
                int r0 = androidx.appcompat.R.drawable.abc_seekbar_thumb_material
                if (r8 != r0) goto Le3
                int r8 = androidx.appcompat.R.color.abc_tint_seek_thumb
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
            Le3:
                r7 = 0
                return r7
            Le5:
                int r8 = androidx.appcompat.R.color.abc_tint_spinner
                android.content.res.ColorStateList r7 = a.Y3.a(r7, r8)
                return r7
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            a.Y0.b = r0
            return
    }

    public static synchronized a.Y0 a() {
            java.lang.Class<a.Y0> r0 = a.Y0.class
            monitor-enter(r0)
            a.Y0 r1 = a.Y0.c     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            d()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            a.Y0 r1 = a.Y0.c     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter c(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<a.Y0> r0 = a.Y0.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = a.C0322pd.e(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static synchronized void d() {
            java.lang.Class<a.Y0> r0 = a.Y0.class
            monitor-enter(r0)
            a.Y0 r1 = a.Y0.c     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            a.Y0 r1 = new a.Y0     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            a.Y0.c = r1     // Catch: java.lang.Throwable -> L26
            a.pd r2 = a.C0322pd.b()     // Catch: java.lang.Throwable -> L26
            r1.f347a = r2     // Catch: java.lang.Throwable -> L26
            a.Y0 r1 = a.Y0.c     // Catch: java.lang.Throwable -> L26
            a.pd r1 = r1.f347a     // Catch: java.lang.Throwable -> L26
            a.Y0$a r2 = new a.Y0$a     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L26
            r1.e = r2     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L28
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L26
        L24:
            r2 = move-exception
            goto L22
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static void e(android.graphics.drawable.Drawable r4, a.C0270mf r5, int[] r6) {
            android.graphics.PorterDuff$Mode r0 = a.C0322pd.f
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L4d
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1f
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1f:
            boolean r0 = r5.d
            if (r0 != 0) goto L2c
            boolean r1 = r5.c
            if (r1 == 0) goto L28
            goto L2c
        L28:
            r4.clearColorFilter()
            return
        L2c:
            r1 = 0
            if (r0 == 0) goto L32
            android.content.res.ColorStateList r0 = r5.f580a
            goto L33
        L32:
            r0 = r1
        L33:
            boolean r3 = r5.c
            if (r3 == 0) goto L3a
            android.graphics.PorterDuff$Mode r5 = r5.b
            goto L3c
        L3a:
            android.graphics.PorterDuff$Mode r5 = a.C0322pd.f
        L3c:
            if (r0 == 0) goto L49
            if (r5 != 0) goto L41
            goto L49
        L41:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = a.C0322pd.e(r6, r5)
        L49:
            r4.setColorFilter(r1)
            return
        L4d:
            java.lang.String r4 = "ResourceManagerInternal"
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            return
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            a.pd r0 = r1.f347a     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.c(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
