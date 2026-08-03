.class public abstract Li/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Li/f;->a:Li/r0;

    .line 9
    .line 10
    sget-object v0, Li/v1;->a:Ljava/lang/Object;

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final a(FLi/k;Ljava/lang/String;Li0/h0;II)Li0/l2;
    .locals 8

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-string p2, "FloatAnimation"

    .line 6
    .line 7
    :cond_0
    move-object v4, p2

    .line 8
    const/4 p2, 0x3

    .line 9
    sget-object p5, Li/f;->a:Li/r0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p1, p5, :cond_3

    .line 13
    .line 14
    const p1, 0x4431d23f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p1}, Li0/h0;->a0(I)V

    .line 18
    .line 19
    .line 20
    const p1, 0x3c23d70a    # 0.01f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p1}, Li0/h0;->c(F)Z

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez p5, :cond_1

    .line 32
    .line 33
    sget-object p5, Li0/l;->a:Li0/e;

    .line 34
    .line 35
    if-ne v1, p5, :cond_2

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 p5, 0x0

    .line 42
    invoke-static {p5, p5, p1, p2}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    move-object p1, v1

    .line 50
    check-cast p1, Li/r0;

    .line 51
    .line 52
    invoke-virtual {p3, v0}, Li0/h0;->p(Z)V

    .line 53
    .line 54
    .line 55
    :goto_0
    move-object v2, p1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const p5, 0x44337fa5

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p5}, Li0/h0;->a0(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, v0}, Li0/h0;->p(Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v1, Li/d;->j:Li/m1;

    .line 72
    .line 73
    const p0, 0xe000

    .line 74
    .line 75
    .line 76
    shl-int/lit8 p1, p4, 0x3

    .line 77
    .line 78
    and-int v6, p1, p0

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    move-object v5, p3

    .line 83
    invoke-static/range {v0 .. v7}, Li/f;->b(Ljava/lang/Object;Li/m1;Li/k;Ljava/lang/Float;Ljava/lang/String;Li0/h0;II)Li0/l2;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Li/m1;Li/k;Ljava/lang/Float;Ljava/lang/String;Li0/h0;II)Li0/l2;
    .locals 8

    .line 1
    and-int/lit8 p4, p7, 0x8

    .line 2
    .line 3
    const/4 p7, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, p7

    .line 7
    :cond_0
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    sget-object v0, Li0/l;->a:Li0/e;

    .line 12
    .line 13
    if-ne p4, v0, :cond_1

    .line 14
    .line 15
    invoke-static {p7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-virtual {p5, p4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    check-cast p4, Li0/a1;

    .line 23
    .line 24
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-ne v1, v0, :cond_2

    .line 29
    .line 30
    new-instance v1, Li/c;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, p3}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    move-object v4, v1

    .line 39
    check-cast v4, Li/c;

    .line 40
    .line 41
    invoke-static {p7, p5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    if-eqz p3, :cond_3

    .line 46
    .line 47
    instance-of p1, p2, Li/r0;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    move-object p1, p2

    .line 52
    check-cast p1, Li/r0;

    .line 53
    .line 54
    iget-object v1, p1, Li/r0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v1, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget p2, p1, Li/r0;->a:F

    .line 63
    .line 64
    iget p1, p1, Li/r0;->b:F

    .line 65
    .line 66
    new-instance v1, Li/r0;

    .line 67
    .line 68
    invoke-direct {v1, p2, p1, p3}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object p2, v1

    .line 72
    :cond_3
    invoke-static {p2, p5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const/4 p2, 0x6

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    const/4 p1, -0x1

    .line 84
    invoke-static {p1, p2, p7}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p5, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    move-object v3, p1

    .line 92
    check-cast v3, Lsg/g;

    .line 93
    .line 94
    invoke-virtual {p5, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    and-int/lit8 p3, p6, 0xe

    .line 99
    .line 100
    xor-int/2addr p3, p2

    .line 101
    const/4 p7, 0x4

    .line 102
    if-le p3, p7, :cond_5

    .line 103
    .line 104
    invoke-virtual {p5, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-nez p3, :cond_6

    .line 109
    .line 110
    :cond_5
    and-int/2addr p2, p6

    .line 111
    if-ne p2, p7, :cond_7

    .line 112
    .line 113
    :cond_6
    const/4 p2, 0x1

    .line 114
    goto :goto_0

    .line 115
    :cond_7
    const/4 p2, 0x0

    .line 116
    :goto_0
    or-int/2addr p1, p2

    .line 117
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-nez p1, :cond_8

    .line 122
    .line 123
    if-ne p2, v0, :cond_9

    .line 124
    .line 125
    :cond_8
    new-instance p2, Laa/c;

    .line 126
    .line 127
    const/16 p1, 0xf

    .line 128
    .line 129
    invoke-direct {p2, v3, p1, p0}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    check-cast p2, Lfg/a;

    .line 136
    .line 137
    invoke-static {p2, p5}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p5, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-virtual {p5, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    or-int/2addr p0, p1

    .line 149
    invoke-virtual {p5, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    or-int/2addr p0, p1

    .line 154
    invoke-virtual {p5, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    or-int/2addr p0, p1

    .line 159
    invoke-virtual {p5}, Li0/h0;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-nez p0, :cond_a

    .line 164
    .line 165
    if-ne p1, v0, :cond_b

    .line 166
    .line 167
    :cond_a
    new-instance v2, Li/e;

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    invoke-direct/range {v2 .. v7}, Li/e;-><init>(Lsg/g;Li/c;Li0/a1;Li0/a1;Lwf/c;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    move-object p1, v2

    .line 177
    :cond_b
    check-cast p1, Lfg/p;

    .line 178
    .line 179
    invoke-static {p1, p5, v3}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    check-cast p0, Li0/l2;

    .line 187
    .line 188
    if-nez p0, :cond_c

    .line 189
    .line 190
    iget-object p0, v4, Li/c;->c:Li/l;

    .line 191
    .line 192
    :cond_c
    return-object p0
.end method
