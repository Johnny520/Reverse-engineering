.class public Landroidx/fragment/app/ۥ۟۟۟ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟۟۟۠()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/view/View;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟ۧ;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟ۧ;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
