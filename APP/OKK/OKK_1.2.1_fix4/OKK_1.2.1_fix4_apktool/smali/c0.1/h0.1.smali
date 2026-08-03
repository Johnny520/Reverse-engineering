.class public final synthetic Lc0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lc0/j0;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lc0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/h0;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lc0/h0;->b:Lc0/j0;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lc0/h0;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lc0/h0;->b:Lc0/j0;

    const-string v2, "$target"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    sget-object p1, Lc0/n0;->a:Lc0/n0;

    if-eqz v1, :cond_0

    iget-object p1, v1, Lc0/j0;->b:Ljava/lang/String;

    if-nez p1, :cond_1

    :cond_0
    invoke-static {v0}, Lc0/n0;->y(Landroid/widget/TextView;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    sput-object p1, Lc0/n0;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lc0/n0;->r:J

    invoke-static {v0}, Lc0/n0;->A(Landroid/widget/TextView;)V

    const/4 p1, 0x1

    return p1
.end method
