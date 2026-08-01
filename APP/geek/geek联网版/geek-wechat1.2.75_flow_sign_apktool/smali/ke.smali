.class public final Lke;
.super Ljava/lang/Object;

# interfaces
.implements Lge;


# instance fields
.field public final a:Lgq;

.field public final b:Lge;


# direct methods
.method public constructor <init>(Lge;Lum;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p2, Lgq;

    .line 10
    .line 11
    iput-object p2, p0, Lke;->a:Lgq;

    .line 12
    .line 13
    instance-of p2, p1, Lke;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Lke;

    .line 18
    .line 19
    iget-object p1, p1, Lke;->b:Lge;

    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lke;->b:Lge;

    .line 22
    .line 23
    return-void
.end method
