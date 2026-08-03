.class public abstract Lfd/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lfd/j;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lfd/j;->a:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static a(JLqd/j;Lxe/q;ZZ)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p2, :cond_9

    .line 2
    .line 3
    invoke-virtual {p2}, Lqd/j;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p2}, Lqd/j;->o()Lqd/q;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    const/4 v0, 0x1

    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    packed-switch p4, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "Unknown type in literalToString: "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    cmp-long p3, p0, v1

    .line 41
    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    const-string p3, "Wrong object literal: {} for type: {}"

    .line 45
    .line 46
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    sget-object p5, Lfd/j;->a:Lmh/b;

    .line 51
    .line 52
    invoke-interface {p5, p4, p3, p2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_1
    const-string p0, "null"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_1
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    invoke-static {p0, p1}, Lxe/q;->b(D)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_2
    invoke-virtual {p3, p0, p1, p5}, Lxe/q;->d(JZ)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    long-to-int p0, p0

    .line 78
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-static {p0}, Lxe/q;->c(F)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_4
    iget p2, p3, Lxe/q;->a:I

    .line 88
    .line 89
    if-ne p2, v0, :cond_4

    .line 90
    .line 91
    long-to-int p2, p0

    .line 92
    const/high16 p4, -0x80000000

    .line 93
    .line 94
    if-eq p2, p4, :cond_3

    .line 95
    .line 96
    const p4, 0x7fffffff

    .line 97
    .line 98
    .line 99
    if-eq p2, p4, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const-string p0, "Integer.MAX_VALUE"

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_3
    const-string p0, "Integer.MIN_VALUE"

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_4
    :goto_0
    const/4 p2, 0x4

    .line 109
    invoke-virtual {p3, p2, p0, p1, p5}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_5
    iget p2, p3, Lxe/q;->a:I

    .line 115
    .line 116
    if-ne p2, v0, :cond_7

    .line 117
    .line 118
    long-to-int p2, p0

    .line 119
    int-to-short p2, p2

    .line 120
    const/16 p4, -0x8000

    .line 121
    .line 122
    if-eq p2, p4, :cond_6

    .line 123
    .line 124
    const/16 p4, 0x7fff

    .line 125
    .line 126
    if-eq p2, p4, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const-string p0, "Short.MAX_VALUE"

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_6
    const-string p0, "Short.MIN_VALUE"

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_7
    :goto_1
    const/4 p2, 0x2

    .line 136
    invoke-virtual {p3, p2, p0, p1, p5}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_6
    invoke-virtual {p3, v0, p0, p1, p5}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :pswitch_7
    long-to-int p0, p0

    .line 147
    int-to-char p0, p0

    .line 148
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {p0, p5}, Lxe/q;->h(CZ)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :pswitch_8
    cmp-long p0, p0, v1

    .line 157
    .line 158
    if-nez p0, :cond_8

    .line 159
    .line 160
    const-string p0, "false"

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_8
    const-string p0, "true"

    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_9
    :goto_2
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    if-eqz p4, :cond_e

    .line 171
    .line 172
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    .line 173
    .line 174
    .line 175
    move-result-wide p4

    .line 176
    const-wide/16 v0, 0x64

    .line 177
    .line 178
    cmp-long p4, p4, v0

    .line 179
    .line 180
    if-lez p4, :cond_e

    .line 181
    .line 182
    const-string p4, "(0x"

    .line 183
    .line 184
    invoke-static {p3, p4}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    if-eqz p2, :cond_a

    .line 196
    .line 197
    sget-object p4, Lqd/q;->o:Lqd/q;

    .line 198
    .line 199
    invoke-virtual {p2, p4}, Lqd/j;->a(Lqd/q;)Z

    .line 200
    .line 201
    .line 202
    move-result p4

    .line 203
    if-eqz p4, :cond_b

    .line 204
    .line 205
    :cond_a
    const-string p4, ", float:"

    .line 206
    .line 207
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    long-to-int p4, p0

    .line 211
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 212
    .line 213
    .line 214
    move-result p4

    .line 215
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    :cond_b
    if-eqz p2, :cond_c

    .line 219
    .line 220
    sget-object p4, Lqd/q;->q:Lqd/q;

    .line 221
    .line 222
    invoke-virtual {p2, p4}, Lqd/j;->a(Lqd/q;)Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    if-eqz p2, :cond_d

    .line 227
    .line 228
    :cond_c
    const-string p2, ", double:"

    .line 229
    .line 230
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 234
    .line 235
    .line 236
    move-result-wide p0

    .line 237
    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    :cond_d
    const/16 p0, 0x29

    .line 241
    .line 242
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    return-object p0

    .line 250
    :cond_e
    return-object p3

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lqd/j;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqd/j;->o()Lqd/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lqd/q;->r:Lqd/q;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lqd/j;->l()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 v0, 0x2e

    .line 14
    .line 15
    const/16 v1, 0x2f

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "L"

    .line 22
    .line 23
    const-string v1, ";"

    .line 24
    .line 25
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object v1, Lqd/q;->s:Lqd/q;

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lqd/j;->g()Lqd/j;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lfd/j;->b(Lqd/j;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "["

    .line 43
    .line 44
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    iget-object p0, v0, Lqd/q;->g:Ljava/lang/String;

    .line 50
    .line 51
    return-object p0
.end method
