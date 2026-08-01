.class public Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private compressionLevel:I

.field private noHeaders:Z

.field private final serializer:Lcom/esotericsoftware/kryo/Serializer;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->noHeaders:Z

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    iput v0, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->compressionLevel:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/zip/Inflater;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->noHeaders:Z

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance v1, Ljava/util/zip/InflaterInputStream;

    .line 9
    .line 10
    new-instance v2, Lcom/esotericsoftware/kryo/io/InputChunked;

    .line 11
    .line 12
    const/16 v3, 0x100

    .line 13
    .line 14
    invoke-direct {v2, p2, v3}, Lcom/esotericsoftware/kryo/io/InputChunked;-><init>(Ljava/io/InputStream;I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 21
    .line 22
    new-instance p2, Lcom/esotericsoftware/kryo/io/Input;

    .line 23
    .line 24
    invoke-direct {p2, v1, v3}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public setCompressionLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->compressionLevel:I

    .line 2
    .line 3
    return-void
.end method

.method public setNoHeaders(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->noHeaders:Z

    .line 2
    .line 3
    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/io/OutputChunked;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, Lcom/esotericsoftware/kryo/io/OutputChunked;-><init>(Ljava/io/OutputStream;I)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Ljava/util/zip/Deflater;

    .line 9
    .line 10
    iget v2, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->compressionLevel:I

    .line 11
    .line 12
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->noHeaders:Z

    .line 13
    .line 14
    invoke-direct {p2, v2, v3}, Ljava/util/zip/Deflater;-><init>(IZ)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    new-instance v2, Ljava/util/zip/DeflaterOutputStream;

    .line 18
    .line 19
    invoke-direct {v2, v0, p2}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/esotericsoftware/kryo/io/Output;

    .line 23
    .line 24
    invoke-direct {v3, v2, v1}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;I)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/DeflateSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 28
    .line 29
    invoke-virtual {p0, p1, v3, p3}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/util/zip/Deflater;->end()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/io/OutputChunked;->endChunk()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    :try_start_1
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :goto_0
    invoke-virtual {p2}, Ljava/util/zip/Deflater;->end()V

    .line 55
    .line 56
    .line 57
    throw p0
.end method
