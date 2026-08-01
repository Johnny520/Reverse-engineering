.class public final enum Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 16
    .line 17
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 199
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->run()Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;
    .locals 13

    .line 1
    const-class p0, Ljava/lang/ref/Reference;

    .line 2
    .line 3
    const-string v0, "clean"

    .line 4
    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-class v3, Ljava/lang/ref/ReferenceQueue;

    .line 10
    .line 11
    const-class v4, Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const-class v5, Ljava/lang/String;

    .line 14
    .line 15
    const-string v6, "register"

    .line 16
    .line 17
    const-class v7, Lnet/bytebuddy/dynamic/Nexus;

    .line 18
    .line 19
    const-string v8, "net.bytebuddy.nexus.disabled"

    .line 20
    .line 21
    invoke-static {v8}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-eqz v8, :cond_0

    .line 26
    .line 27
    new-instance p0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    .line 28
    .line 29
    const-string v0, "Nexus injection was explicitly disabled"

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    :try_start_0
    new-instance v8, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    sget-object v10, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    .line 42
    .line 43
    invoke-direct {v8, v9, v10}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-static {v7}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->read(Ljava/lang/Class;)[B

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-static {v9, v10}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v8, v9}, Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;->inject(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Ljava/lang/Class;

    .line 71
    .line 72
    new-instance v9, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;

    .line 73
    .line 74
    filled-new-array {v5, v4, v3, v2, v1}, [Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v8, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v8, v0, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-direct {v9, v10, v8}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-object v9

    .line 94
    :catch_0
    move-exception v8

    .line 95
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {v9, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 107
    :try_start_2
    const-class v8, Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 108
    .line 109
    invoke-static {v8}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-static {v7}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    if-eqz v8, :cond_1

    .line 118
    .line 119
    invoke-virtual {v8, v9}, Lnet/bytebuddy/utility/JavaModule;->canRead(Lnet/bytebuddy/utility/JavaModule;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-nez v10, :cond_1

    .line 124
    .line 125
    const-string v10, "java.lang.Module"

    .line 126
    .line 127
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    const-string v11, "addReads"

    .line 132
    .line 133
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-virtual {v8}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v9}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-virtual {v10, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_1
    new-instance v8, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;

    .line 157
    .line 158
    filled-new-array {v5, v4, v3, v2, v1}, [Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v7, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v7, v0, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-direct {v8, v1, p0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 175
    .line 176
    .line 177
    return-object v8

    .line 178
    :catch_1
    move-exception p0

    .line 179
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :catch_2
    new-instance p0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    .line 190
    .line 191
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object p0
.end method
