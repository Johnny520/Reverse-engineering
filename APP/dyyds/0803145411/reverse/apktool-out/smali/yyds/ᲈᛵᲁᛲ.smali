.class public final Lyyds/ᲈᛵᲁᛲ;
.super Lyyds/ᲀᲈᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

.field public static final ᲀᛲᛳᲀ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-wide v0, -0x28b79e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᲀᛴᛱᛷ;

    .line 10
    .line 11
    const/16 v1, 0xf

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lyyds/ᲈᛵᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

    .line 17
    .line 18
    const-wide v0, -0x28bc4e68a836eL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    const-wide v2, -0x28c0fe68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-wide v1, -0x28c15e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    sput-object v0, Lyyds/ᲈᛵᲁᛲ;->ᲀᛲᛳᲀ:[B

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᲈᛵᲁᛲ;

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const-wide v0, -0x28b20e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    const-wide v0, -0x28b6be68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lyyds/ᲈᛵᲁᛲ;->ᲀᛲᛳᲀ:[B

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    const-wide p3, -0x28b01e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p3, p4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide p3, -0x28b06e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {p3, p4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lyyds/ᲈᛵᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    if-ne p0, p3, :cond_0

    .line 30
    .line 31
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 32
    .line 33
    invoke-virtual {p2, p0, p4}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p0, p2

    .line 41
    :cond_1
    :try_start_0
    invoke-static {p0}, Lyyds/ᲁᛴᛵᛱ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;)Lyyds/ᛶᲇᛴᛴ;

    .line 42
    .line 43
    .line 44
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-nez p3, :cond_3

    .line 46
    .line 47
    if-eq p0, p2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-object p2

    .line 53
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    :goto_1
    invoke-virtual {p3}, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p3}, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-interface {p1, v1, v2, v0}, Lyyds/ᲈᛱᛸᛴ;->ᲇᲇᲇᛱ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-wide v0, -0x28b12e68a836eL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getDensity()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Landroid/graphics/Canvas;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Landroid/graphics/Rect;

    .line 107
    .line 108
    iget v2, p3, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 109
    .line 110
    iget v3, p3, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 111
    .line 112
    iget v4, p3, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 113
    .line 114
    iget v5, p3, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 115
    .line 116
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 117
    .line 118
    .line 119
    new-instance v2, Landroid/graphics/Rect;

    .line 120
    .line 121
    invoke-virtual {p3}, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {p3}, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ()I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    invoke-direct {v2, p4, p4, v3, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 130
    .line 131
    .line 132
    new-instance p3, Landroid/graphics/Paint;

    .line 133
    .line 134
    const/4 p4, 0x7

    .line 135
    invoke-direct {p3, p4}, Landroid/graphics/Paint;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p0, v1, v2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    .line 141
    if-eq p0, p2, :cond_5

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 144
    .line 145
    .line 146
    :cond_5
    return-object p1

    .line 147
    :goto_2
    if-eq p0, p2, :cond_6

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 150
    .line 151
    .line 152
    :cond_6
    throw p1
.end method
