.class public final Lz4/b;
.super Ljava/io/InputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I

.field public h:I

.field public final synthetic i:Lg8/b;


# direct methods
.method public constructor <init>(Lg8/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/b;->i:Lg8/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lz4/b;->g:I

    .line 8
    .line 9
    iput p1, p0, Lz4/b;->h:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 1
    iget-object v0, p0, Lz4/b;->i:Lg8/b;

    .line 2
    .line 3
    iget v0, v0, Lg8/b;->c:I

    .line 4
    .line 5
    iget v1, p0, Lz4/b;->g:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lz4/b;->g:I

    .line 2
    .line 3
    iput p1, p0, Lz4/b;->h:I

    .line 4
    .line 5
    return-void
.end method

.method public final markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final read()I
    .locals 3

    .line 29
    iget v0, p0, Lz4/b;->g:I

    .line 30
    iget-object v1, p0, Lz4/b;->i:Lg8/b;

    iget v2, v1, Lg8/b;->c:I

    if-lt v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    .line 31
    :cond_0
    invoke-virtual {v1, v0}, Lg8/b;->f(I)I

    move-result v0

    .line 32
    iget v1, p0, Lz4/b;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz4/b;->g:I

    return v0
.end method

.method public final read([BII)I
    .locals 3

    .line 1
    add-int v0, p2, p3

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    array-length p3, p1

    .line 7
    sub-int/2addr p3, p2

    .line 8
    :cond_0
    iget-object v0, p0, Lz4/b;->i:Lg8/b;

    .line 9
    .line 10
    iget v1, v0, Lg8/b;->c:I

    .line 11
    .line 12
    iget v2, p0, Lz4/b;->g:I

    .line 13
    .line 14
    sub-int/2addr v1, v2

    .line 15
    if-le p3, v1, :cond_1

    .line 16
    .line 17
    move p3, v1

    .line 18
    :cond_1
    iget-object v0, v0, Lg8/b;->b:[B

    .line 19
    .line 20
    invoke-static {v0, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lz4/b;->g:I

    .line 24
    .line 25
    add-int/2addr p1, p3

    .line 26
    iput p1, p0, Lz4/b;->g:I

    .line 27
    .line 28
    return p3
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lz4/b;->h:I

    .line 2
    .line 3
    iput v0, p0, Lz4/b;->g:I

    .line 4
    .line 5
    return-void
.end method
