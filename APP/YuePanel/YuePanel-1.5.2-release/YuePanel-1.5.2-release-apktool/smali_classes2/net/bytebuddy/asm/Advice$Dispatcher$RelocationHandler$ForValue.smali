.class public abstract enum Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ForValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;


# instance fields
.field private final arrayLoad:I

.field private final defaultJump:I

.field private final load:I

.field private final nonDefaultJump:I

.field private final requiredSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v8, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$1;

    const/16 v6, 0x99

    const/4 v7, 0x0

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const/16 v3, 0x15

    const/16 v4, 0x33

    const/16 v5, 0x9a

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$1;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v8, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$2;

    const/16 v15, 0x99

    const/16 v16, 0x0

    const-string v10, "BYTE"

    const/4 v11, 0x1

    const/16 v12, 0x15

    const/16 v13, 0x33

    const/16 v14, 0x9a

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$2;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$3;

    const/16 v23, 0x99

    const/16 v24, 0x0

    const-string v18, "SHORT"

    const/16 v19, 0x2

    const/16 v20, 0x15

    const/16 v21, 0x35

    const/16 v22, 0x9a

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v24}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$3;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$4;

    const-string v10, "CHARACTER"

    const/4 v11, 0x3

    const/16 v13, 0x34

    move-object v9, v2

    invoke-direct/range {v9 .. v16}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$4;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v3, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$5;

    const-string v18, "INTEGER"

    const/16 v19, 0x4

    const/16 v21, 0x2e

    move-object/from16 v17, v3

    invoke-direct/range {v17 .. v24}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v3, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v4, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$6;

    const-string v10, "LONG"

    const/4 v11, 0x5

    const/16 v12, 0x16

    const/16 v13, 0x2f

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$6;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v4, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v5, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$7;

    const/16 v24, 0x2

    const-string v18, "FLOAT"

    const/16 v19, 0x6

    const/16 v20, 0x17

    const/16 v21, 0x30

    move-object/from16 v17, v5

    invoke-direct/range {v17 .. v24}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$7;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v5, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v6, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$8;

    const/16 v16, 0x4

    const-string v10, "DOUBLE"

    const/4 v11, 0x7

    const/16 v12, 0x18

    const/16 v13, 0x31

    move-object v9, v6

    invoke-direct/range {v9 .. v16}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$8;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v6, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    new-instance v7, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$9;

    const/16 v23, 0xc6

    const/16 v24, 0x0

    const-string v18, "REFERENCE"

    const/16 v19, 0x8

    const/16 v20, 0x19

    const/16 v21, 0x32

    const/16 v22, 0xc7

    move-object/from16 v17, v7

    invoke-direct/range {v17 .. v24}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$9;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v7, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    const/16 v9, 0x9

    new-array v9, v9, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    const/4 v10, 0x0

    aput-object v8, v9, v10

    const/4 v8, 0x1

    aput-object v0, v9, v8

    const/4 v0, 0x2

    aput-object v1, v9, v0

    const/4 v0, 0x3

    aput-object v2, v9, v0

    const/4 v0, 0x4

    aput-object v3, v9, v0

    const/4 v0, 0x5

    aput-object v4, v9, v0

    const/4 v0, 0x6

    aput-object v5, v9, v0

    const/4 v0, 0x7

    aput-object v6, v9, v0

    const/16 v0, 0x8

    aput-object v7, v9, v0

    sput-object v9, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->$VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->load:I

    .line 4
    iput p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->arrayLoad:I

    .line 5
    iput p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->defaultJump:I

    .line 6
    iput p6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->nonDefaultJump:I

    .line 7
    iput p7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->requiredSize:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIIILnet/bytebuddy/asm/Advice$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;-><init>(Ljava/lang/String;IIIIII)V

    return-void
.end method

.method public static synthetic access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->requiredSize:I

    return p0
.end method

.method public static synthetic access$3400(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->load:I

    return p0
.end method

.method public static synthetic access$3500(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->arrayLoad:I

    return p0
.end method

.method public static synthetic access$3600(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->nonDefaultJump:I

    return p0
.end method

.method public static synthetic access$3700(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->defaultJump:I

    return p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;IZ)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    goto :goto_0

    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result p0

    if-nez p0, :cond_9

    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    :goto_0
    if-eqz p2, :cond_8

    new-instance p2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;I)V

    goto :goto_1

    :cond_8
    new-instance p2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;I)V

    :goto_1
    return-object p2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot skip on default value for void return type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->$VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    return-object v0
.end method


# virtual methods
.method public abstract convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method
