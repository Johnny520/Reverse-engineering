.class public final synthetic Lwb/vm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lfg/a;Lfg/p;Lfg/a;Lfg/l;II)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/vm;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/vm;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/vm;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/vm;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/vm;->k:Lfg/p;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/vm;->l:Lfg/a;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/vm;->m:Lfg/l;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/vm;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x6d81

    .line 15
    .line 16
    invoke-static {p1}, Li0/r;->C(I)I

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    iget-object v1, p0, Lwb/vm;->h:Ljava/util/List;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/vm;->i:Ljava/util/List;

    .line 23
    .line 24
    iget-object v3, p0, Lwb/vm;->j:Lfg/a;

    .line 25
    .line 26
    iget-object v4, p0, Lwb/vm;->k:Lfg/p;

    .line 27
    .line 28
    iget-object v5, p0, Lwb/vm;->l:Lfg/a;

    .line 29
    .line 30
    iget-object v6, p0, Lwb/vm;->m:Lfg/l;

    .line 31
    .line 32
    invoke-static/range {v1 .. v8}, Lwb/ho;->U2(Ljava/util/List;Ljava/util/List;Lfg/a;Lfg/p;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_0
    move-object v6, p1

    .line 39
    check-cast v6, Li0/h0;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/16 p1, 0xd81

    .line 47
    .line 48
    invoke-static {p1}, Li0/r;->C(I)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    iget-object v0, p0, Lwb/vm;->h:Ljava/util/List;

    .line 53
    .line 54
    iget-object v1, p0, Lwb/vm;->i:Ljava/util/List;

    .line 55
    .line 56
    iget-object v2, p0, Lwb/vm;->j:Lfg/a;

    .line 57
    .line 58
    iget-object v3, p0, Lwb/vm;->k:Lfg/p;

    .line 59
    .line 60
    iget-object v4, p0, Lwb/vm;->l:Lfg/a;

    .line 61
    .line 62
    iget-object v5, p0, Lwb/vm;->m:Lfg/l;

    .line 63
    .line 64
    invoke-static/range {v0 .. v7}, Lwb/ho;->a4(Ljava/util/List;Ljava/util/List;Lfg/a;Lfg/p;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
