.class public Lnet/bytebuddy/utility/OpenedClassReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassReader$Factory;


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field public static final ASM_API:I

.field public static final EXPERIMENTAL:Z

.field public static final EXPERIMENTAL_PROPERTY:Ljava/lang/String; = "net.bytebuddy.experimental"

.field public static final PROCESSOR_PROPERTY:Ljava/lang/String; = "net.bytebuddy.processor"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/utility/OpenedClassReader;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v1, 0x1

    .line 24
    sput-boolean v1, Lnet/bytebuddy/utility/OpenedClassReader;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/OpenedClassReader;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    :try_start_1
    new-instance v1, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 30
    .line 31
    const-string v2, "net.bytebuddy.experimental"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lnet/bytebuddy/utility/OpenedClassReader;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 46
    :catch_2
    sput-boolean v0, Lnet/bytebuddy/utility/OpenedClassReader;->EXPERIMENTAL:Z

    .line 47
    .line 48
    const/high16 v0, 0x90000

    .line 49
    .line 50
    sput v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
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

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/OpenedClassReader;->ACCESS_CONTROLLER:Z

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

.method public static of([B)Lnet/bytebuddy/jar/asm/ClassReader;
    .locals 1

    .line 128
    sget-boolean v0, Lnet/bytebuddy/utility/OpenedClassReader;->EXPERIMENTAL:Z

    invoke-static {p0, v0}, Lnet/bytebuddy/utility/OpenedClassReader;->of([BZ)Lnet/bytebuddy/jar/asm/ClassReader;

    move-result-object p0

    return-object p0
.end method

.method public static of([BZ)Lnet/bytebuddy/jar/asm/ClassReader;
    .locals 6

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/ClassFileVersion;->ofClassFile([B)Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->latest()Lnet/bytebuddy/ClassFileVersion;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/ClassFileVersion;->isGreaterThan(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    ushr-int/lit8 p1, p1, 0x8

    .line 22
    .line 23
    int-to-byte p1, p1

    .line 24
    const/4 v2, 0x4

    .line 25
    aput-byte p1, p0, v2

    .line 26
    .line 27
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-byte p1, p1

    .line 32
    const/4 v3, 0x5

    .line 33
    aput-byte p1, p0, v3

    .line 34
    .line 35
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    ushr-int/lit8 p1, p1, 0x8

    .line 40
    .line 41
    int-to-byte p1, p1

    .line 42
    const/4 v4, 0x6

    .line 43
    aput-byte p1, p0, v4

    .line 44
    .line 45
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-byte p1, p1

    .line 50
    const/4 v1, 0x7

    .line 51
    aput-byte p1, p0, v1

    .line 52
    .line 53
    new-instance p1, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    ushr-int/lit8 v5, v5, 0x8

    .line 63
    .line 64
    int-to-byte v5, v5

    .line 65
    aput-byte v5, p0, v2

    .line 66
    .line 67
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    int-to-byte v2, v2

    .line 72
    aput-byte v2, p0, v3

    .line 73
    .line 74
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    ushr-int/lit8 v2, v2, 0x8

    .line 79
    .line 80
    int-to-byte v2, v2

    .line 81
    aput-byte v2, p0, v4

    .line 82
    .line 83
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    int-to-byte v0, v0

    .line 88
    aput-byte v0, p0, v1

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    new-instance p1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, " is not supported by the current version of Byte Buddy which officially supports "

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, " - update Byte Buddy or set net.bytebuddy.experimental as a VM property"

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_1
    new-instance p1, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 123
    .line 124
    invoke-direct {p1, p0}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([B)V

    .line 125
    .line 126
    .line 127
    return-object p1
.end method


# virtual methods
.method public make([B)Lnet/bytebuddy/utility/AsmClassReader;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;

    .line 2
    .line 3
    invoke-static {p1}, Lnet/bytebuddy/utility/OpenedClassReader;->of([B)Lnet/bytebuddy/jar/asm/ClassReader;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public make([BZ)Lnet/bytebuddy/utility/AsmClassReader;
    .locals 0

    .line 11
    new-instance p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;

    invoke-static {p1, p2}, Lnet/bytebuddy/utility/OpenedClassReader;->of([BZ)Lnet/bytebuddy/jar/asm/ClassReader;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;)V

    return-object p0
.end method
