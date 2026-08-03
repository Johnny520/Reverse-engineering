.class public Lz7/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/Set;


# static fields
.field public static final n:[Ljava/lang/Object;

.field public static final o:Lz7/b;


# instance fields
.field public g:[Ljava/lang/Object;

.field public h:Le9/a;

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Lm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lz7/c;->n:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v1, Lz7/b;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lz7/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lz7/c;->o:Lz7/b;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lz7/c;->n:[Ljava/lang/Object;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-array p1, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lz7/c;->i:I

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    array-length v0, p1

    if-nez v0, :cond_0

    .line 19
    sget-object p1, Lz7/c;->n:[Ljava/lang/Object;

    .line 20
    :cond_0
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 21
    array-length p1, p1

    iput p1, p0, Lz7/c;->i:I

    return-void
.end method

.method public static a(I[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p0, :cond_0

    .line 3
    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    aput-object v1, p2, v0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void
.end method

.method public static e(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lz7/c;->n:[Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-array p0, p0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 83
    :cond_0
    iget-boolean v0, p0, Lz7/c;->l:Z

    const/4 v1, 0x1

    .line 84
    iput-boolean v1, p0, Lz7/c;->l:Z

    .line 85
    invoke-virtual {p0, p1, v1}, Lz7/c;->j(II)V

    .line 86
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    aput-object p2, v1, p1

    .line 87
    iget-object p1, p0, Lz7/c;->m:Lm/a;

    if-eqz p1, :cond_1

    .line 88
    check-cast p2, Lk7/a;

    .line 89
    :cond_1
    iput-boolean v0, p0, Lz7/c;->l:Z

    const/4 p1, 0x0

    .line 90
    iput p1, p0, Lz7/c;->k:I

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lz7/c;->l:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iput-boolean v2, p0, Lz7/c;->l:Z

    .line 9
    .line 10
    iget-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v3, v3

    .line 13
    iget v4, p0, Lz7/c;->i:I

    .line 14
    .line 15
    sub-int/2addr v3, v4

    .line 16
    if-lez v3, :cond_1

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_1
    if-nez v4, :cond_2

    .line 20
    .line 21
    :goto_0
    move v3, v2

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    iget v3, p0, Lz7/c;->j:I

    .line 24
    .line 25
    const/16 v5, 0x2000

    .line 26
    .line 27
    if-lt v3, v5, :cond_3

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    if-nez v3, :cond_4

    .line 31
    .line 32
    move v3, v2

    .line 33
    :cond_4
    shl-int/lit8 v6, v3, 0x1

    .line 34
    .line 35
    const/16 v7, 0x20

    .line 36
    .line 37
    if-le v6, v7, :cond_5

    .line 38
    .line 39
    shl-int/lit8 v6, v3, 0x2

    .line 40
    .line 41
    :cond_5
    if-le v6, v7, :cond_6

    .line 42
    .line 43
    const/16 v3, 0x100

    .line 44
    .line 45
    if-ge v6, v3, :cond_6

    .line 46
    .line 47
    shl-int/lit8 v6, v6, 0x1

    .line 48
    .line 49
    :cond_6
    if-le v6, v5, :cond_7

    .line 50
    .line 51
    move v3, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_7
    move v3, v6

    .line 54
    :goto_1
    iput v3, p0, Lz7/c;->j:I

    .line 55
    .line 56
    const/4 v5, 0x4

    .line 57
    if-ge v4, v5, :cond_8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_8
    :goto_2
    invoke-virtual {p0, v3}, Lz7/c;->d(I)V

    .line 61
    .line 62
    .line 63
    :goto_3
    iget v3, p0, Lz7/c;->i:I

    .line 64
    .line 65
    iget-object v4, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 66
    .line 67
    aput-object p1, v4, v3

    .line 68
    .line 69
    add-int/2addr v3, v2

    .line 70
    iput v3, p0, Lz7/c;->i:I

    .line 71
    .line 72
    iput-boolean v1, p0, Lz7/c;->l:Z

    .line 73
    .line 74
    iput v0, p0, Lz7/c;->k:I

    .line 75
    .line 76
    iget-object v0, p0, Lz7/c;->m:Lm/a;

    .line 77
    .line 78
    if-eqz v0, :cond_9

    .line 79
    .line 80
    check-cast p1, Lk7/a;

    .line 81
    .line 82
    :cond_9
    return v2
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 7

    if-nez p2, :cond_0

    goto :goto_1

    .line 78
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 79
    :cond_1
    iget-boolean v1, p0, Lz7/c;->l:Z

    const/4 v2, 0x1

    .line 80
    iput-boolean v2, p0, Lz7/c;->l:Z

    .line 81
    invoke-virtual {p0, p1, v0}, Lz7/c;->j(II)V

    .line 82
    iget-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 83
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v4, p1

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 84
    invoke-virtual {p0, v5}, Lz7/c;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    .line 85
    :cond_3
    aput-object v5, v3, v4

    .line 86
    iget-object v6, p0, Lz7/c;->m:Lm/a;

    if-eqz v6, :cond_4

    .line 87
    check-cast v5, Lk7/a;

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    sub-int p1, v4, p1

    sub-int p1, v0, p1

    .line 88
    invoke-virtual {p0, v4, p1}, Lz7/c;->i(II)V

    .line 89
    iput-boolean v1, p0, Lz7/c;->l:Z

    if-ge p1, v0, :cond_6

    return v2

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p1, v1, v3}, Lz7/c;->a(I[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    array-length p1, v3

    .line 28
    iput-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 29
    .line 30
    iput p1, p0, Lz7/c;->i:I

    .line 31
    .line 32
    iput v0, p0, Lz7/c;->k:I

    .line 33
    .line 34
    return v2

    .line 35
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iput-boolean v2, p0, Lz7/c;->l:Z

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    move v3, v0

    .line 46
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 57
    .line 58
    array-length v5, v5

    .line 59
    iget v6, p0, Lz7/c;->i:I

    .line 60
    .line 61
    sub-int/2addr v5, v6

    .line 62
    if-nez v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lz7/c;->d(I)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {p0, v4}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    move v3, v2

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iput-boolean v0, p0, Lz7/c;->l:Z

    .line 76
    .line 77
    return v3
.end method

.method public final b()Ljava/util/Iterator;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lz7/c;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/Object;

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    array-length v2, v1

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v2, :cond_3

    .line 27
    .line 28
    aget-object v4, v1, v3

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    new-instance v2, Lz7/d;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v2, v1, v0, v3}, Lz7/d;-><init>([Ljava/lang/Object;ILjava/util/function/Predicate;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    sget-object v0, Lz7/h;->g:Lz7/h;

    .line 43
    .line 44
    return-object v0
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    return v1
.end method

.method public clear()V
    .locals 5

    .line 1
    iget v0, p0, Lz7/c;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lz7/c;->i:I

    .line 5
    .line 6
    iget-object v2, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v3, Lz7/c;->n:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 11
    .line 12
    iput v1, p0, Lz7/c;->j:I

    .line 13
    .line 14
    iput-boolean v1, p0, Lz7/c;->l:Z

    .line 15
    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-ge v3, v0, :cond_0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object v4, v2, v3

    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput v1, p0, Lz7/c;->k:I

    .line 26
    .line 27
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v0}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ltz p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return v0

    .line 19
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Lz7/c;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    xor-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    return p1
.end method

.method public d(I)V
    .locals 3

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iget v1, p0, Lz7/c;->i:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    sub-int/2addr p1, v0

    .line 11
    if-gtz p1, :cond_1

    .line 12
    .line 13
    :goto_0
    return-void

    .line 14
    :cond_1
    add-int/2addr p1, v1

    .line 15
    invoke-static {p1}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    invoke-static {v1, v0, p1}, Lz7/c;->a(I[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_3
    :goto_1
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 34
    .line 35
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    check-cast p1, Lz7/c;

    .line 19
    .line 20
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1}, Lz7/c;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ne v1, v2, :cond_5

    .line 29
    .line 30
    invoke-virtual {p0}, Lz7/c;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p1}, Lz7/c;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v2, v0

    .line 42
    :goto_0
    if-ge v2, v1, :cond_4

    .line 43
    .line 44
    iget-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 45
    .line 46
    aget-object v3, v3, v2

    .line 47
    .line 48
    iget-object v4, p1, Lz7/c;->g:[Ljava/lang/Object;

    .line 49
    .line 50
    aget-object v4, v4, v2

    .line 51
    .line 52
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 63
    return p1

    .line 64
    :cond_5
    :goto_2
    return v0
.end method

.method public final f(Ljava/lang/Object;ZI)I
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_4

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-gez p3, :cond_1

    .line 6
    .line 7
    move p3, v0

    .line 8
    :cond_1
    iget v1, p0, Lz7/c;->i:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_2
    iget-object v2, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    move v3, p3

    .line 16
    :goto_0
    if-ge v3, v1, :cond_5

    .line 17
    .line 18
    aget-object v4, v2, v3

    .line 19
    .line 20
    if-nez v4, :cond_3

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_3
    if-ne p1, v4, :cond_4

    .line 24
    .line 25
    return v3

    .line 26
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_5
    if-eqz p2, :cond_6

    .line 30
    .line 31
    goto :goto_4

    .line 32
    :cond_6
    :goto_2
    if-ge p3, v1, :cond_a

    .line 33
    .line 34
    aget-object p2, v2, p3

    .line 35
    .line 36
    if-nez p2, :cond_7

    .line 37
    .line 38
    move p2, v0

    .line 39
    goto :goto_3

    .line 40
    :cond_7
    if-ne p1, p2, :cond_8

    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    goto :goto_3

    .line 44
    :cond_8
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    :goto_3
    if-eqz p2, :cond_9

    .line 49
    .line 50
    return p3

    .line 51
    :cond_9
    add-int/lit8 p3, p3, 0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_a
    :goto_4
    const/4 p1, -0x1

    .line 55
    return p1
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz7/c;->m:Lm/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lk7/a;

    .line 6
    .line 7
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lo7/b;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v1, p1, Lk7/a;->h:Lk7/a;

    .line 14
    .line 15
    if-ne v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lo7/b;->W(Lk7/a;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0}, Lk7/a;->J(Lk7/a;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public h(IZ)V
    .locals 6

    .line 1
    iget v0, p0, Lz7/c;->i:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ge p1, v0, :cond_3

    .line 9
    .line 10
    if-eqz p2, :cond_2

    .line 11
    .line 12
    iget-boolean p2, p0, Lz7/c;->l:Z

    .line 13
    .line 14
    iput-boolean v2, p0, Lz7/c;->l:Z

    .line 15
    .line 16
    sub-int/2addr v0, v2

    .line 17
    sub-int/2addr p1, v2

    .line 18
    iget-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 19
    .line 20
    :goto_0
    if-le v0, p1, :cond_1

    .line 21
    .line 22
    aget-object v4, v3, v0

    .line 23
    .line 24
    iget v5, p0, Lz7/c;->i:I

    .line 25
    .line 26
    sub-int/2addr v5, v2

    .line 27
    iput v5, p0, Lz7/c;->i:I

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aput-object v5, v3, v0

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Lz7/c;->g(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iput-boolean p2, p0, Lz7/c;->l:Z

    .line 39
    .line 40
    iput v1, p0, Lz7/c;->k:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iput p1, p0, Lz7/c;->i:I

    .line 44
    .line 45
    iput v1, p0, Lz7/c;->k:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget-boolean p2, p0, Lz7/c;->l:Z

    .line 49
    .line 50
    iput-boolean v2, p0, Lz7/c;->l:Z

    .line 51
    .line 52
    sub-int v2, p1, v0

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Lz7/c;->d(I)V

    .line 55
    .line 56
    .line 57
    iput p1, p0, Lz7/c;->i:I

    .line 58
    .line 59
    iget-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v3, p0, Lz7/c;->h:Le9/a;

    .line 62
    .line 63
    if-nez v3, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    add-int/2addr v2, v0

    .line 67
    :goto_1
    if-ge v0, v2, :cond_6

    .line 68
    .line 69
    iget-object v4, v3, Le9/a;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Lo7/b;

    .line 72
    .line 73
    iget-object v5, v3, Le9/a;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Lk7/f;

    .line 76
    .line 77
    invoke-interface {v5}, Lk7/d;->n()Lk7/a;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-nez v5, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {v5, v0}, Lk7/a;->H(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v4}, Lk7/a;->J(Lk7/a;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    aput-object v5, p1, v0

    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    :goto_3
    iput-boolean p2, p0, Lz7/c;->l:Z

    .line 96
    .line 97
    iput v1, p0, Lz7/c;->k:I

    .line 98
    .line 99
    return-void
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lz7/c;->k:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_1
    iget-object v2, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    move v4, v1

    .line 18
    :goto_0
    if-ge v4, v0, :cond_3

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-nez v5, :cond_2

    .line 23
    .line 24
    move v5, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    :goto_1
    mul-int/lit8 v3, v3, 0x1f

    .line 31
    .line 32
    add-int/2addr v3, v5

    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iput v3, p0, Lz7/c;->k:I

    .line 37
    .line 38
    move v1, v3

    .line 39
    :goto_2
    iput v1, p0, Lz7/c;->k:I

    .line 40
    .line 41
    return v1
.end method

.method public final i(II)V
    .locals 5

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    if-gez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-boolean v0, p0, Lz7/c;->l:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lz7/c;->l:Z

    .line 10
    .line 11
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v2, p0, Lz7/c;->i:I

    .line 14
    .line 15
    sub-int v3, v2, p2

    .line 16
    .line 17
    :goto_0
    if-ge p1, v3, :cond_1

    .line 18
    .line 19
    add-int v4, p1, p2

    .line 20
    .line 21
    aget-object v4, v1, v4

    .line 22
    .line 23
    aput-object v4, v1, p1

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p1, v3

    .line 29
    :goto_1
    if-ge p1, v2, :cond_2

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    aput-object p2, v1, p1

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iput v3, p0, Lz7/c;->i:I

    .line 38
    .line 39
    iput-boolean v0, p0, Lz7/c;->l:Z

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput p1, p0, Lz7/c;->k:I

    .line 43
    .line 44
    :cond_3
    :goto_2
    return-void
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lz7/h;->g:Lz7/h;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lz7/e;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lz7/e;-><init>(Lz7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final j(II)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lz7/c;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lz7/c;->l:Z

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lz7/c;->d(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 10
    .line 11
    iget v2, p0, Lz7/c;->i:I

    .line 12
    .line 13
    add-int/lit8 v3, v2, -0x1

    .line 14
    .line 15
    :goto_0
    if-lt v3, p1, :cond_0

    .line 16
    .line 17
    add-int v4, v3, p2

    .line 18
    .line 19
    aget-object v5, v1, v3

    .line 20
    .line 21
    aput-object v5, v1, v4

    .line 22
    .line 23
    add-int/lit8 v3, v3, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    add-int/2addr v2, p2

    .line 27
    iput v2, p0, Lz7/c;->i:I

    .line 28
    .line 29
    add-int/2addr p2, p1

    .line 30
    :goto_1
    if-ge p1, p2, :cond_1

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aput-object v2, v1, p1

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iput-boolean v0, p0, Lz7/c;->l:Z

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iput p1, p0, Lz7/c;->k:I

    .line 42
    .line 43
    return-void
.end method

.method public final k(Lz7/t;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lz7/c;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x2

    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance v2, Lz7/a;

    .line 16
    .line 17
    iget-object v3, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {v2, v3, v0, p1}, Lz7/a;-><init>([Ljava/lang/Object;ILz7/t;)V

    .line 20
    .line 21
    .line 22
    iput-boolean v1, v2, Lj8/f;->a:Z

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    sub-int/2addr v0, p1

    .line 26
    invoke-virtual {v2, v1, v0}, Lj8/f;->u(II)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, v2, Lj8/f;->a:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput v1, p0, Lz7/c;->k:I

    .line 34
    .line 35
    return p1

    .line 36
    :cond_2
    :goto_0
    return v1
.end method

.method public final l(II)Lz7/c;
    .locals 3

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {p2}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 20
    .line 21
    :goto_0
    if-ge p1, v0, :cond_2

    .line 22
    .line 23
    aget-object v2, v1, p1

    .line 24
    .line 25
    aput-object v2, p2, p1

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    new-instance p1, Lz7/c;

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lz7/c;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, p0, Lz7/c;->i:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_3

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    if-nez v4, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    move v0, v3

    .line 24
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    return v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 3

    .line 29
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    .line 30
    sget-object v0, Lz7/n;->j:Lz7/n;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lz7/n;

    sget-object v2, Lz7/i;->g:Lz7/i;

    .line 32
    invoke-direct {v0, v1, v2}, Lz7/n;-><init>(ILjava/util/List;)V

    .line 33
    sput-object v0, Lz7/n;->j:Lz7/n;

    :cond_0
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Lz7/n;

    invoke-direct {v0, v1, p0}, Lz7/n;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p1

    .line 6
    if-gtz v0, :cond_1

    .line 7
    .line 8
    sget-object p1, Lz7/n;->j:Lz7/n;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    new-instance p1, Lz7/n;

    .line 13
    .line 14
    sget-object v0, Lz7/i;->g:Lz7/i;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v1, v0}, Lz7/n;-><init>(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    sput-object p1, Lz7/n;->j:Lz7/n;

    .line 21
    .line 22
    :cond_0
    return-object p1

    .line 23
    :cond_1
    new-instance v0, Lz7/n;

    .line 24
    .line 25
    invoke-direct {v0, p1, p0}, Lz7/n;-><init>(ILjava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public m()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lz7/c;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    iget v2, p0, Lz7/c;->i:I

    .line 9
    .line 10
    sub-int/2addr v1, v2

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    array-length v1, v0

    .line 15
    if-lt v2, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    if-nez v2, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v0}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-static {v2}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v2, v0, v1}, Lz7/c;->a(I[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    iput-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 35
    .line 36
    iget v0, p0, Lz7/c;->i:I

    .line 37
    .line 38
    div-int/lit8 v0, v0, 0x4

    .line 39
    .line 40
    iput v0, p0, Lz7/c;->j:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    :goto_1
    iget v0, p0, Lz7/c;->j:I

    .line 44
    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    div-int/lit8 v0, v0, 0x3

    .line 52
    .line 53
    iput v0, p0, Lz7/c;->j:I

    .line 54
    .line 55
    :cond_4
    return-void
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 2

    .line 25
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    aget-object v0, v0, p1

    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, p1, v1}, Lz7/c;->i(II)V

    .line 27
    invoke-virtual {p0, v0}, Lz7/c;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 11
    .line 12
    aget-object v1, v1, p1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lz7/c;->k:I

    .line 18
    .line 19
    move-object p1, v1

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    return v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget v2, p0, Lz7/c;->i:I

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v1

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_4

    .line 15
    .line 16
    aget-object v5, v0, v3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v7, :cond_3

    .line 27
    .line 28
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-ne v5, v7, :cond_2

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    aput-object v6, v0, v3

    .line 36
    .line 37
    invoke-virtual {p0, v5}, Lz7/c;->g(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    if-nez v4, :cond_5

    .line 46
    .line 47
    :goto_1
    return v1

    .line 48
    :cond_5
    iget-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 49
    .line 50
    if-ne p1, v0, :cond_9

    .line 51
    .line 52
    iget p1, p0, Lz7/c;->i:I

    .line 53
    .line 54
    sub-int/2addr p1, v4

    .line 55
    iput p1, p0, Lz7/c;->i:I

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-nez p1, :cond_6

    .line 59
    .line 60
    sget-object p1, Lz7/c;->n:[Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 63
    .line 64
    return v3

    .line 65
    :cond_6
    invoke-static {p1}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    move v4, v1

    .line 70
    :goto_2
    if-ge v1, v2, :cond_8

    .line 71
    .line 72
    aget-object v5, v0, v1

    .line 73
    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_7
    aput-object v5, p1, v4

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_8
    iput v4, p0, Lz7/c;->i:I

    .line 85
    .line 86
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 87
    .line 88
    return v3

    .line 89
    :cond_9
    new-instance p1, Ljava/util/ConcurrentModificationException;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget v2, p0, Lz7/c;->i:I

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v1

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_3

    .line 15
    .line 16
    aget-object v5, v0, v3

    .line 17
    .line 18
    invoke-interface {p1, v5}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_2

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    aput-object v6, v0, v3

    .line 26
    .line 27
    invoke-virtual {p0, v5}, Lz7/c;->g(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    if-nez v4, :cond_4

    .line 36
    .line 37
    :goto_1
    return v1

    .line 38
    :cond_4
    iget-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 39
    .line 40
    if-ne p1, v0, :cond_8

    .line 41
    .line 42
    iget p1, p0, Lz7/c;->i:I

    .line 43
    .line 44
    sub-int/2addr p1, v4

    .line 45
    iput p1, p0, Lz7/c;->i:I

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    if-nez p1, :cond_5

    .line 49
    .line 50
    sget-object p1, Lz7/c;->n:[Ljava/lang/Object;

    .line 51
    .line 52
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 53
    .line 54
    return v3

    .line 55
    :cond_5
    invoke-static {p1}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    move v4, v1

    .line 60
    :goto_2
    if-ge v1, v2, :cond_7

    .line 61
    .line 62
    aget-object v5, v0, v1

    .line 63
    .line 64
    if-nez v5, :cond_6

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_6
    aput-object v5, p1, v4

    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    iput v4, p0, Lz7/c;->i:I

    .line 75
    .line 76
    iput-object p1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 77
    .line 78
    return v3

    .line 79
    :cond_8
    new-instance p1, Ljava/util/ConcurrentModificationException;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v0, "Method not implemented"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    if-gez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 7
    .line 8
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-le v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0, v2}, Lz7/c;->h(IZ)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v1, v0, p1

    .line 21
    .line 22
    aput-object p2, v0, p1

    .line 23
    .line 24
    if-eq p2, v1, :cond_2

    .line 25
    .line 26
    iput v2, p0, Lz7/c;->k:I

    .line 27
    .line 28
    :cond_2
    return-object v1

    .line 29
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lz7/c;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public sort(Ljava/util/Comparator;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lz7/c;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    new-instance v1, Lj8/f;

    .line 15
    .line 16
    iget-object v2, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v1, v2, v0, p1}, Lj8/f;-><init>([Ljava/lang/Object;ILjava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-boolean p1, v1, Lj8/f;->a:Z

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, Lj8/f;->u(II)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, v1, Lj8/f;->a:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput p1, p0, Lz7/c;->k:I

    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void
.end method

.method public final spliterator()Ljava/util/Spliterator;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string v1, "Not implemented"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz7/c;->l(II)Lz7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    array-length v2, v0

    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {v1}, Lz7/c;->e(I)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v0, v2}, Lz7/c;->a(I[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v2

    .line 27
    :goto_0
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, [Ljava/lang/Object;

    .line 36
    .line 37
    :cond_2
    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 38
    invoke-virtual {p0}, Lz7/c;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 39
    :cond_0
    iget-object v1, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 40
    array-length v2, p1

    if-eqz v2, :cond_1

    if-gt v2, v0, :cond_1

    .line 41
    invoke-static {v2, v1, p1}, Lz7/c;->a(I[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object p1

    .line 42
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v1, v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "EMPTY"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lz7/c;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "{"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iget-object v2, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v1, v2, v1

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "}"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
