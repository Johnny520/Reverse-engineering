.class Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProgressViewHolder"
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field dialog:Landroid/app/Dialog;

.field hintText:Landroid/widget/TextView;

.field progressBar:Landroid/widget/ProgressBar;

.field progressInfo:Landroid/widget/TextView;

.field final this$1:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->short:[S

    return-void

    :array_0
    .array-data 2
        0x17bs
        0x13as
        0x17es
        0x171s
        0x17es
        0x17bs
        0x13as
        0x17es
        0x176s
        0x634es
        0x53c1s
        0x164s
        0x17bs
        0x13as
        0x17es
        0x586fs
        -0x7385s
        0x164s
        0x17bs
        0x13as
        0x177s
        0x6299s
        0x5ed2s
        0x47f1s
        -0x7979s
        0x9das
        0x9dfs
        0x99es
        0x9d5s
        0x9dfs
        0x99es
        0x5e96s
        0x7394s
        0x5c1es
        0x6582s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/app/Dialog;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->this$1:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->progressBar:Landroid/widget/ProgressBar;

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->progressInfo:Landroid/widget/TextView;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->hintText:Landroid/widget/TextView;

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->dialog:Landroid/app/Dialog;

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    const-string v0, "0vd3DP"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟ۡ۟ۧ()[S
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۣ۟ۡۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->progressInfo:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۦۣ۠ۡ(Ljava/lang/Object;)Landroid/widget/ProgressBar;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->progressBar:Landroid/widget/ProgressBar;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۧۦۥۧ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->hintText:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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
.method update(IIII)V
    .locals 7

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۦۣ۠ۡ(Ljava/lang/Object;)Landroid/widget/ProgressBar;

    move-result-object v1

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۦۣ۠ۡ(Ljava/lang/Object;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۦۣ۠ۡ(Ljava/lang/Object;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-static {v0, p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۥۨ۟(Ljava/lang/Object;I)V

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۣ۟ۡۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۣ۟ۡۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p4}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    sget v6, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v6, v6, 0x322

    aput-object v1, v5, v6

    sget v1, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v1, v1, 0x73

    aput-object v2, v5, v1

    sget v1, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v1, v1, 0x176

    aput-object v3, v5, v1

    sget v1, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v1, v1, 0x11d

    aput-object v4, v5, v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۣ۟ۡ۟ۧ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x318

    const/16 v4, 0x15e

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۧۦۥۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۧۦۥۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_3

    :sswitch_c
    if-ge p1, p2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x76

    aput-object v0, v3, v4

    sget v0, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v0, v0, 0x266

    aput-object v1, v3, v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۣ۟ۡ۟ۧ()[S

    move-result-object v0

    const/16 v1, 0x15

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x388

    const/16 v5, 0x9fa

    invoke-static {v0, v1, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_e
    invoke-static {v2, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_f
    return-void

    :sswitch_10
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->ۣ۟ۡ۟ۧ()[S

    move-result-object v0

    const/16 v1, 0x1f

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x16f

    const/16 v4, 0x792

    invoke-static {v0, v1, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
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
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_f
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_11
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch
.end method
