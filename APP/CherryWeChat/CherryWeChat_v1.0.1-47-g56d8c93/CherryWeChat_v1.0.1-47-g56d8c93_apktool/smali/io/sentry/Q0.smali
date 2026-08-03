.class public final Lio/sentry/Q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/a0;


# static fields
.field public static final a:Lio/sentry/Q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/Q0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/Q0;->a:Lio/sentry/Q0;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Z;)Lio/sentry/d0;
    .locals 0

    sget-object p1, Lio/sentry/P0;->a:Lio/sentry/P0;

    return-object p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final get()Lio/sentry/Z;
    .locals 1

    sget-object v0, Lio/sentry/O0;->b:Lio/sentry/O0;

    return-object v0
.end method
