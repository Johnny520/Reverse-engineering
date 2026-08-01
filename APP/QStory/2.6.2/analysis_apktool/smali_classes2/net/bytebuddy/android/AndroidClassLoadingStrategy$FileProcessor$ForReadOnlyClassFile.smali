.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->setPosixFilePermissions:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->toPath:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->permissions:Ljava/util/Set;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->setPosixFilePermissions:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->toPath:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;->permissions:Ljava/util/Set;

    .line 11
    .line 12
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, v2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    instance-of p1, p1, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p1, "Cannot invoke file system permissions method"

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_1
    move-exception p0

    .line 41
    const-string p1, "Cannot access file system permissions"

    .line 42
    .line 43
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
