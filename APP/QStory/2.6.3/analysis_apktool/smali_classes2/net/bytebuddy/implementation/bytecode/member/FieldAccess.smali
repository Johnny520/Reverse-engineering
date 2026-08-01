.class public final enum Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;,
        Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$OfGenericField;,
        Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

.field public static final enum STATIC:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;


# instance fields
.field private final getterOpcode:I

.field private final putterOpcode:I

.field private final targetSizeChange:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 2
    .line 3
    const/16 v4, 0xb2

    .line 4
    .line 5
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 6
    .line 7
    const-string v1, "STATIC"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/16 v3, 0xb3

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->STATIC:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 16
    .line 17
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 18
    .line 19
    const/16 v5, 0xb4

    .line 20
    .line 21
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 22
    .line 23
    const-string v2, "INSTANCE"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/16 v4, 0xb5

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 38
    .line 39
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->putterOpcode:I

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->getterOpcode:I

    .line 7
    .line 8
    invoke-virtual {p5}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->targetSizeChange:I

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->getterOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->targetSizeChange:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$400(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->putterOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getValue()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lnet/bytebuddy/description/field/FieldList;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 35
    .line 36
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 47
    .line 48
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 59
    .line 60
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 68
    .line 69
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->STATIC:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 79
    .line 80
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;-><init>(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_1
    :goto_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 89
    .line 90
    return-object p0
.end method

.method public static forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;
    .locals 2

    .line 43
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->STATIC:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;-><init>(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V

    return-object v0

    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;-><init>(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V

    return-object v0
.end method

.method public static forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;
    .locals 3

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$OfGenericField;->of(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 8
    .line 9
    return-object v0
.end method
