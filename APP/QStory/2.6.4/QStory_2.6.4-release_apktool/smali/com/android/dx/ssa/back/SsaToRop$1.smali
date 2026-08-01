.class Lcom/android/dx/ssa/back/SsaToRop$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/back/SsaToRop;->removeEmptyGotos()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/back/SsaToRop;

.field final synthetic val$blocks:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/back/SsaToRop;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/back/SsaToRop$1;->val$blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/ssa/back/SsaToRop$1;->this$0:Lcom/android/dx/ssa/back/SsaToRop;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lcom/android/dx/ssa/SsaInsn;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    sget-object v1, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 24
    .line 25
    if-ne p2, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Ljava/util/BitSet;

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    if-ltz v0, :cond_0

    .line 42
    .line 43
    iget-object v1, p0, Lcom/android/dx/ssa/back/SsaToRop$1;->val$blocks:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/ssa/SsaBasicBlock;->replaceSuccessor(II)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-void
.end method
