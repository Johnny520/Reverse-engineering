.class Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/rop/code/Insn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/BasicBlockList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RegCountVisitor"
.end annotation


# instance fields
.field private regCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 6
    .line 7
    return-void
.end method

.method private processReg(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getNextReg()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 6
    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private visit(Lcom/android/dx/rop/code/Insn;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public getRegCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 2
    .line 3
    return p0
.end method

.method public visitFillArrayDataInsn(Lcom/android/dx/rop/code/FillArrayDataInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitInvokePolymorphicInsn(Lcom/android/dx/rop/code/InvokePolymorphicInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitPlainInsn(Lcom/android/dx/rop/code/PlainInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitSwitchInsn(Lcom/android/dx/rop/code/SwitchInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitThrowingCstInsn(Lcom/android/dx/rop/code/ThrowingCstInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitThrowingInsn(Lcom/android/dx/rop/code/ThrowingInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
