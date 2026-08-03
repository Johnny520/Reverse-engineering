.class public final synthetic Lwb/hs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/y2;

.field public final synthetic i:Lfb/c;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Lfb/c;II)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/hs;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/hs;->h:Lwb/y2;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/hs;->i:Lfb/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/hs;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x31

    .line 14
    .line 15
    invoke-static {p2}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, Lwb/hs;->h:Lwb/y2;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/hs;->i:Lfb/c;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->q0(Lfb/c;Li0/h0;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    const/16 p2, 0x31

    .line 30
    .line 31
    invoke-static {p2}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, Lwb/hs;->h:Lwb/y2;

    .line 36
    .line 37
    iget-object v1, p0, Lwb/hs;->i:Lfb/c;

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->q0(Lfb/c;Li0/h0;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_1
    const/16 p2, 0x31

    .line 44
    .line 45
    invoke-static {p2}, Li0/r;->C(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    iget-object v0, p0, Lwb/hs;->h:Lwb/y2;

    .line 50
    .line 51
    iget-object v1, p0, Lwb/hs;->i:Lfb/c;

    .line 52
    .line 53
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->n0(Lfb/c;Li0/h0;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_2
    const/16 p2, 0x31

    .line 58
    .line 59
    invoke-static {p2}, Li0/r;->C(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iget-object v0, p0, Lwb/hs;->h:Lwb/y2;

    .line 64
    .line 65
    iget-object v1, p0, Lwb/hs;->i:Lfb/c;

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->n0(Lfb/c;Li0/h0;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
