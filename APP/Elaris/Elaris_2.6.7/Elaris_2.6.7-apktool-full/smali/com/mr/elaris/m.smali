.class public final Lcom/mr/elaris/m;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/ImageView;

.field public final synthetic b:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/m;->a:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/m;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/m;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/mr/elaris/MessageRepeater;->D(Landroid/widget/ImageView;Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {v0}, Lyb;->a(Landroid/view/View;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "repeater trigger clicked"

    .line 15
    .line 16
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->p(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    if-nez p1, :cond_3

    .line 37
    .line 38
    move-object p1, v0

    .line 39
    :cond_3
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->z(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lcom/mr/elaris/m;->b:Ljava/lang/ClassLoader;

    .line 43
    .line 44
    invoke-static {p0, v2, v1}, Lcom/mr/elaris/MessageRepeater;->y(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
