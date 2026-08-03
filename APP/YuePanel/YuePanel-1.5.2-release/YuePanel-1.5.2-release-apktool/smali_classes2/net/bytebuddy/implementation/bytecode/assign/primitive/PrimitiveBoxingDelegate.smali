.class public final enum Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate$BoxingStackManipulation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;


# instance fields
.field private final boxingMethodDescriptor:Ljava/lang/String;

.field private final boxingMethodName:Ljava/lang/String;

.field private final size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

.field private final wrapperType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    const-string v5, "valueOf"

    const-string v6, "(Z)Ljava/lang/Boolean;"

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Boolean;

    move-object v0, v7

    move-object v4, v8

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(B)Ljava/lang/Byte;"

    const-string v1, "BYTE"

    const/4 v2, 0x1

    const-class v3, Ljava/lang/Byte;

    move-object v0, v9

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(S)Ljava/lang/Short;"

    const-string v1, "SHORT"

    const/4 v2, 0x2

    const-class v3, Ljava/lang/Short;

    move-object v0, v10

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(C)Ljava/lang/Character;"

    const-string v1, "CHARACTER"

    const/4 v2, 0x3

    const-class v3, Ljava/lang/Character;

    move-object v0, v11

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v12, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(I)Ljava/lang/Integer;"

    const-string v1, "INTEGER"

    const/4 v2, 0x4

    const-class v3, Ljava/lang/Integer;

    move-object v0, v12

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v12, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v20, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    sget-object v21, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    const-string v18, "valueOf"

    const-string v19, "(J)Ljava/lang/Long;"

    const-string v14, "LONG"

    const/4 v15, 0x5

    const-class v16, Ljava/lang/Long;

    move-object/from16 v13, v20

    move-object/from16 v17, v21

    invoke-direct/range {v13 .. v19}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v20, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v13, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(F)Ljava/lang/Float;"

    const-string v1, "FLOAT"

    const/4 v2, 0x6

    const-class v3, Ljava/lang/Float;

    move-object v0, v13

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v13, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    const-string v5, "valueOf"

    const-string v6, "(D)Ljava/lang/Double;"

    const-string v1, "DOUBLE"

    const/4 v2, 0x7

    const-class v3, Ljava/lang/Double;

    move-object v0, v8

    move-object/from16 v4, v21

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;-><init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v8, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    move-object v0, v7

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move-object/from16 v5, v20

    move-object v6, v13

    move-object v7, v8

    filled-new-array/range {v0 .. v7}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackSize;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->wrapperType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p4}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->boxingMethodName:Ljava/lang/String;

    iput-object p6, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->boxingMethodDescriptor:Ljava/lang/String;

    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->wrapperType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->boxingMethodName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->boxingMethodDescriptor:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    return-object p0
.end method

.method public static forPrimitive(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a non-void, primitive type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;
    .locals 1

    const-class v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;

    return-object v0
.end method


# virtual methods
.method public assignBoxedTo(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate$BoxingStackManipulation;

    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;->wrapperType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-interface {p2, v1, p1, p3}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate$BoxingStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveBoxingDelegate;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object v0
.end method
