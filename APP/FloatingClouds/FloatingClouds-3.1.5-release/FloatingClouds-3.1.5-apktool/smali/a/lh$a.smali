.class public final La/lh$a;
.super La/n9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/lh;


# direct methods
.method public constructor <init>(La/lh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lh$a;->b:La/lh;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, La/lh$a;->b:La/lh;

    iget-boolean v1, v0, La/lh;->o:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, La/lh;->g:Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    iget-object v1, v0, La/lh;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object v1, v0, La/lh;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object v1, v0, La/lh;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    const/4 v1, 0x0

    iput-object v1, v0, La/lh;->s:La/Kg;

    iget-object v2, v0, La/lh;->k:La/Q0$d;

    if-eqz v2, :cond_1

    iget-object v3, v0, La/lh;->j:La/lh$d;

    invoke-virtual {v2, v3}, La/Q0$d;->b(La/P;)V

    iput-object v1, v0, La/lh;->j:La/lh$d;

    iput-object v1, v0, La/lh;->k:La/Q0$d;

    :cond_1
    iget-object v0, v0, La/lh;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_2

    sget-object v1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$c;->c(Landroid/view/View;)V

    :cond_2
    return-void
.end method
