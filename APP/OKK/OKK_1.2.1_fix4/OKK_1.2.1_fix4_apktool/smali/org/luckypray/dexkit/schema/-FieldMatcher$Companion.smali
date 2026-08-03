.class public final Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAccessFlags(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addAnnotations(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addDeclaringClass(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addFieldName(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addGetMethods(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addPutMethods(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final addTypeClass(Lcom/google/flatbuffers/b;I)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Lcom/google/flatbuffers/b;->h(II)V

    return-void
.end method

.method public final createFieldMatcher(Lcom/google/flatbuffers/b;IIIIIII)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    invoke-virtual {p0, p1, p8}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addPutMethods(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p7}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addGetMethods(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p6}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAnnotations(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p5}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addTypeClass(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addDeclaringClass(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addAccessFlags(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->addFieldName(Lcom/google/flatbuffers/b;I)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->endFieldMatcher(Lcom/google/flatbuffers/b;)I

    move-result p1

    return p1
.end method

.method public final endFieldMatcher(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->l()I

    move-result p1

    return p1
.end method

.method public final getRootAsFieldMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->getRootAsFieldMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsFieldMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;
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

    invoke-virtual {p2, v1, p1}, Lorg/luckypray/dexkit/schema/-FieldMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final startFieldMatcher(Lcom/google/flatbuffers/b;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    return-void
.end method
