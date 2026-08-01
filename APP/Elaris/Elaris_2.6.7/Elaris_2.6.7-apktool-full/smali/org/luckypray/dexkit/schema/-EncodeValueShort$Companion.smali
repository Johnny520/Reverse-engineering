.class public final Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-EncodeValueShort;
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

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addValue(Lc5;S)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lc5;->i(S)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {p1, p0}, Lc5;->q(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final createEncodeValueShort(Lc5;S)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Lc5;->r(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->addValue(Lc5;S)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->endEncodeValueShort(Lc5;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final endEncodeValueShort(Lc5;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lc5;->l()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueShort;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    move-result-object p0

    return-object p0
.end method

.method public final getRootAsEncodeValueShort(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueShort;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;
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
    invoke-static {p1, p0}, La;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

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
    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final startEncodeValueShort(Lc5;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0}, Lc5;->r(I)V

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
