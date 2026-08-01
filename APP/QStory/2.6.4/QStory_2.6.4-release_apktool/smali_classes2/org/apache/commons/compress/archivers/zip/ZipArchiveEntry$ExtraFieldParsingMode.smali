.class public enum Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;",
        ">;",
        "Lorg/apache/commons/compress/archivers/zip/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

.field public static final enum BEST_EFFORT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

.field public static final enum DRACONIC:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

.field public static final enum ONLY_PARSEABLE_LENIENT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

.field public static final enum ONLY_PARSEABLE_STRICT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

.field public static final enum STRICT_FOR_KNOW_EXTRA_FIELDS:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;


# instance fields
.field private final onUnparseableData:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;
    .locals 5

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->BEST_EFFORT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->STRICT_FOR_KNOW_EXTRA_FIELDS:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->ONLY_PARSEABLE_LENIENT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 6
    .line 7
    sget-object v3, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->ONLY_PARSEABLE_STRICT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 8
    .line 9
    sget-object v4, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->DRACONIC:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode$1;

    .line 2
    .line 3
    const-string v1, "BEST_EFFORT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode$1;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->BEST_EFFORT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 12
    .line 13
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 14
    .line 15
    const-string v1, "STRICT_FOR_KNOW_EXTRA_FIELDS"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->STRICT_FOR_KNOW_EXTRA_FIELDS:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 22
    .line 23
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode$2;

    .line 24
    .line 25
    const-string v1, "ONLY_PARSEABLE_LENIENT"

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    sget-object v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode$2;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->ONLY_PARSEABLE_LENIENT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 34
    .line 35
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 36
    .line 37
    const-string v1, "ONLY_PARSEABLE_STRICT"

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->ONLY_PARSEABLE_STRICT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 44
    .line 45
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    sget-object v2, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 49
    .line 50
    const-string v3, "DRACONIC"

    .line 51
    .line 52
    invoke-direct {v0, v3, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->DRACONIC:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 56
    .line 57
    invoke-static {}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->$values()[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->$VALUES:[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 62
    .line 63
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/compress/archivers/zip/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->onUnparseableData:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;)V

    return-void
.end method

.method public static synthetic access$100(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->fillAndMakeUnrecognizedOnError(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static fillAndMakeUnrecognizedOnError(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)V
    :try_end_0
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-object p0

    .line 5
    :catch_0
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iput-object p0, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 15
    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    add-int/2addr p3, p2

    .line 19
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iput-object p0, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    add-int/2addr p3, p2

    .line 31
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iput-object p0, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 40
    .line 41
    :goto_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->$VALUES:[Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public createExtraField(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/function/Supplier;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 28
    .line 29
    return-object p0
.end method

.method public fill(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;[BIIZ)V

    .line 2
    .line 3
    .line 4
    return-object p1
.end method

.method public onUnparseableExtraField([BIIZI)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->onUnparseableData:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->onUnparseableExtraField([BIIZI)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
