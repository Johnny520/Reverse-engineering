.class Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;
.super Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/BytecodeArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ConstantParserVisitor"
.end annotation


# instance fields
.field cst:Lcom/android/dx/rop/cst/Constant;

.field length:I

.field final synthetic this$0:Lcom/android/dx/cf/code/BytecodeArray;

.field value:I


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/BytecodeArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->this$0:Lcom/android/dx/cf/code/BytecodeArray;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getPreviousOffset()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public setPreviousOffset(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitBranch(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 0

    .line 1
    iput-object p4, p0, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    iput p3, p0, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 4
    .line 5
    iput p5, p0, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->value:I

    .line 6
    .line 7
    return-void
.end method

.method public visitInvalid(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
