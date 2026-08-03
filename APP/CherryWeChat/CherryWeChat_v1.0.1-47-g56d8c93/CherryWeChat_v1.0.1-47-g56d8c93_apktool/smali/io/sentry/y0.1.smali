.class public final Lio/sentry/y0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/u0;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/y0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/y0;->a:Ljava/lang/Object;

    return-object v0
.end method
