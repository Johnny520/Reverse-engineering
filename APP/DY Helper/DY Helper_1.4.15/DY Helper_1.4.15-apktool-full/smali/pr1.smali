.class public final Lpr1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/Map;

.field public static final γ:Ljava/util/Map;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile ε:Lor1;

.field public static volatile ζ:Lmr1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sput-object v0, Lpr1;->β:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sput-object v0, Lpr1;->γ:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lpr1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    return-void
.end method

.method public static final α(Ljava/lang/Object;Ljava/lang/Float;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "currentPosition"

    .line 4
    .line 5
    const-string v2, "getDuration"

    .line 6
    .line 7
    :try_start_0
    const-string v3, "duration"

    .line 8
    .line 9
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v5, Lzi;

    .line 14
    .line 15
    const/16 v6, 0x8

    .line 16
    .line 17
    invoke-direct {v5, v4, v6}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static {v4, v5, v0, v6}, Lpr1;->ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4, v2}, Lpr1;->γ(Ljava/lang/Object;Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    const-wide/16 v7, 0x0

    .line 39
    .line 40
    cmp-long v9, v4, v7

    .line 41
    .line 42
    const-wide/16 v10, 0x1

    .line 43
    .line 44
    const-wide/16 v12, 0x3e8

    .line 45
    .line 46
    if-lez v9, :cond_2

    .line 47
    .line 48
    if-gtz v9, :cond_0

    .line 49
    .line 50
    :goto_0
    move-wide v4, v7

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    cmp-long v3, v10, v4

    .line 53
    .line 54
    if-gtz v3, :cond_1

    .line 55
    .line 56
    cmp-long v3, v4, v12

    .line 57
    .line 58
    if-gez v3, :cond_1

    .line 59
    .line 60
    mul-long/2addr v4, v12

    .line 61
    :cond_1
    :goto_1
    move-wide v12, v4

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance v4, Lnq1;

    .line 64
    .line 65
    const/16 v5, 0x17

    .line 66
    .line 67
    invoke-direct {v4, v5}, Lnq1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v5, v4, v0, v6}, Lpr1;->ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v4, v3}, Lpr1;->γ(Ljava/lang/Object;Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    cmp-long v5, v3, v7

    .line 88
    .line 89
    if-gtz v5, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    cmp-long v5, v10, v3

    .line 93
    .line 94
    if-gtz v5, :cond_4

    .line 95
    .line 96
    cmp-long v5, v3, v12

    .line 97
    .line 98
    if-gez v5, :cond_4

    .line 99
    .line 100
    mul-long/2addr v3, v12

    .line 101
    :cond_4
    move-wide v4, v3

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    const/high16 v3, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    if-nez p1, :cond_8

    .line 107
    .line 108
    const-string v5, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 109
    .line 110
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v9, Lyh0;

    .line 115
    .line 116
    const/16 v10, 0x11

    .line 117
    .line 118
    invoke-direct {v9, v5, v10}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 122
    .line 123
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v5, v9, v0, v6}, Lpr1;->ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    instance-of v9, v5, Landroid/widget/ProgressBar;

    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    if-eqz v9, :cond_5

    .line 138
    .line 139
    check-cast v5, Landroid/widget/ProgressBar;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move-object v5, v10

    .line 143
    :goto_3
    if-nez v5, :cond_6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    invoke-virtual {v5}, Landroid/widget/ProgressBar;->getMax()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-gtz v9, :cond_7

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    invoke-virtual {v5}, Landroid/widget/ProgressBar;->getProgress()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    int-to-float v5, v5

    .line 158
    int-to-float v9, v9

    .line 159
    div-float/2addr v5, v9

    .line 160
    invoke-static {v5, v4, v3}, Lj81;->λ(FFF)F

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    move-object v10, v5

    .line 169
    goto :goto_4

    .line 170
    :cond_8
    move-object/from16 v10, p1

    .line 171
    .line 172
    :goto_4
    cmp-long v5, v12, v7

    .line 173
    .line 174
    if-lez v5, :cond_9

    .line 175
    .line 176
    if-eqz v10, :cond_9

    .line 177
    .line 178
    long-to-float v1, v12

    .line 179
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    mul-float/2addr v1, v2

    .line 184
    float-to-long v1, v1

    .line 185
    goto :goto_5

    .line 186
    :cond_9
    if-lez v5, :cond_a

    .line 187
    .line 188
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    new-instance v9, Lzi;

    .line 193
    .line 194
    const/16 v10, 0x8

    .line 195
    .line 196
    invoke-direct {v9, v2, v10}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 200
    .line 201
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static {v2, v9, v0, v6}, Lpr1;->ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2, v1}, Lpr1;->γ(Ljava/lang/Object;Ljava/lang/String;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    goto :goto_5

    .line 217
    :cond_a
    move-wide v1, v7

    .line 218
    :goto_5
    cmp-long v6, v1, v7

    .line 219
    .line 220
    if-gez v6, :cond_b

    .line 221
    .line 222
    move-wide v1, v7

    .line 223
    :cond_b
    if-lez v5, :cond_f

    .line 224
    .line 225
    cmp-long v6, v1, v7

    .line 226
    .line 227
    if-gez v6, :cond_c

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_c
    cmp-long v6, v1, v12

    .line 231
    .line 232
    if-lez v6, :cond_d

    .line 233
    .line 234
    move-wide v10, v12

    .line 235
    goto :goto_6

    .line 236
    :cond_d
    move-wide v10, v1

    .line 237
    :goto_6
    if-lez v5, :cond_e

    .line 238
    .line 239
    long-to-float v1, v10

    .line 240
    long-to-float v2, v12

    .line 241
    div-float/2addr v1, v2

    .line 242
    invoke-static {v1, v4, v3}, Lj81;->λ(FFF)F

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    :cond_e
    move v14, v4

    .line 247
    new-instance v9, Lmr1;

    .line 248
    .line 249
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 250
    .line 251
    .line 252
    move-result-wide v15

    .line 253
    invoke-direct/range {v9 .. v16}, Lmr1;-><init>(JJFJ)V

    .line 254
    .line 255
    .line 256
    sget-object v1, Lpr1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 257
    .line 258
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v1, v0, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    sput-object v9, Lpr1;->ζ:Lmr1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    .line 271
    :catchall_0
    :cond_f
    :goto_7
    return-void
.end method

.method public static β(Landroid/view/View;Landroid/widget/ProgressBar;)Lor1;
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :cond_0
    move v6, v0

    .line 9
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getMax()I

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    const/4 v0, 0x0

    .line 14
    if-gtz v7, :cond_1

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_1
    int-to-float v1, v6

    .line 19
    int-to-float v2, v7

    .line 20
    div-float/2addr v1, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    const/high16 v3, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-static {v1, v2, v3}, Lj81;->λ(FFF)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sget-object v4, Lpr1;->ζ:Lmr1;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    iget-wide v10, v4, Lmr1;->δ:J

    .line 37
    .line 38
    sub-long/2addr v8, v10

    .line 39
    const-wide/16 v10, 0x1388

    .line 40
    .line 41
    cmp-long v5, v8, v10

    .line 42
    .line 43
    if-gtz v5, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v4, v0

    .line 47
    :goto_0
    if-eqz v4, :cond_5

    .line 48
    .line 49
    iget-wide v8, v4, Lmr1;->β:J

    .line 50
    .line 51
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-wide/16 v10, 0x0

    .line 56
    .line 57
    cmp-long v8, v8, v10

    .line 58
    .line 59
    if-lez v8, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object v5, v0

    .line 63
    :goto_1
    if-eqz v5, :cond_5

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v12

    .line 69
    iget v0, v4, Lmr1;->γ:F

    .line 70
    .line 71
    sub-float/2addr v0, v1

    .line 72
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const v5, 0x3da3d70a    # 0.08f

    .line 77
    .line 78
    .line 79
    cmpg-float v0, v0, v5

    .line 80
    .line 81
    if-gtz v0, :cond_4

    .line 82
    .line 83
    iget v1, v4, Lmr1;->γ:F

    .line 84
    .line 85
    :cond_4
    invoke-static {v1, v2, v3}, Lj81;->λ(FFF)F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    long-to-double v1, v12

    .line 90
    float-to-double v3, v0

    .line 91
    mul-double/2addr v1, v3

    .line 92
    double-to-long v8, v1

    .line 93
    const-wide/16 v10, 0x0

    .line 94
    .line 95
    invoke-static/range {v8 .. v13}, Lj81;->ξ(JJJ)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    move-wide v4, v12

    .line 100
    invoke-static {v2, v3}, Lpr1;->ζ(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v4, v5}, Lpr1;->ζ(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-string v9, "/"

    .line 109
    .line 110
    invoke-static {v1, v9, v8}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    new-instance v1, Lor1;

    .line 115
    .line 116
    const/high16 v8, 0x42c80000    # 100.0f

    .line 117
    .line 118
    mul-float v9, v0, v8

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v12

    .line 128
    move v8, v0

    .line 129
    invoke-direct/range {v1 .. v13}, Lor1;-><init>(JJIIFFLjava/lang/String;IJ)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/String;)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p0, p1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of p1, p0, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    check-cast p0, Ljava/lang/Number;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move-wide p0, v0

    .line 31
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_3

    .line 36
    :goto_2
    new-instance p1, Leo1;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, p1

    .line 42
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of v0, p0, Leo1;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    move-object p0, p1

    .line 51
    :cond_3
    check-cast p0, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    return-wide p0
.end method

.method public static δ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance p1, Leo1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :goto_0
    instance-of p1, p0, Leo1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p3, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_1
    invoke-interface {p1, p2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_2
    instance-of v1, p2, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v1, :cond_a

    .line 41
    .line 42
    instance-of v1, p2, Ljava/lang/Number;

    .line 43
    .line 44
    if-nez v1, :cond_a

    .line 45
    .line 46
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 47
    .line 48
    if-nez v1, :cond_a

    .line 49
    .line 50
    instance-of v1, p2, Ljava/lang/Class;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    if-eqz v1, :cond_a

    .line 60
    .line 61
    const-class v2, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_a

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    array-length v3, v2

    .line 77
    const/4 v4, 0x0

    .line 78
    :goto_1
    if-ge v4, v3, :cond_9

    .line 79
    .line 80
    aget-object v5, v2, v4

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x1

    .line 94
    if-eqz v6, :cond_4

    .line 95
    .line 96
    :goto_2
    move-object v5, v0

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    :try_start_0
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    goto :goto_3

    .line 117
    :catchall_0
    move-exception v5

    .line 118
    new-instance v6, Leo1;

    .line 119
    .line 120
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object v5, v6

    .line 124
    :goto_3
    instance-of v6, v5, Leo1;

    .line 125
    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    :goto_4
    if-nez v5, :cond_7

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    add-int/2addr v7, p3

    .line 133
    invoke-static {p0, p1, v5, v7}, Lpr1;->ε(Ljava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    return-object v5

    .line 140
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    goto :goto_0

    .line 148
    :cond_a
    :goto_6
    return-object v0
.end method

.method public static ζ(J)Ljava/lang/String;
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide p0, v0

    .line 8
    :cond_0
    const-wide/16 v2, 0x3e8

    .line 9
    .line 10
    div-long/2addr p0, v2

    .line 11
    const-wide/16 v2, 0x3c

    .line 12
    .line 13
    rem-long v4, p0, v2

    .line 14
    .line 15
    div-long/2addr p0, v2

    .line 16
    div-long v6, p0, v2

    .line 17
    .line 18
    cmp-long v0, v6, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 23
    .line 24
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    rem-long/2addr p0, v2

    .line 29
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 p1, 0x3

    .line 42
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "%d:%02d:%02d"

    .line 47
    .line 48
    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 54
    .line 55
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 p1, 0x2

    .line 68
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "%02d:%02d"

    .line 73
    .line 74
    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final η()Lor1;
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lpr1;->ε:Lor1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iget-wide v3, v0, Lor1;->ι:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    sub-long/2addr v1, v3

    .line 13
    const-wide/16 v3, 0xa28

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-gtz v1, :cond_1

    .line 18
    .line 19
    return-object v0

    .line 20
    :catchall_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public static θ(Landroid/view/View;)Lnr1;
    .locals 10

    .line 1
    sget-object v0, Lpr1;->β:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lnr1;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, Landroid/graphics/Paint;

    .line 30
    .line 31
    const/16 v3, 0x81

    .line 32
    .line 33
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/high16 v4, 0x40e00000    # 7.0f

    .line 38
    .line 39
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v3, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-string v5, "seekbar_time_text_size"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    .line 60
    const/4 v6, 0x7

    .line 61
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {v7, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :catchall_0
    const/4 v5, 0x4

    .line 70
    const/16 v7, 0x14

    .line 71
    .line 72
    :try_start_2
    invoke-static {v6, v5, v7}, Lj81;->μ(III)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    int-to-float v5, v5

    .line 77
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v3, v5, v6}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 86
    .line 87
    .line 88
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v3, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    :goto_1
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 103
    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    const v4, -0x66000001

    .line 107
    .line 108
    .line 109
    :try_start_3
    invoke-static {}, Lui1;->Α()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    const-string v5, "seekbar_time_color"

    .line 117
    .line 118
    const-string v6, "#99FFFFFF"

    .line 119
    .line 120
    invoke-static {v5, v6}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-string v6, "seekbar_time_alpha"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 125
    .line 126
    const/16 v7, 0x3c

    .line 127
    .line 128
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-interface {v8, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 133
    .line 134
    .line 135
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    :catchall_2
    const/16 v6, 0x64

    .line 137
    .line 138
    :try_start_5
    invoke-static {v7, v3, v6}, Lj81;->μ(III)I

    .line 139
    .line 140
    .line 141
    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 142
    :try_start_6
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 150
    goto :goto_2

    .line 151
    :catchall_3
    move-exception v5

    .line 152
    :try_start_7
    new-instance v8, Leo1;

    .line 153
    .line 154
    invoke-direct {v8, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    move-object v5, v8

    .line 158
    :goto_2
    const v8, 0xffffff

    .line 159
    .line 160
    .line 161
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    instance-of v9, v5, Leo1;

    .line 166
    .line 167
    if-eqz v9, :cond_4

    .line 168
    .line 169
    move-object v5, v8

    .line 170
    :cond_4
    check-cast v5, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    const/16 v8, 0xff

    .line 177
    .line 178
    mul-int/2addr v7, v8

    .line 179
    div-int/2addr v7, v6

    .line 180
    invoke-static {v7, v3, v8}, Lj81;->μ(III)I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    invoke-static {v6, v7, v8, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 197
    .line 198
    .line 199
    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 200
    :catchall_4
    :goto_3
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 201
    .line 202
    .line 203
    sget-object v4, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const/4 v4, 0x1

    .line 220
    const v5, 0x3f4ccccd    # 0.8f

    .line 221
    .line 222
    .line 223
    invoke-static {v4, v5, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const v5, 0x3eb33333    # 0.35f

    .line 236
    .line 237
    .line 238
    invoke-static {v4, v5, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    const/high16 v4, 0x66000000

    .line 243
    .line 244
    const/4 v5, 0x0

    .line 245
    invoke-virtual {v2, v3, v5, v1, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 246
    .line 247
    .line 248
    new-instance v1, Lnr1;

    .line 249
    .line 250
    invoke-direct {v1, v2}, Lnr1;-><init>(Landroid/graphics/Paint;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 254
    .line 255
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    return-object v1
.end method

.method public static ι(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v2, v1

    .line 20
    :goto_1
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    aget-object v3, v1, v0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    array-length v3, v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return v0
.end method

.method public static κ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V
    .locals 4

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    const-string v1, "hook "

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lxq0;->α:Lxq0;

    .line 6
    .line 7
    invoke-virtual {v2, p0, p1, p2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " count="

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lpr1;->λ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    new-instance v2, Leo1;

    .line 53
    .line 54
    invoke-direct {v2, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p2, v2

    .line 58
    :goto_0
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const-string v2, " failed: "

    .line 73
    .line 74
    invoke-static {v1, p0, v0, p1, v2}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-void
.end method

.method public static λ(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "DYHelper: SeekBarTime"

    .line 4
    .line 5
    invoke-static {v2, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static μ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 8
    .line 9
    const/high16 v2, 0x1020000

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v3, v1

    .line 23
    :goto_0
    invoke-static {v3}, Lpr1;->ν(Landroid/graphics/Rect;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const v2, 0x102000d

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v3, v1

    .line 49
    :goto_1
    invoke-static {v3}, Lpr1;->ν(Landroid/graphics/Rect;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    const v2, 0x102000f

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move-object v2, v1

    .line 75
    :goto_2
    invoke-static {v2}, Lpr1;->ν(Landroid/graphics/Rect;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_5
    if-eqz p0, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    move-object p0, v1

    .line 94
    :goto_3
    invoke-static {p0}, Lpr1;->ν(Landroid/graphics/Rect;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_7
    return-object v1
.end method

.method public static final ν(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-lez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method
