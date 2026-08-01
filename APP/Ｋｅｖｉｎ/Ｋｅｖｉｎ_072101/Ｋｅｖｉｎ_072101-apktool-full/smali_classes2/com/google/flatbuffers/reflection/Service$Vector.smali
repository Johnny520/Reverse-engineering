.class public final Lcom/google/flatbuffers/reflection/Service$Vector;
.super Lcom/google/flatbuffers/BaseVector;
.source "Service.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/reflection/Service;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Vector"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 0
    .param p1, "_vector"    # I
    .param p2, "_element_size"    # I
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 116
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/reflection/Service$Vector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1
    .param p1, "j"    # I

    .line 118
    new-instance v0, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Service$Vector;->get(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service;
    .param p2, "j"    # I

    .line 119
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/reflection/Service$Vector;->__element(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Service$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v0, v1}, Lcom/google/flatbuffers/reflection/Service;->access$000(ILjava/nio/ByteBuffer;)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Service$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Lcom/google/flatbuffers/reflection/Service;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/Service;
    .param p2, "key"    # Ljava/lang/String;

    .line 121
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/Service$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Service$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    .line 120
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/Service$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/Service$Vector;->bb:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object v0

    return-object v0
.end method
