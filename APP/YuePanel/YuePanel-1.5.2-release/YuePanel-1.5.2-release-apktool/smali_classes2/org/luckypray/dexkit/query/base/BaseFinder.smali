.class public abstract Lorg/luckypray/dexkit/query/base/BaseFinder;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/base/BaseFinder;",
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
        "()V",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "hashKey",
        "",
        "serializedBytes",
        "",
        "serializedBytes$dexkit_android_release",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/query/base/BaseFinder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object v0

    const-wide v1, 0x811c9dc5L

    long-to-int v1, v1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0xff

    xor-int/2addr v1, v4

    const v4, 0x1000193

    mul-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final hashKey()Ljava/lang/String;
    .locals 9
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;->serializedBytes$dexkit_android_release()[B

    move-result-object v0

    array-length v1, v0

    const-wide v2, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-byte v5, v0, v4

    invoke-static {v5}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result v5

    int-to-long v5, v5

    const-wide/16 v7, 0xff

    and-long/2addr v5, v7

    invoke-static {v5, v6}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v5

    xor-long/2addr v2, v5

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v2

    const-wide v5, 0x100000001b3L

    mul-long/2addr v2, v5

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    invoke-static {v2, v3, v0}, LYue/ۥۢۢۨۨ;->ۥ(JI)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v1, v0, v2}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۡۢ(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic serializedBytes$dexkit_android_release()[B
    .locals 2

    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v0

    const-string v1, "fbb.sizedByteArray()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
