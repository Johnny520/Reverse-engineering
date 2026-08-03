.class public final synthetic Lwb/ul;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;Lfg/a;II)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/ul;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ul;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ul;->i:Lfg/l;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ul;->j:Lfg/a;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/ul;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, Lwb/ul;->h:Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, p0, Lwb/ul;->i:Lfg/l;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/ul;->j:Lfg/a;

    .line 23
    .line 24
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->v3(Ljava/util/List;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    const/4 p2, 0x1

    .line 31
    invoke-static {p2}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, Lwb/ul;->h:Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, p0, Lwb/ul;->i:Lfg/l;

    .line 38
    .line 39
    iget-object v2, p0, Lwb/ul;->j:Lfg/a;

    .line 40
    .line 41
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->v3(Ljava/util/List;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
