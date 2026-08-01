.class public final Lcom/google/protobuf/Field;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言楪苏哲兰世子;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;,
        Lcom/google/protobuf/Field$Kind;,
        Lcom/google/protobuf/Field$Cardinality;
    }
.end annotation


# static fields
.field public static final CARDINALITY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

.field public static final DEFAULT_VALUE_FIELD_NUMBER:I = 0xb

.field public static final JSON_NAME_FIELD_NUMBER:I = 0xa

.field public static final KIND_FIELD_NUMBER:I = 0x1

.field public static final NAME_FIELD_NUMBER:I = 0x4

.field public static final NUMBER_FIELD_NUMBER:I = 0x3

.field public static final ONEOF_INDEX_FIELD_NUMBER:I = 0x7

.field public static final OPTIONS_FIELD_NUMBER:I = 0x9

.field public static final PACKED_FIELD_NUMBER:I = 0x8

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x6

.field private static final serialVersionUID:J


# instance fields
.field private cardinality_:I

.field private volatile defaultValue_:Ljava/lang/Object;

.field private volatile jsonName_:Ljava/lang/Object;

.field private kind_:I

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private number_:I

.field private oneofIndex_:I

.field private options_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/Option;",
            ">;"
        }
    .end annotation
.end field

.field private packed_:Z

