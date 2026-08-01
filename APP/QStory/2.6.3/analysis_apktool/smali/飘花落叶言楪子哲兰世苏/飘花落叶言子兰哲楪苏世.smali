.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 14
    iput-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/Optional;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Optional;->isPresent()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p2}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v4, 0x0

    .line 32
    move-object v1, p1

    .line 33
    move-object v3, p3

    .line 34
    move-wide v5, p5

    .line 35
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/Optional;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Optional;->isPresent()Z

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    if-nez p4, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p2}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 p4, 0x0

    .line 28
    iget-object p5, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p5, :cond_2

    .line 31
    .line 32
    iget-object p6, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-static {p4, p4, p5, p6, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    :cond_2
    if-nez p4, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    :cond_3
    move-object v0, p4

    .line 45
    iget-object v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    move-object v3, p3

    .line 51
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
