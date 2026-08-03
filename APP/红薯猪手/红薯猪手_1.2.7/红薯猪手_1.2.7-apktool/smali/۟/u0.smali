.class public final L۟/u0;
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

    iput-object p1, p0, L۟/u0;->ۥ:L۟/y0;

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
    iget-object v0, p0, L۟/u0;->ۥ:L۟/y0;

    .line 23
    .line 24
    sget-object v2, L۟/n8;->ۥ:L۟/n8;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, L۟/n8;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    sget-object v3, L۟/k8;->ۥۣ۟:L۟/k;

    .line 38
    .line 39
    iget-object v3, v3, L۟/k;->ۥ:Ljava/lang/String;

    .line 40
    .line 41
    const/16 v4, 0x16

    .line 42
    .line 43
    new-array v5, v4, [B

    .line 44
    .line 45
    fill-array-data v5, :array_2

    .line 46
    .line 47
    .line 48
    new-array v6, v1, [B

    .line 49
    .line 50
    fill-array-data v6, :array_3

    .line 51
    .line 52
    .line 53
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5, v3}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/16 v5, 0xb

    .line 61
    .line 62
    new-array v5, v5, [B

    .line 63
    .line 64
    fill-array-data v5, :array_4

    .line 65
    .line 66
    .line 67
    new-array v6, v1, [B

    .line 68
    .line 69
    fill-array-data v6, :array_5

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v3, v5}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const/4 v5, -0x1

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move v3, v5

    .line 89
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Landroid/widget/TextView;

    .line 94
    .line 95
    sget-object v6, L۟/k8;->ۥۣ۟:L۟/k;

    .line 96
    .line 97
    iget-object v6, v6, L۟/k;->ۥ:Ljava/lang/String;

    .line 98
    .line 99
    new-array v4, v4, [B

    .line 100
    .line 101
    fill-array-data v4, :array_6

    .line 102
    .line 103
    .line 104
    new-array v7, v1, [B

    .line 105
    .line 106
    fill-array-data v7, :array_7

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v4, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    const/16 v4, 0x11

    .line 117
    .line 118
    new-array v4, v4, [B

    .line 119
    .line 120
    fill-array-data v4, :array_8

    .line 121
    .line 122
    .line 123
    new-array v1, v1, [B

    .line 124
    .line 125
    fill-array-data v1, :array_9

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v6, v1}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_2

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    :cond_2
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-nez v1, :cond_3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    new-instance v2, L۟/t0;

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    invoke-direct {v2, p1, v0, v4}, L۟/t0;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 156
    .line 157
    .line 158
    new-instance v2, L۟/t0;

    .line 159
    .line 160
    const/4 v3, 0x1

    .line 161
    invoke-direct {v2, p1, v0, v3}, L۟/t0;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 168
    .line 169
    return-object p1

    .line 170
    nop

    .line 171
    :array_0
    .array-data 1
        -0x3et
        -0x70t
        -0x64t
        0x12t
        0x72t
    .end array-data

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    nop

    .line 179
    :array_1
    .array-data 1
        -0x4et
        -0xft
        -0x12t
        0x73t
        0x1ft
        0x68t
    .end array-data

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    nop

    .line 187
    :array_2
    .array-data 1
        0x2et
        0x4at
        0x56t
        0x22t
        0x3ct
        0x49t
        0x2dt
        0x44t
        0x56t
        0x35t
        0x11t
        0x54t
        0x17t
        0x4at
        0x4bt
        0x3ct
        0x7t
        0x78t
        0x7t
        0x68t
        0x4et
        0x23t
    .end array-data

    .line 188
    .line 189
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
    .line 202
    nop

    .line 203
    :array_3
    .array-data 1
        0x63t
        0x2bt
        0x22t
        0x50t
        0x55t
        0x31t
    .end array-data

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    nop

    .line 211
    :array_4
    .array-data 1
        -0x4dt
        -0xat
        -0x75t
        0x1ct
        -0x2at
        -0x1ct
        -0x57t
        -0xbt
        -0x66t
        0x2dt
        -0x2ct
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    :array_5
    .array-data 1
        -0x23t
        -0x67t
        -0x1t
        0x79t
        -0x7et
        -0x73t
    .end array-data

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    nop

    .line 229
    :array_6
    .array-data 1
        0x2ft
        -0x19t
        -0x6at
        0x37t
        -0x6ft
        0x42t
        0x2ct
        -0x17t
        -0x6at
        0x20t
        -0x44t
        0x5ft
        0x16t
        -0x19t
        -0x75t
        0x29t
        -0x56t
        0x73t
        0x6t
        -0x3bt
        -0x72t
        0x36t
    .end array-data

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
    nop

    .line 245
    :array_7
    .array-data 1
        0x62t
        -0x7at
        -0x1et
        0x45t
        -0x8t
        0x3at
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    nop

    .line 253
    :array_8
    .array-data 1
        0x17t
        0x79t
        -0x72t
        -0x7et
        -0x56t
        -0xbt
        0x11t
        0x60t
        -0x76t
        -0x4ft
        -0x56t
        -0x3dt
        0xat
        0x42t
        -0x7at
        -0x80t
        -0x48t
    .end array-data

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
    nop

    .line 267
    :array_9
    .array-data 1
        0x7et
        0x14t
        -0x11t
        -0x1bt
        -0x31t
        -0x45t
    .end array-data
.end method
