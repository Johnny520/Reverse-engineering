.class final Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;)Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
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
.field final synthetic $popupLayout:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

.field final synthetic $popupPositionProvider:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->$popupLayout:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->$popupPositionProvider:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->$popupLayout:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->$popupPositionProvider:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->setPositionProvider(Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->$popupLayout:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏()V

    .line 11
    .line 12
    .line 13
    new-instance p0, Landroidx/compose/ui/window/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;->invoke(Landroidx/compose/runtime/飘花落叶言子世楪苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰哲苏世;

    move-result-object p0

    return-object p0
.end method
