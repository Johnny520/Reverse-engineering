.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Z

.field public final f$1:Landroid/widget/CheckBox;

.field public final f$2:Ljava/lang/ref/WeakReference;

.field public final f$3:Ljava/util/function/BiConsumer;

.field public final f$4:Lkevin/fun/hook/DYHook$WatchItem;

.field public final f$5:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/widget/CheckBox;Ljava/lang/ref/WeakReference;Ljava/util/function/BiConsumer;Lkevin/fun/hook/DYHook$WatchItem;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$0:Z

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$1:Landroid/widget/CheckBox;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$2:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$3:Ljava/util/function/BiConsumer;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$4:Lkevin/fun/hook/DYHook$WatchItem;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$5:Landroid/content/Context;

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    const-string v0, "byzF6"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡۡۢ۠(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    move-object v1, p1

    check-cast v1, Landroid/widget/CheckBox;

    move-object v2, p2

    check-cast v2, Ljava/lang/ref/WeakReference;

    move-object v3, p3

    check-cast v3, Ljava/util/function/BiConsumer;

    move-object v4, p4

    check-cast v4, Lkevin/fun/hook/DYHook$WatchItem;

    move-object v5, p5

    check-cast v5, Landroid/content/Context;

    move-object v6, p6

    check-cast v6, Landroid/view/View;

    move v0, p0

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook;->lambda$66(ZLandroid/widget/CheckBox;Ljava/lang/ref/WeakReference;Ljava/util/function/BiConsumer;Lkevin/fun/hook/DYHook$WatchItem;Landroid/content/Context;Landroid/view/View;)V

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
    .locals 7

    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۦۥۦۣ(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢۨۥ(Ljava/lang/Object;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟ۢ۟ۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۤۦۣۤ(Ljava/lang/Object;)Ljava/util/function/BiConsumer;

    move-result-object v3

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟۠۠ۥۦ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$WatchItem;

    move-result-object v4

    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۧۢۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->۟ۡۡۢ۠(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    const-string v0, "D5EPKED9eOWATot"

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
