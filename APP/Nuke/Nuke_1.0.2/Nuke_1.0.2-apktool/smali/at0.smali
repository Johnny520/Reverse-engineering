.class public final synthetic Lat0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Llp1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lnuke/ui/HomeActivity;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Z

.field public final synthetic n:Ljava/util/Map;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lxk1;


# direct methods
.method public synthetic constructor <init>(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lat0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lat0;->i:Llp1;

    .line 8
    .line 9
    iput-object p2, p0, Lat0;->j:Lxk1;

    .line 10
    .line 11
    iput-object p3, p0, Lat0;->k:Lnuke/ui/HomeActivity;

    .line 12
    .line 13
    iput-object p4, p0, Lat0;->l:Lxk1;

    .line 14
    .line 15
    iput-boolean p5, p0, Lat0;->m:Z

    .line 16
    .line 17
    iput-object p6, p0, Lat0;->n:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p7, p0, Lat0;->o:Lxk1;

    .line 20
    .line 21
    iput-object p8, p0, Lat0;->p:Lxk1;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(ZLlp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;Ljava/util/Map;Lxk1;Lxk1;)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lat0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lat0;->m:Z

    iput-object p2, p0, Lat0;->i:Llp1;

    iput-object p3, p0, Lat0;->j:Lxk1;

    iput-object p4, p0, Lat0;->k:Lnuke/ui/HomeActivity;

    iput-object p5, p0, Lat0;->l:Lxk1;

    iput-object p6, p0, Lat0;->n:Ljava/util/Map;

    iput-object p7, p0, Lat0;->o:Lxk1;

    iput-object p8, p0, Lat0;->p:Lxk1;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lat0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v9, p1

    .line 7
    check-cast v9, Lpx;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    iget-object v1, p0, Lat0;->i:Llp1;

    .line 16
    .line 17
    iget-object v2, p0, Lat0;->j:Lxk1;

    .line 18
    .line 19
    iget-object v3, p0, Lat0;->k:Lnuke/ui/HomeActivity;

    .line 20
    .line 21
    iget-object v4, p0, Lat0;->l:Lxk1;

    .line 22
    .line 23
    iget-boolean v5, p0, Lat0;->m:Z

    .line 24
    .line 25
    iget-object v6, p0, Lat0;->n:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v7, p0, Lat0;->o:Lxk1;

    .line 28
    .line 29
    iget-object v8, p0, Lat0;->p:Lxk1;

    .line 30
    .line 31
    invoke-static/range {v1 .. v10}, Lnuke/ui/HomeActivity;->f(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v8, p1

    .line 37
    check-cast v8, Lpx;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    iget-object v0, p0, Lat0;->i:Llp1;

    .line 46
    .line 47
    iget-object v1, p0, Lat0;->j:Lxk1;

    .line 48
    .line 49
    iget-object v2, p0, Lat0;->k:Lnuke/ui/HomeActivity;

    .line 50
    .line 51
    iget-object v3, p0, Lat0;->l:Lxk1;

    .line 52
    .line 53
    iget-boolean v4, p0, Lat0;->m:Z

    .line 54
    .line 55
    iget-object v5, p0, Lat0;->n:Ljava/util/Map;

    .line 56
    .line 57
    iget-object v6, p0, Lat0;->o:Lxk1;

    .line 58
    .line 59
    iget-object v7, p0, Lat0;->p:Lxk1;

    .line 60
    .line 61
    invoke-static/range {v0 .. v9}, Lnuke/ui/HomeActivity;->o(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
