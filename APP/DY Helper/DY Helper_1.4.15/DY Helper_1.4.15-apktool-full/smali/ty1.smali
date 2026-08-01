.class public final synthetic Lty1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcu1;


# direct methods
.method public synthetic constructor <init>(Lcu1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lty1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lty1;->ζ:Lcu1;

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
    iget v0, p0, Lty1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lty1;->ζ:Lcu1;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object p0, p0, Lty1;->ζ:Lcu1;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    sget-object v0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lty1;->ζ:Lcu1;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
