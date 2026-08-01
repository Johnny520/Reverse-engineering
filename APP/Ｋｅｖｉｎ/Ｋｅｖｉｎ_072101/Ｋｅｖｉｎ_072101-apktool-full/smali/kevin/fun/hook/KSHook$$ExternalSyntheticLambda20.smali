.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda20;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/KSHook$DownloadProgressListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

.field public final f$2:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Lkevin/fun/hook/KSHook$DownloadDialogHolder;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda20;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda20;->f$1:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    iput-wide p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda20;->f$2:J

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

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
    const-string v0, "jUzR"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣۣۡۢ(Ljava/lang/Object;Ljava/lang/Object;JII)V
    .locals 6

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/KSHook;

    move-object v1, p1

    check-cast v1, Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-wide v2, p2

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/KSHook;->lambda$29$kevin-fun-hook-KSHook(Lkevin/fun/hook/KSHook$DownloadDialogHolder;JII)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    const-string v0, "awZoF1LxGXVbGNscKbXtuX"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

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
.method public final onProgress(II)V
    .locals 6

    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    const-string v5, "\u06e2\u06e5\u06e1"

    move-object v0, v4

    move-object v1, v4

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    move v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda20;->ۣۣۡۢ(Ljava/lang/Object;Ljava/lang/Object;JII)V

    const-string v4, "\u06e3\u06e0\u06df"

    move-object v5, v4

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۦ۟ۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v0

    const-string v4, "\u06e3\u06e6\u06e6"

    move-object v5, v4

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->۟۠ۢ۠ۡ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-result-object v1

    const-string v4, "\u06e0\u06e2\u06e8"

    move-object v5, v4

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟۠ۦۤۦ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v4, "\u06e7\u06e6\u06e8"

    move-object v5, v4

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab26 -> :sswitch_2
        0x1ab2fe -> :sswitch_0
        0x1ab622 -> :sswitch_3
        0x1ab6e3 -> :sswitch_1
    .end sparse-switch
.end method
