.class public abstract Lio/sentry/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-string v8, "sentry-sampled"

    const-string v9, "sentry-replay_id"

    const-string v0, "sentry-trace_id"

    const-string v1, "sentry-public_key"

    const-string v2, "sentry-release"

    const-string v3, "sentry-user_id"

    const-string v4, "sentry-environment"

    const-string v5, "sentry-transaction"

    const-string v6, "sentry-sample_rate"

    const-string v7, "sentry-sample_rand"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/sentry/b;->a:Ljava/util/List;

    return-void
.end method
