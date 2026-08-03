.class public final Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final delegate:Lwb/p3;

.field private final restoreAction:Lfg/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfg/a;"
        }
    .end annotation
.end field

.field private volatile restored:Z


# direct methods
.method public constructor <init>(Lwb/p3;Lfg/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb/p3;",
            "Lfg/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->delegate:Lwb/p3;

    .line 11
    .line 12
    iput-object p2, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restoreAction:Lfg/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final isApplied()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restored:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->delegate:Lwb/p3;

    .line 6
    .line 7
    check-cast v0, Lwb/dr;

    .line 8
    .line 9
    iget-object v0, v0, Lwb/dr;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final markRestored$app()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restored:Z

    .line 3
    .line 4
    return-void
.end method

.method public final restore()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restored:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restoreAction:Lfg/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method
