.class public final synthetic Lwb/hk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Le9/c;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Le9/c;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/hk;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/hk;->h:Le9/c;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/hk;->i:Li0/a1;

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
    .locals 6

    .line 1
    iget v0, p0, Lwb/hk;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lwb/p2;

    .line 12
    .line 13
    iget-object v1, p0, Lwb/hk;->h:Le9/c;

    .line 14
    .line 15
    iget-object v1, v1, Le9/c;->b:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v2, Lwb/d4;

    .line 18
    .line 19
    invoke-static {v1, p1}, Lwb/ho;->k6(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v3, Lw0/l;

    .line 24
    .line 25
    const/16 v4, 0x9

    .line 26
    .line 27
    invoke-direct {v3, v4}, Lw0/l;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const-string v5, "\u5c4f\u853d\u6210\u5458\u901a\u77e5"

    .line 32
    .line 33
    invoke-direct {v2, v5, p1, v3, v4}, Lwb/d4;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;Ljava/util/LinkedHashSet;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lwb/p2;-><init>(Ljava/lang/String;Lwb/d4;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lwb/hk;->i:Li0/a1;

    .line 40
    .line 41
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, Lwb/p2;

    .line 51
    .line 52
    iget-object v1, p0, Lwb/hk;->h:Le9/c;

    .line 53
    .line 54
    iget-object v1, v1, Le9/c;->b:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v2, Lwb/d4;

    .line 57
    .line 58
    invoke-static {v1, p1}, Lwb/ho;->k6(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v3, Lwb/jk;

    .line 63
    .line 64
    const/16 v4, 0x16

    .line 65
    .line 66
    invoke-direct {v3, v4}, Lwb/jk;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const-string v5, "\u4ec5\u663e\u793a\u6210\u5458\u901a\u77e5"

    .line 71
    .line 72
    invoke-direct {v2, v5, p1, v3, v4}, Lwb/d4;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;Ljava/util/LinkedHashSet;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v1, v2}, Lwb/p2;-><init>(Ljava/lang/String;Lwb/d4;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lwb/hk;->i:Li0/a1;

    .line 79
    .line 80
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
