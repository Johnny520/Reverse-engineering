.class Lcom/android/dx/ssa/MoveParamCombiner$1$1;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/MoveParamCombiner$1;->visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/dx/ssa/MoveParamCombiner$1;

.field final synthetic val$specA:Lcom/android/dx/rop/code/RegisterSpec;

.field final synthetic val$specB:Lcom/android/dx/rop/code/RegisterSpec;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/MoveParamCombiner$1;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->val$specB:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->val$specA:Lcom/android/dx/rop/code/RegisterSpec;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->this$1:Lcom/android/dx/ssa/MoveParamCombiner$1;

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
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->this$1:Lcom/android/dx/ssa/MoveParamCombiner$1;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner$1;->this$0:Lcom/android/dx/ssa/MoveParamCombiner;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/android/dx/ssa/MoveParamCombiner;->access$100(Lcom/android/dx/ssa/MoveParamCombiner;)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
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
    iget-object v1, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->val$specB:Lcom/android/dx/rop/code/RegisterSpec;

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
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner$1$1;->val$specA:Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object p1
.end method
