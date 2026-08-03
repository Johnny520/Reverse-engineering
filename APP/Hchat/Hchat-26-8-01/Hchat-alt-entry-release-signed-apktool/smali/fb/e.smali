.class public final synthetic Lfb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfb/q1;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:Lwb/qb;

.field public final synthetic l:Lgg/u;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lgg/u;


# direct methods
.method public synthetic constructor <init>(Lfb/q1;Ljava/lang/Object;Ljava/util/ArrayList;Lwb/qb;Lgg/u;Ljava/lang/String;Lgg/u;I)V
    .locals 0

    .line 1
    iput p8, p0, Lfb/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lfb/e;->h:Lfb/q1;

    .line 4
    .line 5
    iput-object p2, p0, Lfb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lfb/e;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p4, p0, Lfb/e;->k:Lwb/qb;

    .line 10
    .line 11
    iput-object p5, p0, Lfb/e;->l:Lgg/u;

    .line 12
    .line 13
    iput-object p6, p0, Lfb/e;->m:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p7, p0, Lfb/e;->n:Lgg/u;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lfb/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lfb/e;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, Lfb/e;->j:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v3, p0, Lfb/e;->k:Lwb/qb;

    .line 17
    .line 18
    iget-object v4, p0, Lfb/e;->l:Lgg/u;

    .line 19
    .line 20
    iget-object v5, p0, Lfb/e;->m:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, p0, Lfb/e;->n:Lgg/u;

    .line 23
    .line 24
    iget-object v7, p0, Lfb/e;->h:Lfb/q1;

    .line 25
    .line 26
    invoke-static/range {v1 .. v8}, Lfb/u;->Q(Ljava/lang/Object;Ljava/util/ArrayList;Lwb/qb;Lgg/u;Ljava/lang/String;Lgg/u;Lfb/q1;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    move-object v7, p1

    .line 33
    check-cast v7, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lfb/e;->i:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v1, p0, Lfb/e;->j:Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v2, p0, Lfb/e;->k:Lwb/qb;

    .line 43
    .line 44
    iget-object v3, p0, Lfb/e;->l:Lgg/u;

    .line 45
    .line 46
    iget-object v4, p0, Lfb/e;->m:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, p0, Lfb/e;->n:Lgg/u;

    .line 49
    .line 50
    iget-object v6, p0, Lfb/e;->h:Lfb/q1;

    .line 51
    .line 52
    invoke-static/range {v0 .. v7}, Lfb/u;->Q(Ljava/lang/Object;Ljava/util/ArrayList;Lwb/qb;Lgg/u;Ljava/lang/String;Lgg/u;Lfb/q1;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
