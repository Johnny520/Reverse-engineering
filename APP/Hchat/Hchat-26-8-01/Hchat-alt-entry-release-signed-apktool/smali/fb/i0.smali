.class public final synthetic Lfb/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfb/j0;


# direct methods
.method public synthetic constructor <init>(Lfb/j0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfb/i0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lfb/i0;->h:Lfb/j0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lfb/i0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lfb/i0;->h:Lfb/j0;

    .line 12
    .line 13
    iget-object v1, v1, Lfb/j0;->p:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v1, La7/c;

    .line 23
    .line 24
    new-instance v2, Lz7/c;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, v3}, Lz7/c;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, La7/c;->g()Ll7/l;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_0
    iget-object v4, v4, Ll7/l;->o:Lu7/b;

    .line 38
    .line 39
    iget-object v1, v1, La7/c;->h:Lc7/f;

    .line 40
    .line 41
    invoke-virtual {v1}, Lc7/f;->c()[Lc7/e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    array-length v5, v1

    .line 46
    :goto_0
    if-ge v3, v5, :cond_4

    .line 47
    .line 48
    aget-object v6, v1, v3

    .line 49
    .line 50
    invoke-virtual {v6}, Lc7/e;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v4}, Lu7/c;->U()V

    .line 55
    .line 56
    .line 57
    iget-object v8, v4, Lu7/c;->r:Lf1/h;

    .line 58
    .line 59
    invoke-virtual {v8, v7}, Lf1/h;->o(Ljava/lang/String;)Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_3

    .line 68
    .line 69
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, Lr7/x;

    .line 74
    .line 75
    new-instance v9, La7/b;

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-direct {v9, v10}, La7/b;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8}, Lr7/s;->W()V

    .line 82
    .line 83
    .line 84
    iget-object v8, v8, Lr7/s;->p:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {v8}, Ly7/a;->g(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    new-instance v10, Lbe/m;

    .line 91
    .line 92
    const/4 v11, 0x2

    .line 93
    const-class v12, Lv7/d;

    .line 94
    .line 95
    invoke-direct {v10, v12, v11, v9}, Lbe/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-nez v9, :cond_2

    .line 103
    .line 104
    sget-object v8, Lz7/h;->g:Lz7/h;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    new-instance v9, Lz7/g;

    .line 108
    .line 109
    invoke-direct {v9, v8, v10}, Lz7/g;-><init>(Ljava/util/Iterator;Ljava/util/function/Function;)V

    .line 110
    .line 111
    .line 112
    move-object v8, v9

    .line 113
    :goto_2
    invoke-static {v8}, Lbe/h;->b0(Ljava/util/Iterator;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-nez v9, :cond_1

    .line 122
    .line 123
    new-instance v9, La7/e;

    .line 124
    .line 125
    invoke-direct {v9, v6, v8}, La7/e;-><init>(Lc7/e;Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v9}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    :goto_3
    invoke-virtual {v2}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, La7/e;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v3, v2, La7/e;->g:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_5

    .line 165
    .line 166
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Lv7/d;

    .line 171
    .line 172
    invoke-virtual {v4}, Lv7/d;->M()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iget-object v5, v2, La7/e;->h:Lc7/e;

    .line 181
    .line 182
    invoke-virtual {v5}, Lc7/e;->a()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_6
    return-object v0

    .line 191
    :pswitch_0
    iget-object v0, p0, Lfb/i0;->h:Lfb/j0;

    .line 192
    .line 193
    iget-object v0, v0, Lfb/j0;->p:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    check-cast v0, La7/c;

    .line 203
    .line 204
    invoke-virtual {v0}, La7/c;->g()Ll7/l;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    return-object v0

    .line 209
    :pswitch_1
    new-instance v0, Ljava/io/File;

    .line 210
    .line 211
    iget-object v1, p0, Lfb/i0;->h:Lfb/j0;

    .line 212
    .line 213
    iget-object v1, v1, Lfb/j0;->i:Ljava/lang/String;

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-instance v1, Lc7/a;

    .line 219
    .line 220
    new-instance v2, Li7/e;

    .line 221
    .line 222
    invoke-direct {v2, v0}, Li7/e;-><init>(Ljava/io/File;)V

    .line 223
    .line 224
    .line 225
    const/4 v0, 0x1

    .line 226
    invoke-direct {v1, v2, v0}, Lc7/a;-><init>(Li7/f;I)V

    .line 227
    .line 228
    .line 229
    new-instance v0, La7/c;

    .line 230
    .line 231
    invoke-virtual {v1}, Lc7/a;->a()Lc7/f;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const-string v3, "base"

    .line 236
    .line 237
    invoke-direct {v0, v3, v2}, La7/c;-><init>(Ljava/lang/String;Lc7/f;)V

    .line 238
    .line 239
    .line 240
    iput-object v1, v0, La7/c;->p:Lc7/a;

    .line 241
    .line 242
    const/4 v1, 0x0

    .line 243
    iput-boolean v1, v0, La7/c;->i:Z

    .line 244
    .line 245
    const/4 v1, 0x1

    .line 246
    iput-boolean v1, v0, La7/c;->j:Z

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
