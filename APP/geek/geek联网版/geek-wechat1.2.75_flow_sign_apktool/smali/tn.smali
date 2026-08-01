.class public abstract Ltn;
.super Ljava/lang/Object;


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v2, 0x0

    const-string v0, "\u06df\u06e4\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v0, v2

    move-object v3, v2

    move-object v1, v2

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit8 v2, v2, 0x5d

    aput-object v1, v0, v2

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/lit16 v4, v4, 0xc31

    add-int/2addr v2, v4

    if-ltz v2, :cond_5

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v2, "\u06df\u06e8\u06e7"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v4, v2

    goto :goto_0

    :sswitch_1
    const-string v2, "EjX0eZ528Q==\n"

    const-string v3, "X1SAHOwfkMQ=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/lit16 v4, v4, 0x2291

    div-int/2addr v3, v4

    if-eqz v3, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v3, "\u06df\u06e2"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v2

    goto :goto_0

    :sswitch_2
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v2, Ltn;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move-result v2

    if-ltz v2, :cond_0

    const/16 v2, 0x12

    sput v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v2, "\u06e0\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v4, v2

    goto :goto_0

    :cond_0
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sub-int/2addr v2, v4

    const v4, -0x1aab21

    xor-int/2addr v2, v4

    move v4, v2

    goto :goto_0

    :sswitch_3
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v2, v2, -0x248

    aput-object v3, v0, v2

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v4, v4, 0x2349

    rem-int/2addr v2, v4

    if-ltz v2, :cond_2

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-object v2, v3

    :cond_1
    const-string v3, "\u06e3\u06e0\u06e4"

    invoke-static {v3}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v2

    goto :goto_0

    :cond_2
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    or-int/2addr v2, v4

    const v4, 0x1aa81f

    add-int/2addr v2, v4

    move v4, v2

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v2

    if-gtz v2, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v2, "\u06e4\u06e0\u06e7"

    :goto_1
    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v4, v2

    goto/16 :goto_0

    :cond_3
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/2addr v2, v4

    const v4, 0x1aa7b0

    add-int/2addr v2, v4

    move v4, v2

    goto/16 :goto_0

    :sswitch_5
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "\u06df\u06e2"

    goto :goto_1

    :sswitch_6
    sput-object v0, Ltn;->a:[Ljava/lang/String;

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/lit16 v4, v4, -0xd11

    xor-int/2addr v2, v4

    if-gtz v2, :cond_4

    const-string v2, "\u06df\u06e4\u06e2"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v4, v2

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u06e5\u06df\u06e3"

    goto :goto_1

    :sswitch_7
    const-string v1, "wYN2FEkW3Rk5L6n1\n"

    const-string v2, "jMojXRE2Opg=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u06e8\u06e3\u06e5"

    goto :goto_1

    :cond_5
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v2, v4

    const v4, 0x1ab9b4

    add-int/2addr v2, v4

    move v4, v2

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0x1aa79d -> :sswitch_7
        0x1aa81e -> :sswitch_6
        0x1aab7e -> :sswitch_4
        0x1aaf63 -> :sswitch_8
        0x1ab627 -> :sswitch_5
        0x1aba64 -> :sswitch_3
        0x1abd89 -> :sswitch_2
        0x1ac94a -> :sswitch_1
    .end sparse-switch
.end method
