.class public final La/U0;
.super La/n9;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/Q0;


# direct methods
.method public constructor <init>(La/Q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/U0;->b:La/Q0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, La/U0;->b:La/Q0;

    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, La/Q0;->y:La/Jg;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La/Jg;->d(La/Lg;)V

    iput-object v2, v0, La/Q0;->y:La/Jg;

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, La/U0;->b:La/Q0;

    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_0

    iget-object v0, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$c;->c(Landroid/view/View;)V

    :cond_0
    return-void
.end method
