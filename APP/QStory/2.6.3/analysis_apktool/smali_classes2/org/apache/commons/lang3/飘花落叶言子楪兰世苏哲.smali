.class public final Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p1}, Lorg/apache/commons/lang3/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Lorg/apache/commons/lang3/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    if-eqz p3, :cond_4

    .line 14
    .line 15
    iget-boolean v0, p0, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0, p1, p2}, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, -0x1

    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    sub-int/2addr v4, v3

    .line 41
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    mul-int/lit8 v4, v4, 0x10

    .line 46
    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    add-int/2addr v6, v4

    .line 54
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    move v4, v2

    .line 58
    :goto_0
    if-eq v1, v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v5, p1, v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    add-int v0, v1, v3

    .line 67
    .line 68
    add-int/2addr v4, v2

    .line 69
    if-nez v4, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {p0, v0, p1, p2}, Lorg/apache/commons/lang3/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {v5, p1, v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_4
    :goto_2
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(ILjava/lang/CharSequence;Ljava/lang/String;)I
    .locals 0

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of p0, p2, Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    instance-of p0, p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    check-cast p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_2
    instance-of p0, p2, Ljava/lang/StringBuffer;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    check-cast p2, Ljava/lang/StringBuffer;

    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p0, p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :cond_4
    :goto_0
    const/4 p0, -0x1

    .line 65
    return p0
.end method
