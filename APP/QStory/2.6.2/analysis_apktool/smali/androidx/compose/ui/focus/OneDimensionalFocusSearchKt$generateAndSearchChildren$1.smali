.class final Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
        "",
        "invoke",
        "(Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;)Ljava/lang/Boolean;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $activeNodeBeforeSearch:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

.field final synthetic $direction:I

.field final synthetic $focusedItem:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

.field final synthetic $onFound:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $this_generateAndSearchChildren:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "I",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$activeNodeBeforeSearch:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$this_generateAndSearchChildren:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$focusedItem:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$direction:I

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$onFound:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/layout/飘花落叶言子楪苏世哲兰;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$activeNodeBeforeSearch:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$this_generateAndSearchChildren:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$this_generateAndSearchChildren:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$focusedItem:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 29
    .line 30
    iget v2, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$direction:I

    .line 31
    .line 32
    iget-object p0, p0, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->$onFound:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    invoke-static {v0, v1, v2, p0}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    invoke-interface {p1}, Landroidx/compose/ui/layout/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子楪苏世哲兰;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$generateAndSearchChildren$1;->invoke(Landroidx/compose/ui/layout/飘花落叶言子楪苏世哲兰;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
