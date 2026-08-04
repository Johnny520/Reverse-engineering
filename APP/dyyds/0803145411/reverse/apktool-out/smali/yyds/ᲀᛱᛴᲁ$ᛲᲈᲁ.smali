.class public final Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᲀᛱᛴᲁ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f2\u1c88\u1c81"
.end annotation


# static fields
.field public static final Companion:Lyyds/ᛲᛴᛸᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛲᛴᛸᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;->Companion:Lyyds/ᛲᛴᛸᛷ;

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
    sget-object v0, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;->Companion:Lyyds/ᛲᛴᛸᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;

    .line 7
    .line 8
    invoke-direct {v0}, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;-><init>()V

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
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_CREATE:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_RESUME:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_START:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_DESTROY:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_PAUSE:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget p0, Lyyds/ᲀᛱᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lyyds/ᲁᛵᛶᲁ;->ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V

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
