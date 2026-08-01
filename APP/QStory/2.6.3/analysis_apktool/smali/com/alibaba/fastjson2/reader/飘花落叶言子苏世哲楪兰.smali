.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "value"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    check-cast p0, [Ljava/lang/String;

    .line 34
    .line 35
    array-length p1, p0

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p1, "alphabetic"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    :cond_1
    :goto_0
    return-void

    .line 59
    :pswitch_0
    check-cast v2, Ljava/lang/Class;

    .line 60
    .line 61
    check-cast p1, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const v5, 0x2818581a

    .line 72
    .line 73
    .line 74
    if-eq v4, v5, :cond_4

    .line 75
    .line 76
    const v5, 0x7b4778ef

    .line 77
    .line 78
    .line 79
    if-eq v4, v5, :cond_3

    .line 80
    .line 81
    const v2, 0x7cbf22f8

    .line 82
    .line 83
    .line 84
    if-eq v4, v2, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    const-string v2, "withPrefix"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    const-string v4, "buildMethod"

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    const-string v4, "buildMethodName"

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    :goto_1
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v2, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    .line 139
    :catchall_1
    :cond_5
    :goto_2
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
