.class public final synthetic L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {v0, p0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
