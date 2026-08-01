.class public final synthetic Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;


# instance fields
.field public final f$0:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

.field public final f$1:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;->f$0:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    iput-object p2, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;->f$1:Landroid/content/Context;

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

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
    const-string v0, "X7ckDs5DD"

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۢۦۧۢ(Ljava/lang/Object;Ljava/lang/Object;IIZ)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    check-cast p0, Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/gesture/GestureMainDialog;->lambda$10(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;IIZ)V

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
.method public final onActionSelected(IIZ)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e5\u06e5\u06e3"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠۟(Ljava/lang/Object;)Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    move-result-object v1

    const-string v3, "\u06e8\u06e8\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۣ۟۠ۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e6\u06e0\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0, p1, p2, p3}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;->ۢۦۧۢ(Ljava/lang/Object;Ljava/lang/Object;IIZ)V

    const-string v1, "\u06e7\u06e4\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ac166 -> :sswitch_1
        0x1ac5a4 -> :sswitch_2
        0x1ac9e3 -> :sswitch_0
    .end sparse-switch
.end method
