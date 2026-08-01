.class public final Lorg/luckypray/dexkit/cache/CacheBridgeKeys;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

.field private static final hexDigits:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 7
    .line 8
    const-string v0, "0123456789ABCDEF"

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->hexDigits:[C

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final isReserved(C)Z
    .locals 0

    .line 1
    const/16 p0, 0x3a

    .line 2
    .line 3
    if-eq p1, p0, :cond_1

    .line 4
    .line 5
    const/16 p0, 0x25

    .line 6
    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method


# virtual methods
.method public final cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cachePrefixOf(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, ":"

    .line 12
    .line 13
    invoke-static {p1, v0, p2}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->encodeSegment(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p2, ":user:"

    .line 24
    .line 25
    invoke-static {p1, p2, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    if-eqz p4, :cond_1

    .line 31
    .line 32
    invoke-virtual {p4}, Lorg/luckypray/dexkit/query/base/BaseFinder;->hashKey()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->encodeSegment(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p2, ":auto:"

    .line 41
    .line 42
    invoke-static {p1, p2, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "Either key or query must be provided for auto-generated cache key."

    .line 48
    .line 49
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public final cachePrefixOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->encodeSegment(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "dkcb:"

    .line 9
    .line 10
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final encodeSegment(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmf;->α:Ljava/nio/charset/Charset;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    array-length v1, p1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-byte v3, p1, v2

    .line 24
    .line 25
    and-int/lit16 v4, v3, 0xff

    .line 26
    .line 27
    int-to-char v5, v4

    .line 28
    invoke-direct {p0, v5}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->isReserved(C)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    const/16 v5, 0x25

    .line 35
    .line 36
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    sget-object v5, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->hexDigits:[C

    .line 40
    .line 41
    ushr-int/lit8 v4, v4, 0x4

    .line 42
    .line 43
    aget-char v4, v5, v4

    .line 44
    .line 45
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    and-int/lit8 v3, v3, 0xf

    .line 49
    .line 50
    aget-char v3, v5, v3

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public final mapGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->encodeSegment(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p2, ":group:"

    .line 12
    .line 13
    invoke-static {p1, p2, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final mapGroupsKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, ":meta:groups"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
