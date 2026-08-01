.class Lcom/android/dx/cf/code/Ropper$SubroutineInliner;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SubroutineInliner"
.end annotation


# instance fields
.field private final labelAllocator:Lcom/android/dx/cf/code/Ropper$LabelAllocator;

.field private final labelToSubroutines:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/IntList;",
            ">;"
        }
    .end annotation
.end field

.field private final origLabelToCopiedLabel:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private subroutineStart:I

.field private subroutineSuccessor:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;

.field private final workList:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$LabelAllocator;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/cf/code/Ropper$LabelAllocator;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/IntList;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->origLabelToCopiedLabel:Ljava/util/HashMap;

    .line 12
    .line 13
    new-instance v0, Ljava/util/BitSet;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->workList:Ljava/util/BitSet;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelAllocator:Lcom/android/dx/cf/code/Ropper$LabelAllocator;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 27
    .line 28
    return-void
.end method

.method private copyBlock(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lcom/android/dx/cf/code/Ropper;->access$600(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, -0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->mapOrAllocateLabel(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v1, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p1, v1}, Lcom/android/dx/util/IntList;->makeImmutable(II)Lcom/android/dx/util/IntList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 40
    .line 41
    invoke-static {v2, p1}, Lcom/android/dx/cf/code/Ropper;->access$900(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper$Subroutine;->access$1000(Lcom/android/dx/cf/code/Ropper$Subroutine;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineStart:I

    .line 52
    .line 53
    if-ne v1, v2, :cond_1

    .line 54
    .line 55
    iget p1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineSuccessor:I

    .line 56
    .line 57
    invoke-static {p1}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget v4, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineSuccessor:I

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v0, "ret instruction returns to label "

    .line 67
    .line 68
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper$Subroutine;->access$1000(Lcom/android/dx/cf/code/Ropper$Subroutine;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, " expected: "

    .line 83
    .line 84
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget p0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineStart:I

    .line 88
    .line 89
    invoke-static {p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    new-instance v5, Lcom/android/dx/util/IntList;

    .line 106
    .line 107
    invoke-direct {v5, v2}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    :goto_0
    if-ge v3, v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-direct {p0, v6}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->mapOrAllocateLabel(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-virtual {v5, v7}, Lcom/android/dx/util/IntList;->add(I)V

    .line 121
    .line 122
    .line 123
    if-ne p1, v6, :cond_3

    .line 124
    .line 125
    move v4, v7

    .line 126
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    invoke-virtual {v5}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 130
    .line 131
    .line 132
    move-object p1, v5

    .line 133
    :goto_1
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 134
    .line 135
    new-instance v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v1, v0}, Lcom/android/dx/cf/code/Ropper;->access$1100(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {v2, p2, v0, p1, v4}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 146
    .line 147
    .line 148
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Lcom/android/dx/util/IntList;

    .line 155
    .line 156
    invoke-static {v1, v2, p0}, Lcom/android/dx/cf/code/Ropper;->access$1200(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method private involvedInSubroutine(II)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/util/IntList;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-lez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->top()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-ne p0, p2, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method private mapOrAllocateLabel(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->origLabelToCopiedLabel:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    iget v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineStart:I

    .line 21
    .line 22
    invoke-direct {p0, p1, v0}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->involvedInSubroutine(II)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return p1

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelAllocator:Lcom/android/dx/cf/code/Ropper$LabelAllocator;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->getNextLabel()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->workList:Ljava/util/BitSet;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->origLabelToCopiedLabel:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 60
    .line 61
    if-gt v1, v0, :cond_2

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lcom/android/dx/util/IntList;

    .line 73
    .line 74
    invoke-virtual {v2, v0, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return v0
.end method


# virtual methods
.method public inlineSubroutineCalledFrom(Lcom/android/dx/rop/code/BasicBlock;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineSuccessor:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->subroutineStart:I

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->mapOrAllocateLabel(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->workList:Ljava/util/BitSet;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_0
    if-ltz v2, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->workList:Ljava/util/BitSet;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->clear(I)V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->origLabelToCopiedLabel:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-direct {p0, v2, v3}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->copyBlock(II)V

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 60
    .line 61
    invoke-static {v4, v2}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v4, v2}, Lcom/android/dx/cf/code/Ropper;->access$600(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    new-instance v2, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;

    .line 72
    .line 73
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 74
    .line 75
    iget-object v5, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelAllocator:Lcom/android/dx/cf/code/Ropper$LabelAllocator;

    .line 76
    .line 77
    iget-object v6, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2, v4, v5, v6}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$LabelAllocator;Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 83
    .line 84
    invoke-static {v4, v3}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->inlineSubroutineCalledFrom(Lcom/android/dx/rop/code/BasicBlock;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->workList:Ljava/util/BitSet;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 99
    .line 100
    new-instance v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v0}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-direct {v2, v3, v4, v5, v0}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->labelToSubroutines:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Lcom/android/dx/util/IntList;

    .line 128
    .line 129
    invoke-static {v1, v2, p0}, Lcom/android/dx/cf/code/Ropper;->access$800(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z

    .line 130
    .line 131
    .line 132
    return-void
.end method
