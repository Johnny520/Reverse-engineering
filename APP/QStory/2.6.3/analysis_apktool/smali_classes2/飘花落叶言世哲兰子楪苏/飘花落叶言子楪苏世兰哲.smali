.class public final synthetic L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    sget-object p1, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p1, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v0, 0x235

    .line 13
    .line 14
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    sget-object p1, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Landroid/app/Dialog;

    .line 28
    .line 29
    iget-object p0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {v0, p0, p1}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 39
    .line 40
    .line 41
    return-void
.end method
