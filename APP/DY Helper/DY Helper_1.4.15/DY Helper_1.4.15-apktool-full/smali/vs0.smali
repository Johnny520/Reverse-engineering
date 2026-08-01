.class public final synthetic Lvs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lxt0;

.field public final synthetic η:Z

.field public final synthetic θ:Z

.field public final synthetic ι:Z

.field public final synthetic κ:Lp70;

.field public final synthetic λ:Lp70;


# direct methods
.method public synthetic constructor <init>(Lxt0;ZZZLp70;Lp70;II)V
    .locals 0

    .line 1
    iput p8, p0, Lvs0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lvs0;->ζ:Lxt0;

    .line 4
    .line 5
    iput-boolean p2, p0, Lvs0;->η:Z

    .line 6
    .line 7
    iput-boolean p3, p0, Lvs0;->θ:Z

    .line 8
    .line 9
    iput-boolean p4, p0, Lvs0;->ι:Z

    .line 10
    .line 11
    iput-object p5, p0, Lvs0;->κ:Lp70;

    .line 12
    .line 13
    iput-object p6, p0, Lvs0;->λ:Lp70;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lvs0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, Lv80;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x7

    .line 15
    invoke-static {p1}, Lv81;->σ(I)I

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    iget-object v1, p0, Lvs0;->ζ:Lxt0;

    .line 20
    .line 21
    iget-boolean v2, p0, Lvs0;->η:Z

    .line 22
    .line 23
    iget-boolean v3, p0, Lvs0;->θ:Z

    .line 24
    .line 25
    iget-boolean v4, p0, Lvs0;->ι:Z

    .line 26
    .line 27
    iget-object v5, p0, Lvs0;->κ:Lp70;

    .line 28
    .line 29
    iget-object v6, p0, Lvs0;->λ:Lp70;

    .line 30
    .line 31
    invoke-static/range {v1 .. v8}, Lpt0;->ε(Lxt0;ZZZLp70;Lp70;Lv80;I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    move-object v6, p1

    .line 38
    check-cast v6, Lv80;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x7

    .line 46
    invoke-static {p1}, Lv81;->σ(I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    iget-object v0, p0, Lvs0;->ζ:Lxt0;

    .line 51
    .line 52
    iget-boolean v1, p0, Lvs0;->η:Z

    .line 53
    .line 54
    iget-boolean v2, p0, Lvs0;->θ:Z

    .line 55
    .line 56
    iget-boolean v3, p0, Lvs0;->ι:Z

    .line 57
    .line 58
    iget-object v4, p0, Lvs0;->κ:Lp70;

    .line 59
    .line 60
    iget-object v5, p0, Lvs0;->λ:Lp70;

    .line 61
    .line 62
    invoke-static/range {v0 .. v7}, Ljx0;->ε(Lxt0;ZZZLp70;Lp70;Lv80;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
