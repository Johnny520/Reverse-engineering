.class public Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation


# static fields
.field private static final KEYWORDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final annotationDescriptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final anonymousClass:Z

.field private final auxiliaryFields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final declaredTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final declaringType:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final enclosingType:Lnet/bytebuddy/description/type/TypeDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final fieldTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/field/FieldDescription$Token;",
            ">;"
        }
    .end annotation
.end field

.field private final interfaceTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field

.field private final loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

.field private final localClass:Z

.field private final methodTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;"
        }
    .end annotation
.end field

.field private final modifiers:I

.field private final moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final nestHost:Lnet/bytebuddy/description/type/TypeDescription;

.field private final nestMembers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final permittedSubclasses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final record:Z

.field private final recordComponentTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;",
            ">;"
        }
    .end annotation
.end field

.field private final superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

.field private final typeVariables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 51

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v49, "super"

    .line 4
    .line 5
    const-string v50, "while"

    .line 6
    .line 7
    const-string v1, "abstract"

    .line 8
    .line 9
    const-string v2, "continue"

    .line 10
    .line 11
    const-string v3, "for"

    .line 12
    .line 13
    const-string v4, "new"

    .line 14
    .line 15
    const-string v5, "switch"

    .line 16
    .line 17
    const-string v6, "assert"

    .line 18
    .line 19
    const-string v7, "default"

    .line 20
    .line 21
    const-string v8, "goto"

    .line 22
    .line 23
    const-string v9, "package"

    .line 24
    .line 25
    const-string v10, "synchronized"

    .line 26
    .line 27
    const-string v11, "boolean"

    .line 28
    .line 29
    const-string v12, "do"

    .line 30
    .line 31
    const-string v13, "if"

    .line 32
    .line 33
    const-string v14, "private"

    .line 34
    .line 35
    const-string v15, "this"

    .line 36
    .line 37
    const-string v16, "break"

    .line 38
    .line 39
    const-string v17, "double"

    .line 40
    .line 41
    const-string v18, "implements"

    .line 42
    .line 43
    const-string v19, "protected"

    .line 44
    .line 45
    const-string v20, "throw"

    .line 46
    .line 47
    const-string v21, "byte"

    .line 48
    .line 49
    const-string v22, "else"

    .line 50
    .line 51
    const-string v23, "import"

    .line 52
    .line 53
    const-string v24, "public"

    .line 54
    .line 55
    const-string v25, "throws"

    .line 56
    .line 57
    const-string v26, "case"

    .line 58
    .line 59
    const-string v27, "enum"

    .line 60
    .line 61
    const-string v28, "instanceof"

    .line 62
    .line 63
    const-string v29, "return"

    .line 64
    .line 65
    const-string v30, "transient"

    .line 66
    .line 67
    const-string v31, "catch"

    .line 68
    .line 69
    const-string v32, "extends"

    .line 70
    .line 71
    const-string v33, "int"

    .line 72
    .line 73
    const-string v34, "short"

    .line 74
    .line 75
    const-string v35, "try"

    .line 76
    .line 77
    const-string v36, "char"

    .line 78
    .line 79
    const-string v37, "final"

    .line 80
    .line 81
    const-string v38, "interface"

    .line 82
    .line 83
    const-string v39, "static"

    .line 84
    .line 85
    const-string v40, "void"

    .line 86
    .line 87
    const-string v41, "class"

    .line 88
    .line 89
    const-string v42, "finally"

    .line 90
    .line 91
    const-string v43, "long"

    .line 92
    .line 93
    const-string v44, "strictfp"

    .line 94
    .line 95
    const-string v45, "volatile"

    .line 96
    .line 97
    const-string v46, "const"

    .line 98
    .line 99
    const-string v47, "float"

    .line 100
    .line 101
    const-string v48, "native"

    .line 102
    .line 103
    filled-new-array/range {v1 .. v50}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->KEYWORDS:Ljava/util/Set;

    .line 115
    .line 116
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .param p3    # Lnet/bytebuddy/description/module/ModuleDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Lnet/bytebuddy/description/type/TypeDescription$Generic;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p14    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p15    # Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p16    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/module/ModuleDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/field/FieldDescription$Token;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;ZZZ",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 21
    .line 22
    iput-object p10, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 23
    .line 24
    iput-object p11, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 25
    .line 26
    iput-object p12, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 27
    .line 28
    iput-object p13, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 29
    .line 30
    iput-object p14, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    iput-object p15, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 45
    .line 46
    move/from16 p1, p19

    .line 47
    .line 48
    iput-boolean p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 49
    .line 50
    move/from16 p1, p20

    .line 51
    .line 52
    iput-boolean p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 53
    .line 54
    move/from16 p1, p21

    .line 55
    .line 56
    iput-boolean p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 57
    .line 58
    move-object/from16 p1, p22

    .line 59
    .line 60
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    move-object/from16 p1, p23

    .line 63
    .line 64
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 65
    .line 66
    return-void
.end method

.method private static isValidIdentifier(Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->KEYWORDS:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Character;->isUnicodeIdentifierStart(C)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    const-string v0, "package-info"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, 0x1

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    const-string v0, "module-info"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v0, v2

    .line 56
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-ge v0, v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3}, Ljava/lang/Character;->isUnicodeIdentifierPart(C)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    return v1

    .line 83
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    :goto_1
    return v2

    .line 87
    :cond_4
    :goto_2
    return v1
.end method

