.class public abstract Lr7/b;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final l:[B


# instance fields
.field public k:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lr7/b;->l:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lr7/b;->l:[B

    .line 7
    .line 8
    iput-object p1, p0, Lr7/b;->k:[B

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-array p1, p1, [B

    .line 12
    .line 13
    iput-object p1, p0, Lr7/b;->k:[B

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    invoke-virtual {p1, v0, v1}, Lq7/b;->e([BI)I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lr7/b;->L()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    :goto_0
    return v1

    .line 13
    :cond_1
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 14
    .line 15
    .line 16
    return v2
.end method

.method public L()V
    .locals 0

    .line 1
    return-void
.end method

.method public final M(IZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    sget-object p1, Lr7/b;->l:[B

    .line 8
    .line 9
    iput-object p1, p0, Lr7/b;->k:[B

    .line 10
    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Lr7/b;->L()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object v1, p0, Lr7/b;->k:[B

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    if-ne p1, v2, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    new-array v3, p1, [B

    .line 24
    .line 25
    if-ge p1, v2, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    move p1, v2

    .line 29
    :goto_0
    invoke-static {v1, v0, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object v3, p0, Lr7/b;->k:[B

    .line 33
    .line 34
    if-eqz p2, :cond_4

    .line 35
    .line 36
    invoke-virtual {p0}, Lr7/b;->L()V

    .line 37
    .line 38
    .line 39
    :cond_4
    :goto_1
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    return v0
.end method

.method public r()[B
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    return-object v0
.end method

.method public final z(Lf6/b;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk7/a;

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v1, p1, Lf6/b;->b:Z

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget v1, p1, Lf6/b;->c:I

    .line 28
    .line 29
    add-int/2addr v1, v0

    .line 30
    iput v1, p1, Lf6/b;->c:I

    .line 31
    .line 32
    :cond_3
    :goto_0
    return-void
.end method
