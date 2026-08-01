.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda185;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:I

.field public final f$2:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;I[Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda185;->f$0:Lkevin/fun/hook/DYHook;

    iput p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda185;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda185;->f$2:[Z

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
    const-string v0, "0Ja4D"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦ۟ۨۡ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p2, [Z

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/DYHook;->lambda$117$kevin-fun-hook-DYHook(I[Z)V

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

    const/4 v1, 0x0

    const/4 v4, 0x0

    const-string v3, "\u06e5\u06e5\u06e5"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/startup/ۤۧۥۣ;->ۧۡۢۥ(Ljava/lang/Object;)I

    move-result v4

    const-string v1, "\u06e8\u06e6\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v4, v2}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda185;->۟ۦ۟ۨۡ(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v1, "\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۨۢۨ(Ljava/lang/Object;)[Z

    move-result-object v1

    const-string v3, "\u06e1\u06e7\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۡۦۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v1, "\u06e5\u06e5\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_3
        0x1aaf80 -> :sswitch_0
        0x1abe45 -> :sswitch_2
        0x1ac9a6 -> :sswitch_1
    .end sparse-switch
.end method
