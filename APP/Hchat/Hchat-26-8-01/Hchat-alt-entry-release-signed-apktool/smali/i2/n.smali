.class public final synthetic Li2/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li2/n;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Li2/n;->h:I

    .line 8
    .line 9
    iput p2, p0, Li2/n;->i:I

    .line 10
    .line 11
    iput-object p3, p0, Li2/n;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lf1/j;II)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Li2/n;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/n;->j:Ljava/lang/Object;

    iput p2, p0, Li2/n;->h:I

    iput p3, p0, Li2/n;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Li2/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li2/n;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget v1, p0, Li2/n;->h:I

    .line 48
    .line 49
    invoke-static {v1, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    invoke-static {v1, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iget v2, p0, Li2/n;->i:I

    .line 73
    .line 74
    if-gt v1, v2, :cond_3

    .line 75
    .line 76
    :goto_1
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    iget-object v0, p0, Li2/n;->j:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lf1/j;

    .line 85
    .line 86
    check-cast p1, Li2/r;

    .line 87
    .line 88
    iget-object v1, p1, Li2/r;->a:Li2/a;

    .line 89
    .line 90
    iget v2, p0, Li2/n;->h:I

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Li2/r;->d(I)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    iget v3, p0, Li2/n;->i:I

    .line 97
    .line 98
    invoke-virtual {p1, v3}, Li2/r;->d(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iget-object v4, v1, Li2/a;->e:Ljava/lang/CharSequence;

    .line 103
    .line 104
    if-ltz v2, :cond_4

    .line 105
    .line 106
    if-gt v2, v3, :cond_4

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-gt v3, v5, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    const-string v5, ") or end("

    .line 116
    .line 117
    const-string v6, ") is out of range [0.."

    .line 118
    .line 119
    const-string v7, "start("

    .line 120
    .line 121
    invoke-static {v2, v3, v7, v5, v6}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v4, "], or start > end!"

    .line 133
    .line 134
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4}, Lo2/a;->a(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    new-instance v4, Landroid/graphics/Path;

    .line 145
    .line 146
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 147
    .line 148
    .line 149
    iget-object v1, v1, Li2/a;->d:Lj2/k;

    .line 150
    .line 151
    iget-object v5, v1, Lj2/k;->f:Landroid/text/Layout;

    .line 152
    .line 153
    invoke-virtual {v5, v2, v3, v4}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 154
    .line 155
    .line 156
    iget v1, v1, Lj2/k;->h:I

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    if-eqz v1, :cond_5

    .line 160
    .line 161
    invoke-virtual {v4}, Landroid/graphics/Path;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_5

    .line 166
    .line 167
    int-to-float v1, v1

    .line 168
    invoke-virtual {v4, v2, v1}, Landroid/graphics/Path;->offset(FF)V

    .line 169
    .line 170
    .line 171
    :cond_5
    new-instance v1, Lf1/j;

    .line 172
    .line 173
    invoke-direct {v1, v4}, Lf1/j;-><init>(Landroid/graphics/Path;)V

    .line 174
    .line 175
    .line 176
    iget p1, p1, Li2/r;->f:F

    .line 177
    .line 178
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    int-to-long v2, v2

    .line 183
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    int-to-long v4, p1

    .line 188
    const/16 p1, 0x20

    .line 189
    .line 190
    shl-long/2addr v2, p1

    .line 191
    const-wide v6, 0xffffffffL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    and-long/2addr v4, v6

    .line 197
    or-long/2addr v2, v4

    .line 198
    invoke-virtual {v1, v2, v3}, Lf1/j;->i(J)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, Lf1/j;->a(Lf1/j;Lf1/j;)V

    .line 202
    .line 203
    .line 204
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 205
    .line 206
    return-object p1

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
