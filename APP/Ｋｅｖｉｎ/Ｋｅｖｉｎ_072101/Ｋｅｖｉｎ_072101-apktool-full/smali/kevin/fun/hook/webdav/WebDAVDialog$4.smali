.class Lkevin/fun/hook/webdav/WebDAVDialog$4;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/webdav/WebDAVConfig$BackupCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/webdav/WebDAVDialog;->showConfigDialog(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final val$context:Landroid/content/Context;

.field private final val$webdavStatusText:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x21bs
        0x21bs
        0x21bs
        0x21bs
        0x24fs
        0x22fs
        0x22fs
        0x24fs
        0x206s
        0x206s
        0x242s
        0x22as
        0x22as
        0x258s
        0x20fs
        0x20fs
        0x258s
        0x211s
        0x211s
        0x477as
        0x6251s
        0x47e1s
        0x5077s
        0x478ds
        -0x996s
    .end array-data
.end method

.method constructor <init>(Landroid/content/Context;Landroid/widget/TextView;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->val$webdavStatusText:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "zl4WXeWatFF0TOGx3DUg"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۟ۡۥ()[S
    .locals 2

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
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->short:[S

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

.method public static ۣ۟۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog;->_$$Nest$smshowSafeToast(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static ۟ۧۧۦۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    check-cast p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;

    iget-object v0, p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->val$context:Landroid/content/Context;

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

.method public static ۤۤۤۧ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    check-cast p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;

    iget-object v0, p0, Lkevin/fun/hook/webdav/WebDAVDialog$4;->val$webdavStatusText:Landroid/widget/TextView;

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
.method public onFailure(Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->۟ۧۧۦۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->ۣ۟۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "bcNIojlDaELNmlzgtqwv"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public onProgress(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    const-string v0, "zejMGTCrKHQoujVzZ16Iy1A2"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public onSuccess(Ljava/lang/String;)V
    .locals 17

    const/4 v2, 0x0

    const-wide/16 v12, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v15, "\u06e0\u06e0\u06e4"

    :goto_0
    invoke-static {v15}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v15

    sparse-switch v15, :sswitch_data_0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->ۤۤۤۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    const-string v15, "\u06e5\u06df\u06e1"

    goto :goto_0

    :sswitch_0
    invoke-static {v4, v6}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v15, "\u06e6\u06e4\u06e7"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v12

    const-string v15, "\u06e6\u06e0\u06df"

    goto :goto_0

    :sswitch_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\u06e2\u06e0\u06e3"

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v7

    const-string v15, "\u06e1\u06e6\u06e8"

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v14, v11, 0x295

    const-string v15, "\u06e7\u06e7\u06e3"

    goto :goto_0

    :sswitch_5
    const/4 v15, 0x0

    const/16 v16, 0x262

    move/from16 v0, v16

    invoke-static {v8, v15, v14, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object p1

    const-string v15, "\u06e8\u06e1\u06e6"

    goto :goto_0

    :sswitch_6
    new-instance v4, Ljava/text/SimpleDateFormat;

    move-object/from16 v0, p1

    invoke-direct {v4, v0, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v15, "\u06e3\u06e8\u06e1"

    goto :goto_0

    :sswitch_7
    const/16 v9, 0x13

    const/16 v15, 0x970

    invoke-static {v8, v9, v14, v15}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v9

    const-string v15, "\u06e6\u06e2\u06e2"

    goto :goto_0

    :sswitch_8
    move-object/from16 v0, p1

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v15, "\u06e7\u06e2\u06e1"

    goto :goto_0

    :sswitch_9
    sget v11, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v15, "\u06e0\u06e2\u06e7"

    goto :goto_0

    :sswitch_a
    sget v11, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v15, "\u06e6\u06e0\u06e7"

    goto :goto_0

    :sswitch_b
    invoke-static {v10, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v15, "\u06e2\u06e1\u06e2"

    goto :goto_0

    :sswitch_c
    invoke-static {v10}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v15, "\u06e0\u06df\u06e3"

    goto :goto_0

    :sswitch_d
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v12, v13}, Ljava/util/Date;-><init>(J)V

    const-string v15, "\u06e1\u06e7\u06e2"

    goto :goto_0

    :sswitch_e
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->۟ۧۧۦۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const-string v15, "\u06e2\u06e5\u06e8"

    goto :goto_0

    :sswitch_f
    invoke-static {v5, v9}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v15, "\u06e0\u06e3\u06e3"

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->ۣ۟۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v15, "\u06e2\u06e8\u06e3"

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->ۣ۟۟ۡۥ()[S

    move-result-object v8

    const-string v15, "\u06e7\u06e5\u06df"

    goto/16 :goto_0

    :sswitch_12
    xor-int/lit16 v14, v11, 0x135

    const-string v15, "\u06e7\u06e0"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVDialog$4;->ۣ۟۟ۡۥ()[S

    move-result-object v8

    const-string v15, "\u06e1\u06e0\u06e0"

    goto/16 :goto_0

    :sswitch_14
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcd9 -> :sswitch_5
        0x1aaac4 -> :sswitch_f
        0x1aaae4 -> :sswitch_e
        0x1aab25 -> :sswitch_12
        0x1aab40 -> :sswitch_14
        0x1aaea1 -> :sswitch_a
        0x1aaf63 -> :sswitch_6
        0x1aaf7c -> :sswitch_0
        0x1ab265 -> :sswitch_13
        0x1ab283 -> :sswitch_8
        0x1ab305 -> :sswitch_10
        0x1ab35d -> :sswitch_1
        0x1abd87 -> :sswitch_d
        0x1ac165 -> :sswitch_11
        0x1ac16d -> :sswitch_4
        0x1ac1a6 -> :sswitch_b
        0x1ac1e9 -> :sswitch_2
        0x1ac566 -> :sswitch_c
        0x1ac5c1 -> :sswitch_9
        0x1ac603 -> :sswitch_7
        0x1ac90d -> :sswitch_3
    .end sparse-switch
.end method
