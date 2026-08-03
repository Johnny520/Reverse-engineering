.class public final synthetic Lia/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lia/h;

.field public final synthetic i:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Lia/h;Ljava/util/HashSet;I)V
    .locals 0

    .line 1
    iput p3, p0, Lia/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lia/e;->h:Lia/h;

    .line 4
    .line 5
    iput-object p2, p0, Lia/e;->i:Ljava/util/HashSet;

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
    .locals 5

    .line 1
    iget v0, p0, Lia/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-static {v0, p1}, La7/a;->z(ILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lia/e;->h:Lia/h;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lia/e;->i:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lia/h;->c(Ljava/lang/Object;Ljava/util/HashSet;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {v0, p1}, La7/a;->z(ILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_6

    .line 47
    .line 48
    iget-object v1, p0, Lia/e;->h:Lia/h;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lia/e;->i:Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x0

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    :cond_2
    :goto_2
    move p1, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-static {p1}, La7/a;->O(Ljava/lang/Object;)Lia/v;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    iget v2, p1, Lia/v;->b:I

    .line 71
    .line 72
    if-eq v2, v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    new-instance v2, Lia/g;

    .line 76
    .line 77
    iget v4, p1, Lia/v;->c:I

    .line 78
    .line 79
    iget-object p1, p1, Lia/v;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v2, v4, p1}, Lia/g;-><init>(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :goto_3
    if-eqz p1, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move v0, v3

    .line 92
    :cond_6
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
