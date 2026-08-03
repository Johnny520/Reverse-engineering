.class public final synthetic Lqb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lqb/k;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:Lb/e;


# direct methods
.method public synthetic constructor <init>(Lqb/k;Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;I)V
    .locals 0

    .line 1
    iput p5, p0, Lqb/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lqb/b;->h:Lqb/k;

    .line 4
    .line 5
    iput-object p2, p0, Lqb/b;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lqb/b;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p4, p0, Lqb/b;->k:Lb/e;

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
    .locals 7

    .line 1
    iget v0, p0, Lqb/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x1

    .line 13
    iget-object v1, p0, Lqb/b;->h:Lqb/k;

    .line 14
    .line 15
    iget-object v2, p0, Lqb/b;->i:Landroid/app/Activity;

    .line 16
    .line 17
    iget-object v3, p0, Lqb/b;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v5, p0, Lqb/b;->k:Lb/e;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 25
    .line 26
    invoke-virtual/range {v1 .. v6}, Lqb/k;->w(Landroid/app/Activity;Ljava/util/ArrayList;ZLb/e;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Lqb/b;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v4, v3

    .line 34
    move-object v3, v2

    .line 35
    move-object v2, v1

    .line 36
    move-object v1, p1

    .line 37
    invoke-direct/range {v1 .. v6}, Lqb/b;-><init>(Lqb/k;Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3, v4, v5, v1}, Lqb/k;->I(Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;Lqb/b;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_0
    move-object v5, p1

    .line 47
    check-cast v5, Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    iget-object v0, p0, Lqb/b;->h:Lqb/k;

    .line 54
    .line 55
    iget-object v1, p0, Lqb/b;->i:Landroid/app/Activity;

    .line 56
    .line 57
    iget-object v2, p0, Lqb/b;->j:Ljava/util/ArrayList;

    .line 58
    .line 59
    iget-object v4, p0, Lqb/b;->k:Lb/e;

    .line 60
    .line 61
    invoke-virtual/range {v0 .. v5}, Lqb/k;->w(Landroid/app/Activity;Ljava/util/ArrayList;ZLb/e;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
