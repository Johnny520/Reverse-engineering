.class final Lcom/android/dx/cf/code/RopperMachine;
.super Lcom/android/dx/cf/code/ValueAwareMachine;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final ARRAY_REFLECT_TYPE:Lcom/android/dx/rop/cst/CstType;

.field private static final MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;


# instance fields
.field private final advice:Lcom/android/dx/rop/code/TranslationAdvice;

.field private blockCanThrow:Z

.field private catches:Lcom/android/dx/rop/type/TypeList;

.field private catchesUsed:Z

.field private extraBlockCount:I

.field private hasJsr:Z

.field private final insns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/Insn;",
            ">;"
        }
    .end annotation
.end field

.field private final maxLocals:I

.field private final method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private final methods:Lcom/android/dx/cf/iface/MethodList;

.field private primarySuccessorIndex:I

.field private returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

.field private returnOp:Lcom/android/dx/rop/code/Rop;

.field private returnPosition:Lcom/android/dx/rop/code/SourcePosition;

.field private returns:Z

.field private final ropper:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    const-string v1, "java/lang/reflect/Array"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/android/dx/rop/type/Type;->internClassName(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/android/dx/cf/code/RopperMachine;->ARRAY_REFLECT_TYPE:Lcom/android/dx/rop/cst/CstType;

    .line 13
    .line 14
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 15
    .line 16
    new-instance v2, Lcom/android/dx/rop/cst/CstNat;

    .line 17
    .line 18
    new-instance v3, Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    const-string v4, "newInstance"

    .line 21
    .line 22
    invoke-direct {v3, v4}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lcom/android/dx/rop/cst/CstString;

    .line 26
    .line 27
    const-string v5, "(Ljava/lang/Class;[I)Ljava/lang/Object;"

    .line 28
    .line 29
    invoke-direct {v4, v5}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lcom/android/dx/cf/code/RopperMachine;->MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/ValueAwareMachine;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p4, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->ropper:Lcom/android/dx/cf/code/Ropper;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/android/dx/cf/code/RopperMachine;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxLocals()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->maxLocals:I

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 p2, 0x19

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 42
    .line 43
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 44
    .line 45
    const/4 p2, -0x1

    .line 46
    iput p2, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 47
    .line 48
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 49
    .line 50
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 51
    .line 52
    iput-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string p0, "advice == null"

    .line 58
    .line 59
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    const-string p0, "ropper == null"

    .line 64
    .line 65
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-string p0, "methods == null"

    .line 70
    .line 71
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method private getSources(II)Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->argCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getLocalIndex()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    new-instance p1, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 19
    .line 20
    invoke-direct {p1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, v3, p0}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    new-instance v1, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    move v4, v3

    .line 41
    :goto_0
    if-ge v4, v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v4}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {p2, v5}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v1, v4, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    add-int/2addr p2, v5

    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/16 p0, 0x4f

    .line 63
    .line 64
    const-string p2, "shouldn\'t happen"

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    if-eq p1, p0, :cond_5

    .line 68
    .line 69
    const/16 p0, 0xb5

    .line 70
    .line 71
    if-eq p1, p0, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    if-ne v0, v4, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {v1, v3, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2, p0}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    invoke-static {p2}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :cond_5
    const/4 p0, 0x3

    .line 97
    if-ne v0, p0, :cond_6

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {v1, v3, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2, p0}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v4, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    move-object p1, v1

    .line 121
    :goto_3
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_6
    invoke-static {p2}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1
.end method

