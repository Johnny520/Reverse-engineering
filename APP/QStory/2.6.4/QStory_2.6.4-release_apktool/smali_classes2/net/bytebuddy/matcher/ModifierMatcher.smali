.class public Lnet/bytebuddy/matcher/ModifierMatcher;
.super Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/matcher/ModifierMatcher$Mode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lnet/bytebuddy/description/ModifierReviewable;",
        ">",
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 5
    .line 6
    return-void
.end method

.method public static of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable;",
            ">(",
            "Lnet/bytebuddy/matcher/ModifierMatcher$Mode;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->getMatcher()Lnet/bytebuddy/matcher/ModifierMatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic doMatch(Ljava/lang/Object;)Z
    .locals 0

    .line 18
    check-cast p1, Lnet/bytebuddy/description/ModifierReviewable;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/matcher/ModifierMatcher;->doMatch(Lnet/bytebuddy/description/ModifierReviewable;)Z

    move-result p0

    return p0
.end method

.method public doMatch(Lnet/bytebuddy/description/ModifierReviewable;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    and-int/2addr p0, p1

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
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
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/matcher/ModifierMatcher;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

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
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

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

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher;->mode:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->getDescription()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
