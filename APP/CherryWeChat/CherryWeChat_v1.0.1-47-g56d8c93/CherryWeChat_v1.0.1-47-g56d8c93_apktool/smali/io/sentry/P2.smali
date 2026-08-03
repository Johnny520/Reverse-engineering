.class public final Lio/sentry/P2;
.super Lio/sentry/H2;
.source ""


# static fields
.field public static final q:Lio/sentry/protocol/C;


# instance fields
.field public n:Ljava/lang/String;

.field public o:Lio/sentry/protocol/C;

.field public p:Lvx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/sentry/protocol/C;->CUSTOM:Lio/sentry/protocol/C;

    sput-object v0, Lio/sentry/P2;->q:Lio/sentry/protocol/C;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/sentry/protocol/C;Ljava/lang/String;Lvx;)V
    .locals 3

    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0}, Lio/sentry/protocol/t;-><init>()V

    new-instance v1, Lio/sentry/K2;

    invoke-direct {v1}, Lio/sentry/K2;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, p3, v2}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    const-string p3, "name is required"

    invoke-static {p3, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/P2;->n:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/P2;->o:Lio/sentry/protocol/C;

    invoke-virtual {p0, p4}, Lio/sentry/H2;->a(Lvx;)V

    if-nez p4, :cond_0

    move-object p1, v2

    goto :goto_0

    :cond_0
    iget-object p1, p4, Lvx;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    :goto_0
    if-nez p4, :cond_1

    move-object p2, v2

    goto :goto_1

    :cond_1
    iget-object p2, p4, Lvx;->b:Ljava/io/Serializable;

    check-cast p2, Ljava/lang/Double;

    :goto_1
    if-nez p4, :cond_2

    move-object p3, v2

    goto :goto_2

    :cond_2
    iget-object p3, p4, Lvx;->c:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Double;

    :goto_2
    invoke-static {v2, p1, p2, p3}, Lio/sentry/config/a;->h(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/H2;->m:Lio/sentry/c;

    return-void
.end method

.method public static b(Lio/sentry/l;)Lio/sentry/P2;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/c;

    iget-object v1, v0, Lio/sentry/c;->c:Ljava/lang/Double;

    new-instance v1, Lio/sentry/P2;

    iget-object v2, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/protocol/t;

    iget-object p0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast p0, Lio/sentry/K2;

    const-string v3, "default"

    const/4 v4, 0x0

    invoke-direct {v1, v2, p0, v3, v4}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    const-string p0, "<unlabeled transaction>"

    iput-object p0, v1, Lio/sentry/P2;->n:Ljava/lang/String;

    iput-object v4, v1, Lio/sentry/P2;->p:Lvx;

    sget-object p0, Lio/sentry/P2;->q:Lio/sentry/protocol/C;

    iput-object p0, v1, Lio/sentry/P2;->o:Lio/sentry/protocol/C;

    invoke-static {v0, v4, v4, v4}, Lio/sentry/config/a;->h(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p0

    iput-object p0, v1, Lio/sentry/H2;->m:Lio/sentry/c;

    return-object v1
.end method
