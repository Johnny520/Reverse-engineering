.class public final Lar1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbl2;


# static fields
.field public static final h:Lar1;

.field public static final i:Lkl1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lar1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lar1;->h:Lar1;

    .line 7
    .line 8
    new-instance v0, Lkl1;

    .line 9
    .line 10
    invoke-direct {v0}, Lkl1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lar1;->i:Lkl1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final e(Lyk2;Lxk2;Lmb;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object p0, Lo90;->a:Lc60;

    .line 2
    .line 3
    sget-object p0, Lie1;->a:Lvr0;

    .line 4
    .line 5
    iget-object p0, p0, Lvr0;->m:Lvr0;

    .line 6
    .line 7
    new-instance v0, Lu30;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v0, p2, p1, v1, v2}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, p3}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Lk20;->h:Lk20;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 24
    .line 25
    return-object p0
.end method

.method public final f(Lyk2;Lxf2;Lt00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lyq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyq1;

    .line 7
    .line 8
    iget v1, v0, Lyq1;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyq1;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyq1;

    .line 21
    .line 22
    check-cast p3, Lu00;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lyq1;-><init>(Lar1;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v0, Lyq1;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget p3, v0, Lyq1;->p:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    sget-object v4, Lk20;->h:Lk20;

    .line 35
    .line 36
    if-eqz p3, :cond_3

    .line 37
    .line 38
    if-eq p3, v2, :cond_2

    .line 39
    .line 40
    if-ne p3, v1, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lyq1;->m:Lil1;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_5

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_2
    iget-object p1, v0, Lyq1;->m:Lil1;

    .line 57
    .line 58
    iget-object p2, v0, Lyq1;->l:Lxf2;

    .line 59
    .line 60
    iget-object p3, v0, Lyq1;->k:Lyk2;

    .line 61
    .line 62
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p0, p1

    .line 66
    move-object p1, p3

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, v0, Lyq1;->k:Lyk2;

    .line 72
    .line 73
    iput-object p2, v0, Lyq1;->l:Lxf2;

    .line 74
    .line 75
    sget-object p0, Lar1;->i:Lkl1;

    .line 76
    .line 77
    iput-object p0, v0, Lyq1;->m:Lil1;

    .line 78
    .line 79
    iput v2, v0, Lyq1;->p:I

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    if-ne p3, v4, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    :try_start_1
    new-instance p3, Laf;

    .line 89
    .line 90
    const/16 v2, 0x10

    .line 91
    .line 92
    invoke-direct {p3, v2, p2, p1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v3, v0, Lyq1;->k:Lyk2;

    .line 96
    .line 97
    iput-object v3, v0, Lyq1;->l:Lxf2;

    .line 98
    .line 99
    iput-object p0, v0, Lyq1;->m:Lil1;

    .line 100
    .line 101
    iput v1, v0, Lyq1;->p:I

    .line 102
    .line 103
    sget-object p2, Lo90;->a:Lc60;

    .line 104
    .line 105
    sget-object p2, Lie1;->a:Lvr0;

    .line 106
    .line 107
    iget-object p2, p2, Lvr0;->m:Lvr0;

    .line 108
    .line 109
    new-instance v1, La2;

    .line 110
    .line 111
    const/16 v2, 0x13

    .line 112
    .line 113
    invoke-direct {v1, p3, p1, v3, v2}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {p2, v1, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    if-ne p1, v4, :cond_5

    .line 121
    .line 122
    :goto_2
    return-object v4

    .line 123
    :cond_5
    move-object v5, p1

    .line 124
    move-object p1, p0

    .line 125
    move-object p0, v5

    .line 126
    :goto_3
    :try_start_2
    check-cast p0, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    .line 131
    check-cast p1, Lkl1;

    .line 132
    .line 133
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :goto_4
    move-object v5, p1

    .line 138
    move-object p1, p0

    .line 139
    move-object p0, v5

    .line 140
    goto :goto_5

    .line 141
    :catchall_1
    move-exception p1

    .line 142
    goto :goto_4

    .line 143
    :goto_5
    check-cast p1, Lkl1;

    .line 144
    .line 145
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    throw p0
.end method

.method public final m(Lyk2;Ljd2;Lt00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lxq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lxq1;

    .line 7
    .line 8
    iget v1, v0, Lxq1;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxq1;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxq1;

    .line 21
    .line 22
    check-cast p3, Lu00;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lxq1;-><init>(Lar1;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v0, Lxq1;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget p3, v0, Lxq1;->p:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    sget-object v4, Lk20;->h:Lk20;

    .line 35
    .line 36
    if-eqz p3, :cond_3

    .line 37
    .line 38
    if-eq p3, v2, :cond_2

    .line 39
    .line 40
    if-ne p3, v1, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lxq1;->m:Lil1;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_5

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_2
    iget-object p1, v0, Lxq1;->m:Lil1;

    .line 57
    .line 58
    iget-object p2, v0, Lxq1;->l:Ljd2;

    .line 59
    .line 60
    iget-object p3, v0, Lxq1;->k:Lyk2;

    .line 61
    .line 62
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p0, p1

    .line 66
    move-object p1, p3

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, v0, Lxq1;->k:Lyk2;

    .line 72
    .line 73
    iput-object p2, v0, Lxq1;->l:Ljd2;

    .line 74
    .line 75
    sget-object p0, Lar1;->i:Lkl1;

    .line 76
    .line 77
    iput-object p0, v0, Lxq1;->m:Lil1;

    .line 78
    .line 79
    iput v2, v0, Lxq1;->p:I

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    if-ne p3, v4, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    :try_start_1
    new-instance p3, Laf;

    .line 89
    .line 90
    const/16 v2, 0x11

    .line 91
    .line 92
    invoke-direct {p3, v2, p2, p1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v3, v0, Lxq1;->k:Lyk2;

    .line 96
    .line 97
    iput-object v3, v0, Lxq1;->l:Ljd2;

    .line 98
    .line 99
    iput-object p0, v0, Lxq1;->m:Lil1;

    .line 100
    .line 101
    iput v1, v0, Lxq1;->p:I

    .line 102
    .line 103
    sget-object p2, Lo90;->a:Lc60;

    .line 104
    .line 105
    sget-object p2, Lie1;->a:Lvr0;

    .line 106
    .line 107
    iget-object p2, p2, Lvr0;->m:Lvr0;

    .line 108
    .line 109
    new-instance v1, La2;

    .line 110
    .line 111
    const/16 v2, 0x13

    .line 112
    .line 113
    invoke-direct {v1, p3, p1, v3, v2}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {p2, v1, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    if-ne p1, v4, :cond_5

    .line 121
    .line 122
    :goto_2
    return-object v4

    .line 123
    :cond_5
    move-object p1, p0

    .line 124
    :goto_3
    check-cast p1, Lkl1;

    .line 125
    .line 126
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object p0, La83;->a:La83;

    .line 130
    .line 131
    return-object p0

    .line 132
    :goto_4
    move-object v5, p1

    .line 133
    move-object p1, p0

    .line 134
    move-object p0, v5

    .line 135
    goto :goto_5

    .line 136
    :catchall_1
    move-exception p1

    .line 137
    goto :goto_4

    .line 138
    :goto_5
    check-cast p1, Lkl1;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    throw p0
.end method
