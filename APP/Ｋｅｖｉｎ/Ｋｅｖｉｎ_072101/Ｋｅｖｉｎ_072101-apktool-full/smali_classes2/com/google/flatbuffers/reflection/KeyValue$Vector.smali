.class public final Lcom/google/flatbuffers/reflection/KeyValue$Vector;
.super Lcom/google/flatbuffers/BaseVector;
.source "KeyValue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/reflection/KeyValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Vector"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue$Vector;
    .locals 0
    .param p1, "_vector"    # I
    .param p2, "_element_size"    # I
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 80
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 1
    .param p1, "j"    # I

    .line 82
    new-instance v0, Lcom/google/flatbuffers/reflection/KeyValue;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/KeyValue;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->get(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/flatbuffers/reflection/KeyValue;I)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "j"    # I

    .line 83
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__element(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->access$000(ILjava/nio/ByteBuffer;)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Lcom/google/flatbuffers/reflection/KeyValue;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/KeyValue;
    .param p2, "key"    # Ljava/lang/String;

    .line 85
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/KeyValue;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/KeyValue$Vector;->bb:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1}, Lcom/google/flatbuffers/reflection/KeyValue;->__lookup_by_key(Lcom/google/flatbuffers/reflection/KeyValue;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/KeyValue;

    move-result-object v0

    return-object v0
.end method
