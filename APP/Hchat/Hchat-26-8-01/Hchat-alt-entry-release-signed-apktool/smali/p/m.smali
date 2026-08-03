.class public final synthetic Lp/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly0/o;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp/m;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp/m;->h:Ly0/o;

    .line 8
    .line 9
    iput p2, p0, Lp/m;->i:I

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;II)V
    .locals 0

    .line 12
    const/4 p2, 0x1

    iput p2, p0, Lp/m;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp/m;->h:Ly0/o;

    iput p3, p0, Lp/m;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lp/m;->g:I

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
    iget-object v0, p0, Lp/m;->h:Ly0/o;

    .line 19
    .line 20
    iget v1, p0, Lp/m;->i:I

    .line 21
    .line 22
    invoke-static {v0, p1, p2, v1}, Lw/b;->b(Ly0/o;Li0/h0;II)V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    iget p2, p0, Lp/m;->i:I

    .line 29
    .line 30
    or-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    invoke-static {p2}, Li0/r;->C(I)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object v0, p0, Lp/m;->h:Ly0/o;

    .line 37
    .line 38
    invoke-static {v0, p1, p2}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
