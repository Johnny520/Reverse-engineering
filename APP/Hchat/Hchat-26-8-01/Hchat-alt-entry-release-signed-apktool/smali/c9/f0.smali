.class public final synthetic Lc9/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc9/j1;Lfg/a;Ljava/lang/String;Lfg/a;ZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc9/f0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lc9/f0;->k:Z

    .line 16
    .line 17
    iput p6, p0, Lc9/f0;->l:I

    .line 18
    .line 19
    iput p7, p0, Lc9/f0;->m:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lfg/a;Ly0/o;ZIII)V
    .locals 0

    .line 22
    iput p8, p0, Lc9/f0;->g:I

    iput-object p1, p0, Lc9/f0;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/f0;->i:Ljava/lang/String;

    iput-object p3, p0, Lc9/f0;->j:Ljava/lang/Object;

    iput-object p4, p0, Lc9/f0;->n:Ljava/lang/Object;

    iput-boolean p5, p0, Lc9/f0;->k:Z

    iput p6, p0, Lc9/f0;->l:I

    iput p7, p0, Lc9/f0;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZI)V
    .locals 1

    .line 23
    const/4 v0, 0x3

    iput v0, p0, Lc9/f0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/f0;->i:Ljava/lang/String;

    iput-object p2, p0, Lc9/f0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc9/f0;->j:Ljava/lang/Object;

    iput p4, p0, Lc9/f0;->l:I

    iput-object p5, p0, Lc9/f0;->n:Ljava/lang/Object;

    iput-boolean p6, p0, Lc9/f0;->k:Z

    iput p7, p0, Lc9/f0;->m:I

    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Ljava/lang/String;Ljava/lang/String;ZILfg/l;I)V
    .locals 1

    .line 24
    const/4 v0, 0x2

    iput v0, p0, Lc9/f0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/f0;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/f0;->i:Ljava/lang/String;

    iput-object p3, p0, Lc9/f0;->j:Ljava/lang/Object;

    iput-boolean p4, p0, Lc9/f0;->k:Z

    iput p5, p0, Lc9/f0;->l:I

    iput-object p6, p0, Lc9/f0;->n:Ljava/lang/Object;

    iput p7, p0, Lc9/f0;->m:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lc9/f0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lfg/a;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Ly0/o;

    .line 20
    .line 21
    move-object v6, p1

    .line 22
    check-cast v6, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lc9/f0;->l:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Li0/r;->C(I)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v2, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 38
    .line 39
    iget-boolean v5, p0, Lc9/f0;->k:Z

    .line 40
    .line 41
    iget v8, p0, Lc9/f0;->m:I

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    iget-object v0, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    check-cast v3, Ljava/util/List;

    .line 58
    .line 59
    iget-object v0, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v5, v0

    .line 62
    check-cast v5, Lfg/l;

    .line 63
    .line 64
    move-object v7, p1

    .line 65
    check-cast v7, Li0/h0;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget p1, p0, Lc9/f0;->m:I

    .line 73
    .line 74
    or-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    invoke-static {p1}, Li0/r;->C(I)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    iget-object v1, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 81
    .line 82
    iget v4, p0, Lc9/f0;->l:I

    .line 83
    .line 84
    iget-boolean v6, p0, Lc9/f0;->k:Z

    .line 85
    .line 86
    invoke-static/range {v1 .. v8}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v1, v0

    .line 93
    check-cast v1, Lwb/y2;

    .line 94
    .line 95
    iget-object v0, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v7, v0

    .line 98
    check-cast v7, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v4, v0

    .line 103
    check-cast v4, Lfg/l;

    .line 104
    .line 105
    move-object v5, p1

    .line 106
    check-cast v5, Li0/h0;

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget p1, p0, Lc9/f0;->m:I

    .line 114
    .line 115
    or-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    invoke-static {p1}, Li0/r;->C(I)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    iget v2, p0, Lc9/f0;->l:I

    .line 122
    .line 123
    iget-object v6, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 124
    .line 125
    iget-boolean v8, p0, Lc9/f0;->k:Z

    .line 126
    .line 127
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->p(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_2
    iget-object v0, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v1, v0

    .line 134
    check-cast v1, Lc9/j1;

    .line 135
    .line 136
    iget-object v0, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 137
    .line 138
    move-object v3, v0

    .line 139
    check-cast v3, Lfg/a;

    .line 140
    .line 141
    iget-object v0, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v4, v0

    .line 144
    check-cast v4, Ly0/o;

    .line 145
    .line 146
    move-object v6, p1

    .line 147
    check-cast v6, Li0/h0;

    .line 148
    .line 149
    check-cast p2, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget p1, p0, Lc9/f0;->l:I

    .line 155
    .line 156
    or-int/lit8 p1, p1, 0x1

    .line 157
    .line 158
    invoke-static {p1}, Li0/r;->C(I)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    iget-object v2, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 163
    .line 164
    iget-boolean v5, p0, Lc9/f0;->k:Z

    .line 165
    .line 166
    iget v8, p0, Lc9/f0;->m:I

    .line 167
    .line 168
    invoke-virtual/range {v1 .. v8}, Lc9/j1;->e(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :pswitch_3
    iget-object v0, p0, Lc9/f0;->h:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v1, v0

    .line 175
    check-cast v1, Lc9/j1;

    .line 176
    .line 177
    iget-object v0, p0, Lc9/f0;->j:Ljava/lang/Object;

    .line 178
    .line 179
    move-object v2, v0

    .line 180
    check-cast v2, Lfg/a;

    .line 181
    .line 182
    iget-object v0, p0, Lc9/f0;->n:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v4, v0

    .line 185
    check-cast v4, Lfg/a;

    .line 186
    .line 187
    move-object v6, p1

    .line 188
    check-cast v6, Li0/h0;

    .line 189
    .line 190
    check-cast p2, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget p1, p0, Lc9/f0;->l:I

    .line 196
    .line 197
    or-int/lit8 p1, p1, 0x1

    .line 198
    .line 199
    invoke-static {p1}, Li0/r;->C(I)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    iget-object v3, p0, Lc9/f0;->i:Ljava/lang/String;

    .line 204
    .line 205
    iget-boolean v5, p0, Lc9/f0;->k:Z

    .line 206
    .line 207
    iget v8, p0, Lc9/f0;->m:I

    .line 208
    .line 209
    invoke-virtual/range {v1 .. v8}, Lc9/j1;->f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
