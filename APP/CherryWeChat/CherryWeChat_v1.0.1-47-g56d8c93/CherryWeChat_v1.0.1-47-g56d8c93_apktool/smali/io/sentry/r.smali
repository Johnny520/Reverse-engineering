.class public final Lio/sentry/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/d0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/r;->a:I

    iput-object p2, p0, Lio/sentry/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget v0, p0, Lio/sentry/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/r;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :pswitch_0
    sget-object v0, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    iget-object v1, p0, Lio/sentry/r;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/Z;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
