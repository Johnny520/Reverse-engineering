.class public Lnet/bytebuddy/ByteBuddy;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;,
        Lnet/bytebuddy/ByteBuddy$RecordConstructorStrategy;,
        Lnet/bytebuddy/ByteBuddy$EnumerationImplementation;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final BYTE_BUDDY_DEFAULT_CONTEXT_NAME:Ljava/lang/String; = "synthetic"

.field private static final BYTE_BUDDY_DEFAULT_PREFIX:Ljava/lang/String; = "ByteBuddy"

.field private static final BYTE_BUDDY_DEFAULT_SUFFIX:Ljava/lang/String; = "auxiliary"

.field private static final DEFAULT_AUXILIARY_NAMING_STRATEGY:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private static final DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY:Lnet/bytebuddy/implementation/Implementation$Context$Factory;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field public static final DEFAULT_NAMING_PROPERTY:Ljava/lang/String; = "net.bytebuddy.naming"

.field private static final DEFAULT_NAMING_STRATEGY:Lnet/bytebuddy/NamingStrategy;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private static final DEFAULT_TYPE_VALIDATION:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

.field public static final DEFAULT_VALIDATION_PROPERTY:Ljava/lang/String; = "net.bytebuddy.validation"


# instance fields
.field protected final annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

.field protected final annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

.field protected final auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

.field protected final classFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field protected final classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

.field protected final classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

.field protected final ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

.field protected final instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

.field protected final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field protected final namingStrategy:Lnet/bytebuddy/NamingStrategy;

.field protected final typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

