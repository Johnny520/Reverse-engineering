.class public final Lt7/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final g:I

.field public final h:Ll7/f;


# direct methods
.method public constructor <init>(Ll7/f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lt7/b;->g:I

    .line 5
    .line 6
    iput-object p1, p0, Lt7/b;->h:Ll7/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ll7/f;Lv7/k0;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    sget-object v1, Lv7/k0;->i:Lv7/k0;

    .line 9
    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    const/16 p2, 0x40

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p2, 0x3f

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    iget-object p2, p0, Lt7/b;->h:Ll7/f;

    .line 24
    .line 25
    if-eq p1, p2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p2}, Ll7/f;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p2}, Ll7/f;->V()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x3a

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p0}, Lt7/b;->c()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/16 p1, 0x2f

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lt7/b;->b()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lt7/b;->d(Z)Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lv7/d;

    .line 18
    .line 19
    iget-object v3, v1, Lv7/d;->k:Lv7/g0;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v3, Lv7/g0;->k:Lv7/i0;

    .line 24
    .line 25
    invoke-virtual {v3}, Lv7/i0;->N()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, -0x1

    .line 31
    :goto_0
    if-gez v3, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const-class v4, Ll7/f;

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ll7/f;

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    :goto_1
    move-object v1, v2

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    iget-object v1, v1, Ll7/f;->p:Lu7/b;

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lu7/c;->V(I)Lr7/s;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lr7/q;

    .line 53
    .line 54
    :goto_2
    if-eqz v1, :cond_4

    .line 55
    .line 56
    iget-object v2, v1, Lr7/r;->m:Ljava/lang/String;

    .line 57
    .line 58
    :cond_4
    if-eqz v2, :cond_0

    .line 59
    .line 60
    :cond_5
    return-object v2
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lt7/b;->g:I

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    iget-object v1, p0, Lt7/b;->h:Ll7/f;

    .line 8
    .line 9
    iget-object v1, v1, Ll7/f;->o:Lu7/d;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lu7/d;->c0(I)Lr7/y;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final d(Z)Ljava/util/Iterator;
    .locals 4

    .line 1
    iget v0, p0, Lt7/b;->g:I

    .line 2
    .line 3
    shr-int/lit8 v1, v0, 0x18

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    iget-object v2, p0, Lt7/b;->h:Ll7/f;

    .line 8
    .line 9
    invoke-virtual {v2}, Ll7/f;->U()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    shr-int/lit8 v1, v0, 0x10

    .line 17
    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    const v3, 0xffff

    .line 21
    .line 22
    .line 23
    and-int/2addr v0, v3

    .line 24
    iget-object v2, v2, Ll7/f;->q:Lo7/f;

    .line 25
    .line 26
    iget-object v2, v2, Lo7/f;->m:Lj7/d;

    .line 27
    .line 28
    int-to-byte v1, v1

    .line 29
    invoke-virtual {v2, v1}, Lj7/d;->k0(B)Lo7/j;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    new-instance v2, Lz7/g;

    .line 36
    .line 37
    iget-object v1, v1, Lo7/j;->m:Lj7/e;

    .line 38
    .line 39
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 40
    .line 41
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, Lo7/h;

    .line 46
    .line 47
    invoke-direct {v3, v0, p1}, Lo7/h;-><init>(IZ)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, v1, v3}, Lz7/g;-><init>(Ljava/util/Iterator;Ljava/util/function/Function;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    :goto_0
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 55
    .line 56
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lt7/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lt7/b;

    .line 12
    .line 13
    iget v1, p0, Lt7/b;->g:I

    .line 14
    .line 15
    iget p1, p1, Lt7/b;->g:I

    .line 16
    .line 17
    if-ne v1, p1, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lt7/b;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lt7/b;->d(Z)Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lt7/b;->h:Ll7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll7/f;->V()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const-string v2, "/"

    .line 10
    .line 11
    const-string v3, " @"

    .line 12
    .line 13
    iget v4, p0, Lt7/b;->g:I

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt7/b;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lt7/b;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ":"

    .line 73
    .line 74
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lt7/b;->c()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lt7/b;->b()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method
