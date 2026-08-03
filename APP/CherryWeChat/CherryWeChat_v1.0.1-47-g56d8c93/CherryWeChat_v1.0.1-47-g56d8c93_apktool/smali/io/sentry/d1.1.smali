.class public final Lio/sentry/d1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lio/sentry/protocol/t;

.field public final b:Lio/sentry/protocol/t;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Ljava/io/File;

.field public final e:D


# direct methods
.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Ljava/util/Map;Ljava/io/File;Lio/sentry/H1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/d1;->a:Lio/sentry/protocol/t;

    iput-object p2, p0, Lio/sentry/d1;->b:Lio/sentry/protocol/t;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lio/sentry/d1;->c:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p4, p0, Lio/sentry/d1;->d:Ljava/io/File;

    invoke-virtual {p5}, Lio/sentry/H1;->d()J

    move-result-wide p1

    long-to-double p1, p1

    const-wide p3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr p1, p3

    iput-wide p1, p0, Lio/sentry/d1;->e:D

    return-void
.end method
