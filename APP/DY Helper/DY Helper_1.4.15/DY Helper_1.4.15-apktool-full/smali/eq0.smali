.class public final Leq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqx0;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:I

.field public final synthetic γ:Ljava/util/Map;

.field public final synthetic δ:La80;

.field public final synthetic ε:Lfq0;

.field public final synthetic ζ:Lkq0;

.field public final synthetic η:La80;


# direct methods
.method public constructor <init>(IILjava/util/Map;La80;Lfq0;Lkq0;La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Leq0;->α:I

    .line 5
    .line 6
    iput p2, p0, Leq0;->β:I

    .line 7
    .line 8
    iput-object p3, p0, Leq0;->γ:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Leq0;->δ:La80;

    .line 11
    .line 12
    iput-object p5, p0, Leq0;->ε:Lfq0;

    .line 13
    .line 14
    iput-object p6, p0, Leq0;->ζ:Lkq0;

    .line 15
    .line 16
    iput-object p7, p0, Leq0;->η:La80;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 2

    .line 1
    iget-object v0, p0, Leq0;->ζ:Lkq0;

    .line 2
    .line 3
    iget-object v0, v0, Lkq0;->ε:Lyp0;

    .line 4
    .line 5
    iget-object v1, p0, Leq0;->ε:Lfq0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lfq0;->ν()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object p0, p0, Leq0;->η:La80;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lyp0;->Κ:Lk31;

    .line 16
    .line 17
    iget-object v1, v1, Lk31;->γ:Lgm0;

    .line 18
    .line 19
    iget-object v1, v1, Lgm0;->Ψ:Lfm0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Ldw0;->ο:Lew0;

    .line 24
    .line 25
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, v0, Lyp0;->Κ:Lk31;

    .line 30
    .line 31
    iget-object v0, v0, Lk31;->γ:Lgm0;

    .line 32
    .line 33
    iget-object v0, v0, Ldw0;->ο:Lew0;

    .line 34
    .line 35
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final β()I
    .locals 0

    .line 1
    iget p0, p0, Leq0;->β:I

    .line 2
    .line 3
    return p0
.end method

.method public final γ()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Leq0;->γ:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Leq0;->δ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ε()I
    .locals 0

    .line 1
    iget p0, p0, Leq0;->α:I

    .line 2
    .line 3
    return p0
.end method
