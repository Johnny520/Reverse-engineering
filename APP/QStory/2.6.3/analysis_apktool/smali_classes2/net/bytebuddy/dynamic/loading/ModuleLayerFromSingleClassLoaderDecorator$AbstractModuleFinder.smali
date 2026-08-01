.class public abstract Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractModuleFinder"
.end annotation


# instance fields
.field private final moduleReference:Ljava/lang/Object;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;->moduleReference:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public doFind(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;->moduleReference:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->of(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;->empty()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public doFindAll()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;->moduleReference:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
