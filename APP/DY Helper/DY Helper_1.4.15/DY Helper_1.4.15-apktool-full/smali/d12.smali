.class public final Ld12;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Lr01;

.field public final synthetic ζ:Le80;

.field public final synthetic η:I


# direct methods
.method public constructor <init>(Lr01;Le80;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld12;->ε:Lr01;

    .line 2
    .line 3
    iput-object p2, p0, Ld12;->ζ:Le80;

    .line 4
    .line 5
    iput p3, p0, Ld12;->η:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget p2, p0, Ld12;->η:I

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
    iget-object v0, p0, Ld12;->ε:Lr01;

    .line 17
    .line 18
    iget-object p0, p0, Ld12;->ζ:Le80;

    .line 19
    .line 20
    invoke-static {v0, p0, p1, p2}, Ljx0;->η(Lr01;Le80;Lv80;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Ls62;->α:Ls62;

    .line 24
    .line 25
    return-object p0
.end method
