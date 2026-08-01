.class Lcom/android/dx/ssa/EscapeAnalysis$1;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/EscapeAnalysis;->movePropagate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/EscapeAnalysis;

.field final synthetic val$result:Lcom/android/dx/rop/code/RegisterSpec;

.field final synthetic val$source:Lcom/android/dx/rop/code/RegisterSpec;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/EscapeAnalysis;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->val$result:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->val$source:Lcom/android/dx/rop/code/RegisterSpec;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->this$0:Lcom/android/dx/ssa/EscapeAnalysis;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/android/dx/ssa/RegisterMapper;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getNewRegisterCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->this$0:Lcom/android/dx/ssa/EscapeAnalysis;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/ssa/EscapeAnalysis;->access$000(Lcom/android/dx/ssa/EscapeAnalysis;)Lcom/android/dx/ssa/SsaMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public map(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->val$result:Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis$1;->val$source:Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object p1
.end method
