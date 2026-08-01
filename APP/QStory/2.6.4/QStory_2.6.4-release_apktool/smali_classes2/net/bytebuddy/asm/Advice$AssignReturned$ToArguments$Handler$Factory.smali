.class public final enum Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory<",
        "Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

.field private static final TO_ARGUMENTS_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final TO_ARGUMENT_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final TO_ARGUMENT_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final TO_ARGUMENT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->$VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 16
    .line 17
    const-class v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;

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
    move-result-object v2

    .line 33
    invoke-interface {v0, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 38
    .line 39
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 44
    .line 45
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENTS_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    const-class v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$ToArgument;

    .line 48
    .line 49
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 66
    .line 67
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 72
    .line 73
    sput-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 74
    .line 75
    const-string v1, "index"

    .line 76
    .line 77
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 86
    .line 87
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 92
    .line 93
    sput-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 94
    .line 95
    const-string v1, "typing"

    .line 96
    .line 97
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 106
    .line 107
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 112
    .line 113
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 114
    .line 115
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->$VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

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
            "Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;

    .line 2
    .line 3
    return-object p0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;ZLnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Z",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "+",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;",
            ">;)",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENTS_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 7
    .line 8
    invoke-interface {p3, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-class p3, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 13
    .line 14
    invoke-interface {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 19
    .line 20
    array-length p3, p2

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-ge v0, p3, :cond_1

    .line 23
    .line 24
    aget-object v1, p2, v0

    .line 25
    .line 26
    sget-object v2, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-class v3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ltz v2, :cond_0

    .line 45
    .line 46
    new-instance v4, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;

    .line 47
    .line 48
    sget-object v5, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 49
    .line 50
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    sget-object v5, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->TO_ARGUMENT_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 65
    .line 66
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-class v5, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 71
    .line 72
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 77
    .line 78
    const-class v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 79
    .line 80
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 85
    .line 86
    invoke-direct {v4, v2, v3, v1}, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;-><init>(IILnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string p0, "An argument cannot have a negative index for "

    .line 96
    .line 97
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    :cond_1
    return-object p0
.end method
