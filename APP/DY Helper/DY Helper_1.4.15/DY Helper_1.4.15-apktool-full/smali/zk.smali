.class public final synthetic Lzk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lbk;

.field public final synthetic η:Ljk;


# direct methods
.method public synthetic constructor <init>(Lbk;Ljk;I)V
    .locals 0

    .line 1
    iput p3, p0, Lzk;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lzk;->ζ:Lbk;

    .line 4
    .line 5
    iput-object p2, p0, Lzk;->η:Ljk;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lzk;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Lzk;->η:Ljk;

    .line 6
    .line 7
    iget-object p0, p0, Lzk;->ζ:Lbk;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lll;->α:Lll;

    .line 13
    .line 14
    invoke-static {p1, p0, v2}, Lll;->η(Ljava/lang/Object;Lbk;Ljk;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lll;->δ(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    sget-object v0, Lll;->α:Lll;

    .line 23
    .line 24
    invoke-static {p1, p0, v2}, Lll;->η(Ljava/lang/Object;Lbk;Ljk;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lll;->λ(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
