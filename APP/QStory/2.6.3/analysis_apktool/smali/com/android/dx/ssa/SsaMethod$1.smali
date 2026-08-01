.class Lcom/android/dx/ssa/SsaMethod$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/SsaMethod$1;->this$0:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod$1;->this$0:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/ssa/SsaMethod;->access$000(Lcom/android/dx/ssa/SsaMethod;)[Lcom/android/dx/ssa/SsaInsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aput-object p1, p0, v0

    .line 16
    .line 17
    return-void
.end method

.method public visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod$1;->this$0:Lcom/android/dx/ssa/SsaMethod;

    .line 8
    .line 9
    invoke-static {p0}, Lcom/android/dx/ssa/SsaMethod;->access$000(Lcom/android/dx/ssa/SsaMethod;)[Lcom/android/dx/ssa/SsaInsn;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aput-object p1, p0, v0

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod$1;->this$0:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/ssa/SsaMethod;->access$000(Lcom/android/dx/ssa/SsaMethod;)[Lcom/android/dx/ssa/SsaInsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aput-object p1, p0, v0

    .line 16
    .line 17
    return-void
.end method
