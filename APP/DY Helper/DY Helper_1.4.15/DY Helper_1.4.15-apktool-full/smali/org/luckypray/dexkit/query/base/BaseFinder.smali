.class public abstract Lorg/luckypray/dexkit/query/base/BaseFinder;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 23
    .line 24
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide v0, 0x811c9dc5L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    long-to-int v0, v0

    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-byte v3, p0, v2

    .line 16
    .line 17
    and-int/lit16 v3, v3, 0xff

    .line 18
    .line 19
    xor-int/2addr v0, v3

    .line 20
    const v3, 0x1000193

    .line 21
    .line 22
    .line 23
    mul-int/2addr v0, v3

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return v0
.end method

.method public final hashKey()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v0, :cond_0

    .line 13
    .line 14
    aget-byte v4, p0, v3

    .line 15
    .line 16
    int-to-long v4, v4

    .line 17
    const-wide/16 v6, 0xff

    .line 18
    .line 19
    and-long/2addr v4, v6

    .line 20
    xor-long/2addr v1, v4

    .line 21
    const-wide v4, 0x100000001b3L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v1, v4

    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 p0, 0x10

    .line 31
    .line 32
    invoke-static {p0}, Ljx0;->λ(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Lv71;->υ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, p0}, Lq02;->л(Ljava/lang/String;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final serializedBytes$dexkit_android_release()[B
    .locals 3

    .line 1
    new-instance v0, Lb40;

    .line 2
    .line 3
    invoke-direct {v0}, Lb40;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 7
    .line 8
    .line 9
    iget p0, v0, Lb40;->β:I

    .line 10
    .line 11
    iget-object v1, v0, Lb40;->α:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, v0, Lb40;->β:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iget-boolean v2, v0, Lb40;->η:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-array v1, v1, [B

    .line 25
    .line 26
    iget-object v2, v0, Lb40;->α:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, Lb40;->α:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 38
    .line 39
    const-string v0, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method
