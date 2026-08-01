.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Lkevin/fun/hook/KSHook$VideoInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/ref/WeakReference;Landroid/content/Context;Lkevin/fun/hook/KSHook$VideoInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->f$3:Lkevin/fun/hook/KSHook$VideoInfo;

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    const-string v0, "nITq8L"

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

.method public static ۣ۟۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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

    check-cast p1, Ljava/lang/ref/WeakReference;

    check-cast p2, Landroid/content/Context;

    check-cast p3, Lkevin/fun/hook/KSHook$VideoInfo;

    invoke-virtual {p0, p1, p2, p3}, Lkevin/fun/hook/KSHook;->lambda$24$kevin-fun-hook-KSHook(Ljava/lang/ref/WeakReference;Landroid/content/Context;Lkevin/fun/hook/KSHook$VideoInfo;)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "G3oB2PG51HrkE"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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
    .locals 4

    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۢۦ۠۠(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨ۠ۥۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥۣۣۨ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$VideoInfo;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->ۣ۟۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    const-string v0, "CFmH"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

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
