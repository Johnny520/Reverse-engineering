.class public final synthetic Lwb/lh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/lh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/lh;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/lh;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/lh;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/lh;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/lh;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lwb/lh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/lh;->k:Li0/a1;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/lh;->l:Li0/a1;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/lh;->h:Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/lh;->i:Li0/a1;

    .line 13
    .line 14
    iget-object v4, p0, Lwb/lh;->j:Li0/a1;

    .line 15
    .line 16
    invoke-static {v2, v3, v4, v0, v1}, Lwb/ho;->S1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lwb/lh;->k:Li0/a1;

    .line 23
    .line 24
    iget-object v1, p0, Lwb/lh;->l:Li0/a1;

    .line 25
    .line 26
    iget-object v2, p0, Lwb/lh;->h:Ljava/util/List;

    .line 27
    .line 28
    iget-object v3, p0, Lwb/lh;->i:Li0/a1;

    .line 29
    .line 30
    iget-object v4, p0, Lwb/lh;->j:Li0/a1;

    .line 31
    .line 32
    invoke-static {v2, v3, v4, v0, v1}, Lwb/ho;->Y1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
