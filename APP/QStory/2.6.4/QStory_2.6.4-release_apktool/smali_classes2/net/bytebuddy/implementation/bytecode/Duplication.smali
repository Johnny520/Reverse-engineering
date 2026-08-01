.class public abstract enum Lnet/bytebuddy/implementation/bytecode/Duplication;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/Duplication;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

.field public static final enum SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

.field public static final enum ZERO:Lnet/bytebuddy/implementation/bytecode/Duplication;


# instance fields
.field private final opcode:I

.field protected final size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/Duplication$1;

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
    invoke-direct {v0, v2, v3, v1, v3}, Lnet/bytebuddy/implementation/bytecode/Duplication$1;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication;->ZERO:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/Duplication$2;

    .line 14
    .line 15
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 16
    .line 17
    const/16 v4, 0x59

    .line 18
    .line 19
    const-string v5, "SINGLE"

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    invoke-direct {v1, v5, v6, v2, v4}, Lnet/bytebuddy/implementation/bytecode/Duplication$2;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 26
    .line 27
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/Duplication$3;

    .line 28
    .line 29
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 30
    .line 31
    const/16 v5, 0x5c

    .line 32
    .line 33
    const-string v7, "DOUBLE"

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    invoke-direct {v2, v7, v8, v4, v5}, Lnet/bytebuddy/implementation/bytecode/Duplication$3;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/Duplication;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/Duplication;

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
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/Duplication;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication;

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
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 9
    .line 10
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->opcode:I

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;ILnet/bytebuddy/implementation/bytecode/Duplication$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/bytecode/Duplication;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/Duplication;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication$4;->$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize:[I

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->ZERO:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string v0, "Unexpected type: "

    .line 26
    .line 27
    invoke-static {p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 36
    .line 37
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/Duplication;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/Duplication;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/Duplication;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/Duplication;->size:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 7
    .line 8
    return-object p0
.end method

.method public abstract flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
