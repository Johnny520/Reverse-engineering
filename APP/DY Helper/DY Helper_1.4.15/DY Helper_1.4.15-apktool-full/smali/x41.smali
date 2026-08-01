.class public final Lx41;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ld51;


# direct methods
.method public synthetic constructor <init>(Ld51;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx41;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lx41;->ζ:Ld51;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lx41;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lx41;->ζ:Ld51;

    .line 7
    .line 8
    invoke-virtual {p0}, Ld51;->α()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object p0, p0, Lx41;->ζ:Ld51;

    .line 15
    .line 16
    iget-object v0, p0, Ld51;->β:Lw6;

    .line 17
    .line 18
    invoke-virtual {v0}, Lw6;->α()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, Lu60;

    .line 39
    .line 40
    iget-boolean v3, v3, Lu60;->α:Z

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v1, v2

    .line 46
    :goto_0
    check-cast v1, Lu60;

    .line 47
    .line 48
    iput-object v2, p0, Ld51;->γ:Lu60;

    .line 49
    .line 50
    sget-object p0, Ls62;->α:Ls62;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    iget-object p0, p0, Lx41;->ζ:Ld51;

    .line 54
    .line 55
    invoke-virtual {p0}, Ld51;->α()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Ls62;->α:Ls62;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
