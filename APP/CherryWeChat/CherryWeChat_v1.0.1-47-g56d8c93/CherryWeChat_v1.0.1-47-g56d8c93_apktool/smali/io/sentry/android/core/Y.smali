.class public final Lio/sentry/android/core/Y;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# instance fields
.field public final a:Lio/sentry/w1;

.field public final b:Lio/sentry/android/core/I;

.field public c:Landroid/net/NetworkCapabilities;

.field public d:J

.field public final e:Lio/sentry/I1;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/I;Lio/sentry/I1;)V
    .locals 2

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/Y;->c:Landroid/net/NetworkCapabilities;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/sentry/android/core/Y;->d:J

    sget-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    iput-object v0, p0, Lio/sentry/android/core/Y;->a:Lio/sentry/w1;

    const-string v0, "BuildInfoProvider is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/Y;->b:Lio/sentry/android/core/I;

    const-string p1, "SentryDateProvider is required"

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/android/core/Y;->e:Lio/sentry/I1;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lio/sentry/f;
    .locals 2

    new-instance v0, Lio/sentry/f;

    invoke-direct {v0}, Lio/sentry/f;-><init>()V

    const-string v1, "system"

    iput-object v1, v0, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v1, "network.event"

    iput-object v1, v0, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v1, "action"

    invoke-virtual {v0, v1, p0}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    iput-object p0, v0, Lio/sentry/f;->i:Lio/sentry/a2;

    return-object v0
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    const-string p1, "NETWORK_AVAILABLE"

    invoke-static {p1}, Lio/sentry/android/core/Y;->a(Ljava/lang/String;)Lio/sentry/f;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/android/core/Y;->a:Lio/sentry/w1;

    invoke-virtual {v0, p1}, Lio/sentry/w1;->s(Lio/sentry/f;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/android/core/Y;->c:Landroid/net/NetworkCapabilities;

    return-void
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Lio/sentry/android/core/Y;->e:Lio/sentry/I1;

    invoke-interface {v2}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/H1;->d()J

    move-result-wide v2

    iget-object v4, v0, Lio/sentry/android/core/Y;->c:Landroid/net/NetworkCapabilities;

    iget-wide v5, v0, Lio/sentry/android/core/Y;->d:J

    iget-object v7, v0, Lio/sentry/android/core/Y;->b:Lio/sentry/android/core/I;

    if-nez v4, :cond_0

    new-instance v4, Lio/sentry/android/core/X;

    invoke-direct {v4, v1, v7, v2, v3}, Lio/sentry/android/core/X;-><init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/I;J)V

    goto/16 :goto_b

    :cond_0
    const-string v8, "BuildInfoProvider is required"

    invoke-static {v8, v7}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroid/net/NetworkCapabilities;->getLinkDownstreamBandwidthKbps()I

    move-result v8

    invoke-virtual {v4}, Landroid/net/NetworkCapabilities;->getLinkUpstreamBandwidthKbps()I

    move-result v9

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1d

    if-lt v10, v11, :cond_1

    invoke-static {v4}, Lio/sentry/android/core/F;->a(Landroid/net/NetworkCapabilities;)I

    move-result v10

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    const/16 v11, -0x64

    if-le v10, v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x4

    invoke-virtual {v4, v11}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v11

    invoke-static {v4}, Lio/sentry/android/core/internal/util/b;->o(Landroid/net/NetworkCapabilities;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, ""

    :goto_2
    new-instance v13, Lio/sentry/android/core/X;

    invoke-direct {v13, v1, v7, v2, v3}, Lio/sentry/android/core/X;-><init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/I;J)V

    iget v7, v13, Lio/sentry/android/core/X;->c:I

    sub-int/2addr v10, v7

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v7

    iget v10, v13, Lio/sentry/android/core/X;->a:I

    sub-int v10, v8, v10

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v14, v13, Lio/sentry/android/core/X;->b:I

    sub-int v14, v9, v14

    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v14

    move-wide v15, v5

    iget-wide v5, v13, Lio/sentry/android/core/X;->d:J

    sub-long v5, v15, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    long-to-double v5, v5

    const-wide v15, 0x412e848000000000L    # 1000000.0

    div-double/2addr v5, v15

    const-wide v15, 0x40b3880000000000L    # 5000.0

    cmpg-double v5, v5, v15

    if-gez v5, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    if-nez v5, :cond_6

    const/4 v15, 0x5

    if-gt v7, v15, :cond_5

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v7, 0x1

    :goto_5
    const-wide v15, 0x3fb999999999999aL    # 0.1

    move/from16 v17, v7

    const-wide v6, 0x408f400000000000L    # 1000.0

    if-nez v5, :cond_8

    move-object/from16 v18, v13

    int-to-double v12, v10

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    move v10, v9

    int-to-double v8, v8

    mul-double/2addr v8, v15

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v8

    cmpg-double v8, v12, v8

    if-gtz v8, :cond_7

    goto :goto_6

    :cond_7
    const/4 v8, 0x0

    goto :goto_7

    :cond_8
    move v10, v9

    move-object/from16 v18, v13

    :goto_6
    const/4 v8, 0x1

    :goto_7
    if-nez v5, :cond_a

    int-to-double v12, v14

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v5

    int-to-double v9, v5

    mul-double/2addr v9, v15

    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v5

    cmpg-double v5, v12, v5

    if-gtz v5, :cond_9

    goto :goto_9

    :cond_9
    const/4 v12, 0x0

    :goto_8
    move-object/from16 v5, v18

    goto :goto_a

    :cond_a
    :goto_9
    const/4 v12, 0x1

    goto :goto_8

    :goto_a
    iget-boolean v6, v5, Lio/sentry/android/core/X;->e:Z

    if-ne v11, v6, :cond_b

    iget-object v6, v5, Lio/sentry/android/core/X;->f:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    if-eqz v17, :cond_b

    if-eqz v8, :cond_b

    if-eqz v12, :cond_b

    const/4 v4, 0x0

    goto :goto_b

    :cond_b
    move-object v4, v5

    :goto_b
    if-nez v4, :cond_c

    return-void

    :cond_c
    iput-object v1, v0, Lio/sentry/android/core/Y;->c:Landroid/net/NetworkCapabilities;

    iput-wide v2, v0, Lio/sentry/android/core/Y;->d:J

    const-string v1, "NETWORK_CAPABILITIES_CHANGED"

    invoke-static {v1}, Lio/sentry/android/core/Y;->a(Ljava/lang/String;)Lio/sentry/f;

    move-result-object v1

    iget v2, v4, Lio/sentry/android/core/X;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "download_bandwidth"

    invoke-virtual {v1, v3, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget v2, v4, Lio/sentry/android/core/X;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "upload_bandwidth"

    invoke-virtual {v1, v3, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lio/sentry/android/core/X;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "vpn_active"

    invoke-virtual {v1, v3, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "network_type"

    iget-object v3, v4, Lio/sentry/android/core/X;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget v2, v4, Lio/sentry/android/core/X;->c:I

    if-eqz v2, :cond_d

    const-string v3, "signal_strength"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_d
    new-instance v2, Lio/sentry/H;

    invoke-direct {v2}, Lio/sentry/H;-><init>()V

    const-string v3, "android:networkCapabilities"

    invoke-virtual {v2, v3, v4}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v3, v0, Lio/sentry/android/core/Y;->a:Lio/sentry/w1;

    invoke-virtual {v3, v1, v2}, Lio/sentry/w1;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    const-string p1, "NETWORK_LOST"

    invoke-static {p1}, Lio/sentry/android/core/Y;->a(Ljava/lang/String;)Lio/sentry/f;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/android/core/Y;->a:Lio/sentry/w1;

    invoke-virtual {v0, p1}, Lio/sentry/w1;->s(Lio/sentry/f;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/android/core/Y;->c:Landroid/net/NetworkCapabilities;

    return-void
.end method
