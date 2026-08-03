.class public final Lx6/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Lx6/f;

.field public static final i:Lx6/f;

.field public static final j:Lx6/f;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx6/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx6/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx6/f;->h:Lx6/f;

    .line 8
    .line 9
    new-instance v0, Lx6/f;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lx6/f;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lx6/f;->i:Lx6/f;

    .line 16
    .line 17
    new-instance v0, Lx6/f;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lx6/f;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lx6/f;->j:Lx6/f;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lx6/f;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx6/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu6/c;

    .line 7
    .line 8
    const-class v0, Lu6/d;

    .line 9
    .line 10
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-class v2, Lu6/b;

    .line 15
    .line 16
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v0, Lu6/b;

    .line 27
    .line 28
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Lu6/b;-><init>(Ljava/lang/reflect/Member;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    new-instance v0, Lu6/d;

    .line 47
    .line 48
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p1}, Lu6/d;-><init>(Ljava/lang/reflect/Member;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-class v2, Lu6/a;

    .line 57
    .line 58
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    new-instance v0, Lu6/a;

    .line 69
    .line 70
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {v0, p1}, Lu6/a;-><init>(Ljava/lang/reflect/Member;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    check-cast v0, Lu6/d;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "Unsupported accessor type: "

    .line 85
    .line 86
    invoke-static {p1, v0}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    :goto_1
    return-object v0

    .line 91
    :pswitch_0
    check-cast p1, Lu6/c;

    .line 92
    .line 93
    const-class v0, Lu6/b;

    .line 94
    .line 95
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    new-instance v0, Lu6/b;

    .line 110
    .line 111
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {v0, p1}, Lu6/b;-><init>(Ljava/lang/reflect/Member;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const-class v2, Lu6/d;

    .line 120
    .line 121
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    new-instance v0, Lu6/d;

    .line 132
    .line 133
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-direct {v0, p1}, Lu6/d;-><init>(Ljava/lang/reflect/Member;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    const-class v2, Lu6/a;

    .line 142
    .line 143
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    new-instance v0, Lu6/a;

    .line 154
    .line 155
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {v0, p1}, Lu6/a;-><init>(Ljava/lang/reflect/Member;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    check-cast v0, Lu6/b;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-string v0, "Unsupported accessor type: "

    .line 170
    .line 171
    invoke-static {p1, v0}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    :goto_3
    return-object v0

    .line 176
    :pswitch_1
    check-cast p1, Lu6/c;

    .line 177
    .line 178
    const-class v0, Lu6/a;

    .line 179
    .line 180
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const-class v2, Lu6/b;

    .line 185
    .line 186
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_6

    .line 195
    .line 196
    new-instance v0, Lu6/b;

    .line 197
    .line 198
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-direct {v0, p1}, Lu6/b;-><init>(Ljava/lang/reflect/Member;)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    const-class v2, Lu6/d;

    .line 207
    .line 208
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_7

    .line 217
    .line 218
    new-instance v0, Lu6/d;

    .line 219
    .line 220
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-direct {v0, p1}, Lu6/d;-><init>(Ljava/lang/reflect/Member;)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_7
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_8

    .line 237
    .line 238
    new-instance v0, Lu6/a;

    .line 239
    .line 240
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-direct {v0, p1}, Lu6/a;-><init>(Ljava/lang/reflect/Member;)V

    .line 245
    .line 246
    .line 247
    :goto_4
    check-cast v0, Lu6/a;

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_8
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const-string v0, "Unsupported accessor type: "

    .line 255
    .line 256
    invoke-static {p1, v0}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 v0, 0x0

    .line 260
    :goto_5
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
