.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Landroid/app/AlertDialog;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Lorg/json/JSONObject;

.field public final f$4:Ljava/lang/String;

.field public final f$5:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Landroid/app/AlertDialog;Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$1:Landroid/app/AlertDialog;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$3:Lorg/json/JSONObject;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->f$5:Ljava/lang/String;

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    const-string v0, "VaN3nQ03sXz3phIYogUZy8fQpCvR"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۣۡۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/XhsHook;

    move-object v1, p1

    check-cast v1, Landroid/app/AlertDialog;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    move-object v3, p3

    check-cast v3, Lorg/json/JSONObject;

    move-object v4, p4

    check-cast v4, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/XhsHook;->lambda$2$kevin-fun-hook-XhsHook(Landroid/app/AlertDialog;Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

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
    .locals 6

    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->۟۠ۤۡۨ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۦۧۨ(Ljava/lang/Object;)Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۠ۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧۦۣۢ(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->۟ۦ۠ۦۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۡۥۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda15;->ۣۡۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    const-string v0, "jsSlNsoX"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
