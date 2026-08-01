.class final Lcom/esotericsoftware/asm/FieldWriter;
.super Lcom/esotericsoftware/asm/FieldVisitor;


# instance fields
.field private final b:Lcom/esotericsoftware/asm/ClassWriter;

.field private final c:I

.field private final d:I

.field private final e:I

.field private f:I

.field private g:I

.field private h:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private i:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private j:Lcom/esotericsoftware/asm/Attribute;

.field private k:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private l:Lcom/esotericsoftware/asm/AnnotationWriter;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/high16 v0, 0x50000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/FieldVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->B:Lcom/esotericsoftware/asm/FieldWriter;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p0, p1, Lcom/esotericsoftware/asm/ClassWriter;->B:Lcom/esotericsoftware/asm/FieldWriter;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->C:Lcom/esotericsoftware/asm/FieldWriter;

    .line 14
    .line 15
    iput-object p0, v0, Lcom/esotericsoftware/asm/FieldVisitor;->fv:Lcom/esotericsoftware/asm/FieldVisitor;

    .line 16
    .line 17
    :goto_0
    iput-object p0, p1, Lcom/esotericsoftware/asm/ClassWriter;->C:Lcom/esotericsoftware/asm/FieldWriter;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 20
    .line 21
    iput p2, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iput p2, p0, Lcom/esotericsoftware/asm/FieldWriter;->d:I

    .line 28
    .line 29
    invoke-virtual {p1, p4}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Lcom/esotericsoftware/asm/FieldWriter;->e:I

    .line 34
    .line 35
    if-eqz p5, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, p5}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iput p2, p0, Lcom/esotericsoftware/asm/FieldWriter;->f:I

    .line 42
    .line 43
    :cond_1
    if-eqz p6, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1, p6}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget p1, p1, Lcom/esotericsoftware/asm/Item;->a:I

    .line 50
    .line 51
    iput p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->g:I

    .line 52
    .line 53
    :cond_2
    return-void
.end method


# virtual methods
.method public a()I
    .locals 7

    .line 303
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->g:I

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v2, "ConstantValue"

    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    and-int/lit16 v3, v2, 0x1000

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget v4, v3, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    const v5, 0xffff

    and-int/2addr v4, v5

    const/16 v5, 0x31

    if-lt v4, v5, :cond_1

    const/high16 v4, 0x40000

    and-int/2addr v2, v4

    if-eqz v2, :cond_2

    :cond_1
    const-string v2, "Synthetic"

    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x6

    :cond_2
    iget v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    const/high16 v3, 0x20000

    and-int/2addr v2, v3

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "Deprecated"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x6

    :cond_3
    iget v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->f:I

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "Signature"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x8

    :cond_4
    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "RuntimeVisibleAnnotations"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v2}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_5
    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "RuntimeInvisibleAnnotations"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v2}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_6
    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v2}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_7
    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v3, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v2}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_8
    iget-object v1, p0, Lcom/esotericsoftware/asm/FieldWriter;->j:Lcom/esotericsoftware/asm/Attribute;

    if-eqz v1, :cond_9

    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I

    move-result p0

    add-int/2addr v0, p0

    :cond_9
    return v0
.end method

