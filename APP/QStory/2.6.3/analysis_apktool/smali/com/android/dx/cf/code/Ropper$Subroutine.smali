.class Lcom/android/dx/cf/code/Ropper$Subroutine;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Subroutine"
.end annotation


# instance fields
.field private callerBlocks:Ljava/util/BitSet;

.field private retBlocks:Ljava/util/BitSet;

.field private startBlock:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 7
    .line 8
    new-instance p2, Ljava/util/BitSet;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    .line 18
    .line 19
    new-instance p2, Ljava/util/BitSet;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    invoke-static {p1, p0}, Lcom/android/dx/cf/code/Ropper;->access$202(Lcom/android/dx/cf/code/Ropper;Z)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;II)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;I)V

    .line 36
    invoke-virtual {p0, p3}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addRetBlock(I)V

    return-void
.end method

.method public static synthetic access$1000(Lcom/android/dx/cf/code/Ropper$Subroutine;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1300(Lcom/android/dx/cf/code/Ropper$Subroutine;)Ljava/util/BitSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public addCallerBlock(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addRetBlock(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getStartBlock()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuccessors()Lcom/android/dx/util/IntList;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-ltz v1, :cond_0

    .line 20
    .line 21
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 22
    .line 23
    invoke-static {v3, v1}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->add(I)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public mergeToSuccessors(Lcom/android/dx/cf/code/Frame;[I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    :goto_0
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Lcom/android/dx/cf/code/Frame;->subFrameForLabel(II)Lcom/android/dx/cf/code/Frame;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 33
    .line 34
    const/4 v5, -0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v8, p2

    .line 37
    invoke-static/range {v3 .. v8}, Lcom/android/dx/cf/code/Ropper;->access$400(Lcom/android/dx/cf/code/Ropper;IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move-object v8, p2

    .line 42
    invoke-static {v8, v0}, Lcom/android/dx/util/Bits;->set([II)V

    .line 43
    .line 44
    .line 45
    :goto_1
    iget-object p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    move-object p2, v8

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void
.end method
