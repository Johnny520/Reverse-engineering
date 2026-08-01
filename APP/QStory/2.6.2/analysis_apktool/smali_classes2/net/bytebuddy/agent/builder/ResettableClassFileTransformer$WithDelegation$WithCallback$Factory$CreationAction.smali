.class public final enum Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->$VALUES:[Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->$VALUES:[Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 243
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->run()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;
    .locals 10

    .line 1
    const-string p0, "transform"

    .line 2
    .line 3
    const-string v0, "$ByteBuddy$ModuleSupport"

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$ForJava9CapableVm;

    .line 6
    .line 7
    new-instance v2, Lnet/bytebuddy/ByteBuddy;

    .line 8
    .line 9
    invoke-direct {v2}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 19
    .line 20
    sget-object v4, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 21
    .line 22
    invoke-virtual {v2, v3, v4}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-class v3, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v3, Lnet/bytebuddy/utility/JavaType;->MODULE:Lnet/bytebuddy/utility/JavaType;

    .line 45
    .line 46
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-class v5, Ljava/lang/ClassLoader;

    .line 51
    .line 52
    const-class v6, Ljava/lang/String;

    .line 53
    .line 54
    const-class v7, Ljava/lang/Class;

    .line 55
    .line 56
    const-class v8, Ljava/security/ProtectionDomain;

    .line 57
    .line 58
    const-class v9, [B

    .line 59
    .line 60
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v2, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-class v2, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 77
    .line 78
    const-class v4, Ljava/lang/Object;

    .line 79
    .line 80
    const-class v5, Ljava/lang/ClassLoader;

    .line 81
    .line 82
    const-class v6, Ljava/lang/String;

    .line 83
    .line 84
    const-class v7, Ljava/lang/Class;

    .line 85
    .line 86
    const-class v8, Ljava/security/ProtectionDomain;

    .line 87
    .line 88
    const-class v9, [B

    .line 89
    .line 90
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, p0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "doTransform"

    .line 111
    .line 112
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const-class v4, Ljava/lang/Object;

    .line 117
    .line 118
    const-class v5, Ljava/lang/ClassLoader;

    .line 119
    .line 120
    const-class v6, Ljava/lang/String;

    .line 121
    .line 122
    const-class v7, Ljava/lang/Class;

    .line 123
    .line 124
    const-class v8, Ljava/security/ProtectionDomain;

    .line 125
    .line 126
    const-class v9, [B

    .line 127
    .line 128
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v2, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-class v2, Ljava/lang/instrument/ClassFileTransformer;

    .line 145
    .line 146
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const-class v5, Ljava/lang/ClassLoader;

    .line 151
    .line 152
    const-class v6, Ljava/lang/String;

    .line 153
    .line 154
    const-class v7, Ljava/lang/Class;

    .line 155
    .line 156
    const-class v8, Ljava/security/ProtectionDomain;

    .line 157
    .line 158
    const-class v9, [B

    .line 159
    .line 160
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v2, p0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-string v2, "classFileTransformer"

    .line 173
    .line 174
    invoke-virtual {p0, v2}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 183
    .line 184
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 185
    .line 186
    invoke-virtual {p0, v2, v3}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const-class v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 205
    .line 206
    const-class v3, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v2, v3}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->with(Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-interface {p0, v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    const-class v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 225
    .line 226
    const-class v2, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 227
    .line 228
    filled-new-array {v0, v2}, [Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-direct {v1, p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$ForJava9CapableVm;-><init>(Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    .line 238
    .line 239
    return-object v1

    .line 240
    :catch_0
    sget-object p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$ForLegacyVm;->INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$ForLegacyVm;

    .line 241
    .line 242
    return-object p0
.end method
