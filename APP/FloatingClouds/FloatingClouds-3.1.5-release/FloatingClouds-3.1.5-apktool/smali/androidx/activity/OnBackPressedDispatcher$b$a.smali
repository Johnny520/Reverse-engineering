.class public final Landroidx/activity/OnBackPressedDispatcher$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/OnBackPressedDispatcher$b;->a(La/D7;La/D7;La/s7;La/s7;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/D7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/D7<",
            "La/R1;",
            "La/Wf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:La/D7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/D7<",
            "La/R1;",
            "La/Wf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:La/s7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/s7<",
            "La/Wf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:La/s7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/s7<",
            "La/Wf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/D7;La/D7;La/s7;La/s7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/D7<",
            "-",
            "La/R1;",
            "La/Wf;",
            ">;",
            "La/D7<",
            "-",
            "La/R1;",
            "La/Wf;",
            ">;",
            "La/s7<",
            "La/Wf;",
            ">;",
            "La/s7<",
            "La/Wf;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->a:La/D7;

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->b:La/D7;

    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->c:La/s7;

    iput-object p4, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->d:La/s7;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->d:La/s7;

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->c:La/s7;

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->b:La/D7;

    new-instance v1, La/R1;

    invoke-direct {v1, p1}, La/R1;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$b$a;->a:La/D7;

    new-instance v1, La/R1;

    invoke-direct {v1, p1}, La/R1;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
