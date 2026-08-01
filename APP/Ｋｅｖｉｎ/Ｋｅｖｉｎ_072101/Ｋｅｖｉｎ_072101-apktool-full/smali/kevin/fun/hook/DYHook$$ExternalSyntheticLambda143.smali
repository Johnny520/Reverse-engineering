.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/lang/String;

.field public final f$2:I

.field public final f$3:Landroid/content/Context;

.field public final f$4:Landroid/app/Dialog;

.field public final f$5:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/lang/String;ILandroid/content/Context;Landroid/app/Dialog;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$1:Ljava/lang/String;

    iput p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$4:Landroid/app/Dialog;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->f$5:Ljava/lang/String;

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

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
    const-string v0, "GY1vXWB0MFkeKd9dRuYMCNw8W"

    invoke-static {v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۢ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    move-object v4, p4

    check-cast v4, Landroid/app/Dialog;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    move-object v6, p6

    check-cast v6, Landroid/view/View;

    move v2, p2

    invoke-virtual/range {v0 .. v6}, Lkevin/fun/hook/DYHook;->lambda$198$kevin-fun-hook-DYHook(Ljava/lang/String;ILandroid/content/Context;Landroid/app/Dialog;Ljava/lang/String;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "veXUuGPLocNb38"

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->۟ۢۤۦۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
    .locals 8

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v7, "\u06e5\u06e1\u06e7"

    move-object v0, v6

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    move-object v1, v6

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۥ۠ۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const-string v6, "\u06e2\u06e6\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v6, "\u06e4\u06e4\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۥۢ(Ljava/lang/Object;)I

    move-result v2

    const-string v6, "\u06df\u06e7\u06e2"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣۢۨۤ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v4

    const-string v6, "\u06e2\u06e3\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢ۟ۦۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e3\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda143;->۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e3\u06e4\u06e2"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۡۢۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u06e2\u06e2\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab2a6 -> :sswitch_4
        0x1ab2c5 -> :sswitch_5
        0x1ab322 -> :sswitch_2
        0x1ab6a1 -> :sswitch_6
        0x1aba66 -> :sswitch_3
        0x1abdcb -> :sswitch_0
        0x1ac94b -> :sswitch_1
    .end sparse-switch
.end method
