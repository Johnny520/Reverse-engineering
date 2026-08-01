.class Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/ssa/PhiInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->updateSuccessorPhis()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/PhiInsn;->getRopResultReg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/android/dx/ssa/SsaRenamer;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/android/dx/ssa/SsaRenamer;->access$800(Lcom/android/dx/ssa/SsaRenamer;I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->access$200(Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;)[Lcom/android/dx/rop/code/RegisterSpec;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    aget-object v0, v1, v0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/android/dx/ssa/SsaRenamer;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v1, v2}, Lcom/android/dx/ssa/SsaRenamer;->access$900(Lcom/android/dx/ssa/SsaRenamer;I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$1;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 39
    .line 40
    invoke-static {p0}, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->access$1000(Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p1, v0, p0}, Lcom/android/dx/ssa/PhiInsn;->addPhiOperand(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method
