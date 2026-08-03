.class public final synthetic Lwb/bl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/bl;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/bl;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/bl;->i:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/bl;->j:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/bl;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/bl;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/bl;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/bl;->n:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/bl;->o:Li0/a1;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/bl;->p:Li0/a1;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/bl;->q:Li0/a1;

    .line 26
    .line 27
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lwb/bl;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/bl;->j:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/bl;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/bl;->i:Li0/a1;

    iput-object p4, p0, Lwb/bl;->k:Li0/a1;

    iput-object p5, p0, Lwb/bl;->l:Li0/a1;

    iput-object p6, p0, Lwb/bl;->m:Li0/a1;

    iput-object p7, p0, Lwb/bl;->n:Li0/a1;

    iput-object p8, p0, Lwb/bl;->o:Li0/a1;

    iput-object p9, p0, Lwb/bl;->p:Li0/a1;

    iput-object p10, p0, Lwb/bl;->q:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/bl;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/h;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v2, Lwb/p0;->z0:Ls0/d;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lwb/oa;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    iget-object v7, v0, Lwb/bl;->h:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v6, v0, Lwb/bl;->i:Li0/a1;

    .line 28
    .line 29
    invoke-direct {v2, v7, v6, v5}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Ls0/d;

    .line 33
    .line 34
    const v8, 0x28fb75eb

    .line 35
    .line 36
    .line 37
    const/4 v12, 0x1

    .line 38
    invoke-direct {v5, v8, v2, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3, v5, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    sget-object v2, Lwb/p0;->A0:Ls0/d;

    .line 57
    .line 58
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 59
    .line 60
    .line 61
    new-instance v13, Lwb/pa;

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    iget-object v14, v0, Lwb/bl;->j:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    iget-object v15, v0, Lwb/bl;->k:Li0/a1;

    .line 68
    .line 69
    iget-object v2, v0, Lwb/bl;->l:Li0/a1;

    .line 70
    .line 71
    iget-object v5, v0, Lwb/bl;->m:Li0/a1;

    .line 72
    .line 73
    move-object/from16 v16, v2

    .line 74
    .line 75
    move-object/from16 v17, v5

    .line 76
    .line 77
    invoke-direct/range {v13 .. v18}, Lwb/pa;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Ls0/d;

    .line 81
    .line 82
    const v5, 0x7d176270

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, v5, v13, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 89
    .line 90
    .line 91
    sget-object v2, Lwb/p0;->B0:Ls0/d;

    .line 92
    .line 93
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Lc9/k0;

    .line 97
    .line 98
    const/16 v11, 0x8

    .line 99
    .line 100
    iget-object v9, v0, Lwb/bl;->n:Li0/a1;

    .line 101
    .line 102
    iget-object v10, v0, Lwb/bl;->o:Li0/a1;

    .line 103
    .line 104
    move-object v8, v14

    .line 105
    invoke-direct/range {v6 .. v11}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    new-instance v2, Ls0/d;

    .line 109
    .line 110
    const v5, 0x7c3627ae

    .line 111
    .line 112
    .line 113
    invoke-direct {v2, v5, v6, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 117
    .line 118
    .line 119
    sget-object v2, Lwb/p0;->C0:Ls0/d;

    .line 120
    .line 121
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 122
    .line 123
    .line 124
    new-instance v2, Lc9/h0;

    .line 125
    .line 126
    const/16 v5, 0x9

    .line 127
    .line 128
    iget-object v6, v0, Lwb/bl;->p:Li0/a1;

    .line 129
    .line 130
    iget-object v8, v0, Lwb/bl;->q:Li0/a1;

    .line 131
    .line 132
    invoke-direct {v2, v6, v7, v8, v5}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    new-instance v5, Ls0/d;

    .line 136
    .line 137
    const v6, 0x7b54ecec

    .line 138
    .line 139
    .line 140
    invoke-direct {v5, v6, v2, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3, v5, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 144
    .line 145
    .line 146
    :cond_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 147
    .line 148
    return-object v1

    .line 149
    :pswitch_0
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, Lr/h;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    sget-object v2, Lwb/p0;->I0:Ls0/d;

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    const/4 v4, 0x3

    .line 160
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 161
    .line 162
    .line 163
    new-instance v5, Lwb/uc;

    .line 164
    .line 165
    iget-object v6, v0, Lwb/bl;->j:Landroid/content/SharedPreferences;

    .line 166
    .line 167
    iget-object v7, v0, Lwb/bl;->h:Landroid/content/Context;

    .line 168
    .line 169
    iget-object v8, v0, Lwb/bl;->i:Li0/a1;

    .line 170
    .line 171
    iget-object v9, v0, Lwb/bl;->k:Li0/a1;

    .line 172
    .line 173
    iget-object v10, v0, Lwb/bl;->l:Li0/a1;

    .line 174
    .line 175
    iget-object v11, v0, Lwb/bl;->m:Li0/a1;

    .line 176
    .line 177
    iget-object v12, v0, Lwb/bl;->n:Li0/a1;

    .line 178
    .line 179
    iget-object v13, v0, Lwb/bl;->o:Li0/a1;

    .line 180
    .line 181
    iget-object v14, v0, Lwb/bl;->p:Li0/a1;

    .line 182
    .line 183
    invoke-direct/range {v5 .. v14}, Lwb/uc;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Ls0/d;

    .line 187
    .line 188
    const v6, -0x5fb7e4f7

    .line 189
    .line 190
    .line 191
    const/4 v8, 0x1

    .line 192
    invoke-direct {v2, v6, v5, v8}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 196
    .line 197
    .line 198
    sget-object v2, Lwb/p0;->J0:Ls0/d;

    .line 199
    .line 200
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 201
    .line 202
    .line 203
    new-instance v2, Lwb/oa;

    .line 204
    .line 205
    const/4 v5, 0x3

    .line 206
    iget-object v6, v0, Lwb/bl;->q:Li0/a1;

    .line 207
    .line 208
    invoke-direct {v2, v7, v6, v5}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 209
    .line 210
    .line 211
    new-instance v5, Ls0/d;

    .line 212
    .line 213
    const v6, -0x7787e0f5

    .line 214
    .line 215
    .line 216
    invoke-direct {v5, v6, v2, v8}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 217
    .line 218
    .line 219
    invoke-static {v1, v3, v5, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 220
    .line 221
    .line 222
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    return-object v1

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
