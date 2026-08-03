.class public final Lio/sentry/v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/u0;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v0;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/v0;->a:Ljava/util/ArrayList;

    return-object v0
.end method
