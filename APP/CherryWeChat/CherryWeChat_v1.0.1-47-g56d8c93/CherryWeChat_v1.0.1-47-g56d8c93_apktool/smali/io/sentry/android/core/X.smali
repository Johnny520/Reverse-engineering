.class public final Lio/sentry/android/core/X;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:Z

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/I;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "NetworkCapabilities is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "BuildInfoProvider is required"

    invoke-static {v0, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/net/NetworkCapabilities;->getLinkDownstreamBandwidthKbps()I

    move-result p2

    iput p2, p0, Lio/sentry/android/core/X;->a:I

    invoke-virtual {p1}, Landroid/net/NetworkCapabilities;->getLinkUpstreamBandwidthKbps()I

    move-result p2

    iput p2, p0, Lio/sentry/android/core/X;->b:I

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/4 v1, 0x0

    if-lt p2, v0, :cond_0

    invoke-static {p1}, Lio/sentry/android/core/F;->a(Landroid/net/NetworkCapabilities;)I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    const/16 v0, -0x64

    if-le p2, v0, :cond_1

    move v1, p2

    :cond_1
    iput v1, p0, Lio/sentry/android/core/X;->c:I

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/android/core/X;->e:Z

    invoke-static {p1}, Lio/sentry/android/core/internal/util/b;->o(Landroid/net/NetworkCapabilities;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, ""

    :goto_1
    iput-object p1, p0, Lio/sentry/android/core/X;->f:Ljava/lang/String;

    iput-wide p3, p0, Lio/sentry/android/core/X;->d:J

    return-void
.end method
