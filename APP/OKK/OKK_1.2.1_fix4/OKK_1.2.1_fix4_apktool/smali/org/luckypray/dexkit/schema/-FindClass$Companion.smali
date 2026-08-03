.class public final Lorg/luckypray/dexkit/schema/-FindClass$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-FindClass;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addExcludePackages(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addFindFirst(Lcom/google/flatbuffers/b;Z)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->a(IZ)V

    return-void
.end method

.method public final addIgnorePackagesCase(Lcom/google/flatbuffers/b;Z)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->a(IZ)V

    return-void
.end method

.method public final addInClasses(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addMatcher(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addSearchPackages(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final createExcludePackagesVector(Lcom/google/flatbuffers/b;[I)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final createFindClass(Lcom/google/flatbuffers/b;IIZIZI)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addMatcher(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addInClasses(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addExcludePackages(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addSearchPackages(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addFindFirst(Lcom/google/flatbuffers/b;Z)V

    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->addIgnorePackagesCase(Lcom/google/flatbuffers/b;Z)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->endFindClass(Lcom/google/flatbuffers/b;)I

    move-result p1

    return p1
.end method

.method public final createInClassesVector(Lcom/google/flatbuffers/b;[J)I
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget-wide v1, p2, v0

    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/b;->f(J)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final createSearchPackagesVector(Lcom/google/flatbuffers/b;[I)I
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    array-length v1, p2

    invoke-virtual {p1, v0, v1, v0}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    aget v1, p2, v0

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1
.end method

.method public final endFindClass(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->l()I

    move-result p1

    return p1
.end method

.method public final getRootAsFindClass(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FindClass;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FindClass;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->getRootAsFindClass(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FindClass;)Lorg/luckypray/dexkit/schema/-FindClass;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsFindClass(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FindClass;)Lorg/luckypray/dexkit/schema/-FindClass;
    .locals 2

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3
    invoke-static {p1, v0}, LS/d;->b(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    move-result v0

    .line 4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p2, v1, p1}, Lorg/luckypray/dexkit/schema/-FindClass;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FindClass;

    move-result-object p1

    return-object p1
.end method

.method public final startExcludePackagesVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final startFindClass(Lcom/google/flatbuffers/b;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    return-void
.end method

.method public final startInClassesVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final startSearchPackagesVector(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/b;->t(III)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    return-void
.end method
