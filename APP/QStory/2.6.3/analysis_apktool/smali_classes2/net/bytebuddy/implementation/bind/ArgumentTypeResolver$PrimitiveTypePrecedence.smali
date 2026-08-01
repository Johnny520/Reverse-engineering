.class public final enum Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PrimitiveTypePrecedence"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;


# instance fields
.field private final score:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 2
    .line 3
    const-string v1, "BOOLEAN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->BOOLEAN:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 12
    .line 13
    const-string v2, "BYTE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->BYTE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 20
    .line 21
    new-instance v2, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 22
    .line 23
    const-string v3, "SHORT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->SHORT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 30
    .line 31
    new-instance v3, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 32
    .line 33
    const-string v4, "INTEGER"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->INTEGER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 40
    .line 41
    new-instance v4, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 42
    .line 43
    const-string v5, "CHARACTER"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->CHARACTER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 50
    .line 51
    new-instance v5, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 52
    .line 53
    const-string v6, "LONG"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7, v7}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->LONG:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 60
    .line 61
    new-instance v6, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 62
    .line 63
    const-string v7, "FLOAT"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8, v8}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->FLOAT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 70
    .line 71
    new-instance v7, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 72
    .line 73
    const-string v8, "DOUBLE"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v7, v8, v9, v9}, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v7, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->DOUBLE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 80
    .line 81
    filled-new-array/range {v0 .. v7}, [Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->$VALUES:[Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 86
    .line 87
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
    iput p3, p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->score:I

    .line 5
    .line 6
    return-void
.end method

.method public static forPrimitive(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->BOOLEAN:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->BYTE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->SHORT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->INTEGER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->CHARACTER:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->LONG:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->FLOAT:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->DOUBLE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    const-string v0, "Not a non-void, primitive type "

    .line 90
    .line 91
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->$VALUES:[Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->score:I

    .line 2
    .line 3
    iget p1, p1, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver$PrimitiveTypePrecedence;->score:I

    .line 4
    .line 5
    sub-int v0, p0, p1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;->UNKNOWN:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sub-int/2addr p0, p1

    .line 13
    if-lez p0, :cond_1

    .line 14
    .line 15
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;->RIGHT:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;->LEFT:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;

    .line 19
    .line 20
    return-object p0
.end method
