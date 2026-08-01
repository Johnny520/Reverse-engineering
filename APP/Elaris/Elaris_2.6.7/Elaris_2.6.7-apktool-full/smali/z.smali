.class public final Lz;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:[B

.field public b:I

.field public final c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [B

    .line 8
    .line 9
    :cond_0
    iput-object p1, p0, Lz;->a:[B

    .line 10
    .line 11
    array-length p1, p1

    .line 12
    iput p1, p0, Lz;->c:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    .line 1
    iget v0, p0, Lz;->b:I

    .line 2
    .line 3
    iget v1, p0, Lz;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    invoke-virtual {p0}, Lz;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v3, v0, v3

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    return v2

    .line 20
    :cond_1
    const/4 v3, 0x3

    .line 21
    ushr-long v3, v0, v3

    .line 22
    .line 23
    long-to-int v3, v3

    .line 24
    iput v3, p0, Lz;->d:I

    .line 25
    .line 26
    const-wide/16 v4, 0x7

    .line 27
    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int v0, v0

    .line 30
    iput v0, p0, Lz;->e:I

    .line 31
    .line 32
    if-lez v3, :cond_2

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    return v2
.end method

.method public final b()[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Lz;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-int v0, v0

    .line 6
    iget v1, p0, Lz;->c:I

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget v2, p0, Lz;->b:I

    .line 11
    .line 12
    add-int v3, v2, v0

    .line 13
    .line 14
    if-le v3, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lz;->a:[B

    .line 18
    .line 19
    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, p0, Lz;->b:I

    .line 24
    .line 25
    add-int/2addr v2, v0

    .line 26
    iput v2, p0, Lz;->b:I

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    :goto_0
    iput v1, p0, Lz;->b:I

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    new-array p0, p0, [B

    .line 33
    .line 34
    return-object p0
.end method

.method public final c()J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x40

    .line 5
    .line 6
    iget v4, p0, Lz;->c:I

    .line 7
    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    iget v3, p0, Lz;->b:I

    .line 11
    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    add-int/lit8 v4, v3, 0x1

    .line 15
    .line 16
    iput v4, p0, Lz;->b:I

    .line 17
    .line 18
    iget-object v4, p0, Lz;->a:[B

    .line 19
    .line 20
    aget-byte v3, v4, v3

    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x7f

    .line 23
    .line 24
    int-to-long v4, v4

    .line 25
    shl-long/2addr v4, v2

    .line 26
    or-long/2addr v0, v4

    .line 27
    and-int/lit16 v3, v3, 0x80

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput v4, p0, Lz;->b:I

    .line 36
    .line 37
    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz;->b()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget v0, p0, Lz;->e:I

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lz;->c:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    iput v2, p0, Lz;->b:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v0, p0, Lz;->b:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x4

    .line 22
    .line 23
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lz;->b:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {p0}, Lz;->c()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    long-to-int v0, v0

    .line 35
    if-gez v0, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget v1, p0, Lz;->b:I

    .line 39
    .line 40
    add-int/2addr v1, v0

    .line 41
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_0
    iput v2, p0, Lz;->b:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget v0, p0, Lz;->b:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x8

    .line 51
    .line 52
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lz;->b:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    invoke-virtual {p0}, Lz;->c()J

    .line 60
    .line 61
    .line 62
    return-void
.end method
