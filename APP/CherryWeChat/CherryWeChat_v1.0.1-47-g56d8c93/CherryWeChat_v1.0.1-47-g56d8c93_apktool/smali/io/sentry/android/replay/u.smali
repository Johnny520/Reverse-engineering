.class public final Lio/sentry/android/replay/u;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lio/sentry/android/replay/v;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/v;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/u;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/u;->c:Lio/sentry/android/replay/v;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/sentry/android/replay/u;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lio/sentry/android/replay/u;->c:Lio/sentry/android/replay/v;

    iget-object v1, v1, Lio/sentry/android/replay/v;->h:Ljava/lang/Object;

    invoke-interface {v1}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iget-object v1, p0, Lio/sentry/android/replay/u;->c:Lio/sentry/android/replay/v;

    iget-object v1, v1, Lio/sentry/android/replay/v;->a:Lio/sentry/android/replay/w;

    iget v2, v1, Lio/sentry/android/replay/w;->c:F

    iget v1, v1, Lio/sentry/android/replay/w;->d:F

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
