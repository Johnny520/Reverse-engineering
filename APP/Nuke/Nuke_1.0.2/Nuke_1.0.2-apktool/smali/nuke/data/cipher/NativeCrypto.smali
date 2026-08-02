.class public final Lnuke/data/cipher/NativeCrypto;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lnuke/data/cipher/NativeCrypto;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lnuke/data/cipher/NativeCrypto;

    .line 2
    .line 3
    invoke-direct {v0}, Lnuke/data/cipher/NativeCrypto;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->kid$lambda$0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->confKeyName$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->confEncrypt$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final confDecrypt$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeConfDecrypt(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final confEncrypt$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeConfEncrypt(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final confKeyName$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeConfKeyName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->selfTest$lambda$0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static synthetic e(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->confDecrypt$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->warmUpAsync$lambda$0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static synthetic g()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->isConfigured$lambda$0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final isConfigured$lambda$0()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeIsConfigured()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final kid$lambda$0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeKid()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final native nativeActivateEngine(ILjava/lang/String;JLjava/lang/String;[B)Z
.end method

.method private static final native nativeAttestModule([B)Z
.end method

.method private static final native nativeConfDecrypt(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native nativeConfEncrypt(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native nativeConfKeyName(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native nativeEngineGeneration()J
.end method

.method private static final native nativeIsConfigured()Z
.end method

.method private static final native nativeKid()Ljava/lang/String;
.end method

.method private static final native nativePrepareActivation([B[B)[B
.end method

.method private static final native nativeSelfTest()Z
.end method

.method private static final native nativeSignClientPayload(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final selfTest$lambda$0()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeSelfTest()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final syncClient$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeSignClientPayload(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final warmUpAsync$lambda$0()Z
    .locals 1

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeIsConfigured()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeKid()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method


# virtual methods
.method public final activateEngineDirect$app(ILjava/lang/String;JLjava/lang/String;[B)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static/range {p1 .. p6}, Lnuke/data/cipher/NativeCrypto;->nativeActivateEngine(ILjava/lang/String;JLjava/lang/String;[B)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final attestModuleFromRuntime$app()Z
    .locals 0

    .line 1
    invoke-static {}, Ltp0;->r()Lnl1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lnl1;->a:[B

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    new-array p0, p0, [B

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeAttestModule([B)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final confDecrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance p0, Lkf;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p0, p1, v0}, Lkf;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    const-string p1, "confDecrypt"

    .line 13
    .line 14
    invoke-static {p1, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    return-object p0
.end method

.method public final confEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance p0, Lkf;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p0, p1, v0}, Lkf;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    const-string p1, "confEncrypt"

    .line 13
    .line 14
    invoke-static {p1, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    return-object p0
.end method

.method public final confKeyName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance p0, Lkf;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, Lkf;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    const-string p1, "confKeyName"

    .line 13
    .line 14
    invoke-static {p1, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    return-object p0
.end method

.method public final engineGenerationDirect$app()J
    .locals 2

    .line 1
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->nativeEngineGeneration()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final isConfigured()Z
    .locals 1

    .line 1
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    new-instance p0, Ln31;

    .line 4
    .line 5
    const/16 v0, 0x13

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ln31;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v0, "isConfigured"

    .line 11
    .line 12
    invoke-static {v0, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final kid()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    new-instance p0, Ln31;

    .line 4
    .line 5
    const/16 v0, 0x15

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ln31;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v0, "kid"

    .line 11
    .line 12
    invoke-static {v0, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    return-object p0
.end method

.method public final prepareActivationDirect$app([B[B)[B
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lnuke/data/cipher/NativeCrypto;->nativePrepareActivation([B[B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final prepareModuleAttestationForActivation$app()V
    .locals 0

    .line 1
    invoke-static {}, Ltp0;->r()Lnl1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lnl1;->a:[B

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    new-array p0, p0, [B

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lnuke/data/cipher/NativeCrypto;->nativeAttestModule([B)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final selfTest()Z
    .locals 1

    .line 1
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    new-instance p0, Ln31;

    .line 4
    .line 5
    const/16 v0, 0x14

    .line 6
    .line 7
    invoke-direct {p0, v0}, Ln31;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v0, "selfTest"

    .line 11
    .line 12
    invoke-static {v0, p0}, Lam1;->b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final syncClient(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    sget-object v0, Lam1;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_1
    invoke-static {}, Lam1;->c()V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v3, v1}, Lam1;->d(ZLaf;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-static {p1}, Lnuke/data/cipher/NativeCrypto;->syncClient$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v4

    .line 54
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-nez v5, :cond_0

    .line 59
    .line 60
    const-string v5, ""

    .line 61
    .line 62
    :cond_0
    const-string v6, "NATIVE_UPDATE_REQUIRED:"

    .line 63
    .line 64
    invoke-static {v5, v6, v3}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-static {v3, v1}, Lam1;->d(ZLaf;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lnuke/data/cipher/NativeCrypto;->syncClient$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    :goto_0
    :try_start_4
    invoke-virtual {p0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 88
    :goto_1
    :try_start_6
    invoke-virtual {p0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 92
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_2
    const-string p0, "Native call \'syncClient\' attempted on main thread"

    .line 97
    .line 98
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v1
.end method

.method public final warmUpAsync()V
    .locals 3

    .line 1
    new-instance p0, Ln31;

    .line 2
    .line 3
    const/16 v0, 0x12

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ln31;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lta;

    .line 9
    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    invoke-direct {v0, v1, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lam1;->d:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    new-instance v1, Lm2;

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-direct {v1, v2, v0}, Lm2;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void
.end method
