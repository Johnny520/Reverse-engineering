.class public final Lio/sentry/android/core/internal/util/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/transport/f;


# static fields
.field public static final a:Lio/sentry/android/core/internal/util/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/android/core/internal/util/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/android/core/internal/util/c;->a:Lio/sentry/android/core/internal/util/c;

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
