.class public final L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言苏楪世子兰哲/飘花落叶言子苏世兰哲楪;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->Companion:L飘花落叶言苏楪世子兰哲/飘花落叶言子苏世兰哲楪;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-wide/16 p3, 0x0

    .line 9
    .line 10
    :cond_0
    iput-wide p3, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 11
    .line 12
    and-int/lit8 p3, p1, 0x2

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :cond_1
    iput p2, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    and-int/lit8 p1, p1, 0x4

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    const-wide p1, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iput-object p5, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;

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
    check-cast p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;

    .line 12
    .line 13
    iget-wide v3, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide v5, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget v1, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    iget v3, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p1, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a58ce6051405a7L    # -2.359384514541552E45

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
    iget-wide v1, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 19
    .line 20
    const-wide v3, -0x36a58d8d051405a7L    # -2.359157205920449E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/StringBuilder;JJ)V

    .line 26
    .line 27
    .line 28
    iget v1, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:I

    .line 29
    .line 30
    const-wide v2, -0x36a58cd1051405a7L    # -2.3594130982603734E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/StringBuilder;IJ)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言苏楪世子兰哲/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
