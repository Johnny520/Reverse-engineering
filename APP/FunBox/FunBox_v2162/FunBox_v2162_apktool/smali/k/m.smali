.class public abstract Lk/m;
.super Lk/n;
.source "SourceFile"


# instance fields
.field private final a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lk/n;-><init>()V

    iput-wide p1, p0, Lk/m;->a:J

    return-void
.end method


# virtual methods
.method protected final e(Lk/a;)I
    .locals 4

    check-cast p1, Lk/m;

    iget-wide v0, p1, Lk/m;->a:J

    iget-wide v2, p0, Lk/m;->a:J

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    check-cast p1, Lk/m;

    iget-wide v0, p1, Lk/m;->a:J

    iget-wide v2, p0, Lk/m;->a:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g()Z
    .locals 4

    iget-wide v0, p0, Lk/m;->a:J

    long-to-int v2, v0

    int-to-long v2, v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()I
    .locals 2

    iget-wide v0, p0, Lk/m;->a:J

    long-to-int v0, v0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Lk/m;->a:J

    long-to-int v2, v0

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v0, v0

    xor-int/2addr v0, v2

    return v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lk/m;->a:J

    return-wide v0
.end method
