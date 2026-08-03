.class public final synthetic Lw/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw/g;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/g;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lw/g;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lw/g;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lw/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw/g;->i:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Lwb/y2;->H1(Ljava/lang/String;)Lsf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lw/g;->j:Li0/a1;

    .line 24
    .line 25
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/CharSequence;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    move-object v0, p1

    .line 48
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, p1}, Lwb/y2;->I1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1, v0}, Lwb/y2;->I1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    iget-object v0, p0, Lw/g;->h:Lfg/l;

    .line 64
    .line 65
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    check-cast p1, Ln2/s;

    .line 72
    .line 73
    iget-object v0, p0, Lw/g;->i:Li0/a1;

    .line 74
    .line 75
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lw/g;->j:Li0/a1;

    .line 79
    .line 80
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, p1, Ln2/s;->a:Li2/g;

    .line 87
    .line 88
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    iget-object p1, p1, Ln2/s;->a:Li2/g;

    .line 95
    .line 96
    iget-object v2, p1, Li2/g;->h:Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v0, p0, Lw/g;->h:Lfg/l;

    .line 106
    .line 107
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
