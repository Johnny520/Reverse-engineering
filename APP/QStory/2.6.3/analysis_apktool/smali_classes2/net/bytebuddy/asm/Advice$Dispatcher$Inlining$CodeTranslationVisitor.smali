.class public Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CodeTranslationVisitor"
.end annotation


# instance fields
.field protected final adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field protected final argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final endOfMethod:Lnet/bytebuddy/jar/asm/Label;

.field private final exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final exit:Z

.field protected final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

.field protected final methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

.field private final offsetMappings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;"
        }
    .end annotation
.end field

.field private final postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

.field private final relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

.field protected final stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

.field private final suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/Map;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$PostProcessor;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Z)V"
        }
    .end annotation

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-static {p1, p7}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->of(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 11
    .line 12
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 13
    .line 14
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 15
    .line 16
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 17
    .line 18
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 19
    .line 20
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 23
    .line 24
    iput-object p8, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 25
    .line 26
    iput-object p9, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 27
    .line 28
    iput-object p10, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->offsetMappings:Ljava/util/Map;

    .line 29
    .line 30
    iput-object p11, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 31
    .line 32
    iput-object p12, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 33
    .line 34
    iput-object p13, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 35
    .line 36
    move-object/from16 p1, p14

    .line 37
    .line 38
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 39
    .line 40
    move/from16 p1, p15

    .line 41
    .line 42
    iput-boolean p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 43
    .line 44
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 45
    .line 46
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public propagateHandler(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    check-cast p0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->register(Lnet/bytebuddy/jar/asm/Label;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public visitAnnotableParameterCount(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher;->IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visitAnnotationDefault()Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher;->IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitCode()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onStart(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public visitEnd()V
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 12
    .line 13
    invoke-interface {v5}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onEnd(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 21
    .line 22
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_8

    .line 40
    .line 41
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 42
    .line 43
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_8

    .line 54
    .line 55
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 56
    .line 57
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 70
    .line 71
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 84
    .line 85
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 100
    .line 101
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 114
    .line 115
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 116
    .line 117
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 121
    .line 122
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 123
    .line 124
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 125
    .line 126
    if-eqz v1, :cond_1

    .line 127
    .line 128
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    goto :goto_0

    .line 133
    :cond_1
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :goto_0
    const/16 v2, 0x37

    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 145
    .line 146
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 151
    .line 152
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_4

    .line 157
    .line 158
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 159
    .line 160
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 161
    .line 162
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 166
    .line 167
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 168
    .line 169
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 170
    .line 171
    if-eqz v1, :cond_3

    .line 172
    .line 173
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    goto :goto_1

    .line 178
    :cond_3
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    :goto_1
    const/16 v2, 0x38

    .line 183
    .line 184
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :cond_4
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 190
    .line 191
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 196
    .line 197
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 204
    .line 205
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 206
    .line 207
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 211
    .line 212
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 213
    .line 214
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 215
    .line 216
    if-eqz v1, :cond_5

    .line 217
    .line 218
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    goto :goto_2

    .line 223
    :cond_5
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    :goto_2
    const/16 v2, 0x39

    .line 228
    .line 229
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_6
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 234
    .line 235
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_a

    .line 246
    .line 247
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 248
    .line 249
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 250
    .line 251
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 252
    .line 253
    .line 254
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 255
    .line 256
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 257
    .line 258
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 259
    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    goto :goto_3

    .line 267
    :cond_7
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    :goto_3
    const/16 v2, 0x3a

    .line 272
    .line 273
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_8
    :goto_4
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 278
    .line 279
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 280
    .line 281
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 285
    .line 286
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 287
    .line 288
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 289
    .line 290
    if-eqz v1, :cond_9

    .line 291
    .line 292
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    goto :goto_5

    .line 297
    :cond_9
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    :goto_5
    const/16 v2, 0x36

    .line 302
    .line 303
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 304
    .line 305
    .line 306
    :cond_a
    :goto_6
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 307
    .line 308
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 309
    .line 310
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 311
    .line 312
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 313
    .line 314
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 315
    .line 316
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 317
    .line 318
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 319
    .line 320
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 321
    .line 322
    invoke-interface/range {v1 .. v7}, Lnet/bytebuddy/asm/Advice$PostProcessor;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 327
    .line 328
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 329
    .line 330
    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 342
    .line 343
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 344
    .line 345
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 346
    .line 347
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 348
    .line 349
    iget-boolean v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->exit:Z

    .line 350
    .line 351
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 352
    .line 353
    if-eqz v4, :cond_b

    .line 354
    .line 355
    invoke-interface {v5}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    goto :goto_7

    .line 360
    :cond_b
    invoke-interface {v5}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    :goto_7
    invoke-interface {v1, v2, v3, v4}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;I)I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 369
    .line 370
    .line 371
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 372
    .line 373
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 374
    .line 375
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 376
    .line 377
    .line 378
    return-void
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
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
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

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

.method public visitIincInsn(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->offsetMappings:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 16
    .line 17
    invoke-interface {v0, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveIncrement(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 24
    .line 25
    invoke-interface {p2, v0, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-interface {p1, p0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;->requireStackSizePadding(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 38
    .line 39
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 40
    .line 41
    invoke-interface {p0, p1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;->mapped(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v0, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public visitInsn(I)V
    .locals 4

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 11
    .line 12
    check-cast p1, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 13
    .line 14
    invoke-virtual {p1}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 21
    .line 22
    check-cast v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 23
    .line 24
    const/16 v1, 0x19

    .line 25
    .line 26
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 27
    .line 28
    const/16 v3, 0x3a

    .line 29
    .line 30
    invoke-virtual {v0, v3, v1, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_2
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 39
    .line 40
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 41
    .line 42
    check-cast v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 43
    .line 44
    const/16 v1, 0x18

    .line 45
    .line 46
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 47
    .line 48
    const/16 v3, 0x39

    .line 49
    .line 50
    invoke-virtual {v0, v3, v1, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-interface {p1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_3
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 59
    .line 60
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 61
    .line 62
    check-cast v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 63
    .line 64
    const/16 v1, 0x17

    .line 65
    .line 66
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 67
    .line 68
    const/16 v3, 0x38

    .line 69
    .line 70
    invoke-virtual {v0, v3, v1, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-interface {p1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_4
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 79
    .line 80
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 81
    .line 82
    check-cast v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 83
    .line 84
    const/16 v1, 0x16

    .line 85
    .line 86
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 87
    .line 88
    const/16 v3, 0x37

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-interface {p1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_5
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 99
    .line 100
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 101
    .line 102
    check-cast v0, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;

    .line 103
    .line 104
    const/16 v1, 0x15

    .line 105
    .line 106
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 107
    .line 108
    const/16 v3, 0x36

    .line 109
    .line 110
    invoke-virtual {v0, v3, v1, v2}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->drainStack(IILnet/bytebuddy/implementation/bytecode/StackSize;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-interface {p1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 115
    .line 116
    .line 117
    :goto_0
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 118
    .line 119
    const/16 v0, 0xa7

    .line 120
    .line 121
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 122
    .line 123
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0xac
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitMaxs(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;->recordMaxima(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    return-void
.end method

.method public visitParameterAnnotation(ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher;->IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .param p2    # Lnet/bytebuddy/jar/asm/TypePath;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher;->IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visitVarInsn(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->offsetMappings:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    packed-switch p1, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    const-string p0, "Unexpected opcode: "

    .line 22
    .line 23
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object p2, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object p2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 50
    .line 51
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 52
    .line 53
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 54
    .line 55
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 56
    .line 57
    invoke-interface {p1, v1, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    sub-int/2addr p0, p1

    .line 70
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;->requireStackSizePadding(I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 75
    .line 76
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining$CodeTranslationVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 77
    .line 78
    invoke-interface {p0, p2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;->mapped(I)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :pswitch_data_1
    .packed-switch 0x36
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
