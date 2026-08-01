.class public L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子世兰哲苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子苏楪世哲兰:J


# instance fields
.field public 飘花落叶言子世兰哲楪苏:Z

.field public final 飘花落叶言子世兰楪哲苏:Z

.field public volatile 飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

.field public final 飘花落叶言子世兰苏哲楪:Z

.field public final 飘花落叶言子世兰苏楪哲:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Class;

    .line 4
    .line 5
    const-string v2, "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰哲苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子苏楪世哲兰:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    const-wide/high16 p1, 0x2000000000000L

    .line 5
    .line 6
    and-long/2addr p1, p3

    .line 7
    const-wide/16 p3, 0x0

    .line 8
    .line 9
    cmp-long p1, p1, p3

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    const/4 p3, 0x1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move p1, p3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, p2

    .line 18
    :goto_0
    iput-boolean p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪哲苏:Z

    .line 19
    .line 20
    const-class p1, Ljava/util/Currency;

    .line 21
    .line 22
    if-ne p9, p1, :cond_1

    .line 23
    .line 24
    iput-object p9, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

    .line 25
    .line 26
    sget-object p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

    .line 27
    .line 28
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p9}, Ljava/lang/Class;->isArray()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    const-class p1, Ljava/util/Collection;

    .line 37
    .line 38
    invoke-virtual {p1, p9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const-class p1, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 45
    .line 46
    if-eq p9, p1, :cond_2

    .line 47
    .line 48
    const-class p1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 49
    .line 50
    if-ne p9, p1, :cond_3

    .line 51
    .line 52
    :cond_2
    move p2, p3

    .line 53
    :cond_3
    iput-boolean p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰苏楪哲:Z

    .line 54
    .line 55
    const-class p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1, p9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput-boolean p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰苏哲楪:Z

    .line 62
    .line 63
    return-void
.end method

.method public static 飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;JZL飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;)Z
    .locals 8

    .line 1
    instance-of v0, p1, Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-boolean p5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 46
    .line 47
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v4, p2

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long v4, v4, v6

    .line 53
    .line 54
    if-nez v4, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-nez p5, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世楪兰苏()V

    .line 63
    .line 64
    .line 65
    :cond_1
    if-nez v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3, p0, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    if-eqz p4, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return v1

    .line 89
    :cond_4
    instance-of p2, p5, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 90
    .line 91
    if-eqz p2, :cond_6

    .line 92
    .line 93
    check-cast p5, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 94
    .line 95
    iget-object p2, p5, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-eqz p3, :cond_5

    .line 106
    .line 107
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    check-cast p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 112
    .line 113
    invoke-virtual {p3, p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    return v1

    .line 118
    :cond_6
    const/4 p0, 0x0

    .line 119
    return p0
.end method


# virtual methods
.method public 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 6
    .line 7
    sget-object v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰哲楪世;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    const-class v3, Ljava/util/Map;

    .line 16
    .line 17
    if-eq v0, p2, :cond_4

    .line 18
    .line 19
    iget-boolean v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰哲楪苏:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_4

    .line 28
    .line 29
    :cond_1
    if-ne v0, v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_4

    .line 36
    .line 37
    :cond_2
    const-class v4, Ljava/util/List;

    .line 38
    .line 39
    if-ne v0, v4, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    move v4, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_4
    :goto_0
    move v4, v1

    .line 51
    :goto_1
    if-nez v4, :cond_e

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_e

    .line 58
    .line 59
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    if-ne v0, v4, :cond_5

    .line 62
    .line 63
    const-class v4, Ljava/lang/Integer;

    .line 64
    .line 65
    if-eq p2, v4, :cond_d

    .line 66
    .line 67
    :cond_5
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne v0, v4, :cond_6

    .line 70
    .line 71
    const-class v4, Ljava/lang/Long;

    .line 72
    .line 73
    if-eq p2, v4, :cond_d

    .line 74
    .line 75
    :cond_6
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    if-ne v0, v4, :cond_7

    .line 78
    .line 79
    const-class v4, Ljava/lang/Boolean;

    .line 80
    .line 81
    if-eq p2, v4, :cond_d

    .line 82
    .line 83
    :cond_7
    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    if-ne v0, v4, :cond_8

    .line 86
    .line 87
    const-class v4, Ljava/lang/Short;

    .line 88
    .line 89
    if-eq p2, v4, :cond_d

    .line 90
    .line 91
    :cond_8
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    if-ne v0, v4, :cond_9

    .line 94
    .line 95
    const-class v4, Ljava/lang/Byte;

    .line 96
    .line 97
    if-eq p2, v4, :cond_d

    .line 98
    .line 99
    :cond_9
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    if-ne v0, v4, :cond_a

    .line 102
    .line 103
    const-class v4, Ljava/lang/Float;

    .line 104
    .line 105
    if-eq p2, v4, :cond_d

    .line 106
    .line 107
    :cond_a
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    if-ne v0, v4, :cond_b

    .line 110
    .line 111
    const-class v4, Ljava/lang/Double;

    .line 112
    .line 113
    if-eq p2, v4, :cond_d

    .line 114
    .line 115
    :cond_b
    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 116
    .line 117
    if-ne v0, v4, :cond_c

    .line 118
    .line 119
    const-class v0, Ljava/lang/Character;

    .line 120
    .line 121
    if-ne p2, v0, :cond_c

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_c
    move v1, v2

    .line 125
    :cond_d
    :goto_2
    move v4, v1

    .line 126
    :cond_e
    const/4 v0, 0x0

    .line 127
    if-eqz v4, :cond_14

    .line 128
    .line 129
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 130
    .line 131
    if-nez v1, :cond_13

    .line 132
    .line 133
    invoke-virtual {v3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_10

    .line 138
    .line 139
    iget-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_f

    .line 146
    .line 147
    iget-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 148
    .line 149
    invoke-static {p1, v0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    goto :goto_3

    .line 154
    :cond_f
    invoke-static {p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    goto :goto_3

    .line 159
    :cond_10
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_3
    sget-object p2, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 164
    .line 165
    :cond_11
    invoke-virtual {p2, p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_12

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_12
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_11

    .line 177
    .line 178
    :goto_4
    return-object p1

    .line 179
    :cond_13
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_14
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 183
    .line 184
    iget-object v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 185
    .line 186
    invoke-virtual {v3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_16

    .line 191
    .line 192
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-eqz p0, :cond_15

    .line 197
    .line 198
    invoke-static {v1, v0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_15
    invoke-static {p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲楪世;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :cond_16
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p0, :cond_17

    .line 211
    .line 212
    invoke-static {v1, v2, p0, v0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :cond_17
    if-nez v0, :cond_18

    .line 217
    .line 218
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :cond_18
    return-object v0

    .line 224
    :cond_19
    :goto_5
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 13

    .line 1
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const-string v0, "$super$"

    .line 13
    .line 14
    iget-object v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 23
    .line 24
    iget-wide v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 25
    .line 26
    iget-wide v9, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 27
    .line 28
    or-long/2addr v3, v9

    .line 29
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide v9, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    and-long/2addr v3, v9

    .line 34
    cmp-long v0, v3, v1

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    move v6, v7

    .line 39
    :cond_0
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 40
    .line 41
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 42
    .line 43
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1, v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 50
    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    sget-object v6, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰哲苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 59
    .line 60
    sget-wide v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子苏楪世哲兰:J

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    move-object v1, p0

    .line 64
    move-object v5, p2

    .line 65
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    move-object v1, v0

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    sget-object v4, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 73
    .line 74
    :cond_2
    invoke-virtual {v4, p0, v8, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    :cond_5
    :goto_0
    return-object p1

    .line 95
    :cond_6
    move-object v5, p2

    .line 96
    iget-object v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 97
    .line 98
    if-nez v3, :cond_9

    .line 99
    .line 100
    iget-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 101
    .line 102
    iget-wide v9, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 103
    .line 104
    iget-wide v11, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 105
    .line 106
    or-long/2addr v9, v11

    .line 107
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 108
    .line 109
    iget-wide v11, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 110
    .line 111
    and-long/2addr v9, v11

    .line 112
    cmp-long v1, v9, v1

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    move v1, v7

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    move v1, v6

    .line 119
    :goto_1
    iget-object v2, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 120
    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    iget-object v1, v2, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    .line 125
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_8
    iget-object v1, v2, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 133
    .line 134
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_9
    move-object v1, v8

    .line 142
    :goto_2
    iget-object v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Ljava/text/DecimalFormat;

    .line 143
    .line 144
    const-class v3, [Ljava/lang/Float;

    .line 145
    .line 146
    if-ne v5, v3, :cond_b

    .line 147
    .line 148
    if-eqz v2, :cond_a

    .line 149
    .line 150
    new-instance v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;

    .line 151
    .line 152
    const-class v3, Ljava/lang/Float;

    .line 153
    .line 154
    invoke-direct {v1, v3, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_a
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_b
    const-class v3, [Ljava/lang/Double;

    .line 162
    .line 163
    if-ne v5, v3, :cond_d

    .line 164
    .line 165
    if-eqz v2, :cond_c

    .line 166
    .line 167
    new-instance v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;

    .line 168
    .line 169
    const-class v3, Ljava/lang/Double;

    .line 170
    .line 171
    invoke-direct {v1, v3, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_c
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰世哲楪;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_d
    const-class v3, [F

    .line 179
    .line 180
    if-ne v5, v3, :cond_f

    .line 181
    .line 182
    if-eqz v2, :cond_e

    .line 183
    .line 184
    new-instance v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪苏世哲;

    .line 185
    .line 186
    invoke-direct {v1, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪苏世哲;-><init>(Ljava/text/DecimalFormat;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_e
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪苏世哲;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_f
    const-class v3, [D

    .line 194
    .line 195
    if-ne v5, v3, :cond_11

    .line 196
    .line 197
    if-eqz v2, :cond_10

    .line 198
    .line 199
    new-instance v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世苏哲;

    .line 200
    .line 201
    invoke-direct {v1, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世苏哲;-><init>(Ljava/text/DecimalFormat;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_10
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪世苏哲;

    .line 206
    .line 207
    :cond_11
    :goto_3
    if-nez v1, :cond_12

    .line 208
    .line 209
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 210
    .line 211
    iget-object v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 212
    .line 213
    iget-object v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/Locale;

    .line 216
    .line 217
    invoke-static {v1, v2, v3, v4, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :cond_12
    move-object v9, v1

    .line 222
    if-nez v9, :cond_18

    .line 223
    .line 224
    sget-object v10, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰哲苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 225
    .line 226
    :goto_4
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 230
    .line 231
    sget-wide v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子苏楪世哲兰:J

    .line 232
    .line 233
    const/4 v4, 0x0

    .line 234
    move-object v1, p0

    .line 235
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_13

    .line 240
    .line 241
    move v6, v7

    .line 242
    goto :goto_5

    .line 243
    :cond_13
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-eqz v0, :cond_17

    .line 248
    .line 249
    :goto_5
    invoke-virtual/range {p1 .. p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-eqz v6, :cond_16

    .line 254
    .line 255
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 256
    .line 257
    :cond_14
    invoke-virtual {v0, p0, v8, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_15

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_15
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-eqz v2, :cond_14

    .line 269
    .line 270
    :cond_16
    :goto_6
    return-object p1

    .line 271
    :cond_17
    move-object v5, p2

    .line 272
    goto :goto_4

    .line 273
    :cond_18
    iget-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 274
    .line 275
    if-nez p1, :cond_1d

    .line 276
    .line 277
    sget-object p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰哲苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 278
    .line 279
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 283
    .line 284
    sget-wide v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子苏楪世哲兰:J

    .line 285
    .line 286
    const/4 v4, 0x0

    .line 287
    move-object v1, p0

    .line 288
    move-object v5, p2

    .line 289
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_1c

    .line 294
    .line 295
    sget-object v4, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 296
    .line 297
    :cond_1a
    invoke-virtual {v4, p0, v8, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    if-eqz p1, :cond_1b

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_1b
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    if-eqz p1, :cond_1a

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_1c
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v0, :cond_19

    .line 316
    .line 317
    :cond_1d
    :goto_7
    return-object v9
.end method

.method public 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    iput-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v3, p0, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v1, v0, :cond_4

    .line 45
    .line 46
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_0
    if-eqz v1, :cond_b

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    invoke-static {v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    :goto_1
    move v7, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const/4 v0, 0x0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    if-eqz v7, :cond_7

    .line 73
    .line 74
    if-ne v2, p2, :cond_6

    .line 75
    .line 76
    const-string p0, ".."

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    iget-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1, v2, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-eqz p2, :cond_7

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 98
    .line 99
    if-eqz p2, :cond_9

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰哲世()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget-object v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 108
    .line 109
    if-eqz p2, :cond_8

    .line 110
    .line 111
    move-object v3, v4

    .line 112
    iget-wide v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 113
    .line 114
    move-object v0, v1

    .line 115
    move-object v1, p1

    .line 116
    invoke-interface/range {v0 .. v5}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    move-object v0, v1

    .line 121
    move-object p2, v3

    .line 122
    move-object v3, v4

    .line 123
    move-object v1, p1

    .line 124
    iget-wide v5, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 125
    .line 126
    move-object v3, p2

    .line 127
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_9
    move-object v0, v1

    .line 132
    move-object v1, p1

    .line 133
    iget-object v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 136
    .line 137
    iget-wide v5, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 138
    .line 139
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 140
    .line 141
    .line 142
    :goto_3
    if-eqz v7, :cond_a

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_a
    return-void

    .line 148
    :cond_b
    const-string p0, "get value writer error, valueType : "

    .line 149
    .line 150
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪哲苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    iget-wide v3, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 12
    .line 13
    or-long v5, v3, v8

    .line 14
    .line 15
    iput-wide v5, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 16
    .line 17
    iget-boolean v10, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲:Z

    .line 18
    .line 19
    const-wide/16 v12, 0x0

    .line 20
    .line 21
    if-nez v10, :cond_1

    .line 22
    .line 23
    sget-object v10, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 24
    .line 25
    iget-wide v14, v10, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 26
    .line 27
    and-long/2addr v14, v5

    .line 28
    cmp-long v10, v14, v12

    .line 29
    .line 30
    if-eqz v10, :cond_1

    .line 31
    .line 32
    :cond_0
    :goto_0
    const/4 v11, 0x0

    .line 33
    goto/16 :goto_c

    .line 34
    .line 35
    :cond_1
    iget-boolean v10, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏:Z

    .line 36
    .line 37
    if-eqz v10, :cond_2

    .line 38
    .line 39
    iget-object v10, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 40
    .line 41
    if-eqz v10, :cond_2

    .line 42
    .line 43
    invoke-virtual {v10, v2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :try_start_0
    invoke-virtual {v0, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 54
    iget-object v14, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 55
    .line 56
    const/4 v15, 0x1

    .line 57
    if-nez v10, :cond_d

    .line 58
    .line 59
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 60
    .line 61
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 62
    .line 63
    and-long/2addr v2, v5

    .line 64
    cmp-long v2, v2, v12

    .line 65
    .line 66
    const-class v3, Ljava/lang/Boolean;

    .line 67
    .line 68
    iget-boolean v4, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰苏哲楪:Z

    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 73
    .line 74
    move-wide/from16 v16, v12

    .line 75
    .line 76
    iget-wide v12, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 77
    .line 78
    and-long/2addr v12, v5

    .line 79
    cmp-long v2, v12, v16

    .line 80
    .line 81
    if-eqz v2, :cond_a

    .line 82
    .line 83
    if-nez v4, :cond_a

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-wide/from16 v16, v12

    .line 87
    .line 88
    :goto_1
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 89
    .line 90
    iget-wide v12, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 91
    .line 92
    and-long/2addr v12, v5

    .line 93
    cmp-long v2, v12, v16

    .line 94
    .line 95
    if-nez v2, :cond_a

    .line 96
    .line 97
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 98
    .line 99
    .line 100
    iget-boolean v0, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰苏楪哲:Z

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏()V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    const-class v0, Ljava/lang/Appendable;

    .line 115
    .line 116
    if-eq v14, v0, :cond_8

    .line 117
    .line 118
    const-class v0, Ljava/lang/StringBuffer;

    .line 119
    .line 120
    if-eq v14, v0, :cond_8

    .line 121
    .line 122
    const-class v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    if-ne v14, v0, :cond_6

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    if-ne v14, v3, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪兰苏世()V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    invoke-virtual {v1, v14}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世苏楪(Ljava/lang/Class;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰苏哲世()V

    .line 138
    .line 139
    .line 140
    :cond_9
    :goto_3
    move v11, v15

    .line 141
    goto/16 :goto_c

    .line 142
    .line 143
    :cond_a
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 144
    .line 145
    iget-wide v12, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 146
    .line 147
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 148
    .line 149
    move-wide/from16 v19, v12

    .line 150
    .line 151
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 152
    .line 153
    or-long v19, v19, v11

    .line 154
    .line 155
    and-long v19, v5, v19

    .line 156
    .line 157
    cmp-long v2, v19, v16

    .line 158
    .line 159
    if-eqz v2, :cond_b

    .line 160
    .line 161
    if-eqz v4, :cond_b

    .line 162
    .line 163
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 164
    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_b
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 172
    .line 173
    move-wide/from16 v19, v5

    .line 174
    .line 175
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 176
    .line 177
    or-long/2addr v4, v11

    .line 178
    and-long v4, v19, v4

    .line 179
    .line 180
    cmp-long v2, v4, v16

    .line 181
    .line 182
    if-eqz v2, :cond_0

    .line 183
    .line 184
    if-eq v14, v3, :cond_c

    .line 185
    .line 186
    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 187
    .line 188
    if-ne v14, v2, :cond_0

    .line 189
    .line 190
    :cond_c
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 191
    .line 192
    .line 193
    const/4 v2, 0x0

    .line 194
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_d
    move-wide/from16 v19, v5

    .line 199
    .line 200
    move-wide/from16 v16, v12

    .line 201
    .line 202
    if-ne v10, v2, :cond_e

    .line 203
    .line 204
    const-class v5, Ljava/lang/Throwable;

    .line 205
    .line 206
    if-ne v14, v5, :cond_e

    .line 207
    .line 208
    iget-object v6, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/reflect/Field;

    .line 209
    .line 210
    if-eqz v6, :cond_e

    .line 211
    .line 212
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    if-ne v6, v5, :cond_e

    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_e
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 221
    .line 222
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 223
    .line 224
    and-long v5, v19, v5

    .line 225
    .line 226
    cmp-long v5, v5, v16

    .line 227
    .line 228
    if-eqz v5, :cond_f

    .line 229
    .line 230
    instance-of v5, v10, Ljava/io/Serializable;

    .line 231
    .line 232
    if-nez v5, :cond_f

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_f
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 237
    .line 238
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 239
    .line 240
    and-long v5, v19, v5

    .line 241
    .line 242
    cmp-long v5, v5, v16

    .line 243
    .line 244
    if-eqz v5, :cond_11

    .line 245
    .line 246
    instance-of v5, v10, Ljava/util/Collection;

    .line 247
    .line 248
    if-eqz v5, :cond_10

    .line 249
    .line 250
    move-object v5, v10

    .line 251
    check-cast v5, Ljava/util/Collection;

    .line 252
    .line 253
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_10

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_10
    instance-of v5, v10, Ljava/util/Map;

    .line 262
    .line 263
    if-eqz v5, :cond_11

    .line 264
    .line 265
    move-object v5, v10

    .line 266
    check-cast v5, Ljava/util/Map;

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_11

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_11
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    if-eqz v5, :cond_13

    .line 281
    .line 282
    if-ne v10, v2, :cond_12

    .line 283
    .line 284
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 285
    .line 286
    .line 287
    const-string v0, ".."

    .line 288
    .line 289
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_3

    .line 293
    .line 294
    :cond_12
    invoke-virtual {v1, v0, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲楪兰世(L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    if-eqz v2, :cond_13

    .line 299
    .line 300
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_3

    .line 310
    .line 311
    :cond_13
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const-class v6, [B

    .line 316
    .line 317
    if-ne v2, v6, :cond_1b

    .line 318
    .line 319
    check-cast v10, [B

    .line 320
    .line 321
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 322
    .line 323
    .line 324
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 325
    .line 326
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 327
    .line 328
    and-long/2addr v5, v3

    .line 329
    cmp-long v2, v5, v16

    .line 330
    .line 331
    if-eqz v2, :cond_14

    .line 332
    .line 333
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏([B)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_3

    .line 337
    .line 338
    :cond_14
    const-string v2, "base64"

    .line 339
    .line 340
    iget-object v0, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-nez v2, :cond_1a

    .line 347
    .line 348
    if-nez v0, :cond_15

    .line 349
    .line 350
    invoke-virtual {v1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 351
    .line 352
    .line 353
    move-result-wide v2

    .line 354
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 355
    .line 356
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 357
    .line 358
    and-long/2addr v2, v4

    .line 359
    cmp-long v2, v2, v16

    .line 360
    .line 361
    if-eqz v2, :cond_15

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_15
    const-string v2, "hex"

    .line 365
    .line 366
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_16

    .line 371
    .line 372
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰苏世楪([B)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_3

    .line 376
    .line 377
    :cond_16
    const-string v2, "gzip,base64"

    .line 378
    .line 379
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-nez v2, :cond_18

    .line 384
    .line 385
    const-string v2, "gzip"

    .line 386
    .line 387
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_17

    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_17
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏世兰([B)V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_3

    .line 398
    .line 399
    :cond_18
    :goto_4
    const/4 v2, 0x0

    .line 400
    :try_start_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 401
    .line 402
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 403
    .line 404
    .line 405
    array-length v3, v10

    .line 406
    const/16 v4, 0x200

    .line 407
    .line 408
    if-ge v3, v4, :cond_19

    .line 409
    .line 410
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 411
    .line 412
    array-length v4, v10

    .line 413
    invoke-direct {v3, v0, v4}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 414
    .line 415
    .line 416
    :goto_5
    move-object v2, v3

    .line 417
    goto :goto_6

    .line 418
    :catchall_0
    move-exception v0

    .line 419
    goto :goto_8

    .line 420
    :catch_0
    move-exception v0

    .line 421
    goto :goto_7

    .line 422
    :cond_19
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 423
    .line 424
    invoke-direct {v3, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 425
    .line 426
    .line 427
    goto :goto_5

    .line 428
    :goto_6
    invoke-virtual {v2, v10}, Ljava/io/OutputStream;->write([B)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 435
    .line 436
    .line 437
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 438
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/io/Closeable;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪世苏兰([B)V

    .line 442
    .line 443
    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :goto_7
    :try_start_2
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 447
    .line 448
    const-string v3, "write gzipBytes error"

    .line 449
    .line 450
    invoke-direct {v1, v3, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 451
    .line 452
    .line 453
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 454
    :goto_8
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/io/Closeable;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :cond_1a
    :goto_9
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪世苏兰([B)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_3

    .line 462
    .line 463
    :cond_1b
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    if-eqz v6, :cond_21

    .line 468
    .line 469
    iget-boolean v2, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子世兰楪哲苏:Z

    .line 470
    .line 471
    if-eqz v2, :cond_1c

    .line 472
    .line 473
    move-object v2, v10

    .line 474
    move-wide/from16 v3, v19

    .line 475
    .line 476
    invoke-static/range {v1 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;JZL飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;)Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    move v10, v5

    .line 481
    if-eqz v3, :cond_1d

    .line 482
    .line 483
    goto/16 :goto_3

    .line 484
    .line 485
    :cond_1c
    move-object v2, v10

    .line 486
    move v10, v5

    .line 487
    :cond_1d
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 488
    .line 489
    .line 490
    iget-boolean v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 491
    .line 492
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 493
    .line 494
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 495
    .line 496
    move-wide v11, v4

    .line 497
    iget-wide v4, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 498
    .line 499
    and-long/2addr v11, v4

    .line 500
    cmp-long v11, v11, v16

    .line 501
    .line 502
    iget-object v12, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 503
    .line 504
    iget-object v0, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 505
    .line 506
    if-eqz v11, :cond_1f

    .line 507
    .line 508
    if-eqz v3, :cond_1e

    .line 509
    .line 510
    move-object v3, v0

    .line 511
    move-object v0, v6

    .line 512
    invoke-interface/range {v0 .. v5}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 513
    .line 514
    .line 515
    :goto_a
    move-object/from16 v1, p1

    .line 516
    .line 517
    goto :goto_b

    .line 518
    :cond_1e
    move-wide/from16 v21, v4

    .line 519
    .line 520
    move-object v4, v0

    .line 521
    move-object v0, v6

    .line 522
    move-wide/from16 v5, v21

    .line 523
    .line 524
    move-object v3, v12

    .line 525
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子世楪苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 526
    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_1f
    move-wide/from16 v21, v4

    .line 530
    .line 531
    move-object v4, v0

    .line 532
    move-object v0, v6

    .line 533
    move-wide/from16 v5, v21

    .line 534
    .line 535
    move v1, v3

    .line 536
    move-object v3, v12

    .line 537
    if-eqz v1, :cond_20

    .line 538
    .line 539
    move-object/from16 v1, p1

    .line 540
    .line 541
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 542
    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_20
    move-object/from16 v1, p1

    .line 546
    .line 547
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 548
    .line 549
    .line 550
    :goto_b
    if-eqz v10, :cond_9

    .line 551
    .line 552
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    goto/16 :goto_3

    .line 556
    .line 557
    :cond_21
    const-string v0, "get objectWriter error : "

    .line 558
    .line 559
    invoke-static {v2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    return v18

    .line 569
    :catch_1
    move-exception v0

    .line 570
    const/16 v18, 0x0

    .line 571
    .line 572
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰苏世()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    if-eqz v1, :cond_22

    .line 577
    .line 578
    move/from16 v11, v18

    .line 579
    .line 580
    :goto_c
    iput-wide v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 581
    .line 582
    return v11

    .line 583
    :cond_22
    throw v0
.end method
