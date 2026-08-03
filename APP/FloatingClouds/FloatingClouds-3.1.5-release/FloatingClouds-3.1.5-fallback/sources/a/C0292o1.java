package a;

/* JADX INFO: renamed from: a.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292o1 extends android.widget.Spinner {

    @android.annotation.SuppressLint({"ResourceType"})
    public static final int[] i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.G0 f607a;
    public final android.content.Context b;
    public final a.C0274n1 c;
    public android.widget.SpinnerAdapter d;
    public final boolean e;
    public final a.C0292o1.g f;
    public int g;
    public final android.graphics.Rect h;

    /* JADX INFO: renamed from: a.o1$a */
    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0292o1 f608a;

        public a(a.C0292o1 r1) {
                r0 = this;
                r0.<init>()
                r0.f608a = r1
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
                r4 = this;
                a.o1 r0 = r4.f608a
                a.o1$g r1 = r0.getInternalPopup()
                boolean r1 = r1.b()
                if (r1 != 0) goto L19
                int r1 = r0.getTextDirection()
                int r2 = r0.getTextAlignment()
                a.o1$g r3 = r0.f
                r3.e(r1, r2)
            L19:
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                if (r0 == 0) goto L22
                r0.removeOnGlobalLayoutListener(r4)
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$b */
    public static final class b {
        public static void a(android.widget.ThemedSpinnerAdapter r1, android.content.res.Resources.Theme r2) {
                android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 != 0) goto Ld
                r1.setDropDownViewTheme(r2)
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$c */
    public class c implements a.C0292o1.g, android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.b f609a;
        public a.C0292o1.d b;
        public java.lang.CharSequence c;
        public final /* synthetic */ a.C0292o1 d;

        public c(a.C0292o1 r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                return
        }

        @Override // a.C0292o1.g
        public final boolean b() {
                r1 = this;
                androidx.appcompat.app.b r0 = r1.f609a
                if (r0 == 0) goto L9
                boolean r0 = r0.isShowing()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // a.C0292o1.g
        public final void c(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // a.C0292o1.g
        public final int d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // a.C0292o1.g
        public final void dismiss() {
                r1 = this;
                androidx.appcompat.app.b r0 = r1.f609a
                if (r0 == 0) goto La
                r0.dismiss()
                r0 = 0
                r1.f609a = r0
            La:
                return
        }

        @Override // a.C0292o1.g
        public final void e(int r5, int r6) {
                r4 = this;
                a.o1$d r0 = r4.b
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.b$a r0 = new androidx.appcompat.app.b$a
                a.o1 r1 = r4.d
                android.content.Context r2 = r1.getPopupContext()
                r0.<init>(r2)
                java.lang.CharSequence r2 = r4.c
                androidx.appcompat.app.AlertController$b r3 = r0.f810a
                if (r2 == 0) goto L18
                r3.d = r2
            L18:
                a.o1$d r2 = r4.b
                int r1 = r1.getSelectedItemPosition()
                r3.g = r2
                r3.h = r4
                r3.j = r1
                r1 = 1
                r3.i = r1
                androidx.appcompat.app.b r0 = r0.a()
                r4.f609a = r0
                androidx.appcompat.app.AlertController r0 = r0.f
                androidx.appcompat.app.AlertController$RecycleListView r0 = r0.e
                r0.setTextDirection(r5)
                r0.setTextAlignment(r6)
                androidx.appcompat.app.b r5 = r4.f609a
                r5.show()
                return
        }

        @Override // a.C0292o1.g
        public final int g() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // a.C0292o1.g
        public final android.graphics.drawable.Drawable i() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // a.C0292o1.g
        public final java.lang.CharSequence j() {
                r1 = this;
                java.lang.CharSequence r0 = r1.c
                return r0
        }

        @Override // a.C0292o1.g
        public final void l(java.lang.CharSequence r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // a.C0292o1.g
        public final void m(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set popup background for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // a.C0292o1.g
        public final void n(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // a.C0292o1.g
        public final void o(android.widget.ListAdapter r1) {
                r0 = this;
                a.o1$d r1 = (a.C0292o1.d) r1
                r0.b = r1
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                a.o1 r4 = r3.d
                r4.setSelection(r5)
                android.widget.AdapterView$OnItemClickListener r0 = r4.getOnItemClickListener()
                if (r0 == 0) goto L15
                a.o1$d r0 = r3.b
                long r0 = r0.getItemId(r5)
                r2 = 0
                r4.performItemClick(r2, r5, r0)
            L15:
                r3.dismiss()
                return
        }

        @Override // a.C0292o1.g
        public final void p(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$d */
    public static class d implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.widget.SpinnerAdapter f610a;
        public android.widget.ListAdapter b;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.b
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public final int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getCount()
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public final android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
                return r2
        }

        @Override // android.widget.Adapter
        public final java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.getItem(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public final long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.f610a
                if (r0 != 0) goto L7
                r0 = -1
                return r0
            L7:
                long r0 = r0.getItemId(r3)
                return r0
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r1 = r0.getDropDownView(r1, r2, r3)
                return r1
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.b
                if (r0 == 0) goto L9
                boolean r2 = r0.isEnabled(r2)
                return r2
            L9:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r2)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f610a
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r2)
            L7:
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$e */
    public class e extends a.F9 implements a.C0292o1.g {
        public java.lang.CharSequence C;
        public a.C0292o1.d D;
        public final android.graphics.Rect E;
        public int F;
        public final /* synthetic */ a.C0292o1 G;

        /* JADX INFO: renamed from: a.o1$e$a */
        public class a implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.C0292o1.e f611a;

            public a(a.C0292o1.e r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f611a = r1
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
                    r2 = this;
                    a.o1$e r3 = r2.f611a
                    a.o1 r6 = r3.G
                    r6.setSelection(r5)
                    a.o1 r6 = r3.G
                    android.widget.AdapterView$OnItemClickListener r7 = r6.getOnItemClickListener()
                    if (r7 == 0) goto L18
                    a.o1$d r7 = r3.D
                    long r0 = r7.getItemId(r5)
                    r6.performItemClick(r4, r5, r0)
                L18:
                    r3.dismiss()
                    return
            }
        }

        /* JADX INFO: renamed from: a.o1$e$b */
        public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.C0292o1.e f612a;

            public b(a.C0292o1.e r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f612a = r1
                    return
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                    r3 = this;
                    a.o1$e r0 = r3.f612a
                    a.o1 r1 = r0.G
                    r0.getClass()
                    boolean r2 = r1.isAttachedToWindow()
                    if (r2 == 0) goto L1c
                    android.graphics.Rect r2 = r0.E
                    boolean r1 = r1.getGlobalVisibleRect(r2)
                    if (r1 == 0) goto L1c
                    r0.s()
                    r0.f()
                    return
                L1c:
                    r0.dismiss()
                    return
            }
        }

        /* JADX INFO: renamed from: a.o1$e$c */
        public class c implements android.widget.PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.C0292o1.e.b f613a;
            public final /* synthetic */ a.C0292o1.e b;

            public c(a.C0292o1.e r1, a.C0292o1.e.b r2) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    r0.f613a = r2
                    return
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                    r2 = this;
                    a.o1$e r0 = r2.b
                    a.o1 r0 = r0.G
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    if (r0 == 0) goto Lf
                    a.o1$e$b r1 = r2.f613a
                    r0.removeGlobalOnLayoutListener(r1)
                Lf:
                    return
            }
        }

        public e(a.C0292o1 r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.G = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.E = r2
                r0.o = r1
                r1 = 1
                r0.y = r1
                a.g1 r2 = r0.z
                r2.setFocusable(r1)
                a.o1$e$a r1 = new a.o1$e$a
                r1.<init>(r0)
                r0.p = r1
                return
        }

        @Override // a.C0292o1.g
        public final void e(int r5, int r6) {
                r4 = this;
                a.g1 r0 = r4.z
                boolean r1 = r0.isShowing()
                r4.s()
                r2 = 2
                a.g1 r3 = r4.z
                r3.setInputMethodMode(r2)
                r4.f()
                a.A5 r2 = r4.c
                r3 = 1
                r2.setChoiceMode(r3)
                r2.setTextDirection(r5)
                r2.setTextAlignment(r6)
                a.o1 r5 = r4.G
                int r6 = r5.getSelectedItemPosition()
                a.A5 r2 = r4.c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L3e
                if (r2 == 0) goto L3e
                r0 = 0
                r2.setListSelectionHidden(r0)
                r2.setSelection(r6)
                int r0 = r2.getChoiceMode()
                if (r0 == 0) goto L3e
                r2.setItemChecked(r6, r3)
            L3e:
                if (r1 == 0) goto L41
                goto L59
            L41:
                android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
                if (r5 == 0) goto L59
                a.o1$e$b r6 = new a.o1$e$b
                r6.<init>(r4)
                r5.addOnGlobalLayoutListener(r6)
                a.o1$e$c r5 = new a.o1$e$c
                r5.<init>(r4, r6)
                a.g1 r6 = r4.z
                r6.setOnDismissListener(r5)
            L59:
                return
        }

        @Override // a.C0292o1.g
        public final java.lang.CharSequence j() {
                r1 = this;
                java.lang.CharSequence r0 = r1.C
                return r0
        }

        @Override // a.C0292o1.g
        public final void l(java.lang.CharSequence r1) {
                r0 = this;
                r0.C = r1
                return
        }

        @Override // a.F9, a.C0292o1.g
        public final void o(android.widget.ListAdapter r1) {
                r0 = this;
                super.o(r1)
                a.o1$d r1 = (a.C0292o1.d) r1
                r0.D = r1
                return
        }

        @Override // a.C0292o1.g
        public final void p(int r1) {
                r0 = this;
                r0.F = r1
                return
        }

        public final void s() {
                r10 = this;
                a.g1 r0 = r10.z
                android.graphics.drawable.Drawable r1 = r0.getBackground()
                r2 = 1
                a.o1 r3 = r10.G
                if (r1 == 0) goto L1f
                android.graphics.Rect r4 = r3.h
                r1.getPadding(r4)
                int r1 = r3.getLayoutDirection()
                android.graphics.Rect r4 = r3.h
                if (r1 != r2) goto L1b
                int r1 = r4.right
                goto L27
            L1b:
                int r1 = r4.left
                int r1 = -r1
                goto L27
            L1f:
                android.graphics.Rect r1 = r3.h
                r4 = 0
                r1.right = r4
                r1.left = r4
                r1 = r4
            L27:
                int r4 = r3.getPaddingLeft()
                int r5 = r3.getPaddingRight()
                int r6 = r3.getWidth()
                int r7 = r3.g
                r8 = -2
                if (r7 != r8) goto L66
                a.o1$d r7 = r10.D
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                int r0 = r3.a(r7, r0)
                android.content.Context r7 = r3.getContext()
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r7 = r7.widthPixels
                android.graphics.Rect r8 = r3.h
                int r9 = r8.left
                int r7 = r7 - r9
                int r8 = r8.right
                int r7 = r7 - r8
                if (r0 <= r7) goto L5b
                r0 = r7
            L5b:
                int r7 = r6 - r4
                int r7 = r7 - r5
                int r0 = java.lang.Math.max(r0, r7)
                r10.r(r0)
                goto L73
            L66:
                r0 = -1
                if (r7 != r0) goto L70
                int r0 = r6 - r4
                int r0 = r0 - r5
                r10.r(r0)
                goto L73
            L70:
                r10.r(r7)
            L73:
                int r0 = r3.getLayoutDirection()
                if (r0 != r2) goto L82
                int r6 = r6 - r5
                int r0 = r10.e
                int r6 = r6 - r0
                int r0 = r10.F
                int r6 = r6 - r0
                int r6 = r6 + r1
                goto L87
            L82:
                int r0 = r10.F
                int r4 = r4 + r0
                int r6 = r4 + r1
            L87:
                r10.f = r6
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$f */
    public static class f extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<a.C0292o1.f> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f614a;

        /* JADX INFO: renamed from: a.o1$f$a */
        public class a implements android.os.Parcelable.Creator<a.C0292o1.f> {
            @Override // android.os.Parcelable.Creator
            public final a.C0292o1.f createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    a.o1$f r0 = new a.o1$f
                    r0.<init>(r2)
                    byte r2 = r2.readByte()
                    if (r2 == 0) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = 0
                Le:
                    r0.f614a = r2
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final a.C0292o1.f[] newArray(int r1) {
                    r0 = this;
                    a.o1$f[] r1 = new a.C0292o1.f[r1]
                    return r1
            }
        }

        static {
                a.o1$f$a r0 = new a.o1$f$a
                r0.<init>()
                a.C0292o1.f.CREATOR = r0
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.f614a
                byte r2 = (byte) r2
                r1.writeByte(r2)
                return
        }
    }

    /* JADX INFO: renamed from: a.o1$g */
    public interface g {
        boolean b();

        void c(int r1);

        int d();

        void dismiss();

        void e(int r1, int r2);

        int g();

        android.graphics.drawable.Drawable i();

        java.lang.CharSequence j();

        void l(java.lang.CharSequence r1);

        void m(android.graphics.drawable.Drawable r1);

        void n(int r1);

        void o(android.widget.ListAdapter r1);

        void p(int r1);
    }

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            a.C0292o1.i = r0
            return
    }

    public C0292o1(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.h = r0
            android.content.Context r0 = r9.getContext()
            a.C0109df.a(r9, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            a.of r0 = a.C0306of.e(r10, r11, r0, r12)
            a.G0 r1 = new a.G0
            r1.<init>(r9)
            r9.f607a = r1
            int r1 = androidx.appcompat.R.styleable.Spinner_popupTheme
            android.content.res.TypedArray r2 = r0.b
            r3 = 0
            int r1 = r2.getResourceId(r1, r3)
            if (r1 == 0) goto L31
            a.Z3 r4 = new a.Z3
            r4.<init>(r10, r1)
            r9.b = r4
            goto L33
        L31:
            r9.b = r10
        L33:
            r1 = -1
            r4 = 0
            int[] r5 = a.C0292o1.i     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r12, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            boolean r6 = r5.hasValue(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r6 == 0) goto L4c
            int r1 = r5.getInt(r3, r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L4c
        L46:
            r10 = move-exception
            r4 = r5
            goto Ld8
        L4a:
            r3 = move-exception
            goto L55
        L4c:
            r5.recycle()
            goto L5f
        L50:
            r10 = move-exception
            goto Ld8
        L53:
            r3 = move-exception
            r5 = r4
        L55:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r3)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L5f
            goto L4c
        L5f:
            r3 = 1
            if (r1 == 0) goto L9d
            if (r1 == r3) goto L65
            goto Lac
        L65:
            a.o1$e r1 = new a.o1$e
            android.content.Context r5 = r9.b
            r1.<init>(r9, r5, r11, r12)
            android.content.Context r5 = r9.b
            int[] r6 = androidx.appcompat.R.styleable.Spinner
            a.of r5 = a.C0306of.e(r5, r11, r6, r12)
            int r6 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            android.content.res.TypedArray r7 = r5.b
            r8 = -2
            int r6 = r7.getLayoutDimension(r6, r8)
            r9.g = r6
            int r6 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r1.m(r6)
            int r6 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r6 = r2.getString(r6)
            r1.C = r6
            r5.f()
            r9.f = r1
            a.n1 r5 = new a.n1
            r5.<init>(r9, r9, r1)
            r9.c = r5
            goto Lac
        L9d:
            a.o1$c r1 = new a.o1$c
            r1.<init>(r9)
            r9.f = r1
            int r5 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r5 = r2.getString(r5)
            r1.c = r5
        Lac:
            int r1 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r1 = r2.getTextArray(r1)
            if (r1 == 0) goto Lc4
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r10, r5, r1)
            int r10 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r2.setDropDownViewResource(r10)
            r9.setAdapter(r2)
        Lc4:
            r0.f()
            r9.e = r3
            android.widget.SpinnerAdapter r10 = r9.d
            if (r10 == 0) goto Ld2
            r9.setAdapter(r10)
            r9.d = r4
        Ld2:
            a.G0 r10 = r9.f607a
            r10.d(r11, r12)
            return
        Ld8:
            if (r4 == 0) goto Ldd
            r4.recycle()
        Ldd:
            throw r10
    }

    public final int a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = r0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6c
            android.graphics.Rect r11 = r10.h
            r12.getPadding(r11)
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r12 = r12 + r3
            return r12
        L6c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.d()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.g()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L7
            int r0 = r1.g
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    public final a.C0292o1.g getInternalPopup() {
            r1 = this;
            a.o1$g r0 = r1.f
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.i()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.b
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.j()
            return r0
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            a.o1$g r0 = r2.f
            if (r0 == 0) goto L10
            boolean r1 = r0.b()
            if (r1 == 0) goto L10
            r0.dismiss()
        L10:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            a.o1$g r4 = r2.f
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            a.o1$f r2 = (a.C0292o1.f) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f614a
            if (r2 == 0) goto L1b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L1b
            a.o1$a r0 = new a.o1$a
            r0.<init>(r1)
            r2.addOnGlobalLayoutListener(r0)
        L1b:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            a.o1$f r0 = new a.o1$f
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            a.o1$g r1 = r2.f
            if (r1 == 0) goto L15
            boolean r1 = r1.b()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.f614a = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            a.n1 r0 = r1.c
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
            r3 = this;
            a.o1$g r0 = r3.f
            if (r0 == 0) goto L19
            boolean r0 = r0.b()
            if (r0 != 0) goto L17
            int r0 = r3.getTextDirection()
            int r1 = r3.getTextAlignment()
            a.o1$g r2 = r3.f
            r2.e(r0, r1)
        L17:
            r0 = 1
            return r0
        L19:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r5) {
            r4 = this;
            boolean r0 = r4.e
            if (r0 != 0) goto L7
            r4.d = r5
            return
        L7:
            super.setAdapter(r5)
            a.o1$g r0 = r4.f
            if (r0 == 0) goto L48
            android.content.Context r1 = r4.b
            if (r1 != 0) goto L16
            android.content.Context r1 = r4.getContext()
        L16:
            a.o1$d r2 = new a.o1$d
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2.<init>()
            r2.f610a = r5
            boolean r3 = r5 instanceof android.widget.ListAdapter
            if (r3 == 0) goto L2a
            r3 = r5
            android.widget.ListAdapter r3 = (android.widget.ListAdapter) r3
            r2.b = r3
        L2a:
            if (r1 == 0) goto L45
            boolean r3 = r5 instanceof android.widget.ThemedSpinnerAdapter
            if (r3 == 0) goto L36
            android.widget.ThemedSpinnerAdapter r5 = (android.widget.ThemedSpinnerAdapter) r5
            a.C0292o1.b.a(r5, r1)
            goto L45
        L36:
            boolean r1 = r5 instanceof a.InterfaceC0127ef
            if (r1 == 0) goto L45
            a.ef r5 = (a.InterfaceC0127ef) r5
            android.content.res.Resources$Theme r1 = r5.getDropDownViewTheme()
            if (r1 != 0) goto L45
            r5.a()
        L45:
            r0.o(r2)
        L48:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.f607a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto Lb
            r0.p(r2)
            r0.c(r2)
            return
        Lb:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L8
            r0.n(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L7
            r1.g = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L8
            r0.m(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            a.o1$g r0 = r1.f
            if (r0 == 0) goto L8
            r0.l(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.f607a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }
}
