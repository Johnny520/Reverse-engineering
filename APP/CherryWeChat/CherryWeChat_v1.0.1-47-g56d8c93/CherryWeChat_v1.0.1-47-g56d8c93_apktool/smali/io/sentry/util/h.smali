.class public abstract Lio/sentry/util/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LE1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE1;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, LE1;-><init>(I)V

    sput-object v0, Lio/sentry/util/h;->a:LE1;

    return-void
.end method

.method public static a()Lio/sentry/util/g;
    .locals 1

    sget-object v0, Lio/sentry/util/h;->a:LE1;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/util/g;

    return-object v0
.end method
