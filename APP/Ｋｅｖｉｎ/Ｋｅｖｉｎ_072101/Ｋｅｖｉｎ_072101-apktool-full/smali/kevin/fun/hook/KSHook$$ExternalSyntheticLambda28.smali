.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

.field public final f$1:I

.field public final f$2:I

.field public final f$3:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook$AtlasDownloadHolder;IIJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->f$0:Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    iput p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->f$1:I

    iput p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->f$2:I

    iput-wide p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->f$3:J

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    const-string v0, "tDRL"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۧۡۤ(Ljava/lang/Object;IIJ)V
    .locals 3

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    check-cast p0, Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/KSHook;->lambda$38(Lkevin/fun/hook/KSHook$AtlasDownloadHolder;IIJ)V

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
    .locals 7

    const/4 v5, 0x0

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const-string v1, "\u06e2\u06e0\u06e1"

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۢۥ۠ۥ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v1, "\u06e4\u06df\u06e3"

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v6, v4, v2, v3}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->ۣۧۡۤ(Ljava/lang/Object;IIJ)V

    const-string v1, "\u06e8\u06e7\u06e5"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۢۥۨۦ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$AtlasDownloadHolder;

    move-result-object v0

    const-string v1, "\u06e1\u06e0\u06e6"

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۦۨ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e7\u06e6\u06e4"

    move v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠ۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    const-string v1, "\u06e8\u06e0\u06e3"

    goto :goto_0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaea7 -> :sswitch_2
        0x1ab263 -> :sswitch_1
        0x1ab9c8 -> :sswitch_0
        0x1ac5e5 -> :sswitch_3
        0x1ac9c6 -> :sswitch_4
    .end sparse-switch
.end method
