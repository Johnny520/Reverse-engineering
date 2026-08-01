.class Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RenamingMapper"
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/android/dx/ssa/RegisterMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getNewRegisterCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/android/dx/ssa/SsaRenamer;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/android/dx/ssa/SsaRenamer;->access$100(Lcom/android/dx/ssa/SsaRenamer;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public map(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;->this$1:Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 10
    .line 11
    invoke-static {p0}, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->access$200(Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;)[Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    aget-object p0, p0, v0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {p1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
