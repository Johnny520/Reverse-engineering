.class public abstract Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/nio/file/StandardOpenOption;->READ:Ljava/nio/file/StandardOpenOption;

    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:[B

    .line 12
    .line 13
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([B)J

    .line 14
    .line 15
    .line 16
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲楪苏兰;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲楪苏兰;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲楪苏兰;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, v2}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲楪苏兰;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/Comparator;->thenComparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    .line 33
    .line 34
    .line 35
    return-void
.end method
