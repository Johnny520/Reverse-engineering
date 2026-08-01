.class public abstract Lorg/luckypray/dexkit/query/base/BaseFinder;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


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
    array-length v0, p0

    .line 6
    const v1, -0x7ee3623b

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    aget-byte v3, p0, v2

    .line 13
    .line 14
    and-int/lit16 v3, v3, 0xff

    .line 15
    .line 16
    xor-int/2addr v1, v3

    .line 17
    const v3, 0x1000193

    .line 18
    .line 19
    .line 20
    mul-int/2addr v1, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return v1
.end method

.method public final hashKey()Ljava/lang/String;
    .locals 11

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
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v0, :cond_0

    .line 14
    .line 15
    aget-byte v5, p0, v4

    .line 16
    .line 17
    int-to-long v5, v5

    .line 18
    const-wide/16 v7, 0xff

    .line 19
    .line 20
    and-long/2addr v5, v7

    .line 21
    xor-long/2addr v1, v5

    .line 22
    const-wide v5, 0x100000001b3L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    mul-long/2addr v1, v5

    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    cmp-long p0, v1, v4

    .line 34
    .line 35
    const/16 v0, 0x10

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-ltz p0, :cond_1

    .line 39
    .line 40
    invoke-static {v1, v2, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    ushr-long v5, v1, v4

    .line 49
    .line 50
    const-wide/16 v7, 0x10

    .line 51
    .line 52
    div-long/2addr v5, v7

    .line 53
    shl-long/2addr v5, v4

    .line 54
    mul-long v9, v5, v7

    .line 55
    .line 56
    sub-long/2addr v1, v9

    .line 57
    cmp-long p0, v1, v7

    .line 58
    .line 59
    if-ltz p0, :cond_2

    .line 60
    .line 61
    sub-long/2addr v1, v7

    .line 62
    const-wide/16 v7, 0x1

    .line 63
    .line 64
    add-long/2addr v5, v7

    .line 65
    :cond_2
    invoke-static {v5, v6, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-gt v0, v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    sub-int/2addr v0, v2

    .line 108
    if-gt v4, v0, :cond_4

    .line 109
    .line 110
    :goto_2
    const/16 v2, 0x30

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    if-eq v4, v0, :cond_4

    .line 116
    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    move-object p0, v1

    .line 124
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public final serializedBytes$dexkit_android_release()[B
    .locals 3

    .line 1
    new-instance v0, Lc5;

    .line 2
    .line 3
    invoke-direct {v0}, Lc5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lc5;)I

    .line 7
    .line 8
    .line 9
    iget p0, v0, Lc5;->b:I

    .line 10
    .line 11
    iget-object v1, v0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, v0, Lc5;->b:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iget-boolean v2, v0, Lc5;->g:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-array v1, v1, [B

    .line 25
    .line 26
    iget-object v2, v0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, Lc5;->a:Ljava/nio/ByteBuffer;

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
