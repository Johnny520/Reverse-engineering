.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$2:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

.field public final f$3:Ljava/lang/String;

.field public final f$4:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$DownloadDialogHolder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->f$2:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    iput-object p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->f$4:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "hpwcc2IpMchKQk4G5h00AyUEiWQtV"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۟ۦۧۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/KSHook;

    check-cast p1, Ljava/lang/ref/WeakReference;

    check-cast p2, Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/KSHook;->lambda$26$kevin-fun-hook-KSHook(Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$DownloadDialogHolder;Ljava/lang/String;Ljava/lang/String;)V

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
    .locals 5

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟۠ۥۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v0

    invoke-static {p0}, Landroidx/startup/ۤۧۥۣ;->ۡۡۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟ۤۥۤۨ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-result-object v2

    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۟۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۣۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda14;->۟ۦۧۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    const-string v0, "E311cR5RHv9iy67mQVgX5"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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
