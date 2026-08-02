.class public final synthetic Lkk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lkf2;

.field public final synthetic i:Lj20;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lkf2;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkk2;->h:Lkf2;

    .line 5
    .line 6
    iput-object p2, p0, Lkk2;->i:Lj20;

    .line 7
    .line 8
    iput-object p3, p0, Lkk2;->j:Lxk1;

    .line 9
    .line 10
    iput-object p4, p0, Lkk2;->k:Lxk1;

    .line 11
    .line 12
    iput-object p5, p0, Lkk2;->l:Lxk1;

    .line 13
    .line 14
    iput-object p6, p0, Lkk2;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lkk2;->n:Landroid/content/Context;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lj31;

    .line 3
    .line 4
    iget-object p1, p0, Lkk2;->j:Lxk1;

    .line 5
    .line 6
    invoke-interface {p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lok2;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    iget-object v2, p0, Lkk2;->h:Lkf2;

    .line 20
    .line 21
    iget-object v4, p0, Lkk2;->k:Lxk1;

    .line 22
    .line 23
    iget-object v5, p0, Lkk2;->l:Lxk1;

    .line 24
    .line 25
    iget-object v6, p0, Lkk2;->m:Lxk1;

    .line 26
    .line 27
    iget-object v7, p0, Lkk2;->n:Landroid/content/Context;

    .line 28
    .line 29
    invoke-direct/range {v0 .. v8}, Lok2;-><init>(Ljava/lang/String;Lkf2;Lj31;Lxk1;Lxk1;Lxk1;Landroid/content/Context;Lt00;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x3

    .line 33
    iget-object p0, p0, Lkk2;->i:Lj20;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {p0, v1, v0, p1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 40
    .line 41
    return-object p0
.end method
