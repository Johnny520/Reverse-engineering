.class public final Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
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
    instance-of v1, p1, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;

    .line 12
    .line 13
    iget-wide v3, p1, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide v5, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    invoke-static {v5, v6, v3, v4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :goto_0
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:J

    .line 25
    .line 26
    iget-wide p0, p1, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:J

    .line 27
    .line 28
    cmp-long p0, v3, p0

    .line 29
    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v0

    .line 33
    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
