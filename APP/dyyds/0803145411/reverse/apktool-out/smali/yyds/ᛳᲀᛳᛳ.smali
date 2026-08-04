.class public final Lyyds/ᛳᲀᛳᛳ;
.super Lyyds/ᲀᲈᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.CenterCrop"

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛶᲀᛶᲀ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᛳᲀᛳᛳ;->ᛵᛸᛸᛷ:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᛳᲀᛳᛳ;

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, -0x23bf86f2

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛳᲀᛳᛳ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    sget-object p0, Lyyds/ᲈᛵᛷᛲ;->ᛲᲈᲁ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ne p0, p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ne p0, p4, :cond_0

    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    new-instance p0, Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    mul-int/2addr v0, p4

    .line 26
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    mul-int/2addr v1, p3

    .line 31
    const/4 v2, 0x0

    .line 32
    const/high16 v3, 0x3f000000    # 0.5f

    .line 33
    .line 34
    if-le v0, v1, :cond_1

    .line 35
    .line 36
    int-to-float v0, p4

    .line 37
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v0, v1

    .line 43
    int-to-float v1, p3

    .line 44
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    int-to-float v4, v4

    .line 49
    mul-float/2addr v4, v0

    .line 50
    sub-float/2addr v1, v4

    .line 51
    mul-float/2addr v1, v3

    .line 52
    move v5, v2

    .line 53
    move v2, v1

    .line 54
    move v1, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    int-to-float v0, p3

    .line 57
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    int-to-float v1, v1

    .line 62
    div-float/2addr v0, v1

    .line 63
    int-to-float v1, p4

    .line 64
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    int-to-float v4, v4

    .line 69
    mul-float/2addr v4, v0

    .line 70
    sub-float/2addr v1, v4

    .line 71
    mul-float/2addr v1, v3

    .line 72
    :goto_0
    invoke-virtual {p0, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 73
    .line 74
    .line 75
    add-float/2addr v2, v3

    .line 76
    float-to-int v0, v2

    .line 77
    int-to-float v0, v0

    .line 78
    add-float/2addr v1, v3

    .line 79
    float-to-int v1, v1

    .line 80
    int-to-float v1, v1

    .line 81
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 96
    .line 97
    :goto_1
    invoke-interface {p1, p3, p4, v0}, Lyyds/ᲈᛱᛸᛴ;->ᛶᛷᛲᲁ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    invoke-virtual {p1, p3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2, p1, p0}, Lyyds/ᲈᛵᛷᛲ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_4

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    if-ne p0, p3, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eq p0, p3, :cond_4

    .line 136
    .line 137
    :cond_3
    const-string p0, "GlideMemoryTracking"

    .line 138
    .line 139
    const/4 p3, 0x3

    .line 140
    invoke-static {p0, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    const-string p3, "TransformationUtils [centerCrop]"

    .line 155
    .line 156
    const/4 p4, 0x0

    .line 157
    invoke-static {p3, p4, p1, p0, p2}, Lyyds/ᛱᛷᲈᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;II)V

    .line 158
    .line 159
    .line 160
    :cond_4
    return-object p1
.end method
