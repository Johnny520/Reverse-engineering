.class Landroidx/activity/result/ActivityResultRegistry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ۠;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟۟ۨۢ;

.field public final synthetic ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;


# direct methods
.method public constructor <init>(Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;LYue/ۥ۟۟ۨ۠;LYue/ۥ۟۟ۨۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iput-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p3, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ۠;

    iput-object p4, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۥ:LYue/ۥ۟۟ۨۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p1, p1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۟:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    new-instance v0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟۟;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ۠;

    iget-object v2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۥ:LYue/ۥ۟۟ۨۢ;

    invoke-direct {v0, v1, v2}, Landroidx/activity/result/ActivityResultRegistry$ۥ۟۟;-><init>(LYue/ۥ۟۟ۨ۠;LYue/ۥ۟۟ۨۢ;)V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p1, p1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۠:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p1, p1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۠:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p2, p2, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۠:Ljava/util/Map;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ۠;

    invoke-interface {p2, p1}, LYue/ۥ۟۟ۨ۠;->ۥ(Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p1, p1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۡ:Landroid/os/Bundle;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, LYue/ۥ۟۟ۨ۟;

    if-eqz p1, :cond_3

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p2, p2, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۡ:Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ۠;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۥ:LYue/ۥ۟۟ۨۢ;

    invoke-virtual {p1}, LYue/ۥ۟۟ۨ۟;->ۥ۟()I

    move-result v1

    invoke-virtual {p1}, LYue/ۥ۟۟ۨ۟;->ۥ()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LYue/ۥ۟۟ۨۢ;->ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, LYue/ۥ۟۟ۨ۠;->ۥ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p1, p1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۟:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥ۟۟۠ۦ:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
