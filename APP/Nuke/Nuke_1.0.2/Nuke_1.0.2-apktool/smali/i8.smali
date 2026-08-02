.class public final Li8;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Lun0;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lun0;


# direct methods
.method public synthetic constructor <init>(Lun0;Ljava/lang/Object;Lun0;II)V
    .locals 0

    .line 1
    iput p5, p0, Li8;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Li8;->k:Lun0;

    .line 4
    .line 5
    iput-object p2, p0, Li8;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Li8;->m:Lun0;

    .line 8
    .line 9
    iput p4, p0, Li8;->j:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Li8;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget v2, p0, Li8;->j:I

    .line 6
    .line 7
    iget-object v3, p0, Li8;->m:Lun0;

    .line 8
    .line 9
    iget-object v4, p0, Li8;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Li8;->k:Lun0;

    .line 12
    .line 13
    check-cast p1, Lpx;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast p0, Lin0;

    .line 24
    .line 25
    check-cast v4, Luh1;

    .line 26
    .line 27
    check-cast v3, Lin0;

    .line 28
    .line 29
    or-int/lit8 p2, v2, 0x1

    .line 30
    .line 31
    invoke-static {p2}, Lpp0;->N(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p0, v4, v3, p1, p2}, Lpp0;->a(Lin0;Luh1;Lin0;Lpx;I)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    check-cast p0, Lxm0;

    .line 40
    .line 41
    check-cast v4, Ln80;

    .line 42
    .line 43
    check-cast v3, Lkw;

    .line 44
    .line 45
    or-int/lit8 p2, v2, 0x1

    .line 46
    .line 47
    invoke-static {p2}, Lpp0;->N(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {p0, v4, v3, p1, p2}, Lte;->f(Lxm0;Ln80;Lkw;Lpx;I)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
