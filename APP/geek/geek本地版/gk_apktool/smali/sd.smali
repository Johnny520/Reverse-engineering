.class public final Lsd;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/content/Context;)V
    .locals 13

    iput-object p1, p0, Lsd;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v10, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const-string v9, "\u06df\u06e5\u06e4"

    invoke-static {v9}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v12

    move-object v9, v0

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v8, "iNkFtN21Rift\n"

    const-string v2, "q+o28pvzAGE=\n"

    const-string v0, "\u06e5\u06e2\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Landroid/graphics/BitmapShader;

    invoke-direct {v0, p1, v9, v9}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iput-object v10, p0, Lsd;->a:Landroid/graphics/Paint;

    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v12, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/lit16 v12, v12, 0xc02

    xor-int/2addr v0, v12

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e6\u06e5\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e6\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_2
    new-instance v10, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v10, v0}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v12, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v9, v12

    const v12, 0x1ac63c

    xor-int/2addr v12, v9

    move-object v9, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06e0\u06e5"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e8\u06e0\u06e7"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v0, "\u06e2\u06e5\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v12, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    mul-int/2addr v0, v12

    const v12, 0x1aeebd

    xor-int/2addr v0, v12

    move v12, v0

    goto :goto_0

    :sswitch_5
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v12, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/lit16 v12, v12, -0x249b

    div-int/2addr v0, v12

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v0, "\u06e6\u06e4\u06e7"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e8\u06e5"

    goto :goto_2

    :cond_4
    :sswitch_6
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v12, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/2addr v0, v12

    const v12, 0x1ab9cb

    xor-int/2addr v0, v12

    move v12, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "ZwKKpYH0zTzoxz1K74"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۨ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v12, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/lit16 v12, v12, 0x1c6d

    sub-int/2addr v0, v12

    if-gtz v0, :cond_5

    const/16 v0, 0x14

    sput v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v0, "\u06e6\u06e7\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e5\u06df"

    :goto_3
    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v5, "p0nLDp+e8Ea0\n"

    const-string v4, "hHiKPq+uwHY=\n"

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v0

    if-gtz v0, :cond_9

    const/16 v0, 0x33

    sput v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    move-object v0, v3

    :cond_6
    const-string v3, "\u06e5\u06e5\u06e5"

    invoke-static {v3}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v12

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v12, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v12

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-boolean v0, Lvd;->e:Z

    if-eqz v0, :cond_7

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v12, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    mul-int/2addr v0, v12

    const v12, 0xb981

    add-int/2addr v0, v12

    move v12, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v12, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v12, v12, 0xc81

    xor-int/2addr v0, v12

    if-gtz v0, :cond_8

    const/16 v0, 0x34

    sput v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v0, "\u06e6\u06e2\u06e0"

    goto :goto_3

    :cond_8
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/2addr v0, v12

    const v12, 0x1ac968

    add-int/2addr v0, v12

    move v12, v0

    goto/16 :goto_0

    :sswitch_b
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v6}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v12, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sub-int/2addr v0, v12

    const v12, 0x1abb29

    add-int/2addr v0, v12

    move v12, v0

    goto/16 :goto_0

    :sswitch_c
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v0, :cond_a

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    :cond_9
    const-string v0, "\u06e3\u06e5\u06e4"

    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e1\u06e8\u06e8"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_d
    new-instance v0, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v3, :cond_6

    const-string v3, "\u06e8\u06e4\u06e2"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v12

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_e
    move-object v1, v4

    move-object v7, v5

    :cond_b
    const-string v0, "\u06e1\u06df\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v7, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v11, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v11, :cond_c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v11, "\u06e3\u06e5\u06df"

    invoke-static {v11}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v12

    move-object v11, v0

    goto/16 :goto_0

    :cond_c
    sget v11, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v12, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/2addr v11, v12

    const v12, 0x1ab56d

    add-int/2addr v12, v11

    move-object v11, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v0

    if-ltz v0, :cond_d

    const-string v0, "\u06e4\u06df\u06e6"

    move-object v7, v8

    goto :goto_4

    :cond_d
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sub-int/2addr v0, v7

    const v7, 0x1ac1f3

    add-int/2addr v0, v7

    move-object v7, v8

    move v12, v0

    goto/16 :goto_0

    :sswitch_11
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v12, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v12, v12, -0x842

    div-int/2addr v0, v12

    if-eqz v0, :cond_e

    const-string v0, "\u06e7\u06e5\u06e2"

    goto/16 :goto_1

    :cond_e
    const-string v0, "\u06df\u06e5\u06e4"

    goto/16 :goto_1

    :sswitch_12
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    rem-int/lit16 v1, v1, -0x633

    add-int/2addr v0, v1

    if-ltz v0, :cond_f

    const/16 v0, 0x52

    sput v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v0, "\u06e8\u06e0\u06e7"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    move v12, v0

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06df\u06e1\u06e8"

    move-object v1, v2

    goto/16 :goto_2

    :sswitch_13
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    iput-object v3, p0, Lsd;->b:Landroid/graphics/Paint;

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v0

    if-gez v0, :cond_b

    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v12, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/2addr v0, v12

    const v12, 0x1ac1c4

    xor-int/2addr v0, v12

    move v12, v0

    goto/16 :goto_0

    :sswitch_14
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0x1aa746 -> :sswitch_f
        0x1aa7be -> :sswitch_2
        0x1aae88 -> :sswitch_5
        0x1aafa1 -> :sswitch_3
        0x1ab323 -> :sswitch_d
        0x1ab6bd -> :sswitch_b
        0x1ab6c2 -> :sswitch_e
        0x1ab6dc -> :sswitch_c
        0x1ab9ca -> :sswitch_14
        0x1ab9cb -> :sswitch_6
        0x1abd88 -> :sswitch_4
        0x1abde2 -> :sswitch_10
        0x1abe29 -> :sswitch_12
        0x1abe45 -> :sswitch_9
        0x1ac1c5 -> :sswitch_7
        0x1ac1e9 -> :sswitch_a
        0x1ac209 -> :sswitch_3
        0x1ac247 -> :sswitch_11
        0x1ac585 -> :sswitch_1
        0x1ac624 -> :sswitch_4
        0x1ac8ef -> :sswitch_13
        0x1ac966 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    const/4 v1, 0x0

    const/4 v10, 0x0

    const-string v0, "\u06e8\u06e3\u06df"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v0, v1

    move-object v2, v1

    move-object v4, v1

    move-object v8, v1

    move v9, v5

    move v3, v10

    move v6, v10

    move v11, v10

    move v7, v10

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v2

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    :goto_1
    const-string v2, "\u06e7\u06e2"

    move-object v5, v2

    :goto_2
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v1

    move v9, v5

    goto :goto_0

    :cond_0
    const-string v2, "\u06e1\u06e4\u06e1"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v1

    move v9, v5

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v1, v7, v7, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const-string v1, "\u06e5\u06e0\u06e5"

    move v5, v6

    :goto_3
    invoke-static {v1}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    move v6, v5

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v10, v1

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v1, v5

    const v5, 0x1aa7e2

    add-int/2addr v1, v5

    move v9, v1

    move v11, v10

    goto :goto_0

    :sswitch_4
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float v5, v11, v1

    const-string v1, "\u06df\u06e0\u06e1"

    goto :goto_3

    :sswitch_5
    iget-object v4, p0, Lsd;->c:Landroid/graphics/Bitmap;

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v5, v5, 0x2a9

    mul-int/2addr v1, v5

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v1, "\u06e1\u06e6"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto :goto_0

    :cond_1
    const-string v5, "\u06e7\u06e5\u06e4"

    move-object v1, v2

    goto :goto_2

    :sswitch_6
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    const v5, 0x3e4ccccd    # 0.2f

    mul-float/2addr v5, v1

    const-string v1, "\u06df\u06e2\u06e5"

    :goto_4
    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    move v7, v5

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v1

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v1, "\u06e4\u06e2\u06e5"

    move v5, v6

    goto :goto_3

    :cond_2
    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v1, v5

    const v5, 0x1ac95f

    add-int/2addr v1, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v0, v6, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v5, v5, 0x1097

    add-int/2addr v1, v5

    if-ltz v1, :cond_3

    const/4 v1, 0x4

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v1, "\u06e8\u06df\u06e2"

    move v5, v7

    goto :goto_4

    :cond_3
    const-string v1, "\u06e7\u06e6\u06e2"

    :goto_5
    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :sswitch_9
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget-object v5, p0, Lsd;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v7, v7, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v1, "\u06e4\u06e8\u06df"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/2addr v1, v5

    const v5, 0xdc97

    xor-int/2addr v1, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v8}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    or-int/2addr v1, v5

    const v5, 0x1aac7c

    xor-int/2addr v1, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v1, v3

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v1

    if-gtz v1, :cond_5

    const/16 v1, 0x2b

    sput v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v1, "\u06e7\u06e6\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :cond_5
    move-object v1, v2

    goto/16 :goto_1

    :sswitch_c
    const-string v1, "3eTkhJis\n"

    const-string v5, "voWK8vnfR7c=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/lit16 v5, v5, 0x911

    xor-int/2addr v1, v5

    if-ltz v1, :cond_6

    const/16 v1, 0x13

    sput v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v1, "\u06e7\u06e5\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/2addr v1, v5

    const v5, 0x1abb90

    add-int/2addr v1, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_d
    iget-object v1, p0, Lsd;->a:Landroid/graphics/Paint;

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v5

    if-ltz v5, :cond_7

    const/16 v5, 0x63

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v5, "\u06e1\u06e4\u06e3"

    invoke-static {v5}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v1

    move v9, v5

    goto/16 :goto_0

    :cond_7
    sget v5, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v8, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/2addr v5, v8

    const v8, 0x1ac9a8

    add-int/2addr v5, v8

    move-object v8, v1

    move v9, v5

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "j2D2uhz79HCbLazWXac=\n"

    const-string v5, "6AWC+HOOmhQ=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06df\u06e2"

    move v5, v6

    goto/16 :goto_3

    :sswitch_f
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/lit16 v5, v5, -0x23be

    add-int/2addr v1, v5

    if-ltz v1, :cond_8

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v1, "\u06e8\u06e3\u06df"

    goto/16 :goto_5

    :cond_8
    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    div-int/2addr v1, v5

    const v5, 0x1ac14e

    add-int/2addr v1, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_0
        0xdcdb -> :sswitch_f
        0x1aa720 -> :sswitch_b
        0x1aa762 -> :sswitch_2
        0x1aaadf -> :sswitch_5
        0x1aaf1e -> :sswitch_e
        0x1aaf20 -> :sswitch_7
        0x1aaf23 -> :sswitch_6
        0x1abadb -> :sswitch_1
        0x1abdaa -> :sswitch_9
        0x1ac14e -> :sswitch_8
        0x1ac5c6 -> :sswitch_4
        0x1ac5e3 -> :sswitch_d
        0x1ac8cb -> :sswitch_3
        0x1ac944 -> :sswitch_c
        0x1ac9a7 -> :sswitch_a
    .end sparse-switch
.end method

.method public final getOpacity()I
    .locals 1

    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/lit16 v0, v0, -0x1b5

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    const-string v0, "\u06e2\u06e8\u06e1"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lsd;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    const-string v0, "\u06e7\u06e2\u06e4"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0xd

    sput v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v0, "\u06e5\u06e2\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e8\u06e1"

    goto :goto_1

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab35b -> :sswitch_0
        0x1ac54e -> :sswitch_1
        0x1ac569 -> :sswitch_2
    .end sparse-switch
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    const-string v0, "\u06e2\u06e7\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x24

    sput v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v0, "\u06e1\u06e0\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lsd;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    mul-int/lit16 v1, v1, 0x24b5

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const-string v0, "\u06e3\u06e7\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e3\u06e7\u06e1"

    goto :goto_2

    :cond_1
    const-string v0, "\u06e2\u06e7\u06e6"

    goto :goto_1

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aae84 -> :sswitch_0
        0x1ab341 -> :sswitch_1
        0x1ab6fd -> :sswitch_2
    .end sparse-switch
.end method
