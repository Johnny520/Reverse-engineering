.class public final Lu3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/PopupWindow;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/mr/elaris/ElarisStatusActivity;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/ElarisStatusActivity;Landroid/widget/PopupWindow;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu3;->c:Lcom/mr/elaris/ElarisStatusActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lu3;->a:Landroid/widget/PopupWindow;

    .line 7
    .line 8
    iput-boolean p3, p0, Lu3;->b:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lu3;->a:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lu3;->b:Z

    .line 7
    .line 8
    xor-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iget-object p0, p0, Lu3;->c:Lcom/mr/elaris/ElarisStatusActivity;

    .line 11
    .line 12
    invoke-static {p0, p1}, Lcom/mr/elaris/ElarisStatusActivity;->c(Lcom/mr/elaris/ElarisStatusActivity;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
