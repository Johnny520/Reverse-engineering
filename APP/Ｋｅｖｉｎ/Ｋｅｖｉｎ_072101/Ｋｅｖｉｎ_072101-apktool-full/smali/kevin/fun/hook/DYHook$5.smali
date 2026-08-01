.class Lkevin/fun/hook/DYHook$5;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookMainActivity(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xdc

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$5;->short:[S

    return-void

    :array_0
    .array-data 2
        0x83fs
        0x83es
        0x833s
        0x832s
        0x808s
        0x834s
        0x838s
        0x839s
        0x821s
        0x832s
        0x825s
        0x824s
        0x836s
        0x823s
        0x83es
        0x838s
        0x839s
        0x985s
        0x986s
        0x997s
        0x984s
        0x99ds
        0x9a9s
        0x984s
        0x993s
        0x998s
        0x993s
        0x981s
        0x9a9s
        0x993s
        0x998s
        0x997s
        0x994s
        0x99as
        0x993s
        0xaads
        0xaa0s
        0xaa8s
        0xaa1s
        0xa9bs
        0xaa1s
        0xabcs
        0xaads
        0xab0s
        0xa9bs
        0xaa1s
        0xaaas
        0xaa5s
        0xaa6s
        0xaa8s
        0xaa1s
        0x345s
        0x348s
        0x352s
        0x351s
        0x340s
        0x355s
        0x342s
        0x349s
        0x375s
        0x34es
        0x354s
        0x342s
        0x349s
        0x364s
        0x357s
        0x344s
        0x34fs
        0x355s
        0x386s
        0x38as
        0x388s
        0x3cbs
        0x396s
        0x396s
        0x3cbs
        0x384s
        0x38bs
        0x381s
        0x397s
        0x38as
        0x38cs
        0x381s
        0x3cbs
        0x390s
        0x382s
        0x386s
        0x3cbs
        0x384s
        0x392s
        0x380s
        0x388s
        0x380s
        0x3cbs
        0x388s
        0x384s
        0x38cs
        0x38bs
        0x3cbs
        0x3a8s
        0x384s
        0x38cs
        0x38bs
        0x3a4s
        0x386s
        0x391s
        0x38cs
        0x393s
        0x38cs
        0x391s
        0x39cs
        0x226s
        0x227s
        0x208s
        0x22as
        0x23ds
        0x220s
        0x23fs
        0x220s
        0x23ds
        0x230s
        0x21bs
        0x22cs
        0x23as
        0x23cs
        0x225s
        0x23ds
        0x700s
        0x713s
        0x70as
        0x70as
        0x715s
        0x705s
        0x714s
        0x703s
        0x703s
        0x708s
        0x739s
        0x716s
        0x70as
        0x707s
        0x71fs
        0xcdcs
        0xcdas
        0xccfs
        0xcd8s
        0xcd8s
        0xcd0s
        0xcd8s
        0xcd3s
        0xcc9s
        0xce2s
        0xcdcs
        0xcdes
        0xcdes
        0xcd8s
        0xccds
        0xcc9s
        0xcd8s
        0xcd9s
        0xbefs
        0xbe9s
        0xbfcs
        0xbebs
        0xbebs
        0xbe3s
        0xbebs
        0xbe0s
        0xbfas
        0xbd1s
        0xbf8s
        0xbebs
        0xbfcs
        0xbfds
        0xbe7s
        0xbe1s
        0xbe0s
        0x37c4s
        0x79fs
        0x7b1s
        0x7a2s
        0x7bds
        0x7bas
        0x37c5s
        0x7f4s
        0x799s
        0x7b5s
        0x7bds
        0x7bas
        0x795s
        0x7b7s
        0x7a0s
        0x7bds
        0x7a2s
        0x7bds
        0x7a0s
        0x7ads
        0x7f4s
        0x7bbs
        0x7bas
        0x797s
        0x7a6s
        0x7b1s
        0x7b5s
        0x7a0s
        0x7b1s
        0x7f4s
        0x7bcs
        0x7bbs
        0x7bbs
        0x7bfs
        0x7f4s
        0x7b2s
        0x7b5s
        0x7bds
        0x7b8s
        0x7b1s
        0x7b0s
        0x7ees
        0x7f4s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$5;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$5;->val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "59XlqC5TePq"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method static synthetic access$0(Lkevin/fun/hook/DYHook$5;)Lkevin/fun/hook/DYHook;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    return-object v0
.end method

.method public static ۟۟۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mcheckVersionAndShowDialog(Lkevin/fun/hook/DYHook;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    const-string v0, "sSsPo9BDeVbFHBVUsde2QBpaafX"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۟۟ۧۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookSimPlayer(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$5;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$5;->val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

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

.method public static ۟ۡ۟۟ۥ(Ljava/lang/Object;Z)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$fputisFullScreenEnabled(Lkevin/fun/hook/DYHook;Z)V

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

.method public static ۟ۡ۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/ClassLoader;

    check-cast p2, Ljava/lang/String;

    check-cast p3, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

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

.method public static ۟ۡ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentState(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۡۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p2, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFeedComponents(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V

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

.method public static ۣ۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookBaseAdapter(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

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

.method public static ۟ۢۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookHideProSeekBar(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣ۟ۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFollowingList(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

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

.method public static ۣۣ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookSparkRenew(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/app/Activity;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$msetImmersiveMode(Lkevin/fun/hook/DYHook;Landroid/app/Activity;)V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "e9X1QypZOqCUo3vNN2j8NrDYsW"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookSessionList(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

    :sswitch_3
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    const-string v0, "ok0FHKvTR"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۟ۤ۟ۡۡ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookBottomTabCreate(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۤۡۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFollowingSearch(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

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

.method public static ۟ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookHideAllControls(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۤۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookNumberLive(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۤۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookHiddenEmoji(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۥ۠ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookViewSetVisibility(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۥۢۤۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookMessageTime(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "WEQ7l7AX95avjyOWcJ3Kuyj"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۥۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookRemoveActionBar(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    const-string v0, "vMLyLhWgpPcfQGBXvO0KIxJEfW"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentBgImageResult(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۥۦۢ(Ljava/lang/Object;)V
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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$smhookClipboardClean(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۦ۟۠۟(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookShareMenu(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    const-string v0, "F1ptxH4Mb1edm"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۣ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookDrawChild(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۟ۦۣۢۡ()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetMAIN_HANDLER()Landroid/os/Handler;

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

.method public static ۟ۧۢ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p2, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookChapterDecisionEngine(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    const-string v0, "IY"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣ۟ۧۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p2, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentFullTime(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V

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

.method public static ۣ۠ۢۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p2, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookDialogPanel(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V

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

.method public static ۠ۤۢۤ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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

.method public static ۡ۠۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookNumberVideo(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    const-string v0, "tlxMSCBSRjnG6P6Dza9TOD9b00"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۡۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentTextViewColor(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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
    const-string v0, "h7B9SsAPFLeAGZI3x1VIaWLXjyD"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۣۡۡۢ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$mstartIdleMonitor(Lkevin/fun/hook/DYHook;)V

    :sswitch_3
    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    const-string v0, "j2"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFeedDescTime(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣۡۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->hookShareMenuFilter(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookTopRecommendOnlineUserList(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

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

.method public static ۡۤ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->hookGameDialogPanel(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V

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

.method public static ۡۤۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookEmojiFeatures(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۡۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookProfileFragments(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    const-string v0, "bALw7VZ"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۨ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookProtobufDecode(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۡۨۦۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFeedPublishTime(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۡۨۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookDisableBackRefresh(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "V3E7vqoSfgvnoMvPWoWkRHRcE"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۣۢ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookDmtTextView(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
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
    check-cast p0, Lkevin/fun/hook/DYHook$5;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$5;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۢۤۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-virtual {p0, p1}, Lkevin/fun/hook/DYHook;->hookChatVoiceForward(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۢۦ۠ۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$smhookConversationSession(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۢۧۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentAudioView(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    const-string v0, "spAFsRX02qbqTOuA2LLbNEvLSN"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۣ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookVoiceRecordSend(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookChatMessageBeautify(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    const-string v0, "l3cETwdsTitFCHK"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۣۣ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mstartAntiRecall(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣۨۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$msetFullScreen(Lkevin/fun/hook/DYHook;Ljava/lang/Object;)V

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

.method public static ۤ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$msaveVersionInfo(Lkevin/fun/hook/DYHook;Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    const-string v0, "pMnR6QdSPlq"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۣۤۨ۟()[S
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$5;->short:[S

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

.method public static ۥ۠ۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

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

.method public static ۥۡۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookCommentListBackground(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookVideoCoverRender(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    const-string v0, "WuupA57cQdcfz5q7mDL"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۥۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookHideAllCommentHeaders(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    const-string v0, "9GOSniezx0ZnSiJcMw"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۥۤ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookSelfFollowerList(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    const-string v0, "cMsNZQBOc"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۦۣۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$smhookHideCommentActions(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "rSHUa2"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۢۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookHideCommentInputBarByEditText(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    const-string v0, "HzU900OL78OTQhsg"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۨۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookAutoPlayNext(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

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

.method public static ۧۧۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookFamiliarFriends(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    const-string v0, "6VA5snfPBFzOW5fbaHchhpz1tcV"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۧۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookKMPABTest(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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

.method public static ۣۧۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookConcernSearch(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    const-string v0, "tIMlemBX0V"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookShareList(Lkevin/fun/hook/DYHook;Ljava/lang/ClassLoader;)V

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

.method public static ۨۡۥۥ(Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$minitDownloadManager(Lkevin/fun/hook/DYHook;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    const-string v0, "zcIy2jRxX2aXAVIwkYtv7KakN3"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۥۤ۟(Ljava/lang/Object;)Ljava/lang/Object;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

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

.method public static ۨۨ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mhookBottomSpace(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

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
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v11, 0x1

    const/4 v3, 0x0

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v0

    sget v1, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v1, v1, -0x75

    const/16 v2, 0x857

    invoke-static {v0, v3, v1, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v0

    const/16 v1, 0x11

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x40

    const/16 v4, 0x9f6

    invoke-static {v0, v1, v3, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$5;->ۨۥۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {p1}, Lkevin/fun/hook/DYHook$5;->ۨۥۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v4

    invoke-static {v4, v1}, Lkevin/fun/hook/DYHook$5;->ۣۣ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۨۡۥۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$5;->ۤ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v0, v4}, Lkevin/fun/hook/DYHook$5;->۟۟۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->۟ۦۣۢۡ()Landroid/os/Handler;

    move-result-object v1

    new-instance v4, Lkevin/fun/hook/DYHook$5$1;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v5

    invoke-direct {v4, p0, v0, v5}, Lkevin/fun/hook/DYHook$5$1;-><init>(Lkevin/fun/hook/DYHook$5;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    const-wide/16 v6, -0x6bb

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    int-to-long v8, v5

    xor-long/2addr v6, v8

    invoke-static {v1, v4, v6, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v4, 0x23

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1af

    const/16 v6, 0xac4

    invoke-static {v1, v4, v5, v6}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۣۡۡۢ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v4, 0x33

    sget v5, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v5, v5, -0x108

    const/16 v6, 0x321

    invoke-static {v1, v4, v5, v6}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lkevin/fun/hook/DYHook$5$2;

    invoke-direct {v4, p0}, Lkevin/fun/hook/DYHook$5$2;-><init>(Lkevin/fun/hook/DYHook$5;)V

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    sget v6, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x20e

    const-class v7, Landroid/view/MotionEvent;

    aput-object v7, v5, v6

    sget v6, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v6, v6, -0x64

    aput-object v4, v5, v6

    const-class v4, Landroid/app/Activity;

    invoke-static {v4, v1, v5}, Lkevin/fun/hook/DYHook$5;->ۥ۠ۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v4, 0x45

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0xa6

    const/16 v6, 0x3e5

    invoke-static {v1, v4, v5, v6}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v5

    const/16 v6, 0x6f

    sget v7, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v7, v7, 0x3

    const/16 v8, 0x249

    invoke-static {v5, v6, v7, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟۟۠ۢۨ()Ljava/lang/Class;

    move-result-object v6

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟۟۠ۢۨ()Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Lkevin/fun/hook/DYHook$5$3;

    invoke-direct {v8, p0}, Lkevin/fun/hook/DYHook$5$3;-><init>(Lkevin/fun/hook/DYHook$5;)V

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    sget v10, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v10, v10, -0xe3

    aput-object v6, v9, v10

    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v6, v6, -0x35

    aput-object v7, v9, v6

    sget v6, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v6, v6, -0x61

    const-class v7, Landroid/content/Intent;

    aput-object v7, v9, v6

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x31c

    aput-object v8, v9, v6

    invoke-static {v1, v4, v5, v9}, Lkevin/fun/hook/DYHook$5;->۟ۡ۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۤ۟ۡۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۨۨ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۥ۠ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۨۦۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4, v0}, Lkevin/fun/hook/DYHook$5;->۟ۡۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۨ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4, v0}, Lkevin/fun/hook/DYHook$5;->ۣ۟ۧۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣۣ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۤۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4, v0}, Lkevin/fun/hook/DYHook$5;->ۣ۠ۢۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۢۧۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣۣ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$5;->ۡۤ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۣۡۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۤۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->۟ۥۦۢ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۥۦۣۧ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۧۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۢۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡ۠۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۤۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۢۤۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۨۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۥۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۦۣ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۥۢۤۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟۟ۧۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۡ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۦۨۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۥۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۦۢۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۡۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۥۡۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4, v0}, Lkevin/fun/hook/DYHook$5;->۟ۧۢ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v4, 0x7f

    sget v5, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v5, v5, 0x103

    const/16 v6, 0x766

    invoke-static {v1, v4, v5, v6}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v4, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    const/4 v4, 0x1

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->۟ۡ۟۟ۥ(Ljava/lang/Object;Z)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p1}, Lkevin/fun/hook/DYHook$5;->ۨۥۤ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣۨۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    const/4 v1, 0x0

    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v4, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v1, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۣۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v4

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$5;->ۣۣ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    const/4 v1, 0x0

    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v3

    const/4 v1, 0x0

    invoke-static {v2, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_3

    :sswitch_d
    if-nez v3, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_e
    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_f
    const v1, 0xbf39

    goto :goto_4

    :sswitch_10
    if-eqz v4, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_11
    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$5;->ۢۦ۠ۧ(Ljava/lang/Object;)V

    :sswitch_12
    const/4 v1, 0x0

    invoke-static {v2, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v2

    const v1, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_13
    if-eqz v2, :cond_5

    const v1, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_14
    const v1, 0xc240

    goto :goto_5

    :sswitch_15
    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣۢ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->۟ۦ۟۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۧۧۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣ۟ۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۥۤ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣ۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->۟ۤۡۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣۧۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۨۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->ۢۢۢۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$5;->ۧۡۡۦ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$5;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v2, 0x8e

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x40

    const/16 v4, 0xcbd

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v2

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v1

    const/16 v3, 0xa0

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1ad

    const/16 v5, 0xb8e

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v3

    const v1, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_17
    const v1, 0xc2bc

    goto :goto_6

    :sswitch_18
    if-eqz v2, :cond_6

    const v1, 0xc2db

    goto :goto_6

    :sswitch_19
    const v1, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_1a
    if-ge v3, v11, :cond_7

    const v1, 0xc5e2

    goto :goto_7

    :cond_7
    :sswitch_1b
    const v1, 0xc5c3

    goto :goto_7

    :sswitch_1c
    invoke-static {}, Lkevin/fun/hook/DYHook$5;->۟ۦۣۢۡ()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/DYHook$5$4;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$5;->۟۠ۨ۠ۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v3

    invoke-direct {v2, p0, v0, v3}, Lkevin/fun/hook/DYHook$5$4;-><init>(Lkevin/fun/hook/DYHook$5;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    const-wide/16 v4, 0x2c1

    sget v0, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    int-to-long v6, v0

    xor-long/2addr v4, v6

    invoke-static {v1, v2, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_1d
    const v0, 0xc620

    goto :goto_8

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$5;->ۣۤۨ۟()[S

    move-result-object v2

    const/16 v3, 0xb1

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x326

    const/16 v5, 0x7d4

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$5;->۠ۤۢۤ(Ljava/lang/Object;)V

    :sswitch_1e
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const v0, 0xc67d

    :goto_9
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_8
    :sswitch_1f
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_20
    if-ltz v1, :cond_8

    const v0, 0xc965

    goto :goto_9

    :sswitch_21
    const-string v0, "yNEgVu2FgnB6WFBSLrF7Uf459Iv8H"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_22
    return-void

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
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_11
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_17
        0x33 -> :sswitch_1c
        0x54 -> :sswitch_19
        0xf1 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1a
        0x6af -> :sswitch_1b
        0x6c8 -> :sswitch_1e
        0x6e9 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1d
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1f
        0x35 -> :sswitch_22
        0xf3 -> :sswitch_20
        0xfeb -> :sswitch_21
    .end sparse-switch
.end method
