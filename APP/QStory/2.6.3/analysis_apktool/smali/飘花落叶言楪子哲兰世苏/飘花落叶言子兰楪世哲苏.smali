.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

.field public 飘花落叶言子楪世兰苏哲:J

.field public 飘花落叶言子楪世哲兰苏:[B

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Member;

.field public final 飘花落叶言子楪苏世兰哲:[J

.field public final 飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

.field public 飘花落叶言子楪苏哲世兰:[[B

.field public final 飘花落叶言子楪苏哲兰世:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Member;[Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Member;

    .line 7
    .line 8
    instance-of v0, p2, Ljava/lang/reflect/AccessibleObject;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    check-cast p2, Ljava/lang/reflect/AccessibleObject;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, [Ljava/lang/Enum;

    .line 23
    .line 24
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

    .line 25
    .line 26
    array-length p2, p1

    .line 27
    new-array p2, p2, [Ljava/lang/String;

    .line 28
    .line 29
    iput-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    new-array p1, p1, [J

    .line 33
    .line 34
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏世兰哲:[J

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    :goto_0
    iget-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

    .line 38
    .line 39
    array-length v0, p2

    .line 40
    if-ge p1, v0, :cond_1

    .line 41
    .line 42
    aget-object p2, p2, p1

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 49
    .line 50
    aput-object p2, v0, p1

    .line 51
    .line 52
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏世兰哲:[J

    .line 53
    .line 54
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    aput-wide v1, v0, p1

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iput-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲兰世:[Ljava/lang/String;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲兰苏:[B

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    iput-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲兰苏:[B

    .line 22
    .line 23
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p3

    .line 27
    iput-wide p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世兰苏哲:J

    .line 28
    .line 29
    :cond_0
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲兰苏:[B

    .line 30
    .line 31
    iget-wide p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世兰苏哲:J

    .line 32
    .line 33
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 34
    .line 35
    .line 36
    :cond_1
    check-cast p2, Ljava/lang/Enum;

    .line 37
    .line 38
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲世兰:[[B

    .line 55
    .line 56
    iget-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 57
    .line 58
    if-nez p3, :cond_3

    .line 59
    .line 60
    array-length p3, p4

    .line 61
    new-array p3, p3, [[B

    .line 62
    .line 63
    iput-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲世兰:[[B

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲世兰:[[B

    .line 70
    .line 71
    aget-object p3, p3, p2

    .line 72
    .line 73
    if-nez p3, :cond_4

    .line 74
    .line 75
    aget-object p3, p4, p2

    .line 76
    .line 77
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲世兰:[[B

    .line 82
    .line 83
    aput-object p3, p0, p2

    .line 84
    .line 85
    :cond_4
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰哲苏([B)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 4

    .line 1
    move-object p3, p2

    .line 2
    check-cast p3, Ljava/lang/Enum;

    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p4, 0x0

    .line 11
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Member;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :try_start_0
    instance-of v1, v0, Ljava/lang/reflect/Field;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast v0, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    check-cast v0, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v0, p2, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    if-eq v0, p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p0

    .line 39
    const-string p1, "getEnumValue error"

    .line 40
    .line 41
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p5

    .line 49
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 50
    .line 51
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 52
    .line 53
    and-long/2addr v0, p5

    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    cmp-long p2, v0, v2

    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingOrdinal:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 69
    .line 70
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 71
    .line 72
    and-long/2addr p5, v0

    .line 73
    cmp-long p2, p5, v2

    .line 74
    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪苏哲兰世:[Ljava/lang/String;

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    array-length p5, p0

    .line 94
    if-ge p2, p5, :cond_5

    .line 95
    .line 96
    aget-object p4, p0, p2

    .line 97
    .line 98
    :cond_5
    if-nez p4, :cond_6

    .line 99
    .line 100
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    :cond_6
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
