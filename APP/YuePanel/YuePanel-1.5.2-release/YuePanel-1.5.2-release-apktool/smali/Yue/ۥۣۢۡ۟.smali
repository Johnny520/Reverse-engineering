.class public final LYue/ۥۣۢۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۡ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Landroid/content/Intent;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۥ:Ljava/lang/String; = "TaskStackBuilder"


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    iput-object p1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/content/Context;)LYue/ۥۣۢۡ۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۣۢۡ۟;

    invoke-direct {v0, p0}, LYue/ۥۣۢۡ۟;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/content/Context;)LYue/ۥۣۢۡ۟;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟۠(Landroid/content/Context;)LYue/ۥۣۢۡ۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Landroid/content/Intent;)LYue/ۥۣۢۡ۟;
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ۥ۟(Landroid/content/Intent;)LYue/ۥۣۢۡ۟;
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟(Landroid/content/ComponentName;)LYue/ۥۣۢۡ۟;

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥۣۢۡ۟;->ۥ(Landroid/content/Intent;)LYue/ۥۣۢۡ۟;

    return-object p0
.end method

.method public ۥ۟۟(Landroid/app/Activity;)LYue/ۥۣۢۡ۟;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    instance-of v0, p1, LYue/ۥۣۢۡ۟$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣۢۡ۟$ۥ;

    invoke-interface {v0}, LYue/ۥۣۢۡ۟$ۥ;->getSupportParentActivityIntent()Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {p1}, LYue/ۥۡۢۡ۠;->ۥ(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    :cond_2
    invoke-virtual {p0, p1}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟(Landroid/content/ComponentName;)LYue/ۥۣۢۡ۟;

    invoke-virtual {p0, v0}, LYue/ۥۣۢۡ۟;->ۥ(Landroid/content/Intent;)LYue/ۥۣۢۡ۟;

    :cond_3
    return-object p0
.end method

.method public ۥ۟۟۟(Landroid/content/ComponentName;)LYue/ۥۣۢۡ۟;
    .locals 2
    .param p1    # Landroid/content/ComponentName;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :try_start_0
    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-static {v1, p1}, LYue/ۥۡۢۡ۠;->ۥ۟(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-static {v1, p1}, LYue/ۥۡۢۡ۠;->ۥ۟(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-object p0

    :goto_1
    const-string v0, "TaskStackBuilder"

    const-string v1, "Bad ComponentName while traversing activity parent metadata"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Class;)LYue/ۥۣۢۡ۟;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e3;"
        }
    .end annotation

    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟(Landroid/content/ComponentName;)LYue/ۥۣۢۡ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(I)Landroid/content/Intent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    return-object p1
.end method

.method public ۥۣ۟۟۟(I)Landroid/content/Intent;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟ۡ(I)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۥ()[Landroid/content/Intent;
    .locals 5
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v1, v0, [Landroid/content/Intent;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Intent;

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    aput-object v2, v1, v4

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v0, :cond_1

    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Intent;

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public ۥ۟۟۟ۦ(II)Landroid/app/PendingIntent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟ۧ(IILandroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(IILandroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 4
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/Intent;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    new-instance v2, Landroid/content/Intent;

    aget-object v3, v0, v1

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    aput-object v2, v0, v1

    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-static {v1, p1, v0, p2, p3}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot getPendingIntent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۨ()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۠(Landroid/os/Bundle;)V

    return-void
.end method

.method public ۥ۟۟۠(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/Intent;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    new-instance v2, Landroid/content/Intent;

    aget-object v3, v0, v1

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    aput-object v2, v0, v1

    iget-object v1, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-static {v1, v0, p1}, LYue/ۥۣ۟ۧۨ;->ۥ۟۟ۡ(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, LYue/ۥۣۢۡ۟;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
