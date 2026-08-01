.class public final Lcom/google/protobuf/Api;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子楪哲世苏兰;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

.field public static final EDITION_FIELD_NUMBER:I = 0x8

.field public static final METHODS_FIELD_NUMBER:I = 0x2

.field public static final MIXINS_FIELD_NUMBER:I = 0x6

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final OPTIONS_FIELD_NUMBER:I = 0x3

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final SOURCE_CONTEXT_FIELD_NUMBER:I = 0x5

.field public static final SYNTAX_FIELD_NUMBER:I = 0x7

.field public static final VERSION_FIELD_NUMBER:I = 0x4

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private volatile edition_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private methods_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/Method;",
            ">;"
        }
    .end annotation
.end field

.field private mixins_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/Mixin;",
            ">;"
        }
    .end annotation
.end field

.field private volatile name_:Ljava/lang/Object;

.field private options_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/Option;",
            ">;"
        }
    .end annotation
.end field

.field private sourceContext_:Lcom/google/protobuf/SourceContext;

.field private syntax_:I

.field private volatile version_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "Api"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/Api;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/Api;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    iput-byte v2, p0, Lcom/google/protobuf/Api;->memoizedIsInitialized:B

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    iput-object v2, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 23
    .line 24
    iput-object v2, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v2, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 29
    .line 30
    iput v1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 33
    .line 34
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

    .line 35
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    .line 36
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 37
    iput-object p1, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 39
    iput-object p1, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 40
    iput-byte p1, p0, Lcom/google/protobuf/Api;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/google/protobuf/Api;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$1000(Lcom/google/protobuf/Api;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1002(Lcom/google/protobuf/Api;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1176(Lcom/google/protobuf/Api;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/Api;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/Api;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$300(Lcom/google/protobuf/Api;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Lcom/google/protobuf/Api;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Lcom/google/protobuf/Api;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$402(Lcom/google/protobuf/Api;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$500(Lcom/google/protobuf/Api;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$502(Lcom/google/protobuf/Api;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$600(Lcom/google/protobuf/Api;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$602(Lcom/google/protobuf/Api;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$700(Lcom/google/protobuf/Api;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$702(Lcom/google/protobuf/Api;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$802(Lcom/google/protobuf/Api;Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Api;->sourceContext_:Lcom/google/protobuf/SourceContext;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$900(Lcom/google/protobuf/Api;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$902(Lcom/google/protobuf/Api;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 2
    .line 3
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Api;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    invoke-virtual {v0}, Lcom/google/protobuf/Api;->toBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Api;)Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/Api;->toBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Api;)Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Api;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Api;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Api;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/Api;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Api;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Api;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/Api;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Api;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Api;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/Api;

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
    sget-object v0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    instance-of v1, p1, Lcom/google/protobuf/Api;

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
    check-cast p1, Lcom/google/protobuf/Api;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMethodsList()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getMethodsList()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getOptionsList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getOptionsList()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    return v2

    .line 62
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getVersion()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getVersion()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    return v2

    .line 77
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->hasSourceContext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->hasSourceContext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eq v1, v3, :cond_6

    .line 86
    .line 87
    return v2

    .line 88
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->hasSourceContext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getSourceContext()Lcom/google/protobuf/SourceContext;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getSourceContext()Lcom/google/protobuf/SourceContext;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v1, v3}, Lcom/google/protobuf/SourceContext;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_7

    .line 107
    .line 108
    return v2

    .line 109
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMixinsList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getMixinsList()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_8

    .line 122
    .line 123
    return v2

    .line 124
    :cond_8
    iget v1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 125
    .line 126
    iget v3, p1, Lcom/google/protobuf/Api;->syntax_:I

    .line 127
    .line 128
    if-eq v1, v3, :cond_9

    .line 129
    .line 130
    return v2

    .line 131
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getEdition()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p1}, Lcom/google/protobuf/Api;->getEdition()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_a

    .line 144
    .line 145
    return v2

    .line 146
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-nez p0, :cond_b

    .line 159
    .line 160
    return v2

    .line 161
    :cond_b
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Api;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getDefaultInstanceForType()Lcom/google/protobuf/Api;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getDefaultInstanceForType()Lcom/google/protobuf/Api;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEdition()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getEditionBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

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

.method public getMethods(I)Lcom/google/protobuf/Method;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Method;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMethodsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

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

.method public getMethodsList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/Method;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethodsOrBuilder(I)Lcom/google/protobuf/飘花落叶言世苏兰哲楪子;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏兰哲楪子;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMethodsOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u696a\u5b50;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMixins(I)Lcom/google/protobuf/Mixin;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Mixin;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMixinsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

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

.method public getMixinsList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/Mixin;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMixinsOrBuilder(I)Lcom/google/protobuf/飘花落叶言世哲子楪兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言世哲子楪兰苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMixinsOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u5170\u82cf;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

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

.method public getOptions(I)Lcom/google/protobuf/Option;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOptionsOrBuilder(I)Lcom/google/protobuf/飘花落叶言世哲楪苏子兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
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
    sget-object p0, Lcom/google/protobuf/Api;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 6

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
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v2, v0}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    move v4, v1

    .line 32
    :goto_1
    if-ge v4, v3, :cond_2

    .line 33
    .line 34
    iget-object v5, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 41
    .line 42
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    add-int/2addr v0, v5

    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    add-int/2addr v0, v3

    .line 51
    iget-object v3, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    move v4, v1

    .line 58
    :goto_2
    if-ge v4, v3, :cond_3

    .line 59
    .line 60
    iget-object v5, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 67
    .line 68
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    add-int/2addr v0, v5

    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    add-int/2addr v0, v3

    .line 77
    iget-object v3, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v3}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    const/4 v3, 0x4

    .line 86
    iget-object v4, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v3, v4}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    add-int/2addr v0, v3

    .line 93
    :cond_4
    iget v3, p0, Lcom/google/protobuf/Api;->bitField0_:I

    .line 94
    .line 95
    and-int/2addr v2, v3

    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    const/4 v2, 0x5

    .line 99
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getSourceContext()Lcom/google/protobuf/SourceContext;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v2, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    add-int/2addr v0, v2

    .line 108
    :cond_5
    iget-object v2, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    :goto_3
    if-ge v1, v2, :cond_6

    .line 115
    .line 116
    iget-object v3, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

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
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    add-int/2addr v0, v2

    .line 133
    iget v1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 134
    .line 135
    sget-object v2, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/google/protobuf/Syntax;->getNumber()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eq v1, v2, :cond_7

    .line 142
    .line 143
    const/4 v1, 0x7

    .line 144
    iget v2, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 145
    .line 146
    invoke-static {v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    add-int/2addr v0, v1

    .line 151
    :cond_7
    iget-object v1, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_8

    .line 158
    .line 159
    const/16 v1, 0x8

    .line 160
    .line 161
    iget-object v2, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    add-int/2addr v0, v1

    .line 168
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    add-int/2addr v1, v0

    .line 177
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 178
    .line 179
    return v1
.end method

.method public getSourceContext()Lcom/google/protobuf/SourceContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->sourceContext_:Lcom/google/protobuf/SourceContext;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getSourceContextOrBuilder()Lcom/google/protobuf/飘花落叶言世兰苏子楪哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Api;->sourceContext_:Lcom/google/protobuf/SourceContext;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getSyntax()Lcom/google/protobuf/Syntax;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/Syntax;->forNumber(I)Lcom/google/protobuf/Syntax;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/Syntax;->UNRECOGNIZED:Lcom/google/protobuf/Syntax;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getSyntaxValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 2
    .line 3
    return p0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getVersionBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

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

.method public hasSourceContext()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Api;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
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
    invoke-static {}, Lcom/google/protobuf/Api;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    add-int/2addr v3, v0

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMethodsCount()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMethodsList()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/2addr v3, v0

    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getOptionsCount()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-lez v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x3

    .line 60
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getOptionsList()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    add-int/2addr v3, v0

    .line 73
    :cond_2
    const/4 v0, 0x4

    .line 74
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getVersion()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/2addr v3, v0

    .line 87
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->hasSourceContext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    const/4 v0, 0x5

    .line 94
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getSourceContext()Lcom/google/protobuf/SourceContext;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, Lcom/google/protobuf/SourceContext;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    add-int/2addr v3, v0

    .line 107
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMixinsCount()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-lez v0, :cond_4

    .line 112
    .line 113
    const/4 v0, 0x6

    .line 114
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getMixinsList()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    add-int/2addr v3, v0

    .line 127
    :cond_4
    const/4 v0, 0x7

    .line 128
    invoke-static {v3, v1, v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v3, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 133
    .line 134
    add-int/2addr v0, v3

    .line 135
    mul-int/2addr v0, v1

    .line 136
    add-int/lit8 v0, v0, 0x8

    .line 137
    .line 138
    mul-int/2addr v0, v2

    .line 139
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getEdition()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v1, v0

    .line 148
    mul-int/lit8 v1, v1, 0x1d

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    add-int/2addr v0, v1

    .line 159
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 160
    .line 161
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Api;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

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
    iget-byte v0, p0, Lcom/google/protobuf/Api;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/google/protobuf/Api;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/Api;->newBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子楪苏兰哲世;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->newBuilderForType()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->newBuilderForType()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Api;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Api;->DEFAULT_INSTANCE:Lcom/google/protobuf/Api;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪苏兰哲世;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪苏兰哲世;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Api;)Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->toBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->toBuilder()Lcom/google/protobuf/Api$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/protobuf/Api;->name_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    move v2, v0

    .line 17
    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v2, v3, :cond_1

    .line 24
    .line 25
    iget-object v3, p0, Lcom/google/protobuf/Api;->methods_:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v2, v0

    .line 41
    :goto_1
    iget-object v3, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v2, v3, :cond_2

    .line 48
    .line 49
    iget-object v3, p0, Lcom/google/protobuf/Api;->options_:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget-object v2, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    const/4 v2, 0x4

    .line 73
    iget-object v3, p0, Lcom/google/protobuf/Api;->version_:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget v2, p0, Lcom/google/protobuf/Api;->bitField0_:I

    .line 79
    .line 80
    and-int/2addr v1, v2

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    const/4 v1, 0x5

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/Api;->getSourceContext()Lcom/google/protobuf/SourceContext;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-ge v0, v1, :cond_5

    .line 98
    .line 99
    iget-object v1, p0, Lcom/google/protobuf/Api;->mixins_:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 106
    .line 107
    const/4 v2, 0x6

    .line 108
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    iget v0, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 115
    .line 116
    sget-object v1, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/google/protobuf/Syntax;->getNumber()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eq v0, v1, :cond_6

    .line 123
    .line 124
    const/4 v0, 0x7

    .line 125
    iget v1, p0, Lcom/google/protobuf/Api;->syntax_:I

    .line 126
    .line 127
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 128
    .line 129
    .line 130
    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    const/16 v0, 0x8

    .line 139
    .line 140
    iget-object v1, p0, Lcom/google/protobuf/Api;->edition_:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method
