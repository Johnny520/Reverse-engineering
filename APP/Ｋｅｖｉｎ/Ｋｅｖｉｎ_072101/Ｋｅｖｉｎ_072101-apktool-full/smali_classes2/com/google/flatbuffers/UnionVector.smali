.class public final Lcom/google/flatbuffers/UnionVector;
.super Lcom/google/flatbuffers/BaseVector;
.source "UnionVector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/UnionVector;
    .locals 0
    .param p1, "_vector"    # I
    .param p2, "_element_size"    # I
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 38
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/UnionVector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/Table;
    .param p2, "j"    # I

    .line 50
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/UnionVector;->__element(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/UnionVector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, v1}, Lcom/google/flatbuffers/Table;->__union(Lcom/google/flatbuffers/Table;ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    return-object v0
.end method
