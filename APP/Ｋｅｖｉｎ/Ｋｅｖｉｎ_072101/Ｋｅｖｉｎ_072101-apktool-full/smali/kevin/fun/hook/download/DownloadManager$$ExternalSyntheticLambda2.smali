.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Landroid/app/Dialog;

.field public final f$1:[Landroid/widget/ProgressBar;

.field public final f$2:I

.field public final f$3:[Landroid/widget/TextView;

.field public final f$4:[Landroid/widget/TextView;

.field public final f$5:J

.field public final f$6:J

.field public final f$7:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;[Landroid/widget/ProgressBar;I[Landroid/widget/TextView;[Landroid/widget/TextView;JJJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$0:Landroid/app/Dialog;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$1:[Landroid/widget/ProgressBar;

    iput p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$3:[Landroid/widget/TextView;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$4:[Landroid/widget/TextView;

    iput-wide p6, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$5:J

    iput-wide p8, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$6:J

    iput-wide p10, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$7:J

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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
    const-string v0, "2aCwRE380Aa797RB"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۨۦۣ۠(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;JJJ)V
    .locals 13

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    move-object v1, p0

    check-cast v1, Landroid/app/Dialog;

    move-object v2, p1

    check-cast v2, [Landroid/widget/ProgressBar;

    move-object/from16 v4, p3

    check-cast v4, [Landroid/widget/TextView;

    move-object/from16 v5, p4

    check-cast v5, [Landroid/widget/TextView;

    move v3, p2

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    invoke-static/range {v1 .. v11}, Lkevin/fun/hook/download/DownloadManager;->lambda$14(Landroid/app/Dialog;[Landroid/widget/ProgressBar;I[Landroid/widget/TextView;[Landroid/widget/TextView;JJJ)V

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
    .locals 12

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-string v0, "\u06e4\u06e1\u06e3"

    :goto_0
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۠ۡ(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v5

    const-string v0, "\u06e5\u06e3\u06e3"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۦۡۨ(Ljava/lang/Object;)I

    move-result v3

    const-string v0, "\u06e8\u06e7\u06e1"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۥۤۡۦ(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v4

    const-string v0, "\u06e0\u06e1"

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۢۦۧ۠(Ljava/lang/Object;)J

    move-result-wide v10

    const-string v0, "\u06e2\u06e5\u06e8"

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۣ۟ۡۧ۟(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v0, "\u06e3\u06e1\u06e5"

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۤۢۢ۠(Ljava/lang/Object;)[Landroid/widget/ProgressBar;

    move-result-object v2

    const-string v0, "\u06e3\u06e3\u06df"

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۢۢۦ۠(Ljava/lang/Object;)J

    move-result-wide v6

    const-string v0, "\u06e4\u06df\u06e0"

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣ۟۟ۢۡ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v0, "\u06e1\u06e2\u06e4"

    goto :goto_0

    :sswitch_7
    invoke-static/range {v1 .. v11}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->ۨۦۣ۠(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;JJJ)V

    const-string v0, "\u06e4\u06e2\u06e1"

    goto :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaee3 -> :sswitch_2
        0x1ab305 -> :sswitch_7
        0x1ab647 -> :sswitch_4
        0x1ab67f -> :sswitch_0
        0x1ab9c5 -> :sswitch_6
        0x1aba06 -> :sswitch_3
        0x1aba23 -> :sswitch_8
        0x1abe05 -> :sswitch_5
        0x1ac9c2 -> :sswitch_1
    .end sparse-switch
.end method
