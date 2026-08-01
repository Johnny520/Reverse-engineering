.class public final synthetic Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/PPHook$ActivateResult;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Ljava/lang/String;

.field public final f$3:Ljava/lang/String;

.field public final f$4:Landroid/content/Context;

.field public final f$5:Lkevin/fun/hook/PPHook$VerifyCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$0:Lkevin/fun/hook/PPHook$ActivateResult;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$5:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    const-string v0, "dhW3plNquYOvVhbRYFXYpkDNmA4h"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣۣۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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

    check-cast v0, Lkevin/fun/hook/PPHook$ActivateResult;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v4, p4

    check-cast v4, Landroid/content/Context;

    move-object v5, p5

    check-cast v5, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/PPHook;->lambda$13(Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

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

    const-string v7, "\u06e8\u06e6\u06e1"

    move-object v2, v6

    move-object v1, v6

    move-object v0, v6

    move-object v5, v6

    move-object v3, v6

    move-object v4, v6

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->۟ۢۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e5\u06e4"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۥ۟ۨۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const-string v6, "\u06e6\u06e8\u06e5"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧۤۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "\u06e4\u06e1\u06e0"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۥۧ۟ۡ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    const-string v6, "\u06e7\u06e4\u06e7"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->۟۠ۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "\u06e0\u06e8\u06e5"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/loader/ۢۥ۟;->ۨۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v5

    const-string v6, "\u06e6\u06e5\u06e4"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->ۣۣۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e0\u06e6\u06e2"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab9c -> :sswitch_6
        0x1aabdd -> :sswitch_0
        0x1ab6c2 -> :sswitch_1
        0x1aba03 -> :sswitch_3
        0x1ac205 -> :sswitch_5
        0x1ac263 -> :sswitch_4
        0x1ac9a3 -> :sswitch_2
    .end sparse-switch
.end method
