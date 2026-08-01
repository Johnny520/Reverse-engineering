.class public final enum Lcom/google/protobuf/Field$Cardinality;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世哲苏楪兰子;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Field;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Cardinality"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/Field$Cardinality;",
        ">;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u82cf\u696a\u5170\u5b50;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/Field$Cardinality;

.field public static final enum CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_OPTIONAL_VALUE:I = 0x1

.field public static final enum CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_REPEATED_VALUE:I = 0x3

.field public static final enum CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_REQUIRED_VALUE:I = 0x2

.field public static final enum CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_UNKNOWN_VALUE:I

.field public static final enum UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

.field private static final VALUES:[Lcom/google/protobuf/Field$Cardinality;

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
.method private static synthetic $values()[Lcom/google/protobuf/Field$Cardinality;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    .line 4
    .line 5
    sget-object v2, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    .line 6
    .line 7
    sget-object v3, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    .line 8
    .line 9
    sget-object v4, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/google/protobuf/Field$Cardinality;

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
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    .line 2
    .line 3
    const-string v1, "CARDINALITY_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 10
    .line 11
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    .line 12
    .line 13
    const-string v1, "CARDINALITY_OPTIONAL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    .line 20
    .line 21
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    .line 22
    .line 23
    const-string v1, "CARDINALITY_REQUIRED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    .line 30
    .line 31
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    .line 32
    .line 33
    const-string v1, "CARDINALITY_REPEATED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    .line 40
    .line 41
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    const/4 v2, -0x1

    .line 45
    const-string v3, "UNRECOGNIZED"

    .line 46
    .line 47
    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 51
    .line 52
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->$values()[Lcom/google/protobuf/Field$Cardinality;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->$VALUES:[Lcom/google/protobuf/Field$Cardinality;

    .line 57
    .line 58
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 59
    .line 60
    const-string v1, "Cardinality"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏世兰哲子;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 71
    .line 72
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->values()[Lcom/google/protobuf/Field$Cardinality;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->VALUES:[Lcom/google/protobuf/Field$Cardinality;

    .line 77
    .line 78
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
    iput p3, p0, Lcom/google/protobuf/Field$Cardinality;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_3
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 24
    .line 25
    return-object p0
.end method

.method public static getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/Field;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

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
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/Field$Cardinality;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 29
    invoke-static {p0}, Lcom/google/protobuf/Field$Cardinality;->forNumber(I)Lcom/google/protobuf/Field$Cardinality;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;)Lcom/google/protobuf/Field$Cardinality;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->VALUES:[Lcom/google/protobuf/Field$Cardinality;

    .line 18
    .line 19
    aget-object p0, v0, p0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const-string p0, "EnumValueDescriptor is not for this type."

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 30
    const-class v0, Lcom/google/protobuf/Field$Cardinality;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Field$Cardinality;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->$VALUES:[Lcom/google/protobuf/Field$Cardinality;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/protobuf/Field$Cardinality;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/protobuf/Field$Cardinality;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/Field$Cardinality;->value:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const-string p0, "Can\'t get the number of an unknown enum value."

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 14
    .line 15
    aget-object p0, v0, p0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "Can\'t get the descriptor of an unrecognized enum value."

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