.method private jopToRopOpcode(ILcom/android/dx/rop/cst/Constant;)I
    .locals 3

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    if-eq p1, v0, :cond_a

    .line 6
    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    if-eq p1, v1, :cond_9

    .line 10
    .line 11
    const/16 v2, 0xab

    .line 12
    .line 13
    if-eq p1, v2, :cond_8

    .line 14
    .line 15
    const/16 v2, 0xac

    .line 16
    .line 17
    if-eq p1, v2, :cond_7

    .line 18
    .line 19
    const/16 v2, 0xc6

    .line 20
    .line 21
    if-eq p1, v2, :cond_6

    .line 22
    .line 23
    const/16 v2, 0xc7

    .line 24
    .line 25
    if-eq p1, v2, :cond_5

    .line 26
    .line 27
    sparse-switch p1, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/16 v1, 0x34

    .line 35
    .line 36
    packed-switch p1, :pswitch_data_1

    .line 37
    .line 38
    .line 39
    const-string p0, "shouldn\'t happen"

    .line 40
    .line 41
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :pswitch_0
    const/16 p0, 0x25

    .line 46
    .line 47
    return p0

    .line 48
    :pswitch_1
    const/16 p0, 0x24

    .line 49
    .line 50
    return p0

    .line 51
    :pswitch_2
    const/16 p0, 0x2c

    .line 52
    .line 53
    return p0

    .line 54
    :pswitch_3
    const/16 p0, 0x2b

    .line 55
    .line 56
    return p0

    .line 57
    :pswitch_4
    const/16 p0, 0x23

    .line 58
    .line 59
    return p0

    .line 60
    :pswitch_5
    const/16 p0, 0x22

    .line 61
    .line 62
    return p0

    .line 63
    :pswitch_6
    const/16 p0, 0x29

    .line 64
    .line 65
    return p0

    .line 66
    :pswitch_7
    const/16 p0, 0x28

    .line 67
    .line 68
    return p0

    .line 69
    :pswitch_8
    const/16 p0, 0x3b

    .line 70
    .line 71
    return p0

    .line 72
    :pswitch_9
    const/16 p0, 0x35

    .line 73
    .line 74
    return p0

    .line 75
    :pswitch_a
    const/16 p0, 0x31

    .line 76
    .line 77
    return p0

    .line 78
    :pswitch_b
    check-cast p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isInstanceInit()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_1

    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p1, p0}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    const/16 p0, 0x33

    .line 104
    .line 105
    return p0

    .line 106
    :cond_1
    :goto_0
    return v1

    .line 107
    :pswitch_c
    check-cast p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 108
    .line 109
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object v2, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 114
    .line 115
    invoke-virtual {v2}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {p1, v2}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    :goto_1
    iget-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 126
    .line 127
    invoke-interface {p1}, Lcom/android/dx/cf/iface/MethodList;->size()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-ge v0, p1, :cond_3

    .line 132
    .line 133
    iget-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 134
    .line 135
    invoke-interface {p1, v0}, Lcom/android/dx/cf/iface/MethodList;->get(I)Lcom/android/dx/cf/iface/Method;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p1}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-static {v2}, Lcom/android/dx/rop/code/AccessFlags;->isPrivate(I)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_2

    .line 148
    .line 149
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-interface {p1}, Lcom/android/dx/cf/iface/Member;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v2, p1}, Lcom/android/dx/rop/cst/CstNat;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_2

    .line 162
    .line 163
    return v1

    .line 164
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eqz p0, :cond_4

    .line 172
    .line 173
    const/16 p0, 0x3a

    .line 174
    .line 175
    return p0

    .line 176
    :cond_4
    const/16 p0, 0x32

    .line 177
    .line 178
    return p0

    .line 179
    :pswitch_d
    const/16 p0, 0x2f

    .line 180
    .line 181
    return p0

    .line 182
    :pswitch_e
    const/16 p0, 0x2d

    .line 183
    .line 184
    return p0

    .line 185
    :pswitch_f
    const/16 p0, 0x30

    .line 186
    .line 187
    return p0

    .line 188
    :pswitch_10
    const/16 p0, 0x2e

    .line 189
    .line 190
    return p0

    .line 191
    :pswitch_11
    const/4 p0, 0x6

    .line 192
    return p0

    .line 193
    :pswitch_12
    const/16 p0, 0xb

    .line 194
    .line 195
    return p0

    .line 196
    :pswitch_13
    const/16 p0, 0xc

    .line 197
    .line 198
    return p0

    .line 199
    :pswitch_14
    const/16 p0, 0xa

    .line 200
    .line 201
    return p0

    .line 202
    :pswitch_15
    const/16 p0, 0x9

    .line 203
    .line 204
    return p0

    .line 205
    :pswitch_16
    const/16 p0, 0x1c

    .line 206
    .line 207
    return p0

    .line 208
    :pswitch_17
    const/16 p0, 0x1b

    .line 209
    .line 210
    return p0

    .line 211
    :pswitch_18
    const/16 p0, 0x20

    .line 212
    .line 213
    return p0

    .line 214
    :pswitch_19
    const/16 p0, 0x1f

    .line 215
    .line 216
    return p0

    .line 217
    :pswitch_1a
    const/16 p0, 0x1e

    .line 218
    .line 219
    return p0

    .line 220
    :pswitch_1b
    const/16 p0, 0x1d

    .line 221
    .line 222
    return p0

    .line 223
    :sswitch_0
    const/16 p0, 0x16

    .line 224
    .line 225
    return p0

    .line 226
    :sswitch_1
    return v1

    .line 227
    :sswitch_2
    return v0

    .line 228
    :sswitch_3
    const/16 p0, 0x19

    .line 229
    .line 230
    return p0

    .line 231
    :sswitch_4
    const/16 p0, 0x18

    .line 232
    .line 233
    return p0

    .line 234
    :sswitch_5
    const/16 p0, 0x17

    .line 235
    .line 236
    return p0

    .line 237
    :sswitch_6
    const/16 p0, 0x13

    .line 238
    .line 239
    return p0

    .line 240
    :sswitch_7
    const/16 p0, 0x12

    .line 241
    .line 242
    return p0

    .line 243
    :sswitch_8
    const/16 p0, 0x11

    .line 244
    .line 245
    return p0

    .line 246
    :sswitch_9
    const/16 p0, 0x10

    .line 247
    .line 248
    return p0

    .line 249
    :sswitch_a
    const/16 p0, 0xf

    .line 250
    .line 251
    return p0

    .line 252
    :pswitch_1c
    :sswitch_b
    const/16 p0, 0xe

    .line 253
    .line 254
    return p0

    .line 255
    :sswitch_c
    const/16 p0, 0x27

    .line 256
    .line 257
    return p0

    .line 258
    :sswitch_d
    const/16 p0, 0x26

    .line 259
    .line 260
    return p0

    .line 261
    :cond_5
    :pswitch_1d
    const/16 p0, 0x8

    .line 262
    .line 263
    return p0

    .line 264
    :cond_6
    :pswitch_1e
    const/4 p0, 0x7

    .line 265
    return p0

    .line 266
    :cond_7
    :pswitch_1f
    const/16 p0, 0x21

    .line 267
    .line 268
    return p0

    .line 269
    :cond_8
    const/16 p0, 0xd

    .line 270
    .line 271
    return p0

    .line 272
    :cond_9
    :sswitch_e
    const/4 p0, 0x2

    .line 273
    return p0

    .line 274
    :cond_a
    :sswitch_f
    const/4 p0, 0x5

    .line 275
    return p0

    .line 276
    :cond_b
    :sswitch_10
    const/4 p0, 0x1

    .line 277
    return p0

    .line 278
    nop

    .line 279
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_10
        0x12 -> :sswitch_f
        0x2e -> :sswitch_d
        0x36 -> :sswitch_e
        0x4f -> :sswitch_c
        0x60 -> :sswitch_b
        0x64 -> :sswitch_a
        0x68 -> :sswitch_9
        0x6c -> :sswitch_8
        0x70 -> :sswitch_7
        0x74 -> :sswitch_6
        0x78 -> :sswitch_5
        0x7a -> :sswitch_4
        0x7c -> :sswitch_3
        0x7e -> :sswitch_2
        0x80 -> :sswitch_1
        0x82 -> :sswitch_0
    .end sparse-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :pswitch_data_0
    .packed-switch 0x84
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_1e
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1e
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1e
        :pswitch_1d
        :pswitch_11
    .end packed-switch

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    :pswitch_data_1
    .packed-switch 0xb1
        :pswitch_1f
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private makeInvokePolymorphicInsn(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Insn;
    .locals 0

    .line 1
    check-cast p5, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    new-instance p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;

    .line 4
    .line 5
    invoke-direct/range {p0 .. p5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method private updateReturnOp(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-ne v0, p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-le p1, v0, :cond_1

    .line 27
    .line 28
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :cond_2
    new-instance p2, Lcom/android/dx/cf/code/SimException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, "return op mismatch: "

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 44
    .line 45
    const-string p1, ", "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p2, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :cond_3
    const-string p0, "pos == null"

    .line 62
    .line 63
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    const-string p0, "op == null"

    .line 68
    .line 69
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public canThrow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 2
    .line 3
    return p0
.end method

.method public getExtraBlockCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 2
    .line 3
    return p0
.end method

.method public getInsns()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/Insn;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrimarySuccessorIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public getReturnAddress()Lcom/android/dx/cf/code/ReturnAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnOp()Lcom/android/dx/rop/code/Rop;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnPosition()Lcom/android/dx/rop/code/SourcePosition;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasJsr()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    .line 2
    .line 3
    return p0
.end method

.method public hasRet()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public returns()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 2
    .line 3
    return p0
.end method

.method public run(Lcom/android/dx/cf/code/Frame;II)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget v2, v0, Lcom/android/dx/cf/code/RopperMachine;->maxLocals:I

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Lcom/android/dx/cf/code/ExecutionStack;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v3, v2

    .line 16
    invoke-direct {v0, v1, v3}, Lcom/android/dx/cf/code/RopperMachine;->getSources(II)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    invoke-virtual {v7}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-super/range {p0 .. p3}, Lcom/android/dx/cf/code/ValueAwareMachine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 28
    .line 29
    move/from16 v5, p2

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    const/16 v4, 0x36

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x1

    .line 39
    if-ne v1, v4, :cond_0

    .line 40
    .line 41
    move v4, v15

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v4, v14

    .line 44
    :goto_0
    invoke-virtual {v0, v4}, Lcom/android/dx/cf/code/BaseMachine;->getLocalTarget(Z)Lcom/android/dx/rop/code/RegisterSpec;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BaseMachine;->resultCount()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v11, 0x0

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    const/16 v3, 0x57

    .line 56
    .line 57
    if-eq v1, v3, :cond_1e

    .line 58
    .line 59
    const/16 v3, 0x58

    .line 60
    .line 61
    if-eq v1, v3, :cond_1e

    .line 62
    .line 63
    move-object v3, v11

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    if-eqz v4, :cond_2

    .line 66
    .line 67
    :goto_1
    move-object v3, v4

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    if-ne v5, v15, :cond_1c

    .line 70
    .line 71
    invoke-virtual {v0, v14}, Lcom/android/dx/cf/code/BaseMachine;->result(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v3, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    goto :goto_1

    .line 80
    :goto_2
    if-eqz v3, :cond_3

    .line 81
    .line 82
    move-object v12, v3

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    sget-object v4, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 85
    .line 86
    move-object v12, v4

    .line 87
    :goto_3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    const/16 v4, 0xc5

    .line 92
    .line 93
    if-ne v1, v4, :cond_6

    .line 94
    .line 95
    iput-boolean v15, v0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 96
    .line 97
    const/4 v1, 0x6

    .line 98
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getNextReg()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    sget-object v4, Lcom/android/dx/rop/type/Type;->INT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 105
    .line 106
    invoke-static {v1, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v4, v2}, Lcom/android/dx/rop/code/Rops;->opFilledNewArray(Lcom/android/dx/rop/type/TypeBearer;I)Lcom/android/dx/rop/code/Rop;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    move-object v6, v4

    .line 115
    new-instance v4, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 116
    .line 117
    iget-object v8, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 118
    .line 119
    sget-object v9, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 120
    .line 121
    move-object/from16 v17, v10

    .line 122
    .line 123
    move-object v10, v6

    .line 124
    move-object/from16 v6, v17

    .line 125
    .line 126
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 127
    .line 128
    .line 129
    iget-object v5, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    invoke-static {v10}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    new-instance v5, Lcom/android/dx/rop/code/PlainInsn;

    .line 139
    .line 140
    sget-object v7, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 141
    .line 142
    invoke-direct {v5, v4, v6, v1, v7}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 143
    .line 144
    .line 145
    iget-object v4, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-object v4, v13

    .line 151
    check-cast v4, Lcom/android/dx/rop/cst/CstType;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    move v5, v14

    .line 158
    :goto_4
    if-ge v5, v2, :cond_4

    .line 159
    .line 160
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    add-int/lit8 v5, v5, 0x1

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_4
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    sget-object v7, Lcom/android/dx/rop/type/Type;->CLASS:Lcom/android/dx/rop/type/Type;

    .line 172
    .line 173
    invoke-static {v5, v7}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Type;->isPrimitive()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_5

    .line 182
    .line 183
    move-object v7, v13

    .line 184
    invoke-static {v4}, Lcom/android/dx/rop/cst/CstFieldRef;->forPrimitiveType(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstFieldRef;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    new-instance v8, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 189
    .line 190
    sget-object v9, Lcom/android/dx/rop/code/Rops;->GET_STATIC_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 191
    .line 192
    move-object v4, v11

    .line 193
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 194
    .line 195
    move-object v10, v12

    .line 196
    iget-object v12, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 197
    .line 198
    move-object/from16 v17, v6

    .line 199
    .line 200
    move-object v6, v4

    .line 201
    move-object v4, v10

    .line 202
    move-object/from16 v10, v17

    .line 203
    .line 204
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_5
    move-object v10, v6

    .line 209
    move-object v6, v11

    .line 210
    move-object v8, v12

    .line 211
    move-object v7, v13

    .line 212
    new-instance v9, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 213
    .line 214
    move-object v11, v8

    .line 215
    move-object v8, v9

    .line 216
    sget-object v9, Lcom/android/dx/rop/code/Rops;->CONST_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 217
    .line 218
    move-object v12, v11

    .line 219
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 220
    .line 221
    move-object v13, v12

    .line 222
    iget-object v12, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 223
    .line 224
    move-object/from16 v16, v13

    .line 225
    .line 226
    new-instance v13, Lcom/android/dx/rop/cst/CstType;

    .line 227
    .line 228
    invoke-direct {v13, v4}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 229
    .line 230
    .line 231
    move-object/from16 v4, v16

    .line 232
    .line 233
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 234
    .line 235
    .line 236
    :goto_5
    iget-object v9, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-static {v8}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    new-instance v9, Lcom/android/dx/rop/code/PlainInsn;

    .line 250
    .line 251
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 252
    .line 253
    invoke-direct {v9, v8, v10, v5, v11}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 254
    .line 255
    .line 256
    iget-object v8, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    sget-object v9, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 266
    .line 267
    invoke-static {v8, v9}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    move-object v9, v8

    .line 272
    new-instance v8, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 273
    .line 274
    sget-object v13, Lcom/android/dx/cf/code/RopperMachine;->MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 275
    .line 276
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    invoke-static {v12}, Lcom/android/dx/rop/code/Rops;->opInvokeStatic(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    invoke-static {v5, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    move-object v5, v9

    .line 289
    move-object v9, v12

    .line 290
    iget-object v12, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 291
    .line 292
    move-object/from16 v17, v11

    .line 293
    .line 294
    move-object v11, v1

    .line 295
    move-object/from16 v1, v17

    .line 296
    .line 297
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 298
    .line 299
    .line 300
    iget-object v9, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    invoke-virtual {v8}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-static {v8}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    new-instance v9, Lcom/android/dx/rop/code/PlainInsn;

    .line 318
    .line 319
    invoke-direct {v9, v8, v10, v5, v1}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 320
    .line 321
    .line 322
    iget-object v1, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 323
    .line 324
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    invoke-static {v5}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const/16 v5, 0xc0

    .line 332
    .line 333
    move/from16 v17, v5

    .line 334
    .line 335
    move-object v5, v1

    .line 336
    move/from16 v1, v17

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_6
    move-object v5, v7

    .line 340
    move-object v6, v11

    .line 341
    move-object v4, v12

    .line 342
    move-object v7, v13

    .line 343
    const/16 v8, 0xa8

    .line 344
    .line 345
    if-ne v1, v8, :cond_7

    .line 346
    .line 347
    iput-boolean v15, v0, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    .line 348
    .line 349
    return-void

    .line 350
    :cond_7
    const/16 v8, 0xa9

    .line 351
    .line 352
    if-ne v1, v8, :cond_8

    .line 353
    .line 354
    :try_start_0
    invoke-virtual {v0, v14}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, Lcom/android/dx/cf/code/ReturnAddress;

    .line 359
    .line 360
    iput-object v1, v0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    .line 362
    return-void

    .line 363
    :catch_0
    move-exception v0

    .line 364
    const-string v1, "Argument to RET was not a ReturnAddress"

    .line 365
    .line 366
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :cond_8
    :goto_6
    invoke-direct {v0, v1, v7}, Lcom/android/dx/cf/code/RopperMachine;->jopToRopOpcode(ILcom/android/dx/rop/cst/Constant;)I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    invoke-static {v8, v4, v5, v7}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    if-eqz v3, :cond_a

    .line 379
    .line 380
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->isCallLike()Z

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    if-eqz v11, :cond_a

    .line 385
    .line 386
    iget v11, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 387
    .line 388
    add-int/2addr v11, v15

    .line 389
    iput v11, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 390
    .line 391
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    const/16 v12, 0x3b

    .line 396
    .line 397
    if-ne v11, v12, :cond_9

    .line 398
    .line 399
    move-object v13, v7

    .line 400
    check-cast v13, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 401
    .line 402
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    goto :goto_7

    .line 407
    :cond_9
    move-object v13, v7

    .line 408
    check-cast v13, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 409
    .line 410
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    invoke-virtual {v11}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    :goto_7
    new-instance v12, Lcom/android/dx/rop/code/PlainInsn;

    .line 419
    .line 420
    invoke-static {v11}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    sget-object v13, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 425
    .line 426
    invoke-direct {v12, v11, v10, v3, v13}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 427
    .line 428
    .line 429
    move-object v11, v6

    .line 430
    move-object v3, v12

    .line 431
    goto :goto_8

    .line 432
    :cond_a
    if-eqz v3, :cond_b

    .line 433
    .line 434
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->canThrow()Z

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    if-eqz v11, :cond_b

    .line 439
    .line 440
    iget v11, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 441
    .line 442
    add-int/2addr v11, v15

    .line 443
    iput v11, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 444
    .line 445
    new-instance v11, Lcom/android/dx/rop/code/PlainInsn;

    .line 446
    .line 447
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    invoke-static {v12}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    sget-object v13, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 456
    .line 457
    invoke-direct {v11, v12, v10, v3, v13}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 458
    .line 459
    .line 460
    move-object v3, v11

    .line 461
    move-object v11, v6

    .line 462
    goto :goto_8

    .line 463
    :cond_b
    move-object v11, v3

    .line 464
    move-object v3, v6

    .line 465
    :goto_8
    const/16 v12, 0x29

    .line 466
    .line 467
    if-ne v8, v12, :cond_c

    .line 468
    .line 469
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getResult()Lcom/android/dx/rop/type/Type;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {v2}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    .line 474
    .line 475
    .line 476
    move-result-object v13

    .line 477
    :goto_9
    move-object v12, v5

    .line 478
    move-object v5, v13

    .line 479
    goto :goto_c

    .line 480
    :cond_c
    if-nez v7, :cond_10

    .line 481
    .line 482
    const/4 v12, 0x2

    .line 483
    if-ne v2, v12, :cond_10

    .line 484
    .line 485
    invoke-virtual {v5, v14}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-virtual {v5, v15}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 494
    .line 495
    .line 496
    move-result-object v12

    .line 497
    invoke-virtual {v12}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    invoke-interface {v12}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    if-nez v13, :cond_d

    .line 506
    .line 507
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 508
    .line 509
    .line 510
    move-result v13

    .line 511
    if-eqz v13, :cond_10

    .line 512
    .line 513
    :cond_d
    iget-object v13, v0, Lcom/android/dx/cf/code/RopperMachine;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 514
    .line 515
    invoke-virtual {v5, v14}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-virtual {v5, v15}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 520
    .line 521
    .line 522
    move-result-object v14

    .line 523
    invoke-interface {v13, v9, v6, v14}, Lcom/android/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    if-eqz v6, :cond_10

    .line 528
    .line 529
    invoke-interface {v12}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    if-eqz v6, :cond_f

    .line 534
    .line 535
    move-object v2, v12

    .line 536
    check-cast v2, Lcom/android/dx/rop/cst/Constant;

    .line 537
    .line 538
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutLast()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    const/16 v7, 0xf

    .line 547
    .line 548
    if-ne v6, v7, :cond_e

    .line 549
    .line 550
    check-cast v12, Lcom/android/dx/rop/cst/CstInteger;

    .line 551
    .line 552
    invoke-virtual {v12}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    neg-int v2, v2

    .line 557
    invoke-static {v2}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    const/16 v8, 0xe

    .line 562
    .line 563
    :cond_e
    :goto_a
    move-object v13, v2

    .line 564
    goto :goto_b

    .line 565
    :cond_f
    check-cast v2, Lcom/android/dx/rop/cst/Constant;

    .line 566
    .line 567
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutFirst()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    goto :goto_a

    .line 572
    :goto_b
    invoke-static {v8, v4, v5, v13}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    goto :goto_9

    .line 577
    :cond_10
    move-object v12, v5

    .line 578
    move-object v5, v7

    .line 579
    :goto_c
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCases()Lcom/android/dx/cf/code/SwitchList;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BaseMachine;->getInitValues()Ljava/util/ArrayList;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->canThrow()Z

    .line 588
    .line 589
    .line 590
    move-result v4

    .line 591
    iget-boolean v7, v0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 592
    .line 593
    or-int/2addr v7, v4

    .line 594
    iput-boolean v7, v0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 595
    .line 596
    if-eqz v2, :cond_12

    .line 597
    .line 598
    invoke-virtual {v2}, Lcom/android/dx/cf/code/SwitchList;->size()I

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    if-nez v1, :cond_11

    .line 603
    .line 604
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    .line 605
    .line 606
    sget-object v2, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 607
    .line 608
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    invoke-direct {v1, v2, v10, v7, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 612
    .line 613
    .line 614
    const/4 v2, 0x0

    .line 615
    iput v2, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 616
    .line 617
    :goto_d
    move-object v7, v3

    .line 618
    move-object v13, v5

    .line 619
    goto/16 :goto_12

    .line 620
    .line 621
    :cond_11
    invoke-virtual {v2}, Lcom/android/dx/cf/code/SwitchList;->getValues()Lcom/android/dx/util/IntList;

    .line 622
    .line 623
    .line 624
    move-result-object v13

    .line 625
    new-instance v8, Lcom/android/dx/rop/code/SwitchInsn;

    .line 626
    .line 627
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/SwitchInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/util/IntList;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v13}, Lcom/android/dx/util/IntList;->size()I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 635
    .line 636
    move-object v7, v3

    .line 637
    move-object v13, v5

    .line 638
    :goto_e
    move-object v1, v8

    .line 639
    goto/16 :goto_12

    .line 640
    .line 641
    :cond_12
    const/16 v2, 0x21

    .line 642
    .line 643
    if-ne v8, v2, :cond_15

    .line 644
    .line 645
    invoke-virtual {v12}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_13

    .line 650
    .line 651
    const/4 v1, 0x0

    .line 652
    invoke-virtual {v12, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 661
    .line 662
    .line 663
    move-result v7

    .line 664
    if-eqz v7, :cond_14

    .line 665
    .line 666
    iget-object v7, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 667
    .line 668
    new-instance v8, Lcom/android/dx/rop/code/PlainInsn;

    .line 669
    .line 670
    invoke-static {v4}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 671
    .line 672
    .line 673
    move-result-object v11

    .line 674
    invoke-static {v1, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    invoke-direct {v8, v11, v10, v4, v2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    goto :goto_f

    .line 685
    :cond_13
    const/4 v1, 0x0

    .line 686
    :cond_14
    :goto_f
    new-instance v2, Lcom/android/dx/rop/code/PlainInsn;

    .line 687
    .line 688
    sget-object v4, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 689
    .line 690
    sget-object v7, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 691
    .line 692
    const/4 v8, 0x0

    .line 693
    invoke-direct {v2, v4, v10, v8, v7}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 694
    .line 695
    .line 696
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 697
    .line 698
    invoke-direct {v0, v9, v10}, Lcom/android/dx/cf/code/RopperMachine;->updateReturnOp(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;)V

    .line 699
    .line 700
    .line 701
    iput-boolean v15, v0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 702
    .line 703
    move-object v1, v2

    .line 704
    goto :goto_d

    .line 705
    :cond_15
    if-eqz v5, :cond_18

    .line 706
    .line 707
    if-eqz v4, :cond_17

    .line 708
    .line 709
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    iget-object v4, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 714
    .line 715
    const/16 v2, 0x3a

    .line 716
    .line 717
    if-ne v1, v2, :cond_16

    .line 718
    .line 719
    move-object v7, v3

    .line 720
    move-object v1, v9

    .line 721
    move-object v2, v10

    .line 722
    move-object v3, v12

    .line 723
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/cf/code/RopperMachine;->makeInvokePolymorphicInsn(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Insn;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    move-object v13, v5

    .line 728
    goto :goto_10

    .line 729
    :cond_16
    move-object v7, v3

    .line 730
    move-object v13, v5

    .line 731
    new-instance v8, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 732
    .line 733
    move-object v11, v12

    .line 734
    move-object v12, v4

    .line 735
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 736
    .line 737
    .line 738
    move-object v1, v8

    .line 739
    :goto_10
    iput-boolean v15, v0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 740
    .line 741
    iget-object v2, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 742
    .line 743
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    iput v2, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 748
    .line 749
    goto :goto_12

    .line 750
    :cond_17
    move-object v7, v3

    .line 751
    move-object v13, v5

    .line 752
    new-instance v8, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 753
    .line 754
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 755
    .line 756
    .line 757
    goto :goto_e

    .line 758
    :cond_18
    move-object v7, v3

    .line 759
    move-object v13, v5

    .line 760
    if-eqz v4, :cond_1a

    .line 761
    .line 762
    new-instance v2, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 763
    .line 764
    iget-object v3, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 765
    .line 766
    invoke-direct {v2, v9, v10, v12, v3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 767
    .line 768
    .line 769
    iput-boolean v15, v0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 770
    .line 771
    const/16 v3, 0xbf

    .line 772
    .line 773
    if-ne v1, v3, :cond_19

    .line 774
    .line 775
    const/4 v1, -0x1

    .line 776
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 777
    .line 778
    goto :goto_11

    .line 779
    :cond_19
    iget-object v1, v0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 780
    .line 781
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 782
    .line 783
    .line 784
    move-result v1

    .line 785
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 786
    .line 787
    :goto_11
    move-object v1, v2

    .line 788
    goto :goto_12

    .line 789
    :cond_1a
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    .line 790
    .line 791
    invoke-direct {v1, v9, v10, v11, v12}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 792
    .line 793
    .line 794
    :goto_12
    iget-object v2, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    if-eqz v7, :cond_1b

    .line 800
    .line 801
    iget-object v1, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    :cond_1b
    if-eqz v6, :cond_1e

    .line 807
    .line 808
    iget v1, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 809
    .line 810
    add-int/2addr v1, v15

    .line 811
    iput v1, v0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 812
    .line 813
    new-instance v8, Lcom/android/dx/rop/code/FillArrayDataInsn;

    .line 814
    .line 815
    sget-object v9, Lcom/android/dx/rop/code/Rops;->FILL_ARRAY_DATA:Lcom/android/dx/rop/code/Rop;

    .line 816
    .line 817
    invoke-virtual {v7}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-static {v1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 822
    .line 823
    .line 824
    move-result-object v11

    .line 825
    move-object v12, v6

    .line 826
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/FillArrayDataInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Ljava/util/ArrayList;Lcom/android/dx/rop/cst/Constant;)V

    .line 827
    .line 828
    .line 829
    iget-object v0, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 830
    .line 831
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    return-void

    .line 835
    :cond_1c
    move-object v5, v7

    .line 836
    move v1, v14

    .line 837
    iget-object v4, v0, Lcom/android/dx/cf/code/RopperMachine;->ropper:Lcom/android/dx/cf/code/Ropper;

    .line 838
    .line 839
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper;->getFirstTempStackReg()I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    new-array v6, v2, [Lcom/android/dx/rop/code/RegisterSpec;

    .line 844
    .line 845
    :goto_13
    if-ge v14, v2, :cond_1d

    .line 846
    .line 847
    invoke-virtual {v5, v14}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 852
    .line 853
    .line 854
    move-result-object v7

    .line 855
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 856
    .line 857
    .line 858
    move-result-object v8

    .line 859
    iget-object v9, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 860
    .line 861
    new-instance v11, Lcom/android/dx/rop/code/PlainInsn;

    .line 862
    .line 863
    invoke-static {v7}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 864
    .line 865
    .line 866
    move-result-object v7

    .line 867
    invoke-direct {v11, v7, v10, v8, v1}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    aput-object v8, v6, v14

    .line 874
    .line 875
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    add-int/2addr v4, v1

    .line 880
    add-int/lit8 v14, v14, 0x1

    .line 881
    .line 882
    goto :goto_13

    .line 883
    :cond_1d
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxInt()I

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    :goto_14
    if-eqz v1, :cond_1e

    .line 888
    .line 889
    and-int/lit8 v2, v1, 0xf

    .line 890
    .line 891
    sub-int/2addr v2, v15

    .line 892
    aget-object v2, v6, v2

    .line 893
    .line 894
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    iget-object v5, v0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 899
    .line 900
    new-instance v7, Lcom/android/dx/rop/code/PlainInsn;

    .line 901
    .line 902
    invoke-static {v4}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 903
    .line 904
    .line 905
    move-result-object v8

    .line 906
    invoke-virtual {v2, v3}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    invoke-direct {v7, v8, v10, v9, v2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 921
    .line 922
    .line 923
    move-result v2

    .line 924
    add-int/2addr v3, v2

    .line 925
    shr-int/lit8 v1, v1, 0x4

    .line 926
    .line 927
    goto :goto_14

    .line 928
    :cond_1e
    return-void
.end method

.method public startBlock(Lcom/android/dx/rop/type/TypeList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 12
    .line 13
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 14
    .line 15
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    .line 23
    .line 24
    return-void
.end method

.method public wereCatchesUsed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 2
    .line 3
    return p0
.end method
