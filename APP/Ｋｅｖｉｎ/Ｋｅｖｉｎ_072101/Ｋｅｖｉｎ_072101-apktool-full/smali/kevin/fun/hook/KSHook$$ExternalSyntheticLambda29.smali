.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda29;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda29;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda29;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda29;->f$2:Ljava/lang/ref/WeakReference;

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "xU68Kzt0FntpHfMdeDe"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۣۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/KSHook;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/KSHook;->lambda$13$kevin-fun-hook-KSHook(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V

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
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e7\u06e1\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->۟ۦۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e5\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۤۢۨ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v1

    const-string v4, "\u06e1\u06df\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v3, v0}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda29;->ۦۣۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e5\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۣۢۤ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    const-string v1, "\u06e1\u06df\u06e0"

    move-object v4, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aae82 -> :sswitch_2
        0x1aae89 -> :sswitch_0
        0x1abde7 -> :sswitch_3
        0x1ac54e -> :sswitch_1
    .end sparse-switch
.end method
