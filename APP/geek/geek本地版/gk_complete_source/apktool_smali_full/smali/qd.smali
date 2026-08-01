.class public final Lqd;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const-string v0, "\u06e0\u06e1\u06e6"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v1, "kgW7lIN"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۣ۟ۤ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v3, v3, -0x1218

    or-int/2addr v2, v3

    if-ltz v2, :cond_0

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v2, "\u06e0\u06e0\u06e4"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_0
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/2addr v2, v3

    const v3, 0x20f52e

    add-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v4}, Landroid/graphics/Paint;-><init>(I)V

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/lit16 v3, v3, -0x17f3

    xor-int/2addr v1, v3

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v1, "\u06e2\u06e1\u06e1"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e7\u06e0\u06df"

    :goto_1
    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/lit16 v3, v3, -0xa4f

    sub-int/2addr v1, v3

    if-ltz v1, :cond_2

    const/16 v1, 0x2a

    sput v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v1, "\u06e0\u06e1\u06e6"

    goto :goto_1

    :cond_2
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v1, v3

    const v3, 0x1aaae4

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_4
    iput-object v0, p0, Lqd;->b:Landroid/graphics/Paint;

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/lit16 v3, v3, 0x260c

    mul-int/2addr v1, v3

    if-ltz v1, :cond_3

    :cond_3
    const-string v1, "\u06e1\u06e7\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_4
    :sswitch_5
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v1

    if-ltz v1, :cond_5

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v1, "\u06e1\u06e7\u06e5"

    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v1, v3

    const v3, -0x1aa758

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v1

    if-gtz v1, :cond_4

    const-string v1, "\u06e4\u06e0\u06e0"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_7
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v3, v3, 0x19b2

    or-int/2addr v1, v3

    if-ltz v1, :cond_6

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v1, "\u06e0\u06e6\u06e6"

    :goto_2
    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sub-int/2addr v1, v3

    const v3, 0x1aa4c4

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lqd;->a:Landroid/graphics/Paint;

    const-string v1, "\u06e3\u06df\u06e4"

    goto :goto_2

    :sswitch_9
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v1

    if-gtz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v1, "\u06e7\u06e5\u06e4"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v1, v3

    const v3, -0x1d52ce

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa740 -> :sswitch_0
        0x1aaae4 -> :sswitch_4
        0x1aab05 -> :sswitch_8
        0x1aaba0 -> :sswitch_5
        0x1aaf7a -> :sswitch_6
        0x1ab282 -> :sswitch_9
        0x1ab608 -> :sswitch_2
        0x1ab6de -> :sswitch_7
        0x1ab9e4 -> :sswitch_1
        0x1ac526 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 26

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v23, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/16 v25, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const-string v20, "\u06e6\u06e0\u06e7"

    invoke-static/range {v20 .. v20}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v20, v2

    move-object/from16 v21, v7

    move-object/from16 v22, v8

    :goto_0
    sparse-switch v24, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v7, "78hDNGBZvQ==\n"

    const-string v2, "zPhzAyEf+wA=\n"

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v8

    if-ltz v8, :cond_11

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v8, "\u06df\u06e2\u06df"

    invoke-static {v8}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v21, v2

    move-object/from16 v22, v7

    move/from16 v24, v8

    goto :goto_0

    :sswitch_1
    const-string v2, "+fo6dghWFw==\n"

    const-string v5, "2sp7TjwQUbw=\n"

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v8, v8, -0x1ea6

    xor-int/2addr v7, v8

    if-gtz v7, :cond_5

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v7, "\u06e3\u06e0\u06e2"

    invoke-static {v7}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v13, v2

    move/from16 v24, v7

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v2, :cond_0

    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto :goto_0

    :cond_0
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v7, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    mul-int/2addr v2, v7

    const v7, 0x1557fc

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/lit16 v7, v7, 0xa16

    div-int/2addr v2, v7

    if-eqz v2, :cond_1

    const/16 v2, 0x35

    sput v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v2, "\u06e6\u06e1\u06e3"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v4

    move/from16 v24, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e1\u06e2\u06e1"

    move-object/from16 v19, v4

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/lit16 v6, v6, 0x7a7

    xor-int/2addr v2, v6

    if-gtz v2, :cond_2

    const/16 v2, 0x51

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e8\u06e8\u06e6"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v22

    move-object/from16 v6, v21

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v2, v6

    const v6, 0x1ab130

    add-int/2addr v2, v6

    move-object/from16 v23, v22

    move-object/from16 v6, v21

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, v19

    invoke-static {v15, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const-string v7, "\u06df\u06e1\u06e8"

    move-object v2, v11

    :goto_2
    invoke-static {v7}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move v12, v8

    move/from16 v24, v7

    goto/16 :goto_0

    :sswitch_6
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/lit16 v6, v6, 0x2015

    or-int/2addr v2, v6

    if-gtz v2, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-object v2, v5

    :goto_3
    const-string v6, "\u06e3\u06e8\u06e3"

    move-object v7, v6

    move-object v8, v2

    :goto_4
    invoke-static {v7}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v8

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_3
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    mul-int/2addr v2, v6

    const v6, 0x120d31

    xor-int/2addr v2, v6

    move-object v6, v5

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/2addr v2, v7

    const v7, 0x1abbe7

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lqd;->a:Landroid/graphics/Paint;

    invoke-virtual {v2, v12}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v7

    if-ltz v7, :cond_4

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v7, "\u06e2\u06e1\u06e1"

    move v8, v12

    goto :goto_2

    :cond_4
    const-string v8, "\u06e0\u06e4\u06e8"

    move-object v11, v2

    move-object v7, v14

    :goto_5
    invoke-static {v8}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v23

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v7, v7, 0x24a7

    or-int/2addr v2, v7

    if-ltz v2, :cond_6

    const/16 v2, 0x51

    sput v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    move-object v2, v13

    :cond_5
    const-string v7, "\u06e5\u06e7\u06e0"

    invoke-static {v7}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v13, v2

    move/from16 v24, v7

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e0\u06e3\u06e6"

    move-object v7, v2

    move-object v8, v6

    goto :goto_4

    :sswitch_a
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    add-int/lit16 v7, v7, 0x136f

    or-int/2addr v2, v7

    if-gtz v2, :cond_7

    const/16 v2, 0x3d

    sput v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v2, "\u06e3\u06e4\u06e0"

    move-object v7, v14

    move-object v8, v2

    move-object v15, v3

    goto :goto_5

    :cond_7
    const-string v2, "\u06e3\u06e5\u06e2"

    move-object v15, v3

    :goto_6
    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_b
    const-string v2, "dYLl86YdQj6oLyeeZ9lAqS6CATu"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣۨۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v7, :cond_8

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    :goto_7
    const-string v14, "\u06e8\u06e0"

    invoke-static {v14}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v24

    move-object v14, v2

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06df\u06e7\u06e7"

    move-object v7, v2

    goto :goto_5

    :sswitch_c
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v7, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v2, v7

    const v7, 0x1aaecb

    xor-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    mul-int/lit8 v7, v7, -0x18

    div-int/2addr v2, v7

    if-eqz v2, :cond_9

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v2, "\u06e4\u06e0\u06e5"

    :goto_8
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/2addr v2, v7

    const v7, -0x1ab5b3

    xor-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "Q3oMDltOiHdXN1ZiGhI=\n"

    const-string v7, "JB94TDQ75hM=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-static {v2, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-boolean v2, Lvd;->e:Z

    if-eqz v2, :cond_16

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v2

    if-gtz v2, :cond_a

    const/16 v2, 0x2b

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e7\u06df\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/2addr v2, v7

    const v7, 0x1ab779

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v2

    if-ltz v2, :cond_b

    const-string v2, "\u06df\u06e3\u06e0"

    goto/16 :goto_6

    :cond_b
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/2addr v2, v7

    const v7, 0x1ac66c

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v2

    if-ltz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v2, "\u06e8\u06df"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e1\u06e8\u06e2"

    goto :goto_8

    :sswitch_11
    const-string v2, "CwgLlefx\n"

    const-string v7, "aGll44aC2ew=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    rem-int/lit16 v8, v8, -0x1999

    or-int/2addr v7, v8

    if-ltz v7, :cond_d

    const/16 v7, 0x50

    sput v7, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    move-object/from16 v7, v19

    :goto_9
    const-string v8, "\u06e2\u06df\u06df"

    invoke-static {v8}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v18, v2

    move-object/from16 v19, v7

    move/from16 v24, v8

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06e4\u06e6\u06e3"

    :goto_a
    invoke-static {v7}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v18, v2

    move/from16 v24, v7

    goto/16 :goto_0

    :cond_e
    :sswitch_12
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v2, :cond_f

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v2, "\u06e1\u06e4\u06df"

    :goto_b
    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e6\u06e3"

    goto/16 :goto_8

    :sswitch_13
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Paint;->descent()F

    move-result v2

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Paint;->ascent()F

    move-result v7

    const/high16 v8, 0x41f00000    # 30.0f

    sub-float/2addr v7, v8

    add-float/2addr v2, v7

    const/high16 v7, 0x41f00000    # 30.0f

    add-float/2addr v2, v7

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v7, v7, 0x2fe

    int-to-float v7, v7

    div-float v10, v2, v7

    const-string v2, "\u06e5\u06e1\u06e6"

    move-object v7, v2

    move-object v8, v6

    goto/16 :goto_4

    :sswitch_14
    new-instance v2, Landroid/graphics/RectF;

    move-object/from16 v0, v18

    invoke-direct {v2, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    const/high16 v7, 0x41c00000    # 24.0f

    const/high16 v8, 0x41c00000    # 24.0f

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v7, v8, v11}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget-boolean v2, Lvd;->e:Z

    if-eqz v2, :cond_e

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v2

    if-gtz v2, :cond_10

    const-string v2, "\u06e6\u06e3"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e2\u06e7\u06e7"

    :goto_c
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_11
    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v21, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int v8, v8, v21

    const v21, 0x1ab7fe

    add-int v8, v8, v21

    move-object/from16 v21, v2

    move-object/from16 v22, v7

    move/from16 v24, v8

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v2

    if-gtz v2, :cond_12

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v2, "\u06e7\u06e8\u06e3"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v13

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_12
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v7, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sub-int/2addr v2, v7

    const v7, -0x1aad09

    xor-int/2addr v2, v7

    move-object/from16 v23, v13

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v2, v18

    move-object/from16 v15, v17

    move-object/from16 v7, v16

    goto/16 :goto_9

    :sswitch_17
    move-object/from16 v0, p0

    iget-object v2, v0, Lqd;->b:Landroid/graphics/Paint;

    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setColor(I)V

    sget v7, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/lit16 v8, v8, 0x11e6

    mul-int/2addr v7, v8

    if-gtz v7, :cond_13

    const/16 v7, 0x5c

    sput v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v7, "\u06e4\u06e6\u06e3"

    invoke-static {v7}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v20, v2

    move/from16 v24, v7

    goto/16 :goto_0

    :cond_13
    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/2addr v7, v8

    const v8, 0x1078f7

    xor-int/2addr v7, v8

    move-object/from16 v20, v2

    move/from16 v24, v7

    goto/16 :goto_0

    :sswitch_18
    const-string v8, "7ONTXMum5w==\n"

    const-string v7, "z6VhGvng0Lg=\n"

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v16, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, -0xfb4

    move/from16 v16, v0

    div-int v2, v2, v16

    if-eqz v2, :cond_14

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v2, "\u06e6\u06e0\u06e6"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_14
    move-object v2, v14

    goto/16 :goto_7

    :sswitch_19
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/lit16 v7, v7, 0xcec

    xor-int/2addr v2, v7

    if-ltz v2, :cond_15

    const-string v2, "\u06e8\u06df\u06e4"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v7, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/2addr v2, v7

    const v7, 0x1ac1f4

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_16
    :sswitch_1a
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v2, :cond_17

    const-string v7, "\u06df\u06e2\u06e1"

    move-object/from16 v2, v18

    goto/16 :goto_a

    :cond_17
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v2, v7

    const v7, 0x1aab99

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v2

    if-gtz v2, :cond_18

    const-string v2, "\u06e1\u06e8\u06e7"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e6\u06e0\u06e7"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_1c
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v7, v7, -0x10d0

    xor-int/2addr v2, v7

    if-gtz v2, :cond_19

    const/16 v2, 0x9

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v2, "\u06e8\u06e2\u06df"

    goto/16 :goto_1

    :cond_19
    const-string v2, "\u06e8\u06e8\u06e6"

    goto/16 :goto_b

    :sswitch_1d
    const-string v3, "1wzpssK2/Q==\n"

    const-string v4, "9D6qgIGEuCE=\n"

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v2, :cond_1a

    const/16 v2, 0x28

    sput v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v2, "\u06e3\u06e5\u06e2"

    goto/16 :goto_c

    :cond_1a
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/2addr v2, v7

    const v7, -0x1aa77d

    xor-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_1e
    const-string v2, "+O1WbQ==\n"

    const-string v7, "CHLF7Fz0VNI=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Rect;->centerX()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40a00000    # 5.0f

    sub-float v8, v25, v8

    sub-float/2addr v8, v10

    const/high16 v24, 0x40a00000    # 5.0f

    add-float v8, v8, v24

    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-virtual {v0, v2, v7, v8, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v2

    if-gtz v2, :cond_1c

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v2, v7

    const v7, 0x1b1738

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_1f
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    const v7, 0x3ee66666    # 0.45f

    mul-float/2addr v2, v7

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v7, v2

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v2

    if-ltz v2, :cond_1b

    const-string v2, "\u06e6\u06e0\u06e7"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    move/from16 v25, v7

    goto/16 :goto_0

    :cond_1b
    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v8, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v2, v8

    const v8, 0x1ab780

    add-int/2addr v2, v8

    move/from16 v24, v2

    move/from16 v25, v7

    goto/16 :goto_0

    :cond_1c
    :sswitch_20
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v2, :cond_1d

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v2, "\u06df\u06e8"

    invoke-static {v2}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v2, v7

    const v7, 0x1ab7a2

    add-int/2addr v2, v7

    move/from16 v24, v2

    goto/16 :goto_0

    :sswitch_21
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v14}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/lit16 v7, v7, 0x7fe

    or-int/2addr v2, v7

    if-gtz v2, :cond_1e

    const/4 v2, 0x7

    sput v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v2, "\u06e5\u06e1\u06e6"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v2

    goto/16 :goto_0

    :cond_1e
    move-object v2, v6

    goto/16 :goto_3

    :sswitch_22
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_0
        0xdcf8 -> :sswitch_16
        0x1aa6ff -> :sswitch_f
        0x1aa746 -> :sswitch_7
        0x1aa75c -> :sswitch_3
        0x1aa7ff -> :sswitch_21
        0x1aab43 -> :sswitch_c
        0x1aab64 -> :sswitch_14
        0x1aab99 -> :sswitch_18
        0x1aaec4 -> :sswitch_b
        0x1aaee0 -> :sswitch_a
        0x1aaee5 -> :sswitch_1c
        0x1aaf9b -> :sswitch_9
        0x1ab242 -> :sswitch_2
        0x1ab282 -> :sswitch_10
        0x1ab342 -> :sswitch_1
        0x1ab625 -> :sswitch_1d
        0x1ab660 -> :sswitch_1c
        0x1ab69f -> :sswitch_1b
        0x1ab6c0 -> :sswitch_5
        0x1ab700 -> :sswitch_19
        0x1ab71e -> :sswitch_22
        0x1ab9cb -> :sswitch_4
        0x1aba44 -> :sswitch_f
        0x1aba64 -> :sswitch_13
        0x1abaa1 -> :sswitch_e
        0x1abdc4 -> :sswitch_12
        0x1abdca -> :sswitch_1e
        0x1abe7e -> :sswitch_6
        0x1ac16c -> :sswitch_d
        0x1ac16d -> :sswitch_11
        0x1ac188 -> :sswitch_10
        0x1ac18b -> :sswitch_20
        0x1ac221 -> :sswitch_15
        0x1ac507 -> :sswitch_1a
        0x1ac546 -> :sswitch_1f
        0x1ac622 -> :sswitch_d
        0x1ac8cd -> :sswitch_8
        0x1ac9e6 -> :sswitch_17
    .end sparse-switch
.end method

.method public final getOpacity()I
    .locals 1

    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v0, v0, -0x3bd

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    const-string v0, "\u06e4\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x5c

    sput v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v0, "\u06e2\u06df\u06e6"

    :goto_1
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e5\u06df"

    goto :goto_1

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab6a1 -> :sswitch_0
        0x1aba7e -> :sswitch_1
    .end sparse-switch
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    const-string v0, "\u06e5\u06e7"

    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x9

    sput v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v0, "\u06e2\u06e3\u06e4"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int/2addr v0, v1

    const v1, -0xdc4a

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_0
        0x1ac1e8 -> :sswitch_1
    .end sparse-switch
.end method
