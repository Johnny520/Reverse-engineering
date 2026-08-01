.class public final synthetic Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Landroid/content/Context;

.field public final f$1:Ljava/lang/StringBuilder;

.field public final f$2:I

.field public final f$3:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/StringBuilder;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;->f$1:Ljava/lang/StringBuilder;

    iput p3, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;->f$2:I

    iput p4, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;->f$3:I

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
    const-string v0, "5VjvZIrigV"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۧۢۥ(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/StringBuilder;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/DexKitFinder;->lambda$8(Landroid/content/Context;Ljava/lang/StringBuilder;II)V

    :sswitch_3
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "lYJLbIATIIFddJ3HuEDeXU"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

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

    const/4 v5, 0x0

    const-string v3, "\u06e8\u06e4\u06e2"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۥۧۦ(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\u06e6\u06e5\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۤ۠ۧۢ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e2\u06e0\u06df"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v2, v4, v6}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;->ۨۧۢۥ(Ljava/lang/Object;Ljava/lang/Object;II)V

    const-string v1, "\u06e1\u06e8\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->۟ۥ۠ۧۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e7\u06e5\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lorg/luckypray/dexkit/۠۠ۥ;->۠ۥ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    const-string v1, "\u06e8\u06e8\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aafa0 -> :sswitch_4
        0x1ab261 -> :sswitch_1
        0x1ac204 -> :sswitch_3
        0x1ac966 -> :sswitch_2
        0x1ac9e0 -> :sswitch_0
    .end sparse-switch
.end method
