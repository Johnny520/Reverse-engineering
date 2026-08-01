.class Lcom/android/dx/ssa/SsaRenamer$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/SsaRenamer;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/SsaRenamer;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaRenamer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/SsaRenamer$1;->this$0:Lcom/android/dx/ssa/SsaRenamer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 1
    new-instance p2, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer$1;->this$0:Lcom/android/dx/ssa/SsaRenamer;

    .line 4
    .line 5
    invoke-direct {p2, p0, p1}, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;-><init>(Lcom/android/dx/ssa/SsaRenamer;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;->process()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
