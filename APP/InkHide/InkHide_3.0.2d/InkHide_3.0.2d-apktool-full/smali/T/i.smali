.class public final LT/i;
.super LT/y;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LT/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lb0/b;I)LT/o;
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/fragment/app/L;->d(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lb0/b;->t()V

    .line 19
    .line 20
    .line 21
    sget-object p0, LT/q;->a:LT/q;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-static {p1}, LL/d;->q(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "Unexpected token: "

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    new-instance p1, LT/s;

    .line 41
    .line 42
    invoke-virtual {p0}, Lb0/b;->n()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {p1, p0}, LT/s;-><init>(Ljava/lang/Boolean;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    invoke-virtual {p0}, Lb0/b;->v()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, LT/s;

    .line 59
    .line 60
    new-instance v0, LV/j;

    .line 61
    .line 62
    invoke-direct {v0, p0}, LV/j;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, LT/s;-><init>(Ljava/lang/Number;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    new-instance p1, LT/s;

    .line 70
    .line 71
    invoke-virtual {p0}, Lb0/b;->v()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {p1, p0}, LT/s;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p1
.end method

.method public static d(Lb0/c;LT/o;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    instance-of v0, p1, LT/q;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, LT/s;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p1, LT/s;

    .line 16
    .line 17
    iget-object v0, p1, LT/s;->a:Ljava/io/Serializable;

    .line 18
    .line 19
    instance-of v1, v0, Ljava/lang/Number;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LT/s;->c()Ljava/lang/Number;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, LT/s;->b()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0, p1}, Lb0/c;->q(Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-virtual {p1}, LT/s;->d()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lb0/c;->p(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "Not a JSON Primitive: "

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_4
    instance-of v0, p1, LT/n;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    invoke-virtual {p0}, Lb0/c;->b()V

    .line 76
    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    check-cast p1, LT/n;

    .line 81
    .line 82
    iget-object p1, p1, LT/n;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, LT/o;

    .line 99
    .line 100
    invoke-static {p0, v0}, LT/i;->d(Lb0/c;LT/o;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {p0}, Lb0/c;->e()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, "Not a JSON Array: "

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0

    .line 128
    :cond_7
    instance-of v0, p1, LT/r;

    .line 129
    .line 130
    if-eqz v0, :cond_a

    .line 131
    .line 132
    invoke-virtual {p0}, Lb0/c;->c()V

    .line 133
    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    check-cast p1, LT/r;

    .line 138
    .line 139
    iget-object p1, p1, LT/r;->a:LV/o;

    .line 140
    .line 141
    invoke-virtual {p1}, LV/o;->entrySet()Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, LV/m;

    .line 146
    .line 147
    invoke-virtual {p1}, LV/m;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_1
    move-object v0, p1

    .line 152
    check-cast v0, LV/l;

    .line 153
    .line 154
    invoke-virtual {v0}, LV/l;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    move-object v0, p1

    .line 161
    check-cast v0, LV/l;

    .line 162
    .line 163
    invoke-virtual {v0}, LV/l;->b()LV/n;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Lb0/c;->g(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, LT/o;

    .line 181
    .line 182
    invoke-static {p0, v0}, LT/i;->d(Lb0/c;LT/o;)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    invoke-virtual {p0}, Lb0/c;->f()V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, "Not a JSON Object: "

    .line 195
    .line 196
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0

    .line 210
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 211
    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v1, "Couldn\'t write "

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p0

    .line 234
    :cond_b
    :goto_2
    invoke-virtual {p0}, Lb0/c;->i()Lb0/c;

    .line 235
    .line 236
    .line 237
    return-void
.end method


# virtual methods
.method public final a(Lb0/b;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LT/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lb0/b;->p()I

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
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :goto_0
    return-object p1

    .line 28
    :catch_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, LT/p;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0x9

    .line 41
    .line 42
    if-ne v0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lb0/b;->p()I

    .line 50
    .line 51
    .line 52
    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    const v1, 0xffff

    .line 54
    .line 55
    .line 56
    if-gt v0, v1, :cond_2

    .line 57
    .line 58
    const/16 v1, -0x8000

    .line 59
    .line 60
    if-lt v0, v1, :cond_2

    .line 61
    .line 62
    int-to-short p1, v0

    .line 63
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_1
    return-object p1

    .line 68
    :cond_2
    new-instance v1, LT/p;

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v3, "Lossy conversion from "

    .line 73
    .line 74
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, " to short; at path "

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :catch_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    new-instance v0, LT/p;

    .line 103
    .line 104
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :pswitch_1
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/16 v1, 0x9

    .line 113
    .line 114
    if-ne v0, v1, :cond_3

    .line 115
    .line 116
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x0

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Lb0/b;->p()I

    .line 122
    .line 123
    .line 124
    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 125
    const/16 v1, 0xff

    .line 126
    .line 127
    if-gt v0, v1, :cond_4

    .line 128
    .line 129
    const/16 v1, -0x80

    .line 130
    .line 131
    if-lt v0, v1, :cond_4

    .line 132
    .line 133
    int-to-byte p1, v0

    .line 134
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_2
    return-object p1

    .line 139
    :cond_4
    new-instance v1, LT/p;

    .line 140
    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v3, "Lossy conversion from "

    .line 144
    .line 145
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v0, " to byte; at path "

    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v1

    .line 171
    :catch_2
    move-exception v0

    .line 172
    move-object p1, v0

    .line 173
    new-instance v0, LT/p;

    .line 174
    .line 175
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :pswitch_2
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    const/16 v1, 0x9

    .line 184
    .line 185
    if-ne v0, v1, :cond_5

    .line 186
    .line 187
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x0

    .line 191
    goto :goto_3

    .line 192
    :cond_5
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :goto_3
    return-object p1

    .line 201
    :pswitch_3
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const/16 v1, 0x9

    .line 206
    .line 207
    if-ne v0, v1, :cond_6

    .line 208
    .line 209
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 210
    .line 211
    .line 212
    const/4 p1, 0x0

    .line 213
    goto :goto_4

    .line 214
    :cond_6
    const/4 v1, 0x6

    .line 215
    if-ne v0, v1, :cond_7

    .line 216
    .line 217
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    goto :goto_4

    .line 230
    :cond_7
    invoke-virtual {p1}, Lb0/b;->n()Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    :goto_4
    return-object p1

    .line 239
    :pswitch_4
    new-instance v0, Ljava/util/BitSet;

    .line 240
    .line 241
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    const/4 v2, 0x0

    .line 252
    move v3, v2

    .line 253
    :goto_5
    const/4 v4, 0x2

    .line 254
    if-eq v1, v4, :cond_d

    .line 255
    .line 256
    invoke-static {v1}, Landroidx/fragment/app/L;->d(I)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    const/4 v5, 0x5

    .line 261
    if-eq v4, v5, :cond_9

    .line 262
    .line 263
    const/4 v5, 0x6

    .line 264
    if-eq v4, v5, :cond_9

    .line 265
    .line 266
    const/4 v5, 0x7

    .line 267
    if-ne v4, v5, :cond_8

    .line 268
    .line 269
    invoke-virtual {p1}, Lb0/b;->n()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    goto :goto_6

    .line 274
    :cond_8
    new-instance v0, LT/p;

    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    const-string v3, "Invalid bitset value type: "

    .line 279
    .line 280
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v1}, LL/d;->q(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v1, "; at path "

    .line 291
    .line 292
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Lb0/b;->h()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :cond_9
    invoke-virtual {p1}, Lb0/b;->p()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-nez v1, :cond_a

    .line 315
    .line 316
    move v1, v2

    .line 317
    goto :goto_6

    .line 318
    :cond_a
    const/4 v4, 0x1

    .line 319
    if-ne v1, v4, :cond_c

    .line 320
    .line 321
    move v1, v4

    .line 322
    :goto_6
    if-eqz v1, :cond_b

    .line 323
    .line 324
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    .line 325
    .line 326
    .line 327
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 328
    .line 329
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    goto :goto_5

    .line 334
    :cond_c
    new-instance v0, LT/p;

    .line 335
    .line 336
    new-instance v2, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v3, "Invalid bitset value "

    .line 339
    .line 340
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v1, ", expected 0 or 1; at path "

    .line 347
    .line 348
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_d
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_5
    instance-of v0, p1, LW/h;

    .line 371
    .line 372
    const/4 v1, 0x2

    .line 373
    if-eqz v0, :cond_f

    .line 374
    .line 375
    check-cast p1, LW/h;

    .line 376
    .line 377
    invoke-virtual {p1}, LW/h;->x()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    const/4 v2, 0x5

    .line 382
    if-eq v0, v2, :cond_e

    .line 383
    .line 384
    if-eq v0, v1, :cond_e

    .line 385
    .line 386
    const/4 v1, 0x4

    .line 387
    if-eq v0, v1, :cond_e

    .line 388
    .line 389
    const/16 v1, 0xa

    .line 390
    .line 391
    if-eq v0, v1, :cond_e

    .line 392
    .line 393
    invoke-virtual {p1}, LW/h;->J()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, LT/o;

    .line 398
    .line 399
    invoke-virtual {p1}, LW/h;->D()V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_e

    .line 403
    .line 404
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 405
    .line 406
    new-instance v1, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    const-string v2, "Unexpected "

    .line 409
    .line 410
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-static {v0}, LL/d;->q(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const-string v0, " when reading a JsonElement."

    .line 421
    .line 422
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw p1

    .line 433
    :cond_f
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    invoke-static {v0}, Landroidx/fragment/app/L;->d(I)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    const/4 v3, 0x0

    .line 442
    if-eqz v2, :cond_11

    .line 443
    .line 444
    if-eq v2, v1, :cond_10

    .line 445
    .line 446
    move-object v2, v3

    .line 447
    goto :goto_7

    .line 448
    :cond_10
    invoke-virtual {p1}, Lb0/b;->b()V

    .line 449
    .line 450
    .line 451
    new-instance v2, LT/r;

    .line 452
    .line 453
    invoke-direct {v2}, LT/r;-><init>()V

    .line 454
    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_11
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 458
    .line 459
    .line 460
    new-instance v2, LT/n;

    .line 461
    .line 462
    invoke-direct {v2}, LT/n;-><init>()V

    .line 463
    .line 464
    .line 465
    :goto_7
    if-nez v2, :cond_12

    .line 466
    .line 467
    invoke-static {p1, v0}, LT/i;->c(Lb0/b;I)LT/o;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    goto/16 :goto_e

    .line 472
    .line 473
    :cond_12
    new-instance v0, Ljava/util/ArrayDeque;

    .line 474
    .line 475
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 476
    .line 477
    .line 478
    :cond_13
    :goto_8
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    if-eqz v4, :cond_1a

    .line 483
    .line 484
    instance-of v4, v2, LT/r;

    .line 485
    .line 486
    if-eqz v4, :cond_14

    .line 487
    .line 488
    invoke-virtual {p1}, Lb0/b;->r()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    goto :goto_9

    .line 493
    :cond_14
    move-object v4, v3

    .line 494
    :goto_9
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    invoke-static {v5}, Landroidx/fragment/app/L;->d(I)I

    .line 499
    .line 500
    .line 501
    move-result v6

    .line 502
    if-eqz v6, :cond_16

    .line 503
    .line 504
    if-eq v6, v1, :cond_15

    .line 505
    .line 506
    move-object v6, v3

    .line 507
    goto :goto_a

    .line 508
    :cond_15
    invoke-virtual {p1}, Lb0/b;->b()V

    .line 509
    .line 510
    .line 511
    new-instance v6, LT/r;

    .line 512
    .line 513
    invoke-direct {v6}, LT/r;-><init>()V

    .line 514
    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_16
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 518
    .line 519
    .line 520
    new-instance v6, LT/n;

    .line 521
    .line 522
    invoke-direct {v6}, LT/n;-><init>()V

    .line 523
    .line 524
    .line 525
    :goto_a
    if-eqz v6, :cond_17

    .line 526
    .line 527
    const/4 v7, 0x1

    .line 528
    goto :goto_b

    .line 529
    :cond_17
    const/4 v7, 0x0

    .line 530
    :goto_b
    if-nez v6, :cond_18

    .line 531
    .line 532
    invoke-static {p1, v5}, LT/i;->c(Lb0/b;I)LT/o;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    :cond_18
    instance-of v5, v2, LT/n;

    .line 537
    .line 538
    if-eqz v5, :cond_19

    .line 539
    .line 540
    move-object v4, v2

    .line 541
    check-cast v4, LT/n;

    .line 542
    .line 543
    iget-object v4, v4, LT/n;->a:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    goto :goto_c

    .line 549
    :cond_19
    move-object v5, v2

    .line 550
    check-cast v5, LT/r;

    .line 551
    .line 552
    iget-object v5, v5, LT/r;->a:LV/o;

    .line 553
    .line 554
    invoke-virtual {v5, v4, v6}, LV/o;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    :goto_c
    if-eqz v7, :cond_13

    .line 558
    .line 559
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    move-object v2, v6

    .line 563
    goto :goto_8

    .line 564
    :cond_1a
    instance-of v4, v2, LT/n;

    .line 565
    .line 566
    if-eqz v4, :cond_1b

    .line 567
    .line 568
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 569
    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_1b
    invoke-virtual {p1}, Lb0/b;->f()V

    .line 573
    .line 574
    .line 575
    :goto_d
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    if-eqz v4, :cond_1c

    .line 580
    .line 581
    move-object v0, v2

    .line 582
    :goto_e
    return-object v0

    .line 583
    :cond_1c
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    check-cast v2, LT/o;

    .line 588
    .line 589
    goto :goto_8

    .line 590
    :pswitch_6
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    const/16 v1, 0x9

    .line 595
    .line 596
    const/4 v2, 0x0

    .line 597
    if-ne v0, v1, :cond_1d

    .line 598
    .line 599
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 600
    .line 601
    .line 602
    goto :goto_11

    .line 603
    :cond_1d
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    new-instance v0, Ljava/util/StringTokenizer;

    .line 608
    .line 609
    const-string v1, "_"

    .line 610
    .line 611
    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    if-eqz p1, :cond_1e

    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    goto :goto_f

    .line 625
    :cond_1e
    move-object p1, v2

    .line 626
    :goto_f
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-eqz v1, :cond_1f

    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    goto :goto_10

    .line 637
    :cond_1f
    move-object v1, v2

    .line 638
    :goto_10
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-eqz v3, :cond_20

    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    :cond_20
    if-nez v1, :cond_21

    .line 649
    .line 650
    if-nez v2, :cond_21

    .line 651
    .line 652
    new-instance v2, Ljava/util/Locale;

    .line 653
    .line 654
    invoke-direct {v2, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    goto :goto_11

    .line 658
    :cond_21
    if-nez v2, :cond_22

    .line 659
    .line 660
    new-instance v2, Ljava/util/Locale;

    .line 661
    .line 662
    invoke-direct {v2, p1, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    goto :goto_11

    .line 666
    :cond_22
    new-instance v0, Ljava/util/Locale;

    .line 667
    .line 668
    invoke-direct {v0, p1, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    move-object v2, v0

    .line 672
    :goto_11
    return-object v2

    .line 673
    :pswitch_7
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    const/16 v1, 0x9

    .line 678
    .line 679
    if-ne v0, v1, :cond_23

    .line 680
    .line 681
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 682
    .line 683
    .line 684
    const/4 p1, 0x0

    .line 685
    goto/16 :goto_13

    .line 686
    .line 687
    :cond_23
    invoke-virtual {p1}, Lb0/b;->b()V

    .line 688
    .line 689
    .line 690
    const/4 v0, 0x0

    .line 691
    move v2, v0

    .line 692
    move v3, v2

    .line 693
    move v4, v3

    .line 694
    move v5, v4

    .line 695
    move v6, v5

    .line 696
    move v7, v6

    .line 697
    :cond_24
    :goto_12
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    const/4 v1, 0x4

    .line 702
    if-eq v0, v1, :cond_2a

    .line 703
    .line 704
    invoke-virtual {p1}, Lb0/b;->r()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-virtual {p1}, Lb0/b;->p()I

    .line 709
    .line 710
    .line 711
    move-result v1

    .line 712
    const-string v8, "year"

    .line 713
    .line 714
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v8

    .line 718
    if-eqz v8, :cond_25

    .line 719
    .line 720
    move v2, v1

    .line 721
    goto :goto_12

    .line 722
    :cond_25
    const-string v8, "month"

    .line 723
    .line 724
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    if-eqz v8, :cond_26

    .line 729
    .line 730
    move v3, v1

    .line 731
    goto :goto_12

    .line 732
    :cond_26
    const-string v8, "dayOfMonth"

    .line 733
    .line 734
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result v8

    .line 738
    if-eqz v8, :cond_27

    .line 739
    .line 740
    move v4, v1

    .line 741
    goto :goto_12

    .line 742
    :cond_27
    const-string v8, "hourOfDay"

    .line 743
    .line 744
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v8

    .line 748
    if-eqz v8, :cond_28

    .line 749
    .line 750
    move v5, v1

    .line 751
    goto :goto_12

    .line 752
    :cond_28
    const-string v8, "minute"

    .line 753
    .line 754
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v8

    .line 758
    if-eqz v8, :cond_29

    .line 759
    .line 760
    move v6, v1

    .line 761
    goto :goto_12

    .line 762
    :cond_29
    const-string v8, "second"

    .line 763
    .line 764
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    if-eqz v0, :cond_24

    .line 769
    .line 770
    move v7, v1

    .line 771
    goto :goto_12

    .line 772
    :cond_2a
    invoke-virtual {p1}, Lb0/b;->f()V

    .line 773
    .line 774
    .line 775
    new-instance v1, Ljava/util/GregorianCalendar;

    .line 776
    .line 777
    invoke-direct/range {v1 .. v7}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 778
    .line 779
    .line 780
    move-object p1, v1

    .line 781
    :goto_13
    return-object p1

    .line 782
    :pswitch_8
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    :try_start_3
    invoke-static {v1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 787
    .line 788
    .line 789
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 790
    return-object p1

    .line 791
    :catch_3
    move-exception v0

    .line 792
    new-instance v2, LT/p;

    .line 793
    .line 794
    const-string v3, "Failed parsing \'"

    .line 795
    .line 796
    const-string v4, "\' as Currency; at path "

    .line 797
    .line 798
    invoke-static {v3, v1, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object p1

    .line 806
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 814
    .line 815
    .line 816
    throw v2

    .line 817
    :pswitch_9
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    const/16 v1, 0x9

    .line 822
    .line 823
    if-ne v0, v1, :cond_2b

    .line 824
    .line 825
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 826
    .line 827
    .line 828
    const/4 p1, 0x0

    .line 829
    goto :goto_14

    .line 830
    :cond_2b
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    :try_start_4
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 835
    .line 836
    .line 837
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 838
    :goto_14
    return-object p1

    .line 839
    :catch_4
    move-exception v0

    .line 840
    new-instance v2, LT/p;

    .line 841
    .line 842
    const-string v3, "Failed parsing \'"

    .line 843
    .line 844
    const-string v4, "\' as UUID; at path "

    .line 845
    .line 846
    invoke-static {v3, v1, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object p1

    .line 854
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object p1

    .line 861
    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 862
    .line 863
    .line 864
    throw v2

    .line 865
    :pswitch_a
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    const/16 v1, 0x9

    .line 870
    .line 871
    if-ne v0, v1, :cond_2c

    .line 872
    .line 873
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 874
    .line 875
    .line 876
    const/4 p1, 0x0

    .line 877
    goto :goto_15

    .line 878
    :cond_2c
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object p1

    .line 882
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 883
    .line 884
    .line 885
    move-result-object p1

    .line 886
    :goto_15
    return-object p1

    .line 887
    :pswitch_b
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    const/16 v1, 0x9

    .line 892
    .line 893
    const/4 v2, 0x0

    .line 894
    if-ne v0, v1, :cond_2d

    .line 895
    .line 896
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 897
    .line 898
    .line 899
    goto :goto_16

    .line 900
    :cond_2d
    :try_start_5
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object p1

    .line 904
    const-string v0, "null"

    .line 905
    .line 906
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    if-eqz v0, :cond_2e

    .line 911
    .line 912
    goto :goto_16

    .line 913
    :cond_2e
    new-instance v2, Ljava/net/URI;

    .line 914
    .line 915
    invoke-direct {v2, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_5

    .line 916
    .line 917
    .line 918
    :goto_16
    return-object v2

    .line 919
    :catch_5
    move-exception v0

    .line 920
    move-object p1, v0

    .line 921
    new-instance v0, LT/p;

    .line 922
    .line 923
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 924
    .line 925
    .line 926
    throw v0

    .line 927
    :pswitch_c
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    const/16 v1, 0x9

    .line 932
    .line 933
    const/4 v2, 0x0

    .line 934
    if-ne v0, v1, :cond_2f

    .line 935
    .line 936
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 937
    .line 938
    .line 939
    goto :goto_17

    .line 940
    :cond_2f
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object p1

    .line 944
    const-string v0, "null"

    .line 945
    .line 946
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    if-eqz v0, :cond_30

    .line 951
    .line 952
    goto :goto_17

    .line 953
    :cond_30
    new-instance v2, Ljava/net/URL;

    .line 954
    .line 955
    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    :goto_17
    return-object v2

    .line 959
    :pswitch_d
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    const/16 v1, 0x9

    .line 964
    .line 965
    if-ne v0, v1, :cond_31

    .line 966
    .line 967
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 968
    .line 969
    .line 970
    const/4 p1, 0x0

    .line 971
    goto :goto_18

    .line 972
    :cond_31
    new-instance v0, Ljava/lang/StringBuffer;

    .line 973
    .line 974
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object p1

    .line 978
    invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    move-object p1, v0

    .line 982
    :goto_18
    return-object p1

    .line 983
    :pswitch_e
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 984
    .line 985
    const-string v0, "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?"

    .line 986
    .line 987
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    throw p1

    .line 991
    :pswitch_f
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    const/16 v1, 0x9

    .line 996
    .line 997
    if-ne v0, v1, :cond_32

    .line 998
    .line 999
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1000
    .line 1001
    .line 1002
    const/4 p1, 0x0

    .line 1003
    goto :goto_19

    .line 1004
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object p1

    .line 1010
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    move-object p1, v0

    .line 1014
    :goto_19
    return-object p1

    .line 1015
    :pswitch_10
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1016
    .line 1017
    .line 1018
    move-result v0

    .line 1019
    const/16 v1, 0x9

    .line 1020
    .line 1021
    if-ne v0, v1, :cond_33

    .line 1022
    .line 1023
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1024
    .line 1025
    .line 1026
    const/4 p1, 0x0

    .line 1027
    goto :goto_1a

    .line 1028
    :cond_33
    new-instance v0, LV/j;

    .line 1029
    .line 1030
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object p1

    .line 1034
    invoke-direct {v0, p1}, LV/j;-><init>(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    move-object p1, v0

    .line 1038
    :goto_1a
    return-object p1

    .line 1039
    :pswitch_11
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    const/16 v1, 0x9

    .line 1044
    .line 1045
    if-ne v0, v1, :cond_34

    .line 1046
    .line 1047
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1048
    .line 1049
    .line 1050
    const/4 p1, 0x0

    .line 1051
    goto :goto_1b

    .line 1052
    :cond_34
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    :try_start_6
    new-instance v0, Ljava/math/BigInteger;

    .line 1057
    .line 1058
    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1059
    .line 1060
    .line 1061
    move-object p1, v0

    .line 1062
    :goto_1b
    return-object p1

    .line 1063
    :catch_6
    move-exception v0

    .line 1064
    new-instance v2, LT/p;

    .line 1065
    .line 1066
    const-string v3, "Failed parsing \'"

    .line 1067
    .line 1068
    const-string v4, "\' as BigInteger; at path "

    .line 1069
    .line 1070
    invoke-static {v3, v1, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p1

    .line 1078
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object p1

    .line 1085
    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1086
    .line 1087
    .line 1088
    throw v2

    .line 1089
    :pswitch_12
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    const/16 v1, 0x9

    .line 1094
    .line 1095
    if-ne v0, v1, :cond_35

    .line 1096
    .line 1097
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1098
    .line 1099
    .line 1100
    const/4 p1, 0x0

    .line 1101
    goto :goto_1c

    .line 1102
    :cond_35
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    :try_start_7
    new-instance v0, Ljava/math/BigDecimal;

    .line 1107
    .line 1108
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1109
    .line 1110
    .line 1111
    move-object p1, v0

    .line 1112
    :goto_1c
    return-object p1

    .line 1113
    :catch_7
    move-exception v0

    .line 1114
    new-instance v2, LT/p;

    .line 1115
    .line 1116
    const-string v3, "Failed parsing \'"

    .line 1117
    .line 1118
    const-string v4, "\' as BigDecimal; at path "

    .line 1119
    .line 1120
    invoke-static {v3, v1, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object p1

    .line 1128
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object p1

    .line 1135
    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1136
    .line 1137
    .line 1138
    throw v2

    .line 1139
    :pswitch_13
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1140
    .line 1141
    .line 1142
    move-result v0

    .line 1143
    const/16 v1, 0x9

    .line 1144
    .line 1145
    if-ne v0, v1, :cond_36

    .line 1146
    .line 1147
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1148
    .line 1149
    .line 1150
    const/4 p1, 0x0

    .line 1151
    goto :goto_1d

    .line 1152
    :cond_36
    const/16 v1, 0x8

    .line 1153
    .line 1154
    if-ne v0, v1, :cond_37

    .line 1155
    .line 1156
    invoke-virtual {p1}, Lb0/b;->n()Z

    .line 1157
    .line 1158
    .line 1159
    move-result p1

    .line 1160
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object p1

    .line 1164
    goto :goto_1d

    .line 1165
    :cond_37
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object p1

    .line 1169
    :goto_1d
    return-object p1

    .line 1170
    :pswitch_14
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    const/16 v1, 0x9

    .line 1175
    .line 1176
    if-ne v0, v1, :cond_38

    .line 1177
    .line 1178
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1179
    .line 1180
    .line 1181
    const/4 p1, 0x0

    .line 1182
    goto :goto_1e

    .line 1183
    :cond_38
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1188
    .line 1189
    .line 1190
    move-result v1

    .line 1191
    const/4 v2, 0x1

    .line 1192
    if-ne v1, v2, :cond_39

    .line 1193
    .line 1194
    const/4 p1, 0x0

    .line 1195
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 1196
    .line 1197
    .line 1198
    move-result p1

    .line 1199
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 1200
    .line 1201
    .line 1202
    move-result-object p1

    .line 1203
    :goto_1e
    return-object p1

    .line 1204
    :cond_39
    new-instance v1, LT/p;

    .line 1205
    .line 1206
    const-string v2, "Expecting character, got: "

    .line 1207
    .line 1208
    const-string v3, "; at "

    .line 1209
    .line 1210
    invoke-static {v2, v0, v3}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object p1

    .line 1218
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object p1

    .line 1225
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    throw v1

    .line 1229
    :pswitch_15
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    const/16 v1, 0x9

    .line 1234
    .line 1235
    if-ne v0, v1, :cond_3a

    .line 1236
    .line 1237
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1238
    .line 1239
    .line 1240
    const/4 p1, 0x0

    .line 1241
    goto :goto_1f

    .line 1242
    :cond_3a
    invoke-virtual {p1}, Lb0/b;->o()D

    .line 1243
    .line 1244
    .line 1245
    move-result-wide v0

    .line 1246
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p1

    .line 1250
    :goto_1f
    return-object p1

    .line 1251
    :pswitch_16
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1252
    .line 1253
    .line 1254
    move-result v0

    .line 1255
    const/16 v1, 0x9

    .line 1256
    .line 1257
    if-ne v0, v1, :cond_3b

    .line 1258
    .line 1259
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1260
    .line 1261
    .line 1262
    const/4 p1, 0x0

    .line 1263
    goto :goto_20

    .line 1264
    :cond_3b
    invoke-virtual {p1}, Lb0/b;->o()D

    .line 1265
    .line 1266
    .line 1267
    move-result-wide v0

    .line 1268
    double-to-float p1, v0

    .line 1269
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1270
    .line 1271
    .line 1272
    move-result-object p1

    .line 1273
    :goto_20
    return-object p1

    .line 1274
    :pswitch_17
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1275
    .line 1276
    .line 1277
    move-result v0

    .line 1278
    const/16 v1, 0x9

    .line 1279
    .line 1280
    if-ne v0, v1, :cond_3c

    .line 1281
    .line 1282
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1283
    .line 1284
    .line 1285
    const/4 p1, 0x0

    .line 1286
    goto :goto_21

    .line 1287
    :cond_3c
    :try_start_8
    invoke-virtual {p1}, Lb0/b;->q()J

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v0

    .line 1291
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1292
    .line 1293
    .line 1294
    move-result-object p1
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1295
    :goto_21
    return-object p1

    .line 1296
    :catch_8
    move-exception v0

    .line 1297
    move-object p1, v0

    .line 1298
    new-instance v0, LT/p;

    .line 1299
    .line 1300
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1301
    .line 1302
    .line 1303
    throw v0

    .line 1304
    :pswitch_18
    new-instance v0, Ljava/util/ArrayList;

    .line 1305
    .line 1306
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 1310
    .line 1311
    .line 1312
    :goto_22
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v1

    .line 1316
    if-eqz v1, :cond_3d

    .line 1317
    .line 1318
    :try_start_9
    invoke-virtual {p1}, Lb0/b;->p()I

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1327
    .line 1328
    .line 1329
    goto :goto_22

    .line 1330
    :catch_9
    move-exception v0

    .line 1331
    move-object p1, v0

    .line 1332
    new-instance v0, LT/p;

    .line 1333
    .line 1334
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1335
    .line 1336
    .line 1337
    throw v0

    .line 1338
    :cond_3d
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1342
    .line 1343
    .line 1344
    move-result p1

    .line 1345
    new-instance v1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 1346
    .line 1347
    invoke-direct {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    .line 1348
    .line 1349
    .line 1350
    const/4 v2, 0x0

    .line 1351
    :goto_23
    if-ge v2, p1, :cond_3e

    .line 1352
    .line 1353
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    check-cast v3, Ljava/lang/Integer;

    .line 1358
    .line 1359
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    .line 1364
    .line 1365
    .line 1366
    add-int/lit8 v2, v2, 0x1

    .line 1367
    .line 1368
    goto :goto_23

    .line 1369
    :cond_3e
    return-object v1

    .line 1370
    :pswitch_19
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1371
    .line 1372
    .line 1373
    move-result v0

    .line 1374
    const/16 v1, 0x9

    .line 1375
    .line 1376
    if-ne v0, v1, :cond_3f

    .line 1377
    .line 1378
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1379
    .line 1380
    .line 1381
    const/4 p1, 0x0

    .line 1382
    goto :goto_24

    .line 1383
    :cond_3f
    invoke-virtual {p1}, Lb0/b;->q()J

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v0

    .line 1387
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1388
    .line 1389
    .line 1390
    move-result-object p1

    .line 1391
    :goto_24
    return-object p1

    .line 1392
    :pswitch_1a
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    const/16 v1, 0x9

    .line 1397
    .line 1398
    if-ne v0, v1, :cond_40

    .line 1399
    .line 1400
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1401
    .line 1402
    .line 1403
    const/4 p1, 0x0

    .line 1404
    goto :goto_25

    .line 1405
    :cond_40
    invoke-virtual {p1}, Lb0/b;->o()D

    .line 1406
    .line 1407
    .line 1408
    move-result-wide v0

    .line 1409
    double-to-float p1, v0

    .line 1410
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1411
    .line 1412
    .line 1413
    move-result-object p1

    .line 1414
    :goto_25
    return-object p1

    .line 1415
    :pswitch_1b
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 1416
    .line 1417
    .line 1418
    move-result v0

    .line 1419
    const/16 v1, 0x9

    .line 1420
    .line 1421
    if-ne v0, v1, :cond_41

    .line 1422
    .line 1423
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 1424
    .line 1425
    .line 1426
    const/4 p1, 0x0

    .line 1427
    goto :goto_26

    .line 1428
    :cond_41
    invoke-virtual {p1}, Lb0/b;->o()D

    .line 1429
    .line 1430
    .line 1431
    move-result-wide v0

    .line 1432
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1433
    .line 1434
    .line 1435
    move-result-object p1

    .line 1436
    :goto_26
    return-object p1

    .line 1437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lb0/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LT/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/Number;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    int-to-long v0, p2

    .line 19
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    int-to-long v0, p2

    .line 36
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 37
    .line 38
    .line 39
    :goto_1
    return-void

    .line 40
    :pswitch_1
    check-cast p2, Ljava/lang/Number;

    .line 41
    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    int-to-long v0, p2

    .line 53
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 54
    .line 55
    .line 56
    :goto_2
    return-void

    .line 57
    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    .line 58
    .line 59
    if-nez p2, :cond_3

    .line 60
    .line 61
    const-string p2, "null"

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    :goto_3
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_3
    check-cast p2, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Lb0/c;->n(Ljava/lang/Boolean;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_4
    check-cast p2, Ljava/util/BitSet;

    .line 79
    .line 80
    invoke-virtual {p1}, Lb0/c;->b()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/4 v1, 0x0

    .line 88
    :goto_4
    if-ge v1, v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p2, v1}, Ljava/util/BitSet;->get(I)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    int-to-long v2, v2

    .line 95
    invoke-virtual {p1, v2, v3}, Lb0/c;->m(J)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    invoke-virtual {p1}, Lb0/c;->e()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_5
    check-cast p2, LT/o;

    .line 106
    .line 107
    invoke-static {p1, p2}, LT/i;->d(Lb0/c;LT/o;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_6
    check-cast p2, Ljava/util/Locale;

    .line 112
    .line 113
    if-nez p2, :cond_5

    .line 114
    .line 115
    const/4 p2, 0x0

    .line 116
    goto :goto_5

    .line 117
    :cond_5
    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    :goto_5
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_7
    check-cast p2, Ljava/util/Calendar;

    .line 126
    .line 127
    if-nez p2, :cond_6

    .line 128
    .line 129
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_6
    invoke-virtual {p1}, Lb0/c;->c()V

    .line 134
    .line 135
    .line 136
    const-string v0, "year"

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x1

    .line 142
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    int-to-long v0, v0

    .line 147
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 148
    .line 149
    .line 150
    const-string v0, "month"

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/4 v0, 0x2

    .line 156
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    int-to-long v0, v0

    .line 161
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 162
    .line 163
    .line 164
    const-string v0, "dayOfMonth"

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 v0, 0x5

    .line 170
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-long v0, v0

    .line 175
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 176
    .line 177
    .line 178
    const-string v0, "hourOfDay"

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/16 v0, 0xb

    .line 184
    .line 185
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    int-to-long v0, v0

    .line 190
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 191
    .line 192
    .line 193
    const-string v0, "minute"

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/16 v0, 0xc

    .line 199
    .line 200
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    int-to-long v0, v0

    .line 205
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 206
    .line 207
    .line 208
    const-string v0, "second"

    .line 209
    .line 210
    invoke-virtual {p1, v0}, Lb0/c;->g(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const/16 v0, 0xd

    .line 214
    .line 215
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    int-to-long v0, p2

    .line 220
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Lb0/c;->f()V

    .line 224
    .line 225
    .line 226
    :goto_6
    return-void

    .line 227
    :pswitch_8
    check-cast p2, Ljava/util/Currency;

    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_9
    check-cast p2, Ljava/util/UUID;

    .line 238
    .line 239
    if-nez p2, :cond_7

    .line 240
    .line 241
    const/4 p2, 0x0

    .line 242
    goto :goto_7

    .line 243
    :cond_7
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    :goto_7
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_a
    check-cast p2, Ljava/net/InetAddress;

    .line 252
    .line 253
    if-nez p2, :cond_8

    .line 254
    .line 255
    const/4 p2, 0x0

    .line 256
    goto :goto_8

    .line 257
    :cond_8
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    :goto_8
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_b
    check-cast p2, Ljava/net/URI;

    .line 266
    .line 267
    if-nez p2, :cond_9

    .line 268
    .line 269
    const/4 p2, 0x0

    .line 270
    goto :goto_9

    .line 271
    :cond_9
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    :goto_9
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_c
    check-cast p2, Ljava/net/URL;

    .line 280
    .line 281
    if-nez p2, :cond_a

    .line 282
    .line 283
    const/4 p2, 0x0

    .line 284
    goto :goto_a

    .line 285
    :cond_a
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    :goto_a
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_d
    check-cast p2, Ljava/lang/StringBuffer;

    .line 294
    .line 295
    if-nez p2, :cond_b

    .line 296
    .line 297
    const/4 p2, 0x0

    .line 298
    goto :goto_b

    .line 299
    :cond_b
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    :goto_b
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_e
    check-cast p2, Ljava/lang/Class;

    .line 308
    .line 309
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 310
    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v1, "Attempted to serialize java.lang.Class: "

    .line 314
    .line 315
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string p2, ". Forgot to register a type adapter?"

    .line 326
    .line 327
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw p1

    .line 338
    :pswitch_f
    check-cast p2, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    if-nez p2, :cond_c

    .line 341
    .line 342
    const/4 p2, 0x0

    .line 343
    goto :goto_c

    .line 344
    :cond_c
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    :goto_c
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_10
    check-cast p2, LV/j;

    .line 353
    .line 354
    invoke-virtual {p1, p2}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_11
    check-cast p2, Ljava/math/BigInteger;

    .line 359
    .line 360
    invoke-virtual {p1, p2}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_12
    check-cast p2, Ljava/math/BigDecimal;

    .line 365
    .line 366
    invoke-virtual {p1, p2}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_13
    check-cast p2, Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :pswitch_14
    check-cast p2, Ljava/lang/Character;

    .line 377
    .line 378
    if-nez p2, :cond_d

    .line 379
    .line 380
    const/4 p2, 0x0

    .line 381
    goto :goto_d

    .line 382
    :cond_d
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    :goto_d
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :pswitch_15
    check-cast p2, Ljava/lang/Number;

    .line 391
    .line 392
    if-nez p2, :cond_e

    .line 393
    .line 394
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 395
    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_e
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 399
    .line 400
    .line 401
    move-result-wide v0

    .line 402
    invoke-virtual {p1, v0, v1}, Lb0/c;->l(D)V

    .line 403
    .line 404
    .line 405
    :goto_e
    return-void

    .line 406
    :pswitch_16
    check-cast p2, Ljava/lang/Number;

    .line 407
    .line 408
    if-nez p2, :cond_f

    .line 409
    .line 410
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_f
    instance-of v0, p2, Ljava/lang/Float;

    .line 415
    .line 416
    if-eqz v0, :cond_10

    .line 417
    .line 418
    goto :goto_f

    .line 419
    :cond_10
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 420
    .line 421
    .line 422
    move-result p2

    .line 423
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 424
    .line 425
    .line 426
    move-result-object p2

    .line 427
    :goto_f
    invoke-virtual {p1, p2}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 428
    .line 429
    .line 430
    :goto_10
    return-void

    .line 431
    :pswitch_17
    check-cast p2, Ljava/lang/Number;

    .line 432
    .line 433
    if-nez p2, :cond_11

    .line 434
    .line 435
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 436
    .line 437
    .line 438
    goto :goto_11

    .line 439
    :cond_11
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 440
    .line 441
    .line 442
    move-result-wide v0

    .line 443
    invoke-virtual {p1, v0, v1}, Lb0/c;->m(J)V

    .line 444
    .line 445
    .line 446
    :goto_11
    return-void

    .line 447
    :pswitch_18
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 448
    .line 449
    invoke-virtual {p1}, Lb0/c;->b()V

    .line 450
    .line 451
    .line 452
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    const/4 v1, 0x0

    .line 457
    :goto_12
    if-ge v1, v0, :cond_12

    .line 458
    .line 459
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    int-to-long v2, v2

    .line 464
    invoke-virtual {p1, v2, v3}, Lb0/c;->m(J)V

    .line 465
    .line 466
    .line 467
    add-int/lit8 v1, v1, 0x1

    .line 468
    .line 469
    goto :goto_12

    .line 470
    :cond_12
    invoke-virtual {p1}, Lb0/c;->e()V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :pswitch_19
    check-cast p2, Ljava/lang/Number;

    .line 475
    .line 476
    if-nez p2, :cond_13

    .line 477
    .line 478
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 479
    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object p2

    .line 486
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :goto_13
    return-void

    .line 490
    :pswitch_1a
    check-cast p2, Ljava/lang/Number;

    .line 491
    .line 492
    if-nez p2, :cond_14

    .line 493
    .line 494
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 495
    .line 496
    .line 497
    goto :goto_15

    .line 498
    :cond_14
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    float-to-double v1, v0

    .line 503
    invoke-static {v1, v2}, LT/l;->a(D)V

    .line 504
    .line 505
    .line 506
    instance-of v1, p2, Ljava/lang/Float;

    .line 507
    .line 508
    if-eqz v1, :cond_15

    .line 509
    .line 510
    goto :goto_14

    .line 511
    :cond_15
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 512
    .line 513
    .line 514
    move-result-object p2

    .line 515
    :goto_14
    invoke-virtual {p1, p2}, Lb0/c;->o(Ljava/lang/Number;)V

    .line 516
    .line 517
    .line 518
    :goto_15
    return-void

    .line 519
    :pswitch_1b
    check-cast p2, Ljava/lang/Number;

    .line 520
    .line 521
    if-nez p2, :cond_16

    .line 522
    .line 523
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 524
    .line 525
    .line 526
    goto :goto_16

    .line 527
    :cond_16
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 528
    .line 529
    .line 530
    move-result-wide v0

    .line 531
    invoke-static {v0, v1}, LT/l;->a(D)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {p1, v0, v1}, Lb0/c;->l(D)V

    .line 535
    .line 536
    .line 537
    :goto_16
    return-void

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
