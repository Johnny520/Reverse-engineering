.class public final Landroidx/window/area/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/window/area/飘花落叶言子楪世哲兰苏;Landroidx/window/area/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/window/area/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroidx/window/area/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    iget-object v0, p1, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    if-eq v1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    if-eq p0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Operation: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": Status: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/window/area/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
