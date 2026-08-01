.class public final synthetic Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/app/Dialog;

.field public final f$1:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;->f$0:Landroid/app/Dialog;

    iput-object p2, p0, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;->f$1:Landroid/app/Activity;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    const-string v0, "QTszA9tUbj7D"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۥۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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

    check-cast p1, Landroid/app/Activity;

    check-cast p2, Landroid/view/View;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DownloadPathDialog;->lambda$2(Landroid/app/Dialog;Landroid/app/Activity;Landroid/view/View;)V

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
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e2\u06e6\u06e4"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/startup/ۤۧۥۣ;->۟۟ۤۤۦ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v1

    const-string v3, "\u06e4\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۤ۟ۥ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    const-string v1, "\u06e8\u06e7\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v2, p1}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;->ۥۥۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_2
        0x1ab320 -> :sswitch_1
        0x1ac9c2 -> :sswitch_0
    .end sparse-switch
.end method
