.class public final Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;


# instance fields
.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;

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

.method public static final create()Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic addAnnotation(La80;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final synthetic annotations(La80;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-ParameterMatcher;->Companion:Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :cond_1
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;->createParameterMatcher(Lb40;II)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, p0}, Lb40;->ξ(I)V

    .line 30
    .line 31
    .line 32
    return p0
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic type(La80;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;"
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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    return-object p0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 6

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
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

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method
