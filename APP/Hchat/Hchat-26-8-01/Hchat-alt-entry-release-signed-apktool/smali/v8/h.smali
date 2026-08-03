.class public final Lv8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Lh/Hchat/hooks/api/model/WeChatMessage;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Z

.field public final k:Ljava/lang/String;

.field public final l:J

.field public final m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:J

.field public v:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLh/Hchat/hooks/api/model/WeChatMessage;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lv8/h;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, Lv8/h;->b:Ljava/lang/String;

    .line 19
    .line 20
    iput-wide p3, p0, Lv8/h;->c:J

    .line 21
    .line 22
    iput-object p5, p0, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 23
    .line 24
    iput-object p6, p0, Lv8/h;->e:Ljava/util/List;

    .line 25
    .line 26
    iput-object p7, p0, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    iput-object p8, p0, Lv8/h;->g:Ljava/lang/String;

    .line 29
    .line 30
    iput p9, p0, Lv8/h;->h:I

    .line 31
    .line 32
    iput-object p10, p0, Lv8/h;->i:Ljava/lang/String;

    .line 33
    .line 34
    iput-boolean p11, p0, Lv8/h;->j:Z

    .line 35
    .line 36
    iput-object p12, p0, Lv8/h;->k:Ljava/lang/String;

    .line 37
    .line 38
    iput-wide p13, p0, Lv8/h;->l:J

    .line 39
    .line 40
    iput-object p15, p0, Lv8/h;->m:Ljava/lang/String;

    .line 41
    .line 42
    const-string p1, ""

    .line 43
    .line 44
    iput-object p1, p0, Lv8/h;->n:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p1, p0, Lv8/h;->o:Ljava/lang/String;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    iput-boolean p2, p0, Lv8/h;->p:Z

    .line 50
    .line 51
    iput-boolean p2, p0, Lv8/h;->q:Z

    .line 52
    .line 53
    iput-boolean p2, p0, Lv8/h;->r:Z

    .line 54
    .line 55
    iput-object p1, p0, Lv8/h;->s:Ljava/lang/String;

    .line 56
    .line 57
    iput-object p1, p0, Lv8/h;->t:Ljava/lang/String;

    .line 58
    .line 59
    const-wide/16 p3, -0x1

    .line 60
    .line 61
    iput-wide p3, p0, Lv8/h;->u:J

    .line 62
    .line 63
    iput p2, p0, Lv8/h;->v:I

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lv8/h;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lv8/h;

    .line 12
    .line 13
    iget-object v0, p0, Lv8/h;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lv8/h;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lv8/h;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lv8/h;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-wide v0, p0, Lv8/h;->c:J

    .line 38
    .line 39
    iget-wide v2, p1, Lv8/h;->c:J

    .line 40
    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 48
    .line 49
    iget-object v1, p1, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_5
    iget-object v0, p0, Lv8/h;->e:Ljava/util/List;

    .line 60
    .line 61
    iget-object v1, p1, Lv8/h;->e:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_6
    iget-object v0, p0, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    iget-object v1, p1, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_7
    iget-object v0, p0, Lv8/h;->g:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v1, p1, Lv8/h;->g:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_8
    iget v0, p0, Lv8/h;->h:I

    .line 96
    .line 97
    iget v1, p1, Lv8/h;->h:I

    .line 98
    .line 99
    if-eq v0, v1, :cond_9

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :cond_9
    iget-object v0, p0, Lv8/h;->i:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p1, Lv8/h;->i:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_a

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :cond_a
    iget-boolean v0, p0, Lv8/h;->j:Z

    .line 116
    .line 117
    iget-boolean v1, p1, Lv8/h;->j:Z

    .line 118
    .line 119
    if-eq v0, v1, :cond_b

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_b
    iget-object v0, p0, Lv8/h;->k:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v1, p1, Lv8/h;->k:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_c
    iget-wide v0, p0, Lv8/h;->l:J

    .line 136
    .line 137
    iget-wide v2, p1, Lv8/h;->l:J

    .line 138
    .line 139
    cmp-long v0, v0, v2

    .line 140
    .line 141
    if-eqz v0, :cond_d

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_d
    iget-object v0, p0, Lv8/h;->m:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v1, p1, Lv8/h;->m:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_e

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_e
    iget-object v0, p0, Lv8/h;->n:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v1, p1, Lv8/h;->n:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_f

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_f
    iget-object v0, p0, Lv8/h;->o:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v1, p1, Lv8/h;->o:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_10

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_10
    iget-boolean v0, p0, Lv8/h;->p:Z

    .line 178
    .line 179
    iget-boolean v1, p1, Lv8/h;->p:Z

    .line 180
    .line 181
    if-eq v0, v1, :cond_11

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_11
    iget-boolean v0, p0, Lv8/h;->q:Z

    .line 185
    .line 186
    iget-boolean v1, p1, Lv8/h;->q:Z

    .line 187
    .line 188
    if-eq v0, v1, :cond_12

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_12
    iget-boolean v0, p0, Lv8/h;->r:Z

    .line 192
    .line 193
    iget-boolean v1, p1, Lv8/h;->r:Z

    .line 194
    .line 195
    if-eq v0, v1, :cond_13

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_13
    iget-object v0, p0, Lv8/h;->s:Ljava/lang/String;

    .line 199
    .line 200
    iget-object v1, p1, Lv8/h;->s:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_14

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_14
    iget-object v0, p0, Lv8/h;->t:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v1, p1, Lv8/h;->t:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_15

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_15
    iget-wide v0, p0, Lv8/h;->u:J

    .line 221
    .line 222
    iget-wide v2, p1, Lv8/h;->u:J

    .line 223
    .line 224
    cmp-long v0, v0, v2

    .line 225
    .line 226
    if-eqz v0, :cond_16

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_16
    iget v0, p0, Lv8/h;->v:I

    .line 230
    .line 231
    iget p1, p1, Lv8/h;->v:I

    .line 232
    .line 233
    if-eq v0, p1, :cond_17

    .line 234
    .line 235
    :goto_0
    const/4 p1, 0x0

    .line 236
    return p1

    .line 237
    :cond_17
    :goto_1
    const/4 p1, 0x1

    .line 238
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lv8/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lv8/h;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lv8/h;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lv8/h;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v0, v2, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-object v0, p0, Lv8/h;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, Leh/a;->g(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p0, Lv8/h;->h:I

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lv8/h;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, Lv8/h;->j:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, Lv8/h;->k:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-wide v2, p0, Lv8/h;->l:J

    .line 75
    .line 76
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, Lv8/h;->m:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lv8/h;->n:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, Lv8/h;->o:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-boolean v2, p0, Lv8/h;->p:Z

    .line 99
    .line 100
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-boolean v2, p0, Lv8/h;->q:Z

    .line 105
    .line 106
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-boolean v2, p0, Lv8/h;->r:Z

    .line 111
    .line 112
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget-object v2, p0, Lv8/h;->s:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iget-object v2, p0, Lv8/h;->t:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget-wide v2, p0, Lv8/h;->u:J

    .line 129
    .line 130
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget v1, p0, Lv8/h;->v:I

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    add-int/2addr v1, v0

    .line 141
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-object v0, p0, Lv8/h;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lv8/h;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lv8/h;->p:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lv8/h;->q:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lv8/h;->r:Z

    .line 10
    .line 11
    iget-object v5, p0, Lv8/h;->s:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lv8/h;->t:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v7, p0, Lv8/h;->u:J

    .line 16
    .line 17
    iget v9, p0, Lv8/h;->v:I

    .line 18
    .line 19
    const-string v10, ", talker="

    .line 20
    .line 21
    const-string v11, ", msgSvrId="

    .line 22
    .line 23
    const-string v12, "PendingForward(key="

    .line 24
    .line 25
    iget-object v13, p0, Lv8/h;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v14, p0, Lv8/h;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v12, v13, v10, v14, v11}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    iget-wide v11, p0, Lv8/h;->c:J

    .line 34
    .line 35
    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v11, ", fallback="

    .line 39
    .line 40
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v11, p0, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 44
    .line 45
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v11, ", targets="

    .line 49
    .line 50
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v11, p0, Lv8/h;->e:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v11, ", targetRules="

    .line 59
    .line 60
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v11, p0, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v11, ", kind="

    .line 69
    .line 70
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v11, p0, Lv8/h;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v11, ", messageType="

    .line 79
    .line 80
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget v11, p0, Lv8/h;->h:I

    .line 84
    .line 85
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v11, ", searchableContent="

    .line 89
    .line 90
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v11, p0, Lv8/h;->i:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v11, ", outgoing="

    .line 99
    .line 100
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget-boolean v11, p0, Lv8/h;->j:Z

    .line 104
    .line 105
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v11, ", sourceSender="

    .line 109
    .line 110
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-object v11, p0, Lv8/h;->k:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v11, ", deadline="

    .line 119
    .line 120
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-wide v11, p0, Lv8/h;->l:J

    .line 124
    .line 125
    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v11, ", cacheToken="

    .line 129
    .line 130
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v11, p0, Lv8/h;->m:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v11, ", downloadTargetPath="

    .line 139
    .line 140
    const-string v12, ", downloadPath="

    .line 141
    .line 142
    invoke-static {v10, v11, v0, v12, v1}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v0, ", downloadRequested="

    .line 146
    .line 147
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, ", downloadInFlight="

    .line 154
    .line 155
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v0, ", downloadFailed="

    .line 162
    .line 163
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v0, ", downloadError="

    .line 170
    .line 171
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v0, ", stableLocalPath="

    .line 178
    .line 179
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v0, ", stableLocalLength="

    .line 186
    .line 187
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v0, ", stableLocalChecks="

    .line 194
    .line 195
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v0, ")"

    .line 202
    .line 203
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0
.end method
