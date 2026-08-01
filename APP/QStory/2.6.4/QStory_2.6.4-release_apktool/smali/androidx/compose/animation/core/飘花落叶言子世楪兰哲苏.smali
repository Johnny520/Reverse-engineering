.class public final Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;Landroidx/compose/animation/core/RepeatMode;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 9
    .line 10
    instance-of p0, p1, Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;

    .line 15
    .line 16
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:I

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    instance-of p0, p1, Landroidx/compose/animation/core/飘花落叶言子世兰楪苏哲;

    .line 26
    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    const-string p0, "Animation to be infinitely repeated cannot have a 0-duration"

    .line 31
    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p1, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    iget-wide v2, p1, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 25
    .line 26
    iget-wide p0, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 27
    .line 28
    cmp-long p0, v2, p0

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;

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
    iget-object v1, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;)Landroidx/compose/animation/core/飘花落叶言子苏兰哲楪世;
    .locals 4

    .line 1
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子哲楪兰世苏;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Landroidx/compose/animation/core/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;)Landroidx/compose/animation/core/飘花落叶言子哲楪世苏兰;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/RepeatMode;

    .line 10
    .line 11
    iget-wide v2, p0, Landroidx/compose/animation/core/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:J

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/compose/animation/core/飘花落叶言子哲楪兰世苏;-><init>(Landroidx/compose/animation/core/飘花落叶言子哲楪世苏兰;Landroidx/compose/animation/core/RepeatMode;J)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
