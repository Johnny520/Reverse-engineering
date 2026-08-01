.class public final synthetic L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    iput-object p1, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    sget-object p1, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    sget-object p1, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 11
    .line 12
    const-wide v0, -0x36a53d89051405a7L    # -2.387038581936483E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_1
    sget-object p1, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Landroid/app/Dialog;

    .line 31
    .line 32
    iget-object p0, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v0, p0, p1}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 42
    .line 43
    .line 44
    return-void
.end method
