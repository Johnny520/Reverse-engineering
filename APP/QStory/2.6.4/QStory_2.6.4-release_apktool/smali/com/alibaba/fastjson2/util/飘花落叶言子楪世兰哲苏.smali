.class public final synthetic Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:I

.field public final synthetic 飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;Ljava/lang/String;[Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 8
    .line 9
    iput p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:I

    .line 5
    .line 6
    iget-object v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "value"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    aput-object p0, v3, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    :catch_0
    :cond_0
    return-void

    .line 50
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :try_start_1
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "name"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    check-cast p0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    aput-object p0, v3, v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    .line 82
    :catch_1
    :cond_1
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
