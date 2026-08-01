.class public final Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
.super Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子世兰哲楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public 飘花落叶言子世兰哲苏楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子世兰楪哲苏:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子世兰楪苏哲:Landroid/view/View;

.field public 飘花落叶言子世兰苏哲楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public 飘花落叶言子世兰苏楪哲:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(Landroid/content/Context;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;ILandroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;)V
    .locals 7

    .line 1
    invoke-interface {p2, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    move-object v5, p2

    .line 6
    check-cast v5, Landroid/view/View;

    .line 7
    .line 8
    new-instance v4, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-direct {v4}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p3

    .line 16
    move v3, p5

    .line 17
    move-object v6, p6

    .line 18
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;-><init>(Landroid/content/Context;Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;ILandroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;Landroid/view/View;Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;)V

    .line 19
    .line 20
    .line 21
    iput-object v5, v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰楪苏哲:Landroid/view/View;

    .line 22
    .line 23
    iput-object v4, v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰楪哲苏:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 p1, 0x0

    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    invoke-interface {p4, p0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p2, p1

    .line 42
    :goto_0
    instance-of p3, p2, Landroid/util/SparseArray;

    .line 43
    .line 44
    if-eqz p3, :cond_1

    .line 45
    .line 46
    move-object p1, p2

    .line 47
    check-cast p1, Landroid/util/SparseArray;

    .line 48
    .line 49
    :cond_1
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v5, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    if-eqz p4, :cond_3

    .line 55
    .line 56
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$registerSaveStateProvider$1;

    .line 57
    .line 58
    invoke-direct {p1, v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$registerSaveStateProvider$1;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p4, p0, p1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setSavableRegistryEntry(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    sget-object p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 69
    .line 70
    iput-object p0, v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰苏哲楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    iput-object p0, v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 73
    .line 74
    iput-object p0, v0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲苏楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    return-void
.end method

.method private final setSavableRegistryEntry(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰苏楪哲:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子苏楪世哲兰()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰苏楪哲:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    return-void
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setSavableRegistryEntry(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getDispatcher()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰楪哲苏:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReleaseBlock()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲苏楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResetBlock()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getSubCompositionView()Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getUpdateBlock()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰苏哲楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final setReleaseBlock(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲苏楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$releaseBlock$1;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$releaseBlock$1;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->setRelease(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setResetBlock(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰哲楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$resetBlock$1;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$resetBlock$1;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->setReset(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setUpdateBlock(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->飘花落叶言子世兰苏哲楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$updateBlock$1;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder$updateBlock$1;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->setUpdate(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
