.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Enabled"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;->jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public defineClass(Ljava/lang/ClassLoader;Ljava/lang/String;[BLjava/security/ProtectionDomain;)Ljava/lang/Class;
    .locals 7
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;->jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;

    .line 2
    .line 3
    sget-object v1, Lcom/sun/jna/JNIEnv;->CURRENT:Lcom/sun/jna/JNIEnv;

    .line 4
    .line 5
    const/16 p0, 0x2e

    .line 6
    .line 7
    const/16 v2, 0x2f

    .line 8
    .line 9
    invoke-virtual {p2, p0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    array-length v5, p3

    .line 14
    move-object v3, p1

    .line 15
    move-object v4, p3

    .line 16
    move-object v6, p4

    .line 17
    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;->JVM_DefineClass(Lcom/sun/jna/JNIEnv;Ljava/lang/String;Ljava/lang/ClassLoader;[BILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;->jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;->jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Enabled;->jvm:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Jvm;

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

.method public isAvailable()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
