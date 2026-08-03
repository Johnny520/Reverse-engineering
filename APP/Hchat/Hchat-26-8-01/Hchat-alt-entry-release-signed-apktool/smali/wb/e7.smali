.class public final synthetic Lwb/e7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk9/j;

.field public final synthetic i:Lwb/q3;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lk9/j;Lwb/q3;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/e7;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/e7;->h:Lk9/j;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/e7;->i:Lwb/q3;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/e7;->j:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/e7;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/e7;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lwb/e7;->h:Lk9/j;

    .line 13
    .line 14
    iget-object p1, v1, Lk9/j;->f:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/e7;->i:Lwb/q3;

    .line 17
    .line 18
    iget-object v2, v0, Lwb/q3;->a:Lk9/j;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v2, Lk9/j;->f:Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    iget-object p1, v1, Lk9/j;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lwb/e7;->j:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v2, p1}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v7, 0x0

    .line 40
    const/16 v8, 0x5f

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static/range {v1 .. v8}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {v0, p1}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v0, p0, Lwb/e7;->k:Li0/a1;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    move-object v4, p1

    .line 63
    check-cast v4, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lwb/e7;->h:Lk9/j;

    .line 69
    .line 70
    iget-object p1, v0, Lk9/j;->e:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v8, p0, Lwb/e7;->i:Lwb/q3;

    .line 73
    .line 74
    iget-object v1, v8, Lwb/q3;->a:Lk9/j;

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    iget-object v1, v1, Lk9/j;->e:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    const/4 v1, 0x0

    .line 82
    :goto_2
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    iget-object p1, v0, Lk9/j;->e:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v1, p0, Lwb/e7;->j:Landroid/content/Context;

    .line 91
    .line 92
    invoke-static {v1, p1}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v6, 0x0

    .line 96
    const/16 v7, 0x6f

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v5, 0x0

    .line 102
    invoke-static/range {v0 .. v7}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v8, p1}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v0, p0, Lwb/e7;->k:Li0/a1;

    .line 111
    .line 112
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
