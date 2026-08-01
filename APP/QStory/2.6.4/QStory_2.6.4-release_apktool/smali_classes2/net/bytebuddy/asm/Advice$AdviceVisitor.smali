.class public abstract Lnet/bytebuddy/asm/Advice$AdviceVisitor;
.super Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AdviceVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;,
        Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithoutExitAdvice;
    }
.end annotation


# static fields
.field private static final THIS_VARIABLE_INDEX:I = 0x0

.field private static final THIS_VARIABLE_NAME:Ljava/lang/String; = "this"


# instance fields
.field protected final argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

.field protected final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

.field protected final methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

.field protected final methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

.field private final preparationStart:Lnet/bytebuddy/jar/asm/Label;

.field protected final stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Ljava/util/List;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v2, p6

    .line 4
    .line 5
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 6
    .line 7
    move-object/from16 v6, p1

    .line 8
    .line 9
    invoke-direct {v10, v0, v6}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 10
    .line 11
    .line 12
    iput-object v2, v10, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 15
    .line 16
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v7, v10, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->preparationStart:Lnet/bytebuddy/jar/asm/Label;

    .line 20
    .line 21
    new-instance v0, Ljava/util/TreeMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved;->getNamedTypes()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved;->getNamedTypes()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;->getArgumentHandlerFactory()Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v1, v2, v3, v4, v0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/SortedMap;)Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    iput-object v8, v10, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 57
    .line 58
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_0
    invoke-interface {v8}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->getNamedTypes()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v0, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;->getActualAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 104
    .line 105
    :goto_1
    move-object v14, v0

    .line 106
    goto :goto_2

    .line 107
    :cond_1
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;->getActualAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_1

    .line 120
    :goto_2
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 131
    .line 132
    :goto_3
    move-object v15, v0

    .line 133
    goto :goto_4

    .line 134
    :cond_2
    invoke-interface/range {p7 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher;->getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_3

    .line 147
    :goto_4
    invoke-interface {v8}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->isCopyingArguments()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    move-object/from16 v3, p9

    .line 152
    .line 153
    move/from16 v5, p10

    .line 154
    .line 155
    move-object v0, v2

    .line 156
    move-object v1, v13

    .line 157
    move-object v2, v15

    .line 158
    invoke-static/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->of(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZI)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iput-object v4, v10, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 163
    .line 164
    invoke-interface/range {p8 .. p8}, Lnet/bytebuddy/asm/Advice$Dispatcher;->isAlive()Z

    .line 165
    .line 166
    .line 167
    move-result v17

    .line 168
    invoke-interface {v8}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->isCopyingArguments()Z

    .line 169
    .line 170
    .line 171
    move-result v18

    .line 172
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;

    .line 173
    .line 174
    .line 175
    move-result-object v19

    .line 176
    move-object/from16 v11, p5

    .line 177
    .line 178
    move-object/from16 v12, p6

    .line 179
    .line 180
    move-object/from16 v16, p9

    .line 181
    .line 182
    move/from16 v20, p10

    .line 183
    .line 184
    move/from16 v21, p11

    .line 185
    .line 186
    invoke-static/range {v11 .. v21}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLnet/bytebuddy/ClassFileVersion;II)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iput-object v0, v10, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 191
    .line 192
    move-object/from16 v5, p3

    .line 193
    .line 194
    move-object/from16 v9, p4

    .line 195
    .line 196
    move-object/from16 v1, p5

    .line 197
    .line 198
    move-object/from16 v2, p6

    .line 199
    .line 200
    move-object v3, v6

    .line 201
    move-object v11, v7

    .line 202
    move-object v6, v8

    .line 203
    move-object v8, v0

    .line 204
    move-object v7, v4

    .line 205
    move-object/from16 v4, p2

    .line 206
    .line 207
    move-object/from16 v0, p7

    .line 208
    .line 209
    invoke-interface/range {v0 .. v10}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    move-object v12, v10

    .line 214
    iput-object v0, v12, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 215
    .line 216
    new-instance v10, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation$ForLabel;

    .line 217
    .line 218
    invoke-direct {v10, v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation$ForLabel;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v3, p1

    .line 222
    .line 223
    move-object/from16 v0, p8

    .line 224
    .line 225
    invoke-interface/range {v0 .. v10}, Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iput-object v0, v12, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 230
    .line 231
    return-void
.end method


# virtual methods
.method public onAfterExceptionTable()V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->prepare()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->onUserPrepare()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 10
    .line 11
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->prepare()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 15
    .line 16
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->initialize()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 20
    .line 21
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->initialize()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 25
    .line 26
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->injectInitializationFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodEnter:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 32
    .line 33
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->apply()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 37
    .line 38
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->preparationStart:Lnet/bytebuddy/jar/asm/Label;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 44
    .line 45
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 46
    .line 47
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 48
    .line 49
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;->prepare(Lnet/bytebuddy/jar/asm/MethodVisitor;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 57
    .line 58
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 59
    .line 60
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;->injectStartFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->onUserStart()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public abstract onUserEnd()V
.end method

.method public abstract onUserPrepare()V
.end method

.method public abstract onUserStart()V
.end method

.method public onVisitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 7
    .param p3    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    move v2, p1

    .line 6
    move v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onVisitIincInsn(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onVisitVarInsn(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 4
    .line 5
    invoke-interface {p0, p2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;I)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    iget-object p0, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 3
    .line 4
    if-nez p6, :cond_0

    .line 5
    .line 6
    const-string v1, "this"

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 16
    .line 17
    invoke-interface {v0, p6}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 18
    .line 19
    .line 20
    move-result p6

    .line 21
    :goto_0
    invoke-virtual/range {p0 .. p6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public visitLocalVariableAnnotation(ILnet/bytebuddy/jar/asm/TypePath;[Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;[ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 4

    .line 1
    array-length v0, p5

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p5

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 9
    .line 10
    aget v3, p5, v1

    .line 11
    .line 12
    invoke-interface {v2, v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    aput v2, v0, v1

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 22
    .line 23
    move-object p5, v0

    .line 24
    invoke-virtual/range {p0 .. p7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLocalVariableAnnotation(ILnet/bytebuddy/jar/asm/TypePath;[Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;[ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public visitMaxs(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->onUserEnd()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->compoundStackSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 13
    .line 14
    invoke-interface {p0, p2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;->compoundLocalVariableLength(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
