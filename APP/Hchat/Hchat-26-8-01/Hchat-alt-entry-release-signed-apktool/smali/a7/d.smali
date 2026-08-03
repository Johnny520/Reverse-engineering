.class public final La7/d;
.super La7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Ljava/lang/Object;

.field public s:I

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La7/c;-><init>(Ljava/lang/String;Lc7/f;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La7/d;->r:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, La7/c;->i:Z

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, La7/c;->j:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final e()Ll7/l;
    .locals 1

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    check-cast v0, Lt7/a;

    .line 4
    .line 5
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const-class v0, La7/d;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p1, La7/d;

    .line 16
    .line 17
    invoke-virtual {p0}, La7/d;->s()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, La7/d;->s()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public final g()Ll7/l;
    .locals 1

    .line 1
    invoke-super {p0}, La7/c;->g()Ll7/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lt7/a;

    .line 6
    .line 7
    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const-class v0, La7/d;

    .line 2
    .line 3
    invoke-virtual {p0}, La7/d;->s()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final o()Ll7/l;
    .locals 5

    .line 1
    const-string v0, "resources.arsc"

    .line 2
    .line 3
    iget-object v1, p0, La7/c;->h:Lc7/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lc7/e;->b()Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Lt7/a;

    .line 16
    .line 17
    invoke-direct {v3}, Ll7/l;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lq7/b;

    .line 21
    .line 22
    invoke-direct {v4, v2}, Lq7/b;-><init>(Ljava/io/InputStream;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v4}, Lk7/a;->G(Lq7/b;)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v3, Ll7/l;->r:La7/c;

    .line 29
    .line 30
    new-instance v2, Lc7/d;

    .line 31
    .line 32
    iget-object v4, v0, Lc7/e;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {v2, v4, v3}, Lc7/d;-><init>(Ljava/lang/String;Lk7/a;)V

    .line 35
    .line 36
    .line 37
    iget v4, v0, Lc7/e;->c:I

    .line 38
    .line 39
    iput v4, v2, Lc7/e;->c:I

    .line 40
    .line 41
    iget v0, v0, Lc7/e;->d:I

    .line 42
    .line 43
    iput v0, v2, Lc7/e;->d:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lc7/f;->a(Lc7/d;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_0
    const-string v0, "Entry not found: resources.arsc"

    .line 50
    .line 51
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, La7/d;->x()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La7/d;->u:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La7/d;->w()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, La7/d;->u:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v1, "-"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, La7/d;->u()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final t()Lt7/a;
    .locals 1

    .line 1
    invoke-super {p0}, La7/c;->g()Ll7/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lt7/a;

    .line 6
    .line 7
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, La7/d;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, La7/d;->s:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La7/d;->w()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, La7/d;->s:I

    .line 9
    .line 10
    return v0
.end method

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, La7/c;->m:Lm7/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La7/c;->h:Lc7/f;

    .line 6
    .line 7
    const-string v1, "AndroidManifest.xml"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La7/c;->c()Lm7/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x101021b

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lm7/a;->V(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La7/d;->s:I

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, La7/d;->t:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const v1, 0x101021c

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lm7/a;->W(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, La7/d;->t:Ljava/lang/String;

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, La7/d;->u:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Lm7/a;->X()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La7/d;->u:Ljava/lang/String;

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, La7/c;->i()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-super {p0}, La7/c;->g()Ll7/l;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lt7/a;

    .line 68
    .line 69
    invoke-virtual {v0}, Lt7/a;->d0()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    iget v1, p0, La7/d;->s:I

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lt7/a;->c0()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    iput v1, p0, La7/d;->s:I

    .line 86
    .line 87
    iget-object v2, p0, La7/d;->t:Ljava/lang/String;

    .line 88
    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, p0, La7/d;->t:Ljava/lang/String;

    .line 96
    .line 97
    :cond_4
    iget-object v1, p0, La7/d;->u:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0}, Ll7/l;->Z()Ll7/f;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0}, Ll7/f;->V()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p0, La7/d;->u:Ljava/lang/String;

    .line 112
    .line 113
    :cond_5
    return-void
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, La7/d;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    monitor-exit v0

    .line 6
    return v1

    .line 7
    :catchall_0
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw v1
.end method
