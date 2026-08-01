.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$2:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

.field public final f$3:I

.field public final f$4:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final f$5:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$AtlasDownloadHolder;ILjava/util/concurrent/atomic/AtomicInteger;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$2:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    iput p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$3:I

    iput-object p5, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$4:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-wide p6, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$5:J

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    const-string v0, "1hujnVMEEWjAxLfqbO"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟ۢ۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;J)V
    .locals 9

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v1, p0

    check-cast v1, Lkevin/fun/hook/KSHook;

    move-object v2, p1

    check-cast v2, Ljava/lang/ref/WeakReference;

    move-object v3, p2

    check-cast v3, Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    move-object v5, p4

    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    move v4, p3

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, Lkevin/fun/hook/KSHook;->lambda$34$kevin-fun-hook-KSHook(Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$AtlasDownloadHolder;ILjava/util/concurrent/atomic/AtomicInteger;J)V

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

    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۢۡۤۤ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v1

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۢۧ۠۟(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۧ۟ۥ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    move-result-object v3

    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۢۥ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۠ۡۦۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v5

    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۣۨۤ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static/range {v1 .. v7}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->۟ۢ۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;J)V

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    const-string v0, "9AIZ5tuvJaFwC7nFB5wurelMVMUU"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
