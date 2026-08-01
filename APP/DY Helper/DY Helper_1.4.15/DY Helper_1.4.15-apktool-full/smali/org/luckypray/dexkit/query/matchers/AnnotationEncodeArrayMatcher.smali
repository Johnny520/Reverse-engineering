.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;


# instance fields
.field private encodeValuesMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final synthetic add(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addAnnotation(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final addBool(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final addByte(B)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic addClass(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final addClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;

    .line 13
    .line 14
    invoke-direct {v1, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$addClass$2$1$1;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(La80;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final addClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final addDouble(D)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic addEnum(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final addEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final addFloat(F)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final addInt(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final addLong(J)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic addMethod(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final addNull()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final addNumber(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    instance-of v1, p1, Ljava/lang/Byte;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    instance-of v1, p1, Ljava/lang/Short;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v1, p1, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    instance-of v1, p1, Ljava/lang/Long;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    instance-of v1, p1, Ljava/lang/Float;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    instance-of v1, p1, Ljava/lang/Double;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 81
    .line 82
    .line 83
    return-object p0
.end method

.method public final addShort(S)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final addString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 6

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 6

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final addString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    return-object p0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 13
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 14
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(Lxm0;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lxm0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 8
    .line 9
    return-object p0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, v1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final synthetic getCount()I
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

.method public final getEncodeValuesMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    new-instance v4, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 37
    .line 38
    invoke-virtual {v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->getValue-w2LRezQ()B

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    new-instance v6, Lo62;

    .line 50
    .line 51
    invoke-direct {v6, v5}, Lo62;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {v4}, Lv81;->ρ(Ljava/util/ArrayList;)[B

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v4, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    .line 63
    .line 64
    invoke-virtual {v4, p1, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createValuesTypeVector-VU-fvBY(Lb40;[B)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move v1, v3

    .line 70
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    new-instance v5, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-static {v4, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_2

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 98
    .line 99
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseMatcher;

    .line 107
    .line 108
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    invoke-static {v5}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget-object v4, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    .line 125
    .line 126
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createValuesVector(Lb40;[I)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move v2, v3

    .line 132
    :goto_3
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 133
    .line 134
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 139
    .line 140
    if-eqz p0, :cond_4

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    :cond_4
    move v5, v3

    .line 147
    move v3, v2

    .line 148
    move v2, v1

    .line 149
    move-object v1, p1

    .line 150
    invoke-virtual/range {v0 .. v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createAnnotationEncodeArrayMatcher(Lb40;IIBI)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    invoke-virtual {v1, p0}, Lb40;->ξ(I)V

    .line 155
    .line 156
    .line 157
    return p0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic setCount(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-void
.end method

.method public final values(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method
