.class Lcom/android/dx/ssa/ConstCollector$2;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/ConstCollector;->updateConstUses(Ljava/util/HashMap;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/ConstCollector;

.field final synthetic val$newReg:Lcom/android/dx/rop/code/RegisterSpec;

.field final synthetic val$origReg:Lcom/android/dx/rop/code/RegisterSpec;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/ConstCollector;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/ConstCollector$2;->val$origReg:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/dx/ssa/ConstCollector$2;->val$newReg:Lcom/android/dx/rop/code/RegisterSpec;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/ssa/ConstCollector$2;->this$0:Lcom/android/dx/ssa/ConstCollector;

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
    iget-object p0, p0, Lcom/android/dx/ssa/ConstCollector$2;->this$0:Lcom/android/dx/ssa/ConstCollector;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/ssa/ConstCollector;->access$000(Lcom/android/dx/ssa/ConstCollector;)Lcom/android/dx/ssa/SsaMethod;

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
    iget-object v1, p0, Lcom/android/dx/ssa/ConstCollector$2;->val$origReg:Lcom/android/dx/rop/code/RegisterSpec;

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
    iget-object p0, p0, Lcom/android/dx/ssa/ConstCollector$2;->val$newReg:Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->withLocalItem(Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    return-object p1
.end method
