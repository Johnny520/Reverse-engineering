.class Lkevin/fun/hook/PPHook$2$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/PPHook$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$1:Lkevin/fun/hook/PPHook$2;

.field private final val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

.field private final val$context:Landroid/content/Context;

.field private final val$e:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook$2$4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x69aes
        0x6b55s
        0x5f5fs
        -0x74b5s
        -0x68cs
        0x664s
        0x73f6s
        0x727bs
        -0x6642s
        -0x78b8s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Ljava/lang/Throwable;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/PPHook$2$4;->this$1:Lkevin/fun/hook/PPHook$2;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$2$4;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$2$4;->val$e:Ljava/lang/Throwable;

    iput-object p4, p0, Lkevin/fun/hook/PPHook$2$4;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "bjZeUHWgcEL1XKLS0Nx7LyzV2iz3"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡۡۢ۠()V
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
    invoke-static {}, Lkevin/fun/hook/PPHook;->_$$Nest$smdismissLoadingDialog()V

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

.method public static ۟ۧۡۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2$4;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$4;->val$context:Landroid/content/Context;

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

.method public static ۠ۡ۟ۨ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2$4;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$4;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

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

.method public static ۡ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/Throwable;
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
    check-cast p0, Lkevin/fun/hook/PPHook$2$4;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$4;->val$e:Ljava/lang/Throwable;

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

.method public static ۥۥۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p4, Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/PPHook;->_$$Nest$smshowResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkevin/fun/hook/PPHook$VerifyCallback;)V

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

.method public static ۣۧ۠۟()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    sget-object v0, Lkevin/fun/hook/PPHook$2$4;->short:[S

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
.method public run()V
    .locals 13

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e3\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move v10, v11

    move v12, v11

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$4;->۟ۡۡۢ۠()V

    const-string v1, "\u06e1\u06e7\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$4;->۟ۧۡۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v9, "\u06e6\u06e8\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v8, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, "\u06e0\u06e4\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$4;->ۡ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    const-string v1, "\u06e2\u06e5\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, "\u06e3\u06e0\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$4;->۠ۡ۟ۨ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v1

    const-string v9, "\u06e8\u06e3\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v10, v12, -0x26a

    const-string v1, "\u06e4\u06e0\u06e2"

    move-object v9, v1

    goto :goto_0

    :sswitch_6
    const-string v1, "\u06e7\u06e4\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u06e4\u06e0\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/PPHook$2$4;->ۣۧ۠۟()[S

    move-result-object v1

    const-string v9, "\u06df\u06e0\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x6

    const/16 v6, 0xca7

    invoke-static {v7, v1, v10, v6}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e5\u06e2\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {v4, v6, v5, v11, v3}, Lkevin/fun/hook/PPHook$2$4;->ۥۥۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06e0\u06e6\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_b
    const-string v1, "\u06e1\u06e4\u06e2"

    move-object v9, v1

    goto :goto_0

    :sswitch_c
    const/16 v1, 0x66e

    invoke-static {v7, v11, v10, v1}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e1\u06e5\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    sget v12, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    const-string v1, "\u06e8\u06e2\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e8\u06e1\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/PPHook$2$4;->ۣۧ۠۟()[S

    move-result-object v1

    const-string v9, "\u06e6\u06e3\u06e2"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e7\u06e0\u06e8"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_11
    sget v12, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e4\u06e5\u06e6"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_12
    xor-int/lit16 v10, v12, 0x309

    const-string v1, "\u06e0\u06e3\u06e6"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_13
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa727 -> :sswitch_d
        0x1aab43 -> :sswitch_9
        0x1aab5f -> :sswitch_3
        0x1aaba1 -> :sswitch_13
        0x1aaf1f -> :sswitch_2
        0x1aaf3b -> :sswitch_1
        0x1aaf7a -> :sswitch_0
        0x1ab305 -> :sswitch_10
        0x1ab627 -> :sswitch_e
        0x1ab9e3 -> :sswitch_8
        0x1ab9e6 -> :sswitch_c
        0x1aba85 -> :sswitch_12
        0x1abde3 -> :sswitch_a
        0x1ac1c5 -> :sswitch_11
        0x1ac261 -> :sswitch_b
        0x1ac52f -> :sswitch_7
        0x1ac5aa -> :sswitch_4
        0x1ac90e -> :sswitch_6
        0x1ac92e -> :sswitch_5
        0x1ac944 -> :sswitch_f
    .end sparse-switch
.end method
