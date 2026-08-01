.class public abstract Lr9;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static b:F

.field public static c:F

.field public static d:F

.field public static e:I

.field public static f:I

.field public static final g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v12, "\u06df\u06e0\u06df"

    invoke-static {v12}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v16

    move v12, v1

    move v13, v4

    move v14, v5

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "AIz1jenWKQ==\n"

    const-string v4, "I7XAutyVbY0=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/lit16 v5, v5, 0x1b2a

    or-int/2addr v4, v5

    if-ltz v4, :cond_d

    const-string v4, "\u06e3\u06e1\u06e7"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move v13, v1

    move/from16 v16, v4

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit8 v1, v1, 0x58

    aput v6, v0, v1

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move v1, v3

    :cond_0
    const-string v3, "\u06e2\u06e5\u06e4"

    move-object v4, v3

    move v5, v1

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v5

    move/from16 v16, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06df\u06e1\u06e7"

    move v4, v8

    :goto_2
    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v8, v4

    move/from16 v16, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "eghOpFErHw==\n"

    const-string v4, "WT565mRtKW0=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/lit16 v5, v5, 0x1277

    rem-int/2addr v1, v5

    if-ltz v1, :cond_2

    const/16 v1, 0x1b

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v1, "\u06e1\u06e5\u06e6"

    :goto_3
    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v4

    move/from16 v16, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e2\u06e7"

    move v5, v10

    :goto_4
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v4

    move v10, v5

    move/from16 v16, v1

    goto :goto_0

    :sswitch_3
    const/high16 v1, -0x40800000    # -1.0f

    sput v1, Lr9;->b:F

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v1, v4

    const v4, -0x1ab9ce

    xor-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_4
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v4, v4, 0x157a

    rem-int/2addr v1, v4

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v1, "\u06e1\u06e4\u06e7"

    :goto_5
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06df\u06e0\u06df"

    goto :goto_5

    :sswitch_5
    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/lit16 v1, v1, -0x358

    aput v12, v0, v1

    sget v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/lit16 v4, v4, 0x1579

    xor-int/2addr v1, v4

    if-gtz v1, :cond_4

    move v1, v7

    :goto_6
    const-string v4, "\u06e0\u06e5"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move v7, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e3\u06e2\u06e2"

    move v4, v11

    :goto_7
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v11, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "87TqEBKrRw==\n"

    const-string v4, "0PHfJyGcdAw=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const-string v4, "\u06e3\u06e1\u06e7"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move v12, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_7
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/lit16 v1, v1, -0xbc

    aput v13, v0, v1

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/lit16 v4, v4, -0x18e0

    div-int/2addr v1, v4

    if-ltz v1, :cond_6

    :cond_5
    const-string v1, "\u06e8\u06e3"

    move v4, v8

    goto/16 :goto_2

    :cond_6
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v1, v4

    const v4, 0x1aaf09

    add-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_8
    sput-object v0, Lr9;->g:[I

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/lit16 v4, v4, 0x1695

    add-int/2addr v1, v4

    if-gtz v1, :cond_7

    const/16 v1, 0x47

    sput v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v1, "\u06e0\u06e7\u06e1"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/2addr v1, v4

    const v4, 0xdd55

    add-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "CdydVdEq2A==\n"

    const-string v4, "KpqtY+MT6m4=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/lit16 v5, v5, 0x152d

    or-int/2addr v1, v5

    if-ltz v1, :cond_8

    move v1, v9

    :goto_8
    const-string v5, "\u06e5\u06e6\u06e4"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move v8, v4

    move v9, v1

    move/from16 v16, v5

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e8\u06e0"

    goto/16 :goto_2

    :sswitch_a
    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v1, v1, 0x8

    aput v10, v0, v1

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v4, v4, 0xeb1

    or-int/2addr v1, v4

    if-gtz v1, :cond_9

    const-string v1, "\u06e1\u06e0\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e0\u06e6\u06e3"

    move v4, v6

    goto/16 :goto_3

    :sswitch_b
    const-string v1, "PMl4UV6NSQ==\n"

    const-string v4, "H/08FW7IeMc=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v4, v5

    const v5, 0xdce1

    xor-int/2addr v4, v5

    move v14, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_c
    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v1, v1, -0x2ca

    aput v7, v0, v1

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v4, v4, -0x1c5b

    xor-int/2addr v1, v4

    if-ltz v1, :cond_a

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v1, "\u06e0\u06e6\u06e2"

    :goto_9
    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e4\u06e7\u06e4"

    goto :goto_9

    :sswitch_d
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/lit8 v1, v1, -0x27

    aput v2, v0, v1

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/2addr v1, v4

    const v4, 0x1acb9c

    add-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_e
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit8 v1, v1, 0x6c

    aput v9, v0, v1

    const-string v1, "\u06e0\u06e7\u06e1"

    move-object v4, v1

    move v5, v3

    goto/16 :goto_1

    :sswitch_f
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v1, v1, 0x340

    aput v14, v0, v1

    const-string v1, "\u06e8\u06e5\u06e0"

    move v4, v8

    goto/16 :goto_2

    :sswitch_10
    const-string v1, "AAj3oZat8w==\n"

    const-string v4, "I0my5aOVwiw=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/lit16 v5, v5, 0x23b2

    xor-int/2addr v1, v5

    if-ltz v1, :cond_b

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v1, "\u06e1\u06e2\u06e7"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move v11, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e8\u06e7\u06e1"

    goto/16 :goto_7

    :sswitch_11
    const-string v1, "Fmr/YemlVw==\n"

    const-string v4, "NVLOIt6dYys=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const-string v4, "\u06e1\u06e0\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move v15, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "1Q/R3E0YoA==\n"

    const-string v4, "9juXn35elzY=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    move v4, v8

    goto/16 :goto_8

    :sswitch_13
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v1, Lr9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/lit16 v4, v4, -0x24f9

    rem-int/2addr v1, v4

    if-gtz v1, :cond_c

    const-string v1, "\u06e8\u06e5\u06e0"

    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/2addr v1, v4

    const v4, 0x1a3f6e

    add-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sub-int/2addr v4, v5

    const v5, 0x1aaa26

    add-int/2addr v4, v5

    move v13, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "s1lcnh1T6A==\n"

    const-string v2, "kG5lpisQqhY=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v1

    if-gtz v1, :cond_e

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v1, "\u06e5\u06e2\u06e2"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e3\u06df\u06e4"

    :goto_a
    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "QbE9tbFRAA==\n"

    const-string v4, "Yvd7jfBnNSU=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit16 v4, v4, -0xdae

    add-int/2addr v1, v4

    if-gtz v1, :cond_f

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v1, "\u06e7\u06e8"

    move v4, v6

    goto/16 :goto_4

    :cond_f
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v1, v4

    const v4, 0x1ab715

    add-int/2addr v1, v4

    move v10, v5

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "PoTpTxLyQg==\n"

    const-string v3, "HbCtDSSzAZM=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v3, :cond_0

    const/16 v3, 0x39

    sput v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v3, "\u06e4\u06e4\u06e1"

    invoke-static {v3}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move v3, v1

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_17
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v1, v1, -0xb2

    aput v8, v0, v1

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/lit16 v4, v4, 0x740

    rem-int/2addr v1, v4

    if-ltz v1, :cond_10

    const-string v1, "\u06df\u06e0\u06df"

    :goto_b
    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_10
    const-string v1, "\u06e0\u06df\u06e1"

    goto :goto_b

    :sswitch_18
    const-string v1, "AkQPO4jjwg==\n"

    const-string v4, "IQZODbCg+sA=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    goto/16 :goto_6

    :sswitch_19
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/lit16 v1, v1, 0x210

    aput v11, v0, v1

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/lit16 v4, v4, -0x19ee

    mul-int/2addr v1, v4

    if-gtz v1, :cond_5

    :cond_11
    const-string v1, "\u06e1\u06e4"

    move v4, v11

    goto/16 :goto_7

    :sswitch_1a
    const/16 v0, 0xc

    new-array v0, v0, [I

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/lit16 v4, v4, -0x181e

    div-int/2addr v1, v4

    if-eqz v1, :cond_11

    :goto_c
    const-string v1, "\u06e2\u06e2"

    goto/16 :goto_a

    :sswitch_1b
    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v1, v1, -0x263

    aput v15, v0, v1

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/2addr v1, v4

    const v4, 0x13da23

    xor-int/2addr v1, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_1c
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit8 v1, v1, 0x31

    aput v3, v0, v1

    goto :goto_c

    :sswitch_1d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdc23 -> :sswitch_5
        0xdc40 -> :sswitch_1b
        0xdc63 -> :sswitch_1d
        0xdce1 -> :sswitch_16
        0xdcf8 -> :sswitch_18
        0xdcfb -> :sswitch_a
        0x1aa71e -> :sswitch_13
        0x1aa745 -> :sswitch_e
        0x1aaac2 -> :sswitch_c
        0x1aab7b -> :sswitch_19
        0x1aab9c -> :sswitch_14
        0x1aab9d -> :sswitch_8
        0x1aabba -> :sswitch_f
        0x1aaea7 -> :sswitch_10
        0x1aaee6 -> :sswitch_12
        0x1aaf42 -> :sswitch_d
        0x1ab301 -> :sswitch_11
        0x1ab608 -> :sswitch_2
        0x1ab649 -> :sswitch_9
        0x1ab663 -> :sswitch_17
        0x1ab9cd -> :sswitch_6
        0x1aba61 -> :sswitch_1a
        0x1aba66 -> :sswitch_4
        0x1abac1 -> :sswitch_7
        0x1abde5 -> :sswitch_3
        0x1abe63 -> :sswitch_b
        0x1ac92d -> :sswitch_1
        0x1ac983 -> :sswitch_1c
        0x1ac9c2 -> :sswitch_15
    .end sparse-switch
.end method

.method public static a(Ljava/lang/String;)I
    .locals 10

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e8\u06e4"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v1

    move-object v2, v1

    move-object v4, v1

    move-object v6, v1

    move-object v5, v1

    move-object v0, v1

    move v9, v3

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v3, v3, -0xda3

    sub-int/2addr v1, v3

    if-gtz v1, :cond_1

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v1, "\u06e6\u06e1\u06e2"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v7, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const-string v1, "\u06e5\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto :goto_0

    :sswitch_2
    if-nez v6, :cond_5

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v3, v3, -0x1bff

    rem-int/2addr v1, v3

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v1, "\u06e5\u06e6"

    move-object v3, v0

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v0, v3

    move v9, v1

    goto :goto_0

    :cond_0
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/2addr v1, v3

    const v3, 0x1ac5b0

    xor-int/2addr v1, v3

    move v9, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e5\u06e5\u06e5"

    :goto_2
    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "zAJNOmsmcXSDSRdbMA==\n"

    const-string v3, "q2c5dRl2BAA=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/lit16 v3, v3, -0x1567

    rem-int/2addr v1, v3

    if-ltz v1, :cond_2

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v1, "\u06e3\u06e1"

    move-object v3, v5

    :goto_3
    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    move-object v5, v3

    move v9, v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v1, v3

    const v3, 0x1ac83d

    add-int/2addr v1, v3

    move v9, v1

    goto :goto_0

    :sswitch_4
    sget-object v1, Lr9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v3, :cond_3

    const/16 v3, 0x4c

    sput v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v3, "\u06e5\u06e4\u06e8"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v1

    move v9, v3

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e6\u06e1\u06e2"

    move-object v8, v0

    :goto_4
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v1

    move-object v0, v8

    move v9, v3

    goto/16 :goto_0

    :sswitch_5
    if-nez v4, :cond_6

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v3, v3, -0x1da5

    mul-int/2addr v1, v3

    if-gtz v1, :cond_4

    const/16 v1, 0x14

    sput v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v1, "\u06e8\u06e3\u06e0"

    :goto_5
    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e4\u06e3\u06e5"

    move-object v3, v5

    goto :goto_3

    :sswitch_6
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    :cond_5
    :sswitch_7
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/2addr v1, v3

    const v3, 0x1aa96c

    xor-int/2addr v1, v3

    move v9, v1

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/2addr v1, v3

    const v3, 0x1ac12d

    xor-int/2addr v1, v3

    move v9, v1

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-object v1, v4

    move-object v0, v4

    :goto_6
    const-string v3, "\u06df\u06e7\u06e7"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v1

    move v9, v3

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e0\u06e0\u06e7"

    move-object v1, v0

    move-object v3, v4

    goto/16 :goto_1

    :sswitch_a
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/lit16 v3, v3, 0x1ded

    xor-int/2addr v1, v3

    if-ltz v1, :cond_8

    const/16 v1, 0x39

    sput v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v1, "\u06e6\u06e2\u06e8"

    move-object v5, v6

    goto/16 :goto_2

    :cond_8
    const-string v1, "\u06e8\u06e6\u06e3"

    move-object v3, v6

    goto/16 :goto_3

    :sswitch_b
    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    mul-int/2addr v1, v3

    const v3, -0x1ace39

    xor-int/2addr v1, v3

    move v9, v1

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v0

    if-gtz v0, :cond_9

    const-string v0, "\u06e4\u06e3\u06e5"

    move-object v1, v7

    move-object v3, v0

    move-object v8, v5

    goto/16 :goto_4

    :cond_9
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v0, v1

    const v1, 0x1aabdd

    add-int/2addr v1, v0

    move-object v0, v5

    move v9, v1

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {v7, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v1

    if-gtz v1, :cond_a

    const/16 v1, 0x42

    sput v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v1, "\u06e7\u06e5\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v9, v1

    goto/16 :goto_0

    :cond_a
    move-object v1, v4

    goto :goto_6

    :sswitch_e
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v1, "\u06e8\u06e3\u06e0"

    goto/16 :goto_5

    :sswitch_f
    const-string v0, "\u06e3\u06e1"

    move-object v1, v7

    move-object v3, v0

    move-object v8, v2

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0xdca1 -> :sswitch_2
        0x1aa7ff -> :sswitch_9
        0x1aaae7 -> :sswitch_5
        0x1aab44 -> :sswitch_a
        0x1aabd9 -> :sswitch_3
        0x1aabdc -> :sswitch_4
        0x1aba46 -> :sswitch_e
        0x1abe29 -> :sswitch_7
        0x1abe45 -> :sswitch_8
        0x1ac14f -> :sswitch_b
        0x1ac187 -> :sswitch_d
        0x1ac1ac -> :sswitch_8
        0x1ac5c8 -> :sswitch_6
        0x1ac5e6 -> :sswitch_f
        0x1ac945 -> :sswitch_1
        0x1ac9a5 -> :sswitch_c
    .end sparse-switch
.end method

.method public static b(Landroid/view/View;Le9;ILjava/lang/String;)Landroid/widget/TextView;
    .locals 33

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const-string v28, "\u06e8\u06e1\u06e0"

    invoke-static/range {v28 .. v28}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v32

    move-object/from16 v28, v3

    move-object/from16 v29, v13

    move-object/from16 v30, v14

    move/from16 v31, v26

    :goto_0
    sparse-switch v32, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v3, 0x1

    move/from16 v0, p2

    if-eq v0, v3, :cond_2

    const-string v3, "wNmvW7p1kp7t\n"

    const-string v13, "gLrHOs4H/fE=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p3

    invoke-static {v0, v3}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_25

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v13, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v13, v13, -0x1136

    xor-int/2addr v3, v13

    if-gtz v3, :cond_10

    const-string v3, "\u06e2\u06e0\u06e1"

    invoke-static {v3}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_1

    const/16 v3, 0x35

    sput v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    move-object v3, v8

    :cond_0
    const-string v8, "\u06e6\u06e8\u06e1"

    invoke-static {v8}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v13

    move-object v8, v3

    move/from16 v32, v13

    goto :goto_0

    :cond_1
    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    or-int/2addr v3, v13

    const v13, 0x1ab051

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v13, v13, 0x1e51

    rem-int/2addr v3, v13

    if-ltz v3, :cond_3

    const-string v3, "\u06e5\u06e5\u06e4"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto :goto_0

    :cond_3
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v13, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v3, v13

    const v13, 0x1ac7f3

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto :goto_0

    :sswitch_3
    const-string v3, "UqJT+SCcPdw=\n"

    const-string v13, "O9Y2lHb1WKs=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "5bM=\n"

    const-string v13, "k9uwOkej+eM=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "H0L0D7uE\n"

    const-string v13, "ayOYZN72KQE=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v14, 0x0

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v13, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/lit16 v13, v13, 0x626

    mul-int/2addr v3, v13

    if-ltz v3, :cond_4

    const-string v3, "\u06e6\u06e0\u06e5"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v16, v14

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06df\u06df"

    move-object v3, v15

    :goto_1
    invoke-static {v13}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v13

    move-object v15, v3

    move-object/from16 v16, v14

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_4
    new-instance v9, Li00;

    invoke-direct {v9}, Li00;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    invoke-static {v0, v9, v1, v3, v2}, Lr9;->c(Lg00;Li00;Le9;Ljava/util/ArrayList;Landroid/view/View;)V

    iget-object v8, v9, Li00;->b:Ljava/lang/Object;

    if-nez v8, :cond_6

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v13, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v13, v13, -0xd77

    xor-int/2addr v8, v13

    if-gtz v8, :cond_0

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v8, "\u06e8\u06e6\u06e6"

    invoke-static {v8}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v13

    move-object v8, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "\u06e8\u06e0\u06e4"

    move/from16 v19, v21

    :goto_2
    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_6
    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v4, v4, -0x1ac7

    mul-int/2addr v3, v4

    if-ltz v3, :cond_5

    const-string v3, "\u06e3\u06e2\u06e0"

    move-object v4, v10

    :goto_3
    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u06e2\u06e7"

    move-object v4, v10

    :goto_4
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_6
    move-object v8, v3

    :cond_7
    :sswitch_7
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v13, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/lit16 v13, v13, 0x220e

    rem-int/2addr v3, v13

    if-gtz v3, :cond_8

    const/16 v3, 0x5b

    sput v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v3, "\u06e3\u06e5\u06e0"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v3, v13

    const v13, 0x1ab971

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_8
    move-object v3, v12

    :cond_9
    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v12

    if-gtz v12, :cond_a

    const/4 v12, 0x6

    sput v12, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v12, "\u06e2\u06e7\u06e4"

    move-object v13, v12

    move-object v14, v3

    :goto_5
    invoke-static {v13}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v12, v14

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_a
    sget v12, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v12, v13

    const v13, 0x1aa265

    xor-int/2addr v13, v12

    move-object v12, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_9
    move/from16 v0, v22

    move/from16 v1, v31

    if-ge v0, v1, :cond_d

    move/from16 v0, v22

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/lit16 v13, v13, 0x2e5

    add-int v17, v22, v13

    check-cast v3, Landroid/widget/TextView;

    sget v13, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v13, :cond_b

    const-string v13, "\u06e5\u06e7\u06e6"

    move-object/from16 v14, v16

    goto/16 :goto_1

    :cond_b
    sget v13, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v14, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    div-int/2addr v13, v14

    const v14, 0x1abac4

    xor-int/2addr v13, v14

    move-object v15, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_a
    new-instance v3, Lg00;

    invoke-direct {v3}, Lg00;-><init>()V

    move-object/from16 v0, p1

    iget-object v13, v0, Le9;->f:Landroid/widget/TextView;

    if-eqz v13, :cond_23

    invoke-virtual {v13}, Landroid/view/View;->getId()I

    move-result v18

    sget v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v14, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int/lit16 v14, v14, 0x22c3

    or-int/2addr v13, v14

    if-ltz v13, :cond_c

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    :goto_6
    const-string v13, "\u06e8\u06e8\u06e6"

    invoke-static {v13}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v23, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :cond_c
    sget v13, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v14, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/2addr v13, v14

    const v14, 0x1ac2c4

    add-int/2addr v13, v14

    move-object/from16 v23, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :cond_d
    :sswitch_b
    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v3, :cond_e

    const-string v3, "\u06e8\u06e0\u06e1"

    invoke-static {v3}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e1\u06e1\u06e4"

    move-object v13, v3

    :goto_7
    invoke-static {v13}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_f
    :sswitch_c
    const-string v3, "\u06e6\u06e4\u06e8"

    :goto_8
    invoke-static {v3}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_10
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v13, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/2addr v3, v13

    const v13, 0x1ab6c1

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_d
    move/from16 v0, v19

    move-object/from16 v1, v23

    iput v0, v1, Lg00;->a:I

    const/4 v3, -0x1

    move/from16 v0, v19

    if-ne v0, v3, :cond_1e

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    sget-object v3, Lpb0;->G0:Ljava/util/List;

    sget v14, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v26, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int v14, v14, v26

    const v26, 0x1ab668

    add-int v14, v14, v26

    move-object/from16 v28, v3

    move-object/from16 v29, v13

    move/from16 v32, v14

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, v28

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v13, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v13, v13, 0x2246

    div-int/2addr v3, v13

    if-eqz v3, :cond_11

    :cond_11
    const-string v3, "\u06e7\u06e5\u06e3"

    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_f
    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v3, :cond_12

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move/from16 v3, v18

    :goto_9
    const-string v13, "\u06df\u06e6\u06e0"

    invoke-static {v13}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v13

    move/from16 v32, v13

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_12
    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v13, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v3, v13

    const v13, 0x1abf09

    add-int/2addr v3, v13

    move/from16 v32, v3

    move/from16 v19, v18

    goto/16 :goto_0

    :sswitch_10
    const/4 v3, -0x1

    sget v13, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v13, :cond_15

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v13, "\u06e0\u06e6\u06e5"

    invoke-static {v13}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v13

    move/from16 v21, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_11
    const-string v3, "\u06e3\u06e2"

    move-object v13, v3

    move-object v14, v12

    goto/16 :goto_5

    :sswitch_12
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v3, :cond_13

    const-string v3, "\u06e7\u06e6"

    invoke-static {v3}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_13
    const-string v13, "\u06e0\u06e3\u06e7"

    move-object/from16 v3, v20

    :goto_a
    invoke-static {v13}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v20, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual {v15}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v3, "9z/qMNeA4uukL+ow14Oz9/M=\n"

    const-string v13, "2RW2VKyxztk=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v13, "pattern"

    invoke-static {v13, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    const-string v24, "\u06e3\u06e3"

    move-object v13, v3

    move-object/from16 v26, v24

    :goto_b
    invoke-static/range {v26 .. v26}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v24, v13

    move-object/from16 v25, v14

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p1

    iget-object v3, v0, Le9;->f:Landroid/widget/TextView;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_f

    move-object/from16 v0, p1

    iget-object v3, v0, Le9;->f:Landroid/widget/TextView;

    sget v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v13, :cond_14

    const-string v13, "\u06e3\u06e8\u06e3"

    goto :goto_a

    :cond_14
    const-string v13, "\u06e1\u06e3\u06e7"

    move-object/from16 v20, v3

    goto/16 :goto_7

    :sswitch_15
    iput-object v7, v9, Li00;->b:Ljava/lang/Object;

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v13, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/lit16 v13, v13, 0xdb

    mul-int/2addr v3, v13

    if-gtz v3, :cond_16

    move/from16 v3, v21

    :cond_15
    const-string v13, "\u06e8\u06e2\u06df"

    invoke-static {v13}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v13

    move/from16 v21, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e4\u06e2\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_16
    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v13, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v3, v13

    const v13, 0x1ac6b6

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_17
    :sswitch_17
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v13, v13, -0x1767

    add-int/2addr v3, v13

    if-ltz v3, :cond_18

    const/16 v3, 0x2c

    sput v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v3, "\u06e1\u06e0\u06e6"

    goto/16 :goto_4

    :cond_18
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v13, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v3, v13

    const v13, 0xd916

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_18
    const-string v3, "<this>"

    move-object/from16 v0, v28

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface/range {v28 .. v28}, Ljava/util/List;->size()I

    move-result v3

    sget v11, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit8 v11, v11, 0xc

    if-ge v11, v3, :cond_29

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v13, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/lit16 v13, v13, -0x169f

    sub-int/2addr v3, v13

    if-gtz v3, :cond_19

    const/4 v3, 0x7

    sput v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v3, "\u06e4\u06e2\u06e7"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e6\u06e0\u06e5"

    goto/16 :goto_3

    :sswitch_19
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v12, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/lit16 v12, v12, 0x756

    add-int/2addr v3, v12

    if-ltz v3, :cond_1a

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v3, "\u06df\u06e0\u06e6"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v12, v30

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_1a
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v3, v12

    const v12, 0x1aa75f

    add-int/2addr v3, v12

    move-object/from16 v12, v30

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_1a
    const-string v3, "SzK3rTJYyHlLKK/hcF6JdEQ0r+FmVIl5Sin2r2dXxTdRPqukMlrHc1cosqU8TMBzQiKv70Ze0WNz\nLr62\n"

    const-string v13, "JUfbwRI7qRc=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v20

    invoke-static {v3, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_1b

    const/16 v3, 0x21

    sput v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v3, "\u06e3\u06e3\u06e4"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_1b
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v13, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/2addr v3, v13

    const v13, 0x1b3df3

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v27, 0x0

    sget v13, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v14, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v14, v14, -0x114b

    div-int/2addr v13, v14

    if-eqz v13, :cond_1c

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v13, "\u06e5\u06e2"

    invoke-static {v13}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v13

    move/from16 v31, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :cond_1c
    const-string v13, "\u06e8\u06e0\u06e0"

    invoke-static {v13}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v13

    move/from16 v31, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_1c
    const-string v3, "compile(...)"

    move-object/from16 v0, v24

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "input"

    move-object/from16 v0, v25

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {v24 .. v25}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_21

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v3, :cond_1d

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v3, "\u06e5\u06e4\u06e0"

    invoke-static {v3}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    move/from16 v22, v17

    goto/16 :goto_0

    :cond_1d
    const-string v3, "\u06df\u06e0\u06e2"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    move/from16 v22, v17

    goto/16 :goto_0

    :cond_1e
    :sswitch_1d
    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v13, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    add-int/lit16 v13, v13, 0x18c9

    add-int/2addr v3, v13

    if-gtz v3, :cond_1f

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v3, "\u06e8\u06e0\u06e7"

    move-object v13, v3

    goto/16 :goto_7

    :cond_1f
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v13, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v3, v13

    const v13, 0x388ff

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_1e
    const-string v3, "yxk=\n"

    const-string v13, "on02EkBuOB8=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, v29

    invoke-virtual {v0, v12, v3, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v23

    iput v3, v0, Lg00;->a:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/2addr v3, v13

    const v13, 0xdf0f

    xor-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_1f
    const-string v3, "\u06e1\u06e4\u06df"

    :goto_c
    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_20
    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_9

    const-string v12, "32qVOYe2ovHjd4cogYC44A==\n"

    const-string v13, "vAL0TfPfzJY=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    sget v12, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v14, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/lit16 v14, v14, -0x1add

    mul-int/2addr v12, v14

    if-ltz v12, :cond_20

    const/16 v12, 0x43

    sput v12, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v12, "\u06e3\u06e2"

    invoke-static {v12}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v30, v13

    move-object v12, v3

    move/from16 v32, v14

    goto/16 :goto_0

    :cond_20
    const-string v12, "\u06e4\u06df\u06e7"

    invoke-static {v12}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v30, v13

    move-object v12, v3

    move/from16 v32, v14

    goto/16 :goto_0

    :cond_21
    move/from16 v3, v17

    :goto_d
    sget v13, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v14, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    or-int/lit16 v14, v14, -0x1e2e

    add-int/2addr v13, v14

    if-gtz v13, :cond_22

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v13, "\u06df\u06e6\u06e3"

    invoke-static {v13}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v13

    move/from16 v32, v13

    move/from16 v22, v3

    goto/16 :goto_0

    :cond_22
    const-string v13, "\u06e7\u06e4\u06e0"

    invoke-static {v13}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v13

    move/from16 v32, v13

    move/from16 v22, v3

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v3, v23

    :cond_23
    sget v13, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v14, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/lit16 v14, v14, -0x1390

    div-int/2addr v13, v14

    if-eqz v13, :cond_24

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v26, "\u06e5\u06df\u06e1"

    move-object/from16 v13, v24

    move-object/from16 v23, v3

    move-object/from16 v14, v25

    goto/16 :goto_b

    :cond_24
    const-string v26, "\u06e0\u06e6\u06e5"

    move-object/from16 v13, v24

    move-object/from16 v23, v3

    move-object/from16 v14, v25

    goto/16 :goto_b

    :cond_25
    :sswitch_22
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v3

    if-gtz v3, :cond_26

    const/16 v3, 0x2f

    sput v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v3, "\u06e1\u06e0\u06df"

    goto/16 :goto_8

    :cond_26
    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v13, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/2addr v3, v13

    const v13, 0x1ab63b

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_23
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_27

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v3, "\u06e7\u06e2\u06e8"

    invoke-static {v3}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_27
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v13, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/2addr v3, v13

    const v13, 0x1ac58d

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_24
    iget-object v3, v9, Li00;->b:Ljava/lang/Object;

    if-nez v3, :cond_7

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2e

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v3, :cond_28

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v3, "\u06e2\u06e2\u06df"

    move-object/from16 v7, v16

    goto/16 :goto_2

    :cond_28
    move-object/from16 v7, v16

    move/from16 v3, v19

    goto/16 :goto_9

    :sswitch_25
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v13, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/2addr v3, v13

    const v13, 0x1ac381

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_26
    const/4 v10, 0x0

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v13, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v3, v13

    const v13, 0x1ac4ac

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_29
    :sswitch_27
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v3, :cond_2a

    const/16 v3, 0x5b

    sput v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v3, "\u06e3\u06e8\u06e5"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_2a
    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v13, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/2addr v3, v13

    const v13, -0x1aba08

    xor-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_28
    const/16 v20, 0x0

    :goto_e
    :sswitch_29
    return-object v20

    :sswitch_2a
    move-object v3, v6

    :goto_f
    const-string v7, "\u06e6\u06e1\u06e0"

    invoke-static {v7}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v13

    move-object v7, v3

    move/from16 v32, v13

    goto/16 :goto_0

    :sswitch_2b
    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v3, "\u06e5\u06e0\u06e1"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_2c
    iget-object v5, v9, Li00;->b:Ljava/lang/Object;

    if-eqz v5, :cond_17

    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v13, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/lit16 v13, v13, -0x9d3

    or-int/2addr v3, v13

    if-ltz v3, :cond_2b

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-object v3, v7

    goto :goto_f

    :cond_2b
    move-object/from16 v3, v23

    goto/16 :goto_6

    :sswitch_2d
    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v13, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit16 v13, v13, -0x18f2

    or-int/2addr v3, v13

    if-ltz v3, :cond_2c

    const/16 v3, 0x2c

    sput v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v3, "\u06e1\u06e6\u06e3"

    :goto_10
    invoke-static {v3}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_2c
    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v13, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v3, v13

    const v13, 0x1ac8ec

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_2e
    iput-object v15, v9, Li00;->b:Ljava/lang/Object;

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v13, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/lit16 v13, v13, 0x1afa

    xor-int/2addr v3, v13

    if-gtz v3, :cond_2d

    const-string v3, "\u06e1\u06e3\u06e7"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_2d
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v13, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v3, v13

    const v13, 0x1aaf7d

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_2f
    move-object v3, v5

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v20, v3

    goto :goto_e

    :sswitch_30
    const-string v3, "\u06e7\u06e4\u06e0"

    move/from16 v22, v27

    goto :goto_10

    :sswitch_31
    move-object v3, v5

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p1

    iput-object v3, v0, Le9;->f:Landroid/widget/TextView;

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v13, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v3, v13

    const v13, 0xdce8

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :cond_2e
    :sswitch_32
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v3, :cond_2f

    const-string v3, "\u06df\u06e4\u06e8"

    goto/16 :goto_c

    :cond_2f
    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v13, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/2addr v3, v13

    const v13, 0x1ac5eb

    add-int/2addr v3, v13

    move/from16 v32, v3

    goto/16 :goto_0

    :sswitch_33
    move/from16 v3, v22

    goto/16 :goto_d

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdc5d -> :sswitch_4
        0xdc5f -> :sswitch_23
        0xdc60 -> :sswitch_1c
        0xdc9d -> :sswitch_2f
        0xdcdf -> :sswitch_27
        0x1aa721 -> :sswitch_2e
        0x1aa725 -> :sswitch_33
        0x1aa75c -> :sswitch_1e
        0x1aa7d9 -> :sswitch_12
        0x1aaaff -> :sswitch_29
        0x1aab44 -> :sswitch_25
        0x1aab9f -> :sswitch_10
        0x1aaec4 -> :sswitch_24
        0x1aaf05 -> :sswitch_1a
        0x1aaf1c -> :sswitch_2d
        0x1aaf22 -> :sswitch_2
        0x1ab263 -> :sswitch_c
        0x1ab29f -> :sswitch_25
        0x1ab35f -> :sswitch_32
        0x1ab607 -> :sswitch_b
        0x1ab661 -> :sswitch_14
        0x1ab684 -> :sswitch_22
        0x1ab687 -> :sswitch_1d
        0x1ab71b -> :sswitch_18
        0x1ab71e -> :sswitch_7
        0x1ab9cc -> :sswitch_19
        0x1aba0b -> :sswitch_26
        0x1aba29 -> :sswitch_2c
        0x1aba84 -> :sswitch_1
        0x1abaa5 -> :sswitch_2
        0x1abac0 -> :sswitch_13
        0x1abda6 -> :sswitch_2a
        0x1abe21 -> :sswitch_6
        0x1abe63 -> :sswitch_17
        0x1abe84 -> :sswitch_1f
        0x1abea0 -> :sswitch_16
        0x1ac16b -> :sswitch_e
        0x1ac185 -> :sswitch_15
        0x1ac1a6 -> :sswitch_23
        0x1ac1c6 -> :sswitch_f
        0x1ac1ea -> :sswitch_a
        0x1ac240 -> :sswitch_2d
        0x1ac25f -> :sswitch_1b
        0x1ac56c -> :sswitch_20
        0x1ac5a3 -> :sswitch_9
        0x1ac5c5 -> :sswitch_11
        0x1ac5ca -> :sswitch_28
        0x1ac5e3 -> :sswitch_2b
        0x1ac8e8 -> :sswitch_30
        0x1ac8ec -> :sswitch_d
        0x1ac907 -> :sswitch_3
        0x1ac90b -> :sswitch_8
        0x1ac925 -> :sswitch_5
        0x1ac9a8 -> :sswitch_21
        0x1ac9e6 -> :sswitch_31
    .end sparse-switch
.end method

.method public static final c(Lg00;Li00;Le9;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 21

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/16 v17, 0x0

    const-string v16, "\u06e2\u06e4\u06e3"

    invoke-static/range {v16 .. v16}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v18, v4

    move-object/from16 v19, v8

    move/from16 v20, v17

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/lit16 v8, v8, 0xaa4

    xor-int/2addr v4, v8

    if-ltz v4, :cond_d

    const-string v4, "\u06e0\u06e0\u06e7"

    :goto_1
    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :sswitch_1
    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/lit16 v8, v8, -0x8b1

    xor-int/2addr v4, v8

    if-gtz v4, :cond_1

    const-string v4, "\u06e3\u06e2"

    :goto_2
    invoke-static {v4}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :cond_1
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v4, v8

    const v8, -0x1ab2d7

    xor-int/2addr v4, v8

    move/from16 v16, v4

    goto :goto_0

    :sswitch_2
    :try_start_0
    const-string v4, "Is00syw6xKYe0CaiKgzetx7JMKEs\n"

    const-string v8, "QaVVx1hTqsE=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    move-object/from16 v0, v19

    invoke-static {v0, v4, v8}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-eqz v4, :cond_17

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/lit16 v8, v8, 0x1ac6

    add-int/2addr v4, v8

    if-ltz v4, :cond_2

    const-string v4, "\u06e6\u06e2"

    :goto_3
    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :cond_2
    const-string v4, "\u06e3\u06e4\u06e0"

    :goto_4
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :catchall_0
    move-exception v4

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v4

    if-gtz v4, :cond_3

    const/16 v4, 0x3d

    sput v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v4, "\u06e6\u06df\u06e0"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :cond_3
    const-string v4, "\u06e0\u06e0\u06e8"

    :goto_5
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :sswitch_3
    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v4, :cond_4

    const-string v8, "\u06e2\u06e4\u06e3"

    move-object v4, v7

    :goto_6
    invoke-static {v8}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_4
    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v4, v8

    const v8, 0x1ac9b7

    xor-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, p4

    instance-of v8, v0, Landroid/widget/TextView;

    const/4 v4, 0x0

    if-eqz v8, :cond_9

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/lit16 v9, v9, -0x24c

    mul-int/2addr v8, v9

    if-gtz v8, :cond_5

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v8, "\u06e2\u06e3\u06e6"

    invoke-static {v8}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v8

    move v9, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u06e8\u06df\u06e7"

    move-object v8, v14

    move-object/from16 v16, v9

    move/from16 v17, v4

    :goto_7
    invoke-static/range {v16 .. v16}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v8

    move/from16 v9, v17

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "input"

    invoke-static {v4, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-nez v4, :cond_8

    move-object/from16 v0, p2

    iget-object v4, v0, Le9;->e:Landroid/view/View;

    sget v8, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v13, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v13, v13, -0xf20

    div-int/2addr v8, v13

    if-eqz v8, :cond_6

    const-string v8, "\u06e7\u06e6\u06df"

    invoke-static {v8}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e1\u06e7\u06e2"

    :goto_8
    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {v14}, Landroid/view/View;->getId()I

    move-result v4

    move-object/from16 v0, p0

    iget v8, v0, Lg00;->a:I

    if-ne v4, v8, :cond_b

    move-object/from16 v0, p4

    move-object/from16 v1, p1

    iput-object v0, v1, Li00;->b:Ljava/lang/Object;

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/lit16 v8, v8, -0x2601

    mul-int/2addr v4, v8

    if-ltz v4, :cond_7

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v4, "\u06e6\u06e6\u06e1"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/2addr v4, v8

    const v8, -0x1ac3bc

    xor-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_8
    :sswitch_7
    move v4, v9

    :cond_9
    const-string v8, "\u06df\u06e3\u06df"

    move v9, v4

    :goto_9
    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p4

    instance-of v4, v0, Landroid/view/ViewGroup;

    if-eqz v4, :cond_14

    move-object/from16 v4, p4

    check-cast v4, Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v11, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/lit16 v11, v11, -0x590

    or-int/2addr v8, v11

    if-ltz v8, :cond_a

    const/16 v8, 0x4c

    sput v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v8, "\u06e5\u06e4\u06e5"

    move v11, v10

    :goto_a
    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v8

    move-object v10, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e5\u06e4\u06e0"

    move v11, v10

    :goto_b
    invoke-static {v8}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v10, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_b
    :sswitch_9
    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    div-int/lit16 v8, v8, 0xb83

    add-int/2addr v4, v8

    if-gtz v4, :cond_c

    const-string v4, "\u06e2\u06e8\u06e8"

    move-object v8, v4

    goto :goto_9

    :cond_c
    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v8, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v4, v8

    const v8, 0xe072

    add-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v4, v8

    const v8, 0x1ab618

    add-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_e
    :sswitch_a
    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v4, :cond_f

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v8, "\u06df\u06e0\u06e6"

    move-object v4, v12

    :goto_c
    invoke-static {v8}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v12, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06e6\u06e3\u06e0"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p2

    iget-object v4, v0, Le9;->c:Landroid/widget/TextView;

    move-object/from16 v0, p4

    if-eq v0, v4, :cond_8

    move-object/from16 v0, p2

    iget-object v4, v0, Le9;->d:Landroid/widget/TextView;

    move-object/from16 v0, p4

    if-eq v0, v4, :cond_8

    const-string v4, "lJYdQ1RWasjHhh1DVFU71JA=\n"

    const-string v7, "urxBJy9nRvo=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    div-int/lit16 v8, v8, 0x3c2

    xor-int/2addr v7, v8

    if-ltz v7, :cond_10

    const-string v7, "\u06e6\u06e8\u06e4"

    invoke-static {v7}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u06e5\u06e2\u06e6"

    move-object v8, v7

    goto/16 :goto_6

    :sswitch_c
    if-eqz v18, :cond_1b

    move-object/from16 v0, v18

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    const/4 v8, 0x1

    if-ne v4, v8, :cond_1b

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sub-int/2addr v4, v8

    const v8, 0x1abcdf

    add-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_11
    :sswitch_d
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v4

    if-ltz v4, :cond_12

    const-string v4, "\u06e1\u06e2\u06e8"

    :goto_d
    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v8, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/2addr v4, v8

    const v8, 0x1ab70f

    add-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/lit16 v8, v8, 0x1f62

    or-int/2addr v4, v8

    if-ltz v4, :cond_13

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v4, "\u06e6\u06e7\u06e8"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e3\u06e8\u06e2"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_14
    :sswitch_f
    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v8, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v4, v8

    const v8, 0x124599

    xor-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_10
    :try_start_1
    const-string v4, "wbEbtcz0dyj9rAmkysJtOQ==\n"

    const-string v8, "otl6wbidGU8=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    move-object/from16 v0, v19

    invoke-static {v0, v4, v8}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    if-nez v4, :cond_11

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/lit16 v8, v8, 0x1d46

    sub-int/2addr v4, v8

    if-ltz v4, :cond_15

    const/16 v4, 0x2a

    sput v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v4, "\u06e2\u06e1\u06e8"

    goto/16 :goto_5

    :cond_15
    const-string v4, "\u06e8\u06e4\u06e4"

    invoke-static {v4}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_11
    :try_start_2
    invoke-static/range {v19 .. v19}, Lip;->l(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    rem-int/lit16 v8, v8, 0x1903

    add-int/2addr v4, v8

    if-ltz v4, :cond_16

    const-string v4, "\u06e2\u06e0\u06e5"

    goto/16 :goto_4

    :cond_16
    const-string v8, "\u06df\u06e0\u06e2"

    move-object v4, v13

    goto/16 :goto_8

    :cond_17
    :sswitch_12
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v4

    if-ltz v4, :cond_18

    const-string v8, "\u06e1\u06e4\u06df"

    move-object v4, v10

    goto/16 :goto_b

    :cond_18
    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sub-int/2addr v4, v8

    const v8, 0x1ac36a

    add-int/2addr v4, v8

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_13
    const-string v4, "\u06df\u06e3\u06e6"

    goto/16 :goto_2

    :sswitch_14
    move-object/from16 v0, p4

    if-eq v0, v13, :cond_8

    move-object/from16 v0, p4

    invoke-static {v13, v0}, Lr9;->d(Landroid/view/View;Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_8

    sget-object v4, Lin;->l:Ljava/lang/Class;

    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v16, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    move/from16 v0, v16

    div-int/lit16 v0, v0, 0x23a3

    move/from16 v16, v0

    xor-int v8, v8, v16

    if-gtz v8, :cond_19

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v8, "\u06e8\u06df\u06e7"

    invoke-static {v8}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v18, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_19
    sget v8, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v16, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int v8, v8, v16

    const v16, 0x1aca61

    add-int v8, v8, v16

    move-object/from16 v18, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual/range {p3 .. p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v4, :cond_1a

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v4, "\u06df\u06e0\u06e2"

    :goto_e
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_1a
    const-string v4, "\u06df\u06e3\u06df"

    goto :goto_e

    :cond_1b
    :sswitch_16
    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v8, v8, -0x1501

    xor-int/2addr v4, v8

    if-ltz v4, :cond_1c

    const-string v8, "\u06e6\u06e6\u06e5"

    move-object v4, v13

    goto/16 :goto_8

    :cond_1c
    const-string v4, "\u06e7\u06e1\u06e6"

    goto/16 :goto_d

    :sswitch_17
    const-string v4, "pattern"

    invoke-static {v4, v7}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v8, "compile(...)"

    invoke-static {v8, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v8

    if-gtz v8, :cond_1d

    const/16 v8, 0x2a

    sput v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v8, "\u06e6\u06e3\u06e0"

    invoke-static {v8}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v8

    move-object v12, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_1d
    const-string v8, "\u06e4\u06e2\u06e8"

    goto/16 :goto_c

    :sswitch_18
    move-object/from16 v4, p4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v15

    const-string v8, "+dqgJMuYppSwkfpZ\n"

    const-string v14, "nr/UcK7g0rw=\n"

    invoke-static {v8, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v8, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v8, :cond_1e

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v14, "\u06e6\u06e6\u06e4"

    move-object v8, v4

    move-object/from16 v16, v14

    move/from16 v17, v9

    goto/16 :goto_7

    :cond_1e
    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v14, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    mul-int/2addr v8, v14

    const v14, 0x1fe697

    xor-int/2addr v8, v14

    move-object v14, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_19
    :try_start_3
    move-object/from16 v0, p4

    check-cast v0, Landroid/widget/TextView;

    move-object v4, v0

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    move-object/from16 v0, p4

    check-cast v0, Landroid/widget/TextView;

    move-object v4, v0

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v4

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v8

    if-ltz v8, :cond_1f

    const/16 v8, 0xc

    sput v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v8, "\u06e1\u06e7\u06e2"

    invoke-static {v8}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v19, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_1f
    const-string v8, "\u06e3\u06e4\u06e2"

    invoke-static {v8}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v19, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_1a
    const-string v8, "\u06e5\u06e0\u06e8"

    move-object v4, v12

    goto/16 :goto_c

    :sswitch_1b
    move/from16 v0, v20

    if-ge v0, v11, :cond_14

    move/from16 v0, v20

    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "VSIUQ0UeyUFzM0guA1mM\n"

    const-string v8, "MkdgAC13pSU=\n"

    invoke-static {v5, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_f
    const-string v5, "\u06e5\u06e0\u06df"

    invoke-static {v5}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v8

    move-object v5, v4

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v4

    if-gtz v4, :cond_20

    const/16 v4, 0x4e

    sput v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v4, "\u06df\u06e3\u06df"

    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_20
    const-string v8, "\u06e2\u06e3\u06e0"

    move-object v4, v10

    goto/16 :goto_a

    :sswitch_1d
    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u06e4\u06e2\u06df"

    goto/16 :goto_1

    :sswitch_1e
    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_8

    invoke-virtual {v14}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v8, -0x1

    if-eq v4, v8, :cond_b

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v8, v8, -0x1ef8

    div-int/2addr v4, v8

    if-eqz v4, :cond_21

    move-object v4, v5

    goto :goto_f

    :cond_21
    const-string v4, "\u06e3\u06e8\u06e7"

    goto/16 :goto_d

    :sswitch_1f
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static {v0, v1, v2, v3, v5}, Lr9;->c(Lg00;Li00;Le9;Ljava/util/ArrayList;Landroid/view/View;)V

    move-object/from16 v0, p1

    iget-object v4, v0, Li00;->b:Ljava/lang/Object;

    if-eqz v4, :cond_e

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v4

    if-ltz v4, :cond_22

    const/16 v4, 0xe

    sput v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v4, "\u06e4\u06e8\u06e4"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_22
    const-string v8, "\u06e6\u06e8\u06e4"

    move-object v4, v7

    goto/16 :goto_6

    :sswitch_20
    const-string v4, "\u06df\u06e3\u06e6"

    invoke-static {v4}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    move/from16 v20, v9

    goto/16 :goto_0

    :sswitch_21
    :try_start_4
    move-object/from16 v0, p4

    move-object/from16 v1, p1

    iput-object v0, v1, Li00;->b:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v8, v8, 0xcdd

    or-int/2addr v4, v8

    if-ltz v4, :cond_23

    const-string v4, "\u06e7\u06e1\u06e6"

    invoke-static {v4}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e3\u06e8\u06e2"

    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_22
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit8 v4, v4, 0x6b

    add-int v8, v20, v4

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v4

    if-ltz v4, :cond_24

    const/16 v4, 0x22

    sput v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v4, "\u06e2\u06e3\u06e0"

    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    move/from16 v20, v8

    goto/16 :goto_0

    :cond_24
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v16, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int v4, v4, v16

    const v16, 0x1aaa50

    add-int v4, v4, v16

    move/from16 v16, v4

    move/from16 v20, v8

    goto/16 :goto_0

    :sswitch_23
    const-string v4, "\u06e1\u06e1\u06e8"

    goto/16 :goto_3

    :sswitch_24
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0xdcbc -> :sswitch_19
        0x1aa721 -> :sswitch_10
        0x1aa77b -> :sswitch_8
        0x1aa782 -> :sswitch_1b
        0x1aa7dc -> :sswitch_23
        0x1aaae8 -> :sswitch_12
        0x1aab3f -> :sswitch_e
        0x1aaec8 -> :sswitch_13
        0x1aaf7c -> :sswitch_14
        0x1ab267 -> :sswitch_4
        0x1ab289 -> :sswitch_7
        0x1ab2bf -> :sswitch_7
        0x1ab2c5 -> :sswitch_9
        0x1ab2e1 -> :sswitch_1d
        0x1ab69f -> :sswitch_21
        0x1ab6a1 -> :sswitch_11
        0x1ab71d -> :sswitch_24
        0x1ab722 -> :sswitch_6
        0x1aba21 -> :sswitch_1a
        0x1aba29 -> :sswitch_a
        0x1aba2a -> :sswitch_5
        0x1aba44 -> :sswitch_1c
        0x1abae0 -> :sswitch_1e
        0x1abda4 -> :sswitch_1f
        0x1abdad -> :sswitch_f
        0x1abde9 -> :sswitch_17
        0x1abe21 -> :sswitch_20
        0x1abe26 -> :sswitch_24
        0x1ac147 -> :sswitch_d
        0x1ac1c3 -> :sswitch_22
        0x1ac1ca -> :sswitch_24
        0x1ac221 -> :sswitch_b
        0x1ac224 -> :sswitch_16
        0x1ac244 -> :sswitch_12
        0x1ac262 -> :sswitch_3
        0x1ac54c -> :sswitch_15
        0x1ac5e0 -> :sswitch_13
        0x1ac603 -> :sswitch_f
        0x1ac8d0 -> :sswitch_18
        0x1ac92e -> :sswitch_f
        0x1ac945 -> :sswitch_c
        0x1ac968 -> :sswitch_2
        0x1ac986 -> :sswitch_1
    .end sparse-switch
.end method

.method public static d(Landroid/view/View;Landroid/view/View;)Z
    .locals 8

    const/4 v5, 0x0

    const-string v0, "\u06df\u06e4\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v5

    move-object v2, v5

    move-object v7, v5

    move-object v4, v5

    move-object v6, v5

    move v3, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e4\u06e7\u06df"

    move-object v3, v0

    :goto_1
    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e2\u06e2\u06e7"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v5

    move v3, v0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_2
    const-string v3, "\u06e4\u06e7\u06df"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/lit16 v3, v3, 0x95e

    or-int/2addr v0, v3

    if-ltz v0, :cond_1

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v0, "\u06df\u06e3\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v0, v3

    const v3, 0x1aba74

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v3, v3, 0x18cb

    mul-int/2addr v0, v3

    if-ltz v0, :cond_2

    const-string v0, "\u06df\u06e4\u06e4"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v4

    move v3, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e3\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v4

    move v3, v0

    goto :goto_0

    :sswitch_4
    instance-of v0, v1, Landroid/view/View;

    if-eqz v0, :cond_b

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x4f

    sput v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    :cond_3
    const-string v0, "\u06e8\u06e3\u06e3"

    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e4\u06e2\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_5
    instance-of v0, v2, Landroid/view/View;

    if-eqz v0, :cond_b

    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v3, v3, 0x17ac

    xor-int/2addr v0, v3

    if-gtz v0, :cond_3

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    :cond_5
    const-string v0, "\u06e4\u06e8\u06e7"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_6
    const/4 v0, 0x1

    :goto_3
    return v0

    :sswitch_7
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v0

    if-ltz v0, :cond_6

    const-string v0, "\u06df\u06e8\u06e5"

    move-object v3, v0

    goto/16 :goto_1

    :cond_6
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/2addr v0, v3

    const v3, 0x1aa7a0

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v0, "\u06e4\u06e4\u06e6"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/lit16 v3, v3, 0x213

    sub-int/2addr v0, v3

    if-gtz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v0, "\u06e1\u06e3\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v3

    const v3, 0xd906

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "V20xdIY=\n"

    const-string v3, "NAVYGOJqL+U=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e8\u06e5\u06e3"

    :goto_4
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_b
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/lit16 v3, v3, -0x2377

    xor-int/2addr v0, v3

    if-gtz v0, :cond_9

    const/4 v0, 0x3

    sput v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v0, "\u06e6\u06df\u06df"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/2addr v0, v3

    const v3, 0x1ac337

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_c
    move-object v0, v1

    check-cast v0, Landroid/view/View;

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v3, :cond_a

    const/16 v3, 0x29

    sput v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v3, "\u06e3\u06e0\u06e1"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v0

    goto/16 :goto_0

    :cond_a
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v7, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sub-int/2addr v3, v7

    const v7, 0x1aa58c

    add-int/2addr v3, v7

    move-object v7, v0

    goto/16 :goto_0

    :sswitch_d
    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sub-int/2addr v0, v3

    const v3, 0x1aa907

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    goto/16 :goto_3

    :sswitch_f
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v0, "\u06e4\u06e2\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_b
    :sswitch_10
    const-string v0, "\u06e3\u06df\u06e7"

    move-object v3, v0

    goto/16 :goto_1

    :cond_c
    :sswitch_11
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v0, "\u06e1\u06e2\u06e3"

    goto :goto_4

    :cond_d
    const-string v0, "\u06e0\u06e6\u06e2"

    move-object v3, v0

    goto/16 :goto_1

    :sswitch_12
    if-eqz v6, :cond_c

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v0, :cond_e

    const/16 v0, 0x55

    sput v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v0, "\u06e0\u06e3\u06e5"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e5\u06e6\u06e8"

    goto/16 :goto_4

    :sswitch_13
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v3, v3, -0x4b2

    rem-int/2addr v0, v3

    if-ltz v0, :cond_f

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v0, "\u06e7\u06e0\u06df"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v7

    move v3, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sub-int/2addr v0, v3

    const v3, 0x1abb1b

    add-int/2addr v0, v3

    move-object v6, v7

    move v3, v0

    goto/16 :goto_0

    :sswitch_14
    move-object v0, v2

    check-cast v0, Landroid/view/View;

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v4, v4, 0x140d

    xor-int/2addr v3, v4

    if-gtz v3, :cond_10

    const-string v3, "\u06e8\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v0

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e2\u06e2\u06e7"

    move-object v4, v0

    goto/16 :goto_1

    :sswitch_15
    if-ne v6, p0, :cond_8

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_11

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-object v0, v6

    goto/16 :goto_2

    :cond_11
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/2addr v0, v3

    const v3, 0x1aab42

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcc1 -> :sswitch_0
        0xdcda -> :sswitch_4
        0x1aa780 -> :sswitch_13
        0x1aa79f -> :sswitch_a
        0x1aaac5 -> :sswitch_0
        0x1aab42 -> :sswitch_6
        0x1aab9c -> :sswitch_e
        0x1aaefe -> :sswitch_7
        0x1ab2a7 -> :sswitch_3
        0x1ab60b -> :sswitch_f
        0x1ab624 -> :sswitch_b
        0x1ab6c1 -> :sswitch_0
        0x1aba24 -> :sswitch_c
        0x1aba66 -> :sswitch_5
        0x1ababc -> :sswitch_12
        0x1abae3 -> :sswitch_1
        0x1abe67 -> :sswitch_15
        0x1ac185 -> :sswitch_10
        0x1ac203 -> :sswitch_2
        0x1ac526 -> :sswitch_8
        0x1ac589 -> :sswitch_d
        0x1ac8ec -> :sswitch_11
        0x1ac948 -> :sswitch_14
        0x1ac986 -> :sswitch_9
    .end sparse-switch
.end method

.method public static final e(Le9;ILandroid/view/View;Landroid/view/View;)V
    .locals 18

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const-string v10, "\u06e6\u06e5\u06df"

    invoke-static {v10}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v10

    move-object v15, v3

    move-object/from16 v16, v9

    move/from16 v17, v10

    :goto_0
    sparse-switch v17, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v9, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v3, v9

    const v9, 0x1aae58

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p3

    instance-of v9, v0, Landroid/widget/ImageView;

    const/4 v3, 0x0

    if-eqz v9, :cond_b

    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v9, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v9, "\u06e5\u06e1\u06e3"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v9

    move v11, v3

    move/from16 v17, v9

    goto :goto_0

    :cond_1
    sget v9, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v10, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/2addr v9, v10

    const v10, 0x1ab79b

    add-int/2addr v9, v10

    move v11, v3

    move/from16 v17, v9

    goto :goto_0

    :cond_2
    :sswitch_2
    move v3, v7

    :cond_3
    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v9, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int/lit16 v9, v9, -0x2429

    rem-int/2addr v7, v9

    if-ltz v7, :cond_4

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v7, "\u06e3\u06df"

    move-object v9, v7

    move v10, v3

    :goto_1
    invoke-static {v9}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move v7, v10

    move/from16 v17, v3

    goto :goto_0

    :cond_4
    sget v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v9, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v7, v9

    const v9, 0x1aaee7

    add-int/2addr v9, v7

    move v7, v3

    move/from16 v17, v9

    goto :goto_0

    :sswitch_3
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/lit16 v9, v9, -0x202

    sub-int/2addr v3, v9

    if-ltz v3, :cond_5

    const-string v3, "\u06e0\u06e0\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto :goto_0

    :cond_5
    const-string v3, "\u06e1\u06e4\u06e8"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto :goto_0

    :sswitch_4
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getId()I

    move-result v3

    const/4 v9, -0x1

    if-eq v3, v9, :cond_0

    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getId()I

    move-result v9

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v9

    if-gtz v9, :cond_6

    const-string v9, "\u06e2\u06e2\u06e5"

    invoke-static {v9}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v16, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_6
    sget v9, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v10, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    mul-int/2addr v9, v10

    const v10, 0x18cad5

    xor-int/2addr v9, v10

    move-object/from16 v16, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :sswitch_5
    :try_start_1
    const-string v3, "ErqGr1/hyYkusYuySOP4jwO3hg==\n"

    const-string v9, "cdLn2yuIp+4=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    if-nez v3, :cond_12

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v3

    if-ltz v3, :cond_1a

    const/16 v3, 0x50

    sput v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    :goto_2
    const-string v3, "\u06e3\u06e1\u06e2"

    invoke-static {v3}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_7
    :sswitch_6
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v3

    if-ltz v3, :cond_8

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v3, "\u06e2\u06e4\u06e4"

    invoke-static {v3}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v9, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sub-int/2addr v3, v9

    const v9, 0x1abea8

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Le9;->e:Landroid/view/View;

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/lit16 v9, v9, -0xcdd

    mul-int/2addr v3, v9

    if-ltz v3, :cond_9

    const/16 v3, 0x27

    sput v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v3, "\u06e3\u06e1\u06e5"

    invoke-static {v3}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_9
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/2addr v3, v9

    const v9, 0x1abe92

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v3

    if-gtz v3, :cond_a

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v3, "\u06e2\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06e4\u06e0"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_9
    const-string v3, "\u06e4\u06e4\u06e5"

    :goto_3
    invoke-static {v3}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_a
    if-ge v6, v13, :cond_10

    invoke-virtual {v12, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-string v9, "rL8+8FqmBciKrmKdHOFA\n"

    const-string v10, "y9pKszLPaaw=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v9, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v9, v10

    const v10, 0x1ac294

    add-int/2addr v9, v10

    move-object v15, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :sswitch_b
    move v3, v11

    :cond_b
    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v9, :cond_c

    const-string v9, "\u06e6\u06e6\u06e7"

    invoke-static {v9}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v9

    move v11, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_c
    sget v9, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v10, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/2addr v9, v10

    const v10, 0x1ab03f

    add-int/2addr v9, v10

    move v11, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :sswitch_c
    const v3, 0x7e0b000e

    sget v9, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/2addr v3, v9

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, p3

    invoke-virtual {v0, v3, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const-string v3, "\u06e1\u06e2\u06e8"

    :goto_4
    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p0

    iget-object v3, v0, Le9;->b:Landroid/view/View;

    if-nez v3, :cond_2

    move-object/from16 v3, p3

    check-cast v3, Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    move-object v5, v4

    :goto_5
    const-string v4, "\u06e7\u06e7\u06e3"

    invoke-static {v4}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v9

    move-object v4, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_d
    :sswitch_e
    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v9, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/lit16 v9, v9, -0x2b0

    sub-int/2addr v3, v9

    if-ltz v3, :cond_e

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v3, "\u06e7\u06e4\u06e3"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e2\u06e4\u06df"

    move-object v9, v3

    move v10, v7

    :goto_6
    invoke-static {v9}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v7, v10

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_f
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v9, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v9, v9, -0xc3f

    or-int/2addr v3, v9

    if-ltz v3, :cond_f

    const/16 v3, 0x60

    sput v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v3, "\u06e0\u06e4\u06e8"

    move-object v9, v3

    move v10, v7

    goto :goto_6

    :cond_f
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v9, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sub-int/2addr v3, v9

    const v9, -0x1ac2f3

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_10
    :sswitch_10
    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v9, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v3, v9

    const v9, 0x1abf3d

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_11
    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v9, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/lit16 v9, v9, 0x248a

    mul-int/2addr v3, v9

    if-ltz v3, :cond_11

    const/16 v3, 0x62

    sput v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v3, "\u06e2\u06e7\u06e4"

    :goto_7
    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_11
    const-string v3, "\u06e2\u06e7\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_12
    :sswitch_12
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    div-int/lit16 v9, v9, -0x2585

    mul-int/2addr v3, v9

    if-eqz v3, :cond_13

    const/16 v3, 0x19

    sput v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v3, "\u06e5\u06df\u06e8"

    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_13
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v9, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v3, v9

    const v9, -0x1ac714

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_13
    :try_start_2
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Le9;->e:Landroid/view/View;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v3, :cond_14

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v3, "\u06df\u06e1\u06e1"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_14
    const-string v3, "\u06e0\u06e7\u06e4"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v3, v0, Le9;->e:Landroid/view/View;

    if-nez v3, :cond_7

    const/4 v3, 0x1

    move/from16 v0, p1

    if-eq v0, v3, :cond_1c

    const/16 v3, 0x22

    move/from16 v0, p1

    if-eq v0, v3, :cond_d

    const-string v3, "\u06e6\u06e2\u06e0"

    :goto_8
    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Le9;->e:Landroid/view/View;

    const-string v3, "\u06e6\u06e3\u06e2"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_16
    const/16 v3, 0x22

    move/from16 v0, p1

    if-ne v0, v3, :cond_1f

    move-object/from16 v3, p3

    check-cast v3, Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-nez v9, :cond_20

    sget v9, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v9, :cond_15

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v9, "\u06e2\u06e4\u06df"

    invoke-static {v9}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v9

    move-object v14, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_15
    sget v9, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v10, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/2addr v9, v10

    const v10, 0x20f4f2

    add-int/2addr v9, v10

    move-object v14, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v0, p0

    iget-object v3, v0, Le9;->b:Landroid/view/View;

    move-object/from16 v0, p3

    if-eq v0, v3, :cond_1f

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    goto/16 :goto_2

    :sswitch_18
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_7

    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_7

    move-object/from16 v0, p3

    instance-of v3, v0, Landroid/view/ViewGroup;

    if-eqz v3, :cond_7

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v9, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v3, v9

    const v9, 0x1aaf40

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_19
    :try_start_3
    const-string v3, "Xx32MwGomptjF/AYA6iRiw==\n"

    const-string v9, "PHWXR3XB9Pw=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v3

    if-gtz v3, :cond_16

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-object v3, v12

    move v9, v13

    :goto_9
    const-string v10, "\u06e0\u06e2\u06e5"

    invoke-static {v10}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v10

    move-object v12, v3

    move v13, v9

    move/from16 v17, v10

    goto/16 :goto_0

    :cond_16
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/2addr v3, v9

    const v9, -0x1ac04f

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_1a
    const v3, 0x31000031

    move/from16 v0, p1

    if-eq v0, v3, :cond_1c

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v3, :cond_17

    const/16 v3, 0x1f

    sput v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v3, "\u06e5\u06e2\u06e2"

    invoke-static {v3}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_17
    const-string v3, "\u06e0\u06e5\u06e5"

    goto/16 :goto_7

    :sswitch_1b
    sget-object v3, Lin;->l:Ljava/lang/Class;

    if-eqz v3, :cond_1d

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v3, v9

    const v9, -0x1ab507

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, p3

    instance-of v3, v0, Landroid/widget/TextView;

    if-eqz v3, :cond_1f

    const/16 v3, 0x22

    move/from16 v0, p1

    if-ne v0, v3, :cond_1f

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v9, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v3, v9

    const v9, 0x1c676f

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lin;->l:Ljava/lang/Class;

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v9, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    rem-int/lit16 v9, v9, -0x1bef

    mul-int/2addr v3, v9

    if-ltz v3, :cond_18

    const-string v3, "\u06e0\u06e5\u06df"

    goto/16 :goto_3

    :cond_18
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v9, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/2addr v3, v9

    const v9, 0x1abe84

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p3

    instance-of v3, v0, Landroid/view/ViewGroup;

    if-eqz v3, :cond_10

    move-object/from16 v3, p3

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    goto/16 :goto_9

    :sswitch_1f
    iget v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v3, v8, :cond_2

    int-to-float v3, v8

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v3, v7

    float-to-int v3, v3

    const/16 v7, 0x23

    if-gt v7, v3, :cond_3

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v7

    if-ltz v7, :cond_19

    const-string v7, "\u06e0\u06e2\u06e2"

    invoke-static {v7}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v9

    move v7, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_19
    const-string v7, "\u06e3\u06e7\u06e2"

    move-object v9, v7

    move v10, v3

    goto/16 :goto_6

    :sswitch_20
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v9, "oOG0bQZARavpqu4K\n"

    const-string v10, "x4TAI2ctIIM=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v9, Lpb0;->y0:Ljava/lang/String;

    invoke-static {v3, v9}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v3, :cond_1b

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    :cond_1a
    const-string v3, "\u06e1\u06e7\u06e8"

    :goto_a
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06e2\u06e3\u06e8"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, p0

    iget-object v3, v0, Le9;->e:Landroid/view/View;

    if-nez v3, :cond_7

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v9, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/2addr v3, v9

    const v9, 0x1ab344

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_1c
    :sswitch_22
    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v9, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v3, v9

    const v9, 0x1aa798

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_1d
    :sswitch_23
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v3, :cond_1e

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v3, "\u06e7\u06e8\u06e5"

    goto/16 :goto_4

    :cond_1e
    const-string v3, "\u06e0\u06e5\u06df"

    move-object v9, v3

    move v10, v7

    goto/16 :goto_1

    :cond_1f
    :sswitch_24
    move-object v3, v14

    :cond_20
    sget v9, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v9, :cond_21

    const/16 v9, 0xd

    sput v9, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v9, "\u06e5\u06e5\u06e4"

    :goto_b
    invoke-static {v9}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v14, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :cond_21
    sget v9, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v10, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v9, v10

    const v10, 0x1aace2

    add-int/2addr v9, v10

    move-object v14, v3

    move/from16 v17, v9

    goto/16 :goto_0

    :sswitch_25
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v9, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/lit16 v9, v9, -0x2c4

    add-int/2addr v3, v9

    if-gtz v3, :cond_22

    const/16 v3, 0x4f

    sput v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v3, "\u06e5\u06e6\u06e2"

    :goto_c
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_22
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v9, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/2addr v3, v9

    const v9, 0x1abe7f

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v9, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sub-int/2addr v3, v9

    const v9, -0x1acd9d

    xor-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v3, p3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v9, "FA==\n"

    const-string v10, "Ngcwg5O2+n4=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v3, v9, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v9, v9, 0x1672

    rem-int/2addr v3, v9

    if-gtz v3, :cond_23

    const-string v3, "\u06e1\u06e7\u06e1"

    goto/16 :goto_8

    :cond_23
    const-string v3, "\u06e0\u06e3\u06e2"

    goto :goto_c

    :sswitch_27
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2, v15}, Lr9;->e(Le9;ILandroid/view/View;Landroid/view/View;)V

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v3, v3, -0x1bc

    add-int/2addr v6, v3

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v3, :cond_24

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-object v3, v4

    goto/16 :goto_5

    :cond_24
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v9, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v3, v9

    const v9, 0x1abe58

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_28
    const-string v9, "\u06e7\u06df\u06e3"

    move-object v3, v14

    goto/16 :goto_b

    :sswitch_29
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Le9;->e:Landroid/view/View;

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v9, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/2addr v3, v9

    const v9, 0x1ac694

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_2a
    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v3

    if-gtz v3, :cond_25

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v3, "\u06df\u06df\u06e5"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    move v6, v11

    goto/16 :goto_0

    :cond_25
    const-string v3, "\u06e5\u06e2\u06e2"

    move v6, v11

    goto/16 :goto_4

    :sswitch_2b
    if-eqz v5, :cond_2

    iget v8, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v8, :cond_2

    const-string v3, "\u06e6\u06e5\u06e2"

    goto/16 :goto_a

    :sswitch_2c
    const/16 v3, 0x42

    if-ge v7, v3, :cond_2

    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Le9;->b:Landroid/view/View;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v3

    if-gtz v3, :cond_26

    const/16 v3, 0x38

    sput v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v3, "\u06e3\u06e7\u06e2"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :cond_26
    const-string v3, "\u06e5\u06e1\u06e3"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_2d
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v9, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/2addr v3, v9

    const v9, 0x1ab7f3

    add-int/2addr v3, v9

    move/from16 v17, v3

    goto/16 :goto_0

    :sswitch_2e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa705 -> :sswitch_0
        0x1aa73f -> :sswitch_24
        0x1aa79b -> :sswitch_1b
        0x1aaae6 -> :sswitch_12
        0x1aab20 -> :sswitch_25
        0x1aab23 -> :sswitch_2a
        0x1aab3c -> :sswitch_22
        0x1aab3f -> :sswitch_21
        0x1aab41 -> :sswitch_23
        0x1aab7a -> :sswitch_20
        0x1aab80 -> :sswitch_2d
        0x1aabbd -> :sswitch_14
        0x1aaee7 -> :sswitch_16
        0x1aaf20 -> :sswitch_15
        0x1aaf25 -> :sswitch_25
        0x1aaf7b -> :sswitch_11
        0x1aaf82 -> :sswitch_19
        0x1ab267 -> :sswitch_2
        0x1ab2a5 -> :sswitch_f
        0x1ab2c7 -> :sswitch_29
        0x1ab2dd -> :sswitch_18
        0x1ab300 -> :sswitch_1c
        0x1ab323 -> :sswitch_10
        0x1ab343 -> :sswitch_4
        0x1ab35d -> :sswitch_d
        0x1ab627 -> :sswitch_e
        0x1ab644 -> :sswitch_8
        0x1ab647 -> :sswitch_7
        0x1ab6bd -> :sswitch_b
        0x1ab6fe -> :sswitch_2c
        0x1ab700 -> :sswitch_2e
        0x1ab71a -> :sswitch_6
        0x1aba60 -> :sswitch_24
        0x1aba65 -> :sswitch_6
        0x1abdc7 -> :sswitch_c
        0x1abde5 -> :sswitch_a
        0x1abe27 -> :sswitch_3
        0x1abe83 -> :sswitch_1e
        0x1ac1a4 -> :sswitch_1a
        0x1ac1aa -> :sswitch_28
        0x1ac1c5 -> :sswitch_9
        0x1ac200 -> :sswitch_1
        0x1ac203 -> :sswitch_1f
        0x1ac223 -> :sswitch_27
        0x1ac50b -> :sswitch_6
        0x1ac5a2 -> :sswitch_1d
        0x1ac5c5 -> :sswitch_13
        0x1ac603 -> :sswitch_2b
        0x1ac8cf -> :sswitch_5
        0x1ac8eb -> :sswitch_17
        0x1ac96a -> :sswitch_0
        0x1ac983 -> :sswitch_26
        0x1ac9e4 -> :sswitch_6
    .end sparse-switch
.end method
