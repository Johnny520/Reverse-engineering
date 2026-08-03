.class public final Ls0/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;
.implements Lfg/q;
.implements Lfg/r;
.implements Lfg/s;
.implements Lfg/t;
.implements Lfg/u;
.implements Lfg/v;
.implements Lfg/w;
.implements Lfg/b;
.implements Lfg/c;
.implements Lfg/e;
.implements Lfg/f;
.implements Lfg/g;
.implements Lfg/h;
.implements Lfg/i;
.implements Lfg/j;
.implements Lfg/k;
.implements Lfg/m;
.implements Lfg/n;


# instance fields
.field public final g:I

.field public final h:Z

.field public i:Lsf/b;

.field public j:Li0/r1;

.field public k:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILsf/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls0/d;->g:I

    .line 5
    .line 6
    iput-boolean p3, p0, Ls0/d;->h:Z

    .line 7
    .line 8
    iput-object p2, p0, Ls0/d;->i:Lsf/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v7

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move-object v6, p6

    .line 12
    invoke-virtual/range {v0 .. v7}, Ls0/d;->h(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Li0/h0;

    .line 2
    .line 3
    check-cast p3, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Ls0/d;->g(Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p3, Li0/h0;

    .line 2
    .line 3
    check-cast p4, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Ls0/d;->i(Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p4

    .line 2
    check-cast v4, Li0/h0;

    .line 3
    .line 4
    check-cast p5, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ld0/b;

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v2, p2

    .line 15
    move-object v3, p3

    .line 16
    invoke-virtual/range {v0 .. v5}, Ls0/d;->e(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final e(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ls0/d;->g:I

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p4}, Ls0/d;->j(Li0/h0;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x3

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    or-int/2addr v0, p5

    .line 28
    iget-object v1, p0, Ls0/d;->i:Lsf/b;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-static {v2, v1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, Lfg/s;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    move-object v4, p1

    .line 42
    move-object v5, p2

    .line 43
    move-object v6, p3

    .line 44
    move-object v7, p4

    .line 45
    invoke-interface/range {v3 .. v8}, Lfg/s;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v2, v4

    .line 50
    move-object v3, v5

    .line 51
    move-object v4, v6

    .line 52
    invoke-virtual {v7}, Li0/h0;->t()Li0/r1;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    new-instance v0, Ls0/c;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    move-object v1, p0

    .line 62
    move v5, p5

    .line 63
    invoke-direct/range {v0 .. v6}, Ls0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 67
    .line 68
    :cond_1
    return-object p1
.end method

.method public final f(Li0/h0;I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ls0/d;->g:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls0/d;->j(Li0/h0;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1, v2}, Ls0/i;->a(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    invoke-static {v0, v2}, Ls0/i;->a(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    or-int/2addr p2, v0

    .line 28
    iget-object v0, p0, Ls0/d;->i:Lsf/b;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v0, Lfg/p;

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    new-instance v0, Lm/d2;

    .line 50
    .line 51
    const/16 v6, 0x8

    .line 52
    .line 53
    const/4 v7, 0x2

    .line 54
    const/4 v1, 0x2

    .line 55
    const-class v3, Ls0/d;

    .line 56
    .line 57
    const-string v4, "invoke"

    .line 58
    .line 59
    const-string v5, "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-direct/range {v0 .. v7}, Lm/d2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 66
    .line 67
    :cond_1
    return-object p2
.end method

.method public final g(Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ls0/d;->g:I

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Ls0/d;->j(Li0/h0;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1, v1}, Ls0/i;->a(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    or-int/2addr v0, p3

    .line 27
    iget-object v1, p0, Ls0/d;->i:Lsf/b;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-static {v2, v1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lfg/q;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v1, p1, p2, v0}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    new-instance v1, Li/b1;

    .line 50
    .line 51
    const/4 v2, 0x3

    .line 52
    invoke-direct {v1, p0, p1, p3, v2}, Li/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p2, Li0/r1;->d:Lfg/p;

    .line 56
    .line 57
    :cond_1
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    iget v0, p0, Ls0/d;->g:I

    .line 4
    .line 5
    invoke-virtual {v6, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v6}, Ls0/d;->j(Li0/h0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v6, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x6

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x1

    .line 25
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    or-int v0, p7, v0

    .line 30
    .line 31
    iget-object v1, p0, Ls0/d;->i:Lsf/b;

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    invoke-static {v2, v1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast v1, Lfg/v;

    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    move-object v2, p2

    .line 45
    move-object v3, p3

    .line 46
    move-object v4, p4

    .line 47
    move-object v5, p5

    .line 48
    move-object v0, v1

    .line 49
    move-object v1, p1

    .line 50
    invoke-interface/range {v0 .. v7}, Lfg/v;->a(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Li0/h0;Ljava/lang/Integer;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual/range {p6 .. p6}, Li0/h0;->t()Li0/r1;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    if-eqz v9, :cond_1

    .line 59
    .line 60
    new-instance v1, Lc9/t0;

    .line 61
    .line 62
    move-object v2, p0

    .line 63
    move-object v3, p1

    .line 64
    move-object v4, p2

    .line 65
    move-object v5, p3

    .line 66
    move-object v6, p4

    .line 67
    move-object v7, p5

    .line 68
    move/from16 v8, p7

    .line 69
    .line 70
    invoke-direct/range {v1 .. v8}, Lc9/t0;-><init>(Ls0/d;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iput-object v1, v9, Li0/r1;->d:Lfg/p;

    .line 74
    .line 75
    :cond_1
    return-object v0
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ls0/d;->g:I

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Ls0/d;->j(Li0/h0;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1, v1}, Ls0/i;->a(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    invoke-static {v0, v1}, Ls0/i;->a(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    or-int/2addr v0, p4

    .line 27
    iget-object v1, p0, Ls0/d;->i:Lsf/b;

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    invoke-static {v2, v1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lfg/r;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v1, p1, p2, p3, v0}, Lfg/r;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_1

    .line 48
    .line 49
    new-instance v1, Lb0/r;

    .line 50
    .line 51
    const/16 v6, 0x8

    .line 52
    .line 53
    move-object v2, p0

    .line 54
    move-object v3, p1

    .line 55
    move-object v4, p2

    .line 56
    move v5, p4

    .line 57
    invoke-direct/range {v1 .. v6}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p3, Li0/r1;->d:Lfg/p;

    .line 61
    .line 62
    :cond_1
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li0/h0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Ls0/d;->f(Li0/h0;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final j(Li0/h0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ls0/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Li0/h0;->A()Li0/r1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, v0, Li0/r1;->b:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, v0, Li0/r1;->b:I

    .line 19
    .line 20
    iget-object p1, p0, Ls0/d;->j:Li0/r1;

    .line 21
    .line 22
    invoke-static {p1, v0}, Ls0/i;->f(Li0/r1;Li0/r1;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iput-object v0, p0, Ls0/d;->j:Li0/r1;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Ls0/d;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ls0/d;->k:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Li0/r1;

    .line 58
    .line 59
    invoke-static {v3, v0}, Ls0/i;->f(Li0/r1;Li0/r1;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_4
    return-void
.end method
