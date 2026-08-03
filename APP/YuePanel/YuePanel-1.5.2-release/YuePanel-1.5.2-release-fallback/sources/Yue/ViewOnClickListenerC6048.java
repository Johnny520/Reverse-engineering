package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC6048 extends Yue.AbstractC5349 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean f21862 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f21863 = "SuggestionsAdapter";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f21864 = 50;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f21865 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f21866 = 1;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f21867 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f21868 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final androidx.appcompat.widget.SearchView f21869;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final android.app.SearchableInfo f21870;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final android.content.Context f21871;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> f21872;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final int f21873;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean f21874;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f21875;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public android.content.res.ColorStateList f21876;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f21877;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f21878;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int f21879;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int f21880;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int f21881;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public int f21882;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤۥ$ۥ, reason: contains not printable characters */
    public static final class C6049 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.TextView f21883;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.widget.TextView f21884;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.widget.ImageView f21885;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final android.widget.ImageView f21886;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final android.widget.ImageView f21887;

        public C6049(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f21883 = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f21884 = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f21885 = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f21886 = r0
                int r0 = Yue.C5058.C5065.f17122
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.f21887 = r2
                return
        }
    }

    public ViewOnClickListenerC6048(android.content.Context r4, androidx.appcompat.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 0
            r2 = 1
            r3.<init>(r4, r0, r1, r2)
            r0 = 0
            r3.f21874 = r0
            r3.f21875 = r2
            r0 = -1
            r3.f21877 = r0
            r3.f21878 = r0
            r3.f21879 = r0
            r3.f21880 = r0
            r3.f21881 = r0
            r3.f21882 = r0
            r3.f21869 = r5
            r3.f21870 = r6
            int r5 = r5.getSuggestionCommitIconResId()
            r3.f21873 = r5
            r3.f21871 = r4
            r3.f21872 = r7
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m22742(android.database.Cursor r0, java.lang.String r1) {
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r0 = m22743(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static java.lang.String m22743(android.database.Cursor r2, int r3) {
            r0 = -1
            r1 = 0
            if (r3 != r0) goto L5
            return r1
        L5:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    @Override // Yue.AbstractC1676, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getDropDownView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.f21871
            android.database.Cursor r0 = r1.getCursor()
            android.view.View r3 = r1.mo8063(r3, r0, r4)
            if (r3 == 0) goto L28
            java.lang.Object r4 = r3.getTag()
            Yue.ۥۢ۠ۤۥ$ۥ r4 = (Yue.ViewOnClickListenerC6048.C6049) r4
            android.widget.TextView r4 = r4.f21883
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L28:
            return r3
    }

    @Override // Yue.AbstractC1676, android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.f21871
            android.database.Cursor r0 = r1.getCursor()
            android.view.View r3 = r1.mo8064(r3, r0, r4)
            if (r3 == 0) goto L28
            java.lang.Object r4 = r3.getTag()
            Yue.ۥۢ۠ۤۥ$ۥ r4 = (Yue.ViewOnClickListenerC6048.C6049) r4
            android.widget.TextView r4 = r4.f21883
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L28:
            return r3
    }

    @Override // Yue.AbstractC1676, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r1.getCursor()
            r1.m22761(r0)
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r1.getCursor()
            r1.m22761(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView r0 = r1.f21869
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.m28343(r2)
        Lf:
            return
    }

    @Override // Yue.AbstractC1676, Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ */
    public java.lang.CharSequence mo8056(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r1 = m22742(r3, r1)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.app.SearchableInfo r1 = r2.f21870
            boolean r1 = r1.shouldRewriteQueryFromData()
            if (r1 == 0) goto L1e
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = m22742(r3, r1)
            if (r1 == 0) goto L1e
            return r1
        L1e:
            android.app.SearchableInfo r1 = r2.f21870
            boolean r1 = r1.shouldRewriteQueryFromText()
            if (r1 == 0) goto L2f
            java.lang.String r1 = "suggest_text_1"
            java.lang.String r3 = m22742(r3, r1)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            return r0
    }

    @Override // Yue.AbstractC1676, Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo8057(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.f21874
            java.lang.String r1 = "SuggestionsAdapter"
            if (r0 == 0) goto L11
            java.lang.String r0 = "Tried to change cursor after adapter was closed."
            android.util.Log.w(r1, r0)
            if (r3 == 0) goto L10
            r3.close()
        L10:
            return
        L11:
            super.mo8057(r3)     // Catch: java.lang.Exception -> L47
            if (r3 == 0) goto L4d
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21877 = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21878 = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21879 = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21880 = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21881 = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.f21882 = r3     // Catch: java.lang.Exception -> L47
            goto L4d
        L47:
            r3 = move-exception
            java.lang.String r0 = "error changing cursor and caching columns"
            android.util.Log.e(r1, r0, r3)
        L4d:
            return
    }

    @Override // Yue.AbstractC1676, Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ۟۟ */
    public android.database.Cursor mo8058(java.lang.CharSequence r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            goto L9
        L5:
            java.lang.String r4 = r4.toString()
        L9:
            androidx.appcompat.widget.SearchView r0 = r3.f21869
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L31
            androidx.appcompat.widget.SearchView r0 = r3.f21869
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1b
            goto L31
        L1b:
            android.app.SearchableInfo r0 = r3.f21870     // Catch: java.lang.RuntimeException -> L29
            r2 = 50
            android.database.Cursor r4 = r3.m22756(r0, r4, r2)     // Catch: java.lang.RuntimeException -> L29
            if (r4 == 0) goto L31
            r4.getCount()     // Catch: java.lang.RuntimeException -> L29
            return r4
        L29:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r4)
        L31:
            return r1
    }

    @Override // Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo8059(android.view.View r7, android.content.Context r8, android.database.Cursor r9) {
            r6 = this;
            java.lang.Object r7 = r7.getTag()
            Yue.ۥۢ۠ۤۥ$ۥ r7 = (Yue.ViewOnClickListenerC6048.C6049) r7
            int r8 = r6.f21882
            r0 = -1
            r1 = 0
            if (r8 == r0) goto L11
            int r8 = r9.getInt(r8)
            goto L12
        L11:
            r8 = r1
        L12:
            android.widget.TextView r0 = r7.f21883
            if (r0 == 0) goto L21
            int r0 = r6.f21877
            java.lang.String r0 = m22743(r9, r0)
            android.widget.TextView r2 = r7.f21883
            r6.m22759(r2, r0)
        L21:
            android.widget.TextView r0 = r7.f21884
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L5e
            int r0 = r6.f21879
            java.lang.String r0 = m22743(r9, r0)
            if (r0 == 0) goto L34
            java.lang.CharSequence r0 = r6.m22746(r0)
            goto L3a
        L34:
            int r0 = r6.f21878
            java.lang.String r0 = m22743(r9, r0)
        L3a:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L4d
            android.widget.TextView r4 = r7.f21883
            if (r4 == 0) goto L59
            r4.setSingleLine(r1)
            android.widget.TextView r4 = r7.f21883
            r4.setMaxLines(r2)
            goto L59
        L4d:
            android.widget.TextView r4 = r7.f21883
            if (r4 == 0) goto L59
            r4.setSingleLine(r3)
            android.widget.TextView r4 = r7.f21883
            r4.setMaxLines(r3)
        L59:
            android.widget.TextView r4 = r7.f21884
            r6.m22759(r4, r0)
        L5e:
            android.widget.ImageView r0 = r7.f21885
            if (r0 == 0) goto L6a
            android.graphics.drawable.Drawable r4 = r6.m22753(r9)
            r5 = 4
            r6.m22758(r0, r4, r5)
        L6a:
            android.widget.ImageView r0 = r7.f21886
            r4 = 8
            if (r0 == 0) goto L77
            android.graphics.drawable.Drawable r9 = r6.m22754(r9)
            r6.m22758(r0, r9, r4)
        L77:
            int r9 = r6.f21875
            if (r9 == r2) goto L87
            if (r9 != r3) goto L81
            r8 = r8 & r3
            if (r8 == 0) goto L81
            goto L87
        L81:
            android.widget.ImageView r7 = r7.f21887
            r7.setVisibility(r4)
            goto L9c
        L87:
            android.widget.ImageView r8 = r7.f21887
            r8.setVisibility(r1)
            android.widget.ImageView r8 = r7.f21887
            android.widget.TextView r9 = r7.f21883
            java.lang.CharSequence r9 = r9.getText()
            r8.setTag(r9)
            android.widget.ImageView r7 = r7.f21887
            r7.setOnClickListener(r6)
        L9c:
            return
    }

    @Override // Yue.AbstractC5349, Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public android.view.View mo8064(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = super.mo8064(r1, r2, r3)
            Yue.ۥۢ۠ۤۥ$ۥ r2 = new Yue.ۥۢ۠ۤۥ$ۥ
            r2.<init>(r1)
            r1.setTag(r2)
            int r2 = Yue.C5058.C5065.f17122
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r0.f21873
            r2.setImageResource(r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22744(java.lang.String r2) {
            r1 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f21872
            java.lang.Object r2 = r0.get(r2)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m22745() {
            r1 = this;
            r0 = 0
            r1.mo8057(r0)
            r0 = 1
            r1.f21874 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final java.lang.CharSequence m22746(java.lang.CharSequence r9) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.f21876
            if (r0 != 0) goto L23
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r8.f21871
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = Yue.C5058.C5060.f16783
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.Context r1 = r8.f21871
            android.content.res.Resources r1 = r1.getResources()
            int r0 = r0.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.f21876 = r0
        L23:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r9)
            android.text.style.TextAppearanceSpan r7 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r5 = r8.f21876
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            int r9 = r9.length()
            r1 = 33
            r2 = 0
            r0.setSpan(r7, r2, r9, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22747(android.content.ComponentName r7) {
            r6 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            android.content.Context r1 = r6.f21871
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            android.content.pm.ActivityInfo r2 = r1.getActivityInfo(r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r4 = r2.getIconResource()
            if (r4 != 0) goto L16
            return r3
        L16:
            java.lang.String r5 = r7.getPackageName()
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5, r4, r2)
            if (r1 != 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid icon resource "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " for "
            r1.append(r2)
            java.lang.String r7 = r7.flattenToShortString()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.w(r0, r7)
            return r3
        L43:
            return r1
        L44:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r0, r7)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22748(android.content.ComponentName r4) {
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f21872
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L23
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f21872
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L18
            goto L22
        L18:
            android.content.Context r0 = r3.f21871
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L22:
            return r2
        L23:
            android.graphics.drawable.Drawable r4 = r3.m22747(r4)
            if (r4 != 0) goto L2a
            goto L2e
        L2a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L2e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f21872
            r1.put(r0, r2)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22749() {
            r1 = this;
            android.app.SearchableInfo r0 = r1.f21870
            android.content.ComponentName r0 = r0.getSearchActivity()
            android.graphics.drawable.Drawable r0 = r1.m22748(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            android.content.Context r0 = r1.f21871
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22750(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch: java.io.FileNotFoundException -> L16
            if (r3 == 0) goto L2f
            android.graphics.drawable.Drawable r7 = r6.m22751(r7)     // Catch: java.io.FileNotFoundException -> L16 android.content.res.Resources.NotFoundException -> L18
            return r7
        L16:
            r0 = move-exception
            goto L87
        L18:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L16
            r3.<init>()     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch: java.io.FileNotFoundException -> L16
            r3.append(r7)     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.io.FileNotFoundException -> L16
            r0.<init>(r3)     // Catch: java.io.FileNotFoundException -> L16
            throw r0     // Catch: java.io.FileNotFoundException -> L16
        L2f:
            android.content.Context r3 = r6.f21871     // Catch: java.io.FileNotFoundException -> L16
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.FileNotFoundException -> L16
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch: java.io.FileNotFoundException -> L16
            if (r3 == 0) goto L70
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch: java.lang.Throwable -> L57
            r3.close()     // Catch: java.io.IOException -> L43
            goto L56
        L43:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L16
            r5.<init>()     // Catch: java.io.FileNotFoundException -> L16
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> L16
            r5.append(r7)     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r0 = r5.toString()     // Catch: java.io.FileNotFoundException -> L16
            android.util.Log.e(r1, r0, r3)     // Catch: java.io.FileNotFoundException -> L16
        L56:
            return r4
        L57:
            r4 = move-exception
            r3.close()     // Catch: java.io.IOException -> L5c
            goto L6f
        L5c:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L16
            r5.<init>()     // Catch: java.io.FileNotFoundException -> L16
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> L16
            r5.append(r7)     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r0 = r5.toString()     // Catch: java.io.FileNotFoundException -> L16
            android.util.Log.e(r1, r0, r3)     // Catch: java.io.FileNotFoundException -> L16
        L6f:
            throw r4     // Catch: java.io.FileNotFoundException -> L16
        L70:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L16
            r3.<init>()     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch: java.io.FileNotFoundException -> L16
            r3.append(r7)     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.io.FileNotFoundException -> L16
            r0.<init>(r3)     // Catch: java.io.FileNotFoundException -> L16
            throw r0     // Catch: java.io.FileNotFoundException -> L16
        L87:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m22751(android.net.Uri r8) throws java.io.FileNotFoundException {
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lba
            android.content.Context r1 = r7.f21871     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            java.util.List r2 = r8.getPathSegments()
            if (r2 == 0) goto L8c
            int r3 = r2.size()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L44
            java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L57
        L2d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Single path segment is not a resource ID: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L44:
            r6 = 2
            if (r3 != r6) goto L75
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.getIdentifier(r3, r2, r0)
        L57:
            if (r0 == 0) goto L5e
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r0)
            return r8
        L5e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No resource found for: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L75:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "More than two path segments: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L8c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No path: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        La3:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No package found for authority: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lba:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No authority: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22752(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L6f
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L6f
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L12
            goto L6f
        L12:
            int r1 = java.lang.Integer.parseInt(r5)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.content.Context r3 = r4.f21871     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r2 = r2.toString()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.graphics.drawable.Drawable r3 = r4.m22744(r2)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            if (r3 == 0) goto L3c
            return r3
        L3c:
            android.content.Context r3 = r4.f21871     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.graphics.drawable.Drawable r1 = Yue.C1584.m7766(r3, r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r4.m22760(r2, r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            return r1
        L46:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Icon resource not found: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "SuggestionsAdapter"
            android.util.Log.w(r1, r5)
            return r0
        L5d:
            android.graphics.drawable.Drawable r0 = r4.m22744(r5)
            if (r0 == 0) goto L64
            return r0
        L64:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.graphics.drawable.Drawable r0 = r4.m22750(r0)
            r4.m22760(r5, r0)
        L6f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22753(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.f21880
            r1 = -1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r3 = r2.m22752(r3)
            if (r3 == 0) goto L12
            return r3
        L12:
            android.graphics.drawable.Drawable r3 = r2.m22749()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m22754(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.f21881
            r1 = -1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r3 = r2.m22752(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m22755() {
            r1 = this;
            int r0 = r1.f21875
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.database.Cursor m22756(android.app.SearchableInfo r10, java.lang.String r11, int r12) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L2d
            r1.appendEncodedPath(r2)
        L2d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L40
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
        L3e:
            r7 = r0
            goto L44
        L40:
            r1.appendPath(r11)
            goto L3e
        L44:
            if (r12 <= 0) goto L4f
            java.lang.String r10 = "limit"
            java.lang.String r11 = java.lang.String.valueOf(r12)
            r1.appendQueryParameter(r10, r11)
        L4f:
            android.net.Uri r4 = r1.build()
            android.content.Context r10 = r9.f21871
            android.content.ContentResolver r3 = r10.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m22757(int r1) {
            r0 = this;
            r0.f21875 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m22758(android.widget.ImageView r1, android.graphics.drawable.Drawable r2, int r3) {
            r0 = this;
            r1.setImageDrawable(r2)
            if (r2 != 0) goto L9
            r1.setVisibility(r3)
            goto L14
        L9:
            r3 = 0
            r1.setVisibility(r3)
            r2.setVisible(r3, r3)
            r1 = 1
            r2.setVisible(r1, r3)
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m22759(android.widget.TextView r1, java.lang.CharSequence r2) {
            r0 = this;
            r1.setText(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Lf
            r2 = 8
            r1.setVisibility(r2)
            goto L13
        Lf:
            r2 = 0
            r1.setVisibility(r2)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m22760(java.lang.String r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f21872
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.put(r2, r3)
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m22761(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto L7
            android.os.Bundle r2 = r2.getExtras()
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto Lf
            java.lang.String r0 = "in_progress"
            r2.getBoolean(r0)
        Lf:
            return
    }
}
