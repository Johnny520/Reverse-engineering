.class public final Lr7/h;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/g;


# instance fields
.field public final m:Z

.field public n:J


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, Lr7/h;->m:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final L()V
    .locals 8

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget-boolean v1, p0, Lr7/h;->m:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    if-le v3, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    shl-long/2addr v4, v3

    .line 19
    aget-byte v1, v0, v2

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    int-to-long v6, v1

    .line 24
    or-long/2addr v4, v6

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v0, v2}, Lk7/a;->t([BI)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    :cond_2
    :goto_1
    iput-wide v4, p0, Lr7/h;->n:J

    .line 33
    .line 34
    return-void
.end method

.method public final N(J)V
    .locals 7

    .line 1
    iget-wide v0, p0, Lr7/h;->n:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iput-wide p1, p0, Lr7/h;->n:J

    .line 9
    .line 10
    iget-object v0, p0, Lr7/b;->k:[B

    .line 11
    .line 12
    iget-boolean v1, p0, Lr7/h;->m:Z

    .line 13
    .line 14
    const-wide/16 v2, 0xff

    .line 15
    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    if-le v4, v1, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const/4 v1, 0x7

    .line 25
    :goto_0
    if-ltz v1, :cond_4

    .line 26
    .line 27
    and-long v5, p1, v2

    .line 28
    .line 29
    long-to-int v5, v5

    .line 30
    int-to-byte v5, v5

    .line 31
    aput-byte v5, v0, v1

    .line 32
    .line 33
    ushr-long/2addr p1, v4

    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    array-length v1, v0

    .line 38
    if-le v4, v1, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    const/4 v1, 0x0

    .line 42
    :goto_1
    if-ge v1, v4, :cond_4

    .line 43
    .line 44
    and-long v5, p1, v2

    .line 45
    .line 46
    long-to-int v5, v5

    .line 47
    int-to-byte v5, v5

    .line 48
    aput-byte v5, v0, v1

    .line 49
    .line 50
    ushr-long/2addr p1, v4

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    :goto_2
    return-void
.end method

.method public final get()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lr7/h;->n:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    return v0
.end method

.method public final k(I)V
    .locals 4

    .line 1
    int-to-long v0, p1

    .line 2
    const-wide v2, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    invoke-virtual {p0, v0, v1}, Lr7/h;->N(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lr7/h;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
