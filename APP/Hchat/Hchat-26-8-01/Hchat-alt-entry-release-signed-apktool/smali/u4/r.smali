.class public final Lu4/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Lw4/c;

.field public final c:Lw4/e;

.field public final d:Lw4/e;

.field public final e:I

.field public final f:Z

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILw4/b;Lw4/e;)V
    .locals 8

    .line 82
    sget-object v2, Lw4/c;->w:Lw4/c;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x6

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Lu4/r;-><init>(ILw4/c;Lw4/e;Lw4/e;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILw4/c;Lw4/e;ILjava/lang/String;)V
    .locals 8

    .line 79
    sget-object v4, Lw4/b;->i:Lw4/b;

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lu4/r;-><init>(ILw4/c;Lw4/e;Lw4/e;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILw4/c;Lw4/e;Ljava/lang/String;)V
    .locals 8

    .line 80
    sget-object v4, Lw4/b;->i:Lw4/b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lu4/r;-><init>(ILw4/c;Lw4/e;Lw4/e;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILw4/c;Lw4/e;Lw4/e;IZLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_5

    .line 5
    .line 6
    if-eqz p3, :cond_4

    .line 7
    .line 8
    if-eqz p4, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-lt p5, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x6

    .line 14
    if-gt p5, v0, :cond_2

    .line 15
    .line 16
    invoke-interface {p4}, Lw4/e;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-ne p5, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p1, "exceptions / branchingness mismatch"

    .line 26
    .line 27
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1

    .line 32
    :cond_1
    :goto_0
    iput p1, p0, Lu4/r;->a:I

    .line 33
    .line 34
    iput-object p2, p0, Lu4/r;->b:Lw4/c;

    .line 35
    .line 36
    iput-object p3, p0, Lu4/r;->c:Lw4/e;

    .line 37
    .line 38
    iput-object p4, p0, Lu4/r;->d:Lw4/e;

    .line 39
    .line 40
    iput p5, p0, Lu4/r;->e:I

    .line 41
    .line 42
    iput-boolean p6, p0, Lu4/r;->f:Z

    .line 43
    .line 44
    iput-object p7, p0, Lu4/r;->g:Ljava/lang/String;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    const-string p1, "invalid branchingness: "

    .line 48
    .line 49
    invoke-static {p5, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    throw p1

    .line 58
    :cond_3
    const-string p1, "exceptions == null"

    .line 59
    .line 60
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1

    .line 65
    :cond_4
    const-string p1, "sources == null"

    .line 66
    .line 67
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    throw p1

    .line 72
    :cond_5
    const-string p1, "result == null"

    .line 73
    .line 74
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    throw p1
.end method

.method public constructor <init>(ILw4/c;Lw4/e;Lw4/e;Ljava/lang/String;)V
    .locals 8

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    .line 81
    invoke-direct/range {v0 .. v7}, Lu4/r;-><init>(ILw4/c;Lw4/e;Lw4/e;IZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/r;->d:Lw4/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/e;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lu4/r;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lu4/r;

    .line 10
    .line 11
    iget v0, p0, Lu4/r;->a:I

    .line 12
    .line 13
    iget v1, p1, Lu4/r;->a:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    iget v0, p0, Lu4/r;->e:I

    .line 18
    .line 19
    iget v1, p1, Lu4/r;->e:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lu4/r;->b:Lw4/c;

    .line 24
    .line 25
    iget-object v1, p1, Lu4/r;->b:Lw4/c;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lu4/r;->c:Lw4/e;

    .line 30
    .line 31
    iget-object v1, p1, Lu4/r;->c:Lw4/e;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lu4/r;->d:Lw4/e;

    .line 40
    .line 41
    iget-object p1, p1, Lu4/r;->d:Lw4/e;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 52
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lu4/r;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget v2, p0, Lu4/r;->e:I

    .line 7
    .line 8
    add-int/2addr v0, v2

    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lu4/r;->b:Lw4/c;

    .line 11
    .line 12
    iget-object v2, v2, Lw4/c;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lu4/r;->c:Lw4/e;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lu4/r;->d:Lw4/e;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Rop{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lu4/r;->a:I

    .line 14
    .line 15
    invoke-static {v1}, Lf8/i;->o0(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lw4/c;->w:Lw4/c;

    .line 23
    .line 24
    const-string v2, " ."

    .line 25
    .line 26
    const-string v3, " "

    .line 27
    .line 28
    iget-object v4, p0, Lu4/r;->b:Lw4/c;

    .line 29
    .line 30
    if-eq v4, v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :goto_0
    const-string v1, " <-"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lu4/r;->c:Lw4/e;

    .line 48
    .line 49
    invoke-interface {v1}, Lw4/e;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/16 v5, 0x20

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    move v2, v6

    .line 63
    :goto_1
    if-ge v2, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    :goto_2
    iget-boolean v1, p0, Lu4/r;->f:Z

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    const-string v1, " call"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-object v1, p0, Lu4/r;->d:Lw4/e;

    .line 88
    .line 89
    invoke-interface {v1}, Lw4/e;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    const-string v3, " throws"

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :goto_3
    if-ge v6, v2, :cond_b

    .line 101
    .line 102
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, v6}, Lw4/e;->getType(I)Lw4/c;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget-object v4, Lw4/c;->H:Lw4/c;

    .line 110
    .line 111
    if-ne v3, v4, :cond_4

    .line 112
    .line 113
    const-string v3, "<any>"

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-interface {v1, v6}, Lw4/e;->getType(I)Lw4/c;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    const/4 v1, 0x1

    .line 130
    iget v2, p0, Lu4/r;->e:I

    .line 131
    .line 132
    if-eq v2, v1, :cond_a

    .line 133
    .line 134
    const/4 v1, 0x2

    .line 135
    if-eq v2, v1, :cond_9

    .line 136
    .line 137
    const/4 v1, 0x3

    .line 138
    if-eq v2, v1, :cond_8

    .line 139
    .line 140
    const/4 v1, 0x4

    .line 141
    if-eq v2, v1, :cond_7

    .line 142
    .line 143
    const/4 v1, 0x5

    .line 144
    if-eq v2, v1, :cond_6

    .line 145
    .line 146
    invoke-static {v2}, La/a;->W0(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_6
    const-string v1, " switches"

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    const-string v1, " ifs"

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_8
    const-string v1, " gotos"

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_9
    const-string v1, " returns"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_a
    const-string v1, " flows"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    :cond_b
    :goto_5
    const/16 v1, 0x7d

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    return-object v0
.end method
