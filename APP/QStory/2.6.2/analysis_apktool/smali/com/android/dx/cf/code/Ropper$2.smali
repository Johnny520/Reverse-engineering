.class Lcom/android/dx/cf/code/Ropper$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/rop/code/BasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/cf/code/Ropper;->deleteUnreachableBlocks()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;

.field final synthetic val$reachableLabels:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$2;->val$reachableLabels:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$2;->this$0:Lcom/android/dx/cf/code/Ropper;

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
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$2;->val$reachableLabels:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
