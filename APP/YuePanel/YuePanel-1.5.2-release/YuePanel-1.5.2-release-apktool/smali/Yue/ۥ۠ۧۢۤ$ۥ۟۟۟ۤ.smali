.class public LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e4"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;


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

    iput-object p1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    iget-object v0, v0, LYue/ۥ۠ۧۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۠۠ۢ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    iget-object v0, v0, LYue/ۥ۠ۧۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۠۠ۢ۠;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    iget-object v1, v1, LYue/ۥ۠ۧۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۠۠ۢ۠;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    iget-object v0, v0, LYue/ۥ۠ۧۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۠۠ۢ۠;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    iget v2, v1, LYue/ۥ۠ۧۢۤ;->ۥ۟۟ۡۦ:I

    if-gt v0, v2, :cond_0

    iget-object v0, v1, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->show()V

    :cond_0
    return-void
.end method
