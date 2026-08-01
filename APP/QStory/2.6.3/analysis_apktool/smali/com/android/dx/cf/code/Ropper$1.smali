.class Lcom/android/dx/cf/code/Ropper$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/rop/code/BasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/cf/code/Ropper;->inlineSubroutines()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;

.field final synthetic val$reachableSubroutineCallerLabels:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$1;->val$reachableSubroutineCallerLabels:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$1;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/android/dx/rop/code/BasicBlock;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$1;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/android/dx/cf/code/Ropper;->access$600(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$1;->val$reachableSubroutineCallerLabels:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
