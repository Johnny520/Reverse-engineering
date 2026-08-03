.class public final synthetic Lwb/ik;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ik;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ik;->s:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ik;->t:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ik;->h:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ik;->i:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ik;->j:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ik;->k:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/ik;->l:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/ik;->m:Li0/a1;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/ik;->n:Li0/a1;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/ik;->o:Li0/a1;

    .line 26
    .line 27
    iput-object p11, p0, Lwb/ik;->p:Li0/a1;

    .line 28
    .line 29
    iput-object p12, p0, Lwb/ik;->q:Li0/a1;

    .line 30
    .line 31
    iput-object p13, p0, Lwb/ik;->r:Li0/a1;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lwb/ik;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ik;->s:Ljava/lang/Object;

    iput-object p2, p0, Lwb/ik;->h:Li0/a1;

    iput-object p3, p0, Lwb/ik;->i:Li0/a1;

    iput-object p4, p0, Lwb/ik;->j:Li0/a1;

    iput-object p5, p0, Lwb/ik;->k:Li0/a1;

    iput-object p6, p0, Lwb/ik;->l:Li0/a1;

    iput-object p7, p0, Lwb/ik;->m:Li0/a1;

    iput-object p8, p0, Lwb/ik;->n:Li0/a1;

    iput-object p9, p0, Lwb/ik;->o:Li0/a1;

    iput-object p10, p0, Lwb/ik;->p:Li0/a1;

    iput-object p11, p0, Lwb/ik;->q:Li0/a1;

    iput-object p12, p0, Lwb/ik;->r:Li0/a1;

    iput-object p13, p0, Lwb/ik;->t:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ik;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ik;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/ik;->t:Li0/a1;

    .line 13
    .line 14
    check-cast v2, Li0/j1;

    .line 15
    .line 16
    move-object/from16 v6, p1

    .line 17
    .line 18
    check-cast v6, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v7, v0, Lwb/ik;->h:Li0/a1;

    .line 34
    .line 35
    iget-object v8, v0, Lwb/ik;->i:Li0/a1;

    .line 36
    .line 37
    iget-object v9, v0, Lwb/ik;->j:Li0/a1;

    .line 38
    .line 39
    iget-object v10, v0, Lwb/ik;->k:Li0/a1;

    .line 40
    .line 41
    iget-object v11, v0, Lwb/ik;->l:Li0/a1;

    .line 42
    .line 43
    iget-object v12, v0, Lwb/ik;->m:Li0/a1;

    .line 44
    .line 45
    iget-object v13, v0, Lwb/ik;->n:Li0/a1;

    .line 46
    .line 47
    iget-object v14, v0, Lwb/ik;->o:Li0/a1;

    .line 48
    .line 49
    iget-object v15, v0, Lwb/ik;->p:Li0/a1;

    .line 50
    .line 51
    iget-object v3, v0, Lwb/ik;->q:Li0/a1;

    .line 52
    .line 53
    move-object/from16 v16, v3

    .line 54
    .line 55
    invoke-static/range {v7 .. v16}, Lwb/y2;->B0(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)Lfb/v;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v14, v10

    .line 60
    const/4 v12, 0x0

    .line 61
    const/16 v13, 0x7f7

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    invoke-static/range {v3 .. v13}, Lfb/v;->a(Lfb/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfb/v;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v1, v3}, Lfb/w;->w(Landroid/content/Context;Lfb/v;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v14, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    iget-object v4, v0, Lwb/ik;->r:Li0/a1;

    .line 83
    .line 84
    invoke-interface {v4, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    const-string v2, "\u5df2\u5207\u6362\u6a21\u578b\uff0c\u5c06\u7528\u4e8e\u4e0b\u4e00\u6b21\u8bf7\u6c42"

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const-string v2, "\u5df2\u5207\u6362\u6a21\u578b"

    .line 93
    .line 94
    :goto_0
    const/4 v3, 0x0

    .line 95
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 100
    .line 101
    .line 102
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 103
    .line 104
    return-object v1

    .line 105
    :pswitch_0
    iget-object v1, v0, Lwb/ik;->s:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Landroid/content/SharedPreferences;

    .line 108
    .line 109
    move-object/from16 v2, p1

    .line 110
    .line 111
    check-cast v2, Lr/h;

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v3, Lwb/p0;->F5:Ls0/d;

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x3

    .line 120
    invoke-static {v2, v4, v3, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 121
    .line 122
    .line 123
    new-instance v3, Lwb/vc;

    .line 124
    .line 125
    const/4 v6, 0x4

    .line 126
    iget-object v10, v0, Lwb/ik;->h:Li0/a1;

    .line 127
    .line 128
    invoke-direct {v3, v1, v10, v6}, Lwb/vc;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Ls0/d;

    .line 132
    .line 133
    const v6, 0x2ab836cd

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x1

    .line 137
    invoke-direct {v1, v6, v3, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v4, v1, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Lwb/p0;->G5:Ls0/d;

    .line 144
    .line 145
    invoke-static {v2, v4, v1, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 146
    .line 147
    .line 148
    new-instance v7, Lwb/f8;

    .line 149
    .line 150
    const/4 v12, 0x4

    .line 151
    iget-object v8, v0, Lwb/ik;->i:Li0/a1;

    .line 152
    .line 153
    iget-object v9, v0, Lwb/ik;->j:Li0/a1;

    .line 154
    .line 155
    iget-object v11, v0, Lwb/ik;->k:Li0/a1;

    .line 156
    .line 157
    invoke-direct/range {v7 .. v12}, Lwb/f8;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Ls0/d;

    .line 161
    .line 162
    const v3, 0x77fe8bcf

    .line 163
    .line 164
    .line 165
    invoke-direct {v1, v3, v7, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 166
    .line 167
    .line 168
    invoke-static {v2, v4, v1, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 169
    .line 170
    .line 171
    sget-object v1, Lwb/p0;->H5:Ls0/d;

    .line 172
    .line 173
    invoke-static {v2, v4, v1, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 174
    .line 175
    .line 176
    new-instance v7, Lwb/uc;

    .line 177
    .line 178
    iget-object v8, v0, Lwb/ik;->l:Li0/a1;

    .line 179
    .line 180
    iget-object v9, v0, Lwb/ik;->m:Li0/a1;

    .line 181
    .line 182
    move-object v12, v10

    .line 183
    iget-object v10, v0, Lwb/ik;->n:Li0/a1;

    .line 184
    .line 185
    iget-object v11, v0, Lwb/ik;->o:Li0/a1;

    .line 186
    .line 187
    move v1, v13

    .line 188
    iget-object v13, v0, Lwb/ik;->p:Li0/a1;

    .line 189
    .line 190
    iget-object v14, v0, Lwb/ik;->q:Li0/a1;

    .line 191
    .line 192
    iget-object v15, v0, Lwb/ik;->r:Li0/a1;

    .line 193
    .line 194
    iget-object v3, v0, Lwb/ik;->t:Li0/a1;

    .line 195
    .line 196
    move-object/from16 v16, v3

    .line 197
    .line 198
    invoke-direct/range {v7 .. v16}, Lwb/uc;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 199
    .line 200
    .line 201
    new-instance v3, Ls0/d;

    .line 202
    .line 203
    const v6, -0x3abb1f2f

    .line 204
    .line 205
    .line 206
    invoke-direct {v3, v6, v7, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 207
    .line 208
    .line 209
    invoke-static {v2, v4, v3, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
