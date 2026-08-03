.class public final LUq;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:LXq;


# direct methods
.method public synthetic constructor <init>(LXq;)V
    .locals 0

    iput-object p1, p0, LUq;->a:LXq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LXb;)LXb;
    .locals 2

    instance-of v0, p1, LRv;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lf1;

    iget-object v1, p0, LUq;->a:LXq;

    invoke-virtual {v1}, LXq;->i()F

    move-result v1

    neg-float v1, v1

    invoke-direct {v0, v1, p1}, Lf1;-><init>(FLXb;)V

    return-object v0
.end method
