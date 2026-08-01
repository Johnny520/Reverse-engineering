.class public final Ly7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ly7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ly7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ly7;->a:I

    packed-switch v2, :pswitch_data_0

    .line 1
    iget-object v1, v0, Ly7;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/appcompat/widget/SearchView;

    .line 2
    iget-object v2, v1, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 3
    iget-object v3, v1, Landroidx/appcompat/widget/SearchView;->x:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_2

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 5
    iget-object v5, v1, Landroidx/appcompat/widget/SearchView;->r:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    .line 6
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 7
    invoke-static {v1}, Lhb0;->a(Landroid/view/View;)Z

    move-result v7

    .line 8
    iget-boolean v1, v1, Landroidx/appcompat/widget/SearchView;->M:Z

    if-eqz v1, :cond_0

    const v1, 0x7f070029

    .line 9
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const v8, 0x7f07002a

    .line 10
    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    add-int/2addr v4, v1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 11
    :goto_0
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    if-eqz v7, :cond_1

    .line 12
    iget v1, v6, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    goto :goto_1

    .line 13
    :cond_1
    iget v1, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v4

    sub-int v1, v5, v1

    .line 14
    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v3, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v3

    iget v3, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v3

    add-int/2addr v1, v4

    sub-int/2addr v1, v5

    .line 16
    invoke-virtual {v2, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    :cond_2
    return-void

    .line 17
    :pswitch_0
    const-string v2, "/g==\n"

    const-string v3, "iF2if63ykaA=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const v2, 0x7e0b0002

    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sub-int v2, p4, p2

    sub-int v4, p5, p3

    if-lez v2, :cond_16

    if-lez v4, :cond_16

    .line 20
    iget-object v5, v0, Ly7;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "0p6Y+q5yLh3Enw==\n"

    const-string v7, "sfb5jtobQHo=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 21
    invoke-static {v5, v6, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v8, v6, Landroid/view/View;

    if-eqz v8, :cond_3

    check-cast v6, Landroid/view/View;

    goto :goto_2

    :cond_3
    move-object v6, v3

    :goto_2
    move v8, v7

    :goto_3
    const/4 v9, -0x1

    .line 23
    const-string v10, ""

    const/16 v11, 0xf

    const/4 v12, 0x1

    if-eqz v6, :cond_8

    if-ge v8, v11, :cond_8

    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v13, "lwf1I2Yp7JHeTK9E\n"

    const-string v14, "8GKBbQdEibk=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v14, "QiQLmA==\n"

    const-string v15, "EGtEzOUMG+Q=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v11, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v14, "rdJuV6A9J/i4zkcQ+XZ7kg==\n"

    const-string v15, "2b0iONdYVbs=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v14

    if-eq v14, v9, :cond_4

    .line 26
    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v14

    invoke-virtual {v9, v14}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v9

    const-string v14, "1ma/i1HJKB7DYK6cWs41Ev9iprwclGlFmA==\n"

    const-string v15, "sQPL2TS6R2s=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v9}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v14, "gDN7jw==\n"

    const-string v15, "0nw02xJqOJQ=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v13, "k3EgYOXe6quGbQknvJW2wQ==\n"

    const-string v14, "5x5sD5K7mOg=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v9}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v9

    .line 27
    :catchall_0
    :cond_4
    const-string v9, "ld1nNgmk1IA=\n"

    const-string v13, "9rUGQn3Nuuc=\n"

    invoke-static {v9, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 28
    invoke-static {v10, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_5

    .line 29
    const-string v9, "+Ih5iAGTVXU=\n"

    const-string v10, "m+AY/HX6OxI=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 30
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_6

    :cond_5
    move v5, v12

    .line 31
    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v9, v6, Landroid/view/View;

    if-eqz v9, :cond_7

    check-cast v6, Landroid/view/View;

    goto :goto_4

    :cond_7
    move-object v6, v3

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    .line 32
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v8, v6, Landroid/view/View;

    if-eqz v8, :cond_9

    check-cast v6, Landroid/view/View;

    goto :goto_5

    :cond_9
    move-object v6, v3

    :goto_5
    move v8, v7

    :goto_6
    const/high16 v13, 0x7e0b0000

    if-eqz v6, :cond_f

    if-ge v8, v11, :cond_f

    .line 33
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    const-string v15, "j7cR2+zxnF3G/Eu8\n"

    const-string v3, "6NJllY2c+XU=\n"

    invoke-static {v15, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v15, "z2ZDZw==\n"

    const-string v11, "nSkMM8fC6GI=\n"

    invoke-static {v15, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v14, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v14, "EnG3M2tZZ4gHbZ50MhI74g==\n"

    const-string v15, "Zh77XBw8Fcs=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v14

    if-eq v14, v9, :cond_a

    .line 35
    :try_start_1
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "MmCc8P0UjO8nZo3n9hOR4xtkhcewSc20fA==\n"

    const-string v9, "VQXoophn45o=\n"

    invoke-static {v15, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v14}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "QBS/AA==\n"

    const-string v15, "ElvwVGBeVQ0=\n"

    invoke-static {v9, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v14, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v9, "CLFM7OcxnpMdrWWrvnrC+Q==\n"

    const-string v14, "fN4Ag5BU7NA=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    :cond_a
    move-object v3, v10

    .line 36
    :goto_7
    const-string v9, "uSsAQ1A=\n"

    const-string v14, "3EZvKTm0ot0=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 37
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 38
    const-string v9, "HCBEYvE=\n"

    const-string v14, "eU0rCJjJP4E=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 39
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 40
    const-string v9, "eMraZgrT\n"

    const-string v14, "C6ezCm+qM4g=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 41
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 42
    const-string v9, "Y8w66L7S\n"

    const-string v14, "EKFThNurtbY=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 43
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 44
    const-string v9, "CGETbDW+VX4=\n"

    const-string v14, "bQx8GFzdOhA=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 45
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 46
    const-string v9, "Gt2yUShNwL0=\n"

    const-string v14, "f7DdJUEur9M=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 47
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 48
    const-string v9, "hKZ5L4hdEWw=\n"

    const-string v14, "78MATec8Ywg=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 49
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 50
    const-string v9, "1t17hV0=\n"

    const-string v14, "v7ML8Cl7GMw=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 51
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_b

    goto/16 :goto_9

    :cond_b
    if-eqz v5, :cond_c

    .line 52
    const-string v9, "tM33jEA=\n"

    const-string v14, "xbiY+CX9BWA=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 53
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 54
    const-string v9, "MxIrmcg=\n"

    const-string v14, "QmdE7a1gltA=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 55
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 56
    const-string v9, "riVTXhI=\n"

    const-string v14, "3EAjMmsj6pQ=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 57
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 58
    const-string v9, "iSRn+lw=\n"

    const-string v14, "+0EXliXBeMU=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 59
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 60
    const-string v9, "cEuFwVc=\n"

    const-string v14, "ACrrpDsnRHs=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 61
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 62
    const-string v9, "HNhmWcI=\n"

    const-string v14, "bLkIPK4GCg0=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 63
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 64
    const-string v9, "VNUTE7JT\n"

    const-string v14, "Mrp8Z9chCmw=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 65
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 66
    const-string v9, "xjNTS2xw\n"

    const-string v14, "oFw8PwkCWJg=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 67
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 68
    const-string v9, "uevVRoTG\n"

    const-string v14, "24ShMuuroWg=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 69
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 70
    const-string v9, "9jEHycNp\n"

    const-string v14, "lF5zvawE92g=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 71
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 72
    const-string v9, "qTczWA==\n"

    const-string v14, "zkVaPFIfB8k=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 73
    invoke-static {v11, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 74
    const-string v9, "HozQvQ==\n"

    const-string v11, "ef652WhwygA=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 75
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 76
    const-string v9, "tIFhjIlehK6Iim+WiVKEvQ==\n"

    const-string v11, "1+kA+P036sk=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 77
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 78
    const-string v9, "qAzZUqd5Hl6UDcxDvk8RSbsJy0E=\n"

    const-string v11, "y2S4JtMQcDk=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 79
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 80
    const-string v9, "e//gkvoX\n"

    const-string v11, "CJCV4JlyP1s=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 81
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 82
    const-string v9, "wf7x8g==\n"

    const-string v11, "op+DlqbVR2g=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 83
    invoke-static {v3, v9, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_9

    .line 84
    :cond_c
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v6, v3, Landroid/view/View;

    if-eqz v6, :cond_d

    check-cast v3, Landroid/view/View;

    move-object v6, v3

    goto :goto_8

    :cond_d
    const/4 v6, 0x0

    :goto_8
    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x0

    const/4 v9, -0x1

    const/16 v11, 0xf

    goto/16 :goto_6

    .line 85
    :cond_e
    :goto_9
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v13, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto/16 :goto_d

    :cond_f
    if-eqz v5, :cond_10

    const/high16 v3, 0x42080000    # 34.0f

    goto :goto_a

    :cond_10
    const/high16 v3, 0x41400000    # 12.0f

    :goto_a
    sub-int v4, v2, v4

    .line 86
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    const/4 v5, 0x5

    if-gt v4, v5, :cond_15

    int-to-float v2, v2

    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v4

    cmpg-float v3, v3, v2

    if-gtz v3, :cond_14

    const/high16 v3, 0x42aa0000    # 85.0f

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_14

    .line 88
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v13, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 89
    const-string v2, "mzPJFFn98JGUM9QUSuTki5Ek\n"

    const-string v3, "8FawSyuShf8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 90
    const-string v3, "395e\n"

    const-string v4, "tLsnnZO6yYk=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    :try_start_2
    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lkn;->e(Ljava/lang/String;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    .line 92
    :catchall_2
    :try_start_3
    sget-object v3, Lkn;->a:Lkn;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 93
    const-string v3, "true"

    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 95
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_b

    .line 96
    :cond_11
    const-string v3, "false"

    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 98
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    :goto_b
    if-eqz v3, :cond_13

    .line 99
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :cond_13
    move v2, v7

    :goto_c
    if-eqz v2, :cond_16

    .line 100
    sget-object v2, Lly;->h:Ljy;

    if-eqz v2, :cond_16

    .line 101
    invoke-virtual {v1, v2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 102
    invoke-virtual {v1, v12}, Landroid/view/View;->setClipToOutline(Z)V

    .line 103
    invoke-virtual {v1}, Landroid/view/View;->invalidateOutline()V

    goto :goto_d

    .line 104
    :cond_14
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v13, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_d

    .line 105
    :cond_15
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v13, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_16
    :goto_d
    return-void

    :pswitch_1
    const/4 v1, 0x0

    .line 106
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
