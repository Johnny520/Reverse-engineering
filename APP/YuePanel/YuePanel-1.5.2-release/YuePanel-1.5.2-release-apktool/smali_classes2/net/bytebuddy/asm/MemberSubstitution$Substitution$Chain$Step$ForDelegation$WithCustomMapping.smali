.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithCustomMapping"
.end annotation


# instance fields
.field private final dispatcherFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;

.field private final offsetMappings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->dispatcherFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public bind(Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 4
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/Enum;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 6
    new-instance v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation;->of(Ljava/lang/Class;Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Ljava/lang/reflect/Field;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory$Simple;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory$Simple;-><init>(Ljava/lang/Class;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 7
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;

    invoke-static {p2}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/utility/ConstantValue;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 3
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved$Factory;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 5
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;

    invoke-static {p2}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/utility/ConstantValue;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 9
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/lang/Class;Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 8
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;

    invoke-interface {p2}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {p2}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-direct {v0, p1, v1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<",
            "*>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isAnnotation()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 14
    invoke-interface {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 15
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->dispatcherFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;

    invoke-direct {p1, v1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;Ljava/util/Map;)V

    return-object p1

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Annotation type already mapped: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not an annotation type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;->getAnnotationType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, p1, v0, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 3
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, p1, v0, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 2
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 6
    invoke-static {p3}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    .line 7
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    move-result-object v0

    invoke-interface {p2, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isInvokeBootstrap(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDynamicInvocation;

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDynamicInvocation;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a valid bootstrap method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 5
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p4}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 3
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p4}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 5
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindLambda(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 16
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    move-object/from16 v0, p3

    .line 6
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v1, p4

    .line 7
    invoke-interface {v1, v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 9
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    new-instance v5, Lnet/bytebuddy/description/type/TypeDescription$Latent;

    const-class v2, Ljava/lang/Object;

    .line 10
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lnet/bytebuddy/description/type/TypeDescription$Generic;

    const-string v6, "java.lang.invoke.LambdaMetafactory"

    invoke-direct {v5, v6, v3, v2, v4}, Lnet/bytebuddy/description/type/TypeDescription$Latent;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;[Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->CALL_SITE:Lnet/bytebuddy/utility/JavaType;

    .line 12
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    new-instance v10, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 13
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v10, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v11, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    const-class v2, Ljava/lang/String;

    .line 14
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v11, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v12, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 15
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v12, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v13, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 16
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v13, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v14, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    sget-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 17
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-direct {v14, v3}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    new-instance v15, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 18
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-direct {v15, v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    filled-new-array/range {v10 .. v15}, [Lnet/bytebuddy/description/method/ParameterDescription$Token;

    move-result-object v2

    .line 19
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    sget-object v13, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    sget-object v14, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    const-string v6, "metafactory"

    const/16 v7, 0x9

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 22
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object v2

    .line 23
    invoke-static/range {p2 .. p2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object v3

    .line 24
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodList;->asDefined()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    invoke-static {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofSignature(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object v1

    filled-new-array {v2, v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    .line 25
    invoke-virtual {v2, v3, v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindDynamic(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v2, p0

    .line 26
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not define exactly one abstract method: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    move-object/from16 v2, p0

    .line 27
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is not an interface type"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bindProperty(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    invoke-static {p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfAnnotationProperty;->of(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bindSerialized(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
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
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfSerializedConstant;->of(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/Class;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bind(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Ljava/lang/reflect/Constructor;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Ljava/lang/reflect/Method;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1

    .line 3
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Ljava/lang/reflect/Method;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1

    .line 4
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1

    .line 5
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    move-result-object p1

    return-object p1
.end method

.method public bootstrap(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;
    .locals 1

    .line 6
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;

    invoke-static {p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;

    move-result-object p1

    iget-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;Ljava/util/Map;)V

    return-object v0
.end method

.method public to(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->to(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;

    move-result-object p1

    return-object p1
.end method

.method public to(Ljava/lang/reflect/Method;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->to(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;

    move-result-object p1

    return-object p1
.end method

.method public to(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;
    .locals 3

    .line 3
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->dispatcherFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping;->offsetMappings:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1, v0, v1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation;->access$500(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;

    move-result-object p1

    return-object p1
.end method
