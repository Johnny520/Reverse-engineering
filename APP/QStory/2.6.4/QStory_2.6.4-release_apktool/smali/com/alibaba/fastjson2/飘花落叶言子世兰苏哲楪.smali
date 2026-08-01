.class public final Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

.field public static final 飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 8
    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :pswitch_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_1
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    instance-of p0, p1, Ljava/util/Collection;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    check-cast p1, Ljava/util/Collection;

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of p0, p1, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    check-cast p1, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    instance-of p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 71
    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 75
    .line 76
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/4 p0, 0x1

    .line 88
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    :goto_0
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
