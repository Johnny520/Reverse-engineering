.class Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->analyzeInstructions()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private processInsn(Lcom/android/dx/ssa/SsaInsn;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 12
    .line 13
    invoke-static {v2}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$200(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 31
    .line 32
    invoke-static {v3}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$200(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/16 v1, 0x38

    .line 55
    .line 56
    if-ne v0, v1, :cond_2

    .line 57
    .line 58
    iget-object p0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 59
    .line 60
    invoke-static {p0}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$300(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p1, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getAdvice()Lcom/android/dx/rop/code/TranslationAdvice;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v0, v1, v2}, Lcom/android/dx/rop/code/TranslationAdvice;->requiresSourcesInOrder(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpecList;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    iget-object p0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 93
    .line 94
    invoke-static {p0}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$400(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p1, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    instance-of v0, p1, Lcom/android/dx/ssa/PhiInsn;

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    iget-object p0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->this$0:Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;

    .line 109
    .line 110
    invoke-static {p0}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$500(Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p1, Lcom/android/dx/ssa/PhiInsn;

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/android/dx/ssa/SsaInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/android/dx/ssa/SsaInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;->processInsn(Lcom/android/dx/ssa/SsaInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
