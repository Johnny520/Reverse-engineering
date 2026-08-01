.class public final synthetic Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:C

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪兰苏哲世:[Ljava/lang/reflect/Field;

.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;IILjava/lang/Class;CLjava/lang/String;[Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    .line 11
    .line 12
    iput-char p5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:C

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/reflect/Field;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 25
    .line 26
    iget v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 27
    .line 28
    sub-int/2addr v2, v3

    .line 29
    iget-object v4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:[Ljava/lang/reflect/Field;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    if-ne v1, v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v7, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    .line 41
    .line 42
    if-eq v2, v7, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v7, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    :cond_1
    const/16 v2, 0x41

    .line 55
    .line 56
    iget-char p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:C

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    if-lt p0, v2, :cond_2

    .line 60
    .line 61
    const/16 v2, 0x5a

    .line 62
    .line 63
    if-gt p0, v2, :cond_2

    .line 64
    .line 65
    add-int/lit8 p0, p0, 0x20

    .line 66
    .line 67
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ne p0, v2, :cond_2

    .line 72
    .line 73
    add-int/lit8 p0, v3, 0x1

    .line 74
    .line 75
    add-int/lit8 v2, v1, -0x1

    .line 76
    .line 77
    invoke-virtual {v0, v7, v4, p0, v2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    aput-object p1, v5, v6

    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    invoke-virtual {v0, v6, v4, v3, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_4

    .line 91
    .line 92
    aput-object p1, v5, v7

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne p0, v1, :cond_4

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_4

    .line 108
    .line 109
    aput-object p1, v5, v6

    .line 110
    .line 111
    :cond_4
    :goto_0
    return-void
.end method
