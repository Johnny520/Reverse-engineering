.class public final Lf0/V;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf0/V;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static c:I

.field public static d:I

.field public static e:I

.field public static f:I

.field public static g:I

.field public static h:I

.field public static i:I

.field public static j:I

.field public static k:I

.field public static l:I

.field public static m:I

.field public static n:Z

.field public static o:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/V;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/V;->a:Lf0/V;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lf0/V;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->a:I

    sput v0, Lf0/V;->c:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->b:I

    sput v0, Lf0/V;->d:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->c:I

    sput v0, Lf0/V;->e:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->d:I

    sput v0, Lf0/V;->f:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->e:I

    sput v0, Lf0/V;->g:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->f:I

    sput v0, Lf0/V;->h:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->g:I

    sput v0, Lf0/V;->i:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->h:I

    sput v0, Lf0/V;->j:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->i:I

    sput v0, Lf0/V;->k:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->j:I

    sput v0, Lf0/V;->l:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    iget v0, v0, Lf0/J;->l:I

    sput v0, Lf0/V;->m:I

    invoke-static {}, Lf0/V;->l()Lf0/J;

    invoke-static {}, Lf0/V;->l()Lf0/J;

    return-void
.end method

.method public static A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;
    .locals 1

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p0, 0x2

    invoke-virtual {v0, p0, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p0, 0x0

    if-eqz p4, :cond_0

    const-string p1, "sans-serif-medium"

    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    return-object v0
.end method

.method public static final a(Lf0/V;Landroid/net/Uri;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_0
    instance-of p1, p0, LD0/f;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move-object p0, v2

    :cond_0
    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_1

    goto :goto_3

    :cond_1
    const/16 p1, 0x3a

    const/4 v2, 0x6

    invoke-static {p0, p1, v0, v0, v2}, LW0/j;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result p1

    if-ltz p1, :cond_4

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "primary"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-array p0, v1, [C

    const/16 v2, 0x2f

    aput-char v2, p0, v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {p0, v3}, LE0/j;->i0([CC)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_2

    :cond_2
    add-int/2addr v0, v1

    goto :goto_1

    :cond_3
    const-string p0, ""

    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "/storage/emulated/0/"

    invoke-static {p1, p0}, LS/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, p0

    :goto_3
    return-object v2
.end method

.method public static b(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/EditText;Ljava/util/List;ILP0/a;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move/from16 v9, p4

    sget v3, Lf0/V;->h:I

    const-string v4, "\u70b9\u51fb\u5360\u4f4d\u7b26\u81ea\u52a8\u6dfb\u52a0\u4ee5\u4e0b\u5b57\u6bb5\uff1a"

    const/high16 v5, 0x41400000    # 12.0f

    const/4 v10, 0x0

    invoke-static {v0, v4, v5, v3, v10}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v3

    const/4 v11, 0x4

    invoke-static {v0, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/16 v5, 0xc

    invoke-static {v0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v0, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    const/16 v12, 0x8

    invoke-static {v0, v12}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-lez v9, :cond_a

    if-lez v9, :cond_a

    instance-of v3, v2, Ljava/util/RandomAccess;

    const/4 v13, 0x1

    if-eqz v3, :cond_3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v3

    div-int v4, v3, v9

    rem-int v5, v3, v9

    if-nez v5, :cond_0

    move v5, v10

    goto :goto_0

    :cond_0
    move v5, v13

    :goto_0
    add-int/2addr v4, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v10

    :goto_1
    if-ltz v4, :cond_6

    if-ge v4, v3, :cond_6

    sub-int v6, v3, v4

    if-le v9, v6, :cond_1

    goto :goto_2

    :cond_1
    move v6, v9

    :goto_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v10

    :goto_3
    if-ge v8, v6, :cond_2

    add-int v14, v8, v4

    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v9

    goto :goto_1

    :cond_3
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const-string v2, "iterator"

    invoke-static {v5, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, LE0/t;->a:LE0/t;

    goto :goto_4

    :cond_4
    new-instance v15, LE0/C;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v15

    move/from16 v3, p4

    move/from16 v4, p4

    invoke-direct/range {v2 .. v8}, LE0/C;-><init>(IILjava/util/Iterator;ZZLH0/a;)V

    invoke-static {v15}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    move-object v5, v14

    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v5, 0x6

    invoke-static {v0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v10, v10, v10, v6}, Landroid/view/View;->setPadding(IIII)V

    move v6, v10

    :goto_6
    if-ge v6, v9, :cond_8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    const/4 v14, -0x2

    if-ge v6, v7, :cond_7

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    new-instance v15, Landroid/widget/TextView;

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41480000    # 12.5f

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextSize(F)V

    sget v8, Lf0/V;->g:I

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v8, 0x11

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v15}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v8

    or-int/2addr v8, v12

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setPaintFlags(I)V

    invoke-static {v0, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-static {v0, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-static {v0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v15, v8, v12, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v10, 0xd2f8a4e

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    int-to-float v10, v5

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v10, v11

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v15, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setFocusable(Z)V

    new-instance v8, Lf0/m;

    const/4 v10, 0x1

    move-object/from16 v11, p2

    move-object/from16 v12, p5

    invoke-direct {v8, v11, v7, v12, v10}, Lf0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v10, 0x3

    invoke-static {v0, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v7, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-static {v0, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v4, v15, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    :cond_7
    move-object/from16 v11, p2

    move-object/from16 v12, p5

    move v8, v10

    const/4 v7, 0x3

    const/high16 v10, 0x3f800000    # 1.0f

    new-instance v15, Landroid/view/View;

    invoke-direct {v15, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v8, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v0, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v5, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-static {v0, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v4, v15, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_7
    add-int/lit8 v6, v6, 0x1

    move v10, v8

    const/4 v5, 0x6

    const/4 v11, 0x4

    const/16 v12, 0x8

    goto/16 :goto_6

    :cond_8
    move-object/from16 v11, p2

    move-object/from16 v12, p5

    move v8, v10

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v11, 0x4

    const/16 v12, 0x8

    goto/16 :goto_5

    :cond_9
    return-void

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "size "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " must be greater than zero."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/View;II)V
    .locals 1

    invoke-static {p1, p2}, Lf0/V;->i(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance p2, Lf0/S;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lf0/S;-><init>(II)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationZ(F)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static d(Lf0/J;)V
    .locals 1

    iget v0, p0, Lf0/J;->a:I

    sput v0, Lf0/V;->c:I

    iget v0, p0, Lf0/J;->b:I

    sput v0, Lf0/V;->d:I

    iget v0, p0, Lf0/J;->c:I

    sput v0, Lf0/V;->e:I

    iget v0, p0, Lf0/J;->d:I

    sput v0, Lf0/V;->f:I

    iget v0, p0, Lf0/J;->e:I

    sput v0, Lf0/V;->g:I

    iget v0, p0, Lf0/J;->f:I

    sput v0, Lf0/V;->h:I

    iget v0, p0, Lf0/J;->g:I

    sput v0, Lf0/V;->i:I

    iget v0, p0, Lf0/J;->h:I

    sput v0, Lf0/V;->j:I

    iget v0, p0, Lf0/J;->i:I

    sput v0, Lf0/V;->k:I

    iget v0, p0, Lf0/J;->j:I

    sput v0, Lf0/V;->l:I

    iget v0, p0, Lf0/J;->l:I

    sput v0, Lf0/V;->m:I

    iget-boolean p0, p0, Lf0/J;->o:Z

    sput-boolean p0, Lf0/V;->n:Z

    return-void
.end method

.method public static e(F)Ljava/lang/String;
    .locals 3

    sget-object v0, Lc0/v1;->b:Lc0/x1;

    const v0, 0x3d4ccccd    # 0.05f

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v0, v1}, LA0/p;->o(FFF)F

    move-result p0

    const v0, 0x3da3d70a    # 0.08f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const-string v0, "\u6b63\u65b9"

    goto :goto_0

    :cond_0
    const v0, 0x3efae148    # 0.49f

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_1

    const-string v0, "\u5706\u5f62"

    goto :goto_0

    :cond_1
    const v0, 0x3eae147b    # 0.34f

    cmpg-float v0, v0, p0

    if-gtz v0, :cond_2

    const v0, 0x3ec28f5c    # 0.38f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_2

    const-string v0, "\u65b9\u5706"

    goto :goto_0

    :cond_2
    const-string v0, "\u81ea\u5b9a\u4e49"

    :goto_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v2, 0x1

    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v2, "%.2f"

    invoke-static {v1, v2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5706\u5ea6 "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " \u00b7 "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(I)Z
    .locals 8

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x406fe00000000000L    # 255.0

    div-double/2addr v0, v2

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-double v4, v4

    div-double/2addr v4, v2

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-double v6, p0

    div-double/2addr v6, v2

    const-wide v2, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double/2addr v4, v2

    add-double/2addr v4, v0

    const-wide v0, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double/2addr v6, v0

    add-double/2addr v6, v4

    const-wide v0, 0x3fd6666666666666L    # 0.35

    cmpg-double p0, v6, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(Landroid/content/Context;I)I
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;
    .locals 5

    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    invoke-static {p2, p3}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/4 v1, 0x2

    const/high16 v2, 0x41680000    # 14.5f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v1, Lf0/V;->g:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    sget v1, Lf0/V;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHintTextColor(I)V

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    sget v3, Lf0/V;->e:I

    invoke-static {v2, v3}, Lf0/V;->i(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xc

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {p0, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p0, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v3, v4, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    const/16 v1, 0x2c

    invoke-static {p0, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v2, Lf0/w;

    invoke-direct {v2, p2, v0, p3}, Lf0/w;-><init>(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 p3, 0x4

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v1, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    sget v1, Lf0/V;->h:I

    const/high16 v2, 0x41480000    # 12.5f

    invoke-static {p0, p1, v2, v1, v3}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, v3, v3, v3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p1, -0x1

    const/4 p3, -0x2

    invoke-direct {p0, p1, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p0, Lf0/I;

    invoke-direct {p0, p2, v0}, Lf0/I;-><init>(Landroid/widget/LinearLayout;Landroid/widget/EditText;)V

    return-object p0
.end method

.method public static i(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    int-to-float p0, p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    return-object v0
.end method

.method public static varargs j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V
    .locals 10

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v2, Lf0/V;->d:I

    const/16 v3, 0x10

    invoke-static {p1, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-static {v2, v4}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    array-length v2, p2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, -0x1

    if-ge v4, v2, :cond_1

    aget-object v7, p2, v4

    add-int/lit8 v8, v5, 0x1

    if-lez v5, :cond_0

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget v9, Lf0/V;->l:I

    invoke-virtual {v5, v9}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {p1, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-static {p1, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v4, v4, 0x1

    move v5, v8

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p2, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xc

    invoke-static {p1, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p1

    iput p1, p2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {p0, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static k(Landroid/content/Context;)Z
    .locals 5

    const-string v0, "ctx"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v4, 0x1010054

    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v0, Landroid/util/TypedValue;->type:I

    const/16 v4, 0x1c

    if-gt v4, v3, :cond_1

    if-ge v3, v1, :cond_1

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Lf0/V;->f(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    const v0, 0x1010031

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p0, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {v0}, Lf0/V;->f(I)Z

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v1, p0, LD0/f;

    if-eqz v1, :cond_2

    move-object p0, v0

    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static l()Lf0/J;
    .locals 18

    new-instance v16, Lf0/J;

    const-string v0, "#F2F4F2"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const-string v3, "#F7F8F7"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#1C1F1C"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "#2A2E2A"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v7, "#6B736C"

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "#8A928A"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "#2F8A4E"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "#E3F3E8"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "#0F000000"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "#A0A8A0"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "#7A847A"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move v14, v15

    move/from16 v15, v17

    invoke-direct/range {v0 .. v15}, Lf0/J;-><init>(IIIIIIIIIIIIIIZ)V

    return-object v16
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 6

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v3, 0x32

    invoke-static {p0, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v4, 0xa

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0, v3, v5, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    sget v2, Lf0/V;->g:I

    const/high16 v3, 0x41680000    # 14.5f

    invoke-static {p0, p1, v3, v2, v1}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object p1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v2, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/widget/TextView;

    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x2

    const/high16 v2, 0x41480000    # 12.5f

    invoke-virtual {p1, p2, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    sget p2, Lf0/V;->h:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    const p2, 0x800005

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    const/16 p2, 0x8

    invoke-static {p0, p2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p0, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    const p2, 0x3f99999a    # 1.2f

    invoke-direct {p0, v1, v3, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public static n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/a;)Landroid/widget/LinearLayout;
    .locals 5

    const/4 v0, 0x1

    const-string v1, "night_mode"

    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "night_mode_follow"

    invoke-static {v1, v0}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lc0/h1;->a:Lc0/h1;

    invoke-static {p3, p4}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p4

    :goto_0
    new-instance v1, Landroid/widget/Switch;

    invoke-direct {v1, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p5}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, p4}, Landroid/widget/Switch;->setChecked(Z)V

    new-instance p4, Lf0/o;

    invoke-direct {p4, p5, p3, p6}, Lf0/o;-><init>(ZLjava/lang/String;LP0/a;)V

    invoke-virtual {v1, p4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    new-instance p3, Landroid/widget/LinearLayout;

    invoke-direct {p3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p6, 0x10

    invoke-virtual {p3, p6}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v2, 0x38

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p3, v2}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-static {p0, p6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p6

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v4, 0xc

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p3, p6, v3, v4, v2}, Landroid/view/View;->setPadding(IIII)V

    const/high16 p6, 0x3f800000    # 1.0f

    if-eqz p5, :cond_1

    move v2, p6

    goto :goto_1

    :cond_1
    const v2, 0x3ee66666    # 0.45f

    :goto_1
    invoke-virtual {p3, v2}, Landroid/view/View;->setAlpha(F)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Lf0/V;->g:I

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {p0, p1, v4, v3, v0}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {p2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_2

    sget p1, Lf0/V;->h:I

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {p0, p2, v3, p1, p4}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p0, p2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, p4, v3, p4, p4}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    const p2, 0x3f666666    # 0.9f

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_2
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, p4, p2, p6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/16 p2, 0x8

    invoke-static {p0, p2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p3, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p5, :cond_3

    invoke-virtual {p3, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setFocusable(Z)V

    new-instance p0, Lf0/n;

    invoke-direct {p0, v1, v0}, Lf0/n;-><init>(Landroid/widget/Switch;I)V

    invoke-virtual {p3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    return-object p3
.end method

.method public static synthetic o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;
    .locals 7

    and-int/lit8 p7, p7, 0x40

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v6, p6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x1

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    invoke-static/range {v0 .. v6}, Lf0/V;->n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/a;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static p(Landroid/content/Context;)Lf0/J;
    .locals 18

    const-string v0, "night_mode_follow"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static/range {p0 .. p0}, Lf0/V;->k(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "night_mode"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Lf0/J;

    const-string v1, "#121412"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const-string v1, "#1C1F1C"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#242824"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const-string v5, "#E8ECE8"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const-string v6, "#D8DCD8"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const-string v8, "#9AA29A"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v9, "#7A827A"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v10, "#7FBF90"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const-string v11, "#243028"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const-string v12, "#14FFFFFF"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    const-string v13, "#6A726A"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    const-string v14, "#8A928A"

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    const/16 v17, 0x1

    move-object v1, v0

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move v14, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-direct/range {v1 .. v16}, Lf0/J;-><init>(IIIIIIIIIIIIIIZ)V

    goto :goto_1

    :cond_1
    invoke-static {}, Lf0/V;->l()Lf0/J;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public static q(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    sget p1, Lf0/V;->h:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    const/16 p1, 0xa

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {v0, v1, v3, p1, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    new-instance p0, Ld0/f;

    const/4 p1, 0x5

    invoke-direct {p0, p2, p1}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;
    .locals 3

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    const/4 p1, -0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const-string p1, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget p1, Lf0/V;->j:I

    const/16 v2, 0xe

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p1, v2}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    const/16 p1, 0xa

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {v0, v1, v2, v1, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance p0, Ld0/f;

    const/4 p1, 0x6

    invoke-direct {p0, p2, p1}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static final s(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    sget-object p1, Lc0/h1;->a:Lc0/h1;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static t(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    int-to-float p0, p1

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    return-object v0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;
    .locals 3

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    sget p1, Lf0/V;->j:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const-string p1, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget p1, Lf0/V;->k:I

    const/16 v2, 0xe

    invoke-static {p0, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p1, v2}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    const/16 p1, 0x8

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p0, p1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {v0, v1, v2, v1, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance p0, Ld0/f;

    const/4 p1, 0x4

    invoke-direct {p0, p2, p1}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x2

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, p2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    sget p2, Lf0/V;->i:I

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string p2, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {p2, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {p1, p2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p2

    const/4 v3, 0x6

    invoke-static {p1, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, v1, v2, p2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static final x(Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Lf0/V;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 1

    sget v0, Lf0/V;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    sget p0, Lf0/V;->c:I

    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p0, 0x1a

    invoke-static {p4, p0}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    sget p1, Lf0/V;->d:I

    invoke-static {p3, p0, p1}, Lf0/V;->c(Landroid/view/View;II)V

    invoke-virtual {p5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    sget p2, Lf0/V;->c:I

    invoke-direct {p1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, p1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    sget p1, Lf0/V;->c:I

    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    sget p1, Lf0/V;->c:I

    invoke-virtual {p0, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    sget-boolean p1, Lf0/V;->n:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x2000

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_1
    return-void
.end method

.method public static y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V
    .locals 9

    new-instance v0, Landroid/app/Dialog;

    const v1, 0x1030135

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Lf0/V;->d:I

    const/16 v4, 0x12

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v3, v5}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v5, 0x10

    invoke-static {p0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v6, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v5, Lf0/V;->f:I

    const/high16 v6, 0x41880000    # 17.0f

    invoke-static {p0, p1, v6, v5, v1}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object p1

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v4, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/widget/TextView;

    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "\u2715"

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x2

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {p1, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v4, Lf0/V;->h:I

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v4, 0x8

    invoke-static {p0, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/4 v5, 0x4

    invoke-static {p0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {p0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {p0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p1, v4, v7, v8, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    new-instance v4, LA0/a;

    const/4 v5, 0x5

    invoke-direct {v4, v5, v0}, LA0/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {p1, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0xc

    invoke-static {p0, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    iput v5, p1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/widget/ScrollView;

    invoke-direct {p1, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOverScrollMode(I)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-interface {p3, v3}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x154

    invoke-static {p0, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {p3, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/widget/FrameLayout;

    invoke-direct {p1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 p3, 0x14

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-static {p0, p3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, v1, v3, v4, p0}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    const p1, 0x106000d

    invoke-virtual {p0, p1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    :cond_0
    new-instance p0, Lf0/q;

    invoke-direct {p0, p2}, Lf0/q;-><init>(LP0/a;)V

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public static z(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public final w(Landroid/app/Activity;Lf0/P;)V
    .locals 21

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    move-object/from16 v1, p2

    const/16 v2, 0x8

    const/4 v15, 0x0

    const-string v3, "android"

    const-string v4, "dimen"

    const-string v0, "host"

    invoke-static {v14, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v12, 0x1

    :try_start_0
    sget-object v0, Lf0/V;->o:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v13

    goto/16 :goto_7

    :cond_1
    :goto_0
    const/16 v16, 0x0

    sput-object v16, Lf0/V;->o:Landroid/app/Dialog;

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    invoke-static {}, Lc0/h1;->a()V

    invoke-static/range {p1 .. p1}, Lf0/V;->p(Landroid/content/Context;)Lf0/J;

    move-result-object v0

    invoke-static {v0}, Lf0/V;->d(Lf0/J;)V

    new-instance v11, Landroid/app/Dialog;

    const v0, 0x103012c

    invoke-direct {v11, v14, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v11, v15}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v11, v15}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    sget-object v0, Lf0/V;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v15, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    :try_start_1
    const-class v0, Landroid/app/Activity;

    const-string v5, "onActivityResult"

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v7, Landroid/content/Intent;

    new-instance v8, Lc0/m;

    invoke-direct {v8, v2, v13}, Lc0/m;-><init>(ILjava/lang/Object;)V

    filled-new-array {v6, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v5, v6}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v5, v0

    :try_start_3
    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_2
    :goto_1
    new-instance v5, LQ0/m;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf0/N;->b:Lf0/N;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lf0/M;->b:Lf0/M;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    instance-of v0, v1, Lf0/L;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    sget-object v0, Lf0/K;->b:Lf0/K;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lf0/Q;->d:Lf0/Q;

    goto :goto_3

    :cond_4
    sget-object v0, Lf0/O;->b:Lf0/O;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lf0/Q;->e:Lf0/Q;

    goto :goto_3

    :cond_5
    new-instance v0, LD0/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_6
    :goto_2
    sget-object v0, Lf0/Q;->c:Lf0/Q;

    :goto_3
    iput-object v0, v5, LQ0/m;->a:Ljava/lang/Object;

    new-instance v6, LQ0/m;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    instance-of v0, v1, Lf0/L;

    if-eqz v0, :cond_7

    move-object v0, v1

    check-cast v0, Lf0/L;

    iget-object v0, v0, Lf0/L;->b:Ljava/lang/String;

    iput-object v0, v6, LQ0/m;->a:Ljava/lang/Object;

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    invoke-virtual {v0, v1, v4, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_8

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_4

    :cond_8
    const/16 v0, 0x18

    invoke-static {v14, v0}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v7, "navigation_bar_height"

    invoke-virtual {v1, v7, v4, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_5

    :cond_9
    move v1, v15

    :goto_5
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Lf0/V;->c:I

    invoke-virtual {v10, v3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-static {v14, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v10, v15, v0, v15, v1}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, v14}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v12}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    invoke-virtual {v0, v12}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-static {v14, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v7, 0xc

    invoke-static {v14, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v14, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    const/16 v9, 0x14

    invoke-static {v14, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v4, v3, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    const/4 v8, -0x1

    invoke-direct {v3, v8, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/widget/FrameLayout;

    invoke-direct {v7, v14}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v3, Lf0/V;->c:I

    invoke-virtual {v7, v3}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 v3, 0x6

    invoke-static {v14, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v14, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v7, v15, v8, v15, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v8, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v14, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v14, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v8, v1, v15, v2, v15}, Landroid/view/View;->setPadding(IIII)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x118

    invoke-static {v14, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    const/16 v3, 0x34

    invoke-static {v14, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v1, v2, v3, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v7, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, LQ0/m;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lf0/y;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v2

    move-object v15, v2

    move-object/from16 v2, p0

    move-object/from16 v17, v3

    move-object/from16 v3, p1

    move-object/from16 v18, v7

    move-object/from16 v7, v17

    move-object/from16 v19, v8

    const/4 v13, -0x1

    move-object v9, v0

    move-object/from16 p2, v10

    move-object/from16 v20, v11

    move-object/from16 v11, v18

    move-object/from16 v12, v20

    :try_start_4
    invoke-direct/range {v1 .. v12}, Lf0/y;-><init>(Lf0/V;Landroid/app/Activity;Landroid/widget/LinearLayout;LQ0/m;LQ0/m;LQ0/m;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Landroid/app/Dialog;)V

    iput-object v15, v7, LQ0/m;->a:Ljava/lang/Object;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v1, v13, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v2, p2

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v13, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v3, v18

    invoke-virtual {v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v13, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v8, v20

    invoke-virtual {v8, v2, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0, v13, v13}, Landroid/view/Window;->setLayout(II)V

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object/from16 v2, p0

    goto :goto_7

    :cond_a
    :goto_6
    move-object v1, v2

    move-object v2, v3

    move-object/from16 v3, p0

    move-object/from16 v4, v19

    move-object/from16 v5, p1

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lf0/V;->x(Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Lf0/V;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/app/Dialog;)V

    new-instance v0, Lf0/z;

    invoke-direct {v0, v8}, Lf0/z;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v8, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    new-instance v0, LQ0/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_b

    new-instance v1, Lf0/A;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v8}, Lf0/A;-><init>(ILjava/lang/Object;)V

    iput-object v1, v0, LQ0/m;->a:Ljava/lang/Object;

    invoke-static {v8}, LE/d;->e(Landroid/app/Dialog;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v1

    iget-object v2, v0, LQ0/m;->a:Ljava/lang/Object;

    invoke-static {v2}, LE/d;->d(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    move-result-object v2

    invoke-static {v1, v2}, LE/d;->f(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    :cond_b
    new-instance v1, Lf0/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object/from16 v2, p0

    :try_start_5
    invoke-direct {v1, v0, v2, v8, v14}, Lf0/B;-><init>(LQ0/m;Lf0/V;Landroid/app/Dialog;Landroid/app/Activity;)V

    invoke-virtual {v8, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    sput-object v8, Lf0/V;->o:Landroid/app/Dialog;

    iget-object v0, v7, LQ0/m;->a:Ljava/lang/Object;

    if-eqz v0, :cond_c

    check-cast v0, LP0/a;

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    invoke-virtual {v8}, Landroid/app/Dialog;->show()V

    sget-object v0, LD0/l;->a:LD0/l;

    goto :goto_8

    :catchall_4
    move-exception v0

    goto :goto_7

    :cond_c
    const-string v0, "render"

    invoke-static {v0}, LQ0/g;->g(Ljava/lang/String;)V

    throw v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :goto_7
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_8
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OKK \u6253\u5f00\u5931\u8d25: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v14, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_d
    return-void
.end method
