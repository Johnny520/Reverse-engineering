.class public final synthetic Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/app/Dialog;

.field public final f$1:Landroid/content/Context;

.field public final f$2:Lkevin/fun/hook/PPHook$VerifyCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;->f$0:Landroid/app/Dialog;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;->f$2:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    const-string v0, "e1WCELSWAJL"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۣۨۡۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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
    check-cast p0, Landroid/app/Dialog;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Lkevin/fun/hook/PPHook$VerifyCallback;

    check-cast p3, Landroid/view/View;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/PPHook;->lambda$8(Landroid/app/Dialog;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e8\u06e5\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3, v2, v0, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda13;->ۣۨۡۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e3\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->۟ۦۥۨۧ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v4, "\u06e6\u06e5\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۠ۦۣ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v0

    const-string v1, "\u06e8\u06df\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۦۧۥۥ;->ۣۡۤۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v4, "\u06e2\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3d -> :sswitch_1
        0x1aaf04 -> :sswitch_3
        0x1ac204 -> :sswitch_2
        0x1ac986 -> :sswitch_0
    .end sparse-switch
.end method
