.class public final Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/lang3/CharRange;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏兰世:C


# direct methods
.method public constructor <init>(Lorg/apache/commons/lang3/CharRange;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/lang3/CharRange;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 8
    .line 9
    invoke-static {p1}, Lorg/apache/commons/lang3/CharRange;->access$000(Lorg/apache/commons/lang3/CharRange;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-static {p1}, Lorg/apache/commons/lang3/CharRange;->access$100(Lorg/apache/commons/lang3/CharRange;)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Lorg/apache/commons/lang3/CharRange;->access$200(Lorg/apache/commons/lang3/CharRange;)C

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const v3, 0xffff

    .line 27
    .line 28
    .line 29
    if-ne v1, v3, :cond_0

    .line 30
    .line 31
    iput-boolean v2, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {p1}, Lorg/apache/commons/lang3/CharRange;->access$200(Lorg/apache/commons/lang3/CharRange;)C

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/2addr p1, v0

    .line 39
    int-to-char p1, p1

    .line 40
    iput-char p1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iput-char v2, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-static {p1}, Lorg/apache/commons/lang3/CharRange;->access$100(Lorg/apache/commons/lang3/CharRange;)C

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput-char p1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-char v0, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 6
    .line 7
    iget-object v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/lang3/CharRange;

    .line 8
    .line 9
    invoke-static {v1}, Lorg/apache/commons/lang3/CharRange;->access$000(Lorg/apache/commons/lang3/CharRange;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-char v3, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    const v2, 0xffff

    .line 19
    .line 20
    .line 21
    if-ne v3, v2, :cond_0

    .line 22
    .line 23
    iput-boolean v4, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    invoke-static {v1}, Lorg/apache/commons/lang3/CharRange;->access$100(Lorg/apache/commons/lang3/CharRange;)C

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-ne v3, v5, :cond_2

    .line 33
    .line 34
    invoke-static {v1}, Lorg/apache/commons/lang3/CharRange;->access$200(Lorg/apache/commons/lang3/CharRange;)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ne v3, v2, :cond_1

    .line 39
    .line 40
    iput-boolean v4, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v1}, Lorg/apache/commons/lang3/CharRange;->access$200(Lorg/apache/commons/lang3/CharRange;)C

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    int-to-char v1, v1

    .line 50
    iput-char v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-char v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    int-to-char v1, v1

    .line 58
    iput-char v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v1}, Lorg/apache/commons/lang3/CharRange;->access$200(Lorg/apache/commons/lang3/CharRange;)C

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ge v3, v1, :cond_4

    .line 66
    .line 67
    iget-char v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    int-to-char v1, v1

    .line 72
    iput-char v1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:C

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iput-boolean v4, p0, Lorg/apache/commons/lang3/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 76
    .line 77
    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method
