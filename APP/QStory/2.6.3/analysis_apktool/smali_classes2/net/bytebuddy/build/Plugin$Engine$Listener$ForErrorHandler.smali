.class public Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;
.super Lnet/bytebuddy/build/Plugin$Engine$Listener$Adapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Listener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForErrorHandler"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public onError(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Ljava/util/Map;)V

    return-void
.end method

.method public onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onError(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    return-void
.end method

.method public onError(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onManifest(Ljava/util/jar/Manifest;)V
    .locals 0
    .param p1    # Ljava/util/jar/Manifest;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onManifest(Ljava/util/jar/Manifest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onResource(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onResource(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onUnresolved(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onUnresolved(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
