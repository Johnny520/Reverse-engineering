.class public final Lw80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Lga;

.field public final d:I

.field public final e:J

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ll70;

.field public i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public m:Z

.field public n:I

.field public final o:[I


# direct methods
.method public constructor <init>(ILjava/util/List;Lga;Lk50;IIIJLjava/lang/Object;Ljava/lang/Object;Ll70;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw80;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lw80;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lw80;->c:Lga;

    .line 9
    .line 10
    iput p7, p0, Lw80;->d:I

    .line 11
    .line 12
    iput-wide p8, p0, Lw80;->e:J

    .line 13
    .line 14
    iput-object p10, p0, Lw80;->f:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p11, p0, Lw80;->g:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p12, p0, Lw80;->h:Ll70;

    .line 19
    .line 20
    const/high16 p1, -0x80000000

    .line 21
    .line 22
    iput p1, p0, Lw80;->n:I

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p3, 0x0

    .line 29
    move p4, p3

    .line 30
    move p5, p4

    .line 31
    move p6, p5

    .line 32
    :goto_0
    if-ge p4, p1, :cond_0

    .line 33
    .line 34
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p7

    .line 38
    check-cast p7, Lxq0;

    .line 39
    .line 40
    iget p8, p7, Lxq0;->d:I

    .line 41
    .line 42
    add-int/2addr p5, p8

    .line 43
    iget p7, p7, Lxq0;->e:I

    .line 44
    .line 45
    invoke-static {p6, p7}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result p6

    .line 49
    add-int/lit8 p4, p4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iput p5, p0, Lw80;->j:I

    .line 53
    .line 54
    iget p1, p0, Lw80;->d:I

    .line 55
    .line 56
    add-int/2addr p5, p1

    .line 57
    if-gez p5, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move p3, p5

    .line 61
    :goto_1
    iput p3, p0, Lw80;->k:I

    .line 62
    .line 63
    iput p6, p0, Lw80;->l:I

    .line 64
    .line 65
    iget-object p1, p0, Lw80;->b:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    mul-int/lit8 p1, p1, 0x2

    .line 72
    .line 73
    new-array p1, p1, [I

    .line 74
    .line 75
    iput-object p1, p0, Lw80;->o:[I

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lw80;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lw80;->i:I

    .line 14
    .line 15
    int-to-long p0, p0

    .line 16
    shl-long/2addr p0, v0

    .line 17
    return-wide p0

    .line 18
    :cond_0
    mul-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    iget-object p0, p0, Lw80;->o:[I

    .line 21
    .line 22
    aget v1, p0, p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    aget p0, p0, p1

    .line 27
    .line 28
    int-to-long v1, v1

    .line 29
    shl-long v0, v1, v0

    .line 30
    .line 31
    int-to-long p0, p0

    .line 32
    const-wide v2, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr p0, v2

    .line 38
    or-long/2addr p0, v0

    .line 39
    return-wide p0
.end method

.method public final b(Lwq0;)V
    .locals 8

    .line 1
    iget v0, p0, Lw80;->n:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "position() should be called first"

    .line 9
    .line 10
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, Lw80;->b:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_1
    if-ge v2, v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lxq0;

    .line 27
    .line 28
    iget v4, v3, Lxq0;->d:I

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lw80;->a(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    iget-object v6, p0, Lw80;->f:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v7, p0, Lw80;->h:Ll70;

    .line 37
    .line 38
    iget-object v7, v7, Ll70;->a:Ljh0;

    .line 39
    .line 40
    invoke-virtual {v7, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-static {v6}, Lt1;->r(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-wide v6, p0, Lw80;->e:J

    .line 48
    .line 49
    invoke-static {v4, v5, v6, v7}, Lw20;->c(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    invoke-static {p1, v3, v4, v5}, Lwq0;->n(Lwq0;Lxq0;J)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    return-void
.end method

.method public final c(III)V
    .locals 7

    .line 1
    iput p1, p0, Lw80;->i:I

    .line 2
    .line 3
    iput p2, p0, Lw80;->n:I

    .line 4
    .line 5
    iget-object p2, p0, Lw80;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lxq0;

    .line 19
    .line 20
    mul-int/lit8 v3, v1, 0x2

    .line 21
    .line 22
    iget-object v4, p0, Lw80;->o:[I

    .line 23
    .line 24
    aput p1, v4, v3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    iget-object v5, p0, Lw80;->c:Lga;

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iget v6, v2, Lxq0;->e:I

    .line 33
    .line 34
    invoke-virtual {v5, v6, p3}, Lga;->a(II)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    aput v5, v4, v3

    .line 39
    .line 40
    iget v2, v2, Lxq0;->d:I

    .line 41
    .line 42
    add-int/2addr p1, v2

    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p0, "null verticalAlignment when isVertical == false"

    .line 47
    .line 48
    invoke-static {p0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 49
    .line 50
    .line 51
    new-instance p0, Lsg;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_1
    return-void
.end method
