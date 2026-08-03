.class public Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;

.field public final synthetic ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;I)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;

    iput p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    if-nez v1, :cond_2

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->getAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۠ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;

    iget-object v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iget v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;->ۥ۟۟ۡۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method
