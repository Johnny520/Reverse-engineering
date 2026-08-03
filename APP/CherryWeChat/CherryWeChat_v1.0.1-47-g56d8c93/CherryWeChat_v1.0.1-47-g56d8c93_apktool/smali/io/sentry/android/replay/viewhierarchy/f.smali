.class public abstract Lio/sentry/android/replay/viewhierarchy/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:Z

.field public final e:Landroid/graphics/Rect;

.field public f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/sentry/android/replay/viewhierarchy/f;->a:I

    iput p2, p0, Lio/sentry/android/replay/viewhierarchy/f;->b:I

    iput p3, p0, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    iput-boolean p5, p0, Lio/sentry/android/replay/viewhierarchy/f;->d:Z

    iput-object p6, p0, Lio/sentry/android/replay/viewhierarchy/f;->e:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/replay/t;)V
    .locals 2

    invoke-virtual {p1, p0}, Lio/sentry/android/replay/t;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/viewhierarchy/f;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/viewhierarchy/f;

    invoke-virtual {v1, p1}, Lio/sentry/android/replay/viewhierarchy/f;->a(Lio/sentry/android/replay/t;)V

    goto :goto_0

    :cond_0
    return-void
.end method
