.class public abstract Led0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljo0;->e:Ljo0;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Ljo0;

    .line 9
    .line 10
    const/16 v0, 0x18

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljo0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object p0, Ljo0;->e:Ljo0;

    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 1
    iget v0, p0, Led0;->f:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Led0;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget p0, p0, Led0;->e:I

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Led0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfd0;

    .line 4
    .line 5
    iget v0, v0, Lfd0;->k:I

    .line 6
    .line 7
    iget p0, p0, Led0;->f:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public c()V
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Led0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Led0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lfd0;

    .line 6
    .line 7
    iget v2, v1, Lfd0;->i:I

    .line 8
    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lfd0;->f:[I

    .line 12
    .line 13
    aget v1, v1, v0

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Led0;->d:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Led0;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Led0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lfd0;

    .line 6
    .line 7
    iget p0, p0, Lfd0;->i:I

    .line 8
    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Led0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfd0;

    .line 4
    .line 5
    invoke-virtual {p0}, Led0;->b()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Led0;->e:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lfd0;->b()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Led0;->e:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lfd0;->j(I)V

    .line 19
    .line 20
    .line 21
    iput v2, p0, Led0;->e:I

    .line 22
    .line 23
    iget v0, v0, Lfd0;->k:I

    .line 24
    .line 25
    iput v0, p0, Led0;->f:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "Call next() before removing element from the iterator."

    .line 29
    .line 30
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