.field protected final visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-string v2, "java.security.AccessController"

    .line 4
    .line 5
    invoke-static {v2, v0, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v3, "true"

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sput-boolean v2, Lnet/bytebuddy/ByteBuddy;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/ByteBuddy;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    :try_start_1
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 27
    .line 28
    const-string v2, "net.bytebuddy.validation"

    .line 29
    .line 30
    invoke-direct {v0, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lnet/bytebuddy/ByteBuddy;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-object v0, v1

    .line 41
    :goto_1
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->ENABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 54
    .line 55
    :goto_3
    sput-object v0, Lnet/bytebuddy/ByteBuddy;->DEFAULT_TYPE_VALIDATION:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 56
    .line 57
    :try_start_2
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 58
    .line 59
    const-string v2, "net.bytebuddy.naming"

    .line 60
    .line 61
    invoke-direct {v0, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lnet/bytebuddy/ByteBuddy;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :catchall_1
    move-object v0, v1

    .line 72
    :goto_4
    const-string v2, "synthetic"

    .line 73
    .line 74
    const-string v3, "auxiliary"

    .line 75
    .line 76
    const-string v4, "net.bytebuddy.renamed"

    .line 77
    .line 78
    const-string v5, "ByteBuddy"

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lnet/bytebuddy/utility/GraalImageCode;->isDefined()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-instance v1, Lnet/bytebuddy/NamingStrategy$Suffixing;

    .line 93
    .line 94
    new-instance v0, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix;

    .line 95
    .line 96
    sget-object v6, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;->INSTANCE:Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;

    .line 97
    .line 98
    invoke-direct {v0, v6}, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix;-><init>(Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v5, v0, v4}, Lnet/bytebuddy/NamingStrategy$Suffixing;-><init>(Ljava/lang/String;Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;

    .line 105
    .line 106
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v3, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;

    .line 110
    .line 111
    invoke-direct {v3, v2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_2
    move-object v0, v1

    .line 116
    move-object v3, v0

    .line 117
    goto :goto_5

    .line 118
    :cond_3
    const-string v1, "fixed"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    new-instance v1, Lnet/bytebuddy/NamingStrategy$Suffixing;

    .line 127
    .line 128
    sget-object v0, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;->INSTANCE:Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;

    .line 129
    .line 130
    invoke-direct {v1, v5, v0, v4}, Lnet/bytebuddy/NamingStrategy$Suffixing;-><init>(Ljava/lang/String;Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;

    .line 134
    .line 135
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;

    .line 139
    .line 140
    invoke-direct {v3, v2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_4
    const-string v1, "caller"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    new-instance v1, Lnet/bytebuddy/NamingStrategy$Suffixing;

    .line 153
    .line 154
    new-instance v0, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix;

    .line 155
    .line 156
    sget-object v6, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;->INSTANCE:Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;

    .line 157
    .line 158
    invoke-direct {v0, v6}, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix;-><init>(Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;)V

    .line 159
    .line 160
    .line 161
    invoke-direct {v1, v5, v0, v4}, Lnet/bytebuddy/NamingStrategy$Suffixing;-><init>(Ljava/lang/String;Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;

    .line 165
    .line 166
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    new-instance v3, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;

    .line 170
    .line 171
    invoke-direct {v3, v2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_5
    :try_start_3
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 179
    new-instance v6, Lnet/bytebuddy/NamingStrategy$SuffixingRandom;

    .line 180
    .line 181
    sget-object v7, Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;->INSTANCE:Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType;

    .line 182
    .line 183
    new-instance v8, Lnet/bytebuddy/utility/RandomString;

    .line 184
    .line 185
    new-instance v9, Ljava/util/Random;

    .line 186
    .line 187
    invoke-direct {v9, v0, v1}, Ljava/util/Random;-><init>(J)V

    .line 188
    .line 189
    .line 190
    const/16 v0, 0x8

    .line 191
    .line 192
    invoke-direct {v8, v0, v9}, Lnet/bytebuddy/utility/RandomString;-><init>(ILjava/util/Random;)V

    .line 193
    .line 194
    .line 195
    invoke-direct {v6, v5, v7, v4, v8}, Lnet/bytebuddy/NamingStrategy$SuffixingRandom;-><init>(Ljava/lang/String;Lnet/bytebuddy/NamingStrategy$Suffixing$BaseNameResolver;Ljava/lang/String;Lnet/bytebuddy/utility/RandomString;)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;

    .line 199
    .line 200
    invoke-direct {v1, v3}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$Suffixing;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;

    .line 204
    .line 205
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory$WithFixedSuffix;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    move-object v3, v0

    .line 209
    move-object v0, v1

    .line 210
    move-object v1, v6

    .line 211
    :goto_5
    sput-object v1, Lnet/bytebuddy/ByteBuddy;->DEFAULT_NAMING_STRATEGY:Lnet/bytebuddy/NamingStrategy;

    .line 212
    .line 213
    sput-object v0, Lnet/bytebuddy/ByteBuddy;->DEFAULT_AUXILIARY_NAMING_STRATEGY:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 214
    .line 215
    sput-object v3, Lnet/bytebuddy/ByteBuddy;->DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 216
    .line 217
    return-void

    .line 218
    :catch_2
    const-string v1, "\'net.bytebuddy.naming\' is set to an unknown, non-numeric value: "

    .line 219
    .line 220
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 73
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ClassFileVersion;)V
    .locals 16

    .line 1
    sget-object v0, Lnet/bytebuddy/ByteBuddy;->DEFAULT_NAMING_STRATEGY:Lnet/bytebuddy/NamingStrategy;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/NamingStrategy$SuffixingRandom;

    .line 6
    .line 7
    const-string v1, "ByteBuddy"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lnet/bytebuddy/NamingStrategy$SuffixingRandom;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    move-object v4, v0

    .line 13
    sget-object v0, Lnet/bytebuddy/ByteBuddy;->DEFAULT_AUXILIARY_NAMING_STRATEGY:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$SuffixingRandom;

    .line 18
    .line 19
    const-string v1, "auxiliary"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy$SuffixingRandom;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    move-object v5, v0

    .line 25
    sget-object v6, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;->APPEND_DEFAULTS:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;

    .line 26
    .line 27
    sget-object v7, Lnet/bytebuddy/implementation/attribute/AnnotationRetention;->ENABLED:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 28
    .line 29
    sget-object v0, Lnet/bytebuddy/ByteBuddy;->DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory;->INSTANCE:Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory;

    .line 34
    .line 35
    :cond_2
    move-object v8, v0

    .line 36
    sget-object v9, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->DEFAULT:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 37
    .line 38
    sget-object v10, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;->MODIFIABLE:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;

    .line 39
    .line 40
    sget-object v11, Lnet/bytebuddy/ByteBuddy;->DEFAULT_TYPE_VALIDATION:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 41
    .line 42
    sget-object v12, Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy$Default;->ALWAYS:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy$Default;

    .line 43
    .line 44
    sget-object v13, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 45
    .line 46
    sget-object v14, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;

    .line 47
    .line 48
    new-instance v15, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;

    .line 49
    .line 50
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSynthetic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isDefaultFinalizer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {v15, v0}, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v2, p0

    .line 66
    .line 67
    move-object/from16 v3, p1

    .line 68
    .line 69
    invoke-direct/range {v2 .. v15}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/NamingStrategy;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)V"
        }
    .end annotation

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 76
    iput-object p2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 77
    iput-object p3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 78
    iput-object p4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 79
    iput-object p5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 80
    iput-object p6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 81
    iput-object p7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 82
    iput-object p8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 83
    iput-object p9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 84
    iput-object p10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 85
    iput-object p11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 86
    iput-object p12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 87
    iput-object p13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

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
    sget-boolean v0, Lnet/bytebuddy/ByteBuddy;->ACCESS_CONTROLLER:Z

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
.method public decorate(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 54
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->decorate(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public decorate(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 53
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->decorate(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public decorate(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 14
    .line 15
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 18
    .line 19
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 20
    .line 21
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 22
    .line 23
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 24
    .line 25
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 26
    .line 27
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 28
    .line 29
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 30
    .line 31
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 32
    .line 33
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    move-object/from16 v13, p2

    .line 37
    .line 38
    invoke-direct/range {v1 .. v13}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_0
    const-string p0, "Cannot decorate array or primitive type: "

    .line 43
    .line 44
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
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
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/ByteBuddy;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ClassFileVersion;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 89
    .line 90
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 100
    .line 101
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_a

    .line 108
    .line 109
    return v1

    .line 110
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 111
    .line 112
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    return v1

    .line 121
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 122
    .line 123
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_c

    .line 130
    .line 131
    return v1

    .line 132
    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 133
    .line 134
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_d

    .line 141
    .line 142
    return v1

    .line 143
    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 144
    .line 145
    iget-object v3, p1, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_e

    .line 152
    .line 153
    return v1

    .line 154
    :cond_e
    iget-object p0, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 155
    .line 156
    iget-object p1, p1, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_f

    .line 163
    .line 164
    return v1

    .line 165
    :cond_f
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 12
    .line 13
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, v0

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/2addr v0, v1

    .line 63
    mul-int/lit8 v0, v0, 0x1f

    .line 64
    .line 65
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    add-int/2addr v1, v0

    .line 72
    mul-int/lit8 v1, v1, 0x1f

    .line 73
    .line 74
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, v1

    .line 81
    mul-int/lit8 v0, v0, 0x1f

    .line 82
    .line 83
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/2addr v1, v0

    .line 90
    mul-int/lit8 v1, v1, 0x1f

    .line 91
    .line 92
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/2addr v0, v1

    .line 99
    mul-int/lit8 v0, v0, 0x1f

    .line 100
    .line 101
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/2addr v1, v0

    .line 108
    mul-int/lit8 v1, v1, 0x1f

    .line 109
    .line 110
    iget-object v0, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    add-int/2addr v0, v1

    .line 117
    mul-int/lit8 v0, v0, 0x1f

    .line 118
    .line 119
    iget-object p0, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    add-int/2addr p0, v0

    .line 126
    return p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/ByteBuddy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/ByteBuddy;"
        }
    .end annotation

    .line 32
    new-instance v0, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;

    invoke-direct {v0, p1}, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/ByteBuddy;->ignore(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/ByteBuddy;

    move-result-object p0

    return-object p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/ByteBuddy;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/ByteBuddy;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 18
    .line 19
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 20
    .line 21
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 22
    .line 23
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 24
    .line 25
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 26
    .line 27
    move-object v13, p1

    .line 28
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public makeAnnotation()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 6
    .line 7
    const-class v3, Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-interface {v2, v4}, Lnet/bytebuddy/NamingStrategy;->subclass(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v4, 0x2

    .line 18
    new-array v4, v4, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 19
    .line 20
    sget-object v5, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aput-object v5, v4, v6

    .line 24
    .line 25
    sget-object v5, Lnet/bytebuddy/description/modifier/TypeManifestation;->ANNOTATION:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    aput-object v5, v4, v7

    .line 29
    .line 30
    invoke-static {v4}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->resolve()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-class v5, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v1, v2, v4, v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 49
    .line 50
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-array v4, v7, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 55
    .line 56
    aput-object v3, v4, v6

    .line 57
    .line 58
    invoke-direct {v2, v4}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 66
    .line 67
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 68
    .line 69
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 70
    .line 71
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 72
    .line 73
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 74
    .line 75
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 76
    .line 77
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 78
    .line 79
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 80
    .line 81
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 82
    .line 83
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 84
    .line 85
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 86
    .line 87
    sget-object v13, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 88
    .line 89
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public makeEnumeration(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "+",
            "Ljava/lang/Enum<",
            "*>;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v2, v1, [Ljava/lang/reflect/Type;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const-class v4, Lnet/bytebuddy/dynamic/TargetType;

    .line 14
    .line 15
    aput-object v4, v2, v3

    .line 16
    .line 17
    const-class v5, Ljava/lang/Enum;

    .line 18
    .line 19
    invoke-static {v5, v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->parameterizedType(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->build()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 28
    .line 29
    iget-object v6, v0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 30
    .line 31
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 32
    .line 33
    invoke-interface {v7, v2}, Lnet/bytebuddy/NamingStrategy;->subclass(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    sget-object v19, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 38
    .line 39
    const/4 v8, 0x3

    .line 40
    new-array v8, v8, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 41
    .line 42
    aput-object v19, v8, v3

    .line 43
    .line 44
    sget-object v9, Lnet/bytebuddy/description/modifier/TypeManifestation;->FINAL:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 45
    .line 46
    aput-object v9, v8, v1

    .line 47
    .line 48
    sget-object v9, Lnet/bytebuddy/description/modifier/EnumerationState;->ENUMERATION:Lnet/bytebuddy/description/modifier/EnumerationState;

    .line 49
    .line 50
    const/4 v10, 0x2

    .line 51
    aput-object v9, v8, v10

    .line 52
    .line 53
    invoke-static {v8}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {v8}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->resolve()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-interface {v6, v7, v8, v2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 66
    .line 67
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 68
    .line 69
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 70
    .line 71
    move v11, v10

    .line 72
    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 73
    .line 74
    move v12, v11

    .line 75
    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 76
    .line 77
    move v13, v12

    .line 78
    iget-object v12, v0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 79
    .line 80
    move v14, v13

    .line 81
    iget-object v13, v0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 82
    .line 83
    move v15, v14

    .line 84
    iget-object v14, v0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 85
    .line 86
    move/from16 v16, v15

    .line 87
    .line 88
    iget-object v15, v0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 89
    .line 90
    move/from16 v20, v3

    .line 91
    .line 92
    iget-object v3, v0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 93
    .line 94
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 95
    .line 96
    sget-object v18, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 97
    .line 98
    move-object/from16 v17, v0

    .line 99
    .line 100
    move/from16 v0, v16

    .line 101
    .line 102
    move-object/from16 v16, v3

    .line 103
    .line 104
    invoke-direct/range {v5 .. v18}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 105
    .line 106
    .line 107
    new-array v3, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 108
    .line 109
    sget-object v6, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 110
    .line 111
    aput-object v6, v3, v20

    .line 112
    .line 113
    invoke-virtual {v5, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-array v5, v0, [Ljava/lang/reflect/Type;

    .line 118
    .line 119
    const-class v6, Ljava/lang/String;

    .line 120
    .line 121
    aput-object v6, v5, v20

    .line 122
    .line 123
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 124
    .line 125
    aput-object v7, v5, v1

    .line 126
    .line 127
    invoke-interface {v3, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v5, Lnet/bytebuddy/implementation/SuperMethodCall;->INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 132
    .line 133
    invoke-interface {v3, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    sget-object v5, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 138
    .line 139
    new-array v7, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 140
    .line 141
    aput-object v19, v7, v20

    .line 142
    .line 143
    aput-object v5, v7, v1

    .line 144
    .line 145
    const-string v8, "valueOf"

    .line 146
    .line 147
    invoke-interface {v3, v8, v4, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    new-array v4, v1, [Ljava/lang/reflect/Type;

    .line 152
    .line 153
    aput-object v6, v4, v20

    .line 154
    .line 155
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v8}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    const-class v7, Ljava/lang/Class;

    .line 168
    .line 169
    filled-new-array {v7, v6}, [Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-interface {v4, v6}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-interface {v2, v4}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Lnet/bytebuddy/description/method/MethodList;

    .line 186
    .line 187
    invoke-interface {v2}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 192
    .line 193
    invoke-static {v2}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/MethodCall;->withOwnType()Lnet/bytebuddy/implementation/MethodCall;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    filled-new-array/range {v20 .. v20}, [I

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v2, v4}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 210
    .line 211
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 212
    .line 213
    invoke-virtual {v2, v4, v6}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v3, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    new-array v0, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 222
    .line 223
    aput-object v19, v0, v20

    .line 224
    .line 225
    aput-object v5, v0, v1

    .line 226
    .line 227
    const-string v1, "values"

    .line 228
    .line 229
    const-class v3, [Lnet/bytebuddy/dynamic/TargetType;

    .line 230
    .line 231
    invoke-interface {v2, v1, v3, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v1, Lnet/bytebuddy/ByteBuddy$EnumerationImplementation;

    .line 236
    .line 237
    new-instance v2, Ljava/util/ArrayList;

    .line 238
    .line 239
    move-object/from16 v3, p1

    .line 240
    .line 241
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v1, v2}, Lnet/bytebuddy/ByteBuddy$EnumerationImplementation;-><init>(Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :cond_0
    const-string v0, "Require at least one enumeration constant"

    .line 253
    .line 254
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const/4 v0, 0x0

    .line 258
    return-object v0
.end method

.method public varargs makeEnumeration([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "+",
            "Ljava/lang/Enum<",
            "*>;>;"
        }
    .end annotation

    .line 259
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->makeEnumeration(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public makeInterface()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 35
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p0, v0}, Lnet/bytebuddy/ByteBuddy;->makeInterface(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public makeInterface(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 31
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->makeInterface(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public makeInterface(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x2

    .line 14
    new-array p1, p1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 15
    .line 16
    sget-object v0, Lnet/bytebuddy/description/modifier/TypeManifestation;->INTERFACE:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aput-object v0, p1, v1

    .line 20
    .line 21
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aput-object v0, p1, v1

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public makeInterface(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 33
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/ByteBuddy;->makeInterface(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs makeInterface([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 32
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->makeInterface(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs makeInterface([Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 34
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->makeInterface(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public makeModule(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 4
    .line 5
    const v2, 0x8000

    .line 6
    .line 7
    .line 8
    sget-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 9
    .line 10
    const-string v4, "module-info"

    .line 11
    .line 12
    invoke-interface {v1, v4, v2, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 17
    .line 18
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 19
    .line 20
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 21
    .line 22
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 23
    .line 24
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 25
    .line 26
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 27
    .line 28
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 29
    .line 30
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 31
    .line 32
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 33
    .line 34
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 35
    .line 36
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 37
    .line 38
    sget-object v13, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 39
    .line 40
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 41
    .line 42
    .line 43
    move-object v1, v0

    .line 44
    move-object/from16 v0, p2

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;->module(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public varargs makeModule(Ljava/lang/String;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "*>;"
        }
    .end annotation

    .line 51
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->makeModule(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    move-result-object p0

    return-object p0
.end method

.method public makePackage(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 4
    .line 5
    const-string v2, ".package-info"

    .line 6
    .line 7
    invoke-static {p1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-class v2, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/16 v3, 0x1600

    .line 18
    .line 19
    invoke-interface {v1, p1, v3, v2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 24
    .line 25
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 26
    .line 27
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 28
    .line 29
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 30
    .line 31
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 32
    .line 33
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 34
    .line 35
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 36
    .line 37
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 38
    .line 39
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 40
    .line 41
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 42
    .line 43
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 44
    .line 45
    sget-object v13, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 46
    .line 47
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public makeRecord()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->RECORD:Lnet/bytebuddy/utility/JavaType;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x1

    .line 20
    new-array v5, v4, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 21
    .line 22
    sget-object v6, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    aput-object v6, v5, v7

    .line 26
    .line 27
    invoke-static {v1, v3, v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;->of(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    invoke-direct {v3, v5}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 42
    .line 43
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const-string v6, "hashCode"

    .line 54
    .line 55
    const/16 v7, 0x401

    .line 56
    .line 57
    invoke-direct {v3, v6, v7, v5}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 65
    .line 66
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v6, "equals"

    .line 85
    .line 86
    invoke-direct {v3, v6, v7, v5, v2}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 94
    .line 95
    const-class v3, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const-string v5, "toString"

    .line 106
    .line 107
    invoke-direct {v2, v5, v7, v3}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;->withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v5, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 119
    .line 120
    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 121
    .line 122
    iget-object v3, v0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 123
    .line 124
    invoke-interface {v3, v1}, Lnet/bytebuddy/NamingStrategy;->subclass(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const/16 v6, 0x11

    .line 129
    .line 130
    invoke-interface {v2, v3, v6, v1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-interface {v1, v4}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 139
    .line 140
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 141
    .line 142
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 143
    .line 144
    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 145
    .line 146
    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 147
    .line 148
    iget-object v12, v0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 149
    .line 150
    iget-object v13, v0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 151
    .line 152
    iget-object v14, v0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 153
    .line 154
    iget-object v15, v0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 155
    .line 156
    iget-object v1, v0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 157
    .line 158
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 159
    .line 160
    sget-object v18, Lnet/bytebuddy/ByteBuddy$RecordConstructorStrategy;->INSTANCE:Lnet/bytebuddy/ByteBuddy$RecordConstructorStrategy;

    .line 161
    .line 162
    move-object/from16 v17, v0

    .line 163
    .line 164
    move-object/from16 v16, v1

    .line 165
    .line 166
    invoke-direct/range {v5 .. v18}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v5, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    sget-object v1, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->HASH_CODE:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 178
    .line 179
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isEquals()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sget-object v1, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->EQUALS:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 192
    .line 193
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isToString()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->TO_STRING:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 206
    .line 207
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0
.end method

.method public rebase(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 84
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->rebase(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 81
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 82
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/ByteBuddy;->rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Ljava/lang/Package;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Package;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 85
    new-instance v0, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;-><init>(Ljava/lang/Package;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/ByteBuddy;->rebase(Lnet/bytebuddy/description/type/PackageDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Lnet/bytebuddy/description/type/PackageDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/PackageDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 86
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/type/TypeDescription$ForPackageDescription;-><init>(Lnet/bytebuddy/description/type/PackageDescription;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/ByteBuddy;->rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 83
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer$Suffixing;->withRandomSuffix()Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/ByteBuddy;->rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public rebase(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;

    .line 18
    .line 19
    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 20
    .line 21
    invoke-interface {v2, v13}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->represent(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v1

    .line 26
    move-object v1, v2

    .line 27
    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    iget-object v3, v0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 31
    .line 32
    move-object v5, v4

    .line 33
    iget-object v4, v0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 34
    .line 35
    move-object v6, v5

    .line 36
    iget-object v5, v0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 37
    .line 38
    move-object v7, v6

    .line 39
    iget-object v6, v0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 40
    .line 41
    move-object v8, v7

    .line 42
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 43
    .line 44
    move-object v9, v8

    .line 45
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 46
    .line 47
    move-object v10, v9

    .line 48
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 49
    .line 50
    move-object v11, v10

    .line 51
    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 52
    .line 53
    move-object v12, v11

    .line 54
    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 55
    .line 56
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 57
    .line 58
    move-object v14, v12

    .line 59
    move-object v12, v0

    .line 60
    move-object v0, v14

    .line 61
    move-object/from16 v14, p2

    .line 62
    .line 63
    move-object/from16 v15, p3

    .line 64
    .line 65
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V

    .line 66
    .line 67
    .line 68
    move-object v12, v0

    .line 69
    return-object v12

    .line 70
    :cond_0
    const-string v0, "Cannot rebase array or primitive type: "

    .line 71
    .line 72
    invoke-static {v0, v13}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    return-object v0
.end method

.method public redefine(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 63
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->redefine(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public redefine(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 62
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->redefine(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public redefine(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v13, p1

    .line 2
    .line 3
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 18
    .line 19
    invoke-interface {v1, v13}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->represent(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 24
    .line 25
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 26
    .line 27
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 28
    .line 29
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 30
    .line 31
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 32
    .line 33
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 34
    .line 35
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 36
    .line 37
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 38
    .line 39
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 40
    .line 41
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 42
    .line 43
    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 44
    .line 45
    move-object/from16 v14, p2

    .line 46
    .line 47
    invoke-direct/range {v0 .. v14}, Lnet/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    const-string p0, "Cannot redefine array or primitive type: "

    .line 52
    .line 53
    invoke-static {p0, v13}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 146
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 142
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public subclass(Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 143
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public subclass(Ljava/lang/reflect/Type;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 144
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public subclass(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 145
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public subclass(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x1

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const-class v2, Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v5, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 38
    .line 39
    new-array v6, v4, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 40
    .line 41
    aput-object v1, v6, v3

    .line 42
    .line 43
    invoke-direct {v5, v6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v5, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 52
    .line 53
    invoke-direct {v5}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 54
    .line 55
    .line 56
    :goto_0
    new-instance v6, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;

    .line 57
    .line 58
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 59
    .line 60
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 61
    .line 62
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-interface {v8, v9}, Lnet/bytebuddy/NamingStrategy;->subclass(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    const/4 v9, 0x2

    .line 71
    new-array v9, v9, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 72
    .line 73
    sget-object v10, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 74
    .line 75
    aput-object v10, v9, v3

    .line 76
    .line 77
    sget-object v3, Lnet/bytebuddy/description/modifier/TypeManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 78
    .line 79
    aput-object v3, v9, v4

    .line 80
    .line 81
    invoke-static {v9}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v3, v1}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->resolve(I)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-interface {v7, v8, v1, v2}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;->subclass(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v1, v5}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 102
    .line 103
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 104
    .line 105
    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 106
    .line 107
    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 108
    .line 109
    iget-object v12, v0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 110
    .line 111
    iget-object v13, v0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 112
    .line 113
    iget-object v14, v0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 114
    .line 115
    iget-object v15, v0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 116
    .line 117
    iget-object v1, v0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 118
    .line 119
    iget-object v2, v0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 120
    .line 121
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 122
    .line 123
    move-object/from16 v19, p2

    .line 124
    .line 125
    move-object/from16 v18, v0

    .line 126
    .line 127
    move-object/from16 v16, v1

    .line 128
    .line 129
    move-object/from16 v17, v2

    .line 130
    .line 131
    invoke-direct/range {v6 .. v19}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)V

    .line 132
    .line 133
    .line 134
    return-object v6

    .line 135
    :cond_1
    const-string v0, "Cannot subclass primitive, array or final types: "

    .line 136
    .line 137
    invoke-static {v1, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    return-object v0
.end method

.method public with(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 45
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v1, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/NamingStrategy;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 36
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v2, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 44
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v10, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;)Lnet/bytebuddy/ByteBuddy;
    .locals 14
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 18
    .line 19
    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 20
    .line 21
    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 22
    .line 23
    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 24
    .line 25
    new-instance v12, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;

    .line 26
    .line 27
    invoke-direct {v12, p1}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;-><init>(Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;)V

    .line 28
    .line 29
    .line 30
    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 42
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v8, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 41
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v7, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 43
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v9, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/implementation/Implementation$Context$Factory;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 40
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v6, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/implementation/attribute/AnnotationRetention;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 39
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v5, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 38
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v4, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 37
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v3, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 46
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v12, p0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v11, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/utility/AsmClassWriter$Factory;)Lnet/bytebuddy/ByteBuddy;
    .locals 14

    .line 47
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    iget-object v1, p0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v2, p0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    iget-object v3, p0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    iget-object v4, p0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    iget-object v5, p0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    iget-object v6, p0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    iget-object v7, p0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    iget-object v8, p0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    iget-object v9, p0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    iget-object v10, p0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    iget-object v11, p0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    iget-object v13, p0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    move-object v12, p1

    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    return-object v0
.end method

.method public withIgnoredClassReader()Lnet/bytebuddy/ByteBuddy;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/ByteBuddy;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 4
    .line 5
    instance-of v2, v1, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Suppressing;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v3, Lnet/bytebuddy/ByteBuddy;

    .line 11
    .line 12
    iget-object v4, v0, Lnet/bytebuddy/ByteBuddy;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 13
    .line 14
    iget-object v5, v0, Lnet/bytebuddy/ByteBuddy;->namingStrategy:Lnet/bytebuddy/NamingStrategy;

    .line 15
    .line 16
    iget-object v6, v0, Lnet/bytebuddy/ByteBuddy;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 17
    .line 18
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 19
    .line 20
    iget-object v8, v0, Lnet/bytebuddy/ByteBuddy;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 21
    .line 22
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 23
    .line 24
    iget-object v10, v0, Lnet/bytebuddy/ByteBuddy;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 25
    .line 26
    iget-object v11, v0, Lnet/bytebuddy/ByteBuddy;->instrumentedTypeFactory:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;

    .line 27
    .line 28
    iget-object v12, v0, Lnet/bytebuddy/ByteBuddy;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 29
    .line 30
    iget-object v13, v0, Lnet/bytebuddy/ByteBuddy;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 31
    .line 32
    iget-object v14, v0, Lnet/bytebuddy/ByteBuddy;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 33
    .line 34
    new-instance v15, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Suppressing;

    .line 35
    .line 36
    invoke-direct {v15, v1}, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Suppressing;-><init>(Lnet/bytebuddy/utility/AsmClassWriter$Factory;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 40
    .line 41
    move-object/from16 v16, v0

    .line 42
    .line 43
    invoke-direct/range {v3 .. v16}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/NamingStrategy;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;)V

    .line 44
    .line 45
    .line 46
    return-object v3
.end method
