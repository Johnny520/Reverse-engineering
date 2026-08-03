.class public final Landroidx/fragment/app/b$b;
.super Landroidx/fragment/app/b$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$b;->a:Landroidx/fragment/app/b;

    invoke-direct {p0}, Landroidx/fragment/app/b$f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$b;->a:Landroidx/fragment/app/b;

    iget-object v1, v0, Landroidx/fragment/app/b;->R:La/Kd;

    invoke-virtual {v1}, La/Kd;->a()V

    invoke-static {v0}, Landroidx/lifecycle/n;->b(La/Ld;)V

    iget-object v1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    const-string v2, "registryState"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, v0, Landroidx/fragment/app/b;->R:La/Kd;

    invoke-virtual {v0, v1}, La/Kd;->b(Landroid/os/Bundle;)V

    return-void
.end method
