.class public LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public ۥ:Z

.field public final ۥ۟:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ:Z

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ۟:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ۟:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥۢۤۥۧ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ:Z

    return-void
.end method

.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ۟:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LYue/ۥۢۤۥۧ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    return-void
.end method

.method public onTransitionPause(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ۟:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥۢۤۥۧ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ;->ۥ۟:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۢۤۥۧ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    return-void
.end method
