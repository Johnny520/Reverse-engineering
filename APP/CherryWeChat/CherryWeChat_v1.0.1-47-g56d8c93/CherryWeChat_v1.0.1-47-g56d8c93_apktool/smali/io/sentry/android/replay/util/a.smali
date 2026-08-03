.class public final Lio/sentry/android/replay/util/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/android/replay/util/i;


# instance fields
.field public final a:Landroidx/compose/ui/text/TextLayoutResult;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroidx/compose/ui/text/TextLayoutResult;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/TextLayoutResult;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    iput-boolean p2, p0, Lio/sentry/android/replay/util/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineStart(I)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineCount()I

    move-result v0

    return v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(I)I
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineTop(I)F

    move-result p1

    invoke-static {p1}, LDc;->q(F)I

    move-result p1

    return p1
.end method

.method public final f(II)F
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getHorizontalPosition(IZ)F

    move-result p2

    iget-boolean v0, p0, Lio/sentry/android/replay/util/a;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/android/replay/util/a;->b()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineLeft(I)F

    move-result p1

    sub-float/2addr p2, p1

    :cond_0
    return p2
.end method

.method public final g(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->isLineEllipsized(I)Z

    move-result p1

    return p1
.end method

.method public final h(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/util/a;->a:Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    move-result p1

    invoke-static {p1}, LDc;->q(F)I

    move-result p1

    return p1
.end method
