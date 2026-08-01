.class public Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LambdaInstanceFactory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$BridgeMethodImplementation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$FactoryImplementation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$ConstructorImplementation;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final FIELD_PREFIX:Ljava/lang/String; = "arg$"

.field private static final LAMBDA_FACTORY:Ljava/lang/String; = "get$Lambda"

.field private static final LAMBDA_NAME_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final LAMBDA_TYPE_INFIX:Ljava/lang/String; = "$$Lambda$ByteBuddy$"

.field private static final NOT_PREVIOUSLY_DEFINED:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final byteBuddy:Lnet/bytebuddy/ByteBuddy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->LAMBDA_NAME_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 5
    .line 6
    return-void
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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public make(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/util/List;Ljava/util/List;Ljava/util/Collection;)[B
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/instrument/ClassFileTransformer;",
            ">;)[B"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    move-object/from16 v3, p5

    .line 14
    .line 15
    invoke-static {v3, v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofLoaded(Ljava/lang/Object;Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static/range {p6 .. p6}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->lookupType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v6, "$$Lambda$ByteBuddy$"

    .line 40
    .line 41
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    sget-object v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->LAMBDA_NAME_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    move-object/from16 v2, p0

    .line 58
    .line 59
    iget-object v2, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 60
    .line 61
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    sget-object v9, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 66
    .line 67
    invoke-virtual {v2, v6, v9}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sget-object v6, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 72
    .line 73
    const/4 v9, 0x2

    .line 74
    new-array v10, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 75
    .line 76
    sget-object v11, Lnet/bytebuddy/description/modifier/TypeManifestation;->FINAL:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    aput-object v11, v10, v12

    .line 80
    .line 81
    const/4 v11, 0x1

    .line 82
    aput-object v6, v10, v11

    .line 83
    .line 84
    invoke-interface {v2, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v2, v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-array v10, v11, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 97
    .line 98
    aput-object v6, v10, v12

    .line 99
    .line 100
    invoke-interface {v2, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sget-object v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$ConstructorImplementation;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$ConstructorImplementation;

    .line 113
    .line 114
    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static/range {p2 .. p2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-static {v10}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-interface {v6, v10}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-static {v10}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-interface {v6, v10}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    new-instance v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation;

    .line 151
    .line 152
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-direct {v6, v10, v5, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$LambdaMethodImplementation;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    move v6, v12

    .line 172
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_0

    .line 177
    .line 178
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Lnet/bytebuddy/description/type/TypeDescription;

    .line 183
    .line 184
    new-instance v13, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v14, "arg$"

    .line 187
    .line 188
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    add-int/2addr v6, v11

    .line 192
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    new-array v14, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 200
    .line 201
    sget-object v15, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 202
    .line 203
    aput-object v15, v14, v12

    .line 204
    .line 205
    sget-object v15, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 206
    .line 207
    aput-object v15, v14, v11

    .line 208
    .line 209
    invoke-interface {v2, v13, v10, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    goto :goto_0

    .line 214
    :cond_0
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_1

    .line 223
    .line 224
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    new-array v6, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 229
    .line 230
    sget-object v10, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 231
    .line 232
    aput-object v10, v6, v12

    .line 233
    .line 234
    sget-object v10, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 235
    .line 236
    aput-object v10, v6, v11

    .line 237
    .line 238
    const-string v10, "get$Lambda"

    .line 239
    .line 240
    invoke-interface {v2, v10, v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    sget-object v3, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$FactoryImplementation;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$FactoryImplementation;

    .line 253
    .line 254
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    :cond_1
    const-class v3, Ljava/io/Serializable;

    .line 259
    .line 260
    if-eqz p7, :cond_3

    .line 261
    .line 262
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_2

    .line 267
    .line 268
    new-array v0, v11, [Ljava/lang/reflect/Type;

    .line 269
    .line 270
    aput-object v3, v0, v12

    .line 271
    .line 272
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    :cond_2
    new-array v0, v11, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 277
    .line 278
    sget-object v3, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 279
    .line 280
    aput-object v3, v0, v12

    .line 281
    .line 282
    const-string v3, "writeReplace"

    .line 283
    .line 284
    const-class v6, Ljava/lang/Object;

    .line 285
    .line 286
    invoke-interface {v2, v3, v6, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;

    .line 291
    .line 292
    move-object v6, v1

    .line 293
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static/range {p6 .. p6}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    move-object/from16 v3, p2

    .line 306
    .line 307
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;)V

    .line 308
    .line 309
    .line 310
    move-object v1, v0

    .line 311
    move-object v0, v3

    .line 312
    invoke-interface {v10, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    goto :goto_1

    .line 317
    :cond_3
    move-object/from16 v0, p2

    .line 318
    .line 319
    move-object v6, v1

    .line 320
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-interface {v1, v3}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_4

    .line 329
    .line 330
    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 331
    .line 332
    new-array v3, v11, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 333
    .line 334
    aput-object v1, v3, v12

    .line 335
    .line 336
    const-string v5, "readObject"

    .line 337
    .line 338
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 339
    .line 340
    invoke-interface {v2, v5, v6, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    new-array v3, v11, [Ljava/lang/reflect/Type;

    .line 345
    .line 346
    const-class v5, Ljava/io/ObjectInputStream;

    .line 347
    .line 348
    aput-object v5, v3, v12

    .line 349
    .line 350
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    new-array v3, v11, [Ljava/lang/reflect/Type;

    .line 355
    .line 356
    const-class v5, Ljava/io/NotSerializableException;

    .line 357
    .line 358
    aput-object v5, v3, v12

    .line 359
    .line 360
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;->throwing([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const-string v3, "Non-serializable lambda"

    .line 365
    .line 366
    invoke-static {v5, v3}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/implementation/Implementation;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    invoke-interface {v2, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    new-array v10, v11, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 375
    .line 376
    aput-object v1, v10, v12

    .line 377
    .line 378
    const-string v1, "writeObject"

    .line 379
    .line 380
    invoke-interface {v2, v1, v6, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    new-array v2, v11, [Ljava/lang/reflect/Type;

    .line 385
    .line 386
    const-class v6, Ljava/io/ObjectOutputStream;

    .line 387
    .line 388
    aput-object v6, v2, v12

    .line 389
    .line 390
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    new-array v2, v11, [Ljava/lang/reflect/Type;

    .line 395
    .line 396
    aput-object v5, v2, v12

    .line 397
    .line 398
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;->throwing([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-static {v5, v3}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;Ljava/lang/String;)Lnet/bytebuddy/implementation/Implementation;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    :cond_4
    :goto_1
    invoke-interface/range {p9 .. p9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-eqz v3, :cond_5

    .line 419
    .line 420
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-static {v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    new-array v6, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 433
    .line 434
    sget-object v10, Lnet/bytebuddy/description/modifier/MethodManifestation;->BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 435
    .line 436
    aput-object v10, v6, v12

    .line 437
    .line 438
    sget-object v10, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 439
    .line 440
    aput-object v10, v6, v11

    .line 441
    .line 442
    invoke-interface {v2, v0, v5, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    new-instance v3, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$BridgeMethodImplementation;

    .line 455
    .line 456
    invoke-direct {v3, v0, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$BridgeMethodImplementation;-><init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    goto :goto_2

    .line 464
    :cond_5
    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType;->getBytes()[B

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-interface/range {p10 .. p10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_7

    .line 481
    .line 482
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    check-cast v2, Ljava/lang/instrument/ClassFileTransformer;

    .line 487
    .line 488
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    const/16 v4, 0x2e

    .line 493
    .line 494
    const/16 v5, 0x2f

    .line 495
    .line 496
    invoke-virtual {v8, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    sget-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;->NOT_PREVIOUSLY_DEFINED:Ljava/lang/Class;

    .line 501
    .line 502
    invoke-virtual {v7}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 503
    .line 504
    .line 505
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 506
    move-object/from16 p5, v0

    .line 507
    .line 508
    move-object/from16 p0, v2

    .line 509
    .line 510
    move-object/from16 p1, v3

    .line 511
    .line 512
    move-object/from16 p2, v4

    .line 513
    .line 514
    move-object/from16 p3, v5

    .line 515
    .line 516
    move-object/from16 p4, v6

    .line 517
    .line 518
    :try_start_1
    invoke-interface/range {p0 .. p5}, Ljava/lang/instrument/ClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 519
    .line 520
    .line 521
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 522
    move-object/from16 v2, p5

    .line 523
    .line 524
    if-nez v0, :cond_6

    .line 525
    .line 526
    :goto_4
    move-object v0, v2

    .line 527
    goto :goto_3

    .line 528
    :catchall_0
    move-object/from16 v2, p5

    .line 529
    .line 530
    goto :goto_4

    .line 531
    :catchall_1
    move-object v2, v0

    .line 532
    goto :goto_4

    .line 533
    :cond_7
    move-object v2, v0

    .line 534
    return-object v2
.end method
