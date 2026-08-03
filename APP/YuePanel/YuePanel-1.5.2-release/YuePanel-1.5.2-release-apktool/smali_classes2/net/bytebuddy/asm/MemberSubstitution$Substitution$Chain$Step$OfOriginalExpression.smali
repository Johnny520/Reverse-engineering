.class public final enum Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OfOriginalExpression"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;",
        ">;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    filled-new-array {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    return-object v0
.end method


# virtual methods
.method public make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
    .locals 0

    return-object p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/Map;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation

    instance-of p1, p2, Lnet/bytebuddy/description/method/MethodDescription;

    if-eqz p1, :cond_0

    move-object p4, p2

    check-cast p4, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {p4}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result p4

    if-eqz p4, :cond_0

    new-instance p4, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p5

    add-int/lit8 p5, p5, 0x4

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p7}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p5

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2}, Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object p5

    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p5

    invoke-static {p5}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p5

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p5, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p4, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p5

    add-int/lit8 p5, p5, 0x4

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p7}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p5

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 p5, 0x0

    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p7

    if-ge p5, p7, :cond_1

    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-static {p7}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object p7

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p9

    invoke-interface {p8, p9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p9

    check-cast p9, Ljava/lang/Integer;

    invoke-virtual {p9}, Ljava/lang/Integer;->intValue()I

    move-result p9

    invoke-virtual {p7, p9}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p7

    invoke-interface {p4, p7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_3

    invoke-interface {p4, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p3, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    move-object p4, p2

    check-cast p4, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {p4}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-interface {p2}, Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    goto :goto_2

    :cond_2
    invoke-interface {p4}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    :goto_2
    invoke-direct {p1, p3, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_3
    instance-of p1, p2, Lnet/bytebuddy/description/field/FieldDescription;

    if-eqz p1, :cond_7

    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p4, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p3, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_4
    invoke-interface {p4, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p2, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_5
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_6

    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object p1

    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p3, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_6
    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object p1

    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {p2, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected target type: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
