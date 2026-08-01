.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Landroid/widget/LinearLayout;

.field public final f$2:Landroid/graphics/Bitmap;

.field public final f$3:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Landroid/widget/LinearLayout;Landroid/graphics/Bitmap;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;->f$1:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;->f$2:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;->f$3:Landroid/content/Context;

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    const-string v0, "y6B"

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۥۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/widget/LinearLayout;

    check-cast p2, Landroid/graphics/Bitmap;

    check-cast p3, Landroid/content/Context;

    invoke-virtual {p0, p1, p2, p3}, Lkevin/fun/hook/DYHook;->lambda$96$kevin-fun-hook-DYHook(Landroid/widget/LinearLayout;Landroid/graphics/Bitmap;Landroid/content/Context;)V

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
    .locals 4

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۢ۠ۥۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣۥۣ۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۤ۠۠۠(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۥۡۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda99;->۟ۦۥۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "e0uCw9f7DZpf1Pzumju"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

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
