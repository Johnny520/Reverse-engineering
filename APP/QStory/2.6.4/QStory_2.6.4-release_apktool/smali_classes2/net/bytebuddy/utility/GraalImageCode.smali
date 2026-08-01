.class public final enum Lnet/bytebuddy/utility/GraalImageCode;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/GraalImageCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/GraalImageCode;

.field private static final ACCESS_CONTROLLER:Z

.field public static final enum AGENT:Lnet/bytebuddy/utility/GraalImageCode;

.field public static final enum BUILD:Lnet/bytebuddy/utility/GraalImageCode;

.field public static final enum NONE:Lnet/bytebuddy/utility/GraalImageCode;

.field public static final REPRODUCIBLE_PROPERTIES:Ljava/lang/String; = "net.bytebuddy.reproducible"

.field public static final enum RUNTIME:Lnet/bytebuddy/utility/GraalImageCode;

.field private static final SORTED:Z

.field public static final enum UNKNOWN:Lnet/bytebuddy/utility/GraalImageCode;

.field private static current:Lnet/bytebuddy/utility/GraalImageCode;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# instance fields
.field private final defined:Z

.field private final nativeImageExecution:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-string v2, "java.security.AccessController"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v2, "net.bytebuddy.securitymanager"

    .line 10
    .line 11
    const-string v3, "true"

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sput-boolean v2, Lnet/bytebuddy/utility/GraalImageCode;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    sput-boolean v0, Lnet/bytebuddy/utility/GraalImageCode;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v1, Lnet/bytebuddy/utility/GraalImageCode;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    new-instance v2, Lnet/bytebuddy/utility/GraalImageCode;

    .line 30
    .line 31
    const-string v3, "AGENT"

    .line 32
    .line 33
    invoke-direct {v2, v3, v1, v0, v1}, Lnet/bytebuddy/utility/GraalImageCode;-><init>(Ljava/lang/String;IZZ)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lnet/bytebuddy/utility/GraalImageCode;->AGENT:Lnet/bytebuddy/utility/GraalImageCode;

    .line 37
    .line 38
    new-instance v3, Lnet/bytebuddy/utility/GraalImageCode;

    .line 39
    .line 40
    const-string v4, "BUILD"

    .line 41
    .line 42
    invoke-direct {v3, v4, v0, v0, v1}, Lnet/bytebuddy/utility/GraalImageCode;-><init>(Ljava/lang/String;IZZ)V

    .line 43
    .line 44
    .line 45
    sput-object v3, Lnet/bytebuddy/utility/GraalImageCode;->BUILD:Lnet/bytebuddy/utility/GraalImageCode;

    .line 46
    .line 47
    new-instance v4, Lnet/bytebuddy/utility/GraalImageCode;

    .line 48
    .line 49
    const-string v5, "RUNTIME"

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    invoke-direct {v4, v5, v6, v0, v0}, Lnet/bytebuddy/utility/GraalImageCode;-><init>(Ljava/lang/String;IZZ)V

    .line 53
    .line 54
    .line 55
    sput-object v4, Lnet/bytebuddy/utility/GraalImageCode;->RUNTIME:Lnet/bytebuddy/utility/GraalImageCode;

    .line 56
    .line 57
    new-instance v0, Lnet/bytebuddy/utility/GraalImageCode;

    .line 58
    .line 59
    const-string v5, "UNKNOWN"

    .line 60
    .line 61
    const/4 v6, 0x3

    .line 62
    invoke-direct {v0, v5, v6, v1, v1}, Lnet/bytebuddy/utility/GraalImageCode;-><init>(Ljava/lang/String;IZZ)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lnet/bytebuddy/utility/GraalImageCode;->UNKNOWN:Lnet/bytebuddy/utility/GraalImageCode;

    .line 66
    .line 67
    new-instance v5, Lnet/bytebuddy/utility/GraalImageCode;

    .line 68
    .line 69
    const-string v6, "NONE"

    .line 70
    .line 71
    const/4 v7, 0x4

    .line 72
    invoke-direct {v5, v6, v7, v1, v1}, Lnet/bytebuddy/utility/GraalImageCode;-><init>(Ljava/lang/String;IZZ)V

    .line 73
    .line 74
    .line 75
    sput-object v5, Lnet/bytebuddy/utility/GraalImageCode;->NONE:Lnet/bytebuddy/utility/GraalImageCode;

    .line 76
    .line 77
    filled-new-array {v2, v3, v4, v0, v5}, [Lnet/bytebuddy/utility/GraalImageCode;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lnet/bytebuddy/utility/GraalImageCode;->$VALUES:[Lnet/bytebuddy/utility/GraalImageCode;

    .line 82
    .line 83
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 84
    .line 85
    const-string v1, "net.bytebuddy.reproducible"

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lnet/bytebuddy/utility/GraalImageCode;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sput-boolean v0, Lnet/bytebuddy/utility/GraalImageCode;->SORTED:Z

    .line 101
    .line 102
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/utility/GraalImageCode;->defined:Z

    .line 5
    .line 6
    iput-boolean p4, p0, Lnet/bytebuddy/utility/GraalImageCode;->nativeImageExecution:Z

    .line 7
    .line 8
    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/GraalImageCode;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static getCurrent()Lnet/bytebuddy/utility/GraalImageCode;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->current:Lnet/bytebuddy/utility/GraalImageCode;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 6
    .line 7
    const-string v1, "org.graalvm.nativeimage.imagecode"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lnet/bytebuddy/utility/GraalImageCode;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 21
    .line 22
    const-string v1, "java.vm.vendor"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lnet/bytebuddy/utility/GraalImageCode;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "graalvm"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->INSTANCE:Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 50
    .line 51
    invoke-static {v0}, Lnet/bytebuddy/utility/GraalImageCode;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lnet/bytebuddy/utility/GraalImageCode;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->NONE:Lnet/bytebuddy/utility/GraalImageCode;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string v1, "agent"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->AGENT:Lnet/bytebuddy/utility/GraalImageCode;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-string v1, "runtime"

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->RUNTIME:Lnet/bytebuddy/utility/GraalImageCode;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    const-string v1, "buildtime"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->BUILD:Lnet/bytebuddy/utility/GraalImageCode;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->UNKNOWN:Lnet/bytebuddy/utility/GraalImageCode;

    .line 95
    .line 96
    :goto_0
    sput-object v0, Lnet/bytebuddy/utility/GraalImageCode;->current:Lnet/bytebuddy/utility/GraalImageCode;

    .line 97
    .line 98
    :cond_5
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/GraalImageCode;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/GraalImageCode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/GraalImageCode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/GraalImageCode;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode;->$VALUES:[Lnet/bytebuddy/utility/GraalImageCode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/GraalImageCode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/GraalImageCode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isDefined()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/utility/GraalImageCode;->defined:Z

    .line 2
    .line 3
    return p0
.end method

.method public isNativeImageExecution()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/utility/GraalImageCode;->nativeImageExecution:Z

    .line 2
    .line 3
    return p0
.end method

.method public sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/Comparator<",
            "-TT;>;)[TT;"
        }
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/GraalImageCode;->SORTED:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lnet/bytebuddy/utility/GraalImageCode;->defined:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p1

    .line 11
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method
