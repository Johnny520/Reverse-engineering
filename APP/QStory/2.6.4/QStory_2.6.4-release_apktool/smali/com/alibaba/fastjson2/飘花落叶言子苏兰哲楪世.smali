.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/BiFunction;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, [I

    .line 2
    .line 3
    const-class v1, Ljava/math/BigInteger;

    .line 4
    .line 5
    sget-boolean v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    sget-boolean v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏:Z

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v2, v4, v5}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v3, v1, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const-string v4, "apply"

    .line 34
    .line 35
    const-class v2, Ljava/util/function/BiFunction;

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v7}, Ljava/lang/invoke/MethodHandle;->type()Ljava/lang/invoke/MethodType;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/invoke/MethodType;->generic()Ljava/lang/invoke/MethodType;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-class v2, Ljava/lang/Integer;

    .line 50
    .line 51
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v1, v2, v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-static/range {v3 .. v8}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 68
    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 74
    :goto_0
    if-nez v0, :cond_1

    .line 75
    .line 76
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    :cond_1
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    check-cast p2, [I

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    array-length p1, p2

    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_3

    .line 16
    :cond_0
    aget p1, p2, v0

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    rsub-int/lit8 p1, p1, 0x20

    .line 23
    .line 24
    array-length v2, p2

    .line 25
    sub-int/2addr v2, v1

    .line 26
    shl-int/lit8 v2, v2, 0x5

    .line 27
    .line 28
    add-int/2addr v2, p1

    .line 29
    if-gez p0, :cond_4

    .line 30
    .line 31
    aget p1, p2, v0

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v1, :cond_1

    .line 38
    .line 39
    move p1, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move p1, v0

    .line 42
    :goto_0
    move v3, v1

    .line 43
    :goto_1
    array-length v4, p2

    .line 44
    if-ge v3, v4, :cond_3

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    aget p1, p2, v3

    .line 49
    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    move p1, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move p1, v0

    .line 55
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-eqz p1, :cond_4

    .line 59
    .line 60
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    :cond_4
    :goto_3
    div-int/lit8 v2, v2, 0x8

    .line 63
    .line 64
    add-int/lit8 p1, v2, 0x1

    .line 65
    .line 66
    new-array p1, p1, [B

    .line 67
    .line 68
    const/4 v3, 0x4

    .line 69
    move v5, v0

    .line 70
    move v6, v5

    .line 71
    move v4, v3

    .line 72
    :goto_4
    if-ltz v2, :cond_c

    .line 73
    .line 74
    if-ne v4, v3, :cond_b

    .line 75
    .line 76
    add-int/lit8 v4, v6, 0x1

    .line 77
    .line 78
    if-gez v6, :cond_6

    .line 79
    .line 80
    :cond_5
    move v5, v0

    .line 81
    goto :goto_6

    .line 82
    :cond_6
    array-length v5, p2

    .line 83
    if-lt v6, v5, :cond_7

    .line 84
    .line 85
    if-gez p0, :cond_5

    .line 86
    .line 87
    const/4 v5, -0x1

    .line 88
    goto :goto_6

    .line 89
    :cond_7
    array-length v5, p2

    .line 90
    sub-int/2addr v5, v6

    .line 91
    sub-int/2addr v5, v1

    .line 92
    aget v5, p2, v5

    .line 93
    .line 94
    if-ltz p0, :cond_8

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_8
    array-length v7, p2

    .line 98
    add-int/lit8 v8, v7, -0x1

    .line 99
    .line 100
    :goto_5
    if-ltz v8, :cond_9

    .line 101
    .line 102
    aget v9, p2, v8

    .line 103
    .line 104
    if-nez v9, :cond_9

    .line 105
    .line 106
    add-int/lit8 v8, v8, -0x1

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_9
    sub-int/2addr v7, v8

    .line 110
    sub-int/2addr v7, v1

    .line 111
    if-gt v6, v7, :cond_a

    .line 112
    .line 113
    neg-int v5, v5

    .line 114
    goto :goto_6

    .line 115
    :cond_a
    not-int v5, v5

    .line 116
    :goto_6
    move v6, v4

    .line 117
    move v4, v1

    .line 118
    goto :goto_7

    .line 119
    :cond_b
    ushr-int/lit8 v5, v5, 0x8

    .line 120
    .line 121
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    :goto_7
    int-to-byte v7, v5

    .line 124
    aput-byte v7, p1, v2

    .line 125
    .line 126
    add-int/lit8 v2, v2, -0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_c
    new-instance p0, Ljava/math/BigInteger;

    .line 130
    .line 131
    invoke-direct {p0, p1}, Ljava/math/BigInteger;-><init>([B)V

    .line 132
    .line 133
    .line 134
    return-object p0
.end method
