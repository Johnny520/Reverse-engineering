.class public final synthetic LF3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWm;


# instance fields
.field public final synthetic a:Lx2;


# direct methods
.method public synthetic constructor <init>(Lx2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF3;->a:Lx2;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LF3;->a:Lx2;

    invoke-virtual {v0, p1}, Lx2;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
