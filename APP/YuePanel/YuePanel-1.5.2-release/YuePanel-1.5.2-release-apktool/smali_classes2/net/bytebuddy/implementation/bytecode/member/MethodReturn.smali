.class public final enum Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;


# instance fields
.field private final returnOpcode:I

.field private final size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    const-string v2, "INTEGER"

    const/4 v3, 0x0

    const/16 v4, 0xac

    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    new-instance v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    const-string v4, "DOUBLE"

    const/4 v5, 0x1

    const/16 v6, 0xaf

    invoke-direct {v2, v4, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    new-instance v4, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/4 v5, 0x2

    const/16 v6, 0xae

    const-string v7, "FLOAT"

    invoke-direct {v4, v7, v5, v6, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v4, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    new-instance v5, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/4 v6, 0x3

    const/16 v7, 0xad

    const-string v8, "LONG"

    invoke-direct {v5, v8, v6, v7, v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v5, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    new-instance v6, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/16 v3, 0xb1

    sget-object v7, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    const-string v8, "VOID"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v9, v3, v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v6, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/4 v3, 0x5

    const/16 v8, 0xb0

    const-string v9, "REFERENCE"

    invoke-direct {v7, v9, v3, v8, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    sput-object v7, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    move-object v1, v2

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    filled-new-array/range {v0 .. v5}, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->returnOpcode:I

    invoke-virtual {p4}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0

    :cond_3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0

    :cond_4
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
    .locals 1

    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->returnOpcode:I

    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    return-object p1
.end method

.method public isValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
