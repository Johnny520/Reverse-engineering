.class public final L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v1, v1, [L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    sget-object v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    sget-object v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    sget-object v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    invoke-static {v1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;-><init>(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 30
    .line 31
    iget-object v2, v2, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    new-instance v3, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iput-object v0, p0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰世哲;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 34
    .line 35
    iget-object v1, v0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {p1, v1, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, v0, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_3

    .line 59
    .line 60
    :cond_2
    move-object v1, p2

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    move v4, v2

    .line 67
    :goto_0
    if-ge v2, v3, :cond_4

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    add-int/lit8 v5, v5, -0x30

    .line 74
    .line 75
    if-ltz v5, :cond_2

    .line 76
    .line 77
    const/16 v6, 0xa

    .line 78
    .line 79
    if-ge v5, v6, :cond_2

    .line 80
    .line 81
    mul-int/lit8 v4, v4, 0xa

    .line 82
    .line 83
    add-int/2addr v4, v5

    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_1
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    new-instance p1, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰世哲;

    .line 98
    .line 99
    invoke-direct {p1, v0, p0}, L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏兰世哲;-><init>(L飘花落叶言世子兰哲楪苏/飘花落叶言子楪苏哲兰世;I)V

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_5
    :goto_2
    return-object p2
.end method
