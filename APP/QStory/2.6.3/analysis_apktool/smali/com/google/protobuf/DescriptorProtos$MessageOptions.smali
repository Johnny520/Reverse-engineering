.class public final Lcom/google/protobuf/DescriptorProtos$MessageOptions;
.super Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子兰苏楪世哲;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$ExtendableMessage<",
        "Lcom/google/protobuf/DescriptorProtos$MessageOptions;",
        ">;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u82cf\u696a\u4e16\u54f2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

.field public static final DEPRECATED_FIELD_NUMBER:I = 0x3

.field public static final DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER:I = 0xb

.field public static final FEATURES_FIELD_NUMBER:I = 0xc

.field public static final MAP_ENTRY_FIELD_NUMBER:I = 0x7

.field public static final MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER:I = 0x1

.field public static final NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER:I = 0x2

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final UNINTERPRETED_OPTION_FIELD_NUMBER:I = 0x3e7

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private deprecatedLegacyJsonFieldConflicts_:Z

.field private deprecated_:Z

.field private features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field private mapEntry_:Z

.field private memoizedIsInitialized:B

.field private messageSetWireFormat_:Z

.field private noStandardDescriptorAccessor_:Z

.field private uninterpretedOption_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "MessageOptions"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言子兰世哲苏楪;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->messageSetWireFormat_:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->noStandardDescriptorAccessor_:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecated_:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->mapEntry_:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    iput-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    .line 17
    .line 18
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            ")V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->messageSetWireFormat_:Z

    .line 25
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->noStandardDescriptorAccessor_:Z

    .line 26
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecated_:Z

    .line 27
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->mapEntry_:Z

    .line 28
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecatedLegacyJsonFieldConflicts_:Z

    const/4 p1, -0x1

    .line 29
    iput-byte p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public static synthetic access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$18802(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$18902(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->messageSetWireFormat_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19002(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->noStandardDescriptorAccessor_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19102(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecated_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19202(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->mapEntry_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19302(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$19402(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$19576(Lcom/google/protobuf/DescriptorProtos$MessageOptions;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

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
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    instance-of v1, p1, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

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
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMessageSetWireFormat()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMessageSetWireFormat()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMessageSetWireFormat()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eq v1, v2, :cond_3

    .line 43
    .line 44
    return v3

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasNoStandardDescriptorAccessor()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasNoStandardDescriptorAccessor()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eq v1, v2, :cond_4

    .line 54
    .line 55
    return v3

    .line 56
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasNoStandardDescriptorAccessor()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getNoStandardDescriptorAccessor()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getNoStandardDescriptorAccessor()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eq v1, v2, :cond_5

    .line 71
    .line 72
    return v3

    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecated()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecated()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eq v1, v2, :cond_6

    .line 82
    .line 83
    return v3

    .line 84
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecated()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_7

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecated()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecated()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eq v1, v2, :cond_7

    .line 99
    .line 100
    return v3

    .line 101
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMapEntry()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMapEntry()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eq v1, v2, :cond_8

    .line 110
    .line 111
    return v3

    .line 112
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMapEntry()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMapEntry()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMapEntry()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eq v1, v2, :cond_9

    .line 127
    .line 128
    return v3

    .line 129
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecatedLegacyJsonFieldConflicts()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecatedLegacyJsonFieldConflicts()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eq v1, v2, :cond_a

    .line 138
    .line 139
    return v3

    .line 140
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecatedLegacyJsonFieldConflicts()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecatedLegacyJsonFieldConflicts()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecatedLegacyJsonFieldConflicts()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eq v1, v2, :cond_b

    .line 155
    .line 156
    return v3

    .line 157
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eq v1, v2, :cond_c

    .line 166
    .line 167
    return v3

    .line 168
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_d

    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_d

    .line 187
    .line 188
    return v3

    .line 189
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_e

    .line 202
    .line 203
    return v3

    .line 204
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v1, v2}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_f

    .line 217
    .line 218
    return v3

    .line 219
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-nez p0, :cond_10

    .line 232
    .line 233
    return v3

    .line 234
    :cond_10
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeprecated()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDeprecatedLegacyJsonFieldConflicts()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I

    move-result p0

    return p0
.end method

.method public getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getFeaturesOrBuilder()Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getMapEntry()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->mapEntry_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getMessageSetWireFormat()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->messageSetWireFormat_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getNoStandardDescriptorAccessor()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->noStandardDescriptorAccessor_:Z

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
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 5

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
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    and-int/2addr v1, v3

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v0, v1

    .line 31
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 32
    .line 33
    and-int/lit8 v1, v1, 0x4

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 44
    .line 45
    and-int/lit8 v1, v1, 0x8

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 56
    .line 57
    and-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    const/16 v1, 0xb

    .line 62
    .line 63
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 69
    .line 70
    and-int/lit8 v1, v1, 0x20

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    const/16 v1, 0xc

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    add-int/2addr v0, v1

    .line 85
    :cond_6
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    :goto_1
    if-ge v2, v1, :cond_7

    .line 92
    .line 93
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 100
    .line 101
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    add-int/2addr v0, v4

    .line 106
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    mul-int/2addr v1, v3

    .line 110
    add-int/2addr v1, v0

    .line 111
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsSerializedSize()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/2addr v0, v1

    .line 116
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    add-int/2addr v1, v0

    .line 125
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 126
    .line 127
    return v1
.end method

.method public getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 8
    .line 9
    return-object p0
.end method

.method public getUninterpretedOptionCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

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

.method public getUninterpretedOptionList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilder(I)Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;

    .line 8
    .line 9
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u82cf\u54f2\u5170\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasDeprecated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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

.method public hasDeprecatedLegacyJsonFieldConflicts()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z

    move-result p0

    return p0
.end method

.method public hasFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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

.method public hasMapEntry()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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

.method public hasMessageSetWireFormat()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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

.method public hasNoStandardDescriptorAccessor()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

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
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMessageSetWireFormat()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasNoStandardDescriptorAccessor()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getNoStandardDescriptorAccessor()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v0, v1

    .line 60
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecated()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecated()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v0, v1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMapEntry()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    const/4 v1, 0x7

    .line 87
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMapEntry()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    add-int/2addr v0, v1

    .line 100
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecatedLegacyJsonFieldConflicts()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    const/16 v1, 0xb

    .line 107
    .line 108
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecatedLegacyJsonFieldConflicts()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    add-int/2addr v0, v1

    .line 121
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    const/16 v1, 0xc

    .line 128
    .line 129
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v0, v1

    .line 142
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOptionCount()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-lez v1, :cond_7

    .line 147
    .line 148
    const/16 v1, 0x3e7

    .line 149
    .line 150
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    add-int/2addr v0, v1

    .line 163
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->hashFields(ILjava/util/Map;)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    mul-int/lit8 v0, v0, 0x1d

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    add-int/2addr v1, v0

    .line 182
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 183
    .line 184
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->isInitialized()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    move v0, v2

    .line 31
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOptionCount()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->isInitialized()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    .line 48
    .line 49
    return v2

    .line 50
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsAreInitialized()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    .line 60
    .line 61
    return v2

    .line 62
    :cond_5
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->memoizedIsInitialized:B

    .line 63
    .line 64
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->newBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->newExtensionSerializer()Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    and-int/2addr v1, v2

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->messageSetWireFormat_:Z

    .line 12
    .line 13
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    and-int/2addr v1, v2

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->noStandardDescriptorAccessor_:Z

    .line 23
    .line 24
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, 0x4

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecated_:Z

    .line 35
    .line 36
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 40
    .line 41
    and-int/lit8 v1, v1, 0x8

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x7

    .line 46
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->mapEntry_:Z

    .line 47
    .line 48
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x10

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/16 v1, 0xb

    .line 58
    .line 59
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 60
    .line 61
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 62
    .line 63
    .line 64
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->bitField0_:I

    .line 65
    .line 66
    and-int/lit8 v1, v1, 0x20

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    const/4 v1, 0x0

    .line 80
    :goto_0
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-ge v1, v2, :cond_6

    .line 87
    .line 88
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->uninterpretedOption_:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 95
    .line 96
    const/16 v3, 0x3e7

    .line 97
    .line 98
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    const/high16 v1, 0x20000000

    .line 105
    .line 106
    invoke-interface {v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;->飘花落叶言子楪世苏哲兰(ILcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
