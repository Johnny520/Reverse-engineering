.class public final Lg4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg4/i;

.field public final b:Ljava/util/ArrayList;

.field public c:Lg4/g;

.field public d:Z

.field public final e:Lg4/h;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lu4/t;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lw4/b;


# direct methods
.method public constructor <init>(Lg4/d;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg4/b;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg4/b;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lg4/b;->g:Ljava/util/ArrayList;

    .line 24
    .line 25
    sget-object v1, Lu4/t;->d:Lu4/t;

    .line 26
    .line 27
    iput-object v1, p0, Lg4/b;->h:Lu4/t;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lg4/b;->i:Ljava/util/ArrayList;

    .line 40
    .line 41
    sget-object v1, Lw4/b;->i:Lw4/b;

    .line 42
    .line 43
    iput-object v1, p0, Lg4/b;->j:Lw4/b;

    .line 44
    .line 45
    iget-object v1, p1, Lg4/d;->a:Lg4/i;

    .line 46
    .line 47
    iput-object v1, p0, Lg4/b;->a:Lg4/i;

    .line 48
    .line 49
    iget p1, p1, Lg4/d;->b:I

    .line 50
    .line 51
    and-int/lit8 p1, p1, 0x8

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Lg4/b;->e:Lg4/h;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, v1, Lg4/i;->a:Lg4/j;

    .line 60
    .line 61
    new-instance v2, Lg4/h;

    .line 62
    .line 63
    invoke-direct {v2, p0, p1}, Lg4/h;-><init>(Lg4/b;Lg4/j;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lg4/b;->e:Lg4/h;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p1, v1, Lg4/i;->d:Lg4/k;

    .line 72
    .line 73
    iget-object p1, p1, Lg4/k;->a:[Lg4/j;

    .line 74
    .line 75
    array-length v0, p1

    .line 76
    const/4 v1, 0x0

    .line 77
    :goto_1
    if-ge v1, v0, :cond_1

    .line 78
    .line 79
    aget-object v2, p1, v1

    .line 80
    .line 81
    iget-object v3, p0, Lg4/b;->f:Ljava/util/ArrayList;

    .line 82
    .line 83
    new-instance v4, Lg4/h;

    .line 84
    .line 85
    invoke-direct {v4, p0, v2}, Lg4/h;-><init>(Lg4/b;Lg4/j;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    new-instance p1, Lg4/g;

    .line 95
    .line 96
    invoke-direct {p1}, Lg4/g;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lg4/b;->c:Lg4/g;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lg4/b;->b(Lg4/g;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lg4/b;->c:Lg4/g;

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    iput-boolean v0, p1, Lg4/g;->c:Z

    .line 108
    .line 109
    return-void
.end method

.method public static d(Lg4/h;Lg4/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/h;->b:Lg4/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg4/j;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "requested "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lg4/h;->b:Lg4/j;

    .line 23
    .line 24
    const-string p1, " but was "

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method


# virtual methods
.method public final a(Lu4/i;Lg4/g;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg4/b;->c:Lg4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v1, v0, Lg4/g;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_a

    .line 8
    .line 9
    iget-object v0, v0, Lg4/g;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lu4/i;->g:Lu4/r;

    .line 15
    .line 16
    iget p1, p1, Lu4/r;->e:I

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const-string v1, "unexpected branch: "

    .line 20
    .line 21
    if-eq p1, v0, :cond_8

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq p1, v2, :cond_6

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    const-string v4, "branch == null"

    .line 29
    .line 30
    if-eq p1, v2, :cond_4

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    if-eq p1, v2, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x6

    .line 36
    if-ne p1, v2, :cond_1

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object p2, p0, Lg4/b;->i:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Lg4/g;

    .line 48
    .line 49
    invoke-direct {p2}, Lg4/g;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2}, Lg4/b;->b(Lg4/g;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lg4/b;->c:Lg4/g;

    .line 56
    .line 57
    iput-object p2, v1, Lg4/g;->e:Lg4/g;

    .line 58
    .line 59
    iput-object v3, v1, Lg4/g;->f:Lg4/g;

    .line 60
    .line 61
    iput-object p1, v1, Lg4/g;->d:Ljava/util/List;

    .line 62
    .line 63
    iput-object p2, p0, Lg4/b;->c:Lg4/g;

    .line 64
    .line 65
    iput-boolean v0, p2, Lg4/g;->c:Z

    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    invoke-static {p2, v1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-static {}, Lj8/o;->o()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    if-eqz p2, :cond_3

    .line 77
    .line 78
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 79
    .line 80
    new-instance v1, Lg4/g;

    .line 81
    .line 82
    invoke-direct {v1}, Lg4/g;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Lg4/b;->b(Lg4/g;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p0, Lg4/b;->c:Lg4/g;

    .line 89
    .line 90
    iput-object v1, v2, Lg4/g;->e:Lg4/g;

    .line 91
    .line 92
    iput-object p2, v2, Lg4/g;->f:Lg4/g;

    .line 93
    .line 94
    iput-object p1, v2, Lg4/g;->d:Ljava/util/List;

    .line 95
    .line 96
    iput-object v1, p0, Lg4/b;->c:Lg4/g;

    .line 97
    .line 98
    iput-boolean v0, v1, Lg4/g;->c:Z

    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_4
    if-eqz p2, :cond_5

    .line 106
    .line 107
    iget-object p1, p0, Lg4/b;->c:Lg4/g;

    .line 108
    .line 109
    iput-object p2, p1, Lg4/g;->e:Lg4/g;

    .line 110
    .line 111
    iput-object v3, p0, Lg4/b;->c:Lg4/g;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_6
    if-nez p2, :cond_7

    .line 119
    .line 120
    iput-object v3, p0, Lg4/b;->c:Lg4/g;

    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    invoke-static {p2, v1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_8
    if-nez p2, :cond_9

    .line 128
    .line 129
    return-void

    .line 130
    :cond_9
    invoke-static {p2, v1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_a
    const-string p1, "no current label"

    .line 135
    .line 136
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final b(Lg4/g;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lg4/g;->b:Lg4/b;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    iput-object p0, p1, Lg4/g;->b:Lg4/b;

    .line 9
    .line 10
    iget-object v0, p0, Lg4/b;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p1, "Cannot adopt label; it belongs to another Code"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final c(Lg4/h;Lg4/h;)V
    .locals 9

    .line 1
    iget-object v0, p2, Lg4/h;->b:Lg4/j;

    .line 2
    .line 3
    iget-object v1, v0, Lg4/j;->b:Lw4/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lw4/c;->t()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v3, Lu4/v;

    .line 13
    .line 14
    sget-object v4, Lu4/s;->h2:Lu4/r;

    .line 15
    .line 16
    invoke-virtual {p2}, Lg4/h;->a()Lu4/o;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget-object p2, p1, Lg4/h;->b:Lg4/j;

    .line 25
    .line 26
    iget-object v8, p2, Lg4/j;->c:Lv4/d0;

    .line 27
    .line 28
    iget-object v5, p0, Lg4/b;->h:Lu4/t;

    .line 29
    .line 30
    iget-object v7, p0, Lg4/b;->j:Lw4/b;

    .line 31
    .line 32
    invoke-direct/range {v3 .. v8}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    invoke-virtual {p0, p1, p2}, Lg4/b;->j(Lg4/h;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    new-instance v1, Lu4/m;

    .line 44
    .line 45
    iget-object v0, v0, Lg4/j;->b:Lw4/c;

    .line 46
    .line 47
    iget-object v3, p1, Lg4/h;->b:Lg4/j;

    .line 48
    .line 49
    iget-object v3, v3, Lg4/j;->b:Lw4/c;

    .line 50
    .line 51
    iget v4, v0, Lw4/c;->h:I

    .line 52
    .line 53
    const/4 v5, 0x6

    .line 54
    if-ne v4, v5, :cond_4

    .line 55
    .line 56
    iget v4, v3, Lw4/c;->h:I

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    if-eq v4, v5, :cond_3

    .line 60
    .line 61
    const/4 v5, 0x3

    .line 62
    if-eq v4, v5, :cond_2

    .line 63
    .line 64
    const/16 v5, 0x8

    .line 65
    .line 66
    if-eq v4, v5, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object v0, Lu4/s;->v1:Lu4/r;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    sget-object v0, Lu4/s;->u1:Lu4/r;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    sget-object v0, Lu4/s;->t1:Lu4/r;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_0
    invoke-static {v3, v0}, Lu4/s;->d(Lw4/d;Lw4/d;)Lu4/r;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_1
    invoke-virtual {p1}, Lg4/h;->a()Lu4/o;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p2}, Lg4/h;->a()Lu4/o;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    iget-object v3, p0, Lg4/b;->h:Lu4/t;

    .line 91
    .line 92
    invoke-direct {v1, v0, v3, p1, p2}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/o;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final e(ILg4/j;)Lg4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/b;->e:Lg4/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lg4/b;->f:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lg4/h;

    .line 14
    .line 15
    invoke-static {p1, p2}, Lg4/b;->d(Lg4/h;Lg4/j;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public final f()V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lg4/b;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lg4/b;->d:Z

    .line 7
    .line 8
    iget-object v0, p0, Lg4/b;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lg4/h;

    .line 28
    .line 29
    iput v2, v3, Lg4/h;->c:I

    .line 30
    .line 31
    iget-object v5, v3, Lg4/h;->b:Lg4/j;

    .line 32
    .line 33
    iget-object v6, v5, Lg4/j;->b:Lw4/c;

    .line 34
    .line 35
    invoke-static {v2, v6, v4}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iput-object v4, v3, Lg4/h;->d:Lu4/o;

    .line 40
    .line 41
    iget-object v3, v5, Lg4/j;->b:Lw4/c;

    .line 42
    .line 43
    invoke-virtual {v3}, Lw4/c;->i()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v2, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lg4/b;->f:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move v5, v2

    .line 61
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Lg4/h;

    .line 72
    .line 73
    sub-int v7, v5, v2

    .line 74
    .line 75
    invoke-static {v7}, Lv4/o;->o(I)Lv4/o;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    iput v5, v6, Lg4/h;->c:I

    .line 80
    .line 81
    iget-object v7, v6, Lg4/h;->b:Lg4/j;

    .line 82
    .line 83
    iget-object v8, v7, Lg4/j;->b:Lw4/c;

    .line 84
    .line 85
    invoke-static {v5, v8, v4}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    iput-object v8, v6, Lg4/h;->d:Lu4/o;

    .line 90
    .line 91
    iget-object v8, v7, Lg4/j;->b:Lw4/c;

    .line 92
    .line 93
    invoke-virtual {v8}, Lw4/c;->i()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    add-int/2addr v5, v8

    .line 98
    new-instance v8, Lu4/l;

    .line 99
    .line 100
    iget-object v7, v7, Lg4/j;->b:Lw4/c;

    .line 101
    .line 102
    invoke-static {v7}, Lu4/s;->h(Lw4/d;)Lu4/r;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v6}, Lg4/h;->a()Lu4/o;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    sget-object v12, Lu4/p;->i:Lu4/p;

    .line 111
    .line 112
    iget-object v10, p0, Lg4/b;->h:Lu4/t;

    .line 113
    .line 114
    invoke-direct/range {v8 .. v13}, Lu4/l;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    iget-object v2, p0, Lg4/b;->b:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Lg4/g;

    .line 128
    .line 129
    iget-object v2, v2, Lg4/g;->a:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 138
    .line 139
    .line 140
    throw v0
.end method

.method public final varargs g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V
    .locals 7

    .line 1
    new-instance v0, Lu4/v;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, v6

    .line 9
    :goto_0
    new-instance v3, Lu4/p;

    .line 10
    .line 11
    array-length v2, p5

    .line 12
    add-int/2addr v2, v1

    .line 13
    invoke-direct {v3, v2}, Lz4/e;-><init>(I)V

    .line 14
    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    invoke-virtual {p4}, Lg4/h;->a()Lu4/o;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-virtual {v3, v6, p4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    move p4, v6

    .line 26
    :goto_1
    array-length v2, p5

    .line 27
    if-ge p4, v2, :cond_2

    .line 28
    .line 29
    add-int v2, p4, v1

    .line 30
    .line 31
    aget-object v4, p5, p4

    .line 32
    .line 33
    invoke-virtual {v4}, Lg4/h;->a()Lu4/o;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v2, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p4, p4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v4, p0, Lg4/b;->j:Lw4/b;

    .line 44
    .line 45
    iget-object v5, p2, Lg4/i;->e:Lv4/y;

    .line 46
    .line 47
    iget-object v2, p0, Lg4/b;->h:Lu4/t;

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    invoke-direct/range {v0 .. v5}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, v0, p1}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 55
    .line 56
    .line 57
    if-eqz p3, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, p3, v6}, Lg4/b;->j(Lg4/h;Z)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
.end method

.method public final varargs h(Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {v0}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lu4/s;->a:Lu4/r;

    .line 11
    .line 12
    new-instance v3, Lu4/r;

    .line 13
    .line 14
    invoke-virtual {v0}, Lw4/a;->c()Lw4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lw4/b;->p:Lw4/b;

    .line 19
    .line 20
    const/16 v2, 0x33

    .line 21
    .line 22
    invoke-direct {v3, v2, v0, v1}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 23
    .line 24
    .line 25
    move-object v2, p0

    .line 26
    move-object v4, p1

    .line 27
    move-object v5, p2

    .line 28
    move-object v6, p3

    .line 29
    move-object v7, p4

    .line 30
    invoke-virtual/range {v2 .. v7}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final i(Lg4/h;Ljava/lang/Object;)V
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lu4/s;->r:Lu4/r;

    .line 4
    .line 5
    :goto_0
    move-object v2, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p1, Lg4/h;->b:Lg4/j;

    .line 8
    .line 9
    iget-object v0, v0, Lg4/j;->b:Lw4/c;

    .line 10
    .line 11
    invoke-static {v0}, Lu4/s;->c(Lw4/d;)Lu4/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget v0, v2, Lu4/r;->e:I

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    iget-object v3, p0, Lg4/b;->h:Lu4/t;

    .line 21
    .line 22
    if-ne v0, v8, :cond_1

    .line 23
    .line 24
    new-instance v1, Lu4/l;

    .line 25
    .line 26
    invoke-virtual {p1}, Lg4/h;->a()Lu4/o;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Lu4/p;->i:Lu4/p;

    .line 31
    .line 32
    invoke-static {p2}, Lg4/a;->s(Ljava/lang/Object;)Lv4/f0;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-direct/range {v1 .. v6}, Lu4/l;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1, v7}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance v1, Lu4/v;

    .line 44
    .line 45
    sget-object v4, Lu4/p;->i:Lu4/p;

    .line 46
    .line 47
    iget-object v5, p0, Lg4/b;->j:Lw4/b;

    .line 48
    .line 49
    invoke-static {p2}, Lg4/a;->s(Ljava/lang/Object;)Lv4/f0;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-direct/range {v1 .. v6}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v1, v7}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v8}, Lg4/b;->j(Lg4/h;Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final j(Lg4/h;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p1, Lg4/h;->b:Lg4/j;

    .line 4
    .line 5
    iget-object p2, p2, Lg4/j;->b:Lw4/c;

    .line 6
    .line 7
    invoke-static {p2}, Lu4/s;->j(Lw4/d;)Lu4/r;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Lg4/h;->b:Lg4/j;

    .line 13
    .line 14
    iget-object p2, p2, Lg4/j;->b:Lw4/c;

    .line 15
    .line 16
    invoke-static {p2}, Lu4/s;->i(Lw4/d;)Lu4/r;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    new-instance v0, Lu4/m;

    .line 21
    .line 22
    invoke-virtual {p1}, Lg4/h;->a()Lu4/o;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v1, Lu4/p;->i:Lu4/p;

    .line 27
    .line 28
    iget-object v2, p0, Lg4/b;->h:Lu4/t;

    .line 29
    .line 30
    invoke-direct {v0, p2, v2, p1, v1}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, v0, p1}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final k(Lg4/j;)Lg4/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg4/b;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg4/h;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lg4/h;-><init>(Lg4/b;Lg4/j;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lg4/b;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string p1, "Cannot allocate locals after adding instructions"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final l(Lg4/h;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lg4/h;->b:Lg4/j;

    .line 2
    .line 3
    iget-object v1, p1, Lg4/h;->b:Lg4/j;

    .line 4
    .line 5
    iget-object v2, p0, Lg4/b;->a:Lg4/i;

    .line 6
    .line 7
    iget-object v3, v2, Lg4/i;->b:Lg4/j;

    .line 8
    .line 9
    invoke-virtual {v0, v3}, Lg4/j;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lu4/m;

    .line 16
    .line 17
    iget-object v1, v1, Lg4/j;->b:Lw4/c;

    .line 18
    .line 19
    invoke-static {v1}, Lu4/s;->l(Lw4/d;)Lu4/r;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Lg4/h;->a()Lu4/o;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v2, p0, Lg4/b;->h:Lu4/t;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v0, v1, v2, v3, p1}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v3}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    iget-object v0, v2, Lg4/i;->b:Lg4/j;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "declared "

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, " but returned "

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public final m()V
    .locals 5

    .line 1
    iget-object v0, p0, Lg4/b;->a:Lg4/i;

    .line 2
    .line 3
    iget-object v1, v0, Lg4/i;->b:Lg4/j;

    .line 4
    .line 5
    sget-object v2, Lg4/j;->l:Lg4/j;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lg4/j;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lu4/m;

    .line 14
    .line 15
    sget-object v1, Lu4/s;->w1:Lu4/r;

    .line 16
    .line 17
    iget-object v2, p0, Lg4/b;->h:Lu4/t;

    .line 18
    .line 19
    sget-object v3, Lu4/p;->i:Lu4/p;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v0, v1, v2, v4, v3}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v4}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, v0, Lg4/i;->b:Lg4/j;

    .line 30
    .line 31
    const-string v1, " but returned void"

    .line 32
    .line 33
    const-string v2, "declared "

    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lbsh/j;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
