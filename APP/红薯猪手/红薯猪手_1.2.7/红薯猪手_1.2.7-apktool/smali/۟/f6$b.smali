.class public final L۟/f6$b;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/f6;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
.field public final synthetic ۥ:L۟/f6;


# direct methods
.method public constructor <init>(L۟/f6;)V
    .locals 0

    iput-object p1, p0, L۟/f6$b;->ۥ:L۟/f6;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x2

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    aget-object p1, p1, v0

    .line 26
    .line 27
    instance-of v2, p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    check-cast p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, v3

    .line 36
    :goto_0
    if-eqz p1, :cond_9

    .line 37
    .line 38
    sget v2, L۟/o;->ۥ:I

    .line 39
    .line 40
    iget-object v2, p0, L۟/f6$b;->ۥ:L۟/f6;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x1

    .line 47
    xor-int/2addr v4, v5

    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    move v4, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v4, v0

    .line 53
    :goto_1
    if-eqz v4, :cond_9

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    sub-int/2addr v4, v5

    .line 60
    :goto_2
    const/4 v6, -0x1

    .line 61
    if-ge v6, v4, :cond_9

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const/4 v7, 0x4

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    new-array v8, v7, [B

    .line 71
    .line 72
    fill-array-data v8, :array_2

    .line 73
    .line 74
    .line 75
    new-array v9, v1, [B

    .line 76
    .line 77
    fill-array-data v9, :array_3

    .line 78
    .line 79
    .line 80
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static {v6, v8}, L۟/r3;->ۥۣ۟(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-static {v8, v9}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    move v8, v0

    .line 96
    :goto_3
    if-eqz v8, :cond_3

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_3
    if-eqz v6, :cond_4

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object v8, v3

    .line 111
    :goto_4
    const/4 v9, 0x7

    .line 112
    new-array v9, v9, [B

    .line 113
    .line 114
    fill-array-data v9, :array_4

    .line 115
    .line 116
    .line 117
    new-array v10, v1, [B

    .line 118
    .line 119
    fill-array-data v10, :array_5

    .line 120
    .line 121
    .line 122
    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-static {v8, v9}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_5

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_5
    invoke-static {v2}, L۟/f6;->ۥ۟۠(L۟/f6;)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_8

    .line 138
    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    const/16 v8, 0x9

    .line 142
    .line 143
    new-array v8, v8, [B

    .line 144
    .line 145
    fill-array-data v8, :array_6

    .line 146
    .line 147
    .line 148
    new-array v9, v1, [B

    .line 149
    .line 150
    fill-array-data v9, :array_7

    .line 151
    .line 152
    .line 153
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-static {v6, v8}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-eqz v6, :cond_6

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    goto :goto_5

    .line 168
    :cond_6
    move-object v6, v3

    .line 169
    :goto_5
    if-eqz v6, :cond_7

    .line 170
    .line 171
    new-array v7, v7, [B

    .line 172
    .line 173
    fill-array-data v7, :array_8

    .line 174
    .line 175
    .line 176
    new-array v8, v1, [B

    .line 177
    .line 178
    fill-array-data v8, :array_9

    .line 179
    .line 180
    .line 181
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-static {v6, v7}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-ne v6, v5, :cond_7

    .line 190
    .line 191
    move v6, v5

    .line 192
    goto :goto_6

    .line 193
    :cond_7
    move v6, v0

    .line 194
    :goto_6
    if-eqz v6, :cond_8

    .line 195
    .line 196
    :goto_7
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_8
    add-int/lit8 v4, v4, -0x1

    .line 200
    .line 201
    goto/16 :goto_2

    .line 202
    .line 203
    :cond_9
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 204
    .line 205
    return-object p1

    .line 206
    nop

    .line 207
    :array_0
    .array-data 1
        -0x15t
        -0x2ft
    .end array-data

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    nop

    .line 213
    :array_1
    .array-data 1
        -0x7et
        -0x5bt
        -0x77t
        0x49t
        -0x15t
        0x1bt
    .end array-data

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    nop

    .line 221
    :array_2
    .array-data 1
        -0x2et
        -0x41t
        -0xdt
        -0x40t
    .end array-data

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    :array_3
    .array-data 1
        -0x45t
        -0x34t
        -0x4et
        -0x5ct
        0x13t
        -0x54t
    .end array-data

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    nop

    .line 235
    :array_4
    .array-data 1
        -0x3bt
        -0x36t
        -0x65t
        -0x71t
        0x10t
        -0x22t
        -0x15t
    .end array-data

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    :array_5
    .array-data 1
        -0x7ct
        -0x52t
        -0x18t
        -0x3at
        0x7et
        -0x48t
    .end array-data

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    nop

    .line 251
    :array_6
    .array-data 1
        -0x2dt
        0x5ft
        -0x1et
        -0xct
        -0x2et
        0x65t
        -0x39t
        0x40t
        -0x1dt
    .end array-data

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    nop

    .line 261
    :array_7
    .array-data 1
        -0x42t
        0x30t
        -0x7at
        -0x6ft
        -0x42t
        0x31t
    .end array-data

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    nop

    .line 269
    :array_8
    .array-data 1
        -0xbt
        0x4et
        -0x16t
        -0xdt
    .end array-data

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    :array_9
    .array-data 1
        -0x67t
        0x27t
        -0x64t
        -0x6at
        -0x6et
        -0x38t
    .end array-data
.end method
