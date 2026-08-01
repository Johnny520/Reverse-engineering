.class public final Lcom/google/protobuf/DescriptorProtos$FieldOptions;
.super Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子哲兰苏楪世;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;,
        Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$ExtendableMessage<",
        "Lcom/google/protobuf/DescriptorProtos$FieldOptions;",
        ">;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u82cf\u696a\u4e16;"
    }
.end annotation


# static fields
.field public static final CTYPE_FIELD_NUMBER:I = 0x1

.field public static final DEBUG_REDACT_FIELD_NUMBER:I = 0x10

.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

.field public static final DEPRECATED_FIELD_NUMBER:I = 0x3

.field public static final EDITION_DEFAULTS_FIELD_NUMBER:I = 0x14

.field public static final FEATURES_FIELD_NUMBER:I = 0x15

.field public static final FEATURE_SUPPORT_FIELD_NUMBER:I = 0x16

.field public static final JSTYPE_FIELD_NUMBER:I = 0x6

.field public static final LAZY_FIELD_NUMBER:I = 0x5

.field public static final PACKED_FIELD_NUMBER:I = 0x2

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final RETENTION_FIELD_NUMBER:I = 0x11

.field public static final TARGETS_FIELD_NUMBER:I = 0x13

.field public static final UNINTERPRETED_OPTION_FIELD_NUMBER:I = 0x3e7

.field public static final UNVERIFIED_LAZY_FIELD_NUMBER:I = 0xf

.field public static final WEAK_FIELD_NUMBER:I = 0xa

.field private static final serialVersionUID:J

.field private static final targets_converter_:Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u696a\u54f2\u5170;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private ctype_:I

.field private debugRedact_:Z

.field private deprecated_:Z

.field private editionDefaults_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;",
            ">;"
        }
    .end annotation
.end field

.field private featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

.field private features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field private jstype_:I

.field private lazy_:Z

.field private memoizedIsInitialized:B

.field private packed_:Z

.field private retention_:I

.field private targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

.field private uninterpretedOption_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation
.end field

.field private unverifiedLazy_:Z

