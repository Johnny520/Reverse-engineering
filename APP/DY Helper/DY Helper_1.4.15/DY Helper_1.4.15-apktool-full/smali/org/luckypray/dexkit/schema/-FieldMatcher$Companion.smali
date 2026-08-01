.class public final Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-FieldMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addAccessFlags(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addAllOf(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x7

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addAnnotations(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addAnyOf(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x8

    .line 5
    .line 6
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final addDeclaringClass(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addFieldName(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addGetMethods(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x5

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addNoneOf(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x9

    .line 5
    .line 6
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final addPutMethods(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x6

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addTypeClass(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->θ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final createAllOfVector(Lb40;[I)I
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
    const/4 p0, 0x4

    .line 8
    array-length v0, p2

    .line 9
    invoke-virtual {p1, p0, v0, p0}, Lb40;->τ(III)V

    .line 10
    .line 11
    .line 12
    array-length p0, p2

    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    :goto_0
    const/4 v0, -0x1

    .line 16
    if-ge v0, p0, :cond_0

    .line 17
    .line 18
    aget v0, p2, p0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lb40;->η(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lb40;->ν()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final createAnyOfVector(Lb40;[I)I
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
    const/4 p0, 0x4

    .line 8
    array-length v0, p2

    .line 9
    invoke-virtual {p1, p0, v0, p0}, Lb40;->τ(III)V

    .line 10
    .line 11
    .line 12
    array-length p0, p2

    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    :goto_0
    const/4 v0, -0x1

    .line 16
    if-ge v0, p0, :cond_0

    .line 17
    .line 18
    aget v0, p2, p0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lb40;->η(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lb40;->ν()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final createFieldMatcher(Lb40;IIIIIIIIII)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lb40;->σ(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p11}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addNoneOf(Lb40;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p10}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAnyOf(Lb40;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p9}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAllOf(Lb40;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p8}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addPutMethods(Lb40;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addGetMethods(Lb40;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAnnotations(Lb40;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addTypeClass(Lb40;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addDeclaringClass(Lb40;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAccessFlags(Lb40;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addFieldName(Lb40;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->endFieldMatcher(Lb40;)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public final createNoneOfVector(Lb40;[I)I
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
    const/4 p0, 0x4

    .line 8
    array-length v0, p2

    .line 9
    invoke-virtual {p1, p0, v0, p0}, Lb40;->τ(III)V

    .line 10
    .line 11
    .line 12
    array-length p0, p2

    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    :goto_0
    const/4 v0, -0x1

    .line 16
    if-ge v0, p0, :cond_0

    .line 17
    .line 18
    aget v0, p2, p0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lb40;->η(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lb40;->ν()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final endFieldMatcher(Lb40;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lb40;->μ()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final getRootAsFieldMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->getRootAsFieldMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final getRootAsFieldMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
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
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-static {p1, p0}, Lnx;->α(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/2addr v0, p0

    .line 18
    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final startAllOfVector(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lb40;->τ(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startAnyOfVector(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lb40;->τ(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startFieldMatcher(Lb40;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0xa

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lb40;->σ(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final startNoneOfVector(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lb40;->τ(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final validateVersion()V
    .locals 0

    .line 1
    return-void
.end method
