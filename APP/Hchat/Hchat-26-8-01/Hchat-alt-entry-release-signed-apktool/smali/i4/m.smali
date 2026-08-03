.class public final Li4/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll4/b;


# instance fields
.field public final a:Ll4/b;

.field public final b:Lk4/b;

.field public final c:Lh4/c;

.field public final d:Li4/p;

.field public final e:Li4/r;


# direct methods
.method public constructor <init>(Ll4/b;Lk4/b;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li4/m;->a:Ll4/b;

    .line 5
    .line 6
    iput-object p2, p0, Li4/m;->b:Lk4/b;

    .line 7
    .line 8
    invoke-interface {p1}, Ll4/a;->getAttributes()Lh4/u;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "Code"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lh4/c;

    .line 19
    .line 20
    iput-object p1, p0, Li4/m;->c:Lh4/c;

    .line 21
    .line 22
    iget-object p1, p1, Lh4/c;->f:Lh4/u;

    .line 23
    .line 24
    sget-object p2, Li4/p;->i:Li4/p;

    .line 25
    .line 26
    const-string v0, "LineNumberTable"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lh4/i;

    .line 33
    .line 34
    :goto_0
    if-eqz v0, :cond_6

    .line 35
    .line 36
    iget-object v1, v0, Lh4/i;->b:Li4/p;

    .line 37
    .line 38
    sget-object v2, Li4/p;->i:Li4/p;

    .line 39
    .line 40
    if-ne p2, v2, :cond_0

    .line 41
    .line 42
    move-object p2, v1

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    iget-object v2, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 45
    .line 46
    array-length v2, v2

    .line 47
    iget-object v3, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 48
    .line 49
    array-length v3, v3

    .line 50
    new-instance v4, Li4/p;

    .line 51
    .line 52
    add-int v5, v2, v3

    .line 53
    .line 54
    invoke-direct {v4, v5}, Lz4/e;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move v6, v5

    .line 59
    :goto_1
    if-ge v6, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p2, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Li4/o;

    .line 66
    .line 67
    invoke-virtual {v4, v6, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :goto_2
    if-ge v5, v3, :cond_2

    .line 74
    .line 75
    add-int p2, v2, v5

    .line 76
    .line 77
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Li4/o;

    .line 82
    .line 83
    invoke-virtual {v4, p2, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move-object p2, v4

    .line 90
    :goto_3
    iget-object v1, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 91
    .line 92
    array-length v1, v1

    .line 93
    const/4 v2, 0x0

    .line 94
    :goto_4
    if-ge v2, v1, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lh4/s;

    .line 101
    .line 102
    if-ne v3, v0, :cond_4

    .line 103
    .line 104
    iget-object v0, v0, Lh4/s;->a:Ljava/lang/String;

    .line 105
    .line 106
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    if-ge v2, v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {p1, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lh4/s;

    .line 115
    .line 116
    iget-object v4, v3, Lh4/s;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_3

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    const/4 v3, 0x0

    .line 129
    :goto_5
    move-object v0, v3

    .line 130
    check-cast v0, Lh4/i;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    iput-object p2, p0, Li4/m;->d:Li4/p;

    .line 134
    .line 135
    sget-object p1, Li4/r;->i:Li4/r;

    .line 136
    .line 137
    iput-object p1, p0, Li4/m;->e:Li4/r;

    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public final a()Lw4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/b;->a()Lw4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()Lv4/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->b()Lv4/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d()Lv4/z;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->d()Lv4/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Lv4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->e()Lv4/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f(I)Lu4/t;
    .locals 9

    .line 1
    new-instance v0, Lu4/t;

    .line 2
    .line 3
    iget-object v1, p0, Li4/m;->b:Lk4/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v1, Lk4/b;->k:Lh4/u;

    .line 9
    .line 10
    const-string v2, "SourceFile"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Lh4/q;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    check-cast v1, Lh4/q;

    .line 21
    .line 22
    iget-object v1, v1, Lh4/q;->b:Lv4/c0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    iget-object v2, p0, Li4/m;->d:Li4/p;

    .line 27
    .line 28
    iget-object v3, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 29
    .line 30
    array-length v3, v3

    .line 31
    const/4 v4, -0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    move v5, v4

    .line 35
    :goto_1
    if-ge v6, v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Li4/o;

    .line 42
    .line 43
    iget v8, v7, Li4/o;->a:I

    .line 44
    .line 45
    if-gt v8, p1, :cond_2

    .line 46
    .line 47
    if-le v8, v4, :cond_2

    .line 48
    .line 49
    iget v5, v7, Li4/o;->b:I

    .line 50
    .line 51
    if-ne v8, p1, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    move v4, v8

    .line 55
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_2
    invoke-direct {v0, v1, p1, v5}, Lu4/t;-><init>(Lv4/c0;II)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public final getAttributes()Lh4/u;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->getAttributes()Lh4/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getName()Lv4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/a;->getName()Lv4/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
