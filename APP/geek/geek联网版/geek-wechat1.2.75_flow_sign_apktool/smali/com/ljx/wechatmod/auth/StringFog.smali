.class public final Lcom/ljx/wechatmod/auth/StringFog;
.super Ljava/lang/Object;


# static fields
.field public static final INSTANCE:Lcom/ljx/wechatmod/auth/StringFog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ljx/wechatmod/auth/StringFog;

    invoke-direct {v0}, Lcom/ljx/wechatmod/auth/StringFog;-><init>()V

    sput-object v0, Lcom/ljx/wechatmod/auth/StringFog;->INSTANCE:Lcom/ljx/wechatmod/auth/StringFog;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e3\u06e7\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v0, v1

    const v1, 0x1ac592

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v0, "\u06e7\u06e1\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v0, "\u06e4\u06e2\u06df"

    goto :goto_1

    :cond_1
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ab847

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v0, "\u06e2\u06e8\u06e2"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e1\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    const-string v0, "y74Q4AYeDwUN9A8"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۦۡۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v0, "\u06e3\u06e7\u06e6"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v0, v1

    const v1, 0x1aafa2

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf05 -> :sswitch_0
        0x1aaf82 -> :sswitch_2
        0x1ab35c -> :sswitch_1
        0x1ab702 -> :sswitch_3
        0x1aba04 -> :sswitch_4
        0x1ac546 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final decrypt(Ljava/lang/String;I)Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v0, "\u06df\u06e8\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v8, v1

    move-object v0, v1

    move v4, v5

    move v9, v5

    move v2, v5

    move v3, v5

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v1, v4, -0x1

    and-int/2addr v1, p2

    xor-int/lit8 v6, p2, -0x1

    and-int/2addr v6, v4

    or-int/2addr v1, v6

    int-to-byte v1, v1

    :try_start_0
    aput-byte v1, v8, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v1, v6

    const v6, 0x1ac50f

    xor-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_1
    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/lit16 v6, v6, 0x957

    xor-int/2addr v1, v6

    if-ltz v1, :cond_0

    const/16 v1, 0x4b

    sput v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v1, "\u06e1\u06df\u06e5"

    :goto_1
    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    rem-int/2addr v1, v6

    const v6, 0x1ababe

    xor-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_2
    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/lit16 v6, v6, 0xb53

    div-int/2addr v1, v6

    if-gtz v1, :cond_1

    const/16 v1, 0x62

    sput v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v1, "\u06e4\u06e4"

    move-object v6, v1

    move v7, v4

    :goto_2
    invoke-static {v6}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    move v4, v7

    move v6, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v1, v6

    const v6, 0x1ac465

    add-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_3
    if-ge v2, v9, :cond_5

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v6, v6, -0x15f5

    xor-int/2addr v1, v6

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v1, "\u06e0\u06e6\u06e1"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v6, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    div-int/2addr v1, v6

    const v6, 0x1ab365

    xor-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v1

    if-gtz v1, :cond_3

    const/16 v1, 0x5c

    sput v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v1, "\u06e5\u06e5"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e2\u06e2\u06e1"

    :goto_4
    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "base64Str"

    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/2addr v1, v6

    const v6, 0x18f0f6

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_6
    const/4 v1, 0x0

    :try_start_1
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v1

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v7, v7, 0xa33

    rem-int/2addr v6, v7

    if-gtz v6, :cond_4

    const-string v6, "\u06e1\u06e3\u06e7"

    invoke-static {v6}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v6

    move-object v8, v1

    goto/16 :goto_0

    :cond_4
    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v7, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v6, v7

    const v7, -0x1aae83

    xor-int/2addr v6, v7

    move-object v8, v1

    goto/16 :goto_0

    :cond_5
    :sswitch_7
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v6, v6, -0x2529

    xor-int/2addr v1, v6

    if-gtz v1, :cond_6

    const-string v1, "\u06e5\u06e6\u06e2"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sub-int/2addr v1, v6

    const v6, 0x1aad0b

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v1

    if-gtz v1, :cond_7

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v1, "\u06e4\u06e6\u06e0"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    move v2, v3

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e5\u06df\u06df"

    move v2, v3

    goto :goto_3

    :sswitch_9
    const-string v1, "\u06e8\u06e5\u06df"

    goto/16 :goto_1

    :sswitch_a
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v1, :cond_8

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v1, "\u06e3\u06e6\u06e6"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    move v2, v5

    goto/16 :goto_0

    :cond_8
    move v1, v4

    move v2, v5

    :cond_9
    const-string v4, "\u06e2\u06e2\u06e1"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v6

    move v4, v1

    goto/16 :goto_0

    :sswitch_b
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v6, v6, 0x1549

    xor-int/2addr v1, v6

    if-gtz v1, :cond_a

    const-string v1, "\u06df\u06e8\u06e7"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_c
    :try_start_2
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ln9;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/lit16 v6, v6, -0x1dae

    xor-int/2addr v1, v6

    if-ltz v1, :cond_b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    :cond_a
    const-string v1, "\u06e4\u06e7\u06e1"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_d
    :try_start_3
    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    xor-int/lit8 v1, v1, 0x1d

    add-int v3, v2, v1

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v1

    if-gtz v1, :cond_c

    const/4 v1, 0x5

    sput v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    :cond_b
    const-string v1, "\u06e8\u06e5\u06df"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e6\u06e1\u06df"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_e
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/lit16 v6, v6, -0x614

    mul-int/2addr v1, v6

    if-gtz v1, :cond_d

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v1, "\u06e4\u06e4\u06e7"

    goto/16 :goto_4

    :cond_d
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    div-int/2addr v1, v6

    const v6, 0x1aa81e

    xor-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_f
    :try_start_4
    array-length v1, v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/lit16 v7, v7, -0xc16

    rem-int/2addr v6, v7

    if-ltz v6, :cond_e

    const/16 v6, 0x24

    sput v6, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v6, "\u06e5\u06e4\u06e5"

    invoke-static {v6}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move v9, v1

    goto/16 :goto_0

    :cond_e
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v7, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/2addr v6, v7

    const v7, 0x1a99de

    xor-int/2addr v6, v7

    move v9, v1

    goto/16 :goto_0

    :sswitch_10
    :try_start_5
    aget-byte v1, v8, v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-gez v4, :cond_9

    const-string v4, "\u06e4\u06e4"

    move-object v6, v4

    move v7, v1

    goto/16 :goto_2

    :catch_0
    move-exception v0

    const-string v0, ""

    :sswitch_11
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0x1aa81e -> :sswitch_5
        0x1aab9b -> :sswitch_9
        0x1aae83 -> :sswitch_f
        0x1aaf05 -> :sswitch_c
        0x1ab2a1 -> :sswitch_3
        0x1ab360 -> :sswitch_10
        0x1ab64a -> :sswitch_a
        0x1ab6e3 -> :sswitch_4
        0x1aba9e -> :sswitch_b
        0x1abaa4 -> :sswitch_1
        0x1abaa5 -> :sswitch_7
        0x1ababe -> :sswitch_6
        0x1abd85 -> :sswitch_2
        0x1abe26 -> :sswitch_e
        0x1ac184 -> :sswitch_8
        0x1ac50f -> :sswitch_d
        0x1ac608 -> :sswitch_4
        0x1ac982 -> :sswitch_11
    .end sparse-switch
.end method
