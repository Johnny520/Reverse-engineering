.class public final Ltj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# static fields
.field public static final ζ:Ltj1;

.field public static final η:Ltj1;

.field public static final θ:Ltj1;


# instance fields
.field public final synthetic ε:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltj1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltj1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltj1;->ζ:Ltj1;

    .line 8
    .line 9
    new-instance v0, Ltj1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ltj1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ltj1;->η:Ltj1;

    .line 16
    .line 17
    new-instance v0, Ltj1;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Ltj1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ltj1;->θ:Ltj1;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltj1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Ltj1;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-wide p0, Lci;->η:J

    .line 15
    .line 16
    new-instance v0, Lci;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lci;-><init>(J)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-long p0, p0

    .line 32
    const/16 v0, 0x20

    .line 33
    .line 34
    shl-long/2addr p0, v0

    .line 35
    new-instance v0, Lci;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1}, Lci;-><init>(J)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-object v0

    .line 41
    :pswitch_0
    instance-of p0, p1, Landroid/view/ViewGroup;

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    instance-of p0, p1, Landroid/widget/TextView;

    .line 49
    .line 50
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