.field private volatile typeUrl_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "Field"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/Field;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/Field;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏世兰子哲;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    iput-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 16
    .line 17
    iput v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 20
    .line 21
    iput-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    iput-byte v2, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 27
    .line 28
    iput v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 29
    .line 30
    iput v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 31
    .line 32
    iput-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 43
    .line 44
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ")V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    const/4 p1, 0x0

    .line 46
    iput p1, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 47
    iput p1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 48
    iput p1, p0, Lcom/google/protobuf/Field;->number_:I

    .line 49
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 50
    iput-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 51
    iput p1, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 52
    iput-boolean p1, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 53
    iput-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 54
    iput-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 55
    iput-byte p1, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言楪苏世兰子哲;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/google/protobuf/Field;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$1002(Lcom/google/protobuf/Field;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1100(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1102(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1200(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1202(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$300(Lcom/google/protobuf/Field;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Lcom/google/protobuf/Field;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Lcom/google/protobuf/Field;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$402(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$500(Lcom/google/protobuf/Field;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$502(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$602(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/Field;->number_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$700(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$702(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$800(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$802(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$902(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Field;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏子世哲楪兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    invoke-virtual {v0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Field;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Field;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Field;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/Field;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Field;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Field;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 6
    .line 7
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/Field;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Field;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Field;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/Field;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    check-cast p1, Lcom/google/protobuf/Field;

    .line 15
    .line 16
    iget v1, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 17
    .line 18
    iget v2, p1, Lcom/google/protobuf/Field;->kind_:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    iget v1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 25
    .line 26
    iget v2, p1, Lcom/google/protobuf/Field;->cardinality_:I

    .line 27
    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    .line 30
    return v3

    .line 31
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNumber()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getNumber()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eq v1, v2, :cond_4

    .line 40
    .line 41
    return v3

    .line 42
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v3

    .line 57
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_6

    .line 70
    .line 71
    return v3

    .line 72
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOneofIndex()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getOneofIndex()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eq v1, v2, :cond_7

    .line 81
    .line 82
    return v3

    .line 83
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getPacked()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getPacked()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eq v1, v2, :cond_8

    .line 92
    .line 93
    return v3

    .line 94
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_9

    .line 107
    .line 108
    return v3

    .line 109
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_a

    .line 122
    .line 123
    return v3

    .line 124
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {p1}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_b

    .line 137
    .line 138
    return v3

    .line 139
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_c

    .line 152
    .line 153
    return v3

    .line 154
    :cond_c
    return v0
.end method

.method public getCardinality()Lcom/google/protobuf/Field$Cardinality;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/Field$Cardinality;->forNumber(I)Lcom/google/protobuf/Field$Cardinality;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getCardinalityValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 2
    .line 3
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Field;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultInstanceForType()Lcom/google/protobuf/Field;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultInstanceForType()Lcom/google/protobuf/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDefaultValue()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getDefaultValueBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言苏子世哲楪兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getJsonName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getJsonNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getKind()Lcom/google/protobuf/Field$Kind;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/Field$Kind;->forNumber(I)Lcom/google/protobuf/Field$Kind;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getKindValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNumber()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 2
    .line 3
    return p0
.end method

.method public getOneofIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 2
    .line 3
    return p0
.end method

.method public getOptions(I)Lcom/google/protobuf/Option;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Option;

    .line 8
    .line 9
    return-object p0
.end method

.method public getOptionsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getOptionsList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/Option;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOptionsOrBuilder(I)Lcom/google/protobuf/飘花落叶言世哲楪苏子兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言世哲楪苏子兰;

    .line 8
    .line 9
    return-object p0
.end method

.method public getOptionsOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5b50\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPacked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 8
    .line 9
    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/protobuf/Field$Kind;->getNumber()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_0
    iget v1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 28
    .line 29
    sget-object v3, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/google/protobuf/Field$Cardinality;->getNumber()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    iget v3, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 39
    .line 40
    invoke-static {v1, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    :cond_2
    iget v1, p0, Lcom/google/protobuf/Field;->number_:I

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-static {v3, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    :cond_3
    iget-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    iget-object v3, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v1, v3}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v0, v1

    .line 71
    :cond_4
    iget-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_5

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    iget-object v3, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {v1, v3}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v0, v1

    .line 87
    :cond_5
    iget v1, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    const/4 v3, 0x7

    .line 92
    invoke-static {v3, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    :cond_6
    iget-boolean v1, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 98
    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    const/16 v1, 0x8

    .line 102
    .line 103
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/2addr v0, v1

    .line 108
    :cond_7
    iget-object v1, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    :goto_1
    if-ge v2, v1, :cond_8

    .line 115
    .line 116
    iget-object v3, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 123
    .line 124
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    add-int/2addr v0, v3

    .line 129
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    add-int/2addr v0, v1

    .line 133
    iget-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_9

    .line 140
    .line 141
    const/16 v1, 0xa

    .line 142
    .line 143
    iget-object v2, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/2addr v0, v1

    .line 150
    :cond_9
    iget-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_a

    .line 157
    .line 158
    const/16 v1, 0xb

    .line 159
    .line 160
    iget-object v2, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    add-int/2addr v0, v1

    .line 167
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    add-int/2addr v1, v0

    .line 176
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 177
    .line 178
    return v1
.end method

.method public getTypeUrl()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getTypeUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/protobuf/Field;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit16 v0, v0, 0x30b

    .line 15
    .line 16
    const/16 v1, 0x25

    .line 17
    .line 18
    mul-int/2addr v0, v1

    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    const/16 v2, 0x35

    .line 22
    .line 23
    mul-int/2addr v0, v2

    .line 24
    iget v3, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    mul-int/2addr v0, v1

    .line 28
    add-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    mul-int/2addr v0, v2

    .line 31
    iget v3, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 32
    .line 33
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    add-int/lit8 v0, v0, 0x3

    .line 36
    .line 37
    mul-int/2addr v0, v2

    .line 38
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNumber()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v0

    .line 43
    mul-int/2addr v3, v1

    .line 44
    add-int/lit8 v3, v3, 0x4

    .line 45
    .line 46
    mul-int/2addr v3, v2

    .line 47
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v3

    .line 56
    mul-int/2addr v0, v1

    .line 57
    add-int/lit8 v0, v0, 0x6

    .line 58
    .line 59
    mul-int/2addr v0, v2

    .line 60
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/2addr v3, v0

    .line 69
    mul-int/2addr v3, v1

    .line 70
    add-int/lit8 v3, v3, 0x7

    .line 71
    .line 72
    mul-int/2addr v3, v2

    .line 73
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOneofIndex()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    add-int/2addr v0, v3

    .line 78
    mul-int/2addr v0, v1

    .line 79
    add-int/lit8 v0, v0, 0x8

    .line 80
    .line 81
    mul-int/2addr v0, v2

    .line 82
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getPacked()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v3, v0

    .line 91
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsCount()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-lez v0, :cond_1

    .line 96
    .line 97
    const/16 v0, 0x9

    .line 98
    .line 99
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    add-int/2addr v3, v0

    .line 112
    :cond_1
    const/16 v0, 0xa

    .line 113
    .line 114
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    add-int/2addr v3, v0

    .line 127
    mul-int/2addr v3, v1

    .line 128
    add-int/lit8 v3, v3, 0xb

    .line 129
    .line 130
    mul-int/2addr v3, v2

    .line 131
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    add-int/2addr v0, v3

    .line 140
    mul-int/lit8 v0, v0, 0x1d

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    add-int/2addr v1, v0

    .line 151
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 152
    .line 153
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言苏子世哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Field;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/Field;->newBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言楪苏世兰子哲;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->newBuilderForType()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->newBuilderForType()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Field;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言楪苏世兰子哲;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言楪苏世兰子哲;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/protobuf/Field$Kind;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 18
    .line 19
    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/google/protobuf/Field$Cardinality;->getNumber()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    iget v1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x4

    .line 50
    iget-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    const/4 v0, 0x6

    .line 64
    iget-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    const/4 v1, 0x7

    .line 74
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 75
    .line 76
    .line 77
    :cond_5
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    const/16 v1, 0x8

    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 84
    .line 85
    .line 86
    :cond_6
    const/4 v0, 0x0

    .line 87
    :goto_0
    iget-object v1, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-ge v0, v1, :cond_7

    .line 94
    .line 95
    iget-object v1, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 102
    .line 103
    const/16 v2, 0x9

    .line 104
    .line 105
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    const/16 v0, 0xa

    .line 120
    .line 121
    iget-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_8
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_9

    .line 133
    .line 134
    const/16 v0, 0xb

    .line 135
    .line 136
    iget-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
