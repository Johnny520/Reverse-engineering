.class public final synthetic L飘花落叶言苏哲兰子楪世/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲兰子楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲兰子楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

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
    iget p1, p0, L飘花落叶言苏哲兰子楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏哲兰子楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 9
    .line 10
    xor-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 17
    .line 18
    xor-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 25
    .line 26
    xor-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰苏世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-boolean p0, p0, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p1, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
