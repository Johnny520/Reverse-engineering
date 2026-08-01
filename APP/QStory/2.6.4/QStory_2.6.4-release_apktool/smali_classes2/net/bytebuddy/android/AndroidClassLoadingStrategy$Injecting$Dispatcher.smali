.class public interface abstract Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Dispatcher"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForAndroidPVm;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;
    }
.end annotation


# virtual methods
.method public abstract loadClass(Ldalvik/system/DexFile;Ljava/lang/ClassLoader;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Class;
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldalvik/system/DexFile;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract loadDex(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/RandomString;)Ldalvik/system/DexFile;
    .param p3    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
