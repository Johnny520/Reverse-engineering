.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:J


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "address"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 8
    .line 9
    const-string v0, "port"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世哲兰苏:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p3

    .line 9
    :cond_0
    const-class p2, Ljava/net/InetSocketAddress;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p0, p2, :cond_4

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Z

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子哲苏兰()J

    .line 26
    .line 27
    .line 28
    move-result-wide p4

    .line 29
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 30
    .line 31
    cmp-long p2, p4, v0

    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    const-class p2, Ljava/net/InetAddress;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Ljava/net/InetAddress;

    .line 42
    .line 43
    move-object p3, p2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世哲兰苏:J

    .line 46
    .line 47
    cmp-long p2, p4, v0

    .line 48
    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 65
    .line 66
    .line 67
    new-instance p1, Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    invoke-direct {p1, p3, p0}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string p2, "not support : "

    .line 78
    .line 79
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object p3
.end method
