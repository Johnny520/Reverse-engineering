.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForMethodEnter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithDiscardedEnterType;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithRetainedEnterType;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final prependLineNumber:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/asm/Advice$Delegator;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    new-instance v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 6
    .line 7
    const-class v1, Lnet/bytebuddy/asm/Advice$Thrown;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 13
    .line 14
    const-class v2, Lnet/bytebuddy/asm/Advice$Enter;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 20
    .line 21
    const-class v3, Lnet/bytebuddy/asm/Advice$Local;

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;

    .line 27
    .line 28
    const-class v4, Lnet/bytebuddy/asm/Advice$Return;

    .line 29
    .line 30
    invoke-direct {v3, v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$Illegal;-><init>(Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    const/16 v4, 0x11

    .line 34
    .line 35
    new-array v4, v4, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 36
    .line 37
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    aput-object v5, v4, v6

    .line 41
    .line 42
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    aput-object v5, v4, v6

    .line 46
    .line 47
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;

    .line 48
    .line 49
    const/4 v6, 0x2

    .line 50
    aput-object v5, v4, v6

    .line 51
    .line 52
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;

    .line 53
    .line 54
    const/4 v6, 0x3

    .line 55
    aput-object v5, v4, v6

    .line 56
    .line 57
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 58
    .line 59
    const/4 v6, 0x4

    .line 60
    aput-object v5, v4, v6

    .line 61
    .line 62
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    .line 63
    .line 64
    const/4 v6, 0x5

    .line 65
    aput-object v5, v4, v6

    .line 66
    .line 67
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;

    .line 68
    .line 69
    const/4 v6, 0x6

    .line 70
    aput-object v5, v4, v6

    .line 71
    .line 72
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;

    .line 73
    .line 74
    const/4 v6, 0x7

    .line 75
    aput-object v5, v4, v6

    .line 76
    .line 77
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;

    .line 78
    .line 79
    const/16 v6, 0x8

    .line 80
    .line 81
    aput-object v5, v4, v6

    .line 82
    .line 83
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;

    .line 84
    .line 85
    const/16 v6, 0x9

    .line 86
    .line 87
    aput-object v5, v4, v6

    .line 88
    .line 89
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;

    .line 90
    .line 91
    const/16 v6, 0xa

    .line 92
    .line 93
    aput-object v5, v4, v6

    .line 94
    .line 95
    sget-object v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;

    .line 96
    .line 97
    const/16 v6, 0xb

    .line 98
    .line 99
    aput-object v5, v4, v6

    .line 100
    .line 101
    const/16 v5, 0xc

    .line 102
    .line 103
    aput-object p4, v4, v5

    .line 104
    .line 105
    const/16 p4, 0xd

    .line 106
    .line 107
    aput-object v0, v4, p4

    .line 108
    .line 109
    const/16 p4, 0xe

    .line 110
    .line 111
    aput-object v1, v4, p4

    .line 112
    .line 113
    const/16 p4, 0xf

    .line 114
    .line 115
    aput-object v2, v4, p4

    .line 116
    .line 117
    const/16 p4, 0x10

    .line 118
    .line 119
    aput-object v3, v4, p4

    .line 120
    .line 121
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    invoke-static {p4, p3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    const-class p4, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    .line 134
    .line 135
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    const-class v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 148
    .line 149
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    move-object v4, p3

    .line 154
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 155
    .line 156
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    move-object v5, p3

    .line 177
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 178
    .line 179
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    const-class v0, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    check-cast p3, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    move-object v0, p0

    .line 208
    move-object v1, p1

    .line 209
    move-object v2, p2

    .line 210
    move-object v7, p5

    .line 211
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;ILnet/bytebuddy/asm/Advice$Delegator;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    const-class p1, Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    iput-boolean p0, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 243
    .line 244
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Lnet/bytebuddy/asm/Advice$Delegator;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Z)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Z)",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;"
        }
    .end annotation

    .line 1
    move-object v1, p0

    .line 2
    if-eqz p5, :cond_0

    .line 3
    .line 4
    new-instance p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithRetainedEnterType;

    .line 5
    .line 6
    move-object p5, p2

    .line 7
    move-object p2, p1

    .line 8
    move-object p1, v1

    .line 9
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithRetainedEnterType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    move-object p5, p2

    .line 14
    move-object p2, p1

    .line 15
    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithDiscardedEnterType;

    .line 16
    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    move-object v5, p5

    .line 21
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter$WithDiscardedEnterType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public doResolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v6, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->offsetMappings:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->offsetMappings:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v7, v2

    .line 35
    check-cast v7, Lnet/bytebuddy/asm/Advice$OffsetMapping;

    .line 36
    .line 37
    sget-object v12, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->ENTER:Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;

    .line 38
    .line 39
    move-object/from16 v8, p1

    .line 40
    .line 41
    move-object/from16 v9, p2

    .line 42
    .line 43
    move-object/from16 v10, p5

    .line 44
    .line 45
    move-object/from16 v11, p6

    .line 46
    .line 47
    invoke-interface/range {v7 .. v12}, Lnet/bytebuddy/asm/Advice$OffsetMapping;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodEnter;

    .line 56
    .line 57
    iget-object v2, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 58
    .line 59
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v5, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 64
    .line 65
    iget-object v15, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 66
    .line 67
    move-object/from16 v3, p2

    .line 68
    .line 69
    move-object/from16 v7, p3

    .line 70
    .line 71
    move-object/from16 v8, p4

    .line 72
    .line 73
    move-object/from16 v4, p5

    .line 74
    .line 75
    move-object/from16 v9, p6

    .line 76
    .line 77
    move-object/from16 v10, p7

    .line 78
    .line 79
    move-object/from16 v11, p8

    .line 80
    .line 81
    move-object/from16 v12, p9

    .line 82
    .line 83
    move-object/from16 v13, p10

    .line 84
    .line 85
    move-object/from16 v14, p11

    .line 86
    .line 87
    move-object v0, v1

    .line 88
    move-object v1, v2

    .line 89
    move-object/from16 v2, p1

    .line 90
    .line 91
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodEnter;-><init>(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->equals(Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;

    .line 30
    .line 31
    iget-boolean p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    return v0
.end method

.method public getActualAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public isPrependLineNumber()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->prependLineNumber:Z

    .line 2
    .line 3
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;
    .locals 12

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 2
    .line 3
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object/from16 v2, p6

    .line 8
    .line 9
    invoke-interface {v2, v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 14
    .line 15
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object/from16 v2, p7

    .line 20
    .line 21
    invoke-interface {v2, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 26
    .line 27
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object/from16 v2, p8

    .line 32
    .line 33
    invoke-interface {v2, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;

    .line 38
    .line 39
    move-object/from16 v11, p9

    .line 40
    .line 41
    invoke-interface {v1, v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;->bind(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;

    .line 46
    .line 47
    move-object/from16 v3, p10

    .line 48
    .line 49
    invoke-interface {v1, p2, v3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;->bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    move-object v0, p0

    .line 54
    move-object v1, p1

    .line 55
    move-object v2, p2

    .line 56
    move-object v3, p3

    .line 57
    move-object/from16 v4, p4

    .line 58
    .line 59
    move-object/from16 v5, p5

    .line 60
    .line 61
    invoke-virtual/range {v0 .. v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodEnter;->doResolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
