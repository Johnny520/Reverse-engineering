.class public final Lu40;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# static fields
.field public static final ζ:Lu40;

.field public static final η:Lu40;


# instance fields
.field public final synthetic ε:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lu40;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lu40;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu40;->ζ:Lu40;

    .line 9
    .line 10
    new-instance v0, Lu40;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lu40;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lu40;->η:Lu40;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lu40;->ε:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lu40;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lyp0;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p0, v0}, Lyp0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
