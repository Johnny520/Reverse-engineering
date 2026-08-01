.class public final Lo7;
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
    iput p1, p0, Lo7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lo7;->b:Ljava/lang/Object;

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

    iget v2, v0, Lo7;->a:I

    packed-switch v2, :pswitch_data_0

    .line 1
    iget-object v1, v0, Lo7;->b:Ljava/lang/Object;

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
    invoke-static {v1}, Lcb0;->a(Landroid/view/View;)Z

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
    const-string v2, "vQ==\n"

    const-string v3, "yxG2LRcqKfI=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

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
    iget-object v5, v0, Lo7;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "b87GOPhS61V5zw==\n"

    const-string v7, "DKanTIw7hTI=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 21
    invoke-static {v5, v6, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

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

    const-string v13, "G6vDFjjbE/xS4Jlx\n"

    const-string v14, "fM63WFm2dtQ=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v14, "1lZaug==\n"

    const-string v15, "hBkV7qsvXVs=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v11, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v14, "IE5caebROEQ1UnUuv5pkLg==\n"

    const-string v15, "VCEQBpG0Sgc=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

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

    const-string v14, "SyQMQX0eD1peIh1WdhkSVmIgFXYwQ04BBQ==\n"

    const-string v15, "LEF4ExhtYC8=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v14, "+1j/jg==\n"

    const-string v15, "qRew2mUBMR4=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v13, "87MooHc5857mrwHnLnKv9A==\n"

    const-string v14, "h9xkzwBcgd0=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v9

    .line 27
    :catchall_0
    :cond_4
    const-string v9, "NKc2/WixML4=\n"

    const-string v13, "V89XiRzYXtk=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 28
    invoke-static {v10, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_5

    .line 29
    const-string v9, "M755Bn7dj+g=\n"

    const-string v10, "UNYYcgq04Y8=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 30
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

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

    const-string v15, "RQXo05oMvX8MTrK0\n"

    const-string v3, "ImCcnfth2Fc=\n"

    invoke-static {v15, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v15, "yLTJkA==\n"

    const-string v11, "mvuGxA7gw5I=\n"

    invoke-static {v15, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v14, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v14, "t9p6a6wcqJeixlMs9Vf0/Q==\n"

    const-string v15, "w7U2BNt52tQ=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

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

    const-string v15, "N5wfpIaKo4Aimg6zjY2+jB6YBpPL1+LbeQ==\n"

    const-string v9, "UPlr9uP5zPU=\n"

    invoke-static {v15, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v14}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "2ggXdw==\n"

    const-string v15, "iEdYI+JWvzg=\n"

    invoke-static {v9, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v14, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v9, "t+LhBopxhm6i/shB0zraBA==\n"

    const-string v14, "w42taf0U9C0=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    :cond_a
    move-object v3, v10

    .line 36
    :goto_7
    const-string v9, "e9HxZkY=\n"

    const-string v14, "HryeDC9583c=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 37
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 38
    const-string v9, "UeVyU+k=\n"

    const-string v14, "NIgdOYA7wJI=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 39
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 40
    const-string v9, "MKXAKMme\n"

    const-string v14, "Q8ipRKzn048=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 41
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 42
    const-string v9, "5KO+hVcR\n"

    const-string v14, "l87X6TJoE2A=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 43
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 44
    const-string v9, "DI+hZMaZ7TU=\n"

    const-string v14, "aeLOEK/6gls=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 45
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 46
    const-string v9, "ZRpZXxmJWL8=\n"

    const-string v14, "AHc2K3DqN9E=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 47
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 48
    const-string v9, "uYWtTKCaLaY=\n"

    const-string v14, "0uDULs/7X8I=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 49
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 50
    const-string v9, "yn2s0Sk=\n"

    const-string v14, "oxPcpF1UVnk=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 51
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_b

    goto/16 :goto_9

    :cond_b
    if-eqz v5, :cond_c

    .line 52
    const-string v9, "mbOq3Fw=\n"

    const-string v14, "6MbFqDlP+XI=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 53
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 54
    const-string v9, "kZlImRQ=\n"

    const-string v14, "4Own7XG8ejI=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 55
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 56
    const-string v9, "t81EIYw=\n"

    const-string v14, "xag0TfVbU0M=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 57
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 58
    const-string v9, "NVMS8mg=\n"

    const-string v14, "RzZinhEc5mY=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 59
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 60
    const-string v9, "YDRKLpY=\n"

    const-string v14, "EFUkS/orI58=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 61
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 62
    const-string v9, "lps2uZA=\n"

    const-string v14, "5vpY3PwjBvM=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 63
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 64
    const-string v9, "nG/qh4Lt\n"

    const-string v14, "+gCF8+ef4z0=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 65
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 66
    const-string v9, "R3djMkLB\n"

    const-string v14, "IRgMRiezT1U=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 67
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 68
    const-string v9, "6oBMTzuH\n"

    const-string v14, "iO84O1TqjIA=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 69
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 70
    const-string v9, "gLRM9NBZ\n"

    const-string v14, "4ts4gL80eHY=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 71
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 72
    const-string v9, "p3hJtg==\n"

    const-string v14, "wAog0qUiIuE=\n"

    invoke-static {v9, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 73
    invoke-static {v11, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 74
    const-string v9, "TJ+Vvw==\n"

    const-string v11, "K+3828fcbYk=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 75
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 76
    const-string v9, "dSbXqQAho9BJLdmzAC2jww==\n"

    const-string v11, "Fk623XRIzbc=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 77
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 78
    const-string v9, "dvFktoUxij9K8HGnnAeFKGX0dqU=\n"

    const-string v11, "FZkFwvFY5Fg=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 79
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 80
    const-string v9, "s0qGldtd\n"

    const-string v11, "wCXz57g4+Xc=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 81
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_e

    .line 82
    const-string v9, "h8OPKw==\n"

    const-string v11, "5KL9Tx87l90=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 83
    invoke-static {v3, v9, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

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
    const-string v2, "8Oplo2NVFOj/6nijcEwA8vr9\n"

    const-string v3, "m48c/BE6YYY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 90
    const-string v3, "ggWA\n"

    const-string v4, "6WD5BmkcYhM=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    :try_start_2
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lgn;->e(Ljava/lang/String;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    .line 92
    :catchall_2
    :try_start_3
    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    sget-object v2, Ldy;->h:Lay;

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
