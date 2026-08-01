.class public final L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iget p1, p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    iget p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    if-eq p0, p1, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IndirectPointerEventPrimaryDirectionalMotionAxis(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
