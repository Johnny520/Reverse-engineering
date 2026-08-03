.class public abstract Lio/sentry/w;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lio/sentry/Z;

.field public final b:Lio/sentry/ILogger;

.field public final c:J

.field public final d:Lio/sentry/M2;


# direct methods
.method public constructor <init>(Lio/sentry/Z;Lio/sentry/ILogger;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/w;->a:Lio/sentry/Z;

    iput-object p2, p0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    iput-wide p3, p0, Lio/sentry/w;->c:J

    new-instance p1, Lio/sentry/h;

    invoke-direct {p1, p5}, Lio/sentry/h;-><init>(I)V

    new-instance p2, Lio/sentry/M2;

    invoke-direct {p2, p1}, Lio/sentry/M2;-><init>(Lio/sentry/h;)V

    iput-object p2, p0, Lio/sentry/w;->d:Lio/sentry/M2;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Z
.end method

.method public abstract b(Ljava/io/File;Lio/sentry/H;)V
.end method
