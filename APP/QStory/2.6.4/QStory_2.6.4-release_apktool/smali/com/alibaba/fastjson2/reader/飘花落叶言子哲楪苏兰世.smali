.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世哲苏兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lbsh/classpath/飘花落叶言子楪世哲兰苏;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰:I

    .line 3
    .line 4
    const-class v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/function/Function;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰:I

    .line 12
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 13
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰:I

    .line 14
    const-class v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 15
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast p0, Ljava/util/function/Function;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    return-object p3

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    check-cast p0, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    :goto_1
    return-object p3

    .line 45
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    check-cast p0, Ljava/lang/reflect/Type;

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-direct {p3, p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    return-object p3

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    check-cast p0, Ljava/util/function/Function;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_1
    :goto_0
    return-object p3

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    check-cast p0, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    :goto_1
    return-object p3

    .line 51
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    check-cast p0, Ljava/lang/reflect/Type;

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 65
    .line 66
    invoke-direct {p3, p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_2
    return-object p3

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
