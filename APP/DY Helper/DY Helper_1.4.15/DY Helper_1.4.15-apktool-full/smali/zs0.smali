.class public final synthetic Lzs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:F

.field public final synthetic ζ:Lan;


# direct methods
.method public synthetic constructor <init>(FLan;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzs0;->ε:F

    .line 5
    .line 6
    iput-object p2, p0, Lzs0;->ζ:Lan;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lv80;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 p2, 0x31

    .line 9
    .line 10
    invoke-static {p2}, Lv81;->σ(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget v0, p0, Lzs0;->ε:F

    .line 15
    .line 16
    iget-object p0, p0, Lzs0;->ζ:Lan;

    .line 17
    .line 18
    invoke-static {v0, p0, p1, p2}, Ljx0;->ζ(FLan;Lv80;I)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ls62;->α:Ls62;

    .line 22
    .line 23
    return-object p0
.end method
