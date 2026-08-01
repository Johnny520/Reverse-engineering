.class public final Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子兰苏世楪哲;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# static fields
.field public static final CLIENT_STREAMING_FIELD_NUMBER:I = 0x5

.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

.field public static final INPUT_TYPE_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final OPTIONS_FIELD_NUMBER:I = 0x4

.field public static final OUTPUT_TYPE_FIELD_NUMBER:I = 0x3

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final SERVER_STREAMING_FIELD_NUMBER:I = 0x6

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private clientStreaming_:Z

.field private volatile inputType_:Ljava/lang/Object;

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private options_:Lcom/google/protobuf/DescriptorProtos$MethodOptions;

.field private volatile outputType_:Ljava/lang/Object;

.field private serverStreaming_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "MethodDescriptorProto"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言子兰苏楪哲世;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->clientStreaming_:Z

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->serverStreaming_:Z

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->memoizedIsInitialized:B

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 0
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

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 29
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 30
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 31
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->clientStreaming_:Z

    .line 32
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->serverStreaming_:Z

    const/4 p1, -0x1

    .line 33
    iput-byte p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$14900(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$14902(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$15000(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$15002(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$15100(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$15102(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$15202(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Lcom/google/protobuf/DescriptorProtos$MethodOptions;)Lcom/google/protobuf/DescriptorProtos$MethodOptions;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$15302(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->clientStreaming_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$15402(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->serverStreaming_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$15576(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method private computeSerializedSize_0()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    and-int/2addr v1, v2

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v2, v1}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    :cond_1
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    and-int/2addr v1, v2

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v0, v1

    .line 42
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 43
    .line 44
    and-int/lit8 v1, v1, 0x8

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v0, v1

    .line 57
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 58
    .line 59
    and-int/lit8 v1, v1, 0x10

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v0, v1

    .line 69
    :cond_4
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 70
    .line 71
    and-int/lit8 p0, p0, 0x20

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    const/4 p0, 0x6

    .line 76
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    add-int/2addr p0, v0

    .line 81
    return p0

    .line 82
    :cond_5
    return v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪哲苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

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
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    instance-of v1, p1, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

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
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasName()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasName()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasName()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getName()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasInputType()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasInputType()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasInputType()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getInputType()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getInputType()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    return v3

    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOutputType()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOutputType()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eq v1, v2, :cond_6

    .line 90
    .line 91
    return v3

    .line 92
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOutputType()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_7

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOutputType()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOutputType()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_7

    .line 111
    .line 112
    return v3

    .line 113
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOptions()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOptions()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eq v1, v2, :cond_8

    .line 122
    .line 123
    return v3

    .line 124
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOptions()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_9

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_9

    .line 143
    .line 144
    return v3

    .line 145
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasClientStreaming()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasClientStreaming()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eq v1, v2, :cond_a

    .line 154
    .line 155
    return v3

    .line 156
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasClientStreaming()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_b

    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getClientStreaming()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getClientStreaming()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eq v1, v2, :cond_b

    .line 171
    .line 172
    return v3

    .line 173
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasServerStreaming()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasServerStreaming()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eq v1, v2, :cond_c

    .line 182
    .line 183
    return v3

    .line 184
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasServerStreaming()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_d

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getServerStreaming()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getServerStreaming()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eq v1, v2, :cond_d

    .line 199
    .line 200
    return v3

    .line 201
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-nez p0, :cond_e

    .line 214
    .line 215
    return v3

    .line 216
    :cond_e
    return v0
.end method

.method public getClientStreaming()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->clientStreaming_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪哲苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInputType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getInputTypeBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

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

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

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

.method public getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getOptionsOrBuilder()Lcom/google/protobuf/飘花落叶言子兰苏哲世楪;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getOutputType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getOutputTypeBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

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

.method public getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 2

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->computeSerializedSize_0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 21
    .line 22
    return v1
.end method

.method public getServerStreaming()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->serverStreaming_:Z

    .line 2
    .line 3
    return p0
.end method

.method public hasClientStreaming()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x10

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

.method public hasInputType()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

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

.method public hasName()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

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

.method public hasOptions()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

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

.method public hasOutputType()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

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

.method public hasServerStreaming()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x20

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
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasName()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getName()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasInputType()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getInputType()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v0, v1

    .line 60
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOutputType()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOutputType()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v0, v1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOptions()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    const/4 v1, 0x4

    .line 87
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    add-int/2addr v0, v1

    .line 100
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasClientStreaming()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    const/4 v1, 0x5

    .line 107
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getClientStreaming()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    add-int/2addr v0, v1

    .line 120
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasServerStreaming()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    const/4 v1, 0x6

    .line 127
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getServerStreaming()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    add-int/2addr v0, v1

    .line 140
    :cond_6
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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪哲兰苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->memoizedIsInitialized:B

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
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->hasOptions()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->isInitialized()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->memoizedIsInitialized:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->memoizedIsInitialized:B

    .line 31
    .line 32
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->newBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    and-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->inputType_:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

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
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->outputType_:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1, v0, v2}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 36
    .line 37
    and-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 49
    .line 50
    and-int/lit8 v0, v0, 0x10

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->clientStreaming_:Z

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 58
    .line 59
    .line 60
    :cond_4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->bitField0_:I

    .line 61
    .line 62
    and-int/lit8 v0, v0, 0x20

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    const/4 v0, 0x6

    .line 67
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->serverStreaming_:Z

    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
