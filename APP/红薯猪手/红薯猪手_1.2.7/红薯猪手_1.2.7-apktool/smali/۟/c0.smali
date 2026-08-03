.class public final L۟/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ۥ۠ۥ:Ljava/lang/Object;

.field public static final ۥ۠ۦ:L۟/c0$a;

.field public static final ۥ۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ۥ۠ۨ:L۟/c0$b;


# instance fields
.field public final ۥ:I

.field public final ۥ۟:L۟/z7;

.field public final ۥ۟۟:L۟/s1;

.field public final ۥ۟۠:L۟/e0;

.field public final ۥ۟ۡ:L۟/fa;

.field public final ۥ۟ۢ:Ljava/lang/String;

.field public final ۥۣ۟:L۟/w8;

.field public final ۥ۟ۤ:I

.field public ۥ۟ۥ:I

.field public final ۥ۟ۦ:L۟/y8;

.field public ۥ۟ۧ:L۟/f;

.field public ۥ۟ۨ:Ljava/util/ArrayList;

.field public ۥ۠:Landroid/graphics/Bitmap;

.field public ۥ۠۟:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public ۥ۠۠:L۟/z7$e;

.field public ۥ۠ۡ:Ljava/lang/Exception;

.field public ۥ۠ۢ:I

.field public ۥۣ۠:I

.field public ۥ۠ۤ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, L۟/c0;->ۥ۠ۥ:Ljava/lang/Object;

    new-instance v0, L۟/c0$a;

    invoke-direct {v0}, L۟/c0$a;-><init>()V

    sput-object v0, L۟/c0;->ۥ۠ۦ:L۟/c0$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, L۟/c0;->ۥ۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, L۟/c0$b;

    invoke-direct {v0}, L۟/c0$b;-><init>()V

    sput-object v0, L۟/c0;->ۥ۠ۨ:L۟/c0$b;

    return-void
.end method

