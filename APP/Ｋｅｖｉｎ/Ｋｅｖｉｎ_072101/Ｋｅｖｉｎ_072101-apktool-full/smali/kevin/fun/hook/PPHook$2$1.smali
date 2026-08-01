.class Lkevin/fun/hook/PPHook$2$1;
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook$2$1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6565s
        -0x7e08s
        0x5199s
        0x507fs
        0x60d9s
        -0x6a44s
        -0x7097s
        0x51b8s
        0x5b64s
        0x567as
        0x631ds
        0x724cs
        0x5b62s
        0x66a1s
        -0x6c3cs
        -0x4c5s
        0x6621s
        0x631ds
        0x6627s
        0x56a8s
        -0x7034s
        0x57e1s
        0x5607s
        0x66a1s
        -0x6c3cs
        0x417s
        0x462s
        0x47es
        0x473s
        -0x4c5s
        0x61d7s
        0x68e2s
        0x6bf7s
        0x690cs
        0x3435s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/PPHook$2$1;->this$1:Lkevin/fun/hook/PPHook$2;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$2$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$2$1;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "o7vU"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2$1;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$1;->val$context:Landroid/content/Context;

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

.method public static ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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

.method public static ۣ۟۠ۤۡ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2$1;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$1;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

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

.method public static ۣ۠ۦۧ()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    sget-object v0, Lkevin/fun/hook/PPHook$2$1;->short:[S

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

.method public static ۤ۠ۢۢ()V
    .locals 2

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
    if-ltz v1, :cond_0

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


# virtual methods
.method public run()V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e0\u06e4\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$1;->ۣ۟۠ۤۡ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v1

    const-string v6, "\u06e5\u06e1\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    sget v9, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    const-string v1, "\u06e0\u06df\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit8 v7, v9, 0x41

    const-string v1, "\u06e6\u06e5\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v7, v9, -0x3d9

    const-string v1, "\u06e4\u06df\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/PPHook$2$1;->ۣ۠ۦۧ()[S

    move-result-object v1

    const-string v6, "\u06e6\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x8

    const/16 v4, 0x437

    invoke-static {v5, v1, v7, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e6\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "\u06e4\u06e4\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x24f

    invoke-static {v5, v8, v7, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e6\u06e1\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/PPHook$2$1;->ۣ۠ۦۧ()[S

    move-result-object v1

    const-string v6, "\u06e8\u06e5\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    const-string v1, "\u06e0\u06e3\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v0, v2, v4, v8, v3}, Lkevin/fun/hook/PPHook$2$1;->ۣ۟ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const-string v1, "\u06e1\u06e6\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$1;->ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06df\u06e0\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    sget v9, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    const-string v1, "\u06e4\u06e2\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/PPHook$2$1;->ۤ۠ۢۢ()V

    const-string v1, "\u06e3\u06e0\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_d
    const-string v1, "\u06e2\u06e4\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa724 -> :sswitch_d
        0x1aaac8 -> :sswitch_2
        0x1aab64 -> :sswitch_c
        0x1aaf5d -> :sswitch_e
        0x1aaf61 -> :sswitch_9
        0x1ab2e2 -> :sswitch_5
        0x1ab626 -> :sswitch_a
        0x1ab9cd -> :sswitch_4
        0x1aba28 -> :sswitch_1
        0x1aba60 -> :sswitch_8
        0x1abdc3 -> :sswitch_7
        0x1ac189 -> :sswitch_3
        0x1ac202 -> :sswitch_6
        0x1ac21f -> :sswitch_0
        0x1ac986 -> :sswitch_b
    .end sparse-switch
.end method
