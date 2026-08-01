.class public Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public get(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/cst/Constant;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/cst/Constant;)V
    .locals 1

    .line 1
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstType;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstInteger;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstLong;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstFloat;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstDouble;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    instance-of v0, p2, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "bad type for bootstrap argument: "

    .line 39
    .line 40
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
