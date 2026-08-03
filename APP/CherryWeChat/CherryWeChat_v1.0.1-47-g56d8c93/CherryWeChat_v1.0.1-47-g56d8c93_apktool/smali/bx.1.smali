.class public final Lbx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lax;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lax;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbx;->a:Ljava/lang/String;

    iput-object p2, p0, Lbx;->b:Lax;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LYn;LOn;)V
    .locals 1

    sget-object v0, LOn;->ON_DESTROY:LOn;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    iput-boolean p2, p0, Lbx;->c:Z

    invoke-interface {p1}, LYn;->getLifecycle()LRn;

    move-result-object p1

    invoke-virtual {p1, p0}, LRn;->b(LXn;)V

    :cond_0
    return-void
.end method
