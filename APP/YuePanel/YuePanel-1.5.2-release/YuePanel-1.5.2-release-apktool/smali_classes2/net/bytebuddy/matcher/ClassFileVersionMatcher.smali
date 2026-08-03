.class public Lnet/bytebuddy/matcher/ClassFileVersionMatcher;
.super Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lnet/bytebuddy/description/type/TypeDescription;",
        ">",
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final atMost:Z

.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/ClassFileVersion;Z)V
    .locals 0

    invoke-direct {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iput-boolean p2, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic doMatch(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->doMatch(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p1

    return p1
.end method

.method public doMatch(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-boolean v0, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {p1, v0}, Lnet/bytebuddy/ClassFileVersion;->isAtMost(Lnet/bytebuddy/ClassFileVersion;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {p1, v0}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    check-cast p1, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;

    iget-boolean v3, p1, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object p1, p1, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/ClassFileVersion;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hasClassFileVersion(at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->atMost:Z

    if-eqz v1, :cond_0

    const-string v1, "most"

    goto :goto_0

    :cond_0
    const-string v1, "least"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
