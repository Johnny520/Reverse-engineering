.class public abstract Lp/h1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp/a0;

.field public static final b:Lp/a0;

.field public static final c:Lp/a0;

.field public static final d:Lp/t1;

.field public static final e:Lp/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lp/a0;

    .line 2
    .line 3
    sget-object v1, Lp/y;->h:Lp/y;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lp/a0;-><init>(Lp/y;F)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lp/h1;->a:Lp/a0;

    .line 11
    .line 12
    new-instance v0, Lp/a0;

    .line 13
    .line 14
    sget-object v1, Lp/y;->g:Lp/y;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lp/a0;-><init>(Lp/y;F)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lp/h1;->b:Lp/a0;

    .line 20
    .line 21
    new-instance v0, Lp/a0;

    .line 22
    .line 23
    sget-object v1, Lp/y;->i:Lp/y;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lp/a0;-><init>(Lp/y;F)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lp/h1;->c:Lp/a0;

    .line 29
    .line 30
    sget-object v0, Ly0/b;->k:Ly0/g;

    .line 31
    .line 32
    new-instance v2, Lp/t1;

    .line 33
    .line 34
    new-instance v3, Lb0/t;

    .line 35
    .line 36
    const/16 v4, 0x11

    .line 37
    .line 38
    invoke-direct {v3, v0, v4}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v1, v3, v0}, Lp/t1;-><init>(Lp/y;Lfg/p;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lp/h1;->d:Lp/t1;

    .line 45
    .line 46
    sget-object v0, Ly0/b;->g:Ly0/g;

    .line 47
    .line 48
    new-instance v2, Lp/t1;

    .line 49
    .line 50
    new-instance v3, Lb0/t;

    .line 51
    .line 52
    invoke-direct {v3, v0, v4}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v1, v3, v0}, Lp/t1;-><init>(Lp/y;Lfg/p;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sput-object v2, Lp/h1;->e:Lp/t1;

    .line 59
    .line 60
    return-void
.end method

.method public static final a(FF)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lp/m1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lp/m1;-><init>(FF)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b(F)Ly0/o;
    .locals 2

    .line 1
    new-instance v0, Lp/m1;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lp/m1;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static c(Ly0/o;)Ly0/o;
    .locals 1

    .line 1
    sget-object v0, Lp/h1;->c:Lp/a0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final d(Ly0/o;F)Ly0/o;
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lp/h1;->a:Lp/a0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lp/a0;

    .line 11
    .line 12
    sget-object v1, Lp/y;->h:Lp/y;

    .line 13
    .line 14
    invoke-direct {v0, v1, p1}, Lp/a0;-><init>(Lp/y;F)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :goto_0
    invoke-interface {p0, p1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final e(Ly0/o;F)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x5

    .line 5
    const/4 v1, 0x0

    .line 6
    move v4, p1

    .line 7
    move v2, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFI)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final f(Ly0/o;FF)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x5

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, p1

    .line 7
    move v4, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFI)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic g(Ly0/o;FFI)Ly0/o;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move p1, v1

    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    move p2, v1

    .line 13
    :cond_1
    invoke-static {p0, p1, p2}, Lp/h1;->f(Ly0/o;FF)Ly0/o;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final h(Ly0/o;F)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move v2, p1

    .line 5
    move v3, p1

    .line 6
    move v4, p1

    .line 7
    move v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static i(Ly0/o;FFFFI)Ly0/o;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v4, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v4, p2

    .line 10
    :goto_0
    and-int/lit8 p2, p5, 0x4

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    move v5, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v5, p3

    .line 17
    :goto_1
    and-int/lit8 p2, p5, 0x8

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    move v6, v1

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v6, p4

    .line 24
    :goto_2
    new-instance v2, Lp/g1;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    move v3, p1

    .line 28
    invoke-direct/range {v2 .. v7}, Lp/g1;-><init>(FFFFZ)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final j(Ly0/o;F)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v2, p1

    .line 5
    move v3, p1

    .line 6
    move v4, p1

    .line 7
    move v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final k(Ly0/o;FF)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v3, p1

    .line 5
    move v4, p2

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final l(Ly0/o;FFFF)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move v3, p3

    .line 7
    move v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic m(Ly0/o;FFI)Ly0/o;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move p1, v1

    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    move p2, v1

    .line 13
    :cond_1
    invoke-static {p0, p1, v1, p2, v1}, Lp/h1;->l(Ly0/o;FFFF)Ly0/o;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final n(Ly0/o;F)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, p1

    .line 8
    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFI)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static o(Ly0/o;F)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Lp/g1;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lp/g1;-><init>(FFFFI)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static p(Ly0/o;)Ly0/o;
    .locals 4

    .line 1
    sget-object v0, Ly0/b;->k:Ly0/g;

    .line 2
    .line 3
    invoke-virtual {v0, v0}, Ly0/g;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lp/h1;->d:Lp/t1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Ly0/b;->g:Ly0/g;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ly0/g;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v0, Lp/h1;->e:Lp/t1;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v1, Lp/t1;

    .line 24
    .line 25
    new-instance v2, Lb0/t;

    .line 26
    .line 27
    const/16 v3, 0x11

    .line 28
    .line 29
    invoke-direct {v2, v0, v3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    sget-object v3, Lp/y;->i:Lp/y;

    .line 33
    .line 34
    invoke-direct {v1, v3, v2, v0}, Lp/t1;-><init>(Lp/y;Lfg/p;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v1

    .line 38
    :goto_0
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
