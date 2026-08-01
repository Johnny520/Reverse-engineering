.class public final Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addExcludePackages(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->h(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addIgnorePackagesCase(Lc5;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->a(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addInClasses(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->h(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addInMethods(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->h(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addMatchers(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x5

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->h(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final addSearchPackages(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-virtual {p1, p0, p2}, Lc5;->h(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final createBatchFindMethodUsingStrings(Lc5;IIZIII)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p1, v0}, Lc5;->r(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addMatchers(Lc5;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addInMethods(Lc5;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addInClasses(Lc5;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addExcludePackages(Lc5;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addSearchPackages(Lc5;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->addIgnorePackagesCase(Lc5;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->endBatchFindMethodUsingStrings(Lc5;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final createExcludePackagesVector(Lc5;[I)I
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
    invoke-virtual {p1, p0, v0, p0}, Lc5;->s(III)V

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
    invoke-virtual {p1, v0}, Lc5;->g(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lc5;->m()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final createInClassesVector(Lc5;[J)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/16 p0, 0x8

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    invoke-virtual {p1, p0, v0, p0}, Lc5;->s(III)V

    .line 11
    .line 12
    .line 13
    array-length p0, p2

    .line 14
    add-int/lit8 p0, p0, -0x1

    .line 15
    .line 16
    :goto_0
    const/4 v0, -0x1

    .line 17
    if-ge v0, p0, :cond_0

    .line 18
    .line 19
    aget-wide v0, p2, p0

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lc5;->f(J)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lc5;->m()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final createInMethodsVector(Lc5;[J)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/16 p0, 0x8

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    invoke-virtual {p1, p0, v0, p0}, Lc5;->s(III)V

    .line 11
    .line 12
    .line 13
    array-length p0, p2

    .line 14
    add-int/lit8 p0, p0, -0x1

    .line 15
    .line 16
    :goto_0
    const/4 v0, -0x1

    .line 17
    if-ge v0, p0, :cond_0

    .line 18
    .line 19
    aget-wide v0, p2, p0

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lc5;->f(J)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lc5;->m()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final createMatchersVector(Lc5;[I)I
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
    invoke-virtual {p1, p0, v0, p0}, Lc5;->s(III)V

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
    invoke-virtual {p1, v0}, Lc5;->g(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lc5;->m()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final createSearchPackagesVector(Lc5;[I)I
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
    invoke-virtual {p1, p0, v0, p0}, Lc5;->s(III)V

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
    invoke-virtual {p1, v0}, Lc5;->g(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lc5;->m()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final endBatchFindMethodUsingStrings(Lc5;)I
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

.method public final getRootAsBatchFindMethodUsingStrings(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->getRootAsBatchFindMethodUsingStrings(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;)Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final getRootAsBatchFindMethodUsingStrings(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;)Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;
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
    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final startBatchFindMethodUsingStrings(Lc5;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x6

    .line 5
    invoke-virtual {p1, p0}, Lc5;->r(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startExcludePackagesVector(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lc5;->s(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startInClassesVector(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x8

    .line 5
    .line 6
    invoke-virtual {p1, p0, p2, p0}, Lc5;->s(III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final startInMethodsVector(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x8

    .line 5
    .line 6
    invoke-virtual {p1, p0, p2, p0}, Lc5;->s(III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final startMatchersVector(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lc5;->s(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final startSearchPackagesVector(Lc5;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-virtual {p1, p0, p2, p0}, Lc5;->s(III)V

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
