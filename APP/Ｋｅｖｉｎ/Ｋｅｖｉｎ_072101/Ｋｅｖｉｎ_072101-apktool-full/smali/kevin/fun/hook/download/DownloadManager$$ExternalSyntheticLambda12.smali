.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:[Landroid/app/Dialog;

.field public final f$2:Z

.field public final f$3:Landroid/content/Context;

.field public final f$4:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;[Landroid/app/Dialog;ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->f$1:[Landroid/app/Dialog;

    iput-boolean p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->f$2:Z

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->f$4:Ljava/lang/String;

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    const-string v0, "bL3jNveX2Dt"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۣ۟ۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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

    check-cast p1, [Landroid/app/Dialog;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager;->lambda$8$kevin-fun-hook-download-DownloadManager([Landroid/app/Dialog;ZLandroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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
    const-string v0, "49dvqhDVc3AwJ3JeTaHX7v8HCE2"

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۠ۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

    const/4 v6, 0x0

    const-string v5, "\u06e7\u06e7\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->ۣۣۧ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v1

    const-string v5, "\u06e5\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0, v6, v4, v3}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;->ۣ۟ۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e4\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۥۦۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v5, "\u06e7\u06e2\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/loader/ۢۥ۟;->ۥۧۤۧ(Ljava/lang/Object;)Z

    move-result v6

    const-string v1, "\u06e7\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠ۡۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e0\u06e2\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۡۤۡۥ(Ljava/lang/Object;)[Landroid/app/Dialog;

    move-result-object v0

    const-string v1, "\u06e5\u06e6\u06e8"

    move-object v5, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdc -> :sswitch_2
        0x1aab1f -> :sswitch_1
        0x1abe67 -> :sswitch_3
        0x1abea5 -> :sswitch_5
        0x1ac567 -> :sswitch_4
        0x1ac5ff -> :sswitch_0
    .end sparse-switch
.end method
