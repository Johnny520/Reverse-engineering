.class public final Lcw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqx0;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:I

.field public final synthetic γ:Ljava/util/Map;

.field public final synthetic δ:La80;

.field public final synthetic ε:La80;

.field public final synthetic ζ:Ldw0;


# direct methods
.method public constructor <init>(IILjava/util/Map;La80;La80;Ldw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcw0;->α:I

    .line 5
    .line 6
    iput p2, p0, Lcw0;->β:I

    .line 7
    .line 8
    iput-object p3, p0, Lcw0;->γ:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lcw0;->δ:La80;

    .line 11
    .line 12
    iput-object p5, p0, Lcw0;->ε:La80;

    .line 13
    .line 14
    iput-object p6, p0, Lcw0;->ζ:Ldw0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcw0;->ζ:Ldw0;

    .line 2
    .line 3
    iget-object v0, v0, Ldw0;->ο:Lew0;

    .line 4
    .line 5
    iget-object p0, p0, Lcw0;->ε:La80;

    .line 6
    .line 7
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final β()I
    .locals 0

    .line 1
    iget p0, p0, Lcw0;->β:I

    .line 2
    .line 3
    return p0
.end method

.method public final γ()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcw0;->γ:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lcw0;->δ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ε()I
    .locals 0

    .line 1
    iget p0, p0, Lcw0;->α:I

    .line 2
    .line 3
    return p0
.end method
