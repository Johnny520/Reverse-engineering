.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/util/List;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/List;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->f$1:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->f$3:Ljava/lang/ref/WeakReference;

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    const-string v0, "oU0bRNGw9QsX"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/util/List;

    check-cast p2, Landroid/content/Context;

    check-cast p3, Ljava/lang/ref/WeakReference;

    check-cast p4, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/DYHook;->lambda$84$kevin-fun-hook-DYHook(Ljava/util/List;Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/view/View;)V

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
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e0\u06e4\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۟ۤ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v5, "\u06e3\u06e8\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->ۨۧۦۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    const-string v5, "\u06e8\u06e4\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡۥۨ۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e5\u06e6\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v4, v3, v0, v2, p1}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e3\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    const-string v5, "\u06e8\u06e7\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab5d -> :sswitch_0
        0x1ab723 -> :sswitch_1
        0x1aba43 -> :sswitch_4
        0x1abe61 -> :sswitch_3
        0x1ac9c3 -> :sswitch_2
    .end sparse-switch
.end method
