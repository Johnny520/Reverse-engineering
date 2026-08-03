.class public final Lcom/google/flatbuffers/reflection/Service$Vector;
.super Lcom/google/flatbuffers/BaseVector;
.source "SourceFile"


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

    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service$Vector;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/BaseVector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/reflection/Service;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/Service;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/Service$Vector;->get(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    return-object p1
.end method

.method public get(Lcom/google/flatbuffers/reflection/Service;I)Lcom/google/flatbuffers/reflection/Service;
    .locals 1

    .line 2
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/BaseVector;->__element(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/BaseVector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p2, v0}, Lcom/google/flatbuffers/reflection/Service;->access$000(ILjava/nio/ByteBuffer;)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/BaseVector;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/reflection/Service;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    return-object p1
.end method

.method public getByKey(Lcom/google/flatbuffers/reflection/Service;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/google/flatbuffers/BaseVector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/BaseVector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    return-object p1
.end method

.method public getByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/Service;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/flatbuffers/BaseVector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/BaseVector;->bb:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1}, Lcom/google/flatbuffers/reflection/Service;->__lookup_by_key(Lcom/google/flatbuffers/reflection/Service;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/Service;

    move-result-object p1

    return-object p1
.end method
