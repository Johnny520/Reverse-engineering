.class public final LWv$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final Companion:LVv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVv;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LWv$a;->Companion:LVv;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    sget-object v0, LWv$a;->Companion:LVv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LWv$a;

    invoke-direct {v0}, LWv$a;-><init>()V

    invoke-static {p0, v0}, LQ;->n(Landroid/app/Activity;LWv$a;)V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    sget p2, LWv;->b:I

    sget-object p2, LOn;->ON_CREATE:LOn;

    invoke-static {p1, p2}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    sget v0, LWv;->b:I

    sget-object v0, LOn;->ON_RESUME:LOn;

    invoke-static {p1, v0}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    sget v0, LWv;->b:I

    sget-object v0, LOn;->ON_START:LOn;

    invoke-static {p1, v0}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 1

    sget v0, LWv;->b:I

    sget-object v0, LOn;->ON_DESTROY:LOn;

    invoke-static {p1, v0}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 1

    sget v0, LWv;->b:I

    sget-object v0, LOn;->ON_PAUSE:LOn;

    invoke-static {p1, v0}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 1

    sget v0, LWv;->b:I

    sget-object v0, LOn;->ON_STOP:LOn;

    invoke-static {p1, v0}, LUv;->a(Landroid/app/Activity;LOn;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
