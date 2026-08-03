.class public LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;
.super Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e8"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-direct {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public findSnapView(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroid/view/View;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;->findSnapView(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method
