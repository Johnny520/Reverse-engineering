.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$10:[Landroid/widget/TextView;

.field public final f$11:[Landroid/widget/ProgressBar;

.field public final f$12:[Landroid/widget/TextView;

.field public final f$2:[Landroid/app/Dialog;

.field public final f$3:Ljava/lang/String;

.field public final f$4:Ljava/lang/String;

.field public final f$5:[Z

.field public final f$6:[Z

.field public final f$7:[Lokhttp3/Call;

.field public final f$8:[Landroid/net/Uri;

.field public final f$9:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;Ljava/lang/ref/WeakReference;[Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;[Z[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$2:[Landroid/app/Dialog;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$5:[Z

    iput-object p7, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$6:[Z

    iput-object p8, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$7:[Lokhttp3/Call;

    iput-object p9, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$8:[Landroid/net/Uri;

    iput-object p10, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$9:Landroid/content/Context;

    iput-object p11, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$10:[Landroid/widget/TextView;

    iput-object p12, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$11:[Landroid/widget/ProgressBar;

    iput-object p13, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$12:[Landroid/widget/TextView;

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    const-string v0, "tv"

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۢۦۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 13

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Ljava/lang/ref/WeakReference;

    move-object v2, p2

    check-cast v2, [Landroid/app/Dialog;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, p5

    check-cast v5, [Z

    move-object/from16 v6, p6

    check-cast v6, [Z

    move-object/from16 v7, p7

    check-cast v7, [Lokhttp3/Call;

    move-object/from16 v8, p8

    check-cast v8, [Landroid/net/Uri;

    move-object/from16 v9, p9

    check-cast v9, Landroid/content/Context;

    move-object/from16 v10, p10

    check-cast v10, [Landroid/widget/TextView;

    move-object/from16 v11, p11

    check-cast v11, [Landroid/widget/ProgressBar;

    move-object/from16 v12, p12

    check-cast v12, [Landroid/widget/TextView;

    invoke-virtual/range {v0 .. v12}, Lkevin/fun/hook/download/DownloadManager;->lambda$2$kevin-fun-hook-download-DownloadManager(Ljava/lang/ref/WeakReference;[Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;[Z[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V

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
    .locals 13

    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۣ۟ۤۢ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v0

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۧۥۥ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۥۢۧۢ(Ljava/lang/Object;)[Landroid/app/Dialog;

    move-result-object v2

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۡۦ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->۠ۦۦۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۧۧۥۣ(Ljava/lang/Object;)[Z

    move-result-object v5

    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۡ۠ۧ۟(Ljava/lang/Object;)[Z

    move-result-object v6

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۢۦ۠ۨ(Ljava/lang/Object;)[Lokhttp3/Call;

    move-result-object v7

    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۥ۟۠ۦ(Ljava/lang/Object;)[Landroid/net/Uri;

    move-result-object v8

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡ۠ۦۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v9

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۥ۠۟(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v10

    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۤۢۤ(Ljava/lang/Object;)[Landroid/widget/ProgressBar;

    move-result-object v11

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟۟۠ۥ(Ljava/lang/Object;)[Landroid/widget/TextView;

    move-result-object v12

    invoke-static/range {v0 .. v12}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->ۢۦۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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
    const-string v0, "lgk4ywBJuYCjfTvjNrLZYo"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
