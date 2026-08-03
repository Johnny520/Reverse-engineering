.class public final Ltop/mmjz/floatingclouds/ui/MainActivity;
.super La/E0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ltop/mmjz/floatingclouds/ui/MainActivity;",
        "La/E0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "La/Wf;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;",
        "binding",
        "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private binding:Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/E0;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, La/X6;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "Floatingclouds"

    const-string v1, "MainActivity onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1}, Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;->inflate(Landroid/view/LayoutInflater;)Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;

    move-result-object v1

    iput-object v1, p0, Ltop/mmjz/floatingclouds/ui/MainActivity;->binding:Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;

    const-string v2, "binding"

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {p0, v1}, La/E0;->setContentView(Landroid/view/View;)V

    if-nez p1, :cond_2

    invoke-virtual {p0}, La/X6;->getSupportFragmentManager()La/e7;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La/S1;

    invoke-direct {v1, p1}, La/S1;-><init>(La/e7;)V

    iget-object p1, p0, Ltop/mmjz/floatingclouds/ui/MainActivity;->binding:Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;

    if-eqz p1, :cond_1

    iget-object p1, p1, Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;->mainContainer:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    new-instance v2, La/X9;

    invoke-direct {v2}, La/X9;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v1, p1, v2, v3, v4}, La/S1;->e(ILandroidx/fragment/app/b;Ljava/lang/String;I)V

    iget-boolean p1, v1, La/p7;->g:Z

    if-nez p1, :cond_0

    iget-object p1, v1, La/S1;->q:La/e7;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, La/e7;->A(La/S1;Z)V

    const-string p1, "MainFragment attached"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This transaction is already being added to the back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {v2}, La/i9;->g(Ljava/lang/String;)V

    throw v3

    :cond_2
    :goto_0
    sget-object p1, La/m0;->a:La/m0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/m0;->b(Landroid/app/Activity;)V

    return-void

    :cond_3
    invoke-static {v2}, La/i9;->g(Ljava/lang/String;)V

    throw v3
.end method
