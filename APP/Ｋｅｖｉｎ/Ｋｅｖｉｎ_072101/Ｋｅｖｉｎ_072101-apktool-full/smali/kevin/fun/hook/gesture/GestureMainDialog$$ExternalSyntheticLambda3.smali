.class public final synthetic Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/app/Dialog;

.field public final f$1:Landroid/content/Context;

.field public final f$2:I

.field public final f$3:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;->f$0:Landroid/app/Dialog;

    iput-object p2, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;->f$1:Landroid/content/Context;

    iput p3, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;->f$3:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

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
    const-string v0, "jybeCYVSHWJcK1x0frWxdbtryZP"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۡ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Dialog;

    check-cast p1, Landroid/content/Context;

    check-cast p3, Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    check-cast p4, Landroid/view/View;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/gesture/GestureMainDialog;->lambda$6(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "CrUrMta2"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e1\u06e1\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۣ۟ۢ۠(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v4, "\u06e0\u06e3\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۨۥۡ۠(Ljava/lang/Object;)Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    move-result-object v0

    const-string v1, "\u06e4\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟۟ۥ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e1\u06df\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v3, v5, v0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;->ۦۡ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06df\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۤ۟ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v4, "\u06e3\u06e5\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab40 -> :sswitch_3
        0x1aae89 -> :sswitch_0
        0x1ab6be -> :sswitch_1
        0x1aba43 -> :sswitch_2
        0x1ac8c9 -> :sswitch_4
    .end sparse-switch
.end method
