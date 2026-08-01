.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public 飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 7
    .line 8
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/function/Function;

    .line 15
    .line 16
    if-eqz p6, :cond_0

    .line 17
    .line 18
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p2, 0x1

    .line 30
    aget-object p1, p1, p2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 14
    .line 15
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 16
    .line 17
    or-long v5, p4, v2

    .line 18
    .line 19
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    move-object v4, p3

    .line 22
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_1
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 31
    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p3, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    .line 37
    :cond_2
    const-string p3, "create object error"

    .line 38
    .line 39
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/function/Function;

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    :try_start_0
    invoke-interface {p4, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-object p0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    move-object p0, v0

    .line 50
    invoke-virtual {v2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_3
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 59
    .line 60
    if-eqz p4, :cond_4

    .line 61
    .line 62
    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p4, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    return-object p0

    .line 71
    :catch_1
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    invoke-virtual {v2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_4
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 82
    .line 83
    if-eqz p4, :cond_6

    .line 84
    .line 85
    :try_start_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p4, p2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :catch_2
    move-exception v0

    .line 99
    move-object p0, v0

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p4, p2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 109
    return-object p0

    .line 110
    :goto_0
    invoke-virtual {v2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    return-object p2

    .line 118
    :cond_6
    invoke-virtual {v2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object p2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
