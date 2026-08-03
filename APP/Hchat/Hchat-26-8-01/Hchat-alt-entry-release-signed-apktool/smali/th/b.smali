.class final Lth/b;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lth/a;

.field public final b:Lfg/a;

.field public final c:Lfg/l;

.field public final d:Lfg/l;

.field public final e:Lfg/l;

.field public final f:Lfg/p;

.field public final g:Lfg/l;

.field public final h:Z


# direct methods
.method public constructor <init>(Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Lfg/l;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lth/b;->a:Lth/a;

    .line 14
    .line 15
    iput-object p2, p0, Lth/b;->b:Lfg/a;

    .line 16
    .line 17
    iput-object p3, p0, Lth/b;->c:Lfg/l;

    .line 18
    .line 19
    iput-object p4, p0, Lth/b;->d:Lfg/l;

    .line 20
    .line 21
    iput-object p5, p0, Lth/b;->e:Lfg/l;

    .line 22
    .line 23
    iput-object p6, p0, Lth/b;->f:Lfg/p;

    .line 24
    .line 25
    iput-object p7, p0, Lth/b;->g:Lfg/l;

    .line 26
    .line 27
    iput-boolean p8, p0, Lth/b;->h:Z

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lth/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lth/b;

    .line 10
    .line 11
    iget-object v0, p1, Lth/b;->a:Lth/a;

    .line 12
    .line 13
    iget-object v1, p0, Lth/b;->a:Lth/a;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lth/b;->b:Lfg/a;

    .line 23
    .line 24
    iget-object v1, p1, Lth/b;->b:Lfg/a;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lth/b;->c:Lfg/l;

    .line 34
    .line 35
    iget-object v1, p1, Lth/b;->c:Lfg/l;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, Lth/b;->d:Lfg/l;

    .line 45
    .line 46
    iget-object v1, p1, Lth/b;->d:Lfg/l;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, Lth/b;->e:Lfg/l;

    .line 56
    .line 57
    iget-object v1, p1, Lth/b;->e:Lfg/l;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, Lth/b;->f:Lfg/p;

    .line 67
    .line 68
    iget-object v1, p1, Lth/b;->f:Lfg/p;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, Lth/b;->g:Lfg/l;

    .line 78
    .line 79
    iget-object v1, p1, Lth/b;->g:Lfg/l;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-boolean v0, p0, Lth/b;->h:Z

    .line 89
    .line 90
    iget-boolean p1, p1, Lth/b;->h:Z

    .line 91
    .line 92
    if-eq v0, p1, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p1, 0x0

    .line 95
    return p1

    .line 96
    :cond_9
    :goto_1
    const/4 p1, 0x1

    .line 97
    return p1
.end method

.method public final f()Ly0/n;
    .locals 9

    .line 1
    new-instance v0, Lth/i;

    .line 2
    .line 3
    iget-object v7, p0, Lth/b;->g:Lfg/l;

    .line 4
    .line 5
    iget-boolean v8, p0, Lth/b;->h:Z

    .line 6
    .line 7
    iget-object v1, p0, Lth/b;->a:Lth/a;

    .line 8
    .line 9
    iget-object v2, p0, Lth/b;->b:Lfg/a;

    .line 10
    .line 11
    iget-object v3, p0, Lth/b;->c:Lfg/l;

    .line 12
    .line 13
    iget-object v4, p0, Lth/b;->d:Lfg/l;

    .line 14
    .line 15
    iget-object v5, p0, Lth/b;->e:Lfg/l;

    .line 16
    .line 17
    iget-object v6, p0, Lth/b;->f:Lfg/p;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v8}, Lth/i;-><init>(Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Lfg/l;Z)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 4

    .line 1
    check-cast p1, Lth/i;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lth/i;->A:Z

    .line 7
    .line 8
    iget-boolean v1, p0, Lth/b;->h:Z

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lth/b;->a:Lth/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v2, p1, Lth/i;->u:Lth/a;

    .line 21
    .line 22
    iget-object v2, p0, Lth/b;->b:Lfg/a;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v3, p1, Lth/i;->B:Lvh/f;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iput-object v2, v3, Lvh/f;->c:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v2, p0, Lth/b;->c:Lfg/l;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iput-object v2, p1, Lth/i;->v:Lfg/l;

    .line 40
    .line 41
    iget-object v2, p0, Lth/b;->d:Lfg/l;

    .line 42
    .line 43
    iput-object v2, p1, Lth/i;->w:Lfg/l;

    .line 44
    .line 45
    iget-object v2, p0, Lth/b;->e:Lfg/l;

    .line 46
    .line 47
    iput-object v2, p1, Lth/i;->x:Lfg/l;

    .line 48
    .line 49
    iget-object v2, p0, Lth/b;->f:Lfg/p;

    .line 50
    .line 51
    iput-object v2, p1, Lth/i;->y:Lfg/p;

    .line 52
    .line 53
    iget-object v2, p0, Lth/b;->g:Lfg/l;

    .line 54
    .line 55
    iput-object v2, p1, Lth/i;->z:Lfg/l;

    .line 56
    .line 57
    iput-boolean v1, p1, Lth/i;->A:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Lth/i;->o1()V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lx1/k;->m(Lx1/v;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    new-instance v0, Li/e0;

    .line 70
    .line 71
    const/16 v1, 0x1a

    .line 72
    .line 73
    invoke-direct {v0, p1, v1}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lth/b;->a:Lth/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lth/b;->b:Lfg/a;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lth/b;->c:Lfg/l;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/4 v2, 0x0

    .line 27
    iget-object v3, p0, Lth/b;->d:Lfg/l;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v2

    .line 37
    :goto_0
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v1

    .line 39
    iget-object v3, p0, Lth/b;->e:Lfg/l;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v3, v2

    .line 49
    :goto_1
    add-int/2addr v0, v3

    .line 50
    mul-int/lit16 v0, v0, 0x3c1

    .line 51
    .line 52
    iget-object v3, p0, Lth/b;->f:Lfg/p;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    add-int/2addr v3, v0

    .line 59
    mul-int/2addr v3, v1

    .line 60
    iget-object v0, p0, Lth/b;->g:Lfg/l;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :cond_2
    add-int/2addr v3, v2

    .line 69
    mul-int/lit16 v3, v3, 0x3c1

    .line 70
    .line 71
    const/4 v0, 0x3

    .line 72
    invoke-static {v0, v3, v1}, Leh/a;->e(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v1, p0, Lth/b;->h:Z

    .line 77
    .line 78
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v1, v0

    .line 83
    return v1
.end method
