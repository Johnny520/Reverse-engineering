.class public final synthetic Lwb/b1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/b1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/b1;->h:Lwb/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/b1;->i:Li0/a1;

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
    .locals 14

    .line 1
    iget v0, p0, Lwb/b1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc9/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lwb/z0;

    .line 12
    .line 13
    iget-object v1, p0, Lwb/b1;->h:Lwb/a1;

    .line 14
    .line 15
    check-cast v1, Lwb/x0;

    .line 16
    .line 17
    iget-boolean v1, v1, Lwb/x0;->b:Z

    .line 18
    .line 19
    invoke-direct {v0, p1, v1}, Lwb/z0;-><init>(Lc9/a;Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lwb/b1;->i:Li0/a1;

    .line 23
    .line 24
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    move-object v3, p1

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    new-instance p1, Lwb/x0;

    .line 34
    .line 35
    iget-object v0, p0, Lwb/b1;->h:Lwb/a1;

    .line 36
    .line 37
    move-object v13, v0

    .line 38
    check-cast v13, Lwb/z0;

    .line 39
    .line 40
    iget-object v0, v13, Lwb/z0;->a:Lc9/a;

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    const/16 v12, 0xffb

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    invoke-static/range {v0 .. v12}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-boolean v1, v13, Lwb/z0;->b:Z

    .line 59
    .line 60
    invoke-direct {p1, v0, v1}, Lwb/x0;-><init>(Lc9/a;Z)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lwb/b1;->i:Li0/a1;

    .line 64
    .line 65
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_1
    move-object v5, p1

    .line 70
    check-cast v5, Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance p1, Lwb/x0;

    .line 76
    .line 77
    iget-object v0, p0, Lwb/b1;->h:Lwb/a1;

    .line 78
    .line 79
    move-object v13, v0

    .line 80
    check-cast v13, Lwb/w0;

    .line 81
    .line 82
    iget-object v0, v13, Lwb/w0;->a:Lc9/a;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    const/16 v12, 0xfef

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    const/4 v3, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    invoke-static/range {v0 .. v12}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-boolean v1, v13, Lwb/w0;->b:Z

    .line 101
    .line 102
    invoke-direct {p1, v0, v1}, Lwb/x0;-><init>(Lc9/a;Z)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lwb/b1;->i:Li0/a1;

    .line 106
    .line 107
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_2
    check-cast p1, Lc9/a;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, Lwb/w0;

    .line 117
    .line 118
    iget-object v1, p0, Lwb/b1;->h:Lwb/a1;

    .line 119
    .line 120
    check-cast v1, Lwb/x0;

    .line 121
    .line 122
    iget-boolean v1, v1, Lwb/x0;->b:Z

    .line 123
    .line 124
    invoke-direct {v0, p1, v1}, Lwb/w0;-><init>(Lc9/a;Z)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lwb/b1;->i:Li0/a1;

    .line 128
    .line 129
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
