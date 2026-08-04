.class public abstract Lyyds/ᛳᛲᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Landroid/graphics/ColorMatrixColorFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/ColorMatrixColorFilter;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    new-array v1, v1, [F

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛳᛲᛱᛵ;->ᛲᲈᲁ:Landroid/graphics/ColorMatrixColorFilter;

    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x437f0000    # 255.0f
    .end array-data
.end method

.method public static ᛲᲈᲁ(Landroid/graphics/Gainmap;)Landroid/graphics/Gainmap;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getGainmapContents()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    move v1, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v1, v3

    .line 25
    :goto_0
    const-string v2, ""

    .line 26
    .line 27
    invoke-static {v2, v1}, Lyyds/ᛲᛳᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 39
    .line 40
    invoke-static {v1, v2, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Landroid/graphics/Canvas;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v6, Lyyds/ᛳᛲᛱᛵ;->ᛲᲈᲁ:Landroid/graphics/ColorMatrixColorFilter;

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-virtual {v2, v0, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Landroid/graphics/Gainmap;

    .line 68
    .line 69
    invoke-direct {v0, v1}, Landroid/graphics/Gainmap;-><init>(Landroid/graphics/Bitmap;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getRatioMin()[F

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    aget v2, v1, v3

    .line 77
    .line 78
    aget v5, v1, v4

    .line 79
    .line 80
    const/4 v6, 0x2

    .line 81
    aget v1, v1, v6

    .line 82
    .line 83
    invoke-virtual {v0, v2, v5, v1}, Landroid/graphics/Gainmap;->setRatioMin(FFF)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getRatioMax()[F

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    aget v2, v1, v3

    .line 91
    .line 92
    aget v5, v1, v4

    .line 93
    .line 94
    aget v1, v1, v6

    .line 95
    .line 96
    invoke-virtual {v0, v2, v5, v1}, Landroid/graphics/Gainmap;->setRatioMax(FFF)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getGamma()[F

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    aget v2, v1, v3

    .line 104
    .line 105
    aget v5, v1, v4

    .line 106
    .line 107
    aget v1, v1, v6

    .line 108
    .line 109
    invoke-virtual {v0, v2, v5, v1}, Landroid/graphics/Gainmap;->setGamma(FFF)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getEpsilonSdr()[F

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    aget v2, v1, v3

    .line 117
    .line 118
    aget v5, v1, v4

    .line 119
    .line 120
    aget v1, v1, v6

    .line 121
    .line 122
    invoke-virtual {v0, v2, v5, v1}, Landroid/graphics/Gainmap;->setEpsilonSdr(FFF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getEpsilonHdr()[F

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    aget v2, v1, v3

    .line 130
    .line 131
    aget v3, v1, v4

    .line 132
    .line 133
    aget v1, v1, v6

    .line 134
    .line 135
    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Gainmap;->setEpsilonHdr(FFF)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getDisplayRatioForFullHdr()F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v0, v1}, Landroid/graphics/Gainmap;->setDisplayRatioForFullHdr(F)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/graphics/Gainmap;->getMinDisplayRatioForHdrTransition()F

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {v0, p0}, Landroid/graphics/Gainmap;->setMinDisplayRatioForHdrTransition(F)V

    .line 150
    .line 151
    .line 152
    return-object v0
.end method
