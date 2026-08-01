.class public final Lcom/google/flatbuffers/reflection/Schema$Vector;
.super Lcom/google/flatbuffers/BaseVector;
.source "Schema.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/reflection/Schema;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Vector"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema$Vector;
    .locals 0
    .param p1, "_vector"    # I
    .param p2, "_element_size"    # I
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 121
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/reflection/Schema$Vector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(I)Lcom/google/flatbuffers/reflection/Schema;
    .locals 1
    .param p1, "j"    # I

    .line 123
    new-instance v0, Lcom/google/flatbuffers/reflection/Schema;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Schema;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Schema$Vector;->get(Lcom/google/flatbuffers/reflection/Schema;I)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/flatbuffers/reflection/Schema;I)Lcom/google/flatbuffers/reflection/Schema;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Schema;
    .param p2, "j"    # I

    .line 124
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/reflection/Schema$Vector;->__element(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Schema$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->access$000(ILjava/nio/ByteBuffer;)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Schema$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/Schema;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Schema;

    move-result-object v0

    return-object v0
.end method
