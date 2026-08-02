.class public abstract Ljp0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lcj;

.field public static final b:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lxw0;

    .line 12
    .line 13
    invoke-direct {v2}, Lxw0;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const-string v4, "https://api.github.com/"

    .line 18
    .line 19
    invoke-virtual {v2, v3, v4}, Lxw0;->e(Lyw0;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lxw0;->b()Lyw0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, v2, Lyw0;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/lit8 v4, v4, -0x1

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, ""

    .line 39
    .line 40
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    new-instance v3, Ldt1;

    .line 47
    .line 48
    invoke-direct {v3}, Ldt1;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v4, Let1;

    .line 52
    .line 53
    invoke-direct {v4, v3}, Let1;-><init>(Ldt1;)V

    .line 54
    .line 55
    .line 56
    sget-object v6, Lah0;->j:Lah0;

    .line 57
    .line 58
    new-instance v3, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v5, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v7, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v10, Lir0;->h:Lrm0;

    .line 74
    .line 75
    sget v12, Lir0;->j:I

    .line 76
    .line 77
    sget v13, Lir0;->k:I

    .line 78
    .line 79
    new-instance v8, Ljava/util/ArrayDeque;

    .line 80
    .line 81
    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v11, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    add-int/2addr v14, v9

    .line 95
    add-int/lit8 v14, v14, 0x3

    .line 96
    .line 97
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    invoke-static {v11}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    new-instance v9, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    .line 117
    sget-boolean v9, Lwt2;->a:Z

    .line 118
    .line 119
    move-object v9, v5

    .line 120
    new-instance v5, Lir0;

    .line 121
    .line 122
    move-object v14, v8

    .line 123
    new-instance v8, Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-direct {v8, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 131
    .line 132
    .line 133
    new-instance v3, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 136
    .line 137
    .line 138
    move-object v3, v14

    .line 139
    new-instance v14, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 142
    .line 143
    .line 144
    const/4 v7, 0x1

    .line 145
    const/4 v9, 0x0

    .line 146
    invoke-direct/range {v5 .. v14}, Lir0;-><init>(Lah0;ILjava/util/Map;ZLrm0;Ljava/util/List;IILjava/util/List;)V

    .line 147
    .line 148
    .line 149
    new-instance v3, Ljr0;

    .line 150
    .line 151
    invoke-direct {v3, v5}, Ljr0;-><init>(Lir0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    sget-object v3, Lyz1;->a:Lo9;

    .line 158
    .line 159
    sget-object v5, Lyz1;->c:Leb;

    .line 160
    .line 161
    new-instance v6, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v3}, Leb;->w(Ljava/util/concurrent/Executor;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Leb;->x()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    new-instance v7, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    add-int/lit8 v8, v8, 0x1

    .line 188
    .line 189
    add-int/2addr v8, v5

    .line 190
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    new-instance v5, Ltn;

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    invoke-direct {v5, v8}, Ltn;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 206
    .line 207
    .line 208
    new-instance v0, Lcj;

    .line 209
    .line 210
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 222
    .line 223
    .line 224
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 225
    .line 226
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 227
    .line 228
    .line 229
    iput-object v1, v0, Lcj;->a:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v4, v0, Lcj;->b:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v2, v0, Lcj;->c:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v3, v0, Lcj;->d:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v5, v0, Lcj;->e:Ljava/lang/Object;

    .line 238
    .line 239
    sput-object v0, Ljp0;->a:Lcj;

    .line 240
    .line 241
    new-instance v0, Ldy;

    .line 242
    .line 243
    const/16 v1, 0xb

    .line 244
    .line 245
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

    .line 246
    .line 247
    .line 248
    new-instance v1, Lhx2;

    .line 249
    .line 250
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 251
    .line 252
    .line 253
    sput-object v1, Ljp0;->b:Lhx2;

    .line 254
    .line 255
    return-void

    .line 256
    :cond_0
    const-string v0, "baseUrl must end in /: "

    .line 257
    .line 258
    invoke-static {v0, v2}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-void
.end method
