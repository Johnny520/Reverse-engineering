.class public abstract enum Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$WithMethodAttributeAppenderFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;",
        ">;",
        "Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

.field public static final enum DEFAULT_CONSTRUCTOR:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

.field public static final enum IMITATE_SUPER_CLASS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

.field public static final enum IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

.field public static final enum IMITATE_SUPER_CLASS_PUBLIC:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

.field public static final enum NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$1;

    .line 2
    .line 3
    const-string v1, "NO_CONSTRUCTORS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$2;

    .line 12
    .line 13
    const-string v3, "DEFAULT_CONSTRUCTOR"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->DEFAULT_CONSTRUCTOR:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$3;

    .line 22
    .line 23
    const-string v5, "IMITATE_SUPER_CLASS"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$4;

    .line 32
    .line 33
    const-string v7, "IMITATE_SUPER_CLASS_PUBLIC"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_PUBLIC:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 40
    .line 41
    new-instance v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$5;

    .line 42
    .line 43
    const-string v9, "IMITATE_SUPER_CLASS_OPENING"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 65
    .line 66
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract doExtractConstructors(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;"
        }
    .end annotation
.end method

.method public abstract doInject(Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;
.end method

.method public extractConstructors(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->doExtractConstructors(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 29
    .line 30
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 31
    .line 32
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getModifiers()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {p0, v4}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->resolveModifier(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getTypeVariableTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getParameterTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    sget-object v11, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 69
    .line 70
    invoke-direct/range {v2 .. v11}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-object v0
.end method

.method public inject(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;
    .locals 0

    .line 1
    sget-object p1, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$NoOp;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->doInject(Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public resolveModifier(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public with(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$WithMethodAttributeAppenderFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$WithMethodAttributeAppenderFactory;-><init>(Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public withInheritedAnnotations()Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$WithMethodAttributeAppenderFactory;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod;->EXCLUDING_RECEIVER:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$ForInstrumentedMethod;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default$WithMethodAttributeAppenderFactory;-><init>(Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
