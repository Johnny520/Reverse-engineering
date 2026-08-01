.class public Lnet/bytebuddy/asm/Advice$WithCustomMapping;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithCustomMapping"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

.field private final delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

.field private final offsetMappings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;

    .line 6
    .line 7
    sget-object v3, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1, v2, v3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/asm/Advice$Delegator$Factory;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            ")V"
        }
    .end annotation

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 15
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 16
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 17
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    return-void
.end method


# virtual methods
.method public bind(Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 77
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/Enum;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Enum<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 79
    new-instance v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 69
    invoke-static {p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;->of(Ljava/lang/Class;Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/reflect/Constructor;I)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;I)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    if-ltz p3, :cond_1

    .line 70
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-le v0, p3, :cond_0

    .line 71
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/bytebuddy/description/method/ParameterDescription;

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not declare a parameter with index "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 73
    :cond_1
    const-string p0, "A parameter cannot be negative: "

    .line 74
    invoke-static {p3, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 75
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/reflect/Field;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 67
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/reflect/Method;I)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "I)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    if-ltz p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v0, v0

    .line 8
    if-le v0, p3, :cond_0

    .line 9
    .line 10
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 11
    .line 12
    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p2, " does not declare a parameter with index "

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_1
    const-string p0, "A parameter cannot be negative: "

    .line 57
    .line 58
    invoke-static {p3, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/asm/Advice$OffsetMapping;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 85
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Simple;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Simple;-><init>(Ljava/lang/Class;Lnet/bytebuddy/asm/Advice$OffsetMapping;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/enumeration/EnumerationDescription;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 80
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 68
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Resolved$Factory;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Resolved$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/method/ParameterDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 76
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Resolved$Factory;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Resolved$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/method/ParameterDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 78
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 83
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 84
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/utility/ConstantValue;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 82
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;

    invoke-interface {p2}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {p2}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-direct {v0, p1, v1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 81
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 86
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 87
    invoke-interface {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isAnnotation()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 88
    invoke-interface {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 89
    new-instance p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    invoke-direct {p1, v1, v0, v2, p0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    return-object p1

    .line 90
    :cond_0
    const-string p0, "Annotation type already mapped: "

    invoke-interface {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 91
    :cond_1
    const-string p0, "Not an annotation type: "

    invoke-interface {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2
.end method

.method public bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 36
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, p1, v0, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 35
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 34
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, p1, v0, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 38
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$OfDynamicInvocation;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$OfDynamicInvocation;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string p0, "Not a valid bootstrap method "

    .line 26
    .line 27
    const-string p1, " for "

    .line 28
    .line 29
    invoke-static {p0, p2, p1, p3}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 37
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 251
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 252
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    .line 253
    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 241
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 242
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    .line 243
    invoke-virtual {p0, p1, v0, p2, p4}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 244
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 245
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    .line 246
    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 247
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 248
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    .line 249
    invoke-virtual {p0, p1, v0, p2, p4}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 250
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    move-object/from16 v1, p4

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x1

    .line 39
    if-ne v3, v4, :cond_0

    .line 40
    .line 41
    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 42
    .line 43
    new-instance v6, Lnet/bytebuddy/description/type/TypeDescription$Latent;

    .line 44
    .line 45
    const-class v0, Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v2, 0x0

    .line 52
    new-array v2, v2, [Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 53
    .line 54
    const-string v3, "java.lang.invoke.LambdaMetafactory"

    .line 55
    .line 56
    invoke-direct {v6, v3, v4, v0, v2}, Lnet/bytebuddy/description/type/TypeDescription$Latent;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;[Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 57
    .line 58
    .line 59
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 60
    .line 61
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->CALL_SITE:Lnet/bytebuddy/utility/JavaType;

    .line 62
    .line 63
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    new-instance v11, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 72
    .line 73
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 74
    .line 75
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v11, v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 84
    .line 85
    .line 86
    new-instance v12, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 87
    .line 88
    const-class v0, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {v12, v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 99
    .line 100
    .line 101
    new-instance v13, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 102
    .line 103
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 104
    .line 105
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-direct {v13, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 114
    .line 115
    .line 116
    new-instance v14, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 117
    .line 118
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-direct {v14, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 127
    .line 128
    .line 129
    new-instance v15, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 130
    .line 131
    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 132
    .line 133
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v15, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 145
    .line 146
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {v2, v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v16, v2

    .line 158
    .line 159
    filled-new-array/range {v11 .. v16}, [Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    sget-object v14, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 168
    .line 169
    sget-object v15, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 170
    .line 171
    const-string v7, "metafactory"

    .line 172
    .line 173
    const/16 v8, 0x9

    .line 174
    .line 175
    move-object v12, v9

    .line 176
    move-object v13, v9

    .line 177
    invoke-direct/range {v5 .. v15}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 189
    .line 190
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static/range {p2 .. p2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    .line 207
    .line 208
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    filled-new-array {v0, v2, v1}, [Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    move-object/from16 v1, p0

    .line 217
    .line 218
    move-object/from16 v2, p1

    .line 219
    .line 220
    invoke-virtual {v1, v2, v5, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    return-object v0

    .line 225
    :cond_0
    const-string v3, " does not define exactly one abstract method: "

    .line 226
    .line 227
    invoke-static {v0, v3, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v2

    .line 231
    :cond_1
    const-string v1, " is not an interface type"

    .line 232
    .line 233
    invoke-static {v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v2
.end method

.method public bindProperty(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStackManipulation$OfAnnotationProperty;->of(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/io/Serializable;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            "S::",
            "Ljava/io/Serializable;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TS;",
            "Ljava/lang/Class<",
            "-TS;>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 10
    invoke-static {p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSerializedValue$Factory;->of(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 23
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Ljava/lang/reflect/Constructor;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 17
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Ljava/lang/reflect/Method;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1

    .line 18
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Ljava/lang/reflect/Method;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1

    .line 19
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Ljava/lang/reflect/Method;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 20
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1

    .line 21
    sget-object v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1

    .line 22
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$NoOp;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$NoOp;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object p0

    return-object p0
.end method

.method public bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {p1, p2, p3}, Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v1

    .line 45
    return p0
.end method

.method public to(Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 48
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v2, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 17
    .line 18
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v3, 0x2

    .line 27
    new-array v3, v3, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    aput-object v0, v3, v4

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v3, v0

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public to(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 49
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 44
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice;
    .locals 1

    .line 50
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 7

    .line 51
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    move-object v0, p1

    move-object v1, p2

    move-object v3, p3

    .line 53
    invoke-static/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 6

    .line 45
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 46
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    move-object v0, p1

    move-object v2, p2

    .line 47
    invoke-static/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/asm/Advice$PostProcessor$Factory$Compound;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    new-array v3, v3, [Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v2, v3, v4

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object p1, v3, v2

    .line 15
    .line 16
    invoke-direct {v1, v3}, Lnet/bytebuddy/asm/Advice$PostProcessor$Factory$Compound;-><init>([Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 24
    .line 25
    invoke-direct {v0, v1, p1, v2, p0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public with(Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 3

    .line 29
    new-instance v0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->postProcessorFactory:Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->delegatorFactory:Lnet/bytebuddy/asm/Advice$Delegator$Factory;

    invoke-direct {v0, v1, v2, p0, p1}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    return-object v0
.end method
