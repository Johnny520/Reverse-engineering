.class public final Ldf/e;
.super Ljava/io/InputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Ljava/nio/charset/Charset;

.field public static final k:Ljava/nio/charset/Charset;

.field public static final l:[B


# instance fields
.field public final g:Ljava/io/InputStream;

.field public h:J

.field public i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    sput-object v0, Ldf/e;->j:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    sput-object v0, Ldf/e;->k:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    sput-object v0, Ldf/e;->l:[B

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ldf/e;->h:J

    .line 7
    .line 8
    iput-wide v0, p0, Ldf/e;->i:J

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :goto_0
    iput-object p1, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldf/e;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1, v0, p2}, Ldf/e;->l(IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    throw p1
.end method

.method public final b(JLjava/lang/String;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v0, p0, Ldf/e;->h:J

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, ", expected offset: 0x"

    .line 19
    .line 20
    const-string v1, ", actual: 0x"

    .line 21
    .line 22
    invoke-static {p3, v0, p1, v1, p2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x2

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Ldf/e;->h:J

    .line 7
    .line 8
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    shl-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    or-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final e()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x4

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Ldf/e;->h:J

    .line 7
    .line 8
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    shl-int/lit8 v0, v0, 0x18

    .line 27
    .line 28
    and-int/lit16 v3, v3, 0xff

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x10

    .line 31
    .line 32
    or-int/2addr v0, v3

    .line 33
    and-int/lit16 v2, v2, 0xff

    .line 34
    .line 35
    shl-int/lit8 v2, v2, 0x8

    .line 36
    .line 37
    or-int/2addr v0, v2

    .line 38
    and-int/lit16 v1, v1, 0xff

    .line 39
    .line 40
    or-int/2addr v0, v1

    .line 41
    return v0
.end method

.method public final g()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Ldf/e;->h:J

    .line 7
    .line 8
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final h(I)[B
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ldf/e;->l:[B

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-wide v0, p0, Ldf/e;->h:J

    .line 7
    .line 8
    int-to-long v2, p1

    .line 9
    add-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Ldf/e;->h:J

    .line 11
    .line 12
    new-array v0, p1, [B

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-object v2, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1, p1}, Ljava/io/InputStream;->read([BII)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :goto_0
    if-ge v1, p1, :cond_2

    .line 22
    .line 23
    sub-int v3, p1, v1

    .line 24
    .line 25
    invoke-virtual {v2, v0, v1, v3}, Ljava/io/InputStream;->read([BII)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x1

    .line 30
    if-eq v3, v4, :cond_1

    .line 31
    .line 32
    add-int/2addr v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "No data, can\'t read "

    .line 35
    .line 36
    const-string v1, " bytes"

    .line 37
    .line 38
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_2
    return-object v0
.end method

.method public final i(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldf/e;->h(I)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Ldf/e;->j:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final k(JLjava/lang/String;)V
    .locals 3

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-gtz v2, :cond_1

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    sub-long v0, p1, v0

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ldf/e;->skip(J)J

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldf/e;->b(JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-wide v0, p0, Ldf/e;->h:J

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, ", expected offset not reachable: 0x"

    .line 29
    .line 30
    const-string v1, ", actual: 0x"

    .line 31
    .line 32
    invoke-static {p3, v0, p1, v1, p2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final l(IILjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-wide v1, p0, Ldf/e;->h:J

    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p3, ", expected: 0x"

    .line 26
    .line 27
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, ", actual: 0x"

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ", offset: 0x"

    .line 42
    .line 43
    invoke-static {v2, p1, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public final mark(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Ldf/e;->h:J

    .line 13
    .line 14
    iput-wide v0, p0, Ldf/e;->i:J

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "Mark not supported for input stream "

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final read()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 8
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public final reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Ldf/e;->i:J

    .line 7
    .line 8
    iput-wide v0, p0, Ldf/e;->h:J

    .line 9
    .line 10
    return-void
.end method

.method public final skip(J)J
    .locals 7

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Ldf/e;->h:J

    .line 5
    .line 6
    iget-object v0, p0, Ldf/e;->g:Ljava/io/InputStream;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    :goto_0
    cmp-long v3, v1, p1

    .line 13
    .line 14
    if-gez v3, :cond_1

    .line 15
    .line 16
    sub-long v3, p1, v1

    .line 17
    .line 18
    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v5, v3, v5

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    add-long/2addr v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "No data, can\'t skip "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " bytes"

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    return-wide v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Ldf/e;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "pos: 0x"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
