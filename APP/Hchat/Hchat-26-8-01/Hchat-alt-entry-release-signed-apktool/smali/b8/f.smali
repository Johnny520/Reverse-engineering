.class public final Lb8/f;
.super Lb8/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lb8/b;


# static fields
.field public static final n:Lz7/b;

.field public static final o:Lz7/b;


# instance fields
.field public k:Lz7/c;

.field public l:Ljava/lang/String;

.field public m:Lz7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz7/c;->o:Lz7/b;

    .line 2
    .line 3
    sput-object v0, Lb8/f;->n:Lz7/b;

    .line 4
    .line 5
    sput-object v0, Lb8/f;->o:Lz7/b;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lb8/k;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lb8/f;->n:Lz7/b;

    .line 5
    .line 6
    iput-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 7
    .line 8
    sget-object v0, Lb8/f;->o:Lz7/b;

    .line 9
    .line 10
    iput-object v0, p0, Lb8/f;->m:Lz7/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    .line 1
    new-instance v0, Lz7/l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz7/l;-><init>(Lz7/s;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {v0}, Lz7/l;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lz7/l;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lb8/j;

    .line 18
    .line 19
    invoke-virtual {v2}, Lb8/j;->a()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1
.end method

.method public final b()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb8/j;->d()Lb8/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lb8/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lae/d;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lz7/p;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Lz7/p;-><init>(Ljava/lang/Object;Lae/d;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v2}, Lz7/p;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2}, Lz7/p;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lb8/j;

    .line 33
    .line 34
    if-ne v1, p0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    instance-of v1, v1, Lb8/f;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return v0
.end method

.method public final e()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb8/f;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lb8/f;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    :cond_0
    return v1
.end method

