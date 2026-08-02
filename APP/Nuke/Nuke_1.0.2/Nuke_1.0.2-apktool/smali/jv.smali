.class public final Ljv;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lyo;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/reflect/Type;)V
    .locals 0

    .line 1
    iput p1, p0, Ljv;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Ljv;->i:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget v0, p0, Ljv;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Ljv;->i:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    return-object p0
.end method

.method public final i(Lct1;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Ljv;->h:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lkv;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkv;-><init>(Lct1;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Liv;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, Liv;-><init>(Lkv;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lct1;->b(Lcp;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance p0, Lkv;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lkv;-><init>(Lct1;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Liv;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, v1}, Liv;-><init>(Lkv;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lct1;->b(Lcp;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
