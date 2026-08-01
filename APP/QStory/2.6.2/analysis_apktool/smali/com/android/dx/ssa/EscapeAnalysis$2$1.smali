.class Lcom/android/dx/ssa/EscapeAnalysis$2$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/EscapeAnalysis$2;->visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/dx/ssa/EscapeAnalysis$2;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/EscapeAnalysis$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis$2$1;->this$1:Lcom/android/dx/ssa/EscapeAnalysis$2;

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
    .locals 0

    .line 1
    return-void
.end method

.method public visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis$2$1;->this$1:Lcom/android/dx/ssa/EscapeAnalysis$2;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis$2;->this$0:Lcom/android/dx/ssa/EscapeAnalysis;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->access$100(Lcom/android/dx/ssa/EscapeAnalysis;Lcom/android/dx/ssa/SsaInsn;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
    .locals 0

    .line 1
    return-void
.end method
