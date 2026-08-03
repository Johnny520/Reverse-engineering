.class public final Lio/sentry/W1;
.super Lio/sentry/H1;
.source ""


# instance fields
.field public final a:Ljava/time/Instant;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/W1;->a:Ljava/time/Instant;

    return-void
.end method


# virtual methods
.method public final d()J
    .locals 5

    iget-object v0, p0, Lio/sentry/W1;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v1

    const-wide/32 v3, 0x3b9aca00

    mul-long/2addr v1, v3

    invoke-virtual {v0}, Ljava/time/Instant;->getNano()I

    move-result v0

    int-to-long v3, v0

    add-long/2addr v1, v3

    return-wide v1
.end method
