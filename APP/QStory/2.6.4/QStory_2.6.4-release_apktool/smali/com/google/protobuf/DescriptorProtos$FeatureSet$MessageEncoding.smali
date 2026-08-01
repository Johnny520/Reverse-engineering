.class public final enum Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世哲苏楪兰子;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$FeatureSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MessageEncoding"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;",
        ">;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u82cf\u696a\u5170\u5b50;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

.field public static final enum DELIMITED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

.field public static final DELIMITED_VALUE:I = 0x2

.field public static final enum LENGTH_PREFIXED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

.field public static final LENGTH_PREFIXED_VALUE:I = 0x1

.field public static final enum MESSAGE_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

.field public static final MESSAGE_ENCODING_UNKNOWN_VALUE:I

.field private static final VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

.field private static final internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u82cf\u5170;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->MESSAGE_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->LENGTH_PREFIXED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 4
    .line 5
    sget-object v2, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->DELIMITED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

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
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 2
    .line 3
    const-string v1, "MESSAGE_ENCODING_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->MESSAGE_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 10
    .line 11
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 12
    .line 13
    const-string v1, "LENGTH_PREFIXED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->LENGTH_PREFIXED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 20
    .line 21
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 22
    .line 23
    const-string v1, "DELIMITED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->DELIMITED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 30
    .line 31
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->$values()[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 36
    .line 37
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 38
    .line 39
    const-string v1, "MessageEncoding"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/google/protobuf/飘花落叶言子苏兰世哲楪;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 50
    .line 51
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->values()[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 56
    .line 57
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->DELIMITED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->LENGTH_PREFIXED:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_2
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->MESSAGE_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 18
    .line 19
    return-object p0
.end method

.method public static getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰苏哲世:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 7
    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    return-object v0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u82cf\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 10
    .line 11
    iget p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    aget-object p0, v0, p0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "EnumValueDescriptor is not for this type."

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 1

    .line 23
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getNumber()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->value:I

    .line 2
    .line 3
    return p0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 10
    .line 11
    aget-object p0, v0, p0

    .line 12
    .line 13
    return-object p0
.end method
