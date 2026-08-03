.class public final Lio/sentry/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public final b:Lio/sentry/protocol/F;

.field public final c:Lio/sentry/K1;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/K1;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 17
    iput-object v0, p0, Lio/sentry/a;->b:Lio/sentry/protocol/F;

    .line 18
    iput-object p1, p0, Lio/sentry/a;->c:Lio/sentry/K1;

    .line 19
    const-string p1, "screenshot.png"

    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 20
    const-string p1, "image/png"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 21
    const-string p1, "event.attachment"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/F;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 10
    iput-object p1, p0, Lio/sentry/a;->b:Lio/sentry/protocol/F;

    .line 11
    iput-object v0, p0, Lio/sentry/a;->c:Lio/sentry/K1;

    .line 12
    const-string p1, "view-hierarchy.json"

    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 13
    const-string p1, "application/json"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 14
    const-string p1, "event.view_hierarchy"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/a;->a:[B

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lio/sentry/a;->b:Lio/sentry/protocol/F;

    .line 4
    iput-object p1, p0, Lio/sentry/a;->c:Lio/sentry/K1;

    .line 5
    const-string p1, "thread-dump.txt"

    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 6
    const-string p1, "text/plain"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 7
    const-string p1, "event.attachment"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method
