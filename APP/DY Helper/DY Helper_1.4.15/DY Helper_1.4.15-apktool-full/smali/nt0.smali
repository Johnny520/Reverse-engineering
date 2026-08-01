.class public final synthetic Lnt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Lr01;

.field public final synthetic ζ:Z

.field public final synthetic η:Z

.field public final synthetic θ:F

.field public final synthetic ι:Lep0;


# direct methods
.method public synthetic constructor <init>(Lr01;ZZFLep0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnt0;->ε:Lr01;

    .line 5
    .line 6
    iput-boolean p2, p0, Lnt0;->ζ:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lnt0;->η:Z

    .line 9
    .line 10
    iput p4, p0, Lnt0;->θ:F

    .line 11
    .line 12
    iput-object p5, p0, Lnt0;->ι:Lep0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lv80;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lv81;->σ(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-object v0, p0, Lnt0;->ε:Lr01;

    .line 15
    .line 16
    iget-boolean v1, p0, Lnt0;->ζ:Z

    .line 17
    .line 18
    iget-boolean v2, p0, Lnt0;->η:Z

    .line 19
    .line 20
    iget v3, p0, Lnt0;->θ:F

    .line 21
    .line 22
    iget-object v4, p0, Lnt0;->ι:Lep0;

    .line 23
    .line 24
    invoke-static/range {v0 .. v6}, Lpt0;->δ(Lr01;ZZFLep0;Lv80;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Ls62;->α:Ls62;

    .line 28
    .line 29
    return-object p0
.end method
