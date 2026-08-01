.class public final synthetic Lbf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lky1;


# direct methods
.method public synthetic constructor <init>(Lky1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbf1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbf1;->ζ:Lky1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lbf1;->ε:I

    .line 2
    .line 3
    check-cast p1, Lky1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lbf1;->ζ:Lky1;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-wide v0, p1, Lky1;->β:J

    .line 16
    .line 17
    iget-wide p0, p0, Lky1;->β:J

    .line 18
    .line 19
    cmp-long p0, v0, p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lbf1;->ζ:Lky1;

    .line 36
    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    iget-wide v0, p1, Lky1;->β:J

    .line 40
    .line 41
    iget-wide p0, p0, Lky1;->β:J

    .line 42
    .line 43
    cmp-long p0, v0, p0

    .line 44
    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
