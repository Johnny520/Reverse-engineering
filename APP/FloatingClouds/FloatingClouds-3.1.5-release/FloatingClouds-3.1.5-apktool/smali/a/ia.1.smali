.class public final synthetic La/ia;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic a:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ia;->a:La/ra;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, La/ia;->a:La/ra;

    iget p3, p1, La/ra;->g:I

    if-ltz p3, :cond_0

    invoke-virtual {p1}, La/ra;->g()V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
