.class Llin/xposed/hook/view/main/itemview/DeleteMethodInfo$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;->getOnClick()Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;


# direct methods
.method public constructor <init>(Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/DeleteMethodInfo$1;->this$0:Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    invoke-virtual {p0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    new-instance p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏世兰;

    .line 9
    .line 10
    const/16 p1, 0x1b

    .line 11
    .line 12
    invoke-direct {p0, p1}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏世兰;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世哲子苏兰楪/飘花落叶言子楪兰苏世哲;

    .line 16
    .line 17
    .line 18
    sget-object p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    new-instance p0, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪苏兰哲世;

    .line 27
    .line 28
    sget-object p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 29
    .line 30
    const-string v0, "DexKitCache"

    .line 31
    .line 32
    invoke-direct {p0, p1, v0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    sget-object p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    const-string p0, "storePath is empty(\u8bf7\u4f7f\u7528KvHelper.initialize(String path)\u521d\u59cb\u5316"

    .line 49
    .line 50
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
