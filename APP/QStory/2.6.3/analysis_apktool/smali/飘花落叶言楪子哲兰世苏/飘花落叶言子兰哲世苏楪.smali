.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;->飘花落叶言子楪世苏兰哲:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

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
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-boolean p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世苏楪;->飘花落叶言子楪世苏兰哲:Z

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
