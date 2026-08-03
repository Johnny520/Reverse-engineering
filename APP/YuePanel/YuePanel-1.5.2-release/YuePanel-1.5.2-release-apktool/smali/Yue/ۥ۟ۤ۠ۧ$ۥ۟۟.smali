.class public LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Landroid/view/View;

.field public ۥ۟:LYue/ۥۣ۠ۥۢ;


# direct methods
.method public constructor <init>(Landroid/view/View;LYue/ۥۣ۠ۥۢ;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ:Landroid/view/View;

    iput-object p2, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ۟:LYue/ۥۣ۠ۥۢ;

    return-void
.end method


# virtual methods
.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ:Landroid/view/View;

    invoke-static {p1}, LYue/ۥۣ۠ۥۦ;->ۥ۟(Landroid/view/View;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۧ:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟:I

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public onTransitionPause(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ۟:LYue/ۥۣ۠ۥۢ;

    const/4 v0, 0x4

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۥۢ;->setVisibility(I)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟;->ۥ۟:LYue/ۥۣ۠ۥۢ;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۥۢ;->setVisibility(I)V

    return-void
.end method
