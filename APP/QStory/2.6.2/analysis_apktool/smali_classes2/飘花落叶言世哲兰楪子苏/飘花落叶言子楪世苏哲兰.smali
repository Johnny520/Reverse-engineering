.class public final synthetic L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

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
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, p1}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1, p1}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
