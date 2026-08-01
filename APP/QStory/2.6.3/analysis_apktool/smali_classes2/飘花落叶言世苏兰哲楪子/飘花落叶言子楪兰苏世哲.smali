.class public final L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    .line 9
    .line 10
    sget-object v1, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    invoke-static {v0, v1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世()L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Unexpected JSON element, expected JsonLiteral, had "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-interface {p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰苏楪哲()L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    iget-boolean p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v0, p0}, Lkotlinx/serialization/json/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    move-object v8, p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    new-instance v3, Lkotlinx/serialization/json/JsonDecodingException;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v9, 0x0

    .line 61
    invoke-static {v5, v7, v9, v0, v8}, Lkotlinx/serialization/json/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const/4 v6, -0x1

    .line 66
    invoke-direct/range {v3 .. v9}, Lkotlinx/serialization/json/JsonDecodingException;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v3

    .line 70
    :cond_1
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;

    .line 71
    .line 72
    return-object p1
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p2, p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏世兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪兰世哲(Ljava/lang/String;)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-interface {p1, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏楪哲世兰(J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-static {p0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Ljava/lang/String;)Lkotlin/飘花落叶言子楪哲兰世苏;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    iget-wide v0, p2, Lkotlin/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:J

    .line 52
    .line 53
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子哲楪兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏楪哲兰;

    .line 54
    .line 55
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏世兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏楪哲世兰(J)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/String;)Ljava/lang/Double;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-interface {p1, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(D)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    const-string p2, "true"

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    const-string p2, "false"

    .line 89
    .line 90
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_6

    .line 95
    .line 96
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    const/4 p2, 0x0

    .line 100
    :goto_0
    if-eqz p2, :cond_7

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲世苏兰(Z)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_7
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method
