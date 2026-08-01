.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;
.super Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[B


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.RoundedCorners"

    .line 2
    .line 3
    sget-object v1, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:[B

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v1, "roundingRadius must be greater than 0."

    .line 10
    .line 11
    invoke-static {v1, v0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;

    .line 7
    .line 8
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iget p1, p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {p0, v0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世(II)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v0, -0x21f3caa6

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    sget-object p3, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    const/4 p4, 0x1

    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    move v0, p4

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, p3

    .line 12
    :goto_0
    const-string v1, "roundingRadius must be greater than 0."

    .line 13
    .line 14
    invoke-static {v1, v0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/locks/Lock;

    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    move-object v2, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 34
    .line 35
    :goto_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    :goto_2
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    move-object v1, p2

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-interface {p1, v3, v6, v1}, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v3, Landroid/graphics/Canvas;

    .line 75
    .line 76
    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p2, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    :goto_3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-interface {p1, v3, v6, v2}, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2, p4}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 95
    .line 96
    .line 97
    new-instance v3, Landroid/graphics/BitmapShader;

    .line 98
    .line 99
    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 100
    .line 101
    invoke-direct {v3, v1, v6, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 102
    .line 103
    .line 104
    new-instance v6, Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 113
    .line 114
    .line 115
    new-instance p4, Landroid/graphics/RectF;

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    int-to-float v3, v3

    .line 122
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    int-to-float v7, v7

    .line 127
    invoke-direct {p4, v5, v5, v3, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 131
    .line 132
    .line 133
    :try_start_0
    new-instance v3, Landroid/graphics/Canvas;

    .line 134
    .line 135
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 136
    .line 137
    .line 138
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 139
    .line 140
    invoke-virtual {v3, p3, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 141
    .line 142
    .line 143
    int-to-float p0, p0

    .line 144
    invoke-virtual {v3, p4, p0, p0, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_4

    .line 158
    .line 159
    invoke-interface {p1, v1}, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/graphics/Bitmap;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    return-object v2

    .line 163
    :catchall_0
    move-exception p0

    .line 164
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 165
    .line 166
    .line 167
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:[B

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
