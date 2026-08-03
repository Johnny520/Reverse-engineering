.class public final synthetic Lwb/dk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/a0;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/a0;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/dk;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/dk;->h:Lwb/a0;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/dk;->i:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/dk;->j:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/dk;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/dk;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/dk;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lwb/a0;Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lwb/dk;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/dk;->h:Lwb/a0;

    iput-object p2, p0, Lwb/dk;->i:Li0/a1;

    iput-object p3, p0, Lwb/dk;->k:Li0/a1;

    iput-object p4, p0, Lwb/dk;->l:Li0/a1;

    iput-object p5, p0, Lwb/dk;->j:Landroid/content/SharedPreferences;

    iput-object p6, p0, Lwb/dk;->m:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/dk;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v4, v0, Lwb/dk;->i:Li0/a1;

    .line 9
    .line 10
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, v0, Lwb/dk;->h:Lwb/a0;

    .line 21
    .line 22
    check-cast v2, Lwb/x;

    .line 23
    .line 24
    iget-object v3, v2, Lwb/x;->a:Lwb/mu;

    .line 25
    .line 26
    iget v3, v3, Lwb/mu;->a:I

    .line 27
    .line 28
    if-ltz v3, :cond_0

    .line 29
    .line 30
    if-ge v3, v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, v2, Lwb/x;->a:Lwb/mu;

    .line 43
    .line 44
    iget v2, v2, Lwb/mu;->a:I

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v7, v1

    .line 57
    check-cast v7, Ljava/util/List;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/16 v9, 0x50

    .line 61
    .line 62
    iget-object v2, v0, Lwb/dk;->j:Landroid/content/SharedPreferences;

    .line 63
    .line 64
    iget-object v3, v0, Lwb/dk;->k:Li0/a1;

    .line 65
    .line 66
    iget-object v5, v0, Lwb/dk;->l:Li0/a1;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-static/range {v2 .. v9}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    :cond_0
    const/4 v1, 0x0

    .line 73
    iget-object v2, v0, Lwb/dk;->m:Li0/a1;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_0
    iget-object v1, v0, Lwb/dk;->h:Lwb/a0;

    .line 82
    .line 83
    check-cast v1, Lwb/z;

    .line 84
    .line 85
    iget-object v1, v1, Lwb/z;->a:Lwb/nu;

    .line 86
    .line 87
    iget-object v3, v0, Lwb/dk;->i:Li0/a1;

    .line 88
    .line 89
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    iget v1, v1, Lwb/nu;->a:I

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    if-ltz v1, :cond_6

    .line 103
    .line 104
    if-ge v1, v2, :cond_6

    .line 105
    .line 106
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Lua/i;

    .line 117
    .line 118
    iget-object v2, v2, Lua/i;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Ljava/util/List;

    .line 125
    .line 126
    invoke-static {v4}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v4, v0, Lwb/dk;->k:Li0/a1;

    .line 137
    .line 138
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Ljava/util/List;

    .line 143
    .line 144
    new-instance v5, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_2

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    move-object v11, v6

    .line 168
    check-cast v11, Lua/h;

    .line 169
    .line 170
    iget-object v6, v11, Lua/h;->e:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v6, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_1

    .line 177
    .line 178
    const-string v16, ""

    .line 179
    .line 180
    const/16 v17, 0xf

    .line 181
    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    invoke-static/range {v11 .. v17}, Lua/h;->a(Lua/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lua/h;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    :cond_1
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_2
    invoke-interface {v4, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    iget-object v5, v0, Lwb/dk;->l:Li0/a1;

    .line 198
    .line 199
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_5

    .line 210
    .line 211
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Ljava/util/List;

    .line 216
    .line 217
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Lua/i;

    .line 222
    .line 223
    if-eqz v1, :cond_3

    .line 224
    .line 225
    iget-object v1, v1, Lua/i;->a:Ljava/lang/String;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_3
    move-object v1, v10

    .line 229
    :goto_2
    if-nez v1, :cond_4

    .line 230
    .line 231
    const-string v1, ""

    .line 232
    .line 233
    :cond_4
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_5
    const/4 v8, 0x0

    .line 237
    const/16 v9, 0x70

    .line 238
    .line 239
    iget-object v2, v0, Lwb/dk;->j:Landroid/content/SharedPreferences;

    .line 240
    .line 241
    const/4 v6, 0x0

    .line 242
    const/4 v7, 0x0

    .line 243
    invoke-static/range {v2 .. v9}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    :cond_6
    iget-object v1, v0, Lwb/dk;->m:Li0/a1;

    .line 247
    .line 248
    invoke-interface {v1, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
