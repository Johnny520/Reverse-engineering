.class public LYue/ۥۢۤۦۢ$ۥ۟۟;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-direct {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟;->ۥ:LYue/ۥۢۤۦۢ;

    iget-object p1, p1, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/View;->requestFocus(I)Z

    :cond_0
    return-void
.end method
