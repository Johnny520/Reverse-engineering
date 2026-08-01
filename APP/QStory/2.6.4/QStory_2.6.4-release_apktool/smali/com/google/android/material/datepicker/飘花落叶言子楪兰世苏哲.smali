.class public final synthetic Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/core/view/飘花落叶言子世苏哲楪兰;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, Landroidx/core/view/飘花落叶言子世苏哲楪兰;-><init>(Landroid/view/View;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 22
    .line 23
    invoke-static {p0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