.field private weak_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "FieldOptions"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/飘花落叶言子哲苏楪世兰;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_converter_:Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 21
    .line 22
    new-instance v0, Lcom/google/protobuf/飘花落叶言子哲苏楪兰世;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 28
    .line 29
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->packed_:Z

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->lazy_:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->unverifiedLazy_:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->deprecated_:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->weak_:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->debugRedact_:Z

    .line 20
    .line 21
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 22
    .line 23
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

    .line 31
    .line 32
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 33
    .line 34
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 35
    .line 36
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 37
    .line 38
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 43
    .line 44
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 49
    .line 50
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

    .line 51
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 52
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 53
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->packed_:Z

    .line 54
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 55
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->lazy_:Z

    .line 56
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->unverifiedLazy_:Z

    .line 57
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->deprecated_:Z

    .line 58
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->weak_:Z

    .line 59
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->debugRedact_:Z

    .line 60
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 61
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    const/4 p1, -0x1

    .line 62
    iput-byte p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public static synthetic access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$22002(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$22102(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$22202(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22302(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->packed_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22402(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22502(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->lazy_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22602(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->unverifiedLazy_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22702(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->deprecated_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22802(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->weak_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22902(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->debugRedact_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$23002(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$23100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$23102(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$23202(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$23302(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$23476(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic access$23500()Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_converter_:Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

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
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    instance-of v1, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

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
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasCtype()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasCtype()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasCtype()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 35
    .line 36
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 37
    .line 38
    if-eq v1, v2, :cond_3

    .line 39
    .line 40
    return v3

    .line 41
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasPacked()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasPacked()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eq v1, v2, :cond_4

    .line 50
    .line 51
    return v3

    .line 52
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasPacked()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getPacked()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getPacked()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eq v1, v2, :cond_5

    .line 67
    .line 68
    return v3

    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasJstype()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasJstype()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eq v1, v2, :cond_6

    .line 78
    .line 79
    return v3

    .line 80
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasJstype()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 87
    .line 88
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 89
    .line 90
    if-eq v1, v2, :cond_7

    .line 91
    .line 92
    return v3

    .line 93
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasLazy()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasLazy()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eq v1, v2, :cond_8

    .line 102
    .line 103
    return v3

    .line 104
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasLazy()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_9

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getLazy()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getLazy()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eq v1, v2, :cond_9

    .line 119
    .line 120
    return v3

    .line 121
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasUnverifiedLazy()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasUnverifiedLazy()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eq v1, v2, :cond_a

    .line 130
    .line 131
    return v3

    .line 132
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasUnverifiedLazy()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_b

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUnverifiedLazy()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUnverifiedLazy()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eq v1, v2, :cond_b

    .line 147
    .line 148
    return v3

    .line 149
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDeprecated()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDeprecated()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eq v1, v2, :cond_c

    .line 158
    .line 159
    return v3

    .line 160
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDeprecated()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_d

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDeprecated()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDeprecated()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eq v1, v2, :cond_d

    .line 175
    .line 176
    return v3

    .line 177
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasWeak()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasWeak()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eq v1, v2, :cond_e

    .line 186
    .line 187
    return v3

    .line 188
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasWeak()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_f

    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getWeak()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getWeak()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eq v1, v2, :cond_f

    .line 203
    .line 204
    return v3

    .line 205
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDebugRedact()Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDebugRedact()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eq v1, v2, :cond_10

    .line 214
    .line 215
    return v3

    .line 216
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDebugRedact()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_11

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDebugRedact()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDebugRedact()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eq v1, v2, :cond_11

    .line 231
    .line 232
    return v3

    .line 233
    :cond_11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasRetention()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasRetention()Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eq v1, v2, :cond_12

    .line 242
    .line 243
    return v3

    .line 244
    :cond_12
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasRetention()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_13

    .line 249
    .line 250
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 251
    .line 252
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 253
    .line 254
    if-eq v1, v2, :cond_13

    .line 255
    .line 256
    return v3

    .line 257
    :cond_13
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 258
    .line 259
    iget-object v2, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 260
    .line 261
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_14

    .line 266
    .line 267
    return v3

    .line 268
    :cond_14
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getEditionDefaultsList()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getEditionDefaultsList()Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-nez v1, :cond_15

    .line 281
    .line 282
    return v3

    .line 283
    :cond_15
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eq v1, v2, :cond_16

    .line 292
    .line 293
    return v3

    .line 294
    :cond_16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_17

    .line 299
    .line 300
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-nez v1, :cond_17

    .line 313
    .line 314
    return v3

    .line 315
    :cond_17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatureSupport()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatureSupport()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eq v1, v2, :cond_18

    .line 324
    .line 325
    return v3

    .line 326
    :cond_18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatureSupport()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_19

    .line 331
    .line 332
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-nez v1, :cond_19

    .line 345
    .line 346
    return v3

    .line 347
    :cond_19
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-nez v1, :cond_1a

    .line 360
    .line 361
    return v3

    .line 362
    :cond_1a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v1, v2}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-nez v1, :cond_1b

    .line 375
    .line 376
    return v3

    .line 377
    :cond_1b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result p0

    .line 389
    if-nez p0, :cond_1c

    .line 390
    .line 391
    return v3

    .line 392
    :cond_1c
    return v0
.end method

.method public getCtype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->STRING:Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getDebugRedact()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->debugRedact_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

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
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->deprecated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEditionDefaults(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 8
    .line 9
    return-object p0
.end method

.method public getEditionDefaultsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

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

.method public getEditionDefaultsList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEditionDefaultsOrBuilder(I)Lcom/google/protobuf/飘花落叶言子哲苏兰楪世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲苏兰楪世;

    .line 8
    .line 9
    return-object p0
.end method

.method public getEditionDefaultsOrBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u5170\u696a\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

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

.method public getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getFeatureSupportOrBuilder()Lcom/google/protobuf/飘花落叶言子哲兰楪世苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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

.method public getJstype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->JS_NORMAL:Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getLazy()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->lazy_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getPacked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->packed_:Z

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
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetention()Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->RETENTION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 7

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
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

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
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 34
    .line 35
    and-int/lit8 v1, v1, 0x20

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 46
    .line 47
    and-int/lit8 v1, v1, 0x8

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v0, v1

    .line 57
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 58
    .line 59
    and-int/lit8 v1, v1, 0x4

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    const/4 v1, 0x6

    .line 64
    iget v4, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 65
    .line 66
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v0, v1

    .line 71
    :cond_5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 72
    .line 73
    and-int/lit8 v1, v1, 0x40

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    const/16 v1, 0xa

    .line 78
    .line 79
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v0, v1

    .line 84
    :cond_6
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 85
    .line 86
    const/16 v4, 0x10

    .line 87
    .line 88
    and-int/2addr v1, v4

    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    const/16 v1, 0xf

    .line 92
    .line 93
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    add-int/2addr v0, v1

    .line 98
    :cond_7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 99
    .line 100
    and-int/lit16 v1, v1, 0x80

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    add-int/2addr v0, v1

    .line 109
    :cond_8
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 110
    .line 111
    and-int/lit16 v1, v1, 0x100

    .line 112
    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    const/16 v1, 0x11

    .line 116
    .line 117
    iget v4, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 118
    .line 119
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    add-int/2addr v0, v1

    .line 124
    :cond_9
    move v1, v2

    .line 125
    move v4, v1

    .line 126
    :goto_1
    iget-object v5, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 127
    .line 128
    check-cast v5, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 129
    .line 130
    iget v6, v5, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪哲兰苏世:I

    .line 131
    .line 132
    if-ge v1, v6, :cond_a

    .line 133
    .line 134
    invoke-virtual {v5, v1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪苏世哲兰(I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    int-to-long v5, v5

    .line 139
    invoke-static {v5, v6}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    add-int/2addr v4, v5

    .line 144
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_a
    add-int/2addr v0, v4

    .line 148
    mul-int/2addr v6, v3

    .line 149
    add-int/2addr v6, v0

    .line 150
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    move v1, v2

    .line 157
    :goto_2
    if-ge v1, v0, :cond_b

    .line 158
    .line 159
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 166
    .line 167
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    add-int/2addr v6, v4

    .line 172
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_b
    mul-int/2addr v0, v3

    .line 176
    add-int/2addr v0, v6

    .line 177
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 178
    .line 179
    and-int/lit16 v1, v1, 0x200

    .line 180
    .line 181
    if-eqz v1, :cond_c

    .line 182
    .line 183
    const/16 v1, 0x15

    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    add-int/2addr v0, v1

    .line 194
    :cond_c
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 195
    .line 196
    and-int/lit16 v1, v1, 0x400

    .line 197
    .line 198
    if-eqz v1, :cond_d

    .line 199
    .line 200
    const/16 v1, 0x16

    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v1, v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    add-int/2addr v0, v1

    .line 211
    :cond_d
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    :goto_3
    if-ge v2, v1, :cond_e

    .line 218
    .line 219
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 226
    .line 227
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    add-int/2addr v0, v4

    .line 232
    add-int/lit8 v2, v2, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_e
    mul-int/2addr v1, v3

    .line 236
    add-int/2addr v1, v0

    .line 237
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsSerializedSize()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    add-int/2addr v0, v1

    .line 242
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    add-int/2addr v1, v0

    .line 251
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 252
    .line 253
    return v1
.end method

.method public getTargets(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_converter_:Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 4
    .line 5
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪苏世哲兰(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    check-cast v0, Lcom/google/protobuf/飘花落叶言子哲苏楪世兰;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->TARGET_TYPE_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public getTargetsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getTargetsList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世子苏楪兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 4
    .line 5
    sget-object v1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_converter_:Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言世子苏楪兰哲;-><init>(Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilder(I)Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUnverifiedLazy()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->unverifiedLazy_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getWeak()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->weak_:Z

    .line 2
    .line 3
    return p0
.end method

.method public hasCtype()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasDebugRedact()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x80

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

.method public hasDeprecated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasFeatureSupport()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x400

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

.method public hasFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x200

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

.method public hasJstype()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasLazy()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasPacked()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasRetention()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x100

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

.method public hasUnverifiedLazy()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

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

.method public hasWeak()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x40

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
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasCtype()Z

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
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasPacked()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getPacked()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasJstype()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    const/4 v1, 0x6

    .line 61
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 66
    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasLazy()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    const/4 v1, 0x5

    .line 75
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getLazy()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasUnverifiedLazy()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    const/16 v1, 0xf

    .line 95
    .line 96
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUnverifiedLazy()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    add-int/2addr v0, v1

    .line 109
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDeprecated()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    const/4 v1, 0x3

    .line 116
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDeprecated()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    add-int/2addr v0, v1

    .line 129
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasWeak()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    const/16 v1, 0xa

    .line 136
    .line 137
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getWeak()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/2addr v0, v1

    .line 150
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDebugRedact()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_8

    .line 155
    .line 156
    const/16 v1, 0x10

    .line 157
    .line 158
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDebugRedact()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    add-int/2addr v0, v1

    .line 171
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasRetention()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    const/16 v1, 0x11

    .line 178
    .line 179
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 184
    .line 185
    add-int/2addr v0, v1

    .line 186
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getTargetsCount()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-lez v1, :cond_a

    .line 191
    .line 192
    const/16 v1, 0x13

    .line 193
    .line 194
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    add-int/2addr v0, v1

    .line 205
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getEditionDefaultsCount()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-lez v1, :cond_b

    .line 210
    .line 211
    const/16 v1, 0x14

    .line 212
    .line 213
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getEditionDefaultsList()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    add-int/2addr v0, v1

    .line 226
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_c

    .line 231
    .line 232
    const/16 v1, 0x15

    .line 233
    .line 234
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    add-int/2addr v0, v1

    .line 247
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatureSupport()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_d

    .line 252
    .line 253
    const/16 v1, 0x16

    .line 254
    .line 255
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hashCode()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-int/2addr v0, v1

    .line 268
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOptionCount()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-lez v1, :cond_e

    .line 273
    .line 274
    const/16 v1, 0x3e7

    .line 275
    .line 276
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOptionList()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    add-int/2addr v0, v1

    .line 289
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->hashFields(ILjava/util/Map;)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    mul-int/lit8 v0, v0, 0x1d

    .line 298
    .line 299
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    add-int/2addr v1, v0

    .line 308
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 309
    .line 310
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲兰楪:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

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
    iget-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    move v0, v2

    .line 31
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOptionCount()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

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
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

    .line 60
    .line 61
    return v2

    .line 62
    :cond_5
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->memoizedIsInitialized:B

    .line 63
    .line 64
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->newBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->newExtensionSerializer()Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    and-int/2addr v1, v2

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->ctype_:I

    .line 12
    .line 13
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    and-int/2addr v1, v2

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->packed_:Z

    .line 23
    .line 24
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, 0x20

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->deprecated_:Z

    .line 35
    .line 36
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 40
    .line 41
    and-int/lit8 v1, v1, 0x8

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x5

    .line 46
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->lazy_:Z

    .line 47
    .line 48
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x4

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x6

    .line 58
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->jstype_:I

    .line 59
    .line 60
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 64
    .line 65
    and-int/lit8 v1, v1, 0x40

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    const/16 v1, 0xa

    .line 70
    .line 71
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->weak_:Z

    .line 72
    .line 73
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 74
    .line 75
    .line 76
    :cond_5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 77
    .line 78
    const/16 v2, 0x10

    .line 79
    .line 80
    and-int/2addr v1, v2

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    const/16 v1, 0xf

    .line 84
    .line 85
    iget-boolean v3, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->unverifiedLazy_:Z

    .line 86
    .line 87
    invoke-virtual {p1, v1, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 88
    .line 89
    .line 90
    :cond_6
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 91
    .line 92
    and-int/lit16 v1, v1, 0x80

    .line 93
    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->debugRedact_:Z

    .line 97
    .line 98
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 99
    .line 100
    .line 101
    :cond_7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 102
    .line 103
    and-int/lit16 v1, v1, 0x100

    .line 104
    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    const/16 v1, 0x11

    .line 108
    .line 109
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->retention_:I

    .line 110
    .line 111
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 112
    .line 113
    .line 114
    :cond_8
    const/4 v1, 0x0

    .line 115
    move v2, v1

    .line 116
    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 117
    .line 118
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 119
    .line 120
    iget v4, v3, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪哲兰苏世:I

    .line 121
    .line 122
    if-ge v2, v4, :cond_9

    .line 123
    .line 124
    const/16 v4, 0x13

    .line 125
    .line 126
    invoke-virtual {v3, v2}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪苏世哲兰(I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_9
    move v2, v1

    .line 137
    :goto_1
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-ge v2, v3, :cond_a

    .line 144
    .line 145
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->editionDefaults_:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 152
    .line 153
    const/16 v4, 0x14

    .line 154
    .line 155
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_a
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 162
    .line 163
    and-int/lit16 v2, v2, 0x200

    .line 164
    .line 165
    if-eqz v2, :cond_b

    .line 166
    .line 167
    const/16 v2, 0x15

    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {p1, v2, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 174
    .line 175
    .line 176
    :cond_b
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->bitField0_:I

    .line 177
    .line 178
    and-int/lit16 v2, v2, 0x400

    .line 179
    .line 180
    if-eqz v2, :cond_c

    .line 181
    .line 182
    const/16 v2, 0x16

    .line 183
    .line 184
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {p1, v2, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 189
    .line 190
    .line 191
    :cond_c
    :goto_2
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-ge v1, v2, :cond_d

    .line 198
    .line 199
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->uninterpretedOption_:Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 206
    .line 207
    const/16 v3, 0x3e7

    .line 208
    .line 209
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_d
    const/high16 v1, 0x20000000

    .line 216
    .line 217
    invoke-interface {v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;->飘花落叶言子楪世苏哲兰(ILcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method
