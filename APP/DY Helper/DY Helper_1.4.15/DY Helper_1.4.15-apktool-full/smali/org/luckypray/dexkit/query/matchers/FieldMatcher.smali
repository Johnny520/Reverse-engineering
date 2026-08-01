.class public final Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;


# instance fields
.field private allOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private anyOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private noneOfMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

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

    .line 16
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 17
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
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
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getFieldDescriptor(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic addAllOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAllOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addAllOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOfMatchers:Ljava/util/List;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addAnnotation(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addAnyOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnyOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addAnyOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOfMatchers:Ljava/util/List;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addNoneOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addNoneOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addNoneOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOfMatchers:Ljava/util/List;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOfMatchers:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addReadMethod(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addReadMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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

.method public final addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final synthetic addWriteMethod(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addWriteMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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

.method public final addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final synthetic allOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
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
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs allOf([Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 19
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 20
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 24
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final annotationCount(Lxm0;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 22
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lxm0;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final synthetic annotations(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final synthetic anyOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
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
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs anyOf([Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic declaredClass(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

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
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 19
    .line 20
    .line 21
    move-object v7, v1

    .line 22
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

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
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 38
    .line 39
    .line 40
    return-object v7
.end method

.method public final getAllOfMatchers()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getClassMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

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

.method public final getGetMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOfMatchers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPutMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getType()Ljava/lang/String;
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

.method public final getTypeMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v2

    .line 17
    :goto_0
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v3, v2

    .line 27
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v4, v2

    .line 37
    :goto_2
    iget-object v5, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 38
    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    invoke-virtual {v5, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move v5, v2

    .line 47
    :goto_3
    iget-object v6, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 48
    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    invoke-virtual {v6, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    goto :goto_4

    .line 56
    :cond_4
    move v6, v2

    .line 57
    :goto_4
    iget-object v7, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 58
    .line 59
    if-eqz v7, :cond_5

    .line 60
    .line 61
    invoke-virtual {v7, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    move v7, v2

    .line 67
    :goto_5
    iget-object v8, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 68
    .line 69
    if-eqz v8, :cond_6

    .line 70
    .line 71
    invoke-virtual {v8, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    goto :goto_6

    .line 76
    :cond_6
    move v8, v2

    .line 77
    :goto_6
    iget-object v9, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->allOfMatchers:Ljava/util/List;

    .line 78
    .line 79
    const/16 v10, 0xa

    .line 80
    .line 81
    if-eqz v9, :cond_8

    .line 82
    .line 83
    new-instance v11, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {v9, v10}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_7

    .line 101
    .line 102
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    check-cast v12, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 107
    .line 108
    invoke-virtual {v12, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_7
    invoke-static {v11}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {p1, v9}, Lb40;->λ([I)I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    goto :goto_8

    .line 129
    :cond_8
    move v9, v2

    .line 130
    :goto_8
    iget-object v11, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->anyOfMatchers:Ljava/util/List;

    .line 131
    .line 132
    if-eqz v11, :cond_a

    .line 133
    .line 134
    new-instance v12, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-static {v11, v10}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-eqz v13, :cond_9

    .line 152
    .line 153
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    check-cast v13, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 158
    .line 159
    invoke-virtual {v13, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_9

    .line 171
    :cond_9
    invoke-static {v12}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {p1, v11}, Lb40;->λ([I)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    goto :goto_a

    .line 180
    :cond_a
    move v11, v2

    .line 181
    :goto_a
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOfMatchers:Ljava/util/List;

    .line 182
    .line 183
    if-eqz p0, :cond_c

    .line 184
    .line 185
    new-instance v2, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-static {p0, v10}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_b

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    check-cast v10, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 209
    .line 210
    invoke-virtual {v10, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_b

    .line 222
    :cond_b
    invoke-static {v2}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p1, p0}, Lb40;->λ([I)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    :cond_c
    move v10, v11

    .line 231
    move v11, v2

    .line 232
    move v2, v1

    .line 233
    move-object v1, p1

    .line 234
    invoke-virtual/range {v0 .. v11}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->createFieldMatcher(Lb40;IIIIIIIIII)I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    invoke-virtual {v1, p0}, Lb40;->ξ(I)V

    .line 239
    .line 240
    .line 241
    return p0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    .line 13
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 10
    .line 11
    return-object p0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 6

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p0
.end method

.method public final synthetic noneOf(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
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
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOfMatchers:Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final varargs noneOf([Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->noneOf(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic not(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->not(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final not(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addNoneOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic readMethods(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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
    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic setType(Ljava/lang/String;)V
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic type(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    return-object p0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final synthetic writeMethods(La80;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method
