.class public enum Lnet/bytebuddy/implementation/bytecode/Removal;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/Removal;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/Removal;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/Removal;

.field public static final enum SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

.field public static final enum ZERO:Lnet/bytebuddy/implementation/bytecode/Removal;


# instance fields
.field private final opcode:I

.field private final size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/Removal$1;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    const-string v2, "ZERO"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1, v3}, Lnet/bytebuddy/implementation/bytecode/Removal$1;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Removal;->ZERO:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 14
    .line 15
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 16
    .line 17
    const/16 v4, 0x57

    .line 18
    .line 19
    const-string v5, "SINGLE"

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    invoke-direct {v1, v5, v6, v2, v4}, Lnet/bytebuddy/implementation/bytecode/Removal;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 26
    .line 27
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 28
    .line 29
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 30
    .line 31
    const/16 v5, 0x58

    .line 32
    .line 33
    const-string v7, "DOUBLE"

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    invoke-direct {v2, v7, v8, v4, v5}, Lnet/bytebuddy/implementation/bytecode/Removal;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/Removal;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 43
    .line 44
    aput-object v0, v4, v3

    .line 45
    .line 46
    aput-object v1, v4, v6

    .line 47
    .line 48
    aput-object v2, v4, v8

    .line 49
    .line 50
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/Removal;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 51
    .line 52
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/Removal;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 9
    .line 10
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/Removal;->opcode:I

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;ILnet/bytebuddy/implementation/bytecode/Removal$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/bytecode/Removal;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Removal$2;->$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize:[I

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Removal;->ZERO:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Removal;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 34
    .line 35
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/Removal;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/Removal;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Removal;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/Removal;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/Removal;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/Removal;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 7
    .line 8
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
