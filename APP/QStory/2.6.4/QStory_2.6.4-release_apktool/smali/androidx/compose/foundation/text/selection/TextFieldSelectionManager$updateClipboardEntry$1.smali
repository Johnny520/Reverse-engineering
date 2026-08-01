.class final Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager"
    f = "TextFieldSelectionManager.kt"
    l = {
        0x33b
    }
    m = "updateClipboardEntry$foundation"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u82cf\u696a;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$updateClipboardEntry$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪苏兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
