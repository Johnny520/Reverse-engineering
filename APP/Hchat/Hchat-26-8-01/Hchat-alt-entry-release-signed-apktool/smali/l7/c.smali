.class public final Ll7/c;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final q:Lj8/o;


# instance fields
.field public final synthetic o:I

.field public final p:Lo7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj8/o;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll7/c;->q:Lj8/o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Ll7/c;->o:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp7/e;

    .line 7
    .line 8
    invoke-direct {p1}, Lp7/e;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, p1, v0}, Ll7/a;-><init>(Lp7/a;I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lo7/c;

    .line 16
    .line 17
    sget-object v1, Ll7/c;->q:Lj8/o;

    .line 18
    .line 19
    iget-object p1, p1, Lp7/e;->s:Lr7/f;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Lo7/c;-><init>(Lk7/f;Lr7/g;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    new-instance p1, Lp7/d;

    .line 31
    .line 32
    invoke-direct {p1}, Lp7/d;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-direct {p0, p1, v0}, Ll7/a;-><init>(Lp7/a;I)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lo7/b;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p1, v0}, Lo7/b;-><init>(Lk7/f;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ll7/c;->p:Lo7/b;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    new-instance p1, Lp7/c;

    .line 52
    .line 53
    invoke-direct {p1}, Lp7/c;-><init>()V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {p0, p1, v0}, Ll7/a;-><init>(Lp7/a;I)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lj7/a;

    .line 61
    .line 62
    iget-object p1, p1, Lp7/c;->r:Lr7/f;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p1, v1}, Lj7/a;-><init>(Lr7/f;I)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final U()V
    .locals 0

    .line 1
    return-void
.end method

.method private final V()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 4

    .line 1
    iget v0, p0, Ll7/c;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ll7/a;->B(Lq7/b;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Ll7/a;->Q(Lp7/b;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lp7/a;->o:Lr7/f;

    .line 21
    .line 22
    iget v0, v0, Lr7/f;->n:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lq7/b;->a(I)Lq7/b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Ll7/a;->m:Lp7/a;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lk7/a;->G(Lq7/b;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Lp7/a;->Q()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x11

    .line 44
    .line 45
    if-ne v2, v3, :cond_0

    .line 46
    .line 47
    new-instance v2, Ll7/c;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {v2, v3}, Ll7/c;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Ll7/c;->p:Lo7/b;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lo7/b;->M(Lk7/a;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lk7/a;->G(Lq7/b;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {p1, v0}, Lq7/b;->c(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lq7/b;->close()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final S()V
    .locals 2

    .line 1
    iget v0, p0, Ll7/c;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 8
    .line 9
    check-cast v0, Lp7/c;

    .line 10
    .line 11
    iget-object v0, v0, Lp7/c;->r:Lr7/f;

    .line 12
    .line 13
    iget-object v1, p0, Ll7/c;->p:Lo7/b;

    .line 14
    .line 15
    check-cast v1, Lj7/a;

    .line 16
    .line 17
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 18
    .line 19
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lr7/f;->k(I)V

    .line 24
    .line 25
    .line 26
    :pswitch_1
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Ll7/c;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 7
    .line 8
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 16
    .line 17
    check-cast v0, Lj7/a;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Lk7/b;->j0(Z)Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_1
    iget-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 26
    .line 27
    check-cast v0, Lo7/c;

    .line 28
    .line 29
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 30
    .line 31
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget v0, p0, Ll7/c;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Ll7/c;->p:Lo7/b;

    .line 4
    .line 5
    iget-object v2, p0, Ll7/a;->m:Lp7/a;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-super {p0}, Ll7/a;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "name=\'"

    .line 18
    .line 19
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v2, Lp7/d;

    .line 23
    .line 24
    iget-object v3, v2, Lp7/d;->r:Lr7/d;

    .line 25
    .line 26
    iget-object v3, v3, Lr7/r;->m:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, "\', actor=\'"

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, v2, Lp7/d;->s:Lr7/d;

    .line 37
    .line 38
    iget-object v2, v2, Lr7/r;->m:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "\', policies="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 49
    .line 50
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-class v3, Ll7/c;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v3, ": flags="

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    check-cast v2, Lp7/e;

    .line 82
    .line 83
    iget-object v2, v2, Lp7/e;->r:Lr7/f;

    .line 84
    .line 85
    iget v2, v2, Lr7/f;->n:I

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    if-nez v2, :cond_0

    .line 90
    .line 91
    sget-object v2, Ll7/h;->c:[Ll7/h;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget-object v5, Ll7/h;->c:[Ll7/h;

    .line 95
    .line 96
    const/16 v6, 0x9

    .line 97
    .line 98
    new-array v7, v6, [Ll7/h;

    .line 99
    .line 100
    move v8, v4

    .line 101
    move v9, v8

    .line 102
    :goto_0
    if-ge v8, v6, :cond_2

    .line 103
    .line 104
    aget-object v10, v5, v8

    .line 105
    .line 106
    iget v11, v10, Ll7/h;->a:I

    .line 107
    .line 108
    and-int v12, v11, v2

    .line 109
    .line 110
    if-ne v12, v11, :cond_1

    .line 111
    .line 112
    aput-object v10, v7, v8

    .line 113
    .line 114
    add-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    if-nez v9, :cond_3

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    if-ne v9, v6, :cond_4

    .line 123
    .line 124
    move-object v3, v7

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    new-array v3, v9, [Ll7/h;

    .line 127
    .line 128
    move v2, v4

    .line 129
    move v5, v2

    .line 130
    :goto_1
    if-ge v2, v6, :cond_6

    .line 131
    .line 132
    aget-object v8, v7, v2

    .line 133
    .line 134
    if-eqz v8, :cond_5

    .line 135
    .line 136
    aput-object v8, v3, v5

    .line 137
    .line 138
    add-int/lit8 v5, v5, 0x1

    .line 139
    .line 140
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    :goto_2
    sget-object v2, Ll7/h;->c:[Ll7/h;

    .line 144
    .line 145
    if-eqz v3, :cond_b

    .line 146
    .line 147
    array-length v2, v3

    .line 148
    if-nez v2, :cond_7

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    array-length v5, v3

    .line 157
    move v6, v4

    .line 158
    :goto_3
    if-ge v4, v5, :cond_a

    .line 159
    .line 160
    aget-object v7, v3, v4

    .line 161
    .line 162
    if-nez v7, :cond_8

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_8
    if-eqz v6, :cond_9

    .line 166
    .line 167
    const/16 v6, 0x7c

    .line 168
    .line 169
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    :cond_9
    iget-object v6, v7, Ll7/h;->b:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const/4 v6, 0x1

    .line 178
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    goto :goto_6

    .line 186
    :cond_b
    :goto_5
    const-string v2, ""

    .line 187
    .line 188
    :goto_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v2, "\', count="

    .line 192
    .line 193
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    check-cast v1, Lo7/c;

    .line 197
    .line 198
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 199
    .line 200
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public y()Z
    .locals 1

    .line 1
    iget v0, p0, Ll7/c;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lk7/a;->y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ll7/c;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    return v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Ll7/c;->p:Lo7/b;

    .line 23
    .line 24
    check-cast v0, Lo7/c;

    .line 25
    .line 26
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 27
    .line 28
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    return v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
