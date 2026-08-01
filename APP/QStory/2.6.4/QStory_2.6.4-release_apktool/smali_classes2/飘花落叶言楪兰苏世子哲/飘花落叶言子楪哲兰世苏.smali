.class public final L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    iget-object v0, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏兰哲世楪(Ljava/lang/String;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, p0}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏兰哲世楪(Ljava/lang/String;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    mul-int/lit8 v2, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v2

    .line 32
    add-int/2addr p0, v1

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HeaderValueParam(name="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", value="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, ", escapeValue=false)"

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
