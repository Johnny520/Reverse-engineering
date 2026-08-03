.class public final Lio/sentry/android/core/o;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/io/File;

.field public final d:Ljava/util/Map;

.field public final e:Z


# direct methods
.method public constructor <init>(JJZLjava/io/File;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/sentry/android/core/o;->a:J

    iput-object p6, p0, Lio/sentry/android/core/o;->c:Ljava/io/File;

    iput-wide p3, p0, Lio/sentry/android/core/o;->b:J

    iput-object p7, p0, Lio/sentry/android/core/o;->d:Ljava/util/Map;

    iput-boolean p5, p0, Lio/sentry/android/core/o;->e:Z

    return-void
.end method
