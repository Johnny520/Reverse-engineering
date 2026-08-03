.class public final synthetic Ls/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lm/k2;

.field public final synthetic h:I

.field public final synthetic i:F

.field public final synthetic j:Lgg/r;

.field public final synthetic k:Lgg/q;

.field public final synthetic l:Z

.field public final synthetic m:F

.field public final synthetic n:Lgg/s;

.field public final synthetic o:I

.field public final synthetic p:Lgg/u;


# direct methods
.method public synthetic constructor <init>(Lm/k2;IFLgg/r;Lgg/q;ZFLgg/s;ILgg/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/p0;->g:Lm/k2;

    .line 5
    .line 6
    iput p2, p0, Ls/p0;->h:I

    .line 7
    .line 8
    iput p3, p0, Ls/p0;->i:F

    .line 9
    .line 10
    iput-object p4, p0, Ls/p0;->j:Lgg/r;

    .line 11
    .line 12
    iput-object p5, p0, Ls/p0;->k:Lgg/q;

    .line 13
    .line 14
    iput-boolean p6, p0, Ls/p0;->l:Z

    .line 15
    .line 16
    iput p7, p0, Ls/p0;->m:F

    .line 17
    .line 18
    iput-object p8, p0, Ls/p0;->n:Lgg/s;

    .line 19
    .line 20
    iput p9, p0, Ls/p0;->o:I

    .line 21
    .line 22
    iput-object p10, p0, Ls/p0;->p:Lgg/u;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Ls/p0;->g:Lm/k2;

    .line 2
    .line 3
    iget-object v1, v0, Lm/k2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr/z;

    .line 6
    .line 7
    check-cast p1, Li/j;

    .line 8
    .line 9
    iget v2, p0, Ls/p0;->h:I

    .line 10
    .line 11
    invoke-static {v0, v2}, Ls/r0;->c(Lm/k2;I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x1

    .line 16
    iget-object v5, p0, Ls/p0;->k:Lgg/q;

    .line 17
    .line 18
    iget-boolean v6, p0, Ls/p0;->l:Z

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    if-nez v3, :cond_7

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    iget v8, p0, Ls/p0;->i:F

    .line 25
    .line 26
    cmpl-float v3, v8, v3

    .line 27
    .line 28
    if-lez v3, :cond_1

    .line 29
    .line 30
    iget-object v3, p1, Li/j;->e:Li0/j1;

    .line 31
    .line 32
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    cmpl-float v9, v3, v8

    .line 43
    .line 44
    if-lez v9, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v8, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v3, p1, Li/j;->e:Li0/j1;

    .line 50
    .line 51
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    cmpg-float v9, v3, v8

    .line 62
    .line 63
    if-gez v9, :cond_0

    .line 64
    .line 65
    :goto_0
    iget-object v3, p0, Ls/p0;->j:Lgg/r;

    .line 66
    .line 67
    iget v9, v3, Lgg/r;->g:F

    .line 68
    .line 69
    sub-float/2addr v8, v9

    .line 70
    iget-object v9, v0, Lm/k2;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, Lm/u1;

    .line 73
    .line 74
    invoke-interface {v9, v8}, Lm/u1;->a(F)F

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-static {v0, v2}, Ls/r0;->c(Lm/k2;I)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-static {v6, v0, v2}, Ls/r0;->b(ZLm/k2;I)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-nez v10, :cond_7

    .line 90
    .line 91
    cmpg-float v9, v8, v9

    .line 92
    .line 93
    if-nez v9, :cond_6

    .line 94
    .line 95
    iget v9, v3, Lgg/r;->g:F

    .line 96
    .line 97
    add-float/2addr v9, v8

    .line 98
    iput v9, v3, Lgg/r;->g:F

    .line 99
    .line 100
    iget v3, p0, Ls/p0;->m:F

    .line 101
    .line 102
    if-eqz v6, :cond_3

    .line 103
    .line 104
    iget-object v8, p1, Li/j;->e:Li0/j1;

    .line 105
    .line 106
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    cmpl-float v3, v8, v3

    .line 117
    .line 118
    if-lez v3, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1}, Li/j;->a()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    iget-object v8, p1, Li/j;->e:Li0/j1;

    .line 125
    .line 126
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    check-cast v8, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    neg-float v3, v3

    .line 137
    cmpg-float v3, v8, v3

    .line 138
    .line 139
    if-gez v3, :cond_4

    .line 140
    .line 141
    invoke-virtual {p1}, Li/j;->a()V

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_1
    iget-object v3, p0, Ls/p0;->n:Lgg/s;

    .line 145
    .line 146
    iget v3, v3, Lgg/s;->g:I

    .line 147
    .line 148
    iget v8, p0, Ls/p0;->o:I

    .line 149
    .line 150
    const/4 v9, 0x2

    .line 151
    if-eqz v6, :cond_5

    .line 152
    .line 153
    if-lt v3, v9, :cond_7

    .line 154
    .line 155
    invoke-virtual {v0}, Lm/k2;->c()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    sub-int v3, v2, v3

    .line 160
    .line 161
    if-le v3, v8, :cond_7

    .line 162
    .line 163
    sub-int v3, v2, v8

    .line 164
    .line 165
    invoke-virtual {v1, v3, v4}, Lr/z;->n(IZ)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    if-lt v3, v9, :cond_7

    .line 170
    .line 171
    invoke-virtual {v1}, Lr/z;->h()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    sub-int/2addr v3, v2

    .line 176
    if-le v3, v8, :cond_7

    .line 177
    .line 178
    add-int/2addr v8, v2

    .line 179
    invoke-virtual {v1, v8, v4}, Lr/z;->n(IZ)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    invoke-virtual {p1}, Li/j;->a()V

    .line 184
    .line 185
    .line 186
    iput-boolean v7, v5, Lgg/q;->g:Z

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    :goto_2
    invoke-static {v6, v0, v2}, Ls/r0;->b(ZLm/k2;I)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_8

    .line 194
    .line 195
    invoke-virtual {v1, v2, v4}, Lr/z;->n(IZ)V

    .line 196
    .line 197
    .line 198
    iput-boolean v7, v5, Lgg/q;->g:Z

    .line 199
    .line 200
    invoke-virtual {p1}, Li/j;->a()V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    invoke-static {v0, v2}, Ls/r0;->c(Lm/k2;I)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_9

    .line 209
    .line 210
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 211
    .line 212
    return-object p1

    .line 213
    :cond_9
    invoke-static {v0, v2}, Lm/k2;->b(Lm/k2;I)I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    new-instance v0, Ls/j;

    .line 218
    .line 219
    iget-object v1, p0, Ls/p0;->p:Lgg/u;

    .line 220
    .line 221
    iget-object v1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v1, Li/l;

    .line 224
    .line 225
    invoke-direct {v0, p1, v1}, Ls/j;-><init>(ILi/l;)V

    .line 226
    .line 227
    .line 228
    throw v0
.end method
