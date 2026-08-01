.class Lcom/android/dx/ssa/LiteralOpUpgrader$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/LiteralOpUpgrader;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/LiteralOpUpgrader;

.field final synthetic val$advice:Lcom/android/dx/rop/code/TranslationAdvice;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/rop/code/TranslationAdvice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 14
    .line 15
    invoke-static {v2, p1}, Lcom/android/dx/ssa/LiteralOpUpgrader;->access$000(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x4

    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v5, 0x0

    .line 39
    if-ne v2, v3, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Lcom/android/dx/ssa/LiteralOpUpgrader;->access$100(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object p0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutFirst()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Lcom/android/dx/rop/code/RegOps;->flippedIfOpcode(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {p0, p1, v1, v0, v3}, Lcom/android/dx/ssa/LiteralOpUpgrader;->access$200(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Lcom/android/dx/ssa/LiteralOpUpgrader;->access$100(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    iget-object p0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->this$0:Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutLast()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {p0, p1, v1, v0, v3}, Lcom/android/dx/ssa/LiteralOpUpgrader;->access$200(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    iget-object v2, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 95
    .line 96
    invoke-virtual {v1, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-interface {v2, v0, v3, v6}, Lcom/android/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->upgradeToLiteral()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->isCommutative()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    iget-object p0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader$1;->val$advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 121
    .line 122
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v1, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-interface {p0, v0, v2, v3}, Lcom/android/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_5

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {v1, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {p0, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p1, p0}, Lcom/android/dx/ssa/NormalSsaInsn;->setNewSources(Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->upgradeToLiteral()V

    .line 152
    .line 153
    .line 154
    :cond_5
    :goto_0
    return-void
.end method

.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 0

    .line 1
    return-void
.end method
