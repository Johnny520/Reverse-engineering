.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;
.super Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Injecting"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;
    }
.end annotation


# static fields
.field private static final DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForAndroidPVm;

    .line 2
    .line 3
    const-class v1, Ldalvik/system/BaseDexClassLoader;

    .line 4
    .line 5
    const-string v2, "addDexPath"

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForAndroidPVm;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;->INSTANCE:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 24
    .line 25
    :goto_0
    sput-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->makeDefault()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;-><init>(Ljava/io/File;Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;-><init>(Ljava/io/File;Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;)V

    return-void
.end method


# virtual methods
.method public doLoad(Ljava/lang/ClassLoader;Ljava/util/Set;Ljava/io/File;)Ljava/util/Map;
    .locals 2
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->privateDirectory:Ljava/io/File;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->randomString:Lnet/bytebuddy/utility/RandomString;

    .line 6
    .line 7
    invoke-interface {v0, v1, p3, p1, p0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;->loadDex(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/RandomString;)Ldalvik/system/DexFile;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :try_start_0
    new-instance p3, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    :try_start_1
    sget-object v1, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;

    .line 34
    .line 35
    invoke-interface {v1, p0, p1, v0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;->loadClass(Ldalvik/system/DexFile;Ljava/lang/ClassLoader;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    monitor-exit p1

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    new-instance p3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "Could not load "

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p2

    .line 71
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :try_start_2
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Ldalvik/system/DexFile;->close()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-object p3

    .line 81
    :goto_2
    if-eqz p0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Ldalvik/system/DexFile;->close()V

    .line 84
    .line 85
    .line 86
    :cond_3
    throw p1
.end method

.method public load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Cannot inject classes into the bootstrap class loader on Android"

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method
