.class public final Lio/sentry/internal/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile c:Lio/sentry/internal/a;

.field public static final d:Lio/sentry/util/a;


# instance fields
.field public volatile a:Z

.field public final b:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/internal/a;->d:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/internal/a;->a:Z

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/internal/a;->b:Lio/sentry/util/a;

    return-void
.end method
