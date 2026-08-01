.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Ljava/time/ZoneId;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

.field public 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世兰苏哲:Ljava/time/ZoneId;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 47
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 48
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 49
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

    .line 50
    sget p1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世苏兰:I

    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:I

    return-void

    .line 51
    :cond_0
    const-string p0, "objectWriterProvider must not null"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs constructor <init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 12
    .line 13
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

    .line 16
    .line 17
    sget p1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世苏兰:I

    .line 18
    .line 19
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    :goto_0
    array-length v0, p2

    .line 23
    if-ge p1, v0, :cond_0

    .line 24
    .line 25
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 26
    .line 27
    aget-object v2, p2, p1

    .line 28
    .line 29
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    or-long/2addr v0, v2

    .line 32
    iput-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object p0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "objectWriterProvider must not null"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世兰苏哲:Ljava/time/ZoneId;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/time/ZoneId;

    .line 10
    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p1, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
