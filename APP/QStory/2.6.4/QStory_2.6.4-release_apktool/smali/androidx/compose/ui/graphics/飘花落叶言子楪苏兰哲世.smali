.class public final Landroidx/compose/ui/graphics/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/graphics/飘花落叶言子世哲苏楪兰;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroid/graphics/PathMeasure;


# direct methods
.method public constructor <init>(Landroid/graphics/PathMeasure;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/PathMeasure;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(FFLandroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;)Z
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p3, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/PathMeasure;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const-string p0, "Unable to obtain android.graphics.Path"

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0
.end method
