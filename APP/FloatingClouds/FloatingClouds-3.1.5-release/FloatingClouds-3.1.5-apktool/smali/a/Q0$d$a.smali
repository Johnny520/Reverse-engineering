.class public final La/Q0$d$a;
.super La/n9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Q0$d;->b(La/P;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/Q0$d;


# direct methods
.method public constructor <init>(La/Q0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Q0$d$a;->b:La/Q0$d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, La/Q0$d$a;->b:La/Q0$d;

    iget-object v1, v0, La/Q0$d;->b:La/Q0;

    iget-object v1, v1, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v0, v0, La/Q0$d;->b:La/Q0;

    iget-object v1, v0, La/Q0;->w:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    sget-object v2, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, La/ug$c;->c(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->h()V

    iget-object v1, v0, La/Q0;->y:La/Jg;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La/Jg;->d(La/Lg;)V

    iput-object v2, v0, La/Q0;->y:La/Jg;

    iget-object v0, v0, La/Q0;->B:Landroid/view/ViewGroup;

    sget-object v1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$c;->c(Landroid/view/View;)V

    return-void
.end method
