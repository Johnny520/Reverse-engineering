.class public abstract Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractModuleReader"
.end annotation


# instance fields
.field private final types:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;->types:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public doFind(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, ".class"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x6

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/16 v1, 0x2f

    .line 21
    .line 22
    const/16 v2, 0x2e

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;->types:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, [B

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "bytebuddy://"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->of(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->empty()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public doList()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$900()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;->empty()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public doOpen(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, ".class"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x6

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 v0, 0x2f

    .line 21
    .line 22
    const/16 v1, 0x2e

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;->types:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, [B

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->of(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->empty()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
