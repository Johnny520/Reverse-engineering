.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

.field public final f$2:Ljava/lang/ref/WeakReference;

.field public final f$3:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final f$4:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Lkevin/fun/hook/KSHook$AtlasDownloadHolder;Ljava/lang/ref/WeakReference;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->f$1:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->f$2:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->f$3:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p5, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->f$4:I

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    const-string v0, "ceqxfmQq"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۠ۨۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/KSHook;

    check-cast p1, Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    check-cast p2, Ljava/lang/ref/WeakReference;

    check-cast p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/KSHook;->lambda$36$kevin-fun-hook-KSHook(Lkevin/fun/hook/KSHook$AtlasDownloadHolder;Ljava/lang/ref/WeakReference;Ljava/util/concurrent/atomic/AtomicInteger;I)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "mgiSwDcFqdrIR"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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
.method public final run()V
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v5, "\u06df\u06e2\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟۟ۨۤ(Ljava/lang/Object;)I

    move-result v6

    const-string v1, "\u06e7\u06e6\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->ۤۨ۠۠(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v1

    const-string v5, "\u06e4\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v4, v3, v0, v6}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda26;->۠ۨۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e2\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۦۧۥۥ;->ۦۥۣۥ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    const-string v5, "\u06e1\u06e0\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۡۤۢۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const-string v1, "\u06e4\u06e3\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۢ۠ۧ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    move-result-object v1

    const-string v5, "\u06e3\u06e5\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7e -> :sswitch_4
        0x1aa75f -> :sswitch_0
        0x1aaea7 -> :sswitch_3
        0x1ab662 -> :sswitch_5
        0x1ab6c1 -> :sswitch_2
        0x1ac5e3 -> :sswitch_1
    .end sparse-switch
.end method
