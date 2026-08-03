.class public final Lio/sentry/android/replay/a;
.super LBn;
.source ""

# interfaces
.implements LUi;


# static fields
.field public static final c:Lio/sentry/android/replay/a;

.field public static final d:Lio/sentry/android/replay/a;

.field public static final e:Lio/sentry/android/replay/a;

.field public static final f:Lio/sentry/android/replay/a;

.field public static final g:Lio/sentry/android/replay/a;

.field public static final h:Lio/sentry/android/replay/a;

.field public static final i:Lio/sentry/android/replay/a;

.field public static final j:Lio/sentry/android/replay/a;

.field public static final k:Lio/sentry/android/replay/a;

.field public static final l:Lio/sentry/android/replay/a;

.field public static final m:Lio/sentry/android/replay/a;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->c:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->d:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->e:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->f:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->g:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->h:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->i:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->j:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->k:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->l:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->m:Lio/sentry/android/replay/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/a;->b:I

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/sentry/android/replay/a;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/android/replay/D;->a:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v3, "mWindow"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto :goto_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    :goto_0
    return-object v2

    :pswitch_0
    :try_start_1
    const-string v0, "com.android.internal.policy.DecorView"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-object v2

    :pswitch_1
    sget-object v0, Lio/sentry/android/replay/z;->a:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    const-string v1, "getInstance"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_1
    return-object v2

    :pswitch_2
    const-string v0, "android.view.WindowManagerGlobal"

    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    return-object v2

    :pswitch_3
    sget-object v0, Lio/sentry/android/replay/z;->a:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_2

    const-string v2, "mViews"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_2
    return-object v2

    :pswitch_4
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    return-object v0

    :pswitch_6
    new-instance v0, Lio/sentry/android/replay/s;

    invoke-direct {v0}, Lio/sentry/android/replay/s;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lio/sentry/S1;

    const/16 v3, 0x9

    invoke-direct {v2, v3, v0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-object v0

    :pswitch_7
    new-instance v0, Lio/sentry/J;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/J;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0

    :pswitch_8
    new-instance v0, Lio/sentry/util/g;

    invoke-direct {v0}, Lio/sentry/util/g;-><init>()V

    return-object v0

    :pswitch_9
    new-instance v0, LMv;

    const-string v1, "_[a-z]"

    invoke-direct {v0, v1}, LMv;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
