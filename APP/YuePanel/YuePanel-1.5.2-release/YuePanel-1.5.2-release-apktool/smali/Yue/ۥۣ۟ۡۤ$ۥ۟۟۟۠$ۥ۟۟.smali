.class public LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟۟ۦ(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    iput-object p2, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟;->ۥۣ۟۟۠:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    iget-object v0, v0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟ۤۨ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟;->ۥۣ۟۟۠:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
