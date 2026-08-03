.class public final Lio/sentry/C2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lio/sentry/C2;


# instance fields
.field public final a:Z

.field public final b:Lio/sentry/L2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/C2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/C2;-><init>(ZLio/sentry/L2;)V

    sput-object v0, Lio/sentry/C2;->c:Lio/sentry/C2;

    return-void
.end method

.method public constructor <init>(ZLio/sentry/L2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/sentry/C2;->a:Z

    iput-object p2, p0, Lio/sentry/C2;->b:Lio/sentry/L2;

    return-void
.end method
