.class public abstract Lv4/t;
.super Lv4/u;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lv4/t;->g:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Lv4/a;)I
    .locals 4

    .line 1
    check-cast p1, Lv4/t;

    .line 2
    .line 3
    iget-wide v0, p1, Lv4/t;->g:J

    .line 4
    .line 5
    iget-wide v2, p0, Lv4/t;->g:J

    .line 6
    .line 7
    cmp-long p1, v2, v0

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    :cond_0
    if-lez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    check-cast p1, Lv4/t;

    .line 14
    .line 15
    iget-wide v0, p1, Lv4/t;->g:J

    .line 16
    .line 17
    iget-wide v2, p0, Lv4/t;->g:J

    .line 18
    .line 19
    cmp-long p1, v2, v0

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lv4/t;->g:J

    .line 2
    .line 3
    long-to-int v2, v0

    .line 4
    const/16 v3, 0x20

    .line 5
    .line 6
    shr-long/2addr v0, v3

    .line 7
    long-to-int v0, v0

    .line 8
    xor-int/2addr v0, v2

    .line 9
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lv4/t;->g:J

    .line 2
    .line 3
    long-to-int v2, v0

    .line 4
    int-to-long v2, v2

    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final l()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lv4/t;->g:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    return v0
.end method

.method public final m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv4/t;->g:J

    .line 2
    .line 3
    return-wide v0
.end method
