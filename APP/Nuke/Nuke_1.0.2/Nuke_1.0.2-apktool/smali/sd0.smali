.class public final Lsd0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsd;J)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lsd0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lsx1;

    .line 8
    .line 9
    iget-object p1, p1, Lsd;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lsx1;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lsx1;->d:Ljava/lang/CharSequence;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, v0, Lsx1;->b:I

    .line 18
    .line 19
    iput v1, v0, Lsx1;->c:I

    .line 20
    .line 21
    iput-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p2, p3}, Lf13;->f(J)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lsd0;->b:I

    .line 28
    .line 29
    invoke-static {p2, p3}, Lf13;->e(J)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lsd0;->c:I

    .line 34
    .line 35
    iput v1, p0, Lsd0;->d:I

    .line 36
    .line 37
    iput v1, p0, Lsd0;->e:I

    .line 38
    .line 39
    invoke-static {p2, p3}, Lf13;->f(J)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p2, p3}, Lf13;->e(J)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const/4 p3, 0x0

    .line 48
    const-string v0, ") offset is outside of text region "

    .line 49
    .line 50
    if-ltz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-gt p0, v1, :cond_2

    .line 57
    .line 58
    if-ltz p2, :cond_1

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-gt p2, v1, :cond_1

    .line 65
    .line 66
    if-gt p0, p2, :cond_0

    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    const-string p1, "Do not set reversed range: "

    .line 70
    .line 71
    const-string v0, " > "

    .line 72
    .line 73
    invoke-static {p1, p0, v0, p2}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p3

    .line 81
    :cond_1
    const-string p0, "end ("

    .line 82
    .line 83
    invoke-static {p2, p0, v0}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 92
    .line 93
    .line 94
    throw p3

    .line 95
    :cond_2
    const-string p2, "start ("

    .line 96
    .line 97
    invoke-static {p0, p2, v0}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 106
    .line 107
    .line 108
    throw p3
.end method

.method public constructor <init>(Lz8;III)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lsd0;->a:I

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput p3, p0, Lsd0;->b:I

    .line 111
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lsd0;->f:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 112
    iput p1, p0, Lsd0;->c:I

    .line 113
    iput p4, p0, Lsd0;->e:I

    return-void
.end method


