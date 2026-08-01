.class public final Lmu0;
.super Lt;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsk;


# instance fields
.field public final synthetic e:Lwi;

.field public final synthetic f:Lnu0;


# direct methods
.method public constructor <init>(Lwi;Lnu0;)V
    .locals 1

    .line 1
    sget-object v0, Ln2;->x:Ln2;

    .line 2
    .line 3
    iput-object p1, p0, Lmu0;->e:Lwi;

    .line 4
    .line 5
    iput-object p2, p0, Lmu0;->f:Lnu0;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lt;-><init>(Lok;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final n(Lpk;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lc7;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Lmu0;->e:Lwi;

    .line 5
    .line 6
    iget-object p0, p0, Lmu0;->f:Lnu0;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lrd0;->W(Ljava/lang/Throwable;Lhw;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Ln2;->x:Ln2;

    .line 15
    .line 16
    iget-object p0, p0, Lnu0;->d:Lpk;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Lpk;->l(Lok;)Lnk;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lsk;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Lsk;->n(Lpk;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    throw p2
.end method
