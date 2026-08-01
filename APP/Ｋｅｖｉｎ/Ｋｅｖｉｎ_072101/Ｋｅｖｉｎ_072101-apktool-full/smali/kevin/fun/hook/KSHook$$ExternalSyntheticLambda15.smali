.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$2:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

.field public final f$3:Ljava/lang/String;

.field public final f$4:Ljava/lang/String;

.field public final f$5:Ljava/lang/String;

.field public final f$6:Ljava/lang/String;

.field public final f$7:Ljava/lang/String;

.field public final f$8:J

.field public final f$9:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$DownloadDialogHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$2:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    iput-object p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$6:Ljava/lang/String;

    iput-object p8, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$7:Ljava/lang/String;

    iput-wide p9, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$8:J

    iput-object p11, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$9:Ljava/lang/String;

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    const-string v0, "gTRjNY76CgTRBEV9Hg3VIfgRNM"

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۧۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۦۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 12

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/KSHook;

    move-object v1, p1

    check-cast v1, Ljava/lang/ref/WeakReference;

    move-object v2, p2

    check-cast v2, Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, p5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v6, p6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v7, p7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v10, p10

    check-cast v10, Ljava/lang/String;

    move-wide/from16 v8, p8

    invoke-virtual/range {v0 .. v10}, Lkevin/fun/hook/KSHook;->lambda$27$kevin-fun-hook-KSHook(Ljava/lang/ref/WeakReference;Lkevin/fun/hook/KSHook$DownloadDialogHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

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
    .locals 11

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۦۤۡ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟۠۠(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟۟ۢۤ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-result-object v2

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۥۦۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->۟۟ۢۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۨۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟۠ۦۣۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->ۢۧۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p0}, Landroidx/loader/ۢۥ۟;->ۥۥۥ۠(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۤۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static/range {v0 .. v10}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->۟ۦۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    const-string v0, "1GB954rUwqInl2Ews"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

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
