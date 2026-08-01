.class Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;
.super Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/dialog/PluginDialog;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kongzue/dialogx/interfaces/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic onBind(Ljava/lang/Object;Landroid/view/View;)V
    .locals 0

    .line 22
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->onBind(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;Landroid/view/View;)V

    return-void
.end method

.method public onBind(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪苏哲世兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 7
    .line 8
    invoke-static {p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪苏兰世哲(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 12
    .line 13
    invoke-static {p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪哲世苏兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;->this$0:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 17
    .line 18
    invoke-static {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪苏兰哲世(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
