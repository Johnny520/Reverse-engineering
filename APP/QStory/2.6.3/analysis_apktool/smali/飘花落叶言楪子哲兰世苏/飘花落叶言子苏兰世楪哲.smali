.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪苏世哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:[B

.field public final 飘花落叶言子楪世兰苏哲:[C

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 5
    .line 6
    const-class v0, Ljava/lang/Object;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "[O"

    .line 11
    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:[B

    .line 17
    .line 18
    const-string p1, "[0"

    .line 19
    .line 20
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 25
    .line 26
    const-string p1, "{\"@type\":\"[O"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "["

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:[B

    .line 52
    .line 53
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iput-wide v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 58
    .line 59
    const-string v0, "{\"@type\":\""

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    const-string v0, "\",\"@value\":["

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:[C

    .line 76
    .line 77
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏:[B

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    move-object p5, p2

    .line 12
    check-cast p5, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:[B

    .line 21
    .line 22
    iget-wide v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 25
    .line 26
    .line 27
    :cond_1
    array-length p2, p5

    .line 28
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    const/4 p4, 0x0

    .line 33
    move p6, p4

    .line 34
    move p4, p3

    .line 35
    move-object p3, p2

    .line 36
    :goto_0
    array-length v0, p5

    .line 37
    if-ge p6, v0, :cond_7

    .line 38
    .line 39
    aget-object v3, p5, p6

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 44
    .line 45
    .line 46
    move-object v2, p1

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, p2, :cond_3

    .line 53
    .line 54
    move-object v1, p3

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏()Z

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-eqz p4, :cond_4

    .line 65
    .line 66
    invoke-static {v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    xor-int/lit8 p4, p2, 0x1

    .line 71
    .line 72
    :cond_4
    move-object v1, p3

    .line 73
    move-object p2, v0

    .line 74
    :goto_1
    if-eqz p4, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1, p6, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(ILjava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v2, p1

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v5, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 95
    .line 96
    const-wide/16 v6, 0x0

    .line 97
    .line 98
    move-object v2, p1

    .line 99
    invoke-interface/range {v1 .. v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 100
    .line 101
    .line 102
    if-eqz p4, :cond_6

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_2
    move-object p3, v1

    .line 108
    :goto_3
    add-int/lit8 p6, p6, 0x1

    .line 109
    .line 110
    move-object p1, v2

    .line 111
    goto :goto_0

    .line 112
    :cond_7
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 9

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_3

    .line 20
    .line 21
    iget-boolean p4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    iget-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:[C

    .line 26
    .line 27
    array-length v0, p4

    .line 28
    invoke-virtual {p1, v0, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世哲兰苏(I[C)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏:[B

    .line 33
    .line 34
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰哲苏([B)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏()Z

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    check-cast p2, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    const/4 v1, 0x0

    .line 49
    move v7, v1

    .line 50
    move-object v1, v0

    .line 51
    :goto_1
    array-length v2, p2

    .line 52
    if-ge v7, v2, :cond_a

    .line 53
    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 57
    .line 58
    .line 59
    :cond_4
    aget-object v2, p2, v7

    .line 60
    .line 61
    if-nez v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-ne v3, v0, :cond_6

    .line 72
    .line 73
    move-object v8, v0

    .line 74
    move-object v0, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏()Z

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz p4, :cond_7

    .line 85
    .line 86
    invoke-static {v3}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    xor-int/lit8 p4, p4, 0x1

    .line 91
    .line 92
    :cond_7
    move-object v0, v1

    .line 93
    move-object v8, v3

    .line 94
    :goto_2
    if-eqz p4, :cond_8

    .line 95
    .line 96
    invoke-virtual {p1, v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(ILjava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_8

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 114
    .line 115
    move-object v1, p1

    .line 116
    move-wide v5, p5

    .line 117
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 118
    .line 119
    .line 120
    if-eqz p4, :cond_9

    .line 121
    .line 122
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    :goto_3
    move-object v1, v0

    .line 126
    move-object v0, v8

    .line 127
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 131
    .line 132
    .line 133
    if-eqz p3, :cond_b

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 136
    .line 137
    .line 138
    :cond_b
    return-void
.end method
