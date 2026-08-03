.class public final synthetic Lwa/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic g:Lwa/g;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lwa/g;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwa/d;->g:Lwa/g;

    .line 5
    .line 6
    iput-object p2, p0, Lwa/d;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lwa/d;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lwa/d;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwa/d;->k:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p1, p0, Lwa/d;->g:Lwa/g;

    .line 2
    .line 3
    iget-object v0, p1, Lwa/g;->c:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v1, "hashCode"

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lwa/d;->h:Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    const-string v1, "toString"

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    const-string v1, "equals"

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v3, 0x1

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    if-eqz p3, :cond_2

    .line 61
    .line 62
    array-length p1, p3

    .line 63
    if-lez p1, :cond_2

    .line 64
    .line 65
    aget-object v4, p3, v5

    .line 66
    .line 67
    :cond_2
    if-ne v2, v4, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move v3, v5

    .line 71
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4
    const-string v1, "onGYNetEnd"

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_c

    .line 87
    .line 88
    const-string v1, "resp|"

    .line 89
    .line 90
    sget-object v6, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    iget v7, p0, Lwa/d;->j:I

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    const-string v8, "protobuf_packet_enable"

    .line 101
    .line 102
    invoke-interface {v0, v8, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_6

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    const-string v8, "protobuf_packet_capture_response"

    .line 111
    .line 112
    invoke-interface {v0, v8, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    :cond_5
    invoke-virtual {p1, v7}, Lwa/g;->n(I)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    move v3, v5

    .line 126
    :goto_1
    if-eqz v6, :cond_7

    .line 127
    .line 128
    if-nez v3, :cond_7

    .line 129
    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_7
    if-eqz p3, :cond_8

    .line 133
    .line 134
    :try_start_0
    array-length v0, p3

    .line 135
    const/4 v8, 0x4

    .line 136
    if-le v0, v8, :cond_8

    .line 137
    .line 138
    aget-object v0, p3, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :catchall_0
    move-exception p1

    .line 142
    goto :goto_4

    .line 143
    :cond_8
    move-object v0, v4

    .line 144
    :goto_2
    if-nez v0, :cond_9

    .line 145
    .line 146
    iget-object v0, p0, Lwa/d;->k:Ljava/lang/Object;

    .line 147
    .line 148
    :cond_9
    :try_start_1
    const-string v8, "getRespObj"

    .line 149
    .line 150
    invoke-static {v0, v8}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {v8}, Lwa/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-static {v8}, Lwa/g;->u(Ljava/lang/Object;)[B

    .line 159
    .line 160
    .line 161
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    if-eqz v8, :cond_a

    .line 163
    .line 164
    move-object v4, v8

    .line 165
    goto :goto_3

    .line 166
    :catchall_1
    :cond_a
    :try_start_2
    const-string v8, "b"

    .line 167
    .line 168
    invoke-static {v0, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Lwa/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Lwa/g;->u(Ljava/lang/Object;)[B

    .line 177
    .line 178
    .line 179
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 180
    :catchall_2
    :goto_3
    if-eqz v4, :cond_c

    .line 181
    .line 182
    iget-object v0, p0, Lwa/d;->i:Ljava/lang/String;

    .line 183
    .line 184
    if-nez v6, :cond_b

    .line 185
    .line 186
    :try_start_3
    const-string v6, "response"

    .line 187
    .line 188
    invoke-static {v6, v0, v7, v4}, Lwa/g;->c(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 189
    .line 190
    .line 191
    :cond_b
    if-eqz v3, :cond_c

    .line 192
    .line 193
    new-instance v3, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, "|"

    .line 202
    .line 203
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p1, v1, v4}, Lwa/g;->t(Ljava/lang/String;[B)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_c

    .line 218
    .line 219
    const-string v1, "\u54cd\u5e94"

    .line 220
    .line 221
    invoke-virtual {p1, v1, v0, v7, v4}, Lwa/g;->q(Ljava/lang/String;Ljava/lang/String;I[B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v1, "\u54cd\u5e94\u6293\u5305\u5931\u8d25: "

    .line 228
    .line 229
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Lwa/g;->h(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_5
    if-nez p3, :cond_d

    .line 247
    .line 248
    new-array p3, v5, [Ljava/lang/Object;

    .line 249
    .line 250
    :cond_d
    invoke-static {p2, v2, p3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1
.end method