.method private static isValidIdentifier([Ljava/lang/String;)Z
    .locals 4

    .line 88
    array-length v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 89
    :cond_0
    array-length v0, p0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    .line 90
    invoke-static {v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static isValidMethodIdentifier(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const-string v0, "<clinit>"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const-string v0, "<init>"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, v1

    .line 28
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ge v0, v3, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/16 v4, 0x2e

    .line 39
    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x2f

    .line 43
    .line 44
    if-eq v3, v4, :cond_2

    .line 45
    .line 46
    const/16 v4, 0x3b

    .line 47
    .line 48
    if-eq v3, v4, :cond_2

    .line 49
    .line 50
    const/16 v4, 0x3c

    .line 51
    .line 52
    if-eq v3, v4, :cond_2

    .line 53
    .line 54
    const/16 v4, 0x3e

    .line 55
    .line 56
    if-eq v3, v4, :cond_2

    .line 57
    .line 58
    const/16 v4, 0x5b

    .line 59
    .line 60
    if-eq v3, v4, :cond_2

    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return v1

    .line 66
    :cond_3
    :goto_1
    return v2
.end method

.method private static isValidUnqualifiedNameIdentifier(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v0, v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x2e

    .line 21
    .line 22
    if-eq v2, v3, :cond_1

    .line 23
    .line 24
    const/16 v3, 0x2f

    .line 25
    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    const/16 v3, 0x3b

    .line 29
    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x5b

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return v1

    .line 40
    :cond_2
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static of(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 1

    .line 14
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;->MODIFIABLE:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;

    invoke-virtual {v0, p0, p2, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->resolve()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-static {p0, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->of(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/field/FieldList$ForTokens;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/field/FieldList$ForTokens;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForTokens;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/method/MethodList$ForTokens;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    return-object p0
.end method

.method public getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$WithResolvedErasure;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$WithResolvedErasure;-><init>(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNestHost()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    const-class v1, Lnet/bytebuddy/dynamic/TargetType;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    return-object p0
.end method

.method public getNestMembers()Lnet/bytebuddy/description/type/TypeList;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    const-class v1, Lnet/bytebuddy/dynamic/TargetType;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Explicit;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {p0, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Explicit;-><init>(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public getPackage()Lnet/bytebuddy/description/type/PackageDescription;
    .locals 3
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lnet/bytebuddy/description/type/PackageDescription;->DEFAULT:Lnet/bytebuddy/description/type/PackageDescription;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v1, Lnet/bytebuddy/description/type/PackageDescription$Simple;

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v1, p0}, Lnet/bytebuddy/description/type/PackageDescription$Simple;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method public getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Empty;

    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Empty;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Explicit;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Explicit;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/RecordComponentList$ForTokens;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/type/RecordComponentList$ForTokens;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithResolvedErasure;

    .line 9
    .line 10
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForAttachment;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithResolvedErasure;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public getTypeInitializer()Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;->attachVariables(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public isAnonymousType()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 2
    .line 3
    return p0
.end method

.method public isLocalType()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 2
    .line 3
    return p0
.end method

.method public isRecord()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->RECORD:Lnet/bytebuddy/utility/JavaType;

    .line 18
    .line 19
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public isSealed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public validated()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "\\."

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier([Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v6, 0x0

    .line 18
    const-string v4, " for "

    .line 19
    .line 20
    if-eqz v0, :cond_7b

    .line 21
    .line 22
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const v1, -0x27e40

    .line 27
    .line 28
    .line 29
    and-int/2addr v0, v1

    .line 30
    const-string v13, "Illegal modifiers "

    .line 31
    .line 32
    if-nez v0, :cond_7a

    .line 33
    .line 34
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isPackageType()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/16 v1, 0x1600

    .line 45
    .line 46
    if-ne v0, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const-string v1, " for package "

    .line 54
    .line 55
    invoke-static {v0, v1, v5, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_1
    :goto_0
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isModuleType()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const-string v1, " for module "

    .line 77
    .line 78
    invoke-static {v0, v1, v5, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v6

    .line 82
    :cond_3
    :goto_1
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_7

    .line 87
    .line 88
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->SUPER_CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 103
    .line 104
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    const-string v1, "Invisible super type "

    .line 128
    .line 129
    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-object v6

    .line 133
    :cond_5
    const-string v1, "Illegal type annotations on super class "

    .line 134
    .line 135
    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-object v6

    .line 139
    :cond_6
    const-string v1, "Illegal super class "

    .line 140
    .line 141
    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v6

    .line 145
    :cond_7
    :goto_2
    new-instance v0, Ljava/util/HashSet;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_c

    .line 163
    .line 164
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 169
    .line 170
    sget-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->INTERFACE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 171
    .line 172
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_b

    .line 183
    .line 184
    sget-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 185
    .line 186
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    check-cast v3, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_a

    .line 197
    .line 198
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_9

    .line 207
    .line 208
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-interface {v3, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_8

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    const-string v0, "Invisible interface type "

    .line 220
    .line 221
    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-object v6

    .line 225
    :cond_9
    const-string v0, "Already implemented interface "

    .line 226
    .line 227
    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v6

    .line 231
    :cond_a
    const-string v0, "Illegal type annotations on interface "

    .line 232
    .line 233
    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    return-object v6

    .line 237
    :cond_b
    const-string v0, "Illegal interface "

    .line 238
    .line 239
    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-object v6

    .line 243
    :cond_c
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-nez v1, :cond_e

    .line 252
    .line 253
    const-class v1, Ljava/lang/Throwable;

    .line 254
    .line 255
    invoke-virtual {v5, v1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_d

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_d
    const-string v0, "Cannot define throwable "

    .line 263
    .line 264
    const-string v1, " to be generic"

    .line 265
    .line 266
    invoke-static {v5, v0, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-object v6

    .line 270
    :cond_e
    :goto_4
    new-instance v7, Ljava/util/HashSet;

    .line 271
    .line 272
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    const-string v14, " does not define at least one bound"

    .line 284
    .line 285
    const-string v15, "Type variable "

    .line 286
    .line 287
    move v2, v0

    .line 288
    const-string v0, "Illegal interface bound "

    .line 289
    .line 290
    move-object v3, v0

    .line 291
    const-string v0, "Duplicate bound "

    .line 292
    .line 293
    const-string v9, "Illegal type variable bound "

    .line 294
    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    const-string v10, "Illegal type annotation on \'"

    .line 298
    .line 299
    const-string v11, "Illegal type variable name \'"

    .line 300
    .line 301
    const-string v12, "Duplicate type variable symbol \'"

    .line 302
    .line 303
    const-string v1, "\' for "

    .line 304
    .line 305
    move/from16 v17, v2

    .line 306
    .line 307
    const-string v2, " of "

    .line 308
    .line 309
    if-eqz v17, :cond_19

    .line 310
    .line 311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v17

    .line 315
    check-cast v17, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 316
    .line 317
    move-object/from16 v18, v6

    .line 318
    .line 319
    invoke-interface/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v19

    .line 327
    if-eqz v19, :cond_18

    .line 328
    .line 329
    invoke-static {v6}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier(Ljava/lang/String;)Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-eqz v6, :cond_17

    .line 334
    .line 335
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->ofFormalTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_16

    .line 340
    .line 341
    new-instance v6, Ljava/util/HashSet;

    .line 342
    .line 343
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-interface/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_14

    .line 359
    .line 360
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 365
    .line 366
    sget-object v11, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 367
    .line 368
    invoke-interface {v1, v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    check-cast v11, Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    if-eqz v11, :cond_13

    .line 379
    .line 380
    sget-object v11, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 381
    .line 382
    invoke-interface {v1, v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    check-cast v11, Ljava/lang/Boolean;

    .line 387
    .line 388
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 389
    .line 390
    .line 391
    move-result v11

    .line 392
    if-eqz v11, :cond_12

    .line 393
    .line 394
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-eqz v11, :cond_11

    .line 399
    .line 400
    if-eqz v16, :cond_f

    .line 401
    .line 402
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    invoke-virtual {v11}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isTypeVariable()Z

    .line 407
    .line 408
    .line 409
    move-result v11

    .line 410
    if-nez v11, :cond_10

    .line 411
    .line 412
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    if-eqz v11, :cond_10

    .line 417
    .line 418
    :cond_f
    move-object v11, v7

    .line 419
    move-object v7, v3

    .line 420
    move-object/from16 v3, v17

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_10
    move-object v0, v3

    .line 424
    move-object/from16 v3, v17

    .line 425
    .line 426
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object v18

    .line 430
    :goto_7
    move-object/from16 v5, p0

    .line 431
    .line 432
    move-object/from16 v17, v3

    .line 433
    .line 434
    move-object v3, v7

    .line 435
    move-object v7, v11

    .line 436
    const/16 v16, 0x1

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_11
    move-object/from16 v3, v17

    .line 440
    .line 441
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v18

    .line 445
    :cond_12
    const-string v0, "Illegal type annotations on type variable "

    .line 446
    .line 447
    invoke-static {v0, v1, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    return-object v18

    .line 451
    :cond_13
    move-object v0, v9

    .line 452
    move-object/from16 v3, v17

    .line 453
    .line 454
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    return-object v18

    .line 458
    :cond_14
    move-object v11, v7

    .line 459
    move-object/from16 v3, v17

    .line 460
    .line 461
    if-eqz v16, :cond_15

    .line 462
    .line 463
    move-object v7, v11

    .line 464
    move-object/from16 v6, v18

    .line 465
    .line 466
    goto/16 :goto_5

    .line 467
    .line 468
    :cond_15
    invoke-static {v15, v3, v4, v5, v14}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    return-object v18

    .line 472
    :cond_16
    move-object/from16 v3, v17

    .line 473
    .line 474
    invoke-static {v10, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    return-object v18

    .line 478
    :cond_17
    move-object/from16 v3, v17

    .line 479
    .line 480
    invoke-static {v11, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v18

    .line 484
    :cond_18
    move-object/from16 v3, v17

    .line 485
    .line 486
    invoke-static {v12, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    return-object v18

    .line 490
    :cond_19
    move-object v7, v9

    .line 491
    move-object v9, v2

    .line 492
    move-object v2, v7

    .line 493
    move-object v7, v3

    .line 494
    move-object/from16 v18, v6

    .line 495
    .line 496
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    const-string v6, "Cannot define array type or primitive type "

    .line 501
    .line 502
    if-eqz v3, :cond_1b

    .line 503
    .line 504
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    if-nez v8, :cond_1a

    .line 509
    .line 510
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 511
    .line 512
    .line 513
    move-result v8

    .line 514
    if-nez v8, :cond_1a

    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_1a
    const-string v0, " + as enclosing type for "

    .line 518
    .line 519
    invoke-static {v6, v3, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    return-object v18

    .line 523
    :cond_1b
    :goto_8
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    if-eqz v8, :cond_1c

    .line 528
    .line 529
    invoke-interface {v8}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    .line 530
    .line 531
    .line 532
    move-result v17

    .line 533
    if-nez v17, :cond_1d

    .line 534
    .line 535
    :cond_1c
    move-object/from16 v17, v0

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_1d
    const-string v0, "Cannot enclose type declaration in class initializer "

    .line 539
    .line 540
    invoke-static {v8, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    return-object v18

    .line 544
    :goto_9
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-eqz v0, :cond_1f

    .line 549
    .line 550
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-nez v8, :cond_1e

    .line 555
    .line 556
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    if-nez v8, :cond_1e

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_1e
    const-string v1, " as declaring type for "

    .line 564
    .line 565
    invoke-static {v6, v0, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v18

    .line 569
    :cond_1f
    if-nez v3, :cond_21

    .line 570
    .line 571
    if-nez v8, :cond_21

    .line 572
    .line 573
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isLocalType()Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-nez v0, :cond_20

    .line 578
    .line 579
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isAnonymousType()Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-nez v0, :cond_20

    .line 584
    .line 585
    goto :goto_a

    .line 586
    :cond_20
    const-string v0, "Cannot define an anonymous or local class without a declaring type for "

    .line 587
    .line 588
    invoke-static {v5, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    return-object v18

    .line 592
    :cond_21
    :goto_a
    new-instance v0, Ljava/util/HashSet;

    .line 593
    .line 594
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v8

    .line 605
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v19

    .line 609
    if-eqz v19, :cond_24

    .line 610
    .line 611
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v19

    .line 615
    move-object/from16 v20, v2

    .line 616
    .line 617
    move-object/from16 v2, v19

    .line 618
    .line 619
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 620
    .line 621
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 622
    .line 623
    .line 624
    move-result v19

    .line 625
    if-nez v19, :cond_23

    .line 626
    .line 627
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 628
    .line 629
    .line 630
    move-result v19

    .line 631
    if-nez v19, :cond_23

    .line 632
    .line 633
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v19

    .line 637
    if-eqz v19, :cond_22

    .line 638
    .line 639
    move-object/from16 v2, v20

    .line 640
    .line 641
    goto :goto_b

    .line 642
    :cond_22
    const-string v0, "Duplicate definition of declared type "

    .line 643
    .line 644
    invoke-static {v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    return-object v18

    .line 652
    :cond_23
    const-string v0, " + as declared type for "

    .line 653
    .line 654
    invoke-static {v6, v2, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 655
    .line 656
    .line 657
    return-object v18

    .line 658
    :cond_24
    move-object/from16 v20, v2

    .line 659
    .line 660
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-eqz v2, :cond_28

    .line 669
    .line 670
    new-instance v0, Ljava/util/HashSet;

    .line 671
    .line 672
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v8

    .line 687
    if-eqz v8, :cond_29

    .line 688
    .line 689
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    check-cast v8, Lnet/bytebuddy/description/type/TypeDescription;

    .line 694
    .line 695
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 696
    .line 697
    .line 698
    move-result v19

    .line 699
    if-nez v19, :cond_27

    .line 700
    .line 701
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 702
    .line 703
    .line 704
    move-result v19

    .line 705
    if-nez v19, :cond_27

    .line 706
    .line 707
    invoke-interface {v8, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 708
    .line 709
    .line 710
    move-result v19

    .line 711
    if-eqz v19, :cond_26

    .line 712
    .line 713
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v19

    .line 717
    if-eqz v19, :cond_25

    .line 718
    .line 719
    goto :goto_c

    .line 720
    :cond_25
    const-string v0, "Duplicate definition of nest member "

    .line 721
    .line 722
    invoke-static {v0, v8}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    return-object v18

    .line 730
    :cond_26
    const-string v0, "Cannot define nest member "

    .line 731
    .line 732
    const-string v1, " + within different package then "

    .line 733
    .line 734
    invoke-static {v0, v8, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    return-object v18

    .line 738
    :cond_27
    const-string v0, " + as nest member of "

    .line 739
    .line 740
    invoke-static {v6, v8, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v18

    .line 744
    :cond_28
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-nez v2, :cond_79

    .line 749
    .line 750
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-nez v2, :cond_79

    .line 755
    .line 756
    invoke-interface {v0, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    if-eqz v2, :cond_78

    .line 761
    .line 762
    :cond_29
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    if-eqz v2, :cond_2b

    .line 775
    .line 776
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 781
    .line 782
    invoke-interface {v2, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    if-eqz v6, :cond_2a

    .line 787
    .line 788
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v6

    .line 792
    if-nez v6, :cond_2a

    .line 793
    .line 794
    goto :goto_d

    .line 795
    :cond_2a
    const-string v0, "Cannot assign permitted subclass "

    .line 796
    .line 797
    const-string v1, " to "

    .line 798
    .line 799
    invoke-static {v0, v2, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    return-object v18

    .line 803
    :cond_2b
    new-instance v0, Ljava/util/HashSet;

    .line 804
    .line 805
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 817
    .line 818
    .line 819
    move-result v6

    .line 820
    const-string v8, "Duplicate annotation "

    .line 821
    .line 822
    move-object/from16 v19, v2

    .line 823
    .line 824
    const-string v2, " on "

    .line 825
    .line 826
    move-object/from16 v21, v3

    .line 827
    .line 828
    const-string v3, "Cannot add "

    .line 829
    .line 830
    if-eqz v6, :cond_31

    .line 831
    .line 832
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v6

    .line 836
    check-cast v6, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 837
    .line 838
    move-object/from16 v22, v7

    .line 839
    .line 840
    sget-object v7, Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;

    .line 841
    .line 842
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    if-nez v7, :cond_2f

    .line 847
    .line 848
    invoke-virtual {v5}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isAnnotation()Z

    .line 849
    .line 850
    .line 851
    move-result v7

    .line 852
    if-eqz v7, :cond_2c

    .line 853
    .line 854
    sget-object v7, Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;

    .line 855
    .line 856
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 857
    .line 858
    .line 859
    move-result v7

    .line 860
    if-nez v7, :cond_2f

    .line 861
    .line 862
    :cond_2c
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isPackageType()Z

    .line 863
    .line 864
    .line 865
    move-result v7

    .line 866
    if-eqz v7, :cond_2d

    .line 867
    .line 868
    sget-object v7, Ljava/lang/annotation/ElementType;->PACKAGE:Ljava/lang/annotation/ElementType;

    .line 869
    .line 870
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 871
    .line 872
    .line 873
    move-result v7

    .line 874
    if-nez v7, :cond_2f

    .line 875
    .line 876
    :cond_2d
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isModuleType()Z

    .line 877
    .line 878
    .line 879
    move-result v7

    .line 880
    if-eqz v7, :cond_2e

    .line 881
    .line 882
    const-string v7, "MODULE"

    .line 883
    .line 884
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/String;)Z

    .line 885
    .line 886
    .line 887
    move-result v7

    .line 888
    if-eqz v7, :cond_2e

    .line 889
    .line 890
    goto :goto_f

    .line 891
    :cond_2e
    invoke-static {v3, v6, v2, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    return-object v18

    .line 895
    :cond_2f
    :goto_f
    invoke-interface {v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v2

    .line 903
    if-eqz v2, :cond_30

    .line 904
    .line 905
    move-object/from16 v2, v19

    .line 906
    .line 907
    move-object/from16 v3, v21

    .line 908
    .line 909
    move-object/from16 v7, v22

    .line 910
    .line 911
    goto :goto_e

    .line 912
    :cond_30
    invoke-static {v8, v6, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    return-object v18

    .line 916
    :cond_31
    move-object/from16 v22, v7

    .line 917
    .line 918
    new-instance v0, Ljava/util/HashSet;

    .line 919
    .line 920
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    move-object/from16 v19, v6

    .line 936
    .line 937
    const-string v6, "Illegal type annotations on "

    .line 938
    .line 939
    if-eqz v7, :cond_3c

    .line 940
    .line 941
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v7

    .line 945
    check-cast v7, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 946
    .line 947
    invoke-interface {v7}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v23

    .line 951
    move-object/from16 v24, v9

    .line 952
    .line 953
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->asSignatureToken()Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;

    .line 954
    .line 955
    .line 956
    move-result-object v9

    .line 957
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v9

    .line 961
    if-eqz v9, :cond_3b

    .line 962
    .line 963
    invoke-static/range {v23 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidUnqualifiedNameIdentifier(Ljava/lang/String;)Z

    .line 964
    .line 965
    .line 966
    move-result v9

    .line 967
    if-eqz v9, :cond_3a

    .line 968
    .line 969
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 970
    .line 971
    .line 972
    move-result v9

    .line 973
    const v23, -0x250e0

    .line 974
    .line 975
    .line 976
    and-int v9, v9, v23

    .line 977
    .line 978
    if-nez v9, :cond_39

    .line 979
    .line 980
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 981
    .line 982
    .line 983
    move-result-object v9

    .line 984
    move-object/from16 v23, v0

    .line 985
    .line 986
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->FIELD:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 987
    .line 988
    invoke-interface {v9, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    check-cast v0, Ljava/lang/Boolean;

    .line 993
    .line 994
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    if-eqz v0, :cond_38

    .line 999
    .line 1000
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 1001
    .line 1002
    invoke-interface {v9, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    check-cast v0, Ljava/lang/Boolean;

    .line 1007
    .line 1008
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_37

    .line 1013
    .line 1014
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    if-nez v0, :cond_33

    .line 1019
    .line 1020
    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-interface {v0, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    if-eqz v0, :cond_32

    .line 1029
    .line 1030
    goto :goto_11

    .line 1031
    :cond_32
    const-string v0, "Invisible field type "

    .line 1032
    .line 1033
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-static {v0, v1, v4, v7}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    return-object v18

    .line 1041
    :cond_33
    :goto_11
    new-instance v0, Ljava/util/HashSet;

    .line 1042
    .line 1043
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    invoke-interface {v7}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v6

    .line 1050
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v9

    .line 1058
    if-eqz v9, :cond_36

    .line 1059
    .line 1060
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v9

    .line 1064
    check-cast v9, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 1065
    .line 1066
    move-object/from16 v25, v6

    .line 1067
    .line 1068
    sget-object v6, Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;

    .line 1069
    .line 1070
    invoke-interface {v9, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v6

    .line 1074
    if-eqz v6, :cond_35

    .line 1075
    .line 1076
    invoke-interface {v9}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v6

    .line 1080
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v6

    .line 1084
    if-eqz v6, :cond_34

    .line 1085
    .line 1086
    move-object/from16 v6, v25

    .line 1087
    .line 1088
    goto :goto_12

    .line 1089
    :cond_34
    invoke-static {v8, v9, v4, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1090
    .line 1091
    .line 1092
    return-object v18

    .line 1093
    :cond_35
    invoke-static {v3, v9, v2, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    return-object v18

    .line 1097
    :cond_36
    move-object/from16 v6, v19

    .line 1098
    .line 1099
    move-object/from16 v0, v23

    .line 1100
    .line 1101
    move-object/from16 v9, v24

    .line 1102
    .line 1103
    goto/16 :goto_10

    .line 1104
    .line 1105
    :cond_37
    invoke-static {v6, v9, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    return-object v18

    .line 1109
    :cond_38
    const-string v0, "Illegal field type "

    .line 1110
    .line 1111
    invoke-static {v0, v9, v4, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1112
    .line 1113
    .line 1114
    return-object v18

    .line 1115
    :cond_39
    const-string v0, "Illegal field modifiers "

    .line 1116
    .line 1117
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    invoke-static {v1, v4, v7, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    return-object v18

    .line 1125
    :cond_3a
    const-string v0, "Illegal field name for "

    .line 1126
    .line 1127
    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    return-object v18

    .line 1131
    :cond_3b
    const-string v0, "Duplicate field definition for "

    .line 1132
    .line 1133
    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    return-object v18

    .line 1137
    :cond_3c
    move-object/from16 v24, v9

    .line 1138
    .line 1139
    new-instance v0, Ljava/util/HashSet;

    .line 1140
    .line 1141
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v7

    .line 1148
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v19

    .line 1152
    :goto_13
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    if-eqz v7, :cond_77

    .line 1157
    .line 1158
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v7

    .line 1162
    check-cast v7, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 1163
    .line 1164
    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v9

    .line 1168
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v9

    .line 1172
    if-eqz v9, :cond_76

    .line 1173
    .line 1174
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 1175
    .line 1176
    .line 1177
    move-result v9

    .line 1178
    and-int/lit16 v9, v9, -0x1e00

    .line 1179
    .line 1180
    if-nez v9, :cond_75

    .line 1181
    .line 1182
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v9

    .line 1186
    if-eqz v9, :cond_3e

    .line 1187
    .line 1188
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 1189
    .line 1190
    .line 1191
    move-result v9

    .line 1192
    and-int/lit16 v9, v9, 0x800

    .line 1193
    .line 1194
    if-nez v9, :cond_3d

    .line 1195
    .line 1196
    goto :goto_14

    .line 1197
    :cond_3d
    const-string v0, "Cannot declare strict computations for "

    .line 1198
    .line 1199
    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    return-object v18

    .line 1203
    :cond_3e
    :goto_14
    invoke-virtual {v5}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isInterface()Z

    .line 1204
    .line 1205
    .line 1206
    move-result v9

    .line 1207
    if-eqz v9, :cond_40

    .line 1208
    .line 1209
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v9

    .line 1213
    if-nez v9, :cond_40

    .line 1214
    .line 1215
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v9

    .line 1219
    if-eqz v9, :cond_3f

    .line 1220
    .line 1221
    goto :goto_15

    .line 1222
    :cond_3f
    const-string v0, "Methods declared by an interface must be public or private "

    .line 1223
    .line 1224
    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    return-object v18

    .line 1228
    :cond_40
    :goto_15
    new-instance v9, Ljava/util/HashSet;

    .line 1229
    .line 1230
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 1231
    .line 1232
    .line 1233
    invoke-interface {v7}, Lnet/bytebuddy/description/TypeVariableSource;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v23

    .line 1237
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v23

    .line 1241
    :goto_16
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 1242
    .line 1243
    .line 1244
    move-result v25

    .line 1245
    if-eqz v25, :cond_4b

    .line 1246
    .line 1247
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v25

    .line 1251
    check-cast v25, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1252
    .line 1253
    move-object/from16 v26, v0

    .line 1254
    .line 1255
    invoke-interface/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    invoke-virtual {v9, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1260
    .line 1261
    .line 1262
    move-result v27

    .line 1263
    if-eqz v27, :cond_4a

    .line 1264
    .line 1265
    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier(Ljava/lang/String;)Z

    .line 1266
    .line 1267
    .line 1268
    move-result v0

    .line 1269
    if-eqz v0, :cond_49

    .line 1270
    .line 1271
    invoke-static/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->ofFormalTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v0

    .line 1275
    if-eqz v0, :cond_48

    .line 1276
    .line 1277
    new-instance v0, Ljava/util/HashSet;

    .line 1278
    .line 1279
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1280
    .line 1281
    .line 1282
    invoke-interface/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v27

    .line 1286
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v27

    .line 1290
    move/from16 v28, v16

    .line 1291
    .line 1292
    :goto_17
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v29

    .line 1296
    if-eqz v29, :cond_46

    .line 1297
    .line 1298
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v29

    .line 1302
    move-object/from16 v30, v4

    .line 1303
    .line 1304
    move-object/from16 v4, v29

    .line 1305
    .line 1306
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1307
    .line 1308
    sget-object v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 1309
    .line 1310
    invoke-interface {v4, v5}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    check-cast v5, Ljava/lang/Boolean;

    .line 1315
    .line 1316
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1317
    .line 1318
    .line 1319
    move-result v5

    .line 1320
    if-eqz v5, :cond_45

    .line 1321
    .line 1322
    sget-object v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 1323
    .line 1324
    invoke-interface {v4, v5}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v5

    .line 1328
    check-cast v5, Ljava/lang/Boolean;

    .line 1329
    .line 1330
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v5

    .line 1334
    if-eqz v5, :cond_44

    .line 1335
    .line 1336
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v5

    .line 1340
    if-eqz v5, :cond_43

    .line 1341
    .line 1342
    if-eqz v28, :cond_41

    .line 1343
    .line 1344
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isTypeVariable()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v5

    .line 1352
    if-nez v5, :cond_42

    .line 1353
    .line 1354
    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 1355
    .line 1356
    .line 1357
    move-result v5

    .line 1358
    if-eqz v5, :cond_42

    .line 1359
    .line 1360
    :cond_41
    move-object/from16 v4, v30

    .line 1361
    .line 1362
    goto :goto_18

    .line 1363
    :cond_42
    move-object v8, v4

    .line 1364
    move-object v12, v7

    .line 1365
    move-object/from16 v7, v22

    .line 1366
    .line 1367
    move-object/from16 v9, v24

    .line 1368
    .line 1369
    move-object/from16 v10, v25

    .line 1370
    .line 1371
    move-object/from16 v11, v30

    .line 1372
    .line 1373
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1374
    .line 1375
    .line 1376
    return-object v18

    .line 1377
    :goto_18
    const/16 v28, 0x1

    .line 1378
    .line 1379
    move-object/from16 v5, p0

    .line 1380
    .line 1381
    goto :goto_17

    .line 1382
    :cond_43
    move-object v8, v4

    .line 1383
    move-object v12, v7

    .line 1384
    move-object/from16 v7, v17

    .line 1385
    .line 1386
    move-object/from16 v9, v24

    .line 1387
    .line 1388
    move-object/from16 v10, v25

    .line 1389
    .line 1390
    move-object/from16 v11, v30

    .line 1391
    .line 1392
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    return-object v18

    .line 1396
    :cond_44
    move-object v8, v4

    .line 1397
    move-object/from16 v2, v24

    .line 1398
    .line 1399
    move-object/from16 v10, v25

    .line 1400
    .line 1401
    move-object/from16 v4, v30

    .line 1402
    .line 1403
    const-string v0, "Illegal type annotations on bound "

    .line 1404
    .line 1405
    move-object/from16 v5, p0

    .line 1406
    .line 1407
    move-object v1, v8

    .line 1408
    move-object v3, v10

    .line 1409
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1410
    .line 1411
    .line 1412
    return-object v18

    .line 1413
    :cond_45
    move-object v8, v4

    .line 1414
    move-object v12, v7

    .line 1415
    move-object/from16 v7, v20

    .line 1416
    .line 1417
    move-object/from16 v9, v24

    .line 1418
    .line 1419
    move-object/from16 v10, v25

    .line 1420
    .line 1421
    move-object/from16 v11, v30

    .line 1422
    .line 1423
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    return-object v18

    .line 1427
    :cond_46
    move-object/from16 v0, v24

    .line 1428
    .line 1429
    move-object/from16 v24, v9

    .line 1430
    .line 1431
    move-object v9, v0

    .line 1432
    move-object v0, v11

    .line 1433
    move-object v11, v4

    .line 1434
    move-object v4, v12

    .line 1435
    move-object v12, v7

    .line 1436
    move-object v7, v5

    .line 1437
    move-object v5, v10

    .line 1438
    move-object/from16 v10, v25

    .line 1439
    .line 1440
    move-object/from16 v25, v8

    .line 1441
    .line 1442
    if-eqz v28, :cond_47

    .line 1443
    .line 1444
    move-object/from16 v8, v24

    .line 1445
    .line 1446
    move-object/from16 v24, v9

    .line 1447
    .line 1448
    move-object v9, v8

    .line 1449
    move-object v10, v5

    .line 1450
    move-object v5, v7

    .line 1451
    move-object v7, v12

    .line 1452
    move-object/from16 v8, v25

    .line 1453
    .line 1454
    move-object v12, v4

    .line 1455
    move-object v4, v11

    .line 1456
    move-object v11, v0

    .line 1457
    move-object/from16 v0, v26

    .line 1458
    .line 1459
    goto/16 :goto_16

    .line 1460
    .line 1461
    :cond_47
    invoke-static {v15, v10, v11, v12, v14}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1462
    .line 1463
    .line 1464
    return-object v18

    .line 1465
    :cond_48
    move-object v12, v7

    .line 1466
    move-object v5, v10

    .line 1467
    move-object/from16 v10, v25

    .line 1468
    .line 1469
    invoke-static {v5, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1470
    .line 1471
    .line 1472
    return-object v18

    .line 1473
    :cond_49
    move-object v12, v7

    .line 1474
    move-object v0, v11

    .line 1475
    move-object/from16 v10, v25

    .line 1476
    .line 1477
    invoke-static {v0, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1478
    .line 1479
    .line 1480
    return-object v18

    .line 1481
    :cond_4a
    move-object v4, v12

    .line 1482
    move-object/from16 v10, v25

    .line 1483
    .line 1484
    move-object v12, v7

    .line 1485
    invoke-static {v4, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1486
    .line 1487
    .line 1488
    return-object v18

    .line 1489
    :cond_4b
    move-object/from16 v26, v0

    .line 1490
    .line 1491
    move-object/from16 v25, v8

    .line 1492
    .line 1493
    move-object v0, v11

    .line 1494
    move-object/from16 v9, v24

    .line 1495
    .line 1496
    move-object v11, v4

    .line 1497
    move-object v4, v12

    .line 1498
    move-object v12, v7

    .line 1499
    move-object v7, v5

    .line 1500
    move-object v5, v10

    .line 1501
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v8

    .line 1505
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    .line 1506
    .line 1507
    .line 1508
    move-result v10

    .line 1509
    if-nez v10, :cond_74

    .line 1510
    .line 1511
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 1512
    .line 1513
    .line 1514
    move-result v10

    .line 1515
    if-eqz v10, :cond_4e

    .line 1516
    .line 1517
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1518
    .line 1519
    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 1520
    .line 1521
    .line 1522
    move-result v10

    .line 1523
    if-eqz v10, :cond_4d

    .line 1524
    .line 1525
    invoke-interface {v8}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v8

    .line 1529
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1530
    .line 1531
    .line 1532
    move-result v8

    .line 1533
    if-eqz v8, :cond_4c

    .line 1534
    .line 1535
    goto :goto_19

    .line 1536
    :cond_4c
    const-string v0, "The void non-type must not be annotated for "

    .line 1537
    .line 1538
    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1539
    .line 1540
    .line 1541
    return-object v18

    .line 1542
    :cond_4d
    const-string v0, "A constructor must return void "

    .line 1543
    .line 1544
    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1545
    .line 1546
    .line 1547
    return-object v18

    .line 1548
    :cond_4e
    invoke-interface {v12}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v10

    .line 1552
    invoke-static {v10}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidMethodIdentifier(Ljava/lang/String;)Z

    .line 1553
    .line 1554
    .line 1555
    move-result v10

    .line 1556
    if-eqz v10, :cond_73

    .line 1557
    .line 1558
    sget-object v10, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_RETURN:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 1559
    .line 1560
    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v10

    .line 1564
    check-cast v10, Ljava/lang/Boolean;

    .line 1565
    .line 1566
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1567
    .line 1568
    .line 1569
    move-result v10

    .line 1570
    if-eqz v10, :cond_72

    .line 1571
    .line 1572
    sget-object v10, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 1573
    .line 1574
    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v10

    .line 1578
    check-cast v10, Ljava/lang/Boolean;

    .line 1579
    .line 1580
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1581
    .line 1582
    .line 1583
    move-result v10

    .line 1584
    if-eqz v10, :cond_71

    .line 1585
    .line 1586
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    .line 1587
    .line 1588
    .line 1589
    move-result v8

    .line 1590
    if-nez v8, :cond_50

    .line 1591
    .line 1592
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v8

    .line 1596
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v8

    .line 1600
    invoke-interface {v8, v7}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v8

    .line 1604
    if-eqz v8, :cond_4f

    .line 1605
    .line 1606
    goto :goto_19

    .line 1607
    :cond_4f
    const-string v0, "Invisible return type "

    .line 1608
    .line 1609
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v1

    .line 1613
    invoke-static {v0, v1, v11, v12}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1614
    .line 1615
    .line 1616
    return-object v18

    .line 1617
    :cond_50
    :goto_19
    new-instance v8, Ljava/util/HashSet;

    .line 1618
    .line 1619
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 1620
    .line 1621
    .line 1622
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v10

    .line 1626
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v23

    .line 1630
    :goto_1a
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 1631
    .line 1632
    .line 1633
    move-result v10

    .line 1634
    if-eqz v10, :cond_5d

    .line 1635
    .line 1636
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v10

    .line 1640
    check-cast v10, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    .line 1641
    .line 1642
    move-object/from16 v24, v0

    .line 1643
    .line 1644
    invoke-interface {v10}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    move-object/from16 v27, v1

    .line 1649
    .line 1650
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_PARAMETER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 1651
    .line 1652
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v1

    .line 1656
    check-cast v1, Ljava/lang/Boolean;

    .line 1657
    .line 1658
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1659
    .line 1660
    .line 1661
    move-result v1

    .line 1662
    if-eqz v1, :cond_5c

    .line 1663
    .line 1664
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 1665
    .line 1666
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    check-cast v1, Ljava/lang/Boolean;

    .line 1671
    .line 1672
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1673
    .line 1674
    .line 1675
    move-result v1

    .line 1676
    if-eqz v1, :cond_5b

    .line 1677
    .line 1678
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    .line 1679
    .line 1680
    .line 1681
    move-result v1

    .line 1682
    if-nez v1, :cond_52

    .line 1683
    .line 1684
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v0

    .line 1688
    invoke-interface {v0, v7}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v0

    .line 1692
    if-eqz v0, :cond_51

    .line 1693
    .line 1694
    goto :goto_1b

    .line 1695
    :cond_51
    const-string v0, "Invisible parameter type of "

    .line 1696
    .line 1697
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1698
    .line 1699
    .line 1700
    return-object v18

    .line 1701
    :cond_52
    :goto_1b
    invoke-interface {v10}, Lnet/bytebuddy/description/NamedElement$WithOptionalName;->isNamed()Z

    .line 1702
    .line 1703
    .line 1704
    move-result v0

    .line 1705
    if-eqz v0, :cond_55

    .line 1706
    .line 1707
    invoke-interface {v10}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v1

    .line 1715
    if-eqz v1, :cond_54

    .line 1716
    .line 1717
    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidUnqualifiedNameIdentifier(Ljava/lang/String;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v0

    .line 1721
    if-eqz v0, :cond_53

    .line 1722
    .line 1723
    goto :goto_1c

    .line 1724
    :cond_53
    const-string v0, "Illegal parameter name of "

    .line 1725
    .line 1726
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    return-object v18

    .line 1730
    :cond_54
    const-string v0, "Duplicate parameter name of "

    .line 1731
    .line 1732
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1733
    .line 1734
    .line 1735
    return-object v18

    .line 1736
    :cond_55
    :goto_1c
    invoke-interface {v10}, Lnet/bytebuddy/description/method/ParameterDescription;->hasModifiers()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v0

    .line 1740
    if-eqz v0, :cond_57

    .line 1741
    .line 1742
    invoke-interface {v10}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 1743
    .line 1744
    .line 1745
    move-result v0

    .line 1746
    const v1, -0x9011

    .line 1747
    .line 1748
    .line 1749
    and-int/2addr v0, v1

    .line 1750
    if-nez v0, :cond_56

    .line 1751
    .line 1752
    goto :goto_1d

    .line 1753
    :cond_56
    const-string v0, "Illegal modifiers of "

    .line 1754
    .line 1755
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1756
    .line 1757
    .line 1758
    return-object v18

    .line 1759
    :cond_57
    :goto_1d
    new-instance v0, Ljava/util/HashSet;

    .line 1760
    .line 1761
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1762
    .line 1763
    .line 1764
    invoke-interface {v10}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v1

    .line 1768
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v1

    .line 1772
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1773
    .line 1774
    .line 1775
    move-result v28

    .line 1776
    if-eqz v28, :cond_5a

    .line 1777
    .line 1778
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v28

    .line 1782
    move-object/from16 v29, v1

    .line 1783
    .line 1784
    move-object/from16 v1, v28

    .line 1785
    .line 1786
    check-cast v1, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 1787
    .line 1788
    move-object/from16 v28, v4

    .line 1789
    .line 1790
    sget-object v4, Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;

    .line 1791
    .line 1792
    invoke-interface {v1, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 1793
    .line 1794
    .line 1795
    move-result v4

    .line 1796
    if-eqz v4, :cond_59

    .line 1797
    .line 1798
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v4

    .line 1802
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v4

    .line 1806
    if-eqz v4, :cond_58

    .line 1807
    .line 1808
    move-object/from16 v4, v28

    .line 1809
    .line 1810
    move-object/from16 v1, v29

    .line 1811
    .line 1812
    goto :goto_1e

    .line 1813
    :cond_58
    move-object v8, v1

    .line 1814
    move-object/from16 v7, v25

    .line 1815
    .line 1816
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    return-object v18

    .line 1820
    :cond_59
    move-object v8, v1

    .line 1821
    invoke-static {v3, v8, v2, v10}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    return-object v18

    .line 1825
    :cond_5a
    move-object/from16 v28, v4

    .line 1826
    .line 1827
    move-object v1, v7

    .line 1828
    move-object/from16 v0, v24

    .line 1829
    .line 1830
    move-object/from16 v1, v27

    .line 1831
    .line 1832
    goto/16 :goto_1a

    .line 1833
    .line 1834
    :cond_5b
    const-string v0, "Illegal type annotations on parameter "

    .line 1835
    .line 1836
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1837
    .line 1838
    .line 1839
    return-object v18

    .line 1840
    :cond_5c
    const-string v0, "Illegal parameter type of "

    .line 1841
    .line 1842
    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    return-object v18

    .line 1846
    :cond_5d
    move-object/from16 v24, v0

    .line 1847
    .line 1848
    move-object/from16 v27, v1

    .line 1849
    .line 1850
    move-object/from16 v28, v4

    .line 1851
    .line 1852
    move-object v1, v7

    .line 1853
    move-object/from16 v7, v25

    .line 1854
    .line 1855
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    :cond_5e
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1864
    .line 1865
    .line 1866
    move-result v4

    .line 1867
    if-eqz v4, :cond_62

    .line 1868
    .line 1869
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v4

    .line 1873
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 1874
    .line 1875
    sget-object v8, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->EXCEPTION:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 1876
    .line 1877
    invoke-interface {v4, v8}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v8

    .line 1881
    check-cast v8, Ljava/lang/Boolean;

    .line 1882
    .line 1883
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1884
    .line 1885
    .line 1886
    move-result v8

    .line 1887
    if-eqz v8, :cond_61

    .line 1888
    .line 1889
    sget-object v8, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    .line 1890
    .line 1891
    invoke-interface {v4, v8}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v8

    .line 1895
    check-cast v8, Ljava/lang/Boolean;

    .line 1896
    .line 1897
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1898
    .line 1899
    .line 1900
    move-result v8

    .line 1901
    if-eqz v8, :cond_60

    .line 1902
    .line 1903
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    .line 1904
    .line 1905
    .line 1906
    move-result v8

    .line 1907
    if-nez v8, :cond_5e

    .line 1908
    .line 1909
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v8

    .line 1913
    invoke-interface {v8, v1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v8

    .line 1917
    if-eqz v8, :cond_5f

    .line 1918
    .line 1919
    goto :goto_1f

    .line 1920
    :cond_5f
    const-string v0, "Invisible exception type "

    .line 1921
    .line 1922
    invoke-static {v0, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1923
    .line 1924
    .line 1925
    return-object v18

    .line 1926
    :cond_60
    invoke-static {v6, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1927
    .line 1928
    .line 1929
    return-object v18

    .line 1930
    :cond_61
    const-string v0, "Illegal exception type "

    .line 1931
    .line 1932
    invoke-static {v0, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1933
    .line 1934
    .line 1935
    return-object v18

    .line 1936
    :cond_62
    new-instance v0, Ljava/util/HashSet;

    .line 1937
    .line 1938
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1939
    .line 1940
    .line 1941
    invoke-interface {v12}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v4

    .line 1945
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v4

    .line 1949
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1950
    .line 1951
    .line 1952
    move-result v8

    .line 1953
    if-eqz v8, :cond_66

    .line 1954
    .line 1955
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v8

    .line 1959
    check-cast v8, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 1960
    .line 1961
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 1962
    .line 1963
    .line 1964
    move-result v10

    .line 1965
    if-eqz v10, :cond_63

    .line 1966
    .line 1967
    sget-object v10, Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;

    .line 1968
    .line 1969
    goto :goto_21

    .line 1970
    :cond_63
    sget-object v10, Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;

    .line 1971
    .line 1972
    :goto_21
    invoke-interface {v8, v10}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    .line 1973
    .line 1974
    .line 1975
    move-result v10

    .line 1976
    if-eqz v10, :cond_65

    .line 1977
    .line 1978
    invoke-interface {v8}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v10

    .line 1982
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1983
    .line 1984
    .line 1985
    move-result v10

    .line 1986
    if-eqz v10, :cond_64

    .line 1987
    .line 1988
    goto :goto_20

    .line 1989
    :cond_64
    invoke-static {v7, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1990
    .line 1991
    .line 1992
    return-object v18

    .line 1993
    :cond_65
    invoke-static {v3, v8, v2, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1994
    .line 1995
    .line 1996
    return-object v18

    .line 1997
    :cond_66
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    if-eqz v0, :cond_68

    .line 2002
    .line 2003
    invoke-interface {v12, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isDefaultValue(Lnet/bytebuddy/description/annotation/AnnotationValue;)Z

    .line 2004
    .line 2005
    .line 2006
    move-result v4

    .line 2007
    if-eqz v4, :cond_67

    .line 2008
    .line 2009
    goto :goto_22

    .line 2010
    :cond_67
    const-string v1, "Illegal default value "

    .line 2011
    .line 2012
    const-string v2, "for "

    .line 2013
    .line 2014
    invoke-static {v1, v0, v2, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2015
    .line 2016
    .line 2017
    return-object v18

    .line 2018
    :cond_68
    :goto_22
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v0

    .line 2022
    if-eqz v0, :cond_6a

    .line 2023
    .line 2024
    sget-object v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->RECEIVER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 2025
    .line 2026
    invoke-interface {v0, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v4

    .line 2030
    check-cast v4, Ljava/lang/Boolean;

    .line 2031
    .line 2032
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2033
    .line 2034
    .line 2035
    move-result v4

    .line 2036
    if-eqz v4, :cond_69

    .line 2037
    .line 2038
    goto :goto_23

    .line 2039
    :cond_69
    const-string v1, "Illegal receiver type "

    .line 2040
    .line 2041
    invoke-static {v1, v0, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2042
    .line 2043
    .line 2044
    return-object v18

    .line 2045
    :cond_6a
    :goto_23
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2046
    .line 2047
    .line 2048
    move-result v4

    .line 2049
    if-eqz v4, :cond_6c

    .line 2050
    .line 2051
    if-nez v0, :cond_6b

    .line 2052
    .line 2053
    goto :goto_25

    .line 2054
    :cond_6b
    const-string v1, "Static method "

    .line 2055
    .line 2056
    const-string v2, " defines a non-null receiver "

    .line 2057
    .line 2058
    invoke-static {v1, v12, v2, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2059
    .line 2060
    .line 2061
    return-object v18

    .line 2062
    :cond_6c
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 2063
    .line 2064
    .line 2065
    move-result v4

    .line 2066
    const-string v8, " defines an illegal receiver "

    .line 2067
    .line 2068
    if-eqz v4, :cond_6f

    .line 2069
    .line 2070
    if-eqz v0, :cond_6e

    .line 2071
    .line 2072
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v4

    .line 2076
    if-nez v21, :cond_6d

    .line 2077
    .line 2078
    move-object v10, v1

    .line 2079
    goto :goto_24

    .line 2080
    :cond_6d
    move-object/from16 v10, v21

    .line 2081
    .line 2082
    :goto_24
    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v4

    .line 2086
    if-eqz v4, :cond_6e

    .line 2087
    .line 2088
    goto :goto_25

    .line 2089
    :cond_6e
    const-string v1, "Constructor "

    .line 2090
    .line 2091
    invoke-static {v1, v12, v8, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2092
    .line 2093
    .line 2094
    return-object v18

    .line 2095
    :cond_6f
    if-eqz v0, :cond_70

    .line 2096
    .line 2097
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v4

    .line 2101
    invoke-virtual {v1, v4}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 2102
    .line 2103
    .line 2104
    move-result v4

    .line 2105
    if-eqz v4, :cond_70

    .line 2106
    .line 2107
    :goto_25
    move-object v10, v5

    .line 2108
    move-object v8, v7

    .line 2109
    move-object v4, v11

    .line 2110
    move-object/from16 v11, v24

    .line 2111
    .line 2112
    move-object/from16 v0, v26

    .line 2113
    .line 2114
    move-object/from16 v12, v28

    .line 2115
    .line 2116
    move-object v5, v1

    .line 2117
    move-object/from16 v24, v9

    .line 2118
    .line 2119
    move-object/from16 v1, v27

    .line 2120
    .line 2121
    goto/16 :goto_13

    .line 2122
    .line 2123
    :cond_70
    const-string v1, "Method "

    .line 2124
    .line 2125
    invoke-static {v1, v12, v8, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2126
    .line 2127
    .line 2128
    return-object v18

    .line 2129
    :cond_71
    const-string v0, "Illegal type annotations on return type "

    .line 2130
    .line 2131
    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2132
    .line 2133
    .line 2134
    return-object v18

    .line 2135
    :cond_72
    const-string v0, "Illegal return type "

    .line 2136
    .line 2137
    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2138
    .line 2139
    .line 2140
    return-object v18

    .line 2141
    :cond_73
    const-string v0, "Illegal method name "

    .line 2142
    .line 2143
    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2144
    .line 2145
    .line 2146
    return-object v18

    .line 2147
    :cond_74
    move-object v1, v7

    .line 2148
    const-string v0, "Illegal explicit declaration of a type initializer by "

    .line 2149
    .line 2150
    invoke-static {v1, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2151
    .line 2152
    .line 2153
    return-object v18

    .line 2154
    :cond_75
    move-object v11, v4

    .line 2155
    move-object v12, v7

    .line 2156
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2157
    .line 2158
    .line 2159
    move-result v0

    .line 2160
    invoke-static {v0, v11, v12, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    return-object v18

    .line 2164
    :cond_76
    move-object v12, v7

    .line 2165
    const-string v0, "Duplicate method signature for "

    .line 2166
    .line 2167
    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2168
    .line 2169
    .line 2170
    return-object v18

    .line 2171
    :cond_77
    move-object v1, v5

    .line 2172
    return-object v1

    .line 2173
    :cond_78
    move-object v1, v5

    .line 2174
    const-string v2, "Cannot define nest host "

    .line 2175
    .line 2176
    const-string v3, " within different package then "

    .line 2177
    .line 2178
    invoke-static {v2, v0, v3, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2179
    .line 2180
    .line 2181
    return-object v18

    .line 2182
    :cond_79
    move-object v1, v5

    .line 2183
    const-string v2, " + as nest host for "

    .line 2184
    .line 2185
    invoke-static {v6, v0, v2, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2186
    .line 2187
    .line 2188
    return-object v18

    .line 2189
    :cond_7a
    move-object v11, v4

    .line 2190
    move-object v1, v5

    .line 2191
    move-object/from16 v18, v6

    .line 2192
    .line 2193
    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    .line 2194
    .line 2195
    .line 2196
    move-result v0

    .line 2197
    invoke-static {v0, v11, v1, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2198
    .line 2199
    .line 2200
    return-object v18

    .line 2201
    :cond_7b
    move-object v11, v4

    .line 2202
    move-object v1, v5

    .line 2203
    move-object/from16 v18, v6

    .line 2204
    .line 2205
    const-string v0, "Illegal type name: "

    .line 2206
    .line 2207
    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getName()Ljava/lang/String;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v2

    .line 2211
    invoke-static {v0, v2, v11, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2212
    .line 2213
    .line 2214
    return-object v18
.end method

.method public withAnnotations(Ljava/util/List;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 36
    .line 37
    move-object/from16 v13, p1

    .line 38
    .line 39
    invoke-static {v12, v13}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    move-object v13, v11

    .line 44
    move-object v11, v12

    .line 45
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 46
    .line 47
    move-object v14, v13

    .line 48
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 49
    .line 50
    move-object v15, v14

    .line 51
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 52
    .line 53
    move-object/from16 v16, v15

    .line 54
    .line 55
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 56
    .line 57
    move-object/from16 v17, v1

    .line 58
    .line 59
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v18, v1

    .line 62
    .line 63
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 64
    .line 65
    move-object/from16 v19, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 68
    .line 69
    move-object/from16 v20, v1

    .line 70
    .line 71
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 72
    .line 73
    move/from16 v21, v1

    .line 74
    .line 75
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 76
    .line 77
    move/from16 v22, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 80
    .line 81
    move/from16 v23, v1

    .line 82
    .line 83
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 84
    .line 85
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 86
    .line 87
    move/from16 v24, v23

    .line 88
    .line 89
    move-object/from16 v23, v0

    .line 90
    .line 91
    move-object/from16 v0, v16

    .line 92
    .line 93
    move-object/from16 v16, v18

    .line 94
    .line 95
    move-object/from16 v18, v20

    .line 96
    .line 97
    move/from16 v20, v22

    .line 98
    .line 99
    move-object/from16 v22, v1

    .line 100
    .line 101
    move-object/from16 v1, v17

    .line 102
    .line 103
    move-object/from16 v17, v19

    .line 104
    .line 105
    move/from16 v19, v21

    .line 106
    .line 107
    move/from16 v21, v24

    .line 108
    .line 109
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public bridge synthetic withAnnotations(Ljava/util/List;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 113
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withAnnotations(Ljava/util/List;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withAnonymousClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 62
    .line 63
    move-object/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 70
    .line 71
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v23, v0

    .line 74
    .line 75
    move-object/from16 v0, v16

    .line 76
    .line 77
    move-object/from16 v16, v18

    .line 78
    .line 79
    move-object/from16 v18, v20

    .line 80
    .line 81
    const/16 v20, 0x0

    .line 82
    .line 83
    move-object/from16 v22, v1

    .line 84
    .line 85
    move-object/from16 v1, v17

    .line 86
    .line 87
    move-object/from16 v17, v19

    .line 88
    .line 89
    move/from16 v19, p1

    .line 90
    .line 91
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public bridge synthetic withAnonymousClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 95
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withAnonymousClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withAuxiliaryField(Lnet/bytebuddy/description/field/FieldDescription$Token;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v8, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 8
    .line 9
    invoke-direct {v8, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v8, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-ne v2, v1, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-virtual/range {p1 .. p1}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v6, "Field "

    .line 34
    .line 35
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, " for "

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, " already mapped to "

    .line 50
    .line 51
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, " and not "

    .line 58
    .line 59
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v3

    .line 73
    :cond_1
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 74
    .line 75
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 76
    .line 77
    move-object v4, v2

    .line 78
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 79
    .line 80
    move-object v5, v3

    .line 81
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 82
    .line 83
    move-object v6, v4

    .line 84
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 85
    .line 86
    move-object v7, v5

    .line 87
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 88
    .line 89
    move-object v9, v6

    .line 90
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 91
    .line 92
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    move-object/from16 v12, p1

    .line 99
    .line 100
    invoke-virtual {v12, v11}, Lnet/bytebuddy/description/field/FieldDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-static {v10, v11}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    move-object v11, v9

    .line 109
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 110
    .line 111
    move-object v13, v7

    .line 112
    move-object v7, v10

    .line 113
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 114
    .line 115
    move-object v14, v11

    .line 116
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 117
    .line 118
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 119
    .line 120
    move-object v15, v13

    .line 121
    new-instance v13, Lnet/bytebuddy/implementation/LoadedTypeInitializer$Compound;

    .line 122
    .line 123
    move/from16 v16, v2

    .line 124
    .line 125
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 126
    .line 127
    move-object/from16 v17, v2

    .line 128
    .line 129
    new-instance v2, Lnet/bytebuddy/implementation/LoadedTypeInitializer$ForStaticField;

    .line 130
    .line 131
    move-object/from16 v18, v3

    .line 132
    .line 133
    invoke-virtual/range {p1 .. p1}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-direct {v2, v3, v1}, Lnet/bytebuddy/implementation/LoadedTypeInitializer$ForStaticField;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const/4 v1, 0x2

    .line 141
    new-array v1, v1, [Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    aput-object v17, v1, v3

    .line 145
    .line 146
    const/4 v3, 0x1

    .line 147
    aput-object v2, v1, v3

    .line 148
    .line 149
    invoke-direct {v13, v1}, Lnet/bytebuddy/implementation/LoadedTypeInitializer$Compound;-><init>([Lnet/bytebuddy/implementation/LoadedTypeInitializer;)V

    .line 150
    .line 151
    .line 152
    move-object v1, v14

    .line 153
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 154
    .line 155
    move-object v2, v1

    .line 156
    move-object v1, v15

    .line 157
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 158
    .line 159
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 160
    .line 161
    move-object/from16 p1, v1

    .line 162
    .line 163
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 164
    .line 165
    move-object/from16 v17, v1

    .line 166
    .line 167
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 168
    .line 169
    move-object/from16 v19, v1

    .line 170
    .line 171
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 172
    .line 173
    move/from16 v20, v1

    .line 174
    .line 175
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 176
    .line 177
    move/from16 v21, v1

    .line 178
    .line 179
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 180
    .line 181
    move/from16 v22, v1

    .line 182
    .line 183
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 184
    .line 185
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 186
    .line 187
    move-object/from16 v23, v0

    .line 188
    .line 189
    move-object v0, v2

    .line 190
    move/from16 v2, v16

    .line 191
    .line 192
    move-object/from16 v16, v3

    .line 193
    .line 194
    move-object/from16 v3, v18

    .line 195
    .line 196
    move-object/from16 v18, v19

    .line 197
    .line 198
    move/from16 v19, v20

    .line 199
    .line 200
    move/from16 v20, v21

    .line 201
    .line 202
    move/from16 v21, v22

    .line 203
    .line 204
    move-object/from16 v22, v1

    .line 205
    .line 206
    move-object/from16 v1, p1

    .line 207
    .line 208
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    move-object v14, v0

    .line 212
    return-object v14
.end method

.method public bridge synthetic withAuxiliaryField(Lnet/bytebuddy/description/field/FieldDescription$Token;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 213
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withAuxiliaryField(Lnet/bytebuddy/description/field/FieldDescription$Token;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withDeclaredTypes(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 58
    .line 59
    move/from16 v19, v2

    .line 60
    .line 61
    move-object/from16 v2, p1

    .line 62
    .line 63
    invoke-static {v1, v2}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 68
    .line 69
    move-object/from16 p1, v1

    .line 70
    .line 71
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 72
    .line 73
    move/from16 v20, v1

    .line 74
    .line 75
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 76
    .line 77
    move/from16 v21, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 80
    .line 81
    move/from16 v22, v1

    .line 82
    .line 83
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 84
    .line 85
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 86
    .line 87
    move-object/from16 v23, v0

    .line 88
    .line 89
    move-object/from16 v0, v16

    .line 90
    .line 91
    move-object/from16 v16, v18

    .line 92
    .line 93
    move-object/from16 v18, v2

    .line 94
    .line 95
    move/from16 v2, v19

    .line 96
    .line 97
    move/from16 v19, v20

    .line 98
    .line 99
    move/from16 v20, v21

    .line 100
    .line 101
    move/from16 v21, v22

    .line 102
    .line 103
    move-object/from16 v22, v1

    .line 104
    .line 105
    move-object/from16 v1, v17

    .line 106
    .line 107
    move-object/from16 v17, p1

    .line 108
    .line 109
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public bridge synthetic withDeclaredTypes(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 113
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withDeclaredTypes(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withDeclaringType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 45
    .line 46
    move-object/from16 v16, v1

    .line 47
    .line 48
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    move-object/from16 v17, v1

    .line 51
    .line 52
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 53
    .line 54
    move-object/from16 v18, v1

    .line 55
    .line 56
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 57
    .line 58
    move-object/from16 v19, v1

    .line 59
    .line 60
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 61
    .line 62
    move/from16 v20, v1

    .line 63
    .line 64
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 65
    .line 66
    move/from16 v21, v1

    .line 67
    .line 68
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 69
    .line 70
    move/from16 v22, v1

    .line 71
    .line 72
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 73
    .line 74
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 75
    .line 76
    move/from16 v23, v22

    .line 77
    .line 78
    move-object/from16 v22, v1

    .line 79
    .line 80
    move-object/from16 v1, v16

    .line 81
    .line 82
    move-object/from16 v16, v17

    .line 83
    .line 84
    move-object/from16 v17, v18

    .line 85
    .line 86
    move-object/from16 v18, v19

    .line 87
    .line 88
    move/from16 v19, v20

    .line 89
    .line 90
    move/from16 v20, v21

    .line 91
    .line 92
    move/from16 v21, v23

    .line 93
    .line 94
    move-object/from16 v23, v0

    .line 95
    .line 96
    move-object v0, v14

    .line 97
    move-object/from16 v14, p1

    .line 98
    .line 99
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method

.method public bridge synthetic withDeclaringType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 103
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withDeclaringType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withEnclosingMethod(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 48
    .line 49
    .line 50
    move-result-object v16

    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 62
    .line 63
    move/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 70
    .line 71
    move/from16 v22, v1

    .line 72
    .line 73
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 74
    .line 75
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 76
    .line 77
    move/from16 v23, v22

    .line 78
    .line 79
    move-object/from16 v22, v1

    .line 80
    .line 81
    move-object/from16 v1, v17

    .line 82
    .line 83
    move-object/from16 v17, v18

    .line 84
    .line 85
    move-object/from16 v18, v19

    .line 86
    .line 87
    move/from16 v19, v20

    .line 88
    .line 89
    move/from16 v20, v21

    .line 90
    .line 91
    move/from16 v21, v23

    .line 92
    .line 93
    move-object/from16 v23, v0

    .line 94
    .line 95
    move-object v0, v15

    .line 96
    move-object/from16 v15, p1

    .line 97
    .line 98
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    return-object v0
.end method

.method public bridge synthetic withEnclosingMethod(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 102
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withEnclosingMethod(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withEnclosingType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    sget-object v15, Lnet/bytebuddy/description/method/MethodDescription;->UNDEFINED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 62
    .line 63
    move/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 70
    .line 71
    move/from16 v22, v1

    .line 72
    .line 73
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 74
    .line 75
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 76
    .line 77
    move/from16 v23, v22

    .line 78
    .line 79
    move-object/from16 v22, v1

    .line 80
    .line 81
    move-object/from16 v1, v17

    .line 82
    .line 83
    move-object/from16 v17, v18

    .line 84
    .line 85
    move-object/from16 v18, v19

    .line 86
    .line 87
    move/from16 v19, v20

    .line 88
    .line 89
    move/from16 v20, v21

    .line 90
    .line 91
    move/from16 v21, v23

    .line 92
    .line 93
    move-object/from16 v23, v0

    .line 94
    .line 95
    move-object/from16 v0, v16

    .line 96
    .line 97
    move-object/from16 v16, p1

    .line 98
    .line 99
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method

.method public bridge synthetic withEnclosingType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 103
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withEnclosingType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    move-object/from16 v10, p1

    .line 30
    .line 31
    invoke-virtual {v10, v9}, Lnet/bytebuddy/description/field/FieldDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v8, v9}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    move-object v9, v7

    .line 40
    move-object v7, v8

    .line 41
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 42
    .line 43
    move-object v10, v9

    .line 44
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 45
    .line 46
    move-object v11, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    move-object/from16 v17, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 80
    .line 81
    move/from16 v21, v1

    .line 82
    .line 83
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 84
    .line 85
    move/from16 v22, v1

    .line 86
    .line 87
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 88
    .line 89
    move/from16 v23, v1

    .line 90
    .line 91
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 94
    .line 95
    move/from16 v24, v23

    .line 96
    .line 97
    move-object/from16 v23, v0

    .line 98
    .line 99
    move-object/from16 v0, v16

    .line 100
    .line 101
    move-object/from16 v16, v18

    .line 102
    .line 103
    move-object/from16 v18, v20

    .line 104
    .line 105
    move/from16 v20, v22

    .line 106
    .line 107
    move-object/from16 v22, v1

    .line 108
    .line 109
    move-object/from16 v1, v17

    .line 110
    .line 111
    move-object/from16 v17, v19

    .line 112
    .line 113
    move/from16 v19, v21

    .line 114
    .line 115
    move/from16 v21, v24

    .line 116
    .line 117
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method

.method public bridge synthetic withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    new-instance v13, Lnet/bytebuddy/implementation/LoadedTypeInitializer$Compound;

    .line 43
    .line 44
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 45
    .line 46
    move-object/from16 v16, v1

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    new-array v1, v1, [Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    aput-object v15, v1, v17

    .line 54
    .line 55
    const/4 v15, 0x1

    .line 56
    aput-object p1, v1, v15

    .line 57
    .line 58
    invoke-direct {v13, v1}, Lnet/bytebuddy/implementation/LoadedTypeInitializer$Compound;-><init>([Lnet/bytebuddy/implementation/LoadedTypeInitializer;)V

    .line 59
    .line 60
    .line 61
    move-object v1, v14

    .line 62
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 63
    .line 64
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 65
    .line 66
    move-object/from16 p1, v1

    .line 67
    .line 68
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 69
    .line 70
    move-object/from16 v17, v1

    .line 71
    .line 72
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 73
    .line 74
    move-object/from16 v18, v1

    .line 75
    .line 76
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 77
    .line 78
    move-object/from16 v19, v1

    .line 79
    .line 80
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 81
    .line 82
    move/from16 v20, v1

    .line 83
    .line 84
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 85
    .line 86
    move/from16 v21, v1

    .line 87
    .line 88
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 89
    .line 90
    move/from16 v22, v1

    .line 91
    .line 92
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 93
    .line 94
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 95
    .line 96
    move/from16 v23, v22

    .line 97
    .line 98
    move-object/from16 v22, v1

    .line 99
    .line 100
    move-object/from16 v1, v16

    .line 101
    .line 102
    move-object/from16 v16, v17

    .line 103
    .line 104
    move-object/from16 v17, v18

    .line 105
    .line 106
    move-object/from16 v18, v19

    .line 107
    .line 108
    move/from16 v19, v20

    .line 109
    .line 110
    move/from16 v20, v21

    .line 111
    .line 112
    move/from16 v21, v23

    .line 113
    .line 114
    move-object/from16 v23, v0

    .line 115
    .line 116
    move-object/from16 v0, p1

    .line 117
    .line 118
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    return-object v0
.end method

.method public withInitializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    move-object/from16 v0, p0

    .line 124
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    move-object v2, v1

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    move-object v3, v2

    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    move-object v4, v3

    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    move-object v5, v4

    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    move-object v6, v5

    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-object v7, v6

    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    move-object v8, v7

    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    move-object v9, v8

    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    move-object v10, v9

    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    move-object v11, v10

    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    move-object v12, v11

    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    move-object/from16 v14, p1

    .line 125
    invoke-interface {v13, v14}, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;->expandWith(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    move-result-object v13

    move-object v14, v12

    move-object v12, v13

    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    move-object v15, v14

    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    move-object/from16 v16, v15

    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    move-object/from16 v20, v1

    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    move/from16 v21, v1

    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    move/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    move/from16 v24, v23

    move-object/from16 v23, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move/from16 v20, v22

    move-object/from16 v22, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v24

    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 123
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withInitializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 122
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withInitializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    move-object/from16 v9, p1

    .line 27
    .line 28
    invoke-interface {v9, v8}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-static {v7, v8}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    move-object v8, v6

    .line 37
    move-object v6, v7

    .line 38
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 39
    .line 40
    move-object v9, v8

    .line 41
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 42
    .line 43
    move-object v10, v9

    .line 44
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 45
    .line 46
    move-object v11, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    move-object/from16 v17, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 80
    .line 81
    move/from16 v21, v1

    .line 82
    .line 83
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 84
    .line 85
    move/from16 v22, v1

    .line 86
    .line 87
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 88
    .line 89
    move/from16 v23, v1

    .line 90
    .line 91
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 94
    .line 95
    move/from16 v24, v23

    .line 96
    .line 97
    move-object/from16 v23, v0

    .line 98
    .line 99
    move-object/from16 v0, v16

    .line 100
    .line 101
    move-object/from16 v16, v18

    .line 102
    .line 103
    move-object/from16 v18, v20

    .line 104
    .line 105
    move/from16 v20, v22

    .line 106
    .line 107
    move-object/from16 v22, v1

    .line 108
    .line 109
    move-object/from16 v1, v17

    .line 110
    .line 111
    move-object/from16 v17, v19

    .line 112
    .line 113
    move/from16 v19, v21

    .line 114
    .line 115
    move/from16 v21, v24

    .line 116
    .line 117
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method

.method public bridge synthetic withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withLocalClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 62
    .line 63
    move-object/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 70
    .line 71
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v22, v1

    .line 74
    .line 75
    move-object/from16 v1, v17

    .line 76
    .line 77
    move-object/from16 v17, v19

    .line 78
    .line 79
    const/16 v19, 0x0

    .line 80
    .line 81
    move-object/from16 v23, v0

    .line 82
    .line 83
    move-object/from16 v0, v16

    .line 84
    .line 85
    move-object/from16 v16, v18

    .line 86
    .line 87
    move-object/from16 v18, v20

    .line 88
    .line 89
    move/from16 v20, p1

    .line 90
    .line 91
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public bridge synthetic withLocalClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 95
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withLocalClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    move-object/from16 v12, p1

    .line 36
    .line 37
    invoke-virtual {v12, v11}, Lnet/bytebuddy/description/method/MethodDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-static {v10, v11}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    move-object v11, v9

    .line 46
    move-object v9, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    move-object/from16 v17, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 80
    .line 81
    move/from16 v21, v1

    .line 82
    .line 83
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 84
    .line 85
    move/from16 v22, v1

    .line 86
    .line 87
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 88
    .line 89
    move/from16 v23, v1

    .line 90
    .line 91
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 94
    .line 95
    move/from16 v24, v23

    .line 96
    .line 97
    move-object/from16 v23, v0

    .line 98
    .line 99
    move-object/from16 v0, v16

    .line 100
    .line 101
    move-object/from16 v16, v18

    .line 102
    .line 103
    move-object/from16 v18, v20

    .line 104
    .line 105
    move/from16 v20, v22

    .line 106
    .line 107
    move-object/from16 v22, v1

    .line 108
    .line 109
    move-object/from16 v1, v17

    .line 110
    .line 111
    move-object/from16 v17, v19

    .line 112
    .line 113
    move/from16 v19, v21

    .line 114
    .line 115
    move/from16 v21, v24

    .line 116
    .line 117
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method

.method public bridge synthetic withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 9
    .line 10
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 11
    .line 12
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 15
    .line 16
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 17
    .line 18
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 19
    .line 20
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 21
    .line 22
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 23
    .line 24
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 25
    .line 26
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 27
    .line 28
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 29
    .line 30
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 33
    .line 34
    move-object/from16 v16, v1

    .line 35
    .line 36
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    move-object/from16 v17, v1

    .line 39
    .line 40
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 41
    .line 42
    move-object/from16 v18, v1

    .line 43
    .line 44
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 45
    .line 46
    move-object/from16 v19, v1

    .line 47
    .line 48
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 49
    .line 50
    move/from16 v20, v1

    .line 51
    .line 52
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 53
    .line 54
    move/from16 v21, v1

    .line 55
    .line 56
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 57
    .line 58
    move/from16 v22, v1

    .line 59
    .line 60
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 63
    .line 64
    move/from16 v23, v22

    .line 65
    .line 66
    move-object/from16 v22, v1

    .line 67
    .line 68
    move-object/from16 v1, v16

    .line 69
    .line 70
    move-object/from16 v16, v17

    .line 71
    .line 72
    move-object/from16 v17, v18

    .line 73
    .line 74
    move-object/from16 v18, v19

    .line 75
    .line 76
    move/from16 v19, v20

    .line 77
    .line 78
    move/from16 v20, v21

    .line 79
    .line 80
    move/from16 v21, v23

    .line 81
    .line 82
    move-object/from16 v23, v0

    .line 83
    .line 84
    move-object v0, v2

    .line 85
    move/from16 v2, p1

    .line 86
    .line 87
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method public bridge synthetic withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 91
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withModuleDescription(Lnet/bytebuddy/description/module/ModuleDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24
    .param p1    # Lnet/bytebuddy/description/module/ModuleDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 12
    .line 13
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 16
    .line 17
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 18
    .line 19
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 22
    .line 23
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 24
    .line 25
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 26
    .line 27
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 28
    .line 29
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 30
    .line 31
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 34
    .line 35
    move-object/from16 v16, v1

    .line 36
    .line 37
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    move-object/from16 v17, v1

    .line 40
    .line 41
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 42
    .line 43
    move-object/from16 v18, v1

    .line 44
    .line 45
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 46
    .line 47
    move-object/from16 v19, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 50
    .line 51
    move/from16 v20, v1

    .line 52
    .line 53
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 54
    .line 55
    move/from16 v21, v1

    .line 56
    .line 57
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 58
    .line 59
    move/from16 v22, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 64
    .line 65
    move/from16 v23, v22

    .line 66
    .line 67
    move-object/from16 v22, v1

    .line 68
    .line 69
    move-object/from16 v1, v16

    .line 70
    .line 71
    move-object/from16 v16, v17

    .line 72
    .line 73
    move-object/from16 v17, v18

    .line 74
    .line 75
    move-object/from16 v18, v19

    .line 76
    .line 77
    move/from16 v19, v20

    .line 78
    .line 79
    move/from16 v20, v21

    .line 80
    .line 81
    move/from16 v21, v23

    .line 82
    .line 83
    move-object/from16 v23, v0

    .line 84
    .line 85
    move-object v0, v3

    .line 86
    move-object/from16 v3, p1

    .line 87
    .line 88
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method

.method public bridge synthetic withModuleDescription(Lnet/bytebuddy/description/module/ModuleDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0
    .param p1    # Lnet/bytebuddy/description/module/ModuleDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 92
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withModuleDescription(Lnet/bytebuddy/description/module/ModuleDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withName(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 8
    .line 9
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 14
    .line 15
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 16
    .line 17
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 20
    .line 21
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 22
    .line 23
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 24
    .line 25
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 26
    .line 27
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 28
    .line 29
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 32
    .line 33
    move-object/from16 v16, v1

    .line 34
    .line 35
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    move-object/from16 v17, v1

    .line 38
    .line 39
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 40
    .line 41
    move-object/from16 v18, v1

    .line 42
    .line 43
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v19, v1

    .line 46
    .line 47
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 48
    .line 49
    move/from16 v20, v1

    .line 50
    .line 51
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 52
    .line 53
    move/from16 v21, v1

    .line 54
    .line 55
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 56
    .line 57
    move/from16 v22, v1

    .line 58
    .line 59
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 62
    .line 63
    move-object/from16 v23, v0

    .line 64
    .line 65
    move-object/from16 v0, v16

    .line 66
    .line 67
    move-object/from16 v16, v17

    .line 68
    .line 69
    move-object/from16 v17, v18

    .line 70
    .line 71
    move-object/from16 v18, v19

    .line 72
    .line 73
    move/from16 v19, v20

    .line 74
    .line 75
    move/from16 v20, v21

    .line 76
    .line 77
    move/from16 v21, v22

    .line 78
    .line 79
    move-object/from16 v22, v1

    .line 80
    .line 81
    move-object/from16 v1, p1

    .line 82
    .line 83
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public withNestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 62
    .line 63
    move-object/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 70
    .line 71
    move/from16 v22, v1

    .line 72
    .line 73
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 74
    .line 75
    move/from16 v23, v1

    .line 76
    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    sget-object v0, Lnet/bytebuddy/dynamic/TargetType;->DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    :goto_0
    move-object/from16 v1, v17

    .line 88
    .line 89
    move-object/from16 v17, v19

    .line 90
    .line 91
    move/from16 v19, v21

    .line 92
    .line 93
    move/from16 v21, v23

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_0
    move-object v0, v1

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    sget-object v23, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 99
    .line 100
    move/from16 v24, v22

    .line 101
    .line 102
    move-object/from16 v22, v0

    .line 103
    .line 104
    move-object/from16 v0, v16

    .line 105
    .line 106
    move-object/from16 v16, v18

    .line 107
    .line 108
    move-object/from16 v18, v20

    .line 109
    .line 110
    move/from16 v20, v24

    .line 111
    .line 112
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    return-object v0
.end method

.method public bridge synthetic withNestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 116
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withNestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withNestMembers(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    move-object/from16 v16, v15

    .line 48
    .line 49
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 62
    .line 63
    move-object/from16 v20, v1

    .line 64
    .line 65
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 66
    .line 67
    move/from16 v21, v1

    .line 68
    .line 69
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 70
    .line 71
    move/from16 v22, v1

    .line 72
    .line 73
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 74
    .line 75
    move-object/from16 v23, v16

    .line 76
    .line 77
    move-object/from16 v16, v18

    .line 78
    .line 79
    move-object/from16 v18, v20

    .line 80
    .line 81
    move/from16 v20, v22

    .line 82
    .line 83
    sget-object v22, Lnet/bytebuddy/dynamic/TargetType;->DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

    .line 84
    .line 85
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 86
    .line 87
    move/from16 v24, v1

    .line 88
    .line 89
    move-object/from16 v1, p1

    .line 90
    .line 91
    invoke-static {v0, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object/from16 v1, v23

    .line 96
    .line 97
    move-object/from16 v23, v0

    .line 98
    .line 99
    move-object v0, v1

    .line 100
    move-object/from16 v1, v17

    .line 101
    .line 102
    move-object/from16 v17, v19

    .line 103
    .line 104
    move/from16 v19, v21

    .line 105
    .line 106
    move/from16 v21, v24

    .line 107
    .line 108
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method public bridge synthetic withNestMembers(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withNestMembers(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withPermittedSubclasses(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24
    .param p1    # Lnet/bytebuddy/description/type/TypeList;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 8
    .line 9
    move-object v4, v2

    .line 10
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 11
    .line 12
    move-object v5, v3

    .line 13
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 14
    .line 15
    move-object v6, v4

    .line 16
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 17
    .line 18
    move-object v7, v5

    .line 19
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    move-object v8, v6

    .line 22
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 23
    .line 24
    move-object v9, v7

    .line 25
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 26
    .line 27
    move-object v10, v8

    .line 28
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 29
    .line 30
    move-object v11, v9

    .line 31
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 32
    .line 33
    move-object v12, v10

    .line 34
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 35
    .line 36
    move-object v13, v11

    .line 37
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 38
    .line 39
    move-object v14, v12

    .line 40
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 41
    .line 42
    move-object v15, v13

    .line 43
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 44
    .line 45
    move-object/from16 v16, v14

    .line 46
    .line 47
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 48
    .line 49
    move-object/from16 v17, v15

    .line 50
    .line 51
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 52
    .line 53
    move/from16 v18, v2

    .line 54
    .line 55
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 56
    .line 57
    move-object/from16 v19, v2

    .line 58
    .line 59
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 60
    .line 61
    move-object/from16 v20, v2

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {v2, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :cond_1
    :goto_0
    iget-boolean v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 75
    .line 76
    move-object/from16 p1, v1

    .line 77
    .line 78
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 79
    .line 80
    move/from16 v21, v1

    .line 81
    .line 82
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 83
    .line 84
    move/from16 v22, v1

    .line 85
    .line 86
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 89
    .line 90
    move/from16 v23, v22

    .line 91
    .line 92
    move-object/from16 v22, v1

    .line 93
    .line 94
    move-object/from16 v1, v17

    .line 95
    .line 96
    move-object/from16 v17, v20

    .line 97
    .line 98
    move/from16 v20, v21

    .line 99
    .line 100
    move/from16 v21, v23

    .line 101
    .line 102
    move-object/from16 v23, v0

    .line 103
    .line 104
    move-object/from16 v0, v16

    .line 105
    .line 106
    move-object/from16 v16, v19

    .line 107
    .line 108
    move/from16 v19, v2

    .line 109
    .line 110
    move/from16 v2, v18

    .line 111
    .line 112
    move-object/from16 v18, p1

    .line 113
    .line 114
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    move-object v14, v0

    .line 118
    return-object v14
.end method

.method public bridge synthetic withPermittedSubclasses(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0
    .param p1    # Lnet/bytebuddy/description/type/TypeList;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 119
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withPermittedSubclasses(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 38
    .line 39
    :goto_0
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 40
    .line 41
    move-object v13, v10

    .line 42
    move-object v10, v11

    .line 43
    move-object v11, v12

    .line 44
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 45
    .line 46
    move-object v14, v13

    .line 47
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 48
    .line 49
    move-object v15, v14

    .line 50
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 51
    .line 52
    move-object/from16 v16, v15

    .line 53
    .line 54
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 55
    .line 56
    move-object/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 71
    .line 72
    move/from16 v21, v1

    .line 73
    .line 74
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 75
    .line 76
    move/from16 v22, v1

    .line 77
    .line 78
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 79
    .line 80
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 81
    .line 82
    move-object/from16 v23, v0

    .line 83
    .line 84
    move-object/from16 v0, v16

    .line 85
    .line 86
    move-object/from16 v16, v18

    .line 87
    .line 88
    move-object/from16 v18, v20

    .line 89
    .line 90
    move/from16 v20, v22

    .line 91
    .line 92
    move-object/from16 v22, v1

    .line 93
    .line 94
    move-object/from16 v1, v17

    .line 95
    .line 96
    move-object/from16 v17, v19

    .line 97
    .line 98
    move/from16 v19, v21

    .line 99
    .line 100
    move/from16 v21, p1

    .line 101
    .line 102
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public bridge synthetic withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 106
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 31
    .line 32
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    move-object/from16 v13, p1

    .line 39
    .line 40
    invoke-virtual {v13, v12}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    invoke-static {v11, v12}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    move-object v12, v10

    .line 49
    move-object v10, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    move-object/from16 v17, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 80
    .line 81
    move/from16 v21, v1

    .line 82
    .line 83
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 84
    .line 85
    move/from16 v22, v1

    .line 86
    .line 87
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 88
    .line 89
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 90
    .line 91
    move-object/from16 v23, v0

    .line 92
    .line 93
    move-object/from16 v0, v16

    .line 94
    .line 95
    move-object/from16 v16, v18

    .line 96
    .line 97
    move-object/from16 v18, v20

    .line 98
    .line 99
    move/from16 v20, v22

    .line 100
    .line 101
    move-object/from16 v22, v1

    .line 102
    .line 103
    move-object/from16 v1, v17

    .line 104
    .line 105
    move-object/from16 v17, v19

    .line 106
    .line 107
    move/from16 v19, v21

    .line 108
    .line 109
    const/16 v21, 0x1

    .line 110
    .line 111
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method

.method public bridge synthetic withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 115
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withTypeVariable(Lnet/bytebuddy/description/type/TypeVariableToken;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 13
    .line 14
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    move-object/from16 v7, p1

    .line 21
    .line 22
    invoke-virtual {v7, v6}, Lnet/bytebuddy/description/type/TypeVariableToken;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-static {v5, v6}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move-object v6, v4

    .line 31
    move-object v4, v5

    .line 32
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 33
    .line 34
    move-object v7, v6

    .line 35
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 36
    .line 37
    move-object v8, v7

    .line 38
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 39
    .line 40
    move-object v9, v8

    .line 41
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 42
    .line 43
    move-object v10, v9

    .line 44
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 45
    .line 46
    move-object v11, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    move-object/from16 v17, v1

    .line 66
    .line 67
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 80
    .line 81
    move/from16 v21, v1

    .line 82
    .line 83
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 84
    .line 85
    move/from16 v22, v1

    .line 86
    .line 87
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 88
    .line 89
    move/from16 v23, v1

    .line 90
    .line 91
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 94
    .line 95
    move/from16 v24, v23

    .line 96
    .line 97
    move-object/from16 v23, v0

    .line 98
    .line 99
    move-object/from16 v0, v16

    .line 100
    .line 101
    move-object/from16 v16, v18

    .line 102
    .line 103
    move-object/from16 v18, v20

    .line 104
    .line 105
    move/from16 v20, v22

    .line 106
    .line 107
    move-object/from16 v22, v1

    .line 108
    .line 109
    move-object/from16 v1, v17

    .line 110
    .line 111
    move-object/from16 v17, v19

    .line 112
    .line 113
    move/from16 v19, v21

    .line 114
    .line 115
    move/from16 v21, v24

    .line 116
    .line 117
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method

.method public bridge synthetic withTypeVariable(Lnet/bytebuddy/description/type/TypeVariableToken;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->withTypeVariable(Lnet/bytebuddy/description/type/TypeVariableToken;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    move-result-object p0

    return-object p0
.end method

.method public withTypeVariables(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;)",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v4, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeVariables:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 32
    .line 33
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    add-int/lit8 v6, v2, 0x1

    .line 38
    .line 39
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object/from16 v5, p1

    .line 44
    .line 45
    invoke-interface {v5, v2}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    move-object/from16 v2, p2

    .line 52
    .line 53
    invoke-interface {v2, v0, v3}, Lnet/bytebuddy/dynamic/Transformer;->transform(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    move-object/from16 v2, p2

    .line 61
    .line 62
    :goto_1
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move v2, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 68
    .line 69
    move-object v2, v1

    .line 70
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->name:Ljava/lang/String;

    .line 71
    .line 72
    move-object v3, v2

    .line 73
    iget v2, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->modifiers:I

    .line 74
    .line 75
    move-object v5, v3

    .line 76
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->moduleDescription:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 77
    .line 78
    move-object v6, v5

    .line 79
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->superClass:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 80
    .line 81
    move-object v7, v6

    .line 82
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->interfaceTypes:Ljava/util/List;

    .line 83
    .line 84
    move-object v8, v7

    .line 85
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->fieldTokens:Ljava/util/List;

    .line 86
    .line 87
    move-object v9, v8

    .line 88
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->auxiliaryFields:Ljava/util/Map;

    .line 89
    .line 90
    move-object v10, v9

    .line 91
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->methodTokens:Ljava/util/List;

    .line 92
    .line 93
    move-object v11, v10

    .line 94
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->recordComponentTokens:Ljava/util/List;

    .line 95
    .line 96
    move-object v12, v11

    .line 97
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->annotationDescriptions:Ljava/util/List;

    .line 98
    .line 99
    move-object v13, v12

    .line 100
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 101
    .line 102
    move-object v14, v13

    .line 103
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 104
    .line 105
    move-object v15, v14

    .line 106
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 107
    .line 108
    move-object/from16 v16, v15

    .line 109
    .line 110
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 111
    .line 112
    move-object/from16 v17, v1

    .line 113
    .line 114
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->enclosingType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 115
    .line 116
    move-object/from16 v18, v1

    .line 117
    .line 118
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->declaredTypes:Ljava/util/List;

    .line 119
    .line 120
    move-object/from16 v19, v1

    .line 121
    .line 122
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->permittedSubclasses:Ljava/util/List;

    .line 123
    .line 124
    move-object/from16 v20, v1

    .line 125
    .line 126
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->anonymousClass:Z

    .line 127
    .line 128
    move/from16 v21, v1

    .line 129
    .line 130
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->localClass:Z

    .line 131
    .line 132
    move/from16 v22, v1

    .line 133
    .line 134
    iget-boolean v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->record:Z

    .line 135
    .line 136
    move/from16 v23, v1

    .line 137
    .line 138
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestHost:Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->nestMembers:Ljava/util/List;

    .line 141
    .line 142
    move/from16 v24, v23

    .line 143
    .line 144
    move-object/from16 v23, v0

    .line 145
    .line 146
    move-object/from16 v0, v16

    .line 147
    .line 148
    move-object/from16 v16, v18

    .line 149
    .line 150
    move-object/from16 v18, v20

    .line 151
    .line 152
    move/from16 v20, v22

    .line 153
    .line 154
    move-object/from16 v22, v1

    .line 155
    .line 156
    move-object/from16 v1, v17

    .line 157
    .line 158
    move-object/from16 v17, v19

    .line 159
    .line 160
    move/from16 v19, v21

    .line 161
    .line 162
    move/from16 v21, v24

    .line 163
    .line 164
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method
