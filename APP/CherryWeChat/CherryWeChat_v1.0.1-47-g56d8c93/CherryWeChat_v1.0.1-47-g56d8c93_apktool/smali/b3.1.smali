.class public final Lb3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpt;


# instance fields
.field public final synthetic a:Lt5;


# direct methods
.method public constructor <init>(Lt5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3;->a:Lt5;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lb3;->a:Lt5;

    invoke-virtual {v0}, Lc3;->getDelegate()Lq3;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LE3;

    iget-object v3, v2, LE3;->k:Landroid/content/Context;

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    :goto_0
    invoke-virtual {v0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v0

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2}, Lhx;->a(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v1}, Lq3;->c()V

    return-void
.end method
