.class public final synthetic Lsh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lch;

.field public final synthetic j:Lxm0;

.field public final synthetic k:Lin0;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lch;Lxm0;Lin0;II)V
    .locals 0

    .line 1
    iput p5, p0, Lsh;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lsh;->i:Lch;

    .line 4
    .line 5
    iput-object p2, p0, Lsh;->j:Lxm0;

    .line 6
    .line 7
    iput-object p3, p0, Lsh;->k:Lin0;

    .line 8
    .line 9
    iput p4, p0, Lsh;->l:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lsh;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget v2, p0, Lsh;->l:I

    .line 6
    .line 7
    iget-object v3, p0, Lsh;->k:Lin0;

    .line 8
    .line 9
    iget-object v4, p0, Lsh;->j:Lxm0;

    .line 10
    .line 11
    iget-object p0, p0, Lsh;->i:Lch;

    .line 12
    .line 13
    check-cast p1, Lpx;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    or-int/lit8 p2, v2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, Lpp0;->N(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p0, v4, v3, p1, p2}, Ls11;->b(Lch;Lxm0;Lin0;Lpx;I)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    or-int/lit8 p2, v2, 0x1

    .line 34
    .line 35
    invoke-static {p2}, Lpp0;->N(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, v4, v3, p1, p2}, Ls11;->b(Lch;Lxm0;Lin0;Lpx;I)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
