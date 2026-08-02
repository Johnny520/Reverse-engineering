.class public final Ld42;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final l:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Lo43;

.field public final j:Lwu2;

.field public k:Lwu2;


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
    sput-object v0, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo43;Lwu2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Ld42;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Ld42;->i:Lo43;

    .line 12
    .line 13
    iput-object p3, p0, Ld42;->j:Lwu2;

    .line 14
    .line 15
    iput-object v0, p0, Ld42;->k:Lwu2;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "returnType == null"

    .line 19
    .line 20
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    const-string p0, "descriptor == null"

    .line 25
    .line 26
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public static b(Ljava/lang/String;)Ld42;
    .locals 12

    .line 1
    sget-object v0, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld42;

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
    const/4 v4, 0x0

    .line 24
    const-string v5, "bad descriptor"

    .line 25
    .line 26
    if-ne v2, v3, :cond_c

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    move v6, v1

    .line 30
    move v3, v2

    .line 31
    :goto_0
    const/16 v7, 0x29

    .line 32
    .line 33
    if-ge v3, v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-ne v8, v7, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v7, 0x41

    .line 43
    .line 44
    if-lt v8, v7, :cond_2

    .line 45
    .line 46
    const/16 v7, 0x5a

    .line 47
    .line 48
    if-gt v8, v7, :cond_2

    .line 49
    .line 50
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move v3, v1

    .line 56
    :goto_1
    if-eqz v3, :cond_b

    .line 57
    .line 58
    sub-int/2addr v0, v2

    .line 59
    if-eq v3, v0, :cond_b

    .line 60
    .line 61
    add-int/2addr v3, v2

    .line 62
    invoke-virtual {p0, v7, v3}, Ljava/lang/String;->indexOf(II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v3, -0x1

    .line 67
    if-ne v0, v3, :cond_a

    .line 68
    .line 69
    new-array v0, v6, [Lo43;

    .line 70
    .line 71
    move v8, v1

    .line 72
    move v6, v2

    .line 73
    :goto_2
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-ne v9, v7, :cond_6

    .line 78
    .line 79
    add-int/2addr v6, v2

    .line 80
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v3, Lo43;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    :try_start_0
    const-string v3, "V"

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    sget-object v2, Lo43;->v:Lo43;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-static {v2}, Lo43;->g(Ljava/lang/String;)Lo43;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :goto_3
    new-instance v3, Lwu2;

    .line 102
    .line 103
    invoke-direct {v3, v8}, Lkj0;-><init>(I)V

    .line 104
    .line 105
    .line 106
    :goto_4
    if-ge v1, v8, :cond_5

    .line 107
    .line 108
    aget-object v4, v0, v1

    .line 109
    .line 110
    invoke-virtual {v3, v1, v4}, Lkj0;->f(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    new-instance v0, Ld42;

    .line 117
    .line 118
    invoke-direct {v0, p0, v2, v3}, Ld42;-><init>(Ljava/lang/String;Lo43;Lwu2;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :catch_0
    const-string p0, "descriptor == null"

    .line 123
    .line 124
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v4

    .line 128
    :cond_6
    move v10, v6

    .line 129
    :goto_5
    const/16 v11, 0x5b

    .line 130
    .line 131
    if-ne v9, v11, :cond_7

    .line 132
    .line 133
    add-int/lit8 v10, v10, 0x1

    .line 134
    .line 135
    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    const/16 v11, 0x4c

    .line 141
    .line 142
    if-ne v9, v11, :cond_9

    .line 143
    .line 144
    const/16 v9, 0x3b

    .line 145
    .line 146
    invoke-virtual {p0, v9, v10}, Ljava/lang/String;->indexOf(II)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eq v9, v3, :cond_8

    .line 151
    .line 152
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_8
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v4

    .line 159
    :cond_9
    add-int/lit8 v9, v10, 0x1

    .line 160
    .line 161
    :goto_6
    invoke-virtual {p0, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-static {v6}, Lo43;->g(Ljava/lang/String;)Lo43;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    aput-object v6, v0, v8

    .line 170
    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 172
    .line 173
    move v6, v9

    .line 174
    goto :goto_2

    .line 175
    :cond_a
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v4

    .line 179
    :cond_b
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v4

    .line 183
    :cond_c
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v4
.end method


# virtual methods
.method public final a(Ld42;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    iget-object v1, p1, Ld42;->i:Lo43;

    .line 6
    .line 7
    iget-object p1, p1, Ld42;->j:Lwu2;

    .line 8
    .line 9
    iget-object v2, p0, Ld42;->i:Lo43;

    .line 10
    .line 11
    iget-object v2, v2, Lo43;->h:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, v1, Lo43;->h:Ljava/lang/String;

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
    iget-object p0, p0, Ld42;->j:Lwu2;

    .line 23
    .line 24
    iget-object v1, p0, Lkj0;->i:[Ljava/lang/Object;

    .line 25
    .line 26
    array-length v1, v1

    .line 27
    iget-object v2, p1, Lkj0;->i:[Ljava/lang/Object;

    .line 28
    .line 29
    array-length v2, v2

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    move v4, v0

    .line 35
    :goto_0
    if-ge v4, v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, v4}, Lkj0;->e(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lo43;

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Lkj0;->e(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lo43;

    .line 48
    .line 49
    iget-object v5, v5, Lo43;->h:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v6, v6, Lo43;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    return v5

    .line 60
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-ge v1, v2, :cond_4

    .line 64
    .line 65
    const/4 p0, -0x1

    .line 66
    return p0

    .line 67
    :cond_4
    if-le v1, v2, :cond_5

    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_5
    :goto_1
    return v0
.end method

.method public final c()Lwu2;
    .locals 9

    .line 1
    iget-object v0, p0, Ld42;->k:Lwu2;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Ld42;->j:Lwu2;

    .line 6
    .line 7
    iget-object v1, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    new-instance v2, Lwu2;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Lkj0;-><init>(I)V

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
    invoke-virtual {v0, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lo43;

    .line 24
    .line 25
    iget v6, v5, Lo43;->i:I

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    if-eq v6, v7, :cond_0

    .line 29
    .line 30
    const/4 v8, 0x2

    .line 31
    if-eq v6, v8, :cond_0

    .line 32
    .line 33
    const/4 v8, 0x3

    .line 34
    if-eq v6, v8, :cond_0

    .line 35
    .line 36
    const/4 v8, 0x6

    .line 37
    if-eq v6, v8, :cond_0

    .line 38
    .line 39
    const/16 v8, 0x8

    .line 40
    .line 41
    if-eq v6, v8, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    sget-object v5, Lo43;->s:Lo43;

    .line 45
    .line 46
    move v4, v7

    .line 47
    :goto_1
    invoke-virtual {v2, v3, v5}, Lkj0;->f(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    if-eqz v4, :cond_2

    .line 54
    .line 55
    move-object v0, v2

    .line 56
    :cond_2
    iput-object v0, p0, Ld42;->k:Lwu2;

    .line 57
    .line 58
    :cond_3
    iget-object p0, p0, Ld42;->k:Lwu2;

    .line 59
    .line 60
    return-object p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ld42;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld42;->a(Ld42;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Ld42;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Ld42;

    .line 12
    .line 13
    iget-object p1, p1, Ld42;->h:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Ld42;->h:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ld42;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld42;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
