.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForApi26LevelCompatibleVm"
.end annotation


# instance fields
.field private final dxContext:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private final translate:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;->translate:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;->dxContext:Ljava/lang/reflect/Constructor;

    return-void
.end method


# virtual methods
.method public setTargetApi(Lcom/android/dx/dex/DexOptions;I)V
    .locals 0

    return-void
.end method

.method public translate(Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 9

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;->translate:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;->dxContext:Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/dx/dex/file/ClassDefItem;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Cannot invoke Android dex file translation method"

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Cannot instantiate dex context"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_2
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Cannot access an Android dex file translation method"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
