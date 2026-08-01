.class public final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ReaderFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
        "Lnet/bytebuddy/asm/Advice$FieldGetterHandle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

.field private static final FIELD_GETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FIELD_GETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 16
    .line 17
    const-class v0, Lnet/bytebuddy/asm/Advice$FieldGetterHandle;

    .line 18
    .line 19
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "value"

    .line 28
    .line 29
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 38
    .line 39
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 44
    .line 45
    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->FIELD_GETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    const-string v1, "declaringType"

    .line 48
    .line 49
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 58
    .line 59
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->FIELD_GETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->$VALUES:[Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getAnnotationType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/asm/Advice$FieldGetterHandle;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lnet/bytebuddy/asm/Advice$FieldGetterHandle;

    .line 2
    .line 3
    return-object p0
.end method

.method public make(Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;)Lnet/bytebuddy/asm/Advice$OffsetMapping;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$FieldGetterHandle;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;",
            ")",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 10
    .line 11
    invoke-virtual {p3}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-interface {p0, p3}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    sget-object p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->FIELD_GETTER_HANDLE_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    invoke-interface {p2, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-class p1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const-class p3, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType;

    .line 46
    .line 47
    sget-object p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->GETTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    .line 48
    .line 49
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->FIELD_GETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-interface {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_0
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;

    .line 66
    .line 67
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->GETTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    .line 68
    .line 69
    sget-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->FIELD_GETTER_HANDLE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 70
    .line 71
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-interface {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p1, v0, p2, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_1
    const-string p0, "Cannot assign method handle to "

    .line 86
    .line 87
    invoke-static {p1, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method
