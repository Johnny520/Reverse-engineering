.class public final Lk5/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lo5/c;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li2/g;J)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lk5/n;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lc8/a;

    .line 8
    .line 9
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lc8/a;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lc8/a;->d:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, v0, Lc8/a;->b:I

    .line 18
    .line 19
    iput v1, v0, Lc8/a;->c:I

    .line 20
    .line 21
    iput-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lk5/n;->h:I

    .line 28
    .line 29
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lk5/n;->i:I

    .line 34
    .line 35
    iput v1, p0, Lk5/n;->j:I

    .line 36
    .line 37
    iput v1, p0, Lk5/n;->k:I

    .line 38
    .line 39
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const-string p3, ") offset is outside of text region "

    .line 48
    .line 49
    if-ltz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-gt v0, v1, :cond_2

    .line 56
    .line 57
    if-ltz p2, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-gt p2, v1, :cond_1

    .line 64
    .line 65
    if-gt v0, p2, :cond_0

    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    const-string p1, "Do not set reversed range: "

    .line 69
    .line 70
    const-string p3, " > "

    .line 71
    .line 72
    invoke-static {v0, p1, p3, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    throw p1

    .line 81
    :cond_1
    const-string v0, "end ("

    .line 82
    .line 83
    invoke-static {p2, v0, p3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p1, p2}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    throw p1

    .line 96
    :cond_2
    const-string p2, "start ("

    .line 97
    .line 98
    invoke-static {v0, p2, p3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p1, p2}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 107
    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    throw p1
.end method

.method public constructor <init>(Lk5/o;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk5/n;->g:I

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 119
    iput p2, p0, Lk5/n;->h:I

    return-void
.end method

.method public constructor <init>(Lo5/d;II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk5/n;->g:I

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 112
    iput p2, p0, Lk5/n;->h:I

    .line 113
    iput p3, p0, Lk5/n;->i:I

    .line 114
    iget-object p1, p1, Lo5/d;->b:Lk5/u;

    .line 115
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 116
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->N(I)I

    move-result p1

    iput p1, p0, Lk5/n;->k:I

    const/4 p1, 0x0

    .line 117
    iput p1, p0, Lk5/n;->j:I

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Li2/e0;->b(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lc8/a;

    .line 8
    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-virtual {v2, p1, p2, v3}, Lc8/a;->k(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lk5/n;->h:I

    .line 15
    .line 16
    iget p2, p0, Lk5/n;->i:I

    .line 17
    .line 18
    invoke-static {p1, p2}, Li2/e0;->b(II)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-static {p1, p2, v0, v1}, Lf8/i;->Q0(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p1, p2}, Li2/m0;->f(J)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, v2}, Lk5/n;->j(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Li2/m0;->e(J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Lk5/n;->i(I)V

    .line 38
    .line 39
    .line 40
    iget p1, p0, Lk5/n;->j:I

    .line 41
    .line 42
    const/4 p2, -0x1

    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    iget v2, p0, Lk5/n;->k:I

    .line 46
    .line 47
    invoke-static {p1, v2}, Li2/e0;->b(II)J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-static {v2, v3, v0, v1}, Lf8/i;->Q0(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    iput p2, p0, Lk5/n;->j:I

    .line 62
    .line 63
    iput p2, p0, Lk5/n;->k:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    invoke-static {v0, v1}, Li2/m0;->f(J)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Lk5/n;->j:I

    .line 71
    .line 72
    invoke-static {v0, v1}, Li2/m0;->e(J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iput p1, p0, Lk5/n;->k:I

    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public b(I)C
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    iget-object v1, v0, Lc8/a;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lh0/s;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lc8/a;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    iget v2, v0, Lc8/a;->b:I

    .line 21
    .line 22
    if-ge p1, v2, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lc8/a;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    iget v2, v1, Lh0/s;->b:I

    .line 34
    .line 35
    invoke-virtual {v1}, Lh0/s;->b()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-int/2addr v2, v3

    .line 40
    iget v3, v0, Lc8/a;->b:I

    .line 41
    .line 42
    add-int v4, v2, v3

    .line 43
    .line 44
    if-ge p1, v4, :cond_3

    .line 45
    .line 46
    sub-int/2addr p1, v3

    .line 47
    iget v0, v1, Lh0/s;->c:I

    .line 48
    .line 49
    iget-object v2, v1, Lh0/s;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, [C

    .line 52
    .line 53
    if-ge p1, v0, :cond_2

    .line 54
    .line 55
    aget-char p1, v2, p1

    .line 56
    .line 57
    return p1

    .line 58
    :cond_2
    sub-int/2addr p1, v0

    .line 59
    iget v0, v1, Lh0/s;->d:I

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    aget-char p1, v2, p1

    .line 63
    .line 64
    return p1

    .line 65
    :cond_3
    iget-object v1, v0, Lc8/a;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    iget v0, v0, Lc8/a;->c:I

    .line 70
    .line 71
    sub-int/2addr v2, v0

    .line 72
    add-int/2addr v2, v3

    .line 73
    sub-int/2addr p1, v2

    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1
.end method

.method public c()Li2/m0;
    .locals 3

    .line 1
    iget v0, p0, Lk5/n;->j:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget v1, p0, Lk5/n;->k:I

    .line 7
    .line 8
    invoke-static {v0, v1}, Li2/e0;->b(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    new-instance v2, Li2/m0;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Li2/m0;-><init>(J)V

    .line 15
    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk5/o;

    .line 4
    .line 5
    iget v1, p0, Lk5/n;->j:I

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lk5/o;->j:Lk5/u;

    .line 10
    .line 11
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 12
    .line 13
    invoke-virtual {p0}, Lk5/n;->e()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v3, La5/a;

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    invoke-direct {v3, v2, v4, v1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    iget v4, v0, Lk5/o;->r:I

    .line 29
    .line 30
    if-ge v2, v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3, v1}, La5/a;->o(Z)I

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v0, v3, La5/a;->h:I

    .line 39
    .line 40
    iput v0, p0, Lk5/n;->j:I

    .line 41
    .line 42
    :cond_1
    iget v0, p0, Lk5/n;->j:I

    .line 43
    .line 44
    return v0
.end method

.method public e()I
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk5/o;

    .line 4
    .line 5
    iget v1, p0, Lk5/n;->i:I

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lk5/o;->j:Lk5/u;

    .line 10
    .line 11
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 12
    .line 13
    iget v2, p0, Lk5/n;->h:I

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v3, La5/a;

    .line 19
    .line 20
    const/4 v4, 0x5

    .line 21
    invoke-direct {v3, v2, v4, v1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move v2, v1

    .line 26
    :goto_0
    iget v4, v0, Lk5/o;->q:I

    .line 27
    .line 28
    if-ge v2, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3, v1}, La5/a;->o(Z)I

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget v0, v3, La5/a;->h:I

    .line 37
    .line 38
    iput v0, p0, Lk5/n;->i:I

    .line 39
    .line 40
    :cond_1
    iget v0, p0, Lk5/n;->i:I

    .line 41
    .line 42
    return v0
.end method

.method public f(IILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lc8/a;->b()I

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
    invoke-virtual {v0}, Lc8/a;->b()I

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
    invoke-virtual {v0, p1, p2, p3}, Lc8/a;->k(IILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    add-int/2addr p2, p1

    .line 33
    invoke-virtual {p0, p2}, Lk5/n;->j(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    add-int/2addr p2, p1

    .line 41
    invoke-virtual {p0, p2}, Lk5/n;->i(I)V

    .line 42
    .line 43
    .line 44
    const/4 p1, -0x1

    .line 45
    iput p1, p0, Lk5/n;->j:I

    .line 46
    .line 47
    iput p1, p0, Lk5/n;->k:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string p3, "Do not set reversed range: "

    .line 51
    .line 52
    const-string v0, " > "

    .line 53
    .line 54
    invoke-static {p1, p3, v0, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string p1, "end ("

    .line 63
    .line 64
    invoke-static {p2, p1, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    const-string p2, "start ("

    .line 77
    .line 78
    invoke-static {p1, p2, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public g(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lc8/a;->b()I

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
    invoke-virtual {v0}, Lc8/a;->b()I

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
    iput p1, p0, Lk5/n;->j:I

    .line 26
    .line 27
    iput p2, p0, Lk5/n;->k:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string v0, "Do not set reversed or empty range: "

    .line 31
    .line 32
    const-string v1, " > "

    .line 33
    .line 34
    invoke-static {p1, v0, v1, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string p1, "end ("

    .line 43
    .line 44
    invoke-static {p2, p1, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p2, "start ("

    .line 57
    .line 58
    invoke-static {p1, p2, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public h(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    const-string v1, ") offset is outside of text region "

    .line 6
    .line 7
    if-ltz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lc8/a;->b()I

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
    invoke-virtual {v0}, Lc8/a;->b()I

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
    invoke-virtual {p0, p1}, Lk5/n;->j(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lk5/n;->i(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string v0, "Do not set reversed range: "

    .line 33
    .line 34
    const-string v1, " > "

    .line 35
    .line 36
    invoke-static {p1, v0, v1, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p1, "end ("

    .line 45
    .line 46
    invoke-static {p2, p1, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    const-string p2, "start ("

    .line 59
    .line 60
    invoke-static {p1, p2, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0}, Lc8/a;->b()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-static {p2, p1}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public i(I)V
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
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput p1, p0, Lk5/n;->i:I

    .line 26
    .line 27
    return-void
.end method

.method public j(I)V
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
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput p1, p0, Lk5/n;->h:I

    .line 26
    .line 27
    return-void
.end method

.method public seekTo(I)I
    .locals 5

    .line 1
    iget v0, p0, Lk5/n;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lo5/d;

    .line 6
    .line 7
    iget-object v1, v1, Lo5/d;->b:Lk5/u;

    .line 8
    .line 9
    :goto_0
    iget v2, p0, Lk5/n;->k:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    iget v3, p0, Lk5/n;->j:I

    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    iget v4, p0, Lk5/n;->i:I

    .line 18
    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    iput v3, p0, Lk5/n;->j:I

    .line 22
    .line 23
    iget-object v2, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 24
    .line 25
    mul-int/lit8 v3, v3, 0x8

    .line 26
    .line 27
    add-int/2addr v3, v0

    .line 28
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->N(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iput v2, p0, Lk5/n;->k:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-ne v2, p1, :cond_1

    .line 36
    .line 37
    iget-object p1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 38
    .line 39
    iget v1, p0, Lk5/n;->j:I

    .line 40
    .line 41
    mul-int/lit8 v1, v1, 0x8

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    add-int/lit8 v1, v1, 0x4

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lk5/n;->g:I

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
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lk5/n;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lc8/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lc8/a;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
