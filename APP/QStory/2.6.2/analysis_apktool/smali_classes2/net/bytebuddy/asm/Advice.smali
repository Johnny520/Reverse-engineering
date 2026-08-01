.class public Lnet/bytebuddy/asm/Advice;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OnNonDefaultValue;,
        Lnet/bytebuddy/asm/Advice$OnDefaultValue;,
        Lnet/bytebuddy/asm/Advice$NoExceptionHandler;,
        Lnet/bytebuddy/asm/Advice$WithCustomMapping;,
        Lnet/bytebuddy/asm/Advice$AssignReturned;,
        Lnet/bytebuddy/asm/Advice$Unused;,
        Lnet/bytebuddy/asm/Advice$StubValue;,
        Lnet/bytebuddy/asm/Advice$Local;,
        Lnet/bytebuddy/asm/Advice$Exit;,
        Lnet/bytebuddy/asm/Advice$Enter;,
        Lnet/bytebuddy/asm/Advice$Origin;,
        Lnet/bytebuddy/asm/Advice$FieldSetterHandle;,
        Lnet/bytebuddy/asm/Advice$FieldGetterHandle;,
        Lnet/bytebuddy/asm/Advice$FieldValue;,
        Lnet/bytebuddy/asm/Advice$DynamicConstant;,
        Lnet/bytebuddy/asm/Advice$Handle;,
        Lnet/bytebuddy/asm/Advice$SelfCallHandle;,
        Lnet/bytebuddy/asm/Advice$Thrown;,
        Lnet/bytebuddy/asm/Advice$Return;,
        Lnet/bytebuddy/asm/Advice$AllArguments;,
        Lnet/bytebuddy/asm/Advice$Argument;,
        Lnet/bytebuddy/asm/Advice$This;,
        Lnet/bytebuddy/asm/Advice$OnMethodExit;,
        Lnet/bytebuddy/asm/Advice$OnMethodEnter;,
        Lnet/bytebuddy/asm/Advice$Appender;,
        Lnet/bytebuddy/asm/Advice$AdviceVisitor;,
        Lnet/bytebuddy/asm/Advice$Dispatcher;,
        Lnet/bytebuddy/asm/Advice$ExceptionHandler;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler;,
        Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;,
        Lnet/bytebuddy/asm/Advice$Delegator;,
        Lnet/bytebuddy/asm/Advice$PostProcessor;,
        Lnet/bytebuddy/asm/Advice$ArgumentHandler;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final BACKUP_ARGUMENTS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final INLINE_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final INLINE_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final ON_THROWABLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final PREPEND_LINE_NUMBER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final REPEAT_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final REPEAT_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final SKIP_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final SKIP_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final SUPPRESS_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final SUPPRESS_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final UNDEFINED:Lnet/bytebuddy/utility/AsmClassReader;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final delegate:Lnet/bytebuddy/implementation/Implementation;

.field private final exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

.field private final methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

