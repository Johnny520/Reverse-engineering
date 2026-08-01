.class public final L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;

.field public final 飘花落叶言子楪兰世苏哲:J

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JL飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 7
    .line 8
    iput-object p4, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()J
    .locals 2

    .line 1
    iget-wide v0, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    return-object p0
.end method
