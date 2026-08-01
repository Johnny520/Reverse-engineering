.class public final Lorg/luckypray/dexkit/schema/-StringMatcher;
.super Lp22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-StringMatcher;->Companion:Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp22;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__init(ILjava/nio/ByteBuffer;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lp22;->__reset(ILjava/nio/ByteBuffer;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final getIgnoreCase()Z
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    int-to-byte v2, v1

    .line 11
    iget-object v3, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    iget p0, p0, Lp22;->bb_pos:I

    .line 14
    .line 15
    add-int/2addr v0, p0

    .line 16
    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eq v2, p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return v1
.end method

.method public final getMatchType()B
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    iget p0, p0, Lp22;->bb_pos:I

    .line 11
    .line 12
    add-int/2addr v0, p0

    .line 13
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v1, p0, Lp22;->bb_pos:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    invoke-virtual {p0, v0}, Lp22;->__string(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final getValueAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Lp22;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final mutateIgnoreCase(Z)Z
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    iget p0, p0, Lp22;->bb_pos:I

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    int-to-byte p0, p1

    .line 15
    invoke-virtual {v1, v0, p0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final mutateMatchType(B)Z
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    iget p0, p0, Lp22;->bb_pos:I

    .line 11
    .line 12
    add-int/2addr v0, p0

    .line 13
    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final valueInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lp22;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
