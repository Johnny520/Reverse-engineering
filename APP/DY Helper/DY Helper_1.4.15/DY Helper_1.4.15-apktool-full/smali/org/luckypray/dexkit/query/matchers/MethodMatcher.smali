.class public final Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;


# instance fields
.field private allOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private anyOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private noneOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

.field private paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

.field private protoShortyMatcher:Ljava/lang/String;

.field private returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private usingFieldsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private usingNumbersMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private usingStringsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 19
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 17
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 12
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const p2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic paramCount$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const p2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static synthetic returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic addAllOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addAllOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addAllOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOfMatchers:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addAnnotation(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addAnyOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addAnyOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addAnyOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOfMatchers:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addCaller(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addCaller(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addCaller(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final addCaller(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final addEqString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 16
    .line 17
    sget-object v2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p1, v2, v3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final synthetic addInvoke(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addInvoke(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final synthetic addNoneOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addNoneOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addNoneOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOfMatchers:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addParamType(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addParamType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-eqz p1, :cond_1

    .line 35
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final addParamType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 33
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 18
    .line 19
    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final addParamType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 36
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-eqz p1, :cond_1

    .line 37
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final synthetic addUsingField(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final addUsingField(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addUsingField(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 19
    .line 20
    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 24
    .line 25
    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 42
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    .line 43
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 44
    invoke-virtual {v1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 40
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addUsingNumber(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 16
    .line 17
    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final addUsingString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 19
    .line 20
    invoke-direct {v1, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final addUsingString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 29
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final synthetic allOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/MethodMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/MethodMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs allOf([Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 19
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 20
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 24
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final annotationCount(Lxm0;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 22
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lxm0;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final synthetic annotations(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final synthetic anyOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/MethodMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/MethodMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs anyOf([Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final synthetic callerMethods(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final callerMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final synthetic declaredClass(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v4, 0x6

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 19
    .line 20
    .line 21
    move-object v7, v1

    .line 22
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    const/4 v11, 0x6

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getReturnTypeName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v7, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 45
    .line 46
    .line 47
    return-object v7
.end method

.method public final getAllOfMatchers()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnyOfMatchers()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCallerMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getClassMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getDeclaredClass()Ljava/lang/String;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getInvokeMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getModifiers()I
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getModifiersMatcher()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getNameMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNoneOfMatchers()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getOpCodes()Ljava/util/Collection;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getOpCodesMatcher()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getOpNames()Ljava/util/Collection;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final synthetic getParamCount()I
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final synthetic getParamTypes()Ljava/util/Collection;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getParamsMatcher()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getProtoShorty()Ljava/lang/String;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getProtoShortyMatcher()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getReturnType()Ljava/lang/String;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getReturnTypeMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsingFieldsMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getUsingNumbers()Ljava/util/Collection;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getUsingNumbersMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getUsingStrings()Ljava/util/Collection;
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getUsingStringsMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    .line 9
    .line 10
    iget-object v3, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    :goto_0
    iget-object v5, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-virtual {v5, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v5, 0x0

    .line 30
    :goto_1
    iget-object v6, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 31
    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    invoke-virtual {v6, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/4 v6, 0x0

    .line 40
    :goto_2
    iget-object v7, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 41
    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    invoke-virtual {v7, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/4 v7, 0x0

    .line 50
    :goto_3
    iget-object v8, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 51
    .line 52
    if-eqz v8, :cond_4

    .line 53
    .line 54
    invoke-virtual {v8, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    const/4 v8, 0x0

    .line 60
    :goto_4
    iget-object v9, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 61
    .line 62
    if-eqz v9, :cond_5

    .line 63
    .line 64
    invoke-virtual {v9, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    const/4 v9, 0x0

    .line 70
    :goto_5
    iget-object v10, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 71
    .line 72
    if-eqz v10, :cond_6

    .line 73
    .line 74
    invoke-virtual {v10, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    goto :goto_6

    .line 79
    :cond_6
    const/4 v10, 0x0

    .line 80
    :goto_6
    iget-object v11, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 81
    .line 82
    const/16 v12, 0xa

    .line 83
    .line 84
    if-eqz v11, :cond_8

    .line 85
    .line 86
    new-instance v13, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v11, v12}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    if-eqz v14, :cond_7

    .line 104
    .line 105
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    check-cast v14, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 110
    .line 111
    invoke-virtual {v14, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_7
    invoke-static {v13}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v2, v11}, Lb40;->λ([I)I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    goto :goto_8

    .line 132
    :cond_8
    const/4 v11, 0x0

    .line 133
    :goto_8
    iget-object v13, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 134
    .line 135
    if-eqz v13, :cond_a

    .line 136
    .line 137
    new-instance v14, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {v13, v12}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    if-eqz v15, :cond_9

    .line 155
    .line 156
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    check-cast v15, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 161
    .line 162
    invoke-virtual {v15, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_9

    .line 174
    :cond_9
    invoke-static {v14}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v2, v13}, Lb40;->λ([I)I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    goto :goto_a

    .line 183
    :cond_a
    const/4 v13, 0x0

    .line 184
    :goto_a
    iget-object v14, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 185
    .line 186
    if-eqz v14, :cond_c

    .line 187
    .line 188
    new-instance v15, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-static {v14, v12}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    if-eqz v14, :cond_b

    .line 206
    .line 207
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    check-cast v14, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 212
    .line 213
    invoke-virtual {v14}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v14}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->getValue-w2LRezQ()B

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    new-instance v12, Lo62;

    .line 225
    .line 226
    invoke-direct {v12, v14}, Lo62;-><init>(B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    const/16 v12, 0xa

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_b
    invoke-static {v15}, Lv81;->ρ(Ljava/util/ArrayList;)[B

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    sget-object v12, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    .line 240
    .line 241
    invoke-virtual {v12, v2, v4}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createUsingNumbersTypeVector-VU-fvBY(Lb40;[B)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    move v12, v4

    .line 246
    goto :goto_c

    .line 247
    :cond_c
    const/4 v12, 0x0

    .line 248
    :goto_c
    iget-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 249
    .line 250
    if-eqz v4, :cond_e

    .line 251
    .line 252
    new-instance v14, Ljava/util/ArrayList;

    .line 253
    .line 254
    move-object/from16 v18, v1

    .line 255
    .line 256
    const/16 v15, 0xa

    .line 257
    .line 258
    invoke-static {v4, v15}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_d

    .line 274
    .line 275
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 280
    .line 281
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseMatcher;

    .line 289
    .line 290
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_d
    invoke-static {v14}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    sget-object v4, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    .line 307
    .line 308
    invoke-virtual {v4, v2, v1}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createUsingNumbersVector(Lb40;[I)I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    goto :goto_e

    .line 313
    :cond_e
    move-object/from16 v18, v1

    .line 314
    .line 315
    const/4 v1, 0x0

    .line 316
    :goto_e
    iget-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 317
    .line 318
    if-eqz v4, :cond_f

    .line 319
    .line 320
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    move v14, v4

    .line 325
    goto :goto_f

    .line 326
    :cond_f
    const/4 v14, 0x0

    .line 327
    :goto_f
    iget-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 328
    .line 329
    if-eqz v4, :cond_10

    .line 330
    .line 331
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    move v15, v4

    .line 336
    goto :goto_10

    .line 337
    :cond_10
    const/4 v15, 0x0

    .line 338
    :goto_10
    iget-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    .line 339
    .line 340
    if-eqz v4, :cond_11

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Lb40;->κ(Ljava/lang/CharSequence;)I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    :goto_11
    move/from16 v19, v1

    .line 347
    .line 348
    goto :goto_12

    .line 349
    :cond_11
    const/4 v4, 0x0

    .line 350
    goto :goto_11

    .line 351
    :goto_12
    iget-object v1, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->allOfMatchers:Ljava/util/List;

    .line 352
    .line 353
    if-eqz v1, :cond_13

    .line 354
    .line 355
    move/from16 v20, v3

    .line 356
    .line 357
    new-instance v3, Ljava/util/ArrayList;

    .line 358
    .line 359
    move/from16 v21, v4

    .line 360
    .line 361
    move/from16 v22, v5

    .line 362
    .line 363
    const/16 v4, 0xa

    .line 364
    .line 365
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 370
    .line 371
    .line 372
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_12

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 387
    .line 388
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_13

    .line 400
    :cond_12
    invoke-static {v3}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v2, v1}, Lb40;->λ([I)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    goto :goto_14

    .line 409
    :cond_13
    move/from16 v20, v3

    .line 410
    .line 411
    move/from16 v21, v4

    .line 412
    .line 413
    move/from16 v22, v5

    .line 414
    .line 415
    const/4 v1, 0x0

    .line 416
    :goto_14
    iget-object v3, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->anyOfMatchers:Ljava/util/List;

    .line 417
    .line 418
    if-eqz v3, :cond_15

    .line 419
    .line 420
    new-instance v4, Ljava/util/ArrayList;

    .line 421
    .line 422
    move/from16 v23, v1

    .line 423
    .line 424
    const/16 v5, 0xa

    .line 425
    .line 426
    invoke-static {v3, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    if-eqz v3, :cond_14

    .line 442
    .line 443
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    check-cast v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 448
    .line 449
    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto :goto_15

    .line 461
    :cond_14
    invoke-static {v4}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v2, v1}, Lb40;->λ([I)I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    goto :goto_16

    .line 470
    :cond_15
    move/from16 v23, v1

    .line 471
    .line 472
    const/4 v1, 0x0

    .line 473
    :goto_16
    iget-object v0, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOfMatchers:Ljava/util/List;

    .line 474
    .line 475
    if-eqz v0, :cond_17

    .line 476
    .line 477
    new-instance v3, Ljava/util/ArrayList;

    .line 478
    .line 479
    const/16 v4, 0xa

    .line 480
    .line 481
    invoke-static {v0, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    if-eqz v4, :cond_16

    .line 497
    .line 498
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 503
    .line 504
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    goto :goto_17

    .line 516
    :cond_16
    invoke-static {v3}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v2, v0}, Lb40;->λ([I)I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    move v5, v6

    .line 525
    move v6, v7

    .line 526
    move v7, v8

    .line 527
    move v8, v9

    .line 528
    move v9, v10

    .line 529
    move v10, v11

    .line 530
    move v11, v13

    .line 531
    move/from16 v13, v19

    .line 532
    .line 533
    move/from16 v19, v4

    .line 534
    .line 535
    move-object/from16 v3, v18

    .line 536
    .line 537
    move/from16 v18, v1

    .line 538
    .line 539
    move-object v1, v3

    .line 540
    move/from16 v3, v20

    .line 541
    .line 542
    move/from16 v16, v21

    .line 543
    .line 544
    move/from16 v17, v23

    .line 545
    .line 546
    move/from16 v4, v22

    .line 547
    .line 548
    goto :goto_18

    .line 549
    :cond_17
    move v5, v6

    .line 550
    move v6, v7

    .line 551
    move v7, v8

    .line 552
    move v8, v9

    .line 553
    move v9, v10

    .line 554
    move v10, v11

    .line 555
    move v11, v13

    .line 556
    move/from16 v13, v19

    .line 557
    .line 558
    const/16 v19, 0x0

    .line 559
    .line 560
    move-object/from16 v3, v18

    .line 561
    .line 562
    move/from16 v18, v1

    .line 563
    .line 564
    move-object v1, v3

    .line 565
    move/from16 v3, v20

    .line 566
    .line 567
    move/from16 v16, v21

    .line 568
    .line 569
    move/from16 v4, v22

    .line 570
    .line 571
    move/from16 v17, v23

    .line 572
    .line 573
    :goto_18
    invoke-virtual/range {v1 .. v19}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createMethodMatcher(Lb40;IIIIIIIIIIIIIIIII)I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    invoke-virtual {v2, v0}, Lb40;->ξ(I)V

    .line 578
    .line 579
    .line 580
    return v0
.end method

.method public final synthetic invokeMethods(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final invokeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 13
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 10
    .line 11
    return-object p0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p0
.end method

.method public final synthetic noneOf(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/MethodMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/MethodMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs noneOf([Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final synthetic not(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->not(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final not(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addNoneOf(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final opCodes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    return-object p0
.end method

.method public final opCodes(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    return-object p0
.end method

.method public final opNames(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    return-object p0
.end method

.method public final paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 25
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final paramCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 28
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 29
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final paramCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final paramCount(Lxm0;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 27
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(Lxm0;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    .line 57
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 58
    sget-object v1, Ljz;->ε:Ljz;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 59
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljz;->ε:Ljz;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v3, v1

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 36
    .line 37
    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x6

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v1, 0x0

    .line 50
    :goto_1
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 55
    .line 56
    return-object p0
.end method

.method public final varargs paramTypes([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 66
    sget-object v1, Ljz;->ε:Ljz;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 67
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    if-eqz v3, :cond_0

    .line 68
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v4, v3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 69
    :cond_1
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final varargs paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 61
    sget-object v1, Ljz;->ε:Ljz;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 62
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, p1, v2

    if-eqz v4, :cond_0

    .line 63
    new-instance v3, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 64
    :cond_1
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final synthetic params(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->params(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final params(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object p0
.end method

.method public final protoShorty(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic returnType(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final returnType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v4, 0x6

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    return-object p0
.end method

.method public final returnType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final returnType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final synthetic setDeclaredClass(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOpCodes(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOpNames(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic setParamCount(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic setParamTypes(Ljava/util/Collection;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final synthetic setProtoShorty(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShorty(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final synthetic setReturnType(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setUsingNumbers(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Number;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbers(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final synthetic setUsingStrings(Ljava/util/Collection;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final usingEqStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 34
    .line 35
    sget-object v3, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-direct {v2, v1, v3, v4}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 51
    .line 52
    return-object p0
.end method

.method public final varargs usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 55
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v6, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-direct {v5, v4, v6, v2}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 56
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object p0
.end method

.method public final synthetic usingFields(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFields(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final usingFields(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    return-object p0
.end method

.method public final synthetic usingNumbers(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    new-instance v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbers(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final usingNumbers(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Number;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 34
    .line 35
    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 52
    .line 53
    return-object p0
.end method

.method public final usingNumbers(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    return-object p0
.end method

.method public final varargs usingNumbers([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 58
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v4, v3}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v3

    .line 59
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 60
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 61
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    return-object p0
.end method

.method public final synthetic usingStrings(La80;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    new-instance v0, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final usingStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 37
    .line 38
    invoke-direct {v2, v1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 51
    .line 52
    return-object p0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object p0
.end method

.method public final varargs usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p1, v2

    .line 59
    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILzq;)V

    .line 60
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 61
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 62
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object p0
.end method
