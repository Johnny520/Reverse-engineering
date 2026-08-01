.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForMethodExit"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithoutExceptionHandler;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithExceptionHandler;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final backupArguments:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/asm/Advice$Delegator;)V
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
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForEnterValue$Factory;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p5

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForLocalValue$Factory;

    .line 14
    .line 15
    invoke-direct {v1, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForLocalValue$Factory;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThrowable$Factory;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/16 v2, 0x11

    .line 23
    .line 24
    new-array v2, v2, [Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 25
    .line 26
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aput-object v3, v2, v4

    .line 30
    .line 31
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    aput-object v3, v2, v4

    .line 35
    .line 36
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    aput-object v3, v2, v4

    .line 40
    .line 41
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved$Factory;

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    aput-object v3, v2, v4

    .line 45
    .line 46
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$ReaderFactory;

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    aput-object v3, v2, v4

    .line 50
    .line 51
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WriterFactory;

    .line 52
    .line 53
    const/4 v4, 0x5

    .line 54
    aput-object v3, v2, v4

    .line 55
    .line 56
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;

    .line 57
    .line 58
    const/4 v4, 0x6

    .line 59
    aput-object v3, v2, v4

    .line 60
    .line 61
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$Factory;

    .line 62
    .line 63
    const/4 v4, 0x7

    .line 64
    aput-object v3, v2, v4

    .line 65
    .line 66
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForHandle$Factory;

    .line 67
    .line 68
    const/16 v4, 0x8

    .line 69
    .line 70
    aput-object v3, v2, v4

    .line 71
    .line 72
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;

    .line 73
    .line 74
    const/16 v4, 0x9

    .line 75
    .line 76
    aput-object v3, v2, v4

    .line 77
    .line 78
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForUnusedValue$Factory;

    .line 79
    .line 80
    const/16 v4, 0xa

    .line 81
    .line 82
    aput-object v3, v2, v4

    .line 83
    .line 84
    sget-object v3, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForStubValue;

    .line 85
    .line 86
    const/16 v4, 0xb

    .line 87
    .line 88
    aput-object v3, v2, v4

    .line 89
    .line 90
    const/16 v3, 0xc

    .line 91
    .line 92
    aput-object p5, v2, v3

    .line 93
    .line 94
    const/16 p5, 0xd

    .line 95
    .line 96
    aput-object v0, v2, p5

    .line 97
    .line 98
    const/16 p5, 0xe

    .line 99
    .line 100
    aput-object v1, v2, p5

    .line 101
    .line 102
    sget-object p5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;

    .line 103
    .line 104
    const/16 v0, 0xf

    .line 105
    .line 106
    aput-object p5, v2, v0

    .line 107
    .line 108
    const/16 p5, 0x10

    .line 109
    .line 110
    aput-object p3, v2, p5

    .line 111
    .line 112
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-static {p3, p4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    const-class p4, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 125
    .line 126
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4500()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 131
    .line 132
    .line 133
    move-result-object p5

    .line 134
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    const-class p5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    move-object v4, p3

    .line 145
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 146
    .line 147
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4600()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    move-object v5, p3

    .line 168
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 169
    .line 170
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    invoke-interface {p3, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 179
    .line 180
    .line 181
    move-result-object p5

    .line 182
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    const-class p5, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p3

    .line 192
    check-cast p3, Ljava/lang/Integer;

    .line 193
    .line 194
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    move-object v0, p0

    .line 199
    move-object v1, p1

    .line 200
    move-object v2, p2

    .line 201
    move-object v7, p6

    .line 202
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;ILnet/bytebuddy/asm/Advice$Delegator;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p0, p4}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4800()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    const-class p1, Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    check-cast p0, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    iput-boolean p0, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->backupArguments:Z

    .line 234
    .line 235
    return-void
.end method

.method private doResolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;
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
    sget-object v12, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->EXIT:Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;

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
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodExit;

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
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodExit;-><init>(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Lnet/bytebuddy/asm/Advice$Delegator;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$2700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v7, v0

    .line 26
    check-cast v7, Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    const-class v0, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 29
    .line 30
    invoke-interface {v7, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance v8, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithoutExceptionHandler;

    .line 37
    .line 38
    move-object v9, p0

    .line 39
    move-object/from16 v10, p1

    .line 40
    .line 41
    move-object/from16 v14, p2

    .line 42
    .line 43
    move-object/from16 v11, p3

    .line 44
    .line 45
    move-object/from16 v12, p4

    .line 46
    .line 47
    move-object/from16 v13, p5

    .line 48
    .line 49
    invoke-direct/range {v8 .. v14}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithoutExceptionHandler;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 50
    .line 51
    .line 52
    return-object v8

    .line 53
    :cond_0
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithExceptionHandler;

    .line 54
    .line 55
    move-object v2, p0

    .line 56
    move-object/from16 v3, p1

    .line 57
    .line 58
    move-object/from16 v8, p2

    .line 59
    .line 60
    move-object/from16 v4, p3

    .line 61
    .line 62
    move-object/from16 v5, p4

    .line 63
    .line 64
    move-object/from16 v6, p5

    .line 65
    .line 66
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit$WithExceptionHandler;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$Delegator;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method


# virtual methods
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
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->backupArguments:Z

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;

    .line 30
    .line 31
    iget-boolean p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->backupArguments:Z

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

.method public getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;
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

.method public getArgumentHandlerFactory()Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->backupArguments:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;->COPYING:Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;->SIMPLE:Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;

    .line 9
    .line 10
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
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->backupArguments:Z

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
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
    invoke-interface {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;->getThrowable()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-class v3, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 12
    .line 13
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    move-object/from16 v3, p6

    .line 18
    .line 19
    invoke-interface {v3, v1, v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Z)Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 24
    .line 25
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object/from16 v2, p7

    .line 30
    .line 31
    invoke-interface {v2, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 36
    .line 37
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$Delegator;->getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object/from16 v2, p8

    .line 42
    .line 43
    invoke-interface {v2, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;

    .line 48
    .line 49
    move-object/from16 v11, p9

    .line 50
    .line 51
    invoke-interface {v1, v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;->bind(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$AbstractBase;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;

    .line 56
    .line 57
    move-object/from16 v3, p10

    .line 58
    .line 59
    invoke-interface {v1, p2, v3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;->bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    move-object v0, p0

    .line 64
    move-object v1, p1

    .line 65
    move-object v2, p2

    .line 66
    move-object v3, p3

    .line 67
    move-object/from16 v4, p4

    .line 68
    .line 69
    move-object/from16 v5, p5

    .line 70
    .line 71
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$ForMethodExit;->doResolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method
