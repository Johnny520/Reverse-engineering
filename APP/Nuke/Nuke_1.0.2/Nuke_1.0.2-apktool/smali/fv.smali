.class public final synthetic Lfv;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lb03;

.field public final synthetic j:Lkw;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lb03;Lkw;II)V
    .locals 0

    .line 1
    iput p4, p0, Lfv;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lfv;->i:Lb03;

    .line 4
    .line 5
    iput-object p2, p0, Lfv;->j:Lkw;

    .line 6
    .line 7
    iput p3, p0, Lfv;->k:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lfv;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget v2, p0, Lfv;->k:I

    .line 6
    .line 7
    iget-object v3, p0, Lfv;->j:Lkw;

    .line 8
    .line 9
    iget-object p0, p0, Lfv;->i:Lb03;

    .line 10
    .line 11
    check-cast p1, Lpx;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    or-int/lit8 p2, v2, 0x1

    .line 22
    .line 23
    invoke-static {p2}, Lpp0;->N(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p0, v3, p1, p2}, Ls11;->f(Lb03;Lkw;Lpx;I)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    or-int/lit8 p2, v2, 0x1

    .line 32
    .line 33
    invoke-static {p2}, Lpp0;->N(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p0, v3, p1, p2}, Lt11;->b(Lb03;Lkw;Lpx;I)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
