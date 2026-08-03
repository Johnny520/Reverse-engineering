.class public final Lio/sentry/android/core/g0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/g0;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lio/sentry/android/core/g0;->b:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lio/sentry/android/core/g0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lio/sentry/android/core/g0;

    iget-object v0, p0, Lio/sentry/android/core/g0;->a:Ljava/lang/Integer;

    iget-object v2, p1, Lio/sentry/android/core/g0;->a:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lio/sentry/config/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/g0;->b:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/sentry/android/core/g0;->b:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lio/sentry/config/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/g0;->a:Ljava/lang/Integer;

    iget-object v1, p0, Lio/sentry/android/core/g0;->b:Ljava/lang/Boolean;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
