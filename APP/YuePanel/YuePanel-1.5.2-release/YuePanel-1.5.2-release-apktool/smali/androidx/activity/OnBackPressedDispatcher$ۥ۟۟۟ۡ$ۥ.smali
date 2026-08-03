.class public final Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ;->ۥ(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e5;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e5;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟:LYue/ۥۣ۠۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e5;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e5;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ:LYue/ۥۣ۠ۡ۟;

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۨ;

    iput-object p4, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackCancelled()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    new-instance v1, LYue/ۥ۟ۢۤۥ;

    invoke-direct {v1, p1}, LYue/ۥ۟ۢۤۥ;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onBackStarted(Landroid/window/BackEvent;)V
    .locals 2
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ;->ۥ:LYue/ۥۣ۠ۡ۟;

    new-instance v1, LYue/ۥ۟ۢۤۥ;

    invoke-direct {v1, p1}, LYue/ۥ۟ۢۤۥ;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
