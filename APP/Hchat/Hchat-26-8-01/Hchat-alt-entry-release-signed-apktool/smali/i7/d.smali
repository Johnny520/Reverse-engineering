.class public final Li7/d;
.super Li7/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:[B

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>([B)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    if-gez v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v2, v1

    .line 18
    :goto_1
    array-length v1, p1

    .line 19
    sub-int/2addr v1, v2

    .line 20
    if-le v0, v1, :cond_2

    .line 21
    .line 22
    move v0, v1

    .line 23
    :cond_2
    iput-object p1, p0, Li7/d;->g:[B

    .line 24
    .line 25
    iput v2, p0, Li7/d;->h:I

    .line 26
    .line 27
    iput v0, p0, Li7/d;->i:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 5

    .line 1
    const v0, 0x1002d

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Li7/d;->g:[B

    .line 5
    .line 6
    iget v2, p0, Li7/d;->h:I

    .line 7
    .line 8
    iget v3, p0, Li7/d;->i:I

    .line 9
    .line 10
    if-le v0, v3, :cond_1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, [B

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    move v0, v3

    .line 22
    :cond_1
    new-array v3, v0, [B

    .line 23
    .line 24
    array-length v4, v1

    .line 25
    sub-int/2addr v4, v2

    .line 26
    sub-int/2addr v4, v0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v1, v4, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    return-object v3
.end method

.method public final b(JJ)Ljava/io/InputStream;
    .locals 3

    .line 1
    new-instance v0, Lx7/a;

    .line 2
    .line 3
    iget v1, p0, Li7/d;->h:I

    .line 4
    .line 5
    int-to-long v1, v1

    .line 6
    add-long/2addr p1, v1

    .line 7
    long-to-int p1, p1

    .line 8
    long-to-int p2, p3

    .line 9
    iget-object p3, p0, Li7/d;->g:[B

    .line 10
    .line 11
    invoke-direct {v0, p3, p1, p2}, Lx7/a;-><init>([BII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget v0, p0, Li7/d;->i:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
