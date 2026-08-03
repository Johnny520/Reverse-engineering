.class public final Lb5/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 13
    const/4 v0, 0x6

    iput v0, p0, Lb5/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 12
    iput p3, p0, Lb5/k;->a:I

    iput p1, p0, Lb5/k;->b:I

    iput p2, p0, Lb5/k;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La5/a;II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lb5/k;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p2, p0, Lb5/k;->b:I

    .line 8
    .line 9
    iput p3, p0, Lb5/k;->c:I

    .line 10
    .line 11
    return-void
.end method

.method public static k(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq p0, v2, :cond_2

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    return p0

    .line 14
    :cond_0
    const-string v0, "Unexpected visibility flag: "

    .line 15
    .line 16
    invoke-static {p0, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    return v2

    .line 26
    :cond_2
    return v1

    .line 27
    :cond_3
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x4000

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public g()Z
    .locals 2

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x1000

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public j(Z)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lb5/k;->g()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string v2, "public "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lb5/k;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-string v2, "private "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lb5/k;->f()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const-string v2, "protected "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Lb5/k;->h()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    const-string v2, "static "

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-virtual {p0}, Lb5/k;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    const-string v2, "final "

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_4
    and-int/lit16 v2, v0, 0x400

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    const-string v2, "abstract "

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_5
    and-int/lit16 v2, v0, 0x100

    .line 73
    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    const-string v2, "native "

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_6
    iget v2, p0, Lb5/k;->c:I

    .line 82
    .line 83
    invoke-static {v2}, Lt3/c;->b(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_b

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    if-eq v2, v3, :cond_9

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    if-eq v2, v3, :cond_7

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_7
    const v2, 0x20020

    .line 97
    .line 98
    .line 99
    and-int/2addr v2, v0

    .line 100
    if-eqz v2, :cond_8

    .line 101
    .line 102
    const-string v2, "synchronized "

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    :cond_8
    if-eqz p1, :cond_e

    .line 108
    .line 109
    and-int/lit8 v0, v0, 0x40

    .line 110
    .line 111
    if-eqz v0, :cond_e

    .line 112
    .line 113
    const-string v0, "/* bridge */ "

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_9
    and-int/lit8 v2, v0, 0x40

    .line 120
    .line 121
    if-eqz v2, :cond_a

    .line 122
    .line 123
    const-string v2, "volatile "

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_a
    and-int/lit16 v0, v0, 0x80

    .line 129
    .line 130
    if-eqz v0, :cond_e

    .line 131
    .line 132
    const-string v0, "transient "

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_b
    and-int/lit16 v2, v0, 0x800

    .line 139
    .line 140
    if-eqz v2, :cond_c

    .line 141
    .line 142
    const-string v2, "strict "

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_c
    if-eqz p1, :cond_e

    .line 148
    .line 149
    const/high16 v2, 0x40000

    .line 150
    .line 151
    and-int/2addr v2, v0

    .line 152
    if-eqz v2, :cond_d

    .line 153
    .line 154
    const-string v2, "/* data */ "

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    :cond_d
    const v2, 0x8000

    .line 160
    .line 161
    .line 162
    and-int/2addr v0, v2

    .line 163
    if-eqz v0, :cond_e

    .line 164
    .line 165
    const-string v0, "/* module-info */ "

    .line 166
    .line 167
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    :cond_e
    :goto_0
    invoke-virtual {p0}, Lb5/k;->i()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_f

    .line 175
    .line 176
    if-eqz p1, :cond_f

    .line 177
    .line 178
    const-string p1, "/* synthetic */ "

    .line 179
    .line 180
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    return-object p1
.end method

.method public l(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lb5/k;->b:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lb5/k;->c:I

    .line 8
    .line 9
    invoke-static {p1, v0, p1}, Lw/s;->B(III)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return p1
.end method

.method public m(I)Lb5/k;
    .locals 3

    .line 1
    iget v0, p0, Lb5/k;->b:I

    .line 2
    .line 3
    and-int v1, v0, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lb5/k;

    .line 8
    .line 9
    not-int p1, p1

    .line 10
    and-int/2addr p1, v0

    .line 11
    iget v0, p0, Lb5/k;->c:I

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, p1, v0, v2}, Lb5/k;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    return-object p0
.end method

.method public n(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lb5/k;->c:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lb5/k;->b:I

    .line 8
    .line 9
    invoke-static {p1, v0, p1}, Lw/s;->C(III)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return p1
.end method

.method public o(Le5/a;I)V
    .locals 2

    .line 1
    iget v0, p0, Lb5/k;->c:I

    .line 2
    .line 3
    iget v1, p0, Lb5/k;->b:I

    .line 4
    .line 5
    sub-int/2addr v1, v0

    .line 6
    if-lt p2, v1, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x70

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lq5/a;->write(I)V

    .line 11
    .line 12
    .line 13
    sub-int/2addr p2, v1

    .line 14
    invoke-virtual {p1, p2}, Le5/a;->z(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/16 v0, 0x76

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lq5/a;->write(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Le5/a;->z(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lb5/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    iget v0, p0, Lb5/k;->c:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    const-string v0, "null"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "METHOD"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string v0, "FIELD"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string v0, "CLASS"

    .line 32
    .line 33
    :goto_0
    iget v1, p0, Lb5/k;->b:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {p0, v2}, Lb5/k;->j(Z)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, " 0x"

    .line 45
    .line 46
    const-string v4, " ("

    .line 47
    .line 48
    const-string v5, "AccessInfo: "

    .line 49
    .line 50
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, ")"

    .line 55
    .line 56
    invoke-static {v0, v2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :pswitch_2
    iget v0, p0, Lb5/k;->b:I

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v1, p0, Lb5/k;->c:I

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "RawValue: type=0x"

    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, ", value="

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
