.class public final Lio/sentry/android/replay/capture/a;
.super LBn;
.source ""

# interfaces
.implements LUi;


# static fields
.field public static final b:Lio/sentry/android/replay/capture/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBn;-><init>(I)V

    sput-object v0, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/android/replay/capture/a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lio/sentry/J;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/J;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
