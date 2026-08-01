.class public final L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;
.super L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;

.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    const-string v1, "must have no value parameters"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;

    .line 10
    .line 11
    new-instance v0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;

    .line 12
    .line 13
    const-string v1, "must have a single value parameter"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/load/java/descriptors/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 p1, 0x1

    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    return p1

    .line 20
    :pswitch_0
    invoke-virtual {p1}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
