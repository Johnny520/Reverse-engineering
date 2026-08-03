.class public final synthetic Lwb/b8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/b8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/b8;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/b8;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0x9

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method

.method private final f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0x15

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/4 p2, 0x4

    .line 97
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    move-object v8, p3

    .line 104
    check-cast v8, Lfg/l;

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/16 v11, 0x1f8

    .line 108
    .line 109
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 121
    .line 122
    .line 123
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 124
    .line 125
    return-object p1
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/4 p2, 0x5

    .line 97
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    move-object v8, p3

    .line 104
    check-cast v8, Lfg/l;

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/16 v11, 0x1f8

    .line 108
    .line 109
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 121
    .line 122
    .line 123
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 124
    .line 125
    return-object p1
.end method

.method private final i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0xd

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method

.method private final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0xa

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method

.method private final k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0x1a

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method

.method private final l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    move-object v9, p2

    .line 4
    check-cast v9, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eq p3, v0, :cond_2

    .line 35
    .line 36
    move p3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p3, 0x0

    .line 39
    :goto_1
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 47
    .line 48
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 49
    .line 50
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1}, Lp/x0;->c()F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    add-float/2addr p2, p3

    .line 65
    invoke-interface {p1}, Lp/x0;->a()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 p3, 0x54

    .line 70
    .line 71
    int-to-float p3, p3

    .line 72
    add-float/2addr p1, p3

    .line 73
    const/4 p3, 0x5

    .line 74
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    sget-object p2, Li0/l;->a:Li0/e;

    .line 91
    .line 92
    if-ne p3, p2, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance p3, Lwb/wj;

    .line 95
    .line 96
    const/16 p2, 0x10

    .line 97
    .line 98
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v8, p3

    .line 105
    check-cast v8, Lfg/l;

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1f8

    .line 109
    .line 110
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/b8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp/x0;

    .line 7
    .line 8
    move-object v9, p2

    .line 9
    check-cast v9, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p3, p2, 0x6

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p2, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-eq p3, v0, :cond_2

    .line 40
    .line 41
    move p3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p3, 0x0

    .line 44
    :goto_1
    and-int/2addr p2, v1

    .line 45
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 52
    .line 53
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 54
    .line 55
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1}, Lp/x0;->c()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/16 p3, 0x8

    .line 67
    .line 68
    int-to-float p3, p3

    .line 69
    add-float/2addr p2, p3

    .line 70
    invoke-interface {p1}, Lp/x0;->a()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/16 p3, 0x54

    .line 75
    .line 76
    int-to-float p3, p3

    .line 77
    add-float/2addr p1, p3

    .line 78
    const/4 p3, 0x5

    .line 79
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    sget-object p2, Li0/l;->a:Li0/e;

    .line 96
    .line 97
    if-ne p3, p2, :cond_4

    .line 98
    .line 99
    :cond_3
    new-instance p3, Lwb/wj;

    .line 100
    .line 101
    const/16 p2, 0x13

    .line 102
    .line 103
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    move-object v8, p3

    .line 110
    check-cast v8, Lfg/l;

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    const/16 v11, 0x1f8

    .line 114
    .line 115
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 130
    .line 131
    return-object p1

    .line 132
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1

    .line 157
    :pswitch_5
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :pswitch_6
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_7
    invoke-direct {p0, p1, p2, p3}, Lwb/b8;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_8
    check-cast p1, Lp/x0;

    .line 173
    .line 174
    move-object v9, p2

    .line 175
    check-cast v9, Li0/h0;

    .line 176
    .line 177
    check-cast p3, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    and-int/lit8 p3, p2, 0x6

    .line 187
    .line 188
    if-nez p3, :cond_7

    .line 189
    .line 190
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    if-eqz p3, :cond_6

    .line 195
    .line 196
    const/4 p3, 0x4

    .line 197
    goto :goto_3

    .line 198
    :cond_6
    const/4 p3, 0x2

    .line 199
    :goto_3
    or-int/2addr p2, p3

    .line 200
    :cond_7
    and-int/lit8 p3, p2, 0x13

    .line 201
    .line 202
    const/16 v0, 0x12

    .line 203
    .line 204
    const/4 v1, 0x1

    .line 205
    if-eq p3, v0, :cond_8

    .line 206
    .line 207
    move p3, v1

    .line 208
    goto :goto_4

    .line 209
    :cond_8
    const/4 p3, 0x0

    .line 210
    :goto_4
    and-int/2addr p2, v1

    .line 211
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_b

    .line 216
    .line 217
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 218
    .line 219
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 220
    .line 221
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {p1}, Lp/x0;->c()F

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    const/16 p3, 0x8

    .line 233
    .line 234
    int-to-float p3, p3

    .line 235
    add-float/2addr p2, p3

    .line 236
    invoke-interface {p1}, Lp/x0;->a()F

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    const/16 p3, 0x54

    .line 241
    .line 242
    int-to-float p3, p3

    .line 243
    add-float/2addr p1, p3

    .line 244
    const/4 p3, 0x5

    .line 245
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 250
    .line 251
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p3

    .line 259
    if-nez p2, :cond_9

    .line 260
    .line 261
    sget-object p2, Li0/l;->a:Li0/e;

    .line 262
    .line 263
    if-ne p3, p2, :cond_a

    .line 264
    .line 265
    :cond_9
    new-instance p3, Lwb/wj;

    .line 266
    .line 267
    const/16 p2, 0x18

    .line 268
    .line 269
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_a
    move-object v8, p3

    .line 276
    check-cast v8, Lfg/l;

    .line 277
    .line 278
    const/4 v10, 0x0

    .line 279
    const/16 v11, 0x1f8

    .line 280
    .line 281
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 282
    .line 283
    const/4 v3, 0x0

    .line 284
    const/4 v4, 0x0

    .line 285
    const/4 v5, 0x0

    .line 286
    const/4 v6, 0x0

    .line 287
    const/4 v7, 0x0

    .line 288
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 293
    .line 294
    .line 295
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 296
    .line 297
    return-object p1

    .line 298
    :pswitch_9
    check-cast p1, Lp/x0;

    .line 299
    .line 300
    move-object v9, p2

    .line 301
    check-cast v9, Li0/h0;

    .line 302
    .line 303
    check-cast p3, Ljava/lang/Integer;

    .line 304
    .line 305
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result p2

    .line 309
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    and-int/lit8 p3, p2, 0x6

    .line 313
    .line 314
    if-nez p3, :cond_d

    .line 315
    .line 316
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p3

    .line 320
    if-eqz p3, :cond_c

    .line 321
    .line 322
    const/4 p3, 0x4

    .line 323
    goto :goto_6

    .line 324
    :cond_c
    const/4 p3, 0x2

    .line 325
    :goto_6
    or-int/2addr p2, p3

    .line 326
    :cond_d
    and-int/lit8 p3, p2, 0x13

    .line 327
    .line 328
    const/16 v0, 0x12

    .line 329
    .line 330
    const/4 v1, 0x1

    .line 331
    if-eq p3, v0, :cond_e

    .line 332
    .line 333
    move p3, v1

    .line 334
    goto :goto_7

    .line 335
    :cond_e
    const/4 p3, 0x0

    .line 336
    :goto_7
    and-int/2addr p2, v1

    .line 337
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 338
    .line 339
    .line 340
    move-result p2

    .line 341
    if-eqz p2, :cond_11

    .line 342
    .line 343
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 344
    .line 345
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 346
    .line 347
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 348
    .line 349
    const/4 v0, 0x0

    .line 350
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-interface {p1}, Lp/x0;->c()F

    .line 355
    .line 356
    .line 357
    move-result p2

    .line 358
    const/16 p3, 0x8

    .line 359
    .line 360
    int-to-float p3, p3

    .line 361
    add-float/2addr p2, p3

    .line 362
    invoke-interface {p1}, Lp/x0;->a()F

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    const/16 p3, 0x54

    .line 367
    .line 368
    int-to-float p3, p3

    .line 369
    add-float/2addr p1, p3

    .line 370
    const/4 p3, 0x5

    .line 371
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 376
    .line 377
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result p2

    .line 381
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p3

    .line 385
    if-nez p2, :cond_f

    .line 386
    .line 387
    sget-object p2, Li0/l;->a:Li0/e;

    .line 388
    .line 389
    if-ne p3, p2, :cond_10

    .line 390
    .line 391
    :cond_f
    new-instance p3, Lwb/wj;

    .line 392
    .line 393
    const/16 p2, 0xc

    .line 394
    .line 395
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_10
    move-object v8, p3

    .line 402
    check-cast v8, Lfg/l;

    .line 403
    .line 404
    const/4 v10, 0x0

    .line 405
    const/16 v11, 0x1f8

    .line 406
    .line 407
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 408
    .line 409
    const/4 v3, 0x0

    .line 410
    const/4 v4, 0x0

    .line 411
    const/4 v5, 0x0

    .line 412
    const/4 v6, 0x0

    .line 413
    const/4 v7, 0x0

    .line 414
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 415
    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_11
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 419
    .line 420
    .line 421
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 422
    .line 423
    return-object p1

    .line 424
    :pswitch_a
    check-cast p1, Lp/x0;

    .line 425
    .line 426
    move-object v9, p2

    .line 427
    check-cast v9, Li0/h0;

    .line 428
    .line 429
    check-cast p3, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result p2

    .line 435
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    and-int/lit8 p3, p2, 0x6

    .line 439
    .line 440
    if-nez p3, :cond_13

    .line 441
    .line 442
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result p3

    .line 446
    if-eqz p3, :cond_12

    .line 447
    .line 448
    const/4 p3, 0x4

    .line 449
    goto :goto_9

    .line 450
    :cond_12
    const/4 p3, 0x2

    .line 451
    :goto_9
    or-int/2addr p2, p3

    .line 452
    :cond_13
    and-int/lit8 p3, p2, 0x13

    .line 453
    .line 454
    const/16 v0, 0x12

    .line 455
    .line 456
    const/4 v1, 0x1

    .line 457
    if-eq p3, v0, :cond_14

    .line 458
    .line 459
    move p3, v1

    .line 460
    goto :goto_a

    .line 461
    :cond_14
    const/4 p3, 0x0

    .line 462
    :goto_a
    and-int/2addr p2, v1

    .line 463
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 464
    .line 465
    .line 466
    move-result p2

    .line 467
    if-eqz p2, :cond_17

    .line 468
    .line 469
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 470
    .line 471
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 472
    .line 473
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 474
    .line 475
    const/4 v0, 0x0

    .line 476
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-interface {p1}, Lp/x0;->c()F

    .line 481
    .line 482
    .line 483
    move-result p2

    .line 484
    const/16 p3, 0x8

    .line 485
    .line 486
    int-to-float p3, p3

    .line 487
    add-float/2addr p2, p3

    .line 488
    invoke-interface {p1}, Lp/x0;->a()F

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    const/16 p3, 0x54

    .line 493
    .line 494
    int-to-float p3, p3

    .line 495
    add-float/2addr p1, p3

    .line 496
    const/4 p3, 0x5

    .line 497
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 502
    .line 503
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result p2

    .line 507
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object p3

    .line 511
    if-nez p2, :cond_15

    .line 512
    .line 513
    sget-object p2, Li0/l;->a:Li0/e;

    .line 514
    .line 515
    if-ne p3, p2, :cond_16

    .line 516
    .line 517
    :cond_15
    new-instance p3, Lwb/wj;

    .line 518
    .line 519
    const/4 p2, 0x0

    .line 520
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :cond_16
    move-object v8, p3

    .line 527
    check-cast v8, Lfg/l;

    .line 528
    .line 529
    const/4 v10, 0x0

    .line 530
    const/16 v11, 0x1f8

    .line 531
    .line 532
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 533
    .line 534
    const/4 v3, 0x0

    .line 535
    const/4 v4, 0x0

    .line 536
    const/4 v5, 0x0

    .line 537
    const/4 v6, 0x0

    .line 538
    const/4 v7, 0x0

    .line 539
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 540
    .line 541
    .line 542
    goto :goto_b

    .line 543
    :cond_17
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 544
    .line 545
    .line 546
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 547
    .line 548
    return-object p1

    .line 549
    :pswitch_b
    check-cast p1, Lp/x0;

    .line 550
    .line 551
    move-object v9, p2

    .line 552
    check-cast v9, Li0/h0;

    .line 553
    .line 554
    check-cast p3, Ljava/lang/Integer;

    .line 555
    .line 556
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result p2

    .line 560
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    and-int/lit8 p3, p2, 0x6

    .line 564
    .line 565
    if-nez p3, :cond_19

    .line 566
    .line 567
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result p3

    .line 571
    if-eqz p3, :cond_18

    .line 572
    .line 573
    const/4 p3, 0x4

    .line 574
    goto :goto_c

    .line 575
    :cond_18
    const/4 p3, 0x2

    .line 576
    :goto_c
    or-int/2addr p2, p3

    .line 577
    :cond_19
    and-int/lit8 p3, p2, 0x13

    .line 578
    .line 579
    const/16 v0, 0x12

    .line 580
    .line 581
    const/4 v1, 0x1

    .line 582
    if-eq p3, v0, :cond_1a

    .line 583
    .line 584
    move p3, v1

    .line 585
    goto :goto_d

    .line 586
    :cond_1a
    const/4 p3, 0x0

    .line 587
    :goto_d
    and-int/2addr p2, v1

    .line 588
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 589
    .line 590
    .line 591
    move-result p2

    .line 592
    if-eqz p2, :cond_1d

    .line 593
    .line 594
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 595
    .line 596
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 597
    .line 598
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 599
    .line 600
    const/4 v0, 0x0

    .line 601
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-interface {p1}, Lp/x0;->c()F

    .line 606
    .line 607
    .line 608
    move-result p2

    .line 609
    const/16 p3, 0x8

    .line 610
    .line 611
    int-to-float p3, p3

    .line 612
    add-float/2addr p2, p3

    .line 613
    invoke-interface {p1}, Lp/x0;->a()F

    .line 614
    .line 615
    .line 616
    move-result p1

    .line 617
    const/16 p3, 0x54

    .line 618
    .line 619
    int-to-float p3, p3

    .line 620
    add-float/2addr p1, p3

    .line 621
    const/4 p3, 0x5

    .line 622
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 627
    .line 628
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result p2

    .line 632
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p3

    .line 636
    if-nez p2, :cond_1b

    .line 637
    .line 638
    sget-object p2, Li0/l;->a:Li0/e;

    .line 639
    .line 640
    if-ne p3, p2, :cond_1c

    .line 641
    .line 642
    :cond_1b
    new-instance p3, Lwb/wj;

    .line 643
    .line 644
    const/4 p2, 0x7

    .line 645
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_1c
    move-object v8, p3

    .line 652
    check-cast v8, Lfg/l;

    .line 653
    .line 654
    const/4 v10, 0x0

    .line 655
    const/16 v11, 0x1f8

    .line 656
    .line 657
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 658
    .line 659
    const/4 v3, 0x0

    .line 660
    const/4 v4, 0x0

    .line 661
    const/4 v5, 0x0

    .line 662
    const/4 v6, 0x0

    .line 663
    const/4 v7, 0x0

    .line 664
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 665
    .line 666
    .line 667
    goto :goto_e

    .line 668
    :cond_1d
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 669
    .line 670
    .line 671
    :goto_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 672
    .line 673
    return-object p1

    .line 674
    :pswitch_c
    check-cast p1, Lp/x0;

    .line 675
    .line 676
    move-object v9, p2

    .line 677
    check-cast v9, Li0/h0;

    .line 678
    .line 679
    check-cast p3, Ljava/lang/Integer;

    .line 680
    .line 681
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 682
    .line 683
    .line 684
    move-result p2

    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    and-int/lit8 p3, p2, 0x6

    .line 689
    .line 690
    if-nez p3, :cond_1f

    .line 691
    .line 692
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result p3

    .line 696
    if-eqz p3, :cond_1e

    .line 697
    .line 698
    const/4 p3, 0x4

    .line 699
    goto :goto_f

    .line 700
    :cond_1e
    const/4 p3, 0x2

    .line 701
    :goto_f
    or-int/2addr p2, p3

    .line 702
    :cond_1f
    and-int/lit8 p3, p2, 0x13

    .line 703
    .line 704
    const/16 v0, 0x12

    .line 705
    .line 706
    const/4 v1, 0x1

    .line 707
    if-eq p3, v0, :cond_20

    .line 708
    .line 709
    move p3, v1

    .line 710
    goto :goto_10

    .line 711
    :cond_20
    const/4 p3, 0x0

    .line 712
    :goto_10
    and-int/2addr p2, v1

    .line 713
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 714
    .line 715
    .line 716
    move-result p2

    .line 717
    if-eqz p2, :cond_23

    .line 718
    .line 719
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 720
    .line 721
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 722
    .line 723
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 724
    .line 725
    const/4 v0, 0x0

    .line 726
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-interface {p1}, Lp/x0;->c()F

    .line 731
    .line 732
    .line 733
    move-result p2

    .line 734
    const/16 p3, 0x8

    .line 735
    .line 736
    int-to-float p3, p3

    .line 737
    add-float/2addr p2, p3

    .line 738
    invoke-interface {p1}, Lp/x0;->a()F

    .line 739
    .line 740
    .line 741
    move-result p1

    .line 742
    const/16 p3, 0x54

    .line 743
    .line 744
    int-to-float p3, p3

    .line 745
    add-float/2addr p1, p3

    .line 746
    const/4 p3, 0x5

    .line 747
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 752
    .line 753
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result p2

    .line 757
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p3

    .line 761
    if-nez p2, :cond_21

    .line 762
    .line 763
    sget-object p2, Li0/l;->a:Li0/e;

    .line 764
    .line 765
    if-ne p3, p2, :cond_22

    .line 766
    .line 767
    :cond_21
    new-instance p3, Lwb/wj;

    .line 768
    .line 769
    const/4 p2, 0x2

    .line 770
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    :cond_22
    move-object v8, p3

    .line 777
    check-cast v8, Lfg/l;

    .line 778
    .line 779
    const/4 v10, 0x0

    .line 780
    const/16 v11, 0x1f8

    .line 781
    .line 782
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 783
    .line 784
    const/4 v3, 0x0

    .line 785
    const/4 v4, 0x0

    .line 786
    const/4 v5, 0x0

    .line 787
    const/4 v6, 0x0

    .line 788
    const/4 v7, 0x0

    .line 789
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 790
    .line 791
    .line 792
    goto :goto_11

    .line 793
    :cond_23
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 794
    .line 795
    .line 796
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 797
    .line 798
    return-object p1

    .line 799
    :pswitch_d
    check-cast p1, Lp/x0;

    .line 800
    .line 801
    move-object v9, p2

    .line 802
    check-cast v9, Li0/h0;

    .line 803
    .line 804
    check-cast p3, Ljava/lang/Integer;

    .line 805
    .line 806
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 807
    .line 808
    .line 809
    move-result p2

    .line 810
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    and-int/lit8 p3, p2, 0x6

    .line 814
    .line 815
    if-nez p3, :cond_25

    .line 816
    .line 817
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result p3

    .line 821
    if-eqz p3, :cond_24

    .line 822
    .line 823
    const/4 p3, 0x4

    .line 824
    goto :goto_12

    .line 825
    :cond_24
    const/4 p3, 0x2

    .line 826
    :goto_12
    or-int/2addr p2, p3

    .line 827
    :cond_25
    and-int/lit8 p3, p2, 0x13

    .line 828
    .line 829
    const/16 v0, 0x12

    .line 830
    .line 831
    const/4 v1, 0x1

    .line 832
    if-eq p3, v0, :cond_26

    .line 833
    .line 834
    move p3, v1

    .line 835
    goto :goto_13

    .line 836
    :cond_26
    const/4 p3, 0x0

    .line 837
    :goto_13
    and-int/2addr p2, v1

    .line 838
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 839
    .line 840
    .line 841
    move-result p2

    .line 842
    if-eqz p2, :cond_29

    .line 843
    .line 844
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 845
    .line 846
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 847
    .line 848
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 849
    .line 850
    const/4 v0, 0x0

    .line 851
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-interface {p1}, Lp/x0;->c()F

    .line 856
    .line 857
    .line 858
    move-result p2

    .line 859
    const/16 p3, 0x8

    .line 860
    .line 861
    int-to-float p3, p3

    .line 862
    add-float/2addr p2, p3

    .line 863
    invoke-interface {p1}, Lp/x0;->a()F

    .line 864
    .line 865
    .line 866
    move-result p1

    .line 867
    const/16 p3, 0x54

    .line 868
    .line 869
    int-to-float p3, p3

    .line 870
    add-float/2addr p1, p3

    .line 871
    const/4 p3, 0x5

    .line 872
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 877
    .line 878
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result p2

    .line 882
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object p3

    .line 886
    if-nez p2, :cond_27

    .line 887
    .line 888
    sget-object p2, Li0/l;->a:Li0/e;

    .line 889
    .line 890
    if-ne p3, p2, :cond_28

    .line 891
    .line 892
    :cond_27
    new-instance p3, Lwb/wj;

    .line 893
    .line 894
    const/16 p2, 0xb

    .line 895
    .line 896
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    :cond_28
    move-object v8, p3

    .line 903
    check-cast v8, Lfg/l;

    .line 904
    .line 905
    const/4 v10, 0x0

    .line 906
    const/16 v11, 0x1f8

    .line 907
    .line 908
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 909
    .line 910
    const/4 v3, 0x0

    .line 911
    const/4 v4, 0x0

    .line 912
    const/4 v5, 0x0

    .line 913
    const/4 v6, 0x0

    .line 914
    const/4 v7, 0x0

    .line 915
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 916
    .line 917
    .line 918
    goto :goto_14

    .line 919
    :cond_29
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 920
    .line 921
    .line 922
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 923
    .line 924
    return-object p1

    .line 925
    :pswitch_e
    check-cast p1, Lp/x0;

    .line 926
    .line 927
    move-object v9, p2

    .line 928
    check-cast v9, Li0/h0;

    .line 929
    .line 930
    check-cast p3, Ljava/lang/Integer;

    .line 931
    .line 932
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 933
    .line 934
    .line 935
    move-result p2

    .line 936
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    and-int/lit8 p3, p2, 0x6

    .line 940
    .line 941
    if-nez p3, :cond_2b

    .line 942
    .line 943
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result p3

    .line 947
    if-eqz p3, :cond_2a

    .line 948
    .line 949
    const/4 p3, 0x4

    .line 950
    goto :goto_15

    .line 951
    :cond_2a
    const/4 p3, 0x2

    .line 952
    :goto_15
    or-int/2addr p2, p3

    .line 953
    :cond_2b
    and-int/lit8 p3, p2, 0x13

    .line 954
    .line 955
    const/16 v0, 0x12

    .line 956
    .line 957
    const/4 v1, 0x1

    .line 958
    if-eq p3, v0, :cond_2c

    .line 959
    .line 960
    move p3, v1

    .line 961
    goto :goto_16

    .line 962
    :cond_2c
    const/4 p3, 0x0

    .line 963
    :goto_16
    and-int/2addr p2, v1

    .line 964
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 965
    .line 966
    .line 967
    move-result p2

    .line 968
    if-eqz p2, :cond_2f

    .line 969
    .line 970
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 971
    .line 972
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 973
    .line 974
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 975
    .line 976
    const/4 v0, 0x0

    .line 977
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-interface {p1}, Lp/x0;->c()F

    .line 982
    .line 983
    .line 984
    move-result p2

    .line 985
    const/16 p3, 0x8

    .line 986
    .line 987
    int-to-float p3, p3

    .line 988
    add-float/2addr p2, p3

    .line 989
    invoke-interface {p1}, Lp/x0;->a()F

    .line 990
    .line 991
    .line 992
    move-result p1

    .line 993
    const/16 p3, 0x54

    .line 994
    .line 995
    int-to-float p3, p3

    .line 996
    add-float/2addr p1, p3

    .line 997
    const/4 p3, 0x5

    .line 998
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1003
    .line 1004
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result p2

    .line 1008
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object p3

    .line 1012
    if-nez p2, :cond_2d

    .line 1013
    .line 1014
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1015
    .line 1016
    if-ne p3, p2, :cond_2e

    .line 1017
    .line 1018
    :cond_2d
    new-instance p3, Lwb/wj;

    .line 1019
    .line 1020
    const/16 p2, 0x14

    .line 1021
    .line 1022
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    :cond_2e
    move-object v8, p3

    .line 1029
    check-cast v8, Lfg/l;

    .line 1030
    .line 1031
    const/4 v10, 0x0

    .line 1032
    const/16 v11, 0x1f8

    .line 1033
    .line 1034
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1035
    .line 1036
    const/4 v3, 0x0

    .line 1037
    const/4 v4, 0x0

    .line 1038
    const/4 v5, 0x0

    .line 1039
    const/4 v6, 0x0

    .line 1040
    const/4 v7, 0x0

    .line 1041
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1042
    .line 1043
    .line 1044
    goto :goto_17

    .line 1045
    :cond_2f
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1046
    .line 1047
    .line 1048
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1049
    .line 1050
    return-object p1

    .line 1051
    :pswitch_f
    check-cast p1, Lp/x0;

    .line 1052
    .line 1053
    move-object v9, p2

    .line 1054
    check-cast v9, Li0/h0;

    .line 1055
    .line 1056
    check-cast p3, Ljava/lang/Integer;

    .line 1057
    .line 1058
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1059
    .line 1060
    .line 1061
    move-result p2

    .line 1062
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    and-int/lit8 p3, p2, 0x6

    .line 1066
    .line 1067
    if-nez p3, :cond_31

    .line 1068
    .line 1069
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result p3

    .line 1073
    if-eqz p3, :cond_30

    .line 1074
    .line 1075
    const/4 p3, 0x4

    .line 1076
    goto :goto_18

    .line 1077
    :cond_30
    const/4 p3, 0x2

    .line 1078
    :goto_18
    or-int/2addr p2, p3

    .line 1079
    :cond_31
    and-int/lit8 p3, p2, 0x13

    .line 1080
    .line 1081
    const/16 v0, 0x12

    .line 1082
    .line 1083
    const/4 v1, 0x1

    .line 1084
    if-eq p3, v0, :cond_32

    .line 1085
    .line 1086
    move p3, v1

    .line 1087
    goto :goto_19

    .line 1088
    :cond_32
    const/4 p3, 0x0

    .line 1089
    :goto_19
    and-int/2addr p2, v1

    .line 1090
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1091
    .line 1092
    .line 1093
    move-result p2

    .line 1094
    if-eqz p2, :cond_35

    .line 1095
    .line 1096
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1097
    .line 1098
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1099
    .line 1100
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1101
    .line 1102
    const/4 v0, 0x0

    .line 1103
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1108
    .line 1109
    .line 1110
    move-result p2

    .line 1111
    const/16 p3, 0x8

    .line 1112
    .line 1113
    int-to-float p3, p3

    .line 1114
    add-float/2addr p2, p3

    .line 1115
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1116
    .line 1117
    .line 1118
    move-result p1

    .line 1119
    const/16 p3, 0x54

    .line 1120
    .line 1121
    int-to-float p3, p3

    .line 1122
    add-float/2addr p1, p3

    .line 1123
    const/4 p3, 0x5

    .line 1124
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1129
    .line 1130
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result p2

    .line 1134
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object p3

    .line 1138
    if-nez p2, :cond_33

    .line 1139
    .line 1140
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1141
    .line 1142
    if-ne p3, p2, :cond_34

    .line 1143
    .line 1144
    :cond_33
    new-instance p3, Lwb/wj;

    .line 1145
    .line 1146
    const/16 p2, 0xe

    .line 1147
    .line 1148
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1152
    .line 1153
    .line 1154
    :cond_34
    move-object v8, p3

    .line 1155
    check-cast v8, Lfg/l;

    .line 1156
    .line 1157
    const/4 v10, 0x0

    .line 1158
    const/16 v11, 0x1f8

    .line 1159
    .line 1160
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1161
    .line 1162
    const/4 v3, 0x0

    .line 1163
    const/4 v4, 0x0

    .line 1164
    const/4 v5, 0x0

    .line 1165
    const/4 v6, 0x0

    .line 1166
    const/4 v7, 0x0

    .line 1167
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1168
    .line 1169
    .line 1170
    goto :goto_1a

    .line 1171
    :cond_35
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1172
    .line 1173
    .line 1174
    :goto_1a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1175
    .line 1176
    return-object p1

    .line 1177
    :pswitch_10
    check-cast p1, Lp/x0;

    .line 1178
    .line 1179
    move-object v9, p2

    .line 1180
    check-cast v9, Li0/h0;

    .line 1181
    .line 1182
    check-cast p3, Ljava/lang/Integer;

    .line 1183
    .line 1184
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1185
    .line 1186
    .line 1187
    move-result p2

    .line 1188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    and-int/lit8 p3, p2, 0x6

    .line 1192
    .line 1193
    if-nez p3, :cond_37

    .line 1194
    .line 1195
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result p3

    .line 1199
    if-eqz p3, :cond_36

    .line 1200
    .line 1201
    const/4 p3, 0x4

    .line 1202
    goto :goto_1b

    .line 1203
    :cond_36
    const/4 p3, 0x2

    .line 1204
    :goto_1b
    or-int/2addr p2, p3

    .line 1205
    :cond_37
    and-int/lit8 p3, p2, 0x13

    .line 1206
    .line 1207
    const/16 v0, 0x12

    .line 1208
    .line 1209
    const/4 v1, 0x1

    .line 1210
    if-eq p3, v0, :cond_38

    .line 1211
    .line 1212
    move p3, v1

    .line 1213
    goto :goto_1c

    .line 1214
    :cond_38
    const/4 p3, 0x0

    .line 1215
    :goto_1c
    and-int/2addr p2, v1

    .line 1216
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1217
    .line 1218
    .line 1219
    move-result p2

    .line 1220
    if-eqz p2, :cond_3b

    .line 1221
    .line 1222
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1223
    .line 1224
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1225
    .line 1226
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1227
    .line 1228
    const/4 v0, 0x0

    .line 1229
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1234
    .line 1235
    .line 1236
    move-result p2

    .line 1237
    const/16 p3, 0x8

    .line 1238
    .line 1239
    int-to-float p3, p3

    .line 1240
    add-float/2addr p2, p3

    .line 1241
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1242
    .line 1243
    .line 1244
    move-result p1

    .line 1245
    const/16 p3, 0x54

    .line 1246
    .line 1247
    int-to-float p3, p3

    .line 1248
    add-float/2addr p1, p3

    .line 1249
    const/4 p3, 0x5

    .line 1250
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v2

    .line 1254
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1255
    .line 1256
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result p2

    .line 1260
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object p3

    .line 1264
    if-nez p2, :cond_39

    .line 1265
    .line 1266
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1267
    .line 1268
    if-ne p3, p2, :cond_3a

    .line 1269
    .line 1270
    :cond_39
    new-instance p3, Lwb/wj;

    .line 1271
    .line 1272
    const/16 p2, 0x19

    .line 1273
    .line 1274
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1278
    .line 1279
    .line 1280
    :cond_3a
    move-object v8, p3

    .line 1281
    check-cast v8, Lfg/l;

    .line 1282
    .line 1283
    const/4 v10, 0x0

    .line 1284
    const/16 v11, 0x1f8

    .line 1285
    .line 1286
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1287
    .line 1288
    const/4 v3, 0x0

    .line 1289
    const/4 v4, 0x0

    .line 1290
    const/4 v5, 0x0

    .line 1291
    const/4 v6, 0x0

    .line 1292
    const/4 v7, 0x0

    .line 1293
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_1d

    .line 1297
    :cond_3b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1298
    .line 1299
    .line 1300
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1301
    .line 1302
    return-object p1

    .line 1303
    :pswitch_11
    check-cast p1, Lp/x0;

    .line 1304
    .line 1305
    move-object v9, p2

    .line 1306
    check-cast v9, Li0/h0;

    .line 1307
    .line 1308
    check-cast p3, Ljava/lang/Integer;

    .line 1309
    .line 1310
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1311
    .line 1312
    .line 1313
    move-result p2

    .line 1314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    and-int/lit8 p3, p2, 0x6

    .line 1318
    .line 1319
    if-nez p3, :cond_3d

    .line 1320
    .line 1321
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1322
    .line 1323
    .line 1324
    move-result p3

    .line 1325
    if-eqz p3, :cond_3c

    .line 1326
    .line 1327
    const/4 p3, 0x4

    .line 1328
    goto :goto_1e

    .line 1329
    :cond_3c
    const/4 p3, 0x2

    .line 1330
    :goto_1e
    or-int/2addr p2, p3

    .line 1331
    :cond_3d
    and-int/lit8 p3, p2, 0x13

    .line 1332
    .line 1333
    const/16 v0, 0x12

    .line 1334
    .line 1335
    const/4 v1, 0x1

    .line 1336
    if-eq p3, v0, :cond_3e

    .line 1337
    .line 1338
    move p3, v1

    .line 1339
    goto :goto_1f

    .line 1340
    :cond_3e
    const/4 p3, 0x0

    .line 1341
    :goto_1f
    and-int/2addr p2, v1

    .line 1342
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1343
    .line 1344
    .line 1345
    move-result p2

    .line 1346
    if-eqz p2, :cond_41

    .line 1347
    .line 1348
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1349
    .line 1350
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1351
    .line 1352
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1353
    .line 1354
    const/4 v0, 0x0

    .line 1355
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1360
    .line 1361
    .line 1362
    move-result p2

    .line 1363
    const/16 p3, 0x8

    .line 1364
    .line 1365
    int-to-float p3, p3

    .line 1366
    add-float/2addr p2, p3

    .line 1367
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1368
    .line 1369
    .line 1370
    move-result p1

    .line 1371
    const/16 p3, 0x54

    .line 1372
    .line 1373
    int-to-float p3, p3

    .line 1374
    add-float/2addr p1, p3

    .line 1375
    const/4 p3, 0x5

    .line 1376
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v2

    .line 1380
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1381
    .line 1382
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result p2

    .line 1386
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object p3

    .line 1390
    if-nez p2, :cond_3f

    .line 1391
    .line 1392
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1393
    .line 1394
    if-ne p3, p2, :cond_40

    .line 1395
    .line 1396
    :cond_3f
    new-instance p3, Lwb/wj;

    .line 1397
    .line 1398
    const/16 p2, 0x16

    .line 1399
    .line 1400
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1404
    .line 1405
    .line 1406
    :cond_40
    move-object v8, p3

    .line 1407
    check-cast v8, Lfg/l;

    .line 1408
    .line 1409
    const/4 v10, 0x0

    .line 1410
    const/16 v11, 0x1f8

    .line 1411
    .line 1412
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1413
    .line 1414
    const/4 v3, 0x0

    .line 1415
    const/4 v4, 0x0

    .line 1416
    const/4 v5, 0x0

    .line 1417
    const/4 v6, 0x0

    .line 1418
    const/4 v7, 0x0

    .line 1419
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1420
    .line 1421
    .line 1422
    goto :goto_20

    .line 1423
    :cond_41
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1424
    .line 1425
    .line 1426
    :goto_20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1427
    .line 1428
    return-object p1

    .line 1429
    :pswitch_12
    check-cast p1, Lp/x0;

    .line 1430
    .line 1431
    move-object v9, p2

    .line 1432
    check-cast v9, Li0/h0;

    .line 1433
    .line 1434
    check-cast p3, Ljava/lang/Integer;

    .line 1435
    .line 1436
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1437
    .line 1438
    .line 1439
    move-result p2

    .line 1440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1441
    .line 1442
    .line 1443
    and-int/lit8 p3, p2, 0x6

    .line 1444
    .line 1445
    if-nez p3, :cond_43

    .line 1446
    .line 1447
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1448
    .line 1449
    .line 1450
    move-result p3

    .line 1451
    if-eqz p3, :cond_42

    .line 1452
    .line 1453
    const/4 p3, 0x4

    .line 1454
    goto :goto_21

    .line 1455
    :cond_42
    const/4 p3, 0x2

    .line 1456
    :goto_21
    or-int/2addr p2, p3

    .line 1457
    :cond_43
    and-int/lit8 p3, p2, 0x13

    .line 1458
    .line 1459
    const/16 v0, 0x12

    .line 1460
    .line 1461
    const/4 v1, 0x1

    .line 1462
    if-eq p3, v0, :cond_44

    .line 1463
    .line 1464
    move p3, v1

    .line 1465
    goto :goto_22

    .line 1466
    :cond_44
    const/4 p3, 0x0

    .line 1467
    :goto_22
    and-int/2addr p2, v1

    .line 1468
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1469
    .line 1470
    .line 1471
    move-result p2

    .line 1472
    if-eqz p2, :cond_47

    .line 1473
    .line 1474
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1475
    .line 1476
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1477
    .line 1478
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1479
    .line 1480
    const/4 v0, 0x0

    .line 1481
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v0

    .line 1485
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1486
    .line 1487
    .line 1488
    move-result p2

    .line 1489
    const/16 p3, 0x8

    .line 1490
    .line 1491
    int-to-float p3, p3

    .line 1492
    add-float/2addr p2, p3

    .line 1493
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1494
    .line 1495
    .line 1496
    move-result p1

    .line 1497
    const/16 p3, 0x54

    .line 1498
    .line 1499
    int-to-float p3, p3

    .line 1500
    add-float/2addr p1, p3

    .line 1501
    const/4 p3, 0x5

    .line 1502
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v2

    .line 1506
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1507
    .line 1508
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1509
    .line 1510
    .line 1511
    move-result p2

    .line 1512
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object p3

    .line 1516
    if-nez p2, :cond_45

    .line 1517
    .line 1518
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1519
    .line 1520
    if-ne p3, p2, :cond_46

    .line 1521
    .line 1522
    :cond_45
    new-instance p3, Lwb/wj;

    .line 1523
    .line 1524
    const/16 p2, 0x17

    .line 1525
    .line 1526
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1530
    .line 1531
    .line 1532
    :cond_46
    move-object v8, p3

    .line 1533
    check-cast v8, Lfg/l;

    .line 1534
    .line 1535
    const/4 v10, 0x0

    .line 1536
    const/16 v11, 0x1f8

    .line 1537
    .line 1538
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1539
    .line 1540
    const/4 v3, 0x0

    .line 1541
    const/4 v4, 0x0

    .line 1542
    const/4 v5, 0x0

    .line 1543
    const/4 v6, 0x0

    .line 1544
    const/4 v7, 0x0

    .line 1545
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1546
    .line 1547
    .line 1548
    goto :goto_23

    .line 1549
    :cond_47
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1550
    .line 1551
    .line 1552
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1553
    .line 1554
    return-object p1

    .line 1555
    :pswitch_13
    check-cast p1, Lp/x0;

    .line 1556
    .line 1557
    move-object v9, p2

    .line 1558
    check-cast v9, Li0/h0;

    .line 1559
    .line 1560
    check-cast p3, Ljava/lang/Integer;

    .line 1561
    .line 1562
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1563
    .line 1564
    .line 1565
    move-result p2

    .line 1566
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1567
    .line 1568
    .line 1569
    and-int/lit8 p3, p2, 0x6

    .line 1570
    .line 1571
    if-nez p3, :cond_49

    .line 1572
    .line 1573
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result p3

    .line 1577
    if-eqz p3, :cond_48

    .line 1578
    .line 1579
    const/4 p3, 0x4

    .line 1580
    goto :goto_24

    .line 1581
    :cond_48
    const/4 p3, 0x2

    .line 1582
    :goto_24
    or-int/2addr p2, p3

    .line 1583
    :cond_49
    and-int/lit8 p3, p2, 0x13

    .line 1584
    .line 1585
    const/16 v0, 0x12

    .line 1586
    .line 1587
    const/4 v1, 0x1

    .line 1588
    if-eq p3, v0, :cond_4a

    .line 1589
    .line 1590
    move p3, v1

    .line 1591
    goto :goto_25

    .line 1592
    :cond_4a
    const/4 p3, 0x0

    .line 1593
    :goto_25
    and-int/2addr p2, v1

    .line 1594
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1595
    .line 1596
    .line 1597
    move-result p2

    .line 1598
    if-eqz p2, :cond_4d

    .line 1599
    .line 1600
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1601
    .line 1602
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1603
    .line 1604
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1605
    .line 1606
    const/4 v0, 0x0

    .line 1607
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1612
    .line 1613
    .line 1614
    move-result p2

    .line 1615
    const/16 p3, 0x8

    .line 1616
    .line 1617
    int-to-float p3, p3

    .line 1618
    add-float/2addr p2, p3

    .line 1619
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1620
    .line 1621
    .line 1622
    move-result p1

    .line 1623
    const/16 p3, 0x54

    .line 1624
    .line 1625
    int-to-float p3, p3

    .line 1626
    add-float/2addr p1, p3

    .line 1627
    const/4 p3, 0x5

    .line 1628
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1633
    .line 1634
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1635
    .line 1636
    .line 1637
    move-result p2

    .line 1638
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    move-result-object p3

    .line 1642
    if-nez p2, :cond_4b

    .line 1643
    .line 1644
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1645
    .line 1646
    if-ne p3, p2, :cond_4c

    .line 1647
    .line 1648
    :cond_4b
    new-instance p3, Lwb/wj;

    .line 1649
    .line 1650
    const/16 p2, 0x1b

    .line 1651
    .line 1652
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1656
    .line 1657
    .line 1658
    :cond_4c
    move-object v8, p3

    .line 1659
    check-cast v8, Lfg/l;

    .line 1660
    .line 1661
    const/4 v10, 0x0

    .line 1662
    const/16 v11, 0x1f8

    .line 1663
    .line 1664
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1665
    .line 1666
    const/4 v3, 0x0

    .line 1667
    const/4 v4, 0x0

    .line 1668
    const/4 v5, 0x0

    .line 1669
    const/4 v6, 0x0

    .line 1670
    const/4 v7, 0x0

    .line 1671
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1672
    .line 1673
    .line 1674
    goto :goto_26

    .line 1675
    :cond_4d
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1676
    .line 1677
    .line 1678
    :goto_26
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1679
    .line 1680
    return-object p1

    .line 1681
    :pswitch_14
    check-cast p1, Lp/x0;

    .line 1682
    .line 1683
    move-object v9, p2

    .line 1684
    check-cast v9, Li0/h0;

    .line 1685
    .line 1686
    check-cast p3, Ljava/lang/Integer;

    .line 1687
    .line 1688
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1689
    .line 1690
    .line 1691
    move-result p2

    .line 1692
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1693
    .line 1694
    .line 1695
    and-int/lit8 p3, p2, 0x6

    .line 1696
    .line 1697
    if-nez p3, :cond_4f

    .line 1698
    .line 1699
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1700
    .line 1701
    .line 1702
    move-result p3

    .line 1703
    if-eqz p3, :cond_4e

    .line 1704
    .line 1705
    const/4 p3, 0x4

    .line 1706
    goto :goto_27

    .line 1707
    :cond_4e
    const/4 p3, 0x2

    .line 1708
    :goto_27
    or-int/2addr p2, p3

    .line 1709
    :cond_4f
    and-int/lit8 p3, p2, 0x13

    .line 1710
    .line 1711
    const/16 v0, 0x12

    .line 1712
    .line 1713
    const/4 v1, 0x1

    .line 1714
    if-eq p3, v0, :cond_50

    .line 1715
    .line 1716
    move p3, v1

    .line 1717
    goto :goto_28

    .line 1718
    :cond_50
    const/4 p3, 0x0

    .line 1719
    :goto_28
    and-int/2addr p2, v1

    .line 1720
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1721
    .line 1722
    .line 1723
    move-result p2

    .line 1724
    if-eqz p2, :cond_53

    .line 1725
    .line 1726
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1727
    .line 1728
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1729
    .line 1730
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1731
    .line 1732
    const/4 v0, 0x0

    .line 1733
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1738
    .line 1739
    .line 1740
    move-result p2

    .line 1741
    const/16 p3, 0x8

    .line 1742
    .line 1743
    int-to-float p3, p3

    .line 1744
    add-float/2addr p2, p3

    .line 1745
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1746
    .line 1747
    .line 1748
    move-result p1

    .line 1749
    const/16 p3, 0x54

    .line 1750
    .line 1751
    int-to-float p3, p3

    .line 1752
    add-float/2addr p1, p3

    .line 1753
    const/4 p3, 0x5

    .line 1754
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v2

    .line 1758
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1759
    .line 1760
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1761
    .line 1762
    .line 1763
    move-result p2

    .line 1764
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object p3

    .line 1768
    if-nez p2, :cond_51

    .line 1769
    .line 1770
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1771
    .line 1772
    if-ne p3, p2, :cond_52

    .line 1773
    .line 1774
    :cond_51
    new-instance p3, Lwb/wj;

    .line 1775
    .line 1776
    const/16 p2, 0xf

    .line 1777
    .line 1778
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1782
    .line 1783
    .line 1784
    :cond_52
    move-object v8, p3

    .line 1785
    check-cast v8, Lfg/l;

    .line 1786
    .line 1787
    const/4 v10, 0x0

    .line 1788
    const/16 v11, 0x1f8

    .line 1789
    .line 1790
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1791
    .line 1792
    const/4 v3, 0x0

    .line 1793
    const/4 v4, 0x0

    .line 1794
    const/4 v5, 0x0

    .line 1795
    const/4 v6, 0x0

    .line 1796
    const/4 v7, 0x0

    .line 1797
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1798
    .line 1799
    .line 1800
    goto :goto_29

    .line 1801
    :cond_53
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1802
    .line 1803
    .line 1804
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1805
    .line 1806
    return-object p1

    .line 1807
    :pswitch_15
    check-cast p1, Lp/x0;

    .line 1808
    .line 1809
    move-object v9, p2

    .line 1810
    check-cast v9, Li0/h0;

    .line 1811
    .line 1812
    check-cast p3, Ljava/lang/Integer;

    .line 1813
    .line 1814
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1815
    .line 1816
    .line 1817
    move-result p2

    .line 1818
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    and-int/lit8 p3, p2, 0x6

    .line 1822
    .line 1823
    if-nez p3, :cond_55

    .line 1824
    .line 1825
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1826
    .line 1827
    .line 1828
    move-result p3

    .line 1829
    if-eqz p3, :cond_54

    .line 1830
    .line 1831
    const/4 p3, 0x4

    .line 1832
    goto :goto_2a

    .line 1833
    :cond_54
    const/4 p3, 0x2

    .line 1834
    :goto_2a
    or-int/2addr p2, p3

    .line 1835
    :cond_55
    and-int/lit8 p3, p2, 0x13

    .line 1836
    .line 1837
    const/16 v0, 0x12

    .line 1838
    .line 1839
    const/4 v1, 0x1

    .line 1840
    if-eq p3, v0, :cond_56

    .line 1841
    .line 1842
    move p3, v1

    .line 1843
    goto :goto_2b

    .line 1844
    :cond_56
    const/4 p3, 0x0

    .line 1845
    :goto_2b
    and-int/2addr p2, v1

    .line 1846
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1847
    .line 1848
    .line 1849
    move-result p2

    .line 1850
    if-eqz p2, :cond_59

    .line 1851
    .line 1852
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1853
    .line 1854
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1855
    .line 1856
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1857
    .line 1858
    const/4 v0, 0x0

    .line 1859
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1864
    .line 1865
    .line 1866
    move-result p2

    .line 1867
    const/16 p3, 0x8

    .line 1868
    .line 1869
    int-to-float p3, p3

    .line 1870
    add-float/2addr p2, p3

    .line 1871
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1872
    .line 1873
    .line 1874
    move-result p1

    .line 1875
    const/16 p3, 0x54

    .line 1876
    .line 1877
    int-to-float p3, p3

    .line 1878
    add-float/2addr p1, p3

    .line 1879
    const/4 p3, 0x5

    .line 1880
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v2

    .line 1884
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 1885
    .line 1886
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1887
    .line 1888
    .line 1889
    move-result p2

    .line 1890
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object p3

    .line 1894
    if-nez p2, :cond_57

    .line 1895
    .line 1896
    sget-object p2, Li0/l;->a:Li0/e;

    .line 1897
    .line 1898
    if-ne p3, p2, :cond_58

    .line 1899
    .line 1900
    :cond_57
    new-instance p3, Lwb/wj;

    .line 1901
    .line 1902
    const/4 p2, 0x3

    .line 1903
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1904
    .line 1905
    .line 1906
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1907
    .line 1908
    .line 1909
    :cond_58
    move-object v8, p3

    .line 1910
    check-cast v8, Lfg/l;

    .line 1911
    .line 1912
    const/4 v10, 0x0

    .line 1913
    const/16 v11, 0x1f8

    .line 1914
    .line 1915
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 1916
    .line 1917
    const/4 v3, 0x0

    .line 1918
    const/4 v4, 0x0

    .line 1919
    const/4 v5, 0x0

    .line 1920
    const/4 v6, 0x0

    .line 1921
    const/4 v7, 0x0

    .line 1922
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 1923
    .line 1924
    .line 1925
    goto :goto_2c

    .line 1926
    :cond_59
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1927
    .line 1928
    .line 1929
    :goto_2c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1930
    .line 1931
    return-object p1

    .line 1932
    :pswitch_16
    check-cast p1, Lp/x0;

    .line 1933
    .line 1934
    move-object v9, p2

    .line 1935
    check-cast v9, Li0/h0;

    .line 1936
    .line 1937
    check-cast p3, Ljava/lang/Integer;

    .line 1938
    .line 1939
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1940
    .line 1941
    .line 1942
    move-result p2

    .line 1943
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1944
    .line 1945
    .line 1946
    and-int/lit8 p3, p2, 0x6

    .line 1947
    .line 1948
    if-nez p3, :cond_5b

    .line 1949
    .line 1950
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1951
    .line 1952
    .line 1953
    move-result p3

    .line 1954
    if-eqz p3, :cond_5a

    .line 1955
    .line 1956
    const/4 p3, 0x4

    .line 1957
    goto :goto_2d

    .line 1958
    :cond_5a
    const/4 p3, 0x2

    .line 1959
    :goto_2d
    or-int/2addr p2, p3

    .line 1960
    :cond_5b
    and-int/lit8 p3, p2, 0x13

    .line 1961
    .line 1962
    const/16 v0, 0x12

    .line 1963
    .line 1964
    const/4 v1, 0x1

    .line 1965
    if-eq p3, v0, :cond_5c

    .line 1966
    .line 1967
    move p3, v1

    .line 1968
    goto :goto_2e

    .line 1969
    :cond_5c
    const/4 p3, 0x0

    .line 1970
    :goto_2e
    and-int/2addr p2, v1

    .line 1971
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 1972
    .line 1973
    .line 1974
    move-result p2

    .line 1975
    if-eqz p2, :cond_5f

    .line 1976
    .line 1977
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 1978
    .line 1979
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 1980
    .line 1981
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 1982
    .line 1983
    const/4 v0, 0x0

    .line 1984
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v0

    .line 1988
    invoke-interface {p1}, Lp/x0;->c()F

    .line 1989
    .line 1990
    .line 1991
    move-result p2

    .line 1992
    const/16 p3, 0x8

    .line 1993
    .line 1994
    int-to-float p3, p3

    .line 1995
    add-float/2addr p2, p3

    .line 1996
    invoke-interface {p1}, Lp/x0;->a()F

    .line 1997
    .line 1998
    .line 1999
    move-result p1

    .line 2000
    const/16 p3, 0x54

    .line 2001
    .line 2002
    int-to-float p3, p3

    .line 2003
    add-float/2addr p1, p3

    .line 2004
    const/4 p3, 0x5

    .line 2005
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v2

    .line 2009
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 2010
    .line 2011
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result p2

    .line 2015
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 2016
    .line 2017
    .line 2018
    move-result-object p3

    .line 2019
    if-nez p2, :cond_5d

    .line 2020
    .line 2021
    sget-object p2, Li0/l;->a:Li0/e;

    .line 2022
    .line 2023
    if-ne p3, p2, :cond_5e

    .line 2024
    .line 2025
    :cond_5d
    new-instance p3, Lwb/wj;

    .line 2026
    .line 2027
    const/16 p2, 0x12

    .line 2028
    .line 2029
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 2030
    .line 2031
    .line 2032
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2033
    .line 2034
    .line 2035
    :cond_5e
    move-object v8, p3

    .line 2036
    check-cast v8, Lfg/l;

    .line 2037
    .line 2038
    const/4 v10, 0x0

    .line 2039
    const/16 v11, 0x1f8

    .line 2040
    .line 2041
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 2042
    .line 2043
    const/4 v3, 0x0

    .line 2044
    const/4 v4, 0x0

    .line 2045
    const/4 v5, 0x0

    .line 2046
    const/4 v6, 0x0

    .line 2047
    const/4 v7, 0x0

    .line 2048
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 2049
    .line 2050
    .line 2051
    goto :goto_2f

    .line 2052
    :cond_5f
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 2053
    .line 2054
    .line 2055
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 2056
    .line 2057
    return-object p1

    .line 2058
    :pswitch_17
    check-cast p1, Lp/x0;

    .line 2059
    .line 2060
    move-object v9, p2

    .line 2061
    check-cast v9, Li0/h0;

    .line 2062
    .line 2063
    check-cast p3, Ljava/lang/Integer;

    .line 2064
    .line 2065
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 2066
    .line 2067
    .line 2068
    move-result p2

    .line 2069
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2070
    .line 2071
    .line 2072
    and-int/lit8 p3, p2, 0x6

    .line 2073
    .line 2074
    if-nez p3, :cond_61

    .line 2075
    .line 2076
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2077
    .line 2078
    .line 2079
    move-result p3

    .line 2080
    if-eqz p3, :cond_60

    .line 2081
    .line 2082
    const/4 p3, 0x4

    .line 2083
    goto :goto_30

    .line 2084
    :cond_60
    const/4 p3, 0x2

    .line 2085
    :goto_30
    or-int/2addr p2, p3

    .line 2086
    :cond_61
    and-int/lit8 p3, p2, 0x13

    .line 2087
    .line 2088
    const/16 v0, 0x12

    .line 2089
    .line 2090
    const/4 v1, 0x1

    .line 2091
    if-eq p3, v0, :cond_62

    .line 2092
    .line 2093
    move p3, v1

    .line 2094
    goto :goto_31

    .line 2095
    :cond_62
    const/4 p3, 0x0

    .line 2096
    :goto_31
    and-int/2addr p2, v1

    .line 2097
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 2098
    .line 2099
    .line 2100
    move-result p2

    .line 2101
    if-eqz p2, :cond_65

    .line 2102
    .line 2103
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 2104
    .line 2105
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 2106
    .line 2107
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 2108
    .line 2109
    const/4 v0, 0x0

    .line 2110
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v0

    .line 2114
    invoke-interface {p1}, Lp/x0;->c()F

    .line 2115
    .line 2116
    .line 2117
    move-result p2

    .line 2118
    const/16 p3, 0x8

    .line 2119
    .line 2120
    int-to-float p3, p3

    .line 2121
    add-float/2addr p2, p3

    .line 2122
    invoke-interface {p1}, Lp/x0;->a()F

    .line 2123
    .line 2124
    .line 2125
    move-result p1

    .line 2126
    const/16 p3, 0x54

    .line 2127
    .line 2128
    int-to-float p3, p3

    .line 2129
    add-float/2addr p1, p3

    .line 2130
    const/4 p3, 0x5

    .line 2131
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v2

    .line 2135
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 2136
    .line 2137
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2138
    .line 2139
    .line 2140
    move-result p2

    .line 2141
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    move-result-object p3

    .line 2145
    if-nez p2, :cond_63

    .line 2146
    .line 2147
    sget-object p2, Li0/l;->a:Li0/e;

    .line 2148
    .line 2149
    if-ne p3, p2, :cond_64

    .line 2150
    .line 2151
    :cond_63
    new-instance p3, Lwb/wj;

    .line 2152
    .line 2153
    const/16 p2, 0x8

    .line 2154
    .line 2155
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 2156
    .line 2157
    .line 2158
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2159
    .line 2160
    .line 2161
    :cond_64
    move-object v8, p3

    .line 2162
    check-cast v8, Lfg/l;

    .line 2163
    .line 2164
    const/4 v10, 0x0

    .line 2165
    const/16 v11, 0x1f8

    .line 2166
    .line 2167
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 2168
    .line 2169
    const/4 v3, 0x0

    .line 2170
    const/4 v4, 0x0

    .line 2171
    const/4 v5, 0x0

    .line 2172
    const/4 v6, 0x0

    .line 2173
    const/4 v7, 0x0

    .line 2174
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 2175
    .line 2176
    .line 2177
    goto :goto_32

    .line 2178
    :cond_65
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 2179
    .line 2180
    .line 2181
    :goto_32
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 2182
    .line 2183
    return-object p1

    .line 2184
    :pswitch_18
    check-cast p1, Lp/x0;

    .line 2185
    .line 2186
    move-object v9, p2

    .line 2187
    check-cast v9, Li0/h0;

    .line 2188
    .line 2189
    check-cast p3, Ljava/lang/Integer;

    .line 2190
    .line 2191
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 2192
    .line 2193
    .line 2194
    move-result p2

    .line 2195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    and-int/lit8 p3, p2, 0x6

    .line 2199
    .line 2200
    if-nez p3, :cond_67

    .line 2201
    .line 2202
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2203
    .line 2204
    .line 2205
    move-result p3

    .line 2206
    if-eqz p3, :cond_66

    .line 2207
    .line 2208
    const/4 p3, 0x4

    .line 2209
    goto :goto_33

    .line 2210
    :cond_66
    const/4 p3, 0x2

    .line 2211
    :goto_33
    or-int/2addr p2, p3

    .line 2212
    :cond_67
    and-int/lit8 p3, p2, 0x13

    .line 2213
    .line 2214
    const/16 v0, 0x12

    .line 2215
    .line 2216
    const/4 v1, 0x1

    .line 2217
    if-eq p3, v0, :cond_68

    .line 2218
    .line 2219
    move p3, v1

    .line 2220
    goto :goto_34

    .line 2221
    :cond_68
    const/4 p3, 0x0

    .line 2222
    :goto_34
    and-int/2addr p2, v1

    .line 2223
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 2224
    .line 2225
    .line 2226
    move-result p2

    .line 2227
    if-eqz p2, :cond_6b

    .line 2228
    .line 2229
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 2230
    .line 2231
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 2232
    .line 2233
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 2234
    .line 2235
    const/4 v0, 0x0

    .line 2236
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    invoke-interface {p1}, Lp/x0;->c()F

    .line 2241
    .line 2242
    .line 2243
    move-result p2

    .line 2244
    const/16 p3, 0x8

    .line 2245
    .line 2246
    int-to-float p3, p3

    .line 2247
    add-float/2addr p2, p3

    .line 2248
    invoke-interface {p1}, Lp/x0;->a()F

    .line 2249
    .line 2250
    .line 2251
    move-result p1

    .line 2252
    const/16 p3, 0x54

    .line 2253
    .line 2254
    int-to-float p3, p3

    .line 2255
    add-float/2addr p1, p3

    .line 2256
    const/4 p3, 0x5

    .line 2257
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v2

    .line 2261
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 2262
    .line 2263
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    move-result p2

    .line 2267
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    move-result-object p3

    .line 2271
    if-nez p2, :cond_69

    .line 2272
    .line 2273
    sget-object p2, Li0/l;->a:Li0/e;

    .line 2274
    .line 2275
    if-ne p3, p2, :cond_6a

    .line 2276
    .line 2277
    :cond_69
    new-instance p3, Lwb/wj;

    .line 2278
    .line 2279
    const/16 p2, 0x11

    .line 2280
    .line 2281
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 2282
    .line 2283
    .line 2284
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2285
    .line 2286
    .line 2287
    :cond_6a
    move-object v8, p3

    .line 2288
    check-cast v8, Lfg/l;

    .line 2289
    .line 2290
    const/4 v10, 0x0

    .line 2291
    const/16 v11, 0x1f8

    .line 2292
    .line 2293
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 2294
    .line 2295
    const/4 v3, 0x0

    .line 2296
    const/4 v4, 0x0

    .line 2297
    const/4 v5, 0x0

    .line 2298
    const/4 v6, 0x0

    .line 2299
    const/4 v7, 0x0

    .line 2300
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 2301
    .line 2302
    .line 2303
    goto :goto_35

    .line 2304
    :cond_6b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 2305
    .line 2306
    .line 2307
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 2308
    .line 2309
    return-object p1

    .line 2310
    :pswitch_19
    check-cast p1, Lp/x0;

    .line 2311
    .line 2312
    move-object v9, p2

    .line 2313
    check-cast v9, Li0/h0;

    .line 2314
    .line 2315
    check-cast p3, Ljava/lang/Integer;

    .line 2316
    .line 2317
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 2318
    .line 2319
    .line 2320
    move-result p2

    .line 2321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2322
    .line 2323
    .line 2324
    and-int/lit8 p3, p2, 0x6

    .line 2325
    .line 2326
    if-nez p3, :cond_6d

    .line 2327
    .line 2328
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2329
    .line 2330
    .line 2331
    move-result p3

    .line 2332
    if-eqz p3, :cond_6c

    .line 2333
    .line 2334
    const/4 p3, 0x4

    .line 2335
    goto :goto_36

    .line 2336
    :cond_6c
    const/4 p3, 0x2

    .line 2337
    :goto_36
    or-int/2addr p2, p3

    .line 2338
    :cond_6d
    and-int/lit8 p3, p2, 0x13

    .line 2339
    .line 2340
    const/16 v0, 0x12

    .line 2341
    .line 2342
    const/4 v1, 0x1

    .line 2343
    if-eq p3, v0, :cond_6e

    .line 2344
    .line 2345
    move p3, v1

    .line 2346
    goto :goto_37

    .line 2347
    :cond_6e
    const/4 p3, 0x0

    .line 2348
    :goto_37
    and-int/2addr p2, v1

    .line 2349
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 2350
    .line 2351
    .line 2352
    move-result p2

    .line 2353
    if-eqz p2, :cond_71

    .line 2354
    .line 2355
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 2356
    .line 2357
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 2358
    .line 2359
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 2360
    .line 2361
    const/4 v0, 0x0

    .line 2362
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v0

    .line 2366
    invoke-interface {p1}, Lp/x0;->c()F

    .line 2367
    .line 2368
    .line 2369
    move-result p2

    .line 2370
    const/16 p3, 0x8

    .line 2371
    .line 2372
    int-to-float p3, p3

    .line 2373
    add-float/2addr p2, p3

    .line 2374
    invoke-interface {p1}, Lp/x0;->a()F

    .line 2375
    .line 2376
    .line 2377
    move-result p1

    .line 2378
    const/16 p3, 0x54

    .line 2379
    .line 2380
    int-to-float p3, p3

    .line 2381
    add-float/2addr p1, p3

    .line 2382
    const/4 p3, 0x5

    .line 2383
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v2

    .line 2387
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 2388
    .line 2389
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2390
    .line 2391
    .line 2392
    move-result p2

    .line 2393
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 2394
    .line 2395
    .line 2396
    move-result-object p3

    .line 2397
    if-nez p2, :cond_6f

    .line 2398
    .line 2399
    sget-object p2, Li0/l;->a:Li0/e;

    .line 2400
    .line 2401
    if-ne p3, p2, :cond_70

    .line 2402
    .line 2403
    :cond_6f
    new-instance p3, Lwb/wj;

    .line 2404
    .line 2405
    const/4 p2, 0x1

    .line 2406
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2410
    .line 2411
    .line 2412
    :cond_70
    move-object v8, p3

    .line 2413
    check-cast v8, Lfg/l;

    .line 2414
    .line 2415
    const/4 v10, 0x0

    .line 2416
    const/16 v11, 0x1f8

    .line 2417
    .line 2418
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 2419
    .line 2420
    const/4 v3, 0x0

    .line 2421
    const/4 v4, 0x0

    .line 2422
    const/4 v5, 0x0

    .line 2423
    const/4 v6, 0x0

    .line 2424
    const/4 v7, 0x0

    .line 2425
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 2426
    .line 2427
    .line 2428
    goto :goto_38

    .line 2429
    :cond_71
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 2430
    .line 2431
    .line 2432
    :goto_38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 2433
    .line 2434
    return-object p1

    .line 2435
    :pswitch_1a
    check-cast p1, Lp/x0;

    .line 2436
    .line 2437
    move-object v9, p2

    .line 2438
    check-cast v9, Li0/h0;

    .line 2439
    .line 2440
    check-cast p3, Ljava/lang/Integer;

    .line 2441
    .line 2442
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 2443
    .line 2444
    .line 2445
    move-result p2

    .line 2446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2447
    .line 2448
    .line 2449
    and-int/lit8 p3, p2, 0x6

    .line 2450
    .line 2451
    if-nez p3, :cond_73

    .line 2452
    .line 2453
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2454
    .line 2455
    .line 2456
    move-result p3

    .line 2457
    if-eqz p3, :cond_72

    .line 2458
    .line 2459
    const/4 p3, 0x4

    .line 2460
    goto :goto_39

    .line 2461
    :cond_72
    const/4 p3, 0x2

    .line 2462
    :goto_39
    or-int/2addr p2, p3

    .line 2463
    :cond_73
    and-int/lit8 p3, p2, 0x13

    .line 2464
    .line 2465
    const/16 v0, 0x12

    .line 2466
    .line 2467
    const/4 v1, 0x1

    .line 2468
    if-eq p3, v0, :cond_74

    .line 2469
    .line 2470
    move p3, v1

    .line 2471
    goto :goto_3a

    .line 2472
    :cond_74
    const/4 p3, 0x0

    .line 2473
    :goto_3a
    and-int/2addr p2, v1

    .line 2474
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 2475
    .line 2476
    .line 2477
    move-result p2

    .line 2478
    if-eqz p2, :cond_77

    .line 2479
    .line 2480
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 2481
    .line 2482
    iget-object p3, p0, Lwb/b8;->h:Lsh/x;

    .line 2483
    .line 2484
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 2485
    .line 2486
    const/4 v0, 0x0

    .line 2487
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v0

    .line 2491
    invoke-interface {p1}, Lp/x0;->c()F

    .line 2492
    .line 2493
    .line 2494
    move-result p2

    .line 2495
    const/16 p3, 0x8

    .line 2496
    .line 2497
    int-to-float p3, p3

    .line 2498
    add-float/2addr p2, p3

    .line 2499
    invoke-interface {p1}, Lp/x0;->a()F

    .line 2500
    .line 2501
    .line 2502
    move-result p1

    .line 2503
    const/16 p3, 0x54

    .line 2504
    .line 2505
    int-to-float p3, p3

    .line 2506
    add-float/2addr p1, p3

    .line 2507
    const/4 p3, 0x5

    .line 2508
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v2

    .line 2512
    iget-object p1, p0, Lwb/b8;->j:Landroid/content/SharedPreferences;

    .line 2513
    .line 2514
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2515
    .line 2516
    .line 2517
    move-result p2

    .line 2518
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 2519
    .line 2520
    .line 2521
    move-result-object p3

    .line 2522
    if-nez p2, :cond_75

    .line 2523
    .line 2524
    sget-object p2, Li0/l;->a:Li0/e;

    .line 2525
    .line 2526
    if-ne p3, p2, :cond_76

    .line 2527
    .line 2528
    :cond_75
    new-instance p3, Lwb/wj;

    .line 2529
    .line 2530
    const/4 p2, 0x6

    .line 2531
    invoke-direct {p3, p1, p2}, Lwb/wj;-><init>(Landroid/content/SharedPreferences;I)V

    .line 2532
    .line 2533
    .line 2534
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2535
    .line 2536
    .line 2537
    :cond_76
    move-object v8, p3

    .line 2538
    check-cast v8, Lfg/l;

    .line 2539
    .line 2540
    const/4 v10, 0x0

    .line 2541
    const/16 v11, 0x1f8

    .line 2542
    .line 2543
    iget-object v1, p0, Lwb/b8;->i:Lr/z;

    .line 2544
    .line 2545
    const/4 v3, 0x0

    .line 2546
    const/4 v4, 0x0

    .line 2547
    const/4 v5, 0x0

    .line 2548
    const/4 v6, 0x0

    .line 2549
    const/4 v7, 0x0

    .line 2550
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 2551
    .line 2552
    .line 2553
    goto :goto_3b

    .line 2554
    :cond_77
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 2555
    .line 2556
    .line 2557
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 2558
    .line 2559
    return-object p1

    .line 2560
    nop

    .line 2561
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
