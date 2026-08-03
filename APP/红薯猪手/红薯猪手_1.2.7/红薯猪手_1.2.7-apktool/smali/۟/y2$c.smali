.class public final L۟/y2$c;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/y2;->ۥ(Ljava/lang/String;)V
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


# static fields
.field public static final ۥ:L۟/y2$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/y2$c;

    invoke-direct {v0}, L۟/y2$c;-><init>()V

    sput-object v0, L۟/y2$c;->ۥ:L۟/y2$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v1, v0, [B

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    fill-array-data v3, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-boolean v1, L۟/y2;->ۥ:Z

    .line 23
    .line 24
    invoke-static {}, L۟/y2$a;->ۥ۟()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v1, L۟/k8;->ۥۣ۟:L۟/k;

    .line 32
    .line 33
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, L۟/k;->ۥۢۢ:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v3, 0x12

    .line 40
    .line 41
    new-array v3, v3, [B

    .line 42
    .line 43
    fill-array-data v3, :array_2

    .line 44
    .line 45
    .line 46
    new-array v4, v2, [B

    .line 47
    .line 48
    fill-array-data v4, :array_3

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v3, v3, L۟/k;->ۥۣۢ:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    new-array v4, v4, [Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/16 v6, 0xf

    .line 69
    .line 70
    new-array v6, v6, [B

    .line 71
    .line 72
    fill-array-data v6, :array_4

    .line 73
    .line 74
    .line 75
    new-array v7, v2, [B

    .line 76
    .line 77
    fill-array-data v7, :array_5

    .line 78
    .line 79
    .line 80
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    aput-object v6, v4, v5

    .line 85
    .line 86
    const/4 v5, 0x1

    .line 87
    const/16 v6, 0xc

    .line 88
    .line 89
    new-array v6, v6, [B

    .line 90
    .line 91
    fill-array-data v6, :array_6

    .line 92
    .line 93
    .line 94
    new-array v7, v2, [B

    .line 95
    .line 96
    fill-array-data v7, :array_7

    .line 97
    .line 98
    .line 99
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    aput-object v6, v4, v5

    .line 104
    .line 105
    const-string v5, ""

    .line 106
    .line 107
    aput-object v5, v4, v0

    .line 108
    .line 109
    const/4 v0, 0x3

    .line 110
    aput-object v5, v4, v0

    .line 111
    .line 112
    invoke-static {v1, v3, v4}, L۟/r3;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-nez v0, :cond_1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const/16 v1, 0x4f

    .line 124
    .line 125
    new-array v1, v1, [B

    .line 126
    .line 127
    fill-array-data v1, :array_8

    .line 128
    .line 129
    .line 130
    new-array v2, v2, [B

    .line 131
    .line 132
    fill-array-data v2, :array_9

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, L۟/sb;->ۥ(Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :goto_0
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 150
    .line 151
    return-object p1

    .line 152
    nop

    .line 153
    :array_0
    .array-data 1
        -0x58t
        -0x41t
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    nop

    .line 159
    :array_1
    .array-data 1
        -0x3ft
        -0x35t
        -0x18t
        0x13t
        0x3ct
        -0x61t
    .end array-data

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    nop

    .line 167
    :array_2
    .array-data 1
        0x4dt
        -0x71t
        0x61t
        0x45t
        0x67t
        -0x6t
        0x6at
        -0x7et
        0x6dt
        0x7ft
        0x67t
        -0x21t
        0x6et
        -0x7et
        0x72t
        0x74t
        0x6et
        -0x40t
    .end array-data

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    nop

    .line 181
    :array_3
    .array-data 1
        0x1et
        -0x19t
        0x0t
        0x37t
        0x2t
        -0x4dt
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    nop

    .line 189
    :array_4
    .array-data 1
        -0x13t
        0x2t
        0x8t
        0x1at
        -0x72t
        -0x2ct
        -0x4t
        0x2t
        0x7t
        0x1bt
        -0x6ct
        -0x30t
        -0x4t
        0xft
        0x1dt
    .end array-data

    .line 190
    .line 191
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
    :array_5
    .array-data 1
        -0x47t
        0x5bt
        0x58t
        0x5ft
        -0x2ft
        -0x64t
    .end array-data

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    nop

    .line 209
    :array_6
    .array-data 1
        0x39t
        0x1ct
        0x2t
        0x75t
        -0x63t
        -0x38t
        0x3bt
        0x21t
        0x27t
        0x7bt
        -0x80t
        -0x2t
    .end array-data

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    :array_7
    .array-data 1
        -0x22t
        -0x70t
        -0x58t
        -0x6dt
        0x14t
        0x43t
    .end array-data

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    nop

    .line 227
    :array_8
    .array-data 1
        -0xdt
        -0x10t
        0x6ct
        0x19t
        -0x5at
        -0x55t
        -0x4t
        -0x15t
        0x6et
        0x1at
        -0xet
        -0x18t
        -0x1t
        -0x20t
        0x20t
        0x16t
        -0x19t
        -0x45t
        -0x17t
        -0x5bt
        0x74t
        0x1at
        -0x5at
        -0x5at
        -0xet
        -0x15t
        0x2dt
        0x1bt
        -0xdt
        -0x5ct
        -0xft
        -0x5bt
        0x74t
        0xct
        -0xat
        -0x53t
        -0x43t
        -0x12t
        0x6ft
        0x1t
        -0x16t
        -0x5ft
        -0xdt
        -0x55t
        0x63t
        0x1at
        -0x16t
        -0x5ct
        -0x8t
        -0x1at
        0x74t
        0x1ct
        -0x17t
        -0x5at
        -0x12t
        -0x55t
        0x4dt
        0x0t
        -0xet
        -0x57t
        -0x1t
        -0x17t
        0x65t
        0x39t
        -0x11t
        -0x45t
        -0x17t
        -0x47t
        0x6bt
        0x1at
        -0xet
        -0x5ct
        -0xct
        -0x15t
        0x2et
        0x34t
        -0x18t
        -0x4ft
        -0x5dt
    .end array-data

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
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
    .line 271
    :array_9
    .array-data 1
        -0x63t
        -0x7bt
        0x0t
        0x75t
        -0x7at
        -0x38t
    .end array-data
.end method
