.class public final Lio/sentry/android/replay/viewhierarchy/e;
.super Lio/sentry/android/replay/viewhierarchy/f;
.source ""


# instance fields
.field public final g:Lio/sentry/android/replay/util/i;

.field public final h:Ljava/lang/Integer;

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/util/i;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V
    .locals 7

    move-object v0, p0

    move v1, p5

    move v2, p6

    move v3, p7

    move-object v4, p8

    move/from16 v5, p9

    move-object/from16 v6, p10

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    iput-object p1, p0, Lio/sentry/android/replay/viewhierarchy/e;->g:Lio/sentry/android/replay/util/i;

    iput-object p2, p0, Lio/sentry/android/replay/viewhierarchy/e;->h:Ljava/lang/Integer;

    iput p3, p0, Lio/sentry/android/replay/viewhierarchy/e;->i:I

    iput p4, p0, Lio/sentry/android/replay/viewhierarchy/e;->j:I

    return-void
.end method
