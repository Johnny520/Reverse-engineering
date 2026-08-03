.class public abstract Lio/sentry/android/core/N;
.super Landroid/content/ContentProvider;
.source ""


# instance fields
.field public final a:Lio/sentry/B0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    new-instance v0, Lio/sentry/B0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/B0;-><init>(IZ)V

    iput-object v0, p0, Lio/sentry/android/core/N;->a:Lio/sentry/B0;

    return-void
.end method


# virtual methods
.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/N;->a:Lio/sentry/B0;

    invoke-virtual {p1, p0}, Lio/sentry/B0;->i(Lio/sentry/android/core/N;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/N;->a:Lio/sentry/B0;

    invoke-virtual {p1, p0}, Lio/sentry/B0;->i(Lio/sentry/android/core/N;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/N;->a:Lio/sentry/B0;

    invoke-virtual {p1, p0}, Lio/sentry/B0;->i(Lio/sentry/android/core/N;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/N;->a:Lio/sentry/B0;

    invoke-virtual {p1, p0}, Lio/sentry/B0;->i(Lio/sentry/android/core/N;)V

    const/4 p1, 0x0

    return p1
.end method
