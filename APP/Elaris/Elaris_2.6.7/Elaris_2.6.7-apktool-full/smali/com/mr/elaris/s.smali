.class public final Lcom/mr/elaris/s;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljc;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/s;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/s;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/s;->a:Landroid/view/View;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/s;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/mr/elaris/MessageRepeater;->isRefreshBindingCurrent(Landroid/view/View;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
