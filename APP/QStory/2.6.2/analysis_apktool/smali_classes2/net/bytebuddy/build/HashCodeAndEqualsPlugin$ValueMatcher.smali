.class public Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;
.super Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ValueMatcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues<",
        "Lnet/bytebuddy/description/field/FieldDescription;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic doMatch(Ljava/lang/Object;)Z
    .locals 0

    .line 43
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->doMatch(Lnet/bytebuddy/description/field/FieldDescription;)Z

    move-result p0

    return p0
.end method

.method public doMatch(Lnet/bytebuddy/description/field/FieldDescription;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->access$200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 30
    .line 31
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 36
    .line 37
    if-ne p1, p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->equals(Ljava/lang/Object;)Z

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
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;->sort:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method
