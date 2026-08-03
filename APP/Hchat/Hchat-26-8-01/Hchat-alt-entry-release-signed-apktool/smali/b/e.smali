.class public final Lb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/f;
.implements Lhc/b;
.implements Lk2/d;
.implements Ll3/o;
.implements Lm0/k0;
.implements Lr7/g;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lb/e;->g:I

    sparse-switch p1, :sswitch_data_0

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 236
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    return-void

    .line 237
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    new-instance p1, Ll3/w;

    const/16 v0, 0x11

    .line 239
    invoke-direct {p1, v0}, Ll3/w;-><init>(I)V

    .line 240
    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 241
    new-instance p1, Lf/r;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lf/r;-><init>(I)V

    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    return-void

    .line 242
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 243
    new-instance p1, Lt1/d;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lt1/d;-><init>(I)V

    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 244
    new-instance p1, Lt1/d;

    invoke-direct {p1, v0}, Lt1/d;-><init>(I)V

    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    return-void

    .line 245
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    new-instance p1, Lf/k0;

    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 247
    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 248
    new-instance p1, Lf/k0;

    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 249
    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    return-void

    .line 250
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object p1

    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_3
        0xc -> :sswitch_2
        0x16 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 213
    iput p1, p0, Lb/e;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lab/e;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lb/e;->g:I

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 218
    new-instance p1, Ls0/a;

    const/4 v0, 0x0

    .line 219
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 220
    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lb/e;->g:I

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 255
    invoke-static {p1}, Lg3/h;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    move-result-object v0

    .line 256
    iput-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 257
    invoke-static {p1}, Lg3/h;->v(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    move-result-object p1

    .line 258
    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb/f;Lb/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb/e;->g:I

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 253
    iput-object p2, p0, Lb/e;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lb/e;->g:I

    .line 232
    invoke-direct {p0, v0}, Lb/e;-><init>(I)V

    .line 233
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v0

    iput-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 234
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 212
    iput p2, p0, Lb/e;->g:I

    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb/e;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lb/e;->g:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 216
    iput-object p2, p0, Lb/e;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lfb/b;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lb/e;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Lfb/r0;

    .line 28
    .line 29
    iget-boolean v2, v2, Lfb/r0;->c:Z

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lfb/r0;

    .line 61
    .line 62
    new-instance v2, Lfb/p0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v3, v1, Lfb/r0;->b:Ljava/lang/String;

    .line 68
    .line 69
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const-string v4, "[^a-z0-9_-]+"

    .line 79
    .line 80
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const-string v4, "_"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/4 v5, 0x1

    .line 101
    new-array v5, v5, [C

    .line 102
    .line 103
    const/16 v6, 0x5f

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    aput-char v6, v5, v7

    .line 107
    .line 108
    invoke-static {v3, v5}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/16 v5, 0x18

    .line 113
    .line 114
    invoke-static {v5, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    const-string v3, "server"

    .line 125
    .line 126
    :cond_2
    iget-object v5, v1, Lfb/r0;->a:Ljava/lang/String;

    .line 127
    .line 128
    const-string v6, "[^A-Za-z0-9]+"

    .line 129
    .line 130
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-string v7, ""

    .line 138
    .line 139
    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v5, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const/16 v6, 0xa

    .line 151
    .line 152
    invoke-static {v6, v5}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_3

    .line 161
    .line 162
    const-string v5, "mcp"

    .line 163
    .line 164
    :cond_3
    invoke-static {v3, v4, v5}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-instance v4, Lfb/o0;

    .line 169
    .line 170
    iget-object v5, v1, Lfb/r0;->d:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v6, v1, Lfb/r0;->e:Ljava/lang/String;

    .line 173
    .line 174
    invoke-direct {v4, v5, v6, p2}, Lfb/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Lfb/b;)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v2, v1, v3, v4}, Lfb/p0;-><init>(Lfb/r0;Ljava/lang/String;Lfb/o0;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_4
    new-instance p2, Lfb/r;

    .line 186
    .line 187
    const/4 v0, 0x6

    .line 188
    invoke-direct {p2, v0}, Lfb/r;-><init>(I)V

    .line 189
    .line 190
    .line 191
    new-instance v0, Lc9/a0;

    .line 192
    .line 193
    const/16 v1, 0xb

    .line 194
    .line 195
    invoke-direct {v0, p2, v1}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iput-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 203
    .line 204
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 205
    .line 206
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 207
    .line 208
    .line 209
    iput-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 210
    .line 211
    return-void
.end method

.method public constructor <init>(Lk4/b;II)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lb/e;->g:I

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 222
    invoke-virtual {p1}, Lk4/b;->d()V

    .line 223
    iget-object v0, p1, Lk4/b;->d:Lv4/e0;

    .line 224
    iput-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 225
    iget-object p1, p1, Lk4/b;->b:Lg8/b;

    add-int/2addr p3, p2

    .line 226
    invoke-virtual {p1, p2, p3}, Lg8/b;->n(II)Lg8/b;

    move-result-object p1

    .line 227
    new-instance p2, Lz4/a;

    .line 228
    new-instance p3, Lz4/b;

    invoke-direct {p3, p1}, Lz4/b;-><init>(Lg8/b;)V

    .line 229
    invoke-direct {p2, p3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 230
    iput-object p2, p0, Lb/e;->i:Ljava/lang/Object;

    return-void

    .line 231
    :cond_0
    const-string p1, "cf == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public A(I)Lt4/c;
    .locals 9

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/a;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Lt4/c;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    new-instance v6, Lt4/b;

    .line 23
    .line 24
    invoke-direct {v6}, Lt4/b;-><init>()V

    .line 25
    .line 26
    .line 27
    move v7, v3

    .line 28
    :goto_1
    if-ge v7, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lb/e;->x(I)Lt4/a;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v6, v8}, Lt4/b;->l(Lt4/a;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v7, v7, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iput-boolean v3, v6, Lz4/j;->g:Z

    .line 41
    .line 42
    invoke-virtual {v6}, Lz4/j;->k()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v4, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput-boolean v3, v2, Lz4/j;->g:Z

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    return-object v2

    .line 60
    :cond_2
    new-instance p1, Ll4/c;

    .line 61
    .line 62
    const-string v0, "extra data in attribute"

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 66
    .line 67
    .line 68
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :catch_0
    move-exception p1

    .line 70
    const-string v0, "shouldn\'t happen"

    .line 71
    .line 72
    invoke-static {v0, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    return-object p1
.end method

.method public B()Lv4/a;
    .locals 6

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv4/e0;

    .line 4
    .line 5
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz4/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x40

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    if-eq v2, v3, :cond_d

    .line 17
    .line 18
    const/16 v3, 0x46

    .line 19
    .line 20
    if-eq v2, v3, :cond_c

    .line 21
    .line 22
    const/16 v3, 0x53

    .line 23
    .line 24
    if-eq v2, v3, :cond_a

    .line 25
    .line 26
    const/16 v3, 0x63

    .line 27
    .line 28
    if-eq v2, v3, :cond_9

    .line 29
    .line 30
    const/16 v3, 0x65

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eq v2, v3, :cond_8

    .line 34
    .line 35
    const/16 v0, 0x73

    .line 36
    .line 37
    if-eq v2, v0, :cond_7

    .line 38
    .line 39
    const/16 v0, 0x49

    .line 40
    .line 41
    if-eq v2, v0, :cond_6

    .line 42
    .line 43
    const/16 v0, 0x4a

    .line 44
    .line 45
    if-eq v2, v0, :cond_5

    .line 46
    .line 47
    const/16 v0, 0x5a

    .line 48
    .line 49
    if-eq v2, v0, :cond_4

    .line 50
    .line 51
    const/16 v0, 0x5b

    .line 52
    .line 53
    if-eq v2, v0, :cond_2

    .line 54
    .line 55
    packed-switch v2, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    new-instance v0, Ll4/c;

    .line 59
    .line 60
    invoke-static {v2}, La/a;->W0(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "unknown annotation tag: "

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-direct {v0, v1, v5}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :pswitch_0
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lv4/k;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lv4/o;

    .line 86
    .line 87
    iget v0, v0, Lv4/s;->g:I

    .line 88
    .line 89
    int-to-char v1, v0

    .line 90
    if-ne v1, v0, :cond_0

    .line 91
    .line 92
    new-instance v0, Lv4/j;

    .line 93
    .line 94
    invoke-direct {v0, v1}, Lv4/s;-><init>(I)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_0
    const-string v1, "bogus char value: "

    .line 99
    .line 100
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    return-object v0

    .line 109
    :pswitch_2
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lv4/o;

    .line 114
    .line 115
    iget v0, v0, Lv4/s;->g:I

    .line 116
    .line 117
    int-to-byte v1, v0

    .line 118
    if-ne v1, v0, :cond_1

    .line 119
    .line 120
    new-instance v0, Lv4/g;

    .line 121
    .line 122
    invoke-direct {v0, v1}, Lv4/s;-><init>(I)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_1
    const-string v1, "bogus byte value: "

    .line 127
    .line 128
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    return-object v0

    .line 137
    :cond_2
    const/4 v0, 0x2

    .line 138
    invoke-virtual {p0, v0}, Lb/e;->C(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    new-instance v1, Lv4/c;

    .line 146
    .line 147
    invoke-direct {v1, v0}, Lz4/e;-><init>(I)V

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    move v3, v2

    .line 152
    :goto_0
    if-ge v3, v0, :cond_3

    .line 153
    .line 154
    invoke-virtual {p0}, Lb/e;->B()Lv4/a;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v1, v3, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v3, 0x1

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    iput-boolean v2, v1, Lz4/j;->g:Z

    .line 165
    .line 166
    new-instance v0, Lv4/d;

    .line 167
    .line 168
    invoke-direct {v0, v1}, Lv4/d;-><init>(Lv4/c;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_4
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Lv4/o;

    .line 177
    .line 178
    iget v0, v0, Lv4/s;->g:I

    .line 179
    .line 180
    invoke-static {v0}, Lv4/f;->n(I)Lv4/f;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    return-object v0

    .line 185
    :cond_5
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Lv4/v;

    .line 190
    .line 191
    return-object v0

    .line 192
    :cond_6
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lv4/o;

    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_7
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0

    .line 204
    :cond_8
    invoke-virtual {p0, v4}, Lb/e;->C(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-virtual {v0, v2}, Lv4/e0;->l(I)Lv4/a;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, Lv4/c0;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Lv4/c0;

    .line 226
    .line 227
    new-instance v1, Lv4/l;

    .line 228
    .line 229
    new-instance v3, Lv4/z;

    .line 230
    .line 231
    invoke-direct {v3, v0, v2}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Lv4/d0;

    .line 235
    .line 236
    invoke-virtual {v3}, Lv4/z;->k()Lw4/c;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-direct {v0, v2}, Lv4/d0;-><init>(Lw4/c;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {v1, v0, v3}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 244
    .line 245
    .line 246
    iput-object v5, v1, Lv4/l;->i:Lv4/m;

    .line 247
    .line 248
    return-object v1

    .line 249
    :cond_9
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-virtual {v0, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Lv4/c0;

    .line 258
    .line 259
    iget-object v0, v0, Lv4/c0;->g:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v0}, Lw4/c;->o(Ljava/lang/String;)Lw4/c;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    new-instance v1, Lv4/d0;

    .line 266
    .line 267
    invoke-direct {v1, v0}, Lv4/d0;-><init>(Lw4/c;)V

    .line 268
    .line 269
    .line 270
    return-object v1

    .line 271
    :cond_a
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Lv4/o;

    .line 276
    .line 277
    iget v0, v0, Lv4/s;->g:I

    .line 278
    .line 279
    int-to-short v1, v0

    .line 280
    if-ne v1, v0, :cond_b

    .line 281
    .line 282
    new-instance v0, Lv4/b0;

    .line 283
    .line 284
    invoke-direct {v0, v1}, Lv4/s;-><init>(I)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :cond_b
    const-string v1, "bogus short value: "

    .line 289
    .line 290
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    return-object v0

    .line 299
    :cond_c
    invoke-virtual {p0}, Lb/e;->z()Lv4/a;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Lv4/n;

    .line 304
    .line 305
    return-object v0

    .line 306
    :cond_d
    invoke-virtual {p0, v4}, Lb/e;->x(I)Lt4/a;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    new-instance v1, Lv4/b;

    .line 311
    .line 312
    invoke-direct {v1, v0}, Lv4/b;-><init>(Lt4/a;)V

    .line 313
    .line 314
    .line 315
    return-object v1

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public C(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt v0, p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ll4/c;

    .line 13
    .line 14
    const-string v0, "truncated annotation attribute"

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public a(Ljava/lang/CharSequence;IILl3/u;)Z
    .locals 3

    .line 1
    iget v0, p4, Ll3/u;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ll3/y;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Ll3/y;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/text/Spannable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :goto_0
    invoke-direct {v0, p1}, Ll3/y;-><init>(Landroid/text/Spannable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La2/a;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ll3/v;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Ll3/v;-><init>(Ll3/u;)V

    .line 45
    .line 46
    .line 47
    iget-object p4, p0, Lb/e;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p4, Ll3/y;

    .line 50
    .line 51
    const/16 v0, 0x21

    .line 52
    .line 53
    invoke-virtual {p4, p1, p2, p3, v0}, Ll3/y;->setSpan(Ljava/lang/Object;III)V

    .line 54
    .line 55
    .line 56
    return v1
.end method

.method public b(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc8/a;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lc8/a;->i(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq p1, v1, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    return p1

    .line 34
    :cond_2
    :goto_0
    return v1
.end method

.method public c(I)I
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lc8/a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/CharSequence;

    .line 17
    .line 18
    add-int/lit8 v1, p1, -0x1

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1
    return v0
.end method

.method public cancel()V
    .locals 3

    .line 1
    iget v0, p0, Lb/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls0/a;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lab/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lab/e;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lb/f;

    .line 28
    .line 29
    iget-object v1, v0, Lb/f;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ltf/k;

    .line 32
    .line 33
    iget-object v2, p0, Lb/e;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lb/g;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ltf/k;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v1, v2, Lb/g;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x21

    .line 48
    .line 49
    if-lt v1, v2, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, Lb/f;->d()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll3/y;

    .line 4
    .line 5
    return-object v0
.end method

.method public f(Ljava/lang/Integer;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/k0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lm0/k0;->f(Ljava/lang/Integer;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ll0/k;

    .line 13
    .line 14
    iget v2, v1, Ll0/k;->v:I

    .line 15
    .line 16
    if-gez v2, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v3, v1, Ll0/k;->b:[I

    .line 20
    .line 21
    invoke-virtual {v1, v3, v2}, Ll0/k;->E([II)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v1, p1, v2, v3}, Lg4/a;->h(Ll0/k;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public g(I)I
    .locals 1

    .line 1
    :cond_0
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lc8/a;->j(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return p1
.end method

.method public get()I
    .locals 4

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr7/a;

    .line 4
    .line 5
    iget v1, v0, Lr7/a;->o:I

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lb/e;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lm7/t;

    .line 14
    .line 15
    iget-object v3, v3, Lm7/t;->s:Lr7/a;

    .line 16
    .line 17
    iget v3, v3, Lr7/a;->o:I

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lr7/a;->k(I)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    return v1
.end method

.method public h(I)I
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lc8/a;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    add-int/lit8 v1, p1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    return p1
.end method

.method public i(Lmd/i;Lfc/f;)V
    .locals 3

    .line 1
    check-cast p1, Lmd/e;

    .line 2
    .line 3
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    sget-object v0, Loc/c;->a:Loc/c;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lpc/d;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p1, Lpc/d;->g:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lnc/b;

    .line 43
    .line 44
    iget-object v1, v0, Lnc/b;->b:Ljava/lang/String;

    .line 45
    .line 46
    const-string v2, "Ljava/lang/Override;"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2}, Lfc/f;->p()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2, v0}, Lb/e;->s(Lfc/f;Lnc/b;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_1
    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/k0;

    .line 4
    .line 5
    invoke-interface {v0}, Lm0/k0;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public k(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr7/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lr7/a;->k(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm7/t;

    .line 11
    .line 12
    iget-object v0, v0, Lm7/t;->w:Lm7/d;

    .line 13
    .line 14
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    if-ge v3, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lm7/c;

    .line 29
    .line 30
    add-int/lit8 v5, p1, -0xc

    .line 31
    .line 32
    iget v6, v4, Lv7/j0;->n:I

    .line 33
    .line 34
    add-int/2addr v5, v6

    .line 35
    invoke-virtual {v4, v5, v2}, Lr7/b;->M(IZ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lr7/b;->p()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    sub-int/2addr v5, v6

    .line 43
    iget-object v4, v4, Lr7/b;->k:[B

    .line 44
    .line 45
    int-to-short v5, v5

    .line 46
    invoke-static {v4, v6, v5}, Lk7/a;->F([BIS)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method public l(Ljava/util/List;)Ln2/s;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ln2/g;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    :try_start_2
    iget-object v3, p0, Lb/e;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lk5/n;

    .line 19
    .line 20
    invoke-interface {v4, v3}, Ln2/g;->a(Lk5/n;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    move-object v3, v4

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    move-object v3, v4

    .line 29
    goto :goto_2

    .line 30
    :catch_1
    move-exception v0

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lk5/n;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Li2/g;

    .line 40
    .line 41
    iget-object p1, p1, Lk5/n;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lc8/a;

    .line 44
    .line 45
    invoke-virtual {p1}, Lc8/a;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v1, p1}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lk5/n;

    .line 55
    .line 56
    iget v2, p1, Lk5/n;->h:I

    .line 57
    .line 58
    iget p1, p1, Lk5/n;->i:I

    .line 59
    .line 60
    invoke-static {v2, p1}, Li2/e0;->b(II)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    new-instance p1, Li2/m0;

    .line 65
    .line 66
    invoke-direct {p1, v2, v3}, Li2/m0;-><init>(J)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Lb/e;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ln2/s;

    .line 72
    .line 73
    iget-wide v4, v4, Ln2/s;->b:J

    .line 74
    .line 75
    invoke-static {v4, v5}, Li2/m0;->g(J)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_1

    .line 80
    .line 81
    move-object v0, p1

    .line 82
    :cond_1
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iget-wide v2, v0, Li2/m0;->a:J

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-static {v2, v3}, Li2/m0;->e(J)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {v2, v3}, Li2/m0;->f(J)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {p1, v0}, Li2/e0;->b(II)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    :goto_1
    iget-object p1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lk5/n;

    .line 102
    .line 103
    invoke-virtual {p1}, Lk5/n;->c()Li2/m0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v0, Ln2/s;

    .line 108
    .line 109
    invoke-direct {v0, v1, v2, v3, p1}, Ln2/s;-><init>(Li2/g;JLi2/m0;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 113
    .line 114
    return-object v0

    .line 115
    :catch_2
    move-exception v1

    .line 116
    move-object v3, v0

    .line 117
    move-object v0, v1

    .line 118
    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 119
    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v5, "Error while applying EditCommand batch to buffer (length="

    .line 128
    .line 129
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v5, p0, Lb/e;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v5, Lk5/n;

    .line 135
    .line 136
    iget-object v5, v5, Lk5/n;->l:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Lc8/a;

    .line 139
    .line 140
    invoke-virtual {v5}, Lc8/a;->b()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v5, ", composition="

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v5, p0, Lb/e;->i:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v5, Lk5/n;

    .line 155
    .line 156
    invoke-virtual {v5}, Lk5/n;->c()Li2/m0;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v5, ", selection="

    .line 164
    .line 165
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v5, p0, Lb/e;->i:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Lk5/n;

    .line 171
    .line 172
    iget v6, v5, Lk5/n;->h:I

    .line 173
    .line 174
    iget v5, v5, Lk5/n;->i:I

    .line 175
    .line 176
    invoke-static {v6, v5}, Li2/e0;->b(II)J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    invoke-static {v5, v6}, Li2/m0;->h(J)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v5, "):"

    .line 188
    .line 189
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const/16 v4, 0xa

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    new-instance v4, Lb0/d0;

    .line 205
    .line 206
    const/16 v5, 0x1d

    .line 207
    .line 208
    invoke-direct {v4, v3, v5, p0}, Lb0/d0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    const/16 v3, 0x3c

    .line 212
    .line 213
    const-string v5, "\n"

    .line 214
    .line 215
    invoke-static {p1, v2, v5, v4, v3}, Ltf/m;->z1(Ljava/util/List;Ljava/lang/StringBuilder;Ljava/lang/String;Lb0/d0;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw v1
.end method

.method public m(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lfb/q0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p1, v0, Lfb/q0;->a:Lfb/o0;

    .line 17
    .line 18
    iget-object v0, v0, Lfb/q0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lfb/o0;->a()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "name"

    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    const-string v0, "arguments"

    .line 40
    .line 41
    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string p2, "tools/call"

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1}, Lfb/o0;->d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_0
    const-string p1, "MCP \u5de5\u5177\u540d\u4e3a\u7a7a"

    .line 59
    .line 60
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :cond_1
    const-string p2, "\u6ca1\u6709\u627e\u5230\u5df2\u542f\u7528 MCP \u5de5\u5177: "

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return-object p1
.end method

.method public n()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll8/a;

    .line 4
    .line 5
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v1, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    const-string v3, "chatroomname"

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1, v3}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    move-object v1, v2

    .line 47
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_3
    iget-object v1, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    array-length v4, v1

    .line 59
    if-lez v4, :cond_5

    .line 60
    .line 61
    iget-object v0, v0, Ll8/a;->e:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    move-object v0, v2

    .line 67
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    aget-object v0, v1, v0

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_5
    return-object v2
.end method

.method public o(Lg4/i;)Lg4/b;
    .locals 3

    .line 1
    iget-object v0, p1, Lg4/i;->a:Lg4/j;

    .line 2
    .line 3
    iget-object v1, p1, Lg4/i;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lb/e;->u(Lg4/j;)Lg4/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lg4/e;->i:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    const-string v2, "<init>"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "<clinit>"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const v1, 0x10001

    .line 37
    .line 38
    .line 39
    :goto_1
    new-instance v2, Lg4/d;

    .line 40
    .line 41
    invoke-direct {v2, p1, v1}, Lg4/d;-><init>(Lg4/i;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    iget-object p1, v2, Lg4/d;->c:Lg4/b;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    const-string v0, "already declared: "

    .line 51
    .line 52
    invoke-static {p1, v0}, Lg1/d;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    return-object p1
.end method

.method public p(Lg4/f;I)V
    .locals 2

    .line 1
    iget-object v0, p1, Lg4/f;->a:Lg4/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb/e;->u(Lg4/j;)Lg4/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lg4/e;->h:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lg4/c;

    .line 16
    .line 17
    invoke-direct {v1, p1, p2}, Lg4/c;-><init>(Lg4/f;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p2, "already declared: "

    .line 25
    .line 26
    invoke-static {p1, p2}, Lg1/d;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public q(Lud/u;Lfc/f;Lnc/a;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/e;

    .line 4
    .line 5
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lfd/a;

    .line 8
    .line 9
    iget-object v2, v1, Lfd/a;->a:Lud/e;

    .line 10
    .line 11
    const-string v3, "null"

    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v4, p3, Lnc/a;->g:I

    .line 20
    .line 21
    iget-object v5, v0, Lud/e;->k:Lud/u;

    .line 22
    .line 23
    iget-object v5, v5, Lud/u;->c:Lxe/q;

    .line 24
    .line 25
    iget-object v6, p3, Lnc/a;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v4}, Lt3/c;->b(I)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v8, 0x1

    .line 32
    const/4 v9, 0x0

    .line 33
    packed-switch v7, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    :pswitch_0
    invoke-static {v4}, Lj8/b;->w(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string p3, " ("

    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    const-string v1, "Can\'t decode value: "

    .line 49
    .line 50
    invoke-static {v1, p1, p3, p2, v0}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    check-cast v6, Lnc/b;

    .line 59
    .line 60
    invoke-virtual {p0, p2, v6}, Lb/e;->s(Lfc/f;Lnc/b;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_2
    const/16 p1, 0x7b

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Lfc/f;->d(C)Lfc/f;

    .line 67
    .line 68
    .line 69
    check-cast v6, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_2

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Lnc/a;

    .line 86
    .line 87
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 88
    .line 89
    invoke-virtual {p0, v1, p2, p3}, Lb/e;->q(Lud/u;Lfc/f;Lnc/a;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    if-eqz p3, :cond_1

    .line 97
    .line 98
    const-string p3, ", "

    .line 99
    .line 100
    invoke-virtual {p2, p3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const/16 p1, 0x7d

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Lfc/f;->d(C)Lfc/f;

    .line 107
    .line 108
    .line 109
    :pswitch_3
    return-void

    .line 110
    :pswitch_4
    instance-of p3, v6, Ljf/d;

    .line 111
    .line 112
    if-eqz p3, :cond_3

    .line 113
    .line 114
    check-cast v6, Ljf/d;

    .line 115
    .line 116
    invoke-static {p1, v6}, Lod/c;->a(Lud/u;Ljf/d;)Lod/c;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget-object p3, Lfd/e;->e:Ljava/util/EnumSet;

    .line 121
    .line 122
    iget-object p3, v2, Lud/e;->k:Lud/u;

    .line 123
    .line 124
    invoke-virtual {p3, p1}, Lud/u;->h(Lod/c;)Lud/g;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-static {p2, p1, p3, v1}, Lfd/e;->m(Lfc/f;Lod/c;Lud/g;Lfd/a;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    instance-of p1, v6, Lod/c;

    .line 133
    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    check-cast v6, Lod/c;

    .line 137
    .line 138
    sget-object p1, Lfd/e;->e:Ljava/util/EnumSet;

    .line 139
    .line 140
    iget-object p1, v2, Lud/e;->k:Lud/u;

    .line 141
    .line 142
    invoke-virtual {p1, v6}, Lud/u;->h(Lod/c;)Lud/g;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p2, v6, p1, v1}, Lfd/e;->m(Lfc/f;Lod/c;Lud/g;Lfd/a;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const-string p2, "Unexpected field type class: "

    .line 159
    .line 160
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_5
    check-cast v6, Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v6}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v1, p2, p1}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 175
    .line 176
    .line 177
    const-string p1, ".class"

    .line 178
    .line 179
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_6
    check-cast v6, Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v5, v6}, Lxe/q;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_7
    check-cast v6, Ljava/lang/Double;

    .line 194
    .line 195
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    invoke-static {v0, v1}, Lxe/q;->b(D)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_8
    check-cast v6, Ljava/lang/Float;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-static {p1}, Lxe/q;->c(F)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_9
    check-cast v6, Ljava/lang/Long;

    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    invoke-virtual {v5, v0, v1, v9}, Lxe/q;->d(JZ)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_a
    check-cast v6, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    int-to-long v0, p1

    .line 242
    iget p1, v5, Lxe/q;->a:I

    .line 243
    .line 244
    if-ne p1, v8, :cond_7

    .line 245
    .line 246
    long-to-int p1, v0

    .line 247
    const/high16 p3, -0x80000000

    .line 248
    .line 249
    if-eq p1, p3, :cond_6

    .line 250
    .line 251
    const p3, 0x7fffffff

    .line 252
    .line 253
    .line 254
    if-eq p1, p3, :cond_5

    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_5
    const-string p1, "Integer.MAX_VALUE"

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_6
    const-string p1, "Integer.MIN_VALUE"

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_7
    :goto_1
    const/4 p1, 0x4

    .line 264
    invoke-virtual {v5, p1, v0, v1, v9}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    :goto_2
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :pswitch_b
    check-cast v6, Ljava/lang/Character;

    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {p1, v9}, Lxe/q;->h(CZ)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_c
    check-cast v6, Ljava/lang/Short;

    .line 290
    .line 291
    invoke-virtual {v6}, Ljava/lang/Short;->shortValue()S

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    int-to-long v0, p1

    .line 296
    iget p1, v5, Lxe/q;->a:I

    .line 297
    .line 298
    if-ne p1, v8, :cond_a

    .line 299
    .line 300
    long-to-int p1, v0

    .line 301
    int-to-short p1, p1

    .line 302
    const/16 p3, -0x8000

    .line 303
    .line 304
    if-eq p1, p3, :cond_9

    .line 305
    .line 306
    const/16 p3, 0x7fff

    .line 307
    .line 308
    if-eq p1, p3, :cond_8

    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_8
    const-string p1, "Short.MAX_VALUE"

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_9
    const-string p1, "Short.MIN_VALUE"

    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_a
    :goto_3
    const/4 p1, 0x2

    .line 318
    invoke-virtual {v5, p1, v0, v1, v9}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    :goto_4
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_d
    check-cast v6, Ljava/lang/Byte;

    .line 327
    .line 328
    invoke-virtual {v6}, Ljava/lang/Byte;->byteValue()B

    .line 329
    .line 330
    .line 331
    move-result p1

    .line 332
    int-to-long v0, p1

    .line 333
    invoke-virtual {v5, v8, v0, v1, v9}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_e
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 342
    .line 343
    invoke-virtual {p1, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-eqz p1, :cond_b

    .line 348
    .line 349
    const-string p1, "true"

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_b
    const-string p1, "false"

    .line 353
    .line 354
    :goto_5
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_f
    invoke-virtual {p2, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public r(Lfg/p;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La1/d;

    .line 14
    .line 15
    const/16 v2, 0x15

    .line 16
    .line 17
    invoke-direct {v1, p0, v2, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public s(Lfc/f;Lnc/b;)V
    .locals 7

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lud/e;

    .line 9
    .line 10
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 11
    .line 12
    iget-object v2, p2, Lnc/b;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lud/u;->f(Lod/a;)Lud/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lb/e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lfd/a;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lfc/f;->j(Lhc/a;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lud/e;->m:Lod/a;

    .line 35
    .line 36
    iget-object v4, v2, Lfd/a;->a:Lud/e;

    .line 37
    .line 38
    iget-object v4, v4, Lud/e;->m:Lod/a;

    .line 39
    .line 40
    invoke-virtual {v2, v4, v3}, Lfd/a;->q(Lod/a;Lod/a;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v3, p2, Lnc/b;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, p1, v3}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    iget-object p2, p2, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_5

    .line 64
    .line 65
    const/16 v2, 0x28

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Lfc/f;->d(C)Lfc/f;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/util/Map$Entry;

    .line 89
    .line 90
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Lud/e;->n0(Ljava/lang/String;)Lud/r;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    iget-object v4, v5, Lud/r;->k:Lod/d;

    .line 105
    .line 106
    iget-object v4, v4, Lod/d;->n:Ljava/lang/String;

    .line 107
    .line 108
    :cond_2
    const-string v5, "value"

    .line 109
    .line 110
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_3

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    const/4 v6, 0x1

    .line 121
    if-ne v5, v6, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 125
    .line 126
    .line 127
    const-string v4, " = "

    .line 128
    .line 129
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 130
    .line 131
    .line 132
    :goto_2
    iget-object v4, v0, Lud/e;->k:Lud/u;

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lnc/a;

    .line 139
    .line 140
    invoke-virtual {p0, v4, p1, v3}, Lb/e;->q(Lud/u;Lfc/f;Lnc/a;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_1

    .line 148
    .line 149
    const-string v3, ", "

    .line 150
    .line 151
    invoke-virtual {p1, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    const/16 p2, 0x29

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 158
    .line 159
    .line 160
    :cond_5
    return-void
.end method

.method public t(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 4

    .line 1
    const-class v0, Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p3, v2

    .line 10
    :goto_0
    :try_start_0
    const-string v3, "dalvik.system.BaseDexClassLoader"

    .line 11
    .line 12
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v3, "dalvik.system.DexClassLoader"

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    filled-new-array {v1, v1, v1, v0}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    filled-new-array {p1, p2, v2, p3}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/ClassLoader;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 46
    .line 47
    return-object p1

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :catch_1
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :catch_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :catch_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :catch_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :goto_1
    new-instance p2, Ljava/lang/RuntimeException;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw p2

    .line 80
    :goto_2
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    .line 81
    .line 82
    const-string p3, "load() requires a Dalvik VM"

    .line 83
    .line 84
    invoke-direct {p2, p3, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lb/e;->g:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lr7/a;

    .line 14
    .line 15
    iget v0, v0, Lr7/a;->o:I

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :sswitch_1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/Map;

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/NavigableMap;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "\n "

    .line 43
    .line 44
    invoke-static {v1, v2}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "\nannotations=\n "

    .line 49
    .line 50
    const-string v3, "\n}"

    .line 51
    .line 52
    const-string v4, "CodeMetadata{\nlines="

    .line 53
    .line 54
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "Bounds{lower="

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Lb3/a;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " upper="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lb/e;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lb3/a;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "}"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xf -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Lg4/j;)Lg4/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lg4/e;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lg4/e;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lg4/e;-><init>(Lg4/j;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v1
.end method

.method public v()Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lb/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    new-instance v3, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lb/e;->h:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v6, v0

    .line 29
    check-cast v6, Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v8, "tools"

    .line 40
    .line 41
    if-eqz v0, :cond_d

    .line 42
    .line 43
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lfb/p0;

    .line 48
    .line 49
    new-instance v9, Lorg/json/JSONObject;

    .line 50
    .line 51
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v10, v0, Lfb/p0;->a:Lfb/r0;

    .line 55
    .line 56
    iget-object v12, v0, Lfb/p0;->c:Lfb/o0;

    .line 57
    .line 58
    iget-object v13, v0, Lfb/p0;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v14, v10, Lfb/r0;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, v10, Lfb/r0;->a:Ljava/lang/String;

    .line 63
    .line 64
    const-string v10, "id"

    .line 65
    .line 66
    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v10, "name"

    .line 70
    .line 71
    invoke-virtual {v9, v10, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    const-string v0, "namespace"

    .line 75
    .line 76
    invoke-virtual {v9, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 80
    .line 81
    invoke-virtual {v12}, Lfb/o0;->b()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    invoke-direct {v0, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    new-instance v15, Lsf/f;

    .line 91
    .line 92
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object v0, v15

    .line 96
    :goto_1
    nop

    .line 97
    instance-of v15, v0, Lsf/f;

    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const-string v11, "toolCount"

    .line 102
    .line 103
    move-object/from16 v17, v0

    .line 104
    .line 105
    if-nez v15, :cond_a

    .line 106
    .line 107
    move-object/from16 v15, v17

    .line 108
    .line 109
    check-cast v15, Lorg/json/JSONObject;

    .line 110
    .line 111
    const-string v0, "instructions"

    .line 112
    .line 113
    const-string v1, ""

    .line 114
    .line 115
    invoke-virtual {v15, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v19

    .line 119
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static/range {v19 .. v19}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v20

    .line 126
    if-nez v20, :cond_0

    .line 127
    .line 128
    move-object/from16 v24, v19

    .line 129
    .line 130
    move-object/from16 v19, v6

    .line 131
    .line 132
    move-object/from16 v6, v24

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_0
    move-object/from16 v19, v6

    .line 136
    .line 137
    move-object/from16 v6, v16

    .line 138
    .line 139
    :goto_2
    if-eqz v6, :cond_1

    .line 140
    .line 141
    invoke-virtual {v9, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    :cond_1
    invoke-virtual {v15, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_2
    new-instance v0, Lorg/json/JSONArray;

    .line 152
    .line 153
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    const/4 v8, 0x0

    .line 161
    invoke-static {v8, v6}, Lr9/e0;->r0(II)Llg/d;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    new-instance v8, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    :goto_4
    move-object v15, v6

    .line 175
    check-cast v15, Llg/c;

    .line 176
    .line 177
    move-object/from16 v16, v6

    .line 178
    .line 179
    iget-boolean v6, v15, Llg/c;->i:Z

    .line 180
    .line 181
    if-eqz v6, :cond_4

    .line 182
    .line 183
    invoke-virtual {v15}, Llg/c;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    check-cast v6, Ljava/lang/Number;

    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    if-eqz v6, :cond_3

    .line 198
    .line 199
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :cond_3
    move-object/from16 v6, v16

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_4
    new-instance v6, Lfb/r;

    .line 206
    .line 207
    const/4 v15, 0x5

    .line 208
    invoke-direct {v6, v15}, Lfb/r;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v8, v6}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eqz v8, :cond_9

    .line 224
    .line 225
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    check-cast v8, Lorg/json/JSONObject;

    .line 230
    .line 231
    invoke-static {v10, v1, v8}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    if-eqz v16, :cond_5

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_5
    move-object/from16 v16, v0

    .line 243
    .line 244
    const-string v0, "[^A-Za-z0-9_-]+"

    .line 245
    .line 246
    move-object/from16 v20, v6

    .line 247
    .line 248
    const-string v6, "_"

    .line 249
    .line 250
    invoke-static {v0, v15, v6}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object/from16 v21, v7

    .line 255
    .line 256
    const/4 v7, 0x1

    .line 257
    move-object/from16 v22, v8

    .line 258
    .line 259
    new-array v8, v7, [C

    .line 260
    .line 261
    const/16 v23, 0x5f

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    aput-char v23, v8, v18

    .line 266
    .line 267
    invoke-static {v0, v8}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_6

    .line 276
    .line 277
    const-string v0, "tool"

    .line 278
    .line 279
    :cond_6
    new-instance v8, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    move/from16 v23, v7

    .line 282
    .line 283
    const-string v7, "mcp__"

    .line 284
    .line 285
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v7, "__"

    .line 292
    .line 293
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    const/4 v7, 0x2

    .line 304
    :goto_6
    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_7

    .line 309
    .line 310
    new-instance v8, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    add-int/lit8 v7, v7, 0x1

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_7
    new-instance v6, Lfb/q0;

    .line 332
    .line 333
    invoke-direct {v6, v12, v15}, Lfb/q0;-><init>(Lfb/o0;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    new-instance v6, Lorg/json/JSONObject;

    .line 340
    .line 341
    invoke-virtual/range {v22 .. v22}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 349
    .line 350
    .line 351
    const-string v0, "description"

    .line 352
    .line 353
    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    if-eqz v8, :cond_8

    .line 373
    .line 374
    const-string v7, " \u63d0\u4f9b\u7684\u5de5\u5177"

    .line 375
    .line 376
    invoke-virtual {v14, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    goto :goto_7

    .line 381
    :cond_8
    const-string v8, "["

    .line 382
    .line 383
    const-string v15, "] "

    .line 384
    .line 385
    invoke-static {v8, v14, v15, v7}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    :goto_7
    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 393
    .line 394
    .line 395
    move-object/from16 v0, v16

    .line 396
    .line 397
    move-object/from16 v6, v20

    .line 398
    .line 399
    move-object/from16 v7, v21

    .line 400
    .line 401
    goto/16 :goto_5

    .line 402
    .line 403
    :cond_9
    move-object/from16 v16, v0

    .line 404
    .line 405
    move-object/from16 v21, v7

    .line 406
    .line 407
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONArray;->length()I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    invoke-virtual {v9, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_a
    move-object/from16 v19, v6

    .line 416
    .line 417
    move-object/from16 v21, v7

    .line 418
    .line 419
    :goto_8
    invoke-static/range {v17 .. v17}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    if-eqz v0, :cond_c

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    if-eqz v1, :cond_b

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    const-string v6, ": "

    .line 449
    .line 450
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    const-string v0, "error"

    .line 464
    .line 465
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 466
    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    invoke-virtual {v9, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 470
    .line 471
    .line 472
    :cond_c
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 473
    .line 474
    .line 475
    move-object/from16 v1, p0

    .line 476
    .line 477
    move-object/from16 v6, v19

    .line 478
    .line 479
    move-object/from16 v7, v21

    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :cond_d
    move-object/from16 v19, v6

    .line 484
    .line 485
    const/16 v16, 0x0

    .line 486
    .line 487
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-ne v0, v1, :cond_f

    .line 496
    .line 497
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_e

    .line 502
    .line 503
    goto :goto_a

    .line 504
    :cond_e
    const/4 v9, 0x0

    .line 505
    const/16 v10, 0x3e

    .line 506
    .line 507
    const-string v6, "\uff1b"

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    const/4 v8, 0x0

    .line 511
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    const-string v1, "MCP \u8fde\u63a5\u5931\u8d25: "

    .line 516
    .line 517
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    return-object v16

    .line 525
    :cond_f
    :goto_a
    new-instance v0, Lorg/json/JSONObject;

    .line 526
    .line 527
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 528
    .line 529
    .line 530
    const-string v1, "servers"

    .line 531
    .line 532
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    return-object v0
.end method

.method public w()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll8/a;

    .line 4
    .line 5
    iget-object v0, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v1, "memberlist"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public x(I)Lt4/a;
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lb/e;->C(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lz4/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Lb/e;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lv4/e0;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lv4/c0;

    .line 26
    .line 27
    new-instance v4, Lv4/d0;

    .line 28
    .line 29
    iget-object v1, v1, Lv4/c0;->g:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v4, v1}, Lv4/d0;-><init>(Lw4/c;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lt4/a;

    .line 39
    .line 40
    invoke-direct {v1, v4, p1}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    move v4, p1

    .line 45
    :goto_0
    if-ge v4, v2, :cond_0

    .line 46
    .line 47
    const/4 v5, 0x5

    .line 48
    invoke-virtual {p0, v5}, Lb/e;->C(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-virtual {v3, v5}, Lv4/e0;->l(I)Lv4/a;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lv4/c0;

    .line 60
    .line 61
    invoke-virtual {p0}, Lb/e;->B()Lv4/a;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    new-instance v7, Lt4/d;

    .line 66
    .line 67
    invoke-direct {v7, v5, v6}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v7}, Lt4/a;->l(Lt4/d;)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput-boolean p1, v1, Lz4/j;->g:Z

    .line 77
    .line 78
    return-object v1
.end method

.method public y(I)Lt4/b;
    .locals 6

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/a;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Lt4/b;

    .line 10
    .line 11
    invoke-direct {v2}, Lt4/b;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lb/e;->x(I)Lt4/a;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v2, v5}, Lt4/b;->l(Lt4/a;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-boolean v3, v2, Lz4/j;->g:Z

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    new-instance p1, Ll4/c;

    .line 38
    .line 39
    const-string v0, "extra data in attribute"

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 43
    .line 44
    .line 45
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :catch_0
    move-exception p1

    .line 47
    const-string v0, "shouldn\'t happen"

    .line 48
    .line 49
    invoke-static {v0, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1
.end method

.method public z()Lv4/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lv4/e0;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lv4/e0;->l(I)Lv4/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
