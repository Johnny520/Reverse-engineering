.class public final synthetic Lwb/lj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lx8/s;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lx8/s;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/lj;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/lj;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/lj;->i:Lx8/s;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/lj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/16 v7, 0x1b

    .line 8
    .line 9
    iget-object v1, p0, Lwb/lj;->i:Lx8/s;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, ""

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    invoke-static/range {v1 .. v7}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lwb/lj;->h:Lfg/l;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    const/4 v6, 0x0

    .line 29
    const/16 v7, 0x1b

    .line 30
    .line 31
    iget-object v1, p0, Lwb/lj;->i:Lx8/s;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const-string v3, ""

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    invoke-static/range {v1 .. v7}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lwb/lj;->h:Lfg/l;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    const/4 v6, 0x0

    .line 49
    const/16 v7, 0x1b

    .line 50
    .line 51
    iget-object v1, p0, Lwb/lj;->i:Lx8/s;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const-string v3, ""

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    invoke-static/range {v1 .. v7}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lwb/lj;->h:Lfg/l;

    .line 63
    .line 64
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
