.class public final Lu6;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu6;

.field public static b:Landroid/content/SharedPreferences;

.field public static final c:I

.field public static d:Ljava/lang/String;

.field public static volatile e:J

.field public static final f:Ljava/lang/String;

.field public static g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e2\u06e6\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ""

    sput-object v0, Lu6;->d:Ljava/lang/String;

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v1, v1, 0x1234

    div-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/16 v0, 0x1f

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    :goto_1
    const-string v0, "\u06e7\u06e5\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/2addr v0, v1

    const v1, 0x1aaf25

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const-string v0, "iRtiLBpOteCGNUAfO0+d6f0lGywSdbHohRNkLRJ1zO+JG2IsEEO/7YUDbi8qRZboozptWBdTvP2z\nFhoIBVel74AYQDhgY7verApeCzIXpP2oOGxYN26F/K9rXiAkV7LLi2ESFhgUhJ+VFhoeGHfCl7Iq\nWwBmVrnBgRN/ORZQstqTKmAkMn279KgIHDc1cIDfqD5RICNVm+uPYW4UMR216fE2WFxrYoL/nR1t\nJ2tFkcaUFExYZXCZ7aciXSUSQ9vfqQtdAD1LhJyjKFEfBGychfARTRs2aYbF/WJ/DBZ8p5yVBUQW\nOUWNwe8wZyIlZqXPhWdJKStlo+ycYhghMGyB9u99ZEU2VJvUlgtkCSlTod6jJxMvNxaf2IA8eTg2\nTbiXlWdiHDt8hMWMNx05Z2fEmKZqWTklHMD9jQdjNxpptpe3GW87YmyRxbJgfS1qU7zfvGFGFB1K\ntuqQZh1WPRSOnYs3TzoBcpjpjDwaCDQcntqsN0kWahasmZQQYyhhTrL2tiViKhJ1tew=\n"

    const-string v1, "xFIrblMk9K4=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu6;->f:Ljava/lang/String;

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit8 v1, v1, -0x77

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x29

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v0, "\u06e2\u06e6\u06e8"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Lu6;

    invoke-direct {v0}, Lu6;-><init>()V

    sput-object v0, Lu6;->a:Lu6;

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    :cond_0
    const-string v0, "\u06df\u06e7\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v0, v1

    const v1, 0x1aa8e1

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x2712

    sput v0, Lu6;->c:I

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    mul-int/lit16 v1, v1, -0x17db

    sub-int/2addr v0, v1

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    :cond_2
    const-string v0, "\u06e1\u06e5\u06e4"

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06df\u06e6\u06e3"

    goto :goto_2

    :sswitch_5
    const-string v0, ""

    sput-object v0, Lu6;->g:Ljava/lang/String;

    goto :goto_1

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_0
        0x1aa7fd -> :sswitch_3
        0x1aabdd -> :sswitch_4
        0x1aaf40 -> :sswitch_5
        0x1aaf79 -> :sswitch_1
        0x1ab324 -> :sswitch_2
        0x1ac5c3 -> :sswitch_6
    .end sparse-switch
.end method

