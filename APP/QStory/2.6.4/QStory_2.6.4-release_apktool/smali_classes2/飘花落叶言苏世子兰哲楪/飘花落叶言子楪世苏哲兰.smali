.class public final L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    invoke-direct {v0, p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏哲兰;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public decrypt([B[B)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ltop/suzhelan/qstory/util/StringTamperGuard;->INSTANCE:Ltop/suzhelan/qstory/util/StringTamperGuard;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/util/StringTamperGuard;->decrypt([B[B)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public parseData(Ljava/lang/String;)[B
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lkotlin/text/Regex;

    .line 5
    .line 6
    const-string v0, "~"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, v0}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-array p1, v0, [Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, [Ljava/lang/String;

    .line 23
    .line 24
    array-length p1, p0

    .line 25
    new-array p1, p1, [B

    .line 26
    .line 27
    array-length v1, p0

    .line 28
    move v2, v0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_2

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    aget-object v4, p0, v2

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    move v5, v0

    .line 46
    :goto_1
    if-ge v5, v4, :cond_1

    .line 47
    .line 48
    aget-object v6, p0, v2

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    const/16 v7, 0x55b5

    .line 58
    .line 59
    if-ne v6, v7, :cond_0

    .line 60
    .line 61
    const/16 v6, 0x30

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    const/16 v6, 0x31

    .line 65
    .line 66
    :goto_2
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v4, 0x2

    .line 77
    invoke-static {v4}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    int-to-byte v3, v3

    .line 85
    aput-byte v3, p1, v2

    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-object p1
.end method
