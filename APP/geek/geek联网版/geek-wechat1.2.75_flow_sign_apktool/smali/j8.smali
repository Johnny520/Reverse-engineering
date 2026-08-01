.class public final Lj8;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "rgPa3Q==\n"

    const-string v1, "wGK3uKAS2zQ=\n"

    const-string v2, "DBN5vQ==\n"

    const-string v3, "aHIA7o5Mri0=\n"

    invoke-static {v0, v1, p1, v2, v3}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0mR8DQ==\n"

    const-string v2, "tgUFSApnXJg=\n"

    invoke-static {p2, v0, v1, v2, p3}, Lg40;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "X40pf12w\n"

    const-string v1, "MeROFynjGVg=\n"

    const-string v2, "ou2WDI/f\n"

    const-string v3, "zITxZPuaqCg=\n"

    invoke-static {v0, v1, p4, v2, v3}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p5}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e1\u06e6"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "J9yb8gc057na2iX1Qku"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e8\u06e8\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v0, "\u06e2\u06e6\u06e4"

    :goto_2
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p5, p0, Lj8;->e:Ljava/lang/String;

    const-string v0, "\u06e3\u06e0"

    goto :goto_2

    :sswitch_3
    iput-object p2, p0, Lj8;->b:Ljava/lang/String;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/lit16 v2, v2, 0x12ed

    div-int/2addr v0, v2

    if-eqz v0, :cond_1

    const-string v0, "\u06e2\u06e6\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e1\u06e4"

    goto :goto_3

    :sswitch_4
    iput-object p4, p0, Lj8;->d:Ljava/lang/String;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/2addr v0, v2

    const v2, -0xdec0

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e8\u06e1"

    goto :goto_1

    :sswitch_5
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e1\u06e3"

    goto :goto_2

    :sswitch_6
    iput-object p1, p0, Lj8;->a:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x39

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v0, "\u06e6\u06e5"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/2addr v0, v2

    const v2, -0x1aaae2

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_7
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v0, :cond_4

    const/16 v0, 0x2c

    sput v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v0, "\u06e5\u06e8\u06e1"

    goto :goto_2

    :cond_4
    const-string v0, "\u06e0\u06e1\u06e6"

    goto :goto_2

    :sswitch_8
    iput-object p3, p0, Lj8;->c:Ljava/lang/String;

    const-string v0, "\u06df\u06e2\u06e5"

    goto :goto_2

    :sswitch_9
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    div-int/2addr v0, v2

    const v2, 0x1ab321

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_0
        0xdc5d -> :sswitch_5
        0xdcbf -> :sswitch_2
        0x1aa762 -> :sswitch_4
        0x1aab05 -> :sswitch_6
        0x1aab07 -> :sswitch_3
        0x1ab320 -> :sswitch_a
        0x1ab71b -> :sswitch_7
        0x1ac54a -> :sswitch_8
        0x1ac5a3 -> :sswitch_1
        0x1ac9e1 -> :sswitch_9
    .end sparse-switch
.end method
