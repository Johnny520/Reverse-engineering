.class public Lkevin/fun/hook/DownloadPathDialog;
.super Ljava/lang/Object;


# static fields
.field public static final REQ_SELECT_DOWNLOAD_DIR:I = 0x2290

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DownloadPathDialog;->short:[S

    return-void

    :array_0
    .array-data 2
        0x7746s
        0x5efds
        0x6220s
        0x66ebs
        0x63b8s
        0x5337s
        0x73e0s
        0x5a5bs
        0x6686s
        0x624ds
        0x5c3fs
        -0x77d5s
        0x534s
        0x52es
        0x6e86s
        -0x665bs
        0x6b45s
        0x7f42s
        0x56f9s
        0x5346s
        0x5e58s
        0x7afbs
        0x5340s
        -0xcf1s
        0xc1fs
        0x5534s
        -0x66f5s
        0x77a8s
        0x436s
        0x439s
        0x433s
        0x425s
        0x438s
        0x43es
        0x433s
        0x479s
        0x43es
        0x439s
        0x423s
        0x432s
        0x439s
        0x423s
        0x479s
        0x436s
        0x434s
        0x423s
        0x43es
        0x438s
        0x439s
        0x479s
        0x418s
        0x407s
        0x412s
        0x419s
        0x408s
        0x413s
        0x418s
        0x414s
        0x402s
        0x41as
        0x412s
        0x419s
        0x403s
        0x408s
        0x403s
        0x405s
        0x412s
        0x412s
        0x47ces
        0x534bs
        -0x7a04s
        0x5797s
        -0x7c53s
        0x777ds
        0x5482s
        0x599cs
        0x7d3fs
        0x5484s
        -0xb35s
        0xbdbs
        0x79e6s
        0x58a4s
        0x2943s
        -0x66aas
        0x6bb6s
        0x7fb1s
        0x560as
        0x2942s
        -0x9ads
        0x75a4s
        0x7780s
        -0x6ed6s
        -0x61c3s
        0x79e6s
        0x2943s
        0x4620s
        0x7c77s
        0x623bs
        0x7fb1s
        0x560as
        0x2942s
        0x5d51s
        -0x9ads
        0x4645s
        -0x7518s
        0x56c8s
        0x7e40s
        0x52c1s
        0x58c6s
        0x583as
        0x6e1cs
        -0x60f1s
        0x395ds
        0x4752s
        -0x7f22s
        0x58d2s
        0x6b14s
        0x5bf7s
        0x5134s
        0x97fs
        0x970s
        0x92cs
        0x93bs
        0x93cs
        0x93es
        0x92ds
        0x93bs
        0x97fs
        -0x7b50s
        0x56dbs
        0x395ds
        -0x6d5ds
        0x7c00s
        0x5f4cs
        0x6112s
        -0x65c7s
        0x68d9s
        0x7cdes
        0x5565s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    const-string v0, "DdQhqTeFc6N7BYw"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method private static dp(Landroid/app/Activity;I)I
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e5\u06e4\u06e8"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v4

    const-string v1, "\u06e5\u06e6\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v1

    const-string v3, "\u06e0\u06e7\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    int-to-float v5, p1

    const-string v1, "\u06df\u06e7\u06e5"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟ۤۢۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "\u06e7\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    float-to-int p1, v7

    const-string v1, "\u06e0\u06e8\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    mul-float v5, v7, v4

    const-string v1, "\u06e2\u06e3\u06e8"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_5
    const/high16 v1, 0x3f000000    # 0.5f

    add-float v5, v6, v1

    const-string v1, "\u06e4\u06e8\u06e1"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_6
    return p1

    :sswitch_data_0
    .sparse-switch
        0xdce1 -> :sswitch_0
        0x1aa7fd -> :sswitch_2
        0x1aabda -> :sswitch_6
        0x1ab2c7 -> :sswitch_5
        0x1abadd -> :sswitch_3
        0x1abe29 -> :sswitch_1
        0x1abe60 -> :sswitch_4
    .end sparse-switch
.end method

.method public static handleActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    .locals 7

    const/4 v1, 0x1

    const/4 v0, 0x0

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
    const/16 v2, 0x2290

    if-eq p1, v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p3, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p3}, Landroidx/customview/ۡۤۡۤ;->ۨ۠ۥۣ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v0

    const/16 v2, 0xe

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1ef

    const/16 v4, 0x9ac

    invoke-static {v0, v2, v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DownloadPathDialog;->ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    move v0, v1

    :goto_5
    :sswitch_d
    return v0

    :sswitch_e
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_f
    :try_start_0
    invoke-static {p3}, Landroidx/customview/ۡۤۡۤ;->ۨ۠ۥۣ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p3}, Landroidx/loader/ۥۧۨۤ;->۟ۧۥ۟۠(Ljava/lang/Object;)I

    move-result v2

    sget v3, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۢۢۥ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v4

    xor-int/lit16 v3, v3, 0x3a3

    and-int/2addr v2, v3

    invoke-static {v4, v0, v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥ(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v2, Lkevin/fun/hook/DownloadPathConfig;

    invoke-direct {v2, p0}, Lkevin/fun/hook/DownloadPathConfig;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v0

    const/4 v2, 0x0

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x17f

    const/16 v4, 0x1a8

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DownloadPathDialog;->ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    const v0, 0xc221

    goto :goto_6

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v3

    const/4 v4, 0x6

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x26f

    const/16 v6, 0x50e

    invoke-static {v3, v4, v5, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DownloadPathDialog;->ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_11
    move v0, v1

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_d
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch
.end method

.method static synthetic lambda$0(Lkevin/fun/hook/DownloadPathConfig;Landroid/widget/TextView;Landroid/app/Activity;Landroid/view/View;)V
    .locals 10

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e0\u06df\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v1, v8, 0xc5

    const-string v7, "\u06e8\u06e0\u06e7"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_0
    invoke-static {p1, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e2\u06e5"

    move-object v9, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۠ۡۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e4\u06e1\u06e2"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v1

    const-string v7, "\u06e4\u06e6\u06e3"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_3
    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v1, "\u06e3\u06e3"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p2, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e4\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e5\u06e1"

    move-object v9, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x13

    const/16 v5, 0xc15

    invoke-static {v4, v1, v6, v5}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06df\u06e6"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۥۣۤۨ(Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e4\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e8\u06e1"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_9
    const/16 v1, 0x19

    const/16 v3, 0x8c6

    invoke-static {v4, v1, v6, v3}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e5\u06df\u06e5"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_a
    sget v7, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e8\u06e6"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e7\u06e8\u06e1"

    move-object v2, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v1, v8, -0x1ad

    const-string v7, "\u06e7\u06e7\u06e0"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u06e5\u06e5\u06e5"

    move-object v2, v1

    move-object v9, v7

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v1

    const-string v7, "\u06e7\u06e4\u06e8"

    move-object v4, v1

    move-object v9, v7

    goto/16 :goto_0

    :sswitch_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9c -> :sswitch_b
        0xdcfe -> :sswitch_c
        0x1aa79e -> :sswitch_1
        0x1aa818 -> :sswitch_0
        0x1aaac3 -> :sswitch_7
        0x1ab249 -> :sswitch_5
        0x1aba05 -> :sswitch_d
        0x1abaa1 -> :sswitch_a
        0x1abd8b -> :sswitch_4
        0x1abe21 -> :sswitch_f
        0x1abe45 -> :sswitch_e
        0x1ac56a -> :sswitch_2
        0x1ac5ab -> :sswitch_3
        0x1ac600 -> :sswitch_9
        0x1ac620 -> :sswitch_8
        0x1ac8ef -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$1(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$2(Landroid/app/Dialog;Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۡ۠ۥۡ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "7GnaRWMlXqow679dKAP"

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۠ۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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
    const-string v0, "fCQPZlWQli3jK7cwn2Q"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic lambda$4(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    const-string v0, "H67szT6Y6HdQas"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static makeBtnBg(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    return-object v0
.end method

.method public static openDirectoryPicker(Landroid/app/Activity;)V
    .locals 5

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v1

    const/16 v2, 0x1c

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x31d

    const/16 v4, 0x457

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v1, v1, -0x1ea

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v1, v1, -0x1ac

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit8 v1, v1, -0x6d

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v1, v1, -0x2378

    invoke-static {p0, v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۦ۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    const-string v0, "O4F6bpFGOQc6WEAOnbxAd0VGwNb"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static show(Landroid/app/Activity;Lkevin/fun/hook/DownloadPathConfig;)V
    .locals 14

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
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣ۠ۨ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x1030136

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v1, v2

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const v2, -0x660001be

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x296

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v5, v5, -0x76

    invoke-static {p0, v5}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v6

    sget v7, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v7, v7, 0x7

    invoke-static {p0, v7}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v2, v4, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v4, v4, -0x254

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, -0x31f

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v6, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x50

    iput v7, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v2, v6}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v6, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v7

    int-to-float v7, v7

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v8

    int-to-float v8, v8

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v9

    int-to-float v9, v9

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v3

    int-to-float v3, v3

    const/16 v10, 0x8

    new-array v10, v10, [F

    const/4 v11, 0x0

    aput v7, v10, v11

    const/4 v7, 0x1

    aput v8, v10, v7

    const/4 v7, 0x2

    aput v9, v10, v7

    const/4 v7, 0x3

    aput v3, v10, v7

    sget v3, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v3, v3, 0x297

    const/4 v7, 0x0

    aput v7, v10, v3

    const/4 v7, 0x5

    const/4 v8, 0x0

    aput v8, v10, v7

    const/4 v7, 0x6

    const/4 v8, 0x0

    aput v8, v10, v7

    const/4 v7, 0x7

    const/4 v8, 0x0

    aput v8, v10, v7

    invoke-static {v6, v10}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v7

    const/16 v8, 0x44

    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v9, v9, 0x35d

    const/16 v10, 0x813

    invoke-static {v7, v8, v9, v10}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v7, 0x41900000    # 18.0f

    invoke-static {v6, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v7, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v7, v7, -0x5c

    invoke-static {v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const v7, 0xdddde9

    sget v8, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v7, v8

    invoke-static {v6, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v7, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v7, v7, 0x168

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {p0, v7}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v11

    invoke-static {v6, v8, v9, v10, v11}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۠ۡۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v10

    const/16 v11, 0x4a

    sget v12, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v12, v12, 0x2f8

    const/16 v13, 0xbd1

    invoke-static {v10, v11, v12, v13}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {v9, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v8, 0x41600000    # 14.0f

    invoke-static {v6, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v8, -0xcccc10

    sget v9, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/2addr v8, v9

    invoke-static {v6, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v8, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v8, v8, 0x7e

    invoke-static {p0, v8}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v9

    invoke-static {p0, v8}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v10

    invoke-static {p0, v8}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v11

    invoke-static {p0, v8}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v8

    invoke-static {v6, v9, v10, v11, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v9, 0xa0a19

    sget v10, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/2addr v9, v10

    invoke-static {v8, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v9, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v9, v9, -0x161

    invoke-static {p0, v9}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v10

    int-to-float v10, v10

    invoke-static {v8, v10}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v6, v8}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v6, v8}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v8

    const/16 v10, 0x50

    sget v11, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v11, v11, 0x61

    const/16 v12, 0x95f

    invoke-static {v8, v10, v11, v12}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {v5, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v8, 0x777743

    sget v10, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v8, v10

    invoke-static {v5, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v8

    invoke-static {p0, v9}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v9

    invoke-static {p0, v3}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v7}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v5, v8, v9, v3, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-static {v3, v5}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v5, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v5, v5, -0x334

    invoke-static {v3, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/Button;

    invoke-direct {v5, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v7

    const/16 v8, 0x83

    sget v9, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v9, v9, 0x17b

    const/16 v10, 0x36e

    invoke-static {v7, v8, v9, v10}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v7, 0xcccdc4

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/2addr v7, v8

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const v7, 0x131371

    sget v8, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/2addr v7, v8

    invoke-static {v7}, Lkevin/fun/hook/DownloadPathDialog;->۟ۢۦۡۢ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/widget/Button;

    invoke-direct {v7, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v8

    const/16 v9, 0x85

    sget v10, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v10, v10, 0x15d

    const/16 v11, 0xc9a

    invoke-static {v8, v9, v10, v11}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v8, -0x9998c7

    sget v9, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/2addr v8, v9

    invoke-static {v7, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const v8, 0xd0def

    sget v9, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/2addr v8, v9

    invoke-static {v8}, Lkevin/fun/hook/DownloadPathDialog;->۟ۢۦۡۢ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/Button;

    invoke-direct {v8, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DownloadPathDialog;->۠ۤۦۣ()[S

    move-result-object v9

    const/16 v10, 0x87

    sget v11, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v11, v11, -0x10d

    const/16 v12, 0xa30

    invoke-static {v9, v10, v11, v12}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const v4, 0xa89d

    sget v9, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v4, v9

    invoke-static {v4}, Lkevin/fun/hook/DownloadPathDialog;->۟ۢۦۡۢ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v4

    invoke-static {v8, v4}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, 0x0

    sget v10, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v10, v10, -0x253

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v4, v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v9, v9, 0x35f

    invoke-static {p0, v9}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v10

    const/4 v11, 0x0

    invoke-static {p0, v9}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v9

    const/4 v12, 0x0

    invoke-static {v4, v10, v11, v9, v12}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v5, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v7, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v8, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1, v6, p0}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/DownloadPathConfig;Landroid/widget/TextView;Landroid/app/Activity;)V

    invoke-static {v5, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda1;

    invoke-direct {v3, v0}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda1;-><init>(Landroid/app/Dialog;)V

    invoke-static {v7, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;

    invoke-direct {v3, v0, p0}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda2;-><init>(Landroid/app/Dialog;Landroid/app/Activity;)V

    invoke-static {v8, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda3;

    invoke-direct {v3, v0}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda3;-><init>(Landroid/app/Dialog;)V

    invoke-static {v1, v3}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda4;

    invoke-direct {v1}, Lkevin/fun/hook/DownloadPathDialog$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v2, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v0, v0, 0x263

    invoke-static {p0, v0}, Lkevin/fun/hook/DownloadPathDialog;->ۤۡۨۨ(Ljava/lang/Object;I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v2, v0}, Landroidx/loader/ۡۢۢ;->۠ۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0xba

    sget v1, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    const v2, 0x3f59999a    # 0.85f

    invoke-direct {v1, v2}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    :sswitch_8
    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method private static toast(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۟ۢۦۡۢ(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

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
    invoke-static {p0}, Lkevin/fun/hook/DownloadPathDialog;->makeBtnBg(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

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

.method public static ۠ۤۦۣ()[S
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DownloadPathDialog;->short:[S

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

.method public static ۤۡۨۨ(Ljava/lang/Object;I)I
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0, p1}, Lkevin/fun/hook/DownloadPathDialog;->dp(Landroid/app/Activity;I)I

    move-result v0

    :sswitch_3
    return v0

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

.method public static ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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
    check-cast p0, Landroid/app/Activity;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DownloadPathDialog;->toast(Landroid/app/Activity;Ljava/lang/String;)V

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
