.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Landroid/content/Context;

.field public final f$2:I

.field public final f$3:Ljava/lang/String;

.field public final f$4:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$1:Landroid/content/Context;

    iput p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$4:Ljava/lang/String;

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
    const-string v0, "JpZqMgpNWETxyDY2NnlY"

    invoke-static {v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۨۢۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۧۧۨۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Landroid/content/Context;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/XhsHook;->lambda$26$kevin-fun-hook-XhsHook(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

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
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v5, "\u06df\u06e5\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2, v0, v6, v3, v4}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->ۧۧۨۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e8\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟ۦ۟ۥۥ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    const-string v5, "\u06e4\u06e6\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۢۧۤۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06df\u06e1\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->ۦۤۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e4\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۥۨۢۡ(Ljava/lang/Object;)I

    move-result v6

    const-string v1, "\u06df\u06e4\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۤۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e4\u06e0\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa746 -> :sswitch_3
        0x1aa7a3 -> :sswitch_2
        0x1aa7bc -> :sswitch_0
        0x1aba26 -> :sswitch_4
        0x1abaa3 -> :sswitch_1
        0x1abadc -> :sswitch_5
    .end sparse-switch
.end method