.method public final f()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb8/j;->d()Lb8/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lb8/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lae/d;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lz7/p;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Lz7/p;-><init>(Ljava/lang/Object;Lae/d;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {v2}, Lz7/p;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lz7/p;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lb8/j;

    .line 33
    .line 34
    if-ne v1, p0, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v1}, Lb8/j;->g()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v0, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    return v0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/f;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-array v3, v0, [Lb8/d;

    .line 14
    .line 15
    move v4, v2

    .line 16
    :goto_0
    if-ge v4, v0, :cond_1

    .line 17
    .line 18
    iget-object v5, p0, Lb8/f;->k:Lz7/c;

    .line 19
    .line 20
    iget-object v5, v5, Lz7/c;->g:[Ljava/lang/Object;

    .line 21
    .line 22
    aget-object v5, v5, v4

    .line 23
    .line 24
    check-cast v5, Lb8/d;

    .line 25
    .line 26
    aput-object v5, v3, v4

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x1

    .line 32
    if-eq v0, v4, :cond_2

    .line 33
    .line 34
    new-instance v5, Lb8/c;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-direct {v5, v6}, Lb8/c;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lj8/f;

    .line 41
    .line 42
    invoke-direct {v6, v3, v0, v5}, Lj8/f;-><init>([Ljava/lang/Object;ILjava/util/Comparator;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v2, v6, Lj8/f;->a:Z

    .line 46
    .line 47
    sub-int/2addr v0, v4

    .line 48
    invoke-virtual {v6, v2, v0}, Lj8/f;->u(II)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_1
    if-nez v3, :cond_3

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v1, v3

    .line 60
    :goto_2
    if-ge v2, v1, :cond_5

    .line 61
    .line 62
    aget-object v4, v3, v2

    .line 63
    .line 64
    iget-object v5, v4, Lb8/d;->h:Ljava/lang/String;

    .line 65
    .line 66
    const-string v6, "raw_style_tag_attribute"

    .line 67
    .line 68
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_4

    .line 73
    .line 74
    const/16 v5, 0x3b

    .line 75
    .line 76
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v5, v4, Lb8/d;->h:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const/16 v5, 0x3d

    .line 85
    .line 86
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {v4}, Lb8/d;->n()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0
.end method

.method public final k(Ljava/io/StringWriter;Z)V
    .locals 4

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb8/f;->l:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v0, 0x3b

    .line 17
    .line 18
    :goto_0
    new-instance v1, Lz7/l;

    .line 19
    .line 20
    new-instance v2, Landroidx/lifecycle/x;

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    invoke-direct {v2, p0, v3}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Lz7/l;-><init>(Lz7/s;)V

    .line 27
    .line 28
    .line 29
    :goto_1
    invoke-virtual {v1}, Lz7/l;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lz7/l;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lb8/d;

    .line 43
    .line 44
    invoke-virtual {v2, p1, p2}, Lb8/d;->k(Ljava/io/StringWriter;Z)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v0, Lz7/l;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lz7/l;-><init>(Lz7/s;)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_2
    invoke-virtual {v0}, Lz7/l;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    const-string v1, ">"

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Lz7/l;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lb8/j;

    .line 72
    .line 73
    invoke-virtual {v1, p1, p2}, Lb8/j;->k(Ljava/io/StringWriter;Z)V

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    if-eqz v1, :cond_4

    .line 79
    .line 80
    const-string p2, "</"

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Lb8/f;->l:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 88
    .line 89
    .line 90
    const/16 p2, 0x3e

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/io/StringWriter;->append(C)Ljava/lang/Appendable;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    const-string p2, " />"

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final l()Lb8/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final n()Lb8/f;
    .locals 1

    .line 1
    new-instance v0, Lb8/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lb8/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lb8/k;->m(Lb8/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final o()Lb8/h;
    .locals 1

    .line 1
    new-instance v0, Lb8/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lb8/h;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lb8/k;->m(Lb8/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final p(Lb8/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 2
    .line 3
    sget-object v1, Lb8/f;->n:Lz7/b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lz7/c;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Lz7/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    if-eq p0, p1, :cond_1

    .line 21
    .line 22
    iput-object p0, p1, Lb8/j;->g:Lb8/j;

    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lb8/f;->k:Lz7/c;

    .line 12
    .line 13
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lb8/f;->k:Lz7/c;

    .line 18
    .line 19
    if-ge v0, v1, :cond_2

    .line 20
    .line 21
    iget-object v1, v2, Lz7/c;->g:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v1, v1, v0

    .line 24
    .line 25
    check-cast v1, Lb8/d;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput-object v2, v1, Lb8/j;->g:Lb8/j;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {v2}, Lz7/c;->clear()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lb8/f;->k:Lz7/c;

    .line 43
    .line 44
    invoke-virtual {v0}, Lz7/c;->m()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final r()Lb8/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lb8/j;->g:Lb8/j;

    .line 2
    .line 3
    instance-of v1, v0, Lb8/f;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lb8/f;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public final s(Ljava/lang/String;)Lb8/i;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    iget-object v1, p0, Lb8/f;->m:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_2

    .line 13
    .line 14
    iget-object v3, p0, Lb8/f;->m:Lz7/c;

    .line 15
    .line 16
    iget-object v3, v3, Lz7/c;->g:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v3, v3, v2

    .line 19
    .line 20
    check-cast v3, Lb8/i;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p0}, Lb8/f;->r()Lb8/f;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lb8/f;->s(Ljava/lang/String;)Lb8/i;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final t(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lb8/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lb8/f;->l:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v1, 0x3a

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    invoke-virtual {p0, v0}, Lb8/f;->s(Ljava/lang/String;)Lb8/i;

    .line 28
    .line 29
    .line 30
    const-string p1, "Namespace not found for prefix: "

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lb8/f;->f()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lb8/f;->e()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "] "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lb8/f;->l:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, Lb8/f;->j()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v1, v2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method

.method public final u(Ljava/lang/Appendable;)V
    .locals 3

    .line 1
    new-instance v0, Lz7/l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz7/l;-><init>(Lz7/s;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lz7/l;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Lz7/l;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lb8/j;

    .line 17
    .line 18
    instance-of v2, v1, Lb8/h;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v1, Lb8/h;

    .line 23
    .line 24
    iget-object v1, v1, Lb8/h;->h:Ljava/lang/String;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, Ljava/io/StringWriter;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v2, v1, Lb8/f;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, Lb8/f;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lb8/f;->u(Ljava/lang/Appendable;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method
