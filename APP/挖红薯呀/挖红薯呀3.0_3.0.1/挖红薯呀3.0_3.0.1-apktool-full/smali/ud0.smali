.class public final Lud0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lb60;

.field public final b:Lo8;

.field public c:Z

.field public d:Z

.field public final e:Ld;

.field public final f:Lsh0;

.field public final g:J

.field public final h:Lsh0;

.field public i:Lpj;


# direct methods
.method public constructor <init>(Lb60;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lud0;->a:Lb60;

    .line 5
    .line 6
    new-instance p1, Lo8;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p1, v0}, Lo8;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lud0;->b:Lo8;

    .line 13
    .line 14
    new-instance p1, Ld;

    .line 15
    .line 16
    const/16 v0, 0xe

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ld;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lud0;->e:Ld;

    .line 22
    .line 23
    new-instance p1, Lsh0;

    .line 24
    .line 25
    const/16 v0, 0x10

    .line 26
    .line 27
    new-array v1, v0, [Lb60;

    .line 28
    .line 29
    invoke-direct {p1, v1}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lud0;->f:Lsh0;

    .line 33
    .line 34
    const-wide/16 v1, 0x1

    .line 35
    .line 36
    iput-wide v1, p0, Lud0;->g:J

    .line 37
    .line 38
    new-instance p1, Lsh0;

    .line 39
    .line 40
    new-array v0, v0, [Ltd0;

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lud0;->h:Lsh0;

    .line 46
    .line 47
    return-void
.end method

.method public static b(Lb60;Lpj;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lb60;->l:Lb60;

    .line 2
    .line 3
    iget-object v1, p0, Lb60;->J:Lf60;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, Lf60;->q:Lec0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, Lpj;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Lec0;->m0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, Lf60;->q:Lec0;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, Lec0;->p:Lpj;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, Lpj;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Lec0;->m0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Lb60;->l:Lb60;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Lb60;->X(Lb60;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, Lb60;->t()Lz50;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, Lz50;->d:Lz50;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, Lb60;->V(Lb60;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, Lb60;->t()Lz50;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, Lz50;->e:Lz50;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Lb60;->U(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
.end method

.method public static c(Lb60;Lpj;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb60;->P(Lpj;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, Lb60;->Q(Lb60;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    :goto_0
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lb60;->s()Lz50;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lz50;->d:Lz50;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    invoke-static {v0, v3, p0}, Lb60;->X(Lb60;ZI)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_1
    invoke-virtual {p0}, Lb60;->s()Lz50;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v1, Lz50;->e:Lz50;

    .line 39
    .line 40
    if-ne p0, v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lb60;->W(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return p1
.end method

.method public static h(Lb60;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb60;->J:Lf60;

    .line 2
    .line 3
    iget-boolean v0, v0, Lf60;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lb60;->t()Lz50;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lz50;->f:Lz50;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 17
    .line 18
    iget-object p0, p0, Lf60;->q:Lec0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lec0;->t:Lc60;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lc60;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static i(Lb60;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb60;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lb60;->s()Lz50;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lz50;->f:Lz50;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lb60;->J:Lf60;

    .line 16
    .line 17
    iget-object v0, v0, Lf60;->p:Lwd0;

    .line 18
    .line 19
    iget-object v0, v0, Lwd0;->z:Lc60;

    .line 20
    .line 21
    invoke-virtual {v0}, Lc60;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Lb60;->J:Lf60;

    .line 34
    .line 35
    iget-object v0, v0, Lf60;->d:Lx50;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, Lx50;->d:Lx50;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Lb60;->I()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lud0;->e:Ld;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, v1, Ld;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lsh0;

    .line 9
    .line 10
    iget-object p0, p0, Lud0;->a:Lb60;

    .line 11
    .line 12
    iget v2, p0, Lb60;->Q:I

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lsh0;->g()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-boolean v0, p0, Lb60;->P:Z

    .line 23
    .line 24
    :cond_0
    iget-object p0, v1, Ld;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lsh0;

    .line 27
    .line 28
    iget p1, p0, Lsh0;->f:I

    .line 29
    .line 30
    if-eqz p1, :cond_6

    .line 31
    .line 32
    sget-object v2, Lev;->d:Lev;

    .line 33
    .line 34
    iget-object v3, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v3, v4, p1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 38
    .line 39
    .line 40
    iget p1, p0, Lsh0;->f:I

    .line 41
    .line 42
    iget-object v2, v1, Ld;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, [Lb60;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    array-length v3, v2

    .line 49
    if-ge v3, p1, :cond_2

    .line 50
    .line 51
    :cond_1
    const/16 v2, 0x10

    .line 52
    .line 53
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    new-array v2, v2, [Lb60;

    .line 58
    .line 59
    :cond_2
    const/4 v3, 0x0

    .line 60
    iput-object v3, v1, Ld;->f:Ljava/lang/Object;

    .line 61
    .line 62
    :goto_0
    if-ge v4, p1, :cond_3

    .line 63
    .line 64
    iget-object v5, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 65
    .line 66
    aget-object v5, v5, v4

    .line 67
    .line 68
    aput-object v5, v2, v4

    .line 69
    .line 70
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p0}, Lsh0;->g()V

    .line 74
    .line 75
    .line 76
    sub-int/2addr p1, v0

    .line 77
    :goto_1
    const/4 p0, -0x1

    .line 78
    if-ge p0, p1, :cond_5

    .line 79
    .line 80
    aget-object p0, v2, p1

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-boolean v0, p0, Lb60;->P:Z

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-static {p0}, Ld;->l(Lb60;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    aput-object v3, v2, p1

    .line 93
    .line 94
    add-int/lit8 p1, p1, -0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    iput-object v2, v1, Ld;->f:Ljava/lang/Object;

    .line 98
    .line 99
    :cond_6
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object p0, p0, Lud0;->h:Lsh0;

    .line 2
    .line 3
    iget v0, p0, Lsh0;->f:I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Ltd0;

    .line 15
    .line 16
    iget-object v4, v3, Ltd0;->a:Lb60;

    .line 17
    .line 18
    invoke-virtual {v4}, Lb60;->H()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-boolean v4, v3, Ltd0;->b:Z

    .line 25
    .line 26
    iget-object v5, v3, Ltd0;->a:Lb60;

    .line 27
    .line 28
    iget-boolean v3, v3, Ltd0;->c:Z

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v5, v3, v6}, Lb60;->X(Lb60;ZI)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v5, v3, v6}, Lb60;->V(Lb60;ZI)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {p0}, Lsh0;->g()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public final e(Lb60;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lb60;->z()Lsh0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lsh0;->d:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lsh0;->f:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Lb60;

    .line 15
    .line 16
    invoke-virtual {v2}, Lb60;->J()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, Lb60;->R:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, Lud0;->b:Lo8;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lo8;->b(Lb60;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2}, Lb60;->K()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0, v2}, Lud0;->e(Lb60;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
.end method

.method public final f(Lb60;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lud0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 13
    .line 14
    iget-boolean v0, v0, Lf60;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Lb60;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, Lud0;->g(Lb60;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final g(Lb60;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lb60;->z()Lsh0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lsh0;->f:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v0, :cond_8

    .line 12
    .line 13
    aget-object v4, v1, v3

    .line 14
    .line 15
    check-cast v4, Lb60;

    .line 16
    .line 17
    sget-object v5, Lz50;->d:Lz50;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Lb60;->s()Lz50;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    if-eq v7, v5, :cond_1

    .line 27
    .line 28
    iget-object v7, v4, Lb60;->J:Lf60;

    .line 29
    .line 30
    iget-object v7, v7, Lf60;->p:Lwd0;

    .line 31
    .line 32
    iget-object v7, v7, Lwd0;->z:Lc60;

    .line 33
    .line 34
    invoke-virtual {v7}, Lc60;->e()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    if-eqz p2, :cond_7

    .line 42
    .line 43
    invoke-virtual {v4}, Lb60;->t()Lz50;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-eq v7, v5, :cond_1

    .line 48
    .line 49
    iget-object v5, v4, Lb60;->J:Lf60;

    .line 50
    .line 51
    iget-object v5, v5, Lf60;->q:Lec0;

    .line 52
    .line 53
    if-eqz v5, :cond_7

    .line 54
    .line 55
    iget-object v5, v5, Lec0;->t:Lc60;

    .line 56
    .line 57
    if-eqz v5, :cond_7

    .line 58
    .line 59
    invoke-virtual {v5}, Lc60;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-ne v5, v6, :cond_7

    .line 64
    .line 65
    :cond_1
    :goto_1
    invoke-static {v4}, Lg60;->p(Lb60;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v7, v4, Lb60;->J:Lf60;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    if-nez p2, :cond_3

    .line 74
    .line 75
    iget-boolean v5, v7, Lf60;->e:Z

    .line 76
    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    iget-object v5, p0, Lud0;->b:Lo8;

    .line 80
    .line 81
    invoke-virtual {v5, v4}, Lo8;->b(Lb60;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0, v4, v6, v2}, Lud0;->m(Lb60;ZZ)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {p0, v4, v6}, Lud0;->f(Lb60;Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    .line 95
    .line 96
    iget-boolean v5, v7, Lf60;->e:Z

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-virtual {v4}, Lb60;->r()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    :goto_3
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0, v4, p2, v2}, Lud0;->m(Lb60;ZZ)Z

    .line 106
    .line 107
    .line 108
    :cond_5
    if-eqz p2, :cond_6

    .line 109
    .line 110
    iget-boolean v5, v7, Lf60;->e:Z

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    invoke-virtual {v4}, Lb60;->r()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    :goto_4
    if-nez v5, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0, v4, p2}, Lud0;->g(Lb60;Z)V

    .line 120
    .line 121
    .line 122
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_8
    if-eqz p2, :cond_9

    .line 126
    .line 127
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 128
    .line 129
    iget-boolean v0, v0, Lf60;->e:Z

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_9
    invoke-virtual {p1}, Lb60;->r()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    :goto_5
    if-eqz v0, :cond_a

    .line 137
    .line 138
    invoke-virtual {p0, p1, p2, v2}, Lud0;->m(Lb60;ZZ)Z

    .line 139
    .line 140
    .line 141
    :cond_a
    return-void
.end method

.method public final j(Lhw;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lud0;->b:Lo8;

    .line 4
    .line 5
    iget-object v2, v1, Lud0;->a:Lb60;

    .line 6
    .line 7
    invoke-virtual {v2}, Lb60;->H()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 14
    .line 15
    invoke-static {v3}, Lw10;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Lb60;->I()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 25
    .line 26
    invoke-static {v3}, Lw10;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v3, v1, Lud0;->c:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 34
    .line 35
    invoke-static {v3}, Lw10;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, v1, Lud0;->i:Lpj;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    iput-boolean v5, v1, Lud0;->c:Z

    .line 45
    .line 46
    iput-boolean v5, v1, Lud0;->d:Z

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, Lo8;->j()Z

    .line 49
    .line 50
    .line 51
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v6, v0, Lo8;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lx1;

    .line 55
    .line 56
    if-eqz v3, :cond_b

    .line 57
    .line 58
    move v3, v4

    .line 59
    :cond_3
    :goto_0
    :try_start_1
    iget-object v7, v0, Lo8;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lx1;

    .line 62
    .line 63
    iget-object v8, v0, Lo8;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lx1;

    .line 66
    .line 67
    iget-object v9, v6, Lx1;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Lh31;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_5

    .line 76
    .line 77
    iget-object v7, v6, Lx1;->e:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, Lh31;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lb60;

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Lx1;->r(Lb60;)Z

    .line 88
    .line 89
    .line 90
    iget-object v8, v7, Lb60;->l:Lb60;

    .line 91
    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    move v8, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move v8, v4

    .line 97
    :goto_1
    move v9, v4

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_5
    iget-object v9, v8, Lx1;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lh31;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_7

    .line 111
    .line 112
    iget-object v7, v8, Lx1;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, Lh31;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lb60;

    .line 121
    .line 122
    invoke-virtual {v8, v7}, Lx1;->r(Lb60;)Z

    .line 123
    .line 124
    .line 125
    iget-object v8, v7, Lb60;->l:Lb60;

    .line 126
    .line 127
    if-eqz v8, :cond_6

    .line 128
    .line 129
    move v8, v5

    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move v8, v4

    .line 132
    :goto_2
    move v9, v5

    .line 133
    goto :goto_3

    .line 134
    :cond_7
    iget-object v8, v7, Lx1;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v8, Lh31;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_a

    .line 143
    .line 144
    iget-object v8, v7, Lx1;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v8, Lh31;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, Lb60;

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Lx1;->r(Lb60;)Z

    .line 155
    .line 156
    .line 157
    move v9, v5

    .line 158
    move-object v7, v8

    .line 159
    move v8, v4

    .line 160
    :goto_3
    invoke-virtual {v1, v7, v8, v9}, Lud0;->m(Lb60;ZZ)Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-nez v9, :cond_9

    .line 165
    .line 166
    iget-object v9, v7, Lb60;->J:Lf60;

    .line 167
    .line 168
    iget-boolean v9, v9, Lf60;->f:Z

    .line 169
    .line 170
    if-eqz v9, :cond_8

    .line 171
    .line 172
    sget-object v9, Lw30;->e:Lw30;

    .line 173
    .line 174
    invoke-virtual {v0, v7, v9}, Lo8;->a(Lb60;Lw30;)V

    .line 175
    .line 176
    .line 177
    :cond_8
    invoke-virtual {v7}, Lb60;->p()Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_9

    .line 182
    .line 183
    sget-object v9, Lw30;->g:Lw30;

    .line 184
    .line 185
    invoke-virtual {v0, v7, v9}, Lo8;->a(Lb60;Lw30;)V

    .line 186
    .line 187
    .line 188
    :cond_9
    if-ne v7, v2, :cond_3

    .line 189
    .line 190
    if-eqz v8, :cond_3

    .line 191
    .line 192
    move v3, v5

    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_a
    if-eqz p1, :cond_c

    .line 196
    .line 197
    invoke-interface/range {p1 .. p1}, Lhw;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_b
    move v3, v4

    .line 202
    :cond_c
    :goto_4
    iput-boolean v4, v1, Lud0;->c:Z

    .line 203
    .line 204
    iput-boolean v4, v1, Lud0;->d:Z

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :goto_5
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 208
    :catchall_1
    move-exception v0

    .line 209
    iput-boolean v4, v1, Lud0;->c:Z

    .line 210
    .line 211
    iput-boolean v4, v1, Lud0;->d:Z

    .line 212
    .line 213
    throw v0

    .line 214
    :cond_d
    move v3, v4

    .line 215
    :goto_6
    iget-object v0, v1, Lud0;->f:Lsh0;

    .line 216
    .line 217
    iget-object v1, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 218
    .line 219
    iget v2, v0, Lsh0;->f:I

    .line 220
    .line 221
    move v6, v4

    .line 222
    :goto_7
    if-ge v6, v2, :cond_19

    .line 223
    .line 224
    aget-object v7, v1, v6

    .line 225
    .line 226
    check-cast v7, Lb60;

    .line 227
    .line 228
    iget-object v7, v7, Lb60;->I:Lmj0;

    .line 229
    .line 230
    iget-object v8, v7, Lmj0;->c:Lc20;

    .line 231
    .line 232
    const/high16 v9, 0x400000

    .line 233
    .line 234
    invoke-static {v9}, Lrj0;->f(I)Z

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    if-eqz v10, :cond_e

    .line 239
    .line 240
    iget-object v11, v8, Lc20;->T:Ld61;

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_e
    iget-object v11, v8, Lc20;->T:Ld61;

    .line 244
    .line 245
    iget-object v11, v11, Loe0;->h:Loe0;

    .line 246
    .line 247
    if-nez v11, :cond_f

    .line 248
    .line 249
    goto/16 :goto_f

    .line 250
    .line 251
    :cond_f
    :goto_8
    sget-object v12, Lqj0;->P:Lgv0;

    .line 252
    .line 253
    invoke-virtual {v8, v10}, Lqj0;->I0(Z)Loe0;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    :goto_9
    if-eqz v8, :cond_18

    .line 258
    .line 259
    iget v10, v8, Loe0;->g:I

    .line 260
    .line 261
    and-int/2addr v10, v9

    .line 262
    if-eqz v10, :cond_18

    .line 263
    .line 264
    iget v10, v8, Loe0;->f:I

    .line 265
    .line 266
    and-int/2addr v10, v9

    .line 267
    if-eqz v10, :cond_17

    .line 268
    .line 269
    const/4 v10, 0x0

    .line 270
    move-object v12, v8

    .line 271
    move-object v13, v10

    .line 272
    :goto_a
    if-eqz v12, :cond_17

    .line 273
    .line 274
    instance-of v14, v12, Lg50;

    .line 275
    .line 276
    if-eqz v14, :cond_10

    .line 277
    .line 278
    check-cast v12, Lg50;

    .line 279
    .line 280
    iget-object v14, v7, Lmj0;->c:Lc20;

    .line 281
    .line 282
    invoke-interface {v12, v14}, Lg50;->j(Li50;)V

    .line 283
    .line 284
    .line 285
    goto :goto_e

    .line 286
    :cond_10
    iget v14, v12, Loe0;->f:I

    .line 287
    .line 288
    and-int/2addr v14, v9

    .line 289
    if-eqz v14, :cond_16

    .line 290
    .line 291
    instance-of v14, v12, Lsm;

    .line 292
    .line 293
    if-eqz v14, :cond_16

    .line 294
    .line 295
    move-object v14, v12

    .line 296
    check-cast v14, Lsm;

    .line 297
    .line 298
    iget-object v14, v14, Lsm;->s:Loe0;

    .line 299
    .line 300
    move v15, v4

    .line 301
    :goto_b
    if-eqz v14, :cond_15

    .line 302
    .line 303
    iget v4, v14, Loe0;->f:I

    .line 304
    .line 305
    and-int/2addr v4, v9

    .line 306
    if-eqz v4, :cond_14

    .line 307
    .line 308
    add-int/lit8 v15, v15, 0x1

    .line 309
    .line 310
    if-ne v15, v5, :cond_11

    .line 311
    .line 312
    move-object v12, v14

    .line 313
    goto :goto_c

    .line 314
    :cond_11
    if-nez v13, :cond_12

    .line 315
    .line 316
    new-instance v13, Lsh0;

    .line 317
    .line 318
    const/16 v4, 0x10

    .line 319
    .line 320
    new-array v4, v4, [Loe0;

    .line 321
    .line 322
    invoke-direct {v13, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_12
    if-eqz v12, :cond_13

    .line 326
    .line 327
    invoke-virtual {v13, v12}, Lsh0;->b(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    move-object v12, v10

    .line 331
    :cond_13
    invoke-virtual {v13, v14}, Lsh0;->b(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_14
    :goto_c
    iget-object v14, v14, Loe0;->i:Loe0;

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    goto :goto_b

    .line 338
    :cond_15
    if-ne v15, v5, :cond_16

    .line 339
    .line 340
    :goto_d
    const/4 v4, 0x0

    .line 341
    goto :goto_a

    .line 342
    :cond_16
    :goto_e
    invoke-static {v13}, Lpf1;->f(Lsh0;)Loe0;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    goto :goto_d

    .line 347
    :cond_17
    if-eq v8, v11, :cond_18

    .line 348
    .line 349
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 350
    .line 351
    const/4 v4, 0x0

    .line 352
    goto :goto_9

    .line 353
    :cond_18
    :goto_f
    add-int/lit8 v6, v6, 0x1

    .line 354
    .line 355
    const/4 v4, 0x0

    .line 356
    goto/16 :goto_7

    .line 357
    .line 358
    :cond_19
    invoke-virtual {v0}, Lsh0;->g()V

    .line 359
    .line 360
    .line 361
    return v3
.end method

.method public final k(Lb60;J)V
    .locals 12

    .line 1
    iget-boolean v0, p1, Lb60;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lud0;->a:Lb60;

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v1, "measureAndLayout called on root"

    .line 12
    .line 13
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, Lb60;->H()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    const-string v1, "performMeasureAndLayout called with unattached root"

    .line 23
    .line 24
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {v0}, Lb60;->I()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string v0, "performMeasureAndLayout called with unplaced root"

    .line 34
    .line 35
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-boolean v0, p0, Lud0;->c:Z

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    const-string v0, "performMeasureAndLayout called during measure layout"

    .line 43
    .line 44
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Lud0;->i:Lpj;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v0, :cond_8

    .line 52
    .line 53
    iput-boolean v1, p0, Lud0;->c:Z

    .line 54
    .line 55
    iput-boolean v2, p0, Lud0;->d:Z

    .line 56
    .line 57
    :try_start_0
    iget-object v0, p0, Lud0;->b:Lo8;

    .line 58
    .line 59
    iget-object v3, v0, Lo8;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lx1;

    .line 62
    .line 63
    invoke-virtual {v3, p1}, Lx1;->r(Lb60;)Z

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Lo8;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lx1;

    .line 69
    .line 70
    invoke-virtual {v3, p1}, Lx1;->r(Lb60;)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, Lo8;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lx1;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lx1;->r(Lb60;)Z

    .line 78
    .line 79
    .line 80
    new-instance v0, Lpj;

    .line 81
    .line 82
    invoke-direct {v0, p2, p3}, Lpj;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v0}, Lud0;->b(Lb60;Lpj;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 92
    .line 93
    iget-boolean v0, v0, Lf60;->f:Z

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    :cond_5
    invoke-virtual {p1}, Lb60;->J()Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-static {v0, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {p1}, Lb60;->K()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    :goto_1
    invoke-virtual {p0, p1}, Lud0;->e(Lb60;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lpj;

    .line 119
    .line 120
    invoke-direct {v0, p2, p3}, Lpj;-><init>(J)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0}, Lud0;->c(Lb60;Lpj;)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lb60;->p()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_7

    .line 131
    .line 132
    invoke-virtual {p1}, Lb60;->I()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_7

    .line 137
    .line 138
    invoke-virtual {p1}, Lb60;->T()V

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, Lud0;->e:Ld;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget p3, p1, Lb60;->Q:I

    .line 147
    .line 148
    if-lez p3, :cond_7

    .line 149
    .line 150
    iget-object p2, p2, Ld;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p2, Lsh0;

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iput-boolean v1, p1, Lb60;->P:Z

    .line 158
    .line 159
    :cond_7
    invoke-virtual {p0}, Lud0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    iput-boolean v2, p0, Lud0;->c:Z

    .line 163
    .line 164
    iput-boolean v2, p0, Lud0;->d:Z

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    :catchall_1
    move-exception p1

    .line 169
    iput-boolean v2, p0, Lud0;->c:Z

    .line 170
    .line 171
    iput-boolean v2, p0, Lud0;->d:Z

    .line 172
    .line 173
    throw p1

    .line 174
    :cond_8
    :goto_3
    iget-object p0, p0, Lud0;->f:Lsh0;

    .line 175
    .line 176
    iget-object p1, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 177
    .line 178
    iget p2, p0, Lsh0;->f:I

    .line 179
    .line 180
    move p3, v2

    .line 181
    :goto_4
    if-ge p3, p2, :cond_14

    .line 182
    .line 183
    aget-object v0, p1, p3

    .line 184
    .line 185
    check-cast v0, Lb60;

    .line 186
    .line 187
    iget-object v0, v0, Lb60;->I:Lmj0;

    .line 188
    .line 189
    iget-object v3, v0, Lmj0;->c:Lc20;

    .line 190
    .line 191
    const/high16 v4, 0x400000

    .line 192
    .line 193
    invoke-static {v4}, Lrj0;->f(I)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_9

    .line 198
    .line 199
    iget-object v6, v3, Lc20;->T:Ld61;

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_9
    iget-object v6, v3, Lc20;->T:Ld61;

    .line 203
    .line 204
    iget-object v6, v6, Loe0;->h:Loe0;

    .line 205
    .line 206
    if-nez v6, :cond_a

    .line 207
    .line 208
    goto/16 :goto_b

    .line 209
    .line 210
    :cond_a
    :goto_5
    sget-object v7, Lqj0;->P:Lgv0;

    .line 211
    .line 212
    invoke-virtual {v3, v5}, Lqj0;->I0(Z)Loe0;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    :goto_6
    if-eqz v3, :cond_13

    .line 217
    .line 218
    iget v5, v3, Loe0;->g:I

    .line 219
    .line 220
    and-int/2addr v5, v4

    .line 221
    if-eqz v5, :cond_13

    .line 222
    .line 223
    iget v5, v3, Loe0;->f:I

    .line 224
    .line 225
    and-int/2addr v5, v4

    .line 226
    if-eqz v5, :cond_12

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    move-object v7, v3

    .line 230
    move-object v8, v5

    .line 231
    :goto_7
    if-eqz v7, :cond_12

    .line 232
    .line 233
    instance-of v9, v7, Lg50;

    .line 234
    .line 235
    if-eqz v9, :cond_b

    .line 236
    .line 237
    check-cast v7, Lg50;

    .line 238
    .line 239
    iget-object v9, v0, Lmj0;->c:Lc20;

    .line 240
    .line 241
    invoke-interface {v7, v9}, Lg50;->j(Li50;)V

    .line 242
    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_b
    iget v9, v7, Loe0;->f:I

    .line 246
    .line 247
    and-int/2addr v9, v4

    .line 248
    if-eqz v9, :cond_11

    .line 249
    .line 250
    instance-of v9, v7, Lsm;

    .line 251
    .line 252
    if-eqz v9, :cond_11

    .line 253
    .line 254
    move-object v9, v7

    .line 255
    check-cast v9, Lsm;

    .line 256
    .line 257
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 258
    .line 259
    move v10, v2

    .line 260
    :goto_8
    if-eqz v9, :cond_10

    .line 261
    .line 262
    iget v11, v9, Loe0;->f:I

    .line 263
    .line 264
    and-int/2addr v11, v4

    .line 265
    if-eqz v11, :cond_f

    .line 266
    .line 267
    add-int/lit8 v10, v10, 0x1

    .line 268
    .line 269
    if-ne v10, v1, :cond_c

    .line 270
    .line 271
    move-object v7, v9

    .line 272
    goto :goto_9

    .line 273
    :cond_c
    if-nez v8, :cond_d

    .line 274
    .line 275
    new-instance v8, Lsh0;

    .line 276
    .line 277
    const/16 v11, 0x10

    .line 278
    .line 279
    new-array v11, v11, [Loe0;

    .line 280
    .line 281
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_d
    if-eqz v7, :cond_e

    .line 285
    .line 286
    invoke-virtual {v8, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    move-object v7, v5

    .line 290
    :cond_e
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_f
    :goto_9
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_10
    if-ne v10, v1, :cond_11

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_11
    :goto_a
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    goto :goto_7

    .line 304
    :cond_12
    if-eq v3, v6, :cond_13

    .line 305
    .line 306
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_13
    :goto_b
    add-int/lit8 p3, p3, 0x1

    .line 310
    .line 311
    goto/16 :goto_4

    .line 312
    .line 313
    :cond_14
    invoke-virtual {p0}, Lsh0;->g()V

    .line 314
    .line 315
    .line 316
    return-void
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lud0;->b:Lo8;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo8;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Lud0;->a:Lb60;

    .line 10
    .line 11
    invoke-virtual {v1}, Lb60;->H()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 18
    .line 19
    invoke-static {v2}, Lw10;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, Lb60;->I()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 29
    .line 30
    invoke-static {v2}, Lw10;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v2, p0, Lud0;->c:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 38
    .line 39
    invoke-static {v2}, Lw10;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v2, p0, Lud0;->i:Lpj;

    .line 43
    .line 44
    if-eqz v2, :cond_5

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, Lud0;->c:Z

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-boolean v3, p0, Lud0;->d:Z

    .line 51
    .line 52
    :try_start_0
    iget-object v4, v0, Lo8;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lx1;

    .line 55
    .line 56
    iget-object v4, v4, Lx1;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lh31;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    iget-object v0, v0, Lo8;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lx1;

    .line 69
    .line 70
    iget-object v0, v0, Lx1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lh31;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    iget-object v0, v1, Lb60;->l:Lb60;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, v1, v2}, Lud0;->o(Lb60;Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p0, v1}, Lud0;->n(Lb60;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    invoke-virtual {p0, v1, v3}, Lud0;->o(Lb60;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    iput-boolean v3, p0, Lud0;->c:Z

    .line 97
    .line 98
    iput-boolean v3, p0, Lud0;->d:Z

    .line 99
    .line 100
    return-void

    .line 101
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    iput-boolean v3, p0, Lud0;->c:Z

    .line 104
    .line 105
    iput-boolean v3, p0, Lud0;->d:Z

    .line 106
    .line 107
    throw v0

    .line 108
    :cond_5
    return-void
.end method

.method public final m(Lb60;ZZ)Z
    .locals 5

    .line 1
    iget-boolean v0, p1, Lb60;->R:Z

    .line 2
    .line 3
    iget-object v1, p1, Lb60;->J:Lf60;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lb60;->I()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v1, Lf60;->p:Lwd0;

    .line 17
    .line 18
    iget-boolean v0, v0, Lwd0;->v:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-static {p1}, Lud0;->i(Lb60;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Lb60;->J()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v0, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-static {p1}, Lud0;->h(Lb60;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, v1, Lf60;->p:Lwd0;

    .line 47
    .line 48
    iget-object v0, v0, Lwd0;->z:Lc60;

    .line 49
    .line 50
    invoke-virtual {v0}, Lc60;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iget-object v0, v1, Lf60;->q:Lec0;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lec0;->t:Lc60;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Lc60;->e()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-ne v0, v3, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    return v2

    .line 72
    :cond_2
    :goto_1
    iget-object v0, p0, Lud0;->a:Lb60;

    .line 73
    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    iget-object v4, p0, Lud0;->i:Lpj;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 v4, 0x0

    .line 83
    :goto_2
    if-eqz p2, :cond_6

    .line 84
    .line 85
    iget-boolean p2, v1, Lf60;->e:Z

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-static {p1, v4}, Lud0;->b(Lb60;Lpj;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :cond_4
    if-eqz p3, :cond_e

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    iget-boolean p2, v1, Lf60;->f:Z

    .line 98
    .line 99
    if-eqz p2, :cond_e

    .line 100
    .line 101
    :cond_5
    invoke-virtual {p1}, Lb60;->J()Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-static {p2, p3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_e

    .line 112
    .line 113
    invoke-virtual {p1}, Lb60;->K()V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_6
    invoke-virtual {p1}, Lb60;->r()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    invoke-static {p1, v4}, Lud0;->c(Lb60;Lpj;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    goto :goto_3

    .line 129
    :cond_7
    move p2, v2

    .line 130
    :goto_3
    if-eqz p3, :cond_d

    .line 131
    .line 132
    invoke-virtual {p1}, Lb60;->p()Z

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-eqz p3, :cond_d

    .line 137
    .line 138
    if-eq p1, v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    if-eqz p3, :cond_d

    .line 145
    .line 146
    invoke-virtual {p3}, Lb60;->I()Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    if-ne p3, v3, :cond_d

    .line 151
    .line 152
    iget-object p3, v1, Lf60;->p:Lwd0;

    .line 153
    .line 154
    iget-boolean p3, p3, Lwd0;->v:Z

    .line 155
    .line 156
    if-eqz p3, :cond_d

    .line 157
    .line 158
    :cond_8
    if-ne p1, v0, :cond_c

    .line 159
    .line 160
    iget-object p3, p1, Lb60;->F:Lz50;

    .line 161
    .line 162
    sget-object v0, Lz50;->f:Lz50;

    .line 163
    .line 164
    if-ne p3, v0, :cond_9

    .line 165
    .line 166
    invoke-virtual {p1}, Lb60;->f()V

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    if-eqz p3, :cond_a

    .line 174
    .line 175
    iget-object p3, p3, Lb60;->I:Lmj0;

    .line 176
    .line 177
    iget-object p3, p3, Lmj0;->c:Lc20;

    .line 178
    .line 179
    if-eqz p3, :cond_a

    .line 180
    .line 181
    iget-object p3, p3, Lyb0;->o:Lzb0;

    .line 182
    .line 183
    if-nez p3, :cond_b

    .line 184
    .line 185
    :cond_a
    invoke-static {p1}, Le60;->a(Lb60;)Ldn0;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    check-cast p3, Lw3;

    .line 190
    .line 191
    invoke-virtual {p3}, Lw3;->getPlacementScope()Lwq0;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    :cond_b
    iget-object v0, v1, Lf60;->p:Lwd0;

    .line 196
    .line 197
    invoke-static {p3, v0, v2, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_c
    invoke-virtual {p1}, Lb60;->T()V

    .line 202
    .line 203
    .line 204
    :goto_4
    iget-object p3, p0, Lud0;->e:Ld;

    .line 205
    .line 206
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget v0, p1, Lb60;->Q:I

    .line 210
    .line 211
    if-lez v0, :cond_d

    .line 212
    .line 213
    iget-object p3, p3, Ld;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p3, Lsh0;

    .line 216
    .line 217
    invoke-virtual {p3, p1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iput-boolean v3, p1, Lb60;->P:Z

    .line 221
    .line 222
    :cond_d
    move v2, p2

    .line 223
    :cond_e
    :goto_5
    invoke-virtual {p0}, Lud0;->d()V

    .line 224
    .line 225
    .line 226
    return v2
.end method

.method public final n(Lb60;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lb60;->z()Lsh0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lsh0;->d:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lsh0;->f:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Lb60;

    .line 15
    .line 16
    invoke-virtual {v2}, Lb60;->s()Lz50;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lz50;->d:Lz50;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Lb60;->J:Lf60;

    .line 25
    .line 26
    iget-object v3, v3, Lf60;->p:Lwd0;

    .line 27
    .line 28
    iget-object v3, v3, Lwd0;->z:Lc60;

    .line 29
    .line 30
    invoke-virtual {v3}, Lc60;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, Lg60;->p(Lb60;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, Lud0;->o(Lb60;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, Lud0;->n(Lb60;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method

.method public final o(Lb60;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lb60;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lud0;->a:Lb60;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lud0;->i:Lpj;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-static {p1, p0}, Lud0;->b(Lb60;Lpj;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p1, p0}, Lud0;->c(Lb60;Lpj;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final p(Lb60;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 2
    .line 3
    iget-object v0, v0, Lf60;->d:Lx50;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Lb60;->r()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, Lb60;->J:Lf60;

    .line 34
    .line 35
    iget-object p2, p2, Lf60;->p:Lwd0;

    .line 36
    .line 37
    iput-boolean v2, p2, Lwd0;->w:Z

    .line 38
    .line 39
    iget-boolean p2, p1, Lb60;->R:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Lb60;->I()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, Lud0;->i(Lb60;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, Lb60;->r()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, Lud0;->b:Lo8;

    .line 70
    .line 71
    sget-object v0, Lw30;->f:Lw30;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lo8;->a(Lb60;Lw30;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-boolean p0, p0, Lud0;->d:Z

    .line 77
    .line 78
    if-nez p0, :cond_6

    .line 79
    .line 80
    return v2

    .line 81
    :cond_4
    invoke-static {}, Lxc;->j()V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :cond_5
    new-instance v0, Ltd0;

    .line 86
    .line 87
    invoke-direct {v0, p1, v1, p2}, Ltd0;-><init>(Lb60;ZZ)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lud0;->h:Lsh0;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_1
    return v1
.end method

.method public final q(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lud0;->i:Lpj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v0, v0, Lpj;->a:J

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lpj;->b(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_4

    .line 14
    .line 15
    iget-boolean v0, p0, Lud0;->c:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v0, "updateRootConstraints called while measuring"

    .line 20
    .line 21
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    new-instance v0, Lpj;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, Lpj;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lud0;->i:Lpj;

    .line 30
    .line 31
    iget-object p1, p0, Lud0;->a:Lb60;

    .line 32
    .line 33
    iget-object p2, p1, Lb60;->l:Lb60;

    .line 34
    .line 35
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iput-boolean v1, v0, Lf60;->e:Z

    .line 41
    .line 42
    :cond_2
    iget-object v0, v0, Lf60;->p:Lwd0;

    .line 43
    .line 44
    iput-boolean v1, v0, Lwd0;->w:Z

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    sget-object p2, Lw30;->d:Lw30;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    sget-object p2, Lw30;->f:Lw30;

    .line 52
    .line 53
    :goto_1
    iget-object p0, p0, Lud0;->b:Lo8;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, Lo8;->a(Lb60;Lw30;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-void
.end method