# virtual methods
.method public a(La40;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object p0, p1, La40;->c:Lkt2;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of p0, p1, Lgc1;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public b()V
    .locals 14

    .line 1
    iget-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lsd0;->b:I

    .line 10
    .line 11
    iget v2, p0, Lsd0;->c:I

    .line 12
    .line 13
    add-int/2addr v1, v2

    .line 14
    iget v2, p0, Lsd0;->d:I

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    iget v2, p0, Lsd0;->e:I

    .line 18
    .line 19
    sub-int v2, v1, v2

    .line 20
    .line 21
    new-instance v3, Ldk;

    .line 22
    .line 23
    invoke-direct {v3, v1}, Ldk;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, v4

    .line 28
    :goto_0
    if-ge v5, v1, :cond_1

    .line 29
    .line 30
    if-lt v5, v2, :cond_0

    .line 31
    .line 32
    add-int/lit8 v6, v5, 0x1

    .line 33
    .line 34
    invoke-virtual {v3, v5, v6}, Ldk;->f(II)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v3, v5, v5}, Ldk;->f(II)V

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v1, v4

    .line 45
    :goto_2
    if-ge v1, v0, :cond_8

    .line 46
    .line 47
    iget-object v2, p0, Lsd0;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, La40;

    .line 56
    .line 57
    instance-of v5, v2, Lxt;

    .line 58
    .line 59
    if-nez v5, :cond_7

    .line 60
    .line 61
    iget-object v5, p0, Lsd0;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Ljava/util/ArrayList;

    .line 64
    .line 65
    iget-object v6, v2, La40;->d:Ls72;

    .line 66
    .line 67
    iget-object v7, v6, Lkj0;->i:[Ljava/lang/Object;

    .line 68
    .line 69
    array-length v7, v7

    .line 70
    new-instance v8, Ls72;

    .line 71
    .line 72
    invoke-direct {v8, v7}, Lkj0;-><init>(I)V

    .line 73
    .line 74
    .line 75
    move v9, v4

    .line 76
    :goto_3
    if-ge v9, v7, :cond_5

    .line 77
    .line 78
    invoke-virtual {v6, v9}, Lkj0;->e(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    check-cast v10, Lr72;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    if-nez v10, :cond_2

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_2
    :try_start_0
    iget-object v12, v3, Ldk;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v12, Lv01;

    .line 91
    .line 92
    iget v13, v10, Lr72;->h:I

    .line 93
    .line 94
    invoke-virtual {v12, v13}, Lv01;->f(I)I

    .line 95
    .line 96
    .line 97
    move-result v12
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_4

    .line 99
    :catch_0
    const/4 v12, -0x1

    .line 100
    :goto_4
    if-ltz v12, :cond_4

    .line 101
    .line 102
    iget v11, v10, Lr72;->h:I

    .line 103
    .line 104
    if-ne v11, v12, :cond_3

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_3
    iget-object v10, v10, Lr72;->i:Lw53;

    .line 108
    .line 109
    invoke-static {v12, v10}, Lr72;->e(ILw53;)Lr72;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    :goto_5
    move-object v11, v10

    .line 114
    goto :goto_6

    .line 115
    :cond_4
    const-string v10, "no mapping specified for register"

    .line 116
    .line 117
    invoke-static {v10}, Lc80;->j(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_6
    invoke-virtual {v8, v9, v11}, Lkj0;->f(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v9, v9, 0x1

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    iput-boolean v4, v8, Lvj1;->h:Z

    .line 127
    .line 128
    invoke-virtual {v8, v6}, Lkj0;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_6

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_6
    move-object v6, v8

    .line 136
    :goto_7
    invoke-virtual {v2, v6}, La40;->k(Ls72;)La40;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v5, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_8
    iget v0, p0, Lsd0;->d:I

    .line 147
    .line 148
    add-int/lit8 v0, v0, 0x1

    .line 149
    .line 150
    iput v0, p0, Lsd0;->d:I

    .line 151
    .line 152
    return-void
.end method

.method public c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x1

    .line 11
    if-ge v1, v0, :cond_1

    .line 12
    .line 13
    iget-object v3, p0, Lsd0;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, La40;

    .line 22
    .line 23
    instance-of v4, v3, Lxt;

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    iget-object v4, p0, Lsd0;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, La40;->j(I)La40;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v0, p0, Lsd0;->c:I

    .line 42
    .line 43
    add-int/2addr v0, v2

    .line 44
    iput v0, p0, Lsd0;->c:I

    .line 45
    .line 46
    return-void
.end method

.method public d(II)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lfg1;->i(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lsd0;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lsx1;

    .line 8
    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-virtual {v2, v3, p1, p2}, Lsx1;->k(Ljava/lang/String;II)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lsd0;->b:I

    .line 15
    .line 16
    iget p2, p0, Lsd0;->c:I

    .line 17
    .line 18
    invoke-static {p1, p2}, Lfg1;->i(II)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-static {p1, p2, v0, v1}, Lsp0;->p0(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p1, p2}, Lf13;->f(J)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, v2}, Lsd0;->n(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lf13;->e(J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Lsd0;->m(I)V

    .line 38
    .line 39
    .line 40
    iget p1, p0, Lsd0;->d:I

    .line 41
    .line 42
    const/4 p2, -0x1

    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    iget v2, p0, Lsd0;->e:I

    .line 46
    .line 47
    invoke-static {p1, v2}, Lfg1;->i(II)J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-static {v2, v3, v0, v1}, Lsp0;->p0(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-static {v0, v1}, Lf13;->c(J)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    iput p2, p0, Lsd0;->d:I

    .line 62
    .line 63
    iput p2, p0, Lsd0;->e:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    invoke-static {v0, v1}, Lf13;->f(J)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Lsd0;->d:I

    .line 71
    .line 72
    invoke-static {v0, v1}, Lf13;->e(J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iput p1, p0, Lsd0;->e:I

    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public e(La40;)Loa0;
    .locals 4

    .line 1
    iget-object v0, p1, La40;->d:Ls72;

    .line 2
    .line 3
    iget-object v1, p1, La40;->b:Loa0;

    .line 4
    .line 5
    iget-boolean v2, v1, Loa0;->e:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v0, v2, v3}, Ls72;->j(ZLjava/util/BitSet;)Ls72;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, La40;->k(Ls72;)La40;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0, v1}, Lsd0;->f(La40;Loa0;)Loa0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p0, Lx70;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "No expanded opcode for "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, v3, p1}, Lsg0;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public f(La40;Loa0;)Loa0;
    .locals 1

    .line 1
    :goto_0
    if-eqz p2, :cond_3

    .line 2
    .line 3
    iget-object p0, p2, Loa0;->d:Lsp0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsp0;->J(La40;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    sget-object p0, Lpa0;->a:[Loa0;

    .line 13
    .line 14
    iget p0, p2, Loa0;->c:I

    .line 15
    .line 16
    const/4 p2, -0x1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-ne p0, p2, :cond_1

    .line 19
    .line 20
    move-object p2, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    :try_start_0
    sget-object p2, Lpa0;->a:[Loa0;

    .line 25
    .line 26
    aget-object p0, p2, p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    move-object p2, p0

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    :cond_2
    const-string p0, "bogus opcode"

    .line 33
    .line 34
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    return-object p2
.end method

.method public g(I)C
    .locals 4

    .line 1
    iget-object p0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsx1;

    .line 4
    .line 5
    iget-object v0, p0, Lsx1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lbo0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lsx1;->d:Ljava/lang/CharSequence;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    iget v1, p0, Lsx1;->b:I

    .line 21
    .line 22
    if-ge p1, v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lsx1;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    iget v1, v0, Lbo0;->b:I

    .line 34
    .line 35
    invoke-virtual {v0}, Lbo0;->b()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v1, v2

    .line 40
    iget v2, p0, Lsx1;->b:I

    .line 41
    .line 42
    add-int v3, v1, v2

    .line 43
    .line 44
    if-ge p1, v3, :cond_3

    .line 45
    .line 46
    sub-int/2addr p1, v2

    .line 47
    iget p0, v0, Lbo0;->c:I

    .line 48
    .line 49
    iget-object v1, v0, Lbo0;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, [C

    .line 52
    .line 53
    if-ge p1, p0, :cond_2

    .line 54
    .line 55
    aget-char p0, v1, p1

    .line 56
    .line 57
    return p0

    .line 58
    :cond_2
    sub-int/2addr p1, p0

    .line 59
    iget p0, v0, Lbo0;->d:I

    .line 60
    .line 61
    add-int/2addr p1, p0

    .line 62
    aget-char p0, v1, p1

    .line 63
    .line 64
    return p0

    .line 65
    :cond_3
    iget-object v0, p0, Lsx1;->d:Ljava/lang/CharSequence;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    iget p0, p0, Lsx1;->c:I

    .line 70
    .line 71
    sub-int/2addr v1, p0

    .line 72
    add-int/2addr v1, v2

    .line 73
    sub-int/2addr p1, v1

    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0
.end method

.method public h()Lf13;
    .locals 2

    .line 1
    iget v0, p0, Lsd0;->d:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget p0, p0, Lsd0;->e:I

    .line 7
    .line 8
    invoke-static {v0, p0}, Lfg1;->i(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    new-instance p0, Lf13;

    .line 13
    .line 14
    invoke-direct {p0, v0, v1}, Lf13;-><init>(J)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public i(Ljava/lang/String;II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsx1;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p2, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lsx1;->b()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt p2, v2, :cond_2

    .line 14
    .line 15
    if-ltz p3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lsx1;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-gt p3, v2, :cond_1

    .line 22
    .line 23
    if-gt p2, p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, p3}, Lsx1;->k(Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    add-int/2addr p3, p2

    .line 33
    invoke-virtual {p0, p3}, Lsd0;->n(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-int/2addr p1, p2

    .line 41
    invoke-virtual {p0, p1}, Lsd0;->m(I)V

    .line 42
    .line 43
    .line 44
    const/4 p1, -0x1

    .line 45
    iput p1, p0, Lsd0;->d:I

    .line 46
    .line 47
    iput p1, p0, Lsd0;->e:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string p0, "Do not set reversed range: "

    .line 51
    .line 52
    const-string p1, " > "

    .line 53
    .line 54
    invoke-static {p0, p2, p1, p3}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string p0, "end ("

    .line 63
    .line 64
    invoke-static {p3, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0}, Lsx1;->b()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    const-string p0, "start ("

    .line 77
    .line 78
    invoke-static {p2, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0}, Lsx1;->b()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public j([Loa0;)Z
    .locals 14

    .line 1
    iget v0, p0, Lsd0;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    iget-object v3, p0, Lsd0;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget v4, p0, Lsd0;->c:I

    .line 17
    .line 18
    move v5, v1

    .line 19
    :goto_1
    if-ge v5, v3, :cond_6

    .line 20
    .line 21
    iget-object v6, p0, Lsd0;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    check-cast v6, La40;

    .line 30
    .line 31
    aget-object v7, p1, v5

    .line 32
    .line 33
    invoke-virtual {p0, v6, v7}, Lsd0;->f(La40;Loa0;)Loa0;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    if-nez v8, :cond_4

    .line 38
    .line 39
    invoke-virtual {p0, v6}, Lsd0;->e(La40;)Loa0;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iget-object v7, v7, Loa0;->d:Lsp0;

    .line 44
    .line 45
    invoke-virtual {v7, v6}, Lsp0;->x(La40;)Ljava/util/BitSet;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object v9, v6, La40;->b:Loa0;

    .line 50
    .line 51
    iget-boolean v9, v9, Loa0;->e:Z

    .line 52
    .line 53
    iget-object v6, v6, La40;->d:Ls72;

    .line 54
    .line 55
    iget-object v10, v6, Lkj0;->i:[Ljava/lang/Object;

    .line 56
    .line 57
    array-length v10, v10

    .line 58
    if-eqz v9, :cond_1

    .line 59
    .line 60
    invoke-virtual {v7, v1}, Ljava/util/BitSet;->get(I)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-nez v11, :cond_1

    .line 65
    .line 66
    invoke-virtual {v6, v1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    check-cast v11, Lr72;

    .line 71
    .line 72
    invoke-virtual {v11}, Lr72;->d()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move v11, v1

    .line 78
    :goto_2
    move v12, v1

    .line 79
    :goto_3
    if-ge v9, v10, :cond_3

    .line 80
    .line 81
    invoke-virtual {v7, v9}, Ljava/util/BitSet;->get(I)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-nez v13, :cond_2

    .line 86
    .line 87
    invoke-virtual {v6, v9}, Lkj0;->e(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    check-cast v13, Lr72;

    .line 92
    .line 93
    invoke-virtual {v13}, Lr72;->d()I

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    add-int/2addr v12, v13

    .line 98
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-le v6, v4, :cond_5

    .line 106
    .line 107
    move v4, v6

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    if-ne v7, v8, :cond_5

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    :goto_4
    aput-object v8, p1, v5

    .line 113
    .line 114
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    if-lt v0, v4, :cond_7

    .line 118
    .line 119
    iput v0, p0, Lsd0;->c:I

    .line 120
    .line 121
    return v2

    .line 122
    :cond_7
    sub-int v0, v4, v0

    .line 123
    .line 124
    iget-object v2, p0, Lsd0;->f:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    move v3, v1

    .line 133
    :goto_6
    if-ge v3, v2, :cond_9

    .line 134
    .line 135
    iget-object v5, p0, Lsd0;->f:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, La40;

    .line 144
    .line 145
    instance-of v6, v5, Lxt;

    .line 146
    .line 147
    if-nez v6, :cond_8

    .line 148
    .line 149
    iget-object v6, p0, Lsd0;->f:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v6, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v5, v0}, La40;->j(I)La40;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v6, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_9
    const/4 v2, 0x1

    .line 164
    move v0, v4

    .line 165
    goto/16 :goto_0
.end method

.method public k(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsx1;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lsx1;->b()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt p1, v2, :cond_2

    .line 14
    .line 15
    if-ltz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lsx1;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-gt p2, v2, :cond_1

    .line 22
    .line 23
    if-ge p1, p2, :cond_0

    .line 24
    .line 25
    iput p1, p0, Lsd0;->d:I

    .line 26
    .line 27
    iput p2, p0, Lsd0;->e:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Do not set reversed or empty range: "

    .line 31
    .line 32
    const-string v0, " > "

    .line 33
    .line 34
    invoke-static {p0, p1, v0, p2}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string p0, "end ("

    .line 43
    .line 44
    invoke-static {p2, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0}, Lsx1;->b()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p0, "start ("

    .line 57
    .line 58
    invoke-static {p1, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v0}, Lsx1;->b()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public l(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsx1;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lsx1;->b()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt p1, v2, :cond_2

    .line 14
    .line 15
    if-ltz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lsx1;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-gt p2, v2, :cond_1

    .line 22
    .line 23
    if-gt p1, p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lsd0;->n(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lsd0;->m(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string p0, "Do not set reversed range: "

    .line 33
    .line 34
    const-string v0, " > "

    .line 35
    .line 36
    invoke-static {p0, p1, v0, p2}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "end ("

    .line 45
    .line 46
    invoke-static {p2, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0}, Lsx1;->b()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    const-string p0, "start ("

    .line 59
    .line 60
    invoke-static {p1, p0, v1}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0}, Lsx1;->b()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p0, p1}, Lc80;->q(Ljava/lang/StringBuilder;I)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public m(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Cannot set selectionEnd to a negative value: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput p1, p0, Lsd0;->c:I

    .line 26
    .line 27
    return-void
.end method

.method public n(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Cannot set selectionStart to a negative value: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput p1, p0, Lsd0;->b:I

    .line 26
    .line 27
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lsd0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lsx1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lsx1;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
