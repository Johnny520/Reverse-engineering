.class public final L۟/w0;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/y0;


# direct methods
.method public constructor <init>(L۟/y0;)V
    .locals 0

    iput-object p1, p0, L۟/w0;->ۥ:L۟/y0;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aget-object v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    const/16 v3, 0x1e

    .line 32
    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    fill-array-data v3, :array_2

    .line 36
    .line 37
    .line 38
    new-array v4, v1, [B

    .line 39
    .line 40
    fill-array-data v4, :array_3

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const/16 v4, 0x14

    .line 48
    .line 49
    new-array v4, v4, [B

    .line 50
    .line 51
    fill-array-data v4, :array_4

    .line 52
    .line 53
    .line 54
    new-array v5, v1, [B

    .line 55
    .line 56
    fill-array-data v5, :array_5

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-static {v3, v4}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-gtz v4, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 78
    .line 79
    const/16 v4, 0xa

    .line 80
    .line 81
    new-array v4, v4, [B

    .line 82
    .line 83
    fill-array-data v4, :array_6

    .line 84
    .line 85
    .line 86
    new-array v6, v1, [B

    .line 87
    .line 88
    fill-array-data v6, :array_7

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const/4 v4, 0x7

    .line 99
    new-array v4, v4, [B

    .line 100
    .line 101
    fill-array-data v4, :array_8

    .line 102
    .line 103
    .line 104
    new-array v1, v1, [B

    .line 105
    .line 106
    fill-array-data v1, :array_9

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-array v4, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {p1, v1, v4}, L۟/r3;->ۥ۟(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Landroid/view/View;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    move-object v5, p1

    .line 132
    check-cast v5, Landroid/view/ViewGroup;

    .line 133
    .line 134
    :cond_2
    if-nez v5, :cond_3

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    iget-object p1, p0, L۟/w0;->ۥ:L۟/y0;

    .line 138
    .line 139
    new-instance v1, L۟/v0;

    .line 140
    .line 141
    invoke-direct {v1, p1, v5, v0, v2}, L۟/v0;-><init>(L۟/y0;Landroid/view/ViewGroup;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    :goto_0
    if-ge v2, p1, :cond_4

    .line 152
    .line 153
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v3, p0, L۟/w0;->ۥ:L۟/y0;

    .line 158
    .line 159
    new-instance v4, L۟/v0;

    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    invoke-direct {v4, v3, v5, v0, v6}, L۟/v0;-><init>(L۟/y0;Landroid/view/ViewGroup;Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_4
    :goto_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 172
    .line 173
    return-object p1

    .line 174
    nop

    .line 175
    :array_0
    .array-data 1
        -0x24t
        -0x77t
        0x65t
        -0x3dt
        0x32t
    .end array-data

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    nop

    .line 183
    :array_1
    .array-data 1
        -0x54t
        -0x18t
        0x17t
        -0x5et
        0x5ft
        -0x47t
    .end array-data

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    nop

    .line 191
    :array_2
    .array-data 1
        -0x6dt
        0x7ft
        -0x49t
        -0x4t
        0x14t
        -0x2dt
        -0x62t
        0x77t
        -0x4dt
        -0x44t
        0x42t
        -0x29t
        -0x6ft
        0x64t
        -0x58t
        -0x45t
        0x14t
        -0x6ct
        -0x6dt
        0x7ft
        -0x49t
        -0x41t
        0x9t
        -0x2ct
        -0x7ct
        0x3et
        -0x78t
        -0xat
        0x5t
        -0x22t
    .end array-data

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    nop

    .line 211
    :array_3
    .array-data 1
        -0x10t
        0x10t
        -0x26t
        -0x2et
        0x6ct
        -0x46t
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    nop

    .line 219
    :array_4
    .array-data 1
        -0x8t
        -0x35t
        0x45t
        0x2bt
        -0x46t
        0x1dt
        -0x11t
        -0x19t
        0x47t
        0x28t
        -0x55t
        0x16t
        -0xbt
        -0x30t
        0x7ct
        0x23t
        -0x59t
        0x7t
        -0x29t
        -0x18t
    .end array-data

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    :array_5
    .array-data 1
        -0x65t
        -0x5ct
        0x28t
        0x46t
        -0x21t
        0x73t
    .end array-data

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    nop

    .line 241
    :array_6
    .array-data 1
        0x61t
        -0x1t
        -0x18t
        0x6t
        -0x2ct
        0xdt
        0x7ft
        -0xet
        -0x1et
        0x1t
    .end array-data

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    nop

    .line 251
    :array_7
    .array-data 1
        0x15t
        -0x69t
        -0x7ft
        0x75t
        -0x65t
        0x6ft
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
    :array_8
    .array-data 1
        0x1et
        0x62t
        -0xft
        -0x3ct
        -0x5dt
        -0x4dt
        0xet
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :array_9
    .array-data 1
        0x79t
        0x7t
        -0x7bt
        -0x6et
        -0x36t
        -0x2at
    .end array-data
.end method
