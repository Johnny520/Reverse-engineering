.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Landroid/content/Context;

.field public final f$2:Ljava/lang/ref/WeakReference;

.field public final f$3:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Landroid/content/Context;Ljava/lang/ref/WeakReference;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$2:Ljava/lang/ref/WeakReference;

    iput p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$3:I

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    const-string v0, "hIQJ1n"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤۡۧۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۢۦ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/KSHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p1, p2, p3}, Lkevin/fun/hook/KSHook;->lambda$19$kevin-fun-hook-KSHook(Landroid/content/Context;Ljava/lang/ref/WeakReference;I)V

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

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e1\u06df\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۦۡۧۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e3\u06e6\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->۟ۦۡۧۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    const-string v4, "\u06e2\u06e6\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->ۥۥۢۨ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v1

    const-string v4, "\u06df\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟۠ۡۦۦ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e7\u06e7\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v3, v0, v2, v5}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->ۢۦ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e0\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa720 -> :sswitch_0
        0x1aae81 -> :sswitch_2
        0x1ab324 -> :sswitch_3
        0x1ab6e0 -> :sswitch_1
        0x1ac604 -> :sswitch_4
    .end sparse-switch
.end method
