.class public final La/ve;
.super La/a2;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public final c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/a2;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, La/ve;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {v0, p2}, La/z;->j(Ljava/lang/String;I)V

    .line 3
    invoke-direct {p0}, La/a2;-><init>()V

    .line 4
    iput-object p1, p0, La/ve;->a:Ljava/lang/String;

    .line 5
    iput p2, p0, La/ve;->b:I

    .line 6
    iput-boolean p3, p0, La/ve;->c:Z

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 7

    iget-object v0, p0, La/ve;->a:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, La/ve;->b:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    iput v2, p0, La/ve;->b:I

    :cond_0
    invoke-virtual {p1, v0}, La/B6;->c(Ljava/lang/CharSequence;)I

    move-result v0

    iget v1, p0, La/ve;->b:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_4

    const/4 v2, 0x5

    if-ne v1, v2, :cond_2

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    throw p1

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_0
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, La/B6;->i(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, La/B6;->a(II)V

    const/4 v0, 0x2

    iget-boolean v3, p0, La/ve;->c:Z

    if-eqz v3, :cond_5

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {p1, v5, v4}, La/B6;->h(II)V

    iget-object v4, p1, La/B6;->a:Ljava/nio/ByteBuffer;

    iget v6, p1, La/B6;->b:I

    sub-int/2addr v6, v5

    iput v6, p1, La/B6;->b:I

    int-to-byte v3, v3

    invoke-virtual {v4, v6, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    iget-object v3, p1, La/B6;->d:[I

    invoke-virtual {p1}, La/B6;->g()I

    move-result v4

    aput v4, v3, v0

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    if-eqz v2, :cond_6

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, La/B6;->h(II)V

    iget-object v1, p1, La/B6;->a:Ljava/nio/ByteBuffer;

    iget v3, p1, La/B6;->b:I

    sub-int/2addr v3, v0

    iput v3, p1, La/B6;->b:I

    invoke-virtual {v1, v3, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    iget-object v1, p1, La/B6;->d:[I

    invoke-virtual {p1}, La/B6;->g()I

    move-result v2

    aput v2, v1, v0

    :cond_6
    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "value must be specified"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
