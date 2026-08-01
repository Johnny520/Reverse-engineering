.class public final synthetic Lx61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx61;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lx61;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lx61;->η:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx61;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Lx61;->η:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lx61;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lq71;->α:Lq71;

    .line 13
    .line 14
    invoke-static {p0, v2}, Lq71;->υ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    sget-object v0, Lq71;->α:Lq71;

    .line 19
    .line 20
    const-string v0, "\u6587\u6848\u5df2\u590d\u5236"

    .line 21
    .line 22
    invoke-static {p0, v2, v0}, Lq71;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
