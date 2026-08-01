.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Landroid/os/Handler;

.field public final f$3:Ljava/lang/Runnable;

.field public final f$4:Landroid/app/AlertDialog;

.field public final f$5:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;Landroid/app/AlertDialog;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$2:Landroid/os/Handler;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$3:Ljava/lang/Runnable;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$4:Landroid/app/AlertDialog;

    iput-object p6, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$5:Landroid/content/Context;

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "RVIO1ycaiwuf"

    invoke-static {v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۢ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/XhsHook;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Landroid/os/Handler;

    move-object v3, p3

    check-cast v3, Ljava/lang/Runnable;

    move-object v4, p4

    check-cast v4, Landroid/app/AlertDialog;

    move-object v5, p5

    check-cast v5, Landroid/content/Context;

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/XhsHook;->lambda$1$kevin-fun-hook-XhsHook(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;Landroid/app/AlertDialog;Landroid/content/Context;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v6, 0x0

    const-string v7, "\u06e7\u06e2\u06df"

    move-object v3, v6

    move-object v5, v6

    move-object v0, v6

    move-object v1, v6

    move-object v4, v6

    move-object v2, v6

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۥۡ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v2

    const-string v6, "\u06e8\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۟ۥ۟(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v3

    const-string v6, "\u06e3\u06e6\u06e0"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۢۤۥ(Ljava/lang/Object;)Landroid/app/AlertDialog;

    move-result-object v4

    const-string v6, "\u06e3\u06e4\u06e7"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e7\u06e2"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->ۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06df\u06e1\u06e7"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۧۥۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const-string v6, "\u06e0\u06e3\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۢۤۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v6, "\u06e0\u06e4\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcf7 -> :sswitch_0
        0x1aa745 -> :sswitch_6
        0x1aab40 -> :sswitch_3
        0x1aab62 -> :sswitch_2
        0x1ab6a6 -> :sswitch_4
        0x1ab6dd -> :sswitch_1
        0x1ac564 -> :sswitch_5
    .end sparse-switch
.end method
