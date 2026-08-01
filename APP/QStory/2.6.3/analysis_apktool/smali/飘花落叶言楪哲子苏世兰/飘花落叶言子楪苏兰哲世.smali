.class public final L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/gson/飘花落叶言子楪哲兰世苏;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    invoke-direct {v0, v1}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;Z)Lcom/google/gson/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    invoke-interface {p4}, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v1, v0}, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Type;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v1, v0}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;Z)Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p4}, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;->nullSafe()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    instance-of v0, p1, Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p1, Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v0, p1, Lcom/google/gson/飘花落叶言子楪哲兰世苏;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p1, Lcom/google/gson/飘花落叶言子楪哲兰世苏;

    .line 35
    .line 36
    if-eqz p5, :cond_1

    .line 37
    .line 38
    iget-object p5, p3, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 39
    .line 40
    iget-object p0, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p0, p5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcom/google/gson/飘花落叶言子楪哲兰世苏;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    move-object p1, p0

    .line 51
    :cond_1
    invoke-interface {p1, p2, p3}, Lcom/google/gson/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    if-eqz p1, :cond_2

    .line 56
    .line 57
    if-eqz p4, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/google/gson/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Lcom/google/gson/飘花落叶言子楪哲苏世兰;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    return-object p1

    .line 65
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p1, p3, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 74
    .line 75
    invoke-static {p1}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string p2, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 80
    .line 81
    const-string p3, "Invalid attempt to bind an instance of "

    .line 82
    .line 83
    const-string p4, " as a @JsonAdapter for "

    .line 84
    .line 85
    invoke-static {p3, p0, p4, p1, p2}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏兰世;
    .locals 7

    .line 1
    iget-object v0, p2, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v5, v0

    .line 10
    check-cast v5, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v2, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    move-object v1, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p2

    .line 22
    invoke-virtual/range {v1 .. v6}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;Z)Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
