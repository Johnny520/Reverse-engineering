.class public final Lio/sentry/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/a0;


# static fields
.field public static final a:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Z;)Lio/sentry/d0;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/s;->get()Lio/sentry/Z;

    move-result-object v0

    sget-object v1, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    new-instance p1, Lio/sentry/r;

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lio/sentry/r;-><init>(ILjava/lang/Object;)V

    return-object p1
.end method

.method public final close()V
    .locals 1

    sget-object v0, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    return-void
.end method

.method public final get()Lio/sentry/Z;
    .locals 1

    sget-object v0, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/Z;

    return-object v0
.end method
