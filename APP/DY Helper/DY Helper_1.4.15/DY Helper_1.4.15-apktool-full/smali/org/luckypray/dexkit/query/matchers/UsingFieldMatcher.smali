.class public final Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;


# instance fields
.field private matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

.field private usingType:Lorg/luckypray/dexkit/query/enums/UsingType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 25
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 28
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 29
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 30
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILzq;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 31
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 11
    .line 12
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 13
    .line 14
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/reflect/Field;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 20
    .line 21
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;ILzq;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 26
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    return-void
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic addAnnotation(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic addReadMethods(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addReadMethods(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic addWriteMethod(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addWriteMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 25
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 19
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 20
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 24
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final annotationCount(Lxm0;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 22
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(Lxm0;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic annotations(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic declaredClass(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 26
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

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
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 38
    .line 39
    .line 40
    return-object v7
.end method

.method public final synthetic field(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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

.method public final getUsingType()Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/UsingType;->getValue()B

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v1, p1, v0, p0}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;->createUsingFieldMatcher(Lb40;IB)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p1, p0}, Lb40;->ξ(I)V

    .line 28
    .line 29
    .line 30
    return p0

    .line 31
    :cond_0
    const-string p0, "UsingFieldMatcher matcher not set"

    .line 32
    .line 33
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    .line 19
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 21
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic readMethods(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

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
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

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
    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

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
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic setUsingType(Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic type(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 26
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 6

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 24
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic writeMethods(La80;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