.method public constructor <init>(L۟/z7;L۟/s1;L۟/e0;L۟/fa;L۟/f;L۟/y8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, L۟/c0;->ۥ۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, L۟/c0;->ۥ:I

    iput-object p1, p0, L۟/c0;->ۥ۟:L۟/z7;

    iput-object p2, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    iput-object p3, p0, L۟/c0;->ۥ۟۠:L۟/e0;

    iput-object p4, p0, L۟/c0;->ۥ۟ۡ:L۟/fa;

    iput-object p5, p0, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 1
    iget-object p1, p5, L۟/f;->ۥ۟ۥ:Ljava/lang/String;

    .line 2
    iput-object p1, p0, L۟/c0;->ۥ۟ۢ:Ljava/lang/String;

    .line 3
    iget-object p1, p5, L۟/f;->ۥ۟:L۟/w8;

    .line 4
    iput-object p1, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 5
    iget p1, p1, L۟/w8;->ۥ۠ۢ:I

    .line 6
    iput p1, p0, L۟/c0;->ۥ۠ۤ:I

    .line 7
    iget p1, p5, L۟/f;->ۥ۟ۡ:I

    .line 8
    iput p1, p0, L۟/c0;->ۥ۟ۤ:I

    .line 9
    iget p1, p5, L۟/f;->ۥ۟ۢ:I

    .line 10
    iput p1, p0, L۟/c0;->ۥ۟ۥ:I

    iput-object p6, p0, L۟/c0;->ۥ۟ۦ:L۟/y8;

    invoke-virtual {p6}, L۟/y8;->ۥ۟۠()I

    move-result p1

    iput p1, p0, L۟/c0;->ۥۣ۠:I

    return-void
.end method

.method public static ۥ(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u06df/rb;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_4

    .line 7
    .line 8
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, L۟/rb;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :try_start_0
    invoke-interface {v2}, L۟/rb;->ۥ۟()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    const-string p1, "Transformation "

    .line 22
    .line 23
    invoke-static {p1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v2}, L۟/rb;->ۥ()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, " returned null after "

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, " previous transformation(s).\n\nTransformation list:\n"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, L۟/rb;

    .line 62
    .line 63
    invoke-interface {v0}, L۟/rb;->ۥ()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v0, 0xa

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    sget-object p0, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 77
    .line 78
    new-instance v0, L۟/c0$d;

    .line 79
    .line 80
    invoke-direct {v0, p1}, L۟/c0$d;-><init>(Ljava/lang/StringBuilder;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-object v3

    .line 87
    :cond_1
    if-ne v4, p1, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    sget-object p0, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 96
    .line 97
    new-instance p1, L۟/c0$e;

    .line 98
    .line 99
    invoke-direct {p1, v2}, L۟/c0$e;-><init>(L۟/rb;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    return-object v3

    .line 106
    :cond_2
    if-eq v4, p1, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_3

    .line 113
    .line 114
    sget-object p0, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 115
    .line 116
    new-instance p1, L۟/c0$f;

    .line 117
    .line 118
    invoke-direct {p1, v2}, L۟/c0$f;-><init>(L۟/rb;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 122
    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 126
    .line 127
    move-object p1, v4

    .line 128
    goto :goto_0

    .line 129
    :catch_0
    move-exception p0

    .line 130
    sget-object p1, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 131
    .line 132
    new-instance v0, L۟/c0$c;

    .line 133
    .line 134
    invoke-direct {v0, v2, p0}, L۟/c0$c;-><init>(L۟/rb;Ljava/lang/RuntimeException;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    return-object v3

    .line 141
    :cond_4
    return-object p1
.end method

.method public static ۥ۟۟(Ljava/io/InputStream;L۟/w8;)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    new-instance v0, L۟/p5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, L۟/p5;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    const/high16 p0, 0x10000

    .line 7
    .line 8
    invoke-virtual {v0, p0}, L۟/p5;->ۥ۟ۦ(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {p1}, L۟/y8;->ۥ۟۟(L۟/w8;)Landroid/graphics/BitmapFactory$Options;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-boolean v4, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    move v4, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, v9

    .line 27
    :goto_0
    sget-object v5, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 v5, 0xc

    .line 30
    .line 31
    new-array v6, v5, [B

    .line 32
    .line 33
    invoke-virtual {v0, v6, v9, v5}, L۟/p5;->read([BII)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-ne v7, v5, :cond_1

    .line 38
    .line 39
    new-instance v5, Ljava/lang/String;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    const-string v8, "US-ASCII"

    .line 43
    .line 44
    invoke-direct {v5, v6, v9, v7, v8}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v10, "RIFF"

    .line 48
    .line 49
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    new-instance v5, Ljava/lang/String;

    .line 56
    .line 57
    const/16 v10, 0x8

    .line 58
    .line 59
    invoke-direct {v5, v6, v10, v7, v8}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v6, "WEBP"

    .line 63
    .line 64
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v3, v9

    .line 72
    :goto_1
    invoke-virtual {v0, v1, v2}, L۟/p5;->ۥ۟۟(J)V

    .line 73
    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 80
    .line 81
    .line 82
    const/16 v2, 0x1000

    .line 83
    .line 84
    new-array v2, v2, [B

    .line 85
    .line 86
    :goto_2
    const/4 v3, -0x1

    .line 87
    invoke-virtual {v0, v2}, L۟/p5;->read([B)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eq v3, v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1, v2, v9, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    array-length v1, v0

    .line 104
    invoke-static {v0, v9, v1, p0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 105
    .line 106
    .line 107
    iget v3, p1, L۟/w8;->ۥۣ۟:I

    .line 108
    .line 109
    iget v4, p1, L۟/w8;->ۥ۟ۤ:I

    .line 110
    .line 111
    iget v5, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 112
    .line 113
    iget v6, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 114
    .line 115
    move-object v7, p0

    .line 116
    move-object v8, p1

    .line 117
    invoke-static/range {v3 .. v8}, L۟/y8;->ۥ(IIIILandroid/graphics/BitmapFactory$Options;L۟/w8;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    array-length p1, v0

    .line 121
    invoke-static {v0, v9, p1, p0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_4
    const/4 v9, 0x0

    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    invoke-static {v0, v9, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 130
    .line 131
    .line 132
    iget v3, p1, L۟/w8;->ۥۣ۟:I

    .line 133
    .line 134
    iget v4, p1, L۟/w8;->ۥ۟ۤ:I

    .line 135
    .line 136
    iget v5, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 137
    .line 138
    iget v6, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 139
    .line 140
    move-object v7, p0

    .line 141
    move-object v8, p1

    .line 142
    invoke-static/range {v3 .. v8}, L۟/y8;->ۥ(IIIILandroid/graphics/BitmapFactory$Options;L۟/w8;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1, v2}, L۟/p5;->ۥ۟۟(J)V

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-static {v0, v9, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-eqz p0, :cond_6

    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_6
    new-instance p0, Ljava/io/IOException;

    .line 156
    .line 157
    const-string p1, "Failed to decode stream."

    .line 158
    .line 159
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p0
.end method

.method public static ۥ۟ۢ(L۟/w8;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-boolean v4, v0, L۟/w8;->ۥ۟ۧ:Z

    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual/range {p0 .. p0}, L۟/w8;->ۥ۟۟()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_11

    iget v5, v0, L۟/w8;->ۥۣ۟:I

    iget v7, v0, L۟/w8;->ۥ۟ۤ:I

    iget v8, v0, L۟/w8;->ۥ۟ۨ:F

    const/4 v9, 0x0

    cmpl-float v9, v8, v9

    if-eqz v9, :cond_1

    iget-boolean v9, v0, L۟/w8;->ۥ۠۠:Z

    if-eqz v9, :cond_0

    iget v9, v0, L۟/w8;->ۥ۠:F

    iget v11, v0, L۟/w8;->ۥ۠۟:F

    invoke-virtual {v10, v8, v9, v11}, Landroid/graphics/Matrix;->setRotate(FFF)V

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v8}, Landroid/graphics/Matrix;->setRotate(F)V

    :cond_1
    :goto_0
    iget-boolean v8, v0, L۟/w8;->ۥ۟ۥ:Z

    const/4 v9, 0x1

    if-eqz v8, :cond_6

    int-to-float v0, v5

    int-to-float v8, v2

    div-float v11, v0, v8

    int-to-float v12, v7

    int-to-float v13, v3

    div-float v14, v12, v13

    cmpl-float v15, v11, v14

    if-lez v15, :cond_2

    div-float/2addr v14, v11

    mul-float/2addr v14, v13

    float-to-double v13, v14

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v0, v13

    sub-int v8, v3, v0

    div-int/lit8 v8, v8, 0x2

    int-to-float v13, v0

    div-float v14, v12, v13

    move v13, v6

    move v12, v11

    move v11, v2

    goto :goto_1

    :cond_2
    div-float/2addr v11, v14

    mul-float/2addr v11, v8

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v8, v11

    sub-int v11, v2, v8

    div-int/lit8 v11, v11, 0x2

    int-to-float v12, v8

    div-float/2addr v0, v12

    move v12, v0

    move v0, v3

    move v13, v11

    move v11, v8

    move v8, v6

    :goto_1
    if-eqz v4, :cond_3

    if-gt v2, v5, :cond_3

    if-le v3, v7, :cond_4

    :cond_3
    move v6, v9

    :cond_4
    if-eqz v6, :cond_5

    invoke-virtual {v10, v12, v14}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_5
    move v9, v0

    move v7, v8

    move v8, v11

    move v6, v13

    goto :goto_8

    :cond_6
    iget-boolean v0, v0, L۟/w8;->ۥ۟ۦ:Z

    if-eqz v0, :cond_a

    int-to-float v0, v5

    int-to-float v8, v2

    div-float/2addr v0, v8

    int-to-float v8, v7

    int-to-float v11, v3

    div-float/2addr v8, v11

    cmpg-float v11, v0, v8

    if-gez v11, :cond_7

    goto :goto_2

    :cond_7
    move v0, v8

    :goto_2
    if-eqz v4, :cond_9

    if-gt v2, v5, :cond_9

    if-le v3, v7, :cond_8

    goto :goto_3

    :cond_8
    move v9, v6

    :cond_9
    :goto_3
    if-eqz v9, :cond_11

    invoke-virtual {v10, v0, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto :goto_7

    :cond_a
    if-nez v5, :cond_b

    if-eqz v7, :cond_11

    :cond_b
    if-ne v5, v2, :cond_c

    if-eq v7, v3, :cond_11

    :cond_c
    if-eqz v5, :cond_d

    int-to-float v0, v5

    int-to-float v8, v2

    goto :goto_4

    :cond_d
    int-to-float v0, v7

    int-to-float v8, v3

    :goto_4
    div-float/2addr v0, v8

    if-eqz v7, :cond_e

    int-to-float v8, v7

    int-to-float v11, v3

    goto :goto_5

    :cond_e
    int-to-float v8, v5

    int-to-float v11, v2

    :goto_5
    div-float/2addr v8, v11

    if-eqz v4, :cond_10

    if-gt v2, v5, :cond_10

    if-le v3, v7, :cond_f

    goto :goto_6

    :cond_f
    move v9, v6

    :cond_10
    :goto_6
    if-eqz v9, :cond_11

    invoke-virtual {v10, v0, v8}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_11
    :goto_7
    move v8, v2

    move v9, v3

    move v7, v6

    :goto_8
    if-eqz v1, :cond_12

    int-to-float v0, v1

    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :cond_12
    const/4 v11, 0x1

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_13

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_9

    :cond_13
    move-object v0, v1

    :goto_9
    return-object v0
.end method

.method public static ۥۣ۟(L۟/w8;)V
    .locals 3

    .line 1
    iget-object v0, p0, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p0, p0, L۟/w8;->ۥ۟ۡ:I

    .line 15
    .line 16
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    sget-object v0, L۟/c0;->ۥ۠ۦ:L۟/c0$a;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v2, 0x8

    .line 33
    .line 34
    add-int/2addr v1, v2

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v2, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const-string v0, "Picasso-Idle"

    :try_start_0
    iget-object v1, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    invoke-static {v1}, L۟/c0;->ۥۣ۟(L۟/w8;)V

    iget-object v1, p0, L۟/c0;->ۥ۟:L۟/z7;

    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v1, :cond_0

    invoke-static {p0}, L۟/ic;->ۥ۟۟(L۟/c0;)Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, L۟/c0;->ۥ۟ۡ()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, L۟/c0;->ۥ۠:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1

    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    invoke-virtual {v1, p0}, L۟/s1;->ۥ۟۟(L۟/c0;)V

    goto :goto_2

    :cond_1
    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    invoke-virtual {v1, p0}, L۟/s1;->ۥ۟(L۟/c0;)V
    :try_end_0
    .catch L۟/x1$b; {:try_start_0 .. :try_end_0} :catch_4
    .catch L۟/v6$a; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    :try_start_1
    iput-object v1, p0, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    :goto_0
    invoke-virtual {v1, p0}, L۟/s1;->ۥ۟۟(L۟/c0;)V

    goto :goto_2

    :catch_1
    move-exception v1

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    iget-object v3, p0, L۟/c0;->ۥ۟ۡ:L۟/fa;

    invoke-virtual {v3}, L۟/fa;->ۥ()L۟/ga;

    move-result-object v3

    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v3, v4}, L۟/ga;->ۥ(Ljava/io/PrintWriter;)V

    new-instance v3, Ljava/lang/RuntimeException;

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v3, p0, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    goto :goto_0

    :catch_2
    move-exception v1

    iput-object v1, p0, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;

    :goto_1
    invoke-virtual {v1, p0}, L۟/s1;->ۥ۟۠(L۟/c0;)V

    goto :goto_2

    :catch_3
    move-exception v1

    iput-object v1, p0, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    goto :goto_3

    :catch_4
    move-exception v1

    :try_start_2
    iget-boolean v2, v1, L۟/x1$b;->ۥ:Z

    if-eqz v2, :cond_2

    iget v2, v1, L۟/x1$b;->ۥ۟:I

    const/16 v3, 0x1f8

    if-eq v2, v3, :cond_3

    :cond_2
    iput-object v1, p0, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    :cond_3
    iget-object v1, p0, L۟/c0;->ۥ۟۟:L۟/s1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_3
    return-void

    :goto_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟()Z
    .locals 2

    iget-object v0, p0, L۟/c0;->ۥ۟ۧ:L۟/f;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, L۟/c0;->ۥ۠۟:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final ۥ۟۠(L۟/f;)V
    .locals 6

    .line 1
    iget-object v0, p0, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_9

    .line 23
    .line 24
    iget-object v0, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 25
    .line 26
    iget v0, v0, L۟/w8;->ۥ۠ۢ:I

    .line 27
    .line 28
    iget v3, p0, L۟/c0;->ۥ۠ۤ:I

    .line 29
    .line 30
    if-ne v0, v3, :cond_9

    .line 31
    .line 32
    iget-object v0, p0, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move v0, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v0, v2

    .line 45
    :goto_1
    iget-object v3, p0, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 46
    .line 47
    if-nez v3, :cond_4

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move v4, v2

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    :goto_2
    move v4, v1

    .line 55
    :goto_3
    if-nez v4, :cond_5

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_5
    if-eqz v3, :cond_6

    .line 59
    .line 60
    iget-object v1, v3, L۟/f;->ۥ۟:L۟/w8;

    .line 61
    .line 62
    iget v1, v1, L۟/w8;->ۥ۠ۢ:I

    .line 63
    .line 64
    :cond_6
    if-eqz v0, :cond_8

    .line 65
    .line 66
    iget-object v0, p0, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_4
    if-ge v2, v0, :cond_8

    .line 73
    .line 74
    iget-object v3, p0, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, L۟/f;

    .line 81
    .line 82
    iget-object v3, v3, L۟/f;->ۥ۟:L۟/w8;

    .line 83
    .line 84
    iget v3, v3, L۟/w8;->ۥ۠ۢ:I

    .line 85
    .line 86
    invoke-static {v3}, L۟/c4;->ۥ۟ۥ(I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-static {v1}, L۟/c4;->ۥ۟ۥ(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-le v4, v5, :cond_7

    .line 95
    .line 96
    move v1, v3

    .line 97
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_8
    :goto_5
    iput v1, p0, L۟/c0;->ۥ۠ۤ:I

    .line 101
    .line 102
    :cond_9
    iget-object v0, p0, L۟/c0;->ۥ۟:L۟/z7;

    .line 103
    .line 104
    iget-boolean v0, v0, L۟/z7;->ۥ۟ۨ:Z

    .line 105
    .line 106
    if-eqz v0, :cond_a

    .line 107
    .line 108
    iget-object p1, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 109
    .line 110
    invoke-virtual {p1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    const-string p1, "from "

    .line 114
    .line 115
    invoke-static {p0, p1}, L۟/ic;->ۥ۟۠(L۟/c0;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    :cond_a
    return-void
.end method

.method public final ۥ۟ۡ()Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    iget v0, p0, L۟/c0;->ۥ۟ۤ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, L۟/c0;->ۥ۟۠:L۟/e0;

    .line 14
    .line 15
    iget-object v3, p0, L۟/c0;->ۥ۟ۢ:Ljava/lang/String;

    .line 16
    .line 17
    check-cast v0, L۟/h5;

    .line 18
    .line 19
    invoke-virtual {v0, v3}, L۟/h5;->ۥ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, L۟/c0;->ۥ۟ۡ:L۟/fa;

    .line 26
    .line 27
    iget-object v1, v1, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 30
    .line 31
    .line 32
    sget-object v1, L۟/z7$e;->ۥ۟:L۟/z7$e;

    .line 33
    .line 34
    iput-object v1, p0, L۟/c0;->ۥ۠۠:L۟/z7$e;

    .line 35
    .line 36
    iget-object v1, p0, L۟/c0;->ۥ۟:L۟/z7;

    .line 37
    .line 38
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 43
    .line 44
    invoke-virtual {v1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :cond_3
    iget-object v3, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 52
    .line 53
    iget v4, p0, L۟/c0;->ۥۣ۠:I

    .line 54
    .line 55
    if-nez v4, :cond_4

    .line 56
    .line 57
    const/4 v4, 0x4

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    iget v4, p0, L۟/c0;->ۥ۟ۥ:I

    .line 60
    .line 61
    :goto_1
    iput v4, v3, L۟/w8;->ۥ۟۟:I

    .line 62
    .line 63
    iget-object v4, p0, L۟/c0;->ۥ۟ۦ:L۟/y8;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, L۟/y8;->ۥ۟ۡ(L۟/w8;)L۟/y8$a;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    iget-object v0, v3, L۟/y8$a;->ۥ:L۟/z7$e;

    .line 72
    .line 73
    iput-object v0, p0, L۟/c0;->ۥ۠۠:L۟/z7$e;

    .line 74
    .line 75
    iget v0, v3, L۟/y8$a;->ۥ۟۠:I

    .line 76
    .line 77
    iput v0, p0, L۟/c0;->ۥ۠ۢ:I

    .line 78
    .line 79
    iget-object v0, v3, L۟/y8$a;->ۥ۟:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    iget-object v0, v3, L۟/y8$a;->ۥ۟۟:Ljava/io/InputStream;

    .line 84
    .line 85
    :try_start_0
    iget-object v3, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 86
    .line 87
    invoke-static {v0, v3}, L۟/c0;->ۥ۟۟(Ljava/io/InputStream;L۟/w8;)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    sget-object v4, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 92
    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    .line 98
    .line 99
    :catch_0
    :goto_2
    move-object v0, v3

    .line 100
    goto :goto_4

    .line 101
    :catchall_0
    move-exception v1

    .line 102
    sget-object v2, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 103
    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 108
    .line 109
    .line 110
    :catch_1
    :goto_3
    throw v1

    .line 111
    :cond_7
    :goto_4
    if-eqz v0, :cond_11

    .line 112
    .line 113
    iget-object v3, p0, L۟/c0;->ۥ۟:L۟/z7;

    .line 114
    .line 115
    iget-boolean v3, v3, L۟/z7;->ۥ۟ۨ:Z

    .line 116
    .line 117
    if-eqz v3, :cond_8

    .line 118
    .line 119
    iget-object v3, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 120
    .line 121
    invoke-virtual {v3}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    sget-object v3, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 125
    .line 126
    :cond_8
    iget-object v3, p0, L۟/c0;->ۥ۟ۡ:L۟/fa;

    .line 127
    .line 128
    const/4 v4, 0x2

    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, L۟/ic;->ۥ۟(Landroid/graphics/Bitmap;)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    iget-object v3, v3, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 137
    .line 138
    invoke-virtual {v3, v4, v5, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 143
    .line 144
    .line 145
    iget-object v3, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 146
    .line 147
    invoke-virtual {v3}, L۟/w8;->ۥ۟۟()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_b

    .line 152
    .line 153
    iget-object v3, v3, L۟/w8;->ۥ۟ۢ:Ljava/util/List;

    .line 154
    .line 155
    if-eqz v3, :cond_9

    .line 156
    .line 157
    move v3, v1

    .line 158
    goto :goto_5

    .line 159
    :cond_9
    move v3, v2

    .line 160
    :goto_5
    if-eqz v3, :cond_a

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_a
    move v3, v2

    .line 164
    goto :goto_7

    .line 165
    :cond_b
    :goto_6
    move v3, v1

    .line 166
    :goto_7
    if-nez v3, :cond_c

    .line 167
    .line 168
    iget v3, p0, L۟/c0;->ۥ۠ۢ:I

    .line 169
    .line 170
    if-eqz v3, :cond_11

    .line 171
    .line 172
    :cond_c
    sget-object v3, L۟/c0;->ۥ۠ۥ:Ljava/lang/Object;

    .line 173
    .line 174
    monitor-enter v3

    .line 175
    :try_start_3
    iget-object v4, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 176
    .line 177
    invoke-virtual {v4}, L۟/w8;->ۥ۟۟()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_d

    .line 182
    .line 183
    iget v4, p0, L۟/c0;->ۥ۠ۢ:I

    .line 184
    .line 185
    if-eqz v4, :cond_e

    .line 186
    .line 187
    :cond_d
    iget-object v4, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 188
    .line 189
    iget v5, p0, L۟/c0;->ۥ۠ۢ:I

    .line 190
    .line 191
    invoke-static {v4, v0, v5}, L۟/c0;->ۥ۟ۢ(L۟/w8;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v4, p0, L۟/c0;->ۥ۟:L۟/z7;

    .line 196
    .line 197
    iget-boolean v4, v4, L۟/z7;->ۥ۟ۨ:Z

    .line 198
    .line 199
    if-eqz v4, :cond_e

    .line 200
    .line 201
    iget-object v4, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 202
    .line 203
    invoke-virtual {v4}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    :cond_e
    iget-object v4, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 207
    .line 208
    iget-object v4, v4, L۟/w8;->ۥ۟ۢ:Ljava/util/List;

    .line 209
    .line 210
    if-eqz v4, :cond_f

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_f
    move v1, v2

    .line 214
    :goto_8
    if-eqz v1, :cond_10

    .line 215
    .line 216
    invoke-static {v4, v0}, L۟/c0;->ۥ(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v1, p0, L۟/c0;->ۥ۟:L۟/z7;

    .line 221
    .line 222
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    .line 223
    .line 224
    if-eqz v1, :cond_10

    .line 225
    .line 226
    iget-object v1, p0, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 227
    .line 228
    invoke-virtual {v1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    :cond_10
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    if-eqz v0, :cond_11

    .line 233
    .line 234
    iget-object v1, p0, L۟/c0;->ۥ۟ۡ:L۟/fa;

    .line 235
    .line 236
    const/4 v3, 0x3

    .line 237
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {v0}, L۟/ic;->ۥ۟(Landroid/graphics/Bitmap;)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    iget-object v1, v1, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 245
    .line 246
    invoke-virtual {v1, v3, v4, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_9

    .line 254
    :catchall_1
    move-exception v0

    .line 255
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 256
    throw v0

    .line 257
    :cond_11
    :goto_9
    return-object v0
.end method
