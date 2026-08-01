.class public final synthetic Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Landroid/content/Context;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Z

.field public final f$3:Ljava/lang/String;

.field public final f$4:Lkevin/fun/hook/PPHook$VerifyCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->f$1:Ljava/lang/String;

    iput-boolean p3, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->f$2:Z

    iput-object p4, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->f$4:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const-string v0, "XbR"

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۧ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۢۥۧۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/PPHook;->lambda$18(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V

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

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۧۢۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۧۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟ۨ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤ۠ۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤ۟ۤۥ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda15;->۟ۢۥۧۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "1dcs"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
