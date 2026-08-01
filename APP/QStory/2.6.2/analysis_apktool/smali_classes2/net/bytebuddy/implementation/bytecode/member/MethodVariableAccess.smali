.class public final enum Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetIncrementing;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetWriting;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetLoading;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field public static final enum REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

.field private static synthetic loadThis:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# instance fields
.field private final loadOpcode:I

.field private final size:Lnet/bytebuddy/implementation/bytecode/StackSize;

.field private final storeOpcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 2
    .line 3
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    const-string v1, "INTEGER"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0x15

    .line 9
    .line 10
    const/16 v4, 0x36

    .line 11
    .line 12
    move-object v5, v6

    .line 13
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 17
    .line 18
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 19
    .line 20
    sget-object v12, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 21
    .line 22
    const-string v8, "LONG"

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    const/16 v10, 0x16

    .line 26
    .line 27
    const/16 v11, 0x37

    .line 28
    .line 29
    invoke-direct/range {v7 .. v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 30
    .line 31
    .line 32
    sput-object v7, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 33
    .line 34
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 35
    .line 36
    const/16 v4, 0x17

    .line 37
    .line 38
    const/16 v5, 0x38

    .line 39
    .line 40
    const-string v2, "FLOAT"

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 44
    .line 45
    .line 46
    move-object v14, v1

    .line 47
    sput-object v14, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 48
    .line 49
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 50
    .line 51
    const/16 v11, 0x18

    .line 52
    .line 53
    move-object v13, v12

    .line 54
    const/16 v12, 0x39

    .line 55
    .line 56
    const-string v9, "DOUBLE"

    .line 57
    .line 58
    const/4 v10, 0x3

    .line 59
    invoke-direct/range {v8 .. v13}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 60
    .line 61
    .line 62
    sput-object v8, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 63
    .line 64
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 65
    .line 66
    const/16 v4, 0x19

    .line 67
    .line 68
    const/16 v5, 0x3a

    .line 69
    .line 70
    const-string v2, "REFERENCE"

    .line 71
    .line 72
    const/4 v3, 0x4

    .line 73
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 74
    .line 75
    .line 76
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 77
    .line 78
    filled-new-array {v0, v7, v14, v8, v1}, [Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 83
    .line 84
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadOpcode:I

    .line 5
    .line 6
    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->size:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeOpcode:I

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;)Lnet/bytebuddy/implementation/bytecode/StackSize;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->size:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static allArgumentsOf(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading$TypeCastingHandler;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static increment(Lnet/bytebuddy/description/method/ParameterDescription;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 18
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object v0

    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    move-result p0

    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->increment(II)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    return-object p0
.end method

.method public static load(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "loadThis"
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 20
    .line 21
    return-object v0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    const-string p0, "Variable type cannot be void"

    .line 52
    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_4
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 59
    .line 60
    return-object p0
.end method

.method public static store(Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public increment(II)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetIncrementing;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetIncrementing;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p1, "Cannot increment type: "

    .line 12
    .line 13
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetLoading;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetLoading;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetWriting;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$OffsetWriting;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
