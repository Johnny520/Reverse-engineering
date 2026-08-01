.class public final enum Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IllegalInvocation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 2
    .line 3
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public onHandle(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleType;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 2
    .line 3
    return-object p0
.end method

.method public special(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 2
    .line 3
    return-object p0
.end method

.method public virtual(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 2
    .line 3
    return-object p0
.end method