.field private final methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "skipOn"

    .line 12
    .line 13
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 22
    .line 23
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    sput-object v1, Lnet/bytebuddy/asm/Advice;->SKIP_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    const-string v1, "skipOnIndex"

    .line 32
    .line 33
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 42
    .line 43
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 48
    .line 49
    sput-object v1, Lnet/bytebuddy/asm/Advice;->SKIP_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    const-string v1, "prependLineNumber"

    .line 52
    .line 53
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 62
    .line 63
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 68
    .line 69
    sput-object v1, Lnet/bytebuddy/asm/Advice;->PREPEND_LINE_NUMBER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 70
    .line 71
    const-string v1, "inline"

    .line 72
    .line 73
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-interface {v0, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lnet/bytebuddy/description/method/MethodList;

    .line 82
    .line 83
    invoke-interface {v2}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 88
    .line 89
    sput-object v2, Lnet/bytebuddy/asm/Advice;->INLINE_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 90
    .line 91
    const-string v2, "suppress"

    .line 92
    .line 93
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 102
    .line 103
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 108
    .line 109
    sput-object v0, Lnet/bytebuddy/asm/Advice;->SUPPRESS_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 110
    .line 111
    const-class v0, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 112
    .line 113
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v3, "repeatOn"

    .line 122
    .line 123
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Lnet/bytebuddy/description/method/MethodList;

    .line 132
    .line 133
    invoke-interface {v3}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 138
    .line 139
    sput-object v3, Lnet/bytebuddy/asm/Advice;->REPEAT_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 140
    .line 141
    const-string v3, "repeatOnIndex"

    .line 142
    .line 143
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Lnet/bytebuddy/description/method/MethodList;

    .line 152
    .line 153
    invoke-interface {v3}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 158
    .line 159
    sput-object v3, Lnet/bytebuddy/asm/Advice;->REPEAT_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 160
    .line 161
    const-string v3, "onThrowable"

    .line 162
    .line 163
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lnet/bytebuddy/description/method/MethodList;

    .line 172
    .line 173
    invoke-interface {v3}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 178
    .line 179
    sput-object v3, Lnet/bytebuddy/asm/Advice;->ON_THROWABLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 180
    .line 181
    const-string v3, "backupArguments"

    .line 182
    .line 183
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Lnet/bytebuddy/description/method/MethodList;

    .line 192
    .line 193
    invoke-interface {v3}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 198
    .line 199
    sput-object v3, Lnet/bytebuddy/asm/Advice;->BACKUP_ARGUMENTS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 200
    .line 201
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 210
    .line 211
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 216
    .line 217
    sput-object v1, Lnet/bytebuddy/asm/Advice;->INLINE_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 218
    .line 219
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 228
    .line 229
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 234
    .line 235
    sput-object v0, Lnet/bytebuddy/asm/Advice;->SUPPRESS_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 236
    .line 237
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;)V
    .locals 6

    .line 15
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    sget-object v4, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;->SUPPRESSING:Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;

    sget-object v5, Lnet/bytebuddy/implementation/SuperMethodCall;->INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/Implementation;)V

    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/Implementation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$2700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->ON_THROWABLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->SUPPRESS_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->SKIP_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->SKIP_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->PREPEND_LINE_NUMBER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4500()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->SUPPRESS_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4600()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->REPEAT_ON:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->REPEAT_ON_INDEX:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4800()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice;->BACKUP_ARGUMENTS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method private static locate(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$Delegator$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    invoke-interface {p2}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-class p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    new-instance p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining;

    .line 44
    .line 45
    invoke-direct {p0, p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    new-instance p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating;

    .line 50
    .line 51
    invoke-direct {p0, p3, p4}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    const-string p0, "Advice for "

    .line 56
    .line 57
    const-string p1, " is not static"

    .line 58
    .line 59
    invoke-static {p3, p0, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    const-string p0, "Duplicate advice for "

    .line 64
    .line 65
    const-string p1, " and "

    .line 66
    .line 67
    invoke-static {p0, p2, p1, p3}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-object v1
.end method

.method public static to(Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 218
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/asm/Advice;->to(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 209
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 210
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 211
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-static {v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-direct {v2, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    move-object v0, v2

    .line 212
    :goto_0
    invoke-static {p0, p1, v0}, Lnet/bytebuddy/asm/Advice;->to(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 213
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 189
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0, p1}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice;
    .locals 1

    .line 190
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    invoke-static {p0, v0}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/asm/Advice$Delegator$Factory;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 194
    sget-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inactive;->INSTANCE:Lnet/bytebuddy/asm/Advice$Dispatcher$Inactive;

    .line 195
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 196
    const-class v4, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    sget-object v5, Lnet/bytebuddy/asm/Advice;->INLINE_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v4, v5, v0, v3, p4}, Lnet/bytebuddy/asm/Advice;->locate(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;

    move-result-object v0

    .line 197
    const-class v4, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    sget-object v5, Lnet/bytebuddy/asm/Advice;->INLINE_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v4, v5, v2, v3, p4}, Lnet/bytebuddy/asm/Advice;->locate(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;

    move-result-object v2

    goto :goto_0

    .line 198
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    move-result p4

    const/4 v1, 0x0

    if-nez p4, :cond_2

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_1

    .line 199
    :cond_1
    const-string p1, "No advice defined by "

    .line 200
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    move-result-object p0

    .line 201
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v1

    .line 202
    :cond_2
    :goto_1
    :try_start_0
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->isBinary()Z

    move-result p4

    if-nez p4, :cond_4

    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->isBinary()Z

    move-result p4

    if-eqz p4, :cond_3

    goto :goto_2

    .line 203
    :cond_3
    sget-object p2, Lnet/bytebuddy/asm/Advice;->UNDEFINED:Lnet/bytebuddy/utility/AsmClassReader;

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_4
    :goto_2
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    move-result-object p2

    invoke-interface {p5, p2}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([B)Lnet/bytebuddy/utility/AsmClassReader;

    move-result-object p2

    .line 204
    :goto_3
    new-instance p4, Lnet/bytebuddy/asm/Advice;

    invoke-interface {v0, p3, p2, v2, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->asMethodEnter(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    move-result-object p5

    .line 205
    invoke-interface {v2, p3, p2, v0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->asMethodExit(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    move-result-object p1

    invoke-direct {p4, p5, p1}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    .line 206
    :goto_4
    const-string p2, "Error reading class file of "

    .line 207
    invoke-static {p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    move-result-object p0

    .line 208
    invoke-static {p0, p1}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice;
    .locals 1

    .line 214
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    invoke-static {p0, p1, v0}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/asm/Advice$Delegator$Factory;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inactive;->INSTANCE:Lnet/bytebuddy/asm/Advice$Dispatcher$Inactive;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v2, v0

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 23
    .line 24
    const-class v4, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    .line 25
    .line 26
    sget-object v5, Lnet/bytebuddy/asm/Advice;->INLINE_ENTER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 27
    .line 28
    invoke-static {v4, v5, v2, v3, p5}, Lnet/bytebuddy/asm/Advice;->locate(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 59
    .line 60
    const-class v5, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 61
    .line 62
    sget-object v6, Lnet/bytebuddy/asm/Advice;->INLINE_EXIT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 63
    .line 64
    invoke-static {v5, v6, v0, v4, p5}, Lnet/bytebuddy/asm/Advice;->locate(Ljava/lang/Class;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$Delegator$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    .line 70
    .line 71
    .line 72
    move-result p5

    .line 73
    if-eqz p5, :cond_4

    .line 74
    .line 75
    :try_start_0
    new-instance p5, Lnet/bytebuddy/asm/Advice;

    .line 76
    .line 77
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->isBinary()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {p3, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p6, v1}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([B)Lnet/bytebuddy/utility/AsmClassReader;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    goto :goto_2

    .line 100
    :catch_0
    move-exception p2

    .line 101
    goto :goto_4

    .line 102
    :cond_2
    sget-object v1, Lnet/bytebuddy/asm/Advice;->UNDEFINED:Lnet/bytebuddy/utility/AsmClassReader;

    .line 103
    .line 104
    :goto_2
    invoke-interface {v2, p4, v1, v0, p2}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->asMethodEnter(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->isBinary()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-interface {p3, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-interface {p3}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-interface {p6, p3}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([B)Lnet/bytebuddy/utility/AsmClassReader;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    sget-object p3, Lnet/bytebuddy/asm/Advice;->UNDEFINED:Lnet/bytebuddy/utility/AsmClassReader;

    .line 132
    .line 133
    :goto_3
    invoke-interface {v0, p4, p3, v2, p2}, Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;->asMethodExit(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-direct {p5, v1, p2}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    return-object p5

    .line 141
    :goto_4
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    new-instance p4, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string p5, "Error reading class file of "

    .line 146
    .line 147
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string p0, " or "

    .line 154
    .line 155
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-direct {p3, p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw p3

    .line 169
    :cond_4
    const-string p0, "No exit advice defined by "

    .line 170
    .line 171
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v3

    .line 179
    :cond_5
    const-string p1, "No enter advice defined by "

    .line 180
    .line 181
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v3
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 7

    .line 215
    sget-object v2, Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;

    .line 216
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v5, Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;

    sget-object v6, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    .line 217
    invoke-static/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;
    .locals 6

    .line 191
    sget-object v1, Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;

    .line 192
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v4, Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation$Factory;

    sget-object v5, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    move-object v0, p0

    move-object v2, p1

    .line 193
    invoke-static/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;Lnet/bytebuddy/asm/Advice$Delegator$Factory;Lnet/bytebuddy/utility/AsmClassReader$Factory;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public static withCustomMapping()Lnet/bytebuddy/asm/Advice$WithCustomMapping;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$Appender;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lnet/bytebuddy/implementation/Implementation;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/asm/Advice$Appender;-><init>(Lnet/bytebuddy/asm/Advice;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public doWrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 12

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 2
    .line 3
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;->isPrependLineNumber()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;

    .line 10
    .line 11
    invoke-direct {v1, p3}, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, p3

    .line 16
    :goto_0
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 17
    .line 18
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithoutExitAdvice;

    .line 25
    .line 26
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 27
    .line 28
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 29
    .line 30
    invoke-interface {v4, p2, p1}, Lnet/bytebuddy/asm/Advice$ExceptionHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    move-object v6, p2

    .line 38
    move/from16 v8, p5

    .line 39
    .line 40
    move/from16 v9, p6

    .line 41
    .line 42
    move-object v0, v2

    .line 43
    move-object/from16 v2, p4

    .line 44
    .line 45
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithoutExitAdvice;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;II)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 50
    .line 51
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;->getThrowable()Lnet/bytebuddy/description/type/TypeDescription;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-class v3, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 56
    .line 57
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    new-instance v2, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithoutExceptionHandling;

    .line 64
    .line 65
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 66
    .line 67
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 68
    .line 69
    invoke-interface {v4, p2, p1}, Lnet/bytebuddy/asm/Advice$ExceptionHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 74
    .line 75
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 76
    .line 77
    move-object v5, p1

    .line 78
    move-object v6, p2

    .line 79
    move/from16 v9, p5

    .line 80
    .line 81
    move/from16 v10, p6

    .line 82
    .line 83
    move-object v0, v2

    .line 84
    move-object/from16 v2, p4

    .line 85
    .line 86
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithoutExceptionHandling;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;II)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    new-instance v2, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithExceptionHandling;

    .line 97
    .line 98
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 99
    .line 100
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 101
    .line 102
    invoke-interface {v4, p2, p1}, Lnet/bytebuddy/asm/Advice$ExceptionHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 107
    .line 108
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 109
    .line 110
    invoke-interface {v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;->getThrowable()Lnet/bytebuddy/description/type/TypeDescription;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    move-object v5, p1

    .line 115
    move-object v6, p2

    .line 116
    move/from16 v9, p5

    .line 117
    .line 118
    move/from16 v10, p6

    .line 119
    .line 120
    move-object v0, v2

    .line 121
    move-object/from16 v2, p4

    .line 122
    .line 123
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithExceptionHandling;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;IILnet/bytebuddy/description/type/TypeDescription;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_3
    const-string v0, "Cannot catch exception during constructor call for "

    .line 128
    .line 129
    invoke-static {v0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 67
    .line 68
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v2

    .line 49
    return p0
.end method

.method public on(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object p0, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/asm/Advice;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 6
    .line 7
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 10
    .line 11
    move-object v3, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/Implementation;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public withExceptionHandler(Lnet/bytebuddy/asm/Advice$ExceptionHandler;)Lnet/bytebuddy/asm/Advice;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice;->delegate:Lnet/bytebuddy/implementation/Implementation;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/Implementation;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public withExceptionHandler(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice;
    .locals 1

    .line 16
    new-instance v0, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Simple;

    invoke-direct {v0, p1}, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice;->withExceptionHandler(Lnet/bytebuddy/asm/Advice$ExceptionHandler;)Lnet/bytebuddy/asm/Advice;

    move-result-object p0

    return-object p0
.end method

.method public withExceptionPrinting()Lnet/bytebuddy/asm/Advice;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;->PRINTING:Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice;->withExceptionHandler(Lnet/bytebuddy/asm/Advice$ExceptionHandler;)Lnet/bytebuddy/asm/Advice;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 6

    .line 28
    new-instance v0, Lnet/bytebuddy/asm/Advice;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/Implementation;)V

    return-object v0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 7

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 2
    .line 3
    .line 4
    move-result p5

    .line 5
    if-nez p5, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;->isNative()Z

    .line 8
    .line 9
    .line 10
    move-result p5

    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    :cond_0
    move-object v3, p3

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    move v5, p6

    .line 21
    move v6, p7

    .line 22
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice;->doWrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;II)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :goto_0
    return-object v3
.end method
