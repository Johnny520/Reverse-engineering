.class public final enum Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世哲苏楪兰子;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;",
        ">;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u82cf\u696a\u5170\u5b50;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

.field private static final VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

.field public static final enum VISIBILITY_EXPORT:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

.field public static final VISIBILITY_EXPORT_VALUE:I = 0x2

.field public static final enum VISIBILITY_LOCAL:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

.field public static final VISIBILITY_LOCAL_VALUE:I = 0x1

.field public static final enum VISIBILITY_UNSET:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

.field public static final VISIBILITY_UNSET_VALUE:I

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
.method private static synthetic $values()[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_UNSET:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_LOCAL:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 4
    .line 5
    sget-object v2, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_EXPORT:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

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
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 2
    .line 3
    const-string v1, "VISIBILITY_UNSET"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_UNSET:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 10
    .line 11
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 12
    .line 13
    const-string v1, "VISIBILITY_LOCAL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_LOCAL:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 20
    .line 21
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 22
    .line 23
    const-string v1, "VISIBILITY_EXPORT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_EXPORT:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 30
    .line 31
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->$values()[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 36
    .line 37
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 38
    .line 39
    const-string v1, "SymbolVisibility"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;

    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;-><init>(I)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 51
    .line 52
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->values()[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 57
    .line 58
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
    iput p3, p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
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
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_EXPORT:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_LOCAL:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_2
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VISIBILITY_UNSET:Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 18
    .line 19
    return-object p0
.end method

.method public static getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子苏兰世楪哲:Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 5
    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
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
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->internalValueMap:Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 23
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

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
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
    .locals 1

    .line 24
    const-class v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

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
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->value:I

    .line 2
    .line 3
    return p0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

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
