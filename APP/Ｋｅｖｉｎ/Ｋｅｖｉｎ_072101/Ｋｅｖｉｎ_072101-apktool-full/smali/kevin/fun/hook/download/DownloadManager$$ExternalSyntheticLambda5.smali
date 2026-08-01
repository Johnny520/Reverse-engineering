.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:[Z

.field public final f$2:[Lokhttp3/Call;

.field public final f$3:[Landroid/net/Uri;

.field public final f$4:Landroid/content/Context;

.field public final f$5:[Landroid/app/Dialog;

.field public final f$6:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$1:[Z

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$2:[Lokhttp3/Call;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$3:[Landroid/net/Uri;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$5:[Landroid/app/Dialog;

    iput-object p7, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$6:Landroid/content/Context;

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

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
    const-string v0, "w1MZB7ehHSNWjUJqBs9mIa6"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۡۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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

    check-cast v1, [Z

    move-object v2, p2

    check-cast v2, [Lokhttp3/Call;

    move-object v3, p3

    check-cast v3, [Landroid/net/Uri;

    move-object v4, p4

    check-cast v4, Landroid/content/Context;

    move-object v5, p5

    check-cast v5, [Landroid/app/Dialog;

    move-object v6, p6

    check-cast v6, Landroid/content/Context;

    move-object v7, p7

    check-cast v7, Landroid/view/View;

    invoke-virtual/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->lambda$4$kevin-fun-hook-download-DownloadManager([Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 v7, 0x0

    const-string v8, "\u06df\u06e2\u06e0"

    move-object v3, v7

    move-object v5, v7

    move-object v2, v7

    move-object v4, v7

    move-object v0, v7

    move-object v1, v7

    move-object v6, v7

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۦۡۧۢ(Ljava/lang/Object;)[Lokhttp3/Call;

    move-result-object v2

    const-string v7, "\u06e6\u06e5\u06e4"

    move-object v8, v7

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟ۤۡ۟(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const-string v7, "\u06e1\u06e1\u06e2"

    move-object v8, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->ۣ۟۟ۥۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const-string v7, "\u06e1\u06e3\u06e3"

    move-object v8, v7

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢ۟(Ljava/lang/Object;)[Z

    move-result-object v1

    const-string v7, "\u06e1\u06e1"

    move-object v8, v7

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۧۧۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v0

    const-string v7, "\u06df\u06e8\u06e8"

    move-object v8, v7

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۦ۠۟ۧ(Ljava/lang/Object;)[Landroid/app/Dialog;

    move-result-object v5

    const-string v7, "\u06df\u06e3\u06df"

    move-object v8, v7

    goto :goto_0

    :sswitch_5
    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->ۥۡۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v7, "\u06df\u06e4\u06e3"

    move-object v8, v7

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۦۥۡ(Ljava/lang/Object;)[Landroid/net/Uri;

    move-result-object v3

    const-string v7, "\u06e3\u06df\u06e7"

    move-object v8, v7

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa75d -> :sswitch_3
        0x1aa77b -> :sswitch_1
        0x1aa79e -> :sswitch_7
        0x1aa81f -> :sswitch_2
        0x1aaec2 -> :sswitch_4
        0x1aaf01 -> :sswitch_5
        0x1ab60b -> :sswitch_0
        0x1ac205 -> :sswitch_6
    .end sparse-switch
.end method
