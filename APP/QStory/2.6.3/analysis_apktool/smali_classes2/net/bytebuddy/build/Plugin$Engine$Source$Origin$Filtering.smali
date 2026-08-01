.class public Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Filtering"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

.field private final manifest:Z

.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;Lnet/bytebuddy/matcher/ElementMatcher;Z)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;Lnet/bytebuddy/matcher/ElementMatcher;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->manifest:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-boolean v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->manifest:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->manifest:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public getManifest()Ljava/util/jar/Manifest;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->manifest:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->getManifest()Ljava/util/jar/Manifest;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->NO_MANIFEST:Ljava/util/jar/Manifest;

    .line 13
    .line 14
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-boolean p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->manifest:Z

    .line 27
    .line 28
    add-int/2addr v0, p0

    .line 29
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;-><init>(Ljava/util/Iterator;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/build/Plugin$1;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public toClassFileLocator(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 0
    .param p1    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;->delegate:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->toClassFileLocator(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
