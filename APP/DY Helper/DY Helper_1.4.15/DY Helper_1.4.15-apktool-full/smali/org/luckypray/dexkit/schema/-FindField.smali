.class public final Lorg/luckypray/dexkit/schema/-FindField;
.super Lp22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-FindField$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-FindField$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-FindField$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

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
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FindField;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FindField;->__init(ILjava/nio/ByteBuffer;)V

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

.method public final excludePackages(I)Ljava/lang/String;
    .locals 1

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
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    mul-int/lit8 p1, p1, 0x4

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1}, Lp22;->__string(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final getExcludePackagesLength()I
    .locals 1

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
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final getFindFirst()Z
    .locals 4

    .line 1
    const/16 v0, 0xe

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

.method public final getIgnorePackagesCase()Z
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

.method public final getInClassesAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lp22;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final getInClassesLength()I
    .locals 1

    .line 1
    const/16 v0, 0xa

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
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final getInFieldsAsByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lp22;->__vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final getInFieldsLength()I
    .locals 1

    .line 1
    const/16 v0, 0xc

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
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-FindField;->matcher(Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getSearchPackagesLength()I
    .locals 1

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
    invoke-virtual {p0, v0}, Lp22;->__vector_len(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final inClasses(I)J
    .locals 2

    .line 1
    const/16 v0, 0xa

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
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    mul-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    add-int/2addr p1, p0

    .line 18
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0

    .line 23
    :cond_0
    const-wide/16 p0, 0x0

    .line 24
    .line 25
    return-wide p0
.end method

.method public final inClassesInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lp22;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final inFields(I)J
    .locals 2

    .line 1
    const/16 v0, 0xc

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
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    mul-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    add-int/2addr p1, p0

    .line 18
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0

    .line 23
    :cond_0
    const-wide/16 p0, 0x0

    .line 24
    .line 25
    return-wide p0
.end method

.method public final inFieldsInByteBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lp22;->__vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final matcher(Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lp22;->bb_pos:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lp22;->__indirect(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lp22;->bb:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final mutateFindFirst(Z)Z
    .locals 2

    .line 1
    const/16 v0, 0xe

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

.method public final mutateIgnorePackagesCase(Z)Z
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

.method public final mutateInClasses(IJ)Z
    .locals 2

    .line 1
    const/16 v0, 0xa

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
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    mul-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    add-int/2addr p1, p0

    .line 18
    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final mutateInFields(IJ)Z
    .locals 2

    .line 1
    const/16 v0, 0xc

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
    invoke-virtual {p0, v0}, Lp22;->__vector(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    mul-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    add-int/2addr p1, p0

    .line 18
    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final searchPackages(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lp22;->__offset(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lp22;->__vector(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    mul-int/2addr p1, v0

    .line 13
    add-int/2addr p1, v1

    .line 14
    invoke-virtual {p0, p1}, Lp22;->__string(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
