.class public final synthetic Lwb/h6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/j1;


# direct methods
.method public synthetic constructor <init>(Li0/j1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/h6;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/h6;->h:Li0/j1;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/h6;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/h6;->h:Li0/j1;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lwb/h6;->h:Li0/j1;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_1
    check-cast p1, Leb/c0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lwb/h6;->h:Li0/j1;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_2
    check-cast p1, Lwb/c3;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, Lwb/t2;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lwb/t2;-><init>(Lwb/c3;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lwb/h6;->h:Li0/j1;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_3
    check-cast p1, Lvb/a;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Lwb/s2;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, p1, v1, v2}, Lwb/s2;-><init>(Lvb/a;Lwb/c3;I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lwb/h6;->h:Li0/j1;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_4
    check-cast p1, Leb/c0;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lwb/h6;->h:Li0/j1;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_5
    check-cast p1, Lwb/t4;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lwb/h6;->h:Li0/j1;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
