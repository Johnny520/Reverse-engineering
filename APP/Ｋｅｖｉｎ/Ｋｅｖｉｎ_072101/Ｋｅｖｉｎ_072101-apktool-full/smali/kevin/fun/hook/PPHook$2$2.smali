.class Lkevin/fun/hook/PPHook$2$2;
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

.field private final val$code:Ljava/lang/String;

.field private final val$context:Landroid/content/Context;

.field private final val$nickname:Ljava/lang/String;

.field private final val$result:Lkevin/fun/hook/PPHook$ActivateResult;

.field private final val$uid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x77

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook$2$2;->short:[S

    return-void

    :array_0
    .array-data 2
        0x664s
        0x660s
        0x560s
        0x56ds
        0x573s
        0x564s
        0x560s
        0x565s
        0x578s
        0xb73s
        0xb71s
        0xb66s
        0xb7bs
        0xb64s
        0xb73s
        0xb66s
        0xb7bs
        0xb7ds
        0xb7cs
        0xb4ds
        0xb71s
        0xb7ds
        0xb76s
        0xb77s
        0x596cs
        0x5472s
        0x64a9s
        -0x6e34s
        -0x74e7s
        0x55c8s
        0x5bcds
        0x78f0s
        0x69ffs
        0x6b04s
        -0x6cds
        0x55d0s
        0x6d5cs
        0x5807s
        0x4940s
        0x7317s
        0x6c1es
        0x5168s
        0x363ds
        0x6b55s
        0x69aes
        0x6685s
        0x560as
        -0x46cs
        0x49fs
        0x49fs
        0x7a44s
        0x5f0fs
        0x6603s
        -0x6c9as
        0x71bds
        0x66a2s
        -0x471s
        0x7c8s
        0x5891s
        0x558fs
        0x6802s
        0x6af9s
        0x7fc3s
        0x5a30s
        0x48bds
        0x72eas
        -0x751cs
        0x5435s
        0x62b2s
        -0x728s
        0x652s
        0x64es
        0x2c59s
        0xb7cs
        0x649cs
        0x6667s
        0x694cs
        0x59c3s
        0xa28s
        0xa2ds
        0xa29s
        0xa2ds
        0xa30s
        0x2c83s
        0xbefs
        0x640fs
        0x66f4s
        0x52fes
        -0x7916s
        -0x78d9s
        0x6302s
        0x61f9s
        0x74c3s
        0x5130s
        -0x7c84s
        0x5ef2s
        0xce2s
        0xcf1s
        0xce2s
        0x5f32s
        -0x7884s
        0x55c5s
        0x42c8s
        -0x656es
        0x65e9s
        0x6712s
        0x5318s
        -0x78f4s
        -0xadbs
        -0x7e22s
        0x62e9s
        0x6dccs
        0x65e9s
        0x6712s
        0x7228s
        0x6c06s
        0x5e0fs
        0x614as
        0x7247s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/PPHook$2;Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/PPHook$2$2;->this$1:Lkevin/fun/hook/PPHook$2;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$2$2;->val$result:Lkevin/fun/hook/PPHook$ActivateResult;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$2$2;->val$uid:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/PPHook$2$2;->val$code:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/PPHook$2$2;->val$nickname:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/PPHook$2$2;->val$context:Landroid/content/Context;

    iput-object p7, p0, Lkevin/fun/hook/PPHook$2$2;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "evrgR6fXsOtJYI25sl"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۨ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$nickname:Ljava/lang/String;

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

.method public static ۣۣ۟۠ۧ()V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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

.method public static ۣ۟ۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
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
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    const-string v0, "B4lEg6PfTfV09h9OhmCZfw9IRfFcC"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۦۡۤۥ(Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->_$$Nest$smsaveActivatedAccount(Ljava/lang/String;)V

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

.method public static ۟ۦۤۥ۠(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$uid:Ljava/lang/String;

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

.method public static ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$result:Lkevin/fun/hook/PPHook$ActivateResult;

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

.method public static ۠۠۟۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->count:I

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

.method public static ۡ۠ۢۢ(Ljava/lang/Object;)Landroid/content/Context;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$context:Landroid/content/Context;

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

.method public static ۣۡۢۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->status:Ljava/lang/String;

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

.method public static ۣۨۦ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->error:Ljava/lang/String;

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

.method public static ۣۤۦۣ()[S
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook$2$2;->short:[S

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

.method public static ۤۦ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$code:Ljava/lang/String;

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

.method public static ۥۨۢ(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/PPHook$ActivateResult;

    iget-boolean v0, p0, Lkevin/fun/hook/PPHook$ActivateResult;->ok:Z

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

.method public static ۦ۠۠ۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2$2;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

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
    .locals 7

    const/4 v5, 0x0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۣ۟۠ۧ()V

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۥۨۢ(Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۡۢۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v1

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x25c

    const/16 v3, 0x60b

    invoke-static {v1, v5, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/4 v2, 0x2

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x17e

    const/16 v4, 0x501

    invoke-static {v0, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۡۢۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->۟ۦۤۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->۟ۦۡۤۥ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/16 v1, 0x9

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x46

    const/16 v4, 0xb12

    invoke-static {v0, v1, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۤۦ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۡۢۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/16 v1, 0x18

    sget v2, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v2, v2, -0x27d

    const/16 v3, 0x63f

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۡ۠ۢۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۦ۠۠ۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v3

    const/16 v4, 0x48

    sget v5, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v5, v5, -0x1bc

    const/16 v6, 0xb5c

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v3, v0, v4, v2}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    const v0, 0xc221

    goto :goto_6

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->۟۟ۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/PPHook$2$2;->۠۠۟۠(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v3

    const/16 v4, 0x2b

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1cb

    const/16 v6, 0x495

    invoke-static {v3, v4, v5, v6}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v2

    const/16 v3, 0x39

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x81

    const/16 v5, 0x7c2

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v1

    const/16 v2, 0x46

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v3, v3, 0x28f

    const/16 v4, 0x67d

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :sswitch_10
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۡۢۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v1

    const/16 v2, 0x4e

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x308

    const/16 v4, 0xa44

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/16 v2, 0x53

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x30b

    const/16 v4, 0xbcf

    invoke-static {v0, v2, v3, v4}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_12
    if-eqz v1, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    if-nez v1, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_16
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v1, 0xc620

    goto :goto_9

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/16 v1, 0x59

    sget v3, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v3, v3, 0x1b0

    const/16 v4, 0xcc2

    invoke-static {v0, v1, v3, v4}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_19
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۡ۠ۢۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۦ۠۠ۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v3

    invoke-static {v1, v2, v0, v5, v3}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1a
    return-void

    :sswitch_1b
    const v0, 0xc69c

    goto :goto_a

    :sswitch_1c
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1d
    if-nez v1, :cond_6

    const v0, 0xc9e1

    goto :goto_c

    :cond_6
    :sswitch_1e
    const v0, 0xc9c2

    goto :goto_c

    :sswitch_1f
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۧۦ۟(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/PPHook$2$2;->ۣۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :goto_e
    :pswitch_1
    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۡ۠ۢۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/PPHook$2$2;->ۦ۠۠ۧ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v3

    invoke-static {v1, v2, v0, v5, v3}, Lkevin/fun/hook/PPHook$2$2;->ۣ۟ۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V

    goto :goto_b

    :pswitch_2
    const v1, 0xca1f

    goto :goto_d

    :sswitch_20
    invoke-static {}, Lkevin/fun/hook/PPHook$2$2;->ۣۤۦۣ()[S

    move-result-object v0

    const/16 v1, 0x68

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x33a

    const/16 v4, 0xa29

    invoke-static {v0, v1, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_e

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_10
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
        0x11 -> :sswitch_d
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_1c
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
