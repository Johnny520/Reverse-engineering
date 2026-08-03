.class public final LId;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:LKd;


# direct methods
.method public constructor <init>(LKd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LId;->a:LKd;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, LId;->a:LKd;

    iget-object v0, p1, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, LKd;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
