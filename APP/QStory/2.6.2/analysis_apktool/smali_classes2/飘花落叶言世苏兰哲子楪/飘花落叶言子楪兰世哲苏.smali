.class public final L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 9
    .line 10
    const-string v1, "kotlin.Double"

    .line 11
    .line 12
    sget-object v2, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;-><init>(Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏世兰楪哲()D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-interface {p1, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(D)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
