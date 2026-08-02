.class public final Ls72;
.super Lkj0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ld63;


# static fields
.field public static final j:Ls72;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls72;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls72;->j:Ls72;

    .line 8
    .line 9
    return-void
.end method

.method public static h(Lr72;)Ls72;
    .locals 2

    .line 1
    new-instance v0, Ls72;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lkj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1, p0}, Lkj0;->f(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static i(Lr72;Lr72;)Ls72;
    .locals 2

    .line 1
    new-instance v0, Ls72;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lkj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1, p0}, Lkj0;->f(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-virtual {v0, p0, p1}, Lkj0;->f(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public final getType(I)Lo43;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lr72;

    .line 6
    .line 7
    iget-object p0, p0, Lr72;->i:Lw53;

    .line 8
    .line 9
    invoke-interface {p0}, Lw53;->a()Lo43;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final j(ZLjava/util/BitSet;)Ls72;
    .locals 7

    .line 1
    iget-object v0, p0, Lkj0;->i:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v2, Ls72;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    invoke-direct {v2, v0}, Lkj0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    move v3, v0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v1, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lr72;

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p2, v3}, Ljava/util/BitSet;->get(I)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_3

    .line 32
    .line 33
    :goto_1
    iget v6, v5, Lr72;->h:I

    .line 34
    .line 35
    if-ne v6, v4, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget-object v5, v5, Lr72;->i:Lw53;

    .line 39
    .line 40
    invoke-static {v4, v5}, Lr72;->e(ILw53;)Lr72;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_2
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {v5}, Lr72;->d()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int/2addr v4, p1

    .line 51
    :cond_3
    invoke-virtual {v2, v3, v5}, Lkj0;->f(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    move p1, v0

    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iget-boolean p0, p0, Lvj1;->h:Z

    .line 59
    .line 60
    if-nez p0, :cond_5

    .line 61
    .line 62
    iput-boolean v0, v2, Lvj1;->h:Z

    .line 63
    .line 64
    :cond_5
    return-object v2
.end method

.method public final k(I)Ls72;
    .locals 7

    .line 1
    iget-object v0, p0, Lkj0;->i:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v1, Ls72;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lkj0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lr72;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget v5, v4, Lr72;->h:I

    .line 26
    .line 27
    add-int v6, v5, p1

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-object v4, v4, Lr72;->i:Lw53;

    .line 33
    .line 34
    invoke-static {v6, v4}, Lr72;->e(ILw53;)Lr72;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :goto_1
    invoke-virtual {v1, v3, v4}, Lkj0;->f(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    iget-boolean p0, p0, Lvj1;->h:Z

    .line 45
    .line 46
    if-nez p0, :cond_4

    .line 47
    .line 48
    iput-boolean v2, v1, Lvj1;->h:Z

    .line 49
    .line 50
    :cond_4
    return-object v1
.end method
