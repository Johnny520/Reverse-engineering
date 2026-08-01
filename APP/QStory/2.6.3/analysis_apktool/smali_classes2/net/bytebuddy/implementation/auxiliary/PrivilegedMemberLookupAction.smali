.class public final enum Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;",
        ">;",
        "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

.field private static final DEFAULT_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum FOR_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

.field public static final enum FOR_DECLARED_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

.field public static final enum FOR_PUBLIC_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

.field public static final enum FOR_PUBLIC_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

.field private static final TYPE_FIELD:Ljava/lang/String; = "type"


# instance fields
.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 2
    .line 3
    const-string v6, "parameters"

    .line 4
    .line 5
    const-class v7, [Ljava/lang/Class;

    .line 6
    .line 7
    const-string v1, "FOR_PUBLIC_METHOD"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "getMethod"

    .line 11
    .line 12
    const-string v4, "name"

    .line 13
    .line 14
    const-class v5, Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_PUBLIC_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 20
    .line 21
    new-instance v1, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 22
    .line 23
    const-string v7, "parameters"

    .line 24
    .line 25
    const-class v8, [Ljava/lang/Class;

    .line 26
    .line 27
    const-string v2, "FOR_DECLARED_METHOD"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const-string v4, "getDeclaredMethod"

    .line 31
    .line 32
    const-string v5, "name"

    .line 33
    .line 34
    const-class v6, Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_DECLARED_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 40
    .line 41
    new-instance v2, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 42
    .line 43
    const-string v6, "parameters"

    .line 44
    .line 45
    const-class v7, [Ljava/lang/Class;

    .line 46
    .line 47
    const-string v3, "FOR_PUBLIC_CONSTRUCTOR"

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    const-string v5, "getConstructor"

    .line 51
    .line 52
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    sput-object v2, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_PUBLIC_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 56
    .line 57
    new-instance v3, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 58
    .line 59
    const-string v7, "parameters"

    .line 60
    .line 61
    const-class v8, [Ljava/lang/Class;

    .line 62
    .line 63
    const-string v4, "FOR_DECLARED_CONSTRUCTOR"

    .line 64
    .line 65
    const/4 v5, 0x3

    .line 66
    const-string v6, "getDeclaredConstructor"

    .line 67
    .line 68
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    sput-object v3, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 72
    .line 73
    filled-new-array {v0, v1, v2, v3}, [Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 78
    .line 79
    const-class v0, Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 98
    .line 99
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 104
    .line 105
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->DEFAULT_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 106
    .line 107
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    :try_start_0
    new-instance p1, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    const-class p2, Ljava/lang/Class;

    filled-new-array {p5}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    invoke-static {p4, p5}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    return-void

    :catch_0
    move-exception p0

    .line 50
    const-string p1, "Could not locate method: "

    .line 51
    invoke-static {p1, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance p1, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 5
    .line 6
    const-class p2, Ljava/lang/Class;

    .line 7
    .line 8
    filled-new-array {p5, p7}, [Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p2, p3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {p1, p4, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p6, p7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p0

    .line 36
    const-string p1, "Could not locate method: "

    .line 37
    .line 38
    invoke-static {p1, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_PUBLIC_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_PUBLIC_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->FOR_DECLARED_METHOD:Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-string v0, "Cannot load constant for type initializer: "

    .line 38
    .line 39
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getSuffix()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public make(Ljava/lang/String;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/MethodAccessorFactory;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 7

    .line 1
    sget-object p3, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->DEFAULT_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-static {p3}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const-string v0, "type"

    .line 8
    .line 9
    invoke-static {v0}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v1, v2}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p3, v1}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v3, 0x1

    .line 33
    move v4, v3

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v5}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    add-int/lit8 v6, v4, 0x1

    .line 51
    .line 52
    invoke-interface {v5, v4}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {p3, v4}, Lnet/bytebuddy/implementation/Implementation$Composable;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    move v4, v6

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v1, Lnet/bytebuddy/ByteBuddy;

    .line 63
    .line 64
    invoke-direct {v1, p2}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 65
    .line 66
    .line 67
    sget-object p2, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 68
    .line 69
    invoke-virtual {v1, p2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    const-class v1, Ljava/security/PrivilegedExceptionAction;

    .line 74
    .line 75
    sget-object v4, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 76
    .line 77
    invoke-virtual {p2, v1, v4}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object p2, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;->DEFAULT_TYPE_MODIFIER:[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 86
    .line 87
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-array p2, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 92
    .line 93
    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 94
    .line 95
    aput-object v1, p2, v2

    .line 96
    .line 97
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance p2, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    const-class v1, Ljava/lang/Class;

    .line 113
    .line 114
    invoke-static {v1, p2}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const-string p2, "run"

    .line 127
    .line 128
    invoke-static {p2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object p2, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 137
    .line 138
    invoke-static {p2}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iget-object p3, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    .line 147
    .line 148
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    new-array v4, v2, [Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p3, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    check-cast p3, [Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {p2, p3}, Lnet/bytebuddy/implementation/MethodCall;->withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    new-array p2, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 169
    .line 170
    sget-object p3, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 171
    .line 172
    aput-object p3, p2, v2

    .line 173
    .line 174
    invoke-interface {p1, v0, v1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/PrivilegedMemberLookupAction;->fields:Ljava/util/Map;

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_1

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    check-cast p2, Ljava/util/Map$Entry;

    .line 199
    .line 200
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    check-cast p3, Ljava/lang/String;

    .line 205
    .line 206
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    check-cast p2, Ljava/lang/reflect/Type;

    .line 211
    .line 212
    new-array v0, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 213
    .line 214
    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 215
    .line 216
    aput-object v1, v0, v2

    .line 217
    .line 218
    invoke-interface {p1, p3, p2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    goto :goto_1

    .line 223
    :cond_1
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0
.end method