.method public a(Lcom/esotericsoftware/asm/ByteVector;)V
    .locals 9

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    .line 2
    .line 3
    const/high16 v1, 0x40000

    .line 4
    .line 5
    and-int v2, v0, v1

    .line 6
    .line 7
    div-int/lit8 v2, v2, 0x40

    .line 8
    .line 9
    const/high16 v3, 0x60000

    .line 10
    .line 11
    or-int/2addr v2, v3

    .line 12
    not-int v2, v2

    .line 13
    and-int/2addr v0, v2

    .line 14
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->d:I

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->e:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 27
    .line 28
    .line 29
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->g:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v0, v2

    .line 37
    :goto_0
    iget v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    .line 38
    .line 39
    and-int/lit16 v4, v3, 0x1000

    .line 40
    .line 41
    const/16 v5, 0x31

    .line 42
    .line 43
    const v6, 0xffff

    .line 44
    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 49
    .line 50
    iget v4, v4, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 51
    .line 52
    and-int/2addr v4, v6

    .line 53
    if-lt v4, v5, :cond_1

    .line 54
    .line 55
    and-int v4, v3, v1

    .line 56
    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    :cond_2
    const/high16 v4, 0x20000

    .line 62
    .line 63
    and-int/2addr v3, v4

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    :cond_3
    iget v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->f:I

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    :cond_4
    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    :cond_5
    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 81
    .line 82
    if-eqz v3, :cond_6

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    :cond_6
    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 87
    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    :cond_7
    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 93
    .line 94
    if-eqz v3, :cond_8

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    :cond_8
    iget-object v3, p0, Lcom/esotericsoftware/asm/FieldWriter;->j:Lcom/esotericsoftware/asm/Attribute;

    .line 99
    .line 100
    if-eqz v3, :cond_9

    .line 101
    .line 102
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/Attribute;->a()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    add-int/2addr v0, v3

    .line 107
    :cond_9
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 108
    .line 109
    .line 110
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->g:I

    .line 111
    .line 112
    const/4 v3, 0x2

    .line 113
    if-eqz v0, :cond_a

    .line 114
    .line 115
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 116
    .line 117
    const-string v7, "ConstantValue"

    .line 118
    .line 119
    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget v7, p0, Lcom/esotericsoftware/asm/FieldWriter;->g:I

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 133
    .line 134
    .line 135
    :cond_a
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    .line 136
    .line 137
    and-int/lit16 v7, v0, 0x1000

    .line 138
    .line 139
    if-eqz v7, :cond_c

    .line 140
    .line 141
    iget-object v7, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 142
    .line 143
    iget v8, v7, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 144
    .line 145
    and-int/2addr v6, v8

    .line 146
    if-lt v6, v5, :cond_b

    .line 147
    .line 148
    and-int/2addr v0, v1

    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    :cond_b
    const-string v0, "Synthetic"

    .line 152
    .line 153
    invoke-virtual {v7, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 162
    .line 163
    .line 164
    :cond_c
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->c:I

    .line 165
    .line 166
    and-int/2addr v0, v4

    .line 167
    if-eqz v0, :cond_d

    .line 168
    .line 169
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 170
    .line 171
    const-string v1, "Deprecated"

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 182
    .line 183
    .line 184
    :cond_d
    iget v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->f:I

    .line 185
    .line 186
    if-eqz v0, :cond_e

    .line 187
    .line 188
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 189
    .line 190
    const-string v1, "Signature"

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget v1, p0, Lcom/esotericsoftware/asm/FieldWriter;->f:I

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 206
    .line 207
    .line 208
    :cond_e
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 209
    .line 210
    if-eqz v0, :cond_f

    .line 211
    .line 212
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 213
    .line 214
    const-string v1, "RuntimeVisibleAnnotations"

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 224
    .line 225
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 226
    .line 227
    .line 228
    :cond_f
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 229
    .line 230
    if-eqz v0, :cond_10

    .line 231
    .line 232
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 233
    .line 234
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 244
    .line 245
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 246
    .line 247
    .line 248
    :cond_10
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 249
    .line 250
    if-eqz v0, :cond_11

    .line 251
    .line 252
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 253
    .line 254
    const-string v1, "RuntimeVisibleTypeAnnotations"

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 261
    .line 262
    .line 263
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 264
    .line 265
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 266
    .line 267
    .line 268
    :cond_11
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 269
    .line 270
    if-eqz v0, :cond_12

    .line 271
    .line 272
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 273
    .line 274
    const-string v1, "RuntimeInvisibleTypeAnnotations"

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 281
    .line 282
    .line 283
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 284
    .line 285
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 286
    .line 287
    .line 288
    :cond_12
    iget-object v1, p0, Lcom/esotericsoftware/asm/FieldWriter;->j:Lcom/esotericsoftware/asm/Attribute;

    .line 289
    .line 290
    if-eqz v1, :cond_13

    .line 291
    .line 292
    iget-object v2, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 293
    .line 294
    const/4 v5, -0x1

    .line 295
    const/4 v6, -0x1

    .line 296
    const/4 v3, 0x0

    .line 297
    const/4 v4, 0x0

    .line 298
    move-object v7, p1

    .line 299
    invoke-virtual/range {v1 .. v7}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIIILcom/esotericsoftware/asm/ByteVector;)V

    .line 300
    .line 301
    .line 302
    :cond_13
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v5, 0x2

    .line 26
    move-object v4, v3

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 33
    .line 34
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->h:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 40
    .line 41
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->i:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 44
    .line 45
    return-object v0
.end method

.method public visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->j:Lcom/esotericsoftware/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->j:Lcom/esotericsoftware/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(ILcom/esotericsoftware/asm/TypePath;Lcom/esotericsoftware/asm/ByteVector;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/esotericsoftware/asm/FieldWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 26
    .line 27
    iget p1, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 28
    .line 29
    add-int/lit8 v5, p1, -0x2

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    move-object v4, v3

    .line 33
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 34
    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 39
    .line 40
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->k:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 46
    .line 47
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/esotericsoftware/asm/FieldWriter;->l:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 50
    .line 51
    return-object v0
.end method
