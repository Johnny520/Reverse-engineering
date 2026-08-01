.class public Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForClassFileTransformer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer$AllPermissionsCollection;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final ALL_PRIVILEGES:Ljava/security/ProtectionDomain;

.field private static final UNLOADED_TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/security/ProtectionDomain;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer$AllPermissionsCollection;

    .line 4
    .line 5
    invoke-direct {v1}, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer$AllPermissionsCollection;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, Ljava/security/ProtectionDomain;-><init>(Ljava/security/CodeSource;Ljava/security/PermissionCollection;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->ALL_PRIVILEGES:Ljava/security/ProtectionDomain;

    .line 13
    .line 14
    sput-object v2, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->UNLOADED_TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/instrument/ClassFileTransformer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;

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

.method public transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/security/ProtectionDomain;[B)[B
    .locals 6
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->classFileTransformer:Ljava/lang/instrument/ClassFileTransformer;

    .line 2
    .line 3
    const/16 p0, 0x2e

    .line 4
    .line 5
    const/16 v1, 0x2f

    .line 6
    .line 7
    invoke-virtual {p2, p0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->UNLOADED_TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    sget-object p3, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$ForClassFileTransformer;->ALL_PRIVILEGES:Ljava/security/ProtectionDomain;

    .line 16
    .line 17
    :cond_0
    move-object v1, p1

    .line 18
    move-object v4, p3

    .line 19
    move-object v5, p4

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p0, v0

    .line 23
    goto :goto_1

    .line 24
    :goto_0
    invoke-interface/range {v0 .. v5}, Ljava/lang/instrument/ClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/instrument/IllegalClassFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-object v5

    .line 31
    :cond_1
    return-object p0

    .line 32
    :goto_1
    const-string p1, "Failed to transform "

    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method
