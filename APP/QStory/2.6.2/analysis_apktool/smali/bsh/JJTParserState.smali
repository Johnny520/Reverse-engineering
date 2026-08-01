.class public Lbsh/JJTParserState;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private marks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mk:I

.field private node_created:Z

.field private nodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbsh/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u696a\u54f2;",
            ">;"
        }
    .end annotation
.end field

.field private sp:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lbsh/JJTParserState;->sp:I

    .line 20
    .line 21
    iput v0, p0, Lbsh/JJTParserState;->mk:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public clearNodeScope(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 1

    .line 1
    :goto_0
    iget p1, p0, Lbsh/JJTParserState;->sp:I

    .line 2
    .line 3
    iget v0, p0, Lbsh/JJTParserState;->mk:I

    .line 4
    .line 5
    if-le p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/JJTParserState;->popNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lbsh/JJTParserState;->mk:I

    .line 30
    .line 31
    return-void
.end method

.method public closeNodeScope(Lbsh/飘花落叶言子世兰苏楪哲;I)V
    .locals 3

    .line 75
    iget-object v0, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lbsh/JJTParserState;->mk:I

    :goto_0
    add-int/lit8 v0, p2, -0x1

    if-lez p2, :cond_0

    .line 76
    invoke-virtual {p0}, Lbsh/JJTParserState;->popNode()Lbsh/飘花落叶言子世兰苏楪哲;

    move-result-object p2

    .line 77
    invoke-interface {p2, p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 78
    invoke-interface {p1, p2, v0}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtAddChild(Lbsh/飘花落叶言子世兰苏楪哲;I)V

    move p2, v0

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtClose()V

    .line 80
    invoke-virtual {p0, p1}, Lbsh/JJTParserState;->pushNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 81
    iput-boolean v2, p0, Lbsh/JJTParserState;->node_created:Z

    return-void
.end method

.method public closeNodeScope(Lbsh/飘花落叶言子世兰苏楪哲;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Lbsh/JJTParserState;->nodeArity()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v1, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int/2addr v2, v0

    .line 15
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, p0, Lbsh/JJTParserState;->mk:I

    .line 26
    .line 27
    :goto_0
    add-int/lit8 v1, p2, -0x1

    .line 28
    .line 29
    if-lez p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lbsh/JJTParserState;->popNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2, p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, p2, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtAddChild(Lbsh/飘花落叶言子世兰苏楪哲;I)V

    .line 39
    .line 40
    .line 41
    move p2, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtClose()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lbsh/JJTParserState;->pushNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 47
    .line 48
    .line 49
    iput-boolean v0, p0, Lbsh/JJTParserState;->node_created:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    iget-object p1, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    sub-int/2addr p2, v0

    .line 59
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lbsh/JJTParserState;->mk:I

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    iput-boolean p1, p0, Lbsh/JJTParserState;->node_created:Z

    .line 73
    .line 74
    return-void
.end method

.method public nodeArity()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/JJTParserState;->sp:I

    .line 2
    .line 3
    iget p0, p0, Lbsh/JJTParserState;->mk:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public nodeCreated()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/JJTParserState;->node_created:Z

    .line 2
    .line 3
    return p0
.end method

.method public openNodeScope(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lbsh/JJTParserState;->mk:I

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lbsh/JJTParserState;->sp:I

    .line 13
    .line 14
    iput v0, p0, Lbsh/JJTParserState;->mk:I

    .line 15
    .line 16
    invoke-interface {p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtOpen()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public peekNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 14
    .line 15
    return-object p0
.end method

.method public popNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 2

    .line 1
    iget v0, p0, Lbsh/JJTParserState;->sp:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/JJTParserState;->sp:I

    .line 6
    .line 7
    iget v1, p0, Lbsh/JJTParserState;->mk:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lbsh/JJTParserState;->mk:I

    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 44
    .line 45
    return-object p0
.end method

.method public pushNode(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lbsh/JJTParserState;->sp:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lbsh/JJTParserState;->sp:I

    .line 11
    .line 12
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/JJTParserState;->marks:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lbsh/JJTParserState;->sp:I

    .line 13
    .line 14
    iput v0, p0, Lbsh/JJTParserState;->mk:I

    .line 15
    .line 16
    return-void
.end method

.method public rootNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/JJTParserState;->nodes:Ljava/util/List;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 9
    .line 10
    return-object p0
.end method
