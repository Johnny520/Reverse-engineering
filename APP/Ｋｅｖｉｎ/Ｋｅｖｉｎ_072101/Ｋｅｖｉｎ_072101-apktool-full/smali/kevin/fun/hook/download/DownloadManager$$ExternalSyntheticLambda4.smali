.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:[Z

.field public final f$2:[Landroid/app/Dialog;

.field public final f$3:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;[Z[Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->f$1:[Z

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->f$2:[Landroid/app/Dialog;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->f$3:Landroid/content/Context;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "r9xA4P6i"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۦ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, [Z

    check-cast p2, [Landroid/app/Dialog;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager;->lambda$3$kevin-fun-hook-download-DownloadManager([Z[Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    const-string v0, "3P"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e0\u06e0\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۡۨۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v5, "\u06e6\u06e2\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۨ۟ۨ(Ljava/lang/Object;)[Z

    move-result-object v1

    const-string v5, "\u06df\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v3, v2, v4, p1}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->۟ۦ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e7\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۢۤۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۡۢ۟ۧ(Ljava/lang/Object;)[Landroid/app/Dialog;

    move-result-object v1

    const-string v5, "\u06e4\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa704 -> :sswitch_3
        0x1aaae4 -> :sswitch_2
        0x1aaf5c -> :sswitch_0
        0x1abe83 -> :sswitch_4
        0x1ac1ac -> :sswitch_1
    .end sparse-switch
.end method
