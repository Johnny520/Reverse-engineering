.class public final L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;IL飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget v2, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    new-instance v2, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    iget-object v3, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    iget-object v3, v3, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    iget v4, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    iget v5, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    invoke-direct {v2, v3, v4, v5}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;II)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0
.end method
