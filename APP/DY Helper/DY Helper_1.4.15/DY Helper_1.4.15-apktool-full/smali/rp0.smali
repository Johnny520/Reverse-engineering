.class public final Lrp0;
.super Lfw0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ω:Lsp0;


# direct methods
.method public constructor <init>(Lsp0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrp0;->ω:Lsp0;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lfw0;-><init>(Lq31;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ζ(J)Lch1;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lch1;->х(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyo;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lyo;-><init>(J)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrp0;->ω:Lsp0;

    .line 10
    .line 11
    iget-object v1, v0, Lsp0;->Χ:Lqp0;

    .line 12
    .line 13
    iget-object v0, v0, Lq31;->τ:Lq31;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lq31;->У()Lfw0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p0, v0, p1, p2}, Lqp0;->Φ(Ldw0;Lkx0;J)Lqx0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Lfw0;->К(Lfw0;Lqx0;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public final ч(Lre0;)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lxb;->θ(Ldw0;Lre0;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lfw0;->ψ:Lu11;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lu11;->ζ(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v0
.end method
