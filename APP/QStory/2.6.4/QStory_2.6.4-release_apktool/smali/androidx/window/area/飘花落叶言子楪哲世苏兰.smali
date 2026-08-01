.class public final Landroidx/window/area/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroid/os/Binder;Landroidx/window/extensions/area/WindowAreaComponent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/window/area/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    check-cast p1, Landroidx/window/area/飘花落叶言子楪哲世苏兰;

    .line 8
    .line 9
    iget-object v1, p1, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p1, p1, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    sget-object v1, Landroidx/window/area/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪苏兰哲世;

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
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v1

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "WindowAreaInfo{ Metrics: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", type: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Landroidx/window/area/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/window/area/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", Capabilities: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Landroidx/window/area/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " }"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
