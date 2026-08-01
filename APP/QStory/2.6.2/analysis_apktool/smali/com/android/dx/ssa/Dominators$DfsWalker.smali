.class Lcom/android/dx/ssa/Dominators$DfsWalker;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/Dominators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DfsWalker"
.end annotation


# instance fields
.field private dfsNum:I

.field final synthetic this$0:Lcom/android/dx/ssa/Dominators;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/Dominators;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->this$0:Lcom/android/dx/ssa/Dominators;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->dfsNum:I

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/ssa/Dominators;Lcom/android/dx/ssa/Dominators$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/Dominators$DfsWalker;-><init>(Lcom/android/dx/ssa/Dominators;)V

    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/ssa/Dominators$DFSInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->dfsNum:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    iput v1, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->dfsNum:I

    .line 11
    .line 12
    iput v1, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 13
    .line 14
    iput-object p1, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->rep:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 15
    .line 16
    iput-object p2, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->parent:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 17
    .line 18
    iget-object p2, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->this$0:Lcom/android/dx/ssa/Dominators;

    .line 19
    .line 20
    invoke-static {p2}, Lcom/android/dx/ssa/Dominators;->access$100(Lcom/android/dx/ssa/Dominators;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/android/dx/ssa/Dominators$DfsWalker;->this$0:Lcom/android/dx/ssa/Dominators;

    .line 28
    .line 29
    invoke-static {p0}, Lcom/android/dx/ssa/Dominators;->access$200(Lcom/android/dx/ssa/Dominators;)[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    aput-object v0, p0, p1

    .line 38
    .line 39
    return-void
.end method
