.class public final synthetic Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:I

.field public final f$1:I

.field public final f$2:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;->f$0:I

    iput p2, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;->f$2:Ljava/lang/String;

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
    const-string v0, "Ks5kmVSRhUTh6ElVViZTMjbUVG2oU"

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

.method public static ۟ۦ۠ۥۨ(IILjava/lang/Object;)V
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->lambda$0(IILjava/lang/String;)V

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

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e1\u06df"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۤۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e3\u06e3"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟ۥۣۥ(Ljava/lang/Object;)I

    move-result v2

    const-string v1, "\u06e4\u06e6\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۧ۟ۤۤ(Ljava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e7\u06e0\u06e0"

    move v4, v3

    goto :goto_0

    :sswitch_2
    invoke-static {v4, v2, v0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;->۟ۦ۠ۥۨ(IILjava/lang/Object;)V

    const-string v1, "\u06e6\u06e5\u06e4"

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aba44 -> :sswitch_2
        0x1ac184 -> :sswitch_1
        0x1ac205 -> :sswitch_3
        0x1ac527 -> :sswitch_0
    .end sparse-switch
.end method
