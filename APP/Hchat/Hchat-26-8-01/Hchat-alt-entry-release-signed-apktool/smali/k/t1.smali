.class public final synthetic Lk/t1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk/u1;


# direct methods
.method public synthetic constructor <init>(Lk/u1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk/t1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk/t1;->h:Lk/u1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk/t1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk/t1;->h:Lk/u1;

    .line 7
    .line 8
    iget-object v0, v0, Lk/u1;->u:Lk/w1;

    .line 9
    .line 10
    iget-object v0, v0, Lk/w1;->e:Li0/g1;

    .line 11
    .line 12
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    int-to-float v0, v0

    .line 17
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lk/t1;->h:Lk/u1;

    .line 23
    .line 24
    iget-object v0, v0, Lk/u1;->u:Lk/w1;

    .line 25
    .line 26
    iget-object v0, v0, Lk/w1;->a:Li0/g1;

    .line 27
    .line 28
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
