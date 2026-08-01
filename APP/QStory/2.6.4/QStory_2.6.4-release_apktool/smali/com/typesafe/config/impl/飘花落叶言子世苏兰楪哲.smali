.class public final Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

.field public 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪兰哲世苏:Z

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/LinkedList;

.field public final 飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/io/StringReader;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/LinkedList;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/io/StringReader;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/io/StringReader;

    .line 9
    .line 10
    iput-boolean p3, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰哲世苏:Z

    .line 11
    .line 12
    new-instance p2, Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedList;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    iput p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰(I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 27
    .line 28
    new-instance p1, Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/util/LinkedList;

    .line 34
    .line 35
    sget-object p2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 41
    .line 42
    const/4 p2, 0x3

    .line 43
    invoke-direct {p1, p2}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 47
    .line 48
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;
    .locals 8

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 2
    .line 3
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 4
    .line 5
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;

    .line 6
    .line 7
    move-object v3, p0

    .line 8
    move-object v4, p1

    .line 9
    move-object v5, p2

    .line 10
    move v6, p3

    .line 11
    move-object v7, p4

    .line 12
    invoke-direct/range {v2 .. v7}, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v2}, Lcom/typesafe/config/impl/Tokenizer$ProblemException;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    :try_start_0
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 26
    .line 27
    iget p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    invoke-virtual {v2, v3, v4, p0}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/typesafe/config/impl/Tokenizer$ProblemException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    invoke-virtual {p0}, Lcom/typesafe/config/impl/Tokenizer$ProblemException;->problem()Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "bug: tokens queue should not be empty here"

    .line 58
    .line 59
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_2
    :goto_1
    return-object v1
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Does not make sense to remove items from token stream"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(I)Z
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰哲世苏:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/16 v0, 0x23

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    return v2

    .line 16
    :cond_1
    const/16 v0, 0x2f

    .line 17
    .line 18
    if-ne p1, v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 25
    .line 26
    .line 27
    if-ne p1, v0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "bug: putBack() three times, undesirable look-ahead"

    .line 19
    .line 20
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    move-object/from16 v4, p1

    .line 23
    .line 24
    iget-object v2, v4, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    if-ne v0, v3, :cond_2

    .line 33
    .line 34
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    iget-object v4, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x1

    .line 41
    if-ne v0, v2, :cond_3

    .line 42
    .line 43
    iget-object v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 44
    .line 45
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 46
    .line 47
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲苏楪兰;

    .line 48
    .line 49
    sget-object v3, Lcom/typesafe/config/impl/TokenType;->NEWLINE:Lcom/typesafe/config/impl/TokenType;

    .line 50
    .line 51
    invoke-direct {v2, v3, v0, v5, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 55
    .line 56
    add-int/2addr v0, v6

    .line 57
    iput v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 58
    .line 59
    invoke-virtual {v4, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰(I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_3
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const/16 v8, 0x2f

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    if-eqz v7, :cond_9

    .line 74
    .line 75
    if-ne v0, v8, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v8, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const-string v0, "called pullComment but // not seen"

    .line 85
    .line 86
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v5

    .line 90
    :cond_5
    move v6, v9

    .line 91
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    :goto_3
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eq v4, v3, :cond_7

    .line 101
    .line 102
    if-ne v4, v2, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    :goto_4
    invoke-virtual {v1, v4}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 113
    .line 114
    if-eqz v6, :cond_8

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 121
    .line 122
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲楪苏兰;

    .line 123
    .line 124
    invoke-direct {v2, v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲楪苏兰;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 133
    .line 134
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲楪苏兰;

    .line 135
    .line 136
    invoke-direct {v2, v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲楪苏兰;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_9
    const/4 v7, 0x3

    .line 141
    const-string v10, ""

    .line 142
    .line 143
    const/4 v11, 0x4

    .line 144
    const/16 v12, 0x22

    .line 145
    .line 146
    if-eq v0, v12, :cond_19

    .line 147
    .line 148
    const/16 v2, 0x24

    .line 149
    .line 150
    const/16 v4, 0x7b

    .line 151
    .line 152
    if-eq v0, v2, :cond_13

    .line 153
    .line 154
    const/16 v2, 0x3a

    .line 155
    .line 156
    if-eq v0, v2, :cond_12

    .line 157
    .line 158
    const/16 v2, 0x3d

    .line 159
    .line 160
    if-eq v0, v2, :cond_11

    .line 161
    .line 162
    const/16 v7, 0x5b

    .line 163
    .line 164
    if-eq v0, v7, :cond_10

    .line 165
    .line 166
    const/16 v7, 0x5d

    .line 167
    .line 168
    if-eq v0, v7, :cond_f

    .line 169
    .line 170
    if-eq v0, v4, :cond_e

    .line 171
    .line 172
    const/16 v4, 0x7d

    .line 173
    .line 174
    if-eq v0, v4, :cond_d

    .line 175
    .line 176
    const/16 v4, 0x2b

    .line 177
    .line 178
    if-eq v0, v4, :cond_b

    .line 179
    .line 180
    const/16 v2, 0x2c

    .line 181
    .line 182
    if-eq v0, v2, :cond_a

    .line 183
    .line 184
    move-object v2, v5

    .line 185
    :goto_5
    move/from16 p1, v6

    .line 186
    .line 187
    goto/16 :goto_e

    .line 188
    .line 189
    :cond_a
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_b
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-ne v4, v2, :cond_c

    .line 197
    .line 198
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_c
    invoke-static {v4}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v3, "\'+\' not followed by =, \'"

    .line 208
    .line 209
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v4}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v3, "\' not allowed after \'+\'"

    .line 220
    .line 221
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 229
    .line 230
    invoke-static {v1, v0, v2, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    throw v0

    .line 235
    :cond_d
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_e
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_f
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲世兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_10
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_11
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_12
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_13
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 254
    .line 255
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    if-ne v8, v4, :cond_18

    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    const/16 v8, 0x3f

    .line 266
    .line 267
    if-ne v4, v8, :cond_14

    .line 268
    .line 269
    move v4, v6

    .line 270
    goto :goto_6

    .line 271
    :cond_14
    invoke-virtual {v1, v4}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 272
    .line 273
    .line 274
    move v4, v9

    .line 275
    :goto_6
    new-instance v8, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 276
    .line 277
    invoke-direct {v8, v7}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 278
    .line 279
    .line 280
    new-instance v7, Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 283
    .line 284
    .line 285
    :goto_7
    invoke-virtual {v1, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    sget-object v13, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 290
    .line 291
    if-ne v12, v13, :cond_15

    .line 292
    .line 293
    new-instance v8, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 294
    .line 295
    invoke-direct {v8, v2, v4, v7}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;ZLjava/util/ArrayList;)V

    .line 296
    .line 297
    .line 298
    move/from16 p1, v6

    .line 299
    .line 300
    move-object v2, v8

    .line 301
    goto/16 :goto_e

    .line 302
    .line 303
    :cond_15
    sget-object v13, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 304
    .line 305
    if-eq v12, v13, :cond_17

    .line 306
    .line 307
    iget v13, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 308
    .line 309
    invoke-virtual {v8, v12, v2, v13}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    if-eqz v13, :cond_16

    .line 314
    .line 315
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_16
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_17
    const-string v0, "Substitution ${ was not closed with a }"

    .line 323
    .line 324
    invoke-static {v2, v10, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    throw v0

    .line 329
    :cond_18
    invoke-static {v8}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v2, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    const-string v3, "\'$\' not followed by {, \'"

    .line 336
    .line 337
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v8}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v3, "\' not allowed after \'$\'"

    .line 348
    .line 349
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 357
    .line 358
    invoke-static {v1, v0, v2, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    throw v0

    .line 363
    :cond_19
    new-instance v13, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    new-instance v14, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    :goto_8
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 377
    .line 378
    .line 379
    move-result v15

    .line 380
    if-eq v15, v3, :cond_40

    .line 381
    .line 382
    move/from16 p1, v6

    .line 383
    .line 384
    const/16 v6, 0x5c

    .line 385
    .line 386
    if-ne v15, v6, :cond_26

    .line 387
    .line 388
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    if-eq v15, v3, :cond_25

    .line 393
    .line 394
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    if-eq v15, v12, :cond_24

    .line 401
    .line 402
    if-eq v15, v8, :cond_23

    .line 403
    .line 404
    if-eq v15, v6, :cond_22

    .line 405
    .line 406
    const/16 v6, 0x62

    .line 407
    .line 408
    if-eq v15, v6, :cond_21

    .line 409
    .line 410
    const/16 v6, 0x66

    .line 411
    .line 412
    if-eq v15, v6, :cond_20

    .line 413
    .line 414
    const/16 v6, 0x6e

    .line 415
    .line 416
    if-eq v15, v6, :cond_1f

    .line 417
    .line 418
    const/16 v6, 0x72

    .line 419
    .line 420
    if-eq v15, v6, :cond_1e

    .line 421
    .line 422
    const/16 v6, 0x74

    .line 423
    .line 424
    if-eq v15, v6, :cond_1d

    .line 425
    .line 426
    const/16 v6, 0x75

    .line 427
    .line 428
    if-ne v15, v6, :cond_1c

    .line 429
    .line 430
    new-array v6, v11, [C

    .line 431
    .line 432
    move v15, v9

    .line 433
    :goto_9
    if-ge v15, v11, :cond_1b

    .line 434
    .line 435
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    if-eq v11, v3, :cond_1a

    .line 440
    .line 441
    int-to-char v11, v11

    .line 442
    aput-char v11, v6, v15

    .line 443
    .line 444
    add-int/lit8 v15, v15, 0x1

    .line 445
    .line 446
    const/4 v11, 0x4

    .line 447
    goto :goto_9

    .line 448
    :cond_1a
    const-string v0, "End of input but expecting 4 hex digits for \\uXXXX escape"

    .line 449
    .line 450
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 451
    .line 452
    invoke-static {v1, v10, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    throw v0

    .line 457
    :cond_1b
    new-instance v11, Ljava/lang/String;

    .line 458
    .line 459
    invoke-direct {v11, v6}, Ljava/lang/String;-><init>([C)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    const/16 v6, 0x10

    .line 466
    .line 467
    :try_start_0
    invoke-static {v11, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    .line 473
    .line 474
    goto :goto_a

    .line 475
    :catch_0
    move-exception v0

    .line 476
    const-string v2, "Malformed hex digits after \\u escape in string: \'"

    .line 477
    .line 478
    const-string v3, "\'"

    .line 479
    .line 480
    invoke-static {v2, v11, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 485
    .line 486
    invoke-static {v1, v11, v2, v9, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    throw v0

    .line 491
    :cond_1c
    invoke-static {v15}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v15}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    const-string v3, "backslash followed by \'"

    .line 500
    .line 501
    const-string v4, "\', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)"

    .line 502
    .line 503
    invoke-static {v3, v2, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 508
    .line 509
    invoke-static {v1, v0, v2, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    throw v0

    .line 514
    :cond_1d
    const/16 v6, 0x9

    .line 515
    .line 516
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_1e
    const/16 v6, 0xd

    .line 521
    .line 522
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_1f
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    goto :goto_a

    .line 530
    :cond_20
    const/16 v6, 0xc

    .line 531
    .line 532
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_21
    const/16 v6, 0x8

    .line 537
    .line 538
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_22
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_23
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_24
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    :goto_a
    move/from16 v6, p1

    .line 554
    .line 555
    const/4 v11, 0x4

    .line 556
    goto/16 :goto_14

    .line 557
    .line 558
    :cond_25
    const-string v0, "End of input but backslash in string had nothing after it"

    .line 559
    .line 560
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 561
    .line 562
    invoke-static {v1, v10, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    throw v0

    .line 567
    :cond_26
    if-ne v15, v12, :cond_3d

    .line 568
    .line 569
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    if-nez v6, :cond_2c

    .line 577
    .line 578
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 579
    .line 580
    .line 581
    move-result v6

    .line 582
    if-ne v6, v12, :cond_2b

    .line 583
    .line 584
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    move v6, v9

    .line 588
    :goto_b
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 589
    .line 590
    .line 591
    move-result v8

    .line 592
    if-ne v8, v12, :cond_27

    .line 593
    .line 594
    add-int/lit8 v6, v6, 0x1

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_27
    if-lt v6, v7, :cond_28

    .line 598
    .line 599
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    sub-int/2addr v2, v7

    .line 604
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 608
    .line 609
    .line 610
    goto :goto_d

    .line 611
    :cond_28
    if-eq v8, v3, :cond_2a

    .line 612
    .line 613
    if-ne v8, v2, :cond_29

    .line 614
    .line 615
    iget v6, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 616
    .line 617
    add-int/lit8 v6, v6, 0x1

    .line 618
    .line 619
    iput v6, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 620
    .line 621
    invoke-virtual {v4, v6}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰(I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 622
    .line 623
    .line 624
    move-result-object v6

    .line 625
    iput-object v6, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 626
    .line 627
    :cond_29
    move v6, v9

    .line 628
    :goto_c
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    goto :goto_b

    .line 635
    :cond_2a
    const-string v0, "End of input but triple-quoted string was still open"

    .line 636
    .line 637
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 638
    .line 639
    invoke-static {v1, v10, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    throw v0

    .line 644
    :cond_2b
    invoke-virtual {v1, v6}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 645
    .line 646
    .line 647
    :cond_2c
    :goto_d
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 648
    .line 649
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v6

    .line 657
    sget-object v7, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 658
    .line 659
    new-instance v7, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 660
    .line 661
    invoke-direct {v7, v2, v4}, Lcom/typesafe/config/impl/ConfigString$Quoted;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 665
    .line 666
    invoke-direct {v2, v7, v6}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    :goto_e
    if-nez v2, :cond_3c

    .line 670
    .line 671
    const-string v2, "0123456789-"

    .line 672
    .line 673
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    const-string v4, "\' is not allowed outside quotes"

    .line 678
    .line 679
    const-string v6, "Reserved character \'"

    .line 680
    .line 681
    const-string v7, "$\"{}[]:=,+#`^?!@*&\\"

    .line 682
    .line 683
    if-ltz v2, :cond_33

    .line 684
    .line 685
    new-instance v2, Ljava/lang/StringBuilder;

    .line 686
    .line 687
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    move v8, v0

    .line 698
    move v0, v9

    .line 699
    :goto_f
    if-eq v8, v3, :cond_2f

    .line 700
    .line 701
    const-string v10, "0123456789eE+-."

    .line 702
    .line 703
    invoke-virtual {v10, v8}, Ljava/lang/String;->indexOf(I)I

    .line 704
    .line 705
    .line 706
    move-result v10

    .line 707
    if-ltz v10, :cond_2f

    .line 708
    .line 709
    const/16 v10, 0x2e

    .line 710
    .line 711
    if-eq v8, v10, :cond_2d

    .line 712
    .line 713
    const/16 v10, 0x65

    .line 714
    .line 715
    if-eq v8, v10, :cond_2d

    .line 716
    .line 717
    const/16 v10, 0x45

    .line 718
    .line 719
    if-ne v8, v10, :cond_2e

    .line 720
    .line 721
    :cond_2d
    move/from16 v0, p1

    .line 722
    .line 723
    :cond_2e
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 727
    .line 728
    .line 729
    move-result v8

    .line 730
    goto :goto_f

    .line 731
    :cond_2f
    invoke-virtual {v1, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    iget-object v3, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 739
    .line 740
    if-eqz v0, :cond_30

    .line 741
    .line 742
    :try_start_1
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 743
    .line 744
    .line 745
    move-result-wide v10

    .line 746
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 747
    .line 748
    invoke-static {v3, v10, v11, v2}, Lcom/typesafe/config/impl/ConfigNumber;->newNumber(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 753
    .line 754
    invoke-direct {v3, v0, v2}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    return-object v3

    .line 758
    :cond_30
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 759
    .line 760
    .line 761
    move-result-wide v10

    .line 762
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 763
    .line 764
    invoke-static {v3, v10, v11, v2}, Lcom/typesafe/config/impl/ConfigNumber;->newNumber(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 769
    .line 770
    invoke-direct {v3, v0, v2}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 771
    .line 772
    .line 773
    return-object v3

    .line 774
    :catch_1
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    array-length v3, v0

    .line 779
    :goto_10
    if-ge v9, v3, :cond_32

    .line 780
    .line 781
    aget-char v8, v0, v9

    .line 782
    .line 783
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    .line 784
    .line 785
    .line 786
    move-result v10

    .line 787
    if-gez v10, :cond_31

    .line 788
    .line 789
    add-int/lit8 v9, v9, 0x1

    .line 790
    .line 791
    goto :goto_10

    .line 792
    :cond_31
    invoke-static {v8}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    new-instance v2, Ljava/lang/StringBuilder;

    .line 797
    .line 798
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-static {v8}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 816
    .line 817
    move/from16 v3, p1

    .line 818
    .line 819
    invoke-static {v1, v0, v2, v3, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    throw v0

    .line 824
    :cond_32
    iget-object v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 825
    .line 826
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 827
    .line 828
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 829
    .line 830
    invoke-direct {v1, v0, v2}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-object v1

    .line 834
    :cond_33
    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    if-gez v2, :cond_3b

    .line 839
    .line 840
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 841
    .line 842
    .line 843
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 844
    .line 845
    new-instance v8, Ljava/lang/StringBuilder;

    .line 846
    .line 847
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    :goto_11
    if-ne v0, v3, :cond_34

    .line 855
    .line 856
    goto :goto_12

    .line 857
    :cond_34
    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    if-ltz v4, :cond_35

    .line 862
    .line 863
    goto :goto_12

    .line 864
    :cond_35
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(I)Z

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    if-eqz v4, :cond_36

    .line 869
    .line 870
    goto :goto_12

    .line 871
    :cond_36
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 872
    .line 873
    .line 874
    move-result v4

    .line 875
    if-eqz v4, :cond_37

    .line 876
    .line 877
    :goto_12
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 885
    .line 886
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 887
    .line 888
    invoke-direct {v1, v2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    return-object v1

    .line 892
    :cond_37
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    const/4 v11, 0x4

    .line 900
    if-ne v0, v11, :cond_39

    .line 901
    .line 902
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    const-string v4, "true"

    .line 907
    .line 908
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v5

    .line 912
    if-eqz v5, :cond_38

    .line 913
    .line 914
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 915
    .line 916
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 917
    .line 918
    const/4 v3, 0x1

    .line 919
    invoke-direct {v0, v2, v3}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 920
    .line 921
    .line 922
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 923
    .line 924
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    return-object v1

    .line 928
    :cond_38
    const-string v4, "null"

    .line 929
    .line 930
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-eqz v0, :cond_3a

    .line 935
    .line 936
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 937
    .line 938
    new-instance v0, Lcom/typesafe/config/impl/ConfigNull;

    .line 939
    .line 940
    invoke-direct {v0, v2}, Lcom/typesafe/config/impl/ConfigNull;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 941
    .line 942
    .line 943
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 944
    .line 945
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    return-object v1

    .line 949
    :cond_39
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    const/4 v4, 0x5

    .line 954
    if-ne v0, v4, :cond_3a

    .line 955
    .line 956
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    const-string v4, "false"

    .line 961
    .line 962
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-eqz v0, :cond_3a

    .line 967
    .line 968
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 969
    .line 970
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 971
    .line 972
    invoke-direct {v0, v2, v9}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 973
    .line 974
    .line 975
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;

    .line 976
    .line 977
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    return-object v1

    .line 981
    :cond_3a
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    goto/16 :goto_11

    .line 986
    .line 987
    :cond_3b
    invoke-static {v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    new-instance v3, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    invoke-static {v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1011
    .line 1012
    const/4 v6, 0x1

    .line 1013
    invoke-static {v1, v2, v0, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    throw v0

    .line 1018
    :cond_3c
    return-object v2

    .line 1019
    :cond_3d
    move/from16 v6, p1

    .line 1020
    .line 1021
    const/4 v11, 0x4

    .line 1022
    if-ltz v15, :cond_3f

    .line 1023
    .line 1024
    const/16 v2, 0x1f

    .line 1025
    .line 1026
    if-le v15, v2, :cond_3e

    .line 1027
    .line 1028
    goto :goto_13

    .line 1029
    :cond_3e
    invoke-static {v15}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    const-string v3, "JSON does not allow unescaped "

    .line 1036
    .line 1037
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v15}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    const-string v3, " in quoted strings, use a backslash escape"

    .line 1048
    .line 1049
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1057
    .line 1058
    invoke-static {v1, v0, v2, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    throw v0

    .line 1063
    :cond_3f
    :goto_13
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    .line 1069
    :goto_14
    const/16 v2, 0xa

    .line 1070
    .line 1071
    goto/16 :goto_8

    .line 1072
    .line 1073
    :cond_40
    const-string v0, "End of input but string quote was still open"

    .line 1074
    .line 1075
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1076
    .line 1077
    invoke-static {v1, v10, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    throw v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/io/StringReader;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return p0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    new-instance v1, Lcom/typesafe/config/ConfigException$IO;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "read error: "

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 38
    .line 39
    invoke-direct {v1, p0, v2, v0}, Lcom/typesafe/config/ConfigException$IO;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method
