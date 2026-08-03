.class public final Ln5/a;
.super La/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:I

.field public final l:I

.field public m:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Ln5/a;->m:I

    .line 6
    .line 7
    iput-object p1, p0, Ln5/a;->j:Lk5/u;

    .line 8
    .line 9
    iput p2, p0, Ln5/a;->k:I

    .line 10
    .line 11
    iget-object p1, p1, Lk5/u;->x:Lk5/p;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lk5/p;->b(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ln5/a;->l:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Ln5/a;->k:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ln5/a;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v1, Lk5/u;->x:Lk5/p;

    .line 8
    .line 9
    invoke-virtual {v1}, Lk5/p;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, Lv5/a;

    .line 17
    .line 18
    const-string v2, "callsite@"

    .line 19
    .line 20
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v1, v0}, Lv5/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method

.method public final e1()Lo5/m;
    .locals 3

    .line 1
    iget v0, p0, Ln5/a;->m:I

    .line 2
    .line 3
    iget-object v1, p0, Ln5/a;->j:Lk5/u;

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v2, p0, Ln5/a;->l:I

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Ln5/a;->m:I

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Ln5/a;->m:I

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lo5/m;->a:Lo5/k;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    new-instance v2, Lo5/l;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lo5/l;-><init>(Lk5/u;I)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p1, Ln5/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ln5/a;

    .line 8
    .line 9
    invoke-virtual {p0}, Ln5/a;->g1()Ln5/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ln5/a;->g1()Ln5/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ln5/c;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ln5/a;->h1()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Ln5/a;->h1()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Ln5/a;->i1()Ln5/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1}, Ln5/a;->i1()Ln5/d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ln5/d;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ln5/a;->f1()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1}, Ln5/a;->f1()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    return p1

    .line 67
    :cond_0
    const/4 p1, 0x0

    .line 68
    return p1
.end method

.method public final f1()Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln5/a;->e1()Lo5/m;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lo5/m;->a()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x3

    .line 15
    if-lt v2, v3, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1}, Lo5/m;->a()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v1}, Lo5/m;->d()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lo5/m;->d()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lo5/m;->d()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lo5/m;->b()Lw5/a;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lo5/m;->b()Lw5/a;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    return-object v0

    .line 48
    :cond_2
    new-instance v0, Ld6/f;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    new-array v1, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const-string v3, "Invalid call site item: must contain at least 3 entries."

    .line 55
    .line 56
    invoke-direct {v0, v2, v3, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final g1()Ln5/c;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln5/a;->e1()Lo5/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo5/m;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ln5/a;->e1()Lo5/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lo5/m;->b()Lw5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lw5/a;->h()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v3, 0x16

    .line 26
    .line 27
    if-ne v1, v3, :cond_0

    .line 28
    .line 29
    check-cast v0, Lp5/f;

    .line 30
    .line 31
    invoke-virtual {v0}, Lp5/f;->a()Ln5/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_0
    new-instance v1, Ld6/f;

    .line 37
    .line 38
    invoke-interface {v0}, Lw5/a;->h()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v3, p0, Ln5/a;->k:I

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v3, "Invalid encoded value type (%d) for the first item in call site %d"

    .line 57
    .line 58
    invoke-direct {v1, v2, v3, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_1
    new-instance v0, Ld6/f;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v3, "Invalid call site item: must contain at least 3 entries."

    .line 68
    .line 69
    invoke-direct {v0, v2, v3, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ln5/a;->k:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "call_site_%d"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final h1()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln5/a;->e1()Lo5/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo5/m;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lo5/m;->d()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lo5/m;->b()Lw5/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lw5/a;->h()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/16 v2, 0x17

    .line 25
    .line 26
    if-ne v1, v2, :cond_0

    .line 27
    .line 28
    check-cast v0, Lp5/h;

    .line 29
    .line 30
    invoke-virtual {v0}, Lp5/h;->a()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_0
    new-instance v1, Ld6/f;

    .line 36
    .line 37
    invoke-interface {v0}, Lw5/a;->h()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v2, p0, Ln5/a;->k:I

    .line 46
    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v2, "Invalid encoded value type (%d) for the second item in call site %d"

    .line 56
    .line 57
    invoke-direct {v1, v3, v2, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_1
    new-instance v0, Ld6/f;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    .line 65
    .line 66
    const-string v2, "Invalid call site item: must contain at least 3 entries."

    .line 67
    .line 68
    invoke-direct {v0, v3, v2, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln5/a;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    invoke-virtual {p0}, Ln5/a;->g1()Ln5/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ln5/c;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    invoke-virtual {p0}, Ln5/a;->h1()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v1

    .line 31
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    invoke-virtual {p0}, Ln5/a;->i1()Ln5/d;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ln5/d;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    mul-int/lit8 v1, v1, 0x1f

    .line 43
    .line 44
    invoke-virtual {p0}, Ln5/a;->f1()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v1

    .line 53
    return v0
.end method

.method public final i1()Ln5/d;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln5/a;->e1()Lo5/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo5/m;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lo5/m;->d()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lo5/m;->d()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lo5/m;->b()Lw5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lw5/a;->h()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/16 v2, 0x15

    .line 28
    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    check-cast v0, Lp5/g;

    .line 32
    .line 33
    invoke-virtual {v0}, Lp5/g;->a()Ln5/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    new-instance v1, Ld6/f;

    .line 39
    .line 40
    invoke-interface {v0}, Lw5/a;->h()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget v2, p0, Ln5/a;->k:I

    .line 49
    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v2, "Invalid encoded value type (%d) for the second item in call site %d"

    .line 59
    .line 60
    invoke-direct {v1, v3, v2, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_1
    new-instance v0, Ld6/f;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    const-string v2, "Invalid call site item: must contain at least 3 entries."

    .line 70
    .line 71
    invoke-direct {v0, v3, v2, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lq5/a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lq5/a;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lq5/a;->c(Ln5/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :catch_0
    const-string v0, "Unexpected IOException"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method
