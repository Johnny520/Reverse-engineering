.class public final Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

.field public final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const/high16 v0, 0x44160000    # 600.0f

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const v2, 0x3f4ccccd    # 0.8f

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v2, v0, v3, v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(FFLjava/lang/Object;I)Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const v1, 0x3f70a3d7    # 0.94f

    .line 16
    .line 17
    .line 18
    iput v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 19
    .line 20
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

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
    check-cast p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 12
    .line 13
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 14
    .line 15
    iget v3, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 25
    .line 26
    iget-object p1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

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
    const-string v1, "SinkFeedback(sinkAmount="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", animationSpec="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰世哲;)Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰苏哲;

    .line 5
    .line 6
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 7
    .line 8
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰世哲;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
