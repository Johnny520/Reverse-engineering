.class public final enum Lnet/bytebuddy/implementation/bytecode/Negation;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/Negation;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/Negation;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/Negation;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/Negation;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/Negation;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/Negation;


# instance fields
.field private final opcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x74

    .line 5
    .line 6
    const-string v3, "INTEGER"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/bytecode/Negation;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Negation;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0x75

    .line 17
    .line 18
    const-string v4, "LONG"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/bytecode/Negation;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/Negation;->LONG:Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/16 v4, 0x76

    .line 29
    .line 30
    const-string v5, "FLOAT"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/implementation/bytecode/Negation;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/Negation;->FLOAT:Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 36
    .line 37
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/16 v5, 0x77

    .line 41
    .line 42
    const-string v6, "DOUBLE"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lnet/bytebuddy/implementation/bytecode/Negation;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/Negation;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2, v3}, [Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Negation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 54
    .line 55
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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/Negation;->opcode:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/Negation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/Negation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Negation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/Negation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/Negation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/Negation;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

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
