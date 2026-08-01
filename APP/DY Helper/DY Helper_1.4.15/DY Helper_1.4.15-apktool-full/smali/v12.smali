.class public final synthetic Lv12;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lx3;


# direct methods
.method public synthetic constructor <init>(Lx3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv12;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lv12;->ζ:Lx3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lv12;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lv12;->ζ:Lx3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lx3;->κ:Z

    .line 10
    .line 11
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lx3;->κ:Z

    .line 16
    .line 17
    goto :goto_0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
