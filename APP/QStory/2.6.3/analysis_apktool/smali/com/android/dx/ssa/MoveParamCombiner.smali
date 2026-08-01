.class public Lcom/android/dx/ssa/MoveParamCombiner;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/MoveParamCombiner;Lcom/android/dx/ssa/NormalSsaInsn;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/MoveParamCombiner;->getParamIndex(Lcom/android/dx/ssa/NormalSsaInsn;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$100(Lcom/android/dx/ssa/MoveParamCombiner;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method private getParamIndex(Lcom/android/dx/ssa/NormalSsaInsn;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/code/CstInsn;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/MoveParamCombiner;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/MoveParamCombiner;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/MoveParamCombiner;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getParamWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    new-instance v1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/android/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 15
    .line 16
    new-instance v3, Lcom/android/dx/ssa/MoveParamCombiner$1;

    .line 17
    .line 18
    invoke-direct {v3, p0, v0, v1}, Lcom/android/dx/ssa/MoveParamCombiner$1;-><init>(Lcom/android/dx/ssa/MoveParamCombiner;[Lcom/android/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/android/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
