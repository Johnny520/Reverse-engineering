.class public final La60;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final a:Lds0;

.field public final b:I

.field public final c:I

.field public final d:Ls40;

.field public final e:Lva0;

.field public final f:Z

.field public final g:Ln22;


# direct methods
.method public constructor <init>(IILov1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lds0;->a()Lds0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La60;->a:Lds0;

    .line 9
    .line 10
    iput p1, p0, La60;->b:I

    .line 11
    .line 12
    iput p2, p0, La60;->c:I

    .line 13
    .line 14
    sget-object p1, Lxa0;->f:Lmv1;

    .line 15
    .line 16
    invoke-virtual {p3, p1}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ls40;

    .line 21
    .line 22
    iput-object p1, p0, La60;->d:Ls40;

    .line 23
    .line 24
    sget-object p1, Lva0;->g:Lmv1;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lva0;

    .line 31
    .line 32
    iput-object p1, p0, La60;->e:Lva0;

    .line 33
    .line 34
    sget-object p1, Lxa0;->i:Lmv1;

    .line 35
    .line 36
    invoke-virtual {p3, p1}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p3, p1}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p1, 0x0

    .line 57
    :goto_0
    iput-boolean p1, p0, La60;->f:Z

    .line 58
    .line 59
    sget-object p1, Lxa0;->g:Lmv1;

    .line 60
    .line 61
    invoke-virtual {p3, p1}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ln22;

    .line 66
    .line 67
    iput-object p1, p0, La60;->g:Ln22;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 6

    .line 1
    iget-boolean p3, p0, La60;->f:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, La60;->a:Lds0;

    .line 5
    .line 6
    iget v2, p0, La60;->b:I

    .line 7
    .line 8
    iget v3, p0, La60;->c:I

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3, p3, v0}, Lds0;->c(IIZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La4;->n(Landroid/graphics/ImageDecoder;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, La4;->A(Landroid/graphics/ImageDecoder;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object p3, p0, La60;->d:Ls40;

    .line 24
    .line 25
    sget-object v0, Ls40;->i:Ls40;

    .line 26
    .line 27
    if-ne p3, v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, La4;->D(Landroid/graphics/ImageDecoder;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance p3, Lz50;

    .line 33
    .line 34
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p3}, La4;->p(Landroid/graphics/ImageDecoder;Lz50;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, La4;->i(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const/high16 v0, -0x80000000

    .line 45
    .line 46
    if-ne v2, v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :cond_2
    if-ne v3, v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_3
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v4, p0, La60;->e:Lva0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1, v2, v3}, Lva0;->b(IIII)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    int-to-float v1, v1

    .line 77
    mul-float/2addr v1, v0

    .line 78
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-float v2, v2

    .line 87
    mul-float/2addr v2, v0

    .line 88
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const/4 v3, 0x2

    .line 93
    const-string v4, "ImageDecoder"

    .line 94
    .line 95
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_4

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v5, "Resizing from ["

    .line 104
    .line 105
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v5, "x"

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p3, "] to ["

    .line 128
    .line 129
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p3, "] scaleFactor: "

    .line 142
    .line 143
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-static {v4, p3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-static {p1, v1, v2}, La4;->o(Landroid/graphics/ImageDecoder;II)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p0, La60;->g:Ln22;

    .line 160
    .line 161
    if-eqz p0, :cond_7

    .line 162
    .line 163
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    const/16 v0, 0x1c

    .line 166
    .line 167
    if-lt p3, v0, :cond_6

    .line 168
    .line 169
    sget-object p3, Ln22;->h:Ln22;

    .line 170
    .line 171
    if-ne p0, p3, :cond_5

    .line 172
    .line 173
    invoke-static {p2}, La4;->d(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-eqz p0, :cond_5

    .line 178
    .line 179
    invoke-static {p2}, La4;->d(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_5

    .line 188
    .line 189
    sget-object p0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_5
    sget-object p0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 193
    .line 194
    :goto_1
    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p1, p0}, La4;->q(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_6
    sget-object p0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 203
    .line 204
    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p1, p0}, La4;->q(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    return-void
.end method
