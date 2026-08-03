.class public final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "WriterFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
        "Lnet/bytebuddy/asm/Advice$FieldSetterHandle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

.field private static final FIELD_SETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FIELD_SETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    filled-new-array {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    const-class v0, Lnet/bytebuddy/asm/Advice$FieldSetterHandle;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v0

    const-string v1, "value"

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->FIELD_SETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    const-string v1, "declaringType"

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->FIELD_SETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    return-object v0
.end method


# virtual methods
.method public getAnnotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/asm/Advice$FieldSetterHandle;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/bytebuddy/asm/Advice$FieldSetterHandle;

    return-object v0
.end method

.method public make(Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;)Lnet/bytebuddy/asm/Advice$OffsetMapping;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$FieldSetterHandle;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;",
            ")",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping;"
        }
    .end annotation

    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p3

    invoke-interface {p3}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p3

    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->FIELD_SETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p2, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p1

    const-class p3, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p1, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {p1, p3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result p3

    const-class v0, Ljava/lang/String;

    if-eqz p3, :cond_0

    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType;

    sget-object p3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->SETTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    sget-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->FIELD_SETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, p3, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;

    sget-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->SETTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    sget-object v2, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->FIELD_SETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {p2, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p3, v1, p2, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)V

    move-object p1, p3

    :goto_0
    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot assign method handle to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
