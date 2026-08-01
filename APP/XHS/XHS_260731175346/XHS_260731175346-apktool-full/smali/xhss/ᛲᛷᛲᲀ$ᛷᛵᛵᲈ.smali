.class public final Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxhss/ᛲᛷᛲᲀ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f7\u16f5\u16f5\u1c88"
.end annotation


# static fields
.field public static final Companion:Lxhss/ᛵᛶᛲᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛵᛶᛲᲈ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;->Companion:Lxhss/ᛵᛶᛲᲈ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;->Companion:Lxhss/ᛵᛶᛲᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;

    .line 7
    .line 8
    invoke-direct {v0}, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_RESUME:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_DESTROY:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_PAUSE:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lxhss/ᛷᛱᛸᛷ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
