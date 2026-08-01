.class public final Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世子兰楪苏哲;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;,
        Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;,
        Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

.field public static final LARGE_ENUM_FIELD_NUMBER:I = 0x3

.field public static final LEGACY_CLOSED_ENUM_FIELD_NUMBER:I = 0x1

.field public static final NEST_IN_FILE_CLASS_FIELD_NUMBER:I = 0x5

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field public static final USE_OLD_OUTER_CLASSNAME_DEFAULT_FIELD_NUMBER:I = 0x4

.field public static final UTF8_VALIDATION_FIELD_NUMBER:I = 0x2

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private largeEnum_:Z

.field private legacyClosedEnum_:Z

.field private memoizedIsInitialized:B

.field private nestInFileClass_:I

.field private useOldOuterClassnameDefault_:Z

.field private utf8Validation_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "JavaFeatures"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->legacyClosedEnum_:Z

    .line 22
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->largeEnum_:Z

    .line 23
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->useOldOuterClassnameDefault_:Z

    const/4 v1, -0x1

    .line 24
    iput-byte v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->memoizedIsInitialized:B

    .line 25
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 26
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

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

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->legacyClosedEnum_:Z

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->largeEnum_:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->useOldOuterClassnameDefault_:Z

    .line 12
    .line 13
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput-byte p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->memoizedIsInitialized:B

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$1002(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->legacyClosedEnum_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1102(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1202(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->largeEnum_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1302(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->useOldOuterClassnameDefault_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1402(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1576(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    invoke-virtual {v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->toBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->toBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

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
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

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
    instance-of v1, p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

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
    check-cast p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLegacyClosedEnum()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLegacyClosedEnum()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLegacyClosedEnum()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLegacyClosedEnum()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLegacyClosedEnum()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUtf8Validation()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUtf8Validation()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUtf8Validation()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 63
    .line 64
    iget v2, p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 65
    .line 66
    if-eq v1, v2, :cond_5

    .line 67
    .line 68
    return v3

    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLargeEnum()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLargeEnum()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLargeEnum()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLargeEnum()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLargeEnum()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eq v1, v2, :cond_7

    .line 95
    .line 96
    return v3

    .line 97
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUseOldOuterClassnameDefault()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUseOldOuterClassnameDefault()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eq v1, v2, :cond_8

    .line 106
    .line 107
    return v3

    .line 108
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUseOldOuterClassnameDefault()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_9

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getUseOldOuterClassnameDefault()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getUseOldOuterClassnameDefault()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eq v1, v2, :cond_9

    .line 123
    .line 124
    return v3

    .line 125
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasNestInFileClass()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasNestInFileClass()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eq v1, v2, :cond_a

    .line 134
    .line 135
    return v3

    .line 136
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasNestInFileClass()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_b

    .line 141
    .line 142
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 143
    .line 144
    iget v2, p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 145
    .line 146
    if-eq v1, v2, :cond_b

    .line 147
    .line 148
    return v3

    .line 149
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_c

    .line 162
    .line 163
    return v3

    .line 164
    :cond_c
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLargeEnum()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->largeEnum_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getLegacyClosedEnum()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->legacyClosedEnum_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getNestInFileClass()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->NEST_IN_FILE_CLASS_UNKNOWN:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    .line 10
    .line 11
    :cond_0
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
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 3

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
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 26
    .line 27
    invoke-static {v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    :cond_2
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    and-int/2addr v1, v2

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v0, v1

    .line 44
    :cond_3
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 45
    .line 46
    and-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    :cond_4
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 56
    .line 57
    and-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    iget v2, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 63
    .line 64
    invoke-static {v1, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲(II)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v0, v1

    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v1, v0

    .line 78
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 79
    .line 80
    return v1
.end method

.method public getUseOldOuterClassnameDefault()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->useOldOuterClassnameDefault_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getUtf8Validation()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->UTF8_VALIDATION_UNKNOWN:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public hasLargeEnum()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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

.method public hasLegacyClosedEnum()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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

.method public hasNestInFileClass()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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

.method public hasUseOldOuterClassnameDefault()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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

.method public hasUtf8Validation()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLegacyClosedEnum()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLegacyClosedEnum()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUtf8Validation()Z

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
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 52
    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLargeEnum()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLargeEnum()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUseOldOuterClassnameDefault()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    const/4 v1, 0x4

    .line 81
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getUseOldOuterClassnameDefault()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰(Z)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/2addr v0, v1

    .line 94
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasNestInFileClass()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    const/4 v1, 0x5

    .line 101
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 106
    .line 107
    add-int/2addr v0, v1

    .line 108
    :cond_5
    mul-int/lit8 v0, v0, 0x1d

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v1, v0

    .line 119
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 120
    .line 121
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

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
    iget-byte v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->memoizedIsInitialized:B

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
    iput-byte v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->newBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->newBuilderForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->newBuilderForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->DEFAULT_INSTANCE:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->toBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->toBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->legacyClosedEnum_:Z

    .line 8
    .line 9
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    and-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->utf8Validation_:I

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

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
    iget-boolean v2, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->largeEnum_:Z

    .line 31
    .line 32
    invoke-virtual {p1, v0, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 36
    .line 37
    and-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->useOldOuterClassnameDefault_:Z

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世苏哲(IZ)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->bitField0_:I

    .line 47
    .line 48
    and-int/lit8 v0, v0, 0x10

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const/4 v0, 0x5

    .line 53
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->nestInFileClass_:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲兰苏(II)V

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
