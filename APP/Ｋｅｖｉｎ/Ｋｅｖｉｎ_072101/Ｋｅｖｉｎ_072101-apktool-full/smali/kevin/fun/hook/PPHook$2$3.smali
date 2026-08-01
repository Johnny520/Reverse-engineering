.class Lkevin/fun/hook/PPHook$2$3;
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

.field private final val$finalErr:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook$2$3;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6360s
        0x619bs
        0x5591s
        -0x7e7bs
        -0xc46s
        0xcaas
        0x770ds
        0x7680s
        -0x62bbs
        -0x7c4ds
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/PPHook$2$3;->this$1:Lkevin/fun/hook/PPHook$2;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$2$3;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$2$3;->val$finalErr:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/PPHook$2$3;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    const-string v0, "LkX6pHi"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۟۟ۦۤۧ()V
    .locals 2

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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

.method public static ۟ۤ۠ۥۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2$3;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$3;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

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

.method public static ۟ۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/PPHook$2$3;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$3;->val$finalErr:Ljava/lang/String;

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

.method public static ۣۣۡ۟(Ljava/lang/Object;)Landroid/content/Context;
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
    check-cast p0, Lkevin/fun/hook/PPHook$2$3;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$3;->val$context:Landroid/content/Context;

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

.method public static ۥۨۢۥ()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

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
    sget-object v0, Lkevin/fun/hook/PPHook$2$3;->short:[S

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

.method public static ۣۨۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
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


# virtual methods
.method public run()V
    .locals 12

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06df\u06e1\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0xca0

    invoke-static {v6, v10, v9, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e3\u06e0\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$3;->۟ۤ۠ۥۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v1

    const-string v8, "\u06e7\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$3;->ۣۣۡ۟(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v8, "\u06e7\u06e0\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v9, v11, -0x21c

    const-string v1, "\u06e4\u06e3\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e8\u06e0\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$3;->۟ۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e3\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v0, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v8, "\u06e0\u06e4\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/PPHook$2$3;->۟۟ۦۤۧ()V

    const-string v1, "\u06e0\u06e1\u06e0"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v11, 0x228

    const-string v1, "\u06e0\u06e5\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06df\u06e6\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    sget v11, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    const-string v1, "\u06e0\u06e6\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    sget v11, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e3\u06e7\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u06e1\u06e2\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v2, v7, v4, v10, v3}, Lkevin/fun/hook/PPHook$2$3;->ۣۨۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06df\u06e8\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/PPHook$2$3;->ۥۨۢۥ()[S

    move-result-object v1

    const-string v8, "\u06e7\u06e5\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/PPHook$2$3;->ۥۨۢۥ()[S

    move-result-object v1

    const-string v8, "\u06e1\u06e0\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_f
    const/4 v1, 0x6

    const/16 v7, 0x85c

    invoke-static {v6, v1, v9, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e4\u06e0\u06e0"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa743 -> :sswitch_6
        0x1aa7de -> :sswitch_0
        0x1aa81c -> :sswitch_10
        0x1aaaff -> :sswitch_1
        0x1aab61 -> :sswitch_8
        0x1aaba0 -> :sswitch_7
        0x1aaea6 -> :sswitch_a
        0x1aaee5 -> :sswitch_d
        0x1ab628 -> :sswitch_3
        0x1ab6fd -> :sswitch_2
        0x1ab9e4 -> :sswitch_c
        0x1aba45 -> :sswitch_f
        0x1ac1c4 -> :sswitch_b
        0x1ac52f -> :sswitch_4
        0x1ac565 -> :sswitch_e
        0x1ac5c6 -> :sswitch_9
        0x1ac8ed -> :sswitch_5
    .end sparse-switch
.end method
