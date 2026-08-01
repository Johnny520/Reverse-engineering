.class public abstract L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Transfer-Encoding"

    .line 2
    .line 3
    const-string v1, "Upgrade"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sput-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v0, v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-gez v4, :cond_1

    .line 25
    .line 26
    const/16 v4, 0x9

    .line 27
    .line 28
    if-ne v2, v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v0, Lio/ktor/http/IllegalHeaderValueException;

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, Lio/ktor/http/IllegalHeaderValueException;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-lez v4, :cond_0

    .line 25
    .line 26
    const-string v4, "\"(),/:;<=>?@[\\]{}"

    .line 27
    .line 28
    invoke-static {v4, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲兰世(Ljava/lang/CharSequence;C)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Lio/ktor/http/IllegalHeaderNameException;

    .line 39
    .line 40
    invoke-direct {v0, p0, v1}, Lio/ktor/http/IllegalHeaderNameException;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    return-void
.end method
