.class public Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Compound;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Origin"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin$CompoundIterator;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final origins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;

    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public getClassFileLocator()Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    invoke-interface {v2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->getClassFileLocator()Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    invoke-direct {v1, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public getManifest()Ljava/util/jar/Manifest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    invoke-interface {v1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->getManifest()Ljava/util/jar/Manifest;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->NO_MANIFEST:Ljava/util/jar/Manifest;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin$CompoundIterator;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin;->origins:Ljava/util/List;

    invoke-direct {v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Compound$Origin$CompoundIterator;-><init>(Ljava/util/List;)V

    return-object v0
.end method
