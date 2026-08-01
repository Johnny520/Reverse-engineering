.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForMethodExit"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithoutExceptionHandler;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithExceptionHandler;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final backupArguments:Z

.field private final uninitializedNamedTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/description/type/TypeDefinition;)V
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p7}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForEnterValue$Factory;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p7

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
    aput-object p7, v2, v3

    .line 93
    .line 94
    const/16 p7, 0xd

    .line 95
    .line 96
    aput-object v0, v2, p7

    .line 97
    .line 98
    const/16 p7, 0xe

    .line 99
    .line 100
    aput-object v1, v2, p7

    .line 101
    .line 102
    sget-object p7, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;

    .line 103
    .line 104
    const/16 v0, 0xf

    .line 105
    .line 106
    aput-object p7, v2, v0

    .line 107
    .line 108
    const/16 p7, 0x10

    .line 109
    .line 110
    aput-object p3, v2, p7

    .line 111
    .line 112
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-static {p3, p5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

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
    const-class p5, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 125
    .line 126
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4500()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 131
    .line 132
    .line 133
    move-result-object p7

    .line 134
    invoke-interface {p3, p7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    const-class p7, Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    invoke-interface {p3, p7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

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
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

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
    invoke-interface {p3, p7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

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
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 179
    .line 180
    .line 181
    move-result-object p7

    .line 182
    invoke-interface {p3, p7}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    const-class p7, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-interface {p3, p7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

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
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;ILnet/bytebuddy/utility/AsmClassReader;)V

    .line 203
    .line 204
    .line 205
    iput-object p4, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

    .line 206
    .line 207
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-interface {p0, p5}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->access$4800()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const-class p1, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    check-cast p0, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    iput-boolean p0, v0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->backupArguments:Z

    .line 236
    .line 237
    return-void
.end method

.method private doApply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;
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
    sget-object v9, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->EXIT:Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;

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
    const/4 v15, 0x1

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

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
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
    move-object v9, v0

    .line 26
    check-cast v9, Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    const-class v0, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 29
    .line 30
    invoke-interface {v9, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithoutExceptionHandler;

    .line 37
    .line 38
    move-object v2, p0

    .line 39
    move-object v3, p1

    .line 40
    move-object v4, p2

    .line 41
    move-object v5, p3

    .line 42
    move-object v6, p4

    .line 43
    move-object v7, p5

    .line 44
    move-object/from16 v8, p6

    .line 45
    .line 46
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithoutExceptionHandler;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_0
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithExceptionHandler;

    .line 51
    .line 52
    move-object v2, p0

    .line 53
    move-object v3, p1

    .line 54
    move-object v4, p2

    .line 55
    move-object v5, p3

    .line 56
    move-object v6, p4

    .line 57
    move-object v7, p5

    .line 58
    move-object/from16 v8, p6

    .line 59
    .line 60
    invoke-direct/range {v1 .. v9}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit$WithExceptionHandler;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 3

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
    invoke-interface {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;->getThrowable()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {p4, v0, v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Z)Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-interface {p5, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 22
    .line 23
    .line 24
    move-result-object p5

    .line 25
    invoke-interface {p6, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 26
    .line 27
    .line 28
    move-result-object p6

    .line 29
    invoke-direct/range {p0 .. p11}, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->doApply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->backupArguments:Z

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->backupArguments:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

    .line 37
    .line 38
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

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

.method public getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;
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

.method public getArgumentHandlerFactory()Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->backupArguments:Z

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->backupArguments:Z

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public resolveInitializationTypes(Lnet/bytebuddy/asm/Advice$ArgumentHandler;)Ljava/util/Map;
    .locals 4
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
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved$ForMethodExit;->uninitializedNamedTypes:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p1, v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->named(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 51
    .line 52
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    invoke-interface {p1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$Resolved;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 73
    .line 74
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, p1, p0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_1
    return-object v0
.end method
