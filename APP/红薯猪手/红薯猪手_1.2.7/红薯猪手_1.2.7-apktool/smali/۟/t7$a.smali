.class public final L۟/t7$a;
.super L۟/p7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/t7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/View$OnClickListener;

.field public final synthetic ۥ۟:L۟/t7;


# direct methods
.method public constructor <init>(L۟/t7;L۟/q1;)V
    .locals 2

    const/16 v0, 0xd

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    iput-object p1, p0, L۟/t7$a;->ۥ۟:L۟/t7;

    invoke-direct {p0}, L۟/p7;-><init>()V

    iput-object p2, p0, L۟/t7$a;->ۥ:Landroid/view/View$OnClickListener;

    return-void

    :array_0
    .array-data 1
        -0x61t
        -0x1ft
        0xdt
        0x50t
        0x33t
        -0x56t
        -0x6bt
        -0x2t
        0x10t
        0x56t
        0x36t
        -0x7dt
        -0x72t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x4t
        -0x73t
        0x64t
        0x33t
        0x58t
        -0x1at
    .end array-data
.end method


# virtual methods
.method public final ۥ(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void

    :array_0
    .array-data 1
        -0x27t
        -0x1ct
        0x7bt
        -0x19t
        0x39t
        -0x52t
        -0x2ct
        -0x12t
        0x67t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x46t
        -0x75t
        0x15t
        -0x6dt
        0x58t
        -0x39t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x3ct
        -0x6et
        -0x18t
    .end array-data

    :array_3
    .array-data 1
        -0x55t
        -0x10t
        -0x7et
        0xat
        -0x3ct
        0x44t
    .end array-data
.end method

.method public final ۥ۟()I
    .locals 1

    .line 1
    iget-object v0, p0, L۟/t7$a;->ۥ۟:L۟/t7;

    .line 2
    .line 3
    iget-object v0, v0, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final ۥ۟۟(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, L۟/z2;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v0, v2}, L۟/z2;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, L۟/w;

    .line 31
    .line 32
    invoke-direct {v2, p0}, L۟/w;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, L۟/z2;->setOnViewTapListener(L۟/f7;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, L۟/t7$a;->ۥ۟:L۟/t7;

    .line 39
    .line 40
    iget-object v2, v2, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, L۟/i3;

    .line 47
    .line 48
    iget-object p2, p2, L۟/i3;->ۥ:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v2, 0x4

    .line 51
    new-array v3, v2, [B

    .line 52
    .line 53
    fill-array-data v3, :array_2

    .line 54
    .line 55
    .line 56
    new-array v4, v1, [B

    .line 57
    .line 58
    fill-array-data v4, :array_3

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {p2, v3}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    new-array v2, v2, [B

    .line 72
    .line 73
    fill-array-data v2, :array_4

    .line 74
    .line 75
    .line 76
    new-array v3, v1, [B

    .line 77
    .line 78
    fill-array-data v3, :array_5

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static {p2, v2, v3, v3, v1}, L۟/va;->ۥۡۢ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p2, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/16 v2, 0xe

    .line 95
    .line 96
    new-array v2, v2, [B

    .line 97
    .line 98
    fill-array-data v2, :array_6

    .line 99
    .line 100
    .line 101
    new-array v1, v1, [B

    .line 102
    .line 103
    fill-array-data v1, :array_7

    .line 104
    .line 105
    .line 106
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v1, p2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p2, "webp"

    .line 122
    .line 123
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v2, L۟/z7;->ۥ۠۟:L۟/z7;

    .line 135
    .line 136
    if-nez v2, :cond_2

    .line 137
    .line 138
    const-class v2, L۟/z7;

    .line 139
    .line 140
    monitor-enter v2

    .line 141
    :try_start_0
    sget-object v3, L۟/z7;->ۥ۠۟:L۟/z7;

    .line 142
    .line 143
    if-nez v3, :cond_1

    .line 144
    .line 145
    new-instance v3, L۟/z7$b;

    .line 146
    .line 147
    invoke-direct {v3, v1}, L۟/z7$b;-><init>(Landroid/content/Context;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, L۟/z7$b;->ۥ()L۟/z7;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    sput-object v1, L۟/z7;->ۥ۠۟:L۟/z7;

    .line 155
    .line 156
    :cond_1
    monitor-exit v2

    .line 157
    goto :goto_0

    .line 158
    :catchall_0
    move-exception p1

    .line 159
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    throw p1

    .line 161
    :cond_2
    :goto_0
    sget-object v1, L۟/z7;->ۥ۠۟:L۟/z7;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    if-nez p2, :cond_3

    .line 168
    .line 169
    new-instance p2, L۟/x8;

    .line 170
    .line 171
    invoke-direct {p2, v1, v2}, L۟/x8;-><init>(L۟/z7;Landroid/net/Uri;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_4

    .line 184
    .line 185
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    new-instance v3, L۟/x8;

    .line 190
    .line 191
    invoke-direct {v3, v1, p2}, L۟/x8;-><init>(L۟/z7;Landroid/net/Uri;)V

    .line 192
    .line 193
    .line 194
    move-object p2, v3

    .line 195
    :goto_1
    const/4 v1, 0x1

    .line 196
    iput-boolean v1, p2, L۟/x8;->ۥ۟۟:Z

    .line 197
    .line 198
    invoke-virtual {p2, v0, v2}, L۟/x8;->ۥ(Landroid/widget/ImageView;L۟/f0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 202
    .line 203
    .line 204
    return-object v0

    .line 205
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string p2, "Path must not be empty."

    .line 208
    .line 209
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :array_0
    .array-data 1
        -0x80t
        0x45t
        0x24t
        -0xct
        0x5ct
        0x67t
        -0x73t
        0x4ft
        0x38t
    .end array-data

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    nop

    .line 223
    :array_1
    .array-data 1
        -0x1dt
        0x2at
        0x4at
        -0x80t
        0x3dt
        0xet
    .end array-data

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    nop

    .line 231
    :array_2
    .array-data 1
        0x1et
        -0x78t
        -0x16t
        -0x2ft
    .end array-data

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :array_3
    .array-data 1
        0x6ct
        -0x13t
        -0x7dt
        -0x49t
        0x56t
        0x57t
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    nop

    .line 245
    :array_4
    .array-data 1
        -0x41t
        -0x34t
        0x26t
        -0x26t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :array_5
    .array-data 1
        -0x33t
        -0x57t
        0x4ft
        -0x44t
        0x2t
        -0x31t
    .end array-data

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    nop

    .line 259
    :array_6
    .array-data 1
        -0x33t
        -0x33t
        -0xbt
        0x7et
        0x6dt
        -0x52t
        -0x29t
        -0x2at
        -0x10t
        0x25t
        0x37t
        -0xet
        -0x70t
        -0x6ft
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    nop

    .line 271
    :array_7
    .array-data 1
        -0x42t
        -0x48t
        -0x69t
        0xdt
        0x19t
        -0x24t
    .end array-data
.end method

.method public final ۥ۟۠(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v1, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1, p2}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    nop

    :array_0
    .array-data 1
        0x6dt
        -0x5dt
        0x44t
        0x6dt
    .end array-data

    :array_1
    .array-data 1
        0x1bt
        -0x36t
        0x21t
        0x1at
        0x5at
        -0x4dt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x17t
        -0x5et
        0x70t
        0x5t
        0x2bt
        0x36t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x7at
        -0x40t
        0x1at
        0x60t
        0x48t
        0x42t
    .end array-data
.end method
