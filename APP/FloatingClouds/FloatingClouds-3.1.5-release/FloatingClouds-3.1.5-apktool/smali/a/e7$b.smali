.class public final La/e7$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/e7;


# direct methods
.method public constructor <init>(La/e7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e7$b;->a:La/e7;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    iget-object p1, p0, La/e7$b;->a:La/e7;

    invoke-virtual {p1}, La/e7;->k()Z

    return-void
.end method

.method public final b(Landroid/view/Menu;)V
    .locals 0

    iget-object p1, p0, La/e7$b;->a:La/e7;

    invoke-virtual {p1}, La/e7;->t()Z

    return-void
.end method

.method public final c(Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, La/e7$b;->a:La/e7;

    invoke-virtual {p1}, La/e7;->p()Z

    move-result p1

    return p1
.end method

.method public final d(Landroid/view/Menu;)V
    .locals 0

    iget-object p1, p0, La/e7$b;->a:La/e7;

    invoke-virtual {p1}, La/e7;->q()V

    return-void
.end method
