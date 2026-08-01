.class public abstract enum Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassReader$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassReader$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;",
        ">;",
        "Lnet/bytebuddy/utility/AsmClassReader$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

.field private static final ACCESS_CONTROLLER:Z

.field public static final enum ASM_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

.field public static final enum ASM_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

.field public static final enum CLASS_FILE_API_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

.field public static final enum CLASS_FILE_API_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

.field private static final FACTORY:Lnet/bytebuddy/utility/AsmClassReader$Factory;

.field public static final enum IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    const-string v3, "java.security.AccessController"

    .line 5
    .line 6
    invoke-static {v3, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v3, "net.bytebuddy.securitymanager"

    .line 10
    .line 11
    const-string v4, "true"

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sput-boolean v3, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    sput-boolean v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v2, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    new-instance v3, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$1;

    .line 30
    .line 31
    const-string v4, "IMPLICIT"

    .line 32
    .line 33
    invoke-direct {v3, v4, v2}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$1;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v3, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 37
    .line 38
    new-instance v4, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$2;

    .line 39
    .line 40
    const-string v5, "ASM_FIRST"

    .line 41
    .line 42
    invoke-direct {v4, v5, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$2;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v4, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ASM_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 46
    .line 47
    new-instance v5, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$3;

    .line 48
    .line 49
    const-string v6, "CLASS_FILE_API_FIRST"

    .line 50
    .line 51
    const/4 v7, 0x2

    .line 52
    invoke-direct {v5, v6, v7}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$3;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sput-object v5, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->CLASS_FILE_API_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 56
    .line 57
    new-instance v6, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$4;

    .line 58
    .line 59
    const-string v8, "ASM_ONLY"

    .line 60
    .line 61
    const/4 v9, 0x3

    .line 62
    invoke-direct {v6, v8, v9}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$4;-><init>(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    sput-object v6, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ASM_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 66
    .line 67
    new-instance v8, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$5;

    .line 68
    .line 69
    const-string v10, "CLASS_FILE_API_ONLY"

    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    invoke-direct {v8, v10, v11}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$5;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    sput-object v8, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->CLASS_FILE_API_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 76
    .line 77
    const/4 v10, 0x5

    .line 78
    new-array v10, v10, [Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 79
    .line 80
    aput-object v3, v10, v2

    .line 81
    .line 82
    aput-object v4, v10, v0

    .line 83
    .line 84
    aput-object v5, v10, v7

    .line 85
    .line 86
    aput-object v6, v10, v9

    .line 87
    .line 88
    aput-object v8, v10, v11

    .line 89
    .line 90
    sput-object v10, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->$VALUES:[Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 91
    .line 92
    :try_start_1
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 93
    .line 94
    const-string v2, "net.bytebuddy.processor"

    .line 95
    .line 96
    invoke-direct {v0, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    move-object v1, v0

    .line 106
    :catchall_0
    if-nez v1, :cond_0

    .line 107
    .line 108
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ASM_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_0
    invoke-static {v1}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_1
    sput-object v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->FACTORY:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 116
    .line 117
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/utility/AsmClassReader$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic access$100()Lnet/bytebuddy/utility/AsmClassReader$Factory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->FACTORY:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 2
    .line 3
    return-object v0
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
    sget-boolean v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ACCESS_CONTROLLER:Z

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->$VALUES:[Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public make([B)Lnet/bytebuddy/utility/AsmClassReader;
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/OpenedClassReader;->EXPERIMENTAL:Z

    .line 2
    .line 3
    invoke-interface {p0, p1, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([BZ)Lnet/bytebuddy/utility/AsmClassReader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
