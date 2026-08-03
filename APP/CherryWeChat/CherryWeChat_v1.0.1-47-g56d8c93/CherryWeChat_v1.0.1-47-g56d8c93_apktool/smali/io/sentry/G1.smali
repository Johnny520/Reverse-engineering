.class public final Lio/sentry/G1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lio/sentry/G1;


# instance fields
.field public a:Z

.field public final b:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/G1;

    invoke-direct {v0}, Lio/sentry/G1;-><init>()V

    sput-object v0, Lio/sentry/G1;->c:Lio/sentry/G1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/G1;->b:Lio/sentry/util/a;

    return-void
.end method
