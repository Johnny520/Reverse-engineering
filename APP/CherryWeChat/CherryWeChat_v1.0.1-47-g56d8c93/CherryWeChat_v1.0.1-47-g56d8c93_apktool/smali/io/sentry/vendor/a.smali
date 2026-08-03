.class public abstract Lio/sentry/vendor/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lio/sentry/vendor/a;->a:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method public static a([B)[B
    .locals 12

    array-length v0, p0

    div-int/lit8 v1, v0, 0x3

    mul-int/lit8 v1, v1, 0x4

    rem-int/lit8 v2, v0, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x2

    :goto_0
    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v4, -0x1

    move v5, v2

    move v6, v4

    :goto_1
    add-int/lit8 v7, v2, 0x3

    sget-object v8, Lio/sentry/vendor/a;->a:[B

    const/16 v9, 0xa

    if-gt v7, v0, :cond_3

    aget-byte v10, p0, v2

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    add-int/lit8 v11, v2, 0x1

    aget-byte v11, p0, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v10, v11

    add-int/lit8 v2, v2, 0x2

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v2, v10

    shr-int/lit8 v10, v2, 0x12

    and-int/lit8 v10, v10, 0x3f

    aget-byte v10, v8, v10

    aput-byte v10, v1, v5

    add-int/lit8 v10, v5, 0x1

    shr-int/lit8 v11, v2, 0xc

    and-int/lit8 v11, v11, 0x3f

    aget-byte v11, v8, v11

    aput-byte v11, v1, v10

    add-int/lit8 v10, v5, 0x2

    shr-int/lit8 v11, v2, 0x6

    and-int/lit8 v11, v11, 0x3f

    aget-byte v11, v8, v11

    aput-byte v11, v1, v10

    add-int/lit8 v10, v5, 0x3

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v8, v2

    aput-byte v2, v1, v10

    add-int/lit8 v2, v5, 0x4

    add-int/2addr v6, v4

    if-nez v6, :cond_2

    add-int/lit8 v5, v5, 0x5

    aput-byte v9, v1, v2

    const/16 v6, 0x13

    :goto_2
    move v2, v7

    goto :goto_1

    :cond_2
    move v5, v2

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v0, -0x1

    if-ne v2, v4, :cond_4

    aget-byte p0, p0, v2

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x4

    add-int/lit8 v0, v5, 0x1

    shr-int/lit8 v2, p0, 0x6

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v8, v2

    aput-byte v2, v1, v5

    and-int/lit8 p0, p0, 0x3f

    aget-byte p0, v8, p0

    aput-byte p0, v1, v0

    return-object v1

    :cond_4
    sub-int/2addr v0, v3

    if-ne v2, v0, :cond_5

    add-int/lit8 v0, v2, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v9

    aget-byte p0, p0, v0

    and-int/lit16 p0, p0, 0xff

    shl-int/2addr p0, v3

    or-int/2addr p0, v2

    add-int/lit8 v0, v5, 0x1

    shr-int/lit8 v2, p0, 0xc

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v8, v2

    aput-byte v2, v1, v5

    add-int/2addr v5, v3

    shr-int/lit8 v2, p0, 0x6

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v8, v2

    aput-byte v2, v1, v0

    and-int/lit8 p0, p0, 0x3f

    aget-byte p0, v8, p0

    aput-byte p0, v1, v5

    :cond_5
    return-object v1
.end method
