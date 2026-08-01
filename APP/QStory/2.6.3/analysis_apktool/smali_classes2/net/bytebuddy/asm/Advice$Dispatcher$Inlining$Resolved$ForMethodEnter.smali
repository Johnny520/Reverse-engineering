.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForMethodEnter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithDiscardedEnterType;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithRetainedEnterType;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final namedTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation
.end field

.field private final prependLineNumber:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/utility/AsmClassReader;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p5

    .line 5
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForLocalValue$Factory;

    .line 6
    .line 7
    invoke-direct {v0, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForLocalValue$Factory;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 11
    .line 12
    const-class v2, Lnet/bytebuddy/asm/Advice$Thrown;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 18
    .line 19
    const-class v3, Lnet/bytebuddy/asm/Advice$Enter;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 25
    .line 26
    const-class v4, Lnet/bytebuddy/asm/Advice$Return;

    .line 27
    .line 28
    invoke-direct {v3, v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    const/16 v4, 0x12

    .line 32
    .line 33
    new-array v4, v4, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 34
    .line 35
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    aput-object v5, v4, v6

    .line 39
    .line 40
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    aput-object v5, v4, v6

    .line 44
    .line 45
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;

    .line 46
    .line 47
    const/4 v6, 0x2

    .line 48
    aput-object v5, v4, v6

    .line 49
    .line 50
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;

    .line 51
    .line 52
    const/4 v6, 0x3

    .line 53
    aput-object v5, v4, v6

    .line 54
    .line 55
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    aput-object v5, v4, v6

    .line 59
    .line 60
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    .line 61
    .line 62
    const/4 v6, 0x5

    .line 63
    aput-object v5, v4, v6

    .line 64
    .line 65
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;

    .line 66
    .line 67
    const/4 v6, 0x6

    .line 68
    aput-object v5, v4, v6

    .line 69
    .line 70
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;

    .line 71
    .line 72
    const/4 v6, 0x7

    .line 73
    aput-object v5, v4, v6

    .line 74
    .line 75
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;

    .line 76
    .line 77
    const/16 v6, 0x8

    .line 78
    .line 79
    aput-object v5, v4, v6

    .line 80
    .line 81
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;

    .line 82
    .line 83
    const/16 v6, 0x9

    .line 84
    .line 85
    aput-object v5, v4, v6

    .line 86
    .line 87
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;

    .line 88
    .line 89
    const/16 v6, 0xa

    .line 90
    .line 91
    aput-object v5, v4, v6

    .line 92
    .line 93
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;

    .line 94
    .line 95
    const/16 v6, 0xb

    .line 96
    .line 97
    aput-object v5, v4, v6

    .line 98
    .line 99
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThrowable$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThrowable$Factory;

    .line 100
    .line 101
    const/16 v6, 0xc

    .line 102
    .line 103
    aput-object v5, v4, v6

    .line 104
    .line 105
    const/16 v5, 0xd

    .line 106
    .line 107
    aput-object p5, v4, v5

    .line 108
    .line 109
    const/16 p5, 0xe

    .line 110
    .line 111
    aput-object v0, v4, p5

    .line 112
    .line 113
    const/16 p5, 0xf

    .line 114
    .line 115
    aput-object v1, v4, p5

    .line 116
    .line 117
    const/16 p5, 0x10

    .line 118
    .line 119
    aput-object v2, v4, p5

    .line 120
    .line 121
    const/16 p5, 0x11

    .line 122
    .line 123
    aput-object v3, v4, p5

    .line 124
    .line 125
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p5

    .line 129
    invoke-static {p5, p4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    const-class p5, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    .line 138
    .line 139
    invoke-interface {p4, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    const-class v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 152
    .line 153
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    move-object v4, p4

    .line 158
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 159
    .line 160
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 161
    .line 162
    .line 163
    move-result-object p4

    .line 164
    invoke-interface {p4, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-interface {p4, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p4

    .line 180
    move-object v5, p4

    .line 181
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 182
    .line 183
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 184
    .line 185
    .line 186
    move-result-object p4

    .line 187
    invoke-interface {p4, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 188
    .line 189
    .line 190
    move-result-object p4

    .line 191
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 196
    .line 197
    .line 198
    move-result-object p4

    .line 199
    const-class v0, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p4

    .line 205
    check-cast p4, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    move-object v0, p0

    .line 212
    move-object v1, p1

    .line 213
    move-object v2, p2

    .line 214
    move-object v7, p6

    .line 215
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;ILnet/bytebuddy/utility/AsmClassReader;)V

    .line 216
    .line 217
    .line 218
    iput-object p3, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 219
    .line 220
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-interface {p0, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    const-class p1, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    iput-boolean p0, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 249
    .line 250
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/utility/AsmClassReader;Z)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
            "Z)",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;"
        }
    .end annotation

    .line 1
    move-object v1, p0

    .line 2
    if-eqz p6, :cond_0

    .line 3
    .line 4
    new-instance p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithRetainedEnterType;

    .line 5
    .line 6
    move-object p6, p5

    .line 7
    move-object p5, p4

    .line 8
    move-object p4, p3

    .line 9
    move-object p3, p2

    .line 10
    move-object p2, p1

    .line 11
    move-object p1, v1

    .line 12
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithRetainedEnterType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/utility/AsmClassReader;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    move-object p6, p5

    .line 17
    move-object p5, p4

    .line 18
    move-object p4, p3

    .line 19
    move-object p3, p2

    .line 20
    move-object p2, p1

    .line 21
    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithDiscardedEnterType;

    .line 22
    .line 23
    move-object v2, p2

    .line 24
    move-object v3, p3

    .line 25
    move-object v4, p4

    .line 26
    move-object v5, p5

    .line 27
    move-object v6, p6

    .line 28
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter$WithDiscardedEnterType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/utility/AsmClassReader;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p4, v0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-interface {p5, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 12
    .line 13
    .line 14
    move-result-object p5

    .line 15
    invoke-interface {p6, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 16
    .line 17
    .line 18
    move-result-object p6

    .line 19
    invoke-virtual/range {p0 .. p11}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->doApply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;
    .locals 14

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$AdviceMethodInliner;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;

    .line 4
    .line 5
    move-object/from16 v12, p9

    .line 6
    .line 7
    invoke-interface {v1, v12}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;->bind(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 8
    .line 9
    .line 10
    move-result-object v10

    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    move-object/from16 v2, p10

    .line 16
    .line 17
    invoke-interface {v1, v3, v2}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;->bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    iget-object v13, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object/from16 v4, p3

    .line 26
    .line 27
    move-object/from16 v5, p4

    .line 28
    .line 29
    move-object/from16 v6, p5

    .line 30
    .line 31
    move-object/from16 v7, p6

    .line 32
    .line 33
    move-object/from16 v8, p7

    .line 34
    .line 35
    move-object/from16 v9, p8

    .line 36
    .line 37
    invoke-direct/range {v0 .. v13}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$AdviceMethodInliner;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/utility/AsmClassReader;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public doApply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v10, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->offsetMappings:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v4, v2

    .line 39
    check-cast v4, Lnet/bytebuddy/asm/Advice$OffsetMapping;

    .line 40
    .line 41
    sget-object v9, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->ENTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;

    .line 42
    .line 43
    move-object/from16 v7, p3

    .line 44
    .line 45
    move-object/from16 v8, p4

    .line 46
    .line 47
    move-object/from16 v5, p7

    .line 48
    .line 49
    move-object/from16 v6, p8

    .line 50
    .line 51
    invoke-interface/range {v4 .. v9}, Lnet/bytebuddy/asm/Advice$OffsetMapping;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v10, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;

    .line 60
    .line 61
    iget-object v9, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 62
    .line 63
    iget-object v14, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 64
    .line 65
    const/4 v15, 0x0

    .line 66
    move-object/from16 v2, p2

    .line 67
    .line 68
    move-object/from16 v8, p3

    .line 69
    .line 70
    move-object/from16 v3, p4

    .line 71
    .line 72
    move-object/from16 v4, p5

    .line 73
    .line 74
    move-object/from16 v5, p6

    .line 75
    .line 76
    move-object/from16 v6, p7

    .line 77
    .line 78
    move-object/from16 v7, p8

    .line 79
    .line 80
    move-object/from16 v11, p9

    .line 81
    .line 82
    move-object/from16 v12, p10

    .line 83
    .line 84
    move-object/from16 v13, p11

    .line 85
    .line 86
    move-object v0, v1

    .line 87
    move-object/from16 v1, p1

    .line 88
    .line 89
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$PostProcessor;Z)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 37
    .line 38
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    return v0
.end method

.method public getActualAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getNamedTypes()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public isPrependLineNumber()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 2
    .line 3
    return p0
.end method

.method public resolveInitializationTypes(Lnet/bytebuddy/asm/Advice$ArgumentHandler;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$ArgumentHandler;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodEnter;->namedTypes:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p1, v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->named(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v0
.end method
