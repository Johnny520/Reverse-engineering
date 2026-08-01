.class Lkevin/fun/hook/DYHook$187;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookAutoPlayNext(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$finalEventField:Ljava/lang/reflect/Field;

.field private final val$viewPagerField:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x71

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$187;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3c1cs
        0xc47s
        0xc69s
        0xc7as
        0xc65s
        0xc62s
        0x3c1ds
        0xc2cs
        0xc2cs
        0x2b40s
        0xc2cs
        0xc5as
        0xc65s
        0xc69s
        0xc7bs
        0xc5cs
        0xc6ds
        0xc6bs
        0xc69s
        0xc7es
        0xc2cs
        0x4236s
        0xc2cs
        0xc62s
        0xc79s
        0xc60s
        0xc60s
        0x5b1s
        0x5b3s
        0x5a2s
        0x595s
        0x5a3s
        0x5a4s
        0x5a4s
        0x5b3s
        0x5b8s
        0x5a2s
        0x59fs
        0x5a2s
        0x5b3s
        0x5bbs
        0x10cs
        0x10es
        0x11fs
        0x12as
        0x10fs
        0x10as
        0x11bs
        0x11fs
        0x10es
        0x119s
        0x3206s
        0x25ds
        0x273s
        0x260s
        0x27fs
        0x278s
        0x3207s
        0x236s
        0x236s
        0x255as
        0x236s
        0x257s
        0x272s
        0x277s
        0x266s
        0x262s
        0x273s
        0x264s
        0x236s
        0x4c2cs
        0x236s
        0x278s
        0x263s
        0x27as
        0x27as
        0xb2cs
        0xb2es
        0xb3fs
        0xb08s
        0xb24s
        0xb3es
        0xb25s
        0xb3fs
        0x93cs
        0x92as
        0x93bs
        0x90cs
        0x93as
        0x93ds
        0x93ds
        0x92as
        0x921s
        0x93bs
        0x906s
        0x93bs
        0x92as
        0x922s
        0x3961s
        0x93as
        0x914s
        0x907s
        0x918s
        0x91fs
        0x3960s
        0x951s
        0x951s
        0x2e3ds
        0x951s
        0x5673s
        0x5749s
        0x94bs
        0x951s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$187;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$187;->val$finalEventField:Ljava/lang/reflect/Field;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$187;->val$viewPagerField:Ljava/lang/reflect/Field;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "TgFhvm7OZE80w84Bei5uUZf"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetjumpCount()Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۣ۟۟ۦۢ(Ljava/lang/Object;)Ljava/lang/reflect/Field;
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
    check-cast p0, Lkevin/fun/hook/DYHook$187;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$187;->val$finalEventField:Ljava/lang/reflect/Field;

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

.method public static ۟ۤۢۨۡ()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetlastJumpTime()Ljava/util/concurrent/atomic/AtomicLong;

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

.method public static ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;
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
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetlastJumpTarget()Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۟ۥۣۢۦ(Ljava/lang/Object;)Ljava/lang/Object;
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

.method public static ۟ۥۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۟ۦۨۧۦ()Ljava/util/concurrent/atomic/AtomicBoolean;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetisJumping()Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static ۟ۧۦۦۥ()Ljava/util/concurrent/atomic/AtomicBoolean;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetisCommentOpen()Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static ۣ۠ۨ۟()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$187;->short:[S

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

.method public static ۣۡۨۨ(Ljava/lang/Object;)[Ljava/lang/Object;
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
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

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

.method public static ۢۦۨۡ(Ljava/lang/Object;)Ljava/lang/reflect/Field;
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
    check-cast p0, Lkevin/fun/hook/DYHook$187;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$187;->val$viewPagerField:Ljava/lang/reflect/Field;

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

.method public static ۦۣۢۦ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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


# virtual methods
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v10, 0x1

    const/4 v12, 0x0

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$187;->ۣۡۨۨ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v3, v2, v3

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
    if-nez v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$187;->ۣ۟۟ۦۢ(Ljava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۧۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x7

    if-ne v3, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۧۦۦۥ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۦۦۣ۠(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v3

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ltz v3, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const-string v2, "5I7oK78fdNv97i"

    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_4
    :sswitch_c
    return-void

    :sswitch_d
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v4

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۤۢۨۡ()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    invoke-static {v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۦۧۧ۟(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v2, 0xbf39

    goto :goto_5

    :sswitch_f
    sub-long v2, v4, v6

    const-wide/16 v8, 0x5dc

    cmp-long v2, v2, v8

    if-gez v2, :cond_4

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۦۨۧۦ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۦۦۣ۠(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-eqz v3, :cond_5

    const v2, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_12
    const v2, 0xc240

    goto :goto_6

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/DYHook$187;->ۢۦۨۡ(Ljava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {p1}, Lkevin/fun/hook/DYHook$187;->۟ۥۣۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟۟۠۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v2, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_14
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-nez v3, :cond_6

    const v2, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x339

    const/16 v5, 0xc0c

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$187;->ۦۣۢۦ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v2

    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v4

    const/16 v5, 0x62

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, 0x2f1

    const/16 v7, 0x971

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$187;->ۦۣۢۦ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۦۨۧۦ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-static {v2, v12}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    goto/16 :goto_4

    :sswitch_17
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/16 v6, 0x1b

    sget v7, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v7, v7, 0x3b7

    const/16 v8, 0x5d6

    invoke-static {v2, v6, v7, v8}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v3, v2, v6}, Lkevin/fun/hook/DYHook$187;->۟ۥۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۤۡۧ۠(Ljava/lang/Object;)I

    move-result v6

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v7

    const v2, 0xc2fa

    :goto_8
    const v8, 0xc30b

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_18
    if-eq v6, v7, :cond_7

    const v2, 0xc5e2

    goto :goto_8

    :cond_7
    :sswitch_19
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v2, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v7

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v8, v2, 0x3c3

    const v2, 0xc601

    :goto_9
    const v9, 0xc612

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1c
    if-ne v6, v7, :cond_8

    const v2, 0xc65e

    goto :goto_9

    :cond_8
    :sswitch_1d
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    move-result v7

    const v2, 0xc67d

    :goto_a
    const v9, 0xc68e

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :cond_9
    :sswitch_1f
    const v2, 0xc6bb

    goto :goto_a

    :sswitch_20
    if-gt v7, v10, :cond_9

    const v2, 0xc965

    goto :goto_a

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۤۢۨۡ()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    const-wide/16 v4, 0x72

    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    int-to-long v6, v3

    xor-long/2addr v4, v6

    invoke-static {v2, v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۥۦۨ(Ljava/lang/Object;J)V

    goto/16 :goto_4

    :sswitch_22
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v2, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    :sswitch_23
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/16 v7, 0x29

    sget v9, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v9, v9, -0xe9

    const/16 v10, 0x16b

    invoke-static {v2, v7, v9, v10}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v3, v2, v7}, Lkevin/fun/hook/DYHook$187;->۟ۥۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const v2, 0xc984

    :goto_b
    const v9, 0xc995

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :sswitch_24
    if-nez v7, :cond_a

    const v2, 0xc9e1

    goto :goto_b

    :cond_a
    :sswitch_25
    const v2, 0xc9c2

    goto :goto_b

    :sswitch_26
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/16 v3, 0x33

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x54

    const/16 v5, 0x216

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$187;->ۦۣۢۦ(Ljava/lang/Object;)V

    goto/16 :goto_4

    :sswitch_27
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/16 v9, 0x4c

    sget v10, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v10, v10, 0x25b

    const/16 v11, 0xb4b

    invoke-static {v2, v9, v10, v11}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v7, v2, v9}, Lkevin/fun/hook/DYHook$187;->۟ۥۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۤۡۧ۠(Ljava/lang/Object;)I

    move-result v7

    sget v9, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const v2, 0xca00

    :goto_c
    const v10, 0xca11

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :cond_b
    :sswitch_28
    const v2, 0xca3e

    goto :goto_c

    :sswitch_29
    xor-int/lit16 v2, v9, -0x324

    add-int/2addr v2, v6

    if-lt v2, v7, :cond_b

    const v2, 0xca5d

    goto :goto_c

    :sswitch_2a
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    goto/16 :goto_4

    :sswitch_2b
    sget v2, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v2, v2, 0x334

    add-int/2addr v6, v2

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۦۨۧۦ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v7, 0x1

    invoke-static {v2, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۟ۤ۠()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2, v6}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۤۢۨۡ()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    invoke-static {v2, v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۥۦۨ(Ljava/lang/Object;J)V

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟۟ۨۨۨ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    move-object v0, v3

    check-cast v0, Landroid/view/View;

    move-object v2, v0

    new-instance v4, Lkevin/fun/hook/DYHook$187$1;

    invoke-direct {v4, p0, v3, v6, v2}, Lkevin/fun/hook/DYHook$187$1;-><init>(Lkevin/fun/hook/DYHook$187;Ljava/lang/Object;ILandroid/view/View;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    int-to-long v8, v5

    const-wide/16 v10, -0xe9

    xor-long/2addr v8, v10

    :try_start_3
    invoke-static {v2, v4, v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۡۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const v2, 0xca7c

    :goto_d
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_d

    :sswitch_2c
    const v2, 0xcd26

    goto :goto_d

    :catchall_1
    move-exception v2

    const v2, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_e

    :sswitch_2d
    const v2, 0xcda2

    goto :goto_e

    :catchall_2
    move-exception v2

    :sswitch_2e
    :try_start_4
    invoke-static {}, Lkevin/fun/hook/DYHook$187;->ۣ۠ۨ۟()[S

    move-result-object v2

    const/16 v4, 0x54

    sget v5, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v5, v5, 0x177

    const/16 v7, 0x94f

    invoke-static {v2, v4, v5, v7}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    sget v7, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v7, v7, 0x335

    aput-object v4, v6, v7

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x8d

    aput-object v5, v6, v4

    invoke-static {v3, v2, v6}, Lkevin/fun/hook/DYHook$187;->۟ۥۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/DYHook$187;->۟ۦۨۧۦ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const v2, 0xcdff

    :goto_f
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_f

    :sswitch_2f
    const v2, 0xce1e

    goto :goto_f

    :sswitch_30
    const v2, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_10

    :sswitch_31
    const v2, 0xd125

    goto :goto_10

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_c
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_30
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_c
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_17
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1c
        0x2d -> :sswitch_23
        0x32 -> :sswitch_1d
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1f
        0x35 -> :sswitch_22
        0xf3 -> :sswitch_20
        0xfeb -> :sswitch_21
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_24
        0x36 -> :sswitch_25
        0x57 -> :sswitch_27
        0x74 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_28
        0x11 -> :sswitch_29
        0x2f -> :sswitch_2b
        0x4c -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_2c
        0x7ab -> :sswitch_c
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2d
        0x36 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_c
        0x3ef -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_31
        0x32 -> :sswitch_c
    .end sparse-switch
.end method
