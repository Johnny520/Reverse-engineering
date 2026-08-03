.class public final synthetic Lqb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lqb/k;

.field public final synthetic i:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lqb/k;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqb/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lqb/c;->h:Lqb/k;

    .line 4
    .line 5
    iput-object p2, p0, Lqb/c;->i:Landroid/app/Activity;

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
    .locals 2

    .line 1
    iget v0, p0, Lqb/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqb/c;->i:Landroid/app/Activity;

    .line 7
    .line 8
    iget-object v1, p0, Lqb/c;->h:Lqb/k;

    .line 9
    .line 10
    iget-object v1, v1, Lqb/k;->l:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lqb/c;->i:Landroid/app/Activity;

    .line 19
    .line 20
    iget-object v1, p0, Lqb/c;->h:Lqb/k;

    .line 21
    .line 22
    iget-object v1, v1, Lqb/k;->l:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
