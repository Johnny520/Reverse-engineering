.class public LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۧۢۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۧۢۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥ۠ۧۢۤ;

    invoke-virtual {p1}, LYue/ۥ۠ۧۢۤ;->ۥ۟۟ۡۧ()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥ۠ۧۢۤ;

    iget-object p1, p1, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥ۠ۧۢۤ;

    iget-object p2, p1, LYue/ۥ۠ۧۢۤ;->ۥ۟۟ۢۨ:Landroid/os/Handler;

    iget-object p1, p1, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۢ:LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥ۠ۧۢۤ;

    iget-object p1, p1, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۢ:LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;

    invoke-virtual {p1}, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->run()V

    :cond_0
    return-void
.end method
