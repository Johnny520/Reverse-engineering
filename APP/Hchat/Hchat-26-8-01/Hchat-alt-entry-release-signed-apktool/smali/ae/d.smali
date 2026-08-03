.class public final synthetic Lae/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lae/d;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lae/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Lud/a;

    .line 15
    .line 16
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_1
    check-cast p1, Lud/a;

    .line 20
    .line 21
    iget-object p1, p1, Lud/a;->m:Ljava/util/List;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_2
    check-cast p1, Lae/f;

    .line 25
    .line 26
    iget-object p1, p1, Lae/f;->c:Lud/a;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_3
    check-cast p1, Lae/f;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_4
    check-cast p1, Lae/f;

    .line 38
    .line 39
    iget-object p1, p1, Lae/f;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_5
    check-cast p1, Lae/f;

    .line 47
    .line 48
    iget-object p1, p1, Lae/f;->c:Lud/a;

    .line 49
    .line 50
    invoke-static {p1}, La/a;->c0(Lud/h;)Lud/p;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lud/p;->l:Lqd/r;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_6
    check-cast p1, Lud/a;

    .line 61
    .line 62
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->canonicalizeClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_8
    check-cast p1, Ljava/nio/file/Path;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/nio/file/Path;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :pswitch_9
    check-cast p1, Lqd/l;

    .line 84
    .line 85
    invoke-virtual {p1}, Lqd/l;->H()Lqd/l;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_a
    check-cast p1, Lqd/l;

    .line 91
    .line 92
    invoke-virtual {p1}, Lqd/l;->X()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 98
    .line 99
    sget-object v0, Lqd/j;->b:Lqd/g;

    .line 100
    .line 101
    new-instance v0, Lqd/c;

    .line 102
    .line 103
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 104
    .line 105
    invoke-direct {v0, p1, v1}, Lqd/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    new-instance p1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_d
    check-cast p1, Lqe/l;

    .line 118
    .line 119
    invoke-virtual {p1}, Lqe/l;->b()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_2

    .line 124
    .line 125
    invoke-virtual {p1}, Lqe/l;->c()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_0

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_0
    sget-object v0, Lqe/l;->k:Lqe/l;

    .line 133
    .line 134
    if-ne p1, v0, :cond_1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    const/4 v1, 0x0

    .line 138
    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :pswitch_e
    check-cast p1, Lqe/l;

    .line 144
    .line 145
    invoke-virtual {p1}, Lqe/l;->b()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :pswitch_f
    check-cast p1, Lqd/s;

    .line 155
    .line 156
    invoke-virtual {p1}, Lqd/s;->d()Lqd/j;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :pswitch_10
    check-cast p1, Ljava/util/Map$Entry;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Lud/g;

    .line 168
    .line 169
    iget-object p1, p1, Lud/g;->l:Lod/c;

    .line 170
    .line 171
    return-object p1

    .line 172
    :pswitch_11
    check-cast p1, Lbe/r;

    .line 173
    .line 174
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_12
    check-cast p1, Lbe/r;

    .line 180
    .line 181
    iget-object p1, p1, Lbe/r;->a:Lud/g;

    .line 182
    .line 183
    return-object p1

    .line 184
    :pswitch_13
    check-cast p1, Lbe/r;

    .line 185
    .line 186
    iget-object p1, p1, Lbe/r;->a:Lud/g;

    .line 187
    .line 188
    return-object p1

    .line 189
    :pswitch_14
    check-cast p1, Lud/g;

    .line 190
    .line 191
    new-instance p1, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_15
    check-cast p1, Lbc/n;

    .line 198
    .line 199
    iget-object p1, p1, Lbc/n;->a:Lud/r;

    .line 200
    .line 201
    iget-object p1, p1, Lud/r;->k:Lod/d;

    .line 202
    .line 203
    iget-object p1, p1, Lod/d;->n:Ljava/lang/String;

    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_16
    check-cast p1, Ljava/io/File;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    :pswitch_17
    invoke-static {p1}, Leh/a;->j(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    throw p1

    .line 218
    :pswitch_18
    check-cast p1, Ljava/util/List;

    .line 219
    .line 220
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    return-object p1

    .line 225
    :pswitch_19
    new-instance v0, Lfc/b;

    .line 226
    .line 227
    check-cast p1, Lbc/g;

    .line 228
    .line 229
    invoke-direct {v0, p1}, Lfc/b;-><init>(Lbc/g;)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_1a
    check-cast p1, Lb8/j;

    .line 234
    .line 235
    invoke-virtual {p1}, Lb8/j;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1

    .line 240
    :pswitch_1b
    check-cast p1, Lae/h;

    .line 241
    .line 242
    iget p1, p1, Lae/h;->g:I

    .line 243
    .line 244
    const-string v0, "#"

    .line 245
    .line 246
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :pswitch_1c
    check-cast p1, Lod/a;

    .line 252
    .line 253
    iget-object p1, p1, Lod/a;->h:Ljava/lang/String;

    .line 254
    .line 255
    return-object p1

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
