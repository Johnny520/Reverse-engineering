.class public abstract Lnp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/Base64$Encoder;

.field public static final b:Ljava/util/Base64$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Base64;->getUrlEncoder()Ljava/util/Base64$Encoder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Base64$Encoder;->withoutPadding()Ljava/util/Base64$Encoder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lnp1;->a:Ljava/util/Base64$Encoder;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Base64;->getUrlDecoder()Ljava/util/Base64$Decoder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnp1;->b:Ljava/util/Base64$Decoder;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Ljava/lang/String;J[B)I
    .locals 2

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v0, -0x7ee3623b

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0}, Lnp1;->d(I[B)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v0, v1, p1, p2}, Lnp1;->e([BIJ)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Lnp1;->d(I[B)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0, p3}, Lnp1;->d(I[B)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method public static b(J[B)J
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-byte v2, p2, v1

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    const-wide/16 v4, 0xff

    .line 9
    .line 10
    and-long/2addr v2, v4

    .line 11
    xor-long/2addr p0, v2

    .line 12
    const-wide v2, 0x100000001b3L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-long/2addr p0, v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-wide p0
.end method

.method public static c(Ljava/lang/String;J[B[BII)V
    .locals 4

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-wide v0, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, p0}, Lnp1;->b(J[B)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    xor-long p0, v0, p1

    .line 23
    .line 24
    const-wide v0, -0x61c8864680b583ebL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    xor-long/2addr p0, v0

    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    cmp-long p2, p0, v0

    .line 33
    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    const-wide p0, 0x6c62272e07bb0142L    # 1.2222398667819803E214

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    :cond_0
    array-length p2, p3

    .line 42
    sub-int/2addr p2, p6

    .line 43
    const/4 v0, 0x0

    .line 44
    :goto_0
    if-ge v0, p2, :cond_2

    .line 45
    .line 46
    and-int/lit8 v1, v0, 0x7

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    const/16 v2, 0xd

    .line 51
    .line 52
    shl-long v2, p0, v2

    .line 53
    .line 54
    xor-long/2addr p0, v2

    .line 55
    const/4 v2, 0x7

    .line 56
    ushr-long v2, p0, v2

    .line 57
    .line 58
    xor-long/2addr p0, v2

    .line 59
    const/16 v2, 0x11

    .line 60
    .line 61
    shl-long v2, p0, v2

    .line 62
    .line 63
    xor-long/2addr p0, v2

    .line 64
    :cond_1
    mul-int/lit8 v1, v1, 0x8

    .line 65
    .line 66
    ushr-long v1, p0, v1

    .line 67
    .line 68
    long-to-int v1, v1

    .line 69
    and-int/lit16 v1, v1, 0xff

    .line 70
    .line 71
    add-int v2, p5, v0

    .line 72
    .line 73
    add-int v3, p6, v0

    .line 74
    .line 75
    aget-byte v3, p3, v3

    .line 76
    .line 77
    xor-int/2addr v1, v3

    .line 78
    int-to-byte v1, v1

    .line 79
    aput-byte v1, p4, v2

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void
.end method

.method public static d(I[B)I
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-byte v2, p1, v1

    .line 6
    .line 7
    and-int/lit16 v2, v2, 0xff

    .line 8
    .line 9
    xor-int/2addr p0, v2

    .line 10
    const v2, 0x1000193

    .line 11
    .line 12
    .line 13
    mul-int/2addr p0, v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return p0
.end method

.method public static e([BIJ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x8

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    add-int v1, p1, v0

    .line 7
    .line 8
    mul-int/lit8 v2, v0, 0x8

    .line 9
    .line 10
    rsub-int/lit8 v2, v2, 0x38

    .line 11
    .line 12
    ushr-long v2, p2, v2

    .line 13
    .line 14
    long-to-int v2, v2

    .line 15
    int-to-byte v2, v2

    .line 16
    aput-byte v2, p0, v1

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method
