.class public final Lcom/github/megatronking/stringfog/xor/StringFogImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/github/megatronking/stringfog/IStringFog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static xor([B[B)[B
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    array-length v1, p1

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    move v4, v3

    .line 6
    :goto_0
    if-ge v3, v0, :cond_1

    .line 7
    .line 8
    if-lt v4, v1, :cond_0

    .line 9
    .line 10
    move v4, v2

    .line 11
    :cond_0
    aget-byte v5, p0, v3

    .line 12
    .line 13
    aget-byte v6, p1, v4

    .line 14
    .line 15
    xor-int/2addr v5, v6

    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, p0, v3

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-object p0
.end method


# virtual methods
.method public decrypt([B[B)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;->xor([B[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public encrypt(Ljava/lang/String;[B)[B
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1, p2}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;->xor([B[B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public shouldFog(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
