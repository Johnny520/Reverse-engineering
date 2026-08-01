.class public final Lfc1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic a:Lrk0;


# direct methods
.method public constructor <init>(Landroid/view/View;Lrk0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lfc1;->a:Lrk0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lbe1;->b(Landroid/view/View;Landroid/view/WindowInsets;)Lbe1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p0, p0, Lfc1;->a:Lrk0;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2}, Lrk0;->a(Landroid/view/View;Lbe1;)Lbe1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, Lbe1;->a:Lyd1;

    .line 12
    .line 13
    instance-of p1, p0, Lqd1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p0, Lqd1;

    .line 18
    .line 19
    iget-object p0, p0, Lqd1;->c:Landroid/view/WindowInsets;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
