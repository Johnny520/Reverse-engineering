.class Lkevin/fun/hook/SparkRenewHelper$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/SparkRenewHelper;->showProgressDialogWithBackgroundButton(Landroid/app/Activity;I[Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final val$activity:Landroid/app/Activity;

.field private final val$isBackgroundMode:[Z

.field private final val$total:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper$3;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6d9bs
        0x51d0s
        0x7815s
        0x7693s
        -0x7bb7s
        0x555fs
        0x52a1s
        -0x717fs
        -0x76e3s
        0x8b7s
        0x8a7s
        0x8a8s
        0x8a7s
        0x5487s
        0x5c46s
        0x4b6cs
        0x56fs
        0x56fs
        0x56fs
        0x33eas
        0x3b1s
        0x39fs
        0x38cs
        0x393s
        0x394s
        0x33ebs
        0x3das
        0x65c4s
        0x7ac0s
        -0x73dfs
        0x5d5cs
        0x5803s
        -0x77d9s
        0x6bbcs
        0x5acbs
        -0x7121s
        0x3c0s
        0x3das
    .end array-data
.end method

.method constructor <init>(Landroid/app/Activity;I[Z)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$activity:Landroid/app/Activity;

    iput p2, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$total:I

    iput-object p3, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$isBackgroundMode:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "I9v8SU7u"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۡۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

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

.method public static ۟۠ۦۨ۟(Ljava/lang/Object;I)I
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$smdp(Landroid/content/Context;I)I

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

.method public static ۟ۢۥۨۨ(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$sfputrenewProgressText(Landroid/widget/TextView;)V

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

.method public static ۣ۟ۦ۟ۦ(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/app/AlertDialog;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$sfputrenewProgressDialog(Landroid/app/AlertDialog;)V

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

.method public static ۟ۤ۟۟ۤ(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$sfputrenewTaskNameText(Landroid/widget/TextView;)V

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

.method public static ۠ۡ۟ۥ()Landroid/app/AlertDialog;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$sfgetrenewProgressDialog()Landroid/app/AlertDialog;

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

.method public static ۠ۡۡۡ(Ljava/lang/Object;)I
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$3;

    iget v0, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$total:I

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

.method public static ۣۦۣۧ(Ljava/lang/Object;)V
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/widget/ProgressBar;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->_$$Nest$sfputrenewProgressBar(Landroid/widget/ProgressBar;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "kn1jaxl0aNUmy2t"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۤ۠۠ۧ(Ljava/lang/Object;)[Z
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$3;

    iget-object v0, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$isBackgroundMode:[Z

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

.method public static ۥۨ۟ۥ()[S
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper$3;->short:[S

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

.method public static ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;
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
    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$3;

    iget-object v0, p0, Lkevin/fun/hook/SparkRenewHelper$3;->val$activity:Landroid/app/Activity;

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
    .locals 9

    :try_start_0
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v1, v1, 0x9d

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v2, v2, 0x24b

    invoke-static {v1, v2}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    invoke-static {v4, v2}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v5

    invoke-static {v5, v2}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {v0, v1, v3, v4, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v2

    sget v3, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v3, v3, 0x1cc

    invoke-static {v2, v3}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v2

    sget v3, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v3, v3, 0x35

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v2, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v2, v2, -0x4a

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    sget v5, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v5, v5, 0x294

    invoke-static {v4, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v1, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v1, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v1, v4, v6, v7, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->ۥۨ۟ۥ()[S

    move-result-object v5

    const/4 v6, 0x0

    sget v7, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v7, v7, 0x256

    const/16 v8, 0x6f8

    invoke-static {v5, v6, v7, v8}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x41900000    # 18.0f

    invoke-static {v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, 0xcccd27

    sget v6, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v3, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->ۥۨ۟ۥ()[S

    move-result-object v4

    const/4 v5, 0x5

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v6, v6, 0x289

    const/16 v7, 0x151

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0x666615

    sget v5, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    sget v5, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v5, v5, 0x7e

    invoke-static {v4, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v6

    sget v7, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v7, v7, 0x319

    invoke-static {v6, v7}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8, v7}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v3, v4, v6, v5, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, -0xa0b74

    sget v6, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v5

    sget v6, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v6, v6, 0x17b

    invoke-static {v5, v6}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lkevin/fun/hook/SparkRenewHelper$3$1;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۤ۠۠ۧ(Ljava/lang/Object;)[Z

    move-result-object v5

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v6

    invoke-direct {v4, p0, v5, v6}, Lkevin/fun/hook/SparkRenewHelper$3$1;-><init>(Lkevin/fun/hook/SparkRenewHelper$3;[ZLandroid/app/Activity;)V

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/ProgressBar;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x0

    const v5, -0x101001e

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v5, v6

    invoke-direct {v1, v3, v4, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x297

    invoke-static {v4, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v4

    invoke-direct {v3, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v3, -0x1f1e3a

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v3, v4

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x79

    invoke-static {v3, v4}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, -0xaad0

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/2addr v5, v6

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v5

    invoke-static {v5, v4}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v3, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    new-instance v5, Landroid/graphics/drawable/ClipDrawable;

    const v6, 0x80020d

    sget v7, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v6, v7

    const/4 v7, 0x1

    invoke-direct {v5, v3, v6, v7}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    const/4 v6, 0x0

    aput-object v2, v4, v6

    const/4 v2, 0x1

    aput-object v5, v4, v2

    invoke-direct {v3, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x0

    const v4, 0x1020179

    sget v5, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v2, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۨ۠ۡ(Ljava/lang/Object;II)V

    const/4 v2, 0x1

    const v4, -0x1020263

    sget v5, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v2, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۨ۠ۡ(Ljava/lang/Object;II)V

    invoke-static {v1, v3}, Landroidx/activity/ۨ۠۟ۧ;->ۡۢۦۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->۠ۡۡۡ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v1, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۥۨ۟(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->۠ۡۡۡ(Ljava/lang/Object;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->ۥۨ۟ۥ()[S

    move-result-object v5

    const/16 v6, 0x9

    sget v7, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v7, v7, -0xe7

    const/16 v8, 0x887

    invoke-static {v5, v6, v7, v8}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, 0xa94f

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/2addr v3, v4

    invoke-static {v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x20f

    invoke-static {v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, -0x167

    invoke-static {v4, v5}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v4, v5, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v0, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->ۥۨ۟ۥ()[S

    move-result-object v4

    const/16 v5, 0xd

    sget v6, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v6, v6, -0x325

    const/16 v7, 0x541

    invoke-static {v4, v5, v6, v7}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41300000    # 11.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0x66657a

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1fb

    invoke-static {v3, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v4, 0x0

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v5

    sget v6, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v6, v6, 0x8a

    invoke-static {v5, v6}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۠ۦۨ۟(Ljava/lang/Object;I)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v4, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper$3;->ۣۦۣۧ(Ljava/lang/Object;)V

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper$3;->۟ۢۥۨۨ(Ljava/lang/Object;)V

    invoke-static {v3}, Lkevin/fun/hook/SparkRenewHelper$3;->۟ۤ۟۟ۤ(Ljava/lang/Object;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper$3;->ۦ۟ۢۤ(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v0}, Landroidx/activity/ۦۧۥۥ;->ۣۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۤ۟ۧ(Ljava/lang/Object;)Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper$3;->ۣ۟ۦ۟ۦ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->۠ۡ۟ۥ()Landroid/app/AlertDialog;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۡ۠ۨۥ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->۠ۡ۟ۥ()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۥۨۢ۠(Ljava/lang/Object;)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0xa7

    sget v1, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper$3;->ۥۨ۟ۥ()[S

    move-result-object v2

    const/16 v3, 0x13

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1f5

    const/16 v5, 0x3fa

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper$3;->۟۟ۡۥ(Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method
