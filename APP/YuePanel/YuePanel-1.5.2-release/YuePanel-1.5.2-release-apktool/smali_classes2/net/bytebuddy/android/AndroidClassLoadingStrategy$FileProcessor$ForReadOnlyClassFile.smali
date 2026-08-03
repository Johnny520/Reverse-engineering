.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForReadOnlyClassFile"
.end annotation


# instance fields
.field private final permissions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "*>;"
        }
    .end annotation
.end field

.field private final setPosixFilePermissions:Ljava/lang/reflect/Method;

.field private final toPath:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/Set<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->setPosixFilePermissions:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->toPath:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->permissions:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->setPosixFilePermissions:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->toPath:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->permissions:Ljava/util/Set;

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/UnsupportedOperationException;

    if-eqz v0, :cond_0

    :goto_1
    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot invoke file system permissions method"

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access file system permissions"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
