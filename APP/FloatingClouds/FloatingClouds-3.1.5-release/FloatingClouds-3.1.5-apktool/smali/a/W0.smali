.class public final synthetic La/W0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t9;


# instance fields
.field public final synthetic a:Landroidx/appcompat/app/b;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/W0;->a:Landroidx/appcompat/app/b;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, La/W0;->a:Landroidx/appcompat/app/b;

    invoke-virtual {v0, p1}, La/X0;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
