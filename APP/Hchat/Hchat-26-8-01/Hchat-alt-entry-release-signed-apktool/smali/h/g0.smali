.class final Lh/g0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Li/k1;

.field public final b:Li/d1;

.field public final c:Li/d1;

.field public final d:Li/d1;

.field public final e:Lh/r0;

.field public final f:Lh/s0;

.field public final g:Lfg/a;

.field public final h:Lh/h0;


# direct methods
.method public constructor <init>(Li/k1;Li/d1;Li/d1;Li/d1;Lh/r0;Lh/s0;Lfg/a;Lh/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/g0;->a:Li/k1;

    .line 5
    .line 6
    iput-object p2, p0, Lh/g0;->b:Li/d1;

    .line 7
    .line 8
    iput-object p3, p0, Lh/g0;->c:Li/d1;

    .line 9
    .line 10
    iput-object p4, p0, Lh/g0;->d:Li/d1;

    .line 11
    .line 12
    iput-object p5, p0, Lh/g0;->e:Lh/r0;

    .line 13
    .line 14
    iput-object p6, p0, Lh/g0;->f:Lh/s0;

    .line 15
    .line 16
    iput-object p7, p0, Lh/g0;->g:Lfg/a;

    .line 17
    .line 18
    iput-object p8, p0, Lh/g0;->h:Lh/h0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lh/g0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lh/g0;

    .line 6
    .line 7
    iget-object v0, p1, Lh/g0;->a:Li/k1;

    .line 8
    .line 9
    iget-object v1, p0, Lh/g0;->a:Li/k1;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lh/g0;->b:Li/d1;

    .line 18
    .line 19
    iget-object v1, p0, Lh/g0;->b:Li/d1;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lh/g0;->c:Li/d1;

    .line 28
    .line 29
    iget-object v1, p0, Lh/g0;->c:Li/d1;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p1, Lh/g0;->d:Li/d1;

    .line 38
    .line 39
    iget-object v1, p0, Lh/g0;->d:Li/d1;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v0, p1, Lh/g0;->e:Lh/r0;

    .line 48
    .line 49
    iget-object v1, p0, Lh/g0;->e:Lh/r0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lh/r0;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iget-object v0, p1, Lh/g0;->f:Lh/s0;

    .line 58
    .line 59
    iget-object v1, p0, Lh/g0;->f:Lh/s0;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    iget-object v0, p1, Lh/g0;->g:Lfg/a;

    .line 68
    .line 69
    iget-object v1, p0, Lh/g0;->g:Lfg/a;

    .line 70
    .line 71
    if-ne v0, v1, :cond_0

    .line 72
    .line 73
    iget-object p1, p1, Lh/g0;->h:Lh/h0;

    .line 74
    .line 75
    iget-object v0, p0, Lh/g0;->h:Lh/h0;

    .line 76
    .line 77
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_0
    const/4 p1, 0x0

    .line 86
    return p1
.end method

.method public final f()Ly0/n;
    .locals 9

    .line 1
    new-instance v0, Lh/q0;

    .line 2
    .line 3
    iget-object v7, p0, Lh/g0;->g:Lfg/a;

    .line 4
    .line 5
    iget-object v8, p0, Lh/g0;->h:Lh/h0;

    .line 6
    .line 7
    iget-object v1, p0, Lh/g0;->a:Li/k1;

    .line 8
    .line 9
    iget-object v2, p0, Lh/g0;->b:Li/d1;

    .line 10
    .line 11
    iget-object v3, p0, Lh/g0;->c:Li/d1;

    .line 12
    .line 13
    iget-object v4, p0, Lh/g0;->d:Li/d1;

    .line 14
    .line 15
    iget-object v5, p0, Lh/g0;->e:Lh/r0;

    .line 16
    .line 17
    iget-object v6, p0, Lh/g0;->f:Lh/s0;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v8}, Lh/q0;-><init>(Li/k1;Li/d1;Li/d1;Li/d1;Lh/r0;Lh/s0;Lfg/a;Lh/h0;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lh/q0;

    .line 2
    .line 3
    iget-object v0, p0, Lh/g0;->a:Li/k1;

    .line 4
    .line 5
    iput-object v0, p1, Lh/q0;->v:Li/k1;

    .line 6
    .line 7
    iget-object v0, p0, Lh/g0;->b:Li/d1;

    .line 8
    .line 9
    iput-object v0, p1, Lh/q0;->w:Li/d1;

    .line 10
    .line 11
    iget-object v0, p0, Lh/g0;->c:Li/d1;

    .line 12
    .line 13
    iput-object v0, p1, Lh/q0;->x:Li/d1;

    .line 14
    .line 15
    iget-object v0, p0, Lh/g0;->d:Li/d1;

    .line 16
    .line 17
    iput-object v0, p1, Lh/q0;->y:Li/d1;

    .line 18
    .line 19
    iget-object v0, p0, Lh/g0;->e:Lh/r0;

    .line 20
    .line 21
    iput-object v0, p1, Lh/q0;->z:Lh/r0;

    .line 22
    .line 23
    iget-object v0, p0, Lh/g0;->f:Lh/s0;

    .line 24
    .line 25
    iput-object v0, p1, Lh/q0;->A:Lh/s0;

    .line 26
    .line 27
    iget-object v0, p0, Lh/g0;->g:Lfg/a;

    .line 28
    .line 29
    iput-object v0, p1, Lh/q0;->B:Lfg/a;

    .line 30
    .line 31
    iget-object v0, p0, Lh/g0;->h:Lh/h0;

    .line 32
    .line 33
    iput-object v0, p1, Lh/q0;->C:Lh/h0;

    .line 34
    .line 35
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lh/g0;->a:Li/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Lh/g0;->b:Li/d1;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v1

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v2, p0, Lh/g0;->c:Li/d1;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v1

    .line 33
    :goto_1
    add-int/2addr v0, v2

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v2, p0, Lh/g0;->d:Li/d1;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    :cond_2
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, Lh/g0;->e:Lh/r0;

    .line 48
    .line 49
    iget-object v1, v1, Lh/r0;->a:Lh/h1;

    .line 50
    .line 51
    invoke-virtual {v1}, Lh/h1;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v1, v0

    .line 56
    mul-int/lit8 v1, v1, 0x1f

    .line 57
    .line 58
    iget-object v0, p0, Lh/g0;->f:Lh/s0;

    .line 59
    .line 60
    iget-object v0, v0, Lh/s0;->a:Lh/h1;

    .line 61
    .line 62
    invoke-virtual {v0}, Lh/h1;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    add-int/2addr v0, v1

    .line 67
    mul-int/lit8 v0, v0, 0x1f

    .line 68
    .line 69
    iget-object v1, p0, Lh/g0;->g:Lfg/a;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v1, v0

    .line 76
    mul-int/lit8 v1, v1, 0x1f

    .line 77
    .line 78
    iget-object v0, p0, Lh/g0;->h:Lh/h0;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    add-int/2addr v0, v1

    .line 85
    return v0
.end method