.method public static final a(Lu6;Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const-string v12, "\u06e7\u06e7\u06e8"

    invoke-static {v12}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v15

    move-object v12, v3

    move-object v13, v9

    :goto_0
    sparse-switch v15, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    or-int/2addr v3, v9

    const v9, 0x1ac02a

    add-int/2addr v3, v9

    move v15, v3

    goto :goto_0

    :sswitch_1
    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v5

    if-ltz v5, :cond_0

    const/16 v5, 0x1e

    sput v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    move v5, v4

    :goto_1
    const-string v4, "\u06e3\u06e4\u06e8"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v9

    move v4, v3

    move v15, v9

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_2
    const-string v4, "\u06e8\u06e5\u06e8"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v9

    move v4, v3

    move v15, v9

    goto :goto_0

    :sswitch_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const-string v3, "\u06e8\u06e7"

    :goto_3
    invoke-static {v3}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :sswitch_3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "kybo78Me5A==\n"

    const-string v6, "wG6pwvEr0sM=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v9, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v9, v9, -0xab5

    mul-int/2addr v6, v9

    if-ltz v6, :cond_2

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v6, "\u06e1\u06df"

    invoke-static {v6}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v3

    move v15, v9

    goto :goto_0

    :sswitch_4
    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v3, :cond_1

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v3, "\u06e2\u06e0\u06e6"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :cond_1
    const-string v3, "\u06e7\u06e7\u06e8"

    invoke-static {v3}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :sswitch_5
    const-string v3, "U0hsV/Lth2YbCTc=\n"

    const-string v9, "NSceOpOZr0g=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const-string v3, "\u06e0\u06e3\u06e3"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_6
    rsub-int/lit8 v3, v10, 0x0

    rsub-int/lit8 v7, v3, 0x1

    const/4 v3, 0x1

    if-le v7, v3, :cond_8

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v3, :cond_3

    move-object v3, v6

    :cond_2
    const-string v6, "\u06e1\u06e5\u06e7"

    invoke-static {v6}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v3

    move v15, v9

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/2addr v3, v9

    const v9, 0x1aae74

    add-int/2addr v3, v9

    move v15, v3

    goto/16 :goto_0

    :sswitch_7
    if-ge v11, v4, :cond_f

    aget-byte v9, v1, v11

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v15, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    or-int/lit16 v15, v15, -0x10e9

    xor-int/2addr v3, v15

    if-gtz v3, :cond_4

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v3, "\u06e3\u06e4\u06e6"

    invoke-static {v3}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move/from16 v16, v9

    goto/16 :goto_0

    :cond_4
    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v15, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/2addr v3, v15

    const v15, 0x1aaec7

    add-int/2addr v3, v15

    move v15, v3

    move/from16 v16, v9

    goto/16 :goto_0

    :sswitch_8
    sget v3, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v3, v3, -0x187

    invoke-static/range {v16 .. v16}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    aput-object v8, v14, v3

    const/4 v3, 0x1

    invoke-static {v14, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v8

    if-gtz v8, :cond_5

    const/16 v8, 0xd

    sput v8, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v8, "\u06e7\u06e4\u06e1"

    invoke-static {v8}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v3

    move v15, v9

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06e4\u06e5"

    move-object v9, v8

    :goto_4
    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v3

    move v15, v9

    goto/16 :goto_0

    :sswitch_9
    const-string v3, "u8D3gw==\n"

    const-string v9, "nvDF+w6lmsY=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v12

    if-ltz v12, :cond_6

    const-string v12, "\u06e7\u06df\u06e4"

    invoke-static {v12}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v15

    move-object v12, v3

    move-object v14, v9

    goto/16 :goto_0

    :cond_6
    sget v12, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v14, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    div-int/2addr v12, v14

    const v14, 0x1abde2

    xor-int v15, v12, v14

    move-object v12, v3

    move-object v14, v9

    goto/16 :goto_0

    :sswitch_a
    sget-object v3, Ln9;->a:Ljava/nio/charset/Charset;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v9, "4ZoGTMr5jFmu0Vwgmg==\n"

    const-string v13, "hv9yDrON6So=\n"

    invoke-static {v9, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v13, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v13, v13, -0x24a3

    rem-int/2addr v9, v13

    if-ltz v9, :cond_7

    const/16 v9, 0x31

    sput v9, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v9, "\u06e1\u06e0\u06e3"

    invoke-static {v9}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v13, v3

    move v15, v9

    goto/16 :goto_0

    :cond_7
    sget v9, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v13, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    or-int/2addr v9, v13

    const v13, 0x1abacb

    add-int/2addr v9, v13

    move-object v13, v3

    move v15, v9

    goto/16 :goto_0

    :cond_8
    :sswitch_b
    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v3

    if-ltz v3, :cond_9

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v3, "\u06e4\u06e2\u06e4"

    invoke-static {v3}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_9
    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v3, v9

    const v9, 0x191c1f

    add-int/2addr v3, v9

    move v15, v3

    goto/16 :goto_0

    :sswitch_c
    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v3, :cond_a

    const/16 v3, 0x3c

    sput v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v3, "\u06e2\u06e4\u06e1"

    invoke-static {v3}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e1\u06e0\u06df"

    goto/16 :goto_3

    :sswitch_d
    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v3, :cond_b

    const-string v9, "\u06e2\u06e4\u06df"

    move-object v3, v8

    goto/16 :goto_4

    :cond_b
    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v9, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/2addr v3, v9

    const v9, 0x1aae8d

    add-int/2addr v3, v9

    move v15, v3

    goto/16 :goto_0

    :sswitch_e
    const/4 v9, 0x0

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v3

    if-ltz v3, :cond_c

    const/16 v3, 0x2d

    sput v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v3, "\u06e1\u06e1\u06e4"

    :goto_5
    invoke-static {v3}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move v10, v9

    goto/16 :goto_0

    :cond_c
    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v10, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/2addr v3, v10

    const v10, 0x1abe1a

    add-int/2addr v3, v10

    move v15, v3

    move v10, v9

    goto/16 :goto_0

    :sswitch_f
    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v3, :cond_d

    const-string v3, "\u06e0\u06e2\u06e8"

    invoke-static {v3}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_d
    move v3, v4

    goto/16 :goto_1

    :sswitch_10
    invoke-virtual {v6, v13}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    const-string v3, "wtFaNt9OFyKIlhQ=\n"

    const-string v9, "prg9U6w6Pww=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v3

    if-gtz v3, :cond_e

    const-string v3, "\u06e5\u06e3\u06e3"

    goto/16 :goto_3

    :cond_e
    const-string v3, "\u06e3\u06e4\u06df"

    :goto_6
    invoke-static {v3}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_f
    :sswitch_11
    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v3, :cond_10

    const-string v3, "\u06e0\u06e1\u06e0"

    goto :goto_6

    :cond_10
    const-string v3, "\u06e1\u06df"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v3

    if-gtz v3, :cond_11

    const-string v3, "\u06e5\u06e2\u06df"

    invoke-static {v3}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move v11, v5

    goto/16 :goto_0

    :cond_11
    const-string v3, "\u06e2\u06e4\u06e1"

    move v9, v10

    move v11, v5

    goto :goto_5

    :sswitch_13
    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/lit16 v9, v9, -0x25c2

    sub-int/2addr v3, v9

    if-gtz v3, :cond_12

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v3, "\u06e7\u06e7\u06e8"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move v10, v7

    goto/16 :goto_0

    :cond_12
    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/2addr v3, v9

    const v9, 0x1ae364

    xor-int/2addr v3, v9

    move v15, v3

    move v10, v7

    goto/16 :goto_0

    :sswitch_14
    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v3, v3, -0x30e

    add-int/2addr v11, v3

    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/lit16 v9, v9, -0x20cb

    mul-int/2addr v3, v9

    if-ltz v3, :cond_13

    const/16 v3, 0x40

    sput v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    move v3, v4

    goto/16 :goto_2

    :cond_13
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v9, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v3, v9

    const v9, 0x1ac177

    xor-int/2addr v3, v9

    move v15, v3

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_data_0
    .sparse-switch
        0xdc1e -> :sswitch_0
        0xdc81 -> :sswitch_5
        0xdcff -> :sswitch_1
        0x1aab26 -> :sswitch_4
        0x1aab40 -> :sswitch_14
        0x1aaea0 -> :sswitch_d
        0x1aaea2 -> :sswitch_11
        0x1aaea4 -> :sswitch_f
        0x1aaec4 -> :sswitch_6
        0x1aaf43 -> :sswitch_a
        0x1ab2df -> :sswitch_7
        0x1ab69e -> :sswitch_2
        0x1ab6a5 -> :sswitch_b
        0x1ab6a7 -> :sswitch_9
        0x1aba05 -> :sswitch_10
        0x1abde2 -> :sswitch_8
        0x1abde6 -> :sswitch_d
        0x1abe05 -> :sswitch_12
        0x1ac1e7 -> :sswitch_15
        0x1ac50c -> :sswitch_13
        0x1ac5a4 -> :sswitch_c
        0x1ac608 -> :sswitch_3
        0x1ac98b -> :sswitch_e
    .end sparse-switch
.end method

.method public static final b(Lu6;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 13

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-object v0, v4

    :cond_0
    const-string v4, "\u06e6\u06e2\u06e1"

    move-object v5, v4

    move-object v6, v0

    :goto_1
    invoke-static {v5}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move-object v4, v6

    move v12, v0

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/security/Signature;->verify([B)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/2addr v0, v5

    const v5, 0xdcc0

    add-int/2addr v0, v5

    move v12, v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v0, v5

    const v5, 0x1ac3bc

    add-int/2addr v0, v5

    move v12, v0

    goto :goto_0

    :sswitch_3
    :try_start_1
    const-string v0, "XzEO\n"

    const-string v5, "DWJPhEm2QlM=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v1

    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/lit16 v5, v5, 0xdd

    or-int/2addr v0, v5

    if-ltz v0, :cond_1

    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e6\u06e4"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_4
    :try_start_2
    sget-object v0, Ln9;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v5

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v6, v6, 0x2623

    add-int/2addr v0, v6

    if-ltz v0, :cond_2

    const/16 v0, 0x8

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    move-object v0, v10

    :goto_3
    const-string v6, "\u06e0\u06e2\u06e6"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v10, v0

    move-object v11, v5

    move v12, v6

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v0, v6

    const v6, 0x2570d1

    add-int/2addr v0, v6

    move-object v11, v5

    move v12, v0

    goto/16 :goto_0

    :sswitch_5
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v0, v5

    const v5, 0xd817

    add-int/2addr v0, v5

    move v12, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e8\u06df\u06e8"

    move v2, v3

    goto :goto_2

    :cond_3
    const-string v0, "\u06e6\u06e1\u06e1"

    move v5, v9

    move v2, v3

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v5

    move v12, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v0, v5

    const v5, -0x1ac86e

    xor-int/2addr v0, v5

    move v12, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_8
    :try_start_3
    invoke-virtual {v10, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06e0\u06e4"

    :goto_5
    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e6\u06e7"

    goto :goto_5

    :sswitch_9
    :try_start_4
    new-instance v8, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v8, v4}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v0, :cond_6

    const-string v0, "\u06e6\u06e1\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v8

    move v12, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e0\u06e0\u06e4"

    move-object v5, v0

    move-object v6, v4

    move-object v7, v8

    goto/16 :goto_1

    :sswitch_a
    :try_start_5
    sget-object v0, Lu6;->f:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v0

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v4, :cond_0

    const/16 v4, 0x4e

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v4, "\u06e8\u06e0"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v0

    move v12, v5

    goto/16 :goto_0

    :sswitch_b
    const/4 v5, 0x0

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v0, :cond_7

    const/16 v0, 0x46

    sput v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v0, "\u06e3\u06e6\u06e7"

    goto :goto_4

    :cond_7
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v6, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v0, v6

    const v6, 0x1ac2c9

    add-int/2addr v0, v6

    move v9, v5

    move v12, v0

    goto/16 :goto_0

    :sswitch_c
    :try_start_6
    const-string v0, "W1ORtYrodlcUGMvZ2g==\n"

    const-string v5, "PDbl9/OcEyQ=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v0, v5

    const v5, 0x1abb23

    add-int/2addr v0, v5

    move v12, v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v0, :cond_8

    const-string v0, "\u06e6\u06e5\u06df"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v9

    move v12, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab75f

    add-int/2addr v0, v2

    move v2, v9

    move v12, v0

    goto/16 :goto_0

    :sswitch_d
    :try_start_7
    const-string v0, "RM0qoaJ52A1j7TnA1g==\n"

    const-string v5, "F4Vrk5dPr2Q=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    move-result-object v0

    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v5, :cond_9

    const/16 v5, 0x4e

    sput v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v5, "\u06e8\u06e0\u06df"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v10, v0

    move v12, v5

    goto/16 :goto_0

    :cond_9
    move-object v5, v11

    goto/16 :goto_3

    :sswitch_e
    :try_start_8
    invoke-virtual {v10, v11}, Ljava/security/Signature;->update([B)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_a

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e4\u06e4\u06e3"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06df\u06df\u06e1"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_f
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc9a -> :sswitch_6
        0xdcf8 -> :sswitch_b
        0x1aa701 -> :sswitch_1
        0x1aa7dd -> :sswitch_d
        0x1aaae4 -> :sswitch_3
        0x1aab24 -> :sswitch_8
        0x1aaf98 -> :sswitch_2
        0x1ab6e4 -> :sswitch_4
        0x1ab71d -> :sswitch_c
        0x1ab9c4 -> :sswitch_2
        0x1aba63 -> :sswitch_e
        0x1ac186 -> :sswitch_f
        0x1ac1a5 -> :sswitch_9
        0x1ac200 -> :sswitch_7
        0x1ac8d1 -> :sswitch_a
        0x1ac8e7 -> :sswitch_5
    .end sparse-switch
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e4\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v0, "\u06e8\u06e8\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_5

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e2\u06e4\u06e5"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    mul-int/2addr v0, v3

    const v3, 0x1abb3a

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    const-string v0, ""

    :goto_1
    return-object v0

    :sswitch_3
    const-string v0, "bcq6\n"

    const-string v3, "Bq/DDzidY1g=\n"

    const-string v4, "Xb6vNEJGbW4=\n"

    const-string v5, "OdvJYiMqGAs=\n"

    invoke-static {v0, v3, p0, v4, v5}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v3, v3, 0x7fd

    rem-int/2addr v0, v3

    if-ltz v0, :cond_2

    const-string v0, "\u06df\u06e1\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v0, v3

    const v3, 0x1aab56

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Lu6;->b:Landroid/content/SharedPreferences;

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/2addr v2, v3

    const v3, 0x1ac9f7

    add-int/2addr v3, v2

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    move-object v0, v1

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x23

    sput v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v0, "\u06e1\u06e0\u06e6"

    :goto_2
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e2\u06e4\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, ""

    invoke-interface {v2, p0, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v0, v3

    const v3, 0x1abfc5

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/2addr v0, v3

    const v3, 0x1ab3d5

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int/2addr v0, v3

    const v3, -0x1abb26

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_5
    :sswitch_9
    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v3, v3, -0xd08

    mul-int/2addr v0, v3

    if-gtz v0, :cond_6

    const/16 v0, 0x51

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v0, "\u06df\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    rem-int/2addr v0, v3

    const v3, 0x1aaf76

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_a
    if-eqz v2, :cond_0

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v0, :cond_7

    const-string v0, "\u06e6\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e1\u06e2\u06e6"

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa73d -> :sswitch_0
        0x1aabc0 -> :sswitch_4
        0x1aaee5 -> :sswitch_7
        0x1aaf63 -> :sswitch_5
        0x1ab2e3 -> :sswitch_3
        0x1ab31f -> :sswitch_2
        0x1ab9cd -> :sswitch_8
        0x1aba28 -> :sswitch_6
        0x1aba64 -> :sswitch_0
        0x1ac200 -> :sswitch_1
        0x1ac90d -> :sswitch_9
        0x1ac9a9 -> :sswitch_a
    .end sparse-switch
.end method

.method public static d(Landroid/app/Application;)V
    .locals 11

    const/16 v10, 0x43

    const/4 v9, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e5\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v3, v0

    move-object v1, v0

    move-object v4, v0

    move-object v2, v0

    move-object v5, v0

    move-object v8, v0

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ksN8I/LRhtWgyXYb+sqX4omZ\n"

    const-string v6, "/6wYfJOk8r0=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lu6;->b:Landroid/content/SharedPreferences;

    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v0, v6

    const v6, 0x1abf0b

    add-int/2addr v0, v6

    move v6, v0

    goto :goto_0

    :sswitch_1
    sput-object v5, Lu6;->g:Ljava/lang/String;

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e7\u06e5"

    :goto_1
    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e4\u06e7"

    move-object v6, v0

    move-object v7, v5

    :goto_2
    invoke-static {v6}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v7

    move v6, v0

    goto :goto_0

    :sswitch_2
    if-nez v2, :cond_b

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v0, :cond_1

    sput v10, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e5\u06e2\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    mul-int/2addr v0, v6

    const v6, 0x1ac95d

    add-int/2addr v0, v6

    move v6, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-object v0, v4

    :goto_3
    const-string v5, "\u06e6\u06e6"

    move-object v6, v5

    move-object v7, v0

    goto :goto_2

    :cond_2
    const-string v0, "\u06e5\u06e5\u06e8"

    move-object v5, v4

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_3

    const/4 v0, 0x1

    sput v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v0, "\u06e5\u06e0\u06e7"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v1

    move v6, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e5\u06e6"

    move-object v6, v0

    move-object v7, v5

    move-object v8, v1

    goto :goto_2

    :sswitch_5
    const-string v0, "\u06e6\u06df\u06e1"

    move-object v1, v2

    :goto_5
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :sswitch_6
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v0, "\u06e5\u06e4\u06e3"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v0, v6

    const v6, 0x1ac187

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v6, v6, -0x172a

    xor-int/2addr v0, v6

    if-gtz v0, :cond_5

    const-string v0, "\u06e8\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v3

    move v6, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/2addr v0, v6

    const v6, -0x1baf0b

    xor-int/2addr v0, v6

    move-object v8, v3

    move v6, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "\u06e8\u06e5\u06e6"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v6, v6, -0x111a

    mul-int/2addr v0, v6

    if-gtz v0, :cond_6

    const/16 v0, 0xc

    sput v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v0, "\u06e0\u06e5\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e0\u06e5\u06e7"

    :goto_6
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sub-int/2addr v0, v6

    const v6, 0x1ac369

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "1BdXat0v7+XWAVVg\n"

    const-string v5, "gVkcJJJ4obo=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_7

    const-string v0, "\u06e2\u06df\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_8

    const-string v0, "\u06e7\u06e1\u06e3"

    goto/16 :goto_4

    :cond_8
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sub-int/2addr v0, v6

    const v6, 0x1ac9c3

    xor-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_c
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v0, :cond_9

    const-string v0, "\u06e6\u06df\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v8

    move v6, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e7\u06e6\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v8

    move v6, v0

    goto/16 :goto_0

    :sswitch_d
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v6, v6, -0x1530

    sub-int/2addr v0, v6

    if-ltz v0, :cond_a

    const-string v0, "\u06e2\u06e4\u06e7"

    :goto_7
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e2\u06df\u06e5"

    goto :goto_7

    :sswitch_e
    :try_start_0
    const-string v0, "uo3cunZGaJu8jMW6b05ZiKuH1/FwRmibvJE=\n"

    const-string v6, "2eKxlAIjBvg=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {p0, v0, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v6, "Qtpfm5cTloRHzVGcpjmShFzbWZ+c\n"

    const-string v7, "LrU48vlM4eE=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    const-string v0, "\u06e5\u06e0\u06e7"

    goto/16 :goto_6

    :cond_b
    :sswitch_f
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sub-int/2addr v0, v6

    const v6, 0x1ac38e

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_10
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/lit16 v6, v6, 0x1c17

    rem-int/2addr v0, v6

    if-gtz v0, :cond_c

    sput v10, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e0\u06e3\u06e2"

    goto/16 :goto_6

    :cond_c
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    mul-int/2addr v0, v6

    const v6, 0x16a2b7

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_11
    const-string v3, ""

    const-string v0, "\u06e5\u06e2\u06e0"

    goto/16 :goto_1

    :sswitch_12
    :try_start_1
    const-string v0, "jwXZmtNiqGCNE9uQ\n"

    const-string v6, "2kuS1Jw15j8=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v6, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/lit8 v6, v6, 0x14

    sub-int/2addr v0, v6

    if-gtz v0, :cond_d

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v0, "\u06df\u06df\u06e4"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v6, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/2addr v0, v6

    const v6, 0x1c261a

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_13
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    mul-int/lit16 v6, v6, 0x1255

    add-int/2addr v0, v6

    if-ltz v0, :cond_e

    const-string v0, "\u06e8\u06e2\u06e1"

    goto/16 :goto_5

    :cond_e
    const-string v0, "\u06e0\u06e5\u06e8"

    goto/16 :goto_5

    :cond_f
    :sswitch_14
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/2addr v0, v6

    const v6, 0x1acbaf

    add-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "nzDncgGbLw==\n"

    const-string v6, "/F+JBmTjW3g=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    or-int/lit16 v6, v6, 0x23db

    rem-int/2addr v0, v6

    if-ltz v0, :cond_10

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v0, "\u06e6\u06e1\u06e3"

    :goto_8
    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_10
    move-object v0, v5

    goto/16 :goto_3

    :sswitch_16
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-lez v0, :cond_f

    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v0, :cond_11

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v0, "\u06e7\u06e6\u06e4"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_11
    const-string v0, "\u06e6\u06e8\u06e7"

    goto :goto_8

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcc0 -> :sswitch_0
        0xdcfa -> :sswitch_b
        0xdd00 -> :sswitch_10
        0x1aa704 -> :sswitch_f
        0x1aa705 -> :sswitch_7
        0x1aab5e -> :sswitch_d
        0x1aab82 -> :sswitch_b
        0x1aab83 -> :sswitch_15
        0x1ab248 -> :sswitch_3
        0x1ab35f -> :sswitch_13
        0x1ab628 -> :sswitch_14
        0x1abd88 -> :sswitch_11
        0x1abdac -> :sswitch_2
        0x1abde3 -> :sswitch_e
        0x1abe24 -> :sswitch_8
        0x1abe48 -> :sswitch_9
        0x1abe83 -> :sswitch_8
        0x1abe86 -> :sswitch_a
        0x1ac148 -> :sswitch_4
        0x1ac188 -> :sswitch_b
        0x1ac265 -> :sswitch_c
        0x1ac5a2 -> :sswitch_5
        0x1ac5aa -> :sswitch_17
        0x1ac5e5 -> :sswitch_6
        0x1ac989 -> :sswitch_16
        0x1ac9aa -> :sswitch_12
        0x1ac9c4 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e8\u06e8\u06e4"

    :goto_1
    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int/2addr v1, v3

    const v3, -0x1ab380

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "h1i3\n"

    const-string v3, "7D3Owg2+TmA=\n"

    const-string v6, "TNc8EUs=\n"

    const-string v7, "OrZQZC4u1NY=\n"

    invoke-static {v1, v3, p0, v6, v7}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/lit16 v3, v3, -0x1b61

    xor-int/2addr v1, v3

    if-gtz v1, :cond_2

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v3, "\u06e6\u06e5\u06e1"

    move-object v1, v2

    :goto_2
    invoke-static {v3}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e7\u06e7\u06df"

    :goto_3
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_3
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/lit16 v3, v3, 0x4d6

    xor-int/2addr v1, v3

    if-gtz v1, :cond_5

    const/4 v1, 0x0

    sput v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v1, "\u06e1\u06e4\u06e3"

    goto :goto_1

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/2addr v1, v3

    const v3, -0x1aa8e1

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    sget-object v1, Lu6;->b:Landroid/content/SharedPreferences;

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sub-int/2addr v3, v4

    const v4, 0x1ac69f

    add-int/2addr v3, v4

    move-object v4, v1

    goto :goto_0

    :cond_3
    :sswitch_6
    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v1, :cond_4

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v1, "\u06e0\u06e5\u06e5"

    goto :goto_3

    :cond_4
    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v1, v3

    const v3, 0x1aab1a

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_7
    if-eqz v5, :cond_1

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/lit16 v3, v3, 0x188d

    mul-int/2addr v1, v3

    if-gtz v1, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    :cond_5
    const-string v1, "\u06e2\u06e8\u06e8"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v1, v3

    const v3, 0x1aab5b

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "\u06e5\u06e1\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_9
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v3, :cond_7

    :cond_7
    const-string v3, "\u06e7\u06e8\u06e1"

    invoke-static {v3}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "HFgXS9x97sp0zyR76OmN"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->ۣ۟ۧۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/lit16 v3, v3, -0x159a

    xor-int/2addr v2, v3

    if-ltz v2, :cond_8

    const/16 v2, 0x16

    sput v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v2, "\u06e0\u06e5\u06e6"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e1\u06e4\u06e3"

    move-object v3, v2

    goto/16 :goto_2

    :sswitch_b
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v1, v3

    const v3, 0x11d0a1

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_c
    if-eqz v4, :cond_1

    const-string v1, "\u06e0\u06e7"

    goto/16 :goto_3

    :sswitch_d
    if-eqz v0, :cond_1

    sget v1, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v1, :cond_9

    const/16 v1, 0x3e

    sput v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v1, "\u06df\u06e0\u06e4"

    :goto_4
    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e1\u06e3\u06e8"

    goto :goto_4

    :sswitch_e
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0x1aa723 -> :sswitch_b
        0x1aab21 -> :sswitch_e
        0x1aab81 -> :sswitch_2
        0x1aab99 -> :sswitch_3
        0x1aaf06 -> :sswitch_9
        0x1aaf20 -> :sswitch_4
        0x1ab362 -> :sswitch_8
        0x1ab662 -> :sswitch_1
        0x1abdc8 -> :sswitch_a
        0x1ac202 -> :sswitch_6
        0x1ac5ff -> :sswitch_5
        0x1ac61f -> :sswitch_c
        0x1ac620 -> :sswitch_7
        0x1ac9e4 -> :sswitch_d
    .end sparse-switch
.end method

.method public static f(Lt50;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lyg;->b:Lof;

    new-instance v1, Lt6;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lt6;-><init>(Lvd;I)V

    invoke-static {v0, v1, p0}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
