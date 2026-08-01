.class public final synthetic L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:[Ljava/lang/Class;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    move v0, v2

    .line 21
    :goto_0
    array-length v3, p1

    .line 22
    if-ge v0, v3, :cond_1

    .line 23
    .line 24
    aget-object v3, p1, v0

    .line 25
    .line 26
    iget-object v4, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:[Ljava/lang/Class;

    .line 27
    .line 28
    aget-object v4, v4, v0

    .line 29
    .line 30
    const-class v5, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    if-eq v4, v5, :cond_0

    .line 33
    .line 34
    invoke-static {v3, v4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v1, v2

    .line 44
    :cond_2
    return v1

    .line 45
    :pswitch_0
    iget-object v0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget-object p0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eq p1, p0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v1, v2

    .line 63
    :goto_1
    return v1

    .line 64
    :pswitch_1
    iget-object v0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-static {p1, p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move v1, v2

    .line 82
    :goto_2
    return v1

    .line 83
    :pswitch_2
    iget-object v0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p0, p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move v1, v2

    .line 101
    :goto_3
    return v1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
