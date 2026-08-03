.class public final Lw4/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final k:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Lw4/c;

.field public final i:Lw4/b;

.field public j:Lw4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lw4/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lw4/c;Lw4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lw4/a;->g:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lw4/a;->h:Lw4/c;

    .line 11
    .line 12
    iput-object p3, p0, Lw4/a;->i:Lw4/b;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lw4/a;->j:Lw4/b;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "returnType == null"

    .line 19
    .line 20
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1

    .line 25
    :cond_1
    const-string p1, "descriptor == null"

    .line 26
    .line 27
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public static b(Ljava/lang/String;)Lw4/a;
    .locals 11

    .line 1
    sget-object v0, Lw4/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw4/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x28

    .line 22
    .line 23
    const-string v4, "bad descriptor"

    .line 24
    .line 25
    if-ne v2, v3, :cond_b

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    move v5, v1

    .line 29
    move v3, v2

    .line 30
    :goto_0
    const/16 v6, 0x29

    .line 31
    .line 32
    if-ge v3, v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-ne v7, v6, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v6, 0x41

    .line 42
    .line 43
    if-lt v7, v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x5a

    .line 46
    .line 47
    if-gt v7, v6, :cond_2

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    move v3, v1

    .line 55
    :goto_1
    if-eqz v3, :cond_a

    .line 56
    .line 57
    sub-int/2addr v0, v2

    .line 58
    if-eq v3, v0, :cond_a

    .line 59
    .line 60
    add-int/2addr v3, v2

    .line 61
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v3, -0x1

    .line 66
    if-ne v0, v3, :cond_9

    .line 67
    .line 68
    new-array v0, v5, [Lw4/c;

    .line 69
    .line 70
    move v7, v1

    .line 71
    move v5, v2

    .line 72
    :goto_2
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-ne v8, v6, :cond_5

    .line 77
    .line 78
    add-int/2addr v5, v2

    .line 79
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Lw4/c;->o(Ljava/lang/String;)Lw4/c;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v3, Lw4/b;

    .line 88
    .line 89
    invoke-direct {v3, v7}, Lz4/e;-><init>(I)V

    .line 90
    .line 91
    .line 92
    :goto_3
    if-ge v1, v7, :cond_4

    .line 93
    .line 94
    aget-object v4, v0, v1

    .line 95
    .line 96
    invoke-virtual {v3, v1, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    new-instance v0, Lw4/a;

    .line 103
    .line 104
    invoke-direct {v0, p0, v2, v3}, Lw4/a;-><init>(Ljava/lang/String;Lw4/c;Lw4/b;)V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_5
    move v9, v5

    .line 109
    :goto_4
    const/16 v10, 0x5b

    .line 110
    .line 111
    if-ne v8, v10, :cond_6

    .line 112
    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    goto :goto_4

    .line 120
    :cond_6
    const/16 v10, 0x4c

    .line 121
    .line 122
    if-ne v8, v10, :cond_8

    .line 123
    .line 124
    const/16 v8, 0x3b

    .line 125
    .line 126
    invoke-virtual {p0, v8, v9}, Ljava/lang/String;->indexOf(II)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eq v8, v3, :cond_7

    .line 131
    .line 132
    add-int/lit8 v8, v8, 0x1

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_7
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_5
    const/4 p0, 0x0

    .line 139
    return-object p0

    .line 140
    :cond_8
    add-int/lit8 v8, v9, 0x1

    .line 141
    .line 142
    :goto_6
    invoke-virtual {p0, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-static {v5}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    aput-object v5, v0, v7

    .line 151
    .line 152
    add-int/lit8 v7, v7, 0x1

    .line 153
    .line 154
    move v5, v8

    .line 155
    goto :goto_2

    .line 156
    :cond_9
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_a
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_b
    invoke-static {v4}, Lj8/o;->t(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_5
.end method

.method public static d(Ljava/lang/String;)Lw4/a;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    sget-object v0, Lw4/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lw4/a;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-static {p0}, Lw4/a;->b(Ljava/lang/String;)Lw4/a;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object v1, p0, Lw4/a;->g:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lw4/a;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    return-object p0

    .line 30
    :cond_2
    const-string p0, "descriptor == null"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final a(Lw4/a;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    iget-object v1, p1, Lw4/a;->h:Lw4/c;

    .line 6
    .line 7
    iget-object p1, p1, Lw4/a;->i:Lw4/b;

    .line 8
    .line 9
    iget-object v2, p0, Lw4/a;->h:Lw4/c;

    .line 10
    .line 11
    iget-object v2, v2, Lw4/c;->g:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, v1, Lw4/c;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    iget-object v1, p0, Lw4/a;->i:Lw4/b;

    .line 23
    .line 24
    iget-object v2, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 25
    .line 26
    array-length v2, v2

    .line 27
    iget-object v3, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 28
    .line 29
    array-length v3, v3

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    move v5, v0

    .line 35
    :goto_0
    if-ge v5, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lw4/c;

    .line 42
    .line 43
    invoke-virtual {p1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Lw4/c;

    .line 48
    .line 49
    iget-object v6, v6, Lw4/c;->g:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v7, v7, Lw4/c;->g:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v6, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    return v6

    .line 60
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-ge v2, v3, :cond_4

    .line 64
    .line 65
    const/4 p1, -0x1

    .line 66
    return p1

    .line 67
    :cond_4
    if-le v2, v3, :cond_5

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_5
    :goto_1
    return v0
.end method

.method public final c()Lw4/b;
    .locals 7

    .line 1
    iget-object v0, p0, Lw4/a;->j:Lw4/b;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lw4/a;->i:Lw4/b;

    .line 6
    .line 7
    iget-object v1, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    new-instance v2, Lw4/b;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lw4/c;

    .line 24
    .line 25
    invoke-virtual {v5}, Lw4/c;->s()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    sget-object v5, Lw4/c;->t:Lw4/c;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    :cond_0
    invoke-virtual {v2, v3, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-eqz v4, :cond_2

    .line 41
    .line 42
    move-object v0, v2

    .line 43
    :cond_2
    iput-object v0, p0, Lw4/a;->j:Lw4/b;

    .line 44
    .line 45
    :cond_3
    iget-object v0, p0, Lw4/a;->j:Lw4/b;

    .line 46
    .line 47
    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lw4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw4/a;->a(Lw4/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(Lw4/c;)Lw4/a;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lw4/c;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lw4/a;->g:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lw4/a;->i:Lw4/b;

    .line 28
    .line 29
    iget-object v2, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 30
    .line 31
    array-length v2, v2

    .line 32
    new-instance v3, Lw4/b;

    .line 33
    .line 34
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    invoke-direct {v3, v4}, Lz4/e;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v3, v4, p1}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move p1, v4

    .line 44
    :goto_0
    if-ge p1, v2, :cond_0

    .line 45
    .line 46
    add-int/lit8 v5, p1, 0x1

    .line 47
    .line 48
    iget-object v6, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 49
    .line 50
    aget-object p1, v6, p1

    .line 51
    .line 52
    invoke-virtual {v3, v5, p1}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move p1, v5

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iput-boolean v4, v3, Lz4/j;->g:Z

    .line 58
    .line 59
    new-instance p1, Lw4/a;

    .line 60
    .line 61
    iget-object v1, p0, Lw4/a;->h:Lw4/c;

    .line 62
    .line 63
    invoke-direct {p1, v0, v1, v3}, Lw4/a;-><init>(Ljava/lang/String;Lw4/c;Lw4/b;)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lw4/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lw4/a;

    .line 73
    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_1
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lw4/a;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lw4/a;

    .line 12
    .line 13
    iget-object p1, p1, Lw4/a;->g:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, Lw4/a;->g:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
