.class public final synthetic Lwb/mk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/q3;

.field public final synthetic i:Lk9/j;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/q3;Lk9/j;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/mk;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/mk;->h:Lwb/q3;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/mk;->i:Lk9/j;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/mk;->j:Li0/a1;

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
    .locals 9

    .line 1
    iget v0, p0, Lwb/mk;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x77

    .line 14
    .line 15
    iget-object v1, p0, Lwb/mk;->i:Lk9/j;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-static/range {v1 .. v8}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lwb/mk;->h:Lwb/q3;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lwb/mk;->j:Li0/a1;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    move-object v2, p1

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string p1, "activity"

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object v0, p0, Lwb/mk;->i:Lk9/j;

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    iget-object p1, v0, Lk9/j;->d:Ljava/lang/String;

    .line 56
    .line 57
    :goto_1
    move-object v3, p1

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    const-string p1, ""

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    const/4 v6, 0x0

    .line 63
    const/16 v7, 0x73

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-static/range {v0 .. v7}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v0, p0, Lwb/mk;->h:Lwb/q3;

    .line 73
    .line 74
    invoke-static {v0, p1}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, p0, Lwb/mk;->j:Li0/a1;

    .line 79
    .line 80
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_1
    move-object v1, p1

    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    const/16 v7, 0x7d

    .line 92
    .line 93
    iget-object v0, p0, Lwb/mk;->i:Lk9/j;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-static/range {v0 .. v7}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object v0, p0, Lwb/mk;->h:Lwb/q3;

    .line 104
    .line 105
    invoke-static {v0, p1}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object v0, p0, Lwb/mk;->j:Li0/a1;

    .line 110
    .line 111
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
