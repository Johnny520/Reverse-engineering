.class public final synthetic Lvk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Lba;

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Lr01;

.field public final synthetic θ:Li2;

.field public final synthetic ι:I


# direct methods
.method public synthetic constructor <init>(Lba;Ljava/lang/String;Lr01;Li2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvk0;->ε:Lba;

    .line 5
    .line 6
    iput-object p2, p0, Lvk0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lvk0;->η:Lr01;

    .line 9
    .line 10
    iput-object p4, p0, Lvk0;->θ:Li2;

    .line 11
    .line 12
    iput p5, p0, Lvk0;->ι:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lv80;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lvk0;->ι:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lv81;->σ(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lvk0;->ε:Lba;

    .line 18
    .line 19
    iget-object v1, p0, Lvk0;->ζ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lvk0;->η:Lr01;

    .line 22
    .line 23
    iget-object v3, p0, Lvk0;->θ:Li2;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lyh;->γ(Lba;Ljava/lang/String;Lr01;Li2;Lv80;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ls62;->α:Ls62;

    .line 29
    .line 30
    return-object p0
.end method
