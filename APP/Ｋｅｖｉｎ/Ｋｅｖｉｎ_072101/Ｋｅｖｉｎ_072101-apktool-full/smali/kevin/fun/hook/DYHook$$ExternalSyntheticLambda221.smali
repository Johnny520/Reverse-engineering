.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Landroid/widget/Spinner;

.field public final f$2:Landroid/widget/EditText;

.field public final f$3:Lkevin/fun/hook/DYHook$WatchItem;

.field public final f$4:Ljava/lang/ref/WeakReference;

.field public final f$5:Landroid/content/Context;

.field public final f$6:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Landroid/widget/Spinner;Landroid/widget/EditText;Lkevin/fun/hook/DYHook$WatchItem;Ljava/lang/ref/WeakReference;Landroid/content/Context;Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$1:Landroid/widget/Spinner;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$2:Landroid/widget/EditText;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$3:Lkevin/fun/hook/DYHook$WatchItem;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$4:Ljava/lang/ref/WeakReference;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->f$6:Ljava/lang/Runnable;

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
    const-string v0, "n0sdq"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Landroid/widget/Spinner;

    move-object v2, p2

    check-cast v2, Landroid/widget/EditText;

    move-object v3, p3

    check-cast v3, Lkevin/fun/hook/DYHook$WatchItem;

    move-object v4, p4

    check-cast v4, Ljava/lang/ref/WeakReference;

    move-object v5, p5

    check-cast v5, Landroid/content/Context;

    move-object v6, p6

    check-cast v6, Ljava/lang/Runnable;

    move-object v7, p7

    check-cast v7, Landroid/view/View;

    invoke-virtual/range {v0 .. v7}, Lkevin/fun/hook/DYHook;->lambda$41$kevin-fun-hook-DYHook(Landroid/widget/Spinner;Landroid/widget/EditText;Lkevin/fun/hook/DYHook$WatchItem;Ljava/lang/ref/WeakReference;Landroid/content/Context;Ljava/lang/Runnable;Landroid/view/View;)V

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
    .locals 9

    const/4 v7, 0x0

    const-string v8, "\u06e4\u06e3\u06e0"

    move-object v6, v7

    move-object v4, v7

    move-object v5, v7

    move-object v2, v7

    move-object v1, v7

    move-object v3, v7

    move-object v0, v7

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda221;->ۦۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v7, "\u06e6\u06e6\u06e4"

    move-object v8, v7

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۨۦ۠(Ljava/lang/Object;)Landroid/widget/Spinner;

    move-result-object v1

    const-string v7, "\u06df\u06df\u06e6"

    move-object v8, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۡۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const-string v7, "\u06e5\u06e0"

    move-object v8, v7

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۨۧۨ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$WatchItem;

    move-result-object v3

    const-string v7, "\u06df\u06e2\u06e0"

    move-object v8, v7

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۨ۠ۧ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v4

    const-string v7, "\u06e6\u06e7\u06e0"

    move-object v8, v7

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->۟ۦۥۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v7, "\u06e3\u06e5\u06e1"

    move-object v8, v7

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۥۦۣ۟(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v6

    const-string v7, "\u06e3\u06e5\u06e0"

    move-object v8, v7

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۧۢۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v2

    const-string v7, "\u06df\u06e5\u06e2"

    move-object v8, v7

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9b -> :sswitch_5
        0x1aa706 -> :sswitch_6
        0x1aa75d -> :sswitch_3
        0x1aa7bc -> :sswitch_2
        0x1ab6bf -> :sswitch_0
        0x1aba41 -> :sswitch_4
        0x1ac224 -> :sswitch_7
        0x1ac23f -> :sswitch_1
    .end sparse-switch
.end method
