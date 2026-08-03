.class public final Lv1/g1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly0/o;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ly0/o;Lsf/b;II)V
    .locals 0

    .line 1
    iput p5, p0, Lv1/g1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lv1/g1;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lv1/g1;->h:Ly0/o;

    .line 6
    .line 7
    iput-object p3, p0, Lv1/g1;->k:Lsf/b;

    .line 8
    .line 9
    iput p4, p0, Lv1/g1;->i:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lv1/g1;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lv1/g1;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lfg/l;

    .line 16
    .line 17
    iget-object v0, p0, Lv1/g1;->k:Lsf/b;

    .line 18
    .line 19
    check-cast v0, Lfg/l;

    .line 20
    .line 21
    iget v1, p0, Lv1/g1;->i:I

    .line 22
    .line 23
    or-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    invoke-static {v1}, Li0/r;->C(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Lv1/g1;->h:Ly0/o;

    .line 30
    .line 31
    invoke-static {p2, v2, v0, p1, v1}, Lx2/i;->a(Lfg/l;Ly0/o;Lfg/l;Li0/h0;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    iget-object p2, p0, Lv1/g1;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lv1/j1;

    .line 40
    .line 41
    iget-object v0, p0, Lv1/g1;->k:Lsf/b;

    .line 42
    .line 43
    check-cast v0, Lfg/p;

    .line 44
    .line 45
    iget v1, p0, Lv1/g1;->i:I

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    invoke-static {v1}, Li0/r;->C(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object v2, p0, Lv1/g1;->h:Ly0/o;

    .line 54
    .line 55
    invoke-static {p2, v2, v0, p1, v1}, Lv1/w;->a(Lv1/j1;Ly0/o;Lfg/p;Li0/h0;I)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
