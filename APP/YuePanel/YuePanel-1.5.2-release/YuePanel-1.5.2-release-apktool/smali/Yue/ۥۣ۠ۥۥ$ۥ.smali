.class public LYue/ۥۣ۠ۥۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۥۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۥۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۠ۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    iget-object v0, p0, LYue/ۥۣ۠ۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;

    iget-object v1, v0, LYue/ۥۣ۠ۥۥ;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    iget-object v0, v0, LYue/ۥۣ۠ۥۥ;->ۥ۟۟۠ۤ:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, LYue/ۥۣ۠ۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;

    iget-object v0, v0, LYue/ۥۣ۠ۥۥ;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    iget-object v0, p0, LYue/ۥۣ۠ۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۥۥ;

    const/4 v1, 0x0

    iput-object v1, v0, LYue/ۥۣ۠ۥۥ;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    iput-object v1, v0, LYue/ۥۣ۠ۥۥ;->ۥ۟۟۠ۤ:Landroid/view/View;

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
