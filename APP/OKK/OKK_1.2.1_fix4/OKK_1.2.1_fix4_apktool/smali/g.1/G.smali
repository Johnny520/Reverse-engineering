.class public final Lg/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lg/C0;

.field public c:Lg/C0;

.field public d:Lg/C0;

.field public e:Lg/C0;

.field public f:Lg/C0;

.field public g:Lg/C0;

.field public h:Lg/C0;

.field public final i:Lg/P;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg/G;->j:I

    const/4 v0, -0x1

    iput v0, p0, Lg/G;->k:I

    iput-object p1, p0, Lg/G;->a:Landroid/widget/TextView;

    new-instance v0, Lg/P;

    invoke-direct {v0, p1}, Lg/P;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lg/G;->i:Lg/P;

    return-void
.end method

.method public static c(Landroid/content/Context;Lg/s;I)Lg/C0;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lg/s;->a:Lg/v0;

    invoke-virtual {v0, p0, p2}, Lg/v0;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz p0, :cond_0

    new-instance p1, Lg/C0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Lg/C0;->d:Z

    iput-object p0, p1, Lg/C0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public static f(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 11

    const/16 v0, 0x800

    const/4 v1, 0x0

    const/4 v2, 0x1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_d

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-lt v3, v4, :cond_0

    invoke-static {p2, p0}, LI/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v3, v4, :cond_1

    invoke-static {p2, p0}, LI/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_1
    iget p1, p2, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v3, p2, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    if-le p1, v3, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    move v4, p1

    :goto_0
    if-le p1, v3, :cond_3

    goto :goto_1

    :cond_3
    move p1, v3

    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v5, 0x0

    if-ltz v4, :cond_c

    if-le p1, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    iget v6, p2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit16 v6, v6, 0xfff

    const/16 v7, 0x81

    if-eq v6, v7, :cond_b

    const/16 v7, 0xe1

    if-eq v6, v7, :cond_b

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    goto/16 :goto_4

    :cond_5
    if-gt v3, v0, :cond_6

    invoke-static {p2, p0, v4, p1}, LA0/p;->X(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto/16 :goto_6

    :cond_6
    sub-int v3, p1, v4

    const/16 v5, 0x400

    if-le v3, v5, :cond_7

    move v5, v1

    goto :goto_2

    :cond_7
    move v5, v3

    :goto_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    sub-int/2addr v6, p1

    sub-int/2addr v0, v5

    const-wide v7, 0x3fe999999999999aL    # 0.8

    int-to-double v9, v0

    mul-double/2addr v9, v7

    double-to-int v7, v9

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int v7, v0, v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v0, v6

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v4, v0

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_8

    add-int/2addr v4, v2

    sub-int/2addr v0, v2

    :cond_8
    add-int v7, p1, v6

    sub-int/2addr v7, v2

    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_9

    sub-int/2addr v6, v2

    :cond_9
    add-int v7, v0, v5

    add-int v8, v7, v6

    if-eq v5, v3, :cond_a

    add-int v3, v4, v0

    invoke-interface {p0, v4, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    add-int/2addr v6, p1

    invoke-interface {p0, p1, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/CharSequence;

    aput-object v3, p1, v1

    aput-object p0, p1, v2

    invoke-static {p1}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_3

    :cond_a
    add-int/2addr v8, v4

    invoke-interface {p0, v4, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :goto_3
    invoke-static {p2, p0, v0, v7}, LA0/p;->X(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_b
    :goto_4
    invoke-static {p2, v5, v1, v1}, LA0/p;->X(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_c
    :goto_5
    invoke-static {p2, v5, v1, v1}, LA0/p;->X(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    :cond_d
    :goto_6
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Lg/C0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lg/G;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Lg/s;->c(Landroid/graphics/drawable/Drawable;Lg/C0;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lg/G;->b:Lg/C0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Lg/G;->a:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg/G;->c:Lg/C0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg/G;->d:Lg/C0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg/G;->e:Lg/C0;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v4, v0, v2

    iget-object v5, p0, Lg/G;->b:Lg/C0;

    invoke-virtual {p0, v4, v5}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    const/4 v4, 0x1

    aget-object v4, v0, v4

    iget-object v5, p0, Lg/G;->c:Lg/C0;

    invoke-virtual {p0, v4, v5}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    aget-object v4, v0, v1

    iget-object v5, p0, Lg/G;->d:Lg/C0;

    invoke-virtual {p0, v4, v5}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    const/4 v4, 0x3

    aget-object v0, v0, v4

    iget-object v4, p0, Lg/G;->e:Lg/C0;

    invoke-virtual {p0, v0, v4}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    :cond_1
    iget-object v0, p0, Lg/G;->f:Lg/C0;

    if-nez v0, :cond_2

    iget-object v0, p0, Lg/G;->g:Lg/C0;

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Lg/G;->f:Lg/C0;

    invoke-virtual {p0, v2, v3}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Lg/G;->g:Lg/C0;

    invoke-virtual {p0, v0, v1}, Lg/G;->a(Landroid/graphics/drawable/Drawable;Lg/C0;)V

    :cond_3
    return-void
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v8, p2

    const/16 v9, 0xf

    const/4 v10, 0x1

    iget-object v11, v1, Lg/G;->a:Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    sget-object v2, Lg/s;->b:Landroid/graphics/PorterDuff$Mode;

    const-class v2, Lg/s;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lg/s;->c:Lg/s;

    if-nez v3, :cond_0

    invoke-static {}, Lg/s;->b()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2c

    :cond_0
    :goto_0
    sget-object v13, Lg/s;->c:Lg/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    sget-object v4, Lb/a;->f:[I

    const/4 v14, 0x0

    invoke-static {v12, v0, v4, v8, v14}, LJ0/d;->s(Landroid/content/Context;Landroid/util/AttributeSet;[III)LJ0/d;

    move-result-object v15

    iget-object v2, v1, Lg/G;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v15, LJ0/d;->c:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/content/res/TypedArray;

    move-object/from16 v5, p1

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, LD/Q;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    iget-object v2, v15, LJ0/d;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/res/TypedArray;

    const/4 v7, -0x1

    invoke-virtual {v2, v14, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 v6, 0x3

    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v12, v13, v4}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v4

    iput-object v4, v1, Lg/G;->b:Lg/C0;

    :cond_1
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v10, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v12, v13, v4}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v4

    iput-object v4, v1, Lg/G;->c:Lg/C0;

    :cond_2
    const/4 v5, 0x4

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v12, v13, v4}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v4

    iput-object v4, v1, Lg/G;->d:Lg/C0;

    :cond_3
    const/4 v4, 0x2

    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    invoke-static {v12, v13, v5}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v5

    iput-object v5, v1, Lg/G;->e:Lg/C0;

    :cond_4
    const/4 v5, 0x5

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual {v2, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v12, v13, v4}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v4

    iput-object v4, v1, Lg/G;->f:Lg/C0;

    :cond_5
    const/4 v4, 0x6

    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v18

    if-eqz v18, :cond_6

    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {v12, v13, v2}, Lg/G;->c(Landroid/content/Context;Lg/s;I)Lg/C0;

    move-result-object v2

    iput-object v2, v1, Lg/G;->g:Lg/C0;

    :cond_6
    invoke-virtual {v15}, LJ0/d;->u()V

    invoke-virtual {v11}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    sget-object v15, Lb/a;->s:[I

    const/16 v4, 0xe

    if-eq v3, v7, :cond_a

    new-instance v5, LJ0/d;

    invoke-virtual {v12, v3, v15}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-direct {v5, v12, v3}, LJ0/d;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v2, :cond_7

    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v22

    if-eqz v22, :cond_7

    invoke-virtual {v3, v4, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v22

    move/from16 v23, v22

    const/16 v22, 0x1

    goto :goto_1

    :cond_7
    move/from16 v22, v14

    move/from16 v23, v22

    :goto_1
    invoke-virtual {v1, v12, v5}, Lg/G;->l(Landroid/content/Context;LJ0/d;)V

    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v24

    if-eqz v24, :cond_8

    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v24

    const/16 v6, 0xd

    goto :goto_2

    :cond_8
    const/16 v6, 0xd

    const/16 v24, 0x0

    :goto_2
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v20, :cond_9

    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_9
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v5}, LJ0/d;->u()V

    goto :goto_4

    :cond_a
    move/from16 v22, v14

    move/from16 v23, v22

    const/4 v3, 0x0

    const/16 v24, 0x0

    :goto_4
    new-instance v5, LJ0/d;

    invoke-virtual {v12, v0, v15, v8, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    invoke-direct {v5, v12, v6}, LJ0/d;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v2, :cond_b

    invoke-virtual {v6, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-virtual {v6, v4, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v23

    move/from16 v4, v23

    const/16 v22, 0x1

    goto :goto_5

    :cond_b
    move/from16 v4, v23

    :goto_5
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v23

    if-eqz v23, :cond_c

    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v24

    :cond_c
    const/16 v9, 0xd

    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v20, :cond_d

    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    :cond_d
    const/16 v9, 0x1c

    if-lt v15, v9, :cond_e

    invoke-virtual {v6, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual {v6, v14, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    if-nez v6, :cond_e

    const/4 v6, 0x0

    invoke-virtual {v11, v14, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_e
    invoke-virtual {v1, v12, v5}, Lg/G;->l(Landroid/content/Context;LJ0/d;)V

    invoke-virtual {v5}, LJ0/d;->u()V

    if-nez v2, :cond_f

    if-eqz v22, :cond_f

    iget-object v2, v1, Lg/G;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_f
    iget-object v2, v1, Lg/G;->l:Landroid/graphics/Typeface;

    if-eqz v2, :cond_11

    iget v4, v1, Lg/G;->k:I

    if-ne v4, v7, :cond_10

    iget v4, v1, Lg/G;->j:I

    invoke-virtual {v11, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_6

    :cond_10
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_11
    :goto_6
    if-eqz v3, :cond_12

    invoke-static {v11, v3}, Lg/E;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_12
    if-eqz v24, :cond_13

    invoke-static/range {v24 .. v24}, Lg/D;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-static {v11, v2}, Lg/D;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_13
    sget-object v9, Lb/a;->g:[I

    iget-object v15, v1, Lg/G;->i:Lg/P;

    iget-object v6, v15, Lg/P;->j:Landroid/content/Context;

    invoke-virtual {v6, v0, v9, v8, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    iget-object v2, v15, Lg/P;->i:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v10, 0x2

    move-object v4, v9

    move-object/from16 v18, v5

    const/4 v10, 0x5

    move-object/from16 v5, p1

    move-object/from16 v21, v6

    move-object/from16 v6, v18

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, LD/Q;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object/from16 v2, v18

    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v2, v10, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v15, Lg/P;->a:I

    :cond_14
    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    const/high16 v5, -0x40800000    # -1.0f

    if-eqz v4, :cond_15

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    :goto_7
    const/4 v4, 0x2

    goto :goto_8

    :cond_15
    move v3, v5

    goto :goto_7

    :goto_8
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    :goto_9
    const/4 v4, 0x1

    goto :goto_a

    :cond_16
    move v6, v5

    goto :goto_9

    :goto_a
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    :goto_b
    const/4 v4, 0x3

    goto :goto_c

    :cond_17
    move v7, v5

    goto :goto_b

    :goto_c
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-lez v8, :cond_1a

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v8}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->length()I

    move-result v10

    new-array v4, v10, [I

    if-lez v10, :cond_19

    :goto_d
    if-ge v14, v10, :cond_18

    const/4 v5, -0x1

    invoke-virtual {v8, v14, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v24

    aput v24, v4, v14

    const/16 v19, 0x1

    add-int/lit8 v14, v14, 0x1

    const/high16 v5, -0x40800000    # -1.0f

    goto :goto_d

    :cond_18
    const/4 v5, -0x1

    invoke-static {v4}, Lg/P;->b([I)[I

    move-result-object v4

    iput-object v4, v15, Lg/P;->f:[I

    invoke-virtual {v15}, Lg/P;->i()Z

    goto :goto_e

    :cond_19
    const/4 v5, -0x1

    :goto_e
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_f

    :cond_1a
    const/4 v5, -0x1

    :goto_f
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v15}, Lg/P;->j()Z

    move-result v2

    if-eqz v2, :cond_1f

    iget v2, v15, Lg/P;->a:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_20

    iget-boolean v2, v15, Lg/P;->g:Z

    if-nez v2, :cond_1e

    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v8, v6, v4

    if-nez v8, :cond_1b

    const/high16 v6, 0x41400000    # 12.0f

    const/4 v8, 0x2

    invoke-static {v8, v6, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    goto :goto_10

    :cond_1b
    const/4 v8, 0x2

    :goto_10
    cmpl-float v10, v7, v4

    if-nez v10, :cond_1c

    const/high16 v7, 0x42e00000    # 112.0f

    invoke-static {v8, v7, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v7

    :cond_1c
    cmpl-float v2, v3, v4

    if-nez v2, :cond_1d

    const/high16 v3, 0x3f800000    # 1.0f

    :cond_1d
    invoke-virtual {v15, v6, v7, v3}, Lg/P;->k(FFF)V

    :cond_1e
    invoke-virtual {v15}, Lg/P;->h()Z

    goto :goto_11

    :cond_1f
    const/4 v2, 0x0

    iput v2, v15, Lg/P;->a:I

    :cond_20
    :goto_11
    sget-boolean v2, Lg/Q0;->a:Z

    if-eqz v2, :cond_22

    iget v2, v15, Lg/P;->a:I

    if-eqz v2, :cond_22

    iget-object v2, v15, Lg/P;->f:[I

    array-length v3, v2

    if-lez v3, :cond_22

    invoke-static {v11}, Lg/E;->a(Landroid/widget/TextView;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_21

    iget v2, v15, Lg/P;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v15, Lg/P;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v15, Lg/P;->c:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v6, 0x0

    invoke-static {v11, v2, v3, v4, v6}, Lg/E;->b(Landroid/widget/TextView;IIII)V

    goto :goto_12

    :cond_21
    const/4 v6, 0x0

    invoke-static {v11, v2, v6}, Lg/E;->c(Landroid/widget/TextView;[II)V

    :cond_22
    :goto_12
    invoke-virtual {v12, v0, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v5, :cond_23

    invoke-virtual {v13, v12, v2}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_13
    const/16 v3, 0xd

    goto :goto_14

    :cond_23
    const/4 v2, 0x0

    goto :goto_13

    :goto_14
    invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eq v3, v5, :cond_24

    invoke-virtual {v13, v12, v3}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_15

    :cond_24
    const/4 v3, 0x0

    :goto_15
    const/16 v4, 0x9

    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eq v4, v5, :cond_25

    invoke-virtual {v13, v12, v4}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :goto_16
    const/4 v6, 0x6

    goto :goto_17

    :cond_25
    const/4 v4, 0x0

    goto :goto_16

    :goto_17
    invoke-virtual {v0, v6, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-eq v6, v5, :cond_26

    invoke-virtual {v13, v12, v6}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    goto :goto_18

    :cond_26
    const/4 v6, 0x0

    :goto_18
    const/16 v7, 0xa

    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    if-eq v7, v5, :cond_27

    invoke-virtual {v13, v12, v7}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_19

    :cond_27
    const/4 v7, 0x0

    :goto_19
    const/4 v8, 0x7

    invoke-virtual {v0, v8, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-eq v8, v5, :cond_28

    invoke-virtual {v13, v12, v8}, Lg/s;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_1a

    :cond_28
    const/4 v8, 0x0

    :goto_1a
    if-nez v7, :cond_33

    if-eqz v8, :cond_29

    goto :goto_23

    :cond_29
    if-nez v2, :cond_2a

    if-nez v3, :cond_2a

    if-nez v4, :cond_2a

    if-eqz v6, :cond_38

    :cond_2a
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v7

    const/4 v8, 0x0

    aget-object v9, v7, v8

    if-nez v9, :cond_2b

    const/4 v10, 0x2

    aget-object v13, v7, v10

    if-eqz v13, :cond_2c

    :cond_2b
    const/4 v8, 0x3

    goto :goto_1f

    :cond_2c
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v2, :cond_2d

    goto :goto_1b

    :cond_2d
    aget-object v2, v7, v8

    :goto_1b
    if-eqz v3, :cond_2e

    goto :goto_1c

    :cond_2e
    const/4 v3, 0x1

    aget-object v3, v7, v3

    :goto_1c
    if-eqz v4, :cond_2f

    goto :goto_1d

    :cond_2f
    const/4 v4, 0x2

    aget-object v4, v7, v4

    :goto_1d
    if-eqz v6, :cond_30

    goto :goto_1e

    :cond_30
    const/4 v8, 0x3

    aget-object v6, v7, v8

    :goto_1e
    invoke-virtual {v11, v2, v3, v4, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_28

    :goto_1f
    if-eqz v3, :cond_31

    goto :goto_20

    :cond_31
    const/4 v2, 0x1

    aget-object v3, v7, v2

    :goto_20
    if-eqz v6, :cond_32

    :goto_21
    const/4 v2, 0x2

    goto :goto_22

    :cond_32
    aget-object v6, v7, v8

    goto :goto_21

    :goto_22
    aget-object v2, v7, v2

    invoke-virtual {v11, v9, v3, v2, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_28

    :cond_33
    :goto_23
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v7, :cond_34

    goto :goto_24

    :cond_34
    const/4 v4, 0x0

    aget-object v7, v2, v4

    :goto_24
    if-eqz v3, :cond_35

    goto :goto_25

    :cond_35
    const/4 v3, 0x1

    aget-object v3, v2, v3

    :goto_25
    if-eqz v8, :cond_36

    goto :goto_26

    :cond_36
    const/4 v4, 0x2

    aget-object v8, v2, v4

    :goto_26
    if-eqz v6, :cond_37

    goto :goto_27

    :cond_37
    const/4 v4, 0x3

    aget-object v6, v2, v4

    :goto_27
    invoke-virtual {v11, v7, v3, v8, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_38
    :goto_28
    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3a

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_39

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_39

    invoke-static {v12, v3}, Lf0/P;->p(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_39

    goto :goto_29

    :cond_39
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_29
    invoke-static {v11, v3}, LJ/n;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_3a
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3b

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lg/W;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    invoke-static {v11, v2}, LJ/n;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :cond_3b
    const/16 v2, 0xf

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    const/16 v2, 0x12

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v4, 0x13

    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_3d

    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v6

    if-eqz v6, :cond_3c

    iget v7, v6, Landroid/util/TypedValue;->type:I

    const/4 v8, 0x5

    if-ne v7, v8, :cond_3c

    iget v4, v6, Landroid/util/TypedValue;->data:I

    const/16 v6, 0xf

    and-int/lit8 v7, v4, 0xf

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    goto :goto_2a

    :cond_3c
    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    int-to-float v4, v4

    move v7, v5

    goto :goto_2a

    :cond_3d
    move v7, v5

    const/high16 v4, -0x40800000    # -1.0f

    :goto_2a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v3, v5, :cond_3e

    invoke-static {v11, v3}, LA0/p;->S(Landroid/widget/TextView;I)V

    :cond_3e
    if-eq v2, v5, :cond_3f

    invoke-static {v11, v2}, LA0/p;->U(Landroid/widget/TextView;I)V

    :cond_3f
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v4, v0

    if-eqz v0, :cond_42

    if-ne v7, v5, :cond_40

    float-to-int v0, v4

    invoke-static {v11, v0}, LA0/p;->V(Landroid/widget/TextView;I)V

    goto :goto_2b

    :cond_40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v0, v2, :cond_41

    invoke-static {v11, v7, v4}, LJ/q;->a(Landroid/widget/TextView;IF)V

    goto :goto_2b

    :cond_41
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v7, v4, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v11, v0}, LA0/p;->V(Landroid/widget/TextView;I)V

    :cond_42
    :goto_2b
    return-void

    :goto_2c
    monitor-exit v2

    throw v0
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 5

    sget-object v0, Lb/a;->s:[I

    new-instance v1, LJ0/d;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, LJ0/d;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 v0, 0xe

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    iget-object v3, p0, Lg/G;->a:Landroid/widget/TextView;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, Lg/G;->l(Landroid/content/Context;LJ0/d;)V

    const/16 p1, 0xd

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v3, p1}, Lg/E;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {v1}, LJ0/d;->u()V

    iget-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget p2, p0, Lg/G;->j:I

    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public final g(IIII)V
    .locals 2

    iget-object v0, p0, Lg/G;->i:Lg/P;

    invoke-virtual {v0}, Lg/P;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lg/P;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lg/P;->k(FFF)V

    invoke-virtual {v0}, Lg/P;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lg/P;->a()V

    :cond_0
    return-void
.end method

.method public final h([II)V
    .locals 6

    iget-object v0, p0, Lg/G;->i:Lg/P;

    invoke-virtual {v0}, Lg/P;->j()Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    new-array v3, v1, [I

    if-nez p2, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v4, v0, Lg/P;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v3}, Lg/P;->b([I)[I

    move-result-object p2

    iput-object p2, v0, Lg/P;->f:[I

    invoke-virtual {v0}, Lg/P;->i()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "None of the preset sizes is valid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-boolean v2, v0, Lg/P;->g:Z

    :goto_2
    invoke-virtual {v0}, Lg/P;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lg/P;->a()V

    :cond_4
    return-void
.end method

.method public final i(I)V
    .locals 4

    iget-object v0, p0, Lg/G;->i:Lg/P;

    invoke-virtual {v0}, Lg/P;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Lg/P;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/4 v1, 0x2

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v1, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2, p1, v1}, Lg/P;->k(FFF)V

    invoke-virtual {v0}, Lg/P;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lg/P;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    invoke-static {v1, p1}, LS/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    iput p1, v0, Lg/P;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lg/P;->d:F

    iput v1, v0, Lg/P;->e:F

    iput v1, v0, Lg/P;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, Lg/P;->f:[I

    iput-boolean p1, v0, Lg/P;->b:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final j(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/G;->h:Lg/C0;

    if-nez v0, :cond_0

    new-instance v0, Lg/C0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg/G;->h:Lg/C0;

    :cond_0
    iget-object v0, p0, Lg/G;->h:Lg/C0;

    iput-object p1, v0, Lg/C0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lg/C0;->d:Z

    iput-object v0, p0, Lg/G;->b:Lg/C0;

    iput-object v0, p0, Lg/G;->c:Lg/C0;

    iput-object v0, p0, Lg/G;->d:Lg/C0;

    iput-object v0, p0, Lg/G;->e:Lg/C0;

    iput-object v0, p0, Lg/G;->f:Lg/C0;

    iput-object v0, p0, Lg/G;->g:Lg/C0;

    return-void
.end method

.method public final k(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/G;->h:Lg/C0;

    if-nez v0, :cond_0

    new-instance v0, Lg/C0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg/G;->h:Lg/C0;

    :cond_0
    iget-object v0, p0, Lg/G;->h:Lg/C0;

    iput-object p1, v0, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lg/C0;->c:Z

    iput-object v0, p0, Lg/G;->b:Lg/C0;

    iput-object v0, p0, Lg/G;->c:Lg/C0;

    iput-object v0, p0, Lg/G;->d:Lg/C0;

    iput-object v0, p0, Lg/G;->e:Lg/C0;

    iput-object v0, p0, Lg/G;->f:Lg/C0;

    iput-object v0, p0, Lg/G;->g:Lg/C0;

    return-void
.end method

.method public final l(Landroid/content/Context;LJ0/d;)V
    .locals 11

    iget v0, p0, Lg/G;->j:I

    iget-object v1, p2, LJ0/d;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/TypedArray;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lg/G;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    const/4 v4, -0x1

    if-lt v0, v3, :cond_0

    const/16 v5, 0xb

    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, p0, Lg/G;->k:I

    if-eq v5, v4, :cond_0

    iget v5, p0, Lg/G;->j:I

    and-int/2addr v5, v2

    iput v5, p0, Lg/G;->j:I

    :cond_0
    const/16 v5, 0xa

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v6, :cond_6

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v8, p0, Lg/G;->m:Z

    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-eq p1, v9, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v6, 0x0

    iput-object v6, p0, Lg/G;->l:Landroid/graphics/Typeface;

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move v5, v7

    :cond_7
    iget v6, p0, Lg/G;->k:I

    iget v7, p0, Lg/G;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v10, p0, Lg/G;->a:Landroid/widget/TextView;

    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lg/B;

    invoke-direct {v10, p0, v6, v7, p1}, Lg/B;-><init>(Lg/G;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Lg/G;->j:I

    invoke-virtual {p2, v5, p1, v10}, LJ0/d;->j(IILg/B;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v3, :cond_9

    iget p2, p0, Lg/G;->k:I

    if-eq p2, v4, :cond_9

    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lg/G;->k:I

    iget v0, p0, Lg/G;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_8

    move v0, v9

    goto :goto_2

    :cond_8
    move v0, v8

    :goto_2
    invoke-static {p1, p2, v0}, Lg/F;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_9
    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    :cond_a
    :goto_3
    iget-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v9

    goto :goto_4

    :cond_b
    move p1, v8

    :goto_4
    iput-boolean p1, p0, Lg/G;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_e

    iget p2, p0, Lg/G;->k:I

    if-eq p2, v4, :cond_e

    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lg/G;->k:I

    iget v0, p0, Lg/G;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_d

    move v8, v9

    :cond_d
    invoke-static {p1, p2, v8}, Lg/F;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    goto :goto_5

    :cond_e
    iget p2, p0, Lg/G;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lg/G;->l:Landroid/graphics/Typeface;

    :cond_f
    :goto_5
    return-void
.end method
