.class Lcom/android/dx/ssa/MoveParamCombiner$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/MoveParamCombiner;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/MoveParamCombiner;

.field final synthetic val$deletedInsns:Ljava/util/HashSet;

.field final synthetic val$paramSpecs:[Lcom/android/dx/rop/code/RegisterSpec;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/MoveParamCombiner;[Lcom/android/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->val$paramSpecs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->val$deletedInsns:Ljava/util/HashSet;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/android/dx/ssa/MoveParamCombiner;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/android/dx/ssa/MoveParamCombiner;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/android/dx/ssa/MoveParamCombiner;->access$000(Lcom/android/dx/ssa/MoveParamCombiner;Lcom/android/dx/ssa/NormalSsaInsn;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->val$paramSpecs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    aget-object v2, v1, v0

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    aput-object p0, v1, v0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    move-object v1, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    if-nez v3, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    :goto_0
    iget-object v3, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/android/dx/ssa/MoveParamCombiner;

    .line 58
    .line 59
    invoke-static {v3}, Lcom/android/dx/ssa/MoveParamCombiner;->access$100(Lcom/android/dx/ssa/MoveParamCombiner;)Lcom/android/dx/ssa/SsaMethod;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v3, v4}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaInsn;->setResultLocal(Lcom/android/dx/rop/code/LocalItem;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lcom/android/dx/ssa/MoveParamCombiner$1$1;

    .line 75
    .line 76
    invoke-direct {v1, p0, v0, v2}, Lcom/android/dx/ssa/MoveParamCombiner$1$1;-><init>(Lcom/android/dx/ssa/MoveParamCombiner$1;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/android/dx/ssa/MoveParamCombiner;

    .line 80
    .line 81
    invoke-static {v2}, Lcom/android/dx/ssa/MoveParamCombiner;->access$100(Lcom/android/dx/ssa/MoveParamCombiner;)Lcom/android/dx/ssa/SsaMethod;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {v2, v0}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/lit8 v2, v2, -0x1

    .line 98
    .line 99
    :goto_1
    if-ltz v2, :cond_4

    .line 100
    .line 101
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Lcom/android/dx/ssa/SsaInsn;

    .line 106
    .line 107
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v2, v2, -0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->val$deletedInsns:Ljava/util/HashSet;

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_2
    return-void
.end method

.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 0

    .line 1
    return-void
.end method
