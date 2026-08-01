.class public final Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/io/StringReader;Z)V
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
    sget-object p2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 41
    .line 42
    const/4 p2, 0x2

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
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 4
    .line 5
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲苏楪兰;

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
    invoke-direct/range {v2 .. v7}, Lcom/typesafe/config/impl/飘花落叶言子世哲苏楪兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V

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
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

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
    invoke-virtual {v2, v3, v4, p0}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

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
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

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
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

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
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

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
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 46
    .line 47
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲楪兰苏;

    .line 48
    .line 49
    sget-object v3, Lcom/typesafe/config/impl/TokenType;->NEWLINE:Lcom/typesafe/config/impl/TokenType;

    .line 50
    .line 51
    invoke-direct {v2, v3, v0, v5, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

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
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

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
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 121
    .line 122
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;

    .line 123
    .line 124
    invoke-direct {v2, v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;)V

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
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 133
    .line 134
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;

    .line 135
    .line 136
    invoke-direct {v2, v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_9
    const-string v7, ""

    .line 141
    .line 142
    const/4 v10, 0x4

    .line 143
    const/16 v11, 0x22

    .line 144
    .line 145
    if-eq v0, v11, :cond_19

    .line 146
    .line 147
    const/16 v2, 0x24

    .line 148
    .line 149
    const/16 v4, 0x7b

    .line 150
    .line 151
    if-eq v0, v2, :cond_13

    .line 152
    .line 153
    const/16 v2, 0x3a

    .line 154
    .line 155
    if-eq v0, v2, :cond_12

    .line 156
    .line 157
    const/16 v2, 0x3d

    .line 158
    .line 159
    if-eq v0, v2, :cond_11

    .line 160
    .line 161
    const/16 v7, 0x5b

    .line 162
    .line 163
    if-eq v0, v7, :cond_10

    .line 164
    .line 165
    const/16 v7, 0x5d

    .line 166
    .line 167
    if-eq v0, v7, :cond_f

    .line 168
    .line 169
    if-eq v0, v4, :cond_e

    .line 170
    .line 171
    const/16 v4, 0x7d

    .line 172
    .line 173
    if-eq v0, v4, :cond_d

    .line 174
    .line 175
    const/16 v4, 0x2b

    .line 176
    .line 177
    if-eq v0, v4, :cond_b

    .line 178
    .line 179
    const/16 v2, 0x2c

    .line 180
    .line 181
    if-eq v0, v2, :cond_a

    .line 182
    .line 183
    move-object v2, v5

    .line 184
    goto/16 :goto_d

    .line 185
    .line 186
    :cond_a
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲苏兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 187
    .line 188
    goto/16 :goto_d

    .line 189
    .line 190
    :cond_b
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-ne v4, v2, :cond_c

    .line 195
    .line 196
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏哲兰世:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 197
    .line 198
    goto/16 :goto_d

    .line 199
    .line 200
    :cond_c
    invoke-static {v4}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v3, "\'+\' not followed by =, \'"

    .line 207
    .line 208
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v4}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v3, "\' not allowed after \'+\'"

    .line 219
    .line 220
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 228
    .line 229
    invoke-static {v1, v0, v2, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    throw v0

    .line 234
    :cond_d
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 235
    .line 236
    goto/16 :goto_d

    .line 237
    .line 238
    :cond_e
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 239
    .line 240
    goto/16 :goto_d

    .line 241
    .line 242
    :cond_f
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏哲世兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 243
    .line 244
    goto/16 :goto_d

    .line 245
    .line 246
    :cond_10
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 247
    .line 248
    goto/16 :goto_d

    .line 249
    .line 250
    :cond_11
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 251
    .line 252
    goto/16 :goto_d

    .line 253
    .line 254
    :cond_12
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰苏哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 255
    .line 256
    goto/16 :goto_d

    .line 257
    .line 258
    :cond_13
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 259
    .line 260
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-ne v8, v4, :cond_18

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    const/16 v8, 0x3f

    .line 271
    .line 272
    if-ne v4, v8, :cond_14

    .line 273
    .line 274
    move v4, v6

    .line 275
    goto :goto_5

    .line 276
    :cond_14
    invoke-virtual {v1, v4}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 277
    .line 278
    .line 279
    move v4, v9

    .line 280
    :goto_5
    new-instance v8, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 281
    .line 282
    const/4 v11, 0x2

    .line 283
    invoke-direct {v8, v11}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 284
    .line 285
    .line 286
    new-instance v11, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    :goto_6
    invoke-virtual {v1, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    sget-object v13, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 296
    .line 297
    if-ne v12, v13, :cond_15

    .line 298
    .line 299
    new-instance v7, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;

    .line 300
    .line 301
    invoke-direct {v7, v2, v4, v11}, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;ZLjava/util/ArrayList;)V

    .line 302
    .line 303
    .line 304
    move-object v2, v7

    .line 305
    goto/16 :goto_d

    .line 306
    .line 307
    :cond_15
    sget-object v13, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 308
    .line 309
    if-eq v12, v13, :cond_17

    .line 310
    .line 311
    iget v13, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 312
    .line 313
    invoke-virtual {v8, v12, v2, v13}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    if-eqz v13, :cond_16

    .line 318
    .line 319
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    :cond_16
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_17
    const-string v0, "Substitution ${ was not closed with a }"

    .line 327
    .line 328
    invoke-static {v2, v7, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    throw v0

    .line 333
    :cond_18
    invoke-static {v8}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    new-instance v2, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    const-string v3, "\'$\' not followed by {, \'"

    .line 340
    .line 341
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v8}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string v3, "\' not allowed after \'$\'"

    .line 352
    .line 353
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 361
    .line 362
    invoke-static {v1, v0, v2, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    throw v0

    .line 367
    :cond_19
    new-instance v12, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    new-instance v13, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    :goto_7
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    if-eq v14, v3, :cond_40

    .line 385
    .line 386
    const/16 v15, 0x5c

    .line 387
    .line 388
    if-ne v14, v15, :cond_26

    .line 389
    .line 390
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 391
    .line 392
    .line 393
    move-result v14

    .line 394
    if-eq v14, v3, :cond_25

    .line 395
    .line 396
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    if-eq v14, v11, :cond_24

    .line 403
    .line 404
    if-eq v14, v8, :cond_23

    .line 405
    .line 406
    if-eq v14, v15, :cond_22

    .line 407
    .line 408
    const/16 v15, 0x62

    .line 409
    .line 410
    if-eq v14, v15, :cond_21

    .line 411
    .line 412
    const/16 v15, 0x66

    .line 413
    .line 414
    if-eq v14, v15, :cond_20

    .line 415
    .line 416
    const/16 v15, 0x6e

    .line 417
    .line 418
    if-eq v14, v15, :cond_1f

    .line 419
    .line 420
    const/16 v15, 0x72

    .line 421
    .line 422
    if-eq v14, v15, :cond_1e

    .line 423
    .line 424
    const/16 v15, 0x74

    .line 425
    .line 426
    if-eq v14, v15, :cond_1d

    .line 427
    .line 428
    const/16 v15, 0x75

    .line 429
    .line 430
    if-ne v14, v15, :cond_1c

    .line 431
    .line 432
    new-array v14, v10, [C

    .line 433
    .line 434
    move v15, v9

    .line 435
    :goto_8
    if-ge v15, v10, :cond_1b

    .line 436
    .line 437
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    if-eq v10, v3, :cond_1a

    .line 442
    .line 443
    int-to-char v10, v10

    .line 444
    aput-char v10, v14, v15

    .line 445
    .line 446
    add-int/lit8 v15, v15, 0x1

    .line 447
    .line 448
    const/4 v10, 0x4

    .line 449
    goto :goto_8

    .line 450
    :cond_1a
    const-string v0, "End of input but expecting 4 hex digits for \\uXXXX escape"

    .line 451
    .line 452
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 453
    .line 454
    invoke-static {v1, v7, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    throw v0

    .line 459
    :cond_1b
    new-instance v10, Ljava/lang/String;

    .line 460
    .line 461
    invoke-direct {v10, v14}, Ljava/lang/String;-><init>([C)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    const/16 v14, 0x10

    .line 468
    .line 469
    :try_start_0
    invoke-static {v10, v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 470
    .line 471
    .line 472
    move-result v14

    .line 473
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :catch_0
    move-exception v0

    .line 478
    const-string v2, "Malformed hex digits after \\u escape in string: \'"

    .line 479
    .line 480
    const-string v3, "\'"

    .line 481
    .line 482
    invoke-static {v2, v10, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 487
    .line 488
    invoke-static {v1, v10, v2, v9, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    throw v0

    .line 493
    :cond_1c
    invoke-static {v14}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-static {v14}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const-string v3, "backslash followed by \'"

    .line 502
    .line 503
    const-string v4, "\', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)"

    .line 504
    .line 505
    invoke-static {v3, v2, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 510
    .line 511
    invoke-static {v1, v0, v2, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    throw v0

    .line 516
    :cond_1d
    const/16 v10, 0x9

    .line 517
    .line 518
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    goto :goto_9

    .line 522
    :cond_1e
    const/16 v10, 0xd

    .line 523
    .line 524
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_1f
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_20
    const/16 v10, 0xc

    .line 533
    .line 534
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_21
    const/16 v10, 0x8

    .line 539
    .line 540
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_22
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    goto :goto_9

    .line 548
    :cond_23
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_24
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    :goto_9
    const/4 v15, 0x4

    .line 556
    goto/16 :goto_13

    .line 557
    .line 558
    :cond_25
    const-string v0, "End of input but backslash in string had nothing after it"

    .line 559
    .line 560
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 561
    .line 562
    invoke-static {v1, v7, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    throw v0

    .line 567
    :cond_26
    if-ne v14, v11, :cond_3d

    .line 568
    .line 569
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 573
    .line 574
    .line 575
    move-result v8

    .line 576
    if-nez v8, :cond_2c

    .line 577
    .line 578
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    if-ne v8, v11, :cond_2b

    .line 583
    .line 584
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    move v8, v9

    .line 588
    :goto_a
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 589
    .line 590
    .line 591
    move-result v10

    .line 592
    if-ne v10, v11, :cond_27

    .line 593
    .line 594
    add-int/lit8 v8, v8, 0x1

    .line 595
    .line 596
    goto :goto_b

    .line 597
    :cond_27
    const/4 v14, 0x3

    .line 598
    if-lt v8, v14, :cond_28

    .line 599
    .line 600
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    sub-int/2addr v2, v14

    .line 605
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v10}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 609
    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_28
    if-eq v10, v3, :cond_2a

    .line 613
    .line 614
    if-ne v10, v2, :cond_29

    .line 615
    .line 616
    iget v8, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 617
    .line 618
    add-int/2addr v8, v6

    .line 619
    iput v8, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

    .line 620
    .line 621
    invoke-virtual {v4, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰(I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    iput-object v8, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 626
    .line 627
    :cond_29
    move v8, v9

    .line 628
    :goto_b
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_2a
    const-string v0, "End of input but triple-quoted string was still open"

    .line 636
    .line 637
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 638
    .line 639
    invoke-static {v1, v7, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    throw v0

    .line 644
    :cond_2b
    invoke-virtual {v1, v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 645
    .line 646
    .line 647
    :cond_2c
    :goto_c
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 648
    .line 649
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v7

    .line 657
    sget-object v8, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 658
    .line 659
    new-instance v8, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 660
    .line 661
    invoke-direct {v8, v2, v4}, Lcom/typesafe/config/impl/ConfigString$Quoted;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 665
    .line 666
    invoke-direct {v2, v8, v7}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    :goto_d
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
    const-string v7, "Reserved character \'"

    .line 680
    .line 681
    const-string v8, "$\"{}[]:=,+#`^?!@*&\\"

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
    move v10, v9

    .line 698
    :goto_e
    if-eq v0, v3, :cond_2f

    .line 699
    .line 700
    const-string v11, "0123456789eE+-."

    .line 701
    .line 702
    invoke-virtual {v11, v0}, Ljava/lang/String;->indexOf(I)I

    .line 703
    .line 704
    .line 705
    move-result v11

    .line 706
    if-ltz v11, :cond_2f

    .line 707
    .line 708
    const/16 v11, 0x2e

    .line 709
    .line 710
    if-eq v0, v11, :cond_2d

    .line 711
    .line 712
    const/16 v11, 0x65

    .line 713
    .line 714
    if-eq v0, v11, :cond_2d

    .line 715
    .line 716
    const/16 v11, 0x45

    .line 717
    .line 718
    if-ne v0, v11, :cond_2e

    .line 719
    .line 720
    :cond_2d
    move v10, v6

    .line 721
    :cond_2e
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    goto :goto_e

    .line 729
    :cond_2f
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 737
    .line 738
    if-eqz v10, :cond_30

    .line 739
    .line 740
    :try_start_1
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 741
    .line 742
    .line 743
    move-result-wide v10

    .line 744
    sget-object v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 745
    .line 746
    invoke-static {v2, v10, v11, v0}, Lcom/typesafe/config/impl/ConfigNumber;->newNumber(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 751
    .line 752
    invoke-direct {v3, v2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    return-object v3

    .line 756
    :cond_30
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 757
    .line 758
    .line 759
    move-result-wide v10

    .line 760
    sget-object v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 761
    .line 762
    invoke-static {v2, v10, v11, v0}, Lcom/typesafe/config/impl/ConfigNumber;->newNumber(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 767
    .line 768
    invoke-direct {v3, v2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 769
    .line 770
    .line 771
    return-object v3

    .line 772
    :catch_1
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    array-length v3, v2

    .line 777
    :goto_f
    if-ge v9, v3, :cond_32

    .line 778
    .line 779
    aget-char v10, v2, v9

    .line 780
    .line 781
    invoke-virtual {v8, v10}, Ljava/lang/String;->indexOf(I)I

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    if-gez v11, :cond_31

    .line 786
    .line 787
    add-int/lit8 v9, v9, 0x1

    .line 788
    .line 789
    goto :goto_f

    .line 790
    :cond_31
    invoke-static {v10}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    new-instance v2, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    invoke-static {v10}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 814
    .line 815
    invoke-static {v1, v0, v2, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    throw v0

    .line 820
    :cond_32
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 821
    .line 822
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 823
    .line 824
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 825
    .line 826
    invoke-direct {v2, v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    return-object v2

    .line 830
    :cond_33
    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    if-gez v2, :cond_3b

    .line 835
    .line 836
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 837
    .line 838
    .line 839
    iget-object v2, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 840
    .line 841
    new-instance v10, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    :goto_10
    if-ne v0, v3, :cond_34

    .line 851
    .line 852
    goto :goto_11

    .line 853
    :cond_34
    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    if-ltz v4, :cond_35

    .line 858
    .line 859
    goto :goto_11

    .line 860
    :cond_35
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(I)Z

    .line 861
    .line 862
    .line 863
    move-result v4

    .line 864
    if-eqz v4, :cond_36

    .line 865
    .line 866
    goto :goto_11

    .line 867
    :cond_36
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 868
    .line 869
    .line 870
    move-result v4

    .line 871
    if-eqz v4, :cond_37

    .line 872
    .line 873
    :goto_11
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 881
    .line 882
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 883
    .line 884
    invoke-direct {v1, v2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    return-object v1

    .line 888
    :cond_37
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    const/4 v15, 0x4

    .line 896
    if-ne v0, v15, :cond_39

    .line 897
    .line 898
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    const-string v4, "true"

    .line 903
    .line 904
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v5

    .line 908
    if-eqz v5, :cond_38

    .line 909
    .line 910
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 911
    .line 912
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 913
    .line 914
    invoke-direct {v0, v2, v6}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 915
    .line 916
    .line 917
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 918
    .line 919
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    return-object v1

    .line 923
    :cond_38
    const-string v4, "null"

    .line 924
    .line 925
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    if-eqz v0, :cond_3a

    .line 930
    .line 931
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 932
    .line 933
    new-instance v0, Lcom/typesafe/config/impl/ConfigNull;

    .line 934
    .line 935
    invoke-direct {v0, v2}, Lcom/typesafe/config/impl/ConfigNull;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 936
    .line 937
    .line 938
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 939
    .line 940
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    return-object v1

    .line 944
    :cond_39
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    const/4 v4, 0x5

    .line 949
    if-ne v0, v4, :cond_3a

    .line 950
    .line 951
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    const-string v4, "false"

    .line 956
    .line 957
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_3a

    .line 962
    .line 963
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 964
    .line 965
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 966
    .line 967
    invoke-direct {v0, v2, v9}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 968
    .line 969
    .line 970
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 971
    .line 972
    invoke-direct {v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    return-object v1

    .line 976
    :cond_3a
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()I

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    goto/16 :goto_10

    .line 981
    .line 982
    :cond_3b
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    new-instance v3, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1006
    .line 1007
    invoke-static {v1, v2, v0, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    throw v0

    .line 1012
    :cond_3c
    return-object v2

    .line 1013
    :cond_3d
    const/4 v15, 0x4

    .line 1014
    if-ltz v14, :cond_3f

    .line 1015
    .line 1016
    const/16 v10, 0x1f

    .line 1017
    .line 1018
    if-le v14, v10, :cond_3e

    .line 1019
    .line 1020
    goto :goto_12

    .line 1021
    :cond_3e
    invoke-static {v14}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    const-string v3, "JSON does not allow unescaped "

    .line 1028
    .line 1029
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v14}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v3

    .line 1036
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    const-string v3, " in quoted strings, use a backslash escape"

    .line 1040
    .line 1041
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1049
    .line 1050
    invoke-static {v1, v0, v2, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    throw v0

    .line 1055
    :cond_3f
    :goto_12
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    :goto_13
    move v10, v15

    .line 1062
    goto/16 :goto_7

    .line 1063
    .line 1064
    :cond_40
    const-string v0, "End of input but string quote was still open"

    .line 1065
    .line 1066
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 1067
    .line 1068
    invoke-static {v1, v7, v0, v9, v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/typesafe/config/impl/Tokenizer$ProblemException;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
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
    invoke-direct {v1, p0, v2, v0}, Lcom/typesafe/config/ConfigException$IO;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V

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
