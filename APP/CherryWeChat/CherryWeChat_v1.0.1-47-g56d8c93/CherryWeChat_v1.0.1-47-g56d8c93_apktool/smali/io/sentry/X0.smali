.class public final Lio/sentry/X0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/k0;


# static fields
.field public static final a:Lio/sentry/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/X0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/X0;->a:Lio/sentry/X0;

    return-void
.end method


# virtual methods
.method public final k(Lio/sentry/v2;Lio/sentry/internal/debugmeta/c;)Lio/sentry/transport/g;
    .locals 0

    sget-object p1, Lio/sentry/transport/j;->a:Lio/sentry/transport/j;

    return-object p1
.end method
