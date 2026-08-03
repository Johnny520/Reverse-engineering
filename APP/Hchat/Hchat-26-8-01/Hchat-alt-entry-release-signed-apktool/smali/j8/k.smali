.class public final synthetic Lj8/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lb5/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lb5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/k;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/k;->h:Lb5/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, v0

    .line 11
    :goto_0
    const-string v2, "toString"

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    const-string p1, "HchatMarsCdnCallback("

    .line 20
    .line 21
    const-string p2, ")"

    .line 22
    .line 23
    iget-object p3, p0, Lj8/k;->g:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1, p3, p2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    const-string v2, "hashCode"

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_2
    const-string v2, "equals"

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x1

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    if-eqz p3, :cond_3

    .line 59
    .line 60
    array-length p2, p3

    .line 61
    if-lez p2, :cond_3

    .line 62
    .line 63
    aget-object v4, p3, v5

    .line 64
    .line 65
    :cond_3
    if-ne p1, v4, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move v3, v5

    .line 69
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_5
    const-string p1, "onC2CDownloadCompleted"

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-object v2, p0, Lj8/k;->h:Lb5/c;

    .line 81
    .line 82
    const-wide/16 v6, 0x0

    .line 83
    .line 84
    if-eqz p1, :cond_e

    .line 85
    .line 86
    if-eqz p3, :cond_6

    .line 87
    .line 88
    array-length p1, p3

    .line 89
    if-le p1, v3, :cond_6

    .line 90
    .line 91
    aget-object p1, p3, v3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    move-object p1, v4

    .line 95
    :goto_2
    if-eqz p1, :cond_7

    .line 96
    .line 97
    const-string p3, "errorCode"

    .line 98
    .line 99
    invoke-static {p1, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    goto :goto_3

    .line 104
    :cond_7
    move-object p1, v4

    .line 105
    :goto_3
    instance-of p3, p1, Ljava/lang/Number;

    .line 106
    .line 107
    if-eqz p3, :cond_8

    .line 108
    .line 109
    check-cast p1, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    goto :goto_4

    .line 116
    :cond_8
    move p1, v5

    .line 117
    :goto_4
    if-nez p1, :cond_d

    .line 118
    .line 119
    iget-object p1, v2, Lb5/c;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 122
    .line 123
    iget-object p3, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p3, Lj8/l;

    .line 126
    .line 127
    if-eqz p3, :cond_10

    .line 128
    .line 129
    invoke-virtual {p1, v5, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_9

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    new-instance v1, Ljava/io/File;

    .line 137
    .line 138
    iget-object v3, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, Ljava/lang/String;

    .line 141
    .line 142
    if-eqz v3, :cond_a

    .line 143
    .line 144
    move-object v0, v3

    .line 145
    :cond_a
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_c

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    cmp-long v0, v8, v6

    .line 159
    .line 160
    if-gtz v0, :cond_b

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_b
    :try_start_0
    invoke-interface {p3, v1}, Lj8/l;->onSuccess(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_c
    :goto_5
    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 168
    .line 169
    .line 170
    const-string p1, "CDN\u4e0b\u8f7d\u5b8c\u6210\u4f46\u76ee\u6807\u6587\u4ef6\u672a\u843d\u76d8"

    .line 171
    .line 172
    invoke-virtual {v2, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_d
    new-instance p3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v0, "CDN\u4e0b\u8f7d\u5931\u8d25 errorCode="

    .line 179
    .line 180
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v2, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_e
    const-string p1, "onDownloadCanceled"

    .line 195
    .line 196
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_f

    .line 201
    .line 202
    const-string p1, "onCanceled"

    .line 203
    .line 204
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_10

    .line 209
    .line 210
    :cond_f
    const-string p1, "CDN\u4e0b\u8f7d\u5df2\u53d6\u6d88"

    .line 211
    .line 212
    invoke-virtual {v2, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :catchall_0
    :cond_10
    :goto_6
    if-eqz p2, :cond_11

    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    goto :goto_7

    .line 222
    :cond_11
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 223
    .line 224
    :goto_7
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 225
    .line 226
    if-ne p1, p2, :cond_12

    .line 227
    .line 228
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_12
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 232
    .line 233
    if-ne p1, p2, :cond_13

    .line 234
    .line 235
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    goto :goto_8

    .line 240
    :cond_13
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 241
    .line 242
    if-ne p1, p2, :cond_14

    .line 243
    .line 244
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    goto :goto_8

    .line 249
    :cond_14
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 250
    .line 251
    if-ne p1, p2, :cond_15

    .line 252
    .line 253
    const/4 p1, 0x0

    .line 254
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_8

    .line 259
    :cond_15
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 260
    .line 261
    if-ne p1, p2, :cond_16

    .line 262
    .line 263
    const-wide/16 p1, 0x0

    .line 264
    .line 265
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    :cond_16
    :goto_8
    return-object v4
.end method
