.class public final enum Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

.field public static final enum BACK_REFERENCE:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

.field public static final enum EOD:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

.field public static final enum LITERAL:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->LITERAL:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->BACK_REFERENCE:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->EOD:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 2
    .line 3
    const-string v1, "LITERAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->LITERAL:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 10
    .line 11
    new-instance v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 12
    .line 13
    const-string v1, "BACK_REFERENCE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->BACK_REFERENCE:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 20
    .line 21
    new-instance v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 22
    .line 23
    const-string v1, "EOD"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->EOD:Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 30
    .line 31
    invoke-static {}, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->$values()[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->$VALUES:[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->$VALUES:[Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/compressors/lz77support/LZ77Compressor$Block$BlockType;

    .line 8
    .line 9
    return-object v0
.end method
