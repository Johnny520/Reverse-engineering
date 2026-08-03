.class public abstract Lio/sentry/android/ndk/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    const-string v1, "maven:io.sentry:sentry-android-ndk"

    const-string v2, "8.21.1"

    invoke-virtual {v0, v1, v2}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
