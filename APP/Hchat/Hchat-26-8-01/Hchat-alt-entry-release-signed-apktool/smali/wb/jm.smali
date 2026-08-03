.class public final synthetic Lwb/jm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/jm;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/jm;->h:Lfg/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/jm;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const-string p1, "\u6682\u65e0\u5a31\u4e50\u529f\u80fd"

    .line 37
    .line 38
    const/16 p3, 0x36

    .line 39
    .line 40
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 41
    .line 42
    iget-object v1, p0, Lwb/jm;->h:Lfg/l;

    .line 43
    .line 44
    invoke-static {v0, p1, v1, p2, p3}, Lwb/ho;->H0(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    const/16 v0, 0x10

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    if-eq p1, v0, :cond_2

    .line 58
    .line 59
    move p1, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    :goto_2
    and-int/2addr p3, v1

    .line 63
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    const-string p1, "\u6682\u65e0\u5b9e\u7528\u529f\u80fd"

    .line 70
    .line 71
    const/16 p3, 0x36

    .line 72
    .line 73
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 74
    .line 75
    iget-object v1, p0, Lwb/jm;->h:Lfg/l;

    .line 76
    .line 77
    invoke-static {v0, p1, v1, p2, p3}, Lwb/ho;->H0(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 82
    .line 83
    .line 84
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
