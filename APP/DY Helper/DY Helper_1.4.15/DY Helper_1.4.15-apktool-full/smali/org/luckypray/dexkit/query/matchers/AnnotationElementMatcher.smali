.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;


# instance fields
.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic annotationValue(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final synthetic arrayValue(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final boolValue(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic classValue(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final classValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$classValue$2$1$1;

    .line 13
    .line 14
    invoke-direct {v1, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$classValue$2$1$1;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(La80;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic enumValue(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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

.method public final getValueMatcher()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

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
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->getValue-w2LRezQ()B

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v3, v2

    .line 33
    :goto_1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    :goto_2
    check-cast p0, Lorg/luckypray/dexkit/query/base/BaseMatcher;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :cond_3
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;->createAnnotationElementMatcher-SpDDLgk(Lb40;IBI)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p1, p0}, Lb40;->ξ(I)V

    .line 56
    .line 57
    .line 58
    return p0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final synthetic methodValue(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 6

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p0
.end method

.method public final nullValue()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 81
    .line 82
    .line 83
    return-object p0
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic setValue(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 6

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    return-object p0
.end method

.method public final synthetic value(La80;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method
