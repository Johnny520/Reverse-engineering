.class public LYue/ۥۡ۠ۦۥ$ۥ۟;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۥۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Landroid/view/CollapsibleActionView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    move-object v0, p1

    check-cast v0, Landroid/view/CollapsibleActionView;

    iput-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟;->ۥۣ۟۟۠:Landroid/view/CollapsibleActionView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟;->ۥۣ۟۟۠:Landroid/view/CollapsibleActionView;

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public ۥ۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟;->ۥۣ۟۟۠:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewExpanded()V

    return-void
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟;->ۥۣ۟۟۠:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewCollapsed()V

    return-void
.end method
