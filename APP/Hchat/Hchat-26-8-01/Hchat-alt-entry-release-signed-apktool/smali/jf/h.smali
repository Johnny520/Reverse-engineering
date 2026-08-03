.class public final Ljf/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lmc/a;
.implements Lsc/a;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/util/List;

.field public f:I

.field public g:Lac/k;


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljf/h;->g:Lac/k;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Ljf/h;->f:I

    .line 6
    .line 7
    iget-object v2, v0, Lac/k;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lff/e;

    .line 10
    .line 11
    iget-object v2, v2, Lff/e;->d:Ljf/e;

    .line 12
    .line 13
    iget v3, v2, Ljf/e;->g:I

    .line 14
    .line 15
    mul-int/lit8 v1, v1, 0x8

    .line 16
    .line 17
    add-int/2addr v1, v3

    .line 18
    invoke-virtual {v0, v1}, Lac/k;->a(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lac/k;->L()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, Lac/k;->L()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, v0, Lac/k;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v2, v2, Ljf/e;->f:I

    .line 38
    .line 39
    mul-int/lit8 v3, v3, 0xc

    .line 40
    .line 41
    add-int/2addr v3, v2

    .line 42
    invoke-virtual {v0, v3}, Lac/k;->a(I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-virtual {v0, v2}, Lac/k;->M(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0, v3}, Lac/k;->a(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lac/k;->J()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :goto_0
    invoke-virtual {v0, v1}, Lac/k;->y(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Ljf/h;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Lac/k;->v(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Ljf/h;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lac/k;->y(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Ljf/h;->d:Ljava/lang/String;

    .line 86
    .line 87
    iput-object v3, p0, Ljf/h;->e:Ljava/util/List;

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    iput-object v0, p0, Ljf/h;->g:Lac/k;

    .line 91
    .line 92
    :cond_1
    return-void
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ljf/h;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ljf/h;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ljf/h;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ljf/h;->a:I

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v1, p0, Ljf/h;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Ljf/h;->e:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2}, Lac/p;->D(Ljava/util/List;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, Ljf/h;->d:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "->"

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, "("

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    invoke-static {v4, v0, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
