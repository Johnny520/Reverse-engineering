.class public final synthetic Ly/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Ly/J;


# direct methods
.method public synthetic constructor <init>(Ly/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/D;->a:Ly/J;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly/D;->a:Ly/J;

    check-cast v0, Lt0/c;

    invoke-virtual {v0, p1, p2}, Lt0/c;->f(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
