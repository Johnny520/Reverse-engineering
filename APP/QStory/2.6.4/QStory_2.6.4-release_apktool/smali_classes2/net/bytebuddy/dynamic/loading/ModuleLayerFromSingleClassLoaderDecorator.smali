.class public Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleFinder;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;,
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final CONFIGURATION:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

.field private static final MODULE_DESCRIPTOR:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

.field private static final MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

.field private static final MODULE_LAYER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

.field private static final MODULE_LAYER_CONTROLLER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

.field private static final OPTIONAL:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

.field private static final PATH:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

.field private static final SIMPLE_MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

.field private static final SIMPLE_MODULE_REFERENCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

.field private static final STREAM:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;


# instance fields
.field private final classLoader:Ljava/lang/ClassLoader;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final moduleLayer:Ljava/lang/Object;

.field private final name:Ljava/lang/String;

.field private final packages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


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
    sput-boolean v1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

    .line 39
    .line 40
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 41
    .line 42
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 51
    .line 52
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_DESCRIPTOR:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 53
    .line 54
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 55
    .line 56
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 65
    .line 66
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_LAYER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 67
    .line 68
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

    .line 69
    .line 70
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

    .line 79
    .line 80
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_LAYER_CONTROLLER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

    .line 81
    .line 82
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

    .line 83
    .line 84
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

    .line 93
    .line 94
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->CONFIGURATION:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

    .line 95
    .line 96
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 97
    .line 98
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 107
    .line 108
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->OPTIONAL:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 109
    .line 110
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;

    .line 111
    .line 112
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;

    .line 121
    .line 122
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->STREAM:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;

    .line 123
    .line 124
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

    .line 125
    .line 126
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

    .line 135
    .line 136
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->PATH:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

    .line 137
    .line 138
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 139
    .line 140
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/lang/ClassLoader;

    .line 145
    .line 146
    const-class v1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

    .line 147
    .line 148
    invoke-static {v1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

    .line 157
    .line 158
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->SIMPLE_MODULE_REFERENCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

    .line 159
    .line 160
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder$CreationAction;

    .line 161
    .line 162
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/lang/ClassLoader;

    .line 167
    .line 168
    const-class v1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

    .line 169
    .line 170
    invoke-static {v1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

    .line 179
    .line 180
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->SIMPLE_MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

    .line 181
    .line 182
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->classLoader:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->moduleLayer:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->name:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->packages:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_DESCRIPTOR:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_LAYER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->SIMPLE_MODULE_REFERENCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$300()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->SIMPLE_MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$400()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->PATH:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$500()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_FINDER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$600()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->CONFIGURATION:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$700()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_LAYER_CONTROLLER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$800()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->OPTIONAL:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Optional;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$900()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->STREAM:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Stream;

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

    .line 1
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->ACCESS_CONTROLLER:Z

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


# virtual methods
.method public apply(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/ClassLoader;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getPackage()Lnet/bytebuddy/description/type/PackageDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->packages:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->MODULE_LAYER:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 21
    .line 22
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->moduleLayer:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p1, v0, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;->findLoader(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->classLoader:Ljava/lang/ClassLoader;

    .line 32
    .line 33
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->classLoader:Ljava/lang/ClassLoader;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->classLoader:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_6

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    if-eqz v2, :cond_6

    .line 49
    .line 50
    :cond_5
    return v1

    .line 51
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->moduleLayer:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->moduleLayer:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_7

    .line 60
    .line 61
    return v1

    .line 62
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->packages:Ljava/util/Set;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->packages:Ljava/util/Set;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_8

    .line 71
    .line 72
    return v1

    .line 73
    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->classLoader:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v0, v2

    .line 21
    :cond_0
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->moduleLayer:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->name:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->packages:Ljava/util/Set;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public isSkipped(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->isModuleType()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
