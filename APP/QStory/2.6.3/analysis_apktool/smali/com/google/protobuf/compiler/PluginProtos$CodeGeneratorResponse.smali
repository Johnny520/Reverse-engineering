.class public final Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/compiler/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;,
        Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;,
        Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$Feature;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

.field public static final ERROR_FIELD_NUMBER:I = 0x1

.field public static final FILE_FIELD_NUMBER:I = 0xf

.field public static final MAXIMUM_EDITION_FIELD_NUMBER:I = 0x4

.field public static final MINIMUM_EDITION_FIELD_NUMBER:I = 0x3

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final SUPPORTED_FEATURES_FIELD_NUMBER:I = 0x2

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private volatile error_:Ljava/lang/Object;

.field private file_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;",
            ">;"
        }
    .end annotation
.end field

.field private maximumEdition_:I

.field private memoizedIsInitialized:B

.field private minimumEdition_:I

.field private supportedFeatures_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "CodeGeneratorResponse"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/compiler/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

    .line 14
    .line 15
    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput-byte v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->memoizedIsInitialized:B

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    .line 28
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 29
    iput-wide v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

    .line 31
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    const/4 p1, -0x1

    .line 32
    iput-byte p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4002(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$4100(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4102(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$4202(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$4302(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$4402(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$4576(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$4600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

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
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

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
    check-cast p1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasError()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasError()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasError()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getError()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getError()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    return v3

    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasSupportedFeatures()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasSupportedFeatures()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eq v1, v2, :cond_4

    .line 58
    .line 59
    return v3

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasSupportedFeatures()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getSupportedFeatures()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getSupportedFeatures()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    cmp-long v1, v1, v4

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    return v3

    .line 79
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMinimumEdition()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMinimumEdition()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eq v1, v2, :cond_6

    .line 88
    .line 89
    return v3

    .line 90
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMinimumEdition()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMinimumEdition()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMinimumEdition()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eq v1, v2, :cond_7

    .line 105
    .line 106
    return v3

    .line 107
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMaximumEdition()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMaximumEdition()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eq v1, v2, :cond_8

    .line 116
    .line 117
    return v3

    .line 118
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMaximumEdition()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMaximumEdition()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMaximumEdition()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eq v1, v2, :cond_9

    .line 133
    .line 134
    return v3

    .line 135
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getFileList()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getFileList()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    return v3

    .line 150
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_b

    .line 163
    .line 164
    return v3

    .line 165
    :cond_b
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

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
    sget-object p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getError()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

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
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getErrorBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

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

.method public getFile(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFileCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

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

.method public getFileList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFileOrBuilder(I)L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFileOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u82cf\u5b50\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaximumEdition()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinimumEdition()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

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
    sget-object p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-wide v4, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    .line 29
    .line 30
    invoke-static {v3, v4, v5}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏世兰(IJ)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget v4, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

    .line 43
    .line 44
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 50
    .line 51
    and-int/lit8 v1, v1, 0x8

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    .line 56
    .line 57
    invoke-static {v3, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    :goto_1
    if-ge v2, v1, :cond_5

    .line 69
    .line 70
    iget-object v3, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 77
    .line 78
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    add-int/2addr v0, v3

    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    add-int/2addr v0, v1

    .line 87
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-int/2addr v1, v0

    .line 96
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 97
    .line 98
    return v1
.end method

.method public getSupportedFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasError()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

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

.method public hasMaximumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasMinimumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasSupportedFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hashCode()I
    .locals 6

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
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasError()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x35

    .line 21
    .line 22
    const/16 v3, 0x25

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getError()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasSupportedFeatures()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getSupportedFeatures()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-static {v4, v5}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲兰苏(J)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v0, v1

    .line 60
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMinimumEdition()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMinimumEdition()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v0, v1

    .line 76
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMaximumEdition()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMaximumEdition()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getFileCount()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-lez v1, :cond_5

    .line 97
    .line 98
    const/16 v1, 0xf

    .line 99
    .line 100
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getFileList()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    add-int/2addr v0, v1

    .line 113
    :cond_5
    mul-int/lit8 v0, v0, 0x1d

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    add-int/2addr v1, v0

    .line 124
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 125
    .line 126
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

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
    iget-byte v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->newBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->newBuilderForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->DEFAULT_INSTANCE:Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->toBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->error_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    and-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->supportedFeatures_:J

    .line 19
    .line 20
    invoke-virtual {p1, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲苏楪兰(IJ)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    and-int/2addr v0, v1

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    iget v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->minimumEdition_:I

    .line 31
    .line 32
    invoke-virtual {p1, v0, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->bitField0_:I

    .line 36
    .line 37
    and-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->maximumEdition_:I

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 44
    .line 45
    .line 46
    :cond_3
    const/4 v0, 0x0

    .line 47
    :goto_0
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-ge v0, v1, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->file_:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 62
    .line 63
    const/16 v2, 0xf

    .line 64
    .line 65
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
