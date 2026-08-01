.class public final Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-EncodeValueFloat;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addValue(Lb40;F)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    float-to-double v2, p2

    .line 7
    cmpl-double p0, v2, v0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x4

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p0, v0}, Lb40;->π(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, Lb40;->α:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    iget v2, p1, Lb40;->β:I

    .line 19
    .line 20
    sub-int/2addr v2, p0

    .line 21
    iput v2, p1, Lb40;->β:I

    .line 22
    .line 23
    invoke-virtual {v1, v2, p2}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lb40;->ρ(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final createEncodeValueFloat(Lb40;F)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Lb40;->σ(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->addValue(Lb40;F)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->endEncodeValueFloat(Lb40;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final endEncodeValueFloat(Lb40;)I
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

.method public final getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueFloat;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    move-result-object p0

    return-object p0
.end method

.method public final getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueFloat;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;
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
    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final startEncodeValueFloat(Lb40;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0}, Lb40;->σ(I)V

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
