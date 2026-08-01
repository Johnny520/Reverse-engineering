.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;
.super Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Wrapping"
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->makeDefault()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;-><init>(Ljava/io/File;Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;)V

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
    new-instance v0, Ldalvik/system/DexClassLoader;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->privateDirectory:Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->access$400()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, p3, p0, v1, p1}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    :try_start_0
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {p3, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "Cannot load "

    .line 56
    .line 57
    invoke-static {p1, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    :cond_0
    return-object p0
.end method
