.class public final Le12;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Lh12;

.field public final synthetic ζ:Lr01;

.field public final synthetic η:Le80;

.field public final synthetic θ:I


# direct methods
.method public constructor <init>(Lh12;Lr01;Le80;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Le12;->ε:Lh12;

    .line 2
    .line 3
    iput-object p2, p0, Le12;->ζ:Lr01;

    .line 4
    .line 5
    iput-object p3, p0, Le12;->η:Le80;

    .line 6
    .line 7
    iput p4, p0, Le12;->θ:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lv80;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Le12;->θ:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, Lv81;->σ(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, Le12;->ε:Lh12;

    .line 17
    .line 18
    iget-object v1, p0, Le12;->ζ:Lr01;

    .line 19
    .line 20
    iget-object p0, p0, Le12;->η:Le80;

    .line 21
    .line 22
    invoke-static {v0, v1, p0, p1, p2}, Ljx0;->θ(Lh12;Lr01;Le80;Lv80;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    return-object p0
.end method
