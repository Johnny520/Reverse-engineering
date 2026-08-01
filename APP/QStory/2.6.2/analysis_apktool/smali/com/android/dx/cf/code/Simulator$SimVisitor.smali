.class Lcom/android/dx/cf/code/Simulator$SimVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Simulator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SimVisitor"
.end annotation


# instance fields
.field private frame:Lcom/android/dx/cf/code/Frame;

.field private final machine:Lcom/android/dx/cf/code/Machine;

.field private previousOffset:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Simulator;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Simulator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/android/dx/cf/code/Simulator;->access$000(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/Machine;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    return-void
.end method

.method private checkReturnType(Lcom/android/dx/rop/type/Type;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/android/dx/cf/code/Machine;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "return type mismatch: prototype indicates "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", but encountered type "

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Simulator;->access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method


# virtual methods
.method public getPreviousOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->previousOffset:I

    .line 2
    .line 3
    return p0
.end method

.method public setFrame(Lcom/android/dx/cf/code/Frame;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "frame == null"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setPreviousOffset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->previousOffset:I

    .line 2
    .line 3
    return-void
.end method

.method public visitBranch(IIII)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p1, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 16
    .line 17
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 22
    .line 23
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 30
    .line 31
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 40
    .line 41
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 50
    .line 51
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 52
    .line 53
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 57
    .line 58
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxTargetArg(I)V

    .line 59
    .line 60
    .line 61
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 62
    .line 63
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 64
    .line 65
    invoke-interface {p3, p0, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x99
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
    .line 102
    .line 103
    .line 104
    .line 105
    :pswitch_data_1
    .packed-switch 0xc6
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 3

    .line 1
    const/16 p3, 0x12

    .line 2
    .line 3
    if-eq p1, p3, :cond_6

    .line 4
    .line 5
    const/16 p3, 0x13

    .line 6
    .line 7
    if-eq p1, p3, :cond_6

    .line 8
    .line 9
    const/16 p3, 0xbd

    .line 10
    .line 11
    if-eq p1, p3, :cond_5

    .line 12
    .line 13
    const/16 p3, 0xc5

    .line 14
    .line 15
    if-eq p1, p3, :cond_4

    .line 16
    .line 17
    const/16 p3, 0xc0

    .line 18
    .line 19
    if-eq p1, p3, :cond_3

    .line 20
    .line 21
    const/16 p3, 0xc1

    .line 22
    .line 23
    if-eq p1, p3, :cond_3

    .line 24
    .line 25
    packed-switch p1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 29
    .line 30
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 36
    .line 37
    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Simulator;->access$700(Lcom/android/dx/cf/code/Simulator;I)V

    .line 38
    .line 39
    .line 40
    check-cast p4, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 41
    .line 42
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 49
    .line 50
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->addReference()Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_1
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 60
    .line 61
    if-eqz p3, :cond_0

    .line 62
    .line 63
    check-cast p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 64
    .line 65
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->toMethodRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 70
    .line 71
    invoke-static {p3, p1, p4}, Lcom/android/dx/cf/code/Simulator;->access$500(Lcom/android/dx/cf/code/Simulator;ILcom/android/dx/rop/cst/CstMethodRef;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 75
    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    move-object p3, p4

    .line 79
    check-cast p3, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 80
    .line 81
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_1

    .line 86
    .line 87
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 88
    .line 89
    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Simulator;->access$600(Lcom/android/dx/cf/code/Simulator;I)V

    .line 90
    .line 91
    .line 92
    :cond_1
    const/16 p3, 0xb8

    .line 93
    .line 94
    if-ne p1, p3, :cond_2

    .line 95
    .line 96
    const/4 p3, 0x1

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 p3, 0x0

    .line 99
    :goto_0
    move-object v0, p4

    .line 100
    check-cast v0, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 101
    .line 102
    invoke-virtual {v0, p3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype(Z)Lcom/android/dx/rop/type/Prototype;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 107
    .line 108
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 109
    .line 110
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_2
    move-object p3, p4

    .line 115
    check-cast p3, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 116
    .line 117
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 124
    .line 125
    sget-object v2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 126
    .line 127
    invoke-interface {v0, v1, v2, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_3
    move-object p3, p4

    .line 132
    check-cast p3, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 133
    .line 134
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 139
    .line 140
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 141
    .line 142
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 147
    .line 148
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 149
    .line 150
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 151
    .line 152
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 157
    .line 158
    invoke-static {p3, p5}, Lcom/android/dx/rop/type/Prototype;->internInts(Lcom/android/dx/rop/type/Type;I)Lcom/android/dx/rop/type/Prototype;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 163
    .line 164
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 165
    .line 166
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 171
    .line 172
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 173
    .line 174
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 175
    .line 176
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 181
    .line 182
    if-nez p3, :cond_7

    .line 183
    .line 184
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 185
    .line 186
    if-eqz p3, :cond_8

    .line 187
    .line 188
    :cond_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 189
    .line 190
    invoke-static {p3, p4}, Lcom/android/dx/cf/code/Simulator;->access$800(Lcom/android/dx/cf/code/Simulator;Lcom/android/dx/rop/cst/Constant;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 194
    .line 195
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 196
    .line 197
    .line 198
    :goto_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 199
    .line 200
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 201
    .line 202
    .line 203
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 204
    .line 205
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 206
    .line 207
    .line 208
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 209
    .line 210
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 211
    .line 212
    invoke-interface {p3, p0, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0xb3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitInvalid(III)V
    .locals 0

    .line 1
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "invalid opcode "

    .line 6
    .line 7
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 6

    .line 1
    const/16 v0, 0x36

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    add-int v1, p2, p3

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p2

    .line 9
    :goto_0
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/android/dx/cf/code/Simulator;->access$400(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/LocalVariableList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2, v1, p4}, Lcom/android/dx/cf/code/LocalVariableList;->pcAndIndexToLocal(II)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getType()Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->getBasicFrameType()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p5}, Lcom/android/dx/rop/type/Type;->getBasicFrameType()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eq v4, v5, :cond_2

    .line 35
    .line 36
    move-object v3, p5

    .line 37
    move-object v1, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v3, p5

    .line 40
    :cond_2
    :goto_1
    const/16 v4, 0x15

    .line 41
    .line 42
    if-eq p1, v4, :cond_7

    .line 43
    .line 44
    if-eq p1, v0, :cond_5

    .line 45
    .line 46
    const/16 v0, 0x84

    .line 47
    .line 48
    if-eq p1, v0, :cond_3

    .line 49
    .line 50
    const/16 p6, 0xa9

    .line 51
    .line 52
    if-eq p1, p6, :cond_7

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 68
    .line 69
    invoke-interface {p3, v0, p4}, Lcom/android/dx/cf/code/Machine;->localArg(Lcom/android/dx/cf/code/Frame;I)V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 73
    .line 74
    invoke-interface {p3, p4, v3, v2}, Lcom/android/dx/cf/code/Machine;->localTarget(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/code/LocalItem;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 78
    .line 79
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 83
    .line 84
    invoke-interface {p3, p6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 85
    .line 86
    .line 87
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 88
    .line 89
    invoke-static {p6}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 94
    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    if-nez v1, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 105
    .line 106
    iget-object p6, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 107
    .line 108
    invoke-interface {p3, p6, p5}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 109
    .line 110
    .line 111
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 112
    .line 113
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 114
    .line 115
    .line 116
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 117
    .line 118
    invoke-interface {p3, p4, v3, v2}, Lcom/android/dx/cf/code/Machine;->localTarget(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/code/LocalItem;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 123
    .line 124
    iget-object p6, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 125
    .line 126
    invoke-interface {p3, p6, p4}, Lcom/android/dx/cf/code/Machine;->localArg(Lcom/android/dx/cf/code/Frame;I)V

    .line 127
    .line 128
    .line 129
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 130
    .line 131
    if-eqz v1, :cond_8

    .line 132
    .line 133
    const/4 p4, 0x1

    .line 134
    goto :goto_4

    .line 135
    :cond_8
    const/4 p4, 0x0

    .line 136
    :goto_4
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->localInfo(Z)V

    .line 137
    .line 138
    .line 139
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 140
    .line 141
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 142
    .line 143
    .line 144
    :goto_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 145
    .line 146
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 147
    .line 148
    invoke-interface {p3, p0, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-interface {p2, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    invoke-interface {p2, p4}, Lcom/android/dx/cf/code/Machine;->auxInitValues(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 16
    .line 17
    invoke-interface {p2, p3}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 23
    .line 24
    const/16 p3, 0xbc

    .line 25
    .line 26
    invoke-interface {p2, p0, p1, p3}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_1a

    .line 2
    .line 3
    const/16 v0, 0xbe

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, v0, :cond_18

    .line 7
    .line 8
    const/16 v0, 0xbf

    .line 9
    .line 10
    if-eq p1, v0, :cond_17

    .line 11
    .line 12
    const/16 v0, 0xc2

    .line 13
    .line 14
    if-eq p1, v0, :cond_17

    .line 15
    .line 16
    const/16 v0, 0xc3

    .line 17
    .line 18
    if-eq p1, v0, :cond_17

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x2

    .line 23
    sparse-switch p1, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    const/16 v4, 0x11

    .line 27
    .line 28
    const v5, 0x32132

    .line 29
    .line 30
    .line 31
    const/16 v6, 0x3213

    .line 32
    .line 33
    const/16 v7, 0x212

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch p1, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 48
    .line 49
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 50
    .line 51
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 59
    .line 60
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 61
    .line 62
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 70
    .line 71
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 72
    .line 73
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :pswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 81
    .line 82
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 83
    .line 84
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 92
    .line 93
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 94
    .line 95
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :pswitch_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 101
    .line 102
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 103
    .line 104
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 105
    .line 106
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :pswitch_6
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 114
    .line 115
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 116
    .line 117
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :pswitch_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 123
    .line 124
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_0

    .line 137
    .line 138
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_0

    .line 147
    .line 148
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 149
    .line 150
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 151
    .line 152
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 153
    .line 154
    .line 155
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 156
    .line 157
    const/16 v0, 0x12

    .line 158
    .line 159
    invoke-interface {p3, v0}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_0
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    throw p0

    .line 169
    :pswitch_8
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 170
    .line 171
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_3

    .line 184
    .line 185
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_1

    .line 194
    .line 195
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 196
    .line 197
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 198
    .line 199
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 200
    .line 201
    .line 202
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 203
    .line 204
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :cond_1
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 214
    .line 215
    .line 216
    move-result p3

    .line 217
    if-eqz p3, :cond_2

    .line 218
    .line 219
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 220
    .line 221
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 222
    .line 223
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 224
    .line 225
    .line 226
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 227
    .line 228
    invoke-interface {p3, v6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_4

    .line 232
    .line 233
    :cond_2
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    throw p0

    .line 238
    :cond_3
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_6

    .line 247
    .line 248
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_4

    .line 257
    .line 258
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 259
    .line 260
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 261
    .line 262
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 263
    .line 264
    .line 265
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 266
    .line 267
    invoke-interface {p3, v5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_4

    .line 271
    .line 272
    :cond_4
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    if-eqz p3, :cond_5

    .line 281
    .line 282
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 283
    .line 284
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 285
    .line 286
    const/4 v1, 0x4

    .line 287
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 288
    .line 289
    .line 290
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 291
    .line 292
    const v0, 0x432143

    .line 293
    .line 294
    .line 295
    invoke-interface {p3, v0}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :cond_5
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    throw p0

    .line 305
    :cond_6
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    throw p0

    .line 310
    :pswitch_9
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 311
    .line 312
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_8

    .line 325
    .line 326
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 327
    .line 328
    .line 329
    move-result-object p3

    .line 330
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 331
    .line 332
    .line 333
    move-result p3

    .line 334
    if-nez p3, :cond_7

    .line 335
    .line 336
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 337
    .line 338
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 339
    .line 340
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 341
    .line 342
    .line 343
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 344
    .line 345
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :cond_7
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    throw p0

    .line 355
    :cond_8
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-nez v1, :cond_9

    .line 364
    .line 365
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 366
    .line 367
    .line 368
    move-result-object p3

    .line 369
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 370
    .line 371
    .line 372
    move-result p3

    .line 373
    if-nez p3, :cond_9

    .line 374
    .line 375
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 376
    .line 377
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 378
    .line 379
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 380
    .line 381
    .line 382
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 383
    .line 384
    invoke-interface {p3, v5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_4

    .line 388
    .line 389
    :cond_9
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    throw p0

    .line 394
    :pswitch_a
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 395
    .line 396
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-nez v1, :cond_c

    .line 409
    .line 410
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_a

    .line 419
    .line 420
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 421
    .line 422
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 423
    .line 424
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 425
    .line 426
    .line 427
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 428
    .line 429
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_4

    .line 433
    .line 434
    :cond_a
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 435
    .line 436
    .line 437
    move-result-object p3

    .line 438
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 439
    .line 440
    .line 441
    move-result p3

    .line 442
    if-eqz p3, :cond_b

    .line 443
    .line 444
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 445
    .line 446
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 447
    .line 448
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 449
    .line 450
    .line 451
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 452
    .line 453
    invoke-interface {p3, v6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_4

    .line 457
    .line 458
    :cond_b
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    throw p0

    .line 463
    :cond_c
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    throw p0

    .line 468
    :pswitch_b
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 469
    .line 470
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 471
    .line 472
    .line 473
    move-result-object p3

    .line 474
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_d

    .line 483
    .line 484
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 485
    .line 486
    .line 487
    move-result-object p3

    .line 488
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 489
    .line 490
    .line 491
    move-result p3

    .line 492
    if-eqz p3, :cond_d

    .line 493
    .line 494
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 495
    .line 496
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 497
    .line 498
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 499
    .line 500
    .line 501
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 502
    .line 503
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_4

    .line 507
    .line 508
    :cond_d
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    throw p0

    .line 513
    :pswitch_c
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 514
    .line 515
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 516
    .line 517
    .line 518
    move-result-object p3

    .line 519
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 520
    .line 521
    .line 522
    move-result-object p3

    .line 523
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 524
    .line 525
    .line 526
    move-result p3

    .line 527
    if-nez p3, :cond_e

    .line 528
    .line 529
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 530
    .line 531
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 532
    .line 533
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 534
    .line 535
    .line 536
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 537
    .line 538
    invoke-interface {p3, v4}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_4

    .line 542
    .line 543
    :cond_e
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    throw p0

    .line 548
    :pswitch_d
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 549
    .line 550
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 551
    .line 552
    .line 553
    move-result-object p3

    .line 554
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_f

    .line 563
    .line 564
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 565
    .line 566
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 567
    .line 568
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 569
    .line 570
    .line 571
    goto :goto_0

    .line 572
    :cond_f
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 573
    .line 574
    .line 575
    move-result-object p3

    .line 576
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 577
    .line 578
    .line 579
    move-result p3

    .line 580
    if-eqz p3, :cond_10

    .line 581
    .line 582
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 583
    .line 584
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 585
    .line 586
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 587
    .line 588
    .line 589
    const/16 v4, 0x2121

    .line 590
    .line 591
    :goto_0
    const/16 p3, 0x5c

    .line 592
    .line 593
    if-ne p1, p3, :cond_1b

    .line 594
    .line 595
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 596
    .line 597
    invoke-interface {p3, v4}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_4

    .line 601
    .line 602
    :cond_10
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    throw p0

    .line 607
    :pswitch_e
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 608
    .line 609
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 610
    .line 611
    .line 612
    move-result-object p3

    .line 613
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 614
    .line 615
    .line 616
    move-result-object p3

    .line 617
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 618
    .line 619
    .line 620
    move-result p3

    .line 621
    if-nez p3, :cond_11

    .line 622
    .line 623
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 624
    .line 625
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 626
    .line 627
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_4

    .line 631
    .line 632
    :cond_11
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    throw p0

    .line 637
    :sswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 638
    .line 639
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 640
    .line 641
    .line 642
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 643
    .line 644
    invoke-direct {p0, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->checkReturnType(Lcom/android/dx/rop/type/Type;)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_4

    .line 648
    .line 649
    :sswitch_1
    sget-object p3, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 650
    .line 651
    if-ne p4, p3, :cond_12

    .line 652
    .line 653
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 654
    .line 655
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 656
    .line 657
    .line 658
    move-result-object p3

    .line 659
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 660
    .line 661
    .line 662
    move-result-object p3

    .line 663
    goto :goto_1

    .line 664
    :cond_12
    move-object p3, p4

    .line 665
    :goto_1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 666
    .line 667
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 668
    .line 669
    invoke-interface {v0, v1, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 670
    .line 671
    .line 672
    invoke-direct {p0, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->checkReturnType(Lcom/android/dx/rop/type/Type;)V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_4

    .line 676
    .line 677
    :sswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 678
    .line 679
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 680
    .line 681
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 682
    .line 683
    invoke-interface {p3, v0, p4, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 684
    .line 685
    .line 686
    goto/16 :goto_4

    .line 687
    .line 688
    :sswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 689
    .line 690
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 691
    .line 692
    invoke-interface {p3, v0, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_4

    .line 696
    .line 697
    :pswitch_f
    :sswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 698
    .line 699
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 700
    .line 701
    invoke-interface {p3, v0, p4, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 702
    .line 703
    .line 704
    goto/16 :goto_4

    .line 705
    .line 706
    :sswitch_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 707
    .line 708
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 709
    .line 710
    .line 711
    move-result-object p3

    .line 712
    invoke-virtual {p4}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    if-eqz v1, :cond_13

    .line 717
    .line 718
    move v0, v3

    .line 719
    :cond_13
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekLocal(I)Z

    .line 724
    .line 725
    .line 726
    move-result p3

    .line 727
    invoke-static {p4, v1}, Lcom/android/dx/cf/code/Simulator;->access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    if-eqz p3, :cond_15

    .line 732
    .line 733
    sget-object p3, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 734
    .line 735
    if-ne v0, p3, :cond_14

    .line 736
    .line 737
    goto :goto_2

    .line 738
    :cond_14
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 739
    .line 740
    .line 741
    move-result-object p3

    .line 742
    :goto_2
    move-object p4, p3

    .line 743
    :cond_15
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 744
    .line 745
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 746
    .line 747
    sget-object v2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 748
    .line 749
    invoke-interface {p3, v1, v0, v2, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 750
    .line 751
    .line 752
    goto :goto_4

    .line 753
    :sswitch_6
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 754
    .line 755
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 756
    .line 757
    .line 758
    move-result-object p3

    .line 759
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 760
    .line 761
    .line 762
    move-result-object p3

    .line 763
    invoke-static {p4, p3}, Lcom/android/dx/cf/code/Simulator;->access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 764
    .line 765
    .line 766
    move-result-object p3

    .line 767
    sget-object p4, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 768
    .line 769
    if-ne p3, p4, :cond_16

    .line 770
    .line 771
    goto :goto_3

    .line 772
    :cond_16
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 773
    .line 774
    .line 775
    move-result-object p4

    .line 776
    :goto_3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 777
    .line 778
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 779
    .line 780
    sget-object v2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 781
    .line 782
    invoke-interface {v0, v1, p3, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 783
    .line 784
    .line 785
    goto :goto_4

    .line 786
    :cond_17
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 787
    .line 788
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 789
    .line 790
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 791
    .line 792
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 793
    .line 794
    .line 795
    goto :goto_4

    .line 796
    :cond_18
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 797
    .line 798
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 799
    .line 800
    .line 801
    move-result-object p3

    .line 802
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 803
    .line 804
    .line 805
    move-result-object p3

    .line 806
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isArrayOrKnownNull()Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-nez v0, :cond_19

    .line 811
    .line 812
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 813
    .line 814
    new-instance v1, Ljava/lang/StringBuilder;

    .line 815
    .line 816
    const-string v2, "type mismatch: expected array type but encountered "

    .line 817
    .line 818
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object p3

    .line 825
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object p3

    .line 832
    invoke-static {v0, p3}, Lcom/android/dx/cf/code/Simulator;->access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    :cond_19
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 836
    .line 837
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 838
    .line 839
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 840
    .line 841
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 842
    .line 843
    .line 844
    goto :goto_4

    .line 845
    :cond_1a
    :sswitch_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 846
    .line 847
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 848
    .line 849
    .line 850
    :cond_1b
    :goto_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 851
    .line 852
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 853
    .line 854
    .line 855
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 856
    .line 857
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 858
    .line 859
    invoke-interface {p3, p0, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x2e -> :sswitch_6
        0x4f -> :sswitch_5
        0x64 -> :sswitch_4
        0x68 -> :sswitch_4
        0x6c -> :sswitch_4
        0x70 -> :sswitch_4
        0x74 -> :sswitch_3
        0x78 -> :sswitch_2
        0x7a -> :sswitch_2
        0x7c -> :sswitch_2
        0x7e -> :sswitch_4
        0x80 -> :sswitch_4
        0x82 -> :sswitch_4
        0xac -> :sswitch_1
        0xb1 -> :sswitch_0
    .end sparse-switch

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_f
    .end packed-switch

    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    :pswitch_data_1
    .packed-switch 0x85
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 8
    .line 9
    .line 10
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 13
    .line 14
    .line 15
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 16
    .line 17
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxSwitchArg(Lcom/android/dx/cf/code/SwitchList;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 23
    .line 24
    invoke-interface {p3, p0, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
