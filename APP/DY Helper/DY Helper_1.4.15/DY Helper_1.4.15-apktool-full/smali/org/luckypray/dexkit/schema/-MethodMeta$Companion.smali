.class public final Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-MethodMeta;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addAccessFlags-Qn1smSk(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->ε(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addClassId-Qn1smSk(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->ε(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addDexDescriptor(Lb40;I)V
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

.method public final addDexId-Qn1smSk(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->ε(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addId-Qn1smSk(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->ε(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addParameterTypes(Lb40;I)V
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

.method public final addReturnType-Qn1smSk(Lb40;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x5

    .line 5
    invoke-virtual {p1, p0, p2}, Lb40;->ε(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final createMethodMeta-gTuLvDU(Lb40;IIIIIII)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    invoke-virtual {p1, v0}, Lb40;->σ(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p8}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addParameterTypes(Lb40;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addReturnType-Qn1smSk(Lb40;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addDexDescriptor(Lb40;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addAccessFlags-Qn1smSk(Lb40;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addClassId-Qn1smSk(Lb40;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addDexId-Qn1smSk(Lb40;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->addId-Qn1smSk(Lb40;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->endMethodMeta(Lb40;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final createParameterTypesVector(Lb40;[I)I
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
    invoke-virtual {p1, v0}, Lb40;->δ(I)V

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

.method public final endMethodMeta(Lb40;)I
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

.method public final getRootAsMethodMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->getRootAsMethodMeta(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object p0

    return-object p0
.end method

.method public final getRootAsMethodMeta(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/schema/-MethodMeta;
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
    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final startMethodMeta(Lb40;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x7

    .line 5
    invoke-virtual {p1, p0}, Lb40;->σ(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startParameterTypesVector(Lb40;I)V
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
