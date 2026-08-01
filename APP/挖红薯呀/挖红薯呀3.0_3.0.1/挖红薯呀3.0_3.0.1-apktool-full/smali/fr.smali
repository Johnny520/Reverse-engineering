.class public final Lfr;
.super Landroid/view/View;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic d:Lca;


# direct methods
.method public constructor <init>(Lca;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfr;->d:Lca;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lfr;->d:Lca;

    .line 5
    .line 6
    invoke-virtual {p0}, Lca;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
