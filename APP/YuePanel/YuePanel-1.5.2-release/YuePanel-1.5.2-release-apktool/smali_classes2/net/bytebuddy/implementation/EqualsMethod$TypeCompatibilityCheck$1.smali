.class final enum Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$1;
.super Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/EqualsMethod$1;)V

    return-void
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 10

    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v2

    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNullValue()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    sget-object v6, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v7

    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v6

    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNonIdentity()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    move-result-object v8

    const/4 v9, 0x7

    new-array v9, v9, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v2, v9, v4

    aput-object v3, v9, v1

    const/4 v1, 0x2

    aput-object v5, v9, v1

    const/4 v1, 0x3

    aput-object v7, v9, v1

    const/4 v1, 0x4

    aput-object v0, v9, v1

    const/4 v0, 0x5

    aput-object v6, v9, v0

    const/4 v0, 0x6

    aput-object v8, v9, v0

    invoke-direct {p1, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object p1
.end method
