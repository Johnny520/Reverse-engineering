.class public final LD/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public a:LD/q0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:LD/q;


# direct methods
.method public constructor <init>(Landroid/view/View;LD/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LD/F;->b:Landroid/view/View;

    iput-object p2, p0, LD/F;->c:LD/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, LD/F;->a:LD/q0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    invoke-static {p1, p2}, LD/q0;->d(Landroid/view/View;Landroid/view/WindowInsets;)LD/q0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, LD/F;->c:LD/q;

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    iget-object v4, p0, LD/F;->b:Landroid/view/View;

    invoke-static {p2, v4}, LD/G;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, LD/F;->a:LD/q0;

    invoke-virtual {v0, p2}, LD/q0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {v2, p1, v0}, LD/q;->i(Landroid/view/View;LD/q0;)LD/q0;

    move-result-object p1

    invoke-virtual {p1}, LD/q0;->c()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, LD/F;->a:LD/q0;

    invoke-interface {v2, p1, v0}, LD/q;->i(Landroid/view/View;LD/q0;)LD/q0;

    move-result-object p2

    if-lt v1, v3, :cond_1

    invoke-virtual {p2}, LD/q0;->c()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, LD/Q;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, LD/E;->c(Landroid/view/View;)V

    invoke-virtual {p2}, LD/q0;->c()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
