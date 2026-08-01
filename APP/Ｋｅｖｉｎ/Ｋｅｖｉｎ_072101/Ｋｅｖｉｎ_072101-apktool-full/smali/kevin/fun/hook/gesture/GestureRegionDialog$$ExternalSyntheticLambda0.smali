.class public final synthetic Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Z

.field public final f$1:I

.field public final f$2:I

.field public final f$3:Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;

.field public final f$4:Landroid/app/Dialog;

.field public final f$5:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(ZIILkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$0:Z

    iput p2, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$1:I

    iput p3, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$3:Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;

    iput-object p5, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$4:Landroid/app/Dialog;

    iput-object p6, p0, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->f$5:Landroid/content/Context;

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

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
    const-string v0, "1BaDFfd"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۧۦۣ۠(ZIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

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
    move-object v3, p3

    check-cast v3, Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;

    move-object v4, p4

    check-cast v4, Landroid/app/Dialog;

    move-object v5, p5

    check-cast v5, Landroid/content/Context;

    move v0, p0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/gesture/GestureRegionDialog;->lambda$0(ZIILkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;Landroid/app/Dialog;Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    const-string v0, "LxfDUv51"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
.method public final run()V
    .locals 6

    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->ۦۦ۟ۡ(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۥۡ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۦ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->۠ۡۨۦ(Ljava/lang/Object;)Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;

    move-result-object v3

    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->ۣ۠ۦۥ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v4

    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۧۥۧۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;->ۧۦۣ۠(ZIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
    const-string v0, "FcEFsnmDKWXboNpMWCUurQphQA"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
