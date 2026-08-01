.class public final synthetic Lyk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldk;


# direct methods
.method public synthetic constructor <init>(Ldk;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyk;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lyk;->ζ:Ldk;

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
    iget v0, p0, Lyk;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object p0, p0, Lyk;->ζ:Ldk;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lll;->α:Lll;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lll;->ι(Ljava/lang/Object;Ldk;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lll;->δ(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    sget-object v0, Lll;->α:Lll;

    .line 21
    .line 22
    invoke-static {p1, p0}, Lll;->ι(Ljava/lang/Object;Ldk;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lll;->λ(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
