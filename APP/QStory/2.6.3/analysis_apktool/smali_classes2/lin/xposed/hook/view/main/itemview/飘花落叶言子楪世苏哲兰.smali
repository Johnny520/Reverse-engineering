.class public final synthetic Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;I)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

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
    .locals 1

    .line 1
    iget v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Llin/xposed/hook/view/main/itemview/Update;

    .line 9
    .line 10
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世哲苏兰(Llin/xposed/hook/view/main/itemview/Update;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Llin/xposed/hook/view/main/itemview/JumpDataCard;

    .line 15
    .line 16
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->飘花落叶言子楪世苏兰哲(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Llin/xposed/hook/view/main/itemview/CheckCommonGroup;

    .line 21
    .line 22
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/CheckCommonGroup;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/view/main/itemview/CheckCommonGroup;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p0, Llin/xposed/hook/view/main/itemview/AddQQGroup;

    .line 27
    .line 28
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/AddQQGroup;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
