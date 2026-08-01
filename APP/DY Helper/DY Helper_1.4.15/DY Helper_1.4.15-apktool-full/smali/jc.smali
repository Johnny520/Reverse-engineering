.class public final synthetic Ljc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lan;

.field public final synthetic η:I

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lan;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ljc;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljc;->ζ:Lan;

    .line 8
    .line 9
    iput-object p2, p0, Ljc;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ljc;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Ljc;->η:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lr01;Laa;Lan;I)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Ljc;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc;->θ:Ljava/lang/Object;

    iput-object p2, p0, Ljc;->ι:Ljava/lang/Object;

    iput-object p3, p0, Ljc;->ζ:Lan;

    iput p4, p0, Ljc;->η:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ljc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv80;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, Ljc;->η:I

    .line 14
    .line 15
    invoke-static {p2}, Lv81;->σ(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    or-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    iget-object v0, p0, Ljc;->ζ:Lan;

    .line 22
    .line 23
    iget-object v1, p0, Ljc;->θ:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object p0, p0, Ljc;->ι:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0, v1, p0, p1, p2}, Lan;->δ(Ljava/lang/Object;Ljava/lang/Object;Lv80;I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    iget-object v0, p0, Ljc;->θ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lr01;

    .line 36
    .line 37
    iget-object v1, p0, Ljc;->ι:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Laa;

    .line 40
    .line 41
    check-cast p1, Lv80;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p2, p0, Ljc;->η:I

    .line 49
    .line 50
    or-int/lit8 p2, p2, 0x1

    .line 51
    .line 52
    invoke-static {p2}, Lv81;->σ(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iget-object p0, p0, Ljc;->ζ:Lan;

    .line 57
    .line 58
    invoke-static {v0, v1, p0, p1, p2}, Lyh;->α(Lr01;Laa;Lan;Lv80;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
