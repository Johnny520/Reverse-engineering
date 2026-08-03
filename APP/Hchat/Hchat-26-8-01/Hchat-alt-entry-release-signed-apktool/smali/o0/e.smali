.class public final Lo0/e;
.super Lo0/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:[Ljava/lang/Object;

.field public final h:[Ljava/lang/Object;

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lo0/e;->i:I

    .line 9
    .line 10
    iput p4, p0, Lo0/e;->j:I

    .line 11
    .line 12
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 p3, 0x20

    .line 17
    .line 18
    if-le p1, p3, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-nez p1, :cond_1

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p3, "Trie-based persistent vector should have at least 33 elements, got "

    .line 28
    .line 29
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Li0/n1;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 50
    .line 51
    .line 52
    array-length p1, p2

    .line 53
    return-void
.end method

.method public static i([Ljava/lang/Object;IILjava/lang/Object;Lh3/f;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p2, p1}, Lg4/a;->x(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-array p1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    add-int/lit8 p2, v0, 0x1

    .line 19
    .line 20
    const/16 v1, 0x1f

    .line 21
    .line 22
    invoke-static {p2, v0, p0, v1, p1}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    aget-object p0, p0, v1

    .line 26
    .line 27
    iput-object p0, p4, Lh3/f;->a:Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p3, p1, v0

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    add-int/lit8 p1, p1, -0x5

    .line 37
    .line 38
    aget-object v3, p0, v0

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v3, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v3, p1, p2, p3, p4}, Lo0/e;->i([Ljava/lang/Object;IILjava/lang/Object;Lh3/f;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    aput-object p2, v2, v0

    .line 50
    .line 51
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    if-ge v0, v1, :cond_2

    .line 54
    .line 55
    aget-object p2, v2, v0

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    aget-object p2, p0, v0

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast p2, [Ljava/lang/Object;

    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    iget-object v3, p4, Lh3/f;->a:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p2, p1, p3, v3, p4}, Lo0/e;->i([Ljava/lang/Object;IILjava/lang/Object;Lh3/f;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    aput-object p2, v2, v0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    return-object v2
.end method

.method public static k([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p2, p1}, Lg4/a;->x(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x5

    .line 7
    if-ne p1, v2, :cond_0

    .line 8
    .line 9
    aget-object p1, p0, v0

    .line 10
    .line 11
    iput-object p1, p3, Lh3/f;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget-object v3, p0, v0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v3, [Ljava/lang/Object;

    .line 21
    .line 22
    sub-int/2addr p1, v2

    .line 23
    invoke-static {v3, p1, p2, p3}, Lo0/e;->k([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    if-nez p1, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/16 p2, 0x20

    .line 33
    .line 34
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    aput-object p1, p0, v0

    .line 39
    .line 40
    return-object p0
.end method

.method public static q(IILjava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1, p0}, Lg4/a;->x(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    aput-object p2, p3, v0

    .line 14
    .line 15
    return-object p3

    .line 16
    :cond_0
    aget-object v1, p3, v0

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v1, [Ljava/lang/Object;

    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x5

    .line 24
    .line 25
    invoke-static {p0, p1, p2, v1}, Lo0/e;->q(IILjava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    aput-object p0, p3, v0

    .line 30
    .line 31
    return-object p3
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)Lo0/c;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lbe/h;->n(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lo0/e;->c(Ljava/lang/Object;)Lo0/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 24
    .line 25
    if-lt p1, v0, :cond_1

    .line 26
    .line 27
    sub-int/2addr p1, v0

    .line 28
    invoke-virtual {p0, p2, p1, v1}, Lo0/e;->j(Ljava/lang/Object;I[Ljava/lang/Object;)Lo0/e;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance v0, Lh3/f;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v0, v2}, Lh3/f;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget v2, p0, Lo0/e;->j:I

    .line 40
    .line 41
    invoke-static {v1, v2, p1, p2, v0}, Lo0/e;->i([Ljava/lang/Object;IILjava/lang/Object;Lh3/f;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 p2, 0x0

    .line 46
    iget-object v0, v0, Lh3/f;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {p0, v0, p2, p1}, Lo0/e;->j(Ljava/lang/Object;I[Ljava/lang/Object;)Lo0/e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Lo0/c;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget-object v1, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v2, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    if-ge v0, v3, :cond_0

    .line 17
    .line 18
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    aput-object p1, v2, v0

    .line 23
    .line 24
    new-instance p1, Lo0/e;

    .line 25
    .line 26
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    iget v3, p0, Lo0/e;->j:I

    .line 33
    .line 34
    invoke-direct {p1, v1, v2, v0, v3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    aput-object p1, v0, v3

    .line 42
    .line 43
    invoke-virtual {p0, v1, v2, v0}, Lo0/e;->l([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lo0/e;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final e()Lo0/f;
    .locals 4

    .line 1
    new-instance v0, Lo0/f;

    .line 2
    .line 3
    iget-object v1, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lo0/e;->j:I

    .line 6
    .line 7
    iget-object v3, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, p0, v3, v1, v2}, Lo0/f;-><init>(Lo0/c;[Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final f(Lo0/b;)Lo0/c;
    .locals 4

    .line 1
    new-instance v0, Lo0/f;

    .line 2
    .line 3
    iget-object v1, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lo0/e;->j:I

    .line 6
    .line 7
    iget-object v3, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, p0, v3, v1, v2}, Lo0/f;-><init>(Lo0/c;[Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lo0/f;->z(Lfg/l;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lo0/f;->d()Lo0/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final g(I)Lo0/c;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lbe/h;->m(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lo0/e;->j:I

    .line 13
    .line 14
    iget-object v2, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    if-lt p1, v0, :cond_0

    .line 17
    .line 18
    sub-int/2addr p1, v0

    .line 19
    invoke-virtual {p0, v2, v0, v1, p1}, Lo0/e;->o([Ljava/lang/Object;III)Lo0/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v3, Lh3/f;

    .line 25
    .line 26
    iget-object v4, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aget-object v4, v4, v5

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lh3/f;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2, v1, p1, v3}, Lo0/e;->n([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v0, v1, v5}, Lo0/e;->o([Ljava/lang/Object;III)Lo0/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lbe/h;->m(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gt v0, p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v0, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 18
    .line 19
    iget v1, p0, Lo0/e;->j:I

    .line 20
    .line 21
    :goto_0
    if-lez v1, :cond_1

    .line 22
    .line 23
    invoke-static {p1, v1}, Lg4/a;->x(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v0, [Ljava/lang/Object;

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :goto_1
    and-int/lit8 p1, p1, 0x1f

    .line 38
    .line 39
    aget-object p1, v0, p1

    .line 40
    .line 41
    return-object p1
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lo0/e;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(ILjava/lang/Object;)Lo0/c;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lbe/h;->m(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 15
    .line 16
    iget v3, p0, Lo0/e;->j:I

    .line 17
    .line 18
    if-gt v0, p1, :cond_0

    .line 19
    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    and-int/lit8 p1, p1, 0x1f

    .line 27
    .line 28
    aput-object p2, v0, p1

    .line 29
    .line 30
    new-instance p1, Lo0/e;

    .line 31
    .line 32
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-direct {p1, v1, v0, p2, v3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    invoke-static {v3, p1, p2, v1}, Lo0/e;->q(IILjava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance p2, Lo0/e;

    .line 45
    .line 46
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-direct {p2, p1, v2, v0, v3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    return-object p2
.end method

.method public final j(Ljava/lang/Object;I[Ljava/lang/Object;)Lo0/e;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget-object v1, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-ge v0, v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v2, p2, 0x1

    .line 21
    .line 22
    invoke-static {v2, p2, v1, v0, v3}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    aput-object p1, v3, p2

    .line 26
    .line 27
    new-instance p1, Lo0/e;

    .line 28
    .line 29
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    add-int/lit8 p2, p2, 0x1

    .line 34
    .line 35
    iget v0, p0, Lo0/e;->j:I

    .line 36
    .line 37
    invoke-direct {p1, p3, v3, p2, v0}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    const/16 v4, 0x1f

    .line 42
    .line 43
    aget-object v4, v1, v4

    .line 44
    .line 45
    add-int/lit8 v5, p2, 0x1

    .line 46
    .line 47
    add-int/lit8 v0, v0, -0x1

    .line 48
    .line 49
    invoke-static {v5, p2, v1, v0, v3}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    aput-object p1, v3, p2

    .line 53
    .line 54
    new-array p1, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    aput-object v4, p1, p2

    .line 58
    .line 59
    invoke-virtual {p0, p3, v3, p1}, Lo0/e;->l([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lo0/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method

.method public final l([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lo0/e;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x5

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iget v2, p0, Lo0/e;->j:I

    .line 9
    .line 10
    shl-int v3, v1, v2

    .line 11
    .line 12
    if-le v0, v3, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    new-array v0, v0, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object p1, v0, v3

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x5

    .line 22
    .line 23
    invoke-virtual {p0, v2, v0, p2}, Lo0/e;->m(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Lo0/e;

    .line 28
    .line 29
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v0, v1

    .line 34
    invoke-direct {p2, p1, p3, v0, v2}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_0
    invoke-virtual {p0, v2, p1, p2}, Lo0/e;->m(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, Lo0/e;

    .line 43
    .line 44
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v1

    .line 49
    invoke-direct {p2, p1, p3, v0, v2}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    return-object p2
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lbe/h;->n(II)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lo0/g;

    .line 9
    .line 10
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    iget v0, p0, Lo0/e;->j:I

    .line 15
    .line 16
    div-int/lit8 v0, v0, 0x5

    .line 17
    .line 18
    add-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    iget-object v4, p0, Lo0/e;->g:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v6, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 23
    .line 24
    move v2, p1

    .line 25
    invoke-direct/range {v1 .. v6}, Lo0/g;-><init>(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public final m(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-static {v0, p1}, Lg4/a;->x(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-array p2, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    :goto_0
    const/4 v1, 0x5

    .line 23
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    aput-object p3, p2, v0

    .line 26
    .line 27
    return-object p2

    .line 28
    :cond_1
    aget-object v2, p2, v0

    .line 29
    .line 30
    check-cast v2, [Ljava/lang/Object;

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    invoke-virtual {p0, p1, v2, p3}, Lo0/e;->m(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    aput-object p1, p2, v0

    .line 38
    .line 39
    return-object p2
.end method

.method public final n([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p3, p2}, Lg4/a;->x(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-array p2, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    add-int/lit8 p3, v0, 0x1

    .line 21
    .line 22
    invoke-static {v0, p3, p1, v2, p2}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p3, p4, Lh3/f;->a:Ljava/lang/Object;

    .line 26
    .line 27
    aput-object p3, p2, v1

    .line 28
    .line 29
    aget-object p1, p1, v0

    .line 30
    .line 31
    iput-object p1, p4, Lh3/f;->a:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_1
    aget-object v3, p1, v1

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lo0/e;->p()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 v1, v1, -0x1

    .line 43
    .line 44
    invoke-static {v1, p2}, Lg4/a;->x(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    :cond_2
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    add-int/lit8 p2, p2, -0x5

    .line 53
    .line 54
    add-int/lit8 v2, v0, 0x1

    .line 55
    .line 56
    if-gt v2, v1, :cond_3

    .line 57
    .line 58
    :goto_1
    aget-object v3, p1, v1

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v3, [Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-virtual {p0, v3, p2, v4, p4}, Lo0/e;->n([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    aput-object v3, p1, v1

    .line 71
    .line 72
    if-eq v1, v2, :cond_3

    .line 73
    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    aget-object v1, p1, v0

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast v1, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {p0, v1, p2, p3, p4}, Lo0/e;->n([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    aput-object p2, p1, v0

    .line 89
    .line 90
    return-object p1
.end method

.method public final o([Ljava/lang/Object;III)Lo0/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v0, v3, :cond_3

    .line 11
    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    array-length p2, p1

    .line 15
    const/16 p3, 0x21

    .line 16
    .line 17
    if-ne p2, p3, :cond_0

    .line 18
    .line 19
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    new-instance p2, Lo0/i;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_1
    new-instance p4, Lh3/f;

    .line 30
    .line 31
    invoke-direct {p4, v1}, Lh3/f;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v0, p2, -0x1

    .line 35
    .line 36
    invoke-static {p1, p3, v0, p4}, Lo0/e;->k([Ljava/lang/Object;IILh3/f;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p4, p4, Lh3/f;->a:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p4, [Ljava/lang/Object;

    .line 49
    .line 50
    aget-object v0, p1, v3

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    aget-object p1, p1, v0

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p1, [Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v0, Lo0/e;

    .line 63
    .line 64
    add-int/lit8 p3, p3, -0x5

    .line 65
    .line 66
    invoke-direct {v0, p1, p4, p2, p3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    new-instance v0, Lo0/e;

    .line 71
    .line 72
    invoke-direct {v0, p1, p4, p2, p3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    iget-object v4, p0, Lo0/e;->h:[Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    add-int/lit8 v5, v0, -0x1

    .line 83
    .line 84
    if-ge p4, v5, :cond_4

    .line 85
    .line 86
    add-int/lit8 v6, p4, 0x1

    .line 87
    .line 88
    invoke-static {p4, v6, v4, v0, v2}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    aput-object v1, v2, v5

    .line 92
    .line 93
    new-instance p4, Lo0/e;

    .line 94
    .line 95
    add-int/2addr p2, v0

    .line 96
    sub-int/2addr p2, v3

    .line 97
    invoke-direct {p4, p1, v2, p2, p3}, Lo0/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    .line 98
    .line 99
    .line 100
    return-object p4
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ltf/a;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x20

    .line 8
    .line 9
    return v0
.end method
