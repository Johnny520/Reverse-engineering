.class public final L۟/o9;
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
.field public final synthetic ۥ:L۟/t9;


# direct methods
.method public constructor <init>(L۟/t9;)V
    .locals 0

    iput-object p1, p0, L۟/o9;->ۥ:L۟/t9;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

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
    iget-object v0, p0, L۟/o9;->ۥ:L۟/t9;

    .line 23
    .line 24
    const/high16 v2, 0x41880000    # 17.0f

    .line 25
    .line 26
    invoke-static {v2}, L۟/tb;->ۥ۟۠(F)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v0, v2}, L۟/t9;->ۥ۟ۢ(L۟/t9;I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    new-array v2, v2, [B

    .line 38
    .line 39
    fill-array-data v2, :array_2

    .line 40
    .line 41
    .line 42
    new-array v3, v1, [B

    .line 43
    .line 44
    fill-array-data v3, :array_3

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, L۟/k8;->ۥۣ۟:L۟/k;

    .line 55
    .line 56
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v2, v2, L۟/k;->ۥۣ۟:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v2}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v2, L۟/n8;->ۥ:L۟/n8;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, L۟/n8;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v2, v2, L۟/k;->ۥ۟ۤ:Ljava/lang/String;

    .line 82
    .line 83
    const/16 v3, 0xb

    .line 84
    .line 85
    new-array v3, v3, [B

    .line 86
    .line 87
    fill-array-data v3, :array_4

    .line 88
    .line 89
    .line 90
    new-array v4, v1, [B

    .line 91
    .line 92
    fill-array-data v4, :array_5

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3, v2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iget-object v3, v3, L۟/k;->ۥۣ۠:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v2, v3}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_0

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const/4 v2, -0x1

    .line 120
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Landroid/widget/LinearLayout;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    const/4 p1, 0x0

    .line 128
    :goto_1
    if-eqz v0, :cond_4

    .line 129
    .line 130
    if-nez p1, :cond_2

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    const/16 v2, 0x8

    .line 134
    .line 135
    new-array v2, v2, [B

    .line 136
    .line 137
    fill-array-data v2, :array_6

    .line 138
    .line 139
    .line 140
    new-array v3, v1, [B

    .line 141
    .line 142
    fill-array-data v3, :array_7

    .line 143
    .line 144
    .line 145
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v0, v2}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-array v3, v1, [B

    .line 154
    .line 155
    fill-array-data v3, :array_8

    .line 156
    .line 157
    .line 158
    new-array v1, v1, [B

    .line 159
    .line 160
    fill-array-data v1, :array_9

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v2, v1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_3

    .line 172
    .line 173
    iget-object v1, p0, L۟/o9;->ۥ:L۟/t9;

    .line 174
    .line 175
    invoke-static {v1, p1, v0}, L۟/t9;->ۥ۟۠(L۟/t9;Landroid/widget/LinearLayout;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_3
    iget-object v0, p0, L۟/o9;->ۥ:L۟/t9;

    .line 180
    .line 181
    invoke-static {v0, p1}, L۟/t9;->ۥ۟ۡ(L۟/t9;Landroid/widget/LinearLayout;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    :goto_2
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 185
    .line 186
    return-object p1

    .line 187
    :array_0
    .array-data 1
        0x5ft
        0x45t
        0x70t
        0x17t
        -0x55t
    .end array-data

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    nop

    .line 195
    :array_1
    .array-data 1
        0x2ft
        0x24t
        0x2t
        0x76t
        -0x3at
        -0x46t
    .end array-data

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    nop

    .line 203
    :array_2
    .array-data 1
        0x42t
        -0x3t
        -0x55t
        0x14t
        -0x75t
        0x36t
        0x5ct
        -0x10t
        -0x5ft
        0x13t
    .end array-data

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    nop

    .line 213
    :array_3
    .array-data 1
        0x36t
        -0x6bt
        -0x3et
        0x67t
        -0x3ct
        0x54t
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
    :array_4
    .array-data 1
        -0x6at
        -0x5ft
        0x38t
        -0x75t
        0x56t
        0x47t
        -0x62t
        -0x57t
        0xbt
        -0x71t
        0x44t
    .end array-data

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
    :array_5
    .array-data 1
        -0x29t
        -0x33t
        0x48t
        -0x1dt
        0x37t
        0x15t
    .end array-data

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    nop

    .line 239
    :array_6
    .array-data 1
        -0x78t
        -0x3dt
        -0x51t
        0x3ft
        -0x6ft
        -0x80t
        -0x6at
        -0x37t
    .end array-data

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :array_7
    .array-data 1
        -0x1at
        -0x54t
        -0x25t
        0x5at
        -0x3bt
        -0x7t
    .end array-data

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    nop

    .line 255
    :array_8
    .array-data 1
        0x4et
        -0x53t
        0x68t
        0x5bt
        0x69t
        -0x55t
    .end array-data

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    nop

    .line 263
    :array_9
    .array-data 1
        0x20t
        -0x3et
        0x1at
        0x36t
        0x8t
        -0x39t
    .end array-data
.end method
