.class public final Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-EncodeValueLong;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addValue(Lcom/google/flatbuffers/b;J)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lcom/google/flatbuffers/b;->f(J)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final createEncodeValueLong(Lcom/google/flatbuffers/b;J)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;->addValue(Lcom/google/flatbuffers/b;J)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;->endEncodeValueLong(Lcom/google/flatbuffers/b;)I

    move-result p1

    return p1
.end method

.method public final endEncodeValueLong(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->l()I

    move-result p1

    return p1
.end method

.method public final getRootAsEncodeValueLong(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueLong;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;->getRootAsEncodeValueLong(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueLong;)Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsEncodeValueLong(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueLong;)Lorg/luckypray/dexkit/schema/-EncodeValueLong;
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

    invoke-virtual {p2, v1, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    move-result-object p1

    return-object p1
.end method

.method public final startEncodeValueLong(Lcom/google/flatbuffers/b;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    return-void
.end method
