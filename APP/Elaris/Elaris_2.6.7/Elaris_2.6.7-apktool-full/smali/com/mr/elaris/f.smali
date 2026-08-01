.class public abstract Lcom/mr/elaris/f;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile b:Landroid/app/Application;

.field public static volatile c:Ljava/lang/ClassLoader;

.field public static volatile d:Ljava/lang/String;

.field public static volatile e:Ljava/lang/String;

.field public static volatile f:I

.field public static volatile g:J

.field public static volatile h:J


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
    sput-object v0, Lcom/mr/elaris/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    sput-object v0, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 12
    .line 13
    sput-object v0, Lcom/mr/elaris/f;->e:Ljava/lang/String;

    .line 14
    .line 15
    sput v1, Lcom/mr/elaris/f;->f:I

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    sput-wide v0, Lcom/mr/elaris/f;->g:J

    .line 20
    .line 21
    sput-wide v0, Lcom/mr/elaris/f;->h:J

    .line 22
    .line 23
    return-void
.end method

.method public static A()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "keep_fire_time"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lcom/mr/elaris/f;->m(Ljava/lang/String;)[I

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, ""

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    move-object v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    aget v5, v2, v5

    .line 28
    .line 29
    invoke-static {v5}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v5, ":"

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    aget v2, v2, v5

    .line 43
    .line 44
    invoke-static {v2}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-lez v4, :cond_1

    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_1
    if-nez v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const v2, 0xff1a

    .line 70
    .line 71
    .line 72
    const/16 v3, 0x3a

    .line 73
    .line 74
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    invoke-static {v0}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_3
    return-object v3
.end method

.method public static B()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyyMMdd"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static C(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "0"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static D(Li8;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Li8;->a:Ljava/util/List;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lk8;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/mr/elaris/f;->h(Lk8;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/mr/elaris/f;->e(Ljava/util/ArrayList;Lk8;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static a()V
    .locals 11

    .line 1
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li8;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "debug_log"

    .line 12
    .line 13
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "keep-fire skipped: "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Li8;->f:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget-object v2, Lcom/mr/elaris/f;->e:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const-string v3, ""

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    sput-object v1, Lcom/mr/elaris/f;->e:Ljava/lang/String;

    .line 55
    .line 56
    sput v4, Lcom/mr/elaris/f;->f:I

    .line 57
    .line 58
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    sput-wide v5, Lcom/mr/elaris/f;->g:J

    .line 61
    .line 62
    sput-object v3, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 63
    .line 64
    :cond_2
    invoke-static {v0}, Lcom/mr/elaris/f;->o(Li8;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const-string v6, "keep_fire_last_sent_day"

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-static {v6, v1}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    sget v5, Lcom/mr/elaris/f;->f:I

    .line 83
    .line 84
    const-string v7, "keep-fire pending after max attempts: "

    .line 85
    .line 86
    const/4 v8, 0x6

    .line 87
    if-lt v5, v8, :cond_4

    .line 88
    .line 89
    sput-object v1, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v2}, Lcom/mr/elaris/f;->i(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    sget v5, Lcom/mr/elaris/f;->f:I

    .line 104
    .line 105
    add-int/lit8 v5, v5, 0x1

    .line 106
    .line 107
    sput v5, Lcom/mr/elaris/f;->f:I

    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    sput-wide v9, Lcom/mr/elaris/f;->g:J

    .line 114
    .line 115
    new-instance v5, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v9, "keep-fire auto run, targets="

    .line 118
    .line 119
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v9, ", attempt="

    .line 130
    .line 131
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    sget v9, Lcom/mr/elaris/f;->f:I

    .line 135
    .line 136
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v9, "/6"

    .line 140
    .line 141
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v2, v4, v4}, Lcom/mr/elaris/f;->x(Li8;Ljava/util/ArrayList;ZZ)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    invoke-static {v0}, Lcom/mr/elaris/f;->o(Li8;)Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v9, "keep-fire result, manual=false, sent="

    .line 162
    .line 163
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v4, "/"

    .line 170
    .line 171
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v2, ", pending="

    .line 182
    .line 183
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_5

    .line 198
    .line 199
    move-object v2, v3

    .line 200
    goto :goto_0

    .line 201
    :cond_5
    invoke-static {v0}, Lcom/mr/elaris/f;->i(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const-string v4, ", pendingTargets="

    .line 206
    .line 207
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :goto_0
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    invoke-static {v6, v1}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    sput-object v1, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 231
    .line 232
    return-void

    .line 233
    :cond_6
    sget v2, Lcom/mr/elaris/f;->f:I

    .line 234
    .line 235
    if-lt v2, v8, :cond_7

    .line 236
    .line 237
    invoke-static {v6, v3}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    sput-object v1, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v0}, Lcom/mr/elaris/f;->i(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_7
    invoke-static {v6, v3}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    sput-object v3, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 258
    .line 259
    return-void
.end method

.method public static b(IJ)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    add-long/2addr p1, v0

    .line 12
    :goto_0
    invoke-static {p0}, Lcom/mr/elaris/f;->w(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    sub-long v0, p1, v0

    .line 23
    .line 24
    cmp-long v4, v0, v2

    .line 25
    .line 26
    if-gtz v4, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const-wide/32 v4, 0xea60

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    return-void
.end method

.method public static c(Li8;Li8;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Li8;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Li8;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Li8;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p1, Li8;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Li8;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p1, Li8;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Li8;
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-string p0, ""

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/16 v2, 0xd

    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    const-string v2, "  "

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const-string v3, " "

    .line 39
    .line 40
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/16 v3, 0x78

    .line 50
    .line 51
    if-le v2, v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_2
    move-object v2, p1

    .line 62
    :goto_1
    invoke-static {p2}, Lcom/mr/elaris/f;->m(Ljava/lang/String;)[I

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string p2, ":"

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    aget v4, p1, v0

    .line 78
    .line 79
    invoke-static {v4}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    aget v4, p1, v3

    .line 90
    .line 91
    invoke-static {v4}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    new-instance v0, Li8;

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    const-string v6, "\u672a\u9009\u62e9\u7eed\u706b\u5bf9\u8c61"

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    move-object v3, p0

    .line 115
    invoke-direct/range {v0 .. v6}, Li8;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    move v7, v3

    .line 120
    move-object v3, p0

    .line 121
    move p0, v7

    .line 122
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_5

    .line 127
    .line 128
    new-instance v0, Li8;

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    const-string v6, "\u672a\u586b\u5199\u6d88\u606f"

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-direct/range {v0 .. v6}, Li8;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_5
    if-nez p1, :cond_6

    .line 139
    .line 140
    new-instance v0, Li8;

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    const-string v6, "\u65f6\u95f4\u683c\u5f0f\u5e94\u4e3a HH:mm"

    .line 144
    .line 145
    const-string v3, ""

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    invoke-direct/range {v0 .. v6}, Li8;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_6
    move v3, v0

    .line 153
    new-instance v0, Li8;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    aget v5, p1, v3

    .line 161
    .line 162
    invoke-static {v5}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    aget p2, p1, p0

    .line 173
    .line 174
    invoke-static {p2}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    aget v4, p1, v3

    .line 186
    .line 187
    aget v5, p1, p0

    .line 188
    .line 189
    const-string v6, ""

    .line 190
    .line 191
    move-object v3, p2

    .line 192
    invoke-direct/range {v0 .. v6}, Li8;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object v0
.end method

.method public static e(Ljava/util/ArrayList;Lk8;)Z
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lk8;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget v1, v0, Lk8;->a:I

    .line 23
    .line 24
    iget v2, p1, Lk8;->a:I

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    iget-object v1, p1, Lk8;->b:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, v0, Lk8;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static f()Li8;
    .locals 4

    .line 1
    const-string v0, "keep_fire_groups"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "keep_fire_message"

    .line 18
    .line 19
    invoke-static {v2, v1}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "keep_fire_time"

    .line 24
    .line 25
    invoke-static {v2}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v2, v3}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v0, v1, v2}, Lcom/mr/elaris/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Li8;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method public static g(Lk8;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "keep_fire_done_"

    .line 4
    .line 5
    const-string v2, "keep_fire_done_group_"

    .line 6
    .line 7
    const-string v3, "keep_fire_done_friend_"

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_4

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v5, p0, Lk8;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Lk8;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-interface {v4, v6, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-lez v7, :cond_1

    .line 39
    .line 40
    return-object v6

    .line 41
    :cond_1
    iget p0, p0, Lk8;->a:I

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    if-ne p0, v6, :cond_2

    .line 45
    .line 46
    new-instance p0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {v4, p0, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {v4, p0, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-lez v2, :cond_3

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {v4, p0, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :catchall_0
    :cond_4
    :goto_0
    return-object v0
.end method

.method public static h(Lk8;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lk8;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p0, p0, Lk8;->a:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p0, v1, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Li5;->H0(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    invoke-static {v0}, La7;->q(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static i(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lk8;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-lez v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x2c

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v1}, Lk8;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static j(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lk8;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Lk8;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-lez v2, :cond_3

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {v1}, Lk8;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_5
    :goto_1
    const-string p0, ""

    .line 67
    .line 68
    return-object p0
.end method

.method public static k(Li8;)J
    .locals 11

    .line 1
    invoke-virtual {p0}, Li8;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/32 v1, 0xea60

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    invoke-static {p0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_8

    .line 19
    .line 20
    iget-object v0, p0, Li8;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    sget-wide v3, Lcom/mr/elaris/f;->h:J

    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    sub-long/2addr v3, v5

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    cmp-long v0, v3, v5

    .line 40
    .line 41
    if-lez v0, :cond_1

    .line 42
    .line 43
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_1
    invoke-static {p0}, Lcom/mr/elaris/f;->v(Li8;)Ljava/util/Calendar;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {p0}, Lcom/mr/elaris/f;->o(Li8;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const/4 v7, 0x1

    .line 65
    const/4 v8, 0x6

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0, v8, v7}, Ljava/util/Calendar;->add(II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    sub-long/2addr v5, v3

    .line 76
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    return-wide v0

    .line 81
    :cond_2
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    cmp-long p0, v3, v9

    .line 86
    .line 87
    if-ltz p0, :cond_7

    .line 88
    .line 89
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object v9, Lcom/mr/elaris/f;->e:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_3

    .line 100
    .line 101
    sput-object p0, Lcom/mr/elaris/f;->e:Ljava/lang/String;

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    sput v9, Lcom/mr/elaris/f;->f:I

    .line 105
    .line 106
    sput-wide v5, Lcom/mr/elaris/f;->g:J

    .line 107
    .line 108
    const-string v9, ""

    .line 109
    .line 110
    sput-object v9, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 111
    .line 112
    :cond_3
    sget-object v9, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_6

    .line 119
    .line 120
    sget p0, Lcom/mr/elaris/f;->f:I

    .line 121
    .line 122
    if-lt p0, v8, :cond_4

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    sget-wide v0, Lcom/mr/elaris/f;->g:J

    .line 126
    .line 127
    cmp-long p0, v0, v5

    .line 128
    .line 129
    if-lez p0, :cond_5

    .line 130
    .line 131
    sget-wide v0, Lcom/mr/elaris/f;->g:J

    .line 132
    .line 133
    const-wide/32 v7, 0x493e0

    .line 134
    .line 135
    .line 136
    add-long/2addr v0, v7

    .line 137
    sub-long/2addr v0, v3

    .line 138
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    return-wide v0

    .line 143
    :cond_5
    return-wide v5

    .line 144
    :cond_6
    :goto_0
    invoke-virtual {v0, v8, v7}, Ljava/util/Calendar;->add(II)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    sub-long/2addr v5, v3

    .line 152
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 153
    .line 154
    .line 155
    move-result-wide v0

    .line 156
    return-wide v0

    .line 157
    :cond_7
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 158
    .line 159
    .line 160
    move-result-wide v0

    .line 161
    sub-long/2addr v0, v3

    .line 162
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 163
    .line 164
    .line 165
    move-result-wide v0

    .line 166
    return-wide v0

    .line 167
    :cond_8
    :goto_1
    return-wide v1
.end method

.method public static l()Ljava/lang/String;
    .locals 14

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li8;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_9

    .line 10
    .line 11
    invoke-static {v0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_9

    .line 20
    .line 21
    iget-object v1, v0, Li8;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    iget-object v1, v0, Li8;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1}, Lcom/mr/elaris/f;->m(Ljava/lang/String;)[I

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    move v3, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    aget v3, v1, v2

    .line 43
    .line 44
    :goto_0
    const/4 v4, 0x1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    move v1, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    aget v1, v1, v4

    .line 50
    .line 51
    :goto_1
    invoke-static {v0}, Lcom/mr/elaris/f;->o(Li8;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v0}, Lcom/mr/elaris/f;->v(Li8;)Ljava/util/Calendar;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v7

    .line 63
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const/4 v9, 0x6

    .line 68
    const-wide/16 v10, 0x0

    .line 69
    .line 70
    if-nez v5, :cond_6

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    cmp-long v5, v7, v5

    .line 77
    .line 78
    if-ltz v5, :cond_6

    .line 79
    .line 80
    sget-wide v5, Lcom/mr/elaris/f;->h:J

    .line 81
    .line 82
    sub-long/2addr v5, v7

    .line 83
    cmp-long v5, v5, v10

    .line 84
    .line 85
    if-lez v5, :cond_3

    .line 86
    .line 87
    const-string v0, "\u7a0d\u540e\u8865\u53d1"

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    sget-wide v5, Lcom/mr/elaris/f;->g:J

    .line 91
    .line 92
    cmp-long v5, v5, v10

    .line 93
    .line 94
    if-lez v5, :cond_4

    .line 95
    .line 96
    sget-wide v5, Lcom/mr/elaris/f;->g:J

    .line 97
    .line 98
    const-wide/32 v12, 0x493e0

    .line 99
    .line 100
    .line 101
    add-long/2addr v5, v12

    .line 102
    sub-long/2addr v5, v7

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move-wide v5, v10

    .line 105
    :goto_2
    cmp-long v5, v5, v10

    .line 106
    .line 107
    if-lez v5, :cond_5

    .line 108
    .line 109
    const-string v0, "\u7a0d\u540e\u91cd\u8bd5"

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_5
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    sget-object v6, Lcom/mr/elaris/f;->d:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_6

    .line 123
    .line 124
    sget v5, Lcom/mr/elaris/f;->f:I

    .line 125
    .line 126
    if-ge v5, v9, :cond_6

    .line 127
    .line 128
    const-string v0, "\u7acb\u5373\u8865\u53d1"

    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_6
    invoke-static {v0}, Lcom/mr/elaris/f;->k(Li8;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v5

    .line 135
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    add-long/2addr v7, v5

    .line 148
    invoke-virtual {v0, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-ne v6, v7, :cond_7

    .line 164
    .line 165
    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-virtual {v5, v9}, Ljava/util/Calendar;->get(I)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-ne v0, v5, :cond_7

    .line 174
    .line 175
    move v2, v4

    .line 176
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    if-eqz v2, :cond_8

    .line 182
    .line 183
    const-string v2, "\u4eca\u5929 "

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    const-string v2, "\u660e\u5929 "

    .line 187
    .line 188
    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-static {v3}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v2, ":"

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, Lcom/mr/elaris/f;->C(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    return-object v0

    .line 215
    :catchall_0
    :cond_9
    :goto_4
    const-string v0, "\u7b49\u5f85\u914d\u7f6e"

    .line 216
    .line 217
    return-object v0
.end method

.method public static m(Ljava/lang/String;)[I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const v0, 0xff1a

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x3a

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string p0, "keep_fire_time"

    .line 24
    .line 25
    invoke-static {p0}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_1
    const-string v0, ":"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    array-length v0, p0

    .line 36
    const/4 v1, 0x2

    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    :try_start_0
    aget-object v0, p0, v0

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    aget-object p0, p0, v1

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ltz v0, :cond_4

    .line 63
    .line 64
    const/16 v1, 0x17

    .line 65
    .line 66
    if-gt v0, v1, :cond_4

    .line 67
    .line 68
    if-ltz p0, :cond_4

    .line 69
    .line 70
    const/16 v1, 0x3b

    .line 71
    .line 72
    if-le p0, v1, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    filled-new-array {v0, p0}, [I

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    return-object p0

    .line 80
    :catchall_0
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static n(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_16

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_0
    const/16 v2, 0xd

    .line 23
    .line 24
    const/16 v3, 0xa

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const v2, 0xff0c

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v4, 0x2c

    .line 38
    .line 39
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const v5, 0xff1b

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/16 v6, 0x3b

    .line 51
    .line 52
    invoke-virtual {v0, v6, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v3, "\\n+"

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    array-length v3, v0

    .line 63
    const/4 v7, 0x0

    .line 64
    move v8, v7

    .line 65
    :goto_0
    if-ge v8, v3, :cond_16

    .line 66
    .line 67
    aget-object v9, v0, v8

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    if-nez v11, :cond_2

    .line 83
    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_2
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 87
    .line 88
    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    const-string v12, "u:"

    .line 93
    .line 94
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    const/4 v13, 0x1

    .line 99
    const/16 v14, 0x3a

    .line 100
    .line 101
    const/4 v15, 0x2

    .line 102
    if-nez v12, :cond_6

    .line 103
    .line 104
    const-string v12, "friend:"

    .line 105
    .line 106
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-nez v12, :cond_6

    .line 111
    .line 112
    const-string v12, "c2c:"

    .line 113
    .line 114
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const-string v12, "g:"

    .line 122
    .line 123
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-nez v12, :cond_5

    .line 128
    .line 129
    const-string v12, "group:"

    .line 130
    .line 131
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-nez v12, :cond_5

    .line 136
    .line 137
    const-string v12, "troop:"

    .line 138
    .line 139
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_4

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    move v11, v7

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    :goto_1
    invoke-virtual {v9, v14}, Ljava/lang/String;->indexOf(I)I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    add-int/2addr v11, v13

    .line 153
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    move v11, v15

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    :goto_2
    invoke-virtual {v9, v14}, Ljava/lang/String;->indexOf(I)I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    add-int/2addr v11, v13

    .line 164
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    move v11, v13

    .line 169
    :goto_3
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    move v12, v7

    .line 174
    :goto_4
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-ge v12, v14, :cond_8

    .line 179
    .line 180
    invoke-virtual {v9, v12}, Ljava/lang/String;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    invoke-static {v14}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 185
    .line 186
    .line 187
    move-result v16

    .line 188
    if-nez v16, :cond_9

    .line 189
    .line 190
    if-eq v14, v4, :cond_9

    .line 191
    .line 192
    if-eq v14, v6, :cond_9

    .line 193
    .line 194
    if-eq v14, v2, :cond_9

    .line 195
    .line 196
    if-ne v14, v5, :cond_7

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_7
    add-int/lit8 v12, v12, 0x1

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_8
    const/4 v12, -0x1

    .line 203
    :cond_9
    :goto_5
    if-ltz v12, :cond_a

    .line 204
    .line 205
    invoke-virtual {v9, v7, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    :cond_a
    new-instance v12, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    move v14, v7

    .line 219
    :goto_6
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-ge v14, v2, :cond_10

    .line 224
    .line 225
    invoke-virtual {v9, v14}, Ljava/lang/String;->charAt(I)C

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    const/16 v4, 0x30

    .line 230
    .line 231
    if-lt v2, v4, :cond_b

    .line 232
    .line 233
    const/16 v4, 0x39

    .line 234
    .line 235
    if-le v2, v4, :cond_e

    .line 236
    .line 237
    :cond_b
    const/16 v4, 0x61

    .line 238
    .line 239
    if-lt v2, v4, :cond_c

    .line 240
    .line 241
    const/16 v4, 0x7a

    .line 242
    .line 243
    if-le v2, v4, :cond_e

    .line 244
    .line 245
    :cond_c
    const/16 v4, 0x41

    .line 246
    .line 247
    if-lt v2, v4, :cond_d

    .line 248
    .line 249
    const/16 v4, 0x5a

    .line 250
    .line 251
    if-le v2, v4, :cond_e

    .line 252
    .line 253
    :cond_d
    const/16 v4, 0x5f

    .line 254
    .line 255
    if-eq v2, v4, :cond_e

    .line 256
    .line 257
    const/16 v4, 0x2d

    .line 258
    .line 259
    if-ne v2, v4, :cond_f

    .line 260
    .line 261
    :cond_e
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    :cond_f
    add-int/lit8 v14, v14, 0x1

    .line 265
    .line 266
    const/16 v4, 0x2c

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_10
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-nez v4, :cond_11

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_11
    if-ne v11, v13, :cond_12

    .line 281
    .line 282
    invoke-static {v2}, Li5;->H0(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_14

    .line 287
    .line 288
    new-instance v10, Lk8;

    .line 289
    .line 290
    invoke-direct {v10, v2, v13}, Lk8;-><init>(Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_12
    if-ne v11, v15, :cond_13

    .line 295
    .line 296
    invoke-static {v2}, La7;->q(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-eqz v4, :cond_14

    .line 301
    .line 302
    new-instance v10, Lk8;

    .line 303
    .line 304
    invoke-direct {v10, v2, v15}, Lk8;-><init>(Ljava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_13
    invoke-static {v2}, La7;->q(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_14

    .line 313
    .line 314
    new-instance v10, Lk8;

    .line 315
    .line 316
    invoke-direct {v10, v2, v15}, Lk8;-><init>(Ljava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    :cond_14
    :goto_7
    if-eqz v10, :cond_15

    .line 320
    .line 321
    invoke-static {v1, v10}, Lcom/mr/elaris/f;->e(Ljava/util/ArrayList;Lk8;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-nez v2, :cond_15

    .line 326
    .line 327
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_15
    add-int/lit8 v8, v8, 0x1

    .line 331
    .line 332
    const v2, 0xff0c

    .line 333
    .line 334
    .line 335
    const/16 v4, 0x2c

    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_16
    :goto_8
    return-object v1
.end method

.method public static o(Li8;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {p0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lk8;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/mr/elaris/f;->g(Lk8;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    invoke-static {v0, v2}, Lcom/mr/elaris/f;->e(Ljava/util/ArrayList;Lk8;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-object v0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, p0, v1}, Lcom/mr/elaris/Prefs;->readString(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-object p0

    .line 21
    :catchall_0
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static q()Landroid/content/SharedPreferences;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lcom/mr/elaris/f;->b:Landroid/app/Application;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    if-nez v1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    const-string v2, "settings"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :catchall_0
    :goto_1
    return-object v0
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    :goto_0
    :try_start_0
    invoke-static {p0, v1}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :cond_1
    invoke-static {v1, p0, p1}, Lcom/mr/elaris/Prefs;->putString(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    const-string p0, "config_version"

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-interface {v1, p0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    :cond_2
    return-void
.end method

.method public static s()Lj8;
    .locals 5

    .line 1
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Li8;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0}, Li8;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lj8;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Li8;->f:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lj8;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    invoke-static {v0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    new-instance v0, Lj8;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    const-string v1, "\u672a\u9009\u62e9\u7eed\u706b\u5bf9\u8c61"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lj8;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    const/4 v1, 0x1

    .line 46
    invoke-static {v0, v2, v1, v1}, Lcom/mr/elaris/f;->x(Li8;Ljava/util/ArrayList;ZZ)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-lez v1, :cond_3

    .line 51
    .line 52
    invoke-static {v0}, Lcom/mr/elaris/f;->o(Li8;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    const-string v0, ""

    .line 69
    .line 70
    :cond_2
    const-string v3, "keep_fire_last_sent_day"

    .line 71
    .line 72
    invoke-static {v3, v0}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    new-instance v0, Lj8;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    if-lez v1, :cond_4

    .line 81
    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v4, "\u7eed\u706b\u5b8c\u6210\uff1a"

    .line 85
    .line 86
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, "/"

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    goto :goto_0

    .line 109
    :cond_4
    const-string v1, "\u7eed\u706b\u672a\u53d1\u9001\u6210\u529f\uff0c\u8bf7\u67e5\u770b\u65e5\u5fd7"

    .line 110
    .line 111
    :goto_0
    invoke-direct {v0, v1}, Lj8;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method

.method public static t(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "keep_fire_groups"

    .line 10
    .line 11
    invoke-static {p0}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {v1, p0}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v0, p0}, Lcom/mr/elaris/f;->c(Li8;Li8;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const-string p0, "keep_fire_last_sent_day"

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    invoke-static {p0, v0}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static u()V
    .locals 5

    .line 1
    const-string v0, "keep_fire_enabled"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v1, v0}, Lcom/mr/elaris/Prefs;->readBoolean(Landroid/content/SharedPreferences;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "keep-fire scheduler not started reason=disabled"

    .line 26
    .line 27
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Li8;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "keep-fire scheduler not started reason="

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Li8;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    sget-object v0, Lcom/mr/elaris/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "keep-fire scheduler already running, next="

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    new-instance v1, Ljava/lang/Thread;

    .line 90
    .line 91
    new-instance v3, Li0;

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    invoke-direct {v3, v0, v4}, Li0;-><init>(II)V

    .line 95
    .line 96
    .line 97
    const-string v0, "Elaris-KeepFire"

    .line 98
    .line 99
    invoke-direct {v1, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static v(Li8;)Ljava/util/Calendar;
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    iget v2, p0, Li8;->d:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    iget p0, p0, Li8;->e:I

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 17
    .line 18
    .line 19
    const/16 p0, 0xd

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, p0, v1}, Ljava/util/Calendar;->set(II)V

    .line 23
    .line 24
    .line 25
    const/16 p0, 0xe

    .line 26
    .line 27
    invoke-virtual {v0, p0, v1}, Ljava/util/Calendar;->set(II)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static w(I)Z
    .locals 2

    .line 1
    const-string v0, "keep_fire_enabled"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v1, v0}, Lcom/mr/elaris/Prefs;->readBoolean(Landroid/content/SharedPreferences;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static x(Li8;Ljava/util/ArrayList;ZZ)I
    .locals 10

    .line 1
    sget-object v0, Lcom/mr/elaris/f;->c:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/mr/elaris/f;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    :goto_0
    move-object v1, v0

    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-object v0, Lcom/mr/elaris/f;->b:Landroid/app/Application;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_1
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_3
    const-class v0, Lcom/mr/elaris/f;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :goto_2
    const/4 v0, 0x0

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    const-string p0, "keep-fire send failed reason=classLoader null"

    .line 44
    .line 45
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v0

    .line 49
    :cond_4
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_c

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v8, v2

    .line 68
    check-cast v8, Lk8;

    .line 69
    .line 70
    invoke-static {v8}, Lcom/mr/elaris/f;->h(Lk8;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    if-eqz p3, :cond_6

    .line 78
    .line 79
    const-string v2, ""

    .line 80
    .line 81
    invoke-static {v8, v2}, Lcom/mr/elaris/f;->y(Lk8;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    invoke-static {v8}, Lcom/mr/elaris/f;->g(Lk8;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_7
    :goto_4
    const/4 v9, 0x1

    .line 97
    if-eqz v8, :cond_8

    .line 98
    .line 99
    iget v2, v8, Lk8;->a:I

    .line 100
    .line 101
    if-ne v2, v9, :cond_8

    .line 102
    .line 103
    move v2, v9

    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/4 v2, 0x2

    .line 106
    :goto_5
    iget-object v3, v8, Lk8;->b:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v5, p0, Li8;->b:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz p2, :cond_9

    .line 111
    .line 112
    const-string v4, "keep-fire manual"

    .line 113
    .line 114
    :goto_6
    move-object v6, v4

    .line 115
    goto :goto_7

    .line 116
    :cond_9
    const-string v4, "keep-fire"

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :goto_7
    const-string v4, ""

    .line 120
    .line 121
    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/MessageRepeater;->sendPlainText(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v4, "keep-fire target result, manual="

    .line 128
    .line 129
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v4, ", type="

    .line 136
    .line 137
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget v4, v8, Lk8;->a:I

    .line 141
    .line 142
    if-ne v4, v9, :cond_a

    .line 143
    .line 144
    const-string v4, "\u597d\u53cb"

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_a
    const-string v4, "\u7fa4"

    .line 148
    .line 149
    :goto_8
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v4, ", id="

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    iget-object v4, v8, Lk8;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v4, ", sent="

    .line 163
    .line 164
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    if-eqz v2, :cond_b

    .line 178
    .line 179
    add-int/lit8 v0, v0, 0x1

    .line 180
    .line 181
    invoke-static {v8, v7}, Lcom/mr/elaris/f;->y(Lk8;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_b
    const-wide/16 v2, 0x384

    .line 185
    .line 186
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    .line 188
    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_3

    .line 199
    .line 200
    :cond_c
    return v0
.end method

.method public static y(Lk8;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->q()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lk8;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, "keep_fire_done_"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    const-string p1, ""

    .line 26
    .line 27
    :cond_0
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    :cond_1
    return-void
.end method

.method public static z()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Li8;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const-string v0, "\u672a\u9009\u62e9\u7eed\u706b\u5bf9\u8c61"

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lez v3, :cond_1

    .line 25
    .line 26
    const-string v3, "\u672a\u586b\u5199\u6d88\u606f"

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    const-string v3, "\u65f6\u95f4\u683c\u5f0f\u5e94\u4e3a HH:mm"

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x0

    .line 48
    move v4, v3

    .line 49
    move v5, v4

    .line 50
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Lk8;

    .line 61
    .line 62
    iget v6, v6, Lk8;->a:I

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    if-ne v6, v7, :cond_2

    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    if-lez v4, :cond_4

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v4, "\u7fa4"

    .line 84
    .line 85
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :cond_4
    if-lez v5, :cond_6

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-lez v4, :cond_5

    .line 95
    .line 96
    const/16 v4, 0x20

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, "\u53cb"

    .line 105
    .line 106
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_6
    const-string v4, " \u00b7 "

    .line 110
    .line 111
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lcom/mr/elaris/f;->D(Li8;)Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {}, Lcom/mr/elaris/f;->B()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :cond_7
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_8

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, Lk8;

    .line 137
    .line 138
    invoke-static {v5}, Lcom/mr/elaris/f;->g(Lk8;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_7

    .line 147
    .line 148
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_8
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, "/"

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0
.end method
