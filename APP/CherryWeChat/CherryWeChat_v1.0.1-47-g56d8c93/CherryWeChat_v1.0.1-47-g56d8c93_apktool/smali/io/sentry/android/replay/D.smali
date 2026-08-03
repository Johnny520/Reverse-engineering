.class public abstract Lio/sentry/android/replay/D;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lio/sentry/android/replay/a;->l:Lio/sentry/android/replay/a;

    const/4 v1, 0x3

    invoke-static {v1, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/D;->a:Ljava/lang/Object;

    sget-object v0, Lio/sentry/android/replay/a;->m:Lio/sentry/android/replay/a;

    invoke-static {v1, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/D;->b:Ljava/lang/Object;

    return-void
.end method
