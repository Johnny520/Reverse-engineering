.class final enum Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target$2;
.super Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassInjector$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public inject(Ljava/lang/instrument/Instrumentation;Ljava/util/jar/JarFile;)V
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation;->access$600()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Dispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Dispatcher;->appendToSystemClassLoaderSearch(Ljava/lang/instrument/Instrumentation;Ljava/util/jar/JarFile;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
