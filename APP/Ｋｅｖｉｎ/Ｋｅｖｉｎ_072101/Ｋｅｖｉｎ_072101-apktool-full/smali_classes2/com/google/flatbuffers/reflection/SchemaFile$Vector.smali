.class public final Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
.super Lcom/google/flatbuffers/BaseVector;
.source "SchemaFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/reflection/SchemaFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Vector"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Lcom/google/flatbuffers/BaseVector;-><init>()V

    return-void
.end method


# virtual methods
.method public __assign(IILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile$Vector;
    .locals 0
    .param p1, "_vector"    # I
    .param p2, "_element_size"    # I
    .param p3, "_bb"    # Ljava/nio/ByteBuffer;

    .line 94
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__reset(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public get(I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 1
    .param p1, "j"    # I

    .line 96
    new-instance v0, Lcom/google/flatbuffers/reflection/SchemaFile;

    invoke-direct {v0}, Lcom/google/flatbuffers/reflection/SchemaFile;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->get(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/flatbuffers/reflection/SchemaFile;I)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/SchemaFile;
    .param p2, "j"    # I

    .line 97
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__element(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {v0, v1}, Lcom/google/flatbuffers/reflection/SchemaFile;->access$000(ILjava/nio/ByteBuffer;)I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, Lcom/google/flatbuffers/reflection/SchemaFile;->__assign(ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Lcom/google/flatbuffers/reflection/SchemaFile;Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 2
    .param p1, "obj"    # Lcom/google/flatbuffers/reflection/SchemaFile;
    .param p2, "key"    # Ljava/lang/String;

    .line 99
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0, p2, v1}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v0

    return-object v0
.end method

.method public getByKey(Ljava/lang/String;)Lcom/google/flatbuffers/reflection/SchemaFile;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    .line 98
    invoke-virtual {p0}, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->__vector()I

    move-result v0

    iget-object v1, p0, Lcom/google/flatbuffers/reflection/SchemaFile$Vector;->bb:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1}, Lcom/google/flatbuffers/reflection/SchemaFile;->__lookup_by_key(Lcom/google/flatbuffers/reflection/SchemaFile;ILjava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/flatbuffers/reflection/SchemaFile;

    move-result-object v0

    return-object v0
.end method
