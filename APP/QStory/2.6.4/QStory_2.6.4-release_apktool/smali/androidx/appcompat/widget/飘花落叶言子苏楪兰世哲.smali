.class public final Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    iput p3, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v2, v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪(Landroid/view/View;IZ)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v2, Landroid/widget/TextView;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v2, p0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

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
