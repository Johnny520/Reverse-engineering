.class public final synthetic L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪苏兰哲:Z

    .line 9
    .line 10
    xor-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->setChecked(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-boolean p0, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪苏兰哲:Z

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    iget-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪苏兰哲:Z

    .line 30
    .line 31
    xor-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->setChecked(Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
