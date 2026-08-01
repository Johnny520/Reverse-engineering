.class Lcom/android/dx/dex/code/RopTranslator$1;
.super Lcom/android/dx/rop/code/Insn$BaseVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/dex/code/RopTranslator;->calculateParamsAreInOrder(Lcom/android/dx/rop/code/RopMethod;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$initialRegCount:I

.field final synthetic val$paramSize:I

.field final synthetic val$paramsAreInOrder:[Z


# direct methods
.method public constructor <init>([ZII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramsAreInOrder:[Z

    .line 2
    .line 3
    iput p2, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$initialRegCount:I

    .line 4
    .line 5
    iput p3, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramSize:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/android/dx/rop/code/Insn$BaseVisitor;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/android/dx/rop/cst/CstInteger;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramsAreInOrder:[Z

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aget-boolean v3, v1, v2

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v3, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$initialRegCount:I

    .line 30
    .line 31
    iget p0, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramSize:I

    .line 32
    .line 33
    sub-int/2addr v3, p0

    .line 34
    add-int/2addr v3, v0

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ne v3, p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p0, v2

    .line 48
    :goto_0
    aput-boolean p0, v1, v2

    .line 49
    .line 50
    :cond_1
    return-void
.end method
