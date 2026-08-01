.class public abstract Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;
.super Lnet/bytebuddy/asm/Advice$AdviceVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AdviceVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "WithExitAdvice"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithExceptionHandling;,
        Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice$WithoutExceptionHandling;
    }
.end annotation


# instance fields
.field protected final returnHandler:Lnet/bytebuddy/jar/asm/Label;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Ljava/util/List;II)V
    .locals 0
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
    invoke-static {p1, p6}, Lnet/bytebuddy/utility/visitor/StackAwareMethodVisitor;->of(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct/range {p0 .. p11}, Lnet/bytebuddy/asm/Advice$AdviceVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;Ljava/util/List;II)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 9
    .line 10
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->returnHandler:Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_4

    .line 14
    .line 15
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 16
    .line 17
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 30
    .line 31
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 44
    .line 45
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 58
    .line 59
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 73
    .line 74
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    const/16 v0, 0x9

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 93
    .line 94
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    const/16 v0, 0xb

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 113
    .line 114
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    const/16 v0, 0xe

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 133
    .line 134
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 139
    .line 140
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_5

    .line 145
    .line 146
    const/4 v0, 0x1

    .line 147
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    :goto_0
    const/4 v0, 0x3

    .line 152
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 153
    .line 154
    .line 155
    :cond_5
    :goto_1
    const/16 v0, 0xa7

    .line 156
    .line 157
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->returnHandler:Lnet/bytebuddy/jar/asm/Label;

    .line 158
    .line 159
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public abstract onExitAdviceReturn()V
.end method

.method public onUserEnd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->returnHandler:Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->onUserReturn()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodExit:Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;

    .line 19
    .line 20
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;->apply()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->onExitAdviceReturn()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 27
    .line 28
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_5

    .line 39
    .line 40
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 41
    .line 42
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 55
    .line 56
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 69
    .line 70
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 83
    .line 84
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 99
    .line 100
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 105
    .line 106
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 113
    .line 114
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 115
    .line 116
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/16 v2, 0x16

    .line 121
    .line 122
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 126
    .line 127
    const/16 v1, 0xad

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_1

    .line 133
    .line 134
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 135
    .line 136
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 141
    .line 142
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 149
    .line 150
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 151
    .line 152
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    const/16 v2, 0x17

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 162
    .line 163
    const/16 v1, 0xae

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 170
    .line 171
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 176
    .line 177
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_3

    .line 182
    .line 183
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 184
    .line 185
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 186
    .line 187
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const/16 v2, 0x18

    .line 192
    .line 193
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 197
    .line 198
    const/16 v1, 0xaf

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 205
    .line 206
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 211
    .line 212
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 217
    .line 218
    if-nez v0, :cond_4

    .line 219
    .line 220
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 221
    .line 222
    invoke-interface {v0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/16 v2, 0x19

    .line 227
    .line 228
    invoke-virtual {v1, v2, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 232
    .line 233
    const/16 v1, 0xb0

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_4
    const/16 v0, 0xb1

    .line 240
    .line 241
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_5
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 246
    .line 247
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;

    .line 248
    .line 249
    invoke-interface {v1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    const/16 v2, 0x15

    .line 254
    .line 255
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 256
    .line 257
    .line 258
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 259
    .line 260
    const/16 v1, 0xac

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 263
    .line 264
    .line 265
    :goto_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

    .line 266
    .line 267
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 268
    .line 269
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 282
    .line 283
    .line 284
    return-void
.end method

.method public abstract onUserReturn()V
.end method

.method public onVisitInsn(I)V
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
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

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
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

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
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

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
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

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
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AdviceVisitor$WithExitAdvice;->returnHandler:Lnet/bytebuddy/jar/asm/Label;

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
