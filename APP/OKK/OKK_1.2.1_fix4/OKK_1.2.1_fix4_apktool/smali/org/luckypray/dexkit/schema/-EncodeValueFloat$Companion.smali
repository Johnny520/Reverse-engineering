.class public final Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addValue(Lcom/google/flatbuffers/b;F)V
    .locals 4

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v0, p2

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v2, p1, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v3, p1, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v3, v0

    iput v3, p1, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v2, v3, p2}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final createEncodeValueFloat(Lcom/google/flatbuffers/b;F)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->s(I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->addValue(Lcom/google/flatbuffers/b;F)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->endEncodeValueFloat(Lcom/google/flatbuffers/b;)I

    move-result p1

    return p1
.end method

.method public final endEncodeValueFloat(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/b;->l()I

    move-result p1

    return p1
.end method

.method public final getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;
    .locals 1

    const-string v0, "_bb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueFloat;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsEncodeValueFloat(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-EncodeValueFloat;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;
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

    invoke-virtual {p2, v1, p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    move-result-object p1

    return-object p1
.end method

.method public final startEncodeValueFloat(Lcom/google/flatbuffers/b;)V
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
