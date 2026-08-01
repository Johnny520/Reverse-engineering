.class Lbsh/BSHReturnStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


# instance fields
.field public kind:I

.field public label:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BSHReturnStatement;->label:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 7
    .line 8
    iget p2, p0, Lbsh/BSHReturnStatement;->kind:I

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 16
    .line 17
    iput-object v1, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 20
    .line 21
    iput-object v0, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p0, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 43
    .line 44
    :goto_0
    new-instance p2, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 45
    .line 46
    iget v0, p0, Lbsh/BSHReturnStatement;->kind:I

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v1, p2, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 52
    .line 53
    sget-object v1, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 54
    .line 55
    iput v0, p2, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 56
    .line 57
    iput-object p1, p2, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p0, p2, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 60
    .line 61
    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 19
    .line 20
    iget v2, p0, Lbsh/BSHReturnStatement;->kind:I

    .line 21
    .line 22
    aget-object v1, v1, v2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lbsh/BSHReturnStatement;->label:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, ":"

    .line 35
    .line 36
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
