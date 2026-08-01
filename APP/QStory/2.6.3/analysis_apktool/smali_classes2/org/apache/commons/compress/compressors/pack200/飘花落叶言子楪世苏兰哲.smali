.class public final Lorg/apache/commons/compress/compressors/pack200/飘花落叶言子楪世苏兰哲;
.super Lorg/apache/commons/compress/compressors/pack200/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v1, v0, [Ljava/nio/file/attribute/FileAttribute;

    .line 7
    .line 8
    const-string v2, "commons-compress"

    .line 9
    .line 10
    const-string v3, "packtemp"

    .line 11
    .line 12
    invoke-static {v2, v3, v1}, Ljava/nio/file/Files;->createTempFile(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/io/File;->deleteOnExit()V

    .line 21
    .line 22
    .line 23
    new-array v0, v0, [Ljava/nio/file/OpenOption;

    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/nio/file/Files;->newOutputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 30
    .line 31
    return-void
.end method
