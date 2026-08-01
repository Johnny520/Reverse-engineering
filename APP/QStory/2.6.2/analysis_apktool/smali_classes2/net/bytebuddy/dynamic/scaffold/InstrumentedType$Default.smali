.class public Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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

    move-object/from16 v5, p0

    .line 1
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier([Ljava/lang/String;)Z

    move-result v0

    const/4 v6, 0x0

    const-string v4, " for "

    if-eqz v0, :cond_7b

    .line 2
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    const v1, -0x27e40

    and-int/2addr v0, v1

    const-string v13, "Illegal modifiers "

    if-nez v0, :cond_7a

    .line 3
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isPackageType()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    const/16 v1, 0x1600

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    const-string v1, " for package "

    invoke-static {v0, v1, v5, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v6

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isModuleType()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    const-string v1, " for module "

    invoke-static {v0, v1, v5, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v6

    .line 7
    :cond_3
    :goto_1
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 8
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->SUPER_CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 9
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 10
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {v1, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    .line 11
    :cond_4
    const-string v1, "Invisible super type "

    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 12
    :cond_5
    const-string v1, "Illegal type annotations on super class "

    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 13
    :cond_6
    const-string v1, "Illegal super class "

    invoke-static {v1, v0, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 14
    :cond_7
    :goto_2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    sget-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->INTERFACE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 17
    sget-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 18
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 19
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-interface {v3, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    .line 20
    :cond_8
    const-string v0, "Invisible interface type "

    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 21
    :cond_9
    const-string v0, "Already implemented interface "

    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 22
    :cond_a
    const-string v0, "Illegal type annotations on interface "

    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 23
    :cond_b
    const-string v0, "Illegal interface "

    invoke-static {v0, v2, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6

    .line 24
    :cond_c
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_e

    const-class v1, Ljava/lang/Throwable;

    invoke-virtual {v5, v1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_4

    .line 26
    :cond_d
    const-string v0, "Cannot define throwable "

    const-string v1, " to be generic"

    invoke-static {v5, v0, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v6

    .line 27
    :cond_e
    :goto_4
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v14, " does not define at least one bound"

    const-string v15, "Type variable "

    move v2, v0

    const-string v0, "Illegal interface bound "

    move-object v3, v0

    const-string v0, "Duplicate bound "

    const-string v9, "Illegal type variable bound "

    const/16 v16, 0x0

    const-string v10, "Illegal type annotation on \'"

    const-string v11, "Illegal type variable name \'"

    const-string v12, "Duplicate type variable symbol \'"

    const-string v1, "\' for "

    move/from16 v17, v2

    const-string v2, " of "

    if-eqz v17, :cond_19

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-object/from16 v18, v6

    .line 29
    invoke-interface/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    move-result-object v6

    .line 30
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_18

    .line 31
    invoke-static {v6}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 32
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->ofFormalTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 33
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 34
    invoke-interface/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    sget-object v11, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v1, v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_13

    .line 36
    sget-object v11, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v1, v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_12

    .line 37
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    if-eqz v16, :cond_f

    .line 38
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    move-result-object v11

    invoke-virtual {v11}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isTypeVariable()Z

    move-result v11

    if-nez v11, :cond_10

    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    move-result v11

    if-eqz v11, :cond_10

    :cond_f
    move-object v11, v7

    move-object v7, v3

    move-object/from16 v3, v17

    goto :goto_7

    :cond_10
    move-object v0, v3

    move-object/from16 v3, v17

    .line 39
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :goto_7
    move-object/from16 v5, p0

    move-object/from16 v17, v3

    move-object v3, v7

    move-object v7, v11

    const/16 v16, 0x1

    goto :goto_6

    :cond_11
    move-object/from16 v3, v17

    .line 40
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 41
    :cond_12
    const-string v0, "Illegal type annotations on type variable "

    invoke-static {v0, v1, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_13
    move-object v0, v9

    move-object/from16 v3, v17

    .line 42
    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_14
    move-object v11, v7

    move-object/from16 v3, v17

    if-eqz v16, :cond_15

    move-object v7, v11

    move-object/from16 v6, v18

    goto/16 :goto_5

    .line 43
    :cond_15
    invoke-static {v15, v3, v4, v5, v14}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_16
    move-object/from16 v3, v17

    .line 44
    invoke-static {v10, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_17
    move-object/from16 v3, v17

    .line 45
    invoke-static {v11, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_18
    move-object/from16 v3, v17

    .line 46
    invoke-static {v12, v3, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_19
    move-object v7, v9

    move-object v9, v2

    move-object v2, v7

    move-object v7, v3

    move-object/from16 v18, v6

    .line 47
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    .line 48
    const-string v6, "Cannot define array type or primitive type "

    if-eqz v3, :cond_1b

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v8

    if-nez v8, :cond_1a

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v8

    if-nez v8, :cond_1a

    goto :goto_8

    .line 49
    :cond_1a
    const-string v0, " + as enclosing type for "

    invoke-static {v6, v3, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 50
    :cond_1b
    :goto_8
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object v8

    if-eqz v8, :cond_1c

    .line 51
    invoke-interface {v8}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    move-result v17

    if-nez v17, :cond_1d

    :cond_1c
    move-object/from16 v17, v0

    goto :goto_9

    .line 52
    :cond_1d
    const-string v0, "Cannot enclose type declaration in class initializer "

    invoke-static {v8, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 53
    :goto_9
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    if-eqz v0, :cond_1f

    .line 54
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v8

    if-nez v8, :cond_1e

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v8

    if-nez v8, :cond_1e

    goto :goto_a

    .line 55
    :cond_1e
    const-string v1, " as declaring type for "

    invoke-static {v6, v0, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_1f
    if-nez v3, :cond_21

    if-nez v8, :cond_21

    .line 56
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isLocalType()Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isAnonymousType()Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_a

    .line 57
    :cond_20
    const-string v0, "Cannot define an anonymous or local class without a declaring type for "

    invoke-static {v5, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 58
    :cond_21
    :goto_a
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 59
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_24

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v19

    if-nez v19, :cond_23

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v19

    if-nez v19, :cond_23

    .line 61
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_22

    move-object/from16 v2, v20

    goto :goto_b

    .line 62
    :cond_22
    const-string v0, "Duplicate definition of declared type "

    .line 63
    invoke-static {v0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    return-object v18

    .line 65
    :cond_23
    const-string v0, " + as declared type for "

    invoke-static {v6, v2, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_24
    move-object/from16 v20, v2

    .line 66
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    .line 67
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    .line 68
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 69
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/description/type/TypeDescription;

    .line 70
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v19

    if-nez v19, :cond_27

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v19

    if-nez v19, :cond_27

    .line 71
    invoke-interface {v8, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v19

    if-eqz v19, :cond_26

    .line 72
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_25

    goto :goto_c

    .line 73
    :cond_25
    const-string v0, "Duplicate definition of nest member "

    .line 74
    invoke-static {v0, v8}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    return-object v18

    .line 76
    :cond_26
    const-string v0, "Cannot define nest member "

    const-string v1, " + within different package then "

    invoke-static {v0, v8, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 77
    :cond_27
    const-string v0, " + as nest member of "

    invoke-static {v6, v8, v0, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 78
    :cond_28
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v2

    if-nez v2, :cond_79

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_79

    .line 79
    invoke-interface {v0, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v2

    if-eqz v2, :cond_78

    .line 80
    :cond_29
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 81
    invoke-interface {v2, v5}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2a

    goto :goto_d

    .line 82
    :cond_2a
    const-string v0, "Cannot assign permitted subclass "

    const-string v1, " to "

    invoke-static {v0, v2, v1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 83
    :cond_2b
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 84
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v8, "Duplicate annotation "

    move-object/from16 v19, v2

    const-string v2, " on "

    move-object/from16 v21, v3

    const-string v3, "Cannot add "

    if-eqz v6, :cond_31

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    move-object/from16 v22, v7

    .line 85
    sget-object v7, Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;

    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v7

    if-nez v7, :cond_2f

    .line 86
    invoke-virtual {v5}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isAnnotation()Z

    move-result v7

    if-eqz v7, :cond_2c

    sget-object v7, Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;

    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v7

    if-nez v7, :cond_2f

    .line 87
    :cond_2c
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isPackageType()Z

    move-result v7

    if-eqz v7, :cond_2d

    sget-object v7, Ljava/lang/annotation/ElementType;->PACKAGE:Ljava/lang/annotation/ElementType;

    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v7

    if-nez v7, :cond_2f

    .line 88
    :cond_2d
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isModuleType()Z

    move-result v7

    if-eqz v7, :cond_2e

    const-string v7, "MODULE"

    invoke-interface {v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2e

    goto :goto_f

    .line 89
    :cond_2e
    invoke-static {v3, v6, v2, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 90
    :cond_2f
    :goto_f
    invoke-interface {v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_30

    move-object/from16 v2, v19

    move-object/from16 v3, v21

    move-object/from16 v7, v22

    goto :goto_e

    .line 91
    :cond_30
    invoke-static {v8, v6, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_31
    move-object/from16 v22, v7

    .line 92
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 93
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    move-object/from16 v19, v6

    const-string v6, "Illegal type annotations on "

    if-eqz v7, :cond_3c

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 94
    invoke-interface {v7}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v24, v9

    .line 95
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->asSignatureToken()Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3b

    .line 96
    invoke-static/range {v23 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidUnqualifiedNameIdentifier(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3a

    .line 97
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v9

    const v23, -0x250e0

    and-int v9, v9, v23

    if-nez v9, :cond_39

    .line 98
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v9

    move-object/from16 v23, v0

    .line 99
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->FIELD:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v9, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_38

    .line 100
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v9, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_37

    .line 101
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    move-result v0

    if-nez v0, :cond_33

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0, v5}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_11

    .line 102
    :cond_32
    const-string v0, "Invisible field type "

    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-static {v0, v1, v4, v7}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 103
    :cond_33
    :goto_11
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 104
    invoke-interface {v7}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_36

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    move-object/from16 v25, v6

    .line 105
    sget-object v6, Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;

    invoke-interface {v9, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v6

    if-eqz v6, :cond_35

    .line 106
    invoke-interface {v9}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_34

    move-object/from16 v6, v25

    goto :goto_12

    .line 107
    :cond_34
    invoke-static {v8, v9, v4, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 108
    :cond_35
    invoke-static {v3, v9, v2, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_36
    move-object/from16 v6, v19

    move-object/from16 v0, v23

    move-object/from16 v9, v24

    goto/16 :goto_10

    .line 109
    :cond_37
    invoke-static {v6, v9, v4, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 110
    :cond_38
    const-string v0, "Illegal field type "

    invoke-static {v0, v9, v4, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 111
    :cond_39
    const-string v0, "Illegal field modifiers "

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v1

    invoke-static {v1, v4, v7, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 112
    :cond_3a
    const-string v0, "Illegal field name for "

    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 113
    :cond_3b
    const-string v0, "Duplicate field definition for "

    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    :cond_3c
    move-object/from16 v24, v9

    .line 114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 115
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_13
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_77

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 116
    invoke-interface {v7}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_76

    .line 117
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v9

    and-int/lit16 v9, v9, -0x1e00

    if-nez v9, :cond_75

    .line 118
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    move-result v9

    if-eqz v9, :cond_3e

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v9

    and-int/lit16 v9, v9, 0x800

    if-nez v9, :cond_3d

    goto :goto_14

    .line 119
    :cond_3d
    const-string v0, "Cannot declare strict computations for "

    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 120
    :cond_3e
    :goto_14
    invoke-virtual {v5}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isInterface()Z

    move-result v9

    if-eqz v9, :cond_40

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    move-result v9

    if-nez v9, :cond_40

    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    move-result v9

    if-eqz v9, :cond_3f

    goto :goto_15

    .line 121
    :cond_3f
    const-string v0, "Methods declared by an interface must be public or private "

    invoke-static {v7, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 122
    :cond_40
    :goto_15
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 123
    invoke-interface {v7}, Lnet/bytebuddy/description/TypeVariableSource;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v23

    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_16
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_4b

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-object/from16 v26, v0

    .line 124
    invoke-interface/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-virtual {v9, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_4a

    .line 126
    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidIdentifier(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_49

    .line 127
    invoke-static/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->ofFormalTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Z

    move-result v0

    if-eqz v0, :cond_48

    .line 128
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 129
    invoke-interface/range {v25 .. v25}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v27

    invoke-interface/range {v27 .. v27}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v27

    move/from16 v28, v16

    :goto_17
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_46

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v29

    move-object/from16 v30, v4

    move-object/from16 v4, v29

    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 130
    sget-object v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v4, v5}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_45

    .line 131
    sget-object v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v4, v5}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_44

    .line 132
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_43

    if-eqz v28, :cond_41

    .line 133
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    move-result-object v5

    invoke-virtual {v5}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isTypeVariable()Z

    move-result v5

    if-nez v5, :cond_42

    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    move-result v5

    if-eqz v5, :cond_42

    :cond_41
    move-object/from16 v4, v30

    goto :goto_18

    :cond_42
    move-object v8, v4

    move-object v12, v7

    move-object/from16 v7, v22

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v30

    .line 134
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :goto_18
    const/16 v28, 0x1

    move-object/from16 v5, p0

    goto :goto_17

    :cond_43
    move-object v8, v4

    move-object v12, v7

    move-object/from16 v7, v17

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v30

    .line 135
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_44
    move-object v8, v4

    move-object/from16 v2, v24

    move-object/from16 v10, v25

    move-object/from16 v4, v30

    .line 136
    const-string v0, "Illegal type annotations on bound "

    move-object/from16 v5, p0

    move-object v1, v8

    move-object v3, v10

    invoke-static/range {v0 .. v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_45
    move-object v8, v4

    move-object v12, v7

    move-object/from16 v7, v20

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v30

    .line 137
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_46
    move-object/from16 v0, v24

    move-object/from16 v24, v9

    move-object v9, v0

    move-object v0, v11

    move-object v11, v4

    move-object v4, v12

    move-object v12, v7

    move-object v7, v5

    move-object v5, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v8

    if-eqz v28, :cond_47

    move-object/from16 v8, v24

    move-object/from16 v24, v9

    move-object v9, v8

    move-object v10, v5

    move-object v5, v7

    move-object v7, v12

    move-object/from16 v8, v25

    move-object v12, v4

    move-object v4, v11

    move-object v11, v0

    move-object/from16 v0, v26

    goto/16 :goto_16

    .line 138
    :cond_47
    invoke-static {v15, v10, v11, v12, v14}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_48
    move-object v12, v7

    move-object v5, v10

    move-object/from16 v10, v25

    .line 139
    invoke-static {v5, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_49
    move-object v12, v7

    move-object v0, v11

    move-object/from16 v10, v25

    .line 140
    invoke-static {v0, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_4a
    move-object v4, v12

    move-object/from16 v10, v25

    move-object v12, v7

    .line 141
    invoke-static {v4, v10, v1, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_4b
    move-object/from16 v26, v0

    move-object/from16 v25, v8

    move-object v0, v11

    move-object/from16 v9, v24

    move-object v11, v4

    move-object v4, v12

    move-object v12, v7

    move-object v7, v5

    move-object v5, v10

    .line 142
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    .line 143
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    move-result v10

    if-nez v10, :cond_74

    .line 144
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v10

    if-eqz v10, :cond_4e

    .line 145
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v10

    if-eqz v10, :cond_4d

    .line 146
    invoke-interface {v8}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4c

    goto :goto_19

    .line 147
    :cond_4c
    const-string v0, "The void non-type must not be annotated for "

    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 148
    :cond_4d
    const-string v0, "A constructor must return void "

    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    .line 149
    :cond_4e
    invoke-interface {v12}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidMethodIdentifier(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_73

    .line 150
    sget-object v10, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_RETURN:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_72

    .line 151
    sget-object v10, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v8, v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_71

    .line 152
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    move-result v8

    if-nez v8, :cond_50

    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8, v7}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v8

    if-eqz v8, :cond_4f

    goto :goto_19

    .line 153
    :cond_4f
    const-string v0, "Invisible return type "

    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-static {v0, v1, v11, v12}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 154
    :cond_50
    :goto_19
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 155
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_1a
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5d

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    move-object/from16 v24, v0

    .line 156
    invoke-interface {v10}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    move-object/from16 v27, v1

    .line 157
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_PARAMETER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5c

    .line 158
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5b

    .line 159
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    move-result v1

    if-nez v1, :cond_52

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0, v7}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v0

    if-eqz v0, :cond_51

    goto :goto_1b

    .line 160
    :cond_51
    const-string v0, "Invisible parameter type of "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 161
    :cond_52
    :goto_1b
    invoke-interface {v10}, Lnet/bytebuddy/description/NamedElement$WithOptionalName;->isNamed()Z

    move-result v0

    if-eqz v0, :cond_55

    .line 162
    invoke-interface {v10}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v0

    .line 163
    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_54

    .line 164
    invoke-static {v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->isValidUnqualifiedNameIdentifier(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_53

    goto :goto_1c

    .line 165
    :cond_53
    const-string v0, "Illegal parameter name of "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 166
    :cond_54
    const-string v0, "Duplicate parameter name of "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 167
    :cond_55
    :goto_1c
    invoke-interface {v10}, Lnet/bytebuddy/description/method/ParameterDescription;->hasModifiers()Z

    move-result v0

    if-eqz v0, :cond_57

    invoke-interface {v10}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v0

    const v1, -0x9011

    and-int/2addr v0, v1

    if-nez v0, :cond_56

    goto :goto_1d

    .line 168
    :cond_56
    const-string v0, "Illegal modifiers of "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 169
    :cond_57
    :goto_1d
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 170
    invoke-interface {v10}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_5a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v29, v1

    move-object/from16 v1, v28

    check-cast v1, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    move-object/from16 v28, v4

    .line 171
    sget-object v4, Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;

    invoke-interface {v1, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v4

    if-eqz v4, :cond_59

    .line 172
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_58

    move-object/from16 v4, v28

    move-object/from16 v1, v29

    goto :goto_1e

    :cond_58
    move-object v8, v1

    move-object/from16 v7, v25

    .line 173
    invoke-static/range {v7 .. v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_59
    move-object v8, v1

    .line 174
    invoke-static {v3, v8, v2, v10}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_5a
    move-object/from16 v28, v4

    move-object v1, v7

    move-object/from16 v0, v24

    move-object/from16 v1, v27

    goto/16 :goto_1a

    .line 175
    :cond_5b
    const-string v0, "Illegal type annotations on parameter "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 176
    :cond_5c
    const-string v0, "Illegal parameter type of "

    invoke-static {v0, v10, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_5d
    move-object/from16 v24, v0

    move-object/from16 v27, v1

    move-object/from16 v28, v4

    move-object v1, v7

    move-object/from16 v7, v25

    .line 177
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5e
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_62

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 178
    sget-object v8, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->EXCEPTION:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v4, v8}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_61

    .line 179
    sget-object v8, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;

    invoke-interface {v4, v8}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_60

    .line 180
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->isSynthetic()Z

    move-result v8

    if-nez v8, :cond_5e

    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-interface {v8, v1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v8

    if-eqz v8, :cond_5f

    goto :goto_1f

    .line 181
    :cond_5f
    const-string v0, "Invisible exception type "

    invoke-static {v0, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 182
    :cond_60
    invoke-static {v6, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 183
    :cond_61
    const-string v0, "Illegal exception type "

    invoke-static {v0, v4, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 184
    :cond_62
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 185
    invoke-interface {v12}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_66

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 186
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result v10

    if-eqz v10, :cond_63

    sget-object v10, Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;

    goto :goto_21

    :cond_63
    sget-object v10, Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;

    :goto_21
    invoke-interface {v8, v10}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->isSupportedOn(Ljava/lang/annotation/ElementType;)Z

    move-result v10

    if-eqz v10, :cond_65

    .line 187
    invoke-interface {v8}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_64

    goto :goto_20

    .line 188
    :cond_64
    invoke-static {v7, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 189
    :cond_65
    invoke-static {v3, v8, v2, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 190
    :cond_66
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object v0

    if-eqz v0, :cond_68

    .line 191
    invoke-interface {v12, v0}, Lnet/bytebuddy/description/method/MethodDescription;->isDefaultValue(Lnet/bytebuddy/description/annotation/AnnotationValue;)Z

    move-result v4

    if-eqz v4, :cond_67

    goto :goto_22

    .line 192
    :cond_67
    const-string v1, "Illegal default value "

    const-string v2, "for "

    invoke-static {v1, v0, v2, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 193
    :cond_68
    :goto_22
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    if-eqz v0, :cond_6a

    .line 194
    sget-object v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->RECEIVER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    invoke-interface {v0, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_69

    goto :goto_23

    .line 195
    :cond_69
    const-string v1, "Illegal receiver type "

    invoke-static {v1, v0, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 196
    :cond_6a
    :goto_23
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v4

    if-eqz v4, :cond_6c

    if-nez v0, :cond_6b

    goto :goto_25

    .line 197
    :cond_6b
    const-string v1, "Static method "

    const-string v2, " defines a non-null receiver "

    invoke-static {v1, v12, v2, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 198
    :cond_6c
    invoke-interface {v12}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v4

    const-string v8, " defines an illegal receiver "

    if-eqz v4, :cond_6f

    if-eqz v0, :cond_6e

    .line 199
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    if-nez v21, :cond_6d

    move-object v10, v1

    goto :goto_24

    :cond_6d
    move-object/from16 v10, v21

    :goto_24
    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6e

    goto :goto_25

    .line 200
    :cond_6e
    const-string v1, "Constructor "

    invoke-static {v1, v12, v8, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_6f
    if-eqz v0, :cond_70

    .line 201
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-virtual {v1, v4}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_70

    :goto_25
    move-object v10, v5

    move-object v8, v7

    move-object v4, v11

    move-object/from16 v11, v24

    move-object/from16 v0, v26

    move-object/from16 v12, v28

    move-object v5, v1

    move-object/from16 v24, v9

    move-object/from16 v1, v27

    goto/16 :goto_13

    .line 202
    :cond_70
    const-string v1, "Method "

    invoke-static {v1, v12, v8, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 203
    :cond_71
    const-string v0, "Illegal type annotations on return type "

    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 204
    :cond_72
    const-string v0, "Illegal return type "

    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    .line 205
    :cond_73
    const-string v0, "Illegal method name "

    invoke-static {v0, v8, v11, v12}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_74
    move-object v1, v7

    .line 206
    const-string v0, "Illegal explicit declaration of a type initializer by "

    invoke-static {v1, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    :cond_75
    move-object v11, v4

    move-object v12, v7

    .line 207
    invoke-interface {v12}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v0

    invoke-static {v0, v11, v12, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    :cond_76
    move-object v12, v7

    .line 208
    const-string v0, "Duplicate method signature for "

    invoke-static {v12, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    :cond_77
    move-object v1, v5

    return-object v1

    :cond_78
    move-object v1, v5

    .line 209
    const-string v2, "Cannot define nest host "

    const-string v3, " within different package then "

    invoke-static {v2, v0, v3, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_79
    move-object v1, v5

    .line 210
    const-string v2, " + as nest host for "

    invoke-static {v6, v0, v2, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :cond_7a
    move-object v11, v4

    move-object v1, v5

    move-object/from16 v18, v6

    .line 211
    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getModifiers()I

    move-result v0

    invoke-static {v0, v11, v1, v13}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏哲兰(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v18

    :cond_7b
    move-object v11, v4

    move-object v1, v5

    move-object/from16 v18, v6

    .line 212
    const-string v0, "Illegal type name: "

    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v11, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
