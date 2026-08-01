.class public final L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;
.super Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Landroidx/window/core/WindowStrictModeException;

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/window/core/VerificationMode;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏哲兰;Landroidx/window/core/VerificationMode;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/core/VerificationMode;

    .line 15
    .line 16
    new-instance p3, Landroidx/window/core/WindowStrictModeException;

    .line 17
    .line 18
    new-instance p4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, " value: "

    .line 27
    .line 28
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p3, p1}, Landroidx/window/core/WindowStrictModeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    array-length p2, p1

    .line 49
    add-int/lit8 p2, p2, -0x2

    .line 50
    .line 51
    const/4 p4, 0x0

    .line 52
    if-gez p2, :cond_0

    .line 53
    .line 54
    move p2, p4

    .line 55
    :cond_0
    if-ltz p2, :cond_4

    .line 56
    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    array-length v0, p1

    .line 63
    if-lt p2, v0, :cond_2

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/4 v1, 0x1

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    sub-int/2addr v0, v1

    .line 74
    aget-object p1, p1, v0

    .line 75
    .line 76
    invoke-static {p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪世兰哲(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    sub-int p2, v0, p2

    .line 82
    .line 83
    invoke-static {p1, p2, v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪兰苏([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :goto_0
    new-array p2, p4, [Ljava/lang/StackTraceElement;

    .line 95
    .line 96
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, [Ljava/lang/StackTraceElement;

    .line 101
    .line 102
    invoke-virtual {p3, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 103
    .line 104
    .line 105
    iput-object p3, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/core/WindowStrictModeException;

    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    const-string p0, "Requested element count "

    .line 109
    .line 110
    const-string p1, " is less than zero."

    .line 111
    .line 112
    invoke-static {p2, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x0

    .line 120
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/core/VerificationMode;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    iget-object v0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, " value: "

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170"

    .line 54
    .line 55
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    iget-object p0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/core/WindowStrictModeException;

    .line 60
    .line 61
    throw p0
.end method
