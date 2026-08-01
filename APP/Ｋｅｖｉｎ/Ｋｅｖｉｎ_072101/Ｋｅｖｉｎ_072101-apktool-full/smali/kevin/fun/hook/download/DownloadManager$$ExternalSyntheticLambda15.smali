.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:[Z

.field public final f$10:[Landroid/app/Dialog;

.field public final f$11:[Landroid/widget/TextView;

.field public final f$12:[Landroid/widget/ProgressBar;

.field public final f$13:[Landroid/widget/TextView;

.field public final f$14:J

.field public final f$15:Ljava/lang/String;

.field public final f$2:Ljava/lang/String;

.field public final f$3:Ljava/lang/String;

.field public final f$4:Ljava/lang/String;

.field public final f$5:Landroid/content/Context;

.field public final f$6:[Landroid/net/Uri;

.field public final f$7:[Lokhttp3/Call;

.field public final f$8:Z

.field public final f$9:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;[ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;[Landroid/net/Uri;[Lokhttp3/Call;Z[Z[Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;JLjava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$1:[Z

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$6:[Landroid/net/Uri;

    iput-object p8, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$7:[Lokhttp3/Call;

    iput-boolean p9, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$8:Z

    iput-object p10, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$9:[Z

    move-object/from16 v0, p11

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$10:[Landroid/app/Dialog;

    move-object/from16 v0, p12

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$11:[Landroid/widget/TextView;

    move-object/from16 v0, p13

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$12:[Landroid/widget/ProgressBar;

    move-object/from16 v0, p14

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$13:[Landroid/widget/TextView;

    move-wide/from16 v0, p15

    iput-wide v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$14:J

    move-object/from16 v0, p17

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$15:Ljava/lang/String;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v2, "OfTbbJSfmaecTUuBUBerKhDHv"

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۣۧۦۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 18

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object/from16 v1, p1

    check-cast v1, [Z

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, p5

    check-cast v5, Landroid/content/Context;

    move-object/from16 v6, p6

    check-cast v6, [Landroid/net/Uri;

    move-object/from16 v7, p7

    check-cast v7, [Lokhttp3/Call;

    move-object/from16 v9, p9

    check-cast v9, [Z

    move-object/from16 v10, p10

    check-cast v10, [Landroid/app/Dialog;

    move-object/from16 v11, p11

    check-cast v11, [Landroid/widget/TextView;

    move-object/from16 v12, p12

    check-cast v12, [Landroid/widget/ProgressBar;

    move-object/from16 v13, p13

    check-cast v13, [Landroid/widget/TextView;

    move-object/from16 v16, p16

    check-cast v16, Ljava/lang/String;

    move/from16 v8, p8

    move-wide/from16 v14, p14

    invoke-virtual/range {v0 .. v16}, Lkevin/fun/hook/download/DownloadManager;->lambda$5$kevin-fun-hook-download-DownloadManager([ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;[Landroid/net/Uri;[Lokhttp3/Call;Z[Z[Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;JLjava/lang/String;)V

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
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-string v17, "\u06e5\u06e7\u06e0"

    :goto_0
    invoke-static/range {v17 .. v17}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v17

    sparse-switch v17, :sswitch_data_0

    invoke-static/range {p0 .. p0}, Landroidx/loader/ۢۥ۟;->ۡۤۤۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v17, "\u06e5\u06e2\u06e4"

    goto :goto_0

    :sswitch_0
    invoke-static/range {p0 .. p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟ۧۢۢ(Ljava/lang/Object;)[Landroid/net/Uri;

    move-result-object v6

    const-string v17, "\u06e8\u06e5\u06e4"

    goto :goto_0

    :sswitch_1
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟ۥۤۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v0

    const-string v17, "\u06e5\u06e0\u06e6"

    goto :goto_0

    :sswitch_2
    invoke-static/range {p0 .. p0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۤ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v17, "\u06e1\u06e5\u06e6"

    goto :goto_0

    :sswitch_3
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۨۥ(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v11

    const-string v17, "\u06e5\u06e7\u06e8"

    goto :goto_0

    :sswitch_4
    invoke-static/range {p0 .. p0}, Landroidx/loader/ۥۧۨۤ;->۟ۨۢۢ(Ljava/lang/Object;)[Z

    move-result-object v1

    const-string v17, "\u06e2\u06e4\u06e0"

    goto :goto_0

    :sswitch_5
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۨ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    const-string v17, "\u06e1\u06e4\u06e7"

    goto :goto_0

    :sswitch_6
    invoke-static/range {p0 .. p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۢۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v17, "\u06df\u06df"

    goto :goto_0

    :sswitch_7
    invoke-static/range {p0 .. p0}, Landroidx/loader/ۡۢۢ;->ۣ۟ۤۢ(Ljava/lang/Object;)[Landroid/app/Dialog;

    move-result-object v10

    const-string v17, "\u06e3\u06e7\u06e0"

    goto :goto_0

    :sswitch_8
    invoke-static/range {p0 .. p0}, Landroidx/loader/ۢۥ۟;->۠ۤۢۧ(Ljava/lang/Object;)J

    move-result-wide v14

    const-string v17, "\u06e4\u06e0\u06e4"

    goto :goto_0

    :sswitch_9
    invoke-static/range {p0 .. p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟ۥۣ۠ۨ(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v13

    const-string v17, "\u06e1\u06e4\u06e6"

    goto :goto_0

    :sswitch_a
    invoke-static/range {p0 .. p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۤۨۢۨ(Ljava/lang/Object;)[Z

    move-result-object v9

    const-string v17, "\u06e6\u06e6\u06e2"

    goto :goto_0

    :sswitch_b
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡۦ۠ۧ(Ljava/lang/Object;)Z

    move-result v8

    const-string v17, "\u06e6\u06e8\u06e3"

    goto :goto_0

    :sswitch_c
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۠ۦۦۢ(Ljava/lang/Object;)[Landroid/widget/ProgressBar;

    move-result-object v12

    const-string v17, "\u06e1\u06e6\u06e5"

    goto :goto_0

    :sswitch_d
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۥۣۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const-string v17, "\u06df\u06e7\u06e0"

    goto :goto_0

    :sswitch_e
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۥۤۧ(Ljava/lang/Object;)[Lokhttp3/Call;

    move-result-object v7

    const-string v17, "\u06e1\u06e1\u06e6"

    goto :goto_0

    :sswitch_f
    invoke-static/range {v0 .. v16}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->ۣۧۦۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V

    const-string v17, "\u06e3\u06e0"

    goto :goto_0

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_10
        0x1aa7f8 -> :sswitch_0
        0x1aaec6 -> :sswitch_b
        0x1aaf23 -> :sswitch_8
        0x1aaf24 -> :sswitch_f
        0x1aaf42 -> :sswitch_6
        0x1aaf60 -> :sswitch_9
        0x1ab2de -> :sswitch_2
        0x1ab6fc -> :sswitch_3
        0x1ab9e8 -> :sswitch_5
        0x1abdab -> :sswitch_4
        0x1abde7 -> :sswitch_d
        0x1abe7e -> :sswitch_1
        0x1abe86 -> :sswitch_c
        0x1ac222 -> :sswitch_7
        0x1ac261 -> :sswitch_a
        0x1ac987 -> :sswitch_e
    .end sparse-switch
.end method
