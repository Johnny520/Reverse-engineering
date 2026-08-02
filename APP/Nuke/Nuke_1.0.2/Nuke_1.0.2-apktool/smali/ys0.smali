.class public final synthetic Lys0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lnuke/ui/HomeActivity;

.field public final synthetic i:Lxk1;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/util/Map;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lys0;->h:Lnuke/ui/HomeActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lys0;->i:Lxk1;

    .line 7
    .line 8
    iput-boolean p3, p0, Lys0;->j:Z

    .line 9
    .line 10
    iput-object p4, p0, Lys0;->k:Ljava/util/Map;

    .line 11
    .line 12
    iput-object p5, p0, Lys0;->l:Lxk1;

    .line 13
    .line 14
    iput-object p6, p0, Lys0;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lys0;->n:Lxk1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v8

    .line 10
    iget-object v0, p0, Lys0;->h:Lnuke/ui/HomeActivity;

    .line 11
    .line 12
    iget-object v1, p0, Lys0;->i:Lxk1;

    .line 13
    .line 14
    iget-boolean v2, p0, Lys0;->j:Z

    .line 15
    .line 16
    iget-object v3, p0, Lys0;->k:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v4, p0, Lys0;->l:Lxk1;

    .line 19
    .line 20
    iget-object v5, p0, Lys0;->m:Lxk1;

    .line 21
    .line 22
    iget-object v6, p0, Lys0;->n:Lxk1;

    .line 23
    .line 24
    invoke-static/range {v0 .. v8}, Lnuke/ui/HomeActivity;->n(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;Lpx;I)La83;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
