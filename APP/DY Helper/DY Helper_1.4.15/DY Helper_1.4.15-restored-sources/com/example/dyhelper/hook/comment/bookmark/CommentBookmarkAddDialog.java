package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkAddDialog {
    public static final int $stable = 8;
    private final p000.C1000xx colors;
    private final android.content.Context context;
    private final android.app.Dialog dialog;
    private final p000.a80 onConfirm;
    private final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord record;
    private java.lang.String selectedCategory;


    public CommentBookmarkAddDialog(android.content.Context r4, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5, p000.a80 r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r3.<init>()
            r3.context = r4
            r3.record = r5
            r3.onConfirm = r6
            android.app.Dialog r5 = new android.app.Dialog
            r5.<init>(r4)
            r3.dialog = r5
            xx r6 = p000.jx0.m3049(r4)
            r3.colors = r6
            java.lang.String r6 = "默认"
            r3.selectedCategory = r6
            r6 = 1
            r5.requestWindowFeature(r6)
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r4 = r0.m6477(r4)
            r0 = 0
            r1 = 0
            r2 = 2131492896(0x7f0c0020, float:1.8609257E38)
            android.view.View r4 = r4.inflate(r2, r0, r1)
            r5.setContentView(r4)
            r5.setCanceledOnTouchOutside(r6)
            r4.getClass()
            r3.setupView(r4)
            r3.applyWindowStyle()
            i9 r4 = new i9
            r4.<init>(r6, r3)
            r5.setOnShowListener(r4)
            return
    }

    private static final void _init_$lambda$0(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.content.DialogInterface r1) {
            r0.applyWindowStyle()
            return
    }

    public static final /* synthetic */ int access$dp(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, int r1) {
            int r0 = r0.m1398dp(r1)
            return r0
    }

    public static final /* synthetic */ p000.C1000xx access$getColors$p(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0) {
            xx r0 = r0.colors
            return r0
    }

    private final void applyThemeToStaticViews(android.view.View r3, android.view.View r4, android.view.View r5, android.view.View r6, android.widget.FrameLayout r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, android.widget.TextView r14) {
            r2 = this;
            xx r0 = r2.colors
            java.lang.String r0 = r0.f12351
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setBackgroundColor(r0)
            android.content.Context r3 = r2.context
            xx r0 = r2.colors
            java.lang.String r0 = r0.f12352
            r1 = 10
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r1, r3, r0)
            r4.setBackground(r3)
            android.content.Context r3 = r2.context
            xx r4 = r2.colors
            java.lang.String r4 = r4.f12352
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r1, r3, r4)
            r5.setBackground(r3)
            android.content.Context r3 = r2.context
            xx r4 = r2.colors
            java.lang.String r4 = r4.f12352
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r1, r3, r4)
            r6.setBackground(r3)
            android.content.Context r3 = r2.context
            xx r4 = r2.colors
            java.lang.String r4 = r4.f12371
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r1, r3, r4)
            r7.setBackground(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            r8.setTextColor(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12356
            int r3 = android.graphics.Color.parseColor(r3)
            r9.setTextColor(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            r10.setTextColor(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12356
            int r3 = android.graphics.Color.parseColor(r3)
            r11.setTextColor(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12357
            int r3 = android.graphics.Color.parseColor(r3)
            r12.setTextColor(r3)
            xx r3 = r2.colors
            java.lang.String r3 = r3.f12357
            int r3 = android.graphics.Color.parseColor(r3)
            r13.setTextColor(r3)
            xx r2 = r2.colors
            java.lang.String r2 = r2.f12349
            int r2 = android.graphics.Color.parseColor(r2)
            r14.setTextColor(r2)
            return
    }

    private final void applyWindowStyle() {
            r2 = this;
            android.app.Dialog r2 = r2.dialog
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L38
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r2.setBackgroundDrawable(r0)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            r1 = 1064011039(0x3f6b851f, float:0.92)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = -2
            r2.setLayout(r0, r1)
            r0 = 1051931443(0x3eb33333, float:0.35)
            r2.setDimAmount(r0)
            r0 = 2
            r2.addFlags(r0)
            r0 = 16
            r2.setSoftInputMode(r0)
        L38:
            return
    }

    private final void bindCategorySelector(android.widget.Spinner r3, android.widget.TextView r4, android.view.View r5, java.util.List<java.lang.String> r6, java.lang.String r7, p000.a80 r8) {
            r2 = this;
            android.content.Context r0 = r2.context
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog$bindCategorySelector$adapter$1 r1 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog$bindCategorySelector$adapter$1
            r1.<init>(r6, r2, r0)
            r3.setAdapter(r1)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            xx r1 = r2.colors
            java.lang.String r1 = r1.f12352
            int r1 = android.graphics.Color.parseColor(r1)
            r0.<init>(r1)
            r3.setPopupBackgroundDrawable(r0)
            r0 = 4
            int r0 = r2.m1398dp(r0)
            r3.setDropDownVerticalOffset(r0)
            int r7 = r6.indexOf(r7)
            r0 = 0
            if (r7 >= 0) goto L2a
            r7 = r0
        L2a:
            r3.setSelection(r7, r0)
            java.lang.Object r7 = p000.AbstractC0984xh.m6641(r7, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "默认"
            if (r7 == 0) goto L38
            goto L39
        L38:
            r7 = r0
        L39:
            r4.setText(r7)
            xx r7 = r2.colors
            java.lang.String r7 = r7.f12355
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setTextColor(r7)
            xx r7 = r2.colors
            java.lang.String r7 = r7.f12348
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3034(r7)
            r4.setBackground(r7)
            r7 = 16
            r4.setGravity(r7)
            java.lang.CharSequence r7 = r4.getText()
            if (r7 == 0) goto L62
            java.lang.String r7 = r7.toString()
            goto L63
        L62:
            r7 = 0
        L63:
            if (r7 != 0) goto L67
            java.lang.String r7 = ""
        L67:
            boolean r1 = p000.q02.m4671(r7)
            if (r1 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r7
        L6f:
            r8.invoke(r0)
            pj r7 = new pj
            r0 = 0
            r7.<init>(r3, r0)
            r4.setOnClickListener(r7)
            r5.setOnClickListener(r7)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog$bindCategorySelector$2 r5 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog$bindCategorySelector$2
            r5.<init>(r6, r4, r8, r2)
            r3.setOnItemSelectedListener(r5)
            return
    }

    private static final void bindCategorySelector$lambda$10(android.widget.Spinner r1, android.view.View r2) {
            qj r2 = new qj
            r0 = 0
            r2.<init>(r1, r0)
            r1.post(r2)
            return
    }

    private static final void bindCategorySelector$lambda$10$lambda$9(android.widget.Spinner r0) {
            r0.performClick()
            return
    }

    private final java.util.List<java.lang.String> buildCategoryList(java.lang.String r4) {
            r3 = this;
            java.lang.String r3 = "默认"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.LinkedHashSet r3 = p000.g81.m2280(r3)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            java.util.List r0 = r0.getCategories()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto L14
            r3.add(r1)
            goto L14
        L32:
            boolean r0 = p000.q02.m4671(r4)
            if (r0 != 0) goto L3b
            r3.add(r4)
        L3b:
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            return r3
    }

    /* JADX INFO: renamed from: dp */
    private final int m1398dp(int r1) {
            r0 = this;
            android.content.Context r0 = r0.context
            int r0 = p000.jx0.m3056(r0, r1)
            return r0
    }

    private final void setupView(android.view.View r18) {
            r17 = this;
            r0 = r18
            r1 = 2131296511(0x7f0900ff, float:1.821094E38)
            android.view.View r1 = r0.findViewById(r1)
            r2 = 2131297009(0x7f0902f1, float:1.821195E38)
            android.view.View r2 = r0.findViewById(r2)
            r3 = 2131296762(0x7f0901fa, float:1.821145E38)
            android.view.View r3 = r0.findViewById(r3)
            r4 = 2131296586(0x7f09014a, float:1.8211093E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2131296479(0x7f0900df, float:1.8210876E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r6 = 2131297142(0x7f090376, float:1.821222E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131297059(0x7f090323, float:1.8212052E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131297062(0x7f090326, float:1.8212058E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297063(0x7f090327, float:1.821206E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131297056(0x7f090320, float:1.8212046E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131297057(0x7f090321, float:1.8212048E38)
            android.view.View r11 = r0.findViewById(r11)
            r13 = r11
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11 = 2131297110(0x7f090356, float:1.8212156E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131297080(0x7f090338, float:1.8212095E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r14 = 2131296964(0x7f0902c4, float:1.821186E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.Spinner r14 = (android.widget.Spinner) r14
            r15 = 2131296578(0x7f090142, float:1.8211077E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.EditText r15 = (android.widget.EditText) r15
            r16 = r1
            r1 = 2131296360(0x7f090068, float:1.8210634E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r16.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r18 = r0
            r1 = r16
            r0 = r17
            r0.applyThemeToStaticViews(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = r5
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r0.record
            java.lang.String r1 = r1.getAuthorName()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "@"
            java.lang.String r1 = p000.q02.m4678(r1, r2)
            boolean r4 = p000.q02.m4671(r1)
            if (r4 != 0) goto Lda
            java.lang.String r1 = r2.concat(r1)
            goto Ldc
        Lda:
            java.lang.String r1 = "未知作者"
        Ldc:
            r8.setText(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r0.record
            java.lang.String r1 = r1.getContent()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto Led
            java.lang.String r1 = "暂无内容"
        Led:
            r9.setText(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r0.record
            java.lang.String r1 = r1.getRemark()
            if (r1 != 0) goto Lfa
            java.lang.String r1 = ""
        Lfa:
            r15.setText(r1)
            android.text.Editable r1 = r15.getText()
            if (r1 == 0) goto L108
            int r1 = r1.length()
            goto L109
        L108:
            r1 = 0
        L109:
            r15.setSelection(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r0.record
            java.lang.String r1 = r1.getUserTag()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto L119
            goto L11a
        L119:
            r1 = 0
        L11a:
            if (r1 != 0) goto L11e
            java.lang.String r1 = "默认"
        L11e:
            r5 = r1
            r0.selectedCategory = r5
            java.util.List r4 = r0.buildCategoryList(r5)
            r14.getClass()
            r13.getClass()
            θ r6 = new θ
            r1 = 7
            r6.<init>(r1, r0)
            r2 = r13
            r1 = r14
            r0.bindCategorySelector(r1, r2, r3, r4, r5, r6)
            r0.styleEditText(r15)
            r18.getClass()
            r1 = r18
            r0.stylePrimaryButton(r1)
            r0.styleClickableTextView(r7)
            hi r2 = new hi
            r3 = 1
            r2.<init>(r3, r0)
            r7.setOnClickListener(r2)
            rj r2 = new rj
            r2.<init>(r15, r0)
            r1.setOnClickListener(r2)
            return
    }

    private static final p000.s62 setupView$lambda$4(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, java.lang.String r1) {
            r1.getClass()
            r0.selectedCategory = r1
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final void setupView$lambda$5(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.view.View r1) {
            android.app.Dialog r0 = r0.dialog
            r0.dismiss()
            return
    }

    private static final void setupView$lambda$7(android.widget.EditText r29, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r30, android.view.View r31) {
            r0 = r30
            android.text.Editable r1 = r29.getText()
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            java.lang.String r1 = ""
        L12:
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r13 = r1.toString()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2 = r0.record
            java.lang.String r1 = r0.selectedCategory
            boolean r3 = p000.q02.m4671(r1)
            if (r3 == 0) goto L26
            java.lang.String r1 = "默认"
        L26:
            r12 = r1
            r27 = 2096767(0x1ffe7f, float:2.938196E-39)
            r28 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.copy$default(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            a80 r2 = r0.onConfirm
            r2.invoke(r1)
            android.app.Dialog r0 = r0.dialog
            r0.dismiss()
            return
    }

    private final void showKeyboard(android.view.View r4) {
            r3 = this;
            w1 r0 = new w1
            r1 = 8
            r0.<init>(r4, r1, r3)
            r1 = 80
            r4.postDelayed(r0, r1)
            return
    }

    private static final void showKeyboard$lambda$15(android.view.View r1, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r2) {
            r1.requestFocus()
            android.app.Dialog r2 = r2.dialog
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L10
            r0 = 21
            r2.setSoftInputMode(r0)
        L10:
            android.content.Context r2 = r1.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r0)
            boolean r0 = r2 instanceof android.view.inputmethod.InputMethodManager
            if (r0 == 0) goto L21
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L28
            r0 = 1
            r2.showSoftInput(r1, r0)
        L28:
            return
    }

    private final void styleClickableTextView(android.widget.TextView r2) {
            r1 = this;
            xx r0 = r1.colors
            java.lang.String r0 = r0.f12356
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            r0 = 1
            r2.setClickable(r0)
            r2.setFocusable(r0)
            xx r1 = r1.colors
            java.lang.String r1 = r1.f12348
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3034(r1)
            r2.setBackground(r1)
            return
    }

    private final void styleEditText(android.widget.EditText r4) {
            r3 = this;
            xx r0 = r3.colors
            java.lang.String r0 = r0.f12355
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            xx r0 = r3.colors
            java.lang.String r0 = r0.f12357
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setHintTextColor(r0)
            android.content.Context r0 = r3.context
            xx r1 = r3.colors
            java.lang.String r1 = r1.f12371
            r2 = 10
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r2, r0, r1)
            r4.setBackground(r0)
            r0 = 0
            r4.setIncludeFontPadding(r0)
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r4.setGravity(r0)
            r0 = 1
            r4.setFocusable(r0)
            r4.setFocusableInTouchMode(r0)
            r4.setCursorVisible(r0)
            rj r0 = new rj
            r0.<init>(r3, r4)
            r4.setOnClickListener(r0)
            sj r0 = new sj
            r1 = 0
            r0.<init>(r3, r4, r1)
            r4.setOnTouchListener(r0)
            tj r0 = new tj
            r0.<init>(r1, r3)
            r4.setOnFocusChangeListener(r0)
            return
    }

    private static final void styleEditText$lambda$12(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.widget.EditText r1, android.view.View r2) {
            r0.showKeyboard(r1)
            return
    }

    private static final boolean styleEditText$lambda$13(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.widget.EditText r1, android.view.View r2, android.view.MotionEvent r3) {
            int r2 = r3.getAction()
            r3 = 1
            if (r2 != r3) goto La
            r0.showKeyboard(r1)
        La:
            r0 = 0
            return r0
    }

    private static final void styleEditText$lambda$14(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.view.View r1, boolean r2) {
            if (r2 == 0) goto L8
            r1.getClass()
            r0.showKeyboard(r1)
        L8:
            return
    }

    private final void stylePrimaryButton(android.widget.Button r4) {
            r3 = this;
            r0 = 0
            r4.setAllCaps(r0)
            r4.setIncludeFontPadding(r0)
            r1 = 17
            r4.setGravity(r1)
            r4.setMinWidth(r0)
            r4.setMinHeight(r0)
            r4.setMinimumWidth(r0)
            r4.setMinimumHeight(r0)
            r0 = -1
            r4.setTextColor(r0)
            android.content.Context r0 = r4.getContext()
            r0.getClass()
            xx r3 = r3.colors
            java.lang.String r1 = r3.f12348
            java.lang.String r3 = r3.f12358
            r2 = 10
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r2, r0, r1, r3)
            r4.setBackground(r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1399(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.view.View r1, boolean r2) {
            styleEditText$lambda$14(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m1400(android.view.View r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1) {
            setupView$lambda$5(r1, r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ void m1401(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.content.DialogInterface r1) {
            _init_$lambda$0(r0, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1402(android.view.View r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1) {
            showKeyboard$lambda$15(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ boolean m1403(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, android.widget.EditText r1, android.view.View r2, android.view.MotionEvent r3) {
            boolean r0 = styleEditText$lambda$13(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ void m1404(android.widget.EditText r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1, android.view.View r2) {
            setupView$lambda$7(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public static /* synthetic */ void m1405(android.widget.Spinner r0, android.view.View r1) {
            bindCategorySelector$lambda$10(r0, r1)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static /* synthetic */ p000.s62 m1406(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0, java.lang.String r1) {
            s62 r0 = setupView$lambda$4(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static /* synthetic */ void m1407(android.widget.EditText r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1, android.view.View r2) {
            styleEditText$lambda$12(r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static /* synthetic */ void m1408(android.widget.Spinner r0) {
            bindCategorySelector$lambda$10$lambda$9(r0)
            return
    }

    public final void show() {
            r1 = this;
            android.app.Dialog r0 = r1.dialog
            r0.show()
            r1.applyWindowStyle()
            return
    }
}
