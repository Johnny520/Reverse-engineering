.class public final enum Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public run()Ljava/lang/ClassLoader;
    .locals 15
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    const-class p0, Ljava/net/URI;

    .line 2
    .line 3
    const-class v0, Ljava/util/Map;

    .line 4
    .line 5
    const-string v1, "open"

    .line 6
    .line 7
    const-string v2, "types"

    .line 8
    .line 9
    const-class v3, Ljava/lang/String;

    .line 10
    .line 11
    const-class v4, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$AbstractModuleReader;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    :try_start_0
    new-instance v6, Lnet/bytebuddy/ByteBuddy;

    .line 15
    .line 16
    invoke-direct {v6}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 20
    .line 21
    invoke-virtual {v6, v4, v7}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const-string v8, "java.lang.module.ModuleReader"

    .line 26
    .line 27
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const/4 v9, 0x1

    .line 32
    new-array v10, v9, [Ljava/lang/reflect/Type;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    aput-object v8, v10, v11

    .line 36
    .line 37
    invoke-interface {v7, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const-string v8, "net.bytebuddy.dynamic.loading.SimpleModuleReader"

    .line 42
    .line 43
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    invoke-static {v10}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-interface {v8, v10}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const-string v8, "doOpen"

    .line 68
    .line 69
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v4, v8, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-static {v8}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v8}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    sget-object v10, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 86
    .line 87
    sget-object v12, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 88
    .line 89
    invoke-virtual {v8, v10, v12}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const-string v8, "list"

    .line 98
    .line 99
    invoke-static {v8}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-interface {v8, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    const-string v8, "doList"

    .line 116
    .line 117
    invoke-virtual {v4, v8, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-static {v8}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v8}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v8, v10, v12}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-string v8, "find"

    .line 138
    .line 139
    invoke-static {v8}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    invoke-static {v13}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-interface {v8, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-interface {v7, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    const-string v8, "doFind"

    .line 160
    .line 161
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v4, v8, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {v3}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3, v10, v12}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-interface {v7, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const-string v4, "java.lang.module.ModuleDescriptor"

    .line 190
    .line 191
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    const-string v7, "java.lang.module.ModuleReference"

    .line 196
    .line 197
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    sget-object v8, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 202
    .line 203
    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    const-string v8, "net.bytebuddy.dynamic.loading.SimpleModuleReference"

    .line 208
    .line 209
    invoke-interface {v6, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    const/4 v8, 0x2

    .line 214
    new-array v13, v8, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 215
    .line 216
    sget-object v14, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 217
    .line 218
    aput-object v14, v13, v11

    .line 219
    .line 220
    sget-object v14, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 221
    .line 222
    aput-object v14, v13, v9

    .line 223
    .line 224
    invoke-interface {v6, v2, v0, v13}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    new-array v13, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 229
    .line 230
    sget-object v14, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 231
    .line 232
    aput-object v14, v13, v11

    .line 233
    .line 234
    invoke-interface {v6, v13}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    const/4 v13, 0x3

    .line 239
    new-array v13, v13, [Ljava/lang/reflect/Type;

    .line 240
    .line 241
    aput-object v4, v13, v11

    .line 242
    .line 243
    aput-object p0, v13, v9

    .line 244
    .line 245
    aput-object v0, v13, v8

    .line 246
    .line 247
    invoke-interface {v6, v13}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    filled-new-array {v4, p0}, [Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-virtual {v7, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onSuper()Lnet/bytebuddy/implementation/MethodCall;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    filled-new-array {v11, v9}, [I

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {p0, v4}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-static {v2}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-interface {v4, v8}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {p0, v4}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 316
    .line 317
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 322
    .line 323
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    filled-new-array {v2}, [Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/MethodCall;->withField([Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0, v10, v12}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    new-array v0, v9, [Lnet/bytebuddy/dynamic/DynamicType;

    .line 348
    .line 349
    aput-object v3, v0, v11

    .line 350
    .line 351
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->include([Lnet/bytebuddy/dynamic/DynamicType;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;

    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 370
    .line 371
    .line 372
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    return-object p0

    .line 374
    :catch_0
    return-object v5
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 375
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference$CreationAction;->run()Ljava/lang/ClassLoader;

    move-result-object p0

    return-object p0
.end method
