.class public final Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/SecureFlagPolicy;

.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Z

.field public final 飘花落叶言子楪苏世哲兰:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    sget-object v1, Landroidx/compose/ui/window/SecureFlagPolicy;->Inherit:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 17
    .line 18
    iput-object v1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 19
    .line 20
    iput-boolean p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 23
    .line 24
    const-string p1, ""

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    iput p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;

    .line 10
    .line 11
    iget-boolean v0, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 26
    .line 27
    iget-object v1, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 40
    .line 41
    iget-boolean v1, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:I

    .line 47
    .line 48
    iget p1, p1, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:I

    .line 49
    .line 50
    if-eq p0, p1, :cond_7

    .line 51
    .line 52
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 55
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-boolean v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:I

    .line 37
    .line 38
    add-int/2addr v0, p0

    .line 39
    mul-int/2addr v0, v1

    .line 40
    return v0
.end method
