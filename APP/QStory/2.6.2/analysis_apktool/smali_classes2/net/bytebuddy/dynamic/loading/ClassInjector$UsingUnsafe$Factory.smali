.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 84
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver$Default;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver$Default;

    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;->access$400()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;->isAvailable()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;->access$400()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    const-string v0, "jdk.internal.misc.Unsafe"

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "theUnsafe"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p1, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;->apply(Ljava/lang/reflect/AccessibleObject;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "defineClass"

    .line 40
    .line 41
    const-class v3, Ljava/lang/String;

    .line 42
    .line 43
    const-class v4, [B

    .line 44
    .line 45
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    const-class v7, Ljava/lang/ClassLoader;

    .line 48
    .line 49
    const-class v8, Ljava/security/ProtectionDomain;

    .line 50
    .line 51
    move-object v6, v5

    .line 52
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;->apply(Ljava/lang/reflect/AccessibleObject;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Enabled;

    .line 64
    .line 65
    invoke-direct {p1, v1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Enabled;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object p1, v0

    .line 71
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Unavailable;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object p1, v0

    .line 81
    :goto_0
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 82
    .line 83
    return-void
.end method

.method public static resolve(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;
    .locals 1

    const/4 v0, 0x0

    .line 244
    invoke-static {p0, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->resolve(Ljava/lang/instrument/Instrumentation;Z)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static resolve(Ljava/lang/instrument/Instrumentation;Z)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;
    .locals 11

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;->isAvailable()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/utility/JavaModule;->isSupported()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    :try_start_0
    const-string v1, "jdk.internal.misc.Unsafe"

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-direct {v2, v3}, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;-><init>(Ljava/lang/Package;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-class v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;

    .line 37
    .line 38
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v5, v2, v1}, Lnet/bytebuddy/utility/JavaModule;->isOpened(Lnet/bytebuddy/description/type/PackageDescription;Lnet/bytebuddy/utility/JavaModule;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 49
    .line 50
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    if-eqz p1, :cond_2

    .line 55
    .line 56
    const-class p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver$Default;

    .line 57
    .line 58
    invoke-static {p1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 67
    .line 68
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    sget-object v9, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 81
    .line 82
    move-object v10, v7

    .line 83
    move-object v4, p0

    .line 84
    invoke-static/range {v4 .. v10}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation;->redefineModule(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/utility/JavaModule;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 88
    .line 89
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>()V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_2
    move-object v4, p0

    .line 94
    new-instance p0, Lnet/bytebuddy/ByteBuddy;

    .line 95
    .line 96
    invoke-direct {p0}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string p1, "apply"

    .line 104
    .line 105
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    const-class p1, Ljava/lang/reflect/AccessibleObject;

    .line 114
    .line 115
    const-string v1, "setAccessible"

    .line 116
    .line 117
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {p1, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-virtual {p1, v1}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p1, v1}, Lnet/bytebuddy/implementation/MethodCall;->with([Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v1, v0}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->with(Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {p0, p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 185
    .line 186
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    sget-object v9, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 199
    .line 200
    move-object v10, v7

    .line 201
    invoke-static/range {v4 .. v10}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation;->redefineModule(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/utility/JavaModule;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 202
    .line 203
    .line 204
    new-instance p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;

    .line 216
    .line 217
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory$AccessResolver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .line 219
    .line 220
    return-object p1

    .line 221
    :catch_0
    move-exception v0

    .line 222
    move-object p0, v0

    .line 223
    new-instance p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 224
    .line 225
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Unavailable;

    .line 226
    .line 227
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-direct {p1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>(Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;)V

    .line 235
    .line 236
    .line 237
    return-object p1

    .line 238
    :cond_3
    :goto_0
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 239
    .line 240
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;-><init>()V

    .line 241
    .line 242
    .line 243
    return-object p0
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;->isAvailable()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public make(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/loading/ClassInjector;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 9
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->make(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassInjector;

    move-result-object p0

    return-object p0
.end method

.method public make(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassInjector;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Factory;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe$Dispatcher$Initializable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
