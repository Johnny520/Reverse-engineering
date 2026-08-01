.class public final Lw41;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ld51;


# direct methods
.method public synthetic constructor <init>(Ld51;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw41;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lw41;->ζ:Ld51;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lw41;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lj8;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lw41;->ζ:Ld51;

    .line 12
    .line 13
    iget-object p0, p0, Ld51;->β:Lw6;

    .line 14
    .line 15
    invoke-virtual {p0}, Lw6;->α()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v0, p1

    .line 34
    check-cast v0, Lu60;

    .line 35
    .line 36
    iget-boolean v0, v0, Lu60;->α:Z

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    check-cast p1, Lu60;

    .line 43
    .line 44
    sget-object p0, Ls62;->α:Ls62;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    check-cast p1, Lj8;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lw41;->ζ:Ld51;

    .line 53
    .line 54
    iget-object p1, p0, Ld51;->β:Lw6;

    .line 55
    .line 56
    invoke-virtual {p1}, Lw6;->α()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v1, v0

    .line 75
    check-cast v1, Lu60;

    .line 76
    .line 77
    iget-boolean v1, v1, Lu60;->α:Z

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/4 v0, 0x0

    .line 83
    :goto_1
    check-cast v0, Lu60;

    .line 84
    .line 85
    iput-object v0, p0, Ld51;->γ:Lu60;

    .line 86
    .line 87
    sget-object p0, Ls62;->α:Ls62;

    .line 88
    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
