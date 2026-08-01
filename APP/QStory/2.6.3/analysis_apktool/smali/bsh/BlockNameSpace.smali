.class Lbsh/BlockNameSpace;
.super Lbsh/NameSpace;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static blockspaces:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u4e16\u54f2\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation
.end field


# instance fields
.field public final used:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/BlockNameSpace;->blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    new-instance v1, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lbsh/util/ValueReferenceMap$Type;->Weak:Lbsh/util/ValueReferenceMap$Type;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/util/function/Function;Lbsh/util/ValueReferenceMap$Type;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lbsh/BlockNameSpace;->blockspaces:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "/BlockNameSpace"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p0, p1, p2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lbsh/BlockNameSpace;->used:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    iget-boolean p1, p1, Lbsh/NameSpace;->isMethod:Z

    .line 37
    .line 38
    iput-boolean p1, p0, Lbsh/NameSpace;->isMethod:Z

    .line 39
    .line 40
    return-void
.end method

.method public static getInstance(Lbsh/NameSpace;I)Lbsh/NameSpace;
    .locals 2

    .line 1
    sget-object v0, Lbsh/BlockNameSpace;->blockspaces:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    new-instance v1, Lbsh/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p0, v1, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;

    .line 9
    .line 10
    iput p1, v1, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lbsh/BlockNameSpace;

    .line 17
    .line 18
    invoke-virtual {p0}, Lbsh/NameSpace;->clear()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method private getNonBlockParent()Lbsh/NameSpace;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lbsh/BlockNameSpace;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lbsh/BlockNameSpace;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/BlockNameSpace;->getNonBlockParent()Lbsh/NameSpace;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    return-object p0
.end method

.method private static synthetic lambda$static$0(Lbsh/飘花落叶言子楪世哲兰苏;)Lbsh/BlockNameSpace;
    .locals 2

    .line 1
    new-instance v0, Lbsh/BlockNameSpace;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;

    .line 4
    .line 5
    iget p0, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lbsh/BlockNameSpace;-><init>(Lbsh/NameSpace;I)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private weHaveVar(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-super {p0, p1, v0}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :catch_0
    :cond_0
    return v0
.end method

.method public static synthetic 飘花落叶言子楪苏哲世兰(Lbsh/飘花落叶言子楪世哲兰苏;)Lbsh/BlockNameSpace;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BlockNameSpace;->lambda$static$0(Lbsh/飘花落叶言子楪世哲兰苏;)Lbsh/BlockNameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public getSuper(Lbsh/Interpreter;)Lbsh/This;
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/BlockNameSpace;->getNonBlockParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getThis(Lbsh/Interpreter;)Lbsh/This;
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/BlockNameSpace;->getNonBlockParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public importClass(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->importClass(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public importPackage(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBlockVariable(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-super {p0, p1, p2, v0, v0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setMethod(Lbsh/BshMethod;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/BlockNameSpace;->weHaveVar(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x0

    .line 8
    invoke-super {p0, p1, p2, p3, p4}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, p1, p2, p3, p4}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
