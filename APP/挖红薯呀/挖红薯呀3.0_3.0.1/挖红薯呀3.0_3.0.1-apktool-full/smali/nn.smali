.class public final synthetic Lnn;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lnn;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lnn;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 7
    .line 8
    invoke-static {p1}, Lrn;->o1(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 14
    .line 15
    invoke-static {p1}, Lrn;->k(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 21
    .line 22
    invoke-static {p1}, Lrn;->O0(Lorg/luckypray/dexkit/result/ClassData;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 32
    .line 33
    invoke-static {p1}, Lrn;->B1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_3
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 39
    .line 40
    invoke-static {p1}, Lrn;->G1(Lorg/luckypray/dexkit/result/ClassData;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_4
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 50
    .line 51
    invoke-static {p1}, Lrn;->P1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_5
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 57
    .line 58
    invoke-static {p1}, Lrn;->p(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_6
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 64
    .line 65
    invoke-static {p1}, Lrn;->A1(Lorg/luckypray/dexkit/result/ClassData;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 75
    .line 76
    invoke-static {p1}, Lrn;->Z0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_8
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 82
    .line 83
    invoke-static {p1}, Lrn;->X(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_9
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 89
    .line 90
    invoke-static {p1}, Lrn;->u(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lna1;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_a
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 96
    .line 97
    invoke-static {p1}, Lrn;->N1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 103
    .line 104
    invoke-static {p1}, Lrn;->c(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 110
    .line 111
    invoke-static {p1}, Lrn;->y(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 117
    .line 118
    invoke-static {p1}, Lrn;->I0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_e
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 124
    .line 125
    invoke-static {p1}, Lrn;->O(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lna1;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_f
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 131
    .line 132
    invoke-static {p1}, Lrn;->Q(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_10
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 138
    .line 139
    invoke-static {p1}, Lrn;->y1(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_11
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 145
    .line 146
    invoke-static {p1}, Lrn;->K(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_12
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 152
    .line 153
    invoke-static {p1}, Lrn;->e(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lna1;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_13
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 159
    .line 160
    invoke-static {p1}, Lrn;->U(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :pswitch_14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 166
    .line 167
    invoke-static {p1}, Lrn;->q0(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_15
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 173
    .line 174
    invoke-static {p1}, Lrn;->r1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :pswitch_16
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 180
    .line 181
    invoke-static {p1}, Lrn;->i(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 187
    .line 188
    invoke-static {p1}, Lrn;->b0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_18
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 194
    .line 195
    invoke-static {p1}, Lrn;->H(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :pswitch_19
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 201
    .line 202
    invoke-static {p1}, Lrn;->W(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_1a
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 208
    .line 209
    invoke-static {p1}, Lrn;->v1(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_1b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 215
    .line 216
    invoke-static {p1}, Lrn;->m0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :pswitch_1c
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 222
    .line 223
    invoke-static {p1}, Lrn;->f0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
