.class public final Lqk;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lok;


# instance fields
.field public final d:Lsw;

.field public final e:Lok;


# direct methods
.method public constructor <init>(Lok;Lsw;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lqk;->d:Lsw;

    .line 8
    .line 9
    instance-of p2, p1, Lqk;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Lqk;

    .line 14
    .line 15
    iget-object p1, p1, Lqk;->e:Lok;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lqk;->e:Lok;

    .line 18
    .line 19
    return-void
.end method
