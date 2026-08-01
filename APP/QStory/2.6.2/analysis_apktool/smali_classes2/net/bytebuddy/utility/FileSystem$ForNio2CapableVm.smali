.class public Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;
.super Lnet/bytebuddy/utility/FileSystem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/FileSystem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForNio2CapableVm"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;,
        Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;,
        Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final DISPATCHER:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

.field private static final FILES:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

.field private static final STANDARD_COPY_OPTION:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/utility/FileSystem;->access$000(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->DISPATCHER:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 14
    .line 15
    const-class v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 16
    .line 17
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lnet/bytebuddy/utility/FileSystem;->access$000(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 26
    .line 27
    sput-object v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->FILES:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 28
    .line 29
    const-class v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;

    .line 30
    .line 31
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lnet/bytebuddy/utility/FileSystem;->access$000(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;

    .line 40
    .line 41
    sput-object v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->STANDARD_COPY_OPTION:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/FileSystem;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public copy(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    sget-object p0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->STANDARD_COPY_OPTION:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-interface {p0, v0}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;->toArray(I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "REPLACE_EXISTING"

    .line 9
    .line 10
    invoke-interface {p0, v1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;->valueOf(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    sget-object p0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->FILES:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 18
    .line 19
    sget-object v1, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->DISPATCHER:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v1, p2}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p0, p1, p2, v0}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;->copy(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
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
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public link(Ljava/io/File;Ljava/io/File;)V
    .locals 1

    .line 1
    sget-object p0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->FILES:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 2
    .line 3
    sget-object v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->DISPATCHER:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 4
    .line 5
    invoke-interface {v0, p2}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p0, p2}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;->deleteIfExists(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {v0, p1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p2, p1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;->createLink(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public move(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    sget-object p0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->STANDARD_COPY_OPTION:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-interface {p0, v0}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;->toArray(I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "REPLACE_EXISTING"

    .line 9
    .line 10
    invoke-interface {p0, v1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$StandardCopyOption;->valueOf(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    sget-object p0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->FILES:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;

    .line 18
    .line 19
    sget-object v1, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;->DISPATCHER:Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v1, p2}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Dispatcher;->toPath(Ljava/io/File;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p0, p1, p2, v0}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm$Files;->move(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method
