.class public final Lio/sentry/protocol/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field public static final b:Lio/sentry/protocol/t;


# instance fields
.field public final a:Lio/sentry/util/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/protocol/t;

    const-string v1, "-"

    const-string v2, ""

    const-string v3, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/util/d;

    new-instance v1, Lio/sentry/android/core/T;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v0, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "0000-0000"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    const-string v0, "00000000-0000-0000-0000-000000000000"

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x20

    const/16 v3, 0x24

    if-eq v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v3, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, v3, :cond_3

    .line 9
    new-instance p1, Lio/sentry/util/d;

    new-instance v1, Lio/sentry/J2;

    invoke-direct {v1, p0, v0}, Lio/sentry/J2;-><init>(Lio/sentry/protocol/t;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object p1, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    return-void

    .line 10
    :cond_3
    new-instance p1, Lio/sentry/util/d;

    new-instance v1, Lio/sentry/J2;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lio/sentry/J2;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object p1, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lio/sentry/protocol/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/protocol/t;

    iget-object v0, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    invoke-virtual {p1}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/t;->a:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
