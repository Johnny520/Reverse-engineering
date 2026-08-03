.class public abstract Lm5/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm5/a;->a:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x64t
        0x65t
        0x78t
        0xat
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static a([B)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    sget-object v1, Lm5/a;->a:[B

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    if-ge v0, v2, :cond_2

    .line 12
    .line 13
    aget-byte v2, p0, v0

    .line 14
    .line 15
    aget-byte v1, v1, v0

    .line 16
    .line 17
    if-eq v2, v1, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move v0, v2

    .line 24
    :goto_1
    const/16 v3, 0x30

    .line 25
    .line 26
    const/4 v4, 0x7

    .line 27
    if-ge v0, v4, :cond_4

    .line 28
    .line 29
    aget-byte v4, p0, v0

    .line 30
    .line 31
    if-lt v4, v3, :cond_5

    .line 32
    .line 33
    const/16 v3, 0x39

    .line 34
    .line 35
    if-le v4, v3, :cond_3

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_4
    aget-byte v0, p0, v4

    .line 42
    .line 43
    aget-byte v1, v1, v4

    .line 44
    .line 45
    if-eq v0, v1, :cond_6

    .line 46
    .line 47
    :cond_5
    :goto_2
    const/4 p0, -0x1

    .line 48
    return p0

    .line 49
    :cond_6
    aget-byte v0, p0, v2

    .line 50
    .line 51
    sub-int/2addr v0, v3

    .line 52
    mul-int/lit8 v0, v0, 0x64

    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    aget-byte v1, p0, v1

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    invoke-static {v1, v3, v2, v0}, Lp/a;->z(IIII)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x6

    .line 64
    aget-byte p0, p0, v1

    .line 65
    .line 66
    sub-int/2addr p0, v3

    .line 67
    add-int/2addr p0, v0

    .line 68
    return p0
.end method
