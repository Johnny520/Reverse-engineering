.class public final Lq21;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lyd;
.implements Ljb2;


# instance fields
.field public final ε:Lae;

.field public final synthetic ζ:Lr21;


# direct methods
.method public constructor <init>(Lr21;Lae;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq21;->ζ:Lr21;

    .line 5
    .line 6
    iput-object p2, p0, Lq21;->ε:Lae;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(Lsr1;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq21;->ε:Lae;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lae;->α(Lsr1;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final γ()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Lq21;->ε:Lae;

    .line 2
    .line 3
    iget-object p0, p0, Lae;->ι:Lup;

    .line 4
    .line 5
    return-object p0
.end method

.method public final ζ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq21;->ε:Lae;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ι(Ljava/lang/Object;Lf80;)Luy;
    .locals 1

    .line 1
    check-cast p1, Ls62;

    .line 2
    .line 3
    new-instance p2, Lzd;

    .line 4
    .line 5
    iget-object v0, p0, Lq21;->ζ:Lr21;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lzd;-><init>(Lr21;Lq21;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lq21;->ε:Lae;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lae;->ι(Ljava/lang/Object;Lf80;)Luy;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lr21;->η:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final χ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq21;->ε:Lae;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lae;->χ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
