.class public final LUc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ldl;


# static fields
.field public static final a:[B

.field public static final b:[B

.field public static final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    const-string v2, "Exif\u0000\u0000"

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, LUc;->a:[B

    const-string v1, "MPF"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, LUc;->b:[B

    const/16 v0, 0xd

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LUc;->c:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
    .end array-data
.end method

.method public static g(LTc;Lzp;)I
    .locals 4

    const/4 v0, -0x1

    :try_start_0
    invoke-interface {p0}, LTc;->h()I

    move-result v1

    const v2, 0xffd8

    and-int v3, v1, v2

    if-eq v3, v2, :cond_1

    const/16 v2, 0x4d4d

    if-eq v1, v2, :cond_1

    const/16 v2, 0x4949

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/16 v1, 0xe1

    invoke-static {p0, v1}, LUc;->k(LTc;I)I

    move-result v1

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    const-class v2, [B

    invoke-virtual {p1, v1, v2}, Lzp;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B
    :try_end_0
    .catch LSc; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {p0, v2, v1}, LUc;->l(LTc;[BI)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1, v2}, Lzp;->g(Ljava/lang/Object;)V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p1, v2}, Lzp;->g(Ljava/lang/Object;)V

    throw p0
    :try_end_2
    .catch LSc; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_1
    return v0
.end method

.method public static h(LTc;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 8

    :try_start_0
    invoke-interface {p0}, LTc;->h()I

    move-result v0

    const v1, 0xffd8

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_0
    shl-int/lit8 v0, v0, 0x8

    invoke-interface {p0}, LTc;->f()S

    move-result v1

    or-int/2addr v0, v1

    const v1, 0x474946

    if-ne v0, v1, :cond_1

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_1
    shl-int/lit8 v0, v0, 0x8

    invoke-interface {p0}, LTc;->f()S

    move-result v1

    or-int/2addr v0, v1

    const v1, -0x76afb1b9

    if-ne v0, v1, :cond_3

    const-wide/16 v0, 0x15

    invoke-interface {p0, v0, v1}, LTc;->skip(J)J
    :try_end_0
    .catch LSc; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {p0}, LTc;->f()S

    move-result p0

    const/4 v0, 0x3

    if-lt p0, v0, :cond_2

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    :try_end_1
    .catch LSc; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    :try_start_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_3
    const v1, 0x52494646

    const-wide/16 v2, 0x4

    if-eq v0, v1, :cond_b

    invoke-interface {p0}, LTc;->h()I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    invoke-interface {p0}, LTc;->h()I

    move-result v4

    or-int/2addr v1, v4

    const v4, 0x66747970

    if-eq v1, v4, :cond_4

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_4
    invoke-interface {p0}, LTc;->h()I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    invoke-interface {p0}, LTc;->h()I

    move-result v4

    or-int/2addr v1, v4

    const v4, 0x61766973

    if-ne v1, v4, :cond_5

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_5
    const/4 v5, 0x0

    const v6, 0x61766966

    const/4 v7, 0x1

    if-ne v1, v6, :cond_6

    move v1, v7

    goto :goto_0

    :cond_6
    move v1, v5

    :goto_0
    invoke-interface {p0, v2, v3}, LTc;->skip(J)J

    add-int/lit8 v0, v0, -0x10

    rem-int/lit8 v2, v0, 0x4

    if-nez v2, :cond_9

    :goto_1
    const/4 v2, 0x5

    if-ge v5, v2, :cond_9

    if-lez v0, :cond_9

    invoke-interface {p0}, LTc;->h()I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    invoke-interface {p0}, LTc;->h()I

    move-result v3

    or-int/2addr v2, v3

    if-ne v2, v4, :cond_7

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_7
    if-ne v2, v6, :cond_8

    move v1, v7

    :cond_8
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v0, v0, -0x4

    goto :goto_1

    :cond_9
    if-eqz v1, :cond_a

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_a
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_b
    invoke-interface {p0, v2, v3}, LTc;->skip(J)J

    invoke-interface {p0}, LTc;->h()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    invoke-interface {p0}, LTc;->h()I

    move-result v1

    or-int/2addr v0, v1

    const v1, 0x57454250

    if-eq v0, v1, :cond_c

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_c
    invoke-interface {p0}, LTc;->h()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    invoke-interface {p0}, LTc;->h()I

    move-result v1

    or-int/2addr v0, v1

    and-int/lit16 v1, v0, -0x100

    const v4, 0x56503800

    if-eq v1, v4, :cond_d

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_d
    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x58

    if-ne v0, v1, :cond_10

    invoke-interface {p0, v2, v3}, LTc;->skip(J)J

    invoke-interface {p0}, LTc;->f()S

    move-result p0

    and-int/lit8 v0, p0, 0x2

    if-eqz v0, :cond_e

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_e
    and-int/lit8 p0, p0, 0x10

    if-eqz p0, :cond_f

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_f
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_10
    const/16 v1, 0x4c

    if-ne v0, v1, :cond_12

    invoke-interface {p0, v2, v3}, LTc;->skip(J)J

    invoke-interface {p0}, LTc;->f()S

    move-result p0

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_11

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_11
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_12
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    :try_end_2
    .catch LSc; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0
.end method

.method public static i(LTc;Lzp;)Z
    .locals 5

    invoke-static {p0}, LUc;->h(LTc;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0xe2

    invoke-static {p0, v0}, LUc;->k(LTc;I)I

    move-result v1

    :goto_0
    if-lez v1, :cond_3

    const-class v3, [B

    invoke-virtual {p1, v1, v3}, Lzp;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    :try_start_0
    invoke-interface {p0, v1, v3}, LTc;->l(I[B)I

    move-result v4

    if-eq v4, v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    sget-object v4, LUc;->b:[B

    invoke-static {v3, v1, v4}, LUc;->j([BI[B)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {p1, v3}, Lzp;->g(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-virtual {p1, v3}, Lzp;->g(Ljava/lang/Object;)V

    invoke-static {p0, v0}, LUc;->k(LTc;I)I

    move-result v1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p1, v3}, Lzp;->g(Ljava/lang/Object;)V

    throw p0

    :cond_3
    :goto_2
    return v2
.end method

.method public static j([BI[B)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-eqz p2, :cond_0

    array-length v1, p2

    if-le p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_2

    move v1, v0

    :goto_1
    array-length v2, p2

    if-ge v1, v2, :cond_2

    aget-byte v2, p0, v1

    aget-byte v3, p2, v1

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return p1
.end method

.method public static k(LTc;I)I
    .locals 4

    :cond_0
    invoke-interface {p0}, LTc;->f()S

    move-result v0

    const/16 v1, 0xff

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LTc;->f()S

    move-result v0

    const/16 v1, 0xda

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0xd9

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p0}, LTc;->h()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    if-eq v0, p1, :cond_4

    int-to-long v0, v1

    invoke-interface {p0, v0, v1}, LTc;->skip(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    :goto_0
    const/4 p0, -0x1

    return p0

    :cond_4
    return v1
.end method

.method public static l(LTc;[BI)I
    .locals 8

    invoke-interface {p0, p2, p1}, LTc;->l(I[B)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, p2, :cond_0

    goto/16 :goto_9

    :cond_0
    sget-object p0, LUc;->a:[B

    invoke-static {p1, p2, p0}, LUc;->j([BI[B)Z

    move-result p0

    if-eqz p0, :cond_11

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object p0

    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    const/4 p2, 0x6

    sub-int/2addr p1, p2

    const/4 v1, 0x2

    if-lt p1, v1, :cond_1

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    const/16 p2, 0x4949

    if-eq p1, p2, :cond_3

    const/16 p2, 0x4d4d

    if-eq p1, p2, :cond_2

    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_1

    :cond_2
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_1

    :cond_3
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    :goto_1
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    const/16 p2, 0xa

    sub-int/2addr p1, p2

    const/4 v2, 0x4

    if-lt p1, v2, :cond_4

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_2

    :cond_4
    move p1, v0

    :goto_2
    add-int/lit8 p2, p1, 0x6

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    sub-int/2addr v3, p2

    if-lt v3, v1, :cond_5

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p2

    goto :goto_3

    :cond_5
    move p2, v0

    :goto_3
    const/4 v3, 0x0

    :goto_4
    if-ge v3, p2, :cond_11

    add-int/lit8 v4, p1, 0x8

    mul-int/lit8 v5, v3, 0xc

    add-int/2addr v5, v4

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    sub-int/2addr v4, v5

    if-lt v4, v1, :cond_6

    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v4

    goto :goto_5

    :cond_6
    move v4, v0

    :goto_5
    const/16 v6, 0x112

    if-eq v4, v6, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v4, v5, 0x2

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    sub-int/2addr v6, v4

    if-lt v6, v1, :cond_8

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v4

    goto :goto_6

    :cond_8
    move v4, v0

    :goto_6
    const/4 v6, 0x1

    if-lt v4, v6, :cond_10

    const/16 v6, 0xc

    if-le v4, v6, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v6, v5, 0x4

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    sub-int/2addr v7, v6

    if-lt v7, v2, :cond_a

    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    goto :goto_7

    :cond_a
    move v6, v0

    :goto_7
    if-gez v6, :cond_b

    goto :goto_8

    :cond_b
    sget-object v7, LUc;->c:[I

    aget v4, v7, v4

    add-int/2addr v6, v4

    if-le v6, v2, :cond_c

    goto :goto_8

    :cond_c
    add-int/lit8 v5, v5, 0x8

    if-ltz v5, :cond_10

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    if-le v5, v4, :cond_d

    goto :goto_8

    :cond_d
    if-ltz v6, :cond_10

    add-int/2addr v6, v5

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    if-le v6, v4, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    sub-int/2addr p1, v5

    if-lt p1, v1, :cond_f

    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    :cond_f
    return v0

    :cond_10
    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_11
    :goto_9
    return v0
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 2

    new-instance v0, Lq6;

    const-string v1, "Argument must not be null"

    invoke-static {v1, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lq6;-><init>(ILjava/nio/ByteBuffer;)V

    invoke-static {v0}, LUc;->h(LTc;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/io/InputStream;Lzp;)I
    .locals 2

    new-instance v0, LD2;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p1}, LD2;-><init>(ILjava/lang/Object;)V

    const-string p1, "Argument must not be null"

    invoke-static {p1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LUc;->g(LTc;Lzp;)I

    move-result p1

    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;Lzp;)Z
    .locals 2

    new-instance v0, Lq6;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lq6;-><init>(ILjava/nio/ByteBuffer;)V

    const-string p1, "Argument must not be null"

    invoke-static {p1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LUc;->i(LTc;Lzp;)Z

    move-result p1

    return p1
.end method

.method public final d(Ljava/nio/ByteBuffer;Lzp;)I
    .locals 2

    new-instance v0, Lq6;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lq6;-><init>(ILjava/nio/ByteBuffer;)V

    const-string p1, "Argument must not be null"

    invoke-static {p1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LUc;->g(LTc;Lzp;)I

    move-result p1

    return p1
.end method

.method public final e(Ljava/io/InputStream;Lzp;)Z
    .locals 3

    new-instance v0, LD2;

    const-string v1, "Argument must not be null"

    invoke-static {v1, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v2, 0xf

    invoke-direct {v0, v2, p1}, LD2;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LUc;->i(LTc;Lzp;)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 2

    new-instance v0, LD2;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p1}, LD2;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, LUc;->h(LTc;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    return-object p1
.end method
