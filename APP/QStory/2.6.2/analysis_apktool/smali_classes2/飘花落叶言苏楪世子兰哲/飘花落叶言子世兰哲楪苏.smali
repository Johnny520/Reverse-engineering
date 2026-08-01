.class public final L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰苏哲楪;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰苏哲楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->Companion:L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰苏哲楪;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-wide p1, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iput-object p2, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a58f01051405a7L    # -2.3586508657584705E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
