.class public final synthetic Lwb/ne;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:Lwb/n5;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/ArrayList;Ljava/util/ArrayList;Lwb/n5;Li0/a1;Li0/a1;Li0/a1;ILjava/lang/String;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/ne;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ne;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ne;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ne;->j:Lwb/n5;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ne;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ne;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ne;->m:Li0/a1;

    .line 17
    .line 18
    iput p8, p0, Lwb/ne;->n:I

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ne;->o:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ne;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ne;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/ne;->r:Li0/a1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc9/k0;

    .line 7
    .line 8
    const/16 v5, 0x10

    .line 9
    .line 10
    iget-object v1, p0, Lwb/ne;->j:Lwb/n5;

    .line 11
    .line 12
    iget-object v2, p0, Lwb/ne;->k:Li0/a1;

    .line 13
    .line 14
    iget-object v3, p0, Lwb/ne;->l:Li0/a1;

    .line 15
    .line 16
    iget-object v4, p0, Lwb/ne;->m:Li0/a1;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ls0/d;

    .line 22
    .line 23
    const v2, -0x690b0704

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v1, v2, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-static {p1, v0, v1, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lh0/f;

    .line 36
    .line 37
    const/4 v6, 0x5

    .line 38
    iget-boolean v7, p0, Lwb/ne;->g:Z

    .line 39
    .line 40
    invoke-direct {v1, v7, v4, v6}, Lh0/f;-><init>(ZLjava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    new-instance v6, Ls0/d;

    .line 44
    .line 45
    const v8, 0x82bcee5

    .line 46
    .line 47
    .line 48
    invoke-direct {v6, v8, v1, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0, v6, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lwb/mg;

    .line 55
    .line 56
    iget v6, p0, Lwb/ne;->n:I

    .line 57
    .line 58
    iget-object v8, p0, Lwb/ne;->o:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {v1, v6, v8}, Lwb/mg;-><init>(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v6, Ls0/d;

    .line 64
    .line 65
    const v8, 0x2773b6c4

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v8, v1, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v0, v6, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lwb/ne;->p:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    sget-object v1, Lwb/p0;->M5:Ls0/d;

    .line 89
    .line 90
    invoke-static {p1, v0, v1, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_0
    iget-object v1, p0, Lwb/ne;->q:Li0/a1;

    .line 96
    .line 97
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-lez v6, :cond_1

    .line 108
    .line 109
    new-instance v3, Lwb/uf;

    .line 110
    .line 111
    const/4 v4, 0x4

    .line 112
    invoke-direct {v3, v1, v4}, Lwb/uf;-><init>(Li0/a1;I)V

    .line 113
    .line 114
    .line 115
    new-instance v1, Ls0/d;

    .line 116
    .line 117
    const v4, -0x34099a85    # -3.229567E7f

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0, v1, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_1
    if-eqz v7, :cond_3

    .line 128
    .line 129
    iget-object v1, p0, Lwb/ne;->h:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_2

    .line 136
    .line 137
    sget-object v1, Lwb/p0;->O5:Ls0/d;

    .line 138
    .line 139
    invoke-static {p1, v0, v1, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_5

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Lwb/t5;

    .line 158
    .line 159
    new-instance v7, Lc9/h0;

    .line 160
    .line 161
    const/16 v8, 0x17

    .line 162
    .line 163
    invoke-direct {v7, v6, v3, v4, v8}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    new-instance v6, Ls0/d;

    .line 167
    .line 168
    const v8, -0x14114c34

    .line 169
    .line 170
    .line 171
    invoke-direct {v6, v8, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v0, v6, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_3
    iget-object v1, p0, Lwb/ne;->i:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_4

    .line 185
    .line 186
    sget-object v1, Lwb/p0;->Q5:Ls0/d;

    .line 187
    .line 188
    invoke-static {p1, v0, v1, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_5

    .line 201
    .line 202
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Lwb/m5;

    .line 207
    .line 208
    new-instance v4, Ldb/f;

    .line 209
    .line 210
    const/16 v6, 0xe

    .line 211
    .line 212
    iget-object v7, p0, Lwb/ne;->r:Li0/a1;

    .line 213
    .line 214
    invoke-direct {v4, v3, v6, v7}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    new-instance v3, Ls0/d;

    .line 218
    .line 219
    const v6, 0x53561423

    .line 220
    .line 221
    .line 222
    invoke-direct {v3, v6, v4, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 223
    .line 224
    .line 225
    invoke-static {p1, v0, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 230
    .line 231
    return-object p1
.end method
